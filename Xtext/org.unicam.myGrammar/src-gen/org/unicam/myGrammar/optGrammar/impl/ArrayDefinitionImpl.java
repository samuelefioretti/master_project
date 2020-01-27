/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.unicam.myGrammar.optGrammar.ArrayDefinition;
import org.unicam.myGrammar.optGrammar.ArrayDefinitionDeclaration;
import org.unicam.myGrammar.optGrammar.ArrayIndex;
import org.unicam.myGrammar.optGrammar.FilledArray;
import org.unicam.myGrammar.optGrammar.OperationAssegnationLiteral;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.ArrayDefinitionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.ArrayDefinitionImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.ArrayDefinitionImpl#getArrayRef <em>Array Ref</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.ArrayDefinitionImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.ArrayDefinitionImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.ArrayDefinitionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.ArrayDefinitionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayDefinitionImpl extends MinimalEObjectImpl.Container implements ArrayDefinition
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ArrayDefinitionDeclaration ref;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected FilledArray blocks;

  /**
   * The cached value of the '{@link #getArrayRef() <em>Array Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayRef()
   * @generated
   * @ordered
   */
  protected ArrayDefinitionDeclaration arrayRef;

  /**
   * The cached value of the '{@link #getIndexes() <em>Indexes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexes()
   * @generated
   * @ordered
   */
  protected EList<ArrayIndex> indexes;

  /**
   * The default value of the '{@link #getField() <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected static final String FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected String field = FIELD_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected OperationAssegnationLiteral operator;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EObject value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayDefinitionImpl()
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
    return OptGrammarPackage.Literals.ARRAY_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayDefinitionDeclaration getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (ArrayDefinitionDeclaration)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OptGrammarPackage.ARRAY_DEFINITION__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayDefinitionDeclaration basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRef(ArrayDefinitionDeclaration newRef)
  {
    ArrayDefinitionDeclaration oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.ARRAY_DEFINITION__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilledArray getBlocks()
  {
    return blocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocks(FilledArray newBlocks, NotificationChain msgs)
  {
    FilledArray oldBlocks = blocks;
    blocks = newBlocks;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.ARRAY_DEFINITION__BLOCKS, oldBlocks, newBlocks);
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
  public void setBlocks(FilledArray newBlocks)
  {
    if (newBlocks != blocks)
    {
      NotificationChain msgs = null;
      if (blocks != null)
        msgs = ((InternalEObject)blocks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.ARRAY_DEFINITION__BLOCKS, null, msgs);
      if (newBlocks != null)
        msgs = ((InternalEObject)newBlocks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.ARRAY_DEFINITION__BLOCKS, null, msgs);
      msgs = basicSetBlocks(newBlocks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.ARRAY_DEFINITION__BLOCKS, newBlocks, newBlocks));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayDefinitionDeclaration getArrayRef()
  {
    if (arrayRef != null && arrayRef.eIsProxy())
    {
      InternalEObject oldArrayRef = (InternalEObject)arrayRef;
      arrayRef = (ArrayDefinitionDeclaration)eResolveProxy(oldArrayRef);
      if (arrayRef != oldArrayRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OptGrammarPackage.ARRAY_DEFINITION__ARRAY_REF, oldArrayRef, arrayRef));
      }
    }
    return arrayRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayDefinitionDeclaration basicGetArrayRef()
  {
    return arrayRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArrayRef(ArrayDefinitionDeclaration newArrayRef)
  {
    ArrayDefinitionDeclaration oldArrayRef = arrayRef;
    arrayRef = newArrayRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.ARRAY_DEFINITION__ARRAY_REF, oldArrayRef, arrayRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ArrayIndex> getIndexes()
  {
    if (indexes == null)
    {
      indexes = new EObjectContainmentEList<ArrayIndex>(ArrayIndex.class, this, OptGrammarPackage.ARRAY_DEFINITION__INDEXES);
    }
    return indexes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setField(String newField)
  {
    String oldField = field;
    field = newField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.ARRAY_DEFINITION__FIELD, oldField, field));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationAssegnationLiteral getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperator(OperationAssegnationLiteral newOperator, NotificationChain msgs)
  {
    OperationAssegnationLiteral oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.ARRAY_DEFINITION__OPERATOR, oldOperator, newOperator);
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
  public void setOperator(OperationAssegnationLiteral newOperator)
  {
    if (newOperator != operator)
    {
      NotificationChain msgs = null;
      if (operator != null)
        msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.ARRAY_DEFINITION__OPERATOR, null, msgs);
      if (newOperator != null)
        msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.ARRAY_DEFINITION__OPERATOR, null, msgs);
      msgs = basicSetOperator(newOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.ARRAY_DEFINITION__OPERATOR, newOperator, newOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs)
  {
    EObject oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.ARRAY_DEFINITION__VALUE, oldValue, newValue);
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
  public void setValue(EObject newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.ARRAY_DEFINITION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.ARRAY_DEFINITION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.ARRAY_DEFINITION__VALUE, newValue, newValue));
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
      case OptGrammarPackage.ARRAY_DEFINITION__BLOCKS:
        return basicSetBlocks(null, msgs);
      case OptGrammarPackage.ARRAY_DEFINITION__INDEXES:
        return ((InternalEList<?>)getIndexes()).basicRemove(otherEnd, msgs);
      case OptGrammarPackage.ARRAY_DEFINITION__OPERATOR:
        return basicSetOperator(null, msgs);
      case OptGrammarPackage.ARRAY_DEFINITION__VALUE:
        return basicSetValue(null, msgs);
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
      case OptGrammarPackage.ARRAY_DEFINITION__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case OptGrammarPackage.ARRAY_DEFINITION__BLOCKS:
        return getBlocks();
      case OptGrammarPackage.ARRAY_DEFINITION__ARRAY_REF:
        if (resolve) return getArrayRef();
        return basicGetArrayRef();
      case OptGrammarPackage.ARRAY_DEFINITION__INDEXES:
        return getIndexes();
      case OptGrammarPackage.ARRAY_DEFINITION__FIELD:
        return getField();
      case OptGrammarPackage.ARRAY_DEFINITION__OPERATOR:
        return getOperator();
      case OptGrammarPackage.ARRAY_DEFINITION__VALUE:
        return getValue();
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
      case OptGrammarPackage.ARRAY_DEFINITION__REF:
        setRef((ArrayDefinitionDeclaration)newValue);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__BLOCKS:
        setBlocks((FilledArray)newValue);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__ARRAY_REF:
        setArrayRef((ArrayDefinitionDeclaration)newValue);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__INDEXES:
        getIndexes().clear();
        getIndexes().addAll((Collection<? extends ArrayIndex>)newValue);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__FIELD:
        setField((String)newValue);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__OPERATOR:
        setOperator((OperationAssegnationLiteral)newValue);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__VALUE:
        setValue((EObject)newValue);
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
      case OptGrammarPackage.ARRAY_DEFINITION__REF:
        setRef((ArrayDefinitionDeclaration)null);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__BLOCKS:
        setBlocks((FilledArray)null);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__ARRAY_REF:
        setArrayRef((ArrayDefinitionDeclaration)null);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__INDEXES:
        getIndexes().clear();
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__FIELD:
        setField(FIELD_EDEFAULT);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__OPERATOR:
        setOperator((OperationAssegnationLiteral)null);
        return;
      case OptGrammarPackage.ARRAY_DEFINITION__VALUE:
        setValue((EObject)null);
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
      case OptGrammarPackage.ARRAY_DEFINITION__REF:
        return ref != null;
      case OptGrammarPackage.ARRAY_DEFINITION__BLOCKS:
        return blocks != null;
      case OptGrammarPackage.ARRAY_DEFINITION__ARRAY_REF:
        return arrayRef != null;
      case OptGrammarPackage.ARRAY_DEFINITION__INDEXES:
        return indexes != null && !indexes.isEmpty();
      case OptGrammarPackage.ARRAY_DEFINITION__FIELD:
        return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
      case OptGrammarPackage.ARRAY_DEFINITION__OPERATOR:
        return operator != null;
      case OptGrammarPackage.ARRAY_DEFINITION__VALUE:
        return value != null;
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
    result.append(" (field: ");
    result.append(field);
    result.append(')');
    return result.toString();
  }

} //ArrayDefinitionImpl
