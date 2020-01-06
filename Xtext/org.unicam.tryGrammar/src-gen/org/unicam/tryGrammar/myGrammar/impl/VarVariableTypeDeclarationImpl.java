/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.myGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.unicam.tryGrammar.myGrammar.Expression;
import org.unicam.tryGrammar.myGrammar.MyGrammarPackage;
import org.unicam.tryGrammar.myGrammar.VarVariableTypeDeclaration;
import org.unicam.tryGrammar.myGrammar.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Variable Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.impl.VarVariableTypeDeclarationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.impl.VarVariableTypeDeclarationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.impl.VarVariableTypeDeclarationImpl#isSemicolon <em>Semicolon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarVariableTypeDeclarationImpl extends SimpleStatementImpl implements VarVariableTypeDeclaration
{
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
  protected VarVariableTypeDeclarationImpl()
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
    return MyGrammarPackage.eINSTANCE.getVarVariableTypeDeclaration();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__VARIABLE, oldVariable, newVariable);
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
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__VARIABLE, newVariable, newVariable));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__EXPRESSION, newExpression, newExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__SEMICOLON, oldSemicolon, semicolon));
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
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__VARIABLE:
        return basicSetVariable(null, msgs);
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__EXPRESSION:
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
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__VARIABLE:
        return getVariable();
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__EXPRESSION:
        return getExpression();
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__SEMICOLON:
        return isSemicolon();
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
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__SEMICOLON:
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
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__VARIABLE:
        setVariable((Variable)null);
        return;
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__SEMICOLON:
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
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__VARIABLE:
        return variable != null;
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__EXPRESSION:
        return expression != null;
      case MyGrammarPackage.VAR_VARIABLE_TYPE_DECLARATION__SEMICOLON:
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

} //VarVariableTypeDeclarationImpl