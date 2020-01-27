package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
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
      + "\nvalue cannot be resolved"
      + "\ngetErrorString cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  public String checkValidIndex(final Literal toCheck) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field nullOrEmpty is undefined for the type Object"
      + "\nThe method or field nullOrEmpty is undefined for the type Object"
      + "\nThe method or field ref is undefined for the type Literal"
      + "\nThe method or field ref is undefined for the type Literal"
      + "\nType mismatch: cannot convert from Object to String"
      + "\nType mismatch: cannot convert from Object to String"
      + "\nThe method validIntoArrayIndex(Declaration) from the type CorrectIndexValidator refers to the missing type Declaration"
      + "\n! cannot be resolved"
      + "\n! cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  public String getErrorString(final /* Expression */Object logicalOperations) {
    throw new Error("Unresolved compilation problems:"
      + "\noperations cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\noperations cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nternary cannot be resolved"
      + "\n^true cannot be resolved"
      + "\ncheckValidIndex cannot be resolved"
      + "\n^false cannot be resolved"
      + "\ncheckValidIndex cannot be resolved"
      + "\nisNullOrEmpty cannot be resolved"
      + "\nisNullOrEmpty cannot be resolved"
      + "\nfirst cannot be resolved"
      + "\ncheckValidIndex cannot be resolved");
  }
  
  public Object getErrorString(final PrimaryArithmetic primaryArithmetic) {
    throw new Error("Unresolved compilation problems:"
      + "\nExpression cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition.");
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
