package org.unicam.myGrammar.validation

import com.google.inject.Inject
import org.eclipse.xtext.validation.EValidatorRegistrar
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.ComposedChecks

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators=FieldExistenceValidator)
class CorrectIndexValidator extends AbstractOptGrammarValidator {
	/*
	 * @Inject
	 * override register(EValidatorRegistrar registrar) {}

	 * @Check
	 * def checkValidIndex(ArrayIndex arrI) {
	 * 	val result = arrI.value.getErrorString
	 * 	if (!result.nullOrEmpty)
	 * 		error(result, CustomSolidityPackage.Literals.ARRAY_INDEX__VALUE);
	 * }

	 * def checkValidIndex(Condition toCheck) {
	 * 	var String toReturn = null;
	 * 	switch (toCheck) {
	 * 		SpecialLiteral
	 * 		| BlockhashFunction
	 * 		| GasleftFunction
	 * 		| HashFunction
	 * 		| EcrecoverFunction: {
	 * 		}
	 * 		StringLiteral:
	 * 			toReturn = "Strings are not usable as Array Index"
	 * 		BooleanLiteral:
	 * 			toReturn = "Booleans are not usable as Array Index"
	 * 		FunctionCall:
	 * 			if (toCheck.name.returnType === null)
	 * 				toReturn = "Please explicit the return type of the called function"
	 * 			else if (!toCheck.name.returnType.validIntoArrayIndex)
	 * 				toReturn = "The return type of the called function is not usable into the array index"
	 * 		ArithmeticOperations: {
	 * 			var errorMessage = toCheck.first.getErrorString;
	 * 			if (!errorMessage.nullOrEmpty)
	 * 				toReturn = errorMessage
	 * 			else
	 * 				for (SecondOperators s : toCheck.seconds) {
	 * 					errorMessage = s.value.getErrorString
	 * 					if (!errorMessage.nullOrEmpty)
	 * 						toReturn = errorMessage
	 * 				}
	 * 		}
	 * 		FieldAccess:
	 * 			for (Declaration field : (toCheck.ref as ConcreteStructDeclaration).type.fields)
	 * 				if (field.getName.equals(toCheck.field) && !field.validIntoArrayIndex)
	 * 					toReturn = "The variable type is not usable as an array index"
	 * 		ArrayAccess:
	 * 			if (toCheck.variable.asDeclaration.type instanceof NamedType)
	 * 				if (!toCheck.variable.asDeclaration.type.validIntoArrayIndex)
	 * 					toReturn = "The array pointed is not suitable for array indexing"
	 * 		default:
	 * 			if (toCheck.ref !== null && !toCheck.ref.validIntoArrayIndex)
	 * 				toReturn = "The variable type is not usable as an array index"
	 * 	}
	 * 	return toReturn
	 * }

	 * def String getErrorString(LogicalOperations logicalOperations) {
	 * 	if (logicalOperations.operations !== null && !logicalOperations.operations.empty)
	 * 		return "Boolean expression are not usable as Array Index";
	 * 	if (logicalOperations.ternary) {
	 * 		val trueMessage = logicalOperations.^true.checkValidIndex;
	 * 		val falseMessage = logicalOperations.^false.checkValidIndex;
	 * 		if (trueMessage.isNullOrEmpty)
	 * 			if(falseMessage.isNullOrEmpty) return null else return "Error in false statement: " + falseMessage;
	 * 		return "Error in true statement: " + trueMessage;
	 * 	}
	 * 	return logicalOperations.first.checkValidIndex;
	 * }

	 * def getErrorString(PrimaryArithmetic primaryArithmetic) {
	 * 	switch (primaryArithmetic) {
	 * 		LogicalOperations:
	 * 			return primaryArithmetic.getErrorString
	 * 		NumericLiteral:
	 * 			return primaryArithmetic.validIntoArrayIndex ? null : "The inserted number is not correct"
	 * 	}
	 * }

	 * def boolean validIntoArrayIndex(Declaration dec) {
	 * 	if (dec instanceof PrimaryTypeDefinitionDeclaration) {
	 * 		if (dec.ref === null)
	 * 			return dec instanceof ArrayableDeclaration && (dec as ArrayableDeclaration).type.unsigned
	 * 		return dec.ref instanceof ArrayableDeclaration && (dec.ref as ArrayableDeclaration).type.unsigned
	 * 	}
	 * 	return false;
	 * }

	 * def boolean validIntoArrayIndex(NumericLiteral numLit) {
	 * 	if (numLit.etherUnit !== null || numLit.decimalValue !== null)
	 * 		return false;
	 * 	return numLit.intValue.value >= 0
	 * }

	 * def boolean validIntoArrayIndex(NamedType namedType) {
	 * 	return namedType instanceof SizedDeclaration && (namedType as SizedDeclaration).unsigned
	 * }
	 */
}
