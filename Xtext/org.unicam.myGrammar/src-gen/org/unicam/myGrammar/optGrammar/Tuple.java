/**
 * generated by Xtext 2.20.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Tuple#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getTuple()
 * @model
 * @generated
 */
public interface Tuple extends Expression
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getTuple_Members()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getMembers();

} // Tuple
