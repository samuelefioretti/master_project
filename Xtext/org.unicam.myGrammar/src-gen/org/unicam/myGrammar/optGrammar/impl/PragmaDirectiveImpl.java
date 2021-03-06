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
import org.unicam.myGrammar.optGrammar.PragmaDirective;
import org.unicam.myGrammar.optGrammar.versionOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pragma Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.PragmaDirectiveImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PragmaDirectiveImpl extends MinimalEObjectImpl.Container implements PragmaDirective
{
  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected versionOperator version;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PragmaDirectiveImpl()
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
    return OptGrammarPackage.Literals.PRAGMA_DIRECTIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public versionOperator getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersion(versionOperator newVersion, NotificationChain msgs)
  {
    versionOperator oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.PRAGMA_DIRECTIVE__VERSION, oldVersion, newVersion);
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
  public void setVersion(versionOperator newVersion)
  {
    if (newVersion != version)
    {
      NotificationChain msgs = null;
      if (version != null)
        msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.PRAGMA_DIRECTIVE__VERSION, null, msgs);
      if (newVersion != null)
        msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.PRAGMA_DIRECTIVE__VERSION, null, msgs);
      msgs = basicSetVersion(newVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.PRAGMA_DIRECTIVE__VERSION, newVersion, newVersion));
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
      case OptGrammarPackage.PRAGMA_DIRECTIVE__VERSION:
        return basicSetVersion(null, msgs);
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
      case OptGrammarPackage.PRAGMA_DIRECTIVE__VERSION:
        return getVersion();
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
      case OptGrammarPackage.PRAGMA_DIRECTIVE__VERSION:
        setVersion((versionOperator)newValue);
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
      case OptGrammarPackage.PRAGMA_DIRECTIVE__VERSION:
        setVersion((versionOperator)null);
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
      case OptGrammarPackage.PRAGMA_DIRECTIVE__VERSION:
        return version != null;
    }
    return super.eIsSet(featureID);
  }

} //PragmaDirectiveImpl
