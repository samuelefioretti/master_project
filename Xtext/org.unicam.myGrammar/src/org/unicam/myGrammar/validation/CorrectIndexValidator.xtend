package org.unicam.myGrammar.validation

import org.eclipse.xtext.validation.ComposedChecks
import com.google.inject.Inject
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import org.unicam.myGrammar.optGrammar.OptGrammarPackage
import org.unicam.myGrammar.optGrammar.PrimaryArithmetic
import org.unicam.myGrammar.optGrammar.StringLiteral
import org.unicam.myGrammar.optGrammar.BlockhashFunction
import org.unicam.myGrammar.optGrammar.GasleftFunction
import org.unicam.myGrammar.optGrammar.HashFunction
import org.unicam.myGrammar.optGrammar.EcrecoverFunction
import org.unicam.myGrammar.optGrammar.ArithmeticOperations
import org.unicam.myGrammar.optGrammar.SecondOperators
import org.unicam.myGrammar.optGrammar.NumericLiteral
import org.unicam.myGrammar.optGrammar.FunctionCall
import org.unicam.myGrammar.optGrammar.Literal
import org.unicam.myGrammar.optGrammar.SpecialVariables
import org.unicam.myGrammar.optGrammar.BooleanConst
import org.unicam.myGrammar.optGrammar.Expression

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators=FieldExistenceValidator)
class CorrectIndexValidator extends AbstractOptGrammarValidator {
	@Inject
	override register(EValidatorRegistrar registrar) {}

	@Check
	/*def checkValidIndex(ArrayIndex arrI) {
	 * 	val result = arrI.value.getErrorString
	 * 	if (!result.nullOrEmpty)
	 * 		error(result, OptGrammarPackage.Literals.ARRAY_INDEX__VALUE);
	 }*/
	def checkValidIndex(Literal toCheck) {
		var String toReturn = null;
		switch (toCheck) {
			SpecialVariables
			| BlockhashFunction
			| GasleftFunction
			| HashFunction
			| EcrecoverFunction: {
			}
			StringLiteral:
				toReturn = "Strings are not usable as Array Index"
			BooleanConst:
				toReturn = "Booleans are not usable as Array Index"
			FunctionCall:
				if (toCheck.name.returnType === null)
					toReturn = "Please explicit the return type of the called function"
				else if (!toCheck.name.returnType.validIntoArrayIndex)
					toReturn = "The return type of the called function is not usable into the array index"
			ArithmeticOperations: {
				var errorMessage = toCheck.first.getErrorString;
				if (!errorMessage.nullOrEmpty)
					toReturn = errorMessage
				else
					for (SecondOperators s : toCheck.seconds) {
						errorMessage = s.value.getErrorString
						if (!errorMessage.nullOrEmpty)
							toReturn = errorMessage
					}
			}
			/*FieldAccess:
			 * 	for (Declaration field : (toCheck.ref as ConcreteStructDeclaration).type.fields)
			 * 		if (field.getName.equals(toCheck.field) && !field.validIntoArrayIndex)
			 * 			toReturn = "The variable type is not usable as an array index"
			 * ArrayAccess:
			 * 	if (toCheck.variable.asDeclaration.type instanceof NamedType)
			 * 		if (!toCheck.variable.asDeclaration.type.validIntoArrayIndex)
			 toReturn = "The array pointed is not suitable for array indexing"*/
			default:
				if (toCheck.ref !== null && !toCheck.ref.validIntoArrayIndex)
					toReturn = "The variable type is not usable as an array index"
		}
		return toReturn
	}

	def String getErrorString(Expression logicalOperations) {
		if (logicalOperations.operations !== null && !logicalOperations.operations.empty)
			return "Boolean expression are not usable as Array Index";
		if (logicalOperations.ternary) {
			val trueMessage = logicalOperations.^true.checkValidIndex;
			val falseMessage = logicalOperations.^false.checkValidIndex;
			if (trueMessage.isNullOrEmpty)
				if(falseMessage.isNullOrEmpty) return null else return "Error in false statement: " + falseMessage;
			return "Error in true statement: " + trueMessage;
		}
		return logicalOperations.first.checkValidIndex;
	}

	def getErrorString(PrimaryArithmetic primaryArithmetic) {
		switch (primaryArithmetic) {
			NumericLiteral:
				return primaryArithmetic.validIntoArrayIndex ? null : "The inserted number is not correct"
			Expression:
				return primaryArithmetic.getErrorString
		}
	}

	/*def boolean validIntoArrayIndex(Declaration dec) {
	 * 	if (dec instanceof PrimaryTypeDefinitionDeclaration) {
	 * 		if (dec.ref === null)
	 * 			return dec instanceof ArrayableDeclaration && (dec as ArrayableDeclaration).type.unsigned
	 * 		return dec.ref instanceof ArrayableDeclaration && (dec.ref as ArrayableDeclaration).type.unsigned
	 * 	}
	 * 	return false;
	 }*/
	def boolean validIntoArrayIndex(NumericLiteral numLit) {
		if (numLit.etherUnit !== null || numLit.decimalValue !== null)
			return false;
		return numLit.intValue.value >= 0
	}

/*def boolean validIntoArrayIndex(NamedType namedType) {
 * 	return namedType instanceof SizedDeclaration && (namedType as SizedDeclaration).unsigned
 }*/
}
