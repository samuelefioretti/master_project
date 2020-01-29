/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.FunctionCallArguments#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getFunctionCallArguments()
 * @model
 * @generated
 */
public interface FunctionCallArguments extends EObject
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.tryGrammar.tryGrammar.FunctionCallArg}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getFunctionCallArguments_Args()
   * @model containment="true"
   * @generated
   */
  EList<FunctionCallArg> getArgs();

} // FunctionCallArguments
