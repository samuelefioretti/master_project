/**
 * generated by Xtext 2.20.0
 */
package org.unicam.myGrammar.optGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.unicam.myGrammar.optGrammar.Contract;
import org.unicam.myGrammar.optGrammar.FunctionCallListArguments;
import org.unicam.myGrammar.optGrammar.InheritanceSpecifier;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inheritance Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.InheritanceSpecifierImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.InheritanceSpecifierImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InheritanceSpecifierImpl extends MinimalEObjectImpl.Container implements InheritanceSpecifier
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Contract superType;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected FunctionCallListArguments args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InheritanceSpecifierImpl()
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
    return OptGrammarPackage.Literals.INHERITANCE_SPECIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Contract getSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperType(Contract newSuperType, NotificationChain msgs)
  {
    Contract oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INHERITANCE_SPECIFIER__SUPER_TYPE, oldSuperType, newSuperType);
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
  public void setSuperType(Contract newSuperType)
  {
    if (newSuperType != superType)
    {
      NotificationChain msgs = null;
      if (superType != null)
        msgs = ((InternalEObject)superType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INHERITANCE_SPECIFIER__SUPER_TYPE, null, msgs);
      if (newSuperType != null)
        msgs = ((InternalEObject)newSuperType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INHERITANCE_SPECIFIER__SUPER_TYPE, null, msgs);
      msgs = basicSetSuperType(newSuperType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INHERITANCE_SPECIFIER__SUPER_TYPE, newSuperType, newSuperType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionCallListArguments getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(FunctionCallListArguments newArgs, NotificationChain msgs)
  {
    FunctionCallListArguments oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INHERITANCE_SPECIFIER__ARGS, oldArgs, newArgs);
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
  public void setArgs(FunctionCallListArguments newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INHERITANCE_SPECIFIER__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INHERITANCE_SPECIFIER__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INHERITANCE_SPECIFIER__ARGS, newArgs, newArgs));
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
      case OptGrammarPackage.INHERITANCE_SPECIFIER__SUPER_TYPE:
        return basicSetSuperType(null, msgs);
      case OptGrammarPackage.INHERITANCE_SPECIFIER__ARGS:
        return basicSetArgs(null, msgs);
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
      case OptGrammarPackage.INHERITANCE_SPECIFIER__SUPER_TYPE:
        return getSuperType();
      case OptGrammarPackage.INHERITANCE_SPECIFIER__ARGS:
        return getArgs();
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
      case OptGrammarPackage.INHERITANCE_SPECIFIER__SUPER_TYPE:
        setSuperType((Contract)newValue);
        return;
      case OptGrammarPackage.INHERITANCE_SPECIFIER__ARGS:
        setArgs((FunctionCallListArguments)newValue);
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
      case OptGrammarPackage.INHERITANCE_SPECIFIER__SUPER_TYPE:
        setSuperType((Contract)null);
        return;
      case OptGrammarPackage.INHERITANCE_SPECIFIER__ARGS:
        setArgs((FunctionCallListArguments)null);
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
      case OptGrammarPackage.INHERITANCE_SPECIFIER__SUPER_TYPE:
        return superType != null;
      case OptGrammarPackage.INHERITANCE_SPECIFIER__ARGS:
        return args != null;
    }
    return super.eIsSet(featureID);
  }

} //InheritanceSpecifierImpl
