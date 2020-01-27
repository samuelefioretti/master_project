package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.unicam.myGrammar.optGrammar.Expression;
import org.unicam.myGrammar.optGrammar.Literal;
import org.unicam.myGrammar.optGrammar.NumericLiteral;
import org.unicam.myGrammar.optGrammar.PrimaryArithmetic;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;
import org.unicam.myGrammar.validation.FieldExistenceValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators = FieldExistenceValidator.class)
@SuppressWarnings("all")
public class CorrectIndexValidator extends AbstractOptGrammarValidator {
  @Inject
  @Override
  public void register(final EValidatorRegistrar registrar) {
  }
  
  @Check
  public String checkValidIndex(final Literal toCheck) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field returnType is undefined for the type FunctionDefinition"
      + "\nThe method or field returnType is undefined for the type FunctionDefinition"
      + "\nThe method or field ref is undefined for the type Literal"
      + "\nThe method or field ref is undefined for the type Literal"
      + "\n=== cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  public String getErrorString(final Expression logicalOperations) {
    if (((logicalOperations.getOperations() != null) && (!logicalOperations.getOperations().isEmpty()))) {
      return "Boolean expression are not usable as Array Index";
    }
    boolean _isTernary = logicalOperations.isTernary();
    if (_isTernary) {
      final String trueMessage = this.checkValidIndex(logicalOperations.getTrue());
      final String falseMessage = this.checkValidIndex(logicalOperations.getFalse());
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(trueMessage);
      if (_isNullOrEmpty) {
        boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(falseMessage);
        if (_isNullOrEmpty_1) {
          return null;
        } else {
          return ("Error in false statement: " + falseMessage);
        }
      }
      return ("Error in true statement: " + trueMessage);
    }
    return this.checkValidIndex(logicalOperations.getFirst());
  }
  
  public String getErrorString(final PrimaryArithmetic primaryArithmetic) {
    boolean _matched = false;
    if (primaryArithmetic instanceof NumericLiteral) {
      _matched=true;
      String _xifexpression = null;
      boolean _validIntoArrayIndex = this.validIntoArrayIndex(((NumericLiteral)primaryArithmetic));
      if (_validIntoArrayIndex) {
        _xifexpression = null;
      } else {
        _xifexpression = "The inserted number is not correct";
      }
      return _xifexpression;
    }
    if (!_matched) {
      if (primaryArithmetic instanceof Expression) {
        _matched=true;
        return this.getErrorString(((Expression)primaryArithmetic));
      }
    }
    return null;
  }
  
  /**
   * def boolean validIntoArrayIndex(Declaration dec) {
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
}
