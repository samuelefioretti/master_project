/*
 * generated by Xtext 2.19.0
 */
package org.unicam.myGrammar


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class OptGrammarStandaloneSetup extends OptGrammarStandaloneSetupGenerated {

	def static void doSetup() {
		new OptGrammarStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}