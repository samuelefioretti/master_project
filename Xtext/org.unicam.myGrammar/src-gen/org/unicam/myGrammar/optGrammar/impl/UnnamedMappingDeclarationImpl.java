/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.unicam.myGrammar.optGrammar.Declaration;
import org.unicam.myGrammar.optGrammar.NamedType;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.UnnamedMappingDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unnamed Mapping Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.UnnamedMappingDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.UnnamedMappingDeclarationImpl#getSecondRef <em>Second Ref</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.UnnamedMappingDeclarationImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.UnnamedMappingDeclarationImpl#isArray <em>Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnnamedMappingDeclarationImpl extends MinimalEObjectImpl.Container implements UnnamedMappingDeclaration
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected NamedType type;

  /**
   * The cached value of the '{@link #getSecondRef() <em>Second Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondRef()
   * @generated
   * @ordered
   */
  protected Declaration secondRef;

  /**
   * The cached value of the '{@link #getSecond() <em>Second</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected EObject second;

  /**
   * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArray()
   * @generated
   * @ordered
   */
  protected static final boolean ARRAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArray()
   * @generated
   * @ordered
   */
  protected boolean array = ARRAY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnnamedMappingDeclarationImpl()
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
    return OptGrammarPackage.Literals.UNNAMED_MAPPING_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(NamedType newType, NotificationChain msgs)
  {
    NamedType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__TYPE, oldType, newType);
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
  public void setType(NamedType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration getSecondRef()
  {
    if (secondRef != null && secondRef.eIsProxy())
    {
      InternalEObject oldSecondRef = (InternalEObject)secondRef;
      secondRef = (Declaration)eResolveProxy(oldSecondRef);
      if (secondRef != oldSecondRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND_REF, oldSecondRef, secondRef));
      }
    }
    return secondRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration basicGetSecondRef()
  {
    return secondRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecondRef(Declaration newSecondRef)
  {
    Declaration oldSecondRef = secondRef;
    secondRef = newSecondRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND_REF, oldSecondRef, secondRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getSecond()
  {
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecond(EObject newSecond, NotificationChain msgs)
  {
    EObject oldSecond = second;
    second = newSecond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND, oldSecond, newSecond);
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
  public void setSecond(EObject newSecond)
  {
    if (newSecond != second)
    {
      NotificationChain msgs = null;
      if (second != null)
        msgs = ((InternalEObject)second).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND, null, msgs);
      if (newSecond != null)
        msgs = ((InternalEObject)newSecond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND, null, msgs);
      msgs = basicSetSecond(newSecond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND, newSecond, newSecond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArray(boolean newArray)
  {
    boolean oldArray = array;
    array = newArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__ARRAY, oldArray, array));
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
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND:
        return basicSetSecond(null, msgs);
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
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__TYPE:
        return getType();
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND_REF:
        if (resolve) return getSecondRef();
        return basicGetSecondRef();
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND:
        return getSecond();
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__ARRAY:
        return isArray();
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
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__TYPE:
        setType((NamedType)newValue);
        return;
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND_REF:
        setSecondRef((Declaration)newValue);
        return;
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND:
        setSecond((EObject)newValue);
        return;
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__ARRAY:
        setArray((Boolean)newValue);
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
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__TYPE:
        setType((NamedType)null);
        return;
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND_REF:
        setSecondRef((Declaration)null);
        return;
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND:
        setSecond((EObject)null);
        return;
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__ARRAY:
        setArray(ARRAY_EDEFAULT);
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
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__TYPE:
        return type != null;
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND_REF:
        return secondRef != null;
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__SECOND:
        return second != null;
      case OptGrammarPackage.UNNAMED_MAPPING_DECLARATION__ARRAY:
        return array != ARRAY_EDEFAULT;
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
    result.append(" (array: ");
    result.append(array);
    result.append(')');
    return result.toString();
  }

} //UnnamedMappingDeclarationImpl
