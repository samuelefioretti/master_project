/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;
import org.unicam.myGrammar.validation.LocationAndVisibilityValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators = LocationAndVisibilityValidator.class)
@SuppressWarnings("all")
public class OptGrammarValidator extends AbstractOptGrammarValidator {
  @Check
  public void structAssegnationAreStructs(final /* ArrayDefinition */Object arrayDefinition) {
    throw new Error("Unresolved compilation problems:"
      + "\nExpression cannot be resolved to a type."
      + "\nStructDefinition cannot be resolved to a type."
      + "\nref cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\ntype cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nfield cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nfirst cannot be resolved"
      + "\nref cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nfirst cannot be resolved"
      + "\nref cannot be resolved");
  }
}
