package org.unicam.myGrammar.validation;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.unicam.myGrammar.optGrammar.DefinitionBody;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class QuickFixCalls extends AbstractOptGrammarValidator {
  /**
   * @Check
   * 	def checkLoopOtimization(LoopStructures loop) {
   * 		if(loop.type === "if") return;
   * 
   * 		val checkList = newArrayList()
   * 
   * 		loop.blocks.forEach [ block |
   * 			var EObject toCheck = null;
   * 			var EObject actual = null;
   * 			if (block.^def !== null) {
   * 				actual = block.^def
   * 				toCheck = switch actual {
   * 					ArrayDefinition:
   * 						actual.ref
   * 					FieldDefinition:
   * 						(actual as FieldAccess).ref
   * 					SingleDefinition:
   * 						actual.name
   * 				}
   * 			} else if (block.^dec !== null) {
   * 				actual = block.^dec
   * 				switch actual {
   * 					PrimaryTypeDefinitionDeclaration:
   * 						if(actual.operator !== null) toCheck = actual.ref
   * 				}
   * 			}
   * 			if (toCheck !== null && toCheck.getRoot[e|e instanceof FunctionDefinition] instanceof Contract)
   * 				checkList.add(actual)
   * 		]
   * 
   * 		checkList.forEach [ e |
   * 			var EStructuralFeature reference = null;
   * 			switch e {
   * 				PrimaryTypeDefinitionDeclaration:
   * 					reference = OptGrammarPackage.Literals.PRIMARY_TYPE_DEFINITION_DECLARATION__REF
   * 				ArrayDefinition:
   * 					if (e.indexes !== null && e.indexes.areAllNumericLiteral && e.field.nullOrEmpty)
   * 						reference = OptGrammarPackage.Literals.ARRAY_DEFINITION__REF
   * 				FieldAccess:
   * 					reference = OptGrammarPackage.Literals.FIELD_ACCESS__FIELD
   * 				SingleDefinition:
   * 					reference = OptGrammarPackage.Literals.SINGLE_DEFINITION__NAME
   * 			}
   * 			if (reference !== null)
   * 				warning(e.getName, e, reference, ValidatorSupport.OPTIMIZE_INTERNAL_FOR)
   * 		]
   * 	}
   */
  public void getOptimizedOrder(final ArrayList<DefinitionBody> arr, final ArrayList<DefinitionBody> newArr, final Integer index, final Integer currentSum) {
    int _length = ((Object[])Conversions.unwrapArray(arr, Object.class)).length;
    boolean _lessThan = ((index).intValue() < _length);
    if (_lessThan) {
      newArr.add(arr.remove(index.intValue()));
    }
  }
}
