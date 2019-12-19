/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.unicam.tryGrammar.tryGrammar.Ether;
import org.unicam.tryGrammar.tryGrammar.EtherSubDenominationEnum;
import org.unicam.tryGrammar.tryGrammar.TryGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ether</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.EtherImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.EtherImpl#getEther <em>Ether</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtherImpl extends NumberImpl implements Ether
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final BigInteger VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected BigInteger value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getEther() <em>Ether</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEther()
   * @generated
   * @ordered
   */
  protected static final EtherSubDenominationEnum ETHER_EDEFAULT = EtherSubDenominationEnum.WEI;

  /**
   * The cached value of the '{@link #getEther() <em>Ether</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEther()
   * @generated
   * @ordered
   */
  protected EtherSubDenominationEnum ether = ETHER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EtherImpl()
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
    return TryGrammarPackage.eINSTANCE.getEther();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigInteger getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(BigInteger newValue)
  {
    BigInteger oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.ETHER__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EtherSubDenominationEnum getEther()
  {
    return ether;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEther(EtherSubDenominationEnum newEther)
  {
    EtherSubDenominationEnum oldEther = ether;
    ether = newEther == null ? ETHER_EDEFAULT : newEther;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.ETHER__ETHER, oldEther, ether));
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
      case TryGrammarPackage.ETHER__VALUE:
        return getValue();
      case TryGrammarPackage.ETHER__ETHER:
        return getEther();
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
      case TryGrammarPackage.ETHER__VALUE:
        setValue((BigInteger)newValue);
        return;
      case TryGrammarPackage.ETHER__ETHER:
        setEther((EtherSubDenominationEnum)newValue);
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
      case TryGrammarPackage.ETHER__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case TryGrammarPackage.ETHER__ETHER:
        setEther(ETHER_EDEFAULT);
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
      case TryGrammarPackage.ETHER__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case TryGrammarPackage.ETHER__ETHER:
        return ether != ETHER_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(", ether: ");
    result.append(ether);
    result.append(')');
    return result.toString();
  }

} //EtherImpl