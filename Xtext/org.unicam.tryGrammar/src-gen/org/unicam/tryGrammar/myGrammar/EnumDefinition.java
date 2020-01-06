/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.myGrammar;

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
 *   <li>{@link org.unicam.tryGrammar.myGrammar.EnumDefinition#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.EnumDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.EnumDefinition#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getEnumDefinition()
 * @model
 * @generated
 */
public interface EnumDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryGrammar.myGrammar.VisibilityEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.VisibilityEnum
   * @see #setVisibility(VisibilityEnum)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getEnumDefinition_Visibility()
   * @model
   * @generated
   */
  VisibilityEnum getVisibility();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.EnumDefinition#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.VisibilityEnum
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityEnum value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getEnumDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.EnumDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.tryGrammar.myGrammar.EnumValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getEnumDefinition_Members()
   * @model containment="true"
   * @generated
   */
  EList<EnumValue> getMembers();

} // EnumDefinition
