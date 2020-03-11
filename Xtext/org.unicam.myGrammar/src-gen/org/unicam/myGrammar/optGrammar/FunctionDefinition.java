/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getState <em>State</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getConst <em>Const</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getReturnParameters <em>Return Parameters</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends DefinitionBody
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(ParameterList)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionDefinition_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameters();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterList value);

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.StateMutability}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionDefinition_State()
   * @model containment="true"
   * @generated
   */
  EList<StateMutability> getState();

  /**
   * Returns the value of the '<em><b>Const</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.Const}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionDefinition_Const()
   * @model containment="true"
   * @generated
   */
  EList<Const> getConst();

  /**
   * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.ModifierInvocation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionDefinition_Modifier()
   * @model containment="true"
   * @generated
   */
  EList<ModifierInvocation> getModifier();

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.VisibilityLiteral}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionDefinition_Visibility()
   * @model containment="true"
   * @generated
   */
  EList<VisibilityLiteral> getVisibility();

  /**
   * Returns the value of the '<em><b>Return Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Parameters</em>' containment reference.
   * @see #setReturnParameters(ReturnsParameterList)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionDefinition_ReturnParameters()
   * @model containment="true"
   * @generated
   */
  ReturnsParameterList getReturnParameters();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getReturnParameters <em>Return Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Parameters</em>' containment reference.
   * @see #getReturnParameters()
   * @generated
   */
  void setReturnParameters(ReturnsParameterList value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Body)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getFunctionDefinition_Block()
   * @model containment="true"
   * @generated
   */
  Body getBlock();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.FunctionDefinition#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Body value);

} // FunctionDefinition
