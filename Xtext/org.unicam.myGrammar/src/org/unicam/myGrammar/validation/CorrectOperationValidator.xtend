package org.unicam.myGrammar.validation

import org.eclipse.xtext.validation.Check
import javax.inject.Inject
import org.eclipse.xtext.validation.EValidatorRegistrar
import org.eclipse.xtext.validation.ComposedChecks
import org.eclipse.emf.ecore.EObject

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators=QuickFixCalls)
class CorrectOperationValidator extends AbstractOptGrammarValidator {
	/*
	 * @Inject
	 * override register(EValidatorRegistrar registrar) {}

	 * @Check
	 * def checkValidOperation(ArrayDefinition dec) {
	 * 	if(dec.indexes.empty || dec.operator.value.equals("=") || !dec.indexes.areAllNumericLiteral ||
	 * 		(dec.ref as ArrayDeclaration).blocks !== null || dec.existsAssignment) return;

	 * 	error(String.format("%s must have a value", dec.ref.asDeclaration.name),
	 * 		CustomSolidityPackage.Literals.ARRAY_DEFINITION__OPERATOR);
	 * }

	 * def boolean existsAssignment(ArrayDefinition arrDef) {
	 * 	val scope = arrDef.getRoot[e|e instanceof FunctionDefinition]
	 * 	return scope.eAllContents.takeWhile[e|e !== arrDef].filter[e|e instanceof ArrayDefinition].map [ e |
	 * 		e as ArrayDefinition
	 * 	].exists [ current |
	 * 		return current.ref === arrDef.ref && !current.indexes.empty && current.operator.value.equals("=") && (
	 * 					!current.indexes.areAllNumericLiteral || current.indexes.equalsTo(arrDef.indexes)
	 * 				)
	 * 	]
	 * }

	 * @Check
	 * def checkValidOperation(PrimaryTypeDefinitionDeclaration dec) {
	 * 	if(dec.operator === null) return;
	 * 	if (dec.ref === null && !dec.operator.value.equals("=")) {
	 * 		error("You must use '=' here.",
	 * 			CustomSolidityPackage.Literals.PRIMARY_TYPE_DEFINITION_DECLARATION__OPERATOR)
	 * 		return;
	 * 	}

	 * 	if (!dec.validDeclaration)
	 * 		error(
	 * 			String.format("%s must have a value", dec.ref.name),
	 * 			CustomSolidityPackage.Literals.PRIMARY_TYPE_DEFINITION_DECLARATION__OPERATOR
	 * 		);
	 * }

	 * @Check
	 * def checkValidOperation(SingleDefinition dec) {
	 * 	if (!dec.validDeclaration)
	 * 		error(
	 * 			String.format("'%s' must have a value", dec.name.name),
	 * 			(dec.first !== null) ? CustomSolidityPackage.Literals.SINGLE_DEFINITION__FIRST : CustomSolidityPackage.
	 * 				Literals.SINGLE_DEFINITION__SECOND
	 * 		);
	 * }

	 * def validDeclaration(SingleDefinition dec) {
	 * 	return dec.existsAssignment
	 * }

	 * def validDeclaration(PrimaryTypeDefinitionDeclaration dec) {
	 * 	return (dec.operator !== null && dec.operator.value.equals('=')) ||
	 * 		(dec.ref !== null && dec.ref.value !== null) || dec.existsAssignment
	 * }

	 * def boolean existsAssignment(EObject dec) {
	 * 	val name = switch (dec) {
	 * 		PrimaryTypeDefinitionDeclaration: dec.ref.asDeclaration.name
	 * 		SingleDefinition: dec.name.asDeclaration.name
	 * 		default: ""
	 * 	}
	 * 	val scope = dec.getRoot([obj|obj instanceof FunctionDefinition])
	 * 	return !scope.eAllContents.takeWhile[obj|obj !== dec].filter [ obj |
	 * 		switch (obj) {
	 * 			PrimaryTypeDefinitionDeclaration:
	 * 				obj.ref !== null
	 * 					? obj.ref.asDeclaration.name.equals(name)
	 * 					: obj.asDeclaration.name.equals(name) && obj.value !== null
	 * 			default:
	 * 				false
	 * 		}
	 * 	].empty
	 * }
	 */
}
