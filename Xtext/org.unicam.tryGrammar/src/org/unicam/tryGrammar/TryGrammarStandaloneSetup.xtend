/*
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TryGrammarStandaloneSetup extends TryGrammarStandaloneSetupGenerated {

	def static void doSetup() {
		new TryGrammarStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
