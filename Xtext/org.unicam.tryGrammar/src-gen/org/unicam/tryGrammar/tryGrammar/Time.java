/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.Time#getValue <em>Value</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.Time#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends org.unicam.tryGrammar.tryGrammar.Number
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(BigInteger)
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getTime_Value()
   * @model
   * @generated
   */
  BigInteger getValue();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.Time#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(BigInteger value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryGrammar.tryGrammar.TimeSubdenominationEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see org.unicam.tryGrammar.tryGrammar.TimeSubdenominationEnum
   * @see #setTime(TimeSubdenominationEnum)
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getTime_Time()
   * @model
   * @generated
   */
  TimeSubdenominationEnum getTime();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.Time#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see org.unicam.tryGrammar.tryGrammar.TimeSubdenominationEnum
   * @see #getTime()
   * @generated
   */
  void setTime(TimeSubdenominationEnum value);

} // Time