package org.unicam.myGrammar.validation;

import java.util.function.Predicate;
import org.eclipse.emf.ecore.EObject;
import org.unicam.myGrammar.optGrammar.Contract;
import org.unicam.myGrammar.optGrammar.EnumDefinition;
import org.unicam.myGrammar.optGrammar.Mapping;
import org.unicam.myGrammar.optGrammar.PrimaryTypeDeclaration;
import org.unicam.myGrammar.optGrammar.PrimaryTypeDefinitionDeclaration;
import org.unicam.myGrammar.optGrammar.StructDefinition;

@SuppressWarnings("all")
public class ValidatorSupport {
  protected static final String ISSUE_CODE_PREFIX = "org.unicam.myGrammar.";
  
  public static final String OPTIMIZED_STRUCT_MEMBERS = (ValidatorSupport.ISSUE_CODE_PREFIX + "optimizeStructFields");
  
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
        _switchResult = ValidatorSupport.getName(dec);
      }
    }
    if (!_matched) {
      if (dec instanceof PrimaryTypeDefinitionDeclaration) {
        _matched=true;
        String _xifexpression = null;
        PrimaryTypeDeclaration _ref = ((PrimaryTypeDefinitionDeclaration)dec).getRef();
        boolean _tripleNotEquals = (_ref != null);
        if (_tripleNotEquals) {
          _xifexpression = ((PrimaryTypeDefinitionDeclaration)dec).getRef().getName();
        } else {
          _xifexpression = ((PrimaryTypeDeclaration) dec).getName();
        }
        _switchResult = _xifexpression;
      }
    }
    return _switchResult;
  }
  
  public static Mapping getDefinitionType(final EObject obj) {
    Mapping _switchResult = null;
    boolean _matched = false;
    if (obj instanceof Mapping) {
      _matched=true;
      _switchResult = ((Mapping)obj);
    }
    return _switchResult;
  }
  
  public static EObject getRoot(final EObject eObj, final Predicate<EObject> predicate) {
    EObject current = eObj;
    while (((!(current instanceof Contract)) && (!predicate.test(current)))) {
      current = current.eContainer();
    }
    return current;
  }
  
  public static PrimaryTypeDeclaration asDeclaration(final PrimaryTypeDefinitionDeclaration dec) {
    return ((PrimaryTypeDeclaration) dec);
  }
}
