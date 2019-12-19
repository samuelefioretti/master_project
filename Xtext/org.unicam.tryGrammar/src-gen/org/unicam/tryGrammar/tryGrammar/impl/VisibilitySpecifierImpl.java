/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.unicam.tryGrammar.tryGrammar.Block;
import org.unicam.tryGrammar.tryGrammar.EnumDefinition;
import org.unicam.tryGrammar.tryGrammar.EnumValue;
import org.unicam.tryGrammar.tryGrammar.FunctionDefinitionOptionalElement;
import org.unicam.tryGrammar.tryGrammar.ParameterList;
import org.unicam.tryGrammar.tryGrammar.ReturnsParameterList;
import org.unicam.tryGrammar.tryGrammar.TryGrammarPackage;
import org.unicam.tryGrammar.tryGrammar.VariableDeclarationOptionalElement;
import org.unicam.tryGrammar.tryGrammar.VisibilityEnum;
import org.unicam.tryGrammar.tryGrammar.VisibilitySpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VisibilitySpecifierImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VisibilitySpecifierImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VisibilitySpecifierImpl#isPayable <em>Payable</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VisibilitySpecifierImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VisibilitySpecifierImpl#getOptionalElements <em>Optional Elements</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VisibilitySpecifierImpl#getReturnParameters <em>Return Parameters</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VisibilitySpecifierImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VisibilitySpecifierImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisibilitySpecifierImpl extends FunctionDefinitionImpl implements VisibilitySpecifier
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
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<EnumValue> members;

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
  protected Block block;

  /**
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final VisibilityEnum VISIBILITY_EDEFAULT = VisibilityEnum.PUBLIC;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected VisibilityEnum visibility = VISIBILITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisibilitySpecifierImpl()
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
    return TryGrammarPackage.eINSTANCE.getVisibilitySpecifier();
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
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VISIBILITY_SPECIFIER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EnumValue> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<EnumValue>(EnumValue.class, this, TryGrammarPackage.VISIBILITY_SPECIFIER__MEMBERS);
    }
    return members;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VISIBILITY_SPECIFIER__PAYABLE, oldPayable, payable));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VISIBILITY_SPECIFIER__PARAMETERS, oldParameters, newParameters);
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
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.VISIBILITY_SPECIFIER__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.VISIBILITY_SPECIFIER__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VISIBILITY_SPECIFIER__PARAMETERS, newParameters, newParameters));
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
      optionalElements = new EObjectContainmentEList<FunctionDefinitionOptionalElement>(FunctionDefinitionOptionalElement.class, this, TryGrammarPackage.VISIBILITY_SPECIFIER__OPTIONAL_ELEMENTS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VISIBILITY_SPECIFIER__RETURN_PARAMETERS, oldReturnParameters, newReturnParameters);
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
        msgs = ((InternalEObject)returnParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.VISIBILITY_SPECIFIER__RETURN_PARAMETERS, null, msgs);
      if (newReturnParameters != null)
        msgs = ((InternalEObject)newReturnParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.VISIBILITY_SPECIFIER__RETURN_PARAMETERS, null, msgs);
      msgs = basicSetReturnParameters(newReturnParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VISIBILITY_SPECIFIER__RETURN_PARAMETERS, newReturnParameters, newReturnParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VISIBILITY_SPECIFIER__BLOCK, oldBlock, newBlock);
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
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.VISIBILITY_SPECIFIER__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.VISIBILITY_SPECIFIER__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VISIBILITY_SPECIFIER__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VisibilityEnum getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVisibility(VisibilityEnum newVisibility)
  {
    VisibilityEnum oldVisibility = visibility;
    visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VISIBILITY_SPECIFIER__VISIBILITY, oldVisibility, visibility));
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
      case TryGrammarPackage.VISIBILITY_SPECIFIER__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
      case TryGrammarPackage.VISIBILITY_SPECIFIER__PARAMETERS:
        return basicSetParameters(null, msgs);
      case TryGrammarPackage.VISIBILITY_SPECIFIER__OPTIONAL_ELEMENTS:
        return ((InternalEList<?>)getOptionalElements()).basicRemove(otherEnd, msgs);
      case TryGrammarPackage.VISIBILITY_SPECIFIER__RETURN_PARAMETERS:
        return basicSetReturnParameters(null, msgs);
      case TryGrammarPackage.VISIBILITY_SPECIFIER__BLOCK:
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
      case TryGrammarPackage.VISIBILITY_SPECIFIER__NAME:
        return getName();
      case TryGrammarPackage.VISIBILITY_SPECIFIER__MEMBERS:
        return getMembers();
      case TryGrammarPackage.VISIBILITY_SPECIFIER__PAYABLE:
        return isPayable();
      case TryGrammarPackage.VISIBILITY_SPECIFIER__PARAMETERS:
        return getParameters();
      case TryGrammarPackage.VISIBILITY_SPECIFIER__OPTIONAL_ELEMENTS:
        return getOptionalElements();
      case TryGrammarPackage.VISIBILITY_SPECIFIER__RETURN_PARAMETERS:
        return getReturnParameters();
      case TryGrammarPackage.VISIBILITY_SPECIFIER__BLOCK:
        return getBlock();
      case TryGrammarPackage.VISIBILITY_SPECIFIER__VISIBILITY:
        return getVisibility();
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
      case TryGrammarPackage.VISIBILITY_SPECIFIER__NAME:
        setName((String)newValue);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends EnumValue>)newValue);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__PAYABLE:
        setPayable((Boolean)newValue);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__PARAMETERS:
        setParameters((ParameterList)newValue);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__OPTIONAL_ELEMENTS:
        getOptionalElements().clear();
        getOptionalElements().addAll((Collection<? extends FunctionDefinitionOptionalElement>)newValue);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__RETURN_PARAMETERS:
        setReturnParameters((ReturnsParameterList)newValue);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__BLOCK:
        setBlock((Block)newValue);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__VISIBILITY:
        setVisibility((VisibilityEnum)newValue);
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
      case TryGrammarPackage.VISIBILITY_SPECIFIER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__MEMBERS:
        getMembers().clear();
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__PAYABLE:
        setPayable(PAYABLE_EDEFAULT);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__PARAMETERS:
        setParameters((ParameterList)null);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__OPTIONAL_ELEMENTS:
        getOptionalElements().clear();
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__RETURN_PARAMETERS:
        setReturnParameters((ReturnsParameterList)null);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__BLOCK:
        setBlock((Block)null);
        return;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
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
      case TryGrammarPackage.VISIBILITY_SPECIFIER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TryGrammarPackage.VISIBILITY_SPECIFIER__MEMBERS:
        return members != null && !members.isEmpty();
      case TryGrammarPackage.VISIBILITY_SPECIFIER__PAYABLE:
        return payable != PAYABLE_EDEFAULT;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__PARAMETERS:
        return parameters != null;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__OPTIONAL_ELEMENTS:
        return optionalElements != null && !optionalElements.isEmpty();
      case TryGrammarPackage.VISIBILITY_SPECIFIER__RETURN_PARAMETERS:
        return returnParameters != null;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__BLOCK:
        return block != null;
      case TryGrammarPackage.VISIBILITY_SPECIFIER__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == FunctionDefinitionOptionalElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == EnumDefinition.class)
    {
      switch (derivedFeatureID)
      {
        case TryGrammarPackage.VISIBILITY_SPECIFIER__NAME: return TryGrammarPackage.ENUM_DEFINITION__NAME;
        case TryGrammarPackage.VISIBILITY_SPECIFIER__MEMBERS: return TryGrammarPackage.ENUM_DEFINITION__MEMBERS;
        default: return -1;
      }
    }
    if (baseClass == VariableDeclarationOptionalElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == FunctionDefinitionOptionalElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == EnumDefinition.class)
    {
      switch (baseFeatureID)
      {
        case TryGrammarPackage.ENUM_DEFINITION__NAME: return TryGrammarPackage.VISIBILITY_SPECIFIER__NAME;
        case TryGrammarPackage.ENUM_DEFINITION__MEMBERS: return TryGrammarPackage.VISIBILITY_SPECIFIER__MEMBERS;
        default: return -1;
      }
    }
    if (baseClass == VariableDeclarationOptionalElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", payable: ");
    result.append(payable);
    result.append(", visibility: ");
    result.append(visibility);
    result.append(')');
    return result.toString();
  }

} //VisibilitySpecifierImpl