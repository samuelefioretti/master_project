package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.unicam.myGrammar.optGrammar.ArithmeticOperations;
import org.unicam.myGrammar.optGrammar.BlockhashFunction;
import org.unicam.myGrammar.optGrammar.BooleanConst;
import org.unicam.myGrammar.optGrammar.EcrecoverFunction;
import org.unicam.myGrammar.optGrammar.Expression;
import org.unicam.myGrammar.optGrammar.FunctionCall;
import org.unicam.myGrammar.optGrammar.GasleftFunction;
import org.unicam.myGrammar.optGrammar.HashFunction;
import org.unicam.myGrammar.optGrammar.Literal;
import org.unicam.myGrammar.optGrammar.NumericLiteral;
import org.unicam.myGrammar.optGrammar.PrimaryArithmetic;
import org.unicam.myGrammar.optGrammar.ReturnsParameterList;
import org.unicam.myGrammar.optGrammar.SecondOperators;
import org.unicam.myGrammar.optGrammar.SpecialVariables;
import org.unicam.myGrammar.optGrammar.StringLiteral;
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
    String toReturn = null;
    boolean _matched = false;
    if (toCheck instanceof SpecialVariables || toCheck instanceof BlockhashFunction || toCheck instanceof GasleftFunction || toCheck instanceof HashFunction || toCheck instanceof EcrecoverFunction) {
      _matched=true;
    }
    if (!_matched) {
      if (toCheck instanceof StringLiteral) {
        _matched=true;
        toReturn = "Strings are not usable as Array Index";
      }
    }
    if (!_matched) {
      if (toCheck instanceof BooleanConst) {
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
      if (toCheck instanceof ArithmeticOperations) {
        _matched=true;
        String errorMessage = this.getErrorString(((ArithmeticOperations)toCheck).getFirst());
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(errorMessage);
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
          toReturn = errorMessage;
        } else {
          EList<SecondOperators> _seconds = ((ArithmeticOperations)toCheck).getSeconds();
          for (final SecondOperators s : _seconds) {
            {
              errorMessage = this.getErrorString(s.getValue());
              boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(errorMessage);
              boolean _not_1 = (!_isNullOrEmpty_1);
              if (_not_1) {
                toReturn = errorMessage;
              }
            }
          }
        }
      }
    }
    return toReturn;
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
