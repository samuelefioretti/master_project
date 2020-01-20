package org.unicam.myGrammar.validation;

import org.eclipse.xtext.validation.ComposedChecks;
import org.unicam.myGrammar.validation.AbstractOptGrammarValidator;
import org.unicam.myGrammar.validation.QuickFixCalls;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators = QuickFixCalls.class)
@SuppressWarnings("all")
public class CorrectOperationValidator extends AbstractOptGrammarValidator {
}
