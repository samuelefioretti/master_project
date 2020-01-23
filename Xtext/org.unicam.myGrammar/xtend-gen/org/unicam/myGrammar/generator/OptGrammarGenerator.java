/**
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.unicam.myGrammar.optGrammar.ArithmeticOperations;
import org.unicam.myGrammar.optGrammar.BlockhashFunction;
import org.unicam.myGrammar.optGrammar.Contract;
import org.unicam.myGrammar.optGrammar.DecimalLiteral;
import org.unicam.myGrammar.optGrammar.EcrecoverFunction;
import org.unicam.myGrammar.optGrammar.EnumDefinition;
import org.unicam.myGrammar.optGrammar.EnumValue;
import org.unicam.myGrammar.optGrammar.Ether;
import org.unicam.myGrammar.optGrammar.Expression;
import org.unicam.myGrammar.optGrammar.FunctionCall;
import org.unicam.myGrammar.optGrammar.FunctionDefinition;
import org.unicam.myGrammar.optGrammar.HashFunction;
import org.unicam.myGrammar.optGrammar.HexLiteral;
import org.unicam.myGrammar.optGrammar.IntParameter;
import org.unicam.myGrammar.optGrammar.Literal;
import org.unicam.myGrammar.optGrammar.Mapping;
import org.unicam.myGrammar.optGrammar.MathematicalFunction;
import org.unicam.myGrammar.optGrammar.NumericLiteral;
import org.unicam.myGrammar.optGrammar.PrimaryArithmetic;
import org.unicam.myGrammar.optGrammar.SecondOperators;
import org.unicam.myGrammar.optGrammar.StructDefinition;
import org.unicam.myGrammar.optGrammar.Time;
import org.unicam.myGrammar.optGrammar.UnitTypes;
import org.unicam.myGrammar.optGrammar.VisibilityEnum;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class OptGrammarGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Consumer<Contract> _function = (Contract c) -> {
      String _string = this._iQualifiedNameProvider.getFullyQualifiedName(c).toString("/");
      String _plus = (_string + ".sol");
      fsa.generateFile(_plus, this.compile(c));
    };
    Iterables.<Contract>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Contract.class).forEach(_function);
  }
  
  public CharSequence compile(final Contract c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pragma solidity ^0.5.2;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("contract ");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _blocks = c.getBlocks();
      for(final EObject block : _blocks) {
        String _compileBlock = this.compileBlock(block);
        _builder.append(_compileBlock);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String compileBlock(final EObject b) {
    throw new Error("Unresolved compilation problems:"
      + "\nDeclaration cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method compileDeclaration(Declaration) from the type OptGrammarGenerator refers to the missing type Declaration");
  }
  
  public String compileDeclaration(final /* Declaration */Object dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nMappingDeclaration cannot be resolved to a type."
      + "\nEnumDeclaration cannot be resolved to a type."
      + "\nStructDeclaration cannot be resolved to a type."
      + "\nPrimaryTypeDefinitionDeclaration cannot be resolved to a type."
      + "\nArrayDeclaration cannot be resolved to a type."
      + "\nConcreteStructureDefinitionDeclaration cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\ncompileMapping cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ncompileEnum cannot be resolved"
      + "\ncompileStruct cannot be resolved"
      + "\ncompilePrimaryTypeDefinitionDeclaration cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ncompileArray cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ncompileConcreteStructure cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public Object compileDeclarationReference(final EObject dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayDeclaration cannot be resolved to a type."
      + "\nStructDeclaration cannot be resolved to a type."
      + "\nEnumDeclaration cannot be resolved to a type."
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nPrimaryTypeDeclaration cannot be resolved to a type."
      + "\nMappingDeclaration cannot be resolved to a type."
      + "\nThe method or field name is undefined for the type EObject"
      + "\nThe method or field name is undefined for the type EObject"
      + "\nThe method or field name is undefined for the type EObject"
      + "\nThe method or field name is undefined for the type EObject"
      + "\nThe method or field name is undefined for the type EObject"
      + "\nThe method or field name is undefined for the type EObject"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition.");
  }
  
  public String compileFunctionDefinition(final FunctionDefinition funDef) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field visibility is undefined for the type FunctionDefinition"
      + "\nThe method or field visibility is undefined for the type FunctionDefinition"
      + "\nThe method or field returnType is undefined for the type FunctionDefinition"
      + "\nThe method or field returnType is undefined for the type FunctionDefinition"
      + "\nThe method or field blocks is undefined for the type FunctionDefinition"
      + "\nThe method or field returnVal is undefined for the type FunctionDefinition"
      + "\nThe method or field returnVal is undefined for the type FunctionDefinition"
      + "\nThe method or field returnVal is undefined for the type FunctionDefinition"
      + "\nThe method or field returnVal is undefined for the type FunctionDefinition"
      + "\nThe method or field returnVal is undefined for the type FunctionDefinition"
      + "\nThe method or field returnVal is undefined for the type FunctionDefinition"
      + "\nThe method or field returnVal is undefined for the type FunctionDefinition"
      + "\nThe method or field returnVal is undefined for the type FunctionDefinition"
      + "\nThe method or field returnVal is undefined for the type FunctionDefinition"
      + "\nType mismatch: cannot convert from ParameterList to Iterable<?>"
      + "\nThe method compileDeclaration(Declaration) from the type OptGrammarGenerator refers to the missing type Declaration"
      + "\n!== cannot be resolved"
      + "\ntype cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ncompileTypes cannot be resolved"
      + "\ncompileInternalBlock cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n^def cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n^def cannot be resolved"
      + "\ncompileDefinitions cannot be resolved"
      + "\ndefDec cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ndefDec cannot be resolved"
      + "\ncompileDeclaration cannot be resolved"
      + "\n^val cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n^val cannot be resolved"
      + "\ncompileCondition cannot be resolved"
      + "\ncall cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ncall cannot be resolved"
      + "\ncompileCondition cannot be resolved");
  }
  
  public String compileInternalBlock(final /* InternalBlock */Object fb) {
    throw new Error("Unresolved compilation problems:"
      + "\ndec cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ndec cannot be resolved"
      + "\ncompileDeclaration cannot be resolved"
      + "\nloop cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nloop cannot be resolved"
      + "\ncompileLoopStructure cannot be resolved"
      + "\ndef cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ndef cannot be resolved"
      + "\ncompileDefinitions cannot be resolved"
      + "\ncall cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ncall cannot be resolved"
      + "\ncompileFunctionCall cannot be resolved");
  }
  
  public String compileEnum(final EnumDefinition en) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("enum ");
    CharSequence _xifexpression = null;
    VisibilityEnum _visibility = en.getVisibility();
    boolean _tripleNotEquals = (_visibility != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _type = en.getVisibility().getType();
      _builder_1.append(_type);
      _xifexpression = _builder_1;
    } else {
      _xifexpression = "";
    }
    String _plus = (_builder.toString() + _xifexpression);
    StringConcatenation _builder_2 = new StringConcatenation();
    String _name = en.getName();
    _builder_2.append(_name);
    _builder_2.append(" {");
    _builder_2.newLineIfNotEmpty();
    _builder_2.append("\t\t\t");
    {
      EList<EnumValue> _members = en.getMembers();
      for(final EnumValue e : _members) {
        String _name_1 = e.getName();
        _builder_2.append(_name_1, "\t\t\t");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t\t\t");
        {
          EnumValue _last = IterableExtensions.<EnumValue>last(en.getMembers());
          boolean _notEquals = (!Objects.equal(e, _last));
          if (_notEquals) {
            _builder_2.append(", ");
          }
        }
        _builder_2.newLineIfNotEmpty();
      }
    }
    _builder_2.append("\t\t");
    _builder_2.append("}");
    return (_plus + _builder_2);
  }
  
  public String compileArray(final /* ArrayDeclaration */Object arr) {
    throw new Error("Unresolved compilation problems:"
      + "\nstrucType cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nstrucType cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncompileTypes cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nvisibility cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nvisibility cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nconstant cannot be resolved"
      + "\nname cannot be resolved"
      + "\nblocks cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nblocks cannot be resolved"
      + "\ncompileArrDefinition cannot be resolved"
      + "\n^var cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n^var cannot be resolved"
      + "\ncompileArrDefinition cannot be resolved"
      + "\naccess cannot be resolved"
      + "\n!== cannot be resolved"
      + "\naccess cannot be resolved"
      + "\ncompileArrDefinition cannot be resolved");
  }
  
  public String compileArrDefinition(final EObject arr) {
    throw new Error("Unresolved compilation problems:"
      + "\nFilledArray cannot be resolved to a type."
      + "\nDeclaration cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method compileFilledArray(FilledArray) from the type OptGrammarGenerator refers to the missing type FilledArray"
      + "\nThe method compileDeclarationReference(EObject) from the type OptGrammarGenerator refers to the missing type Object");
  }
  
  public String compileFilledArray(final /* FilledArray */Object fa) {
    throw new Error("Unresolved compilation problems:"
      + "\narrays cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\ncompileExpression cannot be resolved");
  }
  
  public String compileAccess(final EObject e) {
    throw new Error("Unresolved compilation problems:"
      + "\nFieldAccess cannot be resolved to a type."
      + "\nMappingAccess cannot be resolved to a type."
      + "\nArrayAccess cannot be resolved to a type."
      + "\nThe method or field ref is undefined for the type EObject"
      + "\nThe method or field field is undefined for the type EObject"
      + "\nThe method or field map is undefined for the type EObject"
      + "\nThe method or field index is undefined for the type EObject"
      + "\nThe method or field variable is undefined for the type EObject"
      + "\nThe method or field indexes is undefined for the type EObject"
      + "\nThe method or field field is undefined for the type EObject"
      + "\nThe method or field field is undefined for the type EObject"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\ncompileDeclarationReference cannot be resolved"
      + "\ncompileDeclarationReference cannot be resolved"
      + "\ncompileExpression cannot be resolved"
      + "\ncompileDeclarationReference cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncompileExpression cannot be resolved"
      + "\n!== cannot be resolved");
  }
  
  public String compileTypes(final EObject type) {
    throw new Error("Unresolved compilation problems:"
      + "\nSimpleTypeDeclaration cannot be resolved to a type."
      + "\nThe method or field type is undefined for the type EObject"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition.");
  }
  
  public String compileStruct(final StructDefinition st) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compileDeclaration(Declaration) from the type OptGrammarGenerator refers to the missing type Declaration");
  }
  
  public String compileConcreteStructure(final /* ConcreteStructureDefinitionDeclaration */Object cs) {
    throw new Error("Unresolved compilation problems:"
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nConcreteStructDeclaration cannot be resolved to a type."
      + "\nref cannot be resolved"
      + "\n=== cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nconstant cannot be resolved"
      + "\nname cannot be resolved"
      + "\nref cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncouples cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncouples cannot be resolved"
      + "\nfield cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\ncompileLogicalOrFilled cannot be resolved"
      + "\nexistenceRef cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nexistenceRef cannot be resolved"
      + "\nname cannot be resolved"
      + "\narrayAccessRef cannot be resolved"
      + "\n!== cannot be resolved"
      + "\narrayAccessRef cannot be resolved"
      + "\ncompileAccess cannot be resolved");
  }
  
  public String compileMapping(final /* MappingDeclaration */Object mp) {
    throw new Error("Unresolved compilation problems:"
      + "\nvisibility cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nvisibility cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nMapping cannot be resolved"
      + "\ncompileMapping cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public String compileMapping(final Mapping dec) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Mapping"
      + "\nThe method or field secondRef is undefined for the type Mapping"
      + "\nThe method or field secondRef is undefined for the type Mapping"
      + "\nThe method or field second is undefined for the type Mapping"
      + "\nThe method or field second is undefined for the type Mapping"
      + "\nThe method or field second is undefined for the type Mapping"
      + "\nThe method or field second is undefined for the type Mapping"
      + "\nThe method or field array is undefined for the type Mapping"
      + "\ncompileTypes cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ncompileDeclarationReference cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ncompileTypes cannot be resolved");
  }
  
  public String compilePrimaryTypeDefinitionDeclaration(final /* PrimaryTypeDefinitionDeclaration */Object pr) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayableDeclaration cannot be resolved to a type."
      + "\nNonArrayableDeclaration cannot be resolved to a type."
      + "\nThe method or field PrimaryTypeDeclaration is undefined"
      + "\nThe method or field PrimaryTypeDeclaration is undefined"
      + "\nThe method or field PrimaryTypeDeclaration is undefined"
      + "\nThe method or field PrimaryTypeDeclaration is undefined"
      + "\nref cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nref cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\n!== cannot be resolved"
      + "\noperator cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncompileTypes cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncompileTypes cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncast cannot be resolved"
      + "\nvisibility cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ncast cannot be resolved"
      + "\nvisibility cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncast cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ncast cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\n!== cannot be resolved"
      + "\noperator cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved");
  }
  
  public Object compileLoopStructure(final /* LoopStructures */Object loop) {
    throw new Error("Unresolved compilation problems:"
      + "\nIfWhileStructure cannot be resolved to a type."
      + "\nForStructure cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\ncompileIfWhileStructure cannot be resolved"
      + "\ncompileForStructure cannot be resolved");
  }
  
  public String compileInternalLoop(final /* LoopStructures */Object str) {
    throw new Error("Unresolved compilation problems:"
      + "\nblocks cannot be resolved"
      + "\ncompileInternalBlock cannot be resolved");
  }
  
  public String compileIfWhileStructure(final /* IfWhileStructure */Object str) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\ncondition cannot be resolved"
      + "\ncompileExpression cannot be resolved"
      + "\ncompileInternalLoop cannot be resolved");
  }
  
  public String compileForStructure(final /* ForStructure */Object str) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\ninitial cannot be resolved"
      + "\ncompileIntial cannot be resolved"
      + "\ncondition cannot be resolved"
      + "\ncompileExpression cannot be resolved"
      + "\nstep cannot be resolved"
      + "\ncompileSingleDefinition cannot be resolved"
      + "\ncompileInternalLoop cannot be resolved");
  }
  
  public String compileExpression(final Expression logic) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field negate is undefined for the type Expression"
      + "\nThe method or field first is undefined for the type Expression"
      + "\nThe method or field operations is undefined for the type Expression"
      + "\nThe method or field ternary is undefined for the type Expression"
      + "\nThe method or field first is undefined for the type Expression"
      + "\nThe method or field true is undefined for the type Expression"
      + "\nThe method or field false is undefined for the type Expression"
      + "\nThe method or field first is undefined for the type Expression"
      + "\nThe method or field operations is undefined for the type Expression"
      + "\ncompileCondition cannot be resolved"
      + "\ncompileConditionOperation cannot be resolved"
      + "\ncompileCondition cannot be resolved"
      + "\ncompileCondition cannot be resolved"
      + "\ncompileCondition cannot be resolved"
      + "\ncompileCondition cannot be resolved"
      + "\ncompileConditionOperation cannot be resolved");
  }
  
  public Object compileCondition(final Literal cond) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayAccess cannot be resolved to a type."
      + "\nMappingAccess cannot be resolved to a type."
      + "\nFieldAccess cannot be resolved to a type."
      + "\nThe method or field ref is undefined for the type Literal"
      + "\nThe method or field ref is undefined for the type Literal"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\n!== cannot be resolved"
      + "\ncompileDeclarationReference cannot be resolved");
  }
  
  public String compileBlockhash(final BlockhashFunction block) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("blockhash(");
    String _compileIntParameter = this.compileIntParameter(block.getParameter());
    _builder.append(_compileIntParameter);
    _builder.append(")");
    return _builder.toString();
  }
  
  public String compileMathematicalFunction(final MathematicalFunction mat) {
    StringConcatenation _builder = new StringConcatenation();
    String _function = mat.getFunction();
    _builder.append(_function);
    _builder.append("(");
    {
      EList<IntParameter> _parameters = mat.getParameters();
      boolean _hasElements = false;
      for(final IntParameter param : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _compileIntParameter = this.compileIntParameter(param);
        _builder.append(_compileIntParameter);
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  public String compileHashFunction(final HashFunction hash) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = hash.getName();
    _builder.append(_name);
    _builder.append("(");
    String _compileIntParameter = this.compileIntParameter(hash.getParameters());
    _builder.append(_compileIntParameter);
    _builder.append(")");
    return _builder.toString();
  }
  
  public String compileEcrecoverFunction(final EcrecoverFunction ecrecover) {
    StringConcatenation _builder = new StringConcatenation();
    String _function = ecrecover.getFunction();
    _builder.append(_function);
    _builder.append("(");
    {
      EList<IntParameter> _parameters = ecrecover.getParameters();
      boolean _hasElements = false;
      for(final IntParameter param : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _compileIntParameter = this.compileIntParameter(param);
        _builder.append(_compileIntParameter);
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  public String compileIntParameter(final IntParameter param) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ref is undefined for the type IntParameter"
      + "\nThe method or field ref is undefined for the type IntParameter"
      + "\n!== cannot be resolved"
      + "\ncompileDeclarationReference cannot be resolved");
  }
  
  public String compileConditionOperation(final /* ConditionOperation */Object op) {
    throw new Error("Unresolved compilation problems:"
      + "\noperation cannot be resolved"
      + "\nnegateSecond cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nseconds cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nseconds cannot be resolved"
      + "\ncompileCondition cannot be resolved");
  }
  
  public String compileArithmeticOperations(final ArithmeticOperations op) {
    StringConcatenation _builder = new StringConcatenation();
    String _compilePrimaryArithmetic = this.compilePrimaryArithmetic(op.getFirst());
    _builder.append(_compilePrimaryArithmetic);
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      EList<SecondOperators> _seconds = op.getSeconds();
      for(final SecondOperators operation : _seconds) {
        String _operator = operation.getOperator();
        _builder_1.append(_operator);
        String _compilePrimaryArithmetic_1 = this.compilePrimaryArithmetic(operation.getValue());
        _builder_1.append(_compilePrimaryArithmetic_1);
      }
    }
    return (_builder.toString() + _builder_1);
  }
  
  public String compilePrimaryArithmetic(final PrimaryArithmetic primary) {
    String _switchResult = null;
    boolean _matched = false;
    if (primary instanceof NumericLiteral) {
      _matched=true;
      _switchResult = this.compileNumericLiteral(((NumericLiteral)primary));
    }
    if (!_matched) {
      if (primary instanceof Expression) {
        _matched=true;
        _switchResult = this.compileExpression(((Expression)primary));
      }
    }
    return _switchResult;
  }
  
  public String compileNumericLiteral(final NumericLiteral num) {
    String _xifexpression = null;
    HexLiteral _hexValue = num.getHexValue();
    boolean _tripleNotEquals = (_hexValue != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder = new StringConcatenation();
      String _value = num.getHexValue().getValue();
      _builder.append(_value);
      _xifexpression = _builder.toString();
    } else {
      String _xifexpression_1 = null;
      DecimalLiteral _decimalValue = num.getDecimalValue();
      boolean _tripleNotEquals_1 = (_decimalValue != null);
      if (_tripleNotEquals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        double _value_1 = num.getDecimalValue().getValue();
        _builder_1.append(_value_1);
        _xifexpression_1 = _builder_1.toString();
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        int _value_2 = num.getIntValue().getValue();
        _builder_2.append(_value_2);
        _xifexpression_1 = _builder_2.toString();
      }
      _xifexpression = _xifexpression_1;
    }
    CharSequence _xifexpression_2 = null;
    UnitTypes _etherUnit = num.getEtherUnit();
    boolean _tripleNotEquals_2 = (_etherUnit != null);
    if (_tripleNotEquals_2) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(" ");
      String _compileUnitTypes = this.compileUnitTypes(num.getEtherUnit());
      _builder_3.append(_compileUnitTypes, " ");
      _xifexpression_2 = _builder_3;
    } else {
      _xifexpression_2 = "";
    }
    return (_xifexpression + _xifexpression_2);
  }
  
  public String compileUnitTypes(final UnitTypes unit) {
    String _xifexpression = null;
    Ether _units = unit.getUnits();
    boolean _tripleNotEquals = (_units != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder = new StringConcatenation();
      int _value = unit.getUnits().getValue();
      _builder.append(_value);
      _xifexpression = _builder.toString();
    } else {
      String _xifexpression_1 = null;
      Time _time = unit.getTime();
      boolean _tripleNotEquals_1 = (_time != null);
      if (_tripleNotEquals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        int _value_1 = unit.getTime().getValue();
        _builder_1.append(_value_1);
        _xifexpression_1 = _builder_1.toString();
      } else {
        _xifexpression_1 = "";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String compileDefinitions(final EObject obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayDefinition cannot be resolved to a type."
      + "\nMappingAccess cannot be resolved to a type."
      + "\nSingleDefinition cannot be resolved to a type."
      + "\nFieldAccess cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method compileArrayDefinition(ArrayDefinition) from the type OptGrammarGenerator refers to the missing type ArrayDefinition"
      + "\nThe method compileMappingDefinition(MappingAccess) from the type OptGrammarGenerator refers to the missing type MappingAccess"
      + "\nThe method compileSingleDefinition(SingleDefinition) from the type OptGrammarGenerator refers to the missing type SingleDefinition"
      + "\nThe method compileFieldDefinition(FieldAccess) from the type OptGrammarGenerator refers to the missing type FieldAccess");
  }
  
  public String compileArrayDefinition(final /* ArrayDefinition */Object array) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ArrayDeclaration is undefined"
      + "\ncast cannot be resolved"
      + "\nref cannot be resolved"
      + "\nname cannot be resolved"
      + "\nblocks cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nblocks cannot be resolved"
      + "\ncompileFilledArray cannot be resolved"
      + "\narrayRef cannot be resolved"
      + "\n!== cannot be resolved"
      + "\narrayRef cannot be resolved"
      + "\ncompileArrDefinition cannot be resolved"
      + "\nindexes cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncompileExpression cannot be resolved"
      + "\noperator cannot be resolved"
      + "\n!== cannot be resolved"
      + "\noperator cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncompileLogicalOrFilled cannot be resolved");
  }
  
  public String compileMappingDefinition(final /* MappingAccess */Object map) {
    throw new Error("Unresolved compilation problems:"
      + "\ncompileAccess cannot be resolved"
      + "\nsec cannot be resolved"
      + "\ncompileLogicalOrFilled cannot be resolved");
  }
  
  public String compileSingleDefinition(final /* SingleDefinition */Object definition) {
    throw new Error("Unresolved compilation problems:"
      + "\nfirst cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nfirst cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsecond cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsecond cannot be resolved");
  }
  
  public String compileLogicalOrFilled(final EObject obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nFilledArray cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method compileFilledArray(FilledArray) from the type OptGrammarGenerator refers to the missing type FilledArray");
  }
  
  public String compileFieldDefinition(final /* FieldAccess */Object field) {
    throw new Error("Unresolved compilation problems:"
      + "\ncompileAccess cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncompileLogicalOrFilled cannot be resolved");
  }
  
  public String compileIntial(final EObject obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayDefinition cannot be resolved to a type."
      + "\nMappingAccess cannot be resolved to a type."
      + "\nFieldAccess cannot be resolved to a type."
      + "\nDeclaration cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method compileArrayDefinition(ArrayDefinition) from the type OptGrammarGenerator refers to the missing type ArrayDefinition"
      + "\nThe method compileMappingDefinition(MappingAccess) from the type OptGrammarGenerator refers to the missing type MappingAccess"
      + "\nThe method compileFieldDefinition(FieldAccess) from the type OptGrammarGenerator refers to the missing type FieldAccess"
      + "\nThe method compileDeclaration(Declaration) from the type OptGrammarGenerator refers to the missing type Declaration");
  }
  
  public String compileFunctionCall(final FunctionCall call) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = call.getName().getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Expression> _parameters = call.getParameters();
      boolean _tripleNotEquals = (_parameters != null);
      if (_tripleNotEquals) {
        _builder.newLineIfNotEmpty();
        {
          EList<Expression> _parameters_1 = call.getParameters();
          boolean _hasElements = false;
          for(final Expression param : _parameters_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _compileExpression = this.compileExpression(param);
            _builder.append(_compileExpression);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
}
