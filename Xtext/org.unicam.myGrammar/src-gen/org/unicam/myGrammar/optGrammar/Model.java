/**
 * generated by Xtext 2.20.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Model#getPragmaDirective <em>Pragma Directive</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Model#getImportDirective <em>Import Directive</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Model#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Pragma Directive</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.PragmaDirective}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pragma Directive</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getModel_PragmaDirective()
   * @model containment="true"
   * @generated
   */
  EList<PragmaDirective> getPragmaDirective();

  /**
   * Returns the value of the '<em><b>Import Directive</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.ImportDirective}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Directive</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getModel_ImportDirective()
   * @model containment="true"
   * @generated
   */
  EList<ImportDirective> getImportDirective();

  /**
   * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.Contract}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contract</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getModel_Contract()
   * @model containment="true"
   * @generated
   */
  EList<Contract> getContract();

} // Model
