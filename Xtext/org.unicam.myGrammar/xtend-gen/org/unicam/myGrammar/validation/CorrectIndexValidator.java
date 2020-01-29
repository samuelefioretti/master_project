package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.unicam.myGrammar.optGrammar.BlockhashFunction;
import org.unicam.myGrammar.optGrammar.BooleanConst;
import org.unicam.myGrammar.optGrammar.EcrecoverFunction;
import org.unicam.myGrammar.optGrammar.FunctionCall;
import org.unicam.myGrammar.optGrammar.GasleftFunction;
import org.unicam.myGrammar.optGrammar.HashFunction;
import org.unicam.myGrammar.optGrammar.Literal;
import org.unicam.myGrammar.optGrammar.ReturnsParameterList;
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
    String _xblockexpression = null;
    {
      String toReturn = null;
      String _switchResult = null;
      boolean _matched = false;
      if (toCheck instanceof SpecialVariables || toCheck instanceof BlockhashFunction || toCheck instanceof GasleftFunction || toCheck instanceof HashFunction || toCheck instanceof EcrecoverFunction) {
        _matched=true;
        _switchResult = null;
      }
      if (!_matched) {
        if (toCheck instanceof StringLiteral) {
          _matched=true;
          _switchResult = toReturn = "Strings are not usable as Array Index";
        }
      }
      if (!_matched) {
        if (toCheck instanceof BooleanConst) {
          _matched=true;
          _switchResult = toReturn = "Booleans are not usable as Array Index";
        }
      }
      if (!_matched) {
        if (toCheck instanceof FunctionCall) {
          _matched=true;
          String _xifexpression = null;
          ReturnsParameterList _returnParameters = ((FunctionCall)toCheck).getName().getReturnParameters();
          boolean _tripleEquals = (_returnParameters == null);
          if (_tripleEquals) {
            _xifexpression = toReturn = "Please explicit the return type of the called function";
          }
          _switchResult = _xifexpression;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
