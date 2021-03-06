/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.DoWhileStatement#getBody <em>Body</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.DoWhileStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getDoWhileStatement()
 * @model
 * @generated
 */
public interface DoWhileStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Statement)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getDoWhileStatement_Body()
   * @model containment="true"
   * @generated
   */
  Statement getBody();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.DoWhileStatement#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Statement value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getDoWhileStatement_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.DoWhileStatement#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

} // DoWhileStatement
