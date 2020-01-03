/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.myGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.unicam.tryGrammar.myGrammar.ArithmeticOperations;
import org.unicam.tryGrammar.myGrammar.ArrayableDeclaration;
import org.unicam.tryGrammar.myGrammar.FunctionCallListArguments;
import org.unicam.tryGrammar.myGrammar.IntParameter;
import org.unicam.tryGrammar.myGrammar.MyGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.impl.IntParameterImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.impl.IntParameterImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.impl.IntParameterImpl#getFun <em>Fun</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntParameterImpl extends MinimalEObjectImpl.Container implements IntParameter
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ArrayableDeclaration ref;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected ArithmeticOperations param;

  /**
   * The cached value of the '{@link #getFun() <em>Fun</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFun()
   * @generated
   * @ordered
   */
  protected FunctionCallListArguments fun;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntParameterImpl()
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
    return MyGrammarPackage.eINSTANCE.getIntParameter();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayableDeclaration getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (ArrayableDeclaration)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyGrammarPackage.INT_PARAMETER__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayableDeclaration basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRef(ArrayableDeclaration newRef)
  {
    ArrayableDeclaration oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGrammarPackage.INT_PARAMETER__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticOperations getParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParam(ArithmeticOperations newParam, NotificationChain msgs)
  {
    ArithmeticOperations oldParam = param;
    param = newParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyGrammarPackage.INT_PARAMETER__PARAM, oldParam, newParam);
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
  public void setParam(ArithmeticOperations newParam)
  {
    if (newParam != param)
    {
      NotificationChain msgs = null;
      if (param != null)
        msgs = ((InternalEObject)param).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyGrammarPackage.INT_PARAMETER__PARAM, null, msgs);
      if (newParam != null)
        msgs = ((InternalEObject)newParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyGrammarPackage.INT_PARAMETER__PARAM, null, msgs);
      msgs = basicSetParam(newParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGrammarPackage.INT_PARAMETER__PARAM, newParam, newParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionCallListArguments getFun()
  {
    return fun;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFun(FunctionCallListArguments newFun, NotificationChain msgs)
  {
    FunctionCallListArguments oldFun = fun;
    fun = newFun;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyGrammarPackage.INT_PARAMETER__FUN, oldFun, newFun);
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
  public void setFun(FunctionCallListArguments newFun)
  {
    if (newFun != fun)
    {
      NotificationChain msgs = null;
      if (fun != null)
        msgs = ((InternalEObject)fun).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyGrammarPackage.INT_PARAMETER__FUN, null, msgs);
      if (newFun != null)
        msgs = ((InternalEObject)newFun).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyGrammarPackage.INT_PARAMETER__FUN, null, msgs);
      msgs = basicSetFun(newFun, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGrammarPackage.INT_PARAMETER__FUN, newFun, newFun));
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
      case MyGrammarPackage.INT_PARAMETER__PARAM:
        return basicSetParam(null, msgs);
      case MyGrammarPackage.INT_PARAMETER__FUN:
        return basicSetFun(null, msgs);
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
      case MyGrammarPackage.INT_PARAMETER__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case MyGrammarPackage.INT_PARAMETER__PARAM:
        return getParam();
      case MyGrammarPackage.INT_PARAMETER__FUN:
        return getFun();
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
      case MyGrammarPackage.INT_PARAMETER__REF:
        setRef((ArrayableDeclaration)newValue);
        return;
      case MyGrammarPackage.INT_PARAMETER__PARAM:
        setParam((ArithmeticOperations)newValue);
        return;
      case MyGrammarPackage.INT_PARAMETER__FUN:
        setFun((FunctionCallListArguments)newValue);
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
      case MyGrammarPackage.INT_PARAMETER__REF:
        setRef((ArrayableDeclaration)null);
        return;
      case MyGrammarPackage.INT_PARAMETER__PARAM:
        setParam((ArithmeticOperations)null);
        return;
      case MyGrammarPackage.INT_PARAMETER__FUN:
        setFun((FunctionCallListArguments)null);
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
      case MyGrammarPackage.INT_PARAMETER__REF:
        return ref != null;
      case MyGrammarPackage.INT_PARAMETER__PARAM:
        return param != null;
      case MyGrammarPackage.INT_PARAMETER__FUN:
        return fun != null;
    }
    return super.eIsSet(featureID);
  }

} //IntParameterImpl
