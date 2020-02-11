/**
 * generated by Xtext 2.20.0
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
import org.unicam.myGrammar.optGrammar.OptGrammarFactory;
import org.unicam.myGrammar.optGrammar.SizedDeclaration;
import org.unicam.myGrammar.optGrammar.StructDefinition;
import org.unicam.myGrammar.validation.ValidatorSupport;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
@SuppressWarnings("all")
public class OptGrammarQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(ValidatorSupport.OPTIMIZED_STRUCT_FIELDS)
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
  
  /**
   * @Fix(ValidatorSupport.OPTIMIZE_INTERNAL_FOR)
   * 	def void optimizedFor(Issue issue, IssueResolutionAcceptor acceptor) {
   * 		acceptor.accept(issue, 'Optimize loop', 'Refactor Loop for optimization in this specific variable',
   * 			'', [ element, context |
   * 				val loop = element.getRoot[e|e instanceof LoopStructures && (e as LoopStructures).type !== "if"]
   * 				val newElement = element.newLocalElement;
   * 				val newBlock = CustomSolidityFactory.eINSTANCE.createInternalBlock;
   * 				newBlock.dec = newElement;
   * 
   * 				val newAssignmentBlock = CustomSolidityFactory.eINSTANCE.createInternalBlock;
   * 				val EObject x = newElement.assignTo(element)
   * 				switch (x) {
   * 					FunctionDeclaration:
   * 						newAssignmentBlock.dec = x
   * 					ArrayDefinition | MappingDefinition | SingleDefinition | FieldDefinition:
   * 						newAssignmentBlock.def = x
   * 				}
   * 				val loopContainer = loop.eContainer.eContainer;
   * 				switch (loopContainer) {
   * 					LoopStructures: {
   * 						val index = loopContainer.blocks.indexOf(loop.eContainer)
   * 						loopContainer.blocks.add(index, newBlock)
   * 						if (index + 2 < loopContainer.blocks.size)
   * 							loopContainer.blocks.add(index + 2, newAssignmentBlock)
   * 						else
   * 							loopContainer.blocks.add(newAssignmentBlock)
   * 					}
   * 					FunctionDefinition: {
   * 						val index = loopContainer.blocks.indexOf(loop.eContainer)
   * 						loopContainer.blocks.add(index, newBlock)
   * 						if (index + 2 < loopContainer.blocks.size)
   * 							loopContainer.blocks.add(index + 2, newAssignmentBlock)
   * 						else
   * 							loopContainer.blocks.add(newAssignmentBlock)
   * 					}
   * 					default:
   * 						throw new Exception("I shouldn't be here")
   * 				}
   * 				switch element {
   * 					PrimaryTypeDefinitionDeclaration: {
   * 						for (loopElement : loop.eAllContents.filter [ e |
   * 							e instanceof PrimaryTypeDefinitionDeclaration &&
   * 								(e as PrimaryTypeDefinitionDeclaration).ref !== null ||
   * 								e instanceof Condition && (e as Condition).ref !== null
   * 						].toList) {
   * 							if (loopElement instanceof PrimaryTypeDefinitionDeclaration) {
   * 								if (loopElement !== element && loopElement.ref === element.ref)
   * 									loopElement.ref = newElement as PrimaryTypeDeclaration
   * 							} else {
   * 								if (loopElement instanceof Condition) {
   * 									if (loopElement.ref === element.ref)
   * 										loopElement.ref = newElement as PrimaryTypeDeclaration
   * 								}
   * 							}
   * 						}
   * 						element.ref = newElement as PrimaryTypeDeclaration
   * 					}
   * 					ArrayDefinition: {
   * 						for (loopElement : loop.eAllContents.filter [ e |
   * 							e instanceof ArrayDefinition || e instanceof ArrayAccess
   * 						].toList) {
   * 							if (loopElement instanceof ArrayDefinition) {
   * 								if (loopElement.ref === element.ref && loopElement !== element &&
   * 									loopElement.indexes.equalsTo(element.indexes)) {
   * 									(loopElement.getRoot[e|e instanceof InternalBlock] as InternalBlock).modify(
   * 										loopElement, newElement)
   * 								}
   * 							} else {
   * 								if (loopElement instanceof ArrayAccess) {
   * 									if (loopElement.variable === element.ref &&
   * 										loopElement.indexes.equalsTo(element.indexes) && loopElement.field === null) {
   * 										var cond = CustomSolidityFactory.eINSTANCE.createCondition;
   * 										cond.ref = newElement;
   * 										loopElement.eContainer.eSet(loopElement.eContainingFeature, cond);
   * 									}
   * 								}
   * 							}
   * 						}
   * 						(element.getRoot[e|e instanceof InternalBlock] as InternalBlock).modify(element, newElement)
   * 					}
   * 				}
   * 			])
   * 	}
   * 
   * 	def modify(InternalBlock block, ArrayDefinition element, EObject newElement) {
   * 		block.dec = element.createPrimaryTypeDefDec(newElement as PrimaryTypeDefinitionDeclaration)
   * 		block.def = null;
   * 	}
   * 
   * 	def createPrimaryTypeDefDec(ArrayDefinition arr, PrimaryTypeDefinitionDeclaration tempVariable) {
   * 		var PrimaryTypeDefinitionDeclaration toReturn = CustomSolidityFactory.eINSTANCE.
   * 			createPrimaryTypeDefinitionDeclaration;
   * 		toReturn.ref = tempVariable as PrimaryTypeDeclaration;
   * 		toReturn.operator = arr.operator;
   * 		if (arr.value instanceof LogicalOperations) {
   * 			toReturn.value = arr.value as LogicalOperations
   * 		}
   * 		return toReturn
   * 	}
   * 
   * 	def EObject _assignTo(FunctionDeclaration internalElement, PrimaryTypeDefinitionDeclaration refToElementInStorage) {
   * 		val PrimaryTypeDefinitionDeclaration toReturn = CustomSolidityFactory.eINSTANCE.
   * 			createPrimaryTypeDefinitionDeclaration;
   * 		toReturn.ref = refToElementInStorage.ref.asDeclaration;
   * 		toReturn.operator = CustomSolidityFactory.eINSTANCE.createOperationAssegnationLiteral;
   * 		toReturn.operator.value = "="
   * 		val toReturnValue = CustomSolidityFactory.eINSTANCE.createLogicalOperations;
   * 		toReturnValue.first = CustomSolidityFactory.eINSTANCE.createCondition;
   * 		toReturnValue.first.ref = internalElement;
   * 		toReturn.value = toReturnValue;
   * 		return toReturn;
   * 	}
   * 
   * 	def EObject _assignTo(FunctionDeclaration internalElement, ArrayDefinition refToElementInStorage) {
   * 		val ArrayDefinition toReturn = CustomSolidityFactory.eINSTANCE.createArrayDefinition
   * 		toReturn.ref = refToElementInStorage.ref as ArrayDeclaration;
   * 		refToElementInStorage.indexes.forEach [ e |
   * 			toReturn.indexes.add(e.clone)
   * 		]
   * 		toReturn.operator = CustomSolidityFactory.eINSTANCE.createOperationAssegnationLiteral;
   * 		toReturn.operator.value = "="
   * 		val toReturnValue = CustomSolidityFactory.eINSTANCE.createLogicalOperations;
   * 		toReturnValue.first = CustomSolidityFactory.eINSTANCE.createCondition;
   * 		toReturnValue.first.ref = internalElement;
   * 		toReturn.value = toReturnValue;
   * 		return toReturn;
   * 	}
   * 
   * 	def EObject assignTo(FunctionDeclaration internalElement, EObject refToElementInStorage) {
   * 		switch (refToElementInStorage) {
   * 			PrimaryTypeDefinitionDeclaration: {
   * 				return internalElement._assignTo(refToElementInStorage)
   * 			}
   * 			ArrayDefinition: {
   * 				return internalElement._assignTo(refToElementInStorage)
   * 			}
   * 			FieldAccess: {
   * 			}
   * 			SingleDefinition: {
   * 			}
   * 			default:
   * 				null
   * 		}
   * 	}
   * 
   * 	def clone(ArrayIndex e) {
   * 		val toAdd = CustomSolidityFactory.eINSTANCE.createArrayIndex;
   * 		toAdd.value = CustomSolidityFactory.eINSTANCE.createLogicalOperations;
   * 		val arithOp = CustomSolidityFactory.eINSTANCE.createArithmeticOperations;
   * 		val numLit = CustomSolidityFactory.eINSTANCE.createNumericLiteral;
   * 		numLit.intValue = CustomSolidityFactory.eINSTANCE.createIntLiteral;
   * 		numLit.intValue.value = (((e.value as LogicalOperations).first as ArithmeticOperations).
   * 			first as NumericLiteral).intValue.value
   * 		arithOp.first = numLit;
   * 		toAdd.value.first = arithOp;
   * 		return toAdd;
   * 	}
   * 
   * 	def _newLocalElement(PrimaryTypeDefinitionDeclaration obj) {
   * 		var FunctionDeclaration toReturn = null;
   * 		toReturn = obj.typedDeclaration;
   * 
   * 		(toReturn as PrimaryTypeDeclaration).name = getNewTempName();
   * 
   * 		(toReturn as PrimaryTypeDefinitionDeclaration).operator = CustomSolidityFactory.eINSTANCE.
   * 			createOperationAssegnationLiteral;
   * 		(toReturn as PrimaryTypeDefinitionDeclaration).operator.value = "=";
   * 		val logicalOperation = CustomSolidityFactory.eINSTANCE.createLogicalOperations;
   * 		logicalOperation.first = CustomSolidityFactory.eINSTANCE.createCondition;
   * 		logicalOperation.first.ref = obj.ref;
   * 		(toReturn as PrimaryTypeDefinitionDeclaration).value = logicalOperation
   * 		return toReturn;
   * 	}
   * 
   * 	def _newLocalElement(ArrayDefinition obj) {
   * 		var FunctionDeclaration toReturn = obj.typedDeclaration;
   * 		if (toReturn instanceof PrimaryTypeDefinitionDeclaration) {
   * 			(toReturn as PrimaryTypeDeclaration).name = getNewTempName;
   * 			(toReturn as PrimaryTypeDefinitionDeclaration).operator = CustomSolidityFactory.eINSTANCE.
   * 				createOperationAssegnationLiteral;
   * 			(toReturn as PrimaryTypeDefinitionDeclaration).operator.value = "=";
   * 			val logicalOperation = CustomSolidityFactory.eINSTANCE.createLogicalOperations;
   * 			logicalOperation.first = CustomSolidityFactory.eINSTANCE.createArrayAccess;
   * 			(logicalOperation.first as ArrayAccess).variable = obj.ref;
   * 			obj.indexes.forEach [ index |
   * 				(logicalOperation.first as ArrayAccess).indexes.add(index.clone)
   * 			]
   * 			(toReturn as PrimaryTypeDefinitionDeclaration).value = logicalOperation
   * 		} else {
   * 			(toReturn as ConcreteStructDeclaration).name = getNewTempName();
   * 			(toReturn as ConcreteStructureDefinitionDeclaration).arrayAccessRef = CustomSolidityFactory.eINSTANCE.
   * 				createArrayAccess;
   * 			(toReturn as ConcreteStructureDefinitionDeclaration).arrayAccessRef.variable = obj.ref;
   * 			(toReturn as ConcreteStructureDefinitionDeclaration).arrayAccessRef.indexes.addAll(obj.indexes);
   * 		}
   * 		return toReturn;
   * 	}
   * 
   * 	def newLocalElement(EObject obj) {
   * 		switch (obj) {
   * 			PrimaryTypeDefinitionDeclaration: {
   * 				return obj._newLocalElement
   * 			}
   * 			ArrayDefinition: {
   * 				return obj._newLocalElement
   * 			}
   * 			FieldAccess: {
   * 			}
   * 			SingleDefinition: {
   * 			}
   * 			default:
   * 				null
   * 		}
   * 	}
   * 
   * 	def String getNewTempName() {
   * 		return "cSQp" + Math.ceil(Math.random * 100).intValue + loopOptimizationNumber++;
   * 	}
   * 
   * 	def FunctionDeclaration getTypedDeclaration(PrimaryTypeDefinitionDeclaration obj) {
   * 		var PrimaryTypeDeclaration toReturn = null;
   * 		if (obj.ref instanceof ArrayableDeclaration) {
   * 			toReturn = CustomSolidityFactory.eINSTANCE.createArrayableDeclaration;
   * 			(toReturn as ArrayableDeclaration).type = (obj.ref as ArrayableDeclaration).type.clone;
   * 		} else {
   * 			toReturn = CustomSolidityFactory.eINSTANCE.createNonArrayableDeclaration;
   * 			(toReturn as NonArrayableDeclaration).type = (obj.ref as NonArrayableDeclaration).type.clone;
   * 		}
   * 		return toReturn;
   * 	}
   * 
   * 	def FunctionDeclaration getTypedDeclaration(ArrayDefinition obj) {
   * 		val ref = obj.ref as ArrayDeclaration;
   * 		var FunctionDeclaration toReturn = null;
   * 		if (ref.type !== null) {
   * 			if (ref.type instanceof SizedDeclaration) {
   * 				val arrDec = CustomSolidityFactory.eINSTANCE.createArrayableDeclaration;
   * 				arrDec.type = SizedDeclaration.cast(ref.type).clone;
   * 				toReturn = arrDec;
   * 			} else {
   * 				toReturn = CustomSolidityFactory.eINSTANCE.createNonArrayableDeclaration;
   * 				(toReturn as NonArrayableDeclaration).type = SimpleTypeDeclaration.cast(ref.type).clone;
   * 			}
   * 		} else {
   * 			toReturn = CustomSolidityFactory.eINSTANCE.createConcreteStructDeclaration;
   * 			(toReturn as ConcreteStructDeclaration).type = (obj.ref as ArrayDeclaration).strucType
   * 		}
   * 		return toReturn;
   * 	}
   */
  public SizedDeclaration clone(final SizedDeclaration obj) {
    final SizedDeclaration toReturn = OptGrammarFactory.eINSTANCE.createSizedDeclaration();
    toReturn.setType(obj.getType());
    return toReturn;
  }
}
