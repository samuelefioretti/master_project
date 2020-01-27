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

import org.unicam.myGrammar.optGrammar.FunctionCall;
import org.unicam.myGrammar.optGrammar.FunctionDeclaration;
import org.unicam.myGrammar.optGrammar.InternalBlock;
import org.unicam.myGrammar.optGrammar.LoopStructures;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.InternalBlockImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.InternalBlockImpl#getDec <em>Dec</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.InternalBlockImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.InternalBlockImpl#getCall <em>Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalBlockImpl extends MinimalEObjectImpl.Container implements InternalBlock
{
  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected EObject def;

  /**
   * The cached value of the '{@link #getDec() <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected FunctionDeclaration dec;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected LoopStructures loop;

  /**
   * The cached value of the '{@link #getCall() <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCall()
   * @generated
   * @ordered
   */
  protected FunctionCall call;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InternalBlockImpl()
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
    return OptGrammarPackage.Literals.INTERNAL_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef(EObject newDef, NotificationChain msgs)
  {
    EObject oldDef = def;
    def = newDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INTERNAL_BLOCK__DEF, oldDef, newDef);
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
  public void setDef(EObject newDef)
  {
    if (newDef != def)
    {
      NotificationChain msgs = null;
      if (def != null)
        msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INTERNAL_BLOCK__DEF, null, msgs);
      if (newDef != null)
        msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INTERNAL_BLOCK__DEF, null, msgs);
      msgs = basicSetDef(newDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INTERNAL_BLOCK__DEF, newDef, newDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionDeclaration getDec()
  {
    return dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDec(FunctionDeclaration newDec, NotificationChain msgs)
  {
    FunctionDeclaration oldDec = dec;
    dec = newDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INTERNAL_BLOCK__DEC, oldDec, newDec);
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
  public void setDec(FunctionDeclaration newDec)
  {
    if (newDec != dec)
    {
      NotificationChain msgs = null;
      if (dec != null)
        msgs = ((InternalEObject)dec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INTERNAL_BLOCK__DEC, null, msgs);
      if (newDec != null)
        msgs = ((InternalEObject)newDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INTERNAL_BLOCK__DEC, null, msgs);
      msgs = basicSetDec(newDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INTERNAL_BLOCK__DEC, newDec, newDec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LoopStructures getLoop()
  {
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoop(LoopStructures newLoop, NotificationChain msgs)
  {
    LoopStructures oldLoop = loop;
    loop = newLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INTERNAL_BLOCK__LOOP, oldLoop, newLoop);
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
  public void setLoop(LoopStructures newLoop)
  {
    if (newLoop != loop)
    {
      NotificationChain msgs = null;
      if (loop != null)
        msgs = ((InternalEObject)loop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INTERNAL_BLOCK__LOOP, null, msgs);
      if (newLoop != null)
        msgs = ((InternalEObject)newLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INTERNAL_BLOCK__LOOP, null, msgs);
      msgs = basicSetLoop(newLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INTERNAL_BLOCK__LOOP, newLoop, newLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionCall getCall()
  {
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCall(FunctionCall newCall, NotificationChain msgs)
  {
    FunctionCall oldCall = call;
    call = newCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INTERNAL_BLOCK__CALL, oldCall, newCall);
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
  public void setCall(FunctionCall newCall)
  {
    if (newCall != call)
    {
      NotificationChain msgs = null;
      if (call != null)
        msgs = ((InternalEObject)call).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INTERNAL_BLOCK__CALL, null, msgs);
      if (newCall != null)
        msgs = ((InternalEObject)newCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.INTERNAL_BLOCK__CALL, null, msgs);
      msgs = basicSetCall(newCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.INTERNAL_BLOCK__CALL, newCall, newCall));
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
      case OptGrammarPackage.INTERNAL_BLOCK__DEF:
        return basicSetDef(null, msgs);
      case OptGrammarPackage.INTERNAL_BLOCK__DEC:
        return basicSetDec(null, msgs);
      case OptGrammarPackage.INTERNAL_BLOCK__LOOP:
        return basicSetLoop(null, msgs);
      case OptGrammarPackage.INTERNAL_BLOCK__CALL:
        return basicSetCall(null, msgs);
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
      case OptGrammarPackage.INTERNAL_BLOCK__DEF:
        return getDef();
      case OptGrammarPackage.INTERNAL_BLOCK__DEC:
        return getDec();
      case OptGrammarPackage.INTERNAL_BLOCK__LOOP:
        return getLoop();
      case OptGrammarPackage.INTERNAL_BLOCK__CALL:
        return getCall();
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
      case OptGrammarPackage.INTERNAL_BLOCK__DEF:
        setDef((EObject)newValue);
        return;
      case OptGrammarPackage.INTERNAL_BLOCK__DEC:
        setDec((FunctionDeclaration)newValue);
        return;
      case OptGrammarPackage.INTERNAL_BLOCK__LOOP:
        setLoop((LoopStructures)newValue);
        return;
      case OptGrammarPackage.INTERNAL_BLOCK__CALL:
        setCall((FunctionCall)newValue);
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
      case OptGrammarPackage.INTERNAL_BLOCK__DEF:
        setDef((EObject)null);
        return;
      case OptGrammarPackage.INTERNAL_BLOCK__DEC:
        setDec((FunctionDeclaration)null);
        return;
      case OptGrammarPackage.INTERNAL_BLOCK__LOOP:
        setLoop((LoopStructures)null);
        return;
      case OptGrammarPackage.INTERNAL_BLOCK__CALL:
        setCall((FunctionCall)null);
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
      case OptGrammarPackage.INTERNAL_BLOCK__DEF:
        return def != null;
      case OptGrammarPackage.INTERNAL_BLOCK__DEC:
        return dec != null;
      case OptGrammarPackage.INTERNAL_BLOCK__LOOP:
        return loop != null;
      case OptGrammarPackage.INTERNAL_BLOCK__CALL:
        return call != null;
    }
    return super.eIsSet(featureID);
  }

} //InternalBlockImpl
