package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;
import org.unicam.myGrammar.validation.QuickFixCalls;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators = QuickFixCalls.class)
@SuppressWarnings("all")
public class CorrectOperationValidator extends AbstractOptGrammarValidator {
  @Inject
  @Override
  public void register(final EValidatorRegistrar registrar) {
  }
  
  @Check
  public void checkValidOperation(final /* ArrayDefinition */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayDeclaration cannot be resolved to a type."
      + "\nThe method or field ARRAY_DEFINITION__OPERATOR is undefined for the type Class<Literals>"
      + "\nindexes cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n|| cannot be resolved"
      + "\noperator cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nindexes cannot be resolved"
      + "\nareAllNumericLiteral cannot be resolved"
      + "\n! cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nref cannot be resolved"
      + "\nblocks cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nexistsAssignment cannot be resolved"
      + "\nref cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public boolean existsAssignment(final /* ArrayDefinition */Object arrDef) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayDefinition cannot be resolved to a type."
      + "\nArrayDefinition cannot be resolved to a type."
      + "\nThe method or field ref is undefined for the type Object"
      + "\nThe method or field indexes is undefined for the type Object"
      + "\nThe method or field operator is undefined for the type Object"
      + "\nThe method or field indexes is undefined for the type Object"
      + "\nThe method or field indexes is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ngetRoot cannot be resolved"
      + "\neAllContents cannot be resolved"
      + "\ntakeWhile cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nexists cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nref cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nareAllNumericLiteral cannot be resolved"
      + "\n! cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nequalsTo cannot be resolved"
      + "\nindexes cannot be resolved");
  }
  
  @Check
  public void checkValidOperation(final /* PrimaryTypeDefinitionDeclaration */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field PRIMARY_TYPE_DEFINITION_DECLARATION__OPERATOR is undefined for the type Class<Literals>"
      + "\nThe method or field PRIMARY_TYPE_DEFINITION_DECLARATION__OPERATOR is undefined for the type Class<Literals>"
      + "\noperator cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nref cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\noperator cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n! cannot be resolved"
      + "\nvalidDeclaration cannot be resolved"
      + "\n! cannot be resolved"
      + "\nref cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Check
  public void checkValidOperation(final /* SingleDefinition */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field SINGLE_DEFINITION__FIRST is undefined for the type Class<Literals>"
      + "\nThe method or field SINGLE_DEFINITION__SECOND is undefined for the type Class<Literals>"
      + "\nvalidDeclaration cannot be resolved"
      + "\n! cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nfirst cannot be resolved"
      + "\n!== cannot be resolved");
  }
  
  public Object validDeclaration(final /* SingleDefinition */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nexistsAssignment cannot be resolved");
  }
  
  public Object validDeclaration(final /* PrimaryTypeDefinitionDeclaration */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\noperator cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\noperator cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nref cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nref cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nexistsAssignment cannot be resolved");
  }
  
  public boolean existsAssignment(final EObject dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nPrimaryTypeDefinitionDeclaration cannot be resolved to a type."
      + "\nSingleDefinition cannot be resolved to a type."
      + "\nPrimaryTypeDefinitionDeclaration cannot be resolved to a type."
      + "\nThe method or field ref is undefined for the type EObject"
      + "\nThe method or field name is undefined for the type EObject"
      + "\nThe method getRoot((Object)=>boolean) is undefined for the type EObject"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nasDeclaration cannot be resolved"
      + "\nname cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\nname cannot be resolved"
      + "\neAllContents cannot be resolved"
      + "\ntakeWhile cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nref cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nref cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\nname cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\nname cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved");
  }
}
