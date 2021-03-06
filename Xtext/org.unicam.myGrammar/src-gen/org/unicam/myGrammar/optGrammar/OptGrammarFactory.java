/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.unicam.myGrammar.optGrammar.OptGrammarPackage
 * @generated
 */
public interface OptGrammarFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OptGrammarFactory eINSTANCE = org.unicam.myGrammar.optGrammar.impl.OptGrammarFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Pragma Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pragma Directive</em>'.
   * @generated
   */
  PragmaDirective createPragmaDirective();

  /**
   * Returns a new object of class '<em>version Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>version Operator</em>'.
   * @generated
   */
  versionOperator createversionOperator();

  /**
   * Returns a new object of class '<em>Import Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Directive</em>'.
   * @generated
   */
  ImportDirective createImportDirective();

  /**
   * Returns a new object of class '<em>Symbol Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Alias</em>'.
   * @generated
   */
  SymbolAlias createSymbolAlias();

  /**
   * Returns a new object of class '<em>Contract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contract</em>'.
   * @generated
   */
  Contract createContract();

  /**
   * Returns a new object of class '<em>Definition Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition Body</em>'.
   * @generated
   */
  DefinitionBody createDefinitionBody();

  /**
   * Returns a new object of class '<em>Constructor Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor Definition</em>'.
   * @generated
   */
  ConstructorDefinition createConstructorDefinition();

  /**
   * Returns a new object of class '<em>Inheritance Specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inheritance Specifier</em>'.
   * @generated
   */
  InheritanceSpecifier createInheritanceSpecifier();

  /**
   * Returns a new object of class '<em>Function Call List Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call List Arguments</em>'.
   * @generated
   */
  FunctionCallListArguments createFunctionCallListArguments();

  /**
   * Returns a new object of class '<em>Function Call Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call Arguments</em>'.
   * @generated
   */
  FunctionCallArguments createFunctionCallArguments();

  /**
   * Returns a new object of class '<em>Function Call Arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call Arg</em>'.
   * @generated
   */
  FunctionCallArg createFunctionCallArg();

  /**
   * Returns a new object of class '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Definition</em>'.
   * @generated
   */
  FunctionDefinition createFunctionDefinition();

  /**
   * Returns a new object of class '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const</em>'.
   * @generated
   */
  Const createConst();

  /**
   * Returns a new object of class '<em>Struct Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Definition</em>'.
   * @generated
   */
  StructDefinition createStructDefinition();

  /**
   * Returns a new object of class '<em>Enum Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Definition</em>'.
   * @generated
   */
  EnumDefinition createEnumDefinition();

  /**
   * Returns a new object of class '<em>Enum Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Value</em>'.
   * @generated
   */
  EnumValue createEnumValue();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Primary Type Definition Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Type Definition Declaration</em>'.
   * @generated
   */
  PrimaryTypeDefinitionDeclaration createPrimaryTypeDefinitionDeclaration();

  /**
   * Returns a new object of class '<em>Primary Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Type Declaration</em>'.
   * @generated
   */
  PrimaryTypeDeclaration createPrimaryTypeDeclaration();

  /**
   * Returns a new object of class '<em>Non Arrayable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Arrayable Declaration</em>'.
   * @generated
   */
  NonArrayableDeclaration createNonArrayableDeclaration();

  /**
   * Returns a new object of class '<em>Arrayable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arrayable Declaration</em>'.
   * @generated
   */
  ArrayableDeclaration createArrayableDeclaration();

  /**
   * Returns a new object of class '<em>Variable Declaration Optional Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration Optional Element</em>'.
   * @generated
   */
  VariableDeclarationOptionalElement createVariableDeclarationOptionalElement();

  /**
   * Returns a new object of class '<em>Visibility Specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visibility Specifier</em>'.
   * @generated
   */
  VisibilitySpecifier createVisibilitySpecifier();

  /**
   * Returns a new object of class '<em>Indexed Specifer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indexed Specifer</em>'.
   * @generated
   */
  IndexedSpecifer createIndexedSpecifer();

  /**
   * Returns a new object of class '<em>Constant Specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Specifier</em>'.
   * @generated
   */
  ConstantSpecifier createConstantSpecifier();

  /**
   * Returns a new object of class '<em>Location Specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Location Specifier</em>'.
   * @generated
   */
  LocationSpecifier createLocationSpecifier();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Named Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Type</em>'.
   * @generated
   */
  NamedType createNamedType();

  /**
   * Returns a new object of class '<em>Standard Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Standard Type</em>'.
   * @generated
   */
  StandardType createStandardType();

  /**
   * Returns a new object of class '<em>Standard Type Without Qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Standard Type Without Qualified Identifier</em>'.
   * @generated
   */
  StandardTypeWithoutQualifiedIdentifier createStandardTypeWithoutQualifiedIdentifier();

  /**
   * Returns a new object of class '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type</em>'.
   * @generated
   */
  ArrayType createArrayType();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Tuple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple</em>'.
   * @generated
   */
  Tuple createTuple();

  /**
   * Returns a new object of class '<em>Tuple Separator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Separator</em>'.
   * @generated
   */
  TupleSeparator createTupleSeparator();

  /**
   * Returns a new object of class '<em>Simple Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Statement</em>'.
   * @generated
   */
  SimpleStatement createSimpleStatement();

  /**
   * Returns a new object of class '<em>Simple Statement2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Statement2</em>'.
   * @generated
   */
  SimpleStatement2 createSimpleStatement2();

  /**
   * Returns a new object of class '<em>Expression Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Statement</em>'.
   * @generated
   */
  ExpressionStatement createExpressionStatement();

  /**
   * Returns a new object of class '<em>Qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Identifier</em>'.
   * @generated
   */
  QualifiedIdentifier createQualifiedIdentifier();

  /**
   * Returns a new object of class '<em>Qualifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualifier</em>'.
   * @generated
   */
  Qualifier createQualifier();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index</em>'.
   * @generated
   */
  Index createIndex();

  /**
   * Returns a new object of class '<em>Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arguments</em>'.
   * @generated
   */
  Arguments createArguments();

  /**
   * Returns a new object of class '<em>Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modifier</em>'.
   * @generated
   */
  Modifier createModifier();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Modifier Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modifier Invocation</em>'.
   * @generated
   */
  ModifierInvocation createModifierInvocation();

  /**
   * Returns a new object of class '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter List</em>'.
   * @generated
   */
  ParameterList createParameterList();

  /**
   * Returns a new object of class '<em>Returns Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Returns Parameter List</em>'.
   * @generated
   */
  ReturnsParameterList createReturnsParameterList();

  /**
   * Returns a new object of class '<em>Return Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Parameter Declaration</em>'.
   * @generated
   */
  ReturnParameterDeclaration createReturnParameterDeclaration();

  /**
   * Returns a new object of class '<em>Loop Structures</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Structures</em>'.
   * @generated
   */
  LoopStructures createLoopStructures();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Do While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do While Statement</em>'.
   * @generated
   */
  DoWhileStatement createDoWhileStatement();

  /**
   * Returns a new object of class '<em>Emit Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Emit Statement</em>'.
   * @generated
   */
  EmitStatement createEmitStatement();

  /**
   * Returns a new object of class '<em>Delete Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Statement</em>'.
   * @generated
   */
  DeleteStatement createDeleteStatement();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  WhileStatement createWhileStatement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  ForStatement createForStatement();

  /**
   * Returns a new object of class '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body</em>'.
   * @generated
   */
  Body createBody();

  /**
   * Returns a new object of class '<em>Continue Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continue Statement</em>'.
   * @generated
   */
  ContinueStatement createContinueStatement();

  /**
   * Returns a new object of class '<em>Break Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Break Statement</em>'.
   * @generated
   */
  BreakStatement createBreakStatement();

  /**
   * Returns a new object of class '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Statement</em>'.
   * @generated
   */
  ReturnStatement createReturnStatement();

  /**
   * Returns a new object of class '<em>Throw Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Throw Statement</em>'.
   * @generated
   */
  ThrowStatement createThrowStatement();

  /**
   * Returns a new object of class '<em>Place Holder Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Place Holder Statement</em>'.
   * @generated
   */
  PlaceHolderStatement createPlaceHolderStatement();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Special Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Special Expression</em>'.
   * @generated
   */
  SpecialExpression createSpecialExpression();

  /**
   * Returns a new object of class '<em>Not Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Expression</em>'.
   * @generated
   */
  NotExpression createNotExpression();

  /**
   * Returns a new object of class '<em>Pre Inc Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Inc Expression</em>'.
   * @generated
   */
  PreIncExpression createPreIncExpression();

  /**
   * Returns a new object of class '<em>Pre Dec Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Dec Expression</em>'.
   * @generated
   */
  PreDecExpression createPreDecExpression();

  /**
   * Returns a new object of class '<em>Binary Not Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Not Expression</em>'.
   * @generated
   */
  BinaryNotExpression createBinaryNotExpression();

  /**
   * Returns a new object of class '<em>Sign Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sign Expression</em>'.
   * @generated
   */
  SignExpression createSignExpression();

  /**
   * Returns a new object of class '<em>New Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Expression</em>'.
   * @generated
   */
  NewExpression createNewExpression();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Arithmetic Operations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arithmetic Operations</em>'.
   * @generated
   */
  ArithmeticOperations createArithmeticOperations();

  /**
   * Returns a new object of class '<em>Primary Arithmetic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Arithmetic</em>'.
   * @generated
   */
  PrimaryArithmetic createPrimaryArithmetic();

  /**
   * Returns a new object of class '<em>Second Operators</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Second Operators</em>'.
   * @generated
   */
  SecondOperators createSecondOperators();

  /**
   * Returns a new object of class '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call</em>'.
   * @generated
   */
  FunctionCall createFunctionCall();

  /**
   * Returns a new object of class '<em>Blockhash Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Blockhash Function</em>'.
   * @generated
   */
  BlockhashFunction createBlockhashFunction();

  /**
   * Returns a new object of class '<em>Gasleft Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gasleft Function</em>'.
   * @generated
   */
  GasleftFunction createGasleftFunction();

  /**
   * Returns a new object of class '<em>Int Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Parameter</em>'.
   * @generated
   */
  IntParameter createIntParameter();

  /**
   * Returns a new object of class '<em>Mathematical Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mathematical Function</em>'.
   * @generated
   */
  MathematicalFunction createMathematicalFunction();

  /**
   * Returns a new object of class '<em>Hash Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hash Function</em>'.
   * @generated
   */
  HashFunction createHashFunction();

  /**
   * Returns a new object of class '<em>Ecrecover Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ecrecover Function</em>'.
   * @generated
   */
  EcrecoverFunction createEcrecoverFunction();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Literal</em>'.
   * @generated
   */
  NumericLiteral createNumericLiteral();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Hex Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hex Literal</em>'.
   * @generated
   */
  HexLiteral createHexLiteral();

  /**
   * Returns a new object of class '<em>Decimal Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decimal Literal</em>'.
   * @generated
   */
  DecimalLiteral createDecimalLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Type Cast</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Cast</em>'.
   * @generated
   */
  TypeCast createTypeCast();

  /**
   * Returns a new object of class '<em>Unit Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit Types</em>'.
   * @generated
   */
  UnitTypes createUnitTypes();

  /**
   * Returns a new object of class '<em>Time Units Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Units Literal</em>'.
   * @generated
   */
  TimeUnitsLiteral createTimeUnitsLiteral();

  /**
   * Returns a new object of class '<em>Units Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Units Literal</em>'.
   * @generated
   */
  UnitsLiteral createUnitsLiteral();

  /**
   * Returns a new object of class '<em>Special Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Special Literal</em>'.
   * @generated
   */
  SpecialLiteral createSpecialLiteral();

  /**
   * Returns a new object of class '<em>Sized Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sized Declaration</em>'.
   * @generated
   */
  SizedDeclaration createSizedDeclaration();

  /**
   * Returns a new object of class '<em>Simple Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Type Declaration</em>'.
   * @generated
   */
  SimpleTypeDeclaration createSimpleTypeDeclaration();

  /**
   * Returns a new object of class '<em>Location Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Location Literal</em>'.
   * @generated
   */
  LocationLiteral createLocationLiteral();

  /**
   * Returns a new object of class '<em>Visibility Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visibility Literal</em>'.
   * @generated
   */
  VisibilityLiteral createVisibilityLiteral();

  /**
   * Returns a new object of class '<em>State Mutability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Mutability</em>'.
   * @generated
   */
  StateMutability createStateMutability();

  /**
   * Returns a new object of class '<em>Standard Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Standard Variable Declaration</em>'.
   * @generated
   */
  StandardVariableDeclaration createStandardVariableDeclaration();

  /**
   * Returns a new object of class '<em>Var Variable Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Variable Type Declaration</em>'.
   * @generated
   */
  VarVariableTypeDeclaration createVarVariableTypeDeclaration();

  /**
   * Returns a new object of class '<em>Var Variable Tuple Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Variable Tuple Variable Declaration</em>'.
   * @generated
   */
  VarVariableTupleVariableDeclaration createVarVariableTupleVariableDeclaration();

  /**
   * Returns a new object of class '<em>Continue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continue</em>'.
   * @generated
   */
  Continue createContinue();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Variable Declaration Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration Expression</em>'.
   * @generated
   */
  VariableDeclarationExpression createVariableDeclarationExpression();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality</em>'.
   * @generated
   */
  Equality createEquality();

  /**
   * Returns a new object of class '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison</em>'.
   * @generated
   */
  Comparison createComparison();

  /**
   * Returns a new object of class '<em>Bit Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Or</em>'.
   * @generated
   */
  BitOr createBitOr();

  /**
   * Returns a new object of class '<em>Bit Xor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Xor</em>'.
   * @generated
   */
  BitXor createBitXor();

  /**
   * Returns a new object of class '<em>Bit And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit And</em>'.
   * @generated
   */
  BitAnd createBitAnd();

  /**
   * Returns a new object of class '<em>Shift</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shift</em>'.
   * @generated
   */
  Shift createShift();

  /**
   * Returns a new object of class '<em>Add Sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Sub</em>'.
   * @generated
   */
  AddSub createAddSub();

  /**
   * Returns a new object of class '<em>Mul Div Mod</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Div Mod</em>'.
   * @generated
   */
  MulDivMod createMulDivMod();

  /**
   * Returns a new object of class '<em>Exponent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exponent</em>'.
   * @generated
   */
  Exponent createExponent();

  /**
   * Returns a new object of class '<em>Post Inc Dec Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Inc Dec Expression</em>'.
   * @generated
   */
  PostIncDecExpression createPostIncDecExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OptGrammarPackage getOptGrammarPackage();

} //OptGrammarFactory
