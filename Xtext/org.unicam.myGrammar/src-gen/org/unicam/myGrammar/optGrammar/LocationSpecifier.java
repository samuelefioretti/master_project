/**
 * generated by Xtext 2.20.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.LocationSpecifier#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getLocationSpecifier()
 * @model
 * @generated
 */
public interface LocationSpecifier extends VariableDeclarationOptionalElement
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(LocationLiteral)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getLocationSpecifier_Location()
   * @model containment="true"
   * @generated
   */
  LocationLiteral getLocation();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.LocationSpecifier#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(LocationLiteral value);

} // LocationSpecifier
