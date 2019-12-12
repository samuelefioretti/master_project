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

import org.unicam.tryIde.solidity.Blocks;
import org.unicam.tryIde.solidity.FunctionDefinition;
import org.unicam.tryIde.solidity.FunctionDefinitionOptionalElement;
import org.unicam.tryIde.solidity.ParameterList;
import org.unicam.tryIde.solidity.ReturnsParameterList;
import org.unicam.tryIde.solidity.SolidityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryIde.solidity.impl.FunctionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.tryIde.solidity.impl.FunctionDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.unicam.tryIde.solidity.impl.FunctionDefinitionImpl#getOptionalElements <em>Optional Elements</em>}</li>
 *   <li>{@link org.unicam.tryIde.solidity.impl.FunctionDefinitionImpl#getReturnParameters <em>Return Parameters</em>}</li>
 *   <li>{@link org.unicam.tryIde.solidity.impl.FunctionDefinitionImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends MinimalEObjectImpl.Container implements FunctionDefinition
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
   * The cached value of the '{@link #getOptionalElements() <em>Optional Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionalElements()
   * @generated
   * @ordered
   */
  protected EList<FunctionDefinitionOptionalElement> optionalElements;

  /**
   * The cached value of the '{@link #getReturnParameters() <em>Return Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnParameters()
   * @generated
   * @ordered
   */
  protected ReturnsParameterList returnParameters;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected Blocks blocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDefinitionImpl()
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
    return SolidityPackage.eINSTANCE.getFunctionDefinition();
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
      eNotify(new ENotificationImpl(this, Notification.SET, SolidityPackage.FUNCTION_DEFINITION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolidityPackage.FUNCTION_DEFINITION__PARAMETERS, oldParameters, newParameters);
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
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolidityPackage.FUNCTION_DEFINITION__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolidityPackage.FUNCTION_DEFINITION__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolidityPackage.FUNCTION_DEFINITION__PARAMETERS, newParameters, newParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FunctionDefinitionOptionalElement> getOptionalElements()
  {
    if (optionalElements == null)
    {
      optionalElements = new EObjectContainmentEList<FunctionDefinitionOptionalElement>(FunctionDefinitionOptionalElement.class, this, SolidityPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS);
    }
    return optionalElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReturnsParameterList getReturnParameters()
  {
    return returnParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnParameters(ReturnsParameterList newReturnParameters, NotificationChain msgs)
  {
    ReturnsParameterList oldReturnParameters = returnParameters;
    returnParameters = newReturnParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolidityPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS, oldReturnParameters, newReturnParameters);
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
  public void setReturnParameters(ReturnsParameterList newReturnParameters)
  {
    if (newReturnParameters != returnParameters)
    {
      NotificationChain msgs = null;
      if (returnParameters != null)
        msgs = ((InternalEObject)returnParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolidityPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS, null, msgs);
      if (newReturnParameters != null)
        msgs = ((InternalEObject)newReturnParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolidityPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS, null, msgs);
      msgs = basicSetReturnParameters(newReturnParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolidityPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS, newReturnParameters, newReturnParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Blocks getBlocks()
  {
    return blocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocks(Blocks newBlocks, NotificationChain msgs)
  {
    Blocks oldBlocks = blocks;
    blocks = newBlocks;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolidityPackage.FUNCTION_DEFINITION__BLOCKS, oldBlocks, newBlocks);
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
  public void setBlocks(Blocks newBlocks)
  {
    if (newBlocks != blocks)
    {
      NotificationChain msgs = null;
      if (blocks != null)
        msgs = ((InternalEObject)blocks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolidityPackage.FUNCTION_DEFINITION__BLOCKS, null, msgs);
      if (newBlocks != null)
        msgs = ((InternalEObject)newBlocks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolidityPackage.FUNCTION_DEFINITION__BLOCKS, null, msgs);
      msgs = basicSetBlocks(newBlocks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolidityPackage.FUNCTION_DEFINITION__BLOCKS, newBlocks, newBlocks));
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
      case SolidityPackage.FUNCTION_DEFINITION__PARAMETERS:
        return basicSetParameters(null, msgs);
      case SolidityPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        return ((InternalEList<?>)getOptionalElements()).basicRemove(otherEnd, msgs);
      case SolidityPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS:
        return basicSetReturnParameters(null, msgs);
      case SolidityPackage.FUNCTION_DEFINITION__BLOCKS:
        return basicSetBlocks(null, msgs);
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
      case SolidityPackage.FUNCTION_DEFINITION__NAME:
        return getName();
      case SolidityPackage.FUNCTION_DEFINITION__PARAMETERS:
        return getParameters();
      case SolidityPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        return getOptionalElements();
      case SolidityPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS:
        return getReturnParameters();
      case SolidityPackage.FUNCTION_DEFINITION__BLOCKS:
        return getBlocks();
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
      case SolidityPackage.FUNCTION_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case SolidityPackage.FUNCTION_DEFINITION__PARAMETERS:
        setParameters((ParameterList)newValue);
        return;
      case SolidityPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        getOptionalElements().clear();
        getOptionalElements().addAll((Collection<? extends FunctionDefinitionOptionalElement>)newValue);
        return;
      case SolidityPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS:
        setReturnParameters((ReturnsParameterList)newValue);
        return;
      case SolidityPackage.FUNCTION_DEFINITION__BLOCKS:
        setBlocks((Blocks)newValue);
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
      case SolidityPackage.FUNCTION_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SolidityPackage.FUNCTION_DEFINITION__PARAMETERS:
        setParameters((ParameterList)null);
        return;
      case SolidityPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        getOptionalElements().clear();
        return;
      case SolidityPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS:
        setReturnParameters((ReturnsParameterList)null);
        return;
      case SolidityPackage.FUNCTION_DEFINITION__BLOCKS:
        setBlocks((Blocks)null);
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
      case SolidityPackage.FUNCTION_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SolidityPackage.FUNCTION_DEFINITION__PARAMETERS:
        return parameters != null;
      case SolidityPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        return optionalElements != null && !optionalElements.isEmpty();
      case SolidityPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS:
        return returnParameters != null;
      case SolidityPackage.FUNCTION_DEFINITION__BLOCKS:
        return blocks != null;
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

} //FunctionDefinitionImpl
