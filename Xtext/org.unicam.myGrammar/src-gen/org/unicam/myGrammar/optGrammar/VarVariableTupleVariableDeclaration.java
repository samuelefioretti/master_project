/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Variable Tuple Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.VarVariableTupleVariableDeclaration#getVarType <em>Var Type</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.VarVariableTupleVariableDeclaration#getTuple <em>Tuple</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.VarVariableTupleVariableDeclaration#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.VarVariableTupleVariableDeclaration#isSemicolon <em>Semicolon</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getVarVariableTupleVariableDeclaration()
 * @model
 * @generated
 */
public interface VarVariableTupleVariableDeclaration extends Statement, SimpleStatement, SimpleStatement2
{
  /**
   * Returns the value of the '<em><b>Var Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Type</em>' attribute.
   * @see #setVarType(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getVarVariableTupleVariableDeclaration_VarType()
   * @model
   * @generated
   */
  String getVarType();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.VarVariableTupleVariableDeclaration#getVarType <em>Var Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Type</em>' attribute.
   * @see #getVarType()
   * @generated
   */
  void setVarType(String value);

  /**
   * Returns the value of the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuple</em>' containment reference.
   * @see #setTuple(Tuple)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getVarVariableTupleVariableDeclaration_Tuple()
   * @model containment="true"
   * @generated
   */
  Tuple getTuple();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.VarVariableTupleVariableDeclaration#getTuple <em>Tuple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tuple</em>' containment reference.
   * @see #getTuple()
   * @generated
   */
  void setTuple(Tuple value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getVarVariableTupleVariableDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.VarVariableTupleVariableDeclaration#getExpression <em>Expression</em>}' containment reference.
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
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getVarVariableTupleVariableDeclaration_Semicolon()
   * @model
   * @generated
   */
  boolean isSemicolon();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.VarVariableTupleVariableDeclaration#isSemicolon <em>Semicolon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semicolon</em>' attribute.
   * @see #isSemicolon()
   * @generated
   */
  void setSemicolon(boolean value);

} // VarVariableTupleVariableDeclaration