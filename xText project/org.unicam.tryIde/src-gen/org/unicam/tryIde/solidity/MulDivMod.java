/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryIde.solidity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mul Div Mod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryIde.solidity.MulDivMod#getLeft <em>Left</em>}</li>
 *   <li>{@link org.unicam.tryIde.solidity.MulDivMod#getMultipliciativeOp <em>Multipliciative Op</em>}</li>
 *   <li>{@link org.unicam.tryIde.solidity.MulDivMod#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryIde.solidity.SolidityPackage#getMulDivMod()
 * @model
 * @generated
 */
public interface MulDivMod extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.unicam.tryIde.solidity.SolidityPackage#getMulDivMod_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.unicam.tryIde.solidity.MulDivMod#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Multipliciative Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.unicam.tryIde.solidity.MulDivModOpEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multipliciative Op</em>' attribute.
   * @see org.unicam.tryIde.solidity.MulDivModOpEnum
   * @see #setMultipliciativeOp(MulDivModOpEnum)
   * @see org.unicam.tryIde.solidity.SolidityPackage#getMulDivMod_MultipliciativeOp()
   * @model
   * @generated
   */
  MulDivModOpEnum getMultipliciativeOp();

  /**
   * Sets the value of the '{@link org.unicam.tryIde.solidity.MulDivMod#getMultipliciativeOp <em>Multipliciative Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multipliciative Op</em>' attribute.
   * @see org.unicam.tryIde.solidity.MulDivModOpEnum
   * @see #getMultipliciativeOp()
   * @generated
   */
  void setMultipliciativeOp(MulDivModOpEnum value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see org.unicam.tryIde.solidity.SolidityPackage#getMulDivMod_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.unicam.tryIde.solidity.MulDivMod#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // MulDivMod
