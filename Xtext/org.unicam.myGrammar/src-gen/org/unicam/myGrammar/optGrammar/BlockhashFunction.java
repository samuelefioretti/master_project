/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blockhash Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.BlockhashFunction#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getBlockhashFunction()
 * @model
 * @generated
 */
public interface BlockhashFunction extends Literal
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(IntParameter)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getBlockhashFunction_Parameter()
   * @model containment="true"
   * @generated
   */
  IntParameter getParameter();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.BlockhashFunction#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(IntParameter value);

} // BlockhashFunction