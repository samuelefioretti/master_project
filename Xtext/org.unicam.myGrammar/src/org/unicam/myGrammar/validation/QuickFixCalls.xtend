package org.unicam.myGrammar.validation

import com.google.inject.Inject
import org.eclipse.xtext.validation.EValidatorRegistrar
import java.util.Comparator
import org.eclipse.xtext.validation.Check
import org.unicam.myGrammar.optGrammar.OptGrammarPackage
import org.unicam.myGrammar.optGrammar.Contract
import org.unicam.myGrammar.optGrammar.StructDefinition
import org.eclipse.emf.ecore.EStructuralFeature

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class QuickFixCalls extends AbstractOptGrammarValidator {
	@Inject
	override register(EValidatorRegistrar registrar) {}

	Comparator<Declaration> declarationSizeComparator = new Comparator<Declaration> {
		override compare(Declaration o1, Declaration o2) {
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
					OptGrammarPackage.Literals.STRUCT_DECLARATION__NAME,
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

		con.blocks.forEach [ e |
			switch e {
				PrimaryTypeDefinitionDeclaration: if(e.ref === null) orderedFields.add(e)
				Declaration: orderedFields.add(e)
			}
		]

		initialFields.addAll(orderedFields)
		orderedFields.sortInplace(declarationSizeComparator);

		if (orderedFields.length > 0) {
			orderedFields.getOptimizedOrder(newOrderedFields, 0, getSize(orderedFields.get(0)));
			if (!initialFields.equals(newOrderedFields)) {
				orderedIndexes.addAll(newOrderedFields.map[x|con.blocks.indexOf(x)]);
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

	@Check
	def checkLoopOtimization(LoopStructures loop) {
		if(loop.type === "if") return;

		val checkList = newArrayList()

		loop.blocks.forEach [ block |
			var EObject toCheck = null;
			var EObject actual = null;
			if (block.^def !== null) {
				actual = block.^def
				toCheck = switch actual {
					ArrayDefinition:
						actual.ref
					FieldDefinition:
						(actual as FieldAccess).ref
					SingleDefinition:
						actual.name
				}
			} else if (block.^dec !== null) {
				actual = block.^dec
				switch actual {
					PrimaryTypeDefinitionDeclaration:
						if(actual.operator !== null) toCheck = actual.ref
				}
			}
			if (toCheck !== null && toCheck.getRoot[e|e instanceof FunctionDefinition] instanceof Contract)
				checkList.add(actual)
		]

		checkList.forEach [ e |
			var EStructuralFeature reference = null;
			switch e {
				PrimaryTypeDefinitionDeclaration:
					reference = OptGrammarPackage.Literals.PRIMARY_TYPE_DEFINITION_DECLARATION__REF
				ArrayDefinition:
					if (e.indexes !== null && e.indexes.areAllNumericLiteral && e.field.nullOrEmpty)
						reference = OptGrammarPackage.Literals.ARRAY_DEFINITION__REF
				FieldAccess:
					reference = OptGrammarPackage.Literals.FIELD_ACCESS__FIELD
				SingleDefinition:
					reference = OptGrammarPackage.Literals.SINGLE_DEFINITION__NAME
			}
			if (reference !== null)
				warning(e.getName, e, reference, ValidatorSupport.OPTIMIZE_INTERNAL_FOR)
		]
	}

	def void getOptimizedOrder(ArrayList<Declaration> arr, ArrayList<Declaration> newArr, Integer index,
		Integer currentSum) {
		if (index < arr.length) {
			newArr.add(arr.remove(index.intValue))

			var ind = arr.indexOf(arr.findFirst[x|(currentSum + x.getSize) <= 32]);
			if(arr.empty) return;
			ind = (ind !== -1) ? ind : 0;

			arr.getOptimizedOrder(newArr, ind, (currentSum + getSize(arr.get(ind))))
		}
	}

	def getSize(Declaration dec) { // 32 byte word
		switch dec {
			ArrayableDeclaration: // int, bytes or address(20 byte)
				return dec.type.type.startsWith('int')
					? (dec.type.type.substring(3).empty ? 32 : (Integer.parseInt(dec.type.type.substring(3)) / 8))
					: dec.type.type.startsWith('bytes') ? (dec.type.type.substring(5).empty ? 32 : Integer.parseInt(
					dec.type.type.substring(5))) : 20
			default:
				return 33
		}
	}
}
