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

import org.unicam.myGrammar.optGrammar.FunctionDefinition;
import org.unicam.myGrammar.optGrammar.FunctionDefinitionOptionalElement;
import org.unicam.myGrammar.optGrammar.FunctionParameterDeclaration;
import org.unicam.myGrammar.optGrammar.InternalBlock;
import org.unicam.myGrammar.optGrammar.NamedType;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.ReturnStatement;

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
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.FunctionDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.FunctionDefinitionImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.FunctionDefinitionImpl#getReturnVal <em>Return Val</em>}</li>
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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<FunctionParameterDeclaration> parameters;

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
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected NamedType returnType;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<InternalBlock> blocks;

  /**
   * The cached value of the '{@link #getReturnVal() <em>Return Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnVal()
   * @generated
   * @ordered
   */
  protected ReturnStatement returnVal;

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
    return OptGrammarPackage.Literals.FUNCTION_DEFINITION;
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
  public EList<FunctionParameterDeclaration> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<FunctionParameterDeclaration>(FunctionParameterDeclaration.class, this, OptGrammarPackage.FUNCTION_DEFINITION__PARAMETERS);
    }
    return parameters;
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
  public NamedType getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(NamedType newReturnType, NotificationChain msgs)
  {
    NamedType oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__RETURN_TYPE, oldReturnType, newReturnType);
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
  public void setReturnType(NamedType newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.FUNCTION_DEFINITION__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.FUNCTION_DEFINITION__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InternalBlock> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EObjectContainmentEList<InternalBlock>(InternalBlock.class, this, OptGrammarPackage.FUNCTION_DEFINITION__BLOCKS);
    }
    return blocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReturnStatement getReturnVal()
  {
    return returnVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnVal(ReturnStatement newReturnVal, NotificationChain msgs)
  {
    ReturnStatement oldReturnVal = returnVal;
    returnVal = newReturnVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__RETURN_VAL, oldReturnVal, newReturnVal);
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
  public void setReturnVal(ReturnStatement newReturnVal)
  {
    if (newReturnVal != returnVal)
    {
      NotificationChain msgs = null;
      if (returnVal != null)
        msgs = ((InternalEObject)returnVal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.FUNCTION_DEFINITION__RETURN_VAL, null, msgs);
      if (newReturnVal != null)
        msgs = ((InternalEObject)newReturnVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.FUNCTION_DEFINITION__RETURN_VAL, null, msgs);
      msgs = basicSetReturnVal(newReturnVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.FUNCTION_DEFINITION__RETURN_VAL, newReturnVal, newReturnVal));
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
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case OptGrammarPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        return ((InternalEList<?>)getOptionalElements()).basicRemove(otherEnd, msgs);
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case OptGrammarPackage.FUNCTION_DEFINITION__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_VAL:
        return basicSetReturnVal(null, msgs);
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
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_TYPE:
        return getReturnType();
      case OptGrammarPackage.FUNCTION_DEFINITION__BLOCKS:
        return getBlocks();
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_VAL:
        return getReturnVal();
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
        getParameters().clear();
        getParameters().addAll((Collection<? extends FunctionParameterDeclaration>)newValue);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        getOptionalElements().clear();
        getOptionalElements().addAll((Collection<? extends FunctionDefinitionOptionalElement>)newValue);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_TYPE:
        setReturnType((NamedType)newValue);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends InternalBlock>)newValue);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_VAL:
        setReturnVal((ReturnStatement)newValue);
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
        getParameters().clear();
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        getOptionalElements().clear();
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_TYPE:
        setReturnType((NamedType)null);
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__BLOCKS:
        getBlocks().clear();
        return;
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_VAL:
        setReturnVal((ReturnStatement)null);
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
        return parameters != null && !parameters.isEmpty();
      case OptGrammarPackage.FUNCTION_DEFINITION__OPTIONAL_ELEMENTS:
        return optionalElements != null && !optionalElements.isEmpty();
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_TYPE:
        return returnType != null;
      case OptGrammarPackage.FUNCTION_DEFINITION__BLOCKS:
        return blocks != null && !blocks.isEmpty();
      case OptGrammarPackage.FUNCTION_DEFINITION__RETURN_VAL:
        return returnVal != null;
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
