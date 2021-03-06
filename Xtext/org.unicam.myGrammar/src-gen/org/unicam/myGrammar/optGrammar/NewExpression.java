/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.NewExpression#getContract <em>Contract</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.NewExpression#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getNewExpression()
 * @model
 * @generated
 */
public interface NewExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Contract</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contract</em>' reference.
   * @see #setContract(Contract)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getNewExpression_Contract()
   * @model
   * @generated
   */
  Contract getContract();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.NewExpression#getContract <em>Contract</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contract</em>' reference.
   * @see #getContract()
   * @generated
   */
  void setContract(Contract value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(FunctionCallListArguments)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getNewExpression_Args()
   * @model containment="true"
   * @generated
   */
  FunctionCallListArguments getArgs();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.NewExpression#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(FunctionCallListArguments value);

} // NewExpression
