/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Time#getValue <em>Value</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Time#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getTime_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Time#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.myGrammar.optGrammar.TimeSubdenominationEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see org.unicam.myGrammar.optGrammar.TimeSubdenominationEnum
   * @see #setTime(TimeSubdenominationEnum)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getTime_Time()
   * @model
   * @generated
   */
  TimeSubdenominationEnum getTime();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Time#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see org.unicam.myGrammar.optGrammar.TimeSubdenominationEnum
   * @see #getTime()
   * @generated
   */
  void setTime(TimeSubdenominationEnum value);

} // Time