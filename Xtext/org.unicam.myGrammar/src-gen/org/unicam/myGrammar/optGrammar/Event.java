/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Event#getName <em>Name</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Event#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Event#isIsAnonymous <em>Is Anonymous</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends DefinitionBody
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getEvent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Event#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(ParameterList)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getEvent_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameters();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Event#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterList value);

  /**
   * Returns the value of the '<em><b>Is Anonymous</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Anonymous</em>' attribute.
   * @see #setIsAnonymous(boolean)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getEvent_IsAnonymous()
   * @model
   * @generated
   */
  boolean isIsAnonymous();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Event#isIsAnonymous <em>Is Anonymous</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Anonymous</em>' attribute.
   * @see #isIsAnonymous()
   * @generated
   */
  void setIsAnonymous(boolean value);

} // Event
