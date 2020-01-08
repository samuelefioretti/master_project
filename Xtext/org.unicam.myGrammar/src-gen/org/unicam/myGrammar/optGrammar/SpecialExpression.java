/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.SpecialExpression#getType <em>Type</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.SpecialExpression#getFieldOrMethod <em>Field Or Method</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.SpecialExpression#getQualifiers <em>Qualifiers</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getSpecialExpression()
 * @model
 * @generated
 */
public interface SpecialExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.myGrammar.optGrammar.SpecialExpressionTypeEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.unicam.myGrammar.optGrammar.SpecialExpressionTypeEnum
   * @see #setType(SpecialExpressionTypeEnum)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getSpecialExpression_Type()
   * @model
   * @generated
   */
  SpecialExpressionTypeEnum getType();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.SpecialExpression#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.unicam.myGrammar.optGrammar.SpecialExpressionTypeEnum
   * @see #getType()
   * @generated
   */
  void setType(SpecialExpressionTypeEnum value);

  /**
   * Returns the value of the '<em><b>Field Or Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Or Method</em>' containment reference.
   * @see #setFieldOrMethod(Field)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getSpecialExpression_FieldOrMethod()
   * @model containment="true"
   * @generated
   */
  Field getFieldOrMethod();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.SpecialExpression#getFieldOrMethod <em>Field Or Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Or Method</em>' containment reference.
   * @see #getFieldOrMethod()
   * @generated
   */
  void setFieldOrMethod(Field value);

  /**
   * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.Qualifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifiers</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getSpecialExpression_Qualifiers()
   * @model containment="true"
   * @generated
   */
  EList<Qualifier> getQualifiers();

} // SpecialExpression