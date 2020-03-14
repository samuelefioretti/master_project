/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Contract#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Contract#getInheritanceSpecifiers <em>Inheritance Specifiers</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Contract#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getContract_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Contract#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inheritance Specifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.InheritanceSpecifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritance Specifiers</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getContract_InheritanceSpecifiers()
   * @model containment="true"
   * @generated
   */
  EList<InheritanceSpecifier> getInheritanceSpecifiers();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.DefinitionBody}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getContract_Body()
   * @model containment="true"
   * @generated
   */
  EList<DefinitionBody> getBody();

} // Contract
