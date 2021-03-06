/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.TimeUnitsLiteral;
import org.unicam.myGrammar.optGrammar.UnitTypes;
import org.unicam.myGrammar.optGrammar.UnitsLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.UnitTypesImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.UnitTypesImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitTypesImpl extends MinimalEObjectImpl.Container implements UnitTypes
{
  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected TimeUnitsLiteral time;

  /**
   * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnits()
   * @generated
   * @ordered
   */
  protected UnitsLiteral units;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnitTypesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OptGrammarPackage.Literals.UNIT_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUnitsLiteral getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTime(TimeUnitsLiteral newTime, NotificationChain msgs)
  {
    TimeUnitsLiteral oldTime = time;
    time = newTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.UNIT_TYPES__TIME, oldTime, newTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTime(TimeUnitsLiteral newTime)
  {
    if (newTime != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.UNIT_TYPES__TIME, null, msgs);
      if (newTime != null)
        msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.UNIT_TYPES__TIME, null, msgs);
      msgs = basicSetTime(newTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.UNIT_TYPES__TIME, newTime, newTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnitsLiteral getUnits()
  {
    return units;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnits(UnitsLiteral newUnits, NotificationChain msgs)
  {
    UnitsLiteral oldUnits = units;
    units = newUnits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.UNIT_TYPES__UNITS, oldUnits, newUnits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnits(UnitsLiteral newUnits)
  {
    if (newUnits != units)
    {
      NotificationChain msgs = null;
      if (units != null)
        msgs = ((InternalEObject)units).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.UNIT_TYPES__UNITS, null, msgs);
      if (newUnits != null)
        msgs = ((InternalEObject)newUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.UNIT_TYPES__UNITS, null, msgs);
      msgs = basicSetUnits(newUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.UNIT_TYPES__UNITS, newUnits, newUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OptGrammarPackage.UNIT_TYPES__TIME:
        return basicSetTime(null, msgs);
      case OptGrammarPackage.UNIT_TYPES__UNITS:
        return basicSetUnits(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OptGrammarPackage.UNIT_TYPES__TIME:
        return getTime();
      case OptGrammarPackage.UNIT_TYPES__UNITS:
        return getUnits();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OptGrammarPackage.UNIT_TYPES__TIME:
        setTime((TimeUnitsLiteral)newValue);
        return;
      case OptGrammarPackage.UNIT_TYPES__UNITS:
        setUnits((UnitsLiteral)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OptGrammarPackage.UNIT_TYPES__TIME:
        setTime((TimeUnitsLiteral)null);
        return;
      case OptGrammarPackage.UNIT_TYPES__UNITS:
        setUnits((UnitsLiteral)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OptGrammarPackage.UNIT_TYPES__TIME:
        return time != null;
      case OptGrammarPackage.UNIT_TYPES__UNITS:
        return units != null;
    }
    return super.eIsSet(featureID);
  }

} //UnitTypesImpl
