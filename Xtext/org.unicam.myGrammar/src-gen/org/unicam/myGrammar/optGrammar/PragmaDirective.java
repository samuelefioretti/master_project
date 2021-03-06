/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pragma Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.PragmaDirective#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getPragmaDirective()
 * @model
 * @generated
 */
public interface PragmaDirective extends EObject
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference.
   * @see #setVersion(versionOperator)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getPragmaDirective_Version()
   * @model containment="true"
   * @generated
   */
  versionOperator getVersion();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.PragmaDirective#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  void setVersion(versionOperator value);

} // PragmaDirective
