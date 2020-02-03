/**
 * generated by Xtext 2.20.0
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.unicam.myGrammar.optGrammar.Expression;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.StandardVariableDeclaration;
import org.unicam.myGrammar.optGrammar.Variable;
import org.unicam.myGrammar.optGrammar.VariableDeclarationOptionalElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.StandardVariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.StandardVariableDeclarationImpl#getOptionalElements <em>Optional Elements</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.StandardVariableDeclarationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.StandardVariableDeclarationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.StandardVariableDeclarationImpl#isSemicolon <em>Semicolon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardVariableDeclarationImpl extends StatementImpl implements StandardVariableDeclaration
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EObject type;

  /**
   * The cached value of the '{@link #getOptionalElements() <em>Optional Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionalElements()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclarationOptionalElement> optionalElements;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The default value of the '{@link #isSemicolon() <em>Semicolon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSemicolon()
   * @generated
   * @ordered
   */
  protected static final boolean SEMICOLON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSemicolon() <em>Semicolon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSemicolon()
   * @generated
   * @ordered
   */
  protected boolean semicolon = SEMICOLON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StandardVariableDeclarationImpl()
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
    return OptGrammarPackage.Literals.STANDARD_VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(EObject newType, NotificationChain msgs)
  {
    EObject oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__TYPE, oldType, newType);
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
  public void setType(EObject newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VariableDeclarationOptionalElement> getOptionalElements()
  {
    if (optionalElements == null)
    {
      optionalElements = new EObjectContainmentEList<VariableDeclarationOptionalElement>(VariableDeclarationOptionalElement.class, this, OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__OPTIONAL_ELEMENTS);
    }
    return optionalElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__VARIABLE, oldVariable, newVariable);
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
  public void setVariable(Variable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__EXPRESSION, oldExpression, newExpression);
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
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSemicolon()
  {
    return semicolon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSemicolon(boolean newSemicolon)
  {
    boolean oldSemicolon = semicolon;
    semicolon = newSemicolon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__SEMICOLON, oldSemicolon, semicolon));
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
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__OPTIONAL_ELEMENTS:
        return ((InternalEList<?>)getOptionalElements()).basicRemove(otherEnd, msgs);
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__VARIABLE:
        return basicSetVariable(null, msgs);
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__TYPE:
        return getType();
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__OPTIONAL_ELEMENTS:
        return getOptionalElements();
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__VARIABLE:
        return getVariable();
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__EXPRESSION:
        return getExpression();
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__SEMICOLON:
        return isSemicolon();
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
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__TYPE:
        setType((EObject)newValue);
        return;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__OPTIONAL_ELEMENTS:
        getOptionalElements().clear();
        getOptionalElements().addAll((Collection<? extends VariableDeclarationOptionalElement>)newValue);
        return;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__SEMICOLON:
        setSemicolon((Boolean)newValue);
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
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__TYPE:
        setType((EObject)null);
        return;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__OPTIONAL_ELEMENTS:
        getOptionalElements().clear();
        return;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__VARIABLE:
        setVariable((Variable)null);
        return;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__SEMICOLON:
        setSemicolon(SEMICOLON_EDEFAULT);
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
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__TYPE:
        return type != null;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__OPTIONAL_ELEMENTS:
        return optionalElements != null && !optionalElements.isEmpty();
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__VARIABLE:
        return variable != null;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__EXPRESSION:
        return expression != null;
      case OptGrammarPackage.STANDARD_VARIABLE_DECLARATION__SEMICOLON:
        return semicolon != SEMICOLON_EDEFAULT;
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
    result.append(" (semicolon: ");
    result.append(semicolon);
    result.append(')');
    return result.toString();
  }

} //StandardVariableDeclarationImpl
