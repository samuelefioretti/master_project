/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Mapping#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Mapping#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends StandardType, StandardTypeWithoutQualifiedIdentifier
{
  /**
   * Returns the value of the '<em><b>Key Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.myGrammar.optGrammar.ElementaryTypeNameEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Type</em>' attribute.
   * @see org.unicam.myGrammar.optGrammar.ElementaryTypeNameEnum
   * @see #setKeyType(ElementaryTypeNameEnum)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getMapping_KeyType()
   * @model
   * @generated
   */
  ElementaryTypeNameEnum getKeyType();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Mapping#getKeyType <em>Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Type</em>' attribute.
   * @see org.unicam.myGrammar.optGrammar.ElementaryTypeNameEnum
   * @see #getKeyType()
   * @generated
   */
  void setKeyType(ElementaryTypeNameEnum value);

  /**
   * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' containment reference.
   * @see #setValueType(Type)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getMapping_ValueType()
   * @model containment="true"
   * @generated
   */
  Type getValueType();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Mapping#getValueType <em>Value Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' containment reference.
   * @see #getValueType()
   * @generated
   */
  void setValueType(Type value);

} // Mapping