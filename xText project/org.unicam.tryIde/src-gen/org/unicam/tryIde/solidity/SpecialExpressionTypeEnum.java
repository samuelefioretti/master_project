/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryIde.solidity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Special Expression Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.unicam.tryIde.solidity.SolidityPackage#getSpecialExpressionTypeEnum()
 * @model
 * @generated
 */
public enum SpecialExpressionTypeEnum implements Enumerator
{
  /**
   * The '<em><b>SUPER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPER_VALUE
   * @generated
   * @ordered
   */
  SUPER(0, "SUPER", "super"),

  /**
   * The '<em><b>THIS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THIS_VALUE
   * @generated
   * @ordered
   */
  THIS(1, "THIS", "this");

  /**
   * The '<em><b>SUPER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPER
   * @model literal="super"
   * @generated
   * @ordered
   */
  public static final int SUPER_VALUE = 0;

  /**
   * The '<em><b>THIS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THIS
   * @model literal="this"
   * @generated
   * @ordered
   */
  public static final int THIS_VALUE = 1;

  /**
   * An array of all the '<em><b>Special Expression Type Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SpecialExpressionTypeEnum[] VALUES_ARRAY =
    new SpecialExpressionTypeEnum[]
    {
      SUPER,
      THIS,
    };

  /**
   * A public read-only list of all the '<em><b>Special Expression Type Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SpecialExpressionTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Special Expression Type Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SpecialExpressionTypeEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SpecialExpressionTypeEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Special Expression Type Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SpecialExpressionTypeEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SpecialExpressionTypeEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Special Expression Type Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SpecialExpressionTypeEnum get(int value)
  {
    switch (value)
    {
      case SUPER_VALUE: return SUPER;
      case THIS_VALUE: return THIS;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private SpecialExpressionTypeEnum(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //SpecialExpressionTypeEnum
