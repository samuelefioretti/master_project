/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Body#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends Statement
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getBody_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Body