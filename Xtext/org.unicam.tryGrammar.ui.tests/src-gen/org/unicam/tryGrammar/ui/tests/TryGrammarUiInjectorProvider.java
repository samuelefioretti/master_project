/*
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.unicam.tryGrammar.ui.internal.TryGrammarActivator;

public class TryGrammarUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TryGrammarActivator.getInstance().getInjector("org.unicam.tryGrammar.TryGrammar");
	}

}
