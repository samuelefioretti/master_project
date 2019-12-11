/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryIde.solidity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryIde.solidity.VisibilitySpecifier#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryIde.solidity.SolidityPackage#getVisibilitySpecifier()
 * @model
 * @generated
 */
public interface VisibilitySpecifier extends FunctionDefinitionOptionalElement, VariableDeclarationOptionalElement
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryIde.solidity.VisibilityEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see org.unicam.tryIde.solidity.VisibilityEnum
   * @see #setVisibility(VisibilityEnum)
   * @see org.unicam.tryIde.solidity.SolidityPackage#getVisibilitySpecifier_Visibility()
   * @model
   * @generated
   */
  VisibilityEnum getVisibility();

  /**
   * Sets the value of the '{@link org.unicam.tryIde.solidity.VisibilitySpecifier#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see org.unicam.tryIde.solidity.VisibilityEnum
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityEnum value);

} // VisibilitySpecifier
