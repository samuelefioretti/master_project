/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.FunctionCallArg#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.FunctionCallArg#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionCallArg()
 * @model
 * @generated
 */
public interface FunctionCallArg extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionCallArg_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.FunctionCallArg#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(LogicalOperations)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionCallArg_Expr()
   * @model containment="true"
   * @generated
   */
  LogicalOperations getExpr();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.FunctionCallArg#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(LogicalOperations value);

} // FunctionCallArg
