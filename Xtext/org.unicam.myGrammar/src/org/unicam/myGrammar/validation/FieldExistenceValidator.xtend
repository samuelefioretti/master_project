package org.unicam.myGrammar.validation

import com.google.inject.Inject
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.ComposedChecks
import org.eclipse.xtext.validation.EValidatorRegistrar
import org.unicam.myGrammar.optGrammar.OptGrammarPackage

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators=CorrectOperationValidator)
class FieldExistenceValidator extends AbstractOptGrammarValidator {
	@Inject
	override register(EValidatorRegistrar registrar) {}

// @Check
/*def fieldExists(FieldAccess fieldAccess) {
 * 	val ref = fieldAccess.ref as ConcreteStructDeclaration
 * 	if (!ref.type.fields.exists[dec|fieldAccess.field.fieldExists(dec)])
 * 		error(String.format("Field \"%s\" does not exist in structure \"%s\"", fieldAccess.field, ref.type.name),
 * 			OptGrammarPackage.Literals.FIELD_ACCESS__FIELD)
 * }

 * @Check
 * def fieldExists(ArrayDefinition arrayDefinition) {
 * 	if(arrayDefinition.field === null) return;

 * 	if (arrayDefinition.ref.asDeclaration.strucType !== null) {
 * 		if (!arrayDefinition.ref.asDeclaration.strucType.fields.
 * 			exists[dec|arrayDefinition.field.fieldExists(dec)]) {
 * 			error(
 * 				String.format("Field \"%s\" does not exist in structure \"%s\"", arrayDefinition.field,
 * 					arrayDefinition.ref.asDeclaration.strucType.name),
 * 				OptGrammarPackage.Literals.ARRAY_DEFINITION__FIELD)
 * 		}
 * 	}
 * }

 * @Check
 * def fieldExists(ArrayAccess arrayAccess) {
 * 	if(arrayAccess.field === null) return;

 * 	if ((arrayAccess.variable as ArrayDeclaration).strucType !== null) {
 * 		if (!(arrayAccess.variable as ArrayDeclaration).strucType.fields.exists [ dec |
 * 			arrayAccess.field.fieldExists(dec)
 * 		]) {
 * 			error(
 * 				String.format("Field \"%s\" does not exist in structure \"%s\"", arrayAccess.field,
 * 					(arrayAccess.variable as ArrayDeclaration).strucType.name),
 * 				OptGrammarPackage.Literals.ARRAY_ACCESS__FIELD)
 * 		}
 * 	}
 * }

 * def fieldExists(String field, Declaration dec) {
 * 	return dec.getName.equals(field);
 * }
 */
}
