/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.tryGrammar;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Dimensionless</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.tryGrammar.tryGrammar.NumberDimensionless#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getNumberDimensionless()
 * @model
 * @generated
 */
public interface NumberDimensionless extends org.unicam.tryGrammar.tryGrammar.Number
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(BigInteger)
   * @see org.unicam.tryGrammar.tryGrammar.TryGrammarPackage#getNumberDimensionless_Value()
   * @model
   * @generated
   */
  BigInteger getValue();

  /**
   * Sets the value of the '{@link org.unicam.tryGrammar.tryGrammar.NumberDimensionless#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(BigInteger value);

} // NumberDimensionless