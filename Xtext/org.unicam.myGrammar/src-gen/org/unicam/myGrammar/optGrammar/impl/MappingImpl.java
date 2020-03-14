/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.unicam.myGrammar.optGrammar.Mapping;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.SizedDeclaration;
import org.unicam.myGrammar.optGrammar.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.MappingImpl#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.MappingImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends StandardTypeImpl implements Mapping
{
  /**
   * The cached value of the '{@link #getKeyType() <em>Key Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyType()
   * @generated
   * @ordered
   */
  protected SizedDeclaration keyType;

  /**
   * The cached value of the '{@link #getValueType() <em>Value Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueType()
   * @generated
   * @ordered
   */
  protected Type valueType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
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
    return OptGrammarPackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SizedDeclaration getKeyType()
  {
    return keyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyType(SizedDeclaration newKeyType, NotificationChain msgs)
  {
    SizedDeclaration oldKeyType = keyType;
    keyType = newKeyType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.MAPPING__KEY_TYPE, oldKeyType, newKeyType);
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
  public void setKeyType(SizedDeclaration newKeyType)
  {
    if (newKeyType != keyType)
    {
      NotificationChain msgs = null;
      if (keyType != null)
        msgs = ((InternalEObject)keyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.MAPPING__KEY_TYPE, null, msgs);
      if (newKeyType != null)
        msgs = ((InternalEObject)newKeyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.MAPPING__KEY_TYPE, null, msgs);
      msgs = basicSetKeyType(newKeyType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.MAPPING__KEY_TYPE, newKeyType, newKeyType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getValueType()
  {
    return valueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueType(Type newValueType, NotificationChain msgs)
  {
    Type oldValueType = valueType;
    valueType = newValueType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.MAPPING__VALUE_TYPE, oldValueType, newValueType);
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
  public void setValueType(Type newValueType)
  {
    if (newValueType != valueType)
    {
      NotificationChain msgs = null;
      if (valueType != null)
        msgs = ((InternalEObject)valueType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.MAPPING__VALUE_TYPE, null, msgs);
      if (newValueType != null)
        msgs = ((InternalEObject)newValueType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.MAPPING__VALUE_TYPE, null, msgs);
      msgs = basicSetValueType(newValueType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.MAPPING__VALUE_TYPE, newValueType, newValueType));
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
      case OptGrammarPackage.MAPPING__KEY_TYPE:
        return basicSetKeyType(null, msgs);
      case OptGrammarPackage.MAPPING__VALUE_TYPE:
        return basicSetValueType(null, msgs);
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
      case OptGrammarPackage.MAPPING__KEY_TYPE:
        return getKeyType();
      case OptGrammarPackage.MAPPING__VALUE_TYPE:
        return getValueType();
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
      case OptGrammarPackage.MAPPING__KEY_TYPE:
        setKeyType((SizedDeclaration)newValue);
        return;
      case OptGrammarPackage.MAPPING__VALUE_TYPE:
        setValueType((Type)newValue);
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
      case OptGrammarPackage.MAPPING__KEY_TYPE:
        setKeyType((SizedDeclaration)null);
        return;
      case OptGrammarPackage.MAPPING__VALUE_TYPE:
        setValueType((Type)null);
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
      case OptGrammarPackage.MAPPING__KEY_TYPE:
        return keyType != null;
      case OptGrammarPackage.MAPPING__VALUE_TYPE:
        return valueType != null;
    }
    return super.eIsSet(featureID);
  }

} //MappingImpl
