/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.myGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.ConditionOperation#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.ConditionOperation#getNegateSecond <em>Negate Second</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.ConditionOperation#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getConditionOperation()
 * @model
 * @generated
 */
public interface ConditionOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryGrammar.myGrammar.LogicalOperationLiteral}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.LogicalOperationLiteral
   * @see #setOperation(LogicalOperationLiteral)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getConditionOperation_Operation()
   * @model
   * @generated
   */
  LogicalOperationLiteral getOperation();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.ConditionOperation#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.LogicalOperationLiteral
   * @see #getOperation()
   * @generated
   */
  void setOperation(LogicalOperationLiteral value);

  /**
   * Returns the value of the '<em><b>Negate Second</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negate Second</em>' attribute.
   * @see #setNegateSecond(String)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getConditionOperation_NegateSecond()
   * @model
   * @generated
   */
  String getNegateSecond();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.ConditionOperation#getNegateSecond <em>Negate Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negate Second</em>' attribute.
   * @see #getNegateSecond()
   * @generated
   */
  void setNegateSecond(String value);

  /**
   * Returns the value of the '<em><b>Seconds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seconds</em>' containment reference.
   * @see #setSeconds(Literal)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getConditionOperation_Seconds()
   * @model containment="true"
   * @generated
   */
  Literal getSeconds();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.ConditionOperation#getSeconds <em>Seconds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seconds</em>' containment reference.
   * @see #getSeconds()
   * @generated
   */
  void setSeconds(Literal value);

} // ConditionOperation
