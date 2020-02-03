/**
 * generated by Xtext 2.20.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.EnumDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.EnumDefinition#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getEnumDefinition()
 * @model
 * @generated
 */
public interface EnumDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getEnumDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.EnumDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.EnumValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getEnumDefinition_Members()
   * @model containment="true"
   * @generated
   */
  EList<EnumValue> getMembers();

} // EnumDefinition
