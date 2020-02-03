/**
 * generated by Xtext 2.20.0
 */
package org.unicam.myGrammar.optGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.unicam.myGrammar.optGrammar.DecimalLiteral;
import org.unicam.myGrammar.optGrammar.HexLiteral;
import org.unicam.myGrammar.optGrammar.IntLiteral;
import org.unicam.myGrammar.optGrammar.NumericLiteral;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.UnitTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.NumericLiteralImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.NumericLiteralImpl#getHexValue <em>Hex Value</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.NumericLiteralImpl#getDecimalValue <em>Decimal Value</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.NumericLiteralImpl#getEtherUnit <em>Ether Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericLiteralImpl extends LiteralImpl implements NumericLiteral
{
  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected IntLiteral intValue;

  /**
   * The cached value of the '{@link #getHexValue() <em>Hex Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHexValue()
   * @generated
   * @ordered
   */
  protected HexLiteral hexValue;

  /**
   * The cached value of the '{@link #getDecimalValue() <em>Decimal Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalValue()
   * @generated
   * @ordered
   */
  protected DecimalLiteral decimalValue;

  /**
   * The cached value of the '{@link #getEtherUnit() <em>Ether Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtherUnit()
   * @generated
   * @ordered
   */
  protected UnitTypes etherUnit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumericLiteralImpl()
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
    return OptGrammarPackage.Literals.NUMERIC_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntLiteral getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntValue(IntLiteral newIntValue, NotificationChain msgs)
  {
    IntLiteral oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.NUMERIC_LITERAL__INT_VALUE, oldIntValue, newIntValue);
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
  public void setIntValue(IntLiteral newIntValue)
  {
    if (newIntValue != intValue)
    {
      NotificationChain msgs = null;
      if (intValue != null)
        msgs = ((InternalEObject)intValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.NUMERIC_LITERAL__INT_VALUE, null, msgs);
      if (newIntValue != null)
        msgs = ((InternalEObject)newIntValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.NUMERIC_LITERAL__INT_VALUE, null, msgs);
      msgs = basicSetIntValue(newIntValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.NUMERIC_LITERAL__INT_VALUE, newIntValue, newIntValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HexLiteral getHexValue()
  {
    return hexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHexValue(HexLiteral newHexValue, NotificationChain msgs)
  {
    HexLiteral oldHexValue = hexValue;
    hexValue = newHexValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.NUMERIC_LITERAL__HEX_VALUE, oldHexValue, newHexValue);
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
  public void setHexValue(HexLiteral newHexValue)
  {
    if (newHexValue != hexValue)
    {
      NotificationChain msgs = null;
      if (hexValue != null)
        msgs = ((InternalEObject)hexValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.NUMERIC_LITERAL__HEX_VALUE, null, msgs);
      if (newHexValue != null)
        msgs = ((InternalEObject)newHexValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.NUMERIC_LITERAL__HEX_VALUE, null, msgs);
      msgs = basicSetHexValue(newHexValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.NUMERIC_LITERAL__HEX_VALUE, newHexValue, newHexValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DecimalLiteral getDecimalValue()
  {
    return decimalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecimalValue(DecimalLiteral newDecimalValue, NotificationChain msgs)
  {
    DecimalLiteral oldDecimalValue = decimalValue;
    decimalValue = newDecimalValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.NUMERIC_LITERAL__DECIMAL_VALUE, oldDecimalValue, newDecimalValue);
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
  public void setDecimalValue(DecimalLiteral newDecimalValue)
  {
    if (newDecimalValue != decimalValue)
    {
      NotificationChain msgs = null;
      if (decimalValue != null)
        msgs = ((InternalEObject)decimalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.NUMERIC_LITERAL__DECIMAL_VALUE, null, msgs);
      if (newDecimalValue != null)
        msgs = ((InternalEObject)newDecimalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.NUMERIC_LITERAL__DECIMAL_VALUE, null, msgs);
      msgs = basicSetDecimalValue(newDecimalValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.NUMERIC_LITERAL__DECIMAL_VALUE, newDecimalValue, newDecimalValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnitTypes getEtherUnit()
  {
    return etherUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEtherUnit(UnitTypes newEtherUnit, NotificationChain msgs)
  {
    UnitTypes oldEtherUnit = etherUnit;
    etherUnit = newEtherUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.NUMERIC_LITERAL__ETHER_UNIT, oldEtherUnit, newEtherUnit);
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
  public void setEtherUnit(UnitTypes newEtherUnit)
  {
    if (newEtherUnit != etherUnit)
    {
      NotificationChain msgs = null;
      if (etherUnit != null)
        msgs = ((InternalEObject)etherUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.NUMERIC_LITERAL__ETHER_UNIT, null, msgs);
      if (newEtherUnit != null)
        msgs = ((InternalEObject)newEtherUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.NUMERIC_LITERAL__ETHER_UNIT, null, msgs);
      msgs = basicSetEtherUnit(newEtherUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.NUMERIC_LITERAL__ETHER_UNIT, newEtherUnit, newEtherUnit));
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
      case OptGrammarPackage.NUMERIC_LITERAL__INT_VALUE:
        return basicSetIntValue(null, msgs);
      case OptGrammarPackage.NUMERIC_LITERAL__HEX_VALUE:
        return basicSetHexValue(null, msgs);
      case OptGrammarPackage.NUMERIC_LITERAL__DECIMAL_VALUE:
        return basicSetDecimalValue(null, msgs);
      case OptGrammarPackage.NUMERIC_LITERAL__ETHER_UNIT:
        return basicSetEtherUnit(null, msgs);
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
      case OptGrammarPackage.NUMERIC_LITERAL__INT_VALUE:
        return getIntValue();
      case OptGrammarPackage.NUMERIC_LITERAL__HEX_VALUE:
        return getHexValue();
      case OptGrammarPackage.NUMERIC_LITERAL__DECIMAL_VALUE:
        return getDecimalValue();
      case OptGrammarPackage.NUMERIC_LITERAL__ETHER_UNIT:
        return getEtherUnit();
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
      case OptGrammarPackage.NUMERIC_LITERAL__INT_VALUE:
        setIntValue((IntLiteral)newValue);
        return;
      case OptGrammarPackage.NUMERIC_LITERAL__HEX_VALUE:
        setHexValue((HexLiteral)newValue);
        return;
      case OptGrammarPackage.NUMERIC_LITERAL__DECIMAL_VALUE:
        setDecimalValue((DecimalLiteral)newValue);
        return;
      case OptGrammarPackage.NUMERIC_LITERAL__ETHER_UNIT:
        setEtherUnit((UnitTypes)newValue);
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
      case OptGrammarPackage.NUMERIC_LITERAL__INT_VALUE:
        setIntValue((IntLiteral)null);
        return;
      case OptGrammarPackage.NUMERIC_LITERAL__HEX_VALUE:
        setHexValue((HexLiteral)null);
        return;
      case OptGrammarPackage.NUMERIC_LITERAL__DECIMAL_VALUE:
        setDecimalValue((DecimalLiteral)null);
        return;
      case OptGrammarPackage.NUMERIC_LITERAL__ETHER_UNIT:
        setEtherUnit((UnitTypes)null);
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
      case OptGrammarPackage.NUMERIC_LITERAL__INT_VALUE:
        return intValue != null;
      case OptGrammarPackage.NUMERIC_LITERAL__HEX_VALUE:
        return hexValue != null;
      case OptGrammarPackage.NUMERIC_LITERAL__DECIMAL_VALUE:
        return decimalValue != null;
      case OptGrammarPackage.NUMERIC_LITERAL__ETHER_UNIT:
        return etherUnit != null;
    }
    return super.eIsSet(featureID);
  }

} //NumericLiteralImpl
