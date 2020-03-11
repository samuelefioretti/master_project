/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.ui.quickfix;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.unicam.myGrammar.optGrammar.Contract;
import org.unicam.myGrammar.optGrammar.DefinitionBody;
import org.unicam.myGrammar.optGrammar.StructDefinition;
import org.unicam.myGrammar.validation.ValidatorSupport;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
@SuppressWarnings("all")
public class OptGrammarQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(ValidatorSupport.OPTIMIZED_STRUCT_MEMBERS)
  public void optmizeStructFields(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      final ArrayList<DefinitionBody> newFields = new ArrayList<DefinitionBody>();
      final Function1<String, Integer> _function_1 = (String x) -> {
        return Integer.valueOf(Integer.parseInt(x));
      };
      final List<Integer> indexes = ListExtensions.<String, Integer>map(((List<String>)Conversions.doWrapArray(issue.getData())), _function_1);
      final Consumer<Integer> _function_2 = (Integer x) -> {
        newFields.add(((StructDefinition) element).getMembers().get((x).intValue()));
      };
      indexes.forEach(_function_2);
      ((StructDefinition) element).eSet(((StructDefinition) element).getMembers().get(0).eContainingFeature(), newFields);
    };
    acceptor.accept(issue, 
      "Optimize struct", 
      "", 
      "", _function);
  }
  
  @Fix(ValidatorSupport.OPTIMIZE_CONTRACT_DECLARATIONS)
  public void optimizeContractDeclaration(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      final ArrayList<DefinitionBody> newFields = new ArrayList<DefinitionBody>();
      final Function1<String, Integer> _function_1 = (String x) -> {
        return Integer.valueOf(Integer.parseInt(x));
      };
      final List<Integer> indexes = ListExtensions.<String, Integer>map(((List<String>)Conversions.doWrapArray(issue.getData())), _function_1);
      final Consumer<Integer> _function_2 = (Integer x) -> {
        newFields.add(DefinitionBody.class.cast(((Contract) element).getBody().get((x).intValue())));
      };
      indexes.forEach(_function_2);
      final Consumer<DefinitionBody> _function_3 = (DefinitionBody x) -> {
        ((Contract) element).getBody().remove(x);
      };
      newFields.forEach(_function_3);
      ((Contract) element).getBody().addAll((IterableExtensions.<Integer>sort(indexes).get(0)).intValue(), newFields);
    };
    acceptor.accept(issue, 
      "Optimize declarations order", 
      "", 
      "", _function);
  }
}
