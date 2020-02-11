package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Comparator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.unicam.myGrammar.optGrammar.Contract;
import org.unicam.myGrammar.optGrammar.DefinitionBody;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.StructDefinition;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;
import org.unicam.myGrammar.validation.ValidatorSupport;

@SuppressWarnings("all")
public class QuickFixCalls extends AbstractOptGrammarValidator {
  @Inject
  @Override
  public void register(final EValidatorRegistrar registrar) {
  }
  
  private Comparator<DefinitionBody> declarationSizeComparator = new Comparator<DefinitionBody>() {
    @Override
    public int compare(final DefinitionBody o1, final DefinitionBody o2) {
      int firstSize = QuickFixCalls.this.getSize(o1);
      int secondSize = QuickFixCalls.this.getSize(o2);
      return (secondSize - firstSize);
    }
  };
  
  @Check
  public void orderedStructureFields(final StructDefinition str) {
    boolean _isEmpty = str.getMembers().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final ArrayList<DefinitionBody> orderedFields = CollectionLiterals.<DefinitionBody>newArrayList();
      final ArrayList<DefinitionBody> newOrderedFields = CollectionLiterals.<DefinitionBody>newArrayList();
      final ArrayList<Integer> orderedIndexes = CollectionLiterals.<Integer>newArrayList();
      orderedFields.addAll(str.getMembers());
      ListExtensions.<DefinitionBody>sortInplace(orderedFields, this.declarationSizeComparator);
      this.getOptimizedOrder(orderedFields, newOrderedFields, Integer.valueOf(0), Integer.valueOf(this.getSize(orderedFields.get(0))));
      boolean _equals = str.getMembers().equals(newOrderedFields);
      boolean _not_1 = (!_equals);
      if (_not_1) {
        final Function1<DefinitionBody, Integer> _function = (DefinitionBody x) -> {
          return Integer.valueOf(str.getMembers().indexOf(x));
        };
        orderedIndexes.addAll(ListExtensions.<DefinitionBody, Integer>map(newOrderedFields, _function));
        final Function1<Integer, String> _function_1 = (Integer e) -> {
          return e.toString();
        };
        this.warning(
          "This structure can be optimized", 
          OptGrammarPackage.Literals.STRUCT_DEFINITION__NAME, 
          ValidatorSupport.OPTIMIZED_STRUCT_FIELDS, 
          ((String[])Conversions.unwrapArray(ListExtensions.<Integer, String>map(orderedIndexes, _function_1), String.class)));
      }
    }
  }
  
  @Check
  public void orderedDeclarationsInContract(final Contract con) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type VariableDeclaration"
      + "\n=== cannot be resolved");
  }
  
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
   * 					reference = CustomSolidityPackage.Literals.PRIMARY_TYPE_DEFINITION_DECLARATION__REF
   * 				ArrayDefinition:
   * 					if (e.indexes !== null && e.indexes.areAllNumericLiteral && e.field.nullOrEmpty)
   * 						reference = CustomSolidityPackage.Literals.ARRAY_DEFINITION__REF
   * 				FieldAccess:
   * 					reference = CustomSolidityPackage.Literals.FIELD_ACCESS__FIELD
   * 				SingleDefinition:
   * 					reference = CustomSolidityPackage.Literals.SINGLE_DEFINITION__NAME
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
      final Function1<DefinitionBody, Boolean> _function = (DefinitionBody x) -> {
        int _size = this.getSize(x);
        int _plus = ((currentSum).intValue() + _size);
        return Boolean.valueOf((_plus <= 32));
      };
      int ind = arr.indexOf(IterableExtensions.<DefinitionBody>findFirst(arr, _function));
      boolean _isEmpty = arr.isEmpty();
      if (_isEmpty) {
        return;
      }
      int _xifexpression = (int) 0;
      if ((ind != (-1))) {
        _xifexpression = ind;
      } else {
        _xifexpression = 0;
      }
      ind = _xifexpression;
      int _size = this.getSize(arr.get(ind));
      int _plus = ((currentSum).intValue() + _size);
      this.getOptimizedOrder(arr, newArr, Integer.valueOf(ind), Integer.valueOf(_plus));
    }
  }
  
  public int getSize(final DefinitionBody dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type VariableDeclaration"
      + "\nThe method or field type is undefined for the type VariableDeclaration"
      + "\nThe method or field type is undefined for the type VariableDeclaration"
      + "\nThe method or field type is undefined for the type VariableDeclaration"
      + "\nThe method or field type is undefined for the type VariableDeclaration"
      + "\nThe method or field type is undefined for the type VariableDeclaration"
      + "\ntype cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nsubstring cannot be resolved");
  }
}
