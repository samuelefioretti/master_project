package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
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
  public void checkValidIndex(final /* ArrayIndex */Object arrI) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Literals is undefined for the type Class<OptGrammarPackage>"
      + "\nvalue cannot be resolved"
      + "\ngetErrorString cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nARRAY_INDEX__VALUE cannot be resolved");
  }
  
  public String checkValidIndex(final Literal toCheck) {
    throw new Error("Unresolved compilation problems:"
      + "\nFunctionCall cannot be resolved to a type."
      + "\nFieldAccess cannot be resolved to a type."
      + "\nDeclaration cannot be resolved to a type."
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nArrayAccess cannot be resolved to a type."
      + "\nNamedType cannot be resolved to a type."
      + "\nThe method or field name is undefined for the type Literal"
      + "\nThe method or field name is undefined for the type Literal"
      + "\nThe method or field ref is undefined for the type Literal"
      + "\nThe method or field field is undefined for the type Literal"
      + "\nThe method or field variable is undefined for the type Literal"
      + "\nThe method or field variable is undefined for the type Literal"
      + "\nThe method or field ref is undefined for the type Literal"
      + "\nThe method or field ref is undefined for the type Literal"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nreturnType cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nreturnType cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nfields cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  public String getErrorString(final Expression logicalOperations) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field operations is undefined for the type Expression"
      + "\nThe method or field operations is undefined for the type Expression"
      + "\nThe method or field ternary is undefined for the type Expression"
      + "\nThe method or field true is undefined for the type Expression"
      + "\nThe method or field false is undefined for the type Expression"
      + "\nThe method or field first is undefined for the type Expression"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncheckValidIndex cannot be resolved"
      + "\ncheckValidIndex cannot be resolved"
      + "\nisNullOrEmpty cannot be resolved"
      + "\nisNullOrEmpty cannot be resolved"
      + "\ncheckValidIndex cannot be resolved");
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
  
  public boolean validIntoArrayIndex(final /* Declaration */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nPrimaryTypeDefinitionDeclaration cannot be resolved to a type."
      + "\nArrayableDeclaration cannot be resolved to a type."
      + "\nArrayableDeclaration cannot be resolved to a type."
      + "\nArrayableDeclaration cannot be resolved to a type."
      + "\nArrayableDeclaration cannot be resolved to a type."
      + "\nref cannot be resolved"
      + "\n=== cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nunsigned cannot be resolved"
      + "\nref cannot be resolved"
      + "\nref cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nunsigned cannot be resolved");
  }
  
  public boolean validIntoArrayIndex(final NumericLiteral numLit) {
    if (((numLit.getEtherUnit() != null) || (numLit.getDecimalValue() != null))) {
      return false;
    }
    int _value = numLit.getIntValue().getValue();
    return (_value >= 0);
  }
  
  public boolean validIntoArrayIndex(final /* NamedType */Object namedType) {
    throw new Error("Unresolved compilation problems:"
      + "\nSizedDeclaration cannot be resolved to a type."
      + "\nSizedDeclaration cannot be resolved to a type."
      + "\nunsigned cannot be resolved");
  }
}
