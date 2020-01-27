/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ExpressionStatement#isSemicolon <em>Semicolon</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ExpressionStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getExpressionStatement()
 * @model
 * @generated
 */
public interface ExpressionStatement extends SimpleStatement, SimpleStatement2
{
  /**
   * Returns the value of the '<em><b>Semicolon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semicolon</em>' attribute.
   * @see #setSemicolon(boolean)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getExpressionStatement_Semicolon()
   * @model
   * @generated
   */
  boolean isSemicolon();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.ExpressionStatement#isSemicolon <em>Semicolon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semicolon</em>' attribute.
   * @see #isSemicolon()
   * @generated
   */
  void setSemicolon(boolean value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getExpressionStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.ExpressionStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // ExpressionStatement
