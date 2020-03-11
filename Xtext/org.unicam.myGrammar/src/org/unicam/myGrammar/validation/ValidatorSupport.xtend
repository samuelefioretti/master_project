package org.unicam.myGrammar.validation

import org.eclipse.emf.ecore.EObject
import org.unicam.myGrammar.optGrammar.EnumDefinition
import org.unicam.myGrammar.optGrammar.StructDefinition
import org.unicam.myGrammar.optGrammar.Mapping
import org.unicam.myGrammar.optGrammar.PrimaryTypeDefinitionDeclaration
import org.unicam.myGrammar.optGrammar.PrimaryTypeDeclaration
import java.util.function.Predicate
import org.unicam.myGrammar.optGrammar.Contract

class ValidatorSupport {
	protected static val ISSUE_CODE_PREFIX = "org.unicam.myGrammar.";
	public static val OPTIMIZED_STRUCT_MEMBERS = ISSUE_CODE_PREFIX + "optimizeStructFields";
	public static val OPTIMIZE_INTERNAL_FOR = ISSUE_CODE_PREFIX + "optimizeInternalFor";
	public static val OPTIMIZE_CONTRACT_DECLARATIONS = ISSUE_CODE_PREFIX + "optimizeContractDeclarations";

	def static String getName(EObject dec) {
		switch dec {
			EnumDefinition:
				dec.name
			StructDefinition:
				dec.name
			Mapping:
				dec.name
			PrimaryTypeDefinitionDeclaration:
				dec.ref !== null ? dec.ref.name : (dec as PrimaryTypeDeclaration).name
		}
	}

	def static getDefinitionType(EObject obj) {
		return switch obj {
			Mapping: obj
		}
	}

	def static getRoot(EObject eObj, Predicate<EObject> predicate) {
		var current = eObj
		while (!(current instanceof Contract) && !predicate.test(current))
			current = current.eContainer
		return current
	}

	def static asDeclaration(PrimaryTypeDefinitionDeclaration dec) {
		return dec as PrimaryTypeDeclaration
	}
}
