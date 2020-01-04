/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.myGrammar.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.unicam.tryGrammar.myGrammar.ElementaryTypeNameEnum;
import org.unicam.tryGrammar.myGrammar.MyGrammarPackage;
import org.unicam.tryGrammar.myGrammar.PrimaryTypeDeclaration;
import org.unicam.tryGrammar.myGrammar.VisibilityEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.impl.PrimaryTypeDeclarationImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.impl.PrimaryTypeDeclarationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.impl.PrimaryTypeDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.impl.PrimaryTypeDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryTypeDeclarationImpl extends MinimalEObjectImpl.Container implements PrimaryTypeDeclaration
{
  /**
   * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConstant()
   * @generated
   * @ordered
   */
  protected static final boolean CONSTANT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConstant()
   * @generated
   * @ordered
   */
  protected boolean constant = CONSTANT_EDEFAULT;

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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ElementaryTypeNameEnum TYPE_EDEFAULT = ElementaryTypeNameEnum.INT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ElementaryTypeNameEnum type = TYPE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryTypeDeclarationImpl()
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
    return MyGrammarPackage.eINSTANCE.getPrimaryTypeDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstant(boolean newConstant)
  {
    boolean oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGrammarPackage.PRIMARY_TYPE_DECLARATION__CONSTANT, oldConstant, constant));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyGrammarPackage.PRIMARY_TYPE_DECLARATION__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ElementaryTypeNameEnum getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(ElementaryTypeNameEnum newType)
  {
    ElementaryTypeNameEnum oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGrammarPackage.PRIMARY_TYPE_DECLARATION__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyGrammarPackage.PRIMARY_TYPE_DECLARATION__NAME, oldName, name));
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
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__CONSTANT:
        return isConstant();
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__VISIBILITY:
        return getVisibility();
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__TYPE:
        return getType();
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__NAME:
        return getName();
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
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__CONSTANT:
        setConstant((Boolean)newValue);
        return;
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__VISIBILITY:
        setVisibility((VisibilityEnum)newValue);
        return;
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__TYPE:
        setType((ElementaryTypeNameEnum)newValue);
        return;
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__NAME:
        setName((String)newValue);
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
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__CONSTANT:
        setConstant(CONSTANT_EDEFAULT);
        return;
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
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
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__CONSTANT:
        return constant != CONSTANT_EDEFAULT;
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__TYPE:
        return type != TYPE_EDEFAULT;
      case MyGrammarPackage.PRIMARY_TYPE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (constant: ");
    result.append(constant);
    result.append(", visibility: ");
    result.append(visibility);
    result.append(", type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PrimaryTypeDeclarationImpl
