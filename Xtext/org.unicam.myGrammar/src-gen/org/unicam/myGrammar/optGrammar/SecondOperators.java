/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Second Operators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.SecondOperators#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.SecondOperators#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getSecondOperators()
 * @model
 * @generated
 */
public interface SecondOperators extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getSecondOperators_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.SecondOperators#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(PrimaryArithmetic)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getSecondOperators_Value()
   * @model containment="true"
   * @generated
   */
  PrimaryArithmetic getValue();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.SecondOperators#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(PrimaryArithmetic value);

} // SecondOperators
