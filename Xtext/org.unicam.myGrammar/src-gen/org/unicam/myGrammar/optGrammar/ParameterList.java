/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ParameterList#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getParameterList()
 * @model
 * @generated
 */
public interface ParameterList extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getParameterList_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getParameters();

} // ParameterList
