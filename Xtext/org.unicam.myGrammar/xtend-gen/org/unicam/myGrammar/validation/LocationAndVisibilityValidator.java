package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.unicam.myGrammar.optGrammar.LocationSpecifierEnum;
import org.unicam.myGrammar.optGrammar.VisibilityEnum;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;
import org.unicam.myGrammar.validation.CorrectIndexValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators = CorrectIndexValidator.class)
@SuppressWarnings("all")
public class LocationAndVisibilityValidator extends AbstractOptGrammarValidator {
  @Inject
  @Override
  public void register(final EValidatorRegistrar registrar) {
  }
  
  @Check
  public void noWrongLocation(final LocationSpecifierEnum locationLiteral) {
    throw new Error("Unresolved compilation problems:"
      + "\nStructDefinition cannot be resolved to a type."
      + "\nThe method or field LOCATION_LITERAL__TYPE is undefined for the type Class<Literals>");
  }
  
  @Check
  public void noWrongLocation(final /* NonArrayableDeclaration */Object nonArrDec) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n!== cannot be resolved");
  }
  
  @Check
  public void noWrongVisibility(final VisibilityEnum visibilityLiteral) {
    throw new Error("Unresolved compilation problems:"
      + "\nStructDefinition cannot be resolved to a type."
      + "\nThe method or field VISIBILITY_LITERAL__TYPE is undefined for the type Class<Literals>");
  }
  
  @Check
  public void checkDataLocation(final /* ArrayDefinitionDeclaration */Object inDec) {
    throw new Error("Unresolved compilation problems:"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ngetRoot cannot be resolved"
      + "\nasDeclaration cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nasDeclaration cannot be resolved");
  }
  
  @Check
  public void checkDataLocation(final /* ConcreteStructDeclaration */Object inDec) {
    throw new Error("Unresolved compilation problems:"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ngetRoot cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nasDeclaration cannot be resolved");
  }
  
  @Check
  public void checkDataLocation(final /* NonArrayableDeclaration */Object inDec) {
    throw new Error("Unresolved compilation problems:"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ngetRoot cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n=== cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nasDeclaration cannot be resolved");
  }
  
  @Check
  public void storageLocation(final /* Mapping */Object map) {
    throw new Error("Unresolved compilation problems:"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ngetRoot cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n!== cannot be resolved");
  }
}
