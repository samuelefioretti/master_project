package org.unicam.myGrammar.validation;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.unicam.myGrammar.optGrammar.ArrayableDeclaration;
import org.unicam.myGrammar.optGrammar.Contract;
import org.unicam.myGrammar.optGrammar.DefinitionBody;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.PrimaryTypeDeclaration;
import org.unicam.myGrammar.optGrammar.PrimaryTypeDefinitionDeclaration;
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
          ValidatorSupport.OPTIMIZED_STRUCT_MEMBERS, 
          ((String[])Conversions.unwrapArray(ListExtensions.<Integer, String>map(orderedIndexes, _function_1), String.class)));
      }
    }
  }
  
  @Check
  public void orderedDeclarationsInContract(final Contract con) {
    final ArrayList<DefinitionBody> initialFields = CollectionLiterals.<DefinitionBody>newArrayList();
    final ArrayList<DefinitionBody> orderedFields = CollectionLiterals.<DefinitionBody>newArrayList();
    final ArrayList<DefinitionBody> newOrderedFields = CollectionLiterals.<DefinitionBody>newArrayList();
    final ArrayList<Integer> orderedIndexes = CollectionLiterals.<Integer>newArrayList();
    final Consumer<DefinitionBody> _function = (DefinitionBody e) -> {
      boolean _matched = false;
      if (e instanceof PrimaryTypeDefinitionDeclaration) {
        _matched=true;
        PrimaryTypeDeclaration _ref = ((PrimaryTypeDefinitionDeclaration)e).getRef();
        boolean _tripleEquals = (_ref == null);
        if (_tripleEquals) {
          orderedFields.add(e);
        }
      }
      if (!_matched) {
        if (e instanceof DefinitionBody) {
          _matched=true;
          orderedFields.add(e);
        }
      }
    };
    con.getBody().forEach(_function);
    initialFields.addAll(orderedFields);
    ListExtensions.<DefinitionBody>sortInplace(orderedFields, this.declarationSizeComparator);
    int _length = ((Object[])Conversions.unwrapArray(orderedFields, Object.class)).length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      this.getOptimizedOrder(orderedFields, newOrderedFields, Integer.valueOf(0), Integer.valueOf(this.getSize(orderedFields.get(0))));
      boolean _equals = initialFields.equals(newOrderedFields);
      boolean _not = (!_equals);
      if (_not) {
        final Function1<DefinitionBody, Integer> _function_1 = (DefinitionBody x) -> {
          return Integer.valueOf(con.getBody().indexOf(x));
        };
        orderedIndexes.addAll(ListExtensions.<DefinitionBody, Integer>map(newOrderedFields, _function_1));
        final Function1<Integer, String> _function_2 = (Integer e) -> {
          return e.toString();
        };
        this.warning(
          "The declarations order can be optimized", con, 
          OptGrammarPackage.Literals.CONTRACT__NAME, 
          ValidatorSupport.OPTIMIZE_CONTRACT_DECLARATIONS, 
          ((String[])Conversions.unwrapArray(ListExtensions.<Integer, String>map(orderedIndexes, _function_2), String.class)));
      }
    }
  }
  
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
    boolean _matched = false;
    if (dec instanceof ArrayableDeclaration) {
      _matched=true;
      int _xifexpression = (int) 0;
      boolean _startsWith = ((ArrayableDeclaration)dec).getType().getType().startsWith("int");
      if (_startsWith) {
        int _xifexpression_1 = (int) 0;
        boolean _isEmpty = ((ArrayableDeclaration)dec).getType().getType().substring(3).isEmpty();
        if (_isEmpty) {
          _xifexpression_1 = 32;
        } else {
          int _parseInt = Integer.parseInt(((ArrayableDeclaration)dec).getType().getType().substring(3));
          _xifexpression_1 = (_parseInt / 8);
        }
        _xifexpression = _xifexpression_1;
      } else {
        int _xifexpression_2 = (int) 0;
        boolean _startsWith_1 = ((ArrayableDeclaration)dec).getType().getType().startsWith("bytes");
        if (_startsWith_1) {
          int _xifexpression_3 = (int) 0;
          boolean _isEmpty_1 = ((ArrayableDeclaration)dec).getType().getType().substring(5).isEmpty();
          if (_isEmpty_1) {
            _xifexpression_3 = 32;
          } else {
            _xifexpression_3 = Integer.parseInt(((ArrayableDeclaration)dec).getType().getType().substring(5));
          }
          _xifexpression_2 = _xifexpression_3;
        } else {
          _xifexpression_2 = 20;
        }
        _xifexpression = _xifexpression_2;
      }
      return _xifexpression;
    }
    return 33;
  }
}
