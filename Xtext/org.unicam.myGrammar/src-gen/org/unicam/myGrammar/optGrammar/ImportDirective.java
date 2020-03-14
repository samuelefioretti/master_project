/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ImportDirective#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ImportDirective#getUnitAlias <em>Unit Alias</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.ImportDirective#getSymbolAliases <em>Symbol Aliases</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getImportDirective()
 * @model
 * @generated
 */
public interface ImportDirective extends EObject
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getImportDirective_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.ImportDirective#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

  /**
   * Returns the value of the '<em><b>Unit Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit Alias</em>' attribute.
   * @see #setUnitAlias(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getImportDirective_UnitAlias()
   * @model
   * @generated
   */
  String getUnitAlias();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.ImportDirective#getUnitAlias <em>Unit Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit Alias</em>' attribute.
   * @see #getUnitAlias()
   * @generated
   */
  void setUnitAlias(String value);

  /**
   * Returns the value of the '<em><b>Symbol Aliases</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.SymbolAlias}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol Aliases</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getImportDirective_SymbolAliases()
   * @model containment="true"
   * @generated
   */
  EList<SymbolAlias> getSymbolAliases();

} // ImportDirective
