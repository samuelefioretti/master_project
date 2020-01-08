/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.DefinitionBody#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.DefinitionBody#getStructs <em>Structs</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.DefinitionBody#getEnums <em>Enums</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.DefinitionBody#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.DefinitionBody#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.DefinitionBody#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getDefinitionBody()
 * @model
 * @generated
 */
public interface DefinitionBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.FunctionDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getDefinitionBody_Functions()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDefinition> getFunctions();

  /**
   * Returns the value of the '<em><b>Structs</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.StructDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structs</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getDefinitionBody_Structs()
   * @model containment="true"
   * @generated
   */
  EList<StructDefinition> getStructs();

  /**
   * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.EnumDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getDefinitionBody_Enums()
   * @model containment="true"
   * @generated
   */
  EList<EnumDefinition> getEnums();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getDefinitionBody_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getVariables();

  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.Modifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getDefinitionBody_Modifiers()
   * @model containment="true"
   * @generated
   */
  EList<Modifier> getModifiers();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link org.unicam.myGrammar.optGrammar.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getDefinitionBody_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

} // DefinitionBody