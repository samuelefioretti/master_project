/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.IfStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.IfStatement#getTrueBody <em>True Body</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.IfStatement#getFalseBody <em>False Body</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends LoopStructures
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getIfStatement_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.IfStatement#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

  /**
   * Returns the value of the '<em><b>True Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>True Body</em>' containment reference.
   * @see #setTrueBody(Statement)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getIfStatement_TrueBody()
   * @model containment="true"
   * @generated
   */
  Statement getTrueBody();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.IfStatement#getTrueBody <em>True Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True Body</em>' containment reference.
   * @see #getTrueBody()
   * @generated
   */
  void setTrueBody(Statement value);

  /**
   * Returns the value of the '<em><b>False Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>False Body</em>' containment reference.
   * @see #setFalseBody(Statement)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getIfStatement_FalseBody()
   * @model containment="true"
   * @generated
   */
  Statement getFalseBody();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.IfStatement#getFalseBody <em>False Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False Body</em>' containment reference.
   * @see #getFalseBody()
   * @generated
   */
  void setFalseBody(Statement value);

} // IfStatement
