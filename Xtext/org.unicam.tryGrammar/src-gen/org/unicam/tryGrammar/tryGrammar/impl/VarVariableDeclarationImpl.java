/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.unicam.tryGrammar.tryGrammar.Expression;
import org.unicam.tryGrammar.tryGrammar.TryGrammarPackage;
import org.unicam.tryGrammar.tryGrammar.VarVariableDeclaration;
import org.unicam.tryGrammar.tryGrammar.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VarVariableDeclarationImpl#getVarType <em>Var Type</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VarVariableDeclarationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.VarVariableDeclarationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarVariableDeclarationImpl extends StatementImpl implements VarVariableDeclaration
{
  /**
   * The default value of the '{@link #getVarType() <em>Var Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarType()
   * @generated
   * @ordered
   */
  protected static final String VAR_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarType() <em>Var Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarType()
   * @generated
   * @ordered
   */
  protected String varType = VAR_TYPE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarVariableDeclarationImpl()
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
    return TryGrammarPackage.eINSTANCE.getVarVariableDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVarType()
  {
    return varType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarType(String newVarType)
  {
    String oldVarType = varType;
    varType = newVarType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VAR_VARIABLE_DECLARATION__VAR_TYPE, oldVarType, varType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VAR_VARIABLE_DECLARATION__VARIABLE, oldVariable, newVariable);
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
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.VAR_VARIABLE_DECLARATION__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.VAR_VARIABLE_DECLARATION__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VAR_VARIABLE_DECLARATION__VARIABLE, newVariable, newVariable));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VAR_VARIABLE_DECLARATION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.VAR_VARIABLE_DECLARATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.VAR_VARIABLE_DECLARATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.VAR_VARIABLE_DECLARATION__EXPRESSION, newExpression, newExpression));
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
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__VARIABLE:
        return basicSetVariable(null, msgs);
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__EXPRESSION:
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
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__VAR_TYPE:
        return getVarType();
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__VARIABLE:
        return getVariable();
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__EXPRESSION:
        return getExpression();
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
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__VAR_TYPE:
        setVarType((String)newValue);
        return;
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__EXPRESSION:
        setExpression((Expression)newValue);
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
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__VAR_TYPE:
        setVarType(VAR_TYPE_EDEFAULT);
        return;
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__VARIABLE:
        setVariable((Variable)null);
        return;
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__EXPRESSION:
        setExpression((Expression)null);
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
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__VAR_TYPE:
        return VAR_TYPE_EDEFAULT == null ? varType != null : !VAR_TYPE_EDEFAULT.equals(varType);
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__VARIABLE:
        return variable != null;
      case TryGrammarPackage.VAR_VARIABLE_DECLARATION__EXPRESSION:
        return expression != null;
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
    result.append(" (varType: ");
    result.append(varType);
    result.append(')');
    return result.toString();
  }

} //VarVariableDeclarationImpl