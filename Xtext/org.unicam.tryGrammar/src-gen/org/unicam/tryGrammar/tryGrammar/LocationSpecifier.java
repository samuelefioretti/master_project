/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.LocationSpecifier#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getLocationSpecifier()
 * @model
 * @generated
 */
public interface LocationSpecifier extends VariableDeclarationOptionalElement
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryGrammar.tryGrammar.LocationSpecifierEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see org.unicam.tryGrammar.tryGrammar.LocationSpecifierEnum
   * @see #setLocation(LocationSpecifierEnum)
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getLocationSpecifier_Location()
   * @model
   * @generated
   */
  LocationSpecifierEnum getLocation();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.LocationSpecifier#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see org.unicam.tryGrammar.tryGrammar.LocationSpecifierEnum
   * @see #getLocation()
   * @generated
   */
  void setLocation(LocationSpecifierEnum value);

} // LocationSpecifier