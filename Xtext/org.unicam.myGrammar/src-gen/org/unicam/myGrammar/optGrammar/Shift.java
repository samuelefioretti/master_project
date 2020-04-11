/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Shift#getLeft <em>Left</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Shift#getShiftOp <em>Shift Op</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.Shift#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getShift()
 * @model
 * @generated
 */
public interface Shift extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getShift_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Shift#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Shift Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.myGrammar.optGrammar.ShiftOpEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift Op</em>' attribute.
   * @see org.unicam.myGrammar.optGrammar.ShiftOpEnum
   * @see #setShiftOp(ShiftOpEnum)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getShift_ShiftOp()
   * @model
   * @generated
   */
  ShiftOpEnum getShiftOp();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Shift#getShiftOp <em>Shift Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift Op</em>' attribute.
   * @see org.unicam.myGrammar.optGrammar.ShiftOpEnum
   * @see #getShiftOp()
   * @generated
   */
  void setShiftOp(ShiftOpEnum value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage#getShift_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.unicam.myGrammar.optGrammar.Shift#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Shift