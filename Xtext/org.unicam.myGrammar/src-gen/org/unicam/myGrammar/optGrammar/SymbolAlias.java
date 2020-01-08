/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.SymbolAlias#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.SymbolAlias#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getSymbolAlias()
 * @model
 * @generated
 */
public interface SymbolAlias extends EObject
{
  /**
   * Returns the value of the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' attribute.
   * @see #setSymbol(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getSymbolAlias_Symbol()
   * @model
   * @generated
   */
  String getSymbol();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.SymbolAlias#getSymbol <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' attribute.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(String value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getSymbolAlias_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.SymbolAlias#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

} // SymbolAlias