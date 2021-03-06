/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;

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
 *   <li>{@link org.unicam.myGrammar.optGrammar.UnitTypes#getTime <em>Time</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.UnitTypes#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getUnitTypes()
 * @model
 * @generated
 */
public interface UnitTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(TimeUnitsLiteral)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getUnitTypes_Time()
   * @model containment="true"
   * @generated
   */
  TimeUnitsLiteral getTime();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.UnitTypes#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(TimeUnitsLiteral value);

  /**
   * Returns the value of the '<em><b>Units</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Units</em>' containment reference.
   * @see #setUnits(UnitsLiteral)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getUnitTypes_Units()
   * @model containment="true"
   * @generated
   */
  UnitsLiteral getUnits();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.UnitTypes#getUnits <em>Units</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Units</em>' containment reference.
   * @see #getUnits()
   * @generated
   */
  void setUnits(UnitsLiteral value);

} // UnitTypes
