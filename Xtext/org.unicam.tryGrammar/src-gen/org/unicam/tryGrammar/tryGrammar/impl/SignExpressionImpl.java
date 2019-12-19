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
import org.unicam.tryGrammar.tryGrammar.SignExpression;
import org.unicam.tryGrammar.tryGrammar.TryGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sign Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.SignExpressionImpl#getSignOp <em>Sign Op</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.impl.SignExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignExpressionImpl extends ExpressionImpl implements SignExpression
{
  /**
   * The default value of the '{@link #getSignOp() <em>Sign Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignOp()
   * @generated
   * @ordered
   */
  protected static final String SIGN_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSignOp() <em>Sign Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignOp()
   * @generated
   * @ordered
   */
  protected String signOp = SIGN_OP_EDEFAULT;

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
  protected SignExpressionImpl()
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
    return TryGrammarPackage.eINSTANCE.getSignExpression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSignOp()
  {
    return signOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSignOp(String newSignOp)
  {
    String oldSignOp = signOp;
    signOp = newSignOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.SIGN_EXPRESSION__SIGN_OP, oldSignOp, signOp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TryGrammarPackage.SIGN_EXPRESSION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.SIGN_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TryGrammarPackage.SIGN_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TryGrammarPackage.SIGN_EXPRESSION__EXPRESSION, newExpression, newExpression));
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
      case TryGrammarPackage.SIGN_EXPRESSION__EXPRESSION:
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
      case TryGrammarPackage.SIGN_EXPRESSION__SIGN_OP:
        return getSignOp();
      case TryGrammarPackage.SIGN_EXPRESSION__EXPRESSION:
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
      case TryGrammarPackage.SIGN_EXPRESSION__SIGN_OP:
        setSignOp((String)newValue);
        return;
      case TryGrammarPackage.SIGN_EXPRESSION__EXPRESSION:
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
      case TryGrammarPackage.SIGN_EXPRESSION__SIGN_OP:
        setSignOp(SIGN_OP_EDEFAULT);
        return;
      case TryGrammarPackage.SIGN_EXPRESSION__EXPRESSION:
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
      case TryGrammarPackage.SIGN_EXPRESSION__SIGN_OP:
        return SIGN_OP_EDEFAULT == null ? signOp != null : !SIGN_OP_EDEFAULT.equals(signOp);
      case TryGrammarPackage.SIGN_EXPRESSION__EXPRESSION:
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
    result.append(" (signOp: ");
    result.append(signOp);
    result.append(')');
    return result.toString();
  }

} //SignExpressionImpl