/**
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar;

import org.unicam.tryGrammar.MyGrammarStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MyGrammarStandaloneSetup extends MyGrammarStandaloneSetupGenerated {
  public static void doSetup() {
    new MyGrammarStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}