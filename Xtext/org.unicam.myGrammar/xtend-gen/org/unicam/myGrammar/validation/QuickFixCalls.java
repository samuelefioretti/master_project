package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import java.util.Comparator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.unicam.myGrammar.optGrammar.Contract;
import org.unicam.myGrammar.optGrammar.StructDefinition;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class QuickFixCalls extends AbstractOptGrammarValidator {
  @Inject
  @Override
  public void register(final EValidatorRegistrar registrar) {
  }
  
  private /* Comparator<Declaration> */Object declarationSizeComparator /* Skipped initializer because of errors */;
  
  @Check
  public void orderedStructureFields(final StructDefinition str) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field STRUCT_DECLARATION__NAME is undefined for the type Class<Literals>"
      + "\nThe field QuickFixCalls.declarationSizeComparator refers to the missing type Declaration"
      + "\nThe method getOptimizedOrder(ArrayList, ArrayList, Integer, Integer) from the type QuickFixCalls refers to the missing type ArrayList"
      + "\nThe method getSize(Declaration) from the type QuickFixCalls refers to the missing type Declaration");
  }
  
  @Check
  public void orderedDeclarationsInContract(final Contract con) {
    throw new Error("Unresolved compilation problems:"
      + "\nPrimaryTypeDefinitionDeclaration cannot be resolved to a type."
      + "\nDeclaration cannot be resolved to a type."
      + "\nThe method or field blocks is undefined for the type Contract"
      + "\nThe method or field blocks is undefined for the type Contract"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe field QuickFixCalls.declarationSizeComparator refers to the missing type Declaration"
      + "\nThe method getOptimizedOrder(ArrayList, ArrayList, Integer, Integer) from the type QuickFixCalls refers to the missing type ArrayList"
      + "\nThe method getSize(Declaration) from the type QuickFixCalls refers to the missing type Declaration"
      + "\nforEach cannot be resolved"
      + "\nref cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nindexOf cannot be resolved");
  }
  
  @Check
  public void checkLoopOtimization(final /* LoopStructures */Object loop) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayDefinition cannot be resolved to a type."
      + "\nFieldDefinition cannot be resolved to a type."
      + "\nFieldAccess cannot be resolved to a type."
      + "\nSingleDefinition cannot be resolved to a type."
      + "\nPrimaryTypeDefinitionDeclaration cannot be resolved to a type."
      + "\nFunctionDefinition cannot be resolved to a type."
      + "\nPrimaryTypeDefinitionDeclaration cannot be resolved to a type."
      + "\nArrayDefinition cannot be resolved to a type."
      + "\nFieldAccess cannot be resolved to a type."
      + "\nSingleDefinition cannot be resolved to a type."
      + "\nThe method or field def is undefined for the type Object"
      + "\nThe method or field def is undefined for the type Object"
      + "\nThe method or field ref is undefined for the type EObject"
      + "\nThe method or field name is undefined for the type EObject"
      + "\nThe method or field dec is undefined for the type Object"
      + "\nThe method or field dec is undefined for the type Object"
      + "\nThe method or field operator is undefined for the type EObject"
      + "\nThe method or field ref is undefined for the type EObject"
      + "\nThe method getRoot((Object)=>boolean) is undefined for the type EObject"
      + "\nThe method or field PRIMARY_TYPE_DEFINITION_DECLARATION__REF is undefined for the type Class<Literals>"
      + "\nThe method or field ARRAY_DEFINITION__REF is undefined for the type Class<Literals>"
      + "\nThe method or field FIELD_ACCESS__FIELD is undefined for the type Class<Literals>"
      + "\nThe method or field SINGLE_DEFINITION__NAME is undefined for the type Class<Literals>"
      + "\nThe method or field getName is undefined for the type EObject"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\ntype cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nblocks cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nref cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nindexes cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nindexes cannot be resolved"
      + "\nareAllNumericLiteral cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nfield cannot be resolved"
      + "\nnullOrEmpty cannot be resolved");
  }
  
  public void getOptimizedOrder(final /* ArrayList<Declaration> */Object arr, final /* ArrayList<Declaration> */Object newArr, final Integer index, final Integer currentSum) {
    throw new Error("Unresolved compilation problems:"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe method getSize(Declaration) from the type QuickFixCalls refers to the missing type Declaration"
      + "\nThe method getSize(Declaration) from the type QuickFixCalls refers to the missing type Declaration"
      + "\nlength cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nremove cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ngetOptimizedOrder cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  public int getSize(final /* Declaration */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayableDeclaration cannot be resolved to a type."
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\nempty cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\nempty cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nsubstring cannot be resolved");
  }
}
