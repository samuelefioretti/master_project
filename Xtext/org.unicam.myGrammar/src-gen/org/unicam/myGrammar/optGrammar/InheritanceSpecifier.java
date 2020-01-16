/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.InheritanceSpecifier#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getInheritanceSpecifier()
 * @model
 * @generated
 */
public interface InheritanceSpecifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(FunctionCallListArguments)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getInheritanceSpecifier_Args()
   * @model containment="true"
   * @generated
   */
  FunctionCallListArguments getArgs();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.InheritanceSpecifier#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(FunctionCallListArguments value);

} // InheritanceSpecifier
