/*
 * generated by Xtext 2.19.0
 */
package org.unicam.tryGrammar.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.unicam.tryGrammar.parser.antlr.internal.InternalMyGrammarParser;
import org.unicam.tryGrammar.services.MyGrammarGrammarAccess;

public class MyGrammarParser extends AbstractAntlrParser {

	@Inject
	private MyGrammarGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyGrammarParser createParser(XtextTokenStream stream) {
		return new InternalMyGrammarParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Solidity";
	}

	public MyGrammarGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyGrammarGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}