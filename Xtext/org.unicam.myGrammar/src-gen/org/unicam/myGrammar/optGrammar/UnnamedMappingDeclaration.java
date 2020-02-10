/**
 * generated by Xtext 2.20.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unnamed Mapping Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.UnnamedMappingDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.UnnamedMappingDeclaration#getSecondRef <em>Second Ref</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.UnnamedMappingDeclaration#getSecond <em>Second</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.UnnamedMappingDeclaration#isArray <em>Array</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getUnnamedMappingDeclaration()
 * @model
 * @generated
 */
public interface UnnamedMappingDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(NamedType)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getUnnamedMappingDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  NamedType getType();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.UnnamedMappingDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(NamedType value);

  /**
   * Returns the value of the '<em><b>Second Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Ref</em>' reference.
   * @see #setSecondRef(DefinitionBody)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getUnnamedMappingDeclaration_SecondRef()
   * @model
   * @generated
   */
  DefinitionBody getSecondRef();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.UnnamedMappingDeclaration#getSecondRef <em>Second Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Ref</em>' reference.
   * @see #getSecondRef()
   * @generated
   */
  void setSecondRef(DefinitionBody value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' containment reference.
   * @see #setSecond(EObject)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getUnnamedMappingDeclaration_Second()
   * @model containment="true"
   * @generated
   */
  EObject getSecond();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.UnnamedMappingDeclaration#getSecond <em>Second</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' containment reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(EObject value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(boolean)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getUnnamedMappingDeclaration_Array()
   * @model
   * @generated
   */
  boolean isArray();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.UnnamedMappingDeclaration#isArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #isArray()
   * @generated
   */
  void setArray(boolean value);

} // UnnamedMappingDeclaration