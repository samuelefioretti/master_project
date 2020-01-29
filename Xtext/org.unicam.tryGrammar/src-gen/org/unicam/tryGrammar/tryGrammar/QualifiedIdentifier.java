/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.QualifiedIdentifier#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.QualifiedIdentifier#getQualifiers <em>Qualifiers</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getQualifiedIdentifier()
 * @model
 * @generated
 */
public interface QualifiedIdentifier extends StandardType, Expression
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getQualifiedIdentifier_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.QualifiedIdentifier#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.tryGrammar.tryGrammar.Qualifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifiers</em>' containment reference list.
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getQualifiedIdentifier_Qualifiers()
   * @model containment="true"
   * @generated
   */
  EList<Qualifier> getQualifiers();

} // QualifiedIdentifier
