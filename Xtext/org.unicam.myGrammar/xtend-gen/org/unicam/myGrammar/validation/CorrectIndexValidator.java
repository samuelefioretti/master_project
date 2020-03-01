package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.unicam.myGrammar.optGrammar.BlockhashFunction;
import org.unicam.myGrammar.optGrammar.BooleanLiteral;
import org.unicam.myGrammar.optGrammar.EcrecoverFunction;
import org.unicam.myGrammar.optGrammar.FunctionCall;
import org.unicam.myGrammar.optGrammar.GasleftFunction;
import org.unicam.myGrammar.optGrammar.HashFunction;
import org.unicam.myGrammar.optGrammar.Literal;
import org.unicam.myGrammar.optGrammar.NamedType;
import org.unicam.myGrammar.optGrammar.NumericLiteral;
import org.unicam.myGrammar.optGrammar.ReturnsParameterList;
import org.unicam.myGrammar.optGrammar.SizedDeclaration;
import org.unicam.myGrammar.optGrammar.SpecialLiteral;
import org.unicam.myGrammar.optGrammar.StringLiteral;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;
import org.unicam.myGrammar.validation.FieldExistenceValidator;

@ComposedChecks(validators = FieldExistenceValidator.class)
@SuppressWarnings("all")
public class CorrectIndexValidator extends AbstractOptGrammarValidator {
  @Inject
  @Override
  public void register(final EValidatorRegistrar registrar) {
  }
  
  @Check
  public String checkValidIndex(final Literal toCheck) {
    String toReturn = null;
    boolean _matched = false;
    if (toCheck instanceof SpecialLiteral || toCheck instanceof BlockhashFunction || toCheck instanceof GasleftFunction || toCheck instanceof HashFunction || toCheck instanceof EcrecoverFunction) {
      _matched=true;
    }
    if (!_matched) {
      if (toCheck instanceof StringLiteral) {
        _matched=true;
        toReturn = "Strings are not usable as Array Index";
      }
    }
    if (!_matched) {
      if (toCheck instanceof BooleanLiteral) {
        _matched=true;
        toReturn = "Booleans are not usable as Array Index";
      }
    }
    if (!_matched) {
      if (toCheck instanceof FunctionCall) {
        _matched=true;
        ReturnsParameterList _returnParameters = ((FunctionCall)toCheck).getName().getReturnParameters();
        boolean _tripleEquals = (_returnParameters == null);
        if (_tripleEquals) {
          toReturn = "Please explicit the return type of the called function";
        }
      }
    }
    if (!_matched) {
      if ((toCheck != null)) {
        toReturn = "The variable type is not usable as an array index";
      }
    }
    return toReturn;
  }
  
  /**
   * def String getErrorString(Expression logicalOperations) {
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
   * 
   * def getErrorString(PrimaryArithmetic primaryArithmetic) {
   * 	switch (primaryArithmetic) {
   * 		NumericLiteral:
   * 			return primaryArithmetic.validIntoArrayIndex ? null : "The inserted number is not correct"
   * 		Expression:
   * 			return primaryArithmetic.getErrorString
   * 	}
   * }
   * 
   * 
   * def boolean validIntoArrayIndex(DefinitionBody dec) {
   * 	if (dec instanceof PrimaryTypeDefinitionDeclaration) {
   * 		if (dec.ref === null)
   * 			return dec instanceof ArrayableDeclaration && (dec as ArrayableDeclaration).type.unsigned
   * 		return dec.ref instanceof ArrayableDeclaration && (dec.ref as ArrayableDeclaration).type.unsigned
   * 	}
   * 	return false;
   * }
   */
  public boolean validIntoArrayIndex(final NumericLiteral numLit) {
    if (((numLit.getEtherUnit() != null) || (numLit.getDecimalValue() != null))) {
      return false;
    }
    int _value = numLit.getIntValue().getValue();
    return (_value >= 0);
  }
  
  public boolean validIntoArrayIndex(final NamedType namedType) {
    return (namedType instanceof SizedDeclaration);
  }
}
