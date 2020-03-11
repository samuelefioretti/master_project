/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Returns Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ReturnsParameterList#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getReturnsParameterList()
 * @model
 * @generated
 */
public interface ReturnsParameterList extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.ReturnParameterDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getReturnsParameterList_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ReturnParameterDeclaration> getParameters();

} // ReturnsParameterList
