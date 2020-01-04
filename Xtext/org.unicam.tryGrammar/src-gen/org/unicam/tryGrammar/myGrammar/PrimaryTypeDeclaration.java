/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.myGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.PrimaryTypeDeclaration#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.PrimaryTypeDeclaration#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.PrimaryTypeDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.myGrammar.PrimaryTypeDeclaration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getPrimaryTypeDeclaration()
 * @model
 * @generated
 */
public interface PrimaryTypeDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' attribute.
   * @see #setConstant(boolean)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getPrimaryTypeDeclaration_Constant()
   * @model
   * @generated
   */
  boolean isConstant();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.PrimaryTypeDeclaration#isConstant <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' attribute.
   * @see #isConstant()
   * @generated
   */
  void setConstant(boolean value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryGrammar.myGrammar.VisibilityEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.VisibilityEnum
   * @see #setVisibility(VisibilityEnum)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getPrimaryTypeDeclaration_Visibility()
   * @model
   * @generated
   */
  VisibilityEnum getVisibility();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.PrimaryTypeDeclaration#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.VisibilityEnum
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityEnum value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryGrammar.myGrammar.ElementaryTypeNameEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.ElementaryTypeNameEnum
   * @see #setType(ElementaryTypeNameEnum)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getPrimaryTypeDeclaration_Type()
   * @model
   * @generated
   */
  ElementaryTypeNameEnum getType();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.PrimaryTypeDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.unicam.tryGrammar.myGrammar.ElementaryTypeNameEnum
   * @see #getType()
   * @generated
   */
  void setType(ElementaryTypeNameEnum value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unicam.tryGrammar.myGrammar.MyGrammarPackage#getPrimaryTypeDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.myGrammar.PrimaryTypeDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // PrimaryTypeDeclaration
