/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ForStatement#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ForStatement#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ForStatement#getLoopExpression <em>Loop Expression</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ForStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Expression</em>' containment reference.
   * @see #setInitExpression(SimpleStatement2)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getForStatement_InitExpression()
   * @model containment="true"
   * @generated
   */
  SimpleStatement2 getInitExpression();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.ForStatement#getInitExpression <em>Init Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Expression</em>' containment reference.
   * @see #getInitExpression()
   * @generated
   */
  void setInitExpression(SimpleStatement2 value);

  /**
   * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Expression</em>' containment reference.
   * @see #setConditionExpression(Expression)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getForStatement_ConditionExpression()
   * @model containment="true"
   * @generated
   */
  Expression getConditionExpression();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.ForStatement#getConditionExpression <em>Condition Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Expression</em>' containment reference.
   * @see #getConditionExpression()
   * @generated
   */
  void setConditionExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Loop Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop Expression</em>' containment reference.
   * @see #setLoopExpression(ExpressionStatement)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getForStatement_LoopExpression()
   * @model containment="true"
   * @generated
   */
  ExpressionStatement getLoopExpression();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.ForStatement#getLoopExpression <em>Loop Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop Expression</em>' containment reference.
   * @see #getLoopExpression()
   * @generated
   */
  void setLoopExpression(ExpressionStatement value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Statement)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getForStatement_Body()
   * @model containment="true"
   * @generated
   */
  Statement getBody();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.ForStatement#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Statement value);

} // ForStatement
