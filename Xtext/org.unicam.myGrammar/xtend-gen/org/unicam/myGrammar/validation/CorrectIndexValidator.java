package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
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
      + "\nThe method or field CustomSolidityPackage is undefined"
      + "\nvalue cannot be resolved"
      + "\ngetErrorString cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nARRAY_INDEX__VALUE cannot be resolved");
  }
  
  public String checkValidIndex(final /* Condition */Object toCheck) {
    throw new Error("Unresolved compilation problems:"
      + "\nSpecialLiteral cannot be resolved to a type."
      + "\nBlockhashFunction cannot be resolved to a type."
      + "\nGasleftFunction cannot be resolved to a type."
      + "\nHashFunction cannot be resolved to a type."
      + "\nEcrecoverFunction cannot be resolved to a type."
      + "\nStringLiteral cannot be resolved to a type."
      + "\nBooleanLiteral cannot be resolved to a type."
      + "\nFunctionCall cannot be resolved to a type."
      + "\nArithmeticOperations cannot be resolved to a type."
      + "\nSecondOperators cannot be resolved to a type."
      + "\nFieldAccess cannot be resolved to a type."
      + "\nDeclaration cannot be resolved to a type."
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nArrayAccess cannot be resolved to a type."
      + "\nNamedType cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe BlockhashFunction is already covered by the caught SpecialLiteral"
      + "\nThe GasleftFunction is already covered by the caught SpecialLiteral"
      + "\nThe HashFunction is already covered by the caught SpecialLiteral"
      + "\nThe EcrecoverFunction is already covered by the caught SpecialLiteral"
      + "\nThe SpecialLiteral is already covered by the caught BlockhashFunction"
      + "\nThe GasleftFunction is already covered by the caught BlockhashFunction"
      + "\nThe HashFunction is already covered by the caught BlockhashFunction"
      + "\nThe EcrecoverFunction is already covered by the caught BlockhashFunction"
      + "\nThe SpecialLiteral is already covered by the caught GasleftFunction"
      + "\nThe BlockhashFunction is already covered by the caught GasleftFunction"
      + "\nThe HashFunction is already covered by the caught GasleftFunction"
      + "\nThe EcrecoverFunction is already covered by the caught GasleftFunction"
      + "\nThe SpecialLiteral is already covered by the caught HashFunction"
      + "\nThe BlockhashFunction is already covered by the caught HashFunction"
      + "\nThe GasleftFunction is already covered by the caught HashFunction"
      + "\nThe EcrecoverFunction is already covered by the caught HashFunction"
      + "\nThe SpecialLiteral is already covered by the caught EcrecoverFunction"
      + "\nThe BlockhashFunction is already covered by the caught EcrecoverFunction"
      + "\nThe GasleftFunction is already covered by the caught EcrecoverFunction"
      + "\nThe HashFunction is already covered by the caught EcrecoverFunction"
      + "\nname cannot be resolved"
      + "\nreturnType cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreturnType cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved"
      + "\nfirst cannot be resolved"
      + "\ngetErrorString cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nseconds cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ngetErrorString cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nref cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nfields cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nfield cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved"
      + "\nvariable cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nvariable cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved"
      + "\nref cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nref cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  public String getErrorString(final /* LogicalOperations */Object logicalOperations) {
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
  
  public Object getErrorString(final /* PrimaryArithmetic */Object primaryArithmetic) {
    throw new Error("Unresolved compilation problems:"
      + "\nLogicalOperations cannot be resolved to a type."
      + "\nNumericLiteral cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\ngetErrorString cannot be resolved"
      + "\nvalidIntoArrayIndex cannot be resolved");
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
  
  public boolean validIntoArrayIndex(final /* NumericLiteral */Object numLit) {
    throw new Error("Unresolved compilation problems:"
      + "\netherUnit cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ndecimalValue cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nintValue cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\n>= cannot be resolved");
  }
  
  public boolean validIntoArrayIndex(final /* NamedType */Object namedType) {
    throw new Error("Unresolved compilation problems:"
      + "\nSizedDeclaration cannot be resolved to a type."
      + "\nSizedDeclaration cannot be resolved to a type."
      + "\nunsigned cannot be resolved");
  }
}
