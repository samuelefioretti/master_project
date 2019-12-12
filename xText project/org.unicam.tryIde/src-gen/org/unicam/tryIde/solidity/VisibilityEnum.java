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
 * A representation of the literals of the enumeration '<em><b>Visibility Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.unicam.tryIde.solidity.SolidityPackage#getVisibilityEnum()
 * @model
 * @generated
 */
public enum VisibilityEnum implements Enumerator
{
  /**
   * The '<em><b>PUBLIC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PUBLIC_VALUE
   * @generated
   * @ordered
   */
  PUBLIC(0, "PUBLIC", "public"),

  /**
   * The '<em><b>INTERNAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERNAL_VALUE
   * @generated
   * @ordered
   */
  INTERNAL(1, "INTERNAL", "internal"),

  /**
   * The '<em><b>PRIVATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRIVATE_VALUE
   * @generated
   * @ordered
   */
  PRIVATE(2, "PRIVATE", "private"),

  /**
   * The '<em><b>EXTERNAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXTERNAL_VALUE
   * @generated
   * @ordered
   */
  EXTERNAL(3, "EXTERNAL", "external");

  /**
   * The '<em><b>PUBLIC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PUBLIC
   * @model literal="public"
   * @generated
   * @ordered
   */
  public static final int PUBLIC_VALUE = 0;

  /**
   * The '<em><b>INTERNAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERNAL
   * @model literal="internal"
   * @generated
   * @ordered
   */
  public static final int INTERNAL_VALUE = 1;

  /**
   * The '<em><b>PRIVATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRIVATE
   * @model literal="private"
   * @generated
   * @ordered
   */
  public static final int PRIVATE_VALUE = 2;

  /**
   * The '<em><b>EXTERNAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXTERNAL
   * @model literal="external"
   * @generated
   * @ordered
   */
  public static final int EXTERNAL_VALUE = 3;

  /**
   * An array of all the '<em><b>Visibility Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final VisibilityEnum[] VALUES_ARRAY =
    new VisibilityEnum[]
    {
      PUBLIC,
      INTERNAL,
      PRIVATE,
      EXTERNAL,
    };

  /**
   * A public read-only list of all the '<em><b>Visibility Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<VisibilityEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Visibility Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static VisibilityEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VisibilityEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Visibility Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static VisibilityEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VisibilityEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Visibility Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static VisibilityEnum get(int value)
  {
    switch (value)
    {
      case PUBLIC_VALUE: return PUBLIC;
      case INTERNAL_VALUE: return INTERNAL;
      case PRIVATE_VALUE: return PRIVATE;
      case EXTERNAL_VALUE: return EXTERNAL;
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
  private VisibilityEnum(int value, String name, String literal)
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
  
} //VisibilityEnum
