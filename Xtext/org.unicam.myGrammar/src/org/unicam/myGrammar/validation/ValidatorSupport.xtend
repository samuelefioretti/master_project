package org.unicam.myGrammar.validation

import org.eclipse.emf.ecore.EObject
import org.unicam.myGrammar.optGrammar.EnumDefinition
import org.unicam.myGrammar.optGrammar.StructDefinition
import org.unicam.myGrammar.optGrammar.Mapping
import org.unicam.myGrammar.optGrammar.Contract
import java.util.function.Predicate
import org.eclipse.emf.common.util.EList
import java.util.List
import org.unicam.myGrammar.optGrammar.ArithmeticOperations
import org.unicam.myGrammar.optGrammar.NumericLiteral

class ValidatorSupport {
	protected static val ISSUE_CODE_PREFIX = "org.unicam.myGrammar.";
	public static val OPTIMIZED_STRUCT_FIELDS = ISSUE_CODE_PREFIX + "optimizeStructFields";
	public static val OPTIMIZE_INTERNAL_FOR = ISSUE_CODE_PREFIX + "optimizeInternalFor";
	public static val OPTIMIZE_CONTRACT_DECLARATIONS = ISSUE_CODE_PREFIX + "optimizeContractDeclarations";

	def static String getName(EObject dec) {
		switch dec {
			EnumDefinition:
				dec.name
			// ArrayDeclaration:
			// dec.name
			StructDefinition:
				dec.name
			Mapping:
				dec.name
		/*ConcreteStructureDefinitionDeclaration:
		 * 	dec.ref !== null ? dec.ref.name : (dec as ConcreteStructDeclaration).name
		 * PrimaryTypeDefinitionDeclaration:
		 * 	dec.ref !== null ? dec.ref.name : (dec as PrimaryTypeDeclaration).name
		 * ArrayDefinition:
		 * 	(dec.ref as ArrayDeclaration).name
		 * FieldAccess:
		 * 	dec.field
		 * SingleDefinition:
		 (dec.name as PrimaryTypeDeclaration).name*/
		}
	}

	/*def static getDefinitionType(EObject obj) {
	 * 	return switch obj {
	 * 		ArrayDefinition: obj
	 * 		Mapping: obj
	 * 		SingleDefinition: obj
	 * 		FieldDefinition: obj
	 * 	}
	 * }
	 */
	def static getRoot(EObject eObj, Predicate<EObject> predicate) {
		var current = eObj
		while (!(current instanceof Contract) && !predicate.test(current))
			current = current.eContainer
		return current
	}

/*
 * def static asDeclaration(PrimaryTypeDefinitionDeclaration dec) {
 * 	return dec as PrimaryTypeDeclaration
 * }

 * def static asDeclaration(ArrayDefinitionDeclaration dec) {
 * 	return dec as ArrayDeclaration
 * }

 * def static asDeclaration(ConcreteStructureDefinitionDeclaration dec) {
 * 	return dec as ConcreteStructDeclaration
 * }
 * 
 *  
 * def static areAllNumericLiteral(EList<ArrayIndex> indexes) {
 * 	for (current : indexes.map[i|i.value]) {
 * 		if(current.negate || current.ternary || !current.operations.empty) return false
 * 		val first = current.first
 * 		switch (first) {
 * 			ArithmeticOperations: {
 * 				if(!(first.first instanceof NumericLiteral) || !first.seconds.empty) return false
 * 			}
 * 			default:
 * 				return false
 * 		}
 * 	}
 * 	return true
 * }

 * def static equalsTo(List<ArrayIndex> indexes, List<ArrayIndex> toCompare) {
 * 	return indexes.size === toCompare.size && toCompare.map [ e |
 * 		((e.value.first as ArithmeticOperations).first as NumericLiteral).intValue.value
 * 	].equals(indexes.map[e|((e.value.first as ArithmeticOperations).first as NumericLiteral).intValue.value])

 }*/
}
