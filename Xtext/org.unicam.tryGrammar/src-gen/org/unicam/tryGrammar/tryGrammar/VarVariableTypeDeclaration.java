/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Variable Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.VarVariableTypeDeclaration#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.VarVariableTypeDeclaration#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.VarVariableTypeDeclaration#isSemicolon <em>Semicolon</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getVarVariableTypeDeclaration()
 * @model
 * @generated
 */
public interface VarVariableTypeDeclaration extends SimpleStatement, SimpleStatement2
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getVarVariableTypeDeclaration_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.VarVariableTypeDeclaration#getVariable <em>Variable</em>}' containment reference.
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
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getVarVariableTypeDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.VarVariableTypeDeclaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Semicolon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semicolon</em>' attribute.
   * @see #setSemicolon(boolean)
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getVarVariableTypeDeclaration_Semicolon()
   * @model
   * @generated
   */
  boolean isSemicolon();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.VarVariableTypeDeclaration#isSemicolon <em>Semicolon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semicolon</em>' attribute.
   * @see #isSemicolon()
   * @generated
   */
  void setSemicolon(boolean value);

} // VarVariableTypeDeclaration
