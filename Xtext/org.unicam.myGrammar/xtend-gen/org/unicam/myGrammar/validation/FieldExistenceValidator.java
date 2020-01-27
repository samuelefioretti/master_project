package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;
import org.unicam.myGrammar.validation.CorrectOperationValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators = CorrectOperationValidator.class)
@SuppressWarnings("all")
public class FieldExistenceValidator extends AbstractOptGrammarValidator {
  @Inject
  @Override
  public void register(final EValidatorRegistrar registrar) {
  }
  
  @Check
  public void fieldExists(final /* FieldAccess */Object fieldAccess) {
    throw new Error("Unresolved compilation problems:"
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nThe method or field FIELD_ACCESS__FIELD is undefined for the type Class<Literals>"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nref cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nfields cannot be resolved"
      + "\nexists cannot be resolved"
      + "\nfield cannot be resolved"
      + "\nfieldExists cannot be resolved"
      + "\n! cannot be resolved"
      + "\nfield cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Check
  public void fieldExists(final /* ArrayDefinition */Object arrayDefinition) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ARRAY_DEFINITION__FIELD is undefined for the type Class<Literals>"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nfield cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nref cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\nstrucType cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nref cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\nstrucType cannot be resolved"
      + "\nfields cannot be resolved"
      + "\nexists cannot be resolved"
      + "\nfield cannot be resolved"
      + "\nfieldExists cannot be resolved"
      + "\n! cannot be resolved"
      + "\nfield cannot be resolved"
      + "\nref cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\nstrucType cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Check
  public void fieldExists(final /* ArrayAccess */Object arrayAccess) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayDeclaration cannot be resolved to a type."
      + "\nArrayDeclaration cannot be resolved to a type."
      + "\nArrayDeclaration cannot be resolved to a type."
      + "\nThe method or field ARRAY_ACCESS__FIELD is undefined for the type Class<Literals>"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nfield cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nvariable cannot be resolved"
      + "\nstrucType cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nvariable cannot be resolved"
      + "\nstrucType cannot be resolved"
      + "\nfields cannot be resolved"
      + "\nexists cannot be resolved"
      + "\nfield cannot be resolved"
      + "\nfieldExists cannot be resolved"
      + "\n! cannot be resolved"
      + "\nfield cannot be resolved"
      + "\nvariable cannot be resolved"
      + "\nstrucType cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public Object fieldExists(final String field, final /* Declaration */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetName cannot be resolved"
      + "\nequals cannot be resolved");
  }
}
