/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.myGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.UnitTypes#getTime <em>Time</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.UnitTypes#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getUnitTypes()
 * @model
 * @generated
 */
public interface UnitTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryGrammar.myGrammar.TimeSubdenominationEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.TimeSubdenominationEnum
   * @see #setTime(TimeSubdenominationEnum)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getUnitTypes_Time()
   * @model
   * @generated
   */
  TimeSubdenominationEnum getTime();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.UnitTypes#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.TimeSubdenominationEnum
   * @see #getTime()
   * @generated
   */
  void setTime(TimeSubdenominationEnum value);

  /**
   * Returns the value of the '<em><b>Units</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryGrammar.myGrammar.EtherSubDenominationEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Units</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.EtherSubDenominationEnum
   * @see #setUnits(EtherSubDenominationEnum)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getUnitTypes_Units()
   * @model
   * @generated
   */
  EtherSubDenominationEnum getUnits();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.UnitTypes#getUnits <em>Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Units</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.EtherSubDenominationEnum
   * @see #getUnits()
   * @generated
   */
  void setUnits(EtherSubDenominationEnum value);

} // UnitTypes
