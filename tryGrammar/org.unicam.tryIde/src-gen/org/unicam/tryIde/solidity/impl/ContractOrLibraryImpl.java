/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryIde.solidity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.unicam.tryIde.solidity.ContractOrLibrary;
import org.unicam.tryIde.solidity.DefinitionBody;
import org.unicam.tryIde.solidity.InheritanceSpecifier;
import org.unicam.tryIde.solidity.SolidityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Or Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryIde.solidity.impl.ContractOrLibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.tryIde.solidity.impl.ContractOrLibraryImpl#getInheritanceSpecifiers <em>Inheritance Specifiers</em>}</li>
 *   <li>{@link org.unicam.tryIde.solidity.impl.ContractOrLibraryImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractOrLibraryImpl extends MinimalEObjectImpl.Container implements ContractOrLibrary
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
   * The cached value of the '{@link #getInheritanceSpecifiers() <em>Inheritance Specifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInheritanceSpecifiers()
   * @generated
   * @ordered
   */
  protected EList<InheritanceSpecifier> inheritanceSpecifiers;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected DefinitionBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContractOrLibraryImpl()
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
    return SolidityPackage.eINSTANCE.getContractOrLibrary();
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
      eNotify(new ENotificationImpl(this, Notification.SET, SolidityPackage.CONTRACT_OR_LIBRARY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InheritanceSpecifier> getInheritanceSpecifiers()
  {
    if (inheritanceSpecifiers == null)
    {
      inheritanceSpecifiers = new EObjectContainmentEList<InheritanceSpecifier>(InheritanceSpecifier.class, this, SolidityPackage.CONTRACT_OR_LIBRARY__INHERITANCE_SPECIFIERS);
    }
    return inheritanceSpecifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefinitionBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(DefinitionBody newBody, NotificationChain msgs)
  {
    DefinitionBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolidityPackage.CONTRACT_OR_LIBRARY__BODY, oldBody, newBody);
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
  public void setBody(DefinitionBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolidityPackage.CONTRACT_OR_LIBRARY__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolidityPackage.CONTRACT_OR_LIBRARY__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolidityPackage.CONTRACT_OR_LIBRARY__BODY, newBody, newBody));
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
      case SolidityPackage.CONTRACT_OR_LIBRARY__INHERITANCE_SPECIFIERS:
        return ((InternalEList<?>)getInheritanceSpecifiers()).basicRemove(otherEnd, msgs);
      case SolidityPackage.CONTRACT_OR_LIBRARY__BODY:
        return basicSetBody(null, msgs);
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
      case SolidityPackage.CONTRACT_OR_LIBRARY__NAME:
        return getName();
      case SolidityPackage.CONTRACT_OR_LIBRARY__INHERITANCE_SPECIFIERS:
        return getInheritanceSpecifiers();
      case SolidityPackage.CONTRACT_OR_LIBRARY__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SolidityPackage.CONTRACT_OR_LIBRARY__NAME:
        setName((String)newValue);
        return;
      case SolidityPackage.CONTRACT_OR_LIBRARY__INHERITANCE_SPECIFIERS:
        getInheritanceSpecifiers().clear();
        getInheritanceSpecifiers().addAll((Collection<? extends InheritanceSpecifier>)newValue);
        return;
      case SolidityPackage.CONTRACT_OR_LIBRARY__BODY:
        setBody((DefinitionBody)newValue);
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
      case SolidityPackage.CONTRACT_OR_LIBRARY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SolidityPackage.CONTRACT_OR_LIBRARY__INHERITANCE_SPECIFIERS:
        getInheritanceSpecifiers().clear();
        return;
      case SolidityPackage.CONTRACT_OR_LIBRARY__BODY:
        setBody((DefinitionBody)null);
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
      case SolidityPackage.CONTRACT_OR_LIBRARY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SolidityPackage.CONTRACT_OR_LIBRARY__INHERITANCE_SPECIFIERS:
        return inheritanceSpecifiers != null && !inheritanceSpecifiers.isEmpty();
      case SolidityPackage.CONTRACT_OR_LIBRARY__BODY:
        return body != null;
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
    result.append(')');
    return result.toString();
  }

} //ContractOrLibraryImpl
