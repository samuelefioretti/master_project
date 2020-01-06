/*
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.unicam.tryGrammar.ui.internal.TryGrammarActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyGrammarExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(TryGrammarActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		TryGrammarActivator activator = TryGrammarActivator.getInstance();
		return activator != null ? activator.getInjector(TryGrammarActivator.ORG_UNICAM_TRYGRAMMAR_MYGRAMMAR) : null;
	}

}