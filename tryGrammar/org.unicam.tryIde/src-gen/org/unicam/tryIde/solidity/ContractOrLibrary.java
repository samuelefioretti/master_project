/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryIde.solidity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Or Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryIde.solidity.ContractOrLibrary#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.tryIde.solidity.ContractOrLibrary#getInheritanceSpecifiers <em>Inheritance Specifiers</em>}</li>
 *   <li>{@link org.unicam.tryIde.solidity.ContractOrLibrary#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryIde.solidity.SolidityPackage#getContractOrLibrary()
 * @model
 * @generated
 */
public interface ContractOrLibrary extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unicam.tryIde.solidity.SolidityPackage#getContractOrLibrary_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unicam.tryIde.solidity.ContractOrLibrary#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inheritance Specifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.tryIde.solidity.InheritanceSpecifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritance Specifiers</em>' containment reference list.
   * @see org.unicam.tryIde.solidity.SolidityPackage#getContractOrLibrary_InheritanceSpecifiers()
   * @model containment="true"
   * @generated
   */
  EList<InheritanceSpecifier> getInheritanceSpecifiers();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(DefinitionBody)
   * @see org.unicam.tryIde.solidity.SolidityPackage#getContractOrLibrary_Body()
   * @model containment="true"
   * @generated
   */
  DefinitionBody getBody();

  /**
   * Sets the value of the '{@link org.unicam.tryIde.solidity.ContractOrLibrary#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(DefinitionBody value);

} // ContractOrLibrary
