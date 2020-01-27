package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import java.util.function.Predicate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.unicam.myGrammar.optGrammar.Contract;
import org.unicam.myGrammar.optGrammar.FunctionDefinition;
import org.unicam.myGrammar.optGrammar.LocationSpecifierEnum;
import org.unicam.myGrammar.optGrammar.Mapping;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.StructDefinition;
import org.unicam.myGrammar.optGrammar.VisibilityEnum;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;
import org.unicam.myGrammar.validation.CorrectIndexValidator;
import org.unicam.myGrammar.validation.ValidatorSupport;

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
    final Predicate<EObject> _function = (EObject eObj) -> {
      return ((eObj instanceof StructDefinition) || (eObj instanceof FunctionDefinition));
    };
    final EObject current = ValidatorSupport.getRoot(locationLiteral.eContainer().eContainer(), _function);
    if ((!(current instanceof FunctionDefinition))) {
      this.error("Location cannot be declared here", OptGrammarPackage.Literals.LOCATION_SPECIFIER_ENUM__TYPE);
    }
  }
  
  /**
   * @Check
   * 	def noWrongLocation(NonArrayableDeclaration nonArrDec) {
   * 		if (!nonArrDec.type.type.equals("string") && nonArrDec.location !== null)
   * 			error("Location cannot be declared here", OptGrammarPackage.Literals.NON_ARRAYABLE_DECLARATION__TYPE)
   * 	}
   */
  @Check
  public void noWrongVisibility(final VisibilityEnum visibilityLiteral) {
    final Predicate<EObject> _function = (EObject eObj) -> {
      return ((eObj instanceof StructDefinition) || (eObj instanceof FunctionDefinition));
    };
    final EObject current = ValidatorSupport.getRoot(visibilityLiteral.eContainer().eContainer(), _function);
    if ((!(current instanceof Contract))) {
      this.error("Visibility cannot be declared here", OptGrammarPackage.Literals.VISIBILITY_ENUM__TYPE);
    }
  }
  
  /**
   * @Check
   * def checkDataLocation(NonArrayableDeclaration inDec) {
   * 	if (inDec.getRoot[obj|obj instanceof FunctionDefinition] instanceof FunctionDefinition &&
   * 		inDec.location === null && inDec.type.type.equals("string"))
   * 		error("Strings must have a data location", inDec.asDeclaration,
   * 			OptGrammarPackage.Literals.NON_ARRAYABLE_DECLARATION__TYPE)
   * }
   */
  @Check
  public void storageLocation(final Mapping map) {
    final Predicate<EObject> _function = (EObject e) -> {
      return (e instanceof FunctionDefinition);
    };
    EObject _root = ValidatorSupport.getRoot(map, _function);
    if ((_root instanceof FunctionDefinition)) {
      String _location = map.getLocation();
      boolean _tripleEquals = (_location == null);
      if (_tripleEquals) {
        this.error("Map must be located in storage", map, OptGrammarPackage.Literals.MAPPING__NAME);
      }
    } else {
      String _location_1 = map.getLocation();
      boolean _tripleNotEquals = (_location_1 != null);
      if (_tripleNotEquals) {
        this.error("Map Location must not be declared here", map, OptGrammarPackage.Literals.MAPPING__NAME);
      }
    }
  }
}
