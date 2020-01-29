/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.TypeCast#getValue <em>Value</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.TypeCast#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getTypeCast()
 * @model
 * @generated
 */
public interface TypeCast extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ElementaryTypeNameEnum)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getTypeCast_Value()
   * @model containment="true"
   * @generated
   */
  ElementaryTypeNameEnum getValue();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.TypeCast#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ElementaryTypeNameEnum value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getTypeCast_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.TypeCast#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // TypeCast
