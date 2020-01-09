/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar.impl;

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

import org.unicam.myGrammar.optGrammar.Body;
import org.unicam.myGrammar.optGrammar.FunctionDefinition;
import org.unicam.myGrammar.optGrammar.FunctionDefinitionOptionalElement;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.ParameterList;
import org.unicam.myGrammar.optGrammar.ReturnsParameterList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.FunctionDefinitionImpl#isPayable <em>Payable</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.FunctionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.FunctionDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.FunctionDefinitionImpl#getOptionalElements <em>Optional Elements</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.FunctionDefinitionImpl#getReturnParameters <em>Return Parameters</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.FunctionDefinitionImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends MinimalEObjectImpl.Container implements FunctionDefinition
{
  /**
   * The default value of the '{@link #isPayable() <em>Payable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPayable()
   * @generated
   * @ordered
   */
  protected static final boolean PAYABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPayable() <em>Payable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPayable()
   * @generated
   * @ordered
   */
  protected boolean payable = PAYABLE_EDEFAULT;

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
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Body block;

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
    return OptGrammarPackage.eINSTANCE.getFunctionDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isPayable()
  {
    return payable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPayable(boolean newPayable)
  {
    boolean oldPayable = payable;
    payable = newPayable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__PAYABLE, oldPayable, payable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__PARAMETERS, oldParameters, newParameters);
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
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.FUNCTION_DEFINITION__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.FUNCTION_DEFINITION__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__PARAMETERS, newParameters, newParameters));
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
      optionalElements = new EObjectContainmentEList<FunctionDefinitionOptionalElement>(FunctionDefinitionOptionalElement.class, this, OptGrammarPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS, oldReturnParameters, newReturnParameters);
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
        msgs = ((InternalEObject)returnParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS, null, msgs);
      if (newReturnParameters != null)
        msgs = ((InternalEObject)newReturnParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS, null, msgs);
      msgs = basicSetReturnParameters(newReturnParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS, newReturnParameters, newReturnParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Body getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Body newBlock, NotificationChain msgs)
  {
    Body oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__BLOCK, oldBlock, newBlock);
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
  public void setBlock(Body newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.FUNCTION_DEFINITION__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.FUNCTION_DEFINITION__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__BLOCK, newBlock, newBlock));
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
      case OptGrammarPackage.FUNCTION_DEFINITION__PARAMETERS:
        return basicSetParameters(null, msgs);
      case OptGrammarPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        return ((InternalEList<?>)getOptionalElements()).basicRemove(otherEnd, msgs);
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS:
        return basicSetReturnParameters(null, msgs);
      case OptGrammarPackage.FUNCTION_DEFINITION__BLOCK:
        return basicSetBlock(null, msgs);
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
      case OptGrammarPackage.FUNCTION_DEFINITION__PAYABLE:
        return isPayable();
      case OptGrammarPackage.FUNCTION_DEFINITION__NAME:
        return getName();
      case OptGrammarPackage.FUNCTION_DEFINITION__PARAMETERS:
        return getParameters();
      case OptGrammarPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        return getOptionalElements();
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS:
        return getReturnParameters();
      case OptGrammarPackage.FUNCTION_DEFINITION__BLOCK:
        return getBlock();
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
      case OptGrammarPackage.FUNCTION_DEFINITION__PAYABLE:
        setPayable((Boolean)newValue);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__PARAMETERS:
        setParameters((ParameterList)newValue);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        getOptionalElements().clear();
        getOptionalElements().addAll((Collection<? extends FunctionDefinitionOptionalElement>)newValue);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS:
        setReturnParameters((ReturnsParameterList)newValue);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__BLOCK:
        setBlock((Body)newValue);
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
      case OptGrammarPackage.FUNCTION_DEFINITION__PAYABLE:
        setPayable(PAYABLE_EDEFAULT);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__PARAMETERS:
        setParameters((ParameterList)null);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        getOptionalElements().clear();
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS:
        setReturnParameters((ReturnsParameterList)null);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__BLOCK:
        setBlock((Body)null);
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
      case OptGrammarPackage.FUNCTION_DEFINITION__PAYABLE:
        return payable != PAYABLE_EDEFAULT;
      case OptGrammarPackage.FUNCTION_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OptGrammarPackage.FUNCTION_DEFINITION__PARAMETERS:
        return parameters != null;
      case OptGrammarPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        return optionalElements != null && !optionalElements.isEmpty();
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_PARAMETERS:
        return returnParameters != null;
      case OptGrammarPackage.FUNCTION_DEFINITION__BLOCK:
        return block != null;
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
    result.append(" (payable: ");
    result.append(payable);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunctionDefinitionImpl
