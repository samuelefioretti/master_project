package org.unicam.myGrammar.validation;

import java.util.function.Predicate;
import org.eclipse.emf.ecore.EObject;
import org.unicam.myGrammar.optGrammar.Contract;
import org.unicam.myGrammar.optGrammar.EnumDefinition;
import org.unicam.myGrammar.optGrammar.Mapping;
import org.unicam.myGrammar.optGrammar.StructDefinition;

@SuppressWarnings("all")
public class ValidatorSupport {
  protected static final String ISSUE_CODE_PREFIX = "org.unicam.myGrammar.";
  
  public static final String OPTIMIZED_STRUCT_FIELDS = (ValidatorSupport.ISSUE_CODE_PREFIX + "optimizeStructFields");
  
  public static final String OPTIMIZE_INTERNAL_FOR = (ValidatorSupport.ISSUE_CODE_PREFIX + "optimizeInternalFor");
  
  public static final String OPTIMIZE_CONTRACT_DECLARATIONS = (ValidatorSupport.ISSUE_CODE_PREFIX + "optimizeContractDeclarations");
  
  public static String getName(final EObject dec) {
    String _switchResult = null;
    boolean _matched = false;
    if (dec instanceof EnumDefinition) {
      _matched=true;
      _switchResult = ((EnumDefinition)dec).getName();
    }
    if (!_matched) {
      if (dec instanceof StructDefinition) {
        _matched=true;
        _switchResult = ((StructDefinition)dec).getName();
      }
    }
    if (!_matched) {
      if (dec instanceof Mapping) {
        _matched=true;
        _switchResult = ((Mapping)dec).getName();
      }
    }
    return _switchResult;
  }
  
  /**
   * def static getDefinitionType(EObject obj) {
   * 	return switch obj {
   * 		ArrayDefinition: obj
   * 		Mapping: obj
   * 		SingleDefinition: obj
   * 		FieldDefinition: obj
   * 	}
   * }
   */
  public static EObject getRoot(final EObject eObj, final Predicate<EObject> predicate) {
    EObject current = eObj;
    while (((!(current instanceof Contract)) && (!predicate.test(current)))) {
      current = current.eContainer();
    }
    return current;
  }
}
