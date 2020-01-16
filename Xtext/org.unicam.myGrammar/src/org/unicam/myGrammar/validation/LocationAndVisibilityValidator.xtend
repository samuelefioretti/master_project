package org.unicam.myGrammar.validation

import org.eclipse.xtext.validation.Check
import com.google.inject.Inject
import org.eclipse.xtext.validation.EValidatorRegistrar
import org.eclipse.xtext.validation.ComposedChecks

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators=CorrectIndexValidator)
class LocationAndVisibilityValidator extends AbstractOptGrammarValidator {
	@Inject
	override register(EValidatorRegistrar registrar) {}

	@Check
	def noWrongLocation(LocationLiteral locationLiteral) {
		val current = locationLiteral.eContainer.eContainer.getRoot [ eObj |
			eObj instanceof StructDeclaration || eObj instanceof FunctionDefinition
		]
		if (!(current instanceof FunctionDefinition))
			error("Location cannot be declared here", CustomSolidityPackage.Literals.LOCATION_LITERAL__TYPE)
	}

	@Check
	def noWrongLocation(NonArrayableDeclaration nonArrDec) {
		if (!nonArrDec.type.type.equals("string") && nonArrDec.location !== null)
			error("Location cannot be declared here", CustomSolidityPackage.Literals.NON_ARRAYABLE_DECLARATION__TYPE)
	}

	@Check
	def noWrongVisibility(VisibilityLiteral visibilityLiteral) {
		val current = visibilityLiteral.eContainer.eContainer.getRoot [ eObj |
			eObj instanceof StructDeclaration || eObj instanceof FunctionDefinition
		]
		if (!(current instanceof Contract))
			error("Visibility cannot be declared here", CustomSolidityPackage.Literals.VISIBILITY_LITERAL__TYPE)
	}

	@Check
	def checkDataLocation(ArrayDefinitionDeclaration inDec) {
		if (inDec.getRoot[obj|obj instanceof FunctionDefinition] instanceof FunctionDefinition &&
			inDec.asDeclaration.location === null)
			error("Arrays must have a data location", inDec.asDeclaration,
				CustomSolidityPackage.Literals.ARRAY_DECLARATION__NAME)
	}

	@Check
	def checkDataLocation(ConcreteStructDeclaration inDec) {
		if (inDec.getRoot[obj|obj instanceof FunctionDefinition] instanceof FunctionDefinition &&
			inDec.location === null)
			error("Structure must have a data location", inDec.asDeclaration,
				CustomSolidityPackage.Literals.CONCRETE_STRUCT_DECLARATION__NAME)
	}

	@Check
	def checkDataLocation(NonArrayableDeclaration inDec) {
		if (inDec.getRoot[obj|obj instanceof FunctionDefinition] instanceof FunctionDefinition &&
			inDec.location === null && inDec.type.type.equals("string"))
			error("Strings must have a data location", inDec.asDeclaration,
				CustomSolidityPackage.Literals.NON_ARRAYABLE_DECLARATION__TYPE)
	}

	@Check
	def storageLocation(MappingDeclaration map) {
		if (map.getRoot[e|e instanceof FunctionDefinition] instanceof FunctionDefinition) {
			if (map.location === null)
				error("Map must be located in storage", map, CustomSolidityPackage.Literals.MAPPING_DECLARATION__NAME);
		} else {
			if (map.location !== null)
				error("Map Location must not be declared here", map,
					CustomSolidityPackage.Literals.MAPPING_DECLARATION__NAME);
		}
	}
}
