/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.myGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#isPayable <em>Payable</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getOptionalElements <em>Optional Elements</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getReturnParameters <em>Return Parameters</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryGrammar.myGrammar.VisibilityEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.VisibilityEnum
   * @see #setVisibility(VisibilityEnum)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getFunctionDefinition_Visibility()
   * @model
   * @generated
   */
  VisibilityEnum getVisibility();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.VisibilityEnum
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityEnum value);

  /**
   * Returns the value of the '<em><b>Payable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Payable</em>' attribute.
   * @see #setPayable(boolean)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getFunctionDefinition_Payable()
   * @model
   * @generated
   */
  boolean isPayable();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#isPayable <em>Payable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Payable</em>' attribute.
   * @see #isPayable()
   * @generated
   */
  void setPayable(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getFunctionDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getName <em>Name</em>}' attribute.
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
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getFunctionDefinition_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameters();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterList value);

  /**
   * Returns the value of the '<em><b>Optional Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.tryGrammar.myGrammar.FunctionDefinitionOptionalElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional Elements</em>' containment reference list.
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getFunctionDefinition_OptionalElements()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDefinitionOptionalElement> getOptionalElements();

  /**
   * Returns the value of the '<em><b>Return Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Parameters</em>' containment reference.
   * @see #setReturnParameters(ReturnsParameterList)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getFunctionDefinition_ReturnParameters()
   * @model containment="true"
   * @generated
   */
  ReturnsParameterList getReturnParameters();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getReturnParameters <em>Return Parameters</em>}' containment reference.
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
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getFunctionDefinition_Block()
   * @model containment="true"
   * @generated
   */
  Body getBlock();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.FunctionDefinition#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Body value);

} // FunctionDefinition
