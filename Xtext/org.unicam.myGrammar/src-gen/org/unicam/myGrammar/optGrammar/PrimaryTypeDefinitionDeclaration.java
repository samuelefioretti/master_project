/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Type Definition Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.PrimaryTypeDefinitionDeclaration#getRef <em>Ref</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.PrimaryTypeDefinitionDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getPrimaryTypeDefinitionDeclaration()
 * @model
 * @generated
 */
public interface PrimaryTypeDefinitionDeclaration extends DefinitionBody
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(PrimaryTypeDeclaration)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getPrimaryTypeDefinitionDeclaration_Ref()
   * @model
   * @generated
   */
  PrimaryTypeDeclaration getRef();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.PrimaryTypeDefinitionDeclaration#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(PrimaryTypeDeclaration value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getPrimaryTypeDefinitionDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.PrimaryTypeDefinitionDeclaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // PrimaryTypeDefinitionDeclaration