/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.unicam.myGrammar.optGrammar.ArrayDimensions;
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
  public void structAssegnationAreStructs(final ArrayDimensions arrayDefinition) {
    throw new Error("Unresolved compilation problems:"
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nThe method or field ref is undefined for the type ArrayDimensions"
      + "\nThe method or field field is undefined for the type ArrayDimensions"
      + "\nThe method or field first is undefined for the type EList<Expression> & Expression"
      + "\nThe method or field first is undefined for the type EList<Expression> & Expression"
      + "\nThe method or field Literals is undefined for the type Class<OptGrammarPackage>"
      + "\nasDeclaration cannot be resolved"
      + "\ntype cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nref cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nref cannot be resolved"
      + "\nARRAY_DEFINITION__VALUE cannot be resolved");
  }
}
