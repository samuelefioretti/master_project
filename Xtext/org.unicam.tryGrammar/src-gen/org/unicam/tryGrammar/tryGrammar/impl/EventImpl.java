/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.unicam.tryGrammar.tryGrammar.Event;
import org.unicam.tryGrammar.tryGrammar.ParameterList;
import org.unicam.tryGrammar.tryGrammar.TryGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.EventImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.EventImpl#isIsAnonymous <em>Is Anonymous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected ParameterList parameters;

  /**
   * The default value of the '{@link #isIsAnonymous() <em>Is Anonymous</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAnonymous()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ANONYMOUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAnonymous() <em>Is Anonymous</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAnonymous()
   * @generated
   * @ordered
   */
  protected boolean isAnonymous = IS_ANONYMOUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return TryGrammarPackage.eINSTANCE.getEvent();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.EVENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterList getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(ParameterList newParameters, NotificationChain msgs)
  {
    ParameterList oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TryGrammarPackage.EVENT__PARAMETERS, oldParameters, newParameters);
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
  public void setParameters(ParameterList newParameters)
  {
    if (newParameters != parameters)
    {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.EVENT__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.EVENT__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.EVENT__PARAMETERS, newParameters, newParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsAnonymous()
  {
    return isAnonymous;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsAnonymous(boolean newIsAnonymous)
  {
    boolean oldIsAnonymous = isAnonymous;
    isAnonymous = newIsAnonymous;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.EVENT__IS_ANONYMOUS, oldIsAnonymous, isAnonymous));
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
      case TryGrammarPackage.EVENT__PARAMETERS:
        return basicSetParameters(null, msgs);
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
      case TryGrammarPackage.EVENT__NAME:
        return getName();
      case TryGrammarPackage.EVENT__PARAMETERS:
        return getParameters();
      case TryGrammarPackage.EVENT__IS_ANONYMOUS:
        return isIsAnonymous();
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
      case TryGrammarPackage.EVENT__NAME:
        setName((String)newValue);
        return;
      case TryGrammarPackage.EVENT__PARAMETERS:
        setParameters((ParameterList)newValue);
        return;
      case TryGrammarPackage.EVENT__IS_ANONYMOUS:
        setIsAnonymous((Boolean)newValue);
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
      case TryGrammarPackage.EVENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TryGrammarPackage.EVENT__PARAMETERS:
        setParameters((ParameterList)null);
        return;
      case TryGrammarPackage.EVENT__IS_ANONYMOUS:
        setIsAnonymous(IS_ANONYMOUS_EDEFAULT);
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
      case TryGrammarPackage.EVENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TryGrammarPackage.EVENT__PARAMETERS:
        return parameters != null;
      case TryGrammarPackage.EVENT__IS_ANONYMOUS:
        return isAnonymous != IS_ANONYMOUS_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", isAnonymous: ");
    result.append(isAnonymous);
    result.append(')');
    return result.toString();
  }

} //EventImpl
