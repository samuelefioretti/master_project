package org.unicam.myGrammar.validation

import com.google.inject.Inject
import org.eclipse.xtext.validation.EValidatorRegistrar
import java.util.Comparator
import org.unicam.myGrammar.optGrammar.DefinitionBody
import org.eclipse.xtext.validation.Check
import org.unicam.myGrammar.optGrammar.StructDefinition
import org.unicam.myGrammar.optGrammar.OptGrammarPackage
import org.unicam.myGrammar.optGrammar.Contract
import java.util.ArrayList
import org.unicam.myGrammar.optGrammar.SizedDeclaration
import org.unicam.myGrammar.optGrammar.VariableDeclaration

class QuickFixCalls extends AbstractOptGrammarValidator {
	@Inject
	override register(EValidatorRegistrar registrar) {}

	Comparator<DefinitionBody> declarationSizeComparator = new Comparator<DefinitionBody> {
		override compare(DefinitionBody o1, DefinitionBody o2) {
			var firstSize = getSize(o1)
			var secondSize = getSize(o2)
			return secondSize - firstSize
		}
	}

	@Check
	def orderedStructureFields(StructDefinition str) {
		if (!str.members.empty) {
			val orderedFields = newArrayList();
			val newOrderedFields = newArrayList();
			val orderedIndexes = newArrayList();

			orderedFields.addAll(str.members);
			orderedFields.sortInplace(declarationSizeComparator);

			orderedFields.getOptimizedOrder(newOrderedFields, 0, getSize(orderedFields.get(0)));
			if (!str.members.equals(newOrderedFields)) {
				orderedIndexes.addAll(newOrderedFields.map[x|str.members.indexOf(x)]);
				warning(
					"This structure can be optimized",
					OptGrammarPackage.Literals.STRUCT_DEFINITION__NAME,
					ValidatorSupport.OPTIMIZED_STRUCT_FIELDS,
					orderedIndexes.map[e|e.toString]
				)
			}
		}
	}

	@Check
	def orderedDeclarationsInContract(Contract con) {
		val initialFields = newArrayList()
		val orderedFields = newArrayList()

		val newOrderedFields = newArrayList()
		val orderedIndexes = newArrayList()

		con.body.forEach [ e |
			switch e {
				VariableDeclaration: if(e.type === null) orderedFields.add(e)
				DefinitionBody: orderedFields.add(e)
			}
		]

		initialFields.addAll(orderedFields)
		orderedFields.sortInplace(declarationSizeComparator);

		if (orderedFields.length > 0) {
			orderedFields.getOptimizedOrder(newOrderedFields, 0, getSize(orderedFields.get(0)));
			if (!initialFields.equals(newOrderedFields)) {
				orderedIndexes.addAll(newOrderedFields.map[x|con.body.indexOf(x)]);
				warning(
					"The declarations order can be optimized",
					con,
					OptGrammarPackage.Literals.CONTRACT__NAME,
					ValidatorSupport.OPTIMIZE_CONTRACT_DECLARATIONS,
					orderedIndexes.map[e|e.toString]
				)
			}
		}
	}

	/*
	 * @Check
	 * 	def checkLoopOtimization(LoopStructures loop) {
	 * 		if(loop.type === "if") return;

	 * 		val checkList = newArrayList()

	 * 		loop.blocks.forEach [ block |
	 * 			var EObject toCheck = null;
	 * 			var EObject actual = null;
	 * 			if (block.^def !== null) {
	 * 				actual = block.^def
	 * 				toCheck = switch actual {
	 * 					ArrayDefinition:
	 * 						actual.ref
	 * 					FieldDefinition:
	 * 						(actual as FieldAccess).ref
	 * 					SingleDefinition:
	 * 						actual.name
	 * 				}
	 * 			} else if (block.^dec !== null) {
	 * 				actual = block.^dec
	 * 				switch actual {
	 * 					PrimaryTypeDefinitionDeclaration:
	 * 						if(actual.operator !== null) toCheck = actual.ref
	 * 				}
	 * 			}
	 * 			if (toCheck !== null && toCheck.getRoot[e|e instanceof FunctionDefinition] instanceof Contract)
	 * 				checkList.add(actual)
	 * 		]

	 * 		checkList.forEach [ e |
	 * 			var EStructuralFeature reference = null;
	 * 			switch e {
	 * 				PrimaryTypeDefinitionDeclaration:
	 * 					reference = CustomSolidityPackage.Literals.PRIMARY_TYPE_DEFINITION_DECLARATION__REF
	 * 				ArrayDefinition:
	 * 					if (e.indexes !== null && e.indexes.areAllNumericLiteral && e.field.nullOrEmpty)
	 * 						reference = CustomSolidityPackage.Literals.ARRAY_DEFINITION__REF
	 * 				FieldAccess:
	 * 					reference = CustomSolidityPackage.Literals.FIELD_ACCESS__FIELD
	 * 				SingleDefinition:
	 * 					reference = CustomSolidityPackage.Literals.SINGLE_DEFINITION__NAME
	 * 			}
	 * 			if (reference !== null)
	 * 				warning(e.getName, e, reference, ValidatorSupport.OPTIMIZE_INTERNAL_FOR)
	 * 		]
	 * 	}
	 */
	def void getOptimizedOrder(ArrayList<DefinitionBody> arr, ArrayList<DefinitionBody> newArr, Integer index,
		Integer currentSum) {
		if (index < arr.length) {
			newArr.add(arr.remove(index.intValue))

			var ind = arr.indexOf(arr.findFirst[x|(currentSum + x.getSize) <= 32]);
			if(arr.empty) return;
			ind = (ind !== -1) ? ind : 0;

			arr.getOptimizedOrder(newArr, ind, (currentSum + getSize(arr.get(ind))))
		}
	}

	def getSize(DefinitionBody dec) { // 32 byte word
		switch dec {
			VariableDeclaration: // int, bytes or address(20 byte)
				return dec.type.type.startsWith('int')
					? (dec.type.substring(3).empty ? 32 : (Integer.parseInt(dec.type.substring(3)) / 8))
					: dec.type.startsWith('bytes') ? (dec.type.substring(5).empty ? 32 : Integer.parseInt(
					dec.type.substring(5))) : 20
			default:
				return 33
		}
	}
}
