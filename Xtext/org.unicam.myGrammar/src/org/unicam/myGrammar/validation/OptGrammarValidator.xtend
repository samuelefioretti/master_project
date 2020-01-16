/*
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.validation

import org.eclipse.xtext.validation.Check
import org.unicam.myGrammar.optGrammar.Expression
import org.unicam.myGrammar.optGrammar.ArrayDimensions
import org.eclipse.xtext.validation.ComposedChecks
import org.unicam.myGrammar.optGrammar.OptGrammarPackage

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators=LocationAndVisibilityValidator)
class OptGrammarValidator extends AbstractOptGrammarValidator {
	@Check
	def structAssegnationAreStructs(ArrayDimensions arrayDefinition) {
		if(arrayDefinition.ref.asDeclaration.type !== null) return

		val value = arrayDefinition.value
		switch value {
			Expression:
				if (arrayDefinition.field.nullOrEmpty &&
					(value.first.ref === null || !(value.first.ref instanceof ConcreteStructDeclaration)))
					error("The value must be a structure", OptGrammarPackage.Literals.ARRAY_DEFINITION__VALUE)
		}
	}
}
