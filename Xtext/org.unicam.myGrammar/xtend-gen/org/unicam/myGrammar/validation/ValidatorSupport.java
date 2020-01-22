package org.unicam.myGrammar.validation;

import java.util.List;
import java.util.function.Predicate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.unicam.myGrammar.optGrammar.Contract;

@SuppressWarnings("all")
public class ValidatorSupport {
  protected static final String ISSUE_CODE_PREFIX = "it.unicam.cs.gp.customSolidity.";
  
  public static final String OPTIMIZED_STRUCT_FIELDS = (ValidatorSupport.ISSUE_CODE_PREFIX + "optimizeStructFields");
  
  public static final String OPTIMIZE_INTERNAL_FOR = (ValidatorSupport.ISSUE_CODE_PREFIX + "optimizeInternalFor");
  
  public static final String OPTIMIZE_CONTRACT_DECLARATIONS = (ValidatorSupport.ISSUE_CODE_PREFIX + "optimizeContractDeclarations");
  
  public static String getName(final EObject dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayDeclaration cannot be resolved to a type."
      + "\nConcreteStructureDefinitionDeclaration cannot be resolved to a type."
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nPrimaryTypeDefinitionDeclaration cannot be resolved to a type."
      + "\nPrimaryTypeDeclaration cannot be resolved to a type."
      + "\nArrayDefinition cannot be resolved to a type."
      + "\nArrayDeclaration cannot be resolved to a type."
      + "\nFieldAccess cannot be resolved to a type."
      + "\nSingleDefinition cannot be resolved to a type."
      + "\nPrimaryTypeDeclaration cannot be resolved to a type."
      + "\nThe method or field ref is undefined for the type EObject"
      + "\nThe method or field ref is undefined for the type EObject"
      + "\nThe method or field ref is undefined for the type EObject"
      + "\nThe method or field ref is undefined for the type EObject"
      + "\nThe method or field ref is undefined for the type EObject"
      + "\nThe method or field field is undefined for the type EObject"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\n!== cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public static EObject getDefinitionType(final EObject obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayDefinition cannot be resolved to a type."
      + "\nSingleDefinition cannot be resolved to a type."
      + "\nFieldDefinition cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition.");
  }
  
  public static EObject getRoot(final EObject eObj, final Predicate<EObject> predicate) {
    EObject current = eObj;
    while (((!(current instanceof Contract)) && (!predicate.test(current)))) {
      current = current.eContainer();
    }
    return current;
  }
  
  public static PrimaryTypeDeclaration asDeclaration(final /* PrimaryTypeDefinitionDeclaration */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nPrimaryTypeDeclaration cannot be resolved to a type.");
  }
  
  public static ArrayDeclaration asDeclaration(final /* ArrayDefinitionDeclaration */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayDeclaration cannot be resolved to a type.");
  }
  
  public static ConcreteStructDeclaration asDeclaration(final /* ConcreteStructureDefinitionDeclaration */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nConcreteStructDeclaration cannot be resolved to a type.");
  }
  
  public static boolean areAllNumericLiteral(final /* EList<ArrayIndex> */Object indexes) {
    throw new Error("Unresolved compilation problems:"
      + "\nvalue cannot be resolved"
      + "\nnegate cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nternary cannot be resolved"
      + "\n|| cannot be resolved"
      + "\noperations cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nfirst cannot be resolved"
      + "\nfirst cannot be resolved"
      + "\nseconds cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  public static boolean equalsTo(final /* List<ArrayIndex> */Object indexes, final /* List<ArrayIndex> */Object toCompare) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field value is not visible"
      + "\nThe field value is not visible"
      + "\nvalue cannot be resolved"
      + "\nfirst cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nfirst cannot be resolved");
  }
}
