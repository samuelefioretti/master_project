package org.unicam.tryGrammar.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.unicam.tryGrammar.services.TryGrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTryGrammarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'*'", "'as'", "'from'", "'{'", "','", "'}'", "'contract'", "'is'", "'library'", "'('", "')'", "':'", "'function'", "'returns'", "'constant'", "'struct'", "'enum'", "'='", "'indexed'", "'mapping'", "'=>'", "'['", "']'", "'var'", "'.'", "'modifier'", "'event'", "'anonymous'", "'delete'", "'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'return'", "'throw'", "'_'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'**'", "'!'", "'~'", "'+'", "'-'", "'new'", "'++'", "'--'", "'now'", "'int'", "'int16'", "'int24'", "'int32'", "'int40'", "'int48'", "'int56'", "'int64'", "'int72'", "'int80'", "'int88'", "'int96'", "'int104'", "'int112'", "'int120'", "'int128'", "'int136'", "'int144'", "'int152'", "'int160'", "'int168'", "'int178'", "'int184'", "'int192'", "'int200'", "'int208'", "'int216'", "'int224'", "'int232'", "'int240'", "'int248'", "'int256'", "'uint'", "'uint8'", "'uint16'", "'uint24'", "'uint32'", "'uint40'", "'uint48'", "'uint56'", "'uint64'", "'uint72'", "'uint80'", "'uint88'", "'uint96'", "'uint104'", "'uint112'", "'uint120'", "'uint128'", "'uint136'", "'uint144'", "'uint152'", "'uint160'", "'uint168'", "'uint178'", "'uint184'", "'uint192'", "'uint200'", "'uint208'", "'uint216'", "'uint224'", "'uint232'", "'uint240'", "'uint248'", "'uint256'", "'byte'", "'bytes'", "'bytes1'", "'bytes2'", "'bytes3'", "'bytes4'", "'bytes5'", "'bytes6'", "'bytes7'", "'bytes8'", "'bytes9'", "'bytes10'", "'bytes11'", "'bytes12'", "'bytes13'", "'bytes14'", "'bytes15'", "'bytes16'", "'bytes17'", "'bytes18'", "'bytes19'", "'bytes20'", "'bytes21'", "'bytes22'", "'bytes23'", "'bytes24'", "'bytes25'", "'bytes26'", "'bytes27'", "'bytes28'", "'bytes29'", "'bytes30'", "'bytes31'", "'bytes32'", "'string'", "'address'", "'bool'", "'real'", "'ureal'", "'memory'", "'storage'", "'public'", "'internal'", "'private'", "'external'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'>>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'in'", "'<<'", "'>>'", "'>>>'", "'/'", "'%'", "'true'", "'false'", "'wei'", "'szabo'", "'finney'", "'ether'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'years'", "'msg'", "'block'", "'tx'", "'super'", "'this'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__100=100;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__214=214;
    public static final int T__213=213;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__207=207;
    public static final int T__23=23;
    public static final int T__206=206;
    public static final int T__24=24;
    public static final int T__209=209;
    public static final int T__25=25;
    public static final int T__208=208;
    public static final int T__203=203;
    public static final int T__202=202;
    public static final int T__20=20;
    public static final int T__205=205;
    public static final int T__21=21;
    public static final int T__204=204;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__119=119;
    public static final int T__118=118;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__108=108;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int T__103=103;
    public static final int T__106=106;
    public static final int T__105=105;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__201=201;
    public static final int T__200=200;
    public static final int T__91=91;
    public static final int T__188=188;
    public static final int T__92=92;
    public static final int T__187=187;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__189=189;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__90=90;
    public static final int T__185=185;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__199=199;
    public static final int T__81=81;
    public static final int T__198=198;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int RULE_WS=9;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalTryGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTryGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTryGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTryGrammar.g"; }



     	private TryGrammarGrammarAccess grammarAccess;

        public InternalTryGrammarParser(TokenStream input, TryGrammarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Solidity";
       	}

       	@Override
       	protected TryGrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSolidity"
    // InternalTryGrammar.g:65:1: entryRuleSolidity returns [EObject current=null] : iv_ruleSolidity= ruleSolidity EOF ;
    public final EObject entryRuleSolidity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolidity = null;


        try {
            // InternalTryGrammar.g:65:49: (iv_ruleSolidity= ruleSolidity EOF )
            // InternalTryGrammar.g:66:2: iv_ruleSolidity= ruleSolidity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSolidityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSolidity=ruleSolidity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSolidity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSolidity"


    // $ANTLR start "ruleSolidity"
    // InternalTryGrammar.g:72:1: ruleSolidity returns [EObject current=null] : ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )* ;
    public final EObject ruleSolidity() throws RecognitionException {
        EObject current = null;

        EObject lv_importDirective_0_0 = null;

        EObject lv_contract_1_0 = null;

        EObject lv_library_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:78:2: ( ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )* )
            // InternalTryGrammar.g:79:2: ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )*
            {
            // InternalTryGrammar.g:79:2: ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 19:
                    {
                    alt1=2;
                    }
                    break;
                case 21:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalTryGrammar.g:80:3: ( (lv_importDirective_0_0= ruleImportDirective ) )
            	    {
            	    // InternalTryGrammar.g:80:3: ( (lv_importDirective_0_0= ruleImportDirective ) )
            	    // InternalTryGrammar.g:81:4: (lv_importDirective_0_0= ruleImportDirective )
            	    {
            	    // InternalTryGrammar.g:81:4: (lv_importDirective_0_0= ruleImportDirective )
            	    // InternalTryGrammar.g:82:5: lv_importDirective_0_0= ruleImportDirective
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSolidityAccess().getImportDirectiveImportDirectiveParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_importDirective_0_0=ruleImportDirective();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSolidityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"importDirective",
            	      						lv_importDirective_0_0,
            	      						"org.unicam.tryGrammar.TryGrammar.ImportDirective");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTryGrammar.g:100:3: ( (lv_contract_1_0= ruleContract ) )
            	    {
            	    // InternalTryGrammar.g:100:3: ( (lv_contract_1_0= ruleContract ) )
            	    // InternalTryGrammar.g:101:4: (lv_contract_1_0= ruleContract )
            	    {
            	    // InternalTryGrammar.g:101:4: (lv_contract_1_0= ruleContract )
            	    // InternalTryGrammar.g:102:5: lv_contract_1_0= ruleContract
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSolidityAccess().getContractContractParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_contract_1_0=ruleContract();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSolidityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"contract",
            	      						lv_contract_1_0,
            	      						"org.unicam.tryGrammar.TryGrammar.Contract");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTryGrammar.g:120:3: ( (lv_library_2_0= ruleLibrary ) )
            	    {
            	    // InternalTryGrammar.g:120:3: ( (lv_library_2_0= ruleLibrary ) )
            	    // InternalTryGrammar.g:121:4: (lv_library_2_0= ruleLibrary )
            	    {
            	    // InternalTryGrammar.g:121:4: (lv_library_2_0= ruleLibrary )
            	    // InternalTryGrammar.g:122:5: lv_library_2_0= ruleLibrary
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSolidityAccess().getLibraryLibraryParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_library_2_0=ruleLibrary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSolidityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"library",
            	      						lv_library_2_0,
            	      						"org.unicam.tryGrammar.TryGrammar.Library");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolidity"


    // $ANTLR start "entryRuleImportDirective"
    // InternalTryGrammar.g:143:1: entryRuleImportDirective returns [EObject current=null] : iv_ruleImportDirective= ruleImportDirective EOF ;
    public final EObject entryRuleImportDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDirective = null;


        try {
            // InternalTryGrammar.g:143:56: (iv_ruleImportDirective= ruleImportDirective EOF )
            // InternalTryGrammar.g:144:2: iv_ruleImportDirective= ruleImportDirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDirectiveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportDirective=ruleImportDirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDirective; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDirective"


    // $ANTLR start "ruleImportDirective"
    // InternalTryGrammar.g:150:1: ruleImportDirective returns [EObject current=null] : ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) ) ;
    public final EObject ruleImportDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_unitAlias_6_0=null;
        Token otherlv_7=null;
        Token lv_importURI_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_importURI_17_0=null;
        Token otherlv_18=null;
        EObject lv_symbolAliases_12_0 = null;

        EObject lv_symbolAliases_14_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:156:2: ( ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) ) )
            // InternalTryGrammar.g:157:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) )
            {
            // InternalTryGrammar.g:157:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt3=3;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt3=1;
                    }
                    break;
                case 13:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTryGrammar.g:158:3: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
                    {
                    // InternalTryGrammar.g:158:3: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
                    // InternalTryGrammar.g:159:4: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getImportDirectiveAccess().getImportKeyword_0_0());
                      			
                    }
                    // InternalTryGrammar.g:163:4: ( (lv_importURI_1_0= RULE_STRING ) )
                    // InternalTryGrammar.g:164:5: (lv_importURI_1_0= RULE_STRING )
                    {
                    // InternalTryGrammar.g:164:5: (lv_importURI_1_0= RULE_STRING )
                    // InternalTryGrammar.g:165:6: lv_importURI_1_0= RULE_STRING
                    {
                    lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_importURI_1_0, grammarAccess.getImportDirectiveAccess().getImportURISTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportDirectiveRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"importURI",
                      							lv_importURI_1_0,
                      							"org.unicam.tryGrammar.TryGrammar.STRING");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getImportDirectiveAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:187:3: (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' )
                    {
                    // InternalTryGrammar.g:187:3: (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' )
                    // InternalTryGrammar.g:188:4: otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';'
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getImportDirectiveAccess().getImportKeyword_1_0());
                      			
                    }
                    otherlv_4=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getImportDirectiveAccess().getAsteriskKeyword_1_1());
                      			
                    }
                    otherlv_5=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getImportDirectiveAccess().getAsKeyword_1_2());
                      			
                    }
                    // InternalTryGrammar.g:200:4: ( (lv_unitAlias_6_0= RULE_ID ) )
                    // InternalTryGrammar.g:201:5: (lv_unitAlias_6_0= RULE_ID )
                    {
                    // InternalTryGrammar.g:201:5: (lv_unitAlias_6_0= RULE_ID )
                    // InternalTryGrammar.g:202:6: lv_unitAlias_6_0= RULE_ID
                    {
                    lv_unitAlias_6_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unitAlias_6_0, grammarAccess.getImportDirectiveAccess().getUnitAliasIDTerminalRuleCall_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportDirectiveRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"unitAlias",
                      							lv_unitAlias_6_0,
                      							"org.unicam.tryGrammar.TryGrammar.ID");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getImportDirectiveAccess().getFromKeyword_1_4());
                      			
                    }
                    // InternalTryGrammar.g:222:4: ( (lv_importURI_8_0= RULE_STRING ) )
                    // InternalTryGrammar.g:223:5: (lv_importURI_8_0= RULE_STRING )
                    {
                    // InternalTryGrammar.g:223:5: (lv_importURI_8_0= RULE_STRING )
                    // InternalTryGrammar.g:224:6: lv_importURI_8_0= RULE_STRING
                    {
                    lv_importURI_8_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_importURI_8_0, grammarAccess.getImportDirectiveAccess().getImportURISTRINGTerminalRuleCall_1_5_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportDirectiveRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"importURI",
                      							lv_importURI_8_0,
                      							"org.unicam.tryGrammar.TryGrammar.STRING");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getImportDirectiveAccess().getSemicolonKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:246:3: (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' )
                    {
                    // InternalTryGrammar.g:246:3: (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' )
                    // InternalTryGrammar.g:247:4: otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_10=(Token)match(input,11,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getImportDirectiveAccess().getImportKeyword_2_0());
                      			
                    }
                    otherlv_11=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getImportDirectiveAccess().getLeftCurlyBracketKeyword_2_1());
                      			
                    }
                    // InternalTryGrammar.g:255:4: ( (lv_symbolAliases_12_0= ruleSymbolAlias ) )
                    // InternalTryGrammar.g:256:5: (lv_symbolAliases_12_0= ruleSymbolAlias )
                    {
                    // InternalTryGrammar.g:256:5: (lv_symbolAliases_12_0= ruleSymbolAlias )
                    // InternalTryGrammar.g:257:6: lv_symbolAliases_12_0= ruleSymbolAlias
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportDirectiveAccess().getSymbolAliasesSymbolAliasParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_symbolAliases_12_0=ruleSymbolAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getImportDirectiveRule());
                      						}
                      						add(
                      							current,
                      							"symbolAliases",
                      							lv_symbolAliases_12_0,
                      							"org.unicam.tryGrammar.TryGrammar.SymbolAlias");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryGrammar.g:274:4: (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==17) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalTryGrammar.g:275:5: otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) )
                            {
                            otherlv_13=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getImportDirectiveAccess().getCommaKeyword_2_3_0());
                              				
                            }
                            // InternalTryGrammar.g:279:5: ( (lv_symbolAliases_14_0= ruleSymbolAlias ) )
                            // InternalTryGrammar.g:280:6: (lv_symbolAliases_14_0= ruleSymbolAlias )
                            {
                            // InternalTryGrammar.g:280:6: (lv_symbolAliases_14_0= ruleSymbolAlias )
                            // InternalTryGrammar.g:281:7: lv_symbolAliases_14_0= ruleSymbolAlias
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getImportDirectiveAccess().getSymbolAliasesSymbolAliasParserRuleCall_2_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
                            lv_symbolAliases_14_0=ruleSymbolAlias();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getImportDirectiveRule());
                              							}
                              							add(
                              								current,
                              								"symbolAliases",
                              								lv_symbolAliases_14_0,
                              								"org.unicam.tryGrammar.TryGrammar.SymbolAlias");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getImportDirectiveAccess().getRightCurlyBracketKeyword_2_4());
                      			
                    }
                    otherlv_16=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getImportDirectiveAccess().getFromKeyword_2_5());
                      			
                    }
                    // InternalTryGrammar.g:307:4: ( (lv_importURI_17_0= RULE_STRING ) )
                    // InternalTryGrammar.g:308:5: (lv_importURI_17_0= RULE_STRING )
                    {
                    // InternalTryGrammar.g:308:5: (lv_importURI_17_0= RULE_STRING )
                    // InternalTryGrammar.g:309:6: lv_importURI_17_0= RULE_STRING
                    {
                    lv_importURI_17_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_importURI_17_0, grammarAccess.getImportDirectiveAccess().getImportURISTRINGTerminalRuleCall_2_6_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportDirectiveRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"importURI",
                      							lv_importURI_17_0,
                      							"org.unicam.tryGrammar.TryGrammar.STRING");
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getImportDirectiveAccess().getSemicolonKeyword_2_7());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDirective"


    // $ANTLR start "entryRuleSymbolAlias"
    // InternalTryGrammar.g:334:1: entryRuleSymbolAlias returns [EObject current=null] : iv_ruleSymbolAlias= ruleSymbolAlias EOF ;
    public final EObject entryRuleSymbolAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolAlias = null;


        try {
            // InternalTryGrammar.g:334:52: (iv_ruleSymbolAlias= ruleSymbolAlias EOF )
            // InternalTryGrammar.g:335:2: iv_ruleSymbolAlias= ruleSymbolAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolAliasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSymbolAlias=ruleSymbolAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolAlias; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbolAlias"


    // $ANTLR start "ruleSymbolAlias"
    // InternalTryGrammar.g:341:1: ruleSymbolAlias returns [EObject current=null] : ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSymbolAlias() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:347:2: ( ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) ) )
            // InternalTryGrammar.g:348:2: ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )
            {
            // InternalTryGrammar.g:348:2: ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )
            // InternalTryGrammar.g:349:3: ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
            {
            // InternalTryGrammar.g:349:3: ( (lv_symbol_0_0= RULE_ID ) )
            // InternalTryGrammar.g:350:4: (lv_symbol_0_0= RULE_ID )
            {
            // InternalTryGrammar.g:350:4: (lv_symbol_0_0= RULE_ID )
            // InternalTryGrammar.g:351:5: lv_symbol_0_0= RULE_ID
            {
            lv_symbol_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_symbol_0_0, grammarAccess.getSymbolAliasAccess().getSymbolIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSymbolAliasRule());
              					}
              					setWithLastConsumed(
              						current,
              						"symbol",
              						lv_symbol_0_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSymbolAliasAccess().getAsKeyword_1());
              		
            }
            // InternalTryGrammar.g:371:3: ( (lv_alias_2_0= RULE_ID ) )
            // InternalTryGrammar.g:372:4: (lv_alias_2_0= RULE_ID )
            {
            // InternalTryGrammar.g:372:4: (lv_alias_2_0= RULE_ID )
            // InternalTryGrammar.g:373:5: lv_alias_2_0= RULE_ID
            {
            lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_alias_2_0, grammarAccess.getSymbolAliasAccess().getAliasIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSymbolAliasRule());
              					}
              					setWithLastConsumed(
              						current,
              						"alias",
              						lv_alias_2_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbolAlias"


    // $ANTLR start "entryRuleContract"
    // InternalTryGrammar.g:393:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalTryGrammar.g:393:49: (iv_ruleContract= ruleContract EOF )
            // InternalTryGrammar.g:394:2: iv_ruleContract= ruleContract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContract=ruleContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalTryGrammar.g:400:1: ruleContract returns [EObject current=null] : (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inheritanceSpecifiers_3_0 = null;

        EObject lv_inheritanceSpecifiers_5_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:406:2: ( (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) )
            // InternalTryGrammar.g:407:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            {
            // InternalTryGrammar.g:407:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            // InternalTryGrammar.g:408:3: otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
              		
            }
            // InternalTryGrammar.g:412:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:413:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:413:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:414:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getContractAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContractRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            // InternalTryGrammar.g:430:3: (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTryGrammar.g:431:4: otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContractAccess().getIsKeyword_2_0());
                      			
                    }
                    // InternalTryGrammar.g:435:4: ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) )
                    // InternalTryGrammar.g:436:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    {
                    // InternalTryGrammar.g:436:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    // InternalTryGrammar.g:437:6: lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContractAccess().getInheritanceSpecifiersInheritanceSpecifierParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_inheritanceSpecifiers_3_0=ruleInheritanceSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getContractRule());
                      						}
                      						add(
                      							current,
                      							"inheritanceSpecifiers",
                      							lv_inheritanceSpecifiers_3_0,
                      							"org.unicam.tryGrammar.TryGrammar.InheritanceSpecifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryGrammar.g:454:4: (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTryGrammar.g:455:5: otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getContractAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:459:5: ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    // InternalTryGrammar.g:460:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    {
                    	    // InternalTryGrammar.g:460:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    // InternalTryGrammar.g:461:7: lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContractAccess().getInheritanceSpecifiersInheritanceSpecifierParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_inheritanceSpecifiers_5_0=ruleInheritanceSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getContractRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"inheritanceSpecifiers",
                    	      								lv_inheritanceSpecifiers_5_0,
                    	      								"org.unicam.tryGrammar.TryGrammar.InheritanceSpecifier");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTryGrammar.g:480:3: ( (lv_body_6_0= ruleDefinitionBody ) )
            // InternalTryGrammar.g:481:4: (lv_body_6_0= ruleDefinitionBody )
            {
            // InternalTryGrammar.g:481:4: (lv_body_6_0= ruleDefinitionBody )
            // InternalTryGrammar.g:482:5: lv_body_6_0= ruleDefinitionBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContractAccess().getBodyDefinitionBodyParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleDefinitionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContractRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_6_0,
              						"org.unicam.tryGrammar.TryGrammar.DefinitionBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRuleLibrary"
    // InternalTryGrammar.g:503:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalTryGrammar.g:503:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalTryGrammar.g:504:2: iv_ruleLibrary= ruleLibrary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibrary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalTryGrammar.g:510:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inheritanceSpecifiers_3_0 = null;

        EObject lv_inheritanceSpecifiers_5_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:516:2: ( (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) )
            // InternalTryGrammar.g:517:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            {
            // InternalTryGrammar.g:517:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            // InternalTryGrammar.g:518:3: otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
              		
            }
            // InternalTryGrammar.g:522:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:523:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:523:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:524:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLibraryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            // InternalTryGrammar.g:540:3: (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTryGrammar.g:541:4: otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getIsKeyword_2_0());
                      			
                    }
                    // InternalTryGrammar.g:545:4: ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) )
                    // InternalTryGrammar.g:546:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    {
                    // InternalTryGrammar.g:546:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    // InternalTryGrammar.g:547:6: lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLibraryAccess().getInheritanceSpecifiersInheritanceSpecifierParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_inheritanceSpecifiers_3_0=ruleInheritanceSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLibraryRule());
                      						}
                      						add(
                      							current,
                      							"inheritanceSpecifiers",
                      							lv_inheritanceSpecifiers_3_0,
                      							"org.unicam.tryGrammar.TryGrammar.InheritanceSpecifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryGrammar.g:564:4: (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTryGrammar.g:565:5: otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:569:5: ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    // InternalTryGrammar.g:570:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    {
                    	    // InternalTryGrammar.g:570:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    // InternalTryGrammar.g:571:7: lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLibraryAccess().getInheritanceSpecifiersInheritanceSpecifierParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_inheritanceSpecifiers_5_0=ruleInheritanceSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"inheritanceSpecifiers",
                    	      								lv_inheritanceSpecifiers_5_0,
                    	      								"org.unicam.tryGrammar.TryGrammar.InheritanceSpecifier");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTryGrammar.g:590:3: ( (lv_body_6_0= ruleDefinitionBody ) )
            // InternalTryGrammar.g:591:4: (lv_body_6_0= ruleDefinitionBody )
            {
            // InternalTryGrammar.g:591:4: (lv_body_6_0= ruleDefinitionBody )
            // InternalTryGrammar.g:592:5: lv_body_6_0= ruleDefinitionBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLibraryAccess().getBodyDefinitionBodyParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleDefinitionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLibraryRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_6_0,
              						"org.unicam.tryGrammar.TryGrammar.DefinitionBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleDefinitionBody"
    // InternalTryGrammar.g:613:1: entryRuleDefinitionBody returns [EObject current=null] : iv_ruleDefinitionBody= ruleDefinitionBody EOF ;
    public final EObject entryRuleDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionBody = null;


        try {
            // InternalTryGrammar.g:613:55: (iv_ruleDefinitionBody= ruleDefinitionBody EOF )
            // InternalTryGrammar.g:614:2: iv_ruleDefinitionBody= ruleDefinitionBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionBody=ruleDefinitionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitionBody"


    // $ANTLR start "ruleDefinitionBody"
    // InternalTryGrammar.g:620:1: ruleDefinitionBody returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_functions_2_0 = null;

        EObject lv_structs_3_0 = null;

        EObject lv_enums_4_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_modifiers_7_0 = null;

        EObject lv_events_8_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:626:2: ( ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) )
            // InternalTryGrammar.g:627:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            {
            // InternalTryGrammar.g:627:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            // InternalTryGrammar.g:628:3: () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}'
            {
            // InternalTryGrammar.g:628:3: ()
            // InternalTryGrammar.g:629:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDefinitionBodyAccess().getDefinitionBodyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefinitionBodyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalTryGrammar.g:639:3: ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )*
            loop8:
            do {
                int alt8=7;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    alt8=1;
                    }
                    break;
                case 28:
                    {
                    alt8=2;
                    }
                    break;
                case 29:
                    {
                    alt8=3;
                    }
                    break;
                case RULE_ID:
                case 32:
                case 36:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 132:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                    {
                    alt8=4;
                    }
                    break;
                case 38:
                    {
                    alt8=5;
                    }
                    break;
                case 39:
                    {
                    alt8=6;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalTryGrammar.g:640:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    {
            	    // InternalTryGrammar.g:640:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    // InternalTryGrammar.g:641:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    {
            	    // InternalTryGrammar.g:641:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    // InternalTryGrammar.g:642:6: lv_functions_2_0= ruleFunctionDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getFunctionsFunctionDefinitionParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_functions_2_0=ruleFunctionDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDefinitionBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"functions",
            	      							lv_functions_2_0,
            	      							"org.unicam.tryGrammar.TryGrammar.FunctionDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTryGrammar.g:660:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    {
            	    // InternalTryGrammar.g:660:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    // InternalTryGrammar.g:661:5: (lv_structs_3_0= ruleStructDefinition )
            	    {
            	    // InternalTryGrammar.g:661:5: (lv_structs_3_0= ruleStructDefinition )
            	    // InternalTryGrammar.g:662:6: lv_structs_3_0= ruleStructDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getStructsStructDefinitionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_structs_3_0=ruleStructDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDefinitionBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"structs",
            	      							lv_structs_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.StructDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTryGrammar.g:680:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    {
            	    // InternalTryGrammar.g:680:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    // InternalTryGrammar.g:681:5: (lv_enums_4_0= ruleEnumDefinition )
            	    {
            	    // InternalTryGrammar.g:681:5: (lv_enums_4_0= ruleEnumDefinition )
            	    // InternalTryGrammar.g:682:6: lv_enums_4_0= ruleEnumDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getEnumsEnumDefinitionParserRuleCall_2_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_enums_4_0=ruleEnumDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDefinitionBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"enums",
            	      							lv_enums_4_0,
            	      							"org.unicam.tryGrammar.TryGrammar.EnumDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTryGrammar.g:700:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    {
            	    // InternalTryGrammar.g:700:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    // InternalTryGrammar.g:701:5: ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';'
            	    {
            	    // InternalTryGrammar.g:701:5: ( (lv_variables_5_0= ruleVariableDeclaration ) )
            	    // InternalTryGrammar.g:702:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    {
            	    // InternalTryGrammar.g:702:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    // InternalTryGrammar.g:703:7: lv_variables_5_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDefinitionBodyAccess().getVariablesVariableDeclarationParserRuleCall_2_3_0_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_variables_5_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getDefinitionBodyRule());
            	      							}
            	      							add(
            	      								current,
            	      								"variables",
            	      								lv_variables_5_0,
            	      								"org.unicam.tryGrammar.TryGrammar.VariableDeclaration");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,12,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getDefinitionBodyAccess().getSemicolonKeyword_2_3_1());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTryGrammar.g:726:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    {
            	    // InternalTryGrammar.g:726:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    // InternalTryGrammar.g:727:5: (lv_modifiers_7_0= ruleModifier )
            	    {
            	    // InternalTryGrammar.g:727:5: (lv_modifiers_7_0= ruleModifier )
            	    // InternalTryGrammar.g:728:6: lv_modifiers_7_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getModifiersModifierParserRuleCall_2_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_modifiers_7_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDefinitionBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"modifiers",
            	      							lv_modifiers_7_0,
            	      							"org.unicam.tryGrammar.TryGrammar.Modifier");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalTryGrammar.g:746:4: ( (lv_events_8_0= ruleEvent ) )
            	    {
            	    // InternalTryGrammar.g:746:4: ( (lv_events_8_0= ruleEvent ) )
            	    // InternalTryGrammar.g:747:5: (lv_events_8_0= ruleEvent )
            	    {
            	    // InternalTryGrammar.g:747:5: (lv_events_8_0= ruleEvent )
            	    // InternalTryGrammar.g:748:6: lv_events_8_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getEventsEventParserRuleCall_2_5_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_events_8_0=ruleEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDefinitionBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"events",
            	      							lv_events_8_0,
            	      							"org.unicam.tryGrammar.TryGrammar.Event");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDefinitionBodyAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitionBody"


    // $ANTLR start "entryRuleInheritanceSpecifier"
    // InternalTryGrammar.g:774:1: entryRuleInheritanceSpecifier returns [EObject current=null] : iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF ;
    public final EObject entryRuleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceSpecifier = null;


        try {
            // InternalTryGrammar.g:774:61: (iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF )
            // InternalTryGrammar.g:775:2: iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInheritanceSpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInheritanceSpecifier=ruleInheritanceSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInheritanceSpecifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInheritanceSpecifier"


    // $ANTLR start "ruleInheritanceSpecifier"
    // InternalTryGrammar.g:781:1: ruleInheritanceSpecifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:787:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalTryGrammar.g:788:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalTryGrammar.g:788:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalTryGrammar.g:789:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalTryGrammar.g:789:3: ( (otherlv_0= RULE_ID ) )
            // InternalTryGrammar.g:790:4: (otherlv_0= RULE_ID )
            {
            // InternalTryGrammar.g:790:4: (otherlv_0= RULE_ID )
            // InternalTryGrammar.g:791:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInheritanceSpecifierRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getInheritanceSpecifierAccess().getSuperTypeContractOrLibraryCrossReference_0_0());
              				
            }

            }


            }

            // InternalTryGrammar.g:802:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTryGrammar.g:803:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalTryGrammar.g:803:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalTryGrammar.g:804:5: lv_args_1_0= ruleFunctionCallListArguments
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInheritanceSpecifierAccess().getArgsFunctionCallListArgumentsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_args_1_0=ruleFunctionCallListArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInheritanceSpecifierRule());
                      					}
                      					set(
                      						current,
                      						"args",
                      						lv_args_1_0,
                      						"org.unicam.tryGrammar.TryGrammar.FunctionCallListArguments");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInheritanceSpecifier"


    // $ANTLR start "entryRuleFunctionCallListArguments"
    // InternalTryGrammar.g:825:1: entryRuleFunctionCallListArguments returns [EObject current=null] : iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF ;
    public final EObject entryRuleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallListArguments = null;


        try {
            // InternalTryGrammar.g:825:66: (iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF )
            // InternalTryGrammar.g:826:2: iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallListArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCallListArguments=ruleFunctionCallListArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallListArguments; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallListArguments"


    // $ANTLR start "ruleFunctionCallListArguments"
    // InternalTryGrammar.g:832:1: ruleFunctionCallListArguments returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:838:2: ( (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalTryGrammar.g:839:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalTryGrammar.g:839:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalTryGrammar.g:840:3: otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallListArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryGrammar.g:844:3: ()
            // InternalTryGrammar.g:845:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallListArgumentsAccess().getFunctionCallListArgumentsAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:851:3: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_INT)||LA11_0==22||(LA11_0>=57 && LA11_0<=168)||(LA11_0>=198 && LA11_0<=199)||(LA11_0>=210 && LA11_0<=214)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTryGrammar.g:852:4: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // InternalTryGrammar.g:852:4: ( (lv_arguments_2_0= ruleExpression ) )
                    // InternalTryGrammar.g:853:5: (lv_arguments_2_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:853:5: (lv_arguments_2_0= ruleExpression )
                    // InternalTryGrammar.g:854:6: lv_arguments_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallListArgumentsAccess().getArgumentsExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_arguments_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionCallListArgumentsRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_2_0,
                      							"org.unicam.tryGrammar.TryGrammar.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryGrammar.g:871:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTryGrammar.g:872:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallListArgumentsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:876:5: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // InternalTryGrammar.g:877:6: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // InternalTryGrammar.g:877:6: (lv_arguments_4_0= ruleExpression )
                    	    // InternalTryGrammar.g:878:7: lv_arguments_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallListArgumentsAccess().getArgumentsExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_arguments_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionCallListArgumentsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_4_0,
                    	      								"org.unicam.tryGrammar.TryGrammar.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFunctionCallListArgumentsAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallListArguments"


    // $ANTLR start "entryRuleFunctionCallArguments"
    // InternalTryGrammar.g:905:1: entryRuleFunctionCallArguments returns [EObject current=null] : iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF ;
    public final EObject entryRuleFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArguments = null;


        try {
            // InternalTryGrammar.g:905:62: (iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF )
            // InternalTryGrammar.g:906:2: iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCallArguments=ruleFunctionCallArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallArguments; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallArguments"


    // $ANTLR start "ruleFunctionCallArguments"
    // InternalTryGrammar.g:912:1: ruleFunctionCallArguments returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) ;
    public final EObject ruleFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject this_FunctionCallListArguments_8 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:918:2: ( ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) )
            // InternalTryGrammar.g:919:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            {
            // InternalTryGrammar.g:919:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=RULE_STRING && LA14_1<=RULE_INT)||(LA14_1>=22 && LA14_1<=23)||(LA14_1>=57 && LA14_1<=168)||(LA14_1>=198 && LA14_1<=199)||(LA14_1>=210 && LA14_1<=214)) ) {
                    alt14=2;
                }
                else if ( (LA14_1==16) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTryGrammar.g:920:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    {
                    // InternalTryGrammar.g:920:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    // InternalTryGrammar.g:921:4: otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunctionCallArgumentsAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,16,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgumentsAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalTryGrammar.g:929:4: ()
                    // InternalTryGrammar.g:930:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFunctionCallArgumentsAccess().getFunctionCallArgumentsAction_0_2(),
                      						current);
                      				
                    }

                    }

                    // InternalTryGrammar.g:936:4: ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalTryGrammar.g:937:5: ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            {
                            // InternalTryGrammar.g:937:5: ( (lv_args_3_0= ruleFunctionCallArg ) )
                            // InternalTryGrammar.g:938:6: (lv_args_3_0= ruleFunctionCallArg )
                            {
                            // InternalTryGrammar.g:938:6: (lv_args_3_0= ruleFunctionCallArg )
                            // InternalTryGrammar.g:939:7: lv_args_3_0= ruleFunctionCallArg
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFunctionCallArgumentsAccess().getArgsFunctionCallArgParserRuleCall_0_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_11);
                            lv_args_3_0=ruleFunctionCallArg();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getFunctionCallArgumentsRule());
                              							}
                              							add(
                              								current,
                              								"args",
                              								lv_args_3_0,
                              								"org.unicam.tryGrammar.TryGrammar.FunctionCallArg");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalTryGrammar.g:956:5: (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==17) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalTryGrammar.g:957:6: otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    {
                            	    otherlv_4=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallArgumentsAccess().getCommaKeyword_0_3_1_0());
                            	      					
                            	    }
                            	    // InternalTryGrammar.g:961:6: ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    // InternalTryGrammar.g:962:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    {
                            	    // InternalTryGrammar.g:962:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    // InternalTryGrammar.g:963:8: lv_args_5_0= ruleFunctionCallArg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getFunctionCallArgumentsAccess().getArgsFunctionCallArgParserRuleCall_0_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_11);
                            	    lv_args_5_0=ruleFunctionCallArg();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getFunctionCallArgumentsRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"args",
                            	      									lv_args_5_0,
                            	      									"org.unicam.tryGrammar.TryGrammar.FunctionCallArg");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFunctionCallArgumentsAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }
                    otherlv_7=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFunctionCallArgumentsAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:992:3: this_FunctionCallListArguments_8= ruleFunctionCallListArguments
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionCallArgumentsAccess().getFunctionCallListArgumentsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCallListArguments_8=ruleFunctionCallListArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCallListArguments_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallArguments"


    // $ANTLR start "entryRuleFunctionCallArg"
    // InternalTryGrammar.g:1004:1: entryRuleFunctionCallArg returns [EObject current=null] : iv_ruleFunctionCallArg= ruleFunctionCallArg EOF ;
    public final EObject entryRuleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArg = null;


        try {
            // InternalTryGrammar.g:1004:56: (iv_ruleFunctionCallArg= ruleFunctionCallArg EOF )
            // InternalTryGrammar.g:1005:2: iv_ruleFunctionCallArg= ruleFunctionCallArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallArgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCallArg=ruleFunctionCallArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallArg; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallArg"


    // $ANTLR start "ruleFunctionCallArg"
    // InternalTryGrammar.g:1011:1: ruleFunctionCallArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1017:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalTryGrammar.g:1018:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalTryGrammar.g:1018:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalTryGrammar.g:1019:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalTryGrammar.g:1019:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTryGrammar.g:1020:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTryGrammar.g:1020:4: (lv_name_0_0= RULE_ID )
            // InternalTryGrammar.g:1021:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFunctionCallArgAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallArgRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgAccess().getColonKeyword_1());
              		
            }
            // InternalTryGrammar.g:1041:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalTryGrammar.g:1042:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalTryGrammar.g:1042:4: (lv_expr_2_0= ruleExpression )
            // InternalTryGrammar.g:1043:5: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionCallArgAccess().getExprExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionCallArgRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"org.unicam.tryGrammar.TryGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallArg"


    // $ANTLR start "entryRuleFunctionDefinition"
    // InternalTryGrammar.g:1064:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // InternalTryGrammar.g:1064:59: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // InternalTryGrammar.g:1065:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // InternalTryGrammar.g:1071:1: ruleFunctionDefinition returns [EObject current=null] : (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' ) ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_optionalElements_4_0 = null;

        EObject lv_returnParameters_6_0 = null;

        EObject lv_block_7_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1077:2: ( (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' ) ) )
            // InternalTryGrammar.g:1078:2: (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' ) )
            {
            // InternalTryGrammar.g:1078:2: (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' ) )
            // InternalTryGrammar.g:1079:3: otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionDefinitionAccess().getFunctionKeyword_0());
              		
            }
            // InternalTryGrammar.g:1083:3: ()
            // InternalTryGrammar.g:1084:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:1090:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTryGrammar.g:1091:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalTryGrammar.g:1091:4: (lv_name_2_0= RULE_ID )
                    // InternalTryGrammar.g:1092:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_2_0, grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionDefinitionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_2_0,
                      						"org.unicam.tryGrammar.TryGrammar.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryGrammar.g:1108:3: ( (lv_parameters_3_0= ruleParameterList ) )
            // InternalTryGrammar.g:1109:4: (lv_parameters_3_0= ruleParameterList )
            {
            // InternalTryGrammar.g:1109:4: (lv_parameters_3_0= ruleParameterList )
            // InternalTryGrammar.g:1110:5: lv_parameters_3_0= ruleParameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersParameterListParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_parameters_3_0=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"parameters",
              						lv_parameters_3_0,
              						"org.unicam.tryGrammar.TryGrammar.ParameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1127:3: ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==27||(LA16_0>=171 && LA16_0<=174)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTryGrammar.g:1128:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    {
            	    // InternalTryGrammar.g:1128:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    // InternalTryGrammar.g:1129:5: lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOptionalElementsFunctionDefinitionOptionalElementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_optionalElements_4_0=ruleFunctionDefinitionOptionalElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"optionalElements",
            	      						lv_optionalElements_4_0,
            	      						"org.unicam.tryGrammar.TryGrammar.FunctionDefinitionOptionalElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalTryGrammar.g:1146:3: (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTryGrammar.g:1147:4: otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getReturnsKeyword_5_0());
                      			
                    }
                    // InternalTryGrammar.g:1151:4: ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    // InternalTryGrammar.g:1152:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    {
                    // InternalTryGrammar.g:1152:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    // InternalTryGrammar.g:1153:6: lv_returnParameters_6_0= ruleReturnsParameterList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnParametersReturnsParameterListParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_returnParameters_6_0=ruleReturnsParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"returnParameters",
                      							lv_returnParameters_6_0,
                      							"org.unicam.tryGrammar.TryGrammar.ReturnsParameterList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTryGrammar.g:1171:3: ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            else if ( (LA18_0==12) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTryGrammar.g:1172:4: ( (lv_block_7_0= ruleBlock ) )
                    {
                    // InternalTryGrammar.g:1172:4: ( (lv_block_7_0= ruleBlock ) )
                    // InternalTryGrammar.g:1173:5: (lv_block_7_0= ruleBlock )
                    {
                    // InternalTryGrammar.g:1173:5: (lv_block_7_0= ruleBlock )
                    // InternalTryGrammar.g:1174:6: lv_block_7_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBlockBlockParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_7_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_7_0,
                      							"org.unicam.tryGrammar.TryGrammar.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:1192:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getFunctionDefinitionAccess().getSemicolonKeyword_6_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleFunctionDefinitionOptionalElement"
    // InternalTryGrammar.g:1201:1: entryRuleFunctionDefinitionOptionalElement returns [EObject current=null] : iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF ;
    public final EObject entryRuleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOptionalElement = null;


        try {
            // InternalTryGrammar.g:1201:74: (iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF )
            // InternalTryGrammar.g:1202:2: iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDefinitionOptionalElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDefinitionOptionalElement=ruleFunctionDefinitionOptionalElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDefinitionOptionalElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDefinitionOptionalElement"


    // $ANTLR start "ruleFunctionDefinitionOptionalElement"
    // InternalTryGrammar.g:1208:1: ruleFunctionDefinitionOptionalElement returns [EObject current=null] : (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) ;
    public final EObject ruleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_ModifierInvocation_1 = null;

        EObject this_VisibilitySpecifier_2 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1214:2: ( (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) )
            // InternalTryGrammar.g:1215:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            {
            // InternalTryGrammar.g:1215:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
                {
                alt19=2;
                }
                break;
            case 171:
            case 172:
            case 173:
            case 174:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalTryGrammar.g:1216:3: this_Const_0= ruleConst
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionDefinitionOptionalElementAccess().getConstParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Const_0=ruleConst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Const_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:1225:3: this_ModifierInvocation_1= ruleModifierInvocation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionDefinitionOptionalElementAccess().getModifierInvocationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ModifierInvocation_1=ruleModifierInvocation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModifierInvocation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:1234:3: this_VisibilitySpecifier_2= ruleVisibilitySpecifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionDefinitionOptionalElementAccess().getVisibilitySpecifierParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VisibilitySpecifier_2=ruleVisibilitySpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VisibilitySpecifier_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDefinitionOptionalElement"


    // $ANTLR start "entryRuleConst"
    // InternalTryGrammar.g:1246:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalTryGrammar.g:1246:46: (iv_ruleConst= ruleConst EOF )
            // InternalTryGrammar.g:1247:2: iv_ruleConst= ruleConst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConst=ruleConst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConst; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalTryGrammar.g:1253:1: ruleConst returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:1259:2: ( (otherlv_0= 'constant' () ) )
            // InternalTryGrammar.g:1260:2: (otherlv_0= 'constant' () )
            {
            // InternalTryGrammar.g:1260:2: (otherlv_0= 'constant' () )
            // InternalTryGrammar.g:1261:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstAccess().getConstantKeyword_0());
              		
            }
            // InternalTryGrammar.g:1265:3: ()
            // InternalTryGrammar.g:1266:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConstAccess().getConstAction_1(),
              					current);
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleVisibilitySpecifier"
    // InternalTryGrammar.g:1276:1: entryRuleVisibilitySpecifier returns [EObject current=null] : iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF ;
    public final EObject entryRuleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilitySpecifier = null;


        try {
            // InternalTryGrammar.g:1276:60: (iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF )
            // InternalTryGrammar.g:1277:2: iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisibilitySpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVisibilitySpecifier=ruleVisibilitySpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisibilitySpecifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibilitySpecifier"


    // $ANTLR start "ruleVisibilitySpecifier"
    // InternalTryGrammar.g:1283:1: ruleVisibilitySpecifier returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ;
    public final EObject ruleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1289:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) )
            // InternalTryGrammar.g:1290:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            {
            // InternalTryGrammar.g:1290:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            // InternalTryGrammar.g:1291:3: (lv_visibility_0_0= ruleVisibilityEnum )
            {
            // InternalTryGrammar.g:1291:3: (lv_visibility_0_0= ruleVisibilityEnum )
            // InternalTryGrammar.g:1292:4: lv_visibility_0_0= ruleVisibilityEnum
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getVisibilitySpecifierAccess().getVisibilityVisibilityEnumEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_visibility_0_0=ruleVisibilityEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getVisibilitySpecifierRule());
              				}
              				set(
              					current,
              					"visibility",
              					lv_visibility_0_0,
              					"org.unicam.tryGrammar.TryGrammar.VisibilityEnum");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilitySpecifier"


    // $ANTLR start "entryRuleStructDefinition"
    // InternalTryGrammar.g:1312:1: entryRuleStructDefinition returns [EObject current=null] : iv_ruleStructDefinition= ruleStructDefinition EOF ;
    public final EObject entryRuleStructDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDefinition = null;


        try {
            // InternalTryGrammar.g:1312:57: (iv_ruleStructDefinition= ruleStructDefinition EOF )
            // InternalTryGrammar.g:1313:2: iv_ruleStructDefinition= ruleStructDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStructDefinition=ruleStructDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructDefinition"


    // $ANTLR start "ruleStructDefinition"
    // InternalTryGrammar.g:1319:1: ruleStructDefinition returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleStructDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1325:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // InternalTryGrammar.g:1326:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // InternalTryGrammar.g:1326:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // InternalTryGrammar.g:1327:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStructDefinitionAccess().getStructKeyword_0());
              		
            }
            // InternalTryGrammar.g:1331:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:1332:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:1332:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:1333:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getStructDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStructDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStructDefinitionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalTryGrammar.g:1353:3: ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==32||LA20_0==36||(LA20_0>=65 && LA20_0<=168)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTryGrammar.g:1354:4: ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';'
            	    {
            	    // InternalTryGrammar.g:1354:4: ( (lv_members_3_0= ruleVariableDeclaration ) )
            	    // InternalTryGrammar.g:1355:5: (lv_members_3_0= ruleVariableDeclaration )
            	    {
            	    // InternalTryGrammar.g:1355:5: (lv_members_3_0= ruleVariableDeclaration )
            	    // InternalTryGrammar.g:1356:6: lv_members_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStructDefinitionAccess().getMembersVariableDeclarationParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_members_3_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStructDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"members",
            	      							lv_members_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.VariableDeclaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,12,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getStructDefinitionAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getStructDefinitionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructDefinition"


    // $ANTLR start "entryRuleEnumDefinition"
    // InternalTryGrammar.g:1386:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // InternalTryGrammar.g:1386:55: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // InternalTryGrammar.g:1387:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumDefinition=ruleEnumDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumDefinition"


    // $ANTLR start "ruleEnumDefinition"
    // InternalTryGrammar.g:1393:1: ruleEnumDefinition returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_3_0 = null;

        EObject lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1399:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' ) )
            // InternalTryGrammar.g:1400:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' )
            {
            // InternalTryGrammar.g:1400:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' )
            // InternalTryGrammar.g:1401:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0());
              		
            }
            // InternalTryGrammar.g:1405:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:1406:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:1406:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:1407:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEnumDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalTryGrammar.g:1427:3: ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTryGrammar.g:1428:4: ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )*
                    {
                    // InternalTryGrammar.g:1428:4: ( (lv_members_3_0= ruleEnumValue ) )
                    // InternalTryGrammar.g:1429:5: (lv_members_3_0= ruleEnumValue )
                    {
                    // InternalTryGrammar.g:1429:5: (lv_members_3_0= ruleEnumValue )
                    // InternalTryGrammar.g:1430:6: lv_members_3_0= ruleEnumValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_members_3_0=ruleEnumValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnumDefinitionRule());
                      						}
                      						add(
                      							current,
                      							"members",
                      							lv_members_3_0,
                      							"org.unicam.tryGrammar.TryGrammar.EnumValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryGrammar.g:1447:4: (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==17) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalTryGrammar.g:1448:5: otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getEnumDefinitionAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:1452:5: ( (lv_members_5_0= ruleEnumValue ) )
                    	    // InternalTryGrammar.g:1453:6: (lv_members_5_0= ruleEnumValue )
                    	    {
                    	    // InternalTryGrammar.g:1453:6: (lv_members_5_0= ruleEnumValue )
                    	    // InternalTryGrammar.g:1454:7: lv_members_5_0= ruleEnumValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_members_5_0=ruleEnumValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnumDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"members",
                    	      								lv_members_5_0,
                    	      								"org.unicam.tryGrammar.TryGrammar.EnumValue");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumDefinition"


    // $ANTLR start "entryRuleEnumValue"
    // InternalTryGrammar.g:1481:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalTryGrammar.g:1481:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalTryGrammar.g:1482:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalTryGrammar.g:1488:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:1494:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTryGrammar.g:1495:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTryGrammar.g:1495:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTryGrammar.g:1496:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTryGrammar.g:1496:3: (lv_name_0_0= RULE_ID )
            // InternalTryGrammar.g:1497:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getEnumValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.unicam.tryGrammar.TryGrammar.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleVariable"
    // InternalTryGrammar.g:1516:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTryGrammar.g:1516:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTryGrammar.g:1517:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTryGrammar.g:1523:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:1529:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTryGrammar.g:1530:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTryGrammar.g:1530:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTryGrammar.g:1531:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTryGrammar.g:1531:3: (lv_name_0_0= RULE_ID )
            // InternalTryGrammar.g:1532:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.unicam.tryGrammar.TryGrammar.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTryGrammar.g:1551:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTryGrammar.g:1551:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTryGrammar.g:1552:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalTryGrammar.g:1558:1: ruleVariableDeclaration returns [EObject current=null] : (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_StandardVariableDeclaration_0 = null;

        EObject this_VarVariableDeclaration_1 = null;

        EObject this_VarVariableTupleVariableDeclaration_2 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1564:2: ( (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) )
            // InternalTryGrammar.g:1565:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            {
            // InternalTryGrammar.g:1565:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==32||(LA23_0>=65 && LA23_0<=168)) ) {
                alt23=1;
            }
            else if ( (LA23_0==36) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==RULE_ID) ) {
                    alt23=2;
                }
                else if ( (LA23_2==22) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTryGrammar.g:1566:3: this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableDeclarationAccess().getStandardVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StandardVariableDeclaration_0=ruleStandardVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StandardVariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:1575:3: this_VarVariableDeclaration_1= ruleVarVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVarVariableDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VarVariableDeclaration_1=ruleVarVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VarVariableDeclaration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:1584:3: this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVarVariableTupleVariableDeclarationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VarVariableTupleVariableDeclaration_2=ruleVarVariableTupleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VarVariableTupleVariableDeclaration_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleStandardVariableDeclaration"
    // InternalTryGrammar.g:1596:1: entryRuleStandardVariableDeclaration returns [EObject current=null] : iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF ;
    public final EObject entryRuleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardVariableDeclaration = null;


        try {
            // InternalTryGrammar.g:1596:68: (iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF )
            // InternalTryGrammar.g:1597:2: iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStandardVariableDeclaration=ruleStandardVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStandardVariableDeclaration"


    // $ANTLR start "ruleStandardVariableDeclaration"
    // InternalTryGrammar.g:1603:1: ruleStandardVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_optionalElements_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1609:2: ( ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) )
            // InternalTryGrammar.g:1610:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            {
            // InternalTryGrammar.g:1610:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            // InternalTryGrammar.g:1611:3: ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            {
            // InternalTryGrammar.g:1611:3: ( (lv_type_0_0= ruleStandardType ) )
            // InternalTryGrammar.g:1612:4: (lv_type_0_0= ruleStandardType )
            {
            // InternalTryGrammar.g:1612:4: (lv_type_0_0= ruleStandardType )
            // InternalTryGrammar.g:1613:5: lv_type_0_0= ruleStandardType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getTypeStandardTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_type_0_0=ruleStandardType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStandardVariableDeclarationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.unicam.tryGrammar.TryGrammar.StandardType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1630:3: ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27||LA24_0==31||(LA24_0>=169 && LA24_0<=174)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTryGrammar.g:1631:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    {
            	    // InternalTryGrammar.g:1631:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    // InternalTryGrammar.g:1632:5: lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_optionalElements_1_0=ruleVariableDeclarationOptionalElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStandardVariableDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"optionalElements",
            	      						lv_optionalElements_1_0,
            	      						"org.unicam.tryGrammar.TryGrammar.VariableDeclarationOptionalElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalTryGrammar.g:1649:3: ( (lv_variable_2_0= ruleVariable ) )
            // InternalTryGrammar.g:1650:4: (lv_variable_2_0= ruleVariable )
            {
            // InternalTryGrammar.g:1650:4: (lv_variable_2_0= ruleVariable )
            // InternalTryGrammar.g:1651:5: lv_variable_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getVariableVariableParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_variable_2_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStandardVariableDeclarationRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_2_0,
              						"org.unicam.tryGrammar.TryGrammar.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1668:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTryGrammar.g:1669:4: otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStandardVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalTryGrammar.g:1673:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalTryGrammar.g:1674:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:1674:5: (lv_expression_4_0= ruleExpression )
                    // InternalTryGrammar.g:1675:6: lv_expression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getExpressionExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardVariableDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_4_0,
                      							"org.unicam.tryGrammar.TryGrammar.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStandardVariableDeclaration"


    // $ANTLR start "entryRuleVarVariableDeclaration"
    // InternalTryGrammar.g:1697:1: entryRuleVarVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableDeclaration = null;


        try {
            // InternalTryGrammar.g:1697:63: (iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF )
            // InternalTryGrammar.g:1698:2: iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarVariableDeclaration=ruleVarVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarVariableDeclaration"


    // $ANTLR start "ruleVarVariableDeclaration"
    // InternalTryGrammar.g:1704:1: ruleVarVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1710:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalTryGrammar.g:1711:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalTryGrammar.g:1711:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalTryGrammar.g:1712:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalTryGrammar.g:1712:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalTryGrammar.g:1713:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalTryGrammar.g:1713:4: (lv_varType_0_0= ruleVarType )
            // InternalTryGrammar.g:1714:5: lv_varType_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getVarTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_varType_0_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarVariableDeclarationRule());
              					}
              					set(
              						current,
              						"varType",
              						lv_varType_0_0,
              						"org.unicam.tryGrammar.TryGrammar.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1731:3: ( (lv_variable_1_0= ruleVariable ) )
            // InternalTryGrammar.g:1732:4: (lv_variable_1_0= ruleVariable )
            {
            // InternalTryGrammar.g:1732:4: (lv_variable_1_0= ruleVariable )
            // InternalTryGrammar.g:1733:5: lv_variable_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getVariableVariableParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_variable_1_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarVariableDeclarationRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"org.unicam.tryGrammar.TryGrammar.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1750:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTryGrammar.g:1751:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalTryGrammar.g:1755:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalTryGrammar.g:1756:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:1756:5: (lv_expression_3_0= ruleExpression )
                    // InternalTryGrammar.g:1757:6: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getExpressionExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarVariableDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_3_0,
                      							"org.unicam.tryGrammar.TryGrammar.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarVariableDeclaration"


    // $ANTLR start "entryRuleVarVariableTupleVariableDeclaration"
    // InternalTryGrammar.g:1779:1: entryRuleVarVariableTupleVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableTupleVariableDeclaration = null;


        try {
            // InternalTryGrammar.g:1779:76: (iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF )
            // InternalTryGrammar.g:1780:2: iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarVariableTupleVariableDeclaration=ruleVarVariableTupleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarVariableTupleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarVariableTupleVariableDeclaration"


    // $ANTLR start "ruleVarVariableTupleVariableDeclaration"
    // InternalTryGrammar.g:1786:1: ruleVarVariableTupleVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_tuple_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1792:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalTryGrammar.g:1793:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalTryGrammar.g:1793:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalTryGrammar.g:1794:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalTryGrammar.g:1794:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalTryGrammar.g:1795:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalTryGrammar.g:1795:4: (lv_varType_0_0= ruleVarType )
            // InternalTryGrammar.g:1796:5: lv_varType_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getVarTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_varType_0_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarVariableTupleVariableDeclarationRule());
              					}
              					set(
              						current,
              						"varType",
              						lv_varType_0_0,
              						"org.unicam.tryGrammar.TryGrammar.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1813:3: ( (lv_tuple_1_0= ruleTuple ) )
            // InternalTryGrammar.g:1814:4: (lv_tuple_1_0= ruleTuple )
            {
            // InternalTryGrammar.g:1814:4: (lv_tuple_1_0= ruleTuple )
            // InternalTryGrammar.g:1815:5: lv_tuple_1_0= ruleTuple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getTupleTupleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_tuple_1_0=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarVariableTupleVariableDeclarationRule());
              					}
              					set(
              						current,
              						"tuple",
              						lv_tuple_1_0,
              						"org.unicam.tryGrammar.TryGrammar.Tuple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1832:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTryGrammar.g:1833:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableTupleVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalTryGrammar.g:1837:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalTryGrammar.g:1838:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:1838:5: (lv_expression_3_0= ruleExpression )
                    // InternalTryGrammar.g:1839:6: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getExpressionExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarVariableTupleVariableDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_3_0,
                      							"org.unicam.tryGrammar.TryGrammar.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarVariableTupleVariableDeclaration"


    // $ANTLR start "entryRuleVariableDeclarationOptionalElement"
    // InternalTryGrammar.g:1861:1: entryRuleVariableDeclarationOptionalElement returns [EObject current=null] : iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF ;
    public final EObject entryRuleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationOptionalElement = null;


        try {
            // InternalTryGrammar.g:1861:75: (iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF )
            // InternalTryGrammar.g:1862:2: iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationOptionalElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclarationOptionalElement=ruleVariableDeclarationOptionalElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationOptionalElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarationOptionalElement"


    // $ANTLR start "ruleVariableDeclarationOptionalElement"
    // InternalTryGrammar.g:1868:1: ruleVariableDeclarationOptionalElement returns [EObject current=null] : (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) ;
    public final EObject ruleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_VisibilitySpecifier_0 = null;

        EObject this_IndexedSpecifer_1 = null;

        EObject this_ConstantSpecifier_2 = null;

        EObject this_LocationSpecifier_3 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1874:2: ( (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) )
            // InternalTryGrammar.g:1875:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            {
            // InternalTryGrammar.g:1875:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 171:
            case 172:
            case 173:
            case 174:
                {
                alt28=1;
                }
                break;
            case 31:
                {
                alt28=2;
                }
                break;
            case 27:
                {
                alt28=3;
                }
                break;
            case 169:
            case 170:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalTryGrammar.g:1876:3: this_VisibilitySpecifier_0= ruleVisibilitySpecifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableDeclarationOptionalElementAccess().getVisibilitySpecifierParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VisibilitySpecifier_0=ruleVisibilitySpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VisibilitySpecifier_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:1885:3: this_IndexedSpecifer_1= ruleIndexedSpecifer
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableDeclarationOptionalElementAccess().getIndexedSpeciferParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IndexedSpecifer_1=ruleIndexedSpecifer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IndexedSpecifer_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:1894:3: this_ConstantSpecifier_2= ruleConstantSpecifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableDeclarationOptionalElementAccess().getConstantSpecifierParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstantSpecifier_2=ruleConstantSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConstantSpecifier_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:1903:3: this_LocationSpecifier_3= ruleLocationSpecifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableDeclarationOptionalElementAccess().getLocationSpecifierParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LocationSpecifier_3=ruleLocationSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LocationSpecifier_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclarationOptionalElement"


    // $ANTLR start "entryRuleIndexedSpecifer"
    // InternalTryGrammar.g:1915:1: entryRuleIndexedSpecifer returns [EObject current=null] : iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF ;
    public final EObject entryRuleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedSpecifer = null;


        try {
            // InternalTryGrammar.g:1915:56: (iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF )
            // InternalTryGrammar.g:1916:2: iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedSpeciferRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndexedSpecifer=ruleIndexedSpecifer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedSpecifer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexedSpecifer"


    // $ANTLR start "ruleIndexedSpecifer"
    // InternalTryGrammar.g:1922:1: ruleIndexedSpecifer returns [EObject current=null] : (otherlv_0= 'indexed' () ) ;
    public final EObject ruleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:1928:2: ( (otherlv_0= 'indexed' () ) )
            // InternalTryGrammar.g:1929:2: (otherlv_0= 'indexed' () )
            {
            // InternalTryGrammar.g:1929:2: (otherlv_0= 'indexed' () )
            // InternalTryGrammar.g:1930:3: otherlv_0= 'indexed' ()
            {
            otherlv_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexedSpeciferAccess().getIndexedKeyword_0());
              		
            }
            // InternalTryGrammar.g:1934:3: ()
            // InternalTryGrammar.g:1935:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndexedSpeciferAccess().getIndexedSpeciferAction_1(),
              					current);
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexedSpecifer"


    // $ANTLR start "entryRuleConstantSpecifier"
    // InternalTryGrammar.g:1945:1: entryRuleConstantSpecifier returns [EObject current=null] : iv_ruleConstantSpecifier= ruleConstantSpecifier EOF ;
    public final EObject entryRuleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSpecifier = null;


        try {
            // InternalTryGrammar.g:1945:58: (iv_ruleConstantSpecifier= ruleConstantSpecifier EOF )
            // InternalTryGrammar.g:1946:2: iv_ruleConstantSpecifier= ruleConstantSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantSpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstantSpecifier=ruleConstantSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantSpecifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantSpecifier"


    // $ANTLR start "ruleConstantSpecifier"
    // InternalTryGrammar.g:1952:1: ruleConstantSpecifier returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:1958:2: ( (otherlv_0= 'constant' () ) )
            // InternalTryGrammar.g:1959:2: (otherlv_0= 'constant' () )
            {
            // InternalTryGrammar.g:1959:2: (otherlv_0= 'constant' () )
            // InternalTryGrammar.g:1960:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantSpecifierAccess().getConstantKeyword_0());
              		
            }
            // InternalTryGrammar.g:1964:3: ()
            // InternalTryGrammar.g:1965:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConstantSpecifierAccess().getConstantSpecifierAction_1(),
              					current);
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantSpecifier"


    // $ANTLR start "entryRuleLocationSpecifier"
    // InternalTryGrammar.g:1975:1: entryRuleLocationSpecifier returns [EObject current=null] : iv_ruleLocationSpecifier= ruleLocationSpecifier EOF ;
    public final EObject entryRuleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifier = null;


        try {
            // InternalTryGrammar.g:1975:58: (iv_ruleLocationSpecifier= ruleLocationSpecifier EOF )
            // InternalTryGrammar.g:1976:2: iv_ruleLocationSpecifier= ruleLocationSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationSpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocationSpecifier=ruleLocationSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationSpecifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationSpecifier"


    // $ANTLR start "ruleLocationSpecifier"
    // InternalTryGrammar.g:1982:1: ruleLocationSpecifier returns [EObject current=null] : ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) ;
    public final EObject ruleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_location_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1988:2: ( ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) )
            // InternalTryGrammar.g:1989:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            {
            // InternalTryGrammar.g:1989:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            // InternalTryGrammar.g:1990:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            {
            // InternalTryGrammar.g:1990:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            // InternalTryGrammar.g:1991:4: lv_location_0_0= ruleLocationSpecifierEnum
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLocationSpecifierAccess().getLocationLocationSpecifierEnumEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_location_0_0=ruleLocationSpecifierEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getLocationSpecifierRule());
              				}
              				set(
              					current,
              					"location",
              					lv_location_0_0,
              					"org.unicam.tryGrammar.TryGrammar.LocationSpecifierEnum");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationSpecifier"


    // $ANTLR start "entryRuleType"
    // InternalTryGrammar.g:2011:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalTryGrammar.g:2011:45: (iv_ruleType= ruleType EOF )
            // InternalTryGrammar.g:2012:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalTryGrammar.g:2018:1: ruleType returns [EObject current=null] : (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_StandardType_0 = null;

        AntlrDatatypeRuleToken lv_isVarType_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2024:2: ( (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) )
            // InternalTryGrammar.g:2025:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            {
            // InternalTryGrammar.g:2025:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==32||(LA29_0>=65 && LA29_0<=168)) ) {
                alt29=1;
            }
            else if ( (LA29_0==36) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalTryGrammar.g:2026:3: this_StandardType_0= ruleStandardType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getStandardTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StandardType_0=ruleStandardType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StandardType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:2035:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    {
                    // InternalTryGrammar.g:2035:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    // InternalTryGrammar.g:2036:4: (lv_isVarType_1_0= ruleVarType )
                    {
                    // InternalTryGrammar.g:2036:4: (lv_isVarType_1_0= ruleVarType )
                    // InternalTryGrammar.g:2037:5: lv_isVarType_1_0= ruleVarType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getIsVarTypeVarTypeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_isVarType_1_0=ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"isVarType",
                      						true,
                      						"org.unicam.tryGrammar.TryGrammar.VarType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleStandardType"
    // InternalTryGrammar.g:2058:1: entryRuleStandardType returns [EObject current=null] : iv_ruleStandardType= ruleStandardType EOF ;
    public final EObject entryRuleStandardType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardType = null;


        try {
            // InternalTryGrammar.g:2058:53: (iv_ruleStandardType= ruleStandardType EOF )
            // InternalTryGrammar.g:2059:2: iv_ruleStandardType= ruleStandardType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStandardType=ruleStandardType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStandardType"


    // $ANTLR start "ruleStandardType"
    // InternalTryGrammar.g:2065:1: ruleStandardType returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) ;
    public final EObject ruleStandardType() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;

        EObject this_QualifiedIdentifier_3 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2071:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) )
            // InternalTryGrammar.g:2072:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            {
            // InternalTryGrammar.g:2072:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
                {
                alt31=1;
                }
                break;
            case 32:
                {
                alt31=2;
                }
                break;
            case RULE_ID:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalTryGrammar.g:2073:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalTryGrammar.g:2073:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalTryGrammar.g:2074:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStandardTypeAccess().getElementaryTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_ElementaryType_0=ruleElementaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementaryType_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryGrammar.g:2082:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==34) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalTryGrammar.g:2083:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalTryGrammar.g:2083:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalTryGrammar.g:2084:6: lv_dimension_1_0= ruleArrayDimensions
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getStandardTypeAccess().getDimensionArrayDimensionsParserRuleCall_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_dimension_1_0=ruleArrayDimensions();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getStandardTypeRule());
                              						}
                              						set(
                              							current,
                              							"dimension",
                              							lv_dimension_1_0,
                              							"org.unicam.tryGrammar.TryGrammar.ArrayDimensions");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:2103:3: this_Mapping_2= ruleMapping
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStandardTypeAccess().getMappingParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Mapping_2=ruleMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Mapping_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:2112:3: this_QualifiedIdentifier_3= ruleQualifiedIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStandardTypeAccess().getQualifiedIdentifierParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_QualifiedIdentifier_3=ruleQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QualifiedIdentifier_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStandardType"


    // $ANTLR start "entryRuleStandardTypeWithoutQualifiedIdentifier"
    // InternalTryGrammar.g:2124:1: entryRuleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF ;
    public final EObject entryRuleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardTypeWithoutQualifiedIdentifier = null;


        try {
            // InternalTryGrammar.g:2124:79: (iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF )
            // InternalTryGrammar.g:2125:2: iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardTypeWithoutQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStandardTypeWithoutQualifiedIdentifier=ruleStandardTypeWithoutQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardTypeWithoutQualifiedIdentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStandardTypeWithoutQualifiedIdentifier"


    // $ANTLR start "ruleStandardTypeWithoutQualifiedIdentifier"
    // InternalTryGrammar.g:2131:1: ruleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) ;
    public final EObject ruleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2137:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) )
            // InternalTryGrammar.g:2138:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            {
            // InternalTryGrammar.g:2138:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=65 && LA33_0<=168)) ) {
                alt33=1;
            }
            else if ( (LA33_0==32) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalTryGrammar.g:2139:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalTryGrammar.g:2139:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalTryGrammar.g:2140:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStandardTypeWithoutQualifiedIdentifierAccess().getElementaryTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_ElementaryType_0=ruleElementaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementaryType_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryGrammar.g:2148:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==34) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalTryGrammar.g:2149:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalTryGrammar.g:2149:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalTryGrammar.g:2150:6: lv_dimension_1_0= ruleArrayDimensions
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getStandardTypeWithoutQualifiedIdentifierAccess().getDimensionArrayDimensionsParserRuleCall_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_dimension_1_0=ruleArrayDimensions();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getStandardTypeWithoutQualifiedIdentifierRule());
                              						}
                              						set(
                              							current,
                              							"dimension",
                              							lv_dimension_1_0,
                              							"org.unicam.tryGrammar.TryGrammar.ArrayDimensions");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:2169:3: this_Mapping_2= ruleMapping
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStandardTypeWithoutQualifiedIdentifierAccess().getMappingParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Mapping_2=ruleMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Mapping_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStandardTypeWithoutQualifiedIdentifier"


    // $ANTLR start "entryRuleElementaryType"
    // InternalTryGrammar.g:2181:1: entryRuleElementaryType returns [EObject current=null] : iv_ruleElementaryType= ruleElementaryType EOF ;
    public final EObject entryRuleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryType = null;


        try {
            // InternalTryGrammar.g:2181:55: (iv_ruleElementaryType= ruleElementaryType EOF )
            // InternalTryGrammar.g:2182:2: iv_ruleElementaryType= ruleElementaryType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementaryTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementaryType=ruleElementaryType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementaryType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementaryType"


    // $ANTLR start "ruleElementaryType"
    // InternalTryGrammar.g:2188:1: ruleElementaryType returns [EObject current=null] : ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) ;
    public final EObject ruleElementaryType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2194:2: ( ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) )
            // InternalTryGrammar.g:2195:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            {
            // InternalTryGrammar.g:2195:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            // InternalTryGrammar.g:2196:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalTryGrammar.g:2196:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            // InternalTryGrammar.g:2197:4: lv_name_0_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElementaryTypeAccess().getNameElementaryTypeNameEnumEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleElementaryTypeNameEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getElementaryTypeRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.unicam.tryGrammar.TryGrammar.ElementaryTypeNameEnum");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementaryType"


    // $ANTLR start "entryRuleMapping"
    // InternalTryGrammar.g:2217:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalTryGrammar.g:2217:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalTryGrammar.g:2218:2: iv_ruleMapping= ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapping; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalTryGrammar.g:2224:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_keyType_2_0 = null;

        EObject lv_valueType_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2230:2: ( (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) )
            // InternalTryGrammar.g:2231:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            {
            // InternalTryGrammar.g:2231:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            // InternalTryGrammar.g:2232:3: otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryGrammar.g:2240:3: ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) )
            // InternalTryGrammar.g:2241:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            {
            // InternalTryGrammar.g:2241:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            // InternalTryGrammar.g:2242:5: lv_keyType_2_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getKeyTypeElementaryTypeNameEnumEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_keyType_2_0=ruleElementaryTypeNameEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMappingRule());
              					}
              					set(
              						current,
              						"keyType",
              						lv_keyType_2_0,
              						"org.unicam.tryGrammar.TryGrammar.ElementaryTypeNameEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalTryGrammar.g:2263:3: ( (lv_valueType_4_0= ruleType ) )
            // InternalTryGrammar.g:2264:4: (lv_valueType_4_0= ruleType )
            {
            // InternalTryGrammar.g:2264:4: (lv_valueType_4_0= ruleType )
            // InternalTryGrammar.g:2265:5: lv_valueType_4_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getValueTypeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_valueType_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMappingRule());
              					}
              					set(
              						current,
              						"valueType",
              						lv_valueType_4_0,
              						"org.unicam.tryGrammar.TryGrammar.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleArrayDimensions"
    // InternalTryGrammar.g:2290:1: entryRuleArrayDimensions returns [EObject current=null] : iv_ruleArrayDimensions= ruleArrayDimensions EOF ;
    public final EObject entryRuleArrayDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimensions = null;


        try {
            // InternalTryGrammar.g:2290:56: (iv_ruleArrayDimensions= ruleArrayDimensions EOF )
            // InternalTryGrammar.g:2291:2: iv_ruleArrayDimensions= ruleArrayDimensions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayDimensionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayDimensions=ruleArrayDimensions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayDimensions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayDimensions"


    // $ANTLR start "ruleArrayDimensions"
    // InternalTryGrammar.g:2297:1: ruleArrayDimensions returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) ;
    public final EObject ruleArrayDimensions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2303:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) )
            // InternalTryGrammar.g:2304:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            {
            // InternalTryGrammar.g:2304:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            // InternalTryGrammar.g:2305:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalTryGrammar.g:2309:3: ()
            // InternalTryGrammar.g:2310:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayDimensionsAccess().getArrayDimensionsAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:2316:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_INT)||LA34_0==22||(LA34_0>=57 && LA34_0<=168)||(LA34_0>=198 && LA34_0<=199)||(LA34_0>=210 && LA34_0<=214)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTryGrammar.g:2317:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:2317:4: (lv_value_2_0= ruleExpression )
                    // InternalTryGrammar.g:2318:5: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArrayDimensionsAccess().getValueExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_35);
                    lv_value_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getArrayDimensionsRule());
                      					}
                      					add(
                      						current,
                      						"value",
                      						lv_value_2_0,
                      						"org.unicam.tryGrammar.TryGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalTryGrammar.g:2339:3: (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalTryGrammar.g:2340:4: otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']'
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_4_0());
            	      			
            	    }
            	    // InternalTryGrammar.g:2344:4: ( (lv_value_5_0= ruleExpression ) )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_INT)||LA35_0==22||(LA35_0>=57 && LA35_0<=168)||(LA35_0>=198 && LA35_0<=199)||(LA35_0>=210 && LA35_0<=214)) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalTryGrammar.g:2345:5: (lv_value_5_0= ruleExpression )
            	            {
            	            // InternalTryGrammar.g:2345:5: (lv_value_5_0= ruleExpression )
            	            // InternalTryGrammar.g:2346:6: lv_value_5_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getArrayDimensionsAccess().getValueExpressionParserRuleCall_4_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_35);
            	            lv_value_5_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getArrayDimensionsRule());
            	              						}
            	              						add(
            	              							current,
            	              							"value",
            	              							lv_value_5_0,
            	              							"org.unicam.tryGrammar.TryGrammar.Expression");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,35,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_4_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayDimensions"


    // $ANTLR start "entryRuleVarType"
    // InternalTryGrammar.g:2372:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalTryGrammar.g:2372:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalTryGrammar.g:2373:2: iv_ruleVarType= ruleVarType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarType=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // InternalTryGrammar.g:2379:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:2385:2: (kw= 'var' )
            // InternalTryGrammar.g:2386:2: kw= 'var'
            {
            kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getVarTypeAccess().getVarKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleTuple"
    // InternalTryGrammar.g:2394:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalTryGrammar.g:2394:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalTryGrammar.g:2395:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // InternalTryGrammar.g:2401:1: ruleTuple returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_3_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2407:2: ( (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) )
            // InternalTryGrammar.g:2408:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            {
            // InternalTryGrammar.g:2408:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            // InternalTryGrammar.g:2409:3: otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryGrammar.g:2413:3: ()
            // InternalTryGrammar.g:2414:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleAccess().getTupleAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:2420:3: ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_INT)||LA40_0==17||LA40_0==22||(LA40_0>=57 && LA40_0<=168)||(LA40_0>=198 && LA40_0<=199)||(LA40_0>=210 && LA40_0<=214)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTryGrammar.g:2421:4: ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    {
                    // InternalTryGrammar.g:2421:4: ( (lv_members_2_0= ruleExpression ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_INT)||LA37_0==22||(LA37_0>=57 && LA37_0<=168)||(LA37_0>=198 && LA37_0<=199)||(LA37_0>=210 && LA37_0<=214)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalTryGrammar.g:2422:5: (lv_members_2_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2422:5: (lv_members_2_0= ruleExpression )
                            // InternalTryGrammar.g:2423:6: lv_members_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getTupleAccess().getMembersExpressionParserRuleCall_2_0_0());
                              					
                            }
                            pushFollow(FOLLOW_37);
                            lv_members_2_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getTupleRule());
                              						}
                              						add(
                              							current,
                              							"members",
                              							lv_members_2_0,
                              							"org.unicam.tryGrammar.TryGrammar.Expression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalTryGrammar.g:2440:4: ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==17) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalTryGrammar.g:2441:5: ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )?
                    	    {
                    	    // InternalTryGrammar.g:2441:5: ( (lv_members_3_0= ruleTupleSeparator ) )
                    	    // InternalTryGrammar.g:2442:6: (lv_members_3_0= ruleTupleSeparator )
                    	    {
                    	    // InternalTryGrammar.g:2442:6: (lv_members_3_0= ruleTupleSeparator )
                    	    // InternalTryGrammar.g:2443:7: lv_members_3_0= ruleTupleSeparator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTupleAccess().getMembersTupleSeparatorParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_members_3_0=ruleTupleSeparator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTupleRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"members",
                    	      								lv_members_3_0,
                    	      								"org.unicam.tryGrammar.TryGrammar.TupleSeparator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalTryGrammar.g:2460:5: ( (lv_members_4_0= ruleExpression ) )?
                    	    int alt38=2;
                    	    int LA38_0 = input.LA(1);

                    	    if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_INT)||LA38_0==22||(LA38_0>=57 && LA38_0<=168)||(LA38_0>=198 && LA38_0<=199)||(LA38_0>=210 && LA38_0<=214)) ) {
                    	        alt38=1;
                    	    }
                    	    switch (alt38) {
                    	        case 1 :
                    	            // InternalTryGrammar.g:2461:6: (lv_members_4_0= ruleExpression )
                    	            {
                    	            // InternalTryGrammar.g:2461:6: (lv_members_4_0= ruleExpression )
                    	            // InternalTryGrammar.g:2462:7: lv_members_4_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getTupleAccess().getMembersExpressionParserRuleCall_2_1_1_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_36);
                    	            lv_members_4_0=ruleExpression();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getTupleRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"members",
                    	              								lv_members_4_0,
                    	              								"org.unicam.tryGrammar.TryGrammar.Expression");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRuleTupleSeparator"
    // InternalTryGrammar.g:2489:1: entryRuleTupleSeparator returns [EObject current=null] : iv_ruleTupleSeparator= ruleTupleSeparator EOF ;
    public final EObject entryRuleTupleSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleSeparator = null;


        try {
            // InternalTryGrammar.g:2489:55: (iv_ruleTupleSeparator= ruleTupleSeparator EOF )
            // InternalTryGrammar.g:2490:2: iv_ruleTupleSeparator= ruleTupleSeparator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleSeparatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleSeparator=ruleTupleSeparator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleSeparator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleSeparator"


    // $ANTLR start "ruleTupleSeparator"
    // InternalTryGrammar.g:2496:1: ruleTupleSeparator returns [EObject current=null] : (otherlv_0= ',' () ) ;
    public final EObject ruleTupleSeparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:2502:2: ( (otherlv_0= ',' () ) )
            // InternalTryGrammar.g:2503:2: (otherlv_0= ',' () )
            {
            // InternalTryGrammar.g:2503:2: (otherlv_0= ',' () )
            // InternalTryGrammar.g:2504:3: otherlv_0= ',' ()
            {
            otherlv_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleSeparatorAccess().getCommaKeyword_0());
              		
            }
            // InternalTryGrammar.g:2508:3: ()
            // InternalTryGrammar.g:2509:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleSeparatorAccess().getTupleSeparatorAction_1(),
              					current);
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleSeparator"


    // $ANTLR start "entryRuleSimpleStatement"
    // InternalTryGrammar.g:2519:1: entryRuleSimpleStatement returns [EObject current=null] : iv_ruleSimpleStatement= ruleSimpleStatement EOF ;
    public final EObject entryRuleSimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement = null;


        try {
            // InternalTryGrammar.g:2519:56: (iv_ruleSimpleStatement= ruleSimpleStatement EOF )
            // InternalTryGrammar.g:2520:2: iv_ruleSimpleStatement= ruleSimpleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleStatement=ruleSimpleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleStatement"


    // $ANTLR start "ruleSimpleStatement"
    // InternalTryGrammar.g:2526:1: ruleSimpleStatement returns [EObject current=null] : ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) ;
    public final EObject ruleSimpleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        Token lv_semicolon_16_0=null;
        EObject this_StandardTypeWithoutQualifiedIdentifier_0 = null;

        EObject lv_ptionalElements_2_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_variable_8_0 = null;

        EObject lv_expression_10_0 = null;

        EObject lv_tuple_12_0 = null;

        EObject lv_expression_14_0 = null;

        EObject this_ExpressionStatement_15 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2532:2: ( ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) )
            // InternalTryGrammar.g:2533:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            {
            // InternalTryGrammar.g:2533:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            // InternalTryGrammar.g:2534:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) )
            {
            // InternalTryGrammar.g:2534:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalTryGrammar.g:2535:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalTryGrammar.g:2535:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalTryGrammar.g:2536:5: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStatementAccess().getStandardTypeWithoutQualifiedIdentifierParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    this_StandardTypeWithoutQualifiedIdentifier_0=ruleStandardTypeWithoutQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_StandardTypeWithoutQualifiedIdentifier_0;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalTryGrammar.g:2544:5: ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalTryGrammar.g:2545:6: () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalTryGrammar.g:2545:6: ()
                    // InternalTryGrammar.g:2546:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getSimpleStatementAccess().getStandardVariableDeclarationTypeAction_0_0_1_0(),
                      								current);
                      						
                    }

                    }

                    // InternalTryGrammar.g:2552:6: ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==27||LA41_0==31||(LA41_0>=169 && LA41_0<=174)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalTryGrammar.g:2553:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalTryGrammar.g:2553:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalTryGrammar.g:2554:8: lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getPtionalElementsVariableDeclarationOptionalElementParserRuleCall_0_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    lv_ptionalElements_2_0=ruleVariableDeclarationOptionalElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"ptionalElements",
                    	      									lv_ptionalElements_2_0,
                    	      									"org.unicam.tryGrammar.TryGrammar.VariableDeclarationOptionalElement");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // InternalTryGrammar.g:2571:6: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalTryGrammar.g:2572:7: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalTryGrammar.g:2572:7: (lv_variable_3_0= ruleVariable )
                    // InternalTryGrammar.g:2573:8: lv_variable_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getVariableVariableParserRuleCall_0_0_1_2_0());
                      							
                    }
                    pushFollow(FOLLOW_38);
                    lv_variable_3_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                      								}
                      								set(
                      									current,
                      									"variable",
                      									lv_variable_3_0,
                      									"org.unicam.tryGrammar.TryGrammar.Variable");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalTryGrammar.g:2590:6: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==30) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalTryGrammar.g:2591:7: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_0_1_3_0());
                              						
                            }
                            // InternalTryGrammar.g:2595:7: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalTryGrammar.g:2596:8: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2596:8: (lv_expression_5_0= ruleExpression )
                            // InternalTryGrammar.g:2597:9: lv_expression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionExpressionParserRuleCall_0_0_1_3_1_0());
                              								
                            }
                            pushFollow(FOLLOW_5);
                            lv_expression_5_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                              									}
                              									set(
                              										current,
                              										"expression",
                              										lv_expression_5_0,
                              										"org.unicam.tryGrammar.TryGrammar.Expression");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:2618:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalTryGrammar.g:2618:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalTryGrammar.g:2619:5: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStatementAccess().getVarTypeParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_39);
                    ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalTryGrammar.g:2626:5: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==22) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalTryGrammar.g:2627:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalTryGrammar.g:2627:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalTryGrammar.g:2628:7: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalTryGrammar.g:2628:7: ()
                            // InternalTryGrammar.g:2629:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTypeDeclarationAction_0_1_1_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalTryGrammar.g:2635:7: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalTryGrammar.g:2636:8: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalTryGrammar.g:2636:8: (lv_variable_8_0= ruleVariable )
                            // InternalTryGrammar.g:2637:9: lv_variable_8_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getVariableVariableParserRuleCall_0_1_1_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_40);
                            lv_variable_8_0=ruleVariable();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                              									}
                              									set(
                              										current,
                              										"variable",
                              										lv_variable_8_0,
                              										"org.unicam.tryGrammar.TryGrammar.Variable");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalTryGrammar.g:2654:7: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalTryGrammar.g:2655:8: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_9, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_0_2_0());
                              							
                            }
                            // InternalTryGrammar.g:2659:8: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalTryGrammar.g:2660:9: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2660:9: (lv_expression_10_0= ruleExpression )
                            // InternalTryGrammar.g:2661:10: lv_expression_10_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              										newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionExpressionParserRuleCall_0_1_1_0_2_1_0());
                              									
                            }
                            pushFollow(FOLLOW_5);
                            lv_expression_10_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              										if (current==null) {
                              											current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                              										}
                              										set(
                              											current,
                              											"expression",
                              											lv_expression_10_0,
                              											"org.unicam.tryGrammar.TryGrammar.Expression");
                              										afterParserOrEnumRuleCall();
                              									
                            }

                            }


                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTryGrammar.g:2681:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalTryGrammar.g:2681:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalTryGrammar.g:2682:7: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalTryGrammar.g:2682:7: ()
                            // InternalTryGrammar.g:2683:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTupleVariableDeclarationAction_0_1_1_1_0(),
                              									current);
                              							
                            }

                            }

                            // InternalTryGrammar.g:2689:7: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalTryGrammar.g:2690:8: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalTryGrammar.g:2690:8: (lv_tuple_12_0= ruleTuple )
                            // InternalTryGrammar.g:2691:9: lv_tuple_12_0= ruleTuple
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getTupleTupleParserRuleCall_0_1_1_1_1_0());
                              								
                            }
                            pushFollow(FOLLOW_40);
                            lv_tuple_12_0=ruleTuple();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                              									}
                              									set(
                              										current,
                              										"tuple",
                              										lv_tuple_12_0,
                              										"org.unicam.tryGrammar.TryGrammar.Tuple");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalTryGrammar.g:2708:7: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalTryGrammar.g:2709:8: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_13, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_1_2_0());
                              							
                            }
                            // InternalTryGrammar.g:2713:8: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalTryGrammar.g:2714:9: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2714:9: (lv_expression_14_0= ruleExpression )
                            // InternalTryGrammar.g:2715:10: lv_expression_14_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              										newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionExpressionParserRuleCall_0_1_1_1_2_1_0());
                              									
                            }
                            pushFollow(FOLLOW_5);
                            lv_expression_14_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              										if (current==null) {
                              											current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                              										}
                              										set(
                              											current,
                              											"expression",
                              											lv_expression_14_0,
                              											"org.unicam.tryGrammar.TryGrammar.Expression");
                              										afterParserOrEnumRuleCall();
                              									
                            }

                            }


                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:2737:4: this_ExpressionStatement_15= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionStatementParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_ExpressionStatement_15=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ExpressionStatement_15;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalTryGrammar.g:2746:3: ( (lv_semicolon_16_0= ';' ) )
            // InternalTryGrammar.g:2747:4: (lv_semicolon_16_0= ';' )
            {
            // InternalTryGrammar.g:2747:4: (lv_semicolon_16_0= ';' )
            // InternalTryGrammar.g:2748:5: lv_semicolon_16_0= ';'
            {
            lv_semicolon_16_0=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_semicolon_16_0, grammarAccess.getSimpleStatementAccess().getSemicolonSemicolonKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSimpleStatementRule());
              					}
              					setWithLastConsumed(current, "semicolon", true, ";");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleStatement"


    // $ANTLR start "entryRuleSimpleStatement2"
    // InternalTryGrammar.g:2764:1: entryRuleSimpleStatement2 returns [EObject current=null] : iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF ;
    public final EObject entryRuleSimpleStatement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement2 = null;


        try {
            // InternalTryGrammar.g:2764:57: (iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF )
            // InternalTryGrammar.g:2765:2: iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleStatement2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleStatement2=ruleSimpleStatement2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleStatement2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleStatement2"


    // $ANTLR start "ruleSimpleStatement2"
    // InternalTryGrammar.g:2771:1: ruleSimpleStatement2 returns [EObject current=null] : ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ;
    public final EObject ruleSimpleStatement2() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        EObject this_StandardTypeWithoutQualifiedIdentifier_0 = null;

        EObject lv_optionalElements_2_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_variable_8_0 = null;

        EObject lv_expression_10_0 = null;

        EObject lv_tuple_12_0 = null;

        EObject lv_expression_14_0 = null;

        EObject this_ExpressionStatement_15 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2777:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) )
            // InternalTryGrammar.g:2778:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            {
            // InternalTryGrammar.g:2778:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt48=3;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalTryGrammar.g:2779:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalTryGrammar.g:2779:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalTryGrammar.g:2780:4: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatement2Access().getStandardTypeWithoutQualifiedIdentifierParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    this_StandardTypeWithoutQualifiedIdentifier_0=ruleStandardTypeWithoutQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_StandardTypeWithoutQualifiedIdentifier_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryGrammar.g:2788:4: ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalTryGrammar.g:2789:5: () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalTryGrammar.g:2789:5: ()
                    // InternalTryGrammar.g:2790:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getSimpleStatement2Access().getStandardVariableDeclarationTypeAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryGrammar.g:2796:5: ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==27||LA45_0==31||(LA45_0>=169 && LA45_0<=174)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalTryGrammar.g:2797:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalTryGrammar.g:2797:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalTryGrammar.g:2798:7: lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSimpleStatement2Access().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_0_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    lv_optionalElements_2_0=ruleVariableDeclarationOptionalElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSimpleStatement2Rule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"optionalElements",
                    	      								lv_optionalElements_2_0,
                    	      								"org.unicam.tryGrammar.TryGrammar.VariableDeclarationOptionalElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    // InternalTryGrammar.g:2815:5: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalTryGrammar.g:2816:6: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalTryGrammar.g:2816:6: (lv_variable_3_0= ruleVariable )
                    // InternalTryGrammar.g:2817:7: lv_variable_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSimpleStatement2Access().getVariableVariableParserRuleCall_0_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_29);
                    lv_variable_3_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSimpleStatement2Rule());
                      							}
                      							set(
                      								current,
                      								"variable",
                      								lv_variable_3_0,
                      								"org.unicam.tryGrammar.TryGrammar.Variable");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTryGrammar.g:2834:5: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==30) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalTryGrammar.g:2835:6: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_0_1_3_0());
                              					
                            }
                            // InternalTryGrammar.g:2839:6: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalTryGrammar.g:2840:7: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2840:7: (lv_expression_5_0= ruleExpression )
                            // InternalTryGrammar.g:2841:8: lv_expression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getExpressionExpressionParserRuleCall_0_1_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_expression_5_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSimpleStatement2Rule());
                              								}
                              								set(
                              									current,
                              									"expression",
                              									lv_expression_5_0,
                              									"org.unicam.tryGrammar.TryGrammar.Expression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:2862:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalTryGrammar.g:2862:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalTryGrammar.g:2863:4: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatement2Access().getVarTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_39);
                    ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryGrammar.g:2870:4: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==22) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalTryGrammar.g:2871:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalTryGrammar.g:2871:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalTryGrammar.g:2872:6: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalTryGrammar.g:2872:6: ()
                            // InternalTryGrammar.g:2873:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTypeDeclarationAction_1_1_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalTryGrammar.g:2879:6: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalTryGrammar.g:2880:7: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalTryGrammar.g:2880:7: (lv_variable_8_0= ruleVariable )
                            // InternalTryGrammar.g:2881:8: lv_variable_8_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getVariableVariableParserRuleCall_1_1_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_40);
                            lv_variable_8_0=ruleVariable();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSimpleStatement2Rule());
                              								}
                              								set(
                              									current,
                              									"variable",
                              									lv_variable_8_0,
                              									"org.unicam.tryGrammar.TryGrammar.Variable");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalTryGrammar.g:2898:6: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalTryGrammar.g:2899:7: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_9, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_0_2_0());
                              						
                            }
                            // InternalTryGrammar.g:2903:7: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalTryGrammar.g:2904:8: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2904:8: (lv_expression_10_0= ruleExpression )
                            // InternalTryGrammar.g:2905:9: lv_expression_10_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatement2Access().getExpressionExpressionParserRuleCall_1_1_0_2_1_0());
                              								
                            }
                            pushFollow(FOLLOW_2);
                            lv_expression_10_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getSimpleStatement2Rule());
                              									}
                              									set(
                              										current,
                              										"expression",
                              										lv_expression_10_0,
                              										"org.unicam.tryGrammar.TryGrammar.Expression");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTryGrammar.g:2925:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalTryGrammar.g:2925:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalTryGrammar.g:2926:6: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalTryGrammar.g:2926:6: ()
                            // InternalTryGrammar.g:2927:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTupleVariableDeclarationAction_1_1_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalTryGrammar.g:2933:6: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalTryGrammar.g:2934:7: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalTryGrammar.g:2934:7: (lv_tuple_12_0= ruleTuple )
                            // InternalTryGrammar.g:2935:8: lv_tuple_12_0= ruleTuple
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getTupleTupleParserRuleCall_1_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_40);
                            lv_tuple_12_0=ruleTuple();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSimpleStatement2Rule());
                              								}
                              								set(
                              									current,
                              									"tuple",
                              									lv_tuple_12_0,
                              									"org.unicam.tryGrammar.TryGrammar.Tuple");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalTryGrammar.g:2952:6: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalTryGrammar.g:2953:7: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_13, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_1_2_0());
                              						
                            }
                            // InternalTryGrammar.g:2957:7: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalTryGrammar.g:2958:8: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2958:8: (lv_expression_14_0= ruleExpression )
                            // InternalTryGrammar.g:2959:9: lv_expression_14_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatement2Access().getExpressionExpressionParserRuleCall_1_1_1_2_1_0());
                              								
                            }
                            pushFollow(FOLLOW_2);
                            lv_expression_14_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getSimpleStatement2Rule());
                              									}
                              									set(
                              										current,
                              										"expression",
                              										lv_expression_14_0,
                              										"org.unicam.tryGrammar.TryGrammar.Expression");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:2981:3: this_ExpressionStatement_15= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStatement2Access().getExpressionStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionStatement_15=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionStatement_15;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleStatement2"


    // $ANTLR start "entryRuleExpressionStatement"
    // InternalTryGrammar.g:2993:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalTryGrammar.g:2993:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalTryGrammar.g:2994:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionStatement=ruleExpressionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionStatement"


    // $ANTLR start "ruleExpressionStatement"
    // InternalTryGrammar.g:3000:1: ruleExpressionStatement returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3006:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalTryGrammar.g:3007:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalTryGrammar.g:3007:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalTryGrammar.g:3008:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalTryGrammar.g:3008:3: (lv_expression_0_0= ruleExpression )
            // InternalTryGrammar.g:3009:4: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getExpressionStatementRule());
              				}
              				set(
              					current,
              					"expression",
              					lv_expression_0_0,
              					"org.unicam.tryGrammar.TryGrammar.Expression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionStatement"


    // $ANTLR start "entryRuleQualifiedIdentifier"
    // InternalTryGrammar.g:3029:1: entryRuleQualifiedIdentifier returns [EObject current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final EObject entryRuleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedIdentifier = null;


        try {
            // InternalTryGrammar.g:3029:60: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // InternalTryGrammar.g:3030:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedIdentifier"


    // $ANTLR start "ruleQualifiedIdentifier"
    // InternalTryGrammar.g:3036:1: ruleQualifiedIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) ;
    public final EObject ruleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        EObject lv_qualifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3042:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) )
            // InternalTryGrammar.g:3043:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            {
            // InternalTryGrammar.g:3043:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            // InternalTryGrammar.g:3044:3: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )*
            {
            // InternalTryGrammar.g:3044:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalTryGrammar.g:3045:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalTryGrammar.g:3045:4: (lv_identifier_0_0= RULE_ID )
            // InternalTryGrammar.g:3046:5: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifier_0_0, grammarAccess.getQualifiedIdentifierAccess().getIdentifierIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getQualifiedIdentifierRule());
              					}
              					setWithLastConsumed(
              						current,
              						"identifier",
              						lv_identifier_0_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            // InternalTryGrammar.g:3062:3: ( (lv_qualifiers_1_0= ruleQualifier ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==22||LA49_0==34||LA49_0==37) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalTryGrammar.g:3063:4: (lv_qualifiers_1_0= ruleQualifier )
            	    {
            	    // InternalTryGrammar.g:3063:4: (lv_qualifiers_1_0= ruleQualifier )
            	    // InternalTryGrammar.g:3064:5: lv_qualifiers_1_0= ruleQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getQualifiedIdentifierAccess().getQualifiersQualifierParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_qualifiers_1_0=ruleQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getQualifiedIdentifierRule());
            	      					}
            	      					add(
            	      						current,
            	      						"qualifiers",
            	      						lv_qualifiers_1_0,
            	      						"org.unicam.tryGrammar.TryGrammar.Qualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedIdentifier"


    // $ANTLR start "entryRuleQualifier"
    // InternalTryGrammar.g:3085:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalTryGrammar.g:3085:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalTryGrammar.g:3086:2: iv_ruleQualifier= ruleQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifier=ruleQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifier"


    // $ANTLR start "ruleQualifier"
    // InternalTryGrammar.g:3092:1: ruleQualifier returns [EObject current=null] : (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Index_1 = null;

        EObject this_Arguments_2 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3098:2: ( (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) )
            // InternalTryGrammar.g:3099:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            {
            // InternalTryGrammar.g:3099:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt50=1;
                }
                break;
            case 34:
                {
                alt50=2;
                }
                break;
            case 22:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalTryGrammar.g:3100:3: this_Field_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQualifierAccess().getFieldParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Field_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:3109:3: this_Index_1= ruleIndex
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQualifierAccess().getIndexParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Index_1=ruleIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Index_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:3118:3: this_Arguments_2= ruleArguments
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQualifierAccess().getArgumentsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Arguments_2=ruleArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Arguments_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifier"


    // $ANTLR start "entryRuleField"
    // InternalTryGrammar.g:3130:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalTryGrammar.g:3130:46: (iv_ruleField= ruleField EOF )
            // InternalTryGrammar.g:3131:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalTryGrammar.g:3137:1: ruleField returns [EObject current=null] : (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_field_1_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:3143:2: ( (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) )
            // InternalTryGrammar.g:3144:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            {
            // InternalTryGrammar.g:3144:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            // InternalTryGrammar.g:3145:3: otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFullStopKeyword_0());
              		
            }
            // InternalTryGrammar.g:3149:3: ( (lv_field_1_0= RULE_ID ) )
            // InternalTryGrammar.g:3150:4: (lv_field_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:3150:4: (lv_field_1_0= RULE_ID )
            // InternalTryGrammar.g:3151:5: lv_field_1_0= RULE_ID
            {
            lv_field_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_field_1_0, grammarAccess.getFieldAccess().getFieldIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"field",
              						lv_field_1_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleIndex"
    // InternalTryGrammar.g:3171:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // InternalTryGrammar.g:3171:46: (iv_ruleIndex= ruleIndex EOF )
            // InternalTryGrammar.g:3172:2: iv_ruleIndex= ruleIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndex=ruleIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndex; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndex"


    // $ANTLR start "ruleIndex"
    // InternalTryGrammar.g:3178:1: ruleIndex returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3184:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) )
            // InternalTryGrammar.g:3185:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            {
            // InternalTryGrammar.g:3185:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            // InternalTryGrammar.g:3186:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalTryGrammar.g:3190:3: ()
            // InternalTryGrammar.g:3191:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndexAccess().getIndexAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:3197:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_INT)||LA51_0==22||(LA51_0>=57 && LA51_0<=168)||(LA51_0>=198 && LA51_0<=199)||(LA51_0>=210 && LA51_0<=214)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTryGrammar.g:3198:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:3198:4: (lv_value_2_0= ruleExpression )
                    // InternalTryGrammar.g:3199:5: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIndexAccess().getValueExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_35);
                    lv_value_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIndexRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_2_0,
                      						"org.unicam.tryGrammar.TryGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIndexAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndex"


    // $ANTLR start "entryRuleArguments"
    // InternalTryGrammar.g:3224:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalTryGrammar.g:3224:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalTryGrammar.g:3225:2: iv_ruleArguments= ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArguments; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalTryGrammar.g:3231:1: ruleArguments returns [EObject current=null] : ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3237:2: ( ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) )
            // InternalTryGrammar.g:3238:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            {
            // InternalTryGrammar.g:3238:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            // InternalTryGrammar.g:3239:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            {
            // InternalTryGrammar.g:3239:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            // InternalTryGrammar.g:3240:4: lv_arguments_0_0= ruleFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsFunctionCallArgumentsParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_arguments_0_0=ruleFunctionCallArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getArgumentsRule());
              				}
              				set(
              					current,
              					"arguments",
              					lv_arguments_0_0,
              					"org.unicam.tryGrammar.TryGrammar.FunctionCallArguments");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleModifier"
    // InternalTryGrammar.g:3260:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalTryGrammar.g:3260:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalTryGrammar.g:3261:2: iv_ruleModifier= ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModifier=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalTryGrammar.g:3267:1: ruleModifier returns [EObject current=null] : (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBlock ) ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3273:2: ( (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBlock ) ) ) )
            // InternalTryGrammar.g:3274:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBlock ) ) )
            {
            // InternalTryGrammar.g:3274:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBlock ) ) )
            // InternalTryGrammar.g:3275:3: otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModifierAccess().getModifierKeyword_0());
              		
            }
            // InternalTryGrammar.g:3279:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:3280:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:3280:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:3281:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getModifierAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModifierRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            // InternalTryGrammar.g:3297:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==22) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTryGrammar.g:3298:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalTryGrammar.g:3298:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalTryGrammar.g:3299:5: lv_parameters_2_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModifierAccess().getParametersParameterListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
                    lv_parameters_2_0=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModifierRule());
                      					}
                      					set(
                      						current,
                      						"parameters",
                      						lv_parameters_2_0,
                      						"org.unicam.tryGrammar.TryGrammar.ParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryGrammar.g:3316:3: ( (lv_block_3_0= ruleBlock ) )
            // InternalTryGrammar.g:3317:4: (lv_block_3_0= ruleBlock )
            {
            // InternalTryGrammar.g:3317:4: (lv_block_3_0= ruleBlock )
            // InternalTryGrammar.g:3318:5: lv_block_3_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModifierAccess().getBlockBlockParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_3_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModifierRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_3_0,
              						"org.unicam.tryGrammar.TryGrammar.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleEvent"
    // InternalTryGrammar.g:3339:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalTryGrammar.g:3339:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalTryGrammar.g:3340:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalTryGrammar.g:3346:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isAnonymous_3_0=null;
        Token otherlv_4=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3352:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' ) )
            // InternalTryGrammar.g:3353:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' )
            {
            // InternalTryGrammar.g:3353:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' )
            // InternalTryGrammar.g:3354:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
              		
            }
            // InternalTryGrammar.g:3358:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:3359:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:3359:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:3360:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEventRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            // InternalTryGrammar.g:3376:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==22) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTryGrammar.g:3377:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalTryGrammar.g:3377:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalTryGrammar.g:3378:5: lv_parameters_2_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEventAccess().getParametersParameterListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_44);
                    lv_parameters_2_0=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEventRule());
                      					}
                      					set(
                      						current,
                      						"parameters",
                      						lv_parameters_2_0,
                      						"org.unicam.tryGrammar.TryGrammar.ParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryGrammar.g:3395:3: ( (lv_isAnonymous_3_0= 'anonymous' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==40) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTryGrammar.g:3396:4: (lv_isAnonymous_3_0= 'anonymous' )
                    {
                    // InternalTryGrammar.g:3396:4: (lv_isAnonymous_3_0= 'anonymous' )
                    // InternalTryGrammar.g:3397:5: lv_isAnonymous_3_0= 'anonymous'
                    {
                    lv_isAnonymous_3_0=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isAnonymous_3_0, grammarAccess.getEventAccess().getIsAnonymousAnonymousKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEventRule());
                      					}
                      					setWithLastConsumed(current, "isAnonymous", true, "anonymous");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEventAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleModifierInvocation"
    // InternalTryGrammar.g:3417:1: entryRuleModifierInvocation returns [EObject current=null] : iv_ruleModifierInvocation= ruleModifierInvocation EOF ;
    public final EObject entryRuleModifierInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierInvocation = null;


        try {
            // InternalTryGrammar.g:3417:59: (iv_ruleModifierInvocation= ruleModifierInvocation EOF )
            // InternalTryGrammar.g:3418:2: iv_ruleModifierInvocation= ruleModifierInvocation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierInvocationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModifierInvocation=ruleModifierInvocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifierInvocation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifierInvocation"


    // $ANTLR start "ruleModifierInvocation"
    // InternalTryGrammar.g:3424:1: ruleModifierInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleModifierInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3430:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalTryGrammar.g:3431:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalTryGrammar.g:3431:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalTryGrammar.g:3432:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalTryGrammar.g:3432:3: ( (otherlv_0= RULE_ID ) )
            // InternalTryGrammar.g:3433:4: (otherlv_0= RULE_ID )
            {
            // InternalTryGrammar.g:3433:4: (otherlv_0= RULE_ID )
            // InternalTryGrammar.g:3434:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModifierInvocationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModifierInvocationAccess().getNameModifierCrossReference_0_0());
              				
            }

            }


            }

            // InternalTryGrammar.g:3445:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==22) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTryGrammar.g:3446:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalTryGrammar.g:3446:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalTryGrammar.g:3447:5: lv_args_1_0= ruleFunctionCallListArguments
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModifierInvocationAccess().getArgsFunctionCallListArgumentsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_args_1_0=ruleFunctionCallListArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModifierInvocationRule());
                      					}
                      					set(
                      						current,
                      						"args",
                      						lv_args_1_0,
                      						"org.unicam.tryGrammar.TryGrammar.FunctionCallListArguments");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifierInvocation"


    // $ANTLR start "entryRuleParameterList"
    // InternalTryGrammar.g:3468:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalTryGrammar.g:3468:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalTryGrammar.g:3469:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalTryGrammar.g:3475:1: ruleParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3481:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalTryGrammar.g:3482:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalTryGrammar.g:3482:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalTryGrammar.g:3483:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryGrammar.g:3487:3: ()
            // InternalTryGrammar.g:3488:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:3494:3: ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||LA57_0==32||LA57_0==36||(LA57_0>=65 && LA57_0<=168)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalTryGrammar.g:3495:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // InternalTryGrammar.g:3495:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) )
                    // InternalTryGrammar.g:3496:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    {
                    // InternalTryGrammar.g:3496:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    // InternalTryGrammar.g:3497:6: lv_parameters_2_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterListAccess().getParametersVariableDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_parameters_2_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterListRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"org.unicam.tryGrammar.TryGrammar.VariableDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryGrammar.g:3514:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==17) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalTryGrammar.g:3515:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_33); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:3519:5: ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    // InternalTryGrammar.g:3520:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalTryGrammar.g:3520:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    // InternalTryGrammar.g:3521:7: lv_parameters_4_0= ruleVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParameterListAccess().getParametersVariableDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_4_0=ruleVariableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"org.unicam.tryGrammar.TryGrammar.VariableDeclaration");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleReturnsParameterList"
    // InternalTryGrammar.g:3548:1: entryRuleReturnsParameterList returns [EObject current=null] : iv_ruleReturnsParameterList= ruleReturnsParameterList EOF ;
    public final EObject entryRuleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsParameterList = null;


        try {
            // InternalTryGrammar.g:3548:61: (iv_ruleReturnsParameterList= ruleReturnsParameterList EOF )
            // InternalTryGrammar.g:3549:2: iv_ruleReturnsParameterList= ruleReturnsParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnsParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnsParameterList=ruleReturnsParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnsParameterList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnsParameterList"


    // $ANTLR start "ruleReturnsParameterList"
    // InternalTryGrammar.g:3555:1: ruleReturnsParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3561:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalTryGrammar.g:3562:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalTryGrammar.g:3562:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalTryGrammar.g:3563:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnsParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryGrammar.g:3567:3: ()
            // InternalTryGrammar.g:3568:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnsParameterListAccess().getReturnsParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:3574:3: ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||LA59_0==32||LA59_0==36||(LA59_0>=65 && LA59_0<=168)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalTryGrammar.g:3575:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    {
                    // InternalTryGrammar.g:3575:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) )
                    // InternalTryGrammar.g:3576:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    {
                    // InternalTryGrammar.g:3576:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    // InternalTryGrammar.g:3577:6: lv_parameters_2_0= ruleReturnParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReturnsParameterListAccess().getParametersReturnParameterDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_parameters_2_0=ruleReturnParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReturnsParameterListRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"org.unicam.tryGrammar.TryGrammar.ReturnParameterDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryGrammar.g:3594:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==17) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalTryGrammar.g:3595:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_33); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReturnsParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:3599:5: ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    // InternalTryGrammar.g:3600:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    {
                    	    // InternalTryGrammar.g:3600:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    // InternalTryGrammar.g:3601:7: lv_parameters_4_0= ruleReturnParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReturnsParameterListAccess().getParametersReturnParameterDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_4_0=ruleReturnParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReturnsParameterListRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"org.unicam.tryGrammar.TryGrammar.ReturnParameterDeclaration");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getReturnsParameterListAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnsParameterList"


    // $ANTLR start "entryRuleReturnParameterDeclaration"
    // InternalTryGrammar.g:3628:1: entryRuleReturnParameterDeclaration returns [EObject current=null] : iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF ;
    public final EObject entryRuleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterDeclaration = null;


        try {
            // InternalTryGrammar.g:3628:67: (iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF )
            // InternalTryGrammar.g:3629:2: iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnParameterDeclaration=ruleReturnParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnParameterDeclaration"


    // $ANTLR start "ruleReturnParameterDeclaration"
    // InternalTryGrammar.g:3635:1: ruleReturnParameterDeclaration returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) ;
    public final EObject ruleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_typeRef_0_0 = null;

        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3641:2: ( ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) )
            // InternalTryGrammar.g:3642:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            {
            // InternalTryGrammar.g:3642:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            // InternalTryGrammar.g:3643:3: ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )?
            {
            // InternalTryGrammar.g:3643:3: ( (lv_typeRef_0_0= ruleType ) )
            // InternalTryGrammar.g:3644:4: (lv_typeRef_0_0= ruleType )
            {
            // InternalTryGrammar.g:3644:4: (lv_typeRef_0_0= ruleType )
            // InternalTryGrammar.g:3645:5: lv_typeRef_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnParameterDeclarationAccess().getTypeRefTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_typeRef_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReturnParameterDeclarationRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_0_0,
              						"org.unicam.tryGrammar.TryGrammar.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:3662:3: ( (lv_variable_1_0= ruleVariable ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalTryGrammar.g:3663:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalTryGrammar.g:3663:4: (lv_variable_1_0= ruleVariable )
                    // InternalTryGrammar.g:3664:5: lv_variable_1_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getReturnParameterDeclarationAccess().getVariableVariableParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getReturnParameterDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"variable",
                      						lv_variable_1_0,
                      						"org.unicam.tryGrammar.TryGrammar.Variable");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnParameterDeclaration"


    // $ANTLR start "entryRuleStatement"
    // InternalTryGrammar.g:3685:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTryGrammar.g:3685:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTryGrammar.g:3686:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTryGrammar.g:3692:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Block_3= ruleBlock | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_WhileStatement_1 = null;

        EObject this_ForStatement_2 = null;

        EObject this_Block_3 = null;

        EObject this_PlaceHolderStatement_4 = null;

        EObject this_ContinueStatement_5 = null;

        EObject this_BreakStatement_6 = null;

        EObject this_ReturnStatement_7 = null;

        EObject this_ThrowStatement_8 = null;

        EObject this_DeleteStatement_9 = null;

        EObject this_SimpleStatement_10 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3698:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Block_3= ruleBlock | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) )
            // InternalTryGrammar.g:3699:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Block_3= ruleBlock | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            {
            // InternalTryGrammar.g:3699:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Block_3= ruleBlock | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            int alt62=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt62=1;
                }
                break;
            case 44:
                {
                alt62=2;
                }
                break;
            case 45:
                {
                alt62=3;
                }
                break;
            case 16:
                {
                alt62=4;
                }
                break;
            case 50:
                {
                alt62=5;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 22:
            case 32:
            case 36:
            case 41:
            case 46:
            case 47:
            case 48:
            case 49:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
                {
                alt62=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalTryGrammar.g:3700:3: this_IfStatement_0= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_0=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:3709:3: this_WhileStatement_1= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_1=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileStatement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:3718:3: this_ForStatement_2= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStatement_2=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForStatement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:3727:3: this_Block_3= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_3=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Block_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTryGrammar.g:3736:3: this_PlaceHolderStatement_4= rulePlaceHolderStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getPlaceHolderStatementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PlaceHolderStatement_4=rulePlaceHolderStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PlaceHolderStatement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTryGrammar.g:3745:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    {
                    // InternalTryGrammar.g:3745:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    int alt61=6;
                    switch ( input.LA(1) ) {
                    case 46:
                        {
                        alt61=1;
                        }
                        break;
                    case 47:
                        {
                        alt61=2;
                        }
                        break;
                    case 48:
                        {
                        alt61=3;
                        }
                        break;
                    case 49:
                        {
                        alt61=4;
                        }
                        break;
                    case 41:
                        {
                        alt61=5;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_ID:
                    case RULE_INT:
                    case 22:
                    case 32:
                    case 36:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case 152:
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case 160:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 198:
                    case 199:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                        {
                        alt61=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }

                    switch (alt61) {
                        case 1 :
                            // InternalTryGrammar.g:3746:4: this_ContinueStatement_5= ruleContinueStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_5_0());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_ContinueStatement_5=ruleContinueStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_ContinueStatement_5;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 2 :
                            // InternalTryGrammar.g:3755:4: this_BreakStatement_6= ruleBreakStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_5_1());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_BreakStatement_6=ruleBreakStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_BreakStatement_6;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 3 :
                            // InternalTryGrammar.g:3764:4: this_ReturnStatement_7= ruleReturnStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_5_2());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_ReturnStatement_7=ruleReturnStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_ReturnStatement_7;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 4 :
                            // InternalTryGrammar.g:3773:4: this_ThrowStatement_8= ruleThrowStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getThrowStatementParserRuleCall_5_3());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_ThrowStatement_8=ruleThrowStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_ThrowStatement_8;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 5 :
                            // InternalTryGrammar.g:3782:4: this_DeleteStatement_9= ruleDeleteStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getDeleteStatementParserRuleCall_5_4());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_DeleteStatement_9=ruleDeleteStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_DeleteStatement_9;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 6 :
                            // InternalTryGrammar.g:3791:4: this_SimpleStatement_10= ruleSimpleStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getSimpleStatementParserRuleCall_5_5());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_SimpleStatement_10=ruleSimpleStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_SimpleStatement_10;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDeleteStatement"
    // InternalTryGrammar.g:3804:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // InternalTryGrammar.g:3804:56: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // InternalTryGrammar.g:3805:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteStatement"


    // $ANTLR start "ruleDeleteStatement"
    // InternalTryGrammar.g:3811:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3817:2: ( (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) )
            // InternalTryGrammar.g:3818:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            {
            // InternalTryGrammar.g:3818:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            // InternalTryGrammar.g:3819:3: otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
              		
            }
            // InternalTryGrammar.g:3823:3: ( (lv_variable_1_0= ruleQualifiedIdentifier ) )
            // InternalTryGrammar.g:3824:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            {
            // InternalTryGrammar.g:3824:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            // InternalTryGrammar.g:3825:5: lv_variable_1_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeleteStatementAccess().getVariableQualifiedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_variable_1_0=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"org.unicam.tryGrammar.TryGrammar.QualifiedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalTryGrammar.g:3850:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalTryGrammar.g:3850:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalTryGrammar.g:3851:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalTryGrammar.g:3857:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_trueBody_4_0 = null;

        EObject lv_falseBody_6_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3863:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) )
            // InternalTryGrammar.g:3864:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            {
            // InternalTryGrammar.g:3864:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            // InternalTryGrammar.g:3865:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryGrammar.g:3873:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalTryGrammar.g:3874:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalTryGrammar.g:3874:4: (lv_condition_2_0= ruleExpression )
            // InternalTryGrammar.g:3875:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"org.unicam.tryGrammar.TryGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalTryGrammar.g:3896:3: ( (lv_trueBody_4_0= ruleStatement ) )
            // InternalTryGrammar.g:3897:4: (lv_trueBody_4_0= ruleStatement )
            {
            // InternalTryGrammar.g:3897:4: (lv_trueBody_4_0= ruleStatement )
            // InternalTryGrammar.g:3898:5: lv_trueBody_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getTrueBodyStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_49);
            lv_trueBody_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"trueBody",
              						lv_trueBody_4_0,
              						"org.unicam.tryGrammar.TryGrammar.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:3915:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==43) ) {
                int LA63_1 = input.LA(2);

                if ( (synpred1_InternalTryGrammar()) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalTryGrammar.g:3916:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) )
                    {
                    // InternalTryGrammar.g:3916:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalTryGrammar.g:3917:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalTryGrammar.g:3923:4: ( (lv_falseBody_6_0= ruleStatement ) )
                    // InternalTryGrammar.g:3924:5: (lv_falseBody_6_0= ruleStatement )
                    {
                    // InternalTryGrammar.g:3924:5: (lv_falseBody_6_0= ruleStatement )
                    // InternalTryGrammar.g:3925:6: lv_falseBody_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStatementAccess().getFalseBodyStatementParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_falseBody_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"falseBody",
                      							lv_falseBody_6_0,
                      							"org.unicam.tryGrammar.TryGrammar.Statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalTryGrammar.g:3947:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalTryGrammar.g:3947:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalTryGrammar.g:3948:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalTryGrammar.g:3954:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3960:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) )
            // InternalTryGrammar.g:3961:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // InternalTryGrammar.g:3961:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            // InternalTryGrammar.g:3962:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryGrammar.g:3970:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalTryGrammar.g:3971:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalTryGrammar.g:3971:4: (lv_condition_2_0= ruleExpression )
            // InternalTryGrammar.g:3972:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"org.unicam.tryGrammar.TryGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalTryGrammar.g:3993:3: ( (lv_body_4_0= ruleStatement ) )
            // InternalTryGrammar.g:3994:4: (lv_body_4_0= ruleStatement )
            {
            // InternalTryGrammar.g:3994:4: (lv_body_4_0= ruleStatement )
            // InternalTryGrammar.g:3995:5: lv_body_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getBodyStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_4_0,
              						"org.unicam.tryGrammar.TryGrammar.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalTryGrammar.g:4016:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalTryGrammar.g:4016:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalTryGrammar.g:4017:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalTryGrammar.g:4023:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_initExpression_2_0 = null;

        EObject lv_conditionExpression_4_0 = null;

        EObject lv_loopExpression_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4029:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) )
            // InternalTryGrammar.g:4030:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            {
            // InternalTryGrammar.g:4030:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            // InternalTryGrammar.g:4031:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryGrammar.g:4039:3: ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_INT)||LA64_0==22||LA64_0==32||LA64_0==36||(LA64_0>=57 && LA64_0<=168)||(LA64_0>=198 && LA64_0<=199)||(LA64_0>=210 && LA64_0<=214)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTryGrammar.g:4040:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    {
                    // InternalTryGrammar.g:4040:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    // InternalTryGrammar.g:4041:5: lv_initExpression_2_0= ruleSimpleStatement2
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getInitExpressionSimpleStatement2ParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_initExpression_2_0=ruleSimpleStatement2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForStatementRule());
                      					}
                      					set(
                      						current,
                      						"initExpression",
                      						lv_initExpression_2_0,
                      						"org.unicam.tryGrammar.TryGrammar.SimpleStatement2");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryGrammar.g:4058:3: ( ( ';' )=>otherlv_3= ';' )
            // InternalTryGrammar.g:4059:4: ( ';' )=>otherlv_3= ';'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
              			
            }

            }

            // InternalTryGrammar.g:4065:3: ( (lv_conditionExpression_4_0= ruleExpression ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_INT)||LA65_0==22||(LA65_0>=57 && LA65_0<=168)||(LA65_0>=198 && LA65_0<=199)||(LA65_0>=210 && LA65_0<=214)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalTryGrammar.g:4066:4: (lv_conditionExpression_4_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:4066:4: (lv_conditionExpression_4_0= ruleExpression )
                    // InternalTryGrammar.g:4067:5: lv_conditionExpression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getConditionExpressionExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_conditionExpression_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForStatementRule());
                      					}
                      					set(
                      						current,
                      						"conditionExpression",
                      						lv_conditionExpression_4_0,
                      						"org.unicam.tryGrammar.TryGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_5());
              		
            }
            // InternalTryGrammar.g:4088:3: ( (lv_loopExpression_6_0= ruleExpressionStatement ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_INT)||LA66_0==22||(LA66_0>=57 && LA66_0<=168)||(LA66_0>=198 && LA66_0<=199)||(LA66_0>=210 && LA66_0<=214)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTryGrammar.g:4089:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    {
                    // InternalTryGrammar.g:4089:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    // InternalTryGrammar.g:4090:5: lv_loopExpression_6_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getLoopExpressionExpressionStatementParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
                    lv_loopExpression_6_0=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForStatementRule());
                      					}
                      					set(
                      						current,
                      						"loopExpression",
                      						lv_loopExpression_6_0,
                      						"org.unicam.tryGrammar.TryGrammar.ExpressionStatement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalTryGrammar.g:4111:3: ( (lv_body_8_0= ruleStatement ) )
            // InternalTryGrammar.g:4112:4: (lv_body_8_0= ruleStatement )
            {
            // InternalTryGrammar.g:4112:4: (lv_body_8_0= ruleStatement )
            // InternalTryGrammar.g:4113:5: lv_body_8_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getBodyStatementParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_8_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_8_0,
              						"org.unicam.tryGrammar.TryGrammar.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleBlock"
    // InternalTryGrammar.g:4134:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalTryGrammar.g:4134:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalTryGrammar.g:4135:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalTryGrammar.g:4141:1: ruleBlock returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4147:2: ( (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) )
            // InternalTryGrammar.g:4148:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            {
            // InternalTryGrammar.g:4148:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            // InternalTryGrammar.g:4149:3: otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalTryGrammar.g:4153:3: ()
            // InternalTryGrammar.g:4154:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:4160:3: ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_STRING && LA68_0<=RULE_INT)||LA68_0==16||LA68_0==22||LA68_0==32||LA68_0==36||(LA68_0>=41 && LA68_0<=42)||(LA68_0>=44 && LA68_0<=50)||(LA68_0>=57 && LA68_0<=168)||(LA68_0>=198 && LA68_0<=199)||(LA68_0>=210 && LA68_0<=214)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalTryGrammar.g:4161:4: ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )*
                    {
                    // InternalTryGrammar.g:4161:4: ( (lv_statements_2_0= ruleStatement ) )
                    // InternalTryGrammar.g:4162:5: (lv_statements_2_0= ruleStatement )
                    {
                    // InternalTryGrammar.g:4162:5: (lv_statements_2_0= ruleStatement )
                    // InternalTryGrammar.g:4163:6: lv_statements_2_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
                    lv_statements_2_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBlockRule());
                      						}
                      						add(
                      							current,
                      							"statements",
                      							lv_statements_2_0,
                      							"org.unicam.tryGrammar.TryGrammar.Statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryGrammar.g:4180:4: ( (lv_statements_3_0= ruleStatement ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_INT)||LA67_0==16||LA67_0==22||LA67_0==32||LA67_0==36||(LA67_0>=41 && LA67_0<=42)||(LA67_0>=44 && LA67_0<=50)||(LA67_0>=57 && LA67_0<=168)||(LA67_0>=198 && LA67_0<=199)||(LA67_0>=210 && LA67_0<=214)) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalTryGrammar.g:4181:5: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // InternalTryGrammar.g:4181:5: (lv_statements_3_0= ruleStatement )
                    	    // InternalTryGrammar.g:4182:6: lv_statements_3_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_53);
                    	    lv_statements_3_0=ruleStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getBlockRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"statements",
                    	      							lv_statements_3_0,
                    	      							"org.unicam.tryGrammar.TryGrammar.Statement");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleContinueStatement"
    // InternalTryGrammar.g:4208:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // InternalTryGrammar.g:4208:58: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalTryGrammar.g:4209:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContinueStatement=ruleContinueStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContinueStatement"


    // $ANTLR start "ruleContinueStatement"
    // InternalTryGrammar.g:4215:1: ruleContinueStatement returns [EObject current=null] : (otherlv_0= 'continue' () otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:4221:2: ( (otherlv_0= 'continue' () otherlv_2= ';' ) )
            // InternalTryGrammar.g:4222:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            {
            // InternalTryGrammar.g:4222:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            // InternalTryGrammar.g:4223:3: otherlv_0= 'continue' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContinueStatementAccess().getContinueKeyword_0());
              		
            }
            // InternalTryGrammar.g:4227:3: ()
            // InternalTryGrammar.g:4228:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContinueStatementAccess().getContinueAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getContinueStatementAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinueStatement"


    // $ANTLR start "entryRuleBreakStatement"
    // InternalTryGrammar.g:4242:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalTryGrammar.g:4242:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalTryGrammar.g:4243:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // InternalTryGrammar.g:4249:1: ruleBreakStatement returns [EObject current=null] : (otherlv_0= 'break' () otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:4255:2: ( (otherlv_0= 'break' () otherlv_2= ';' ) )
            // InternalTryGrammar.g:4256:2: (otherlv_0= 'break' () otherlv_2= ';' )
            {
            // InternalTryGrammar.g:4256:2: (otherlv_0= 'break' () otherlv_2= ';' )
            // InternalTryGrammar.g:4257:3: otherlv_0= 'break' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakStatementAccess().getBreakKeyword_0());
              		
            }
            // InternalTryGrammar.g:4261:3: ()
            // InternalTryGrammar.g:4262:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBreakStatementAccess().getBreakStatementAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBreakStatementAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalTryGrammar.g:4276:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalTryGrammar.g:4276:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalTryGrammar.g:4277:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalTryGrammar.g:4283:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4289:2: ( (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) )
            // InternalTryGrammar.g:4290:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            {
            // InternalTryGrammar.g:4290:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            // InternalTryGrammar.g:4291:3: otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
              		
            }
            // InternalTryGrammar.g:4295:3: ()
            // InternalTryGrammar.g:4296:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:4302:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_INT)||LA69_0==22||(LA69_0>=57 && LA69_0<=168)||(LA69_0>=198 && LA69_0<=199)||(LA69_0>=210 && LA69_0<=214)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTryGrammar.g:4303:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:4303:4: (lv_expression_2_0= ruleExpression )
                    // InternalTryGrammar.g:4304:5: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getReturnStatementRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_2_0,
                      						"org.unicam.tryGrammar.TryGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleThrowStatement"
    // InternalTryGrammar.g:4329:1: entryRuleThrowStatement returns [EObject current=null] : iv_ruleThrowStatement= ruleThrowStatement EOF ;
    public final EObject entryRuleThrowStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStatement = null;


        try {
            // InternalTryGrammar.g:4329:55: (iv_ruleThrowStatement= ruleThrowStatement EOF )
            // InternalTryGrammar.g:4330:2: iv_ruleThrowStatement= ruleThrowStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThrowStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleThrowStatement=ruleThrowStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThrowStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThrowStatement"


    // $ANTLR start "ruleThrowStatement"
    // InternalTryGrammar.g:4336:1: ruleThrowStatement returns [EObject current=null] : (otherlv_0= 'throw' () otherlv_2= ';' ) ;
    public final EObject ruleThrowStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:4342:2: ( (otherlv_0= 'throw' () otherlv_2= ';' ) )
            // InternalTryGrammar.g:4343:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            {
            // InternalTryGrammar.g:4343:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            // InternalTryGrammar.g:4344:3: otherlv_0= 'throw' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getThrowStatementAccess().getThrowKeyword_0());
              		
            }
            // InternalTryGrammar.g:4348:3: ()
            // InternalTryGrammar.g:4349:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getThrowStatementAccess().getThrowStatementAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getThrowStatementAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThrowStatement"


    // $ANTLR start "entryRulePlaceHolderStatement"
    // InternalTryGrammar.g:4363:1: entryRulePlaceHolderStatement returns [EObject current=null] : iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF ;
    public final EObject entryRulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceHolderStatement = null;


        try {
            // InternalTryGrammar.g:4363:61: (iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF )
            // InternalTryGrammar.g:4364:2: iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlaceHolderStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlaceHolderStatement=rulePlaceHolderStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlaceHolderStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlaceHolderStatement"


    // $ANTLR start "rulePlaceHolderStatement"
    // InternalTryGrammar.g:4370:1: rulePlaceHolderStatement returns [EObject current=null] : (otherlv_0= '_' () ) ;
    public final EObject rulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:4376:2: ( (otherlv_0= '_' () ) )
            // InternalTryGrammar.g:4377:2: (otherlv_0= '_' () )
            {
            // InternalTryGrammar.g:4377:2: (otherlv_0= '_' () )
            // InternalTryGrammar.g:4378:3: otherlv_0= '_' ()
            {
            otherlv_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlaceHolderStatementAccess().get_Keyword_0());
              		
            }
            // InternalTryGrammar.g:4382:3: ()
            // InternalTryGrammar.g:4383:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPlaceHolderStatementAccess().getPlaceHolderStatementAction_1(),
              					current);
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlaceHolderStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalTryGrammar.g:4393:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTryGrammar.g:4393:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTryGrammar.g:4394:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTryGrammar.g:4400:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4406:2: (this_Assignment_0= ruleAssignment )
            // InternalTryGrammar.g:4407:2: this_Assignment_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Assignment_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Assignment_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSpecialExpression"
    // InternalTryGrammar.g:4418:1: entryRuleSpecialExpression returns [EObject current=null] : iv_ruleSpecialExpression= ruleSpecialExpression EOF ;
    public final EObject entryRuleSpecialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialExpression = null;


        try {
            // InternalTryGrammar.g:4418:58: (iv_ruleSpecialExpression= ruleSpecialExpression EOF )
            // InternalTryGrammar.g:4419:2: iv_ruleSpecialExpression= ruleSpecialExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecialExpression=ruleSpecialExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecialExpression"


    // $ANTLR start "ruleSpecialExpression"
    // InternalTryGrammar.g:4425:1: ruleSpecialExpression returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) ;
    public final EObject ruleSpecialExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_fieldOrMethod_1_0 = null;

        EObject lv_qualifiers_2_1 = null;

        EObject lv_qualifiers_2_2 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4431:2: ( ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) )
            // InternalTryGrammar.g:4432:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            {
            // InternalTryGrammar.g:4432:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            // InternalTryGrammar.g:4433:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            {
            // InternalTryGrammar.g:4433:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) )
            // InternalTryGrammar.g:4434:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            {
            // InternalTryGrammar.g:4434:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            // InternalTryGrammar.g:4435:5: lv_type_0_0= ruleSpecialExpressionTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialExpressionAccess().getTypeSpecialExpressionTypeEnumEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_41);
            lv_type_0_0=ruleSpecialExpressionTypeEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSpecialExpressionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.unicam.tryGrammar.TryGrammar.SpecialExpressionTypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:4452:3: ( (lv_fieldOrMethod_1_0= ruleField ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==37) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTryGrammar.g:4453:4: (lv_fieldOrMethod_1_0= ruleField )
                    {
                    // InternalTryGrammar.g:4453:4: (lv_fieldOrMethod_1_0= ruleField )
                    // InternalTryGrammar.g:4454:5: lv_fieldOrMethod_1_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecialExpressionAccess().getFieldOrMethodFieldParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_41);
                    lv_fieldOrMethod_1_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecialExpressionRule());
                      					}
                      					set(
                      						current,
                      						"fieldOrMethod",
                      						lv_fieldOrMethod_1_0,
                      						"org.unicam.tryGrammar.TryGrammar.Field");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryGrammar.g:4471:3: ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==22||LA72_0==34) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalTryGrammar.g:4472:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    {
            	    // InternalTryGrammar.g:4472:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    // InternalTryGrammar.g:4473:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    {
            	    // InternalTryGrammar.g:4473:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==34) ) {
            	        alt71=1;
            	    }
            	    else if ( (LA71_0==22) ) {
            	        alt71=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 71, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // InternalTryGrammar.g:4474:6: lv_qualifiers_2_1= ruleIndex
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getSpecialExpressionAccess().getQualifiersIndexParserRuleCall_2_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_41);
            	            lv_qualifiers_2_1=ruleIndex();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getSpecialExpressionRule());
            	              						}
            	              						add(
            	              							current,
            	              							"qualifiers",
            	              							lv_qualifiers_2_1,
            	              							"org.unicam.tryGrammar.TryGrammar.Index");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTryGrammar.g:4490:6: lv_qualifiers_2_2= ruleArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getSpecialExpressionAccess().getQualifiersArgumentsParserRuleCall_2_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_41);
            	            lv_qualifiers_2_2=ruleArguments();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getSpecialExpressionRule());
            	              						}
            	              						add(
            	              							current,
            	              							"qualifiers",
            	              							lv_qualifiers_2_2,
            	              							"org.unicam.tryGrammar.TryGrammar.Arguments");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialExpression"


    // $ANTLR start "entryRuleAssignment"
    // InternalTryGrammar.g:4512:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalTryGrammar.g:4512:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalTryGrammar.g:4513:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalTryGrammar.g:4519:1: ruleAssignment returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        EObject this_BinaryExpression_0 = null;

        Enumerator lv_assignmentOp_2_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_variable_5_0 = null;

        EObject lv_expression_7_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4525:2: ( (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) )
            // InternalTryGrammar.g:4526:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            {
            // InternalTryGrammar.g:4526:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            // InternalTryGrammar.g:4527:3: this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getBinaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_BinaryExpression_0=ruleBinaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BinaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4535:3: ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            int alt74=3;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==30||(LA74_0>=175 && LA74_0<=185)) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_ID) ) {
                alt74=2;
            }
            switch (alt74) {
                case 1 :
                    // InternalTryGrammar.g:4536:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // InternalTryGrammar.g:4536:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    // InternalTryGrammar.g:4537:5: () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // InternalTryGrammar.g:4537:5: ()
                    // InternalTryGrammar.g:4538:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryGrammar.g:4544:5: ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) )
                    // InternalTryGrammar.g:4545:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    {
                    // InternalTryGrammar.g:4545:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    // InternalTryGrammar.g:4546:7: lv_assignmentOp_2_0= ruleAssignmentOpEnum
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssignmentAccess().getAssignmentOpAssignmentOpEnumEnumRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_19);
                    lv_assignmentOp_2_0=ruleAssignmentOpEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      							}
                      							set(
                      								current,
                      								"assignmentOp",
                      								lv_assignmentOp_2_0,
                      								"org.unicam.tryGrammar.TryGrammar.AssignmentOpEnum");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTryGrammar.g:4563:5: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalTryGrammar.g:4564:6: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:4564:6: (lv_expression_3_0= ruleExpression )
                    // InternalTryGrammar.g:4565:7: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      							}
                      							set(
                      								current,
                      								"expression",
                      								lv_expression_3_0,
                      								"org.unicam.tryGrammar.TryGrammar.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:4584:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    {
                    // InternalTryGrammar.g:4584:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    // InternalTryGrammar.g:4585:5: () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    {
                    // InternalTryGrammar.g:4585:5: ()
                    // InternalTryGrammar.g:4586:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getVariableDeclarationExpressionTypeAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryGrammar.g:4592:5: ( (lv_variable_5_0= ruleVariable ) )
                    // InternalTryGrammar.g:4593:6: (lv_variable_5_0= ruleVariable )
                    {
                    // InternalTryGrammar.g:4593:6: (lv_variable_5_0= ruleVariable )
                    // InternalTryGrammar.g:4594:7: lv_variable_5_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_29);
                    lv_variable_5_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      							}
                      							set(
                      								current,
                      								"variable",
                      								lv_variable_5_0,
                      								"org.unicam.tryGrammar.TryGrammar.Variable");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTryGrammar.g:4611:5: (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==30) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalTryGrammar.g:4612:6: otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) )
                            {
                            otherlv_6=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1_2_0());
                              					
                            }
                            // InternalTryGrammar.g:4616:6: ( (lv_expression_7_0= ruleExpression ) )
                            // InternalTryGrammar.g:4617:7: (lv_expression_7_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:4617:7: (lv_expression_7_0= ruleExpression )
                            // InternalTryGrammar.g:4618:8: lv_expression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_1_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_expression_7_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getAssignmentRule());
                              								}
                              								set(
                              									current,
                              									"expression",
                              									lv_expression_7_0,
                              									"org.unicam.tryGrammar.TryGrammar.Expression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalTryGrammar.g:4642:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalTryGrammar.g:4642:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalTryGrammar.g:4643:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalTryGrammar.g:4649:1: ruleBinaryExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4655:2: (this_Or_0= ruleOr )
            // InternalTryGrammar.g:4656:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Or_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleOr"
    // InternalTryGrammar.g:4667:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalTryGrammar.g:4667:43: (iv_ruleOr= ruleOr EOF )
            // InternalTryGrammar.g:4668:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalTryGrammar.g:4674:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4680:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalTryGrammar.g:4681:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalTryGrammar.g:4681:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalTryGrammar.g:4682:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4690:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==51) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalTryGrammar.g:4691:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalTryGrammar.g:4691:4: ()
            	    // InternalTryGrammar.g:4692:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:4702:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalTryGrammar.g:4703:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalTryGrammar.g:4703:5: (lv_right_3_0= ruleAnd )
            	    // InternalTryGrammar.g:4704:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalTryGrammar.g:4726:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalTryGrammar.g:4726:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalTryGrammar.g:4727:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalTryGrammar.g:4733:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4739:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalTryGrammar.g:4740:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalTryGrammar.g:4740:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalTryGrammar.g:4741:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4749:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==52) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalTryGrammar.g:4750:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalTryGrammar.g:4750:4: ()
            	    // InternalTryGrammar.g:4751:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:4761:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalTryGrammar.g:4762:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalTryGrammar.g:4762:5: (lv_right_3_0= ruleEquality )
            	    // InternalTryGrammar.g:4763:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalTryGrammar.g:4785:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalTryGrammar.g:4785:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalTryGrammar.g:4786:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalTryGrammar.g:4792:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_equalityOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4798:2: ( (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalTryGrammar.g:4799:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalTryGrammar.g:4799:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalTryGrammar.g:4800:3: this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4808:3: ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=186 && LA77_0<=187)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalTryGrammar.g:4809:4: () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalTryGrammar.g:4809:4: ()
            	    // InternalTryGrammar.g:4810:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryGrammar.g:4816:4: ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) )
            	    // InternalTryGrammar.g:4817:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    {
            	    // InternalTryGrammar.g:4817:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    // InternalTryGrammar.g:4818:6: lv_equalityOp_2_0= ruleEqualityOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getEqualityOpEqualityOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_equalityOp_2_0=ruleEqualityOpEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"equalityOp",
            	      							lv_equalityOp_2_0,
            	      							"org.unicam.tryGrammar.TryGrammar.EqualityOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTryGrammar.g:4835:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalTryGrammar.g:4836:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalTryGrammar.g:4836:5: (lv_right_3_0= ruleComparison )
            	    // InternalTryGrammar.g:4837:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalTryGrammar.g:4859:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalTryGrammar.g:4859:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalTryGrammar.g:4860:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalTryGrammar.g:4866:1: ruleComparison returns [EObject current=null] : (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BitOr_0 = null;

        Enumerator lv_comparisonOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4872:2: ( (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) )
            // InternalTryGrammar.g:4873:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            {
            // InternalTryGrammar.g:4873:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            // InternalTryGrammar.g:4874:3: this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getBitOrParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_BitOr_0=ruleBitOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitOr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4882:3: ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=188 && LA78_0<=192)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalTryGrammar.g:4883:4: () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) )
            	    {
            	    // InternalTryGrammar.g:4883:4: ()
            	    // InternalTryGrammar.g:4884:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryGrammar.g:4890:4: ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) )
            	    // InternalTryGrammar.g:4891:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    {
            	    // InternalTryGrammar.g:4891:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    // InternalTryGrammar.g:4892:6: lv_comparisonOp_2_0= ruleComparisonOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getComparisonOpComparisonOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_comparisonOp_2_0=ruleComparisonOpEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"comparisonOp",
            	      							lv_comparisonOp_2_0,
            	      							"org.unicam.tryGrammar.TryGrammar.ComparisonOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTryGrammar.g:4909:4: ( (lv_right_3_0= ruleBitOr ) )
            	    // InternalTryGrammar.g:4910:5: (lv_right_3_0= ruleBitOr )
            	    {
            	    // InternalTryGrammar.g:4910:5: (lv_right_3_0= ruleBitOr )
            	    // InternalTryGrammar.g:4911:6: lv_right_3_0= ruleBitOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightBitOrParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_right_3_0=ruleBitOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.BitOr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBitOr"
    // InternalTryGrammar.g:4933:1: entryRuleBitOr returns [EObject current=null] : iv_ruleBitOr= ruleBitOr EOF ;
    public final EObject entryRuleBitOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitOr = null;


        try {
            // InternalTryGrammar.g:4933:46: (iv_ruleBitOr= ruleBitOr EOF )
            // InternalTryGrammar.g:4934:2: iv_ruleBitOr= ruleBitOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitOr=ruleBitOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitOr"


    // $ANTLR start "ruleBitOr"
    // InternalTryGrammar.g:4940:1: ruleBitOr returns [EObject current=null] : (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) ;
    public final EObject ruleBitOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitXor_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4946:2: ( (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) )
            // InternalTryGrammar.g:4947:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            {
            // InternalTryGrammar.g:4947:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            // InternalTryGrammar.g:4948:3: this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitOrAccess().getBitXorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_BitXor_0=ruleBitXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitXor_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4956:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==53) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalTryGrammar.g:4957:4: () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) )
            	    {
            	    // InternalTryGrammar.g:4957:4: ()
            	    // InternalTryGrammar.g:4958:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitOrAccess().getBitOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitOrAccess().getVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:4968:4: ( (lv_right_3_0= ruleBitXor ) )
            	    // InternalTryGrammar.g:4969:5: (lv_right_3_0= ruleBitXor )
            	    {
            	    // InternalTryGrammar.g:4969:5: (lv_right_3_0= ruleBitXor )
            	    // InternalTryGrammar.g:4970:6: lv_right_3_0= ruleBitXor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitOrAccess().getRightBitXorParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
            	    lv_right_3_0=ruleBitXor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBitOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.BitXor");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitOr"


    // $ANTLR start "entryRuleBitXor"
    // InternalTryGrammar.g:4992:1: entryRuleBitXor returns [EObject current=null] : iv_ruleBitXor= ruleBitXor EOF ;
    public final EObject entryRuleBitXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitXor = null;


        try {
            // InternalTryGrammar.g:4992:47: (iv_ruleBitXor= ruleBitXor EOF )
            // InternalTryGrammar.g:4993:2: iv_ruleBitXor= ruleBitXor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitXorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitXor=ruleBitXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitXor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitXor"


    // $ANTLR start "ruleBitXor"
    // InternalTryGrammar.g:4999:1: ruleBitXor returns [EObject current=null] : (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) ;
    public final EObject ruleBitXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitAnd_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5005:2: ( (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) )
            // InternalTryGrammar.g:5006:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            {
            // InternalTryGrammar.g:5006:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            // InternalTryGrammar.g:5007:3: this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitXorAccess().getBitAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_BitAnd_0=ruleBitAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitAnd_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:5015:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==54) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalTryGrammar.g:5016:4: () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) )
            	    {
            	    // InternalTryGrammar.g:5016:4: ()
            	    // InternalTryGrammar.g:5017:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitXorAccess().getBitXorLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitXorAccess().getCircumflexAccentKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:5027:4: ( (lv_right_3_0= ruleBitAnd ) )
            	    // InternalTryGrammar.g:5028:5: (lv_right_3_0= ruleBitAnd )
            	    {
            	    // InternalTryGrammar.g:5028:5: (lv_right_3_0= ruleBitAnd )
            	    // InternalTryGrammar.g:5029:6: lv_right_3_0= ruleBitAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitXorAccess().getRightBitAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
            	    lv_right_3_0=ruleBitAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBitXorRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.BitAnd");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitXor"


    // $ANTLR start "entryRuleBitAnd"
    // InternalTryGrammar.g:5051:1: entryRuleBitAnd returns [EObject current=null] : iv_ruleBitAnd= ruleBitAnd EOF ;
    public final EObject entryRuleBitAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitAnd = null;


        try {
            // InternalTryGrammar.g:5051:47: (iv_ruleBitAnd= ruleBitAnd EOF )
            // InternalTryGrammar.g:5052:2: iv_ruleBitAnd= ruleBitAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitAnd=ruleBitAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitAnd"


    // $ANTLR start "ruleBitAnd"
    // InternalTryGrammar.g:5058:1: ruleBitAnd returns [EObject current=null] : (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) ;
    public final EObject ruleBitAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Shift_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5064:2: ( (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) )
            // InternalTryGrammar.g:5065:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            {
            // InternalTryGrammar.g:5065:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            // InternalTryGrammar.g:5066:3: this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitAndAccess().getShiftParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_Shift_0=ruleShift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Shift_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:5074:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==55) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalTryGrammar.g:5075:4: () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) )
            	    {
            	    // InternalTryGrammar.g:5075:4: ()
            	    // InternalTryGrammar.g:5076:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitAndAccess().getBitAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitAndAccess().getAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:5086:4: ( (lv_right_3_0= ruleShift ) )
            	    // InternalTryGrammar.g:5087:5: (lv_right_3_0= ruleShift )
            	    {
            	    // InternalTryGrammar.g:5087:5: (lv_right_3_0= ruleShift )
            	    // InternalTryGrammar.g:5088:6: lv_right_3_0= ruleShift
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitAndAccess().getRightShiftParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_right_3_0=ruleShift();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBitAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.Shift");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitAnd"


    // $ANTLR start "entryRuleShift"
    // InternalTryGrammar.g:5110:1: entryRuleShift returns [EObject current=null] : iv_ruleShift= ruleShift EOF ;
    public final EObject entryRuleShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShift = null;


        try {
            // InternalTryGrammar.g:5110:46: (iv_ruleShift= ruleShift EOF )
            // InternalTryGrammar.g:5111:2: iv_ruleShift= ruleShift EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShift=ruleShift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShift; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShift"


    // $ANTLR start "ruleShift"
    // InternalTryGrammar.g:5117:1: ruleShift returns [EObject current=null] : (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) ;
    public final EObject ruleShift() throws RecognitionException {
        EObject current = null;

        EObject this_AddSub_0 = null;

        Enumerator lv_shiftOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5123:2: ( (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) )
            // InternalTryGrammar.g:5124:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            {
            // InternalTryGrammar.g:5124:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            // InternalTryGrammar.g:5125:3: this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftAccess().getAddSubParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_AddSub_0=ruleAddSub();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddSub_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:5133:3: ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( ((LA82_0>=193 && LA82_0<=195)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalTryGrammar.g:5134:4: () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) )
            	    {
            	    // InternalTryGrammar.g:5134:4: ()
            	    // InternalTryGrammar.g:5135:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getShiftAccess().getShiftLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryGrammar.g:5141:4: ( (lv_shiftOp_2_0= ruleShiftOpEnum ) )
            	    // InternalTryGrammar.g:5142:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    {
            	    // InternalTryGrammar.g:5142:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    // InternalTryGrammar.g:5143:6: lv_shiftOp_2_0= ruleShiftOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftAccess().getShiftOpShiftOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_shiftOp_2_0=ruleShiftOpEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getShiftRule());
            	      						}
            	      						set(
            	      							current,
            	      							"shiftOp",
            	      							lv_shiftOp_2_0,
            	      							"org.unicam.tryGrammar.TryGrammar.ShiftOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTryGrammar.g:5160:4: ( (lv_right_3_0= ruleAddSub ) )
            	    // InternalTryGrammar.g:5161:5: (lv_right_3_0= ruleAddSub )
            	    {
            	    // InternalTryGrammar.g:5161:5: (lv_right_3_0= ruleAddSub )
            	    // InternalTryGrammar.g:5162:6: lv_right_3_0= ruleAddSub
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftAccess().getRightAddSubParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
            	    lv_right_3_0=ruleAddSub();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getShiftRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.AddSub");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShift"


    // $ANTLR start "entryRuleAddSub"
    // InternalTryGrammar.g:5184:1: entryRuleAddSub returns [EObject current=null] : iv_ruleAddSub= ruleAddSub EOF ;
    public final EObject entryRuleAddSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSub = null;


        try {
            // InternalTryGrammar.g:5184:47: (iv_ruleAddSub= ruleAddSub EOF )
            // InternalTryGrammar.g:5185:2: iv_ruleAddSub= ruleAddSub EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddSubRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddSub=ruleAddSub();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddSub; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddSub"


    // $ANTLR start "ruleAddSub"
    // InternalTryGrammar.g:5191:1: ruleAddSub returns [EObject current=null] : (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) ;
    public final EObject ruleAddSub() throws RecognitionException {
        EObject current = null;

        EObject this_MulDivMod_0 = null;

        Enumerator lv_additionOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5197:2: ( (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) )
            // InternalTryGrammar.g:5198:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            {
            // InternalTryGrammar.g:5198:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            // InternalTryGrammar.g:5199:3: this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddSubAccess().getMulDivModParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_63);
            this_MulDivMod_0=ruleMulDivMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulDivMod_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:5207:3: ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==59) && (synpred3_InternalTryGrammar())) {
                    alt83=1;
                }
                else if ( (LA83_0==60) && (synpred3_InternalTryGrammar())) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalTryGrammar.g:5208:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    {
            	    // InternalTryGrammar.g:5223:4: ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    // InternalTryGrammar.g:5224:5: () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) )
            	    {
            	    // InternalTryGrammar.g:5224:5: ()
            	    // InternalTryGrammar.g:5225:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAddSubAccess().getAddSubLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalTryGrammar.g:5231:5: ( (lv_additionOp_2_0= ruleAdditionOpEnum ) )
            	    // InternalTryGrammar.g:5232:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    {
            	    // InternalTryGrammar.g:5232:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    // InternalTryGrammar.g:5233:7: lv_additionOp_2_0= ruleAdditionOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddSubAccess().getAdditionOpAdditionOpEnumEnumRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_additionOp_2_0=ruleAdditionOpEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAddSubRule());
            	      							}
            	      							set(
            	      								current,
            	      								"additionOp",
            	      								lv_additionOp_2_0,
            	      								"org.unicam.tryGrammar.TryGrammar.AdditionOpEnum");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalTryGrammar.g:5250:5: ( (lv_right_3_0= ruleMulDivMod ) )
            	    // InternalTryGrammar.g:5251:6: (lv_right_3_0= ruleMulDivMod )
            	    {
            	    // InternalTryGrammar.g:5251:6: (lv_right_3_0= ruleMulDivMod )
            	    // InternalTryGrammar.g:5252:7: lv_right_3_0= ruleMulDivMod
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddSubAccess().getRightMulDivModParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_63);
            	    lv_right_3_0=ruleMulDivMod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAddSubRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"org.unicam.tryGrammar.TryGrammar.MulDivMod");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddSub"


    // $ANTLR start "entryRuleMulDivMod"
    // InternalTryGrammar.g:5275:1: entryRuleMulDivMod returns [EObject current=null] : iv_ruleMulDivMod= ruleMulDivMod EOF ;
    public final EObject entryRuleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDivMod = null;


        try {
            // InternalTryGrammar.g:5275:50: (iv_ruleMulDivMod= ruleMulDivMod EOF )
            // InternalTryGrammar.g:5276:2: iv_ruleMulDivMod= ruleMulDivMod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulDivModRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulDivMod=ruleMulDivMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulDivMod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulDivMod"


    // $ANTLR start "ruleMulDivMod"
    // InternalTryGrammar.g:5282:1: ruleMulDivMod returns [EObject current=null] : (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) ;
    public final EObject ruleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject this_Exponent_0 = null;

        Enumerator lv_multipliciativeOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5288:2: ( (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) )
            // InternalTryGrammar.g:5289:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            {
            // InternalTryGrammar.g:5289:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            // InternalTryGrammar.g:5290:3: this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulDivModAccess().getExponentParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_64);
            this_Exponent_0=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Exponent_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:5298:3: ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==13||(LA84_0>=196 && LA84_0<=197)) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalTryGrammar.g:5299:4: () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) )
            	    {
            	    // InternalTryGrammar.g:5299:4: ()
            	    // InternalTryGrammar.g:5300:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulDivModAccess().getMulDivModLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryGrammar.g:5306:4: ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) )
            	    // InternalTryGrammar.g:5307:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    {
            	    // InternalTryGrammar.g:5307:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    // InternalTryGrammar.g:5308:6: lv_multipliciativeOp_2_0= ruleMulDivModOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulDivModAccess().getMultipliciativeOpMulDivModOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_multipliciativeOp_2_0=ruleMulDivModOpEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulDivModRule());
            	      						}
            	      						set(
            	      							current,
            	      							"multipliciativeOp",
            	      							lv_multipliciativeOp_2_0,
            	      							"org.unicam.tryGrammar.TryGrammar.MulDivModOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTryGrammar.g:5325:4: ( (lv_right_3_0= ruleExponent ) )
            	    // InternalTryGrammar.g:5326:5: (lv_right_3_0= ruleExponent )
            	    {
            	    // InternalTryGrammar.g:5326:5: (lv_right_3_0= ruleExponent )
            	    // InternalTryGrammar.g:5327:6: lv_right_3_0= ruleExponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulDivModAccess().getRightExponentParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_64);
            	    lv_right_3_0=ruleExponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulDivModRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.Exponent");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulDivMod"


    // $ANTLR start "entryRuleExponent"
    // InternalTryGrammar.g:5349:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalTryGrammar.g:5349:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalTryGrammar.g:5350:2: iv_ruleExponent= ruleExponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExponent=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponent"


    // $ANTLR start "ruleExponent"
    // InternalTryGrammar.g:5356:1: ruleExponent returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5362:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalTryGrammar.g:5363:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalTryGrammar.g:5363:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalTryGrammar.g:5364:3: this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExponentAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_65);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:5372:3: ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==56) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalTryGrammar.g:5373:4: () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalTryGrammar.g:5373:4: ()
            	    // InternalTryGrammar.g:5374:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExponentAccess().getExponentLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:5384:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalTryGrammar.g:5385:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalTryGrammar.g:5385:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalTryGrammar.g:5386:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExponentAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
            	    lv_right_3_0=ruleUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExponentRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.unicam.tryGrammar.TryGrammar.UnaryExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponent"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalTryGrammar.g:5408:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalTryGrammar.g:5408:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalTryGrammar.g:5409:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalTryGrammar.g:5415:1: ruleUnaryExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_BinaryNotExpression_1 = null;

        EObject this_SignExpression_2 = null;

        EObject this_NewExpression_3 = null;

        EObject this_PreExpression_4 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5421:2: ( (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) )
            // InternalTryGrammar.g:5422:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            {
            // InternalTryGrammar.g:5422:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            int alt86=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt86=1;
                }
                break;
            case 58:
                {
                alt86=2;
                }
                break;
            case 59:
            case 60:
                {
                alt86=3;
                }
                break;
            case 61:
                {
                alt86=4;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 22:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
                {
                alt86=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalTryGrammar.g:5423:3: this_NotExpression_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getNotExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NotExpression_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NotExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:5432:3: this_BinaryNotExpression_1= ruleBinaryNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getBinaryNotExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BinaryNotExpression_1=ruleBinaryNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BinaryNotExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:5441:3: this_SignExpression_2= ruleSignExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getSignExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SignExpression_2=ruleSignExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SignExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:5450:3: this_NewExpression_3= ruleNewExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getNewExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NewExpression_3=ruleNewExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NewExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTryGrammar.g:5459:3: this_PreExpression_4= rulePreExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPreExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PreExpression_4=rulePreExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalTryGrammar.g:5471:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalTryGrammar.g:5471:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalTryGrammar.g:5472:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalTryGrammar.g:5478:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5484:2: ( (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalTryGrammar.g:5485:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalTryGrammar.g:5485:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalTryGrammar.g:5486:3: otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalTryGrammar.g:5490:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalTryGrammar.g:5491:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalTryGrammar.g:5491:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalTryGrammar.g:5492:5: lv_expression_1_0= ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNotExpressionAccess().getExpressionUnaryExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.unicam.tryGrammar.TryGrammar.UnaryExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleBinaryNotExpression"
    // InternalTryGrammar.g:5513:1: entryRuleBinaryNotExpression returns [EObject current=null] : iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF ;
    public final EObject entryRuleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryNotExpression = null;


        try {
            // InternalTryGrammar.g:5513:60: (iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF )
            // InternalTryGrammar.g:5514:2: iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryNotExpression=ruleBinaryNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryNotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryNotExpression"


    // $ANTLR start "ruleBinaryNotExpression"
    // InternalTryGrammar.g:5520:1: ruleBinaryNotExpression returns [EObject current=null] : (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5526:2: ( (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalTryGrammar.g:5527:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalTryGrammar.g:5527:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalTryGrammar.g:5528:3: otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBinaryNotExpressionAccess().getTildeKeyword_0());
              		
            }
            // InternalTryGrammar.g:5532:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalTryGrammar.g:5533:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalTryGrammar.g:5533:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalTryGrammar.g:5534:5: lv_expression_1_0= ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryNotExpressionAccess().getExpressionUnaryExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBinaryNotExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.unicam.tryGrammar.TryGrammar.UnaryExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryNotExpression"


    // $ANTLR start "entryRuleSignExpression"
    // InternalTryGrammar.g:5555:1: entryRuleSignExpression returns [EObject current=null] : iv_ruleSignExpression= ruleSignExpression EOF ;
    public final EObject entryRuleSignExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignExpression = null;


        try {
            // InternalTryGrammar.g:5555:55: (iv_ruleSignExpression= ruleSignExpression EOF )
            // InternalTryGrammar.g:5556:2: iv_ruleSignExpression= ruleSignExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignExpression=ruleSignExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignExpression"


    // $ANTLR start "ruleSignExpression"
    // InternalTryGrammar.g:5562:1: ruleSignExpression returns [EObject current=null] : ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleSignExpression() throws RecognitionException {
        EObject current = null;

        Token lv_signOp_0_1=null;
        Token lv_signOp_0_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5568:2: ( ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalTryGrammar.g:5569:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalTryGrammar.g:5569:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalTryGrammar.g:5570:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            // InternalTryGrammar.g:5570:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) )
            // InternalTryGrammar.g:5571:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            {
            // InternalTryGrammar.g:5571:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            // InternalTryGrammar.g:5572:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            {
            // InternalTryGrammar.g:5572:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==59) ) {
                alt87=1;
            }
            else if ( (LA87_0==60) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalTryGrammar.g:5573:6: lv_signOp_0_1= '+'
                    {
                    lv_signOp_0_1=(Token)match(input,59,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_signOp_0_1, grammarAccess.getSignExpressionAccess().getSignOpPlusSignKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSignExpressionRule());
                      						}
                      						setWithLastConsumed(current, "signOp", lv_signOp_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:5584:6: lv_signOp_0_2= '-'
                    {
                    lv_signOp_0_2=(Token)match(input,60,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_signOp_0_2, grammarAccess.getSignExpressionAccess().getSignOpHyphenMinusKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSignExpressionRule());
                      						}
                      						setWithLastConsumed(current, "signOp", lv_signOp_0_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalTryGrammar.g:5597:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalTryGrammar.g:5598:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalTryGrammar.g:5598:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalTryGrammar.g:5599:5: lv_expression_1_0= ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignExpressionAccess().getExpressionUnaryExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSignExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.unicam.tryGrammar.TryGrammar.UnaryExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignExpression"


    // $ANTLR start "entryRuleNewExpression"
    // InternalTryGrammar.g:5620:1: entryRuleNewExpression returns [EObject current=null] : iv_ruleNewExpression= ruleNewExpression EOF ;
    public final EObject entryRuleNewExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewExpression = null;


        try {
            // InternalTryGrammar.g:5620:54: (iv_ruleNewExpression= ruleNewExpression EOF )
            // InternalTryGrammar.g:5621:2: iv_ruleNewExpression= ruleNewExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNewExpression=ruleNewExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewExpression"


    // $ANTLR start "ruleNewExpression"
    // InternalTryGrammar.g:5627:1: ruleNewExpression returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) ;
    public final EObject ruleNewExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5633:2: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) )
            // InternalTryGrammar.g:5634:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            {
            // InternalTryGrammar.g:5634:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            // InternalTryGrammar.g:5635:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNewExpressionAccess().getNewKeyword_0());
              		
            }
            // InternalTryGrammar.g:5639:3: ( (otherlv_1= RULE_ID ) )
            // InternalTryGrammar.g:5640:4: (otherlv_1= RULE_ID )
            {
            // InternalTryGrammar.g:5640:4: (otherlv_1= RULE_ID )
            // InternalTryGrammar.g:5641:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNewExpressionRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getNewExpressionAccess().getContractContractOrLibraryCrossReference_1_0());
              				
            }

            }


            }

            // InternalTryGrammar.g:5652:3: ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            // InternalTryGrammar.g:5653:4: (lv_args_2_0= ruleFunctionCallListArguments )
            {
            // InternalTryGrammar.g:5653:4: (lv_args_2_0= ruleFunctionCallListArguments )
            // InternalTryGrammar.g:5654:5: lv_args_2_0= ruleFunctionCallListArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNewExpressionAccess().getArgsFunctionCallListArgumentsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_args_2_0=ruleFunctionCallListArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNewExpressionRule());
              					}
              					set(
              						current,
              						"args",
              						lv_args_2_0,
              						"org.unicam.tryGrammar.TryGrammar.FunctionCallListArguments");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewExpression"


    // $ANTLR start "entryRulePreExpression"
    // InternalTryGrammar.g:5675:1: entryRulePreExpression returns [EObject current=null] : iv_rulePreExpression= rulePreExpression EOF ;
    public final EObject entryRulePreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreExpression = null;


        try {
            // InternalTryGrammar.g:5675:54: (iv_rulePreExpression= rulePreExpression EOF )
            // InternalTryGrammar.g:5676:2: iv_rulePreExpression= rulePreExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePreExpression=rulePreExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreExpression"


    // $ANTLR start "rulePreExpression"
    // InternalTryGrammar.g:5682:1: rulePreExpression returns [EObject current=null] : (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) ;
    public final EObject rulePreExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_PostIncDecExpression_0 = null;

        EObject this_PostIncDecExpression_2 = null;

        EObject this_PostIncDecExpression_5 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5688:2: ( (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) )
            // InternalTryGrammar.g:5689:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            {
            // InternalTryGrammar.g:5689:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            int alt88=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 22:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
                {
                alt88=1;
                }
                break;
            case 62:
                {
                alt88=2;
                }
                break;
            case 63:
                {
                alt88=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalTryGrammar.g:5690:3: this_PostIncDecExpression_0= rulePostIncDecExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPreExpressionAccess().getPostIncDecExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PostIncDecExpression_0=rulePostIncDecExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PostIncDecExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:5699:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    {
                    // InternalTryGrammar.g:5699:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    // InternalTryGrammar.g:5700:4: otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression ()
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPreExpressionAccess().getPlusSignPlusSignKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPreExpressionAccess().getPostIncDecExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PostIncDecExpression_2=rulePostIncDecExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PostIncDecExpression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryGrammar.g:5712:4: ()
                    // InternalTryGrammar.g:5713:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getPreExpressionAccess().getPreIncExpressionExpressionAction_1_2(),
                      						current);
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:5721:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    {
                    // InternalTryGrammar.g:5721:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    // InternalTryGrammar.g:5722:4: otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression ()
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPreExpressionAccess().getHyphenMinusHyphenMinusKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPreExpressionAccess().getPostIncDecExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PostIncDecExpression_5=rulePostIncDecExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PostIncDecExpression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryGrammar.g:5734:4: ()
                    // InternalTryGrammar.g:5735:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getPreExpressionAccess().getPreDecExpressionExpressionAction_2_2(),
                      						current);
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreExpression"


    // $ANTLR start "entryRulePostIncDecExpression"
    // InternalTryGrammar.g:5746:1: entryRulePostIncDecExpression returns [EObject current=null] : iv_rulePostIncDecExpression= rulePostIncDecExpression EOF ;
    public final EObject entryRulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostIncDecExpression = null;


        try {
            // InternalTryGrammar.g:5746:61: (iv_rulePostIncDecExpression= rulePostIncDecExpression EOF )
            // InternalTryGrammar.g:5747:2: iv_rulePostIncDecExpression= rulePostIncDecExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostIncDecExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostIncDecExpression=rulePostIncDecExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostIncDecExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostIncDecExpression"


    // $ANTLR start "rulePostIncDecExpression"
    // InternalTryGrammar.g:5753:1: rulePostIncDecExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) ;
    public final EObject rulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_postOp_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5759:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) )
            // InternalTryGrammar.g:5760:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            {
            // InternalTryGrammar.g:5760:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            // InternalTryGrammar.g:5761:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPostIncDecExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_67);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:5769:3: ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=62 && LA89_0<=63)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalTryGrammar.g:5770:4: () ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    {
            	    // InternalTryGrammar.g:5770:4: ()
            	    // InternalTryGrammar.g:5771:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPostIncDecExpressionAccess().getPostIncDecExpressionExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryGrammar.g:5777:4: ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    // InternalTryGrammar.g:5778:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    {
            	    // InternalTryGrammar.g:5778:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    // InternalTryGrammar.g:5779:6: lv_postOp_2_0= ruleIncDecOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPostIncDecExpressionAccess().getPostOpIncDecOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_67);
            	    lv_postOp_2_0=ruleIncDecOpEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPostIncDecExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"postOp",
            	      							lv_postOp_2_0,
            	      							"org.unicam.tryGrammar.TryGrammar.IncDecOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostIncDecExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalTryGrammar.g:5801:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalTryGrammar.g:5801:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalTryGrammar.g:5802:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalTryGrammar.g:5808:1: rulePrimaryExpression returns [EObject current=null] : (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject this_SpecialExpression_0 = null;

        EObject this_QualifiedIdentifier_1 = null;

        EObject this_Literal_2 = null;

        EObject this_TypeCast_3 = null;

        EObject this_Expression_5 = null;

        EObject lv_members_7_0 = null;

        EObject lv_members_8_0 = null;

        EObject this_TupleSeparator_11 = null;

        EObject lv_members_13_0 = null;

        EObject lv_members_14_0 = null;

        EObject lv_members_15_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5814:2: ( (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) )
            // InternalTryGrammar.g:5815:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            {
            // InternalTryGrammar.g:5815:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            int alt96=7;
            switch ( input.LA(1) ) {
            case 213:
            case 214:
                {
                alt96=1;
                }
                break;
            case RULE_ID:
                {
                alt96=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 64:
            case 198:
            case 199:
            case 210:
            case 211:
            case 212:
                {
                alt96=3;
                }
                break;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
                {
                alt96=4;
                }
                break;
            case 22:
                {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt96=7;
                    }
                    break;
                case 17:
                    {
                    alt96=6;
                    }
                    break;
                case RULE_STRING:
                case RULE_ID:
                case RULE_INT:
                case 22:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 132:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                case 210:
                case 211:
                case 212:
                case 213:
                case 214:
                    {
                    alt96=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalTryGrammar.g:5816:3: this_SpecialExpression_0= ruleSpecialExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSpecialExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SpecialExpression_0=ruleSpecialExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SpecialExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:5825:3: this_QualifiedIdentifier_1= ruleQualifiedIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getQualifiedIdentifierParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_QualifiedIdentifier_1=ruleQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QualifiedIdentifier_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:5834:3: this_Literal_2= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_2=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:5843:3: this_TypeCast_3= ruleTypeCast
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeCastParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeCast_3=ruleTypeCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeCast_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTryGrammar.g:5852:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    {
                    // InternalTryGrammar.g:5852:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    // InternalTryGrammar.g:5853:4: otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_36);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryGrammar.g:5865:4: ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==17) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalTryGrammar.g:5866:5: () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            {
                            // InternalTryGrammar.g:5866:5: ()
                            // InternalTryGrammar.g:5867:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndAdd(
                              							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_4_2_0(),
                              							current);
                              					
                            }

                            }

                            // InternalTryGrammar.g:5873:5: ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            int cnt91=0;
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==17) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // InternalTryGrammar.g:5874:6: ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )?
                            	    {
                            	    // InternalTryGrammar.g:5874:6: ( (lv_members_7_0= ruleTupleSeparator ) )
                            	    // InternalTryGrammar.g:5875:7: (lv_members_7_0= ruleTupleSeparator )
                            	    {
                            	    // InternalTryGrammar.g:5875:7: (lv_members_7_0= ruleTupleSeparator )
                            	    // InternalTryGrammar.g:5876:8: lv_members_7_0= ruleTupleSeparator
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersTupleSeparatorParserRuleCall_4_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_36);
                            	    lv_members_7_0=ruleTupleSeparator();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"members",
                            	      									lv_members_7_0,
                            	      									"org.unicam.tryGrammar.TryGrammar.TupleSeparator");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    // InternalTryGrammar.g:5893:6: ( (lv_members_8_0= ruleExpression ) )?
                            	    int alt90=2;
                            	    int LA90_0 = input.LA(1);

                            	    if ( ((LA90_0>=RULE_STRING && LA90_0<=RULE_INT)||LA90_0==22||(LA90_0>=57 && LA90_0<=168)||(LA90_0>=198 && LA90_0<=199)||(LA90_0>=210 && LA90_0<=214)) ) {
                            	        alt90=1;
                            	    }
                            	    switch (alt90) {
                            	        case 1 :
                            	            // InternalTryGrammar.g:5894:7: (lv_members_8_0= ruleExpression )
                            	            {
                            	            // InternalTryGrammar.g:5894:7: (lv_members_8_0= ruleExpression )
                            	            // InternalTryGrammar.g:5895:8: lv_members_8_0= ruleExpression
                            	            {
                            	            if ( state.backtracking==0 ) {

                            	              								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_4_2_1_1_0());
                            	              							
                            	            }
                            	            pushFollow(FOLLOW_36);
                            	            lv_members_8_0=ruleExpression();

                            	            state._fsp--;
                            	            if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              								if (current==null) {
                            	              									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	              								}
                            	              								add(
                            	              									current,
                            	              									"members",
                            	              									lv_members_8_0,
                            	              									"org.unicam.tryGrammar.TryGrammar.Expression");
                            	              								afterParserOrEnumRuleCall();
                            	              							
                            	            }

                            	            }


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt91 >= 1 ) break loop91;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(91, input);
                                        throw eee;
                                }
                                cnt91++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryGrammar.g:5920:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    {
                    // InternalTryGrammar.g:5920:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    // InternalTryGrammar.g:5921:4: otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTupleSeparatorParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_36);
                    this_TupleSeparator_11=ruleTupleSeparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TupleSeparator_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryGrammar.g:5933:4: ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* )
                    // InternalTryGrammar.g:5934:5: () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    {
                    // InternalTryGrammar.g:5934:5: ()
                    // InternalTryGrammar.g:5935:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_5_2_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryGrammar.g:5941:5: ( (lv_members_13_0= ruleExpression ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( ((LA93_0>=RULE_STRING && LA93_0<=RULE_INT)||LA93_0==22||(LA93_0>=57 && LA93_0<=168)||(LA93_0>=198 && LA93_0<=199)||(LA93_0>=210 && LA93_0<=214)) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalTryGrammar.g:5942:6: (lv_members_13_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:5942:6: (lv_members_13_0= ruleExpression )
                            // InternalTryGrammar.g:5943:7: lv_members_13_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_5_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_36);
                            lv_members_13_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              							}
                              							add(
                              								current,
                              								"members",
                              								lv_members_13_0,
                              								"org.unicam.tryGrammar.TryGrammar.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalTryGrammar.g:5960:5: ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==17) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalTryGrammar.g:5961:6: ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )?
                    	    {
                    	    // InternalTryGrammar.g:5961:6: ( (lv_members_14_0= ruleTupleSeparator ) )
                    	    // InternalTryGrammar.g:5962:7: (lv_members_14_0= ruleTupleSeparator )
                    	    {
                    	    // InternalTryGrammar.g:5962:7: (lv_members_14_0= ruleTupleSeparator )
                    	    // InternalTryGrammar.g:5963:8: lv_members_14_0= ruleTupleSeparator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersTupleSeparatorParserRuleCall_5_2_2_0_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_members_14_0=ruleTupleSeparator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"members",
                    	      									lv_members_14_0,
                    	      									"org.unicam.tryGrammar.TryGrammar.TupleSeparator");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }

                    	    // InternalTryGrammar.g:5980:6: ( (lv_members_15_0= ruleExpression ) )?
                    	    int alt94=2;
                    	    int LA94_0 = input.LA(1);

                    	    if ( ((LA94_0>=RULE_STRING && LA94_0<=RULE_INT)||LA94_0==22||(LA94_0>=57 && LA94_0<=168)||(LA94_0>=198 && LA94_0<=199)||(LA94_0>=210 && LA94_0<=214)) ) {
                    	        alt94=1;
                    	    }
                    	    switch (alt94) {
                    	        case 1 :
                    	            // InternalTryGrammar.g:5981:7: (lv_members_15_0= ruleExpression )
                    	            {
                    	            // InternalTryGrammar.g:5981:7: (lv_members_15_0= ruleExpression )
                    	            // InternalTryGrammar.g:5982:8: lv_members_15_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_5_2_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_36);
                    	            lv_members_15_0=ruleExpression();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"members",
                    	              									lv_members_15_0,
                    	              									"org.unicam.tryGrammar.TryGrammar.Expression");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    }

                    otherlv_16=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTryGrammar.g:6007:3: (otherlv_17= '(' otherlv_18= ')' () )
                    {
                    // InternalTryGrammar.g:6007:3: (otherlv_17= '(' otherlv_18= ')' () )
                    // InternalTryGrammar.g:6008:4: otherlv_17= '(' otherlv_18= ')' ()
                    {
                    otherlv_17=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    otherlv_18=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_6_1());
                      			
                    }
                    // InternalTryGrammar.g:6016:4: ()
                    // InternalTryGrammar.g:6017:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getTupleAction_6_2(),
                      						current);
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalTryGrammar.g:6028:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalTryGrammar.g:6028:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalTryGrammar.g:6029:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalTryGrammar.g:6035:1: ruleLiteral returns [EObject current=null] : (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialVariables_0 = null;

        EObject this_BooleanConst_1 = null;

        EObject this_Number_2 = null;

        EObject this_StringLiteral_3 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:6041:2: ( (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral ) )
            // InternalTryGrammar.g:6042:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral )
            {
            // InternalTryGrammar.g:6042:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral )
            int alt97=4;
            switch ( input.LA(1) ) {
            case 210:
            case 211:
            case 212:
                {
                alt97=1;
                }
                break;
            case 198:
            case 199:
                {
                alt97=2;
                }
                break;
            case RULE_INT:
            case 64:
                {
                alt97=3;
                }
                break;
            case RULE_STRING:
                {
                alt97=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalTryGrammar.g:6043:3: this_SpecialVariables_0= ruleSpecialVariables
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getSpecialVariablesParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SpecialVariables_0=ruleSpecialVariables();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SpecialVariables_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:6052:3: this_BooleanConst_1= ruleBooleanConst
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanConstParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanConst_1=ruleBooleanConst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanConst_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:6061:3: this_Number_2= ruleNumber
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNumberParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Number_2=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Number_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:6070:3: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_3=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanConst"
    // InternalTryGrammar.g:6082:1: entryRuleBooleanConst returns [EObject current=null] : iv_ruleBooleanConst= ruleBooleanConst EOF ;
    public final EObject entryRuleBooleanConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConst = null;


        try {
            // InternalTryGrammar.g:6082:53: (iv_ruleBooleanConst= ruleBooleanConst EOF )
            // InternalTryGrammar.g:6083:2: iv_ruleBooleanConst= ruleBooleanConst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanConstRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanConst=ruleBooleanConst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanConst; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanConst"


    // $ANTLR start "ruleBooleanConst"
    // InternalTryGrammar.g:6089:1: ruleBooleanConst returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) ;
    public final EObject ruleBooleanConst() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:6095:2: ( ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) )
            // InternalTryGrammar.g:6096:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            {
            // InternalTryGrammar.g:6096:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            // InternalTryGrammar.g:6097:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            {
            // InternalTryGrammar.g:6097:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            // InternalTryGrammar.g:6098:4: lv_value_0_0= ruleBooleanLiteralEnum
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getBooleanConstAccess().getValueBooleanLiteralEnumEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBooleanLiteralEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getBooleanConstRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.unicam.tryGrammar.TryGrammar.BooleanLiteralEnum");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanConst"


    // $ANTLR start "entryRuleNumber"
    // InternalTryGrammar.g:6118:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalTryGrammar.g:6118:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalTryGrammar.g:6119:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalTryGrammar.g:6125:1: ruleNumber returns [EObject current=null] : (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Now_2= ruleNow | this_Time_3= ruleTime ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        EObject this_NumberDimensionless_0 = null;

        EObject this_Ether_1 = null;

        EObject this_Now_2 = null;

        EObject this_Time_3 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:6131:2: ( (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Now_2= ruleNow | this_Time_3= ruleTime ) )
            // InternalTryGrammar.g:6132:2: (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Now_2= ruleNow | this_Time_3= ruleTime )
            {
            // InternalTryGrammar.g:6132:2: (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Now_2= ruleNow | this_Time_3= ruleTime )
            int alt98=4;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 12:
                case 13:
                case 17:
                case 18:
                case 23:
                case 30:
                case 35:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 59:
                case 60:
                case 62:
                case 63:
                case 175:
                case 176:
                case 177:
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 185:
                case 186:
                case 187:
                case 188:
                case 189:
                case 190:
                case 191:
                case 192:
                case 193:
                case 194:
                case 195:
                case 196:
                case 197:
                    {
                    alt98=1;
                    }
                    break;
                case 204:
                case 205:
                case 206:
                case 207:
                case 208:
                case 209:
                    {
                    alt98=4;
                    }
                    break;
                case 200:
                case 201:
                case 202:
                case 203:
                    {
                    alt98=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA98_0==64) ) {
                alt98=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalTryGrammar.g:6133:3: this_NumberDimensionless_0= ruleNumberDimensionless
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getNumberDimensionlessParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberDimensionless_0=ruleNumberDimensionless();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberDimensionless_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:6142:3: this_Ether_1= ruleEther
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getEtherParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Ether_1=ruleEther();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Ether_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:6151:3: this_Now_2= ruleNow
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getNowParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Now_2=ruleNow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Now_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:6160:3: this_Time_3= ruleTime
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getTimeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Time_3=ruleTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Time_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleNumberDimensionless"
    // InternalTryGrammar.g:6172:1: entryRuleNumberDimensionless returns [EObject current=null] : iv_ruleNumberDimensionless= ruleNumberDimensionless EOF ;
    public final EObject entryRuleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberDimensionless = null;


        try {
            // InternalTryGrammar.g:6172:60: (iv_ruleNumberDimensionless= ruleNumberDimensionless EOF )
            // InternalTryGrammar.g:6173:2: iv_ruleNumberDimensionless= ruleNumberDimensionless EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberDimensionlessRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberDimensionless=ruleNumberDimensionless();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberDimensionless; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberDimensionless"


    // $ANTLR start "ruleNumberDimensionless"
    // InternalTryGrammar.g:6179:1: ruleNumberDimensionless returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:6185:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTryGrammar.g:6186:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTryGrammar.g:6186:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTryGrammar.g:6187:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTryGrammar.g:6187:3: (lv_value_0_0= RULE_INT )
            // InternalTryGrammar.g:6188:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getNumberDimensionlessAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNumberDimensionlessRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.unicam.tryGrammar.TryGrammar.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberDimensionless"


    // $ANTLR start "entryRuleEther"
    // InternalTryGrammar.g:6207:1: entryRuleEther returns [EObject current=null] : iv_ruleEther= ruleEther EOF ;
    public final EObject entryRuleEther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEther = null;


        try {
            // InternalTryGrammar.g:6207:46: (iv_ruleEther= ruleEther EOF )
            // InternalTryGrammar.g:6208:2: iv_ruleEther= ruleEther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEtherRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEther=ruleEther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEther; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEther"


    // $ANTLR start "ruleEther"
    // InternalTryGrammar.g:6214:1: ruleEther returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) ;
    public final EObject ruleEther() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_ether_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:6220:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) )
            // InternalTryGrammar.g:6221:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            {
            // InternalTryGrammar.g:6221:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            // InternalTryGrammar.g:6222:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            {
            // InternalTryGrammar.g:6222:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalTryGrammar.g:6223:4: (lv_value_0_0= RULE_INT )
            {
            // InternalTryGrammar.g:6223:4: (lv_value_0_0= RULE_INT )
            // InternalTryGrammar.g:6224:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getEtherAccess().getValueINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEtherRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.unicam.tryGrammar.TryGrammar.INT");
              				
            }

            }


            }

            // InternalTryGrammar.g:6240:3: ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            // InternalTryGrammar.g:6241:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            {
            // InternalTryGrammar.g:6241:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            // InternalTryGrammar.g:6242:5: lv_ether_1_0= ruleEtherSubDenominationEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEtherAccess().getEtherEtherSubDenominationEnumEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ether_1_0=ruleEtherSubDenominationEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEtherRule());
              					}
              					set(
              						current,
              						"ether",
              						lv_ether_1_0,
              						"org.unicam.tryGrammar.TryGrammar.EtherSubDenominationEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEther"


    // $ANTLR start "entryRuleTime"
    // InternalTryGrammar.g:6263:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalTryGrammar.g:6263:45: (iv_ruleTime= ruleTime EOF )
            // InternalTryGrammar.g:6264:2: iv_ruleTime= ruleTime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTime; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalTryGrammar.g:6270:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_time_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:6276:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) )
            // InternalTryGrammar.g:6277:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            {
            // InternalTryGrammar.g:6277:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            // InternalTryGrammar.g:6278:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            {
            // InternalTryGrammar.g:6278:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalTryGrammar.g:6279:4: (lv_value_0_0= RULE_INT )
            {
            // InternalTryGrammar.g:6279:4: (lv_value_0_0= RULE_INT )
            // InternalTryGrammar.g:6280:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getTimeAccess().getValueINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTimeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.unicam.tryGrammar.TryGrammar.INT");
              				
            }

            }


            }

            // InternalTryGrammar.g:6296:3: ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            // InternalTryGrammar.g:6297:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            {
            // InternalTryGrammar.g:6297:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            // InternalTryGrammar.g:6298:5: lv_time_1_0= ruleTimeSubdenominationEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTimeAccess().getTimeTimeSubdenominationEnumEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_time_1_0=ruleTimeSubdenominationEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTimeRule());
              					}
              					set(
              						current,
              						"time",
              						lv_time_1_0,
              						"org.unicam.tryGrammar.TryGrammar.TimeSubdenominationEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalTryGrammar.g:6319:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalTryGrammar.g:6319:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalTryGrammar.g:6320:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalTryGrammar.g:6326:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:6332:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTryGrammar.g:6333:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTryGrammar.g:6333:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTryGrammar.g:6334:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTryGrammar.g:6334:3: (lv_value_0_0= RULE_STRING )
            // InternalTryGrammar.g:6335:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.unicam.tryGrammar.TryGrammar.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleTypeCast"
    // InternalTryGrammar.g:6354:1: entryRuleTypeCast returns [EObject current=null] : iv_ruleTypeCast= ruleTypeCast EOF ;
    public final EObject entryRuleTypeCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCast = null;


        try {
            // InternalTryGrammar.g:6354:49: (iv_ruleTypeCast= ruleTypeCast EOF )
            // InternalTryGrammar.g:6355:2: iv_ruleTypeCast= ruleTypeCast EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCastRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeCast=ruleTypeCast();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeCast; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeCast"


    // $ANTLR start "ruleTypeCast"
    // InternalTryGrammar.g:6361:1: ruleTypeCast returns [EObject current=null] : ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypeCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:6367:2: ( ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalTryGrammar.g:6368:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalTryGrammar.g:6368:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalTryGrammar.g:6369:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalTryGrammar.g:6369:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) )
            // InternalTryGrammar.g:6370:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalTryGrammar.g:6370:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            // InternalTryGrammar.g:6371:5: lv_value_0_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeCastAccess().getValueElementaryTypeNameEnumEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_value_0_0=ruleElementaryTypeNameEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeCastRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.unicam.tryGrammar.TryGrammar.ElementaryTypeNameEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTypeCastAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryGrammar.g:6392:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalTryGrammar.g:6393:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalTryGrammar.g:6393:4: (lv_expression_2_0= ruleExpression )
            // InternalTryGrammar.g:6394:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeCastAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeCastRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.unicam.tryGrammar.TryGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTypeCastAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeCast"


    // $ANTLR start "entryRuleNow"
    // InternalTryGrammar.g:6419:1: entryRuleNow returns [EObject current=null] : iv_ruleNow= ruleNow EOF ;
    public final EObject entryRuleNow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNow = null;


        try {
            // InternalTryGrammar.g:6419:44: (iv_ruleNow= ruleNow EOF )
            // InternalTryGrammar.g:6420:2: iv_ruleNow= ruleNow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNow=ruleNow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNow; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNow"


    // $ANTLR start "ruleNow"
    // InternalTryGrammar.g:6426:1: ruleNow returns [EObject current=null] : ( () otherlv_1= 'now' ) ;
    public final EObject ruleNow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:6432:2: ( ( () otherlv_1= 'now' ) )
            // InternalTryGrammar.g:6433:2: ( () otherlv_1= 'now' )
            {
            // InternalTryGrammar.g:6433:2: ( () otherlv_1= 'now' )
            // InternalTryGrammar.g:6434:3: () otherlv_1= 'now'
            {
            // InternalTryGrammar.g:6434:3: ()
            // InternalTryGrammar.g:6435:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNowAccess().getNowAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNowAccess().getNowKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNow"


    // $ANTLR start "entryRuleSpecialVariables"
    // InternalTryGrammar.g:6449:1: entryRuleSpecialVariables returns [EObject current=null] : iv_ruleSpecialVariables= ruleSpecialVariables EOF ;
    public final EObject entryRuleSpecialVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariables = null;


        try {
            // InternalTryGrammar.g:6449:57: (iv_ruleSpecialVariables= ruleSpecialVariables EOF )
            // InternalTryGrammar.g:6450:2: iv_ruleSpecialVariables= ruleSpecialVariables EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialVariablesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecialVariables=ruleSpecialVariables();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialVariables; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecialVariables"


    // $ANTLR start "ruleSpecialVariables"
    // InternalTryGrammar.g:6456:1: ruleSpecialVariables returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) ;
    public final EObject ruleSpecialVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_field_2_0=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_qualifiers_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:6462:2: ( ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) )
            // InternalTryGrammar.g:6463:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            {
            // InternalTryGrammar.g:6463:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            // InternalTryGrammar.g:6464:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )*
            {
            // InternalTryGrammar.g:6464:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) )
            // InternalTryGrammar.g:6465:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            {
            // InternalTryGrammar.g:6465:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            // InternalTryGrammar.g:6466:5: lv_type_0_0= ruleSpecialVariablesTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getTypeSpecialVariablesTypeEnumEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_type_0_0=ruleSpecialVariablesTypeEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSpecialVariablesRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.unicam.tryGrammar.TryGrammar.SpecialVariablesTypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpecialVariablesAccess().getFullStopKeyword_1());
              		
            }
            // InternalTryGrammar.g:6487:3: ( (lv_field_2_0= RULE_ID ) )
            // InternalTryGrammar.g:6488:4: (lv_field_2_0= RULE_ID )
            {
            // InternalTryGrammar.g:6488:4: (lv_field_2_0= RULE_ID )
            // InternalTryGrammar.g:6489:5: lv_field_2_0= RULE_ID
            {
            lv_field_2_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_field_2_0, grammarAccess.getSpecialVariablesAccess().getFieldIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSpecialVariablesRule());
              					}
              					setWithLastConsumed(
              						current,
              						"field",
              						lv_field_2_0,
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            // InternalTryGrammar.g:6505:3: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==22||LA99_0==34||LA99_0==37) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalTryGrammar.g:6506:4: (lv_qualifiers_3_0= ruleQualifier )
            	    {
            	    // InternalTryGrammar.g:6506:4: (lv_qualifiers_3_0= ruleQualifier )
            	    // InternalTryGrammar.g:6507:5: lv_qualifiers_3_0= ruleQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getQualifiersQualifierParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_qualifiers_3_0=ruleQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSpecialVariablesRule());
            	      					}
            	      					add(
            	      						current,
            	      						"qualifiers",
            	      						lv_qualifiers_3_0,
            	      						"org.unicam.tryGrammar.TryGrammar.Qualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialVariables"


    // $ANTLR start "ruleElementaryTypeNameEnum"
    // InternalTryGrammar.g:6528:1: ruleElementaryTypeNameEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) ) ;
    public final Enumerator ruleElementaryTypeNameEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;
        Token enumLiteral_31=null;
        Token enumLiteral_32=null;
        Token enumLiteral_33=null;
        Token enumLiteral_34=null;
        Token enumLiteral_35=null;
        Token enumLiteral_36=null;
        Token enumLiteral_37=null;
        Token enumLiteral_38=null;
        Token enumLiteral_39=null;
        Token enumLiteral_40=null;
        Token enumLiteral_41=null;
        Token enumLiteral_42=null;
        Token enumLiteral_43=null;
        Token enumLiteral_44=null;
        Token enumLiteral_45=null;
        Token enumLiteral_46=null;
        Token enumLiteral_47=null;
        Token enumLiteral_48=null;
        Token enumLiteral_49=null;
        Token enumLiteral_50=null;
        Token enumLiteral_51=null;
        Token enumLiteral_52=null;
        Token enumLiteral_53=null;
        Token enumLiteral_54=null;
        Token enumLiteral_55=null;
        Token enumLiteral_56=null;
        Token enumLiteral_57=null;
        Token enumLiteral_58=null;
        Token enumLiteral_59=null;
        Token enumLiteral_60=null;
        Token enumLiteral_61=null;
        Token enumLiteral_62=null;
        Token enumLiteral_63=null;
        Token enumLiteral_64=null;
        Token enumLiteral_65=null;
        Token enumLiteral_66=null;
        Token enumLiteral_67=null;
        Token enumLiteral_68=null;
        Token enumLiteral_69=null;
        Token enumLiteral_70=null;
        Token enumLiteral_71=null;
        Token enumLiteral_72=null;
        Token enumLiteral_73=null;
        Token enumLiteral_74=null;
        Token enumLiteral_75=null;
        Token enumLiteral_76=null;
        Token enumLiteral_77=null;
        Token enumLiteral_78=null;
        Token enumLiteral_79=null;
        Token enumLiteral_80=null;
        Token enumLiteral_81=null;
        Token enumLiteral_82=null;
        Token enumLiteral_83=null;
        Token enumLiteral_84=null;
        Token enumLiteral_85=null;
        Token enumLiteral_86=null;
        Token enumLiteral_87=null;
        Token enumLiteral_88=null;
        Token enumLiteral_89=null;
        Token enumLiteral_90=null;
        Token enumLiteral_91=null;
        Token enumLiteral_92=null;
        Token enumLiteral_93=null;
        Token enumLiteral_94=null;
        Token enumLiteral_95=null;
        Token enumLiteral_96=null;
        Token enumLiteral_97=null;
        Token enumLiteral_98=null;
        Token enumLiteral_99=null;
        Token enumLiteral_100=null;
        Token enumLiteral_101=null;
        Token enumLiteral_102=null;
        Token enumLiteral_103=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:6534:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) ) )
            // InternalTryGrammar.g:6535:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) )
            {
            // InternalTryGrammar.g:6535:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) )
            int alt100=104;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt100=1;
                }
                break;
            case 66:
                {
                alt100=2;
                }
                break;
            case 67:
                {
                alt100=3;
                }
                break;
            case 68:
                {
                alt100=4;
                }
                break;
            case 69:
                {
                alt100=5;
                }
                break;
            case 70:
                {
                alt100=6;
                }
                break;
            case 71:
                {
                alt100=7;
                }
                break;
            case 72:
                {
                alt100=8;
                }
                break;
            case 73:
                {
                alt100=9;
                }
                break;
            case 74:
                {
                alt100=10;
                }
                break;
            case 75:
                {
                alt100=11;
                }
                break;
            case 76:
                {
                alt100=12;
                }
                break;
            case 77:
                {
                alt100=13;
                }
                break;
            case 78:
                {
                alt100=14;
                }
                break;
            case 79:
                {
                alt100=15;
                }
                break;
            case 80:
                {
                alt100=16;
                }
                break;
            case 81:
                {
                alt100=17;
                }
                break;
            case 82:
                {
                alt100=18;
                }
                break;
            case 83:
                {
                alt100=19;
                }
                break;
            case 84:
                {
                alt100=20;
                }
                break;
            case 85:
                {
                alt100=21;
                }
                break;
            case 86:
                {
                alt100=22;
                }
                break;
            case 87:
                {
                alt100=23;
                }
                break;
            case 88:
                {
                alt100=24;
                }
                break;
            case 89:
                {
                alt100=25;
                }
                break;
            case 90:
                {
                alt100=26;
                }
                break;
            case 91:
                {
                alt100=27;
                }
                break;
            case 92:
                {
                alt100=28;
                }
                break;
            case 93:
                {
                alt100=29;
                }
                break;
            case 94:
                {
                alt100=30;
                }
                break;
            case 95:
                {
                alt100=31;
                }
                break;
            case 96:
                {
                alt100=32;
                }
                break;
            case 97:
                {
                alt100=33;
                }
                break;
            case 98:
                {
                alt100=34;
                }
                break;
            case 99:
                {
                alt100=35;
                }
                break;
            case 100:
                {
                alt100=36;
                }
                break;
            case 101:
                {
                alt100=37;
                }
                break;
            case 102:
                {
                alt100=38;
                }
                break;
            case 103:
                {
                alt100=39;
                }
                break;
            case 104:
                {
                alt100=40;
                }
                break;
            case 105:
                {
                alt100=41;
                }
                break;
            case 106:
                {
                alt100=42;
                }
                break;
            case 107:
                {
                alt100=43;
                }
                break;
            case 108:
                {
                alt100=44;
                }
                break;
            case 109:
                {
                alt100=45;
                }
                break;
            case 110:
                {
                alt100=46;
                }
                break;
            case 111:
                {
                alt100=47;
                }
                break;
            case 112:
                {
                alt100=48;
                }
                break;
            case 113:
                {
                alt100=49;
                }
                break;
            case 114:
                {
                alt100=50;
                }
                break;
            case 115:
                {
                alt100=51;
                }
                break;
            case 116:
                {
                alt100=52;
                }
                break;
            case 117:
                {
                alt100=53;
                }
                break;
            case 118:
                {
                alt100=54;
                }
                break;
            case 119:
                {
                alt100=55;
                }
                break;
            case 120:
                {
                alt100=56;
                }
                break;
            case 121:
                {
                alt100=57;
                }
                break;
            case 122:
                {
                alt100=58;
                }
                break;
            case 123:
                {
                alt100=59;
                }
                break;
            case 124:
                {
                alt100=60;
                }
                break;
            case 125:
                {
                alt100=61;
                }
                break;
            case 126:
                {
                alt100=62;
                }
                break;
            case 127:
                {
                alt100=63;
                }
                break;
            case 128:
                {
                alt100=64;
                }
                break;
            case 129:
                {
                alt100=65;
                }
                break;
            case 130:
                {
                alt100=66;
                }
                break;
            case 131:
                {
                alt100=67;
                }
                break;
            case 132:
                {
                alt100=68;
                }
                break;
            case 133:
                {
                alt100=69;
                }
                break;
            case 134:
                {
                alt100=70;
                }
                break;
            case 135:
                {
                alt100=71;
                }
                break;
            case 136:
                {
                alt100=72;
                }
                break;
            case 137:
                {
                alt100=73;
                }
                break;
            case 138:
                {
                alt100=74;
                }
                break;
            case 139:
                {
                alt100=75;
                }
                break;
            case 140:
                {
                alt100=76;
                }
                break;
            case 141:
                {
                alt100=77;
                }
                break;
            case 142:
                {
                alt100=78;
                }
                break;
            case 143:
                {
                alt100=79;
                }
                break;
            case 144:
                {
                alt100=80;
                }
                break;
            case 145:
                {
                alt100=81;
                }
                break;
            case 146:
                {
                alt100=82;
                }
                break;
            case 147:
                {
                alt100=83;
                }
                break;
            case 148:
                {
                alt100=84;
                }
                break;
            case 149:
                {
                alt100=85;
                }
                break;
            case 150:
                {
                alt100=86;
                }
                break;
            case 151:
                {
                alt100=87;
                }
                break;
            case 152:
                {
                alt100=88;
                }
                break;
            case 153:
                {
                alt100=89;
                }
                break;
            case 154:
                {
                alt100=90;
                }
                break;
            case 155:
                {
                alt100=91;
                }
                break;
            case 156:
                {
                alt100=92;
                }
                break;
            case 157:
                {
                alt100=93;
                }
                break;
            case 158:
                {
                alt100=94;
                }
                break;
            case 159:
                {
                alt100=95;
                }
                break;
            case 160:
                {
                alt100=96;
                }
                break;
            case 161:
                {
                alt100=97;
                }
                break;
            case 162:
                {
                alt100=98;
                }
                break;
            case 163:
                {
                alt100=99;
                }
                break;
            case 164:
                {
                alt100=100;
                }
                break;
            case 165:
                {
                alt100=101;
                }
                break;
            case 166:
                {
                alt100=102;
                }
                break;
            case 167:
                {
                alt100=103;
                }
                break;
            case 168:
                {
                alt100=104;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalTryGrammar.g:6536:3: (enumLiteral_0= 'int' )
                    {
                    // InternalTryGrammar.g:6536:3: (enumLiteral_0= 'int' )
                    // InternalTryGrammar.g:6537:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getElementaryTypeNameEnumAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:6544:3: (enumLiteral_1= 'int16' )
                    {
                    // InternalTryGrammar.g:6544:3: (enumLiteral_1= 'int16' )
                    // InternalTryGrammar.g:6545:4: enumLiteral_1= 'int16'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getElementaryTypeNameEnumAccess().getINT16EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:6552:3: (enumLiteral_2= 'int24' )
                    {
                    // InternalTryGrammar.g:6552:3: (enumLiteral_2= 'int24' )
                    // InternalTryGrammar.g:6553:4: enumLiteral_2= 'int24'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT24EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getElementaryTypeNameEnumAccess().getINT24EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:6560:3: (enumLiteral_3= 'int32' )
                    {
                    // InternalTryGrammar.g:6560:3: (enumLiteral_3= 'int32' )
                    // InternalTryGrammar.g:6561:4: enumLiteral_3= 'int32'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT32EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getElementaryTypeNameEnumAccess().getINT32EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryGrammar.g:6568:3: (enumLiteral_4= 'int40' )
                    {
                    // InternalTryGrammar.g:6568:3: (enumLiteral_4= 'int40' )
                    // InternalTryGrammar.g:6569:4: enumLiteral_4= 'int40'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT40EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getElementaryTypeNameEnumAccess().getINT40EnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryGrammar.g:6576:3: (enumLiteral_5= 'int48' )
                    {
                    // InternalTryGrammar.g:6576:3: (enumLiteral_5= 'int48' )
                    // InternalTryGrammar.g:6577:4: enumLiteral_5= 'int48'
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT48EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getElementaryTypeNameEnumAccess().getINT48EnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTryGrammar.g:6584:3: (enumLiteral_6= 'int56' )
                    {
                    // InternalTryGrammar.g:6584:3: (enumLiteral_6= 'int56' )
                    // InternalTryGrammar.g:6585:4: enumLiteral_6= 'int56'
                    {
                    enumLiteral_6=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT56EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getElementaryTypeNameEnumAccess().getINT56EnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalTryGrammar.g:6592:3: (enumLiteral_7= 'int64' )
                    {
                    // InternalTryGrammar.g:6592:3: (enumLiteral_7= 'int64' )
                    // InternalTryGrammar.g:6593:4: enumLiteral_7= 'int64'
                    {
                    enumLiteral_7=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getElementaryTypeNameEnumAccess().getINT64EnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalTryGrammar.g:6600:3: (enumLiteral_8= 'int72' )
                    {
                    // InternalTryGrammar.g:6600:3: (enumLiteral_8= 'int72' )
                    // InternalTryGrammar.g:6601:4: enumLiteral_8= 'int72'
                    {
                    enumLiteral_8=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT72EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getElementaryTypeNameEnumAccess().getINT72EnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalTryGrammar.g:6608:3: (enumLiteral_9= 'int80' )
                    {
                    // InternalTryGrammar.g:6608:3: (enumLiteral_9= 'int80' )
                    // InternalTryGrammar.g:6609:4: enumLiteral_9= 'int80'
                    {
                    enumLiteral_9=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT80EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getElementaryTypeNameEnumAccess().getINT80EnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalTryGrammar.g:6616:3: (enumLiteral_10= 'int88' )
                    {
                    // InternalTryGrammar.g:6616:3: (enumLiteral_10= 'int88' )
                    // InternalTryGrammar.g:6617:4: enumLiteral_10= 'int88'
                    {
                    enumLiteral_10=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT88EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getElementaryTypeNameEnumAccess().getINT88EnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalTryGrammar.g:6624:3: (enumLiteral_11= 'int96' )
                    {
                    // InternalTryGrammar.g:6624:3: (enumLiteral_11= 'int96' )
                    // InternalTryGrammar.g:6625:4: enumLiteral_11= 'int96'
                    {
                    enumLiteral_11=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT96EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getElementaryTypeNameEnumAccess().getINT96EnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalTryGrammar.g:6632:3: (enumLiteral_12= 'int104' )
                    {
                    // InternalTryGrammar.g:6632:3: (enumLiteral_12= 'int104' )
                    // InternalTryGrammar.g:6633:4: enumLiteral_12= 'int104'
                    {
                    enumLiteral_12=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT104EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getElementaryTypeNameEnumAccess().getINT104EnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalTryGrammar.g:6640:3: (enumLiteral_13= 'int112' )
                    {
                    // InternalTryGrammar.g:6640:3: (enumLiteral_13= 'int112' )
                    // InternalTryGrammar.g:6641:4: enumLiteral_13= 'int112'
                    {
                    enumLiteral_13=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT112EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getElementaryTypeNameEnumAccess().getINT112EnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalTryGrammar.g:6648:3: (enumLiteral_14= 'int120' )
                    {
                    // InternalTryGrammar.g:6648:3: (enumLiteral_14= 'int120' )
                    // InternalTryGrammar.g:6649:4: enumLiteral_14= 'int120'
                    {
                    enumLiteral_14=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT120EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getElementaryTypeNameEnumAccess().getINT120EnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalTryGrammar.g:6656:3: (enumLiteral_15= 'int128' )
                    {
                    // InternalTryGrammar.g:6656:3: (enumLiteral_15= 'int128' )
                    // InternalTryGrammar.g:6657:4: enumLiteral_15= 'int128'
                    {
                    enumLiteral_15=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT128EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_15, grammarAccess.getElementaryTypeNameEnumAccess().getINT128EnumLiteralDeclaration_15());
                      			
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalTryGrammar.g:6664:3: (enumLiteral_16= 'int136' )
                    {
                    // InternalTryGrammar.g:6664:3: (enumLiteral_16= 'int136' )
                    // InternalTryGrammar.g:6665:4: enumLiteral_16= 'int136'
                    {
                    enumLiteral_16=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT136EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_16, grammarAccess.getElementaryTypeNameEnumAccess().getINT136EnumLiteralDeclaration_16());
                      			
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalTryGrammar.g:6672:3: (enumLiteral_17= 'int144' )
                    {
                    // InternalTryGrammar.g:6672:3: (enumLiteral_17= 'int144' )
                    // InternalTryGrammar.g:6673:4: enumLiteral_17= 'int144'
                    {
                    enumLiteral_17=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT144EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_17, grammarAccess.getElementaryTypeNameEnumAccess().getINT144EnumLiteralDeclaration_17());
                      			
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalTryGrammar.g:6680:3: (enumLiteral_18= 'int152' )
                    {
                    // InternalTryGrammar.g:6680:3: (enumLiteral_18= 'int152' )
                    // InternalTryGrammar.g:6681:4: enumLiteral_18= 'int152'
                    {
                    enumLiteral_18=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT152EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_18, grammarAccess.getElementaryTypeNameEnumAccess().getINT152EnumLiteralDeclaration_18());
                      			
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalTryGrammar.g:6688:3: (enumLiteral_19= 'int160' )
                    {
                    // InternalTryGrammar.g:6688:3: (enumLiteral_19= 'int160' )
                    // InternalTryGrammar.g:6689:4: enumLiteral_19= 'int160'
                    {
                    enumLiteral_19=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT160EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_19, grammarAccess.getElementaryTypeNameEnumAccess().getINT160EnumLiteralDeclaration_19());
                      			
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalTryGrammar.g:6696:3: (enumLiteral_20= 'int168' )
                    {
                    // InternalTryGrammar.g:6696:3: (enumLiteral_20= 'int168' )
                    // InternalTryGrammar.g:6697:4: enumLiteral_20= 'int168'
                    {
                    enumLiteral_20=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT168EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_20, grammarAccess.getElementaryTypeNameEnumAccess().getINT168EnumLiteralDeclaration_20());
                      			
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalTryGrammar.g:6704:3: (enumLiteral_21= 'int178' )
                    {
                    // InternalTryGrammar.g:6704:3: (enumLiteral_21= 'int178' )
                    // InternalTryGrammar.g:6705:4: enumLiteral_21= 'int178'
                    {
                    enumLiteral_21=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT178EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_21, grammarAccess.getElementaryTypeNameEnumAccess().getINT178EnumLiteralDeclaration_21());
                      			
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalTryGrammar.g:6712:3: (enumLiteral_22= 'int184' )
                    {
                    // InternalTryGrammar.g:6712:3: (enumLiteral_22= 'int184' )
                    // InternalTryGrammar.g:6713:4: enumLiteral_22= 'int184'
                    {
                    enumLiteral_22=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT184EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_22, grammarAccess.getElementaryTypeNameEnumAccess().getINT184EnumLiteralDeclaration_22());
                      			
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalTryGrammar.g:6720:3: (enumLiteral_23= 'int192' )
                    {
                    // InternalTryGrammar.g:6720:3: (enumLiteral_23= 'int192' )
                    // InternalTryGrammar.g:6721:4: enumLiteral_23= 'int192'
                    {
                    enumLiteral_23=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT192EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_23, grammarAccess.getElementaryTypeNameEnumAccess().getINT192EnumLiteralDeclaration_23());
                      			
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalTryGrammar.g:6728:3: (enumLiteral_24= 'int200' )
                    {
                    // InternalTryGrammar.g:6728:3: (enumLiteral_24= 'int200' )
                    // InternalTryGrammar.g:6729:4: enumLiteral_24= 'int200'
                    {
                    enumLiteral_24=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT200EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_24, grammarAccess.getElementaryTypeNameEnumAccess().getINT200EnumLiteralDeclaration_24());
                      			
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalTryGrammar.g:6736:3: (enumLiteral_25= 'int208' )
                    {
                    // InternalTryGrammar.g:6736:3: (enumLiteral_25= 'int208' )
                    // InternalTryGrammar.g:6737:4: enumLiteral_25= 'int208'
                    {
                    enumLiteral_25=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT208EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_25, grammarAccess.getElementaryTypeNameEnumAccess().getINT208EnumLiteralDeclaration_25());
                      			
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalTryGrammar.g:6744:3: (enumLiteral_26= 'int216' )
                    {
                    // InternalTryGrammar.g:6744:3: (enumLiteral_26= 'int216' )
                    // InternalTryGrammar.g:6745:4: enumLiteral_26= 'int216'
                    {
                    enumLiteral_26=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT216EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_26, grammarAccess.getElementaryTypeNameEnumAccess().getINT216EnumLiteralDeclaration_26());
                      			
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalTryGrammar.g:6752:3: (enumLiteral_27= 'int224' )
                    {
                    // InternalTryGrammar.g:6752:3: (enumLiteral_27= 'int224' )
                    // InternalTryGrammar.g:6753:4: enumLiteral_27= 'int224'
                    {
                    enumLiteral_27=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT224EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_27, grammarAccess.getElementaryTypeNameEnumAccess().getINT224EnumLiteralDeclaration_27());
                      			
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalTryGrammar.g:6760:3: (enumLiteral_28= 'int232' )
                    {
                    // InternalTryGrammar.g:6760:3: (enumLiteral_28= 'int232' )
                    // InternalTryGrammar.g:6761:4: enumLiteral_28= 'int232'
                    {
                    enumLiteral_28=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT232EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_28, grammarAccess.getElementaryTypeNameEnumAccess().getINT232EnumLiteralDeclaration_28());
                      			
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalTryGrammar.g:6768:3: (enumLiteral_29= 'int240' )
                    {
                    // InternalTryGrammar.g:6768:3: (enumLiteral_29= 'int240' )
                    // InternalTryGrammar.g:6769:4: enumLiteral_29= 'int240'
                    {
                    enumLiteral_29=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT240EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_29, grammarAccess.getElementaryTypeNameEnumAccess().getINT240EnumLiteralDeclaration_29());
                      			
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalTryGrammar.g:6776:3: (enumLiteral_30= 'int248' )
                    {
                    // InternalTryGrammar.g:6776:3: (enumLiteral_30= 'int248' )
                    // InternalTryGrammar.g:6777:4: enumLiteral_30= 'int248'
                    {
                    enumLiteral_30=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT248EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_30, grammarAccess.getElementaryTypeNameEnumAccess().getINT248EnumLiteralDeclaration_30());
                      			
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalTryGrammar.g:6784:3: (enumLiteral_31= 'int256' )
                    {
                    // InternalTryGrammar.g:6784:3: (enumLiteral_31= 'int256' )
                    // InternalTryGrammar.g:6785:4: enumLiteral_31= 'int256'
                    {
                    enumLiteral_31=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT256EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_31, grammarAccess.getElementaryTypeNameEnumAccess().getINT256EnumLiteralDeclaration_31());
                      			
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalTryGrammar.g:6792:3: (enumLiteral_32= 'uint' )
                    {
                    // InternalTryGrammar.g:6792:3: (enumLiteral_32= 'uint' )
                    // InternalTryGrammar.g:6793:4: enumLiteral_32= 'uint'
                    {
                    enumLiteral_32=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINTEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_32, grammarAccess.getElementaryTypeNameEnumAccess().getUINTEnumLiteralDeclaration_32());
                      			
                    }

                    }


                    }
                    break;
                case 34 :
                    // InternalTryGrammar.g:6800:3: (enumLiteral_33= 'uint8' )
                    {
                    // InternalTryGrammar.g:6800:3: (enumLiteral_33= 'uint8' )
                    // InternalTryGrammar.g:6801:4: enumLiteral_33= 'uint8'
                    {
                    enumLiteral_33=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT8EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_33, grammarAccess.getElementaryTypeNameEnumAccess().getUINT8EnumLiteralDeclaration_33());
                      			
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalTryGrammar.g:6808:3: (enumLiteral_34= 'uint16' )
                    {
                    // InternalTryGrammar.g:6808:3: (enumLiteral_34= 'uint16' )
                    // InternalTryGrammar.g:6809:4: enumLiteral_34= 'uint16'
                    {
                    enumLiteral_34=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT16EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_34, grammarAccess.getElementaryTypeNameEnumAccess().getUINT16EnumLiteralDeclaration_34());
                      			
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalTryGrammar.g:6816:3: (enumLiteral_35= 'uint24' )
                    {
                    // InternalTryGrammar.g:6816:3: (enumLiteral_35= 'uint24' )
                    // InternalTryGrammar.g:6817:4: enumLiteral_35= 'uint24'
                    {
                    enumLiteral_35=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUNIT24EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_35, grammarAccess.getElementaryTypeNameEnumAccess().getUNIT24EnumLiteralDeclaration_35());
                      			
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalTryGrammar.g:6824:3: (enumLiteral_36= 'uint32' )
                    {
                    // InternalTryGrammar.g:6824:3: (enumLiteral_36= 'uint32' )
                    // InternalTryGrammar.g:6825:4: enumLiteral_36= 'uint32'
                    {
                    enumLiteral_36=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT32EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_36, grammarAccess.getElementaryTypeNameEnumAccess().getUINT32EnumLiteralDeclaration_36());
                      			
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalTryGrammar.g:6832:3: (enumLiteral_37= 'uint40' )
                    {
                    // InternalTryGrammar.g:6832:3: (enumLiteral_37= 'uint40' )
                    // InternalTryGrammar.g:6833:4: enumLiteral_37= 'uint40'
                    {
                    enumLiteral_37=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT40EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_37, grammarAccess.getElementaryTypeNameEnumAccess().getUINT40EnumLiteralDeclaration_37());
                      			
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalTryGrammar.g:6840:3: (enumLiteral_38= 'uint48' )
                    {
                    // InternalTryGrammar.g:6840:3: (enumLiteral_38= 'uint48' )
                    // InternalTryGrammar.g:6841:4: enumLiteral_38= 'uint48'
                    {
                    enumLiteral_38=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT48EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_38, grammarAccess.getElementaryTypeNameEnumAccess().getUINT48EnumLiteralDeclaration_38());
                      			
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalTryGrammar.g:6848:3: (enumLiteral_39= 'uint56' )
                    {
                    // InternalTryGrammar.g:6848:3: (enumLiteral_39= 'uint56' )
                    // InternalTryGrammar.g:6849:4: enumLiteral_39= 'uint56'
                    {
                    enumLiteral_39=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUNIT56EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_39, grammarAccess.getElementaryTypeNameEnumAccess().getUNIT56EnumLiteralDeclaration_39());
                      			
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalTryGrammar.g:6856:3: (enumLiteral_40= 'uint64' )
                    {
                    // InternalTryGrammar.g:6856:3: (enumLiteral_40= 'uint64' )
                    // InternalTryGrammar.g:6857:4: enumLiteral_40= 'uint64'
                    {
                    enumLiteral_40=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT64EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_40, grammarAccess.getElementaryTypeNameEnumAccess().getUINT64EnumLiteralDeclaration_40());
                      			
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalTryGrammar.g:6864:3: (enumLiteral_41= 'uint72' )
                    {
                    // InternalTryGrammar.g:6864:3: (enumLiteral_41= 'uint72' )
                    // InternalTryGrammar.g:6865:4: enumLiteral_41= 'uint72'
                    {
                    enumLiteral_41=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT72EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_41, grammarAccess.getElementaryTypeNameEnumAccess().getUINT72EnumLiteralDeclaration_41());
                      			
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalTryGrammar.g:6872:3: (enumLiteral_42= 'uint80' )
                    {
                    // InternalTryGrammar.g:6872:3: (enumLiteral_42= 'uint80' )
                    // InternalTryGrammar.g:6873:4: enumLiteral_42= 'uint80'
                    {
                    enumLiteral_42=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT80EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_42, grammarAccess.getElementaryTypeNameEnumAccess().getUINT80EnumLiteralDeclaration_42());
                      			
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalTryGrammar.g:6880:3: (enumLiteral_43= 'uint88' )
                    {
                    // InternalTryGrammar.g:6880:3: (enumLiteral_43= 'uint88' )
                    // InternalTryGrammar.g:6881:4: enumLiteral_43= 'uint88'
                    {
                    enumLiteral_43=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT88EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_43, grammarAccess.getElementaryTypeNameEnumAccess().getUINT88EnumLiteralDeclaration_43());
                      			
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalTryGrammar.g:6888:3: (enumLiteral_44= 'uint96' )
                    {
                    // InternalTryGrammar.g:6888:3: (enumLiteral_44= 'uint96' )
                    // InternalTryGrammar.g:6889:4: enumLiteral_44= 'uint96'
                    {
                    enumLiteral_44=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT96EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_44, grammarAccess.getElementaryTypeNameEnumAccess().getUINT96EnumLiteralDeclaration_44());
                      			
                    }

                    }


                    }
                    break;
                case 46 :
                    // InternalTryGrammar.g:6896:3: (enumLiteral_45= 'uint104' )
                    {
                    // InternalTryGrammar.g:6896:3: (enumLiteral_45= 'uint104' )
                    // InternalTryGrammar.g:6897:4: enumLiteral_45= 'uint104'
                    {
                    enumLiteral_45=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT104EnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_45, grammarAccess.getElementaryTypeNameEnumAccess().getUINT104EnumLiteralDeclaration_45());
                      			
                    }

                    }


                    }
                    break;
                case 47 :
                    // InternalTryGrammar.g:6904:3: (enumLiteral_46= 'uint112' )
                    {
                    // InternalTryGrammar.g:6904:3: (enumLiteral_46= 'uint112' )
                    // InternalTryGrammar.g:6905:4: enumLiteral_46= 'uint112'
                    {
                    enumLiteral_46=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT112EnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_46, grammarAccess.getElementaryTypeNameEnumAccess().getUINT112EnumLiteralDeclaration_46());
                      			
                    }

                    }


                    }
                    break;
                case 48 :
                    // InternalTryGrammar.g:6912:3: (enumLiteral_47= 'uint120' )
                    {
                    // InternalTryGrammar.g:6912:3: (enumLiteral_47= 'uint120' )
                    // InternalTryGrammar.g:6913:4: enumLiteral_47= 'uint120'
                    {
                    enumLiteral_47=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT120EnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_47, grammarAccess.getElementaryTypeNameEnumAccess().getUINT120EnumLiteralDeclaration_47());
                      			
                    }

                    }


                    }
                    break;
                case 49 :
                    // InternalTryGrammar.g:6920:3: (enumLiteral_48= 'uint128' )
                    {
                    // InternalTryGrammar.g:6920:3: (enumLiteral_48= 'uint128' )
                    // InternalTryGrammar.g:6921:4: enumLiteral_48= 'uint128'
                    {
                    enumLiteral_48=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT128EnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_48, grammarAccess.getElementaryTypeNameEnumAccess().getUINT128EnumLiteralDeclaration_48());
                      			
                    }

                    }


                    }
                    break;
                case 50 :
                    // InternalTryGrammar.g:6928:3: (enumLiteral_49= 'uint136' )
                    {
                    // InternalTryGrammar.g:6928:3: (enumLiteral_49= 'uint136' )
                    // InternalTryGrammar.g:6929:4: enumLiteral_49= 'uint136'
                    {
                    enumLiteral_49=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT136EnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_49, grammarAccess.getElementaryTypeNameEnumAccess().getUINT136EnumLiteralDeclaration_49());
                      			
                    }

                    }


                    }
                    break;
                case 51 :
                    // InternalTryGrammar.g:6936:3: (enumLiteral_50= 'uint144' )
                    {
                    // InternalTryGrammar.g:6936:3: (enumLiteral_50= 'uint144' )
                    // InternalTryGrammar.g:6937:4: enumLiteral_50= 'uint144'
                    {
                    enumLiteral_50=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT144EnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_50, grammarAccess.getElementaryTypeNameEnumAccess().getUINT144EnumLiteralDeclaration_50());
                      			
                    }

                    }


                    }
                    break;
                case 52 :
                    // InternalTryGrammar.g:6944:3: (enumLiteral_51= 'uint152' )
                    {
                    // InternalTryGrammar.g:6944:3: (enumLiteral_51= 'uint152' )
                    // InternalTryGrammar.g:6945:4: enumLiteral_51= 'uint152'
                    {
                    enumLiteral_51=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT152EnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_51, grammarAccess.getElementaryTypeNameEnumAccess().getUINT152EnumLiteralDeclaration_51());
                      			
                    }

                    }


                    }
                    break;
                case 53 :
                    // InternalTryGrammar.g:6952:3: (enumLiteral_52= 'uint160' )
                    {
                    // InternalTryGrammar.g:6952:3: (enumLiteral_52= 'uint160' )
                    // InternalTryGrammar.g:6953:4: enumLiteral_52= 'uint160'
                    {
                    enumLiteral_52=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT160EnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_52, grammarAccess.getElementaryTypeNameEnumAccess().getUINT160EnumLiteralDeclaration_52());
                      			
                    }

                    }


                    }
                    break;
                case 54 :
                    // InternalTryGrammar.g:6960:3: (enumLiteral_53= 'uint168' )
                    {
                    // InternalTryGrammar.g:6960:3: (enumLiteral_53= 'uint168' )
                    // InternalTryGrammar.g:6961:4: enumLiteral_53= 'uint168'
                    {
                    enumLiteral_53=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT168EnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_53, grammarAccess.getElementaryTypeNameEnumAccess().getUINT168EnumLiteralDeclaration_53());
                      			
                    }

                    }


                    }
                    break;
                case 55 :
                    // InternalTryGrammar.g:6968:3: (enumLiteral_54= 'uint178' )
                    {
                    // InternalTryGrammar.g:6968:3: (enumLiteral_54= 'uint178' )
                    // InternalTryGrammar.g:6969:4: enumLiteral_54= 'uint178'
                    {
                    enumLiteral_54=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT178EnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_54, grammarAccess.getElementaryTypeNameEnumAccess().getUINT178EnumLiteralDeclaration_54());
                      			
                    }

                    }


                    }
                    break;
                case 56 :
                    // InternalTryGrammar.g:6976:3: (enumLiteral_55= 'uint184' )
                    {
                    // InternalTryGrammar.g:6976:3: (enumLiteral_55= 'uint184' )
                    // InternalTryGrammar.g:6977:4: enumLiteral_55= 'uint184'
                    {
                    enumLiteral_55=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT184EnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_55, grammarAccess.getElementaryTypeNameEnumAccess().getUINT184EnumLiteralDeclaration_55());
                      			
                    }

                    }


                    }
                    break;
                case 57 :
                    // InternalTryGrammar.g:6984:3: (enumLiteral_56= 'uint192' )
                    {
                    // InternalTryGrammar.g:6984:3: (enumLiteral_56= 'uint192' )
                    // InternalTryGrammar.g:6985:4: enumLiteral_56= 'uint192'
                    {
                    enumLiteral_56=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT192EnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_56, grammarAccess.getElementaryTypeNameEnumAccess().getUINT192EnumLiteralDeclaration_56());
                      			
                    }

                    }


                    }
                    break;
                case 58 :
                    // InternalTryGrammar.g:6992:3: (enumLiteral_57= 'uint200' )
                    {
                    // InternalTryGrammar.g:6992:3: (enumLiteral_57= 'uint200' )
                    // InternalTryGrammar.g:6993:4: enumLiteral_57= 'uint200'
                    {
                    enumLiteral_57=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT200EnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_57, grammarAccess.getElementaryTypeNameEnumAccess().getUINT200EnumLiteralDeclaration_57());
                      			
                    }

                    }


                    }
                    break;
                case 59 :
                    // InternalTryGrammar.g:7000:3: (enumLiteral_58= 'uint208' )
                    {
                    // InternalTryGrammar.g:7000:3: (enumLiteral_58= 'uint208' )
                    // InternalTryGrammar.g:7001:4: enumLiteral_58= 'uint208'
                    {
                    enumLiteral_58=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT208EnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_58, grammarAccess.getElementaryTypeNameEnumAccess().getUINT208EnumLiteralDeclaration_58());
                      			
                    }

                    }


                    }
                    break;
                case 60 :
                    // InternalTryGrammar.g:7008:3: (enumLiteral_59= 'uint216' )
                    {
                    // InternalTryGrammar.g:7008:3: (enumLiteral_59= 'uint216' )
                    // InternalTryGrammar.g:7009:4: enumLiteral_59= 'uint216'
                    {
                    enumLiteral_59=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT216EnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_59, grammarAccess.getElementaryTypeNameEnumAccess().getUINT216EnumLiteralDeclaration_59());
                      			
                    }

                    }


                    }
                    break;
                case 61 :
                    // InternalTryGrammar.g:7016:3: (enumLiteral_60= 'uint224' )
                    {
                    // InternalTryGrammar.g:7016:3: (enumLiteral_60= 'uint224' )
                    // InternalTryGrammar.g:7017:4: enumLiteral_60= 'uint224'
                    {
                    enumLiteral_60=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT244EnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_60, grammarAccess.getElementaryTypeNameEnumAccess().getUINT244EnumLiteralDeclaration_60());
                      			
                    }

                    }


                    }
                    break;
                case 62 :
                    // InternalTryGrammar.g:7024:3: (enumLiteral_61= 'uint232' )
                    {
                    // InternalTryGrammar.g:7024:3: (enumLiteral_61= 'uint232' )
                    // InternalTryGrammar.g:7025:4: enumLiteral_61= 'uint232'
                    {
                    enumLiteral_61=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT232EnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_61, grammarAccess.getElementaryTypeNameEnumAccess().getUINT232EnumLiteralDeclaration_61());
                      			
                    }

                    }


                    }
                    break;
                case 63 :
                    // InternalTryGrammar.g:7032:3: (enumLiteral_62= 'uint240' )
                    {
                    // InternalTryGrammar.g:7032:3: (enumLiteral_62= 'uint240' )
                    // InternalTryGrammar.g:7033:4: enumLiteral_62= 'uint240'
                    {
                    enumLiteral_62=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT240EnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_62, grammarAccess.getElementaryTypeNameEnumAccess().getUINT240EnumLiteralDeclaration_62());
                      			
                    }

                    }


                    }
                    break;
                case 64 :
                    // InternalTryGrammar.g:7040:3: (enumLiteral_63= 'uint248' )
                    {
                    // InternalTryGrammar.g:7040:3: (enumLiteral_63= 'uint248' )
                    // InternalTryGrammar.g:7041:4: enumLiteral_63= 'uint248'
                    {
                    enumLiteral_63=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT248EnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_63, grammarAccess.getElementaryTypeNameEnumAccess().getUINT248EnumLiteralDeclaration_63());
                      			
                    }

                    }


                    }
                    break;
                case 65 :
                    // InternalTryGrammar.g:7048:3: (enumLiteral_64= 'uint256' )
                    {
                    // InternalTryGrammar.g:7048:3: (enumLiteral_64= 'uint256' )
                    // InternalTryGrammar.g:7049:4: enumLiteral_64= 'uint256'
                    {
                    enumLiteral_64=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT256EnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_64, grammarAccess.getElementaryTypeNameEnumAccess().getUINT256EnumLiteralDeclaration_64());
                      			
                    }

                    }


                    }
                    break;
                case 66 :
                    // InternalTryGrammar.g:7056:3: (enumLiteral_65= 'byte' )
                    {
                    // InternalTryGrammar.g:7056:3: (enumLiteral_65= 'byte' )
                    // InternalTryGrammar.g:7057:4: enumLiteral_65= 'byte'
                    {
                    enumLiteral_65=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTEEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_65, grammarAccess.getElementaryTypeNameEnumAccess().getBYTEEnumLiteralDeclaration_65());
                      			
                    }

                    }


                    }
                    break;
                case 67 :
                    // InternalTryGrammar.g:7064:3: (enumLiteral_66= 'bytes' )
                    {
                    // InternalTryGrammar.g:7064:3: (enumLiteral_66= 'bytes' )
                    // InternalTryGrammar.g:7065:4: enumLiteral_66= 'bytes'
                    {
                    enumLiteral_66=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTESEnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_66, grammarAccess.getElementaryTypeNameEnumAccess().getBYTESEnumLiteralDeclaration_66());
                      			
                    }

                    }


                    }
                    break;
                case 68 :
                    // InternalTryGrammar.g:7072:3: (enumLiteral_67= 'bytes1' )
                    {
                    // InternalTryGrammar.g:7072:3: (enumLiteral_67= 'bytes1' )
                    // InternalTryGrammar.g:7073:4: enumLiteral_67= 'bytes1'
                    {
                    enumLiteral_67=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES1EnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_67, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES1EnumLiteralDeclaration_67());
                      			
                    }

                    }


                    }
                    break;
                case 69 :
                    // InternalTryGrammar.g:7080:3: (enumLiteral_68= 'bytes2' )
                    {
                    // InternalTryGrammar.g:7080:3: (enumLiteral_68= 'bytes2' )
                    // InternalTryGrammar.g:7081:4: enumLiteral_68= 'bytes2'
                    {
                    enumLiteral_68=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES2EnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_68, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES2EnumLiteralDeclaration_68());
                      			
                    }

                    }


                    }
                    break;
                case 70 :
                    // InternalTryGrammar.g:7088:3: (enumLiteral_69= 'bytes3' )
                    {
                    // InternalTryGrammar.g:7088:3: (enumLiteral_69= 'bytes3' )
                    // InternalTryGrammar.g:7089:4: enumLiteral_69= 'bytes3'
                    {
                    enumLiteral_69=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES3EnumLiteralDeclaration_69().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_69, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES3EnumLiteralDeclaration_69());
                      			
                    }

                    }


                    }
                    break;
                case 71 :
                    // InternalTryGrammar.g:7096:3: (enumLiteral_70= 'bytes4' )
                    {
                    // InternalTryGrammar.g:7096:3: (enumLiteral_70= 'bytes4' )
                    // InternalTryGrammar.g:7097:4: enumLiteral_70= 'bytes4'
                    {
                    enumLiteral_70=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES4EnumLiteralDeclaration_70().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_70, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES4EnumLiteralDeclaration_70());
                      			
                    }

                    }


                    }
                    break;
                case 72 :
                    // InternalTryGrammar.g:7104:3: (enumLiteral_71= 'bytes5' )
                    {
                    // InternalTryGrammar.g:7104:3: (enumLiteral_71= 'bytes5' )
                    // InternalTryGrammar.g:7105:4: enumLiteral_71= 'bytes5'
                    {
                    enumLiteral_71=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES5EnumLiteralDeclaration_71().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_71, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES5EnumLiteralDeclaration_71());
                      			
                    }

                    }


                    }
                    break;
                case 73 :
                    // InternalTryGrammar.g:7112:3: (enumLiteral_72= 'bytes6' )
                    {
                    // InternalTryGrammar.g:7112:3: (enumLiteral_72= 'bytes6' )
                    // InternalTryGrammar.g:7113:4: enumLiteral_72= 'bytes6'
                    {
                    enumLiteral_72=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES6EnumLiteralDeclaration_72().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_72, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES6EnumLiteralDeclaration_72());
                      			
                    }

                    }


                    }
                    break;
                case 74 :
                    // InternalTryGrammar.g:7120:3: (enumLiteral_73= 'bytes7' )
                    {
                    // InternalTryGrammar.g:7120:3: (enumLiteral_73= 'bytes7' )
                    // InternalTryGrammar.g:7121:4: enumLiteral_73= 'bytes7'
                    {
                    enumLiteral_73=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES7EnumLiteralDeclaration_73().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_73, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES7EnumLiteralDeclaration_73());
                      			
                    }

                    }


                    }
                    break;
                case 75 :
                    // InternalTryGrammar.g:7128:3: (enumLiteral_74= 'bytes8' )
                    {
                    // InternalTryGrammar.g:7128:3: (enumLiteral_74= 'bytes8' )
                    // InternalTryGrammar.g:7129:4: enumLiteral_74= 'bytes8'
                    {
                    enumLiteral_74=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES8EnumLiteralDeclaration_74().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_74, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES8EnumLiteralDeclaration_74());
                      			
                    }

                    }


                    }
                    break;
                case 76 :
                    // InternalTryGrammar.g:7136:3: (enumLiteral_75= 'bytes9' )
                    {
                    // InternalTryGrammar.g:7136:3: (enumLiteral_75= 'bytes9' )
                    // InternalTryGrammar.g:7137:4: enumLiteral_75= 'bytes9'
                    {
                    enumLiteral_75=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES9EnumLiteralDeclaration_75().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_75, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES9EnumLiteralDeclaration_75());
                      			
                    }

                    }


                    }
                    break;
                case 77 :
                    // InternalTryGrammar.g:7144:3: (enumLiteral_76= 'bytes10' )
                    {
                    // InternalTryGrammar.g:7144:3: (enumLiteral_76= 'bytes10' )
                    // InternalTryGrammar.g:7145:4: enumLiteral_76= 'bytes10'
                    {
                    enumLiteral_76=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES10EnumLiteralDeclaration_76().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_76, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES10EnumLiteralDeclaration_76());
                      			
                    }

                    }


                    }
                    break;
                case 78 :
                    // InternalTryGrammar.g:7152:3: (enumLiteral_77= 'bytes11' )
                    {
                    // InternalTryGrammar.g:7152:3: (enumLiteral_77= 'bytes11' )
                    // InternalTryGrammar.g:7153:4: enumLiteral_77= 'bytes11'
                    {
                    enumLiteral_77=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES11EnumLiteralDeclaration_77().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_77, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES11EnumLiteralDeclaration_77());
                      			
                    }

                    }


                    }
                    break;
                case 79 :
                    // InternalTryGrammar.g:7160:3: (enumLiteral_78= 'bytes12' )
                    {
                    // InternalTryGrammar.g:7160:3: (enumLiteral_78= 'bytes12' )
                    // InternalTryGrammar.g:7161:4: enumLiteral_78= 'bytes12'
                    {
                    enumLiteral_78=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES12EnumLiteralDeclaration_78().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_78, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES12EnumLiteralDeclaration_78());
                      			
                    }

                    }


                    }
                    break;
                case 80 :
                    // InternalTryGrammar.g:7168:3: (enumLiteral_79= 'bytes13' )
                    {
                    // InternalTryGrammar.g:7168:3: (enumLiteral_79= 'bytes13' )
                    // InternalTryGrammar.g:7169:4: enumLiteral_79= 'bytes13'
                    {
                    enumLiteral_79=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES13EnumLiteralDeclaration_79().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_79, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES13EnumLiteralDeclaration_79());
                      			
                    }

                    }


                    }
                    break;
                case 81 :
                    // InternalTryGrammar.g:7176:3: (enumLiteral_80= 'bytes14' )
                    {
                    // InternalTryGrammar.g:7176:3: (enumLiteral_80= 'bytes14' )
                    // InternalTryGrammar.g:7177:4: enumLiteral_80= 'bytes14'
                    {
                    enumLiteral_80=(Token)match(input,145,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES14EnumLiteralDeclaration_80().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_80, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES14EnumLiteralDeclaration_80());
                      			
                    }

                    }


                    }
                    break;
                case 82 :
                    // InternalTryGrammar.g:7184:3: (enumLiteral_81= 'bytes15' )
                    {
                    // InternalTryGrammar.g:7184:3: (enumLiteral_81= 'bytes15' )
                    // InternalTryGrammar.g:7185:4: enumLiteral_81= 'bytes15'
                    {
                    enumLiteral_81=(Token)match(input,146,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES15EnumLiteralDeclaration_81().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_81, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES15EnumLiteralDeclaration_81());
                      			
                    }

                    }


                    }
                    break;
                case 83 :
                    // InternalTryGrammar.g:7192:3: (enumLiteral_82= 'bytes16' )
                    {
                    // InternalTryGrammar.g:7192:3: (enumLiteral_82= 'bytes16' )
                    // InternalTryGrammar.g:7193:4: enumLiteral_82= 'bytes16'
                    {
                    enumLiteral_82=(Token)match(input,147,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES16EnumLiteralDeclaration_82().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_82, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES16EnumLiteralDeclaration_82());
                      			
                    }

                    }


                    }
                    break;
                case 84 :
                    // InternalTryGrammar.g:7200:3: (enumLiteral_83= 'bytes17' )
                    {
                    // InternalTryGrammar.g:7200:3: (enumLiteral_83= 'bytes17' )
                    // InternalTryGrammar.g:7201:4: enumLiteral_83= 'bytes17'
                    {
                    enumLiteral_83=(Token)match(input,148,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES17EnumLiteralDeclaration_83().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_83, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES17EnumLiteralDeclaration_83());
                      			
                    }

                    }


                    }
                    break;
                case 85 :
                    // InternalTryGrammar.g:7208:3: (enumLiteral_84= 'bytes18' )
                    {
                    // InternalTryGrammar.g:7208:3: (enumLiteral_84= 'bytes18' )
                    // InternalTryGrammar.g:7209:4: enumLiteral_84= 'bytes18'
                    {
                    enumLiteral_84=(Token)match(input,149,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES18EnumLiteralDeclaration_84().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_84, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES18EnumLiteralDeclaration_84());
                      			
                    }

                    }


                    }
                    break;
                case 86 :
                    // InternalTryGrammar.g:7216:3: (enumLiteral_85= 'bytes19' )
                    {
                    // InternalTryGrammar.g:7216:3: (enumLiteral_85= 'bytes19' )
                    // InternalTryGrammar.g:7217:4: enumLiteral_85= 'bytes19'
                    {
                    enumLiteral_85=(Token)match(input,150,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES19EnumLiteralDeclaration_85().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_85, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES19EnumLiteralDeclaration_85());
                      			
                    }

                    }


                    }
                    break;
                case 87 :
                    // InternalTryGrammar.g:7224:3: (enumLiteral_86= 'bytes20' )
                    {
                    // InternalTryGrammar.g:7224:3: (enumLiteral_86= 'bytes20' )
                    // InternalTryGrammar.g:7225:4: enumLiteral_86= 'bytes20'
                    {
                    enumLiteral_86=(Token)match(input,151,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES20EnumLiteralDeclaration_86().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_86, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES20EnumLiteralDeclaration_86());
                      			
                    }

                    }


                    }
                    break;
                case 88 :
                    // InternalTryGrammar.g:7232:3: (enumLiteral_87= 'bytes21' )
                    {
                    // InternalTryGrammar.g:7232:3: (enumLiteral_87= 'bytes21' )
                    // InternalTryGrammar.g:7233:4: enumLiteral_87= 'bytes21'
                    {
                    enumLiteral_87=(Token)match(input,152,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES21EnumLiteralDeclaration_87().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_87, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES21EnumLiteralDeclaration_87());
                      			
                    }

                    }


                    }
                    break;
                case 89 :
                    // InternalTryGrammar.g:7240:3: (enumLiteral_88= 'bytes22' )
                    {
                    // InternalTryGrammar.g:7240:3: (enumLiteral_88= 'bytes22' )
                    // InternalTryGrammar.g:7241:4: enumLiteral_88= 'bytes22'
                    {
                    enumLiteral_88=(Token)match(input,153,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES22EnumLiteralDeclaration_88().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_88, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES22EnumLiteralDeclaration_88());
                      			
                    }

                    }


                    }
                    break;
                case 90 :
                    // InternalTryGrammar.g:7248:3: (enumLiteral_89= 'bytes23' )
                    {
                    // InternalTryGrammar.g:7248:3: (enumLiteral_89= 'bytes23' )
                    // InternalTryGrammar.g:7249:4: enumLiteral_89= 'bytes23'
                    {
                    enumLiteral_89=(Token)match(input,154,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES23EnumLiteralDeclaration_89().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_89, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES23EnumLiteralDeclaration_89());
                      			
                    }

                    }


                    }
                    break;
                case 91 :
                    // InternalTryGrammar.g:7256:3: (enumLiteral_90= 'bytes24' )
                    {
                    // InternalTryGrammar.g:7256:3: (enumLiteral_90= 'bytes24' )
                    // InternalTryGrammar.g:7257:4: enumLiteral_90= 'bytes24'
                    {
                    enumLiteral_90=(Token)match(input,155,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES24EnumLiteralDeclaration_90().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_90, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES24EnumLiteralDeclaration_90());
                      			
                    }

                    }


                    }
                    break;
                case 92 :
                    // InternalTryGrammar.g:7264:3: (enumLiteral_91= 'bytes25' )
                    {
                    // InternalTryGrammar.g:7264:3: (enumLiteral_91= 'bytes25' )
                    // InternalTryGrammar.g:7265:4: enumLiteral_91= 'bytes25'
                    {
                    enumLiteral_91=(Token)match(input,156,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES25EnumLiteralDeclaration_91().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_91, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES25EnumLiteralDeclaration_91());
                      			
                    }

                    }


                    }
                    break;
                case 93 :
                    // InternalTryGrammar.g:7272:3: (enumLiteral_92= 'bytes26' )
                    {
                    // InternalTryGrammar.g:7272:3: (enumLiteral_92= 'bytes26' )
                    // InternalTryGrammar.g:7273:4: enumLiteral_92= 'bytes26'
                    {
                    enumLiteral_92=(Token)match(input,157,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES26EnumLiteralDeclaration_92().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_92, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES26EnumLiteralDeclaration_92());
                      			
                    }

                    }


                    }
                    break;
                case 94 :
                    // InternalTryGrammar.g:7280:3: (enumLiteral_93= 'bytes27' )
                    {
                    // InternalTryGrammar.g:7280:3: (enumLiteral_93= 'bytes27' )
                    // InternalTryGrammar.g:7281:4: enumLiteral_93= 'bytes27'
                    {
                    enumLiteral_93=(Token)match(input,158,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES27EnumLiteralDeclaration_93().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_93, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES27EnumLiteralDeclaration_93());
                      			
                    }

                    }


                    }
                    break;
                case 95 :
                    // InternalTryGrammar.g:7288:3: (enumLiteral_94= 'bytes28' )
                    {
                    // InternalTryGrammar.g:7288:3: (enumLiteral_94= 'bytes28' )
                    // InternalTryGrammar.g:7289:4: enumLiteral_94= 'bytes28'
                    {
                    enumLiteral_94=(Token)match(input,159,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES28EnumLiteralDeclaration_94().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_94, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES28EnumLiteralDeclaration_94());
                      			
                    }

                    }


                    }
                    break;
                case 96 :
                    // InternalTryGrammar.g:7296:3: (enumLiteral_95= 'bytes29' )
                    {
                    // InternalTryGrammar.g:7296:3: (enumLiteral_95= 'bytes29' )
                    // InternalTryGrammar.g:7297:4: enumLiteral_95= 'bytes29'
                    {
                    enumLiteral_95=(Token)match(input,160,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES29EnumLiteralDeclaration_95().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_95, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES29EnumLiteralDeclaration_95());
                      			
                    }

                    }


                    }
                    break;
                case 97 :
                    // InternalTryGrammar.g:7304:3: (enumLiteral_96= 'bytes30' )
                    {
                    // InternalTryGrammar.g:7304:3: (enumLiteral_96= 'bytes30' )
                    // InternalTryGrammar.g:7305:4: enumLiteral_96= 'bytes30'
                    {
                    enumLiteral_96=(Token)match(input,161,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES30EnumLiteralDeclaration_96().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_96, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES30EnumLiteralDeclaration_96());
                      			
                    }

                    }


                    }
                    break;
                case 98 :
                    // InternalTryGrammar.g:7312:3: (enumLiteral_97= 'bytes31' )
                    {
                    // InternalTryGrammar.g:7312:3: (enumLiteral_97= 'bytes31' )
                    // InternalTryGrammar.g:7313:4: enumLiteral_97= 'bytes31'
                    {
                    enumLiteral_97=(Token)match(input,162,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES31EnumLiteralDeclaration_97().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_97, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES31EnumLiteralDeclaration_97());
                      			
                    }

                    }


                    }
                    break;
                case 99 :
                    // InternalTryGrammar.g:7320:3: (enumLiteral_98= 'bytes32' )
                    {
                    // InternalTryGrammar.g:7320:3: (enumLiteral_98= 'bytes32' )
                    // InternalTryGrammar.g:7321:4: enumLiteral_98= 'bytes32'
                    {
                    enumLiteral_98=(Token)match(input,163,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES32EnumLiteralDeclaration_98().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_98, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES32EnumLiteralDeclaration_98());
                      			
                    }

                    }


                    }
                    break;
                case 100 :
                    // InternalTryGrammar.g:7328:3: (enumLiteral_99= 'string' )
                    {
                    // InternalTryGrammar.g:7328:3: (enumLiteral_99= 'string' )
                    // InternalTryGrammar.g:7329:4: enumLiteral_99= 'string'
                    {
                    enumLiteral_99=(Token)match(input,164,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getSTRINGEnumLiteralDeclaration_99().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_99, grammarAccess.getElementaryTypeNameEnumAccess().getSTRINGEnumLiteralDeclaration_99());
                      			
                    }

                    }


                    }
                    break;
                case 101 :
                    // InternalTryGrammar.g:7336:3: (enumLiteral_100= 'address' )
                    {
                    // InternalTryGrammar.g:7336:3: (enumLiteral_100= 'address' )
                    // InternalTryGrammar.g:7337:4: enumLiteral_100= 'address'
                    {
                    enumLiteral_100=(Token)match(input,165,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getADDRESSEnumLiteralDeclaration_100().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_100, grammarAccess.getElementaryTypeNameEnumAccess().getADDRESSEnumLiteralDeclaration_100());
                      			
                    }

                    }


                    }
                    break;
                case 102 :
                    // InternalTryGrammar.g:7344:3: (enumLiteral_101= 'bool' )
                    {
                    // InternalTryGrammar.g:7344:3: (enumLiteral_101= 'bool' )
                    // InternalTryGrammar.g:7345:4: enumLiteral_101= 'bool'
                    {
                    enumLiteral_101=(Token)match(input,166,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBOOLEnumLiteralDeclaration_101().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_101, grammarAccess.getElementaryTypeNameEnumAccess().getBOOLEnumLiteralDeclaration_101());
                      			
                    }

                    }


                    }
                    break;
                case 103 :
                    // InternalTryGrammar.g:7352:3: (enumLiteral_102= 'real' )
                    {
                    // InternalTryGrammar.g:7352:3: (enumLiteral_102= 'real' )
                    // InternalTryGrammar.g:7353:4: enumLiteral_102= 'real'
                    {
                    enumLiteral_102=(Token)match(input,167,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getREALEnumLiteralDeclaration_102().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_102, grammarAccess.getElementaryTypeNameEnumAccess().getREALEnumLiteralDeclaration_102());
                      			
                    }

                    }


                    }
                    break;
                case 104 :
                    // InternalTryGrammar.g:7360:3: (enumLiteral_103= 'ureal' )
                    {
                    // InternalTryGrammar.g:7360:3: (enumLiteral_103= 'ureal' )
                    // InternalTryGrammar.g:7361:4: enumLiteral_103= 'ureal'
                    {
                    enumLiteral_103=(Token)match(input,168,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUREALEnumLiteralDeclaration_103().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_103, grammarAccess.getElementaryTypeNameEnumAccess().getUREALEnumLiteralDeclaration_103());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementaryTypeNameEnum"


    // $ANTLR start "ruleLocationSpecifierEnum"
    // InternalTryGrammar.g:7371:1: ruleLocationSpecifierEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) ) ;
    public final Enumerator ruleLocationSpecifierEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7377:2: ( ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) ) )
            // InternalTryGrammar.g:7378:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) )
            {
            // InternalTryGrammar.g:7378:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==169) ) {
                alt101=1;
            }
            else if ( (LA101_0==170) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalTryGrammar.g:7379:3: (enumLiteral_0= 'memory' )
                    {
                    // InternalTryGrammar.g:7379:3: (enumLiteral_0= 'memory' )
                    // InternalTryGrammar.g:7380:4: enumLiteral_0= 'memory'
                    {
                    enumLiteral_0=(Token)match(input,169,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7387:3: (enumLiteral_1= 'storage' )
                    {
                    // InternalTryGrammar.g:7387:3: (enumLiteral_1= 'storage' )
                    // InternalTryGrammar.g:7388:4: enumLiteral_1= 'storage'
                    {
                    enumLiteral_1=(Token)match(input,170,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationSpecifierEnum"


    // $ANTLR start "ruleVisibilityEnum"
    // InternalTryGrammar.g:7398:1: ruleVisibilityEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) ;
    public final Enumerator ruleVisibilityEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7404:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) )
            // InternalTryGrammar.g:7405:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            {
            // InternalTryGrammar.g:7405:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            int alt102=4;
            switch ( input.LA(1) ) {
            case 171:
                {
                alt102=1;
                }
                break;
            case 172:
                {
                alt102=2;
                }
                break;
            case 173:
                {
                alt102=3;
                }
                break;
            case 174:
                {
                alt102=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalTryGrammar.g:7406:3: (enumLiteral_0= 'public' )
                    {
                    // InternalTryGrammar.g:7406:3: (enumLiteral_0= 'public' )
                    // InternalTryGrammar.g:7407:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,171,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7414:3: (enumLiteral_1= 'internal' )
                    {
                    // InternalTryGrammar.g:7414:3: (enumLiteral_1= 'internal' )
                    // InternalTryGrammar.g:7415:4: enumLiteral_1= 'internal'
                    {
                    enumLiteral_1=(Token)match(input,172,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7422:3: (enumLiteral_2= 'private' )
                    {
                    // InternalTryGrammar.g:7422:3: (enumLiteral_2= 'private' )
                    // InternalTryGrammar.g:7423:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,173,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:7430:3: (enumLiteral_3= 'external' )
                    {
                    // InternalTryGrammar.g:7430:3: (enumLiteral_3= 'external' )
                    // InternalTryGrammar.g:7431:4: enumLiteral_3= 'external'
                    {
                    enumLiteral_3=(Token)match(input,174,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getEXTERNALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityEnumAccess().getEXTERNALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityEnum"


    // $ANTLR start "ruleAssignmentOpEnum"
    // InternalTryGrammar.g:7441:1: ruleAssignmentOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) ;
    public final Enumerator ruleAssignmentOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7447:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) )
            // InternalTryGrammar.g:7448:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            {
            // InternalTryGrammar.g:7448:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            int alt103=12;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt103=1;
                }
                break;
            case 175:
                {
                alt103=2;
                }
                break;
            case 176:
                {
                alt103=3;
                }
                break;
            case 177:
                {
                alt103=4;
                }
                break;
            case 178:
                {
                alt103=5;
                }
                break;
            case 179:
                {
                alt103=6;
                }
                break;
            case 180:
                {
                alt103=7;
                }
                break;
            case 181:
                {
                alt103=8;
                }
                break;
            case 182:
                {
                alt103=9;
                }
                break;
            case 183:
                {
                alt103=10;
                }
                break;
            case 184:
                {
                alt103=11;
                }
                break;
            case 185:
                {
                alt103=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalTryGrammar.g:7449:3: (enumLiteral_0= '=' )
                    {
                    // InternalTryGrammar.g:7449:3: (enumLiteral_0= '=' )
                    // InternalTryGrammar.g:7450:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOpEnumAccess().getASSIGNEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7457:3: (enumLiteral_1= '|=' )
                    {
                    // InternalTryGrammar.g:7457:3: (enumLiteral_1= '|=' )
                    // InternalTryGrammar.g:7458:4: enumLiteral_1= '|='
                    {
                    enumLiteral_1=(Token)match(input,175,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7465:3: (enumLiteral_2= '^=' )
                    {
                    // InternalTryGrammar.g:7465:3: (enumLiteral_2= '^=' )
                    // InternalTryGrammar.g:7466:4: enumLiteral_2= '^='
                    {
                    enumLiteral_2=(Token)match(input,176,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:7473:3: (enumLiteral_3= '&=' )
                    {
                    // InternalTryGrammar.g:7473:3: (enumLiteral_3= '&=' )
                    // InternalTryGrammar.g:7474:4: enumLiteral_3= '&='
                    {
                    enumLiteral_3=(Token)match(input,177,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryGrammar.g:7481:3: (enumLiteral_4= '<<=' )
                    {
                    // InternalTryGrammar.g:7481:3: (enumLiteral_4= '<<=' )
                    // InternalTryGrammar.g:7482:4: enumLiteral_4= '<<='
                    {
                    enumLiteral_4=(Token)match(input,178,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryGrammar.g:7489:3: (enumLiteral_5= '>>=' )
                    {
                    // InternalTryGrammar.g:7489:3: (enumLiteral_5= '>>=' )
                    // InternalTryGrammar.g:7490:4: enumLiteral_5= '>>='
                    {
                    enumLiteral_5=(Token)match(input,179,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTryGrammar.g:7497:3: (enumLiteral_6= '>>>=' )
                    {
                    // InternalTryGrammar.g:7497:3: (enumLiteral_6= '>>>=' )
                    // InternalTryGrammar.g:7498:4: enumLiteral_6= '>>>='
                    {
                    enumLiteral_6=(Token)match(input,180,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalTryGrammar.g:7505:3: (enumLiteral_7= '+=' )
                    {
                    // InternalTryGrammar.g:7505:3: (enumLiteral_7= '+=' )
                    // InternalTryGrammar.g:7506:4: enumLiteral_7= '+='
                    {
                    enumLiteral_7=(Token)match(input,181,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalTryGrammar.g:7513:3: (enumLiteral_8= '-=' )
                    {
                    // InternalTryGrammar.g:7513:3: (enumLiteral_8= '-=' )
                    // InternalTryGrammar.g:7514:4: enumLiteral_8= '-='
                    {
                    enumLiteral_8=(Token)match(input,182,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalTryGrammar.g:7521:3: (enumLiteral_9= '*=' )
                    {
                    // InternalTryGrammar.g:7521:3: (enumLiteral_9= '*=' )
                    // InternalTryGrammar.g:7522:4: enumLiteral_9= '*='
                    {
                    enumLiteral_9=(Token)match(input,183,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalTryGrammar.g:7529:3: (enumLiteral_10= '/=' )
                    {
                    // InternalTryGrammar.g:7529:3: (enumLiteral_10= '/=' )
                    // InternalTryGrammar.g:7530:4: enumLiteral_10= '/='
                    {
                    enumLiteral_10=(Token)match(input,184,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalTryGrammar.g:7537:3: (enumLiteral_11= '%=' )
                    {
                    // InternalTryGrammar.g:7537:3: (enumLiteral_11= '%=' )
                    // InternalTryGrammar.g:7538:4: enumLiteral_11= '%='
                    {
                    enumLiteral_11=(Token)match(input,185,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MODEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MODEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentOpEnum"


    // $ANTLR start "ruleEqualityOpEnum"
    // InternalTryGrammar.g:7548:1: ruleEqualityOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7554:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalTryGrammar.g:7555:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalTryGrammar.g:7555:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==186) ) {
                alt104=1;
            }
            else if ( (LA104_0==187) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalTryGrammar.g:7556:3: (enumLiteral_0= '==' )
                    {
                    // InternalTryGrammar.g:7556:3: (enumLiteral_0= '==' )
                    // InternalTryGrammar.g:7557:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,186,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7564:3: (enumLiteral_1= '!=' )
                    {
                    // InternalTryGrammar.g:7564:3: (enumLiteral_1= '!=' )
                    // InternalTryGrammar.g:7565:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,187,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEqualityOpEnumAccess().getNOTEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEqualityOpEnumAccess().getNOTEQEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityOpEnum"


    // $ANTLR start "ruleComparisonOpEnum"
    // InternalTryGrammar.g:7575:1: ruleComparisonOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) ;
    public final Enumerator ruleComparisonOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7581:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) )
            // InternalTryGrammar.g:7582:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            {
            // InternalTryGrammar.g:7582:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            int alt105=5;
            switch ( input.LA(1) ) {
            case 188:
                {
                alt105=1;
                }
                break;
            case 189:
                {
                alt105=2;
                }
                break;
            case 190:
                {
                alt105=3;
                }
                break;
            case 191:
                {
                alt105=4;
                }
                break;
            case 192:
                {
                alt105=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalTryGrammar.g:7583:3: (enumLiteral_0= '<' )
                    {
                    // InternalTryGrammar.g:7583:3: (enumLiteral_0= '<' )
                    // InternalTryGrammar.g:7584:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,188,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7591:3: (enumLiteral_1= '>' )
                    {
                    // InternalTryGrammar.g:7591:3: (enumLiteral_1= '>' )
                    // InternalTryGrammar.g:7592:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,189,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7599:3: (enumLiteral_2= '<=' )
                    {
                    // InternalTryGrammar.g:7599:3: (enumLiteral_2= '<=' )
                    // InternalTryGrammar.g:7600:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,190,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:7607:3: (enumLiteral_3= '>=' )
                    {
                    // InternalTryGrammar.g:7607:3: (enumLiteral_3= '>=' )
                    // InternalTryGrammar.g:7608:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,191,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryGrammar.g:7615:3: (enumLiteral_4= 'in' )
                    {
                    // InternalTryGrammar.g:7615:3: (enumLiteral_4= 'in' )
                    // InternalTryGrammar.g:7616:4: enumLiteral_4= 'in'
                    {
                    enumLiteral_4=(Token)match(input,192,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOpEnumAccess().getINEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOpEnum"


    // $ANTLR start "ruleShiftOpEnum"
    // InternalTryGrammar.g:7626:1: ruleShiftOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) ;
    public final Enumerator ruleShiftOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7632:2: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) )
            // InternalTryGrammar.g:7633:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            {
            // InternalTryGrammar.g:7633:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 193:
                {
                alt106=1;
                }
                break;
            case 194:
                {
                alt106=2;
                }
                break;
            case 195:
                {
                alt106=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // InternalTryGrammar.g:7634:3: (enumLiteral_0= '<<' )
                    {
                    // InternalTryGrammar.g:7634:3: (enumLiteral_0= '<<' )
                    // InternalTryGrammar.g:7635:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,193,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7642:3: (enumLiteral_1= '>>' )
                    {
                    // InternalTryGrammar.g:7642:3: (enumLiteral_1= '>>' )
                    // InternalTryGrammar.g:7643:4: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,194,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7650:3: (enumLiteral_2= '>>>' )
                    {
                    // InternalTryGrammar.g:7650:3: (enumLiteral_2= '>>>' )
                    // InternalTryGrammar.g:7651:4: enumLiteral_2= '>>>'
                    {
                    enumLiteral_2=(Token)match(input,195,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getARITHMETIC_RIGHT_SHIFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getShiftOpEnumAccess().getARITHMETIC_RIGHT_SHIFTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShiftOpEnum"


    // $ANTLR start "ruleAdditionOpEnum"
    // InternalTryGrammar.g:7661:1: ruleAdditionOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7667:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalTryGrammar.g:7668:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalTryGrammar.g:7668:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==59) ) {
                alt107=1;
            }
            else if ( (LA107_0==60) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalTryGrammar.g:7669:3: (enumLiteral_0= '+' )
                    {
                    // InternalTryGrammar.g:7669:3: (enumLiteral_0= '+' )
                    // InternalTryGrammar.g:7670:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7677:3: (enumLiteral_1= '-' )
                    {
                    // InternalTryGrammar.g:7677:3: (enumLiteral_1= '-' )
                    // InternalTryGrammar.g:7678:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditionOpEnumAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAdditionOpEnumAccess().getSUBEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionOpEnum"


    // $ANTLR start "ruleMulDivModOpEnum"
    // InternalTryGrammar.g:7688:1: ruleMulDivModOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMulDivModOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7694:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalTryGrammar.g:7695:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalTryGrammar.g:7695:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt108=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt108=1;
                }
                break;
            case 196:
                {
                alt108=2;
                }
                break;
            case 197:
                {
                alt108=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalTryGrammar.g:7696:3: (enumLiteral_0= '*' )
                    {
                    // InternalTryGrammar.g:7696:3: (enumLiteral_0= '*' )
                    // InternalTryGrammar.g:7697:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7704:3: (enumLiteral_1= '/' )
                    {
                    // InternalTryGrammar.g:7704:3: (enumLiteral_1= '/' )
                    // InternalTryGrammar.g:7705:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,196,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMulDivModOpEnumAccess().getDIVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7712:3: (enumLiteral_2= '%' )
                    {
                    // InternalTryGrammar.g:7712:3: (enumLiteral_2= '%' )
                    // InternalTryGrammar.g:7713:4: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,197,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getMODEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMulDivModOpEnumAccess().getMODEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulDivModOpEnum"


    // $ANTLR start "ruleIncDecOpEnum"
    // InternalTryGrammar.g:7723:1: ruleIncDecOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncDecOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7729:2: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalTryGrammar.g:7730:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalTryGrammar.g:7730:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==62) ) {
                alt109=1;
            }
            else if ( (LA109_0==63) ) {
                alt109=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // InternalTryGrammar.g:7731:3: (enumLiteral_0= '++' )
                    {
                    // InternalTryGrammar.g:7731:3: (enumLiteral_0= '++' )
                    // InternalTryGrammar.g:7732:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7739:3: (enumLiteral_1= '--' )
                    {
                    // InternalTryGrammar.g:7739:3: (enumLiteral_1= '--' )
                    // InternalTryGrammar.g:7740:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIncDecOpEnumAccess().getDECEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getIncDecOpEnumAccess().getDECEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncDecOpEnum"


    // $ANTLR start "ruleBooleanLiteralEnum"
    // InternalTryGrammar.g:7750:1: ruleBooleanLiteralEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteralEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7756:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalTryGrammar.g:7757:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalTryGrammar.g:7757:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==198) ) {
                alt110=1;
            }
            else if ( (LA110_0==199) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalTryGrammar.g:7758:3: (enumLiteral_0= 'true' )
                    {
                    // InternalTryGrammar.g:7758:3: (enumLiteral_0= 'true' )
                    // InternalTryGrammar.g:7759:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,198,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7766:3: (enumLiteral_1= 'false' )
                    {
                    // InternalTryGrammar.g:7766:3: (enumLiteral_1= 'false' )
                    // InternalTryGrammar.g:7767:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,199,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanLiteralEnumAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBooleanLiteralEnumAccess().getFALSEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteralEnum"


    // $ANTLR start "ruleEtherSubDenominationEnum"
    // InternalTryGrammar.g:7777:1: ruleEtherSubDenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) ;
    public final Enumerator ruleEtherSubDenominationEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7783:2: ( ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) )
            // InternalTryGrammar.g:7784:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            {
            // InternalTryGrammar.g:7784:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            int alt111=4;
            switch ( input.LA(1) ) {
            case 200:
                {
                alt111=1;
                }
                break;
            case 201:
                {
                alt111=2;
                }
                break;
            case 202:
                {
                alt111=3;
                }
                break;
            case 203:
                {
                alt111=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalTryGrammar.g:7785:3: (enumLiteral_0= 'wei' )
                    {
                    // InternalTryGrammar.g:7785:3: (enumLiteral_0= 'wei' )
                    // InternalTryGrammar.g:7786:4: enumLiteral_0= 'wei'
                    {
                    enumLiteral_0=(Token)match(input,200,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getWEIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEtherSubDenominationEnumAccess().getWEIEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7793:3: (enumLiteral_1= 'szabo' )
                    {
                    // InternalTryGrammar.g:7793:3: (enumLiteral_1= 'szabo' )
                    // InternalTryGrammar.g:7794:4: enumLiteral_1= 'szabo'
                    {
                    enumLiteral_1=(Token)match(input,201,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getSZABOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEtherSubDenominationEnumAccess().getSZABOEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7801:3: (enumLiteral_2= 'finney' )
                    {
                    // InternalTryGrammar.g:7801:3: (enumLiteral_2= 'finney' )
                    // InternalTryGrammar.g:7802:4: enumLiteral_2= 'finney'
                    {
                    enumLiteral_2=(Token)match(input,202,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getFINNEYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEtherSubDenominationEnumAccess().getFINNEYEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:7809:3: (enumLiteral_3= 'ether' )
                    {
                    // InternalTryGrammar.g:7809:3: (enumLiteral_3= 'ether' )
                    // InternalTryGrammar.g:7810:4: enumLiteral_3= 'ether'
                    {
                    enumLiteral_3=(Token)match(input,203,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getETHEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getEtherSubDenominationEnumAccess().getETHEREnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEtherSubDenominationEnum"


    // $ANTLR start "ruleTimeSubdenominationEnum"
    // InternalTryGrammar.g:7820:1: ruleTimeSubdenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) ;
    public final Enumerator ruleTimeSubdenominationEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7826:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) )
            // InternalTryGrammar.g:7827:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            {
            // InternalTryGrammar.g:7827:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            int alt112=6;
            switch ( input.LA(1) ) {
            case 204:
                {
                alt112=1;
                }
                break;
            case 205:
                {
                alt112=2;
                }
                break;
            case 206:
                {
                alt112=3;
                }
                break;
            case 207:
                {
                alt112=4;
                }
                break;
            case 208:
                {
                alt112=5;
                }
                break;
            case 209:
                {
                alt112=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalTryGrammar.g:7828:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalTryGrammar.g:7828:3: (enumLiteral_0= 'seconds' )
                    // InternalTryGrammar.g:7829:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,204,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeSubdenominationEnumAccess().getSECONDSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7836:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalTryGrammar.g:7836:3: (enumLiteral_1= 'minutes' )
                    // InternalTryGrammar.g:7837:4: enumLiteral_1= 'minutes'
                    {
                    enumLiteral_1=(Token)match(input,205,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getMINUTESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeSubdenominationEnumAccess().getMINUTESEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7844:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalTryGrammar.g:7844:3: (enumLiteral_2= 'hours' )
                    // InternalTryGrammar.g:7845:4: enumLiteral_2= 'hours'
                    {
                    enumLiteral_2=(Token)match(input,206,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getHOURSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeSubdenominationEnumAccess().getHOURSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:7852:3: (enumLiteral_3= 'days' )
                    {
                    // InternalTryGrammar.g:7852:3: (enumLiteral_3= 'days' )
                    // InternalTryGrammar.g:7853:4: enumLiteral_3= 'days'
                    {
                    enumLiteral_3=(Token)match(input,207,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getDAYSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTimeSubdenominationEnumAccess().getDAYSEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryGrammar.g:7860:3: (enumLiteral_4= 'weeks' )
                    {
                    // InternalTryGrammar.g:7860:3: (enumLiteral_4= 'weeks' )
                    // InternalTryGrammar.g:7861:4: enumLiteral_4= 'weeks'
                    {
                    enumLiteral_4=(Token)match(input,208,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getWEEKSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTimeSubdenominationEnumAccess().getWEEKSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryGrammar.g:7868:3: (enumLiteral_5= 'years' )
                    {
                    // InternalTryGrammar.g:7868:3: (enumLiteral_5= 'years' )
                    // InternalTryGrammar.g:7869:4: enumLiteral_5= 'years'
                    {
                    enumLiteral_5=(Token)match(input,209,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getYEARSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getTimeSubdenominationEnumAccess().getYEARSEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeSubdenominationEnum"


    // $ANTLR start "ruleSpecialVariablesTypeEnum"
    // InternalTryGrammar.g:7879:1: ruleSpecialVariablesTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'msg' ) | (enumLiteral_1= 'block' ) | (enumLiteral_2= 'tx' ) ) ;
    public final Enumerator ruleSpecialVariablesTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7885:2: ( ( (enumLiteral_0= 'msg' ) | (enumLiteral_1= 'block' ) | (enumLiteral_2= 'tx' ) ) )
            // InternalTryGrammar.g:7886:2: ( (enumLiteral_0= 'msg' ) | (enumLiteral_1= 'block' ) | (enumLiteral_2= 'tx' ) )
            {
            // InternalTryGrammar.g:7886:2: ( (enumLiteral_0= 'msg' ) | (enumLiteral_1= 'block' ) | (enumLiteral_2= 'tx' ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 210:
                {
                alt113=1;
                }
                break;
            case 211:
                {
                alt113=2;
                }
                break;
            case 212:
                {
                alt113=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalTryGrammar.g:7887:3: (enumLiteral_0= 'msg' )
                    {
                    // InternalTryGrammar.g:7887:3: (enumLiteral_0= 'msg' )
                    // InternalTryGrammar.g:7888:4: enumLiteral_0= 'msg'
                    {
                    enumLiteral_0=(Token)match(input,210,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSpecialVariablesTypeEnumAccess().getMSGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSpecialVariablesTypeEnumAccess().getMSGEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7895:3: (enumLiteral_1= 'block' )
                    {
                    // InternalTryGrammar.g:7895:3: (enumLiteral_1= 'block' )
                    // InternalTryGrammar.g:7896:4: enumLiteral_1= 'block'
                    {
                    enumLiteral_1=(Token)match(input,211,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSpecialVariablesTypeEnumAccess().getBLOCKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSpecialVariablesTypeEnumAccess().getBLOCKEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7903:3: (enumLiteral_2= 'tx' )
                    {
                    // InternalTryGrammar.g:7903:3: (enumLiteral_2= 'tx' )
                    // InternalTryGrammar.g:7904:4: enumLiteral_2= 'tx'
                    {
                    enumLiteral_2=(Token)match(input,212,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSpecialVariablesTypeEnumAccess().getTXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getSpecialVariablesTypeEnumAccess().getTXEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialVariablesTypeEnum"


    // $ANTLR start "ruleSpecialExpressionTypeEnum"
    // InternalTryGrammar.g:7914:1: ruleSpecialExpressionTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) ;
    public final Enumerator ruleSpecialExpressionTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7920:2: ( ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) )
            // InternalTryGrammar.g:7921:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            {
            // InternalTryGrammar.g:7921:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==213) ) {
                alt114=1;
            }
            else if ( (LA114_0==214) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // InternalTryGrammar.g:7922:3: (enumLiteral_0= 'super' )
                    {
                    // InternalTryGrammar.g:7922:3: (enumLiteral_0= 'super' )
                    // InternalTryGrammar.g:7923:4: enumLiteral_0= 'super'
                    {
                    enumLiteral_0=(Token)match(input,213,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSpecialExpressionTypeEnumAccess().getSUPEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSpecialExpressionTypeEnumAccess().getSUPEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7930:3: (enumLiteral_1= 'this' )
                    {
                    // InternalTryGrammar.g:7930:3: (enumLiteral_1= 'this' )
                    // InternalTryGrammar.g:7931:4: enumLiteral_1= 'this'
                    {
                    enumLiteral_1=(Token)match(input,214,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSpecialExpressionTypeEnumAccess().getTHISEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSpecialExpressionTypeEnumAccess().getTHISEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialExpressionTypeEnum"

    // $ANTLR start synpred1_InternalTryGrammar
    public final void synpred1_InternalTryGrammar_fragment() throws RecognitionException {   
        // InternalTryGrammar.g:3917:5: ( 'else' )
        // InternalTryGrammar.g:3917:6: 'else'
        {
        match(input,43,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTryGrammar

    // $ANTLR start synpred2_InternalTryGrammar
    public final void synpred2_InternalTryGrammar_fragment() throws RecognitionException {   
        // InternalTryGrammar.g:4059:4: ( ';' )
        // InternalTryGrammar.g:4059:5: ';'
        {
        match(input,12,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTryGrammar

    // $ANTLR start synpred3_InternalTryGrammar
    public final void synpred3_InternalTryGrammar_fragment() throws RecognitionException {   
        // InternalTryGrammar.g:5208:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )
        // InternalTryGrammar.g:5208:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        {
        // InternalTryGrammar.g:5208:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        // InternalTryGrammar.g:5209:5: () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) )
        {
        // InternalTryGrammar.g:5209:5: ()
        // InternalTryGrammar.g:5210:5: 
        {
        }

        // InternalTryGrammar.g:5211:5: ( ( ruleAdditionOpEnum ) )
        // InternalTryGrammar.g:5212:6: ( ruleAdditionOpEnum )
        {
        // InternalTryGrammar.g:5212:6: ( ruleAdditionOpEnum )
        // InternalTryGrammar.g:5213:7: ruleAdditionOpEnum
        {
        pushFollow(FOLLOW_19);
        ruleAdditionOpEnum();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalTryGrammar.g:5216:5: ( ( ruleMulDivMod ) )
        // InternalTryGrammar.g:5217:6: ( ruleMulDivMod )
        {
        // InternalTryGrammar.g:5217:6: ( ruleMulDivMod )
        // InternalTryGrammar.g:5218:7: ruleMulDivMod
        {
        pushFollow(FOLLOW_2);
        ruleMulDivMod();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalTryGrammar

    // Delegated rules

    public final boolean synpred3_InternalTryGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalTryGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalTryGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTryGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalTryGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTryGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA44 dfa44 = new DFA44(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String dfa_1s = "\154\uffff";
    static final String dfa_2s = "\1\4\150\5\3\uffff";
    static final String dfa_3s = "\1\u00d6\150\u00ae\3\uffff";
    static final String dfa_4s = "\151\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\154\uffff}>";
    static final String[] dfa_6s = {
            "\3\153\17\uffff\1\153\11\uffff\1\151\3\uffff\1\152\24\uffff\10\153\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\35\uffff\2\153\12\uffff\5\153",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "\1\151\20\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\6\151",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2534:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2778:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000280802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000D132040020L,0xFFFFFFFFFFFFFFFEL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xFE00000100C00070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xFE00000100400070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000C011020L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001100040020L,0xFFFFFFFFFFFFFFFEL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000088000020L,0x0000000000000000L,0x00007E0000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFFFFFFFFEL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001100000020L,0xFFFFFFFFFFFFFFFEL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xFE00000900400070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xFE00000100C20070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xFE00000100420070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000088400020L,0x0000000000000000L,0x00007E0000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002400400002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000410020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000401020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000001100800020L,0xFFFFFFFFFFFFFFFEL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000088000022L,0x0000000000000000L,0x00007E0000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000100000020L,0xFFFFFFFFFFFFFFFEL,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xFE07F61100410070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xFE07F61100411070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xFE00000100401070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xFE07F61100C10070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xFE07F61100450070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00000000C8000022L,0x0000000000000000L,0x03FFFE0000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000100400070L,0xFFFFFFFFFFFFFFFFL,0x000001FFFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000002000000000L});

}