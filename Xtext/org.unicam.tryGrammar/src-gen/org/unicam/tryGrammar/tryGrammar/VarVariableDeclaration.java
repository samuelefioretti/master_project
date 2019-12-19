/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.VarVariableDeclaration#getVarType <em>Var Type</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.VarVariableDeclaration#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.VarVariableDeclaration#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getVarVariableDeclaration()
 * @model
 * @generated
 */
public interface VarVariableDeclaration extends Statement
{
  /**
   * Returns the value of the '<em><b>Var Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Type</em>' attribute.
   * @see #setVarType(String)
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getVarVariableDeclaration_VarType()
   * @model
   * @generated
   */
  String getVarType();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.VarVariableDeclaration#getVarType <em>Var Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Type</em>' attribute.
   * @see #getVarType()
   * @generated
   */
  void setVarType(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getVarVariableDeclaration_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.VarVariableDeclaration#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getVarVariableDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.VarVariableDeclaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // VarVariableDeclaration