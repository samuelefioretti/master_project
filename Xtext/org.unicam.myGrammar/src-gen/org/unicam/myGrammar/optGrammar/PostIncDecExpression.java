/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Inc Dec Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.PostIncDecExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.PostIncDecExpression#getPostOp <em>Post Op</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getPostIncDecExpression()
 * @model
 * @generated
 */
public interface PostIncDecExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getPostIncDecExpression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.PostIncDecExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Post Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.myGrammar.optGrammar.IncDecOpEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Op</em>' attribute.
   * @see org.unicam.myGrammar.optGrammar.IncDecOpEnum
   * @see #setPostOp(IncDecOpEnum)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getPostIncDecExpression_PostOp()
   * @model
   * @generated
   */
  IncDecOpEnum getPostOp();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.PostIncDecExpression#getPostOp <em>Post Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Op</em>' attribute.
   * @see org.unicam.myGrammar.optGrammar.IncDecOpEnum
   * @see #getPostOp()
   * @generated
   */
  void setPostOp(IncDecOpEnum value);

} // PostIncDecExpression
