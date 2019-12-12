package org.unicam.tryIde.parser.antlr.internal;

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
import org.unicam.tryIde.services.TryIdeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTryIdeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEX", "RULE_DECIMAL", "RULE_BLOCK", "RULE_MSG", "RULE_TX", "RULE_NOW", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'*'", "'as'", "'from'", "'{'", "','", "'}'", "'contract'", "'is'", "'library'", "'('", "')'", "':'", "'function'", "'returns'", "'constant'", "'struct'", "'enum'", "'='", "'indexed'", "'mapping'", "'=>'", "'['", "']'", "'var'", "'.'", "'modifier'", "'event'", "'anonymous'", "'delete'", "'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'return'", "'throw'", "'_'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'**'", "'!'", "'~'", "'+'", "'-'", "'new'", "'++'", "'--'", "'int'", "'int16'", "'int24'", "'int32'", "'int40'", "'int48'", "'int56'", "'int64'", "'int72'", "'int80'", "'int88'", "'int96'", "'int104'", "'int112'", "'int120'", "'int128'", "'int136'", "'int144'", "'int152'", "'int160'", "'int168'", "'int178'", "'int184'", "'int192'", "'int200'", "'int208'", "'int216'", "'int224'", "'int232'", "'int240'", "'int248'", "'int256'", "'uint'", "'uint8'", "'uint16'", "'uint24'", "'uint32'", "'uint40'", "'uint48'", "'uint56'", "'uint64'", "'uint72'", "'uint80'", "'uint88'", "'uint96'", "'uint104'", "'uint112'", "'uint120'", "'uint128'", "'uint136'", "'uint144'", "'uint152'", "'uint160'", "'uint168'", "'uint178'", "'uint184'", "'uint192'", "'uint200'", "'uint208'", "'uint216'", "'uint224'", "'uint232'", "'uint240'", "'uint248'", "'uint256'", "'byte'", "'bytes'", "'bytes1'", "'bytes2'", "'bytes3'", "'bytes4'", "'bytes5'", "'bytes6'", "'bytes7'", "'bytes8'", "'bytes9'", "'bytes10'", "'bytes11'", "'bytes12'", "'bytes13'", "'bytes14'", "'bytes15'", "'bytes16'", "'bytes17'", "'bytes18'", "'bytes19'", "'bytes20'", "'bytes21'", "'bytes22'", "'bytes23'", "'bytes24'", "'bytes25'", "'bytes26'", "'bytes27'", "'bytes28'", "'bytes29'", "'bytes30'", "'bytes31'", "'bytes32'", "'string'", "'address'", "'bool'", "'real'", "'ureal'", "'memory'", "'storage'", "'calldata'", "'public'", "'internal'", "'private'", "'external'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'>>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'in'", "'<<'", "'>>'", "'>>>'", "'/'", "'%'", "'true'", "'false'", "'wei'", "'szabo'", "'finney'", "'ether'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'years'", "'super'", "'this'"
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
    public static final int RULE_BLOCK=9;
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
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__217=217;
    public static final int T__214=214;
    public static final int T__213=213;
    public static final int T__216=216;
    public static final int T__215=215;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int RULE_DECIMAL=8;
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
    public static final int RULE_NOW=12;
    public static final int RULE_SL_COMMENT=14;
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
    public static final int RULE_HEX=7;
    public static final int RULE_ML_COMMENT=13;
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
    public static final int RULE_MSG=10;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int RULE_TX=11;
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
    public static final int RULE_WS=15;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalTryIdeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTryIdeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTryIdeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTryIde.g"; }



     	private TryIdeGrammarAccess grammarAccess;

        public InternalTryIdeParser(TokenStream input, TryIdeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Solidity";
       	}

       	@Override
       	protected TryIdeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSolidity"
    // InternalTryIde.g:65:1: entryRuleSolidity returns [EObject current=null] : iv_ruleSolidity= ruleSolidity EOF ;
    public final EObject entryRuleSolidity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolidity = null;


        try {
            // InternalTryIde.g:65:49: (iv_ruleSolidity= ruleSolidity EOF )
            // InternalTryIde.g:66:2: iv_ruleSolidity= ruleSolidity EOF
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
    // InternalTryIde.g:72:1: ruleSolidity returns [EObject current=null] : ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )* ;
    public final EObject ruleSolidity() throws RecognitionException {
        EObject current = null;

        EObject lv_importDirective_0_0 = null;

        EObject lv_contract_1_0 = null;

        EObject lv_library_2_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:78:2: ( ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )* )
            // InternalTryIde.g:79:2: ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )*
            {
            // InternalTryIde.g:79:2: ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    alt1=1;
                    }
                    break;
                case 25:
                    {
                    alt1=2;
                    }
                    break;
                case 27:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalTryIde.g:80:3: ( (lv_importDirective_0_0= ruleImportDirective ) )
            	    {
            	    // InternalTryIde.g:80:3: ( (lv_importDirective_0_0= ruleImportDirective ) )
            	    // InternalTryIde.g:81:4: (lv_importDirective_0_0= ruleImportDirective )
            	    {
            	    // InternalTryIde.g:81:4: (lv_importDirective_0_0= ruleImportDirective )
            	    // InternalTryIde.g:82:5: lv_importDirective_0_0= ruleImportDirective
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
            	      						"org.unicam.tryIde.TryIde.ImportDirective");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTryIde.g:100:3: ( (lv_contract_1_0= ruleContract ) )
            	    {
            	    // InternalTryIde.g:100:3: ( (lv_contract_1_0= ruleContract ) )
            	    // InternalTryIde.g:101:4: (lv_contract_1_0= ruleContract )
            	    {
            	    // InternalTryIde.g:101:4: (lv_contract_1_0= ruleContract )
            	    // InternalTryIde.g:102:5: lv_contract_1_0= ruleContract
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
            	      						"org.unicam.tryIde.TryIde.Contract");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTryIde.g:120:3: ( (lv_library_2_0= ruleLibrary ) )
            	    {
            	    // InternalTryIde.g:120:3: ( (lv_library_2_0= ruleLibrary ) )
            	    // InternalTryIde.g:121:4: (lv_library_2_0= ruleLibrary )
            	    {
            	    // InternalTryIde.g:121:4: (lv_library_2_0= ruleLibrary )
            	    // InternalTryIde.g:122:5: lv_library_2_0= ruleLibrary
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
            	      						"org.unicam.tryIde.TryIde.Library");
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
    // InternalTryIde.g:143:1: entryRuleImportDirective returns [EObject current=null] : iv_ruleImportDirective= ruleImportDirective EOF ;
    public final EObject entryRuleImportDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDirective = null;


        try {
            // InternalTryIde.g:143:56: (iv_ruleImportDirective= ruleImportDirective EOF )
            // InternalTryIde.g:144:2: iv_ruleImportDirective= ruleImportDirective EOF
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
    // InternalTryIde.g:150:1: ruleImportDirective returns [EObject current=null] : ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) ) ;
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
            // InternalTryIde.g:156:2: ( ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) ) )
            // InternalTryIde.g:157:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) )
            {
            // InternalTryIde.g:157:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt3=1;
                    }
                    break;
                case 19:
                    {
                    alt3=2;
                    }
                    break;
                case 22:
                    {
                    alt3=3;
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
                    // InternalTryIde.g:158:3: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
                    {
                    // InternalTryIde.g:158:3: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
                    // InternalTryIde.g:159:4: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getImportDirectiveAccess().getImportKeyword_0_0());
                      			
                    }
                    // InternalTryIde.g:163:4: ( (lv_importURI_1_0= RULE_STRING ) )
                    // InternalTryIde.g:164:5: (lv_importURI_1_0= RULE_STRING )
                    {
                    // InternalTryIde.g:164:5: (lv_importURI_1_0= RULE_STRING )
                    // InternalTryIde.g:165:6: lv_importURI_1_0= RULE_STRING
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
                      							"org.unicam.tryIde.TryIde.STRING");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getImportDirectiveAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:187:3: (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' )
                    {
                    // InternalTryIde.g:187:3: (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' )
                    // InternalTryIde.g:188:4: otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getImportDirectiveAccess().getImportKeyword_1_0());
                      			
                    }
                    otherlv_4=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getImportDirectiveAccess().getAsteriskKeyword_1_1());
                      			
                    }
                    otherlv_5=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getImportDirectiveAccess().getAsKeyword_1_2());
                      			
                    }
                    // InternalTryIde.g:200:4: ( (lv_unitAlias_6_0= RULE_ID ) )
                    // InternalTryIde.g:201:5: (lv_unitAlias_6_0= RULE_ID )
                    {
                    // InternalTryIde.g:201:5: (lv_unitAlias_6_0= RULE_ID )
                    // InternalTryIde.g:202:6: lv_unitAlias_6_0= RULE_ID
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
                      							"org.unicam.tryIde.TryIde.ID");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getImportDirectiveAccess().getFromKeyword_1_4());
                      			
                    }
                    // InternalTryIde.g:222:4: ( (lv_importURI_8_0= RULE_STRING ) )
                    // InternalTryIde.g:223:5: (lv_importURI_8_0= RULE_STRING )
                    {
                    // InternalTryIde.g:223:5: (lv_importURI_8_0= RULE_STRING )
                    // InternalTryIde.g:224:6: lv_importURI_8_0= RULE_STRING
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
                      							"org.unicam.tryIde.TryIde.STRING");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getImportDirectiveAccess().getSemicolonKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryIde.g:246:3: (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' )
                    {
                    // InternalTryIde.g:246:3: (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' )
                    // InternalTryIde.g:247:4: otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getImportDirectiveAccess().getImportKeyword_2_0());
                      			
                    }
                    otherlv_11=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getImportDirectiveAccess().getLeftCurlyBracketKeyword_2_1());
                      			
                    }
                    // InternalTryIde.g:255:4: ( (lv_symbolAliases_12_0= ruleSymbolAlias ) )
                    // InternalTryIde.g:256:5: (lv_symbolAliases_12_0= ruleSymbolAlias )
                    {
                    // InternalTryIde.g:256:5: (lv_symbolAliases_12_0= ruleSymbolAlias )
                    // InternalTryIde.g:257:6: lv_symbolAliases_12_0= ruleSymbolAlias
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
                      							"org.unicam.tryIde.TryIde.SymbolAlias");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryIde.g:274:4: (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==23) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalTryIde.g:275:5: otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) )
                            {
                            otherlv_13=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getImportDirectiveAccess().getCommaKeyword_2_3_0());
                              				
                            }
                            // InternalTryIde.g:279:5: ( (lv_symbolAliases_14_0= ruleSymbolAlias ) )
                            // InternalTryIde.g:280:6: (lv_symbolAliases_14_0= ruleSymbolAlias )
                            {
                            // InternalTryIde.g:280:6: (lv_symbolAliases_14_0= ruleSymbolAlias )
                            // InternalTryIde.g:281:7: lv_symbolAliases_14_0= ruleSymbolAlias
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
                              								"org.unicam.tryIde.TryIde.SymbolAlias");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getImportDirectiveAccess().getRightCurlyBracketKeyword_2_4());
                      			
                    }
                    otherlv_16=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getImportDirectiveAccess().getFromKeyword_2_5());
                      			
                    }
                    // InternalTryIde.g:307:4: ( (lv_importURI_17_0= RULE_STRING ) )
                    // InternalTryIde.g:308:5: (lv_importURI_17_0= RULE_STRING )
                    {
                    // InternalTryIde.g:308:5: (lv_importURI_17_0= RULE_STRING )
                    // InternalTryIde.g:309:6: lv_importURI_17_0= RULE_STRING
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
                      							"org.unicam.tryIde.TryIde.STRING");
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:334:1: entryRuleSymbolAlias returns [EObject current=null] : iv_ruleSymbolAlias= ruleSymbolAlias EOF ;
    public final EObject entryRuleSymbolAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolAlias = null;


        try {
            // InternalTryIde.g:334:52: (iv_ruleSymbolAlias= ruleSymbolAlias EOF )
            // InternalTryIde.g:335:2: iv_ruleSymbolAlias= ruleSymbolAlias EOF
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
    // InternalTryIde.g:341:1: ruleSymbolAlias returns [EObject current=null] : ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSymbolAlias() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:347:2: ( ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) ) )
            // InternalTryIde.g:348:2: ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )
            {
            // InternalTryIde.g:348:2: ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )
            // InternalTryIde.g:349:3: ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
            {
            // InternalTryIde.g:349:3: ( (lv_symbol_0_0= RULE_ID ) )
            // InternalTryIde.g:350:4: (lv_symbol_0_0= RULE_ID )
            {
            // InternalTryIde.g:350:4: (lv_symbol_0_0= RULE_ID )
            // InternalTryIde.g:351:5: lv_symbol_0_0= RULE_ID
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
              						"org.unicam.tryIde.TryIde.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSymbolAliasAccess().getAsKeyword_1());
              		
            }
            // InternalTryIde.g:371:3: ( (lv_alias_2_0= RULE_ID ) )
            // InternalTryIde.g:372:4: (lv_alias_2_0= RULE_ID )
            {
            // InternalTryIde.g:372:4: (lv_alias_2_0= RULE_ID )
            // InternalTryIde.g:373:5: lv_alias_2_0= RULE_ID
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
              						"org.unicam.tryIde.TryIde.ID");
              				
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
    // InternalTryIde.g:393:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalTryIde.g:393:49: (iv_ruleContract= ruleContract EOF )
            // InternalTryIde.g:394:2: iv_ruleContract= ruleContract EOF
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
    // InternalTryIde.g:400:1: ruleContract returns [EObject current=null] : (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) ;
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
            // InternalTryIde.g:406:2: ( (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) )
            // InternalTryIde.g:407:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            {
            // InternalTryIde.g:407:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            // InternalTryIde.g:408:3: otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
              		
            }
            // InternalTryIde.g:412:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryIde.g:413:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryIde.g:413:4: (lv_name_1_0= RULE_ID )
            // InternalTryIde.g:414:5: lv_name_1_0= RULE_ID
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
              						"org.unicam.tryIde.TryIde.ID");
              				
            }

            }


            }

            // InternalTryIde.g:430:3: (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTryIde.g:431:4: otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContractAccess().getIsKeyword_2_0());
                      			
                    }
                    // InternalTryIde.g:435:4: ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) )
                    // InternalTryIde.g:436:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    {
                    // InternalTryIde.g:436:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    // InternalTryIde.g:437:6: lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier
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
                      							"org.unicam.tryIde.TryIde.InheritanceSpecifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryIde.g:454:4: (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTryIde.g:455:5: otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getContractAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalTryIde.g:459:5: ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    // InternalTryIde.g:460:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    {
                    	    // InternalTryIde.g:460:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    // InternalTryIde.g:461:7: lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier
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
                    	      								"org.unicam.tryIde.TryIde.InheritanceSpecifier");
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

            // InternalTryIde.g:480:3: ( (lv_body_6_0= ruleDefinitionBody ) )
            // InternalTryIde.g:481:4: (lv_body_6_0= ruleDefinitionBody )
            {
            // InternalTryIde.g:481:4: (lv_body_6_0= ruleDefinitionBody )
            // InternalTryIde.g:482:5: lv_body_6_0= ruleDefinitionBody
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
              						"org.unicam.tryIde.TryIde.DefinitionBody");
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
    // InternalTryIde.g:503:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalTryIde.g:503:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalTryIde.g:504:2: iv_ruleLibrary= ruleLibrary EOF
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
    // InternalTryIde.g:510:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) ;
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
            // InternalTryIde.g:516:2: ( (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) )
            // InternalTryIde.g:517:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            {
            // InternalTryIde.g:517:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            // InternalTryIde.g:518:3: otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
              		
            }
            // InternalTryIde.g:522:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryIde.g:523:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryIde.g:523:4: (lv_name_1_0= RULE_ID )
            // InternalTryIde.g:524:5: lv_name_1_0= RULE_ID
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
              						"org.unicam.tryIde.TryIde.ID");
              				
            }

            }


            }

            // InternalTryIde.g:540:3: (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTryIde.g:541:4: otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getIsKeyword_2_0());
                      			
                    }
                    // InternalTryIde.g:545:4: ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) )
                    // InternalTryIde.g:546:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    {
                    // InternalTryIde.g:546:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    // InternalTryIde.g:547:6: lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier
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
                      							"org.unicam.tryIde.TryIde.InheritanceSpecifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryIde.g:564:4: (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTryIde.g:565:5: otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalTryIde.g:569:5: ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    // InternalTryIde.g:570:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    {
                    	    // InternalTryIde.g:570:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    // InternalTryIde.g:571:7: lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier
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
                    	      								"org.unicam.tryIde.TryIde.InheritanceSpecifier");
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

            // InternalTryIde.g:590:3: ( (lv_body_6_0= ruleDefinitionBody ) )
            // InternalTryIde.g:591:4: (lv_body_6_0= ruleDefinitionBody )
            {
            // InternalTryIde.g:591:4: (lv_body_6_0= ruleDefinitionBody )
            // InternalTryIde.g:592:5: lv_body_6_0= ruleDefinitionBody
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
              						"org.unicam.tryIde.TryIde.DefinitionBody");
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
    // InternalTryIde.g:613:1: entryRuleDefinitionBody returns [EObject current=null] : iv_ruleDefinitionBody= ruleDefinitionBody EOF ;
    public final EObject entryRuleDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionBody = null;


        try {
            // InternalTryIde.g:613:55: (iv_ruleDefinitionBody= ruleDefinitionBody EOF )
            // InternalTryIde.g:614:2: iv_ruleDefinitionBody= ruleDefinitionBody EOF
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
    // InternalTryIde.g:620:1: ruleDefinitionBody returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) ;
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
            // InternalTryIde.g:626:2: ( ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) )
            // InternalTryIde.g:627:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            {
            // InternalTryIde.g:627:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            // InternalTryIde.g:628:3: () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}'
            {
            // InternalTryIde.g:628:3: ()
            // InternalTryIde.g:629:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDefinitionBodyAccess().getDefinitionBodyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefinitionBodyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalTryIde.g:639:3: ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )*
            loop8:
            do {
                int alt8=7;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt8=1;
                    }
                    break;
                case 34:
                    {
                    alt8=2;
                    }
                    break;
                case 35:
                case 177:
                case 178:
                case 179:
                case 180:
                    {
                    alt8=3;
                    }
                    break;
                case RULE_ID:
                case 38:
                case 42:
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
                case 169:
                case 170:
                case 171:
                case 172:
                case 173:
                    {
                    alt8=4;
                    }
                    break;
                case 44:
                    {
                    alt8=5;
                    }
                    break;
                case 45:
                    {
                    alt8=6;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalTryIde.g:640:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    {
            	    // InternalTryIde.g:640:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    // InternalTryIde.g:641:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    {
            	    // InternalTryIde.g:641:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    // InternalTryIde.g:642:6: lv_functions_2_0= ruleFunctionDefinition
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
            	      							"org.unicam.tryIde.TryIde.FunctionDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTryIde.g:660:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    {
            	    // InternalTryIde.g:660:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    // InternalTryIde.g:661:5: (lv_structs_3_0= ruleStructDefinition )
            	    {
            	    // InternalTryIde.g:661:5: (lv_structs_3_0= ruleStructDefinition )
            	    // InternalTryIde.g:662:6: lv_structs_3_0= ruleStructDefinition
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
            	      							"org.unicam.tryIde.TryIde.StructDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTryIde.g:680:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    {
            	    // InternalTryIde.g:680:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    // InternalTryIde.g:681:5: (lv_enums_4_0= ruleEnumDefinition )
            	    {
            	    // InternalTryIde.g:681:5: (lv_enums_4_0= ruleEnumDefinition )
            	    // InternalTryIde.g:682:6: lv_enums_4_0= ruleEnumDefinition
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
            	      							"org.unicam.tryIde.TryIde.EnumDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTryIde.g:700:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    {
            	    // InternalTryIde.g:700:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    // InternalTryIde.g:701:5: ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';'
            	    {
            	    // InternalTryIde.g:701:5: ( (lv_variables_5_0= ruleVariableDeclaration ) )
            	    // InternalTryIde.g:702:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    {
            	    // InternalTryIde.g:702:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    // InternalTryIde.g:703:7: lv_variables_5_0= ruleVariableDeclaration
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
            	      								"org.unicam.tryIde.TryIde.VariableDeclaration");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getDefinitionBodyAccess().getSemicolonKeyword_2_3_1());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTryIde.g:726:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    {
            	    // InternalTryIde.g:726:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    // InternalTryIde.g:727:5: (lv_modifiers_7_0= ruleModifier )
            	    {
            	    // InternalTryIde.g:727:5: (lv_modifiers_7_0= ruleModifier )
            	    // InternalTryIde.g:728:6: lv_modifiers_7_0= ruleModifier
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
            	      							"org.unicam.tryIde.TryIde.Modifier");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalTryIde.g:746:4: ( (lv_events_8_0= ruleEvent ) )
            	    {
            	    // InternalTryIde.g:746:4: ( (lv_events_8_0= ruleEvent ) )
            	    // InternalTryIde.g:747:5: (lv_events_8_0= ruleEvent )
            	    {
            	    // InternalTryIde.g:747:5: (lv_events_8_0= ruleEvent )
            	    // InternalTryIde.g:748:6: lv_events_8_0= ruleEvent
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
            	      							"org.unicam.tryIde.TryIde.Event");
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

            otherlv_9=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:774:1: entryRuleInheritanceSpecifier returns [EObject current=null] : iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF ;
    public final EObject entryRuleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceSpecifier = null;


        try {
            // InternalTryIde.g:774:61: (iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF )
            // InternalTryIde.g:775:2: iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF
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
    // InternalTryIde.g:781:1: ruleInheritanceSpecifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:787:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalTryIde.g:788:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalTryIde.g:788:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalTryIde.g:789:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalTryIde.g:789:3: ( (otherlv_0= RULE_ID ) )
            // InternalTryIde.g:790:4: (otherlv_0= RULE_ID )
            {
            // InternalTryIde.g:790:4: (otherlv_0= RULE_ID )
            // InternalTryIde.g:791:5: otherlv_0= RULE_ID
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

            // InternalTryIde.g:802:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTryIde.g:803:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalTryIde.g:803:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalTryIde.g:804:5: lv_args_1_0= ruleFunctionCallListArguments
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
                      						"org.unicam.tryIde.TryIde.FunctionCallListArguments");
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
    // InternalTryIde.g:825:1: entryRuleFunctionCallListArguments returns [EObject current=null] : iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF ;
    public final EObject entryRuleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallListArguments = null;


        try {
            // InternalTryIde.g:825:66: (iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF )
            // InternalTryIde.g:826:2: iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF
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
    // InternalTryIde.g:832:1: ruleFunctionCallListArguments returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:838:2: ( (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalTryIde.g:839:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalTryIde.g:839:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalTryIde.g:840:3: otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallListArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryIde.g:844:3: ()
            // InternalTryIde.g:845:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallListArgumentsAccess().getFunctionCallListArgumentsAction_1(),
              					current);
              			
            }

            }

            // InternalTryIde.g:851:3: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_NOW)||LA11_0==28||(LA11_0>=63 && LA11_0<=173)||(LA11_0>=204 && LA11_0<=205)||(LA11_0>=216 && LA11_0<=217)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTryIde.g:852:4: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // InternalTryIde.g:852:4: ( (lv_arguments_2_0= ruleExpression ) )
                    // InternalTryIde.g:853:5: (lv_arguments_2_0= ruleExpression )
                    {
                    // InternalTryIde.g:853:5: (lv_arguments_2_0= ruleExpression )
                    // InternalTryIde.g:854:6: lv_arguments_2_0= ruleExpression
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
                      							"org.unicam.tryIde.TryIde.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryIde.g:871:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==23) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTryIde.g:872:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallListArgumentsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalTryIde.g:876:5: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // InternalTryIde.g:877:6: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // InternalTryIde.g:877:6: (lv_arguments_4_0= ruleExpression )
                    	    // InternalTryIde.g:878:7: lv_arguments_4_0= ruleExpression
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
                    	      								"org.unicam.tryIde.TryIde.Expression");
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

            otherlv_5=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:905:1: entryRuleFunctionCallArguments returns [EObject current=null] : iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF ;
    public final EObject entryRuleFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArguments = null;


        try {
            // InternalTryIde.g:905:62: (iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF )
            // InternalTryIde.g:906:2: iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF
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
    // InternalTryIde.g:912:1: ruleFunctionCallArguments returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) ;
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
            // InternalTryIde.g:918:2: ( ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) )
            // InternalTryIde.g:919:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            {
            // InternalTryIde.g:919:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==22) ) {
                    alt14=1;
                }
                else if ( ((LA14_1>=RULE_STRING && LA14_1<=RULE_NOW)||(LA14_1>=28 && LA14_1<=29)||(LA14_1>=63 && LA14_1<=173)||(LA14_1>=204 && LA14_1<=205)||(LA14_1>=216 && LA14_1<=217)) ) {
                    alt14=2;
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
                    // InternalTryIde.g:920:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    {
                    // InternalTryIde.g:920:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    // InternalTryIde.g:921:4: otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunctionCallArgumentsAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgumentsAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalTryIde.g:929:4: ()
                    // InternalTryIde.g:930:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFunctionCallArgumentsAccess().getFunctionCallArgumentsAction_0_2(),
                      						current);
                      				
                    }

                    }

                    // InternalTryIde.g:936:4: ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalTryIde.g:937:5: ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            {
                            // InternalTryIde.g:937:5: ( (lv_args_3_0= ruleFunctionCallArg ) )
                            // InternalTryIde.g:938:6: (lv_args_3_0= ruleFunctionCallArg )
                            {
                            // InternalTryIde.g:938:6: (lv_args_3_0= ruleFunctionCallArg )
                            // InternalTryIde.g:939:7: lv_args_3_0= ruleFunctionCallArg
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
                              								"org.unicam.tryIde.TryIde.FunctionCallArg");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalTryIde.g:956:5: (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==23) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalTryIde.g:957:6: otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    {
                            	    otherlv_4=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallArgumentsAccess().getCommaKeyword_0_3_1_0());
                            	      					
                            	    }
                            	    // InternalTryIde.g:961:6: ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    // InternalTryIde.g:962:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    {
                            	    // InternalTryIde.g:962:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    // InternalTryIde.g:963:8: lv_args_5_0= ruleFunctionCallArg
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
                            	      									"org.unicam.tryIde.TryIde.FunctionCallArg");
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

                    otherlv_6=(Token)match(input,24,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFunctionCallArgumentsAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }
                    otherlv_7=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFunctionCallArgumentsAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:992:3: this_FunctionCallListArguments_8= ruleFunctionCallListArguments
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
    // InternalTryIde.g:1004:1: entryRuleFunctionCallArg returns [EObject current=null] : iv_ruleFunctionCallArg= ruleFunctionCallArg EOF ;
    public final EObject entryRuleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArg = null;


        try {
            // InternalTryIde.g:1004:56: (iv_ruleFunctionCallArg= ruleFunctionCallArg EOF )
            // InternalTryIde.g:1005:2: iv_ruleFunctionCallArg= ruleFunctionCallArg EOF
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
    // InternalTryIde.g:1011:1: ruleFunctionCallArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:1017:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalTryIde.g:1018:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalTryIde.g:1018:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalTryIde.g:1019:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalTryIde.g:1019:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTryIde.g:1020:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTryIde.g:1020:4: (lv_name_0_0= RULE_ID )
            // InternalTryIde.g:1021:5: lv_name_0_0= RULE_ID
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
              						"org.unicam.tryIde.TryIde.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgAccess().getColonKeyword_1());
              		
            }
            // InternalTryIde.g:1041:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalTryIde.g:1042:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalTryIde.g:1042:4: (lv_expr_2_0= ruleExpression )
            // InternalTryIde.g:1043:5: lv_expr_2_0= ruleExpression
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
              						"org.unicam.tryIde.TryIde.Expression");
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
    // InternalTryIde.g:1064:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // InternalTryIde.g:1064:59: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // InternalTryIde.g:1065:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
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
    // InternalTryIde.g:1071:1: ruleFunctionDefinition returns [EObject current=null] : (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_blocks_7_0= ruleBlocks ) ) | otherlv_8= ';' ) ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_optionalElements_4_0 = null;

        EObject lv_returnParameters_6_0 = null;

        EObject lv_blocks_7_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:1077:2: ( (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_blocks_7_0= ruleBlocks ) ) | otherlv_8= ';' ) ) )
            // InternalTryIde.g:1078:2: (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_blocks_7_0= ruleBlocks ) ) | otherlv_8= ';' ) )
            {
            // InternalTryIde.g:1078:2: (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_blocks_7_0= ruleBlocks ) ) | otherlv_8= ';' ) )
            // InternalTryIde.g:1079:3: otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_blocks_7_0= ruleBlocks ) ) | otherlv_8= ';' )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionDefinitionAccess().getFunctionKeyword_0());
              		
            }
            // InternalTryIde.g:1083:3: ()
            // InternalTryIde.g:1084:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_1(),
              					current);
              			
            }

            }

            // InternalTryIde.g:1090:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTryIde.g:1091:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalTryIde.g:1091:4: (lv_name_2_0= RULE_ID )
                    // InternalTryIde.g:1092:5: lv_name_2_0= RULE_ID
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
                      						"org.unicam.tryIde.TryIde.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryIde.g:1108:3: ( (lv_parameters_3_0= ruleParameterList ) )
            // InternalTryIde.g:1109:4: (lv_parameters_3_0= ruleParameterList )
            {
            // InternalTryIde.g:1109:4: (lv_parameters_3_0= ruleParameterList )
            // InternalTryIde.g:1110:5: lv_parameters_3_0= ruleParameterList
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
              						"org.unicam.tryIde.TryIde.ParameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:1127:3: ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==33||(LA16_0>=177 && LA16_0<=180)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTryIde.g:1128:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    {
            	    // InternalTryIde.g:1128:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    // InternalTryIde.g:1129:5: lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement
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
            	      						"org.unicam.tryIde.TryIde.FunctionDefinitionOptionalElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalTryIde.g:1146:3: (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTryIde.g:1147:4: otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getReturnsKeyword_5_0());
                      			
                    }
                    // InternalTryIde.g:1151:4: ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    // InternalTryIde.g:1152:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    {
                    // InternalTryIde.g:1152:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    // InternalTryIde.g:1153:6: lv_returnParameters_6_0= ruleReturnsParameterList
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
                      							"org.unicam.tryIde.TryIde.ReturnsParameterList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTryIde.g:1171:3: ( ( (lv_blocks_7_0= ruleBlocks ) ) | otherlv_8= ';' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            else if ( (LA18_0==18) ) {
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
                    // InternalTryIde.g:1172:4: ( (lv_blocks_7_0= ruleBlocks ) )
                    {
                    // InternalTryIde.g:1172:4: ( (lv_blocks_7_0= ruleBlocks ) )
                    // InternalTryIde.g:1173:5: (lv_blocks_7_0= ruleBlocks )
                    {
                    // InternalTryIde.g:1173:5: (lv_blocks_7_0= ruleBlocks )
                    // InternalTryIde.g:1174:6: lv_blocks_7_0= ruleBlocks
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBlocksBlocksParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_blocks_7_0=ruleBlocks();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"blocks",
                      							lv_blocks_7_0,
                      							"org.unicam.tryIde.TryIde.Blocks");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:1192:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:1201:1: entryRuleFunctionDefinitionOptionalElement returns [EObject current=null] : iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF ;
    public final EObject entryRuleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOptionalElement = null;


        try {
            // InternalTryIde.g:1201:74: (iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF )
            // InternalTryIde.g:1202:2: iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF
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
    // InternalTryIde.g:1208:1: ruleFunctionDefinitionOptionalElement returns [EObject current=null] : (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) ;
    public final EObject ruleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_ModifierInvocation_1 = null;

        EObject this_VisibilitySpecifier_2 = null;



        	enterRule();

        try {
            // InternalTryIde.g:1214:2: ( (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) )
            // InternalTryIde.g:1215:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            {
            // InternalTryIde.g:1215:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
                {
                alt19=2;
                }
                break;
            case 177:
            case 178:
            case 179:
            case 180:
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
                    // InternalTryIde.g:1216:3: this_Const_0= ruleConst
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
                    // InternalTryIde.g:1225:3: this_ModifierInvocation_1= ruleModifierInvocation
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
                    // InternalTryIde.g:1234:3: this_VisibilitySpecifier_2= ruleVisibilitySpecifier
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
    // InternalTryIde.g:1246:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalTryIde.g:1246:46: (iv_ruleConst= ruleConst EOF )
            // InternalTryIde.g:1247:2: iv_ruleConst= ruleConst EOF
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
    // InternalTryIde.g:1253:1: ruleConst returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:1259:2: ( (otherlv_0= 'constant' () ) )
            // InternalTryIde.g:1260:2: (otherlv_0= 'constant' () )
            {
            // InternalTryIde.g:1260:2: (otherlv_0= 'constant' () )
            // InternalTryIde.g:1261:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstAccess().getConstantKeyword_0());
              		
            }
            // InternalTryIde.g:1265:3: ()
            // InternalTryIde.g:1266:4: 
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
    // InternalTryIde.g:1276:1: entryRuleVisibilitySpecifier returns [EObject current=null] : iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF ;
    public final EObject entryRuleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilitySpecifier = null;


        try {
            // InternalTryIde.g:1276:60: (iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF )
            // InternalTryIde.g:1277:2: iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF
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
    // InternalTryIde.g:1283:1: ruleVisibilitySpecifier returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ;
    public final EObject ruleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:1289:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) )
            // InternalTryIde.g:1290:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            {
            // InternalTryIde.g:1290:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            // InternalTryIde.g:1291:3: (lv_visibility_0_0= ruleVisibilityEnum )
            {
            // InternalTryIde.g:1291:3: (lv_visibility_0_0= ruleVisibilityEnum )
            // InternalTryIde.g:1292:4: lv_visibility_0_0= ruleVisibilityEnum
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
              					"org.unicam.tryIde.TryIde.VisibilityEnum");
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
    // InternalTryIde.g:1312:1: entryRuleStructDefinition returns [EObject current=null] : iv_ruleStructDefinition= ruleStructDefinition EOF ;
    public final EObject entryRuleStructDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDefinition = null;


        try {
            // InternalTryIde.g:1312:57: (iv_ruleStructDefinition= ruleStructDefinition EOF )
            // InternalTryIde.g:1313:2: iv_ruleStructDefinition= ruleStructDefinition EOF
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
    // InternalTryIde.g:1319:1: ruleStructDefinition returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
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
            // InternalTryIde.g:1325:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // InternalTryIde.g:1326:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // InternalTryIde.g:1326:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // InternalTryIde.g:1327:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStructDefinitionAccess().getStructKeyword_0());
              		
            }
            // InternalTryIde.g:1331:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryIde.g:1332:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryIde.g:1332:4: (lv_name_1_0= RULE_ID )
            // InternalTryIde.g:1333:5: lv_name_1_0= RULE_ID
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
              						"org.unicam.tryIde.TryIde.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStructDefinitionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalTryIde.g:1353:3: ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==38||LA20_0==42||(LA20_0>=70 && LA20_0<=173)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTryIde.g:1354:4: ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';'
            	    {
            	    // InternalTryIde.g:1354:4: ( (lv_members_3_0= ruleVariableDeclaration ) )
            	    // InternalTryIde.g:1355:5: (lv_members_3_0= ruleVariableDeclaration )
            	    {
            	    // InternalTryIde.g:1355:5: (lv_members_3_0= ruleVariableDeclaration )
            	    // InternalTryIde.g:1356:6: lv_members_3_0= ruleVariableDeclaration
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
            	      							"org.unicam.tryIde.TryIde.VariableDeclaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,18,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getStructDefinitionAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:1386:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // InternalTryIde.g:1386:55: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // InternalTryIde.g:1387:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
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
    // InternalTryIde.g:1393:1: ruleEnumDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilitySpecifier ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_visibility_0_0 = null;

        EObject lv_members_4_0 = null;

        EObject lv_members_6_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:1399:2: ( ( ( (lv_visibility_0_0= ruleVisibilitySpecifier ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* otherlv_7= '}' ) )
            // InternalTryIde.g:1400:2: ( ( (lv_visibility_0_0= ruleVisibilitySpecifier ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* otherlv_7= '}' )
            {
            // InternalTryIde.g:1400:2: ( ( (lv_visibility_0_0= ruleVisibilitySpecifier ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* otherlv_7= '}' )
            // InternalTryIde.g:1401:3: ( (lv_visibility_0_0= ruleVisibilitySpecifier ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* otherlv_7= '}'
            {
            // InternalTryIde.g:1401:3: ( (lv_visibility_0_0= ruleVisibilitySpecifier ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=177 && LA21_0<=180)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTryIde.g:1402:4: (lv_visibility_0_0= ruleVisibilitySpecifier )
                    {
                    // InternalTryIde.g:1402:4: (lv_visibility_0_0= ruleVisibilitySpecifier )
                    // InternalTryIde.g:1403:5: lv_visibility_0_0= ruleVisibilitySpecifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEnumDefinitionAccess().getVisibilityVisibilitySpecifierParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_visibility_0_0=ruleVisibilitySpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEnumDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"visibility",
                      						lv_visibility_0_0,
                      						"org.unicam.tryIde.TryIde.VisibilitySpecifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,35,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumDefinitionAccess().getEnumKeyword_1());
              		
            }
            // InternalTryIde.g:1424:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTryIde.g:1425:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTryIde.g:1425:4: (lv_name_2_0= RULE_ID )
            // InternalTryIde.g:1426:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getEnumDefinitionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.unicam.tryIde.TryIde.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalTryIde.g:1446:3: ( (lv_members_4_0= ruleEnumValue ) )
            // InternalTryIde.g:1447:4: (lv_members_4_0= ruleEnumValue )
            {
            // InternalTryIde.g:1447:4: (lv_members_4_0= ruleEnumValue )
            // InternalTryIde.g:1448:5: lv_members_4_0= ruleEnumValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_members_4_0=ruleEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumDefinitionRule());
              					}
              					add(
              						current,
              						"members",
              						lv_members_4_0,
              						"org.unicam.tryIde.TryIde.EnumValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:1465:3: (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTryIde.g:1466:4: otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getEnumDefinitionAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalTryIde.g:1470:4: ( (lv_members_6_0= ruleEnumValue ) )
            	    // InternalTryIde.g:1471:5: (lv_members_6_0= ruleEnumValue )
            	    {
            	    // InternalTryIde.g:1471:5: (lv_members_6_0= ruleEnumValue )
            	    // InternalTryIde.g:1472:6: lv_members_6_0= ruleEnumValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_members_6_0=ruleEnumValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnumDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"members",
            	      							lv_members_6_0,
            	      							"org.unicam.tryIde.TryIde.EnumValue");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_6());
              		
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
    // InternalTryIde.g:1498:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalTryIde.g:1498:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalTryIde.g:1499:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalTryIde.g:1505:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:1511:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTryIde.g:1512:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTryIde.g:1512:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTryIde.g:1513:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTryIde.g:1513:3: (lv_name_0_0= RULE_ID )
            // InternalTryIde.g:1514:4: lv_name_0_0= RULE_ID
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
              					"org.unicam.tryIde.TryIde.ID");
              			
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
    // InternalTryIde.g:1533:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTryIde.g:1533:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTryIde.g:1534:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalTryIde.g:1540:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:1546:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTryIde.g:1547:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTryIde.g:1547:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTryIde.g:1548:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTryIde.g:1548:3: (lv_name_0_0= RULE_ID )
            // InternalTryIde.g:1549:4: lv_name_0_0= RULE_ID
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
              					"org.unicam.tryIde.TryIde.ID");
              			
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
    // InternalTryIde.g:1568:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTryIde.g:1568:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTryIde.g:1569:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalTryIde.g:1575:1: ruleVariableDeclaration returns [EObject current=null] : (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_StandardVariableDeclaration_0 = null;

        EObject this_VarVariableDeclaration_1 = null;

        EObject this_VarVariableTupleVariableDeclaration_2 = null;



        	enterRule();

        try {
            // InternalTryIde.g:1581:2: ( (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) )
            // InternalTryIde.g:1582:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            {
            // InternalTryIde.g:1582:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==38||(LA23_0>=70 && LA23_0<=173)) ) {
                alt23=1;
            }
            else if ( (LA23_0==42) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==RULE_ID) ) {
                    alt23=2;
                }
                else if ( (LA23_2==28) ) {
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
                    // InternalTryIde.g:1583:3: this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration
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
                    // InternalTryIde.g:1592:3: this_VarVariableDeclaration_1= ruleVarVariableDeclaration
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
                    // InternalTryIde.g:1601:3: this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration
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
    // InternalTryIde.g:1613:1: entryRuleStandardVariableDeclaration returns [EObject current=null] : iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF ;
    public final EObject entryRuleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardVariableDeclaration = null;


        try {
            // InternalTryIde.g:1613:68: (iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF )
            // InternalTryIde.g:1614:2: iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF
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
    // InternalTryIde.g:1620:1: ruleStandardVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_optionalElements_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:1626:2: ( ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) )
            // InternalTryIde.g:1627:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            {
            // InternalTryIde.g:1627:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            // InternalTryIde.g:1628:3: ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            {
            // InternalTryIde.g:1628:3: ( (lv_type_0_0= ruleStandardType ) )
            // InternalTryIde.g:1629:4: (lv_type_0_0= ruleStandardType )
            {
            // InternalTryIde.g:1629:4: (lv_type_0_0= ruleStandardType )
            // InternalTryIde.g:1630:5: lv_type_0_0= ruleStandardType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getTypeStandardTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_29);
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
              						"org.unicam.tryIde.TryIde.StandardType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:1647:3: ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33||LA24_0==37||(LA24_0>=174 && LA24_0<=180)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTryIde.g:1648:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    {
            	    // InternalTryIde.g:1648:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    // InternalTryIde.g:1649:5: lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	      						"org.unicam.tryIde.TryIde.VariableDeclarationOptionalElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalTryIde.g:1666:3: ( (lv_variable_2_0= ruleVariable ) )
            // InternalTryIde.g:1667:4: (lv_variable_2_0= ruleVariable )
            {
            // InternalTryIde.g:1667:4: (lv_variable_2_0= ruleVariable )
            // InternalTryIde.g:1668:5: lv_variable_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getVariableVariableParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
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
              						"org.unicam.tryIde.TryIde.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:1685:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTryIde.g:1686:4: otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStandardVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalTryIde.g:1690:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalTryIde.g:1691:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalTryIde.g:1691:5: (lv_expression_4_0= ruleExpression )
                    // InternalTryIde.g:1692:6: lv_expression_4_0= ruleExpression
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
                      							"org.unicam.tryIde.TryIde.Expression");
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
    // InternalTryIde.g:1714:1: entryRuleVarVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableDeclaration = null;


        try {
            // InternalTryIde.g:1714:63: (iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF )
            // InternalTryIde.g:1715:2: iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF
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
    // InternalTryIde.g:1721:1: ruleVarVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:1727:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalTryIde.g:1728:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalTryIde.g:1728:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalTryIde.g:1729:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalTryIde.g:1729:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalTryIde.g:1730:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalTryIde.g:1730:4: (lv_varType_0_0= ruleVarType )
            // InternalTryIde.g:1731:5: lv_varType_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getVarTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_29);
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
              						"org.unicam.tryIde.TryIde.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:1748:3: ( (lv_variable_1_0= ruleVariable ) )
            // InternalTryIde.g:1749:4: (lv_variable_1_0= ruleVariable )
            {
            // InternalTryIde.g:1749:4: (lv_variable_1_0= ruleVariable )
            // InternalTryIde.g:1750:5: lv_variable_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getVariableVariableParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
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
              						"org.unicam.tryIde.TryIde.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:1767:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTryIde.g:1768:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalTryIde.g:1772:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalTryIde.g:1773:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalTryIde.g:1773:5: (lv_expression_3_0= ruleExpression )
                    // InternalTryIde.g:1774:6: lv_expression_3_0= ruleExpression
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
                      							"org.unicam.tryIde.TryIde.Expression");
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
    // InternalTryIde.g:1796:1: entryRuleVarVariableTupleVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableTupleVariableDeclaration = null;


        try {
            // InternalTryIde.g:1796:76: (iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF )
            // InternalTryIde.g:1797:2: iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF
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
    // InternalTryIde.g:1803:1: ruleVarVariableTupleVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_tuple_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:1809:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalTryIde.g:1810:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalTryIde.g:1810:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalTryIde.g:1811:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalTryIde.g:1811:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalTryIde.g:1812:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalTryIde.g:1812:4: (lv_varType_0_0= ruleVarType )
            // InternalTryIde.g:1813:5: lv_varType_0_0= ruleVarType
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
              						"org.unicam.tryIde.TryIde.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:1830:3: ( (lv_tuple_1_0= ruleTuple ) )
            // InternalTryIde.g:1831:4: (lv_tuple_1_0= ruleTuple )
            {
            // InternalTryIde.g:1831:4: (lv_tuple_1_0= ruleTuple )
            // InternalTryIde.g:1832:5: lv_tuple_1_0= ruleTuple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getTupleTupleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
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
              						"org.unicam.tryIde.TryIde.Tuple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:1849:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTryIde.g:1850:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableTupleVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalTryIde.g:1854:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalTryIde.g:1855:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalTryIde.g:1855:5: (lv_expression_3_0= ruleExpression )
                    // InternalTryIde.g:1856:6: lv_expression_3_0= ruleExpression
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
                      							"org.unicam.tryIde.TryIde.Expression");
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
    // InternalTryIde.g:1878:1: entryRuleVariableDeclarationOptionalElement returns [EObject current=null] : iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF ;
    public final EObject entryRuleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationOptionalElement = null;


        try {
            // InternalTryIde.g:1878:75: (iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF )
            // InternalTryIde.g:1879:2: iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF
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
    // InternalTryIde.g:1885:1: ruleVariableDeclarationOptionalElement returns [EObject current=null] : (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) ;
    public final EObject ruleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_VisibilitySpecifier_0 = null;

        EObject this_IndexedSpecifer_1 = null;

        EObject this_ConstantSpecifier_2 = null;

        EObject this_LocationSpecifier_3 = null;



        	enterRule();

        try {
            // InternalTryIde.g:1891:2: ( (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) )
            // InternalTryIde.g:1892:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            {
            // InternalTryIde.g:1892:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 177:
            case 178:
            case 179:
            case 180:
                {
                alt28=1;
                }
                break;
            case 37:
                {
                alt28=2;
                }
                break;
            case 33:
                {
                alt28=3;
                }
                break;
            case 174:
            case 175:
            case 176:
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
                    // InternalTryIde.g:1893:3: this_VisibilitySpecifier_0= ruleVisibilitySpecifier
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
                    // InternalTryIde.g:1902:3: this_IndexedSpecifer_1= ruleIndexedSpecifer
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
                    // InternalTryIde.g:1911:3: this_ConstantSpecifier_2= ruleConstantSpecifier
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
                    // InternalTryIde.g:1920:3: this_LocationSpecifier_3= ruleLocationSpecifier
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
    // InternalTryIde.g:1932:1: entryRuleIndexedSpecifer returns [EObject current=null] : iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF ;
    public final EObject entryRuleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedSpecifer = null;


        try {
            // InternalTryIde.g:1932:56: (iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF )
            // InternalTryIde.g:1933:2: iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF
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
    // InternalTryIde.g:1939:1: ruleIndexedSpecifer returns [EObject current=null] : (otherlv_0= 'indexed' () ) ;
    public final EObject ruleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:1945:2: ( (otherlv_0= 'indexed' () ) )
            // InternalTryIde.g:1946:2: (otherlv_0= 'indexed' () )
            {
            // InternalTryIde.g:1946:2: (otherlv_0= 'indexed' () )
            // InternalTryIde.g:1947:3: otherlv_0= 'indexed' ()
            {
            otherlv_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexedSpeciferAccess().getIndexedKeyword_0());
              		
            }
            // InternalTryIde.g:1951:3: ()
            // InternalTryIde.g:1952:4: 
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
    // InternalTryIde.g:1962:1: entryRuleConstantSpecifier returns [EObject current=null] : iv_ruleConstantSpecifier= ruleConstantSpecifier EOF ;
    public final EObject entryRuleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSpecifier = null;


        try {
            // InternalTryIde.g:1962:58: (iv_ruleConstantSpecifier= ruleConstantSpecifier EOF )
            // InternalTryIde.g:1963:2: iv_ruleConstantSpecifier= ruleConstantSpecifier EOF
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
    // InternalTryIde.g:1969:1: ruleConstantSpecifier returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:1975:2: ( (otherlv_0= 'constant' () ) )
            // InternalTryIde.g:1976:2: (otherlv_0= 'constant' () )
            {
            // InternalTryIde.g:1976:2: (otherlv_0= 'constant' () )
            // InternalTryIde.g:1977:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantSpecifierAccess().getConstantKeyword_0());
              		
            }
            // InternalTryIde.g:1981:3: ()
            // InternalTryIde.g:1982:4: 
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
    // InternalTryIde.g:1992:1: entryRuleLocationSpecifier returns [EObject current=null] : iv_ruleLocationSpecifier= ruleLocationSpecifier EOF ;
    public final EObject entryRuleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifier = null;


        try {
            // InternalTryIde.g:1992:58: (iv_ruleLocationSpecifier= ruleLocationSpecifier EOF )
            // InternalTryIde.g:1993:2: iv_ruleLocationSpecifier= ruleLocationSpecifier EOF
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
    // InternalTryIde.g:1999:1: ruleLocationSpecifier returns [EObject current=null] : ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) ;
    public final EObject ruleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_location_0_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:2005:2: ( ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) )
            // InternalTryIde.g:2006:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            {
            // InternalTryIde.g:2006:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            // InternalTryIde.g:2007:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            {
            // InternalTryIde.g:2007:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            // InternalTryIde.g:2008:4: lv_location_0_0= ruleLocationSpecifierEnum
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
              					"org.unicam.tryIde.TryIde.LocationSpecifierEnum");
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
    // InternalTryIde.g:2028:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalTryIde.g:2028:45: (iv_ruleType= ruleType EOF )
            // InternalTryIde.g:2029:2: iv_ruleType= ruleType EOF
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
    // InternalTryIde.g:2035:1: ruleType returns [EObject current=null] : (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_StandardType_0 = null;

        AntlrDatatypeRuleToken lv_isVarType_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:2041:2: ( (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) )
            // InternalTryIde.g:2042:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            {
            // InternalTryIde.g:2042:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==38||(LA29_0>=70 && LA29_0<=173)) ) {
                alt29=1;
            }
            else if ( (LA29_0==42) ) {
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
                    // InternalTryIde.g:2043:3: this_StandardType_0= ruleStandardType
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
                    // InternalTryIde.g:2052:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    {
                    // InternalTryIde.g:2052:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    // InternalTryIde.g:2053:4: (lv_isVarType_1_0= ruleVarType )
                    {
                    // InternalTryIde.g:2053:4: (lv_isVarType_1_0= ruleVarType )
                    // InternalTryIde.g:2054:5: lv_isVarType_1_0= ruleVarType
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
                      						"org.unicam.tryIde.TryIde.VarType");
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
    // InternalTryIde.g:2075:1: entryRuleStandardType returns [EObject current=null] : iv_ruleStandardType= ruleStandardType EOF ;
    public final EObject entryRuleStandardType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardType = null;


        try {
            // InternalTryIde.g:2075:53: (iv_ruleStandardType= ruleStandardType EOF )
            // InternalTryIde.g:2076:2: iv_ruleStandardType= ruleStandardType EOF
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
    // InternalTryIde.g:2082:1: ruleStandardType returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) ;
    public final EObject ruleStandardType() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;

        EObject this_QualifiedIdentifier_3 = null;



        	enterRule();

        try {
            // InternalTryIde.g:2088:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) )
            // InternalTryIde.g:2089:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            {
            // InternalTryIde.g:2089:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            int alt31=3;
            switch ( input.LA(1) ) {
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
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
                {
                alt31=1;
                }
                break;
            case 38:
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
                    // InternalTryIde.g:2090:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalTryIde.g:2090:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalTryIde.g:2091:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStandardTypeAccess().getElementaryTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_ElementaryType_0=ruleElementaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementaryType_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryIde.g:2099:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==40) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalTryIde.g:2100:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalTryIde.g:2100:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalTryIde.g:2101:6: lv_dimension_1_0= ruleArrayDimensions
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
                              							"org.unicam.tryIde.TryIde.ArrayDimensions");
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
                    // InternalTryIde.g:2120:3: this_Mapping_2= ruleMapping
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
                    // InternalTryIde.g:2129:3: this_QualifiedIdentifier_3= ruleQualifiedIdentifier
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
    // InternalTryIde.g:2141:1: entryRuleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF ;
    public final EObject entryRuleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardTypeWithoutQualifiedIdentifier = null;


        try {
            // InternalTryIde.g:2141:79: (iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF )
            // InternalTryIde.g:2142:2: iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF
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
    // InternalTryIde.g:2148:1: ruleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) ;
    public final EObject ruleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;



        	enterRule();

        try {
            // InternalTryIde.g:2154:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) )
            // InternalTryIde.g:2155:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            {
            // InternalTryIde.g:2155:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=70 && LA33_0<=173)) ) {
                alt33=1;
            }
            else if ( (LA33_0==38) ) {
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
                    // InternalTryIde.g:2156:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalTryIde.g:2156:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalTryIde.g:2157:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStandardTypeWithoutQualifiedIdentifierAccess().getElementaryTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_ElementaryType_0=ruleElementaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementaryType_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryIde.g:2165:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==40) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalTryIde.g:2166:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalTryIde.g:2166:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalTryIde.g:2167:6: lv_dimension_1_0= ruleArrayDimensions
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
                              							"org.unicam.tryIde.TryIde.ArrayDimensions");
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
                    // InternalTryIde.g:2186:3: this_Mapping_2= ruleMapping
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
    // InternalTryIde.g:2198:1: entryRuleElementaryType returns [EObject current=null] : iv_ruleElementaryType= ruleElementaryType EOF ;
    public final EObject entryRuleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryType = null;


        try {
            // InternalTryIde.g:2198:55: (iv_ruleElementaryType= ruleElementaryType EOF )
            // InternalTryIde.g:2199:2: iv_ruleElementaryType= ruleElementaryType EOF
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
    // InternalTryIde.g:2205:1: ruleElementaryType returns [EObject current=null] : ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) ;
    public final EObject ruleElementaryType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:2211:2: ( ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) )
            // InternalTryIde.g:2212:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            {
            // InternalTryIde.g:2212:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            // InternalTryIde.g:2213:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalTryIde.g:2213:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            // InternalTryIde.g:2214:4: lv_name_0_0= ruleElementaryTypeNameEnum
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
              					"org.unicam.tryIde.TryIde.ElementaryTypeNameEnum");
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
    // InternalTryIde.g:2234:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalTryIde.g:2234:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalTryIde.g:2235:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalTryIde.g:2241:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) ;
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
            // InternalTryIde.g:2247:2: ( (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) )
            // InternalTryIde.g:2248:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            {
            // InternalTryIde.g:2248:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            // InternalTryIde.g:2249:3: otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryIde.g:2257:3: ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) )
            // InternalTryIde.g:2258:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            {
            // InternalTryIde.g:2258:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            // InternalTryIde.g:2259:5: lv_keyType_2_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getKeyTypeElementaryTypeNameEnumEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_33);
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
              						"org.unicam.tryIde.TryIde.ElementaryTypeNameEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalTryIde.g:2280:3: ( (lv_valueType_4_0= ruleType ) )
            // InternalTryIde.g:2281:4: (lv_valueType_4_0= ruleType )
            {
            // InternalTryIde.g:2281:4: (lv_valueType_4_0= ruleType )
            // InternalTryIde.g:2282:5: lv_valueType_4_0= ruleType
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
              						"org.unicam.tryIde.TryIde.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:2307:1: entryRuleArrayDimensions returns [EObject current=null] : iv_ruleArrayDimensions= ruleArrayDimensions EOF ;
    public final EObject entryRuleArrayDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimensions = null;


        try {
            // InternalTryIde.g:2307:56: (iv_ruleArrayDimensions= ruleArrayDimensions EOF )
            // InternalTryIde.g:2308:2: iv_ruleArrayDimensions= ruleArrayDimensions EOF
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
    // InternalTryIde.g:2314:1: ruleArrayDimensions returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) ;
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
            // InternalTryIde.g:2320:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) )
            // InternalTryIde.g:2321:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            {
            // InternalTryIde.g:2321:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            // InternalTryIde.g:2322:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            {
            otherlv_0=(Token)match(input,40,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalTryIde.g:2326:3: ()
            // InternalTryIde.g:2327:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayDimensionsAccess().getArrayDimensionsAction_1(),
              					current);
              			
            }

            }

            // InternalTryIde.g:2333:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_NOW)||LA34_0==28||(LA34_0>=63 && LA34_0<=173)||(LA34_0>=204 && LA34_0<=205)||(LA34_0>=216 && LA34_0<=217)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTryIde.g:2334:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalTryIde.g:2334:4: (lv_value_2_0= ruleExpression )
                    // InternalTryIde.g:2335:5: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArrayDimensionsAccess().getValueExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_36);
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
                      						"org.unicam.tryIde.TryIde.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalTryIde.g:2356:3: (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==40) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalTryIde.g:2357:4: otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']'
            	    {
            	    otherlv_4=(Token)match(input,40,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_4_0());
            	      			
            	    }
            	    // InternalTryIde.g:2361:4: ( (lv_value_5_0= ruleExpression ) )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_NOW)||LA35_0==28||(LA35_0>=63 && LA35_0<=173)||(LA35_0>=204 && LA35_0<=205)||(LA35_0>=216 && LA35_0<=217)) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalTryIde.g:2362:5: (lv_value_5_0= ruleExpression )
            	            {
            	            // InternalTryIde.g:2362:5: (lv_value_5_0= ruleExpression )
            	            // InternalTryIde.g:2363:6: lv_value_5_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getArrayDimensionsAccess().getValueExpressionParserRuleCall_4_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_36);
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
            	              							"org.unicam.tryIde.TryIde.Expression");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,41,FOLLOW_31); if (state.failed) return current;
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
    // InternalTryIde.g:2389:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalTryIde.g:2389:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalTryIde.g:2390:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalTryIde.g:2396:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTryIde.g:2402:2: (kw= 'var' )
            // InternalTryIde.g:2403:2: kw= 'var'
            {
            kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:2411:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalTryIde.g:2411:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalTryIde.g:2412:2: iv_ruleTuple= ruleTuple EOF
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
    // InternalTryIde.g:2418:1: ruleTuple returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_3_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:2424:2: ( (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) )
            // InternalTryIde.g:2425:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            {
            // InternalTryIde.g:2425:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            // InternalTryIde.g:2426:3: otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryIde.g:2430:3: ()
            // InternalTryIde.g:2431:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleAccess().getTupleAction_1(),
              					current);
              			
            }

            }

            // InternalTryIde.g:2437:3: ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_NOW)||LA40_0==23||LA40_0==28||(LA40_0>=63 && LA40_0<=173)||(LA40_0>=204 && LA40_0<=205)||(LA40_0>=216 && LA40_0<=217)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTryIde.g:2438:4: ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    {
                    // InternalTryIde.g:2438:4: ( (lv_members_2_0= ruleExpression ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_NOW)||LA37_0==28||(LA37_0>=63 && LA37_0<=173)||(LA37_0>=204 && LA37_0<=205)||(LA37_0>=216 && LA37_0<=217)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalTryIde.g:2439:5: (lv_members_2_0= ruleExpression )
                            {
                            // InternalTryIde.g:2439:5: (lv_members_2_0= ruleExpression )
                            // InternalTryIde.g:2440:6: lv_members_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getTupleAccess().getMembersExpressionParserRuleCall_2_0_0());
                              					
                            }
                            pushFollow(FOLLOW_38);
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
                              							"org.unicam.tryIde.TryIde.Expression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalTryIde.g:2457:4: ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==23) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalTryIde.g:2458:5: ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )?
                    	    {
                    	    // InternalTryIde.g:2458:5: ( (lv_members_3_0= ruleTupleSeparator ) )
                    	    // InternalTryIde.g:2459:6: (lv_members_3_0= ruleTupleSeparator )
                    	    {
                    	    // InternalTryIde.g:2459:6: (lv_members_3_0= ruleTupleSeparator )
                    	    // InternalTryIde.g:2460:7: lv_members_3_0= ruleTupleSeparator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTupleAccess().getMembersTupleSeparatorParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
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
                    	      								"org.unicam.tryIde.TryIde.TupleSeparator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalTryIde.g:2477:5: ( (lv_members_4_0= ruleExpression ) )?
                    	    int alt38=2;
                    	    int LA38_0 = input.LA(1);

                    	    if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_NOW)||LA38_0==28||(LA38_0>=63 && LA38_0<=173)||(LA38_0>=204 && LA38_0<=205)||(LA38_0>=216 && LA38_0<=217)) ) {
                    	        alt38=1;
                    	    }
                    	    switch (alt38) {
                    	        case 1 :
                    	            // InternalTryIde.g:2478:6: (lv_members_4_0= ruleExpression )
                    	            {
                    	            // InternalTryIde.g:2478:6: (lv_members_4_0= ruleExpression )
                    	            // InternalTryIde.g:2479:7: lv_members_4_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getTupleAccess().getMembersExpressionParserRuleCall_2_1_1_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_37);
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
                    	              								"org.unicam.tryIde.TryIde.Expression");
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

            otherlv_5=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:2506:1: entryRuleTupleSeparator returns [EObject current=null] : iv_ruleTupleSeparator= ruleTupleSeparator EOF ;
    public final EObject entryRuleTupleSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleSeparator = null;


        try {
            // InternalTryIde.g:2506:55: (iv_ruleTupleSeparator= ruleTupleSeparator EOF )
            // InternalTryIde.g:2507:2: iv_ruleTupleSeparator= ruleTupleSeparator EOF
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
    // InternalTryIde.g:2513:1: ruleTupleSeparator returns [EObject current=null] : (otherlv_0= ',' () ) ;
    public final EObject ruleTupleSeparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:2519:2: ( (otherlv_0= ',' () ) )
            // InternalTryIde.g:2520:2: (otherlv_0= ',' () )
            {
            // InternalTryIde.g:2520:2: (otherlv_0= ',' () )
            // InternalTryIde.g:2521:3: otherlv_0= ',' ()
            {
            otherlv_0=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleSeparatorAccess().getCommaKeyword_0());
              		
            }
            // InternalTryIde.g:2525:3: ()
            // InternalTryIde.g:2526:4: 
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
    // InternalTryIde.g:2536:1: entryRuleSimpleStatement returns [EObject current=null] : iv_ruleSimpleStatement= ruleSimpleStatement EOF ;
    public final EObject entryRuleSimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement = null;


        try {
            // InternalTryIde.g:2536:56: (iv_ruleSimpleStatement= ruleSimpleStatement EOF )
            // InternalTryIde.g:2537:2: iv_ruleSimpleStatement= ruleSimpleStatement EOF
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
    // InternalTryIde.g:2543:1: ruleSimpleStatement returns [EObject current=null] : ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) ;
    public final EObject ruleSimpleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        Token lv_semicolon_16_0=null;
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
            // InternalTryIde.g:2549:2: ( ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) )
            // InternalTryIde.g:2550:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            {
            // InternalTryIde.g:2550:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            // InternalTryIde.g:2551:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) )
            {
            // InternalTryIde.g:2551:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalTryIde.g:2552:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalTryIde.g:2552:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalTryIde.g:2553:5: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStatementAccess().getStandardTypeWithoutQualifiedIdentifierParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
                    this_StandardTypeWithoutQualifiedIdentifier_0=ruleStandardTypeWithoutQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_StandardTypeWithoutQualifiedIdentifier_0;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalTryIde.g:2561:5: ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalTryIde.g:2562:6: () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalTryIde.g:2562:6: ()
                    // InternalTryIde.g:2563:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getSimpleStatementAccess().getStandardVariableDeclarationTypeAction_0_0_1_0(),
                      								current);
                      						
                    }

                    }

                    // InternalTryIde.g:2569:6: ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==33||LA41_0==37||(LA41_0>=174 && LA41_0<=180)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalTryIde.g:2570:7: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalTryIde.g:2570:7: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalTryIde.g:2571:8: lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_0_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_optionalElements_2_0=ruleVariableDeclarationOptionalElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"optionalElements",
                    	      									lv_optionalElements_2_0,
                    	      									"org.unicam.tryIde.TryIde.VariableDeclarationOptionalElement");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // InternalTryIde.g:2588:6: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalTryIde.g:2589:7: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalTryIde.g:2589:7: (lv_variable_3_0= ruleVariable )
                    // InternalTryIde.g:2590:8: lv_variable_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getVariableVariableParserRuleCall_0_0_1_2_0());
                      							
                    }
                    pushFollow(FOLLOW_39);
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
                      									"org.unicam.tryIde.TryIde.Variable");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalTryIde.g:2607:6: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==36) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalTryIde.g:2608:7: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_0_1_3_0());
                              						
                            }
                            // InternalTryIde.g:2612:7: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalTryIde.g:2613:8: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalTryIde.g:2613:8: (lv_expression_5_0= ruleExpression )
                            // InternalTryIde.g:2614:9: lv_expression_5_0= ruleExpression
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
                              										"org.unicam.tryIde.TryIde.Expression");
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
                    // InternalTryIde.g:2635:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalTryIde.g:2635:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalTryIde.g:2636:5: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStatementAccess().getVarTypeParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_40);
                    ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalTryIde.g:2643:5: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==28) ) {
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
                            // InternalTryIde.g:2644:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalTryIde.g:2644:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalTryIde.g:2645:7: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalTryIde.g:2645:7: ()
                            // InternalTryIde.g:2646:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTypeDeclarationAction_0_1_1_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalTryIde.g:2652:7: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalTryIde.g:2653:8: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalTryIde.g:2653:8: (lv_variable_8_0= ruleVariable )
                            // InternalTryIde.g:2654:9: lv_variable_8_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getVariableVariableParserRuleCall_0_1_1_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_41);
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
                              										"org.unicam.tryIde.TryIde.Variable");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalTryIde.g:2671:7: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalTryIde.g:2672:8: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_9, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_0_2_0());
                              							
                            }
                            // InternalTryIde.g:2676:8: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalTryIde.g:2677:9: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalTryIde.g:2677:9: (lv_expression_10_0= ruleExpression )
                            // InternalTryIde.g:2678:10: lv_expression_10_0= ruleExpression
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
                              											"org.unicam.tryIde.TryIde.Expression");
                              										afterParserOrEnumRuleCall();
                              									
                            }

                            }


                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTryIde.g:2698:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalTryIde.g:2698:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalTryIde.g:2699:7: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalTryIde.g:2699:7: ()
                            // InternalTryIde.g:2700:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTupleVariableDeclarationAction_0_1_1_1_0(),
                              									current);
                              							
                            }

                            }

                            // InternalTryIde.g:2706:7: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalTryIde.g:2707:8: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalTryIde.g:2707:8: (lv_tuple_12_0= ruleTuple )
                            // InternalTryIde.g:2708:9: lv_tuple_12_0= ruleTuple
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getTupleTupleParserRuleCall_0_1_1_1_1_0());
                              								
                            }
                            pushFollow(FOLLOW_41);
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
                              										"org.unicam.tryIde.TryIde.Tuple");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalTryIde.g:2725:7: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalTryIde.g:2726:8: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_13, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_1_2_0());
                              							
                            }
                            // InternalTryIde.g:2730:8: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalTryIde.g:2731:9: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalTryIde.g:2731:9: (lv_expression_14_0= ruleExpression )
                            // InternalTryIde.g:2732:10: lv_expression_14_0= ruleExpression
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
                              											"org.unicam.tryIde.TryIde.Expression");
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
                    // InternalTryIde.g:2754:4: this_ExpressionStatement_15= ruleExpressionStatement
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

            // InternalTryIde.g:2763:3: ( (lv_semicolon_16_0= ';' ) )
            // InternalTryIde.g:2764:4: (lv_semicolon_16_0= ';' )
            {
            // InternalTryIde.g:2764:4: (lv_semicolon_16_0= ';' )
            // InternalTryIde.g:2765:5: lv_semicolon_16_0= ';'
            {
            lv_semicolon_16_0=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:2781:1: entryRuleSimpleStatement2 returns [EObject current=null] : iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF ;
    public final EObject entryRuleSimpleStatement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement2 = null;


        try {
            // InternalTryIde.g:2781:57: (iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF )
            // InternalTryIde.g:2782:2: iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF
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
    // InternalTryIde.g:2788:1: ruleSimpleStatement2 returns [EObject current=null] : ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ;
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
            // InternalTryIde.g:2794:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) )
            // InternalTryIde.g:2795:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            {
            // InternalTryIde.g:2795:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt48=3;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalTryIde.g:2796:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalTryIde.g:2796:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalTryIde.g:2797:4: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatement2Access().getStandardTypeWithoutQualifiedIdentifierParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_29);
                    this_StandardTypeWithoutQualifiedIdentifier_0=ruleStandardTypeWithoutQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_StandardTypeWithoutQualifiedIdentifier_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryIde.g:2805:4: ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalTryIde.g:2806:5: () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalTryIde.g:2806:5: ()
                    // InternalTryIde.g:2807:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getSimpleStatement2Access().getStandardVariableDeclarationTypeAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryIde.g:2813:5: ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==33||LA45_0==37||(LA45_0>=174 && LA45_0<=180)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalTryIde.g:2814:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalTryIde.g:2814:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalTryIde.g:2815:7: lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSimpleStatement2Access().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_0_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
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
                    	      								"org.unicam.tryIde.TryIde.VariableDeclarationOptionalElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    // InternalTryIde.g:2832:5: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalTryIde.g:2833:6: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalTryIde.g:2833:6: (lv_variable_3_0= ruleVariable )
                    // InternalTryIde.g:2834:7: lv_variable_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSimpleStatement2Access().getVariableVariableParserRuleCall_0_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_30);
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
                      								"org.unicam.tryIde.TryIde.Variable");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTryIde.g:2851:5: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==36) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalTryIde.g:2852:6: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_0_1_3_0());
                              					
                            }
                            // InternalTryIde.g:2856:6: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalTryIde.g:2857:7: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalTryIde.g:2857:7: (lv_expression_5_0= ruleExpression )
                            // InternalTryIde.g:2858:8: lv_expression_5_0= ruleExpression
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
                              									"org.unicam.tryIde.TryIde.Expression");
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
                    // InternalTryIde.g:2879:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalTryIde.g:2879:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalTryIde.g:2880:4: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatement2Access().getVarTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_40);
                    ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryIde.g:2887:4: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==28) ) {
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
                            // InternalTryIde.g:2888:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalTryIde.g:2888:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalTryIde.g:2889:6: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalTryIde.g:2889:6: ()
                            // InternalTryIde.g:2890:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTypeDeclarationAction_1_1_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalTryIde.g:2896:6: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalTryIde.g:2897:7: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalTryIde.g:2897:7: (lv_variable_8_0= ruleVariable )
                            // InternalTryIde.g:2898:8: lv_variable_8_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getVariableVariableParserRuleCall_1_1_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_41);
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
                              									"org.unicam.tryIde.TryIde.Variable");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalTryIde.g:2915:6: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalTryIde.g:2916:7: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_9, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_0_2_0());
                              						
                            }
                            // InternalTryIde.g:2920:7: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalTryIde.g:2921:8: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalTryIde.g:2921:8: (lv_expression_10_0= ruleExpression )
                            // InternalTryIde.g:2922:9: lv_expression_10_0= ruleExpression
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
                              										"org.unicam.tryIde.TryIde.Expression");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTryIde.g:2942:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalTryIde.g:2942:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalTryIde.g:2943:6: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalTryIde.g:2943:6: ()
                            // InternalTryIde.g:2944:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTupleVariableDeclarationAction_1_1_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalTryIde.g:2950:6: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalTryIde.g:2951:7: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalTryIde.g:2951:7: (lv_tuple_12_0= ruleTuple )
                            // InternalTryIde.g:2952:8: lv_tuple_12_0= ruleTuple
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getTupleTupleParserRuleCall_1_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_41);
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
                              									"org.unicam.tryIde.TryIde.Tuple");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalTryIde.g:2969:6: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalTryIde.g:2970:7: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_13, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_1_2_0());
                              						
                            }
                            // InternalTryIde.g:2974:7: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalTryIde.g:2975:8: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalTryIde.g:2975:8: (lv_expression_14_0= ruleExpression )
                            // InternalTryIde.g:2976:9: lv_expression_14_0= ruleExpression
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
                              										"org.unicam.tryIde.TryIde.Expression");
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
                    // InternalTryIde.g:2998:3: this_ExpressionStatement_15= ruleExpressionStatement
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
    // InternalTryIde.g:3010:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalTryIde.g:3010:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalTryIde.g:3011:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
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
    // InternalTryIde.g:3017:1: ruleExpressionStatement returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3023:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalTryIde.g:3024:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalTryIde.g:3024:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalTryIde.g:3025:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalTryIde.g:3025:3: (lv_expression_0_0= ruleExpression )
            // InternalTryIde.g:3026:4: lv_expression_0_0= ruleExpression
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
              					"org.unicam.tryIde.TryIde.Expression");
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
    // InternalTryIde.g:3046:1: entryRuleQualifiedIdentifier returns [EObject current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final EObject entryRuleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedIdentifier = null;


        try {
            // InternalTryIde.g:3046:60: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // InternalTryIde.g:3047:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
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
    // InternalTryIde.g:3053:1: ruleQualifiedIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) ;
    public final EObject ruleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        EObject lv_qualifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3059:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) )
            // InternalTryIde.g:3060:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            {
            // InternalTryIde.g:3060:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            // InternalTryIde.g:3061:3: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )*
            {
            // InternalTryIde.g:3061:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalTryIde.g:3062:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalTryIde.g:3062:4: (lv_identifier_0_0= RULE_ID )
            // InternalTryIde.g:3063:5: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
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
              						"org.unicam.tryIde.TryIde.ID");
              				
            }

            }


            }

            // InternalTryIde.g:3079:3: ( (lv_qualifiers_1_0= ruleQualifier ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==28||LA49_0==40||LA49_0==43) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalTryIde.g:3080:4: (lv_qualifiers_1_0= ruleQualifier )
            	    {
            	    // InternalTryIde.g:3080:4: (lv_qualifiers_1_0= ruleQualifier )
            	    // InternalTryIde.g:3081:5: lv_qualifiers_1_0= ruleQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getQualifiedIdentifierAccess().getQualifiersQualifierParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_42);
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
            	      						"org.unicam.tryIde.TryIde.Qualifier");
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
    // InternalTryIde.g:3102:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalTryIde.g:3102:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalTryIde.g:3103:2: iv_ruleQualifier= ruleQualifier EOF
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
    // InternalTryIde.g:3109:1: ruleQualifier returns [EObject current=null] : (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Index_1 = null;

        EObject this_Arguments_2 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3115:2: ( (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) )
            // InternalTryIde.g:3116:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            {
            // InternalTryIde.g:3116:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt50=1;
                }
                break;
            case 40:
                {
                alt50=2;
                }
                break;
            case 28:
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
                    // InternalTryIde.g:3117:3: this_Field_0= ruleField
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
                    // InternalTryIde.g:3126:3: this_Index_1= ruleIndex
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
                    // InternalTryIde.g:3135:3: this_Arguments_2= ruleArguments
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
    // InternalTryIde.g:3147:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalTryIde.g:3147:46: (iv_ruleField= ruleField EOF )
            // InternalTryIde.g:3148:2: iv_ruleField= ruleField EOF
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
    // InternalTryIde.g:3154:1: ruleField returns [EObject current=null] : (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_field_1_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:3160:2: ( (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) )
            // InternalTryIde.g:3161:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            {
            // InternalTryIde.g:3161:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            // InternalTryIde.g:3162:3: otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFullStopKeyword_0());
              		
            }
            // InternalTryIde.g:3166:3: ( (lv_field_1_0= RULE_ID ) )
            // InternalTryIde.g:3167:4: (lv_field_1_0= RULE_ID )
            {
            // InternalTryIde.g:3167:4: (lv_field_1_0= RULE_ID )
            // InternalTryIde.g:3168:5: lv_field_1_0= RULE_ID
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
              						"org.unicam.tryIde.TryIde.ID");
              				
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
    // InternalTryIde.g:3188:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // InternalTryIde.g:3188:46: (iv_ruleIndex= ruleIndex EOF )
            // InternalTryIde.g:3189:2: iv_ruleIndex= ruleIndex EOF
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
    // InternalTryIde.g:3195:1: ruleIndex returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3201:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) )
            // InternalTryIde.g:3202:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            {
            // InternalTryIde.g:3202:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            // InternalTryIde.g:3203:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalTryIde.g:3207:3: ()
            // InternalTryIde.g:3208:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndexAccess().getIndexAction_1(),
              					current);
              			
            }

            }

            // InternalTryIde.g:3214:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_NOW)||LA51_0==28||(LA51_0>=63 && LA51_0<=173)||(LA51_0>=204 && LA51_0<=205)||(LA51_0>=216 && LA51_0<=217)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTryIde.g:3215:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalTryIde.g:3215:4: (lv_value_2_0= ruleExpression )
                    // InternalTryIde.g:3216:5: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIndexAccess().getValueExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_36);
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
                      						"org.unicam.tryIde.TryIde.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:3241:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalTryIde.g:3241:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalTryIde.g:3242:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalTryIde.g:3248:1: ruleArguments returns [EObject current=null] : ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3254:2: ( ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) )
            // InternalTryIde.g:3255:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            {
            // InternalTryIde.g:3255:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            // InternalTryIde.g:3256:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            {
            // InternalTryIde.g:3256:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            // InternalTryIde.g:3257:4: lv_arguments_0_0= ruleFunctionCallArguments
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
              					"org.unicam.tryIde.TryIde.FunctionCallArguments");
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
    // InternalTryIde.g:3277:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalTryIde.g:3277:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalTryIde.g:3278:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalTryIde.g:3284:1: ruleModifier returns [EObject current=null] : (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_blocks_3_0= ruleBlocks ) ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_blocks_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3290:2: ( (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_blocks_3_0= ruleBlocks ) ) ) )
            // InternalTryIde.g:3291:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_blocks_3_0= ruleBlocks ) ) )
            {
            // InternalTryIde.g:3291:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_blocks_3_0= ruleBlocks ) ) )
            // InternalTryIde.g:3292:3: otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_blocks_3_0= ruleBlocks ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModifierAccess().getModifierKeyword_0());
              		
            }
            // InternalTryIde.g:3296:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryIde.g:3297:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryIde.g:3297:4: (lv_name_1_0= RULE_ID )
            // InternalTryIde.g:3298:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
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
              						"org.unicam.tryIde.TryIde.ID");
              				
            }

            }


            }

            // InternalTryIde.g:3314:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==28) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTryIde.g:3315:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalTryIde.g:3315:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalTryIde.g:3316:5: lv_parameters_2_0= ruleParameterList
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
                      						"org.unicam.tryIde.TryIde.ParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryIde.g:3333:3: ( (lv_blocks_3_0= ruleBlocks ) )
            // InternalTryIde.g:3334:4: (lv_blocks_3_0= ruleBlocks )
            {
            // InternalTryIde.g:3334:4: (lv_blocks_3_0= ruleBlocks )
            // InternalTryIde.g:3335:5: lv_blocks_3_0= ruleBlocks
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModifierAccess().getBlocksBlocksParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_blocks_3_0=ruleBlocks();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModifierRule());
              					}
              					set(
              						current,
              						"blocks",
              						lv_blocks_3_0,
              						"org.unicam.tryIde.TryIde.Blocks");
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
    // InternalTryIde.g:3356:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalTryIde.g:3356:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalTryIde.g:3357:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalTryIde.g:3363:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isAnonymous_3_0=null;
        Token otherlv_4=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3369:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' ) )
            // InternalTryIde.g:3370:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' )
            {
            // InternalTryIde.g:3370:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' )
            // InternalTryIde.g:3371:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
              		
            }
            // InternalTryIde.g:3375:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryIde.g:3376:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryIde.g:3376:4: (lv_name_1_0= RULE_ID )
            // InternalTryIde.g:3377:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
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
              						"org.unicam.tryIde.TryIde.ID");
              				
            }

            }


            }

            // InternalTryIde.g:3393:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==28) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTryIde.g:3394:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalTryIde.g:3394:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalTryIde.g:3395:5: lv_parameters_2_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEventAccess().getParametersParameterListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_45);
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
                      						"org.unicam.tryIde.TryIde.ParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryIde.g:3412:3: ( (lv_isAnonymous_3_0= 'anonymous' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==46) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTryIde.g:3413:4: (lv_isAnonymous_3_0= 'anonymous' )
                    {
                    // InternalTryIde.g:3413:4: (lv_isAnonymous_3_0= 'anonymous' )
                    // InternalTryIde.g:3414:5: lv_isAnonymous_3_0= 'anonymous'
                    {
                    lv_isAnonymous_3_0=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:3434:1: entryRuleModifierInvocation returns [EObject current=null] : iv_ruleModifierInvocation= ruleModifierInvocation EOF ;
    public final EObject entryRuleModifierInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierInvocation = null;


        try {
            // InternalTryIde.g:3434:59: (iv_ruleModifierInvocation= ruleModifierInvocation EOF )
            // InternalTryIde.g:3435:2: iv_ruleModifierInvocation= ruleModifierInvocation EOF
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
    // InternalTryIde.g:3441:1: ruleModifierInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleModifierInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3447:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalTryIde.g:3448:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalTryIde.g:3448:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalTryIde.g:3449:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalTryIde.g:3449:3: ( (otherlv_0= RULE_ID ) )
            // InternalTryIde.g:3450:4: (otherlv_0= RULE_ID )
            {
            // InternalTryIde.g:3450:4: (otherlv_0= RULE_ID )
            // InternalTryIde.g:3451:5: otherlv_0= RULE_ID
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

            // InternalTryIde.g:3462:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==28) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTryIde.g:3463:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalTryIde.g:3463:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalTryIde.g:3464:5: lv_args_1_0= ruleFunctionCallListArguments
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
                      						"org.unicam.tryIde.TryIde.FunctionCallListArguments");
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
    // InternalTryIde.g:3485:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalTryIde.g:3485:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalTryIde.g:3486:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalTryIde.g:3492:1: ruleParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3498:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalTryIde.g:3499:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalTryIde.g:3499:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalTryIde.g:3500:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryIde.g:3504:3: ()
            // InternalTryIde.g:3505:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalTryIde.g:3511:3: ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||LA57_0==38||LA57_0==42||(LA57_0>=70 && LA57_0<=173)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalTryIde.g:3512:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // InternalTryIde.g:3512:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) )
                    // InternalTryIde.g:3513:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    {
                    // InternalTryIde.g:3513:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    // InternalTryIde.g:3514:6: lv_parameters_2_0= ruleVariableDeclaration
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
                      							"org.unicam.tryIde.TryIde.VariableDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryIde.g:3531:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==23) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalTryIde.g:3532:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalTryIde.g:3536:5: ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    // InternalTryIde.g:3537:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalTryIde.g:3537:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    // InternalTryIde.g:3538:7: lv_parameters_4_0= ruleVariableDeclaration
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
                    	      								"org.unicam.tryIde.TryIde.VariableDeclaration");
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

            otherlv_5=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:3565:1: entryRuleReturnsParameterList returns [EObject current=null] : iv_ruleReturnsParameterList= ruleReturnsParameterList EOF ;
    public final EObject entryRuleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsParameterList = null;


        try {
            // InternalTryIde.g:3565:61: (iv_ruleReturnsParameterList= ruleReturnsParameterList EOF )
            // InternalTryIde.g:3566:2: iv_ruleReturnsParameterList= ruleReturnsParameterList EOF
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
    // InternalTryIde.g:3572:1: ruleReturnsParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3578:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalTryIde.g:3579:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalTryIde.g:3579:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalTryIde.g:3580:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnsParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryIde.g:3584:3: ()
            // InternalTryIde.g:3585:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnsParameterListAccess().getReturnsParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalTryIde.g:3591:3: ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||LA59_0==38||LA59_0==42||(LA59_0>=70 && LA59_0<=173)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalTryIde.g:3592:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    {
                    // InternalTryIde.g:3592:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) )
                    // InternalTryIde.g:3593:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    {
                    // InternalTryIde.g:3593:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    // InternalTryIde.g:3594:6: lv_parameters_2_0= ruleReturnParameterDeclaration
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
                      							"org.unicam.tryIde.TryIde.ReturnParameterDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryIde.g:3611:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==23) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalTryIde.g:3612:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReturnsParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalTryIde.g:3616:5: ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    // InternalTryIde.g:3617:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    {
                    	    // InternalTryIde.g:3617:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    // InternalTryIde.g:3618:7: lv_parameters_4_0= ruleReturnParameterDeclaration
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
                    	      								"org.unicam.tryIde.TryIde.ReturnParameterDeclaration");
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

            otherlv_5=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:3645:1: entryRuleReturnParameterDeclaration returns [EObject current=null] : iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF ;
    public final EObject entryRuleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterDeclaration = null;


        try {
            // InternalTryIde.g:3645:67: (iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF )
            // InternalTryIde.g:3646:2: iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF
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
    // InternalTryIde.g:3652:1: ruleReturnParameterDeclaration returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) ;
    public final EObject ruleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_typeRef_0_0 = null;

        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3658:2: ( ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) )
            // InternalTryIde.g:3659:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            {
            // InternalTryIde.g:3659:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            // InternalTryIde.g:3660:3: ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )?
            {
            // InternalTryIde.g:3660:3: ( (lv_typeRef_0_0= ruleType ) )
            // InternalTryIde.g:3661:4: (lv_typeRef_0_0= ruleType )
            {
            // InternalTryIde.g:3661:4: (lv_typeRef_0_0= ruleType )
            // InternalTryIde.g:3662:5: lv_typeRef_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnParameterDeclarationAccess().getTypeRefTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_47);
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
              						"org.unicam.tryIde.TryIde.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:3679:3: ( (lv_variable_1_0= ruleVariable ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalTryIde.g:3680:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalTryIde.g:3680:4: (lv_variable_1_0= ruleVariable )
                    // InternalTryIde.g:3681:5: lv_variable_1_0= ruleVariable
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
                      						"org.unicam.tryIde.TryIde.Variable");
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
    // InternalTryIde.g:3702:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTryIde.g:3702:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTryIde.g:3703:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalTryIde.g:3709:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Blocks_3= ruleBlocks | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_WhileStatement_1 = null;

        EObject this_ForStatement_2 = null;

        EObject this_Blocks_3 = null;

        EObject this_PlaceHolderStatement_4 = null;

        EObject this_ContinueStatement_5 = null;

        EObject this_BreakStatement_6 = null;

        EObject this_ReturnStatement_7 = null;

        EObject this_ThrowStatement_8 = null;

        EObject this_DeleteStatement_9 = null;

        EObject this_SimpleStatement_10 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3715:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Blocks_3= ruleBlocks | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) )
            // InternalTryIde.g:3716:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Blocks_3= ruleBlocks | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            {
            // InternalTryIde.g:3716:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Blocks_3= ruleBlocks | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            int alt62=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt62=1;
                }
                break;
            case 50:
                {
                alt62=2;
                }
                break;
            case 51:
                {
                alt62=3;
                }
                break;
            case 22:
                {
                alt62=4;
                }
                break;
            case 56:
                {
                alt62=5;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case RULE_NOW:
            case 28:
            case 38:
            case 42:
            case 47:
            case 52:
            case 53:
            case 54:
            case 55:
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
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 204:
            case 205:
            case 216:
            case 217:
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
                    // InternalTryIde.g:3717:3: this_IfStatement_0= ruleIfStatement
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
                    // InternalTryIde.g:3726:3: this_WhileStatement_1= ruleWhileStatement
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
                    // InternalTryIde.g:3735:3: this_ForStatement_2= ruleForStatement
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
                    // InternalTryIde.g:3744:3: this_Blocks_3= ruleBlocks
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBlocksParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Blocks_3=ruleBlocks();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Blocks_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTryIde.g:3753:3: this_PlaceHolderStatement_4= rulePlaceHolderStatement
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
                    // InternalTryIde.g:3762:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    {
                    // InternalTryIde.g:3762:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    int alt61=6;
                    switch ( input.LA(1) ) {
                    case 52:
                        {
                        alt61=1;
                        }
                        break;
                    case 53:
                        {
                        alt61=2;
                        }
                        break;
                    case 54:
                        {
                        alt61=3;
                        }
                        break;
                    case 55:
                        {
                        alt61=4;
                        }
                        break;
                    case 47:
                        {
                        alt61=5;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_ID:
                    case RULE_INT:
                    case RULE_HEX:
                    case RULE_DECIMAL:
                    case RULE_BLOCK:
                    case RULE_MSG:
                    case RULE_TX:
                    case RULE_NOW:
                    case 28:
                    case 38:
                    case 42:
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
                    case 169:
                    case 170:
                    case 171:
                    case 172:
                    case 173:
                    case 204:
                    case 205:
                    case 216:
                    case 217:
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
                            // InternalTryIde.g:3763:4: this_ContinueStatement_5= ruleContinueStatement
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
                            // InternalTryIde.g:3772:4: this_BreakStatement_6= ruleBreakStatement
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
                            // InternalTryIde.g:3781:4: this_ReturnStatement_7= ruleReturnStatement
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
                            // InternalTryIde.g:3790:4: this_ThrowStatement_8= ruleThrowStatement
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
                            // InternalTryIde.g:3799:4: this_DeleteStatement_9= ruleDeleteStatement
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
                            // InternalTryIde.g:3808:4: this_SimpleStatement_10= ruleSimpleStatement
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
    // InternalTryIde.g:3821:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // InternalTryIde.g:3821:56: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // InternalTryIde.g:3822:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
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
    // InternalTryIde.g:3828:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3834:2: ( (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) )
            // InternalTryIde.g:3835:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            {
            // InternalTryIde.g:3835:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            // InternalTryIde.g:3836:3: otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
              		
            }
            // InternalTryIde.g:3840:3: ( (lv_variable_1_0= ruleQualifiedIdentifier ) )
            // InternalTryIde.g:3841:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            {
            // InternalTryIde.g:3841:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            // InternalTryIde.g:3842:5: lv_variable_1_0= ruleQualifiedIdentifier
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
              						"org.unicam.tryIde.TryIde.QualifiedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:3867:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalTryIde.g:3867:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalTryIde.g:3868:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalTryIde.g:3874:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) ;
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
            // InternalTryIde.g:3880:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) )
            // InternalTryIde.g:3881:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            {
            // InternalTryIde.g:3881:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            // InternalTryIde.g:3882:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryIde.g:3890:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalTryIde.g:3891:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalTryIde.g:3891:4: (lv_condition_2_0= ruleExpression )
            // InternalTryIde.g:3892:5: lv_condition_2_0= ruleExpression
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
              						"org.unicam.tryIde.TryIde.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalTryIde.g:3913:3: ( (lv_trueBody_4_0= ruleStatement ) )
            // InternalTryIde.g:3914:4: (lv_trueBody_4_0= ruleStatement )
            {
            // InternalTryIde.g:3914:4: (lv_trueBody_4_0= ruleStatement )
            // InternalTryIde.g:3915:5: lv_trueBody_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getTrueBodyStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_50);
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
              						"org.unicam.tryIde.TryIde.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:3932:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==49) ) {
                int LA63_1 = input.LA(2);

                if ( (synpred1_InternalTryIde()) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalTryIde.g:3933:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) )
                    {
                    // InternalTryIde.g:3933:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalTryIde.g:3934:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalTryIde.g:3940:4: ( (lv_falseBody_6_0= ruleStatement ) )
                    // InternalTryIde.g:3941:5: (lv_falseBody_6_0= ruleStatement )
                    {
                    // InternalTryIde.g:3941:5: (lv_falseBody_6_0= ruleStatement )
                    // InternalTryIde.g:3942:6: lv_falseBody_6_0= ruleStatement
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
                      							"org.unicam.tryIde.TryIde.Statement");
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
    // InternalTryIde.g:3964:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalTryIde.g:3964:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalTryIde.g:3965:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalTryIde.g:3971:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:3977:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) )
            // InternalTryIde.g:3978:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // InternalTryIde.g:3978:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            // InternalTryIde.g:3979:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryIde.g:3987:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalTryIde.g:3988:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalTryIde.g:3988:4: (lv_condition_2_0= ruleExpression )
            // InternalTryIde.g:3989:5: lv_condition_2_0= ruleExpression
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
              						"org.unicam.tryIde.TryIde.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalTryIde.g:4010:3: ( (lv_body_4_0= ruleStatement ) )
            // InternalTryIde.g:4011:4: (lv_body_4_0= ruleStatement )
            {
            // InternalTryIde.g:4011:4: (lv_body_4_0= ruleStatement )
            // InternalTryIde.g:4012:5: lv_body_4_0= ruleStatement
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
              						"org.unicam.tryIde.TryIde.Statement");
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
    // InternalTryIde.g:4033:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalTryIde.g:4033:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalTryIde.g:4034:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalTryIde.g:4040:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) ;
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
            // InternalTryIde.g:4046:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) )
            // InternalTryIde.g:4047:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            {
            // InternalTryIde.g:4047:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            // InternalTryIde.g:4048:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryIde.g:4056:3: ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_NOW)||LA64_0==28||LA64_0==38||LA64_0==42||(LA64_0>=63 && LA64_0<=173)||(LA64_0>=204 && LA64_0<=205)||(LA64_0>=216 && LA64_0<=217)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTryIde.g:4057:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    {
                    // InternalTryIde.g:4057:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    // InternalTryIde.g:4058:5: lv_initExpression_2_0= ruleSimpleStatement2
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
                      						"org.unicam.tryIde.TryIde.SimpleStatement2");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryIde.g:4075:3: ( ( ';' )=>otherlv_3= ';' )
            // InternalTryIde.g:4076:4: ( ';' )=>otherlv_3= ';'
            {
            otherlv_3=(Token)match(input,18,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
              			
            }

            }

            // InternalTryIde.g:4082:3: ( (lv_conditionExpression_4_0= ruleExpression ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_NOW)||LA65_0==28||(LA65_0>=63 && LA65_0<=173)||(LA65_0>=204 && LA65_0<=205)||(LA65_0>=216 && LA65_0<=217)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalTryIde.g:4083:4: (lv_conditionExpression_4_0= ruleExpression )
                    {
                    // InternalTryIde.g:4083:4: (lv_conditionExpression_4_0= ruleExpression )
                    // InternalTryIde.g:4084:5: lv_conditionExpression_4_0= ruleExpression
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
                      						"org.unicam.tryIde.TryIde.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_5());
              		
            }
            // InternalTryIde.g:4105:3: ( (lv_loopExpression_6_0= ruleExpressionStatement ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_NOW)||LA66_0==28||(LA66_0>=63 && LA66_0<=173)||(LA66_0>=204 && LA66_0<=205)||(LA66_0>=216 && LA66_0<=217)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTryIde.g:4106:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    {
                    // InternalTryIde.g:4106:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    // InternalTryIde.g:4107:5: lv_loopExpression_6_0= ruleExpressionStatement
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
                      						"org.unicam.tryIde.TryIde.ExpressionStatement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalTryIde.g:4128:3: ( (lv_body_8_0= ruleStatement ) )
            // InternalTryIde.g:4129:4: (lv_body_8_0= ruleStatement )
            {
            // InternalTryIde.g:4129:4: (lv_body_8_0= ruleStatement )
            // InternalTryIde.g:4130:5: lv_body_8_0= ruleStatement
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
              						"org.unicam.tryIde.TryIde.Statement");
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


    // $ANTLR start "entryRuleBlocks"
    // InternalTryIde.g:4151:1: entryRuleBlocks returns [EObject current=null] : iv_ruleBlocks= ruleBlocks EOF ;
    public final EObject entryRuleBlocks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlocks = null;


        try {
            // InternalTryIde.g:4151:47: (iv_ruleBlocks= ruleBlocks EOF )
            // InternalTryIde.g:4152:2: iv_ruleBlocks= ruleBlocks EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlocksRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlocks=ruleBlocks();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlocks; 
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
    // $ANTLR end "entryRuleBlocks"


    // $ANTLR start "ruleBlocks"
    // InternalTryIde.g:4158:1: ruleBlocks returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleBlocks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:4164:2: ( (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) )
            // InternalTryIde.g:4165:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            {
            // InternalTryIde.g:4165:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            // InternalTryIde.g:4166:3: otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlocksAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalTryIde.g:4170:3: ()
            // InternalTryIde.g:4171:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlocksAccess().getBlocksAction_1(),
              					current);
              			
            }

            }

            // InternalTryIde.g:4177:3: ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_STRING && LA68_0<=RULE_NOW)||LA68_0==22||LA68_0==28||LA68_0==38||LA68_0==42||(LA68_0>=47 && LA68_0<=48)||(LA68_0>=50 && LA68_0<=56)||(LA68_0>=63 && LA68_0<=173)||(LA68_0>=204 && LA68_0<=205)||(LA68_0>=216 && LA68_0<=217)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalTryIde.g:4178:4: ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )*
                    {
                    // InternalTryIde.g:4178:4: ( (lv_statements_2_0= ruleStatement ) )
                    // InternalTryIde.g:4179:5: (lv_statements_2_0= ruleStatement )
                    {
                    // InternalTryIde.g:4179:5: (lv_statements_2_0= ruleStatement )
                    // InternalTryIde.g:4180:6: lv_statements_2_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlocksAccess().getStatementsStatementParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
                    lv_statements_2_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBlocksRule());
                      						}
                      						add(
                      							current,
                      							"statements",
                      							lv_statements_2_0,
                      							"org.unicam.tryIde.TryIde.Statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTryIde.g:4197:4: ( (lv_statements_3_0= ruleStatement ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_NOW)||LA67_0==22||LA67_0==28||LA67_0==38||LA67_0==42||(LA67_0>=47 && LA67_0<=48)||(LA67_0>=50 && LA67_0<=56)||(LA67_0>=63 && LA67_0<=173)||(LA67_0>=204 && LA67_0<=205)||(LA67_0>=216 && LA67_0<=217)) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalTryIde.g:4198:5: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // InternalTryIde.g:4198:5: (lv_statements_3_0= ruleStatement )
                    	    // InternalTryIde.g:4199:6: lv_statements_3_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBlocksAccess().getStatementsStatementParserRuleCall_2_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_54);
                    	    lv_statements_3_0=ruleStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getBlocksRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"statements",
                    	      							lv_statements_3_0,
                    	      							"org.unicam.tryIde.TryIde.Statement");
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

            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlocksAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleBlocks"


    // $ANTLR start "entryRuleContinueStatement"
    // InternalTryIde.g:4225:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // InternalTryIde.g:4225:58: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalTryIde.g:4226:2: iv_ruleContinueStatement= ruleContinueStatement EOF
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
    // InternalTryIde.g:4232:1: ruleContinueStatement returns [EObject current=null] : (otherlv_0= 'continue' () otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTryIde.g:4238:2: ( (otherlv_0= 'continue' () otherlv_2= ';' ) )
            // InternalTryIde.g:4239:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            {
            // InternalTryIde.g:4239:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            // InternalTryIde.g:4240:3: otherlv_0= 'continue' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContinueStatementAccess().getContinueKeyword_0());
              		
            }
            // InternalTryIde.g:4244:3: ()
            // InternalTryIde.g:4245:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContinueStatementAccess().getContinueAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:4259:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalTryIde.g:4259:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalTryIde.g:4260:2: iv_ruleBreakStatement= ruleBreakStatement EOF
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
    // InternalTryIde.g:4266:1: ruleBreakStatement returns [EObject current=null] : (otherlv_0= 'break' () otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTryIde.g:4272:2: ( (otherlv_0= 'break' () otherlv_2= ';' ) )
            // InternalTryIde.g:4273:2: (otherlv_0= 'break' () otherlv_2= ';' )
            {
            // InternalTryIde.g:4273:2: (otherlv_0= 'break' () otherlv_2= ';' )
            // InternalTryIde.g:4274:3: otherlv_0= 'break' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakStatementAccess().getBreakKeyword_0());
              		
            }
            // InternalTryIde.g:4278:3: ()
            // InternalTryIde.g:4279:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBreakStatementAccess().getBreakStatementAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:4293:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalTryIde.g:4293:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalTryIde.g:4294:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalTryIde.g:4300:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:4306:2: ( (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) )
            // InternalTryIde.g:4307:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            {
            // InternalTryIde.g:4307:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            // InternalTryIde.g:4308:3: otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
              		
            }
            // InternalTryIde.g:4312:3: ()
            // InternalTryIde.g:4313:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_1(),
              					current);
              			
            }

            }

            // InternalTryIde.g:4319:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_NOW)||LA69_0==28||(LA69_0>=63 && LA69_0<=173)||(LA69_0>=204 && LA69_0<=205)||(LA69_0>=216 && LA69_0<=217)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTryIde.g:4320:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalTryIde.g:4320:4: (lv_expression_2_0= ruleExpression )
                    // InternalTryIde.g:4321:5: lv_expression_2_0= ruleExpression
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
                      						"org.unicam.tryIde.TryIde.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:4346:1: entryRuleThrowStatement returns [EObject current=null] : iv_ruleThrowStatement= ruleThrowStatement EOF ;
    public final EObject entryRuleThrowStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStatement = null;


        try {
            // InternalTryIde.g:4346:55: (iv_ruleThrowStatement= ruleThrowStatement EOF )
            // InternalTryIde.g:4347:2: iv_ruleThrowStatement= ruleThrowStatement EOF
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
    // InternalTryIde.g:4353:1: ruleThrowStatement returns [EObject current=null] : (otherlv_0= 'throw' () otherlv_2= ';' ) ;
    public final EObject ruleThrowStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTryIde.g:4359:2: ( (otherlv_0= 'throw' () otherlv_2= ';' ) )
            // InternalTryIde.g:4360:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            {
            // InternalTryIde.g:4360:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            // InternalTryIde.g:4361:3: otherlv_0= 'throw' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getThrowStatementAccess().getThrowKeyword_0());
              		
            }
            // InternalTryIde.g:4365:3: ()
            // InternalTryIde.g:4366:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getThrowStatementAccess().getThrowStatementAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:4380:1: entryRulePlaceHolderStatement returns [EObject current=null] : iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF ;
    public final EObject entryRulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceHolderStatement = null;


        try {
            // InternalTryIde.g:4380:61: (iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF )
            // InternalTryIde.g:4381:2: iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF
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
    // InternalTryIde.g:4387:1: rulePlaceHolderStatement returns [EObject current=null] : (otherlv_0= '_' () ) ;
    public final EObject rulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:4393:2: ( (otherlv_0= '_' () ) )
            // InternalTryIde.g:4394:2: (otherlv_0= '_' () )
            {
            // InternalTryIde.g:4394:2: (otherlv_0= '_' () )
            // InternalTryIde.g:4395:3: otherlv_0= '_' ()
            {
            otherlv_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlaceHolderStatementAccess().get_Keyword_0());
              		
            }
            // InternalTryIde.g:4399:3: ()
            // InternalTryIde.g:4400:4: 
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
    // InternalTryIde.g:4410:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTryIde.g:4410:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTryIde.g:4411:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalTryIde.g:4417:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:4423:2: (this_Assignment_0= ruleAssignment )
            // InternalTryIde.g:4424:2: this_Assignment_0= ruleAssignment
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
    // InternalTryIde.g:4435:1: entryRuleSpecialExpression returns [EObject current=null] : iv_ruleSpecialExpression= ruleSpecialExpression EOF ;
    public final EObject entryRuleSpecialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialExpression = null;


        try {
            // InternalTryIde.g:4435:58: (iv_ruleSpecialExpression= ruleSpecialExpression EOF )
            // InternalTryIde.g:4436:2: iv_ruleSpecialExpression= ruleSpecialExpression EOF
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
    // InternalTryIde.g:4442:1: ruleSpecialExpression returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) ;
    public final EObject ruleSpecialExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_fieldOrMethod_1_0 = null;

        EObject lv_qualifiers_2_1 = null;

        EObject lv_qualifiers_2_2 = null;



        	enterRule();

        try {
            // InternalTryIde.g:4448:2: ( ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) )
            // InternalTryIde.g:4449:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            {
            // InternalTryIde.g:4449:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            // InternalTryIde.g:4450:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            {
            // InternalTryIde.g:4450:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) )
            // InternalTryIde.g:4451:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            {
            // InternalTryIde.g:4451:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            // InternalTryIde.g:4452:5: lv_type_0_0= ruleSpecialExpressionTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialExpressionAccess().getTypeSpecialExpressionTypeEnumEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_42);
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
              						"org.unicam.tryIde.TryIde.SpecialExpressionTypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryIde.g:4469:3: ( (lv_fieldOrMethod_1_0= ruleField ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==43) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTryIde.g:4470:4: (lv_fieldOrMethod_1_0= ruleField )
                    {
                    // InternalTryIde.g:4470:4: (lv_fieldOrMethod_1_0= ruleField )
                    // InternalTryIde.g:4471:5: lv_fieldOrMethod_1_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecialExpressionAccess().getFieldOrMethodFieldParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_42);
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
                      						"org.unicam.tryIde.TryIde.Field");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryIde.g:4488:3: ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==28||LA72_0==40) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalTryIde.g:4489:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    {
            	    // InternalTryIde.g:4489:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    // InternalTryIde.g:4490:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    {
            	    // InternalTryIde.g:4490:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==40) ) {
            	        alt71=1;
            	    }
            	    else if ( (LA71_0==28) ) {
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
            	            // InternalTryIde.g:4491:6: lv_qualifiers_2_1= ruleIndex
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getSpecialExpressionAccess().getQualifiersIndexParserRuleCall_2_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_42);
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
            	              							"org.unicam.tryIde.TryIde.Index");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTryIde.g:4507:6: lv_qualifiers_2_2= ruleArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getSpecialExpressionAccess().getQualifiersArgumentsParserRuleCall_2_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_42);
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
            	              							"org.unicam.tryIde.TryIde.Arguments");
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
    // InternalTryIde.g:4529:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalTryIde.g:4529:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalTryIde.g:4530:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalTryIde.g:4536:1: ruleAssignment returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) ;
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
            // InternalTryIde.g:4542:2: ( (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) )
            // InternalTryIde.g:4543:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            {
            // InternalTryIde.g:4543:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            // InternalTryIde.g:4544:3: this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getBinaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_BinaryExpression_0=ruleBinaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BinaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:4552:3: ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            int alt74=3;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==36||(LA74_0>=181 && LA74_0<=191)) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_ID) ) {
                alt74=2;
            }
            switch (alt74) {
                case 1 :
                    // InternalTryIde.g:4553:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // InternalTryIde.g:4553:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    // InternalTryIde.g:4554:5: () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // InternalTryIde.g:4554:5: ()
                    // InternalTryIde.g:4555:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryIde.g:4561:5: ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) )
                    // InternalTryIde.g:4562:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    {
                    // InternalTryIde.g:4562:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    // InternalTryIde.g:4563:7: lv_assignmentOp_2_0= ruleAssignmentOpEnum
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
                      								"org.unicam.tryIde.TryIde.AssignmentOpEnum");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTryIde.g:4580:5: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalTryIde.g:4581:6: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalTryIde.g:4581:6: (lv_expression_3_0= ruleExpression )
                    // InternalTryIde.g:4582:7: lv_expression_3_0= ruleExpression
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
                      								"org.unicam.tryIde.TryIde.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:4601:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    {
                    // InternalTryIde.g:4601:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    // InternalTryIde.g:4602:5: () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    {
                    // InternalTryIde.g:4602:5: ()
                    // InternalTryIde.g:4603:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getVariableDeclarationExpressionTypeAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryIde.g:4609:5: ( (lv_variable_5_0= ruleVariable ) )
                    // InternalTryIde.g:4610:6: (lv_variable_5_0= ruleVariable )
                    {
                    // InternalTryIde.g:4610:6: (lv_variable_5_0= ruleVariable )
                    // InternalTryIde.g:4611:7: lv_variable_5_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_30);
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
                      								"org.unicam.tryIde.TryIde.Variable");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTryIde.g:4628:5: (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==36) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalTryIde.g:4629:6: otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) )
                            {
                            otherlv_6=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1_2_0());
                              					
                            }
                            // InternalTryIde.g:4633:6: ( (lv_expression_7_0= ruleExpression ) )
                            // InternalTryIde.g:4634:7: (lv_expression_7_0= ruleExpression )
                            {
                            // InternalTryIde.g:4634:7: (lv_expression_7_0= ruleExpression )
                            // InternalTryIde.g:4635:8: lv_expression_7_0= ruleExpression
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
                              									"org.unicam.tryIde.TryIde.Expression");
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
    // InternalTryIde.g:4659:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalTryIde.g:4659:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalTryIde.g:4660:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalTryIde.g:4666:1: ruleBinaryExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:4672:2: (this_Or_0= ruleOr )
            // InternalTryIde.g:4673:2: this_Or_0= ruleOr
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
    // InternalTryIde.g:4684:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalTryIde.g:4684:43: (iv_ruleOr= ruleOr EOF )
            // InternalTryIde.g:4685:2: iv_ruleOr= ruleOr EOF
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
    // InternalTryIde.g:4691:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:4697:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalTryIde.g:4698:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalTryIde.g:4698:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalTryIde.g:4699:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:4707:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==57) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalTryIde.g:4708:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalTryIde.g:4708:4: ()
            	    // InternalTryIde.g:4709:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,57,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalTryIde.g:4719:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalTryIde.g:4720:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalTryIde.g:4720:5: (lv_right_3_0= ruleAnd )
            	    // InternalTryIde.g:4721:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
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
            	      							"org.unicam.tryIde.TryIde.And");
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
    // InternalTryIde.g:4743:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalTryIde.g:4743:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalTryIde.g:4744:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalTryIde.g:4750:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:4756:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalTryIde.g:4757:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalTryIde.g:4757:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalTryIde.g:4758:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:4766:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==58) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalTryIde.g:4767:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalTryIde.g:4767:4: ()
            	    // InternalTryIde.g:4768:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,58,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalTryIde.g:4778:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalTryIde.g:4779:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalTryIde.g:4779:5: (lv_right_3_0= ruleEquality )
            	    // InternalTryIde.g:4780:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
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
            	      							"org.unicam.tryIde.TryIde.Equality");
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
    // InternalTryIde.g:4802:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalTryIde.g:4802:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalTryIde.g:4803:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalTryIde.g:4809:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_equalityOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:4815:2: ( (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalTryIde.g:4816:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalTryIde.g:4816:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalTryIde.g:4817:3: this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:4825:3: ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=192 && LA77_0<=193)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalTryIde.g:4826:4: () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalTryIde.g:4826:4: ()
            	    // InternalTryIde.g:4827:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryIde.g:4833:4: ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) )
            	    // InternalTryIde.g:4834:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    {
            	    // InternalTryIde.g:4834:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    // InternalTryIde.g:4835:6: lv_equalityOp_2_0= ruleEqualityOpEnum
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
            	      							"org.unicam.tryIde.TryIde.EqualityOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTryIde.g:4852:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalTryIde.g:4853:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalTryIde.g:4853:5: (lv_right_3_0= ruleComparison )
            	    // InternalTryIde.g:4854:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
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
            	      							"org.unicam.tryIde.TryIde.Comparison");
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
    // InternalTryIde.g:4876:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalTryIde.g:4876:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalTryIde.g:4877:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalTryIde.g:4883:1: ruleComparison returns [EObject current=null] : (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BitOr_0 = null;

        Enumerator lv_comparisonOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:4889:2: ( (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) )
            // InternalTryIde.g:4890:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            {
            // InternalTryIde.g:4890:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            // InternalTryIde.g:4891:3: this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getBitOrParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_BitOr_0=ruleBitOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitOr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:4899:3: ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=194 && LA78_0<=198)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalTryIde.g:4900:4: () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) )
            	    {
            	    // InternalTryIde.g:4900:4: ()
            	    // InternalTryIde.g:4901:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryIde.g:4907:4: ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) )
            	    // InternalTryIde.g:4908:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    {
            	    // InternalTryIde.g:4908:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    // InternalTryIde.g:4909:6: lv_comparisonOp_2_0= ruleComparisonOpEnum
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
            	      							"org.unicam.tryIde.TryIde.ComparisonOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTryIde.g:4926:4: ( (lv_right_3_0= ruleBitOr ) )
            	    // InternalTryIde.g:4927:5: (lv_right_3_0= ruleBitOr )
            	    {
            	    // InternalTryIde.g:4927:5: (lv_right_3_0= ruleBitOr )
            	    // InternalTryIde.g:4928:6: lv_right_3_0= ruleBitOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightBitOrParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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
            	      							"org.unicam.tryIde.TryIde.BitOr");
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
    // InternalTryIde.g:4950:1: entryRuleBitOr returns [EObject current=null] : iv_ruleBitOr= ruleBitOr EOF ;
    public final EObject entryRuleBitOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitOr = null;


        try {
            // InternalTryIde.g:4950:46: (iv_ruleBitOr= ruleBitOr EOF )
            // InternalTryIde.g:4951:2: iv_ruleBitOr= ruleBitOr EOF
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
    // InternalTryIde.g:4957:1: ruleBitOr returns [EObject current=null] : (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) ;
    public final EObject ruleBitOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitXor_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:4963:2: ( (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) )
            // InternalTryIde.g:4964:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            {
            // InternalTryIde.g:4964:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            // InternalTryIde.g:4965:3: this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitOrAccess().getBitXorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_BitXor_0=ruleBitXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitXor_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:4973:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==59) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalTryIde.g:4974:4: () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) )
            	    {
            	    // InternalTryIde.g:4974:4: ()
            	    // InternalTryIde.g:4975:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitOrAccess().getBitOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,59,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitOrAccess().getVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalTryIde.g:4985:4: ( (lv_right_3_0= ruleBitXor ) )
            	    // InternalTryIde.g:4986:5: (lv_right_3_0= ruleBitXor )
            	    {
            	    // InternalTryIde.g:4986:5: (lv_right_3_0= ruleBitXor )
            	    // InternalTryIde.g:4987:6: lv_right_3_0= ruleBitXor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitOrAccess().getRightBitXorParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
            	      							"org.unicam.tryIde.TryIde.BitXor");
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
    // InternalTryIde.g:5009:1: entryRuleBitXor returns [EObject current=null] : iv_ruleBitXor= ruleBitXor EOF ;
    public final EObject entryRuleBitXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitXor = null;


        try {
            // InternalTryIde.g:5009:47: (iv_ruleBitXor= ruleBitXor EOF )
            // InternalTryIde.g:5010:2: iv_ruleBitXor= ruleBitXor EOF
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
    // InternalTryIde.g:5016:1: ruleBitXor returns [EObject current=null] : (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) ;
    public final EObject ruleBitXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitAnd_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5022:2: ( (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) )
            // InternalTryIde.g:5023:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            {
            // InternalTryIde.g:5023:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            // InternalTryIde.g:5024:3: this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitXorAccess().getBitAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_BitAnd_0=ruleBitAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitAnd_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:5032:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==60) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalTryIde.g:5033:4: () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) )
            	    {
            	    // InternalTryIde.g:5033:4: ()
            	    // InternalTryIde.g:5034:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitXorAccess().getBitXorLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitXorAccess().getCircumflexAccentKeyword_1_1());
            	      			
            	    }
            	    // InternalTryIde.g:5044:4: ( (lv_right_3_0= ruleBitAnd ) )
            	    // InternalTryIde.g:5045:5: (lv_right_3_0= ruleBitAnd )
            	    {
            	    // InternalTryIde.g:5045:5: (lv_right_3_0= ruleBitAnd )
            	    // InternalTryIde.g:5046:6: lv_right_3_0= ruleBitAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitXorAccess().getRightBitAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
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
            	      							"org.unicam.tryIde.TryIde.BitAnd");
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
    // InternalTryIde.g:5068:1: entryRuleBitAnd returns [EObject current=null] : iv_ruleBitAnd= ruleBitAnd EOF ;
    public final EObject entryRuleBitAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitAnd = null;


        try {
            // InternalTryIde.g:5068:47: (iv_ruleBitAnd= ruleBitAnd EOF )
            // InternalTryIde.g:5069:2: iv_ruleBitAnd= ruleBitAnd EOF
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
    // InternalTryIde.g:5075:1: ruleBitAnd returns [EObject current=null] : (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) ;
    public final EObject ruleBitAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Shift_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5081:2: ( (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) )
            // InternalTryIde.g:5082:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            {
            // InternalTryIde.g:5082:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            // InternalTryIde.g:5083:3: this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitAndAccess().getShiftParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_Shift_0=ruleShift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Shift_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:5091:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==61) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalTryIde.g:5092:4: () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) )
            	    {
            	    // InternalTryIde.g:5092:4: ()
            	    // InternalTryIde.g:5093:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitAndAccess().getBitAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitAndAccess().getAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalTryIde.g:5103:4: ( (lv_right_3_0= ruleShift ) )
            	    // InternalTryIde.g:5104:5: (lv_right_3_0= ruleShift )
            	    {
            	    // InternalTryIde.g:5104:5: (lv_right_3_0= ruleShift )
            	    // InternalTryIde.g:5105:6: lv_right_3_0= ruleShift
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitAndAccess().getRightShiftParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
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
            	      							"org.unicam.tryIde.TryIde.Shift");
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
    // InternalTryIde.g:5127:1: entryRuleShift returns [EObject current=null] : iv_ruleShift= ruleShift EOF ;
    public final EObject entryRuleShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShift = null;


        try {
            // InternalTryIde.g:5127:46: (iv_ruleShift= ruleShift EOF )
            // InternalTryIde.g:5128:2: iv_ruleShift= ruleShift EOF
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
    // InternalTryIde.g:5134:1: ruleShift returns [EObject current=null] : (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) ;
    public final EObject ruleShift() throws RecognitionException {
        EObject current = null;

        EObject this_AddSub_0 = null;

        Enumerator lv_shiftOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5140:2: ( (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) )
            // InternalTryIde.g:5141:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            {
            // InternalTryIde.g:5141:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            // InternalTryIde.g:5142:3: this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftAccess().getAddSubParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_63);
            this_AddSub_0=ruleAddSub();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddSub_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:5150:3: ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( ((LA82_0>=199 && LA82_0<=201)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalTryIde.g:5151:4: () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) )
            	    {
            	    // InternalTryIde.g:5151:4: ()
            	    // InternalTryIde.g:5152:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getShiftAccess().getShiftLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryIde.g:5158:4: ( (lv_shiftOp_2_0= ruleShiftOpEnum ) )
            	    // InternalTryIde.g:5159:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    {
            	    // InternalTryIde.g:5159:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    // InternalTryIde.g:5160:6: lv_shiftOp_2_0= ruleShiftOpEnum
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
            	      							"org.unicam.tryIde.TryIde.ShiftOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTryIde.g:5177:4: ( (lv_right_3_0= ruleAddSub ) )
            	    // InternalTryIde.g:5178:5: (lv_right_3_0= ruleAddSub )
            	    {
            	    // InternalTryIde.g:5178:5: (lv_right_3_0= ruleAddSub )
            	    // InternalTryIde.g:5179:6: lv_right_3_0= ruleAddSub
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftAccess().getRightAddSubParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
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
            	      							"org.unicam.tryIde.TryIde.AddSub");
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
    // InternalTryIde.g:5201:1: entryRuleAddSub returns [EObject current=null] : iv_ruleAddSub= ruleAddSub EOF ;
    public final EObject entryRuleAddSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSub = null;


        try {
            // InternalTryIde.g:5201:47: (iv_ruleAddSub= ruleAddSub EOF )
            // InternalTryIde.g:5202:2: iv_ruleAddSub= ruleAddSub EOF
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
    // InternalTryIde.g:5208:1: ruleAddSub returns [EObject current=null] : (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) ;
    public final EObject ruleAddSub() throws RecognitionException {
        EObject current = null;

        EObject this_MulDivMod_0 = null;

        Enumerator lv_additionOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5214:2: ( (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) )
            // InternalTryIde.g:5215:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            {
            // InternalTryIde.g:5215:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            // InternalTryIde.g:5216:3: this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddSubAccess().getMulDivModParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_64);
            this_MulDivMod_0=ruleMulDivMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulDivMod_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:5224:3: ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==65) && (synpred3_InternalTryIde())) {
                    alt83=1;
                }
                else if ( (LA83_0==66) && (synpred3_InternalTryIde())) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalTryIde.g:5225:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    {
            	    // InternalTryIde.g:5240:4: ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    // InternalTryIde.g:5241:5: () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) )
            	    {
            	    // InternalTryIde.g:5241:5: ()
            	    // InternalTryIde.g:5242:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAddSubAccess().getAddSubLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalTryIde.g:5248:5: ( (lv_additionOp_2_0= ruleAdditionOpEnum ) )
            	    // InternalTryIde.g:5249:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    {
            	    // InternalTryIde.g:5249:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    // InternalTryIde.g:5250:7: lv_additionOp_2_0= ruleAdditionOpEnum
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
            	      								"org.unicam.tryIde.TryIde.AdditionOpEnum");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalTryIde.g:5267:5: ( (lv_right_3_0= ruleMulDivMod ) )
            	    // InternalTryIde.g:5268:6: (lv_right_3_0= ruleMulDivMod )
            	    {
            	    // InternalTryIde.g:5268:6: (lv_right_3_0= ruleMulDivMod )
            	    // InternalTryIde.g:5269:7: lv_right_3_0= ruleMulDivMod
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddSubAccess().getRightMulDivModParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_64);
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
            	      								"org.unicam.tryIde.TryIde.MulDivMod");
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
    // InternalTryIde.g:5292:1: entryRuleMulDivMod returns [EObject current=null] : iv_ruleMulDivMod= ruleMulDivMod EOF ;
    public final EObject entryRuleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDivMod = null;


        try {
            // InternalTryIde.g:5292:50: (iv_ruleMulDivMod= ruleMulDivMod EOF )
            // InternalTryIde.g:5293:2: iv_ruleMulDivMod= ruleMulDivMod EOF
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
    // InternalTryIde.g:5299:1: ruleMulDivMod returns [EObject current=null] : (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) ;
    public final EObject ruleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject this_Exponent_0 = null;

        Enumerator lv_multipliciativeOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5305:2: ( (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) )
            // InternalTryIde.g:5306:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            {
            // InternalTryIde.g:5306:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            // InternalTryIde.g:5307:3: this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulDivModAccess().getExponentParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_65);
            this_Exponent_0=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Exponent_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:5315:3: ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==19||(LA84_0>=202 && LA84_0<=203)) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalTryIde.g:5316:4: () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) )
            	    {
            	    // InternalTryIde.g:5316:4: ()
            	    // InternalTryIde.g:5317:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulDivModAccess().getMulDivModLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryIde.g:5323:4: ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) )
            	    // InternalTryIde.g:5324:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    {
            	    // InternalTryIde.g:5324:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    // InternalTryIde.g:5325:6: lv_multipliciativeOp_2_0= ruleMulDivModOpEnum
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
            	      							"org.unicam.tryIde.TryIde.MulDivModOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTryIde.g:5342:4: ( (lv_right_3_0= ruleExponent ) )
            	    // InternalTryIde.g:5343:5: (lv_right_3_0= ruleExponent )
            	    {
            	    // InternalTryIde.g:5343:5: (lv_right_3_0= ruleExponent )
            	    // InternalTryIde.g:5344:6: lv_right_3_0= ruleExponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulDivModAccess().getRightExponentParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
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
            	      							"org.unicam.tryIde.TryIde.Exponent");
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
    // InternalTryIde.g:5366:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalTryIde.g:5366:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalTryIde.g:5367:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalTryIde.g:5373:1: ruleExponent returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5379:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalTryIde.g:5380:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalTryIde.g:5380:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalTryIde.g:5381:3: this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExponentAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_66);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:5389:3: ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==62) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalTryIde.g:5390:4: () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalTryIde.g:5390:4: ()
            	    // InternalTryIde.g:5391:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExponentAccess().getExponentLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,62,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
            	      			
            	    }
            	    // InternalTryIde.g:5401:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalTryIde.g:5402:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalTryIde.g:5402:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalTryIde.g:5403:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExponentAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_66);
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
            	      							"org.unicam.tryIde.TryIde.UnaryExpression");
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
    // InternalTryIde.g:5425:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalTryIde.g:5425:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalTryIde.g:5426:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalTryIde.g:5432:1: ruleUnaryExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_BinaryNotExpression_1 = null;

        EObject this_SignExpression_2 = null;

        EObject this_NewExpression_3 = null;

        EObject this_PreExpression_4 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5438:2: ( (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) )
            // InternalTryIde.g:5439:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            {
            // InternalTryIde.g:5439:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            int alt86=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt86=1;
                }
                break;
            case 64:
                {
                alt86=2;
                }
                break;
            case 65:
            case 66:
                {
                alt86=3;
                }
                break;
            case 67:
                {
                alt86=4;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case RULE_NOW:
            case 28:
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
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 204:
            case 205:
            case 216:
            case 217:
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
                    // InternalTryIde.g:5440:3: this_NotExpression_0= ruleNotExpression
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
                    // InternalTryIde.g:5449:3: this_BinaryNotExpression_1= ruleBinaryNotExpression
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
                    // InternalTryIde.g:5458:3: this_SignExpression_2= ruleSignExpression
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
                    // InternalTryIde.g:5467:3: this_NewExpression_3= ruleNewExpression
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
                    // InternalTryIde.g:5476:3: this_PreExpression_4= rulePreExpression
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
    // InternalTryIde.g:5488:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalTryIde.g:5488:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalTryIde.g:5489:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalTryIde.g:5495:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5501:2: ( (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalTryIde.g:5502:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalTryIde.g:5502:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalTryIde.g:5503:3: otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalTryIde.g:5507:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalTryIde.g:5508:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalTryIde.g:5508:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalTryIde.g:5509:5: lv_expression_1_0= ruleUnaryExpression
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
              						"org.unicam.tryIde.TryIde.UnaryExpression");
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
    // InternalTryIde.g:5530:1: entryRuleBinaryNotExpression returns [EObject current=null] : iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF ;
    public final EObject entryRuleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryNotExpression = null;


        try {
            // InternalTryIde.g:5530:60: (iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF )
            // InternalTryIde.g:5531:2: iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF
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
    // InternalTryIde.g:5537:1: ruleBinaryNotExpression returns [EObject current=null] : (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5543:2: ( (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalTryIde.g:5544:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalTryIde.g:5544:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalTryIde.g:5545:3: otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBinaryNotExpressionAccess().getTildeKeyword_0());
              		
            }
            // InternalTryIde.g:5549:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalTryIde.g:5550:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalTryIde.g:5550:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalTryIde.g:5551:5: lv_expression_1_0= ruleUnaryExpression
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
              						"org.unicam.tryIde.TryIde.UnaryExpression");
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
    // InternalTryIde.g:5572:1: entryRuleSignExpression returns [EObject current=null] : iv_ruleSignExpression= ruleSignExpression EOF ;
    public final EObject entryRuleSignExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignExpression = null;


        try {
            // InternalTryIde.g:5572:55: (iv_ruleSignExpression= ruleSignExpression EOF )
            // InternalTryIde.g:5573:2: iv_ruleSignExpression= ruleSignExpression EOF
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
    // InternalTryIde.g:5579:1: ruleSignExpression returns [EObject current=null] : ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleSignExpression() throws RecognitionException {
        EObject current = null;

        Token lv_signOp_0_1=null;
        Token lv_signOp_0_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5585:2: ( ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalTryIde.g:5586:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalTryIde.g:5586:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalTryIde.g:5587:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            // InternalTryIde.g:5587:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) )
            // InternalTryIde.g:5588:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            {
            // InternalTryIde.g:5588:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            // InternalTryIde.g:5589:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            {
            // InternalTryIde.g:5589:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==65) ) {
                alt87=1;
            }
            else if ( (LA87_0==66) ) {
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
                    // InternalTryIde.g:5590:6: lv_signOp_0_1= '+'
                    {
                    lv_signOp_0_1=(Token)match(input,65,FOLLOW_19); if (state.failed) return current;
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
                    // InternalTryIde.g:5601:6: lv_signOp_0_2= '-'
                    {
                    lv_signOp_0_2=(Token)match(input,66,FOLLOW_19); if (state.failed) return current;
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

            // InternalTryIde.g:5614:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalTryIde.g:5615:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalTryIde.g:5615:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalTryIde.g:5616:5: lv_expression_1_0= ruleUnaryExpression
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
              						"org.unicam.tryIde.TryIde.UnaryExpression");
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
    // InternalTryIde.g:5637:1: entryRuleNewExpression returns [EObject current=null] : iv_ruleNewExpression= ruleNewExpression EOF ;
    public final EObject entryRuleNewExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewExpression = null;


        try {
            // InternalTryIde.g:5637:54: (iv_ruleNewExpression= ruleNewExpression EOF )
            // InternalTryIde.g:5638:2: iv_ruleNewExpression= ruleNewExpression EOF
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
    // InternalTryIde.g:5644:1: ruleNewExpression returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) ;
    public final EObject ruleNewExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5650:2: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) )
            // InternalTryIde.g:5651:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            {
            // InternalTryIde.g:5651:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            // InternalTryIde.g:5652:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNewExpressionAccess().getNewKeyword_0());
              		
            }
            // InternalTryIde.g:5656:3: ( (otherlv_1= RULE_ID ) )
            // InternalTryIde.g:5657:4: (otherlv_1= RULE_ID )
            {
            // InternalTryIde.g:5657:4: (otherlv_1= RULE_ID )
            // InternalTryIde.g:5658:5: otherlv_1= RULE_ID
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

            // InternalTryIde.g:5669:3: ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            // InternalTryIde.g:5670:4: (lv_args_2_0= ruleFunctionCallListArguments )
            {
            // InternalTryIde.g:5670:4: (lv_args_2_0= ruleFunctionCallListArguments )
            // InternalTryIde.g:5671:5: lv_args_2_0= ruleFunctionCallListArguments
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
              						"org.unicam.tryIde.TryIde.FunctionCallListArguments");
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
    // InternalTryIde.g:5692:1: entryRulePreExpression returns [EObject current=null] : iv_rulePreExpression= rulePreExpression EOF ;
    public final EObject entryRulePreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreExpression = null;


        try {
            // InternalTryIde.g:5692:54: (iv_rulePreExpression= rulePreExpression EOF )
            // InternalTryIde.g:5693:2: iv_rulePreExpression= rulePreExpression EOF
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
    // InternalTryIde.g:5699:1: rulePreExpression returns [EObject current=null] : (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) ;
    public final EObject rulePreExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_PostIncDecExpression_0 = null;

        EObject this_PostIncDecExpression_2 = null;

        EObject this_PostIncDecExpression_5 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5705:2: ( (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) )
            // InternalTryIde.g:5706:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            {
            // InternalTryIde.g:5706:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            int alt88=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case RULE_NOW:
            case 28:
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
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 204:
            case 205:
            case 216:
            case 217:
                {
                alt88=1;
                }
                break;
            case 68:
                {
                alt88=2;
                }
                break;
            case 69:
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
                    // InternalTryIde.g:5707:3: this_PostIncDecExpression_0= rulePostIncDecExpression
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
                    // InternalTryIde.g:5716:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    {
                    // InternalTryIde.g:5716:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    // InternalTryIde.g:5717:4: otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression ()
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_67); if (state.failed) return current;
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
                    // InternalTryIde.g:5729:4: ()
                    // InternalTryIde.g:5730:5: 
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
                    // InternalTryIde.g:5738:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    {
                    // InternalTryIde.g:5738:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    // InternalTryIde.g:5739:4: otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression ()
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_67); if (state.failed) return current;
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
                    // InternalTryIde.g:5751:4: ()
                    // InternalTryIde.g:5752:5: 
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
    // InternalTryIde.g:5763:1: entryRulePostIncDecExpression returns [EObject current=null] : iv_rulePostIncDecExpression= rulePostIncDecExpression EOF ;
    public final EObject entryRulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostIncDecExpression = null;


        try {
            // InternalTryIde.g:5763:61: (iv_rulePostIncDecExpression= rulePostIncDecExpression EOF )
            // InternalTryIde.g:5764:2: iv_rulePostIncDecExpression= rulePostIncDecExpression EOF
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
    // InternalTryIde.g:5770:1: rulePostIncDecExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) ;
    public final EObject rulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_postOp_2_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:5776:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) )
            // InternalTryIde.g:5777:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            {
            // InternalTryIde.g:5777:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            // InternalTryIde.g:5778:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPostIncDecExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_68);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryIde.g:5786:3: ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=68 && LA89_0<=69)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalTryIde.g:5787:4: () ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    {
            	    // InternalTryIde.g:5787:4: ()
            	    // InternalTryIde.g:5788:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPostIncDecExpressionAccess().getPostIncDecExpressionExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryIde.g:5794:4: ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    // InternalTryIde.g:5795:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    {
            	    // InternalTryIde.g:5795:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    // InternalTryIde.g:5796:6: lv_postOp_2_0= ruleIncDecOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPostIncDecExpressionAccess().getPostOpIncDecOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_68);
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
            	      							"org.unicam.tryIde.TryIde.IncDecOpEnum");
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
    // InternalTryIde.g:5818:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalTryIde.g:5818:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalTryIde.g:5819:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalTryIde.g:5825:1: rulePrimaryExpression returns [EObject current=null] : (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) ;
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
            // InternalTryIde.g:5831:2: ( (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) )
            // InternalTryIde.g:5832:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            {
            // InternalTryIde.g:5832:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            int alt96=7;
            switch ( input.LA(1) ) {
            case 216:
            case 217:
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
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case RULE_NOW:
            case 204:
            case 205:
                {
                alt96=3;
                }
                break;
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
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
                {
                alt96=4;
                }
                break;
            case 28:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt96=7;
                    }
                    break;
                case 23:
                    {
                    alt96=6;
                    }
                    break;
                case RULE_STRING:
                case RULE_ID:
                case RULE_INT:
                case RULE_HEX:
                case RULE_DECIMAL:
                case RULE_BLOCK:
                case RULE_MSG:
                case RULE_TX:
                case RULE_NOW:
                case 28:
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
                case 169:
                case 170:
                case 171:
                case 172:
                case 173:
                case 204:
                case 205:
                case 216:
                case 217:
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
                    // InternalTryIde.g:5833:3: this_SpecialExpression_0= ruleSpecialExpression
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
                    // InternalTryIde.g:5842:3: this_QualifiedIdentifier_1= ruleQualifiedIdentifier
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
                    // InternalTryIde.g:5851:3: this_Literal_2= ruleLiteral
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
                    // InternalTryIde.g:5860:3: this_TypeCast_3= ruleTypeCast
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
                    // InternalTryIde.g:5869:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    {
                    // InternalTryIde.g:5869:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    // InternalTryIde.g:5870:4: otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_37);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryIde.g:5882:4: ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==23) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalTryIde.g:5883:5: () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            {
                            // InternalTryIde.g:5883:5: ()
                            // InternalTryIde.g:5884:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndAdd(
                              							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_4_2_0(),
                              							current);
                              					
                            }

                            }

                            // InternalTryIde.g:5890:5: ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            int cnt91=0;
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==23) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // InternalTryIde.g:5891:6: ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )?
                            	    {
                            	    // InternalTryIde.g:5891:6: ( (lv_members_7_0= ruleTupleSeparator ) )
                            	    // InternalTryIde.g:5892:7: (lv_members_7_0= ruleTupleSeparator )
                            	    {
                            	    // InternalTryIde.g:5892:7: (lv_members_7_0= ruleTupleSeparator )
                            	    // InternalTryIde.g:5893:8: lv_members_7_0= ruleTupleSeparator
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersTupleSeparatorParserRuleCall_4_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_37);
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
                            	      									"org.unicam.tryIde.TryIde.TupleSeparator");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    // InternalTryIde.g:5910:6: ( (lv_members_8_0= ruleExpression ) )?
                            	    int alt90=2;
                            	    int LA90_0 = input.LA(1);

                            	    if ( ((LA90_0>=RULE_STRING && LA90_0<=RULE_NOW)||LA90_0==28||(LA90_0>=63 && LA90_0<=173)||(LA90_0>=204 && LA90_0<=205)||(LA90_0>=216 && LA90_0<=217)) ) {
                            	        alt90=1;
                            	    }
                            	    switch (alt90) {
                            	        case 1 :
                            	            // InternalTryIde.g:5911:7: (lv_members_8_0= ruleExpression )
                            	            {
                            	            // InternalTryIde.g:5911:7: (lv_members_8_0= ruleExpression )
                            	            // InternalTryIde.g:5912:8: lv_members_8_0= ruleExpression
                            	            {
                            	            if ( state.backtracking==0 ) {

                            	              								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_4_2_1_1_0());
                            	              							
                            	            }
                            	            pushFollow(FOLLOW_37);
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
                            	              									"org.unicam.tryIde.TryIde.Expression");
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

                    otherlv_9=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryIde.g:5937:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    {
                    // InternalTryIde.g:5937:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    // InternalTryIde.g:5938:4: otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')'
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTupleSeparatorParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_37);
                    this_TupleSeparator_11=ruleTupleSeparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TupleSeparator_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTryIde.g:5950:4: ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* )
                    // InternalTryIde.g:5951:5: () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    {
                    // InternalTryIde.g:5951:5: ()
                    // InternalTryIde.g:5952:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_5_2_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryIde.g:5958:5: ( (lv_members_13_0= ruleExpression ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( ((LA93_0>=RULE_STRING && LA93_0<=RULE_NOW)||LA93_0==28||(LA93_0>=63 && LA93_0<=173)||(LA93_0>=204 && LA93_0<=205)||(LA93_0>=216 && LA93_0<=217)) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalTryIde.g:5959:6: (lv_members_13_0= ruleExpression )
                            {
                            // InternalTryIde.g:5959:6: (lv_members_13_0= ruleExpression )
                            // InternalTryIde.g:5960:7: lv_members_13_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_5_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_37);
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
                              								"org.unicam.tryIde.TryIde.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalTryIde.g:5977:5: ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==23) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalTryIde.g:5978:6: ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )?
                    	    {
                    	    // InternalTryIde.g:5978:6: ( (lv_members_14_0= ruleTupleSeparator ) )
                    	    // InternalTryIde.g:5979:7: (lv_members_14_0= ruleTupleSeparator )
                    	    {
                    	    // InternalTryIde.g:5979:7: (lv_members_14_0= ruleTupleSeparator )
                    	    // InternalTryIde.g:5980:8: lv_members_14_0= ruleTupleSeparator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersTupleSeparatorParserRuleCall_5_2_2_0_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_37);
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
                    	      									"org.unicam.tryIde.TryIde.TupleSeparator");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }

                    	    // InternalTryIde.g:5997:6: ( (lv_members_15_0= ruleExpression ) )?
                    	    int alt94=2;
                    	    int LA94_0 = input.LA(1);

                    	    if ( ((LA94_0>=RULE_STRING && LA94_0<=RULE_NOW)||LA94_0==28||(LA94_0>=63 && LA94_0<=173)||(LA94_0>=204 && LA94_0<=205)||(LA94_0>=216 && LA94_0<=217)) ) {
                    	        alt94=1;
                    	    }
                    	    switch (alt94) {
                    	        case 1 :
                    	            // InternalTryIde.g:5998:7: (lv_members_15_0= ruleExpression )
                    	            {
                    	            // InternalTryIde.g:5998:7: (lv_members_15_0= ruleExpression )
                    	            // InternalTryIde.g:5999:8: lv_members_15_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_5_2_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_37);
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
                    	              									"org.unicam.tryIde.TryIde.Expression");
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

                    otherlv_16=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTryIde.g:6024:3: (otherlv_17= '(' otherlv_18= ')' () )
                    {
                    // InternalTryIde.g:6024:3: (otherlv_17= '(' otherlv_18= ')' () )
                    // InternalTryIde.g:6025:4: otherlv_17= '(' otherlv_18= ')' ()
                    {
                    otherlv_17=(Token)match(input,28,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    otherlv_18=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_6_1());
                      			
                    }
                    // InternalTryIde.g:6033:4: ()
                    // InternalTryIde.g:6034:5: 
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
    // InternalTryIde.g:6045:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalTryIde.g:6045:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalTryIde.g:6046:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalTryIde.g:6052:1: ruleLiteral returns [EObject current=null] : (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialVariables_0 = null;

        EObject this_BooleanConst_1 = null;

        EObject this_Number_2 = null;

        EObject this_StringLiteral_3 = null;



        	enterRule();

        try {
            // InternalTryIde.g:6058:2: ( (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral ) )
            // InternalTryIde.g:6059:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral )
            {
            // InternalTryIde.g:6059:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral )
            int alt97=4;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case RULE_NOW:
                {
                alt97=1;
                }
                break;
            case 204:
            case 205:
                {
                alt97=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
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
                    // InternalTryIde.g:6060:3: this_SpecialVariables_0= ruleSpecialVariables
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
                    // InternalTryIde.g:6069:3: this_BooleanConst_1= ruleBooleanConst
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
                    // InternalTryIde.g:6078:3: this_Number_2= ruleNumber
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
                    // InternalTryIde.g:6087:3: this_StringLiteral_3= ruleStringLiteral
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
    // InternalTryIde.g:6099:1: entryRuleBooleanConst returns [EObject current=null] : iv_ruleBooleanConst= ruleBooleanConst EOF ;
    public final EObject entryRuleBooleanConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConst = null;


        try {
            // InternalTryIde.g:6099:53: (iv_ruleBooleanConst= ruleBooleanConst EOF )
            // InternalTryIde.g:6100:2: iv_ruleBooleanConst= ruleBooleanConst EOF
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
    // InternalTryIde.g:6106:1: ruleBooleanConst returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) ;
    public final EObject ruleBooleanConst() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:6112:2: ( ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) )
            // InternalTryIde.g:6113:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            {
            // InternalTryIde.g:6113:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            // InternalTryIde.g:6114:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            {
            // InternalTryIde.g:6114:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            // InternalTryIde.g:6115:4: lv_value_0_0= ruleBooleanLiteralEnum
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
              					"org.unicam.tryIde.TryIde.BooleanLiteralEnum");
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
    // InternalTryIde.g:6135:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalTryIde.g:6135:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalTryIde.g:6136:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalTryIde.g:6142:1: ruleNumber returns [EObject current=null] : (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_HexLiteral_2= ruleHexLiteral | this_DecimalLiteral_3= ruleDecimalLiteral | this_Time_4= ruleTime ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        EObject this_NumberDimensionless_0 = null;

        EObject this_Ether_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_DecimalLiteral_3 = null;

        EObject this_Time_4 = null;



        	enterRule();

        try {
            // InternalTryIde.g:6148:2: ( (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_HexLiteral_2= ruleHexLiteral | this_DecimalLiteral_3= ruleDecimalLiteral | this_Time_4= ruleTime ) )
            // InternalTryIde.g:6149:2: (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_HexLiteral_2= ruleHexLiteral | this_DecimalLiteral_3= ruleDecimalLiteral | this_Time_4= ruleTime )
            {
            // InternalTryIde.g:6149:2: (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_HexLiteral_2= ruleHexLiteral | this_DecimalLiteral_3= ruleDecimalLiteral | this_Time_4= ruleTime )
            int alt98=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 18:
                case 19:
                case 23:
                case 24:
                case 29:
                case 36:
                case 41:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 65:
                case 66:
                case 68:
                case 69:
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
                case 198:
                case 199:
                case 200:
                case 201:
                case 202:
                case 203:
                    {
                    alt98=1;
                    }
                    break;
                case 206:
                case 207:
                case 208:
                case 209:
                    {
                    alt98=2;
                    }
                    break;
                case 210:
                case 211:
                case 212:
                case 213:
                case 214:
                case 215:
                    {
                    alt98=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_HEX:
                {
                alt98=3;
                }
                break;
            case RULE_DECIMAL:
                {
                alt98=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalTryIde.g:6150:3: this_NumberDimensionless_0= ruleNumberDimensionless
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
                    // InternalTryIde.g:6159:3: this_Ether_1= ruleEther
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
                    // InternalTryIde.g:6168:3: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getHexLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_HexLiteral_2=ruleHexLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_HexLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTryIde.g:6177:3: this_DecimalLiteral_3= ruleDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getDecimalLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DecimalLiteral_3=ruleDecimalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTryIde.g:6186:3: this_Time_4= ruleTime
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getTimeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Time_4=ruleTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Time_4;
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
    // InternalTryIde.g:6198:1: entryRuleNumberDimensionless returns [EObject current=null] : iv_ruleNumberDimensionless= ruleNumberDimensionless EOF ;
    public final EObject entryRuleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberDimensionless = null;


        try {
            // InternalTryIde.g:6198:60: (iv_ruleNumberDimensionless= ruleNumberDimensionless EOF )
            // InternalTryIde.g:6199:2: iv_ruleNumberDimensionless= ruleNumberDimensionless EOF
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
    // InternalTryIde.g:6205:1: ruleNumberDimensionless returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:6211:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTryIde.g:6212:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTryIde.g:6212:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTryIde.g:6213:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTryIde.g:6213:3: (lv_value_0_0= RULE_INT )
            // InternalTryIde.g:6214:4: lv_value_0_0= RULE_INT
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
              					"org.unicam.tryIde.TryIde.INT");
              			
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


    // $ANTLR start "entryRuleHexLiteral"
    // InternalTryIde.g:6233:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // InternalTryIde.g:6233:51: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // InternalTryIde.g:6234:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
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
    // $ANTLR end "entryRuleHexLiteral"


    // $ANTLR start "ruleHexLiteral"
    // InternalTryIde.g:6240:1: ruleHexLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_HEX ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:6246:2: ( ( (lv_value_0_0= RULE_HEX ) ) )
            // InternalTryIde.g:6247:2: ( (lv_value_0_0= RULE_HEX ) )
            {
            // InternalTryIde.g:6247:2: ( (lv_value_0_0= RULE_HEX ) )
            // InternalTryIde.g:6248:3: (lv_value_0_0= RULE_HEX )
            {
            // InternalTryIde.g:6248:3: (lv_value_0_0= RULE_HEX )
            // InternalTryIde.g:6249:4: lv_value_0_0= RULE_HEX
            {
            lv_value_0_0=(Token)match(input,RULE_HEX,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getHexLiteralAccess().getValueHEXTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getHexLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.unicam.tryIde.TryIde.HEX");
              			
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
    // $ANTLR end "ruleHexLiteral"


    // $ANTLR start "entryRuleDecimalLiteral"
    // InternalTryIde.g:6268:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalTryIde.g:6268:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalTryIde.g:6269:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecimalLiteral=ruleDecimalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalLiteral; 
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
    // $ANTLR end "entryRuleDecimalLiteral"


    // $ANTLR start "ruleDecimalLiteral"
    // InternalTryIde.g:6275:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:6281:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalTryIde.g:6282:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalTryIde.g:6282:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalTryIde.g:6283:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalTryIde.g:6283:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalTryIde.g:6284:4: lv_value_0_0= RULE_DECIMAL
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDecimalLiteralAccess().getValueDECIMALTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDecimalLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.unicam.tryIde.TryIde.DECIMAL");
              			
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
    // $ANTLR end "ruleDecimalLiteral"


    // $ANTLR start "entryRuleEther"
    // InternalTryIde.g:6303:1: entryRuleEther returns [EObject current=null] : iv_ruleEther= ruleEther EOF ;
    public final EObject entryRuleEther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEther = null;


        try {
            // InternalTryIde.g:6303:46: (iv_ruleEther= ruleEther EOF )
            // InternalTryIde.g:6304:2: iv_ruleEther= ruleEther EOF
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
    // InternalTryIde.g:6310:1: ruleEther returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) ;
    public final EObject ruleEther() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_ether_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:6316:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) )
            // InternalTryIde.g:6317:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            {
            // InternalTryIde.g:6317:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            // InternalTryIde.g:6318:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            {
            // InternalTryIde.g:6318:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalTryIde.g:6319:4: (lv_value_0_0= RULE_INT )
            {
            // InternalTryIde.g:6319:4: (lv_value_0_0= RULE_INT )
            // InternalTryIde.g:6320:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_69); if (state.failed) return current;
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
              						"org.unicam.tryIde.TryIde.INT");
              				
            }

            }


            }

            // InternalTryIde.g:6336:3: ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            // InternalTryIde.g:6337:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            {
            // InternalTryIde.g:6337:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            // InternalTryIde.g:6338:5: lv_ether_1_0= ruleEtherSubDenominationEnum
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
              						"org.unicam.tryIde.TryIde.EtherSubDenominationEnum");
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
    // InternalTryIde.g:6359:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalTryIde.g:6359:45: (iv_ruleTime= ruleTime EOF )
            // InternalTryIde.g:6360:2: iv_ruleTime= ruleTime EOF
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
    // InternalTryIde.g:6366:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_time_1_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:6372:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) )
            // InternalTryIde.g:6373:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            {
            // InternalTryIde.g:6373:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            // InternalTryIde.g:6374:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            {
            // InternalTryIde.g:6374:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalTryIde.g:6375:4: (lv_value_0_0= RULE_INT )
            {
            // InternalTryIde.g:6375:4: (lv_value_0_0= RULE_INT )
            // InternalTryIde.g:6376:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_70); if (state.failed) return current;
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
              						"org.unicam.tryIde.TryIde.INT");
              				
            }

            }


            }

            // InternalTryIde.g:6392:3: ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            // InternalTryIde.g:6393:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            {
            // InternalTryIde.g:6393:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            // InternalTryIde.g:6394:5: lv_time_1_0= ruleTimeSubdenominationEnum
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
              						"org.unicam.tryIde.TryIde.TimeSubdenominationEnum");
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
    // InternalTryIde.g:6415:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalTryIde.g:6415:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalTryIde.g:6416:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalTryIde.g:6422:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTryIde.g:6428:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTryIde.g:6429:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTryIde.g:6429:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTryIde.g:6430:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTryIde.g:6430:3: (lv_value_0_0= RULE_STRING )
            // InternalTryIde.g:6431:4: lv_value_0_0= RULE_STRING
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
              					"org.unicam.tryIde.TryIde.STRING");
              			
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
    // InternalTryIde.g:6450:1: entryRuleTypeCast returns [EObject current=null] : iv_ruleTypeCast= ruleTypeCast EOF ;
    public final EObject entryRuleTypeCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCast = null;


        try {
            // InternalTryIde.g:6450:49: (iv_ruleTypeCast= ruleTypeCast EOF )
            // InternalTryIde.g:6451:2: iv_ruleTypeCast= ruleTypeCast EOF
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
    // InternalTryIde.g:6457:1: ruleTypeCast returns [EObject current=null] : ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypeCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:6463:2: ( ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalTryIde.g:6464:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalTryIde.g:6464:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalTryIde.g:6465:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalTryIde.g:6465:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) )
            // InternalTryIde.g:6466:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalTryIde.g:6466:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            // InternalTryIde.g:6467:5: lv_value_0_0= ruleElementaryTypeNameEnum
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
              						"org.unicam.tryIde.TryIde.ElementaryTypeNameEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTypeCastAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryIde.g:6488:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalTryIde.g:6489:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalTryIde.g:6489:4: (lv_expression_2_0= ruleExpression )
            // InternalTryIde.g:6490:5: lv_expression_2_0= ruleExpression
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
              						"org.unicam.tryIde.TryIde.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSpecialVariables"
    // InternalTryIde.g:6515:1: entryRuleSpecialVariables returns [EObject current=null] : iv_ruleSpecialVariables= ruleSpecialVariables EOF ;
    public final EObject entryRuleSpecialVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariables = null;


        try {
            // InternalTryIde.g:6515:57: (iv_ruleSpecialVariables= ruleSpecialVariables EOF )
            // InternalTryIde.g:6516:2: iv_ruleSpecialVariables= ruleSpecialVariables EOF
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
    // InternalTryIde.g:6522:1: ruleSpecialVariables returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) ;
    public final EObject ruleSpecialVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_field_2_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_qualifiers_3_0 = null;



        	enterRule();

        try {
            // InternalTryIde.g:6528:2: ( ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) )
            // InternalTryIde.g:6529:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            {
            // InternalTryIde.g:6529:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            // InternalTryIde.g:6530:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )*
            {
            // InternalTryIde.g:6530:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) )
            // InternalTryIde.g:6531:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            {
            // InternalTryIde.g:6531:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            // InternalTryIde.g:6532:5: lv_type_0_0= ruleSpecialVariablesTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getTypeSpecialVariablesTypeEnumParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_71);
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
              						"org.unicam.tryIde.TryIde.SpecialVariablesTypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpecialVariablesAccess().getFullStopKeyword_1());
              		
            }
            // InternalTryIde.g:6553:3: ( (lv_field_2_0= RULE_ID ) )
            // InternalTryIde.g:6554:4: (lv_field_2_0= RULE_ID )
            {
            // InternalTryIde.g:6554:4: (lv_field_2_0= RULE_ID )
            // InternalTryIde.g:6555:5: lv_field_2_0= RULE_ID
            {
            lv_field_2_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
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
              						"org.unicam.tryIde.TryIde.ID");
              				
            }

            }


            }

            // InternalTryIde.g:6571:3: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==28||LA99_0==40||LA99_0==43) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalTryIde.g:6572:4: (lv_qualifiers_3_0= ruleQualifier )
            	    {
            	    // InternalTryIde.g:6572:4: (lv_qualifiers_3_0= ruleQualifier )
            	    // InternalTryIde.g:6573:5: lv_qualifiers_3_0= ruleQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getQualifiersQualifierParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_42);
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
            	      						"org.unicam.tryIde.TryIde.Qualifier");
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


    // $ANTLR start "entryRuleSpecialVariablesTypeEnum"
    // InternalTryIde.g:6594:1: entryRuleSpecialVariablesTypeEnum returns [EObject current=null] : iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF ;
    public final EObject entryRuleSpecialVariablesTypeEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariablesTypeEnum = null;


        try {
            // InternalTryIde.g:6594:65: (iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF )
            // InternalTryIde.g:6595:2: iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialVariablesTypeEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecialVariablesTypeEnum=ruleSpecialVariablesTypeEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialVariablesTypeEnum; 
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
    // $ANTLR end "entryRuleSpecialVariablesTypeEnum"


    // $ANTLR start "ruleSpecialVariablesTypeEnum"
    // InternalTryIde.g:6601:1: ruleSpecialVariablesTypeEnum returns [EObject current=null] : ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) ) ) ;
    public final EObject ruleSpecialVariablesTypeEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalTryIde.g:6607:2: ( ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) ) ) )
            // InternalTryIde.g:6608:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) ) )
            {
            // InternalTryIde.g:6608:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) ) )
            // InternalTryIde.g:6609:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) )
            {
            // InternalTryIde.g:6609:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) )
            // InternalTryIde.g:6610:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW )
            {
            // InternalTryIde.g:6610:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW )
            int alt100=4;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
                {
                alt100=1;
                }
                break;
            case RULE_MSG:
                {
                alt100=2;
                }
                break;
            case RULE_TX:
                {
                alt100=3;
                }
                break;
            case RULE_NOW:
                {
                alt100=4;
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
                    // InternalTryIde.g:6611:5: lv_name_0_1= RULE_BLOCK
                    {
                    lv_name_0_1=(Token)match(input,RULE_BLOCK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_1, grammarAccess.getSpecialVariablesTypeEnumAccess().getNameBLOCKTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSpecialVariablesTypeEnumRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_0_1,
                      						"org.unicam.tryIde.TryIde.BLOCK");
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalTryIde.g:6626:5: lv_name_0_2= RULE_MSG
                    {
                    lv_name_0_2=(Token)match(input,RULE_MSG,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_2, grammarAccess.getSpecialVariablesTypeEnumAccess().getNameMSGTerminalRuleCall_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSpecialVariablesTypeEnumRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_0_2,
                      						"org.unicam.tryIde.TryIde.MSG");
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalTryIde.g:6641:5: lv_name_0_3= RULE_TX
                    {
                    lv_name_0_3=(Token)match(input,RULE_TX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_3, grammarAccess.getSpecialVariablesTypeEnumAccess().getNameTXTerminalRuleCall_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSpecialVariablesTypeEnumRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_0_3,
                      						"org.unicam.tryIde.TryIde.TX");
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalTryIde.g:6656:5: lv_name_0_4= RULE_NOW
                    {
                    lv_name_0_4=(Token)match(input,RULE_NOW,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_4, grammarAccess.getSpecialVariablesTypeEnumAccess().getNameNOWTerminalRuleCall_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSpecialVariablesTypeEnumRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_0_4,
                      						"org.unicam.tryIde.TryIde.NOW");
                      				
                    }

                    }
                    break;

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
    // $ANTLR end "ruleSpecialVariablesTypeEnum"


    // $ANTLR start "ruleElementaryTypeNameEnum"
    // InternalTryIde.g:6676:1: ruleElementaryTypeNameEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) ) ;
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
            // InternalTryIde.g:6682:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) ) )
            // InternalTryIde.g:6683:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) )
            {
            // InternalTryIde.g:6683:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) )
            int alt101=104;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt101=1;
                }
                break;
            case 71:
                {
                alt101=2;
                }
                break;
            case 72:
                {
                alt101=3;
                }
                break;
            case 73:
                {
                alt101=4;
                }
                break;
            case 74:
                {
                alt101=5;
                }
                break;
            case 75:
                {
                alt101=6;
                }
                break;
            case 76:
                {
                alt101=7;
                }
                break;
            case 77:
                {
                alt101=8;
                }
                break;
            case 78:
                {
                alt101=9;
                }
                break;
            case 79:
                {
                alt101=10;
                }
                break;
            case 80:
                {
                alt101=11;
                }
                break;
            case 81:
                {
                alt101=12;
                }
                break;
            case 82:
                {
                alt101=13;
                }
                break;
            case 83:
                {
                alt101=14;
                }
                break;
            case 84:
                {
                alt101=15;
                }
                break;
            case 85:
                {
                alt101=16;
                }
                break;
            case 86:
                {
                alt101=17;
                }
                break;
            case 87:
                {
                alt101=18;
                }
                break;
            case 88:
                {
                alt101=19;
                }
                break;
            case 89:
                {
                alt101=20;
                }
                break;
            case 90:
                {
                alt101=21;
                }
                break;
            case 91:
                {
                alt101=22;
                }
                break;
            case 92:
                {
                alt101=23;
                }
                break;
            case 93:
                {
                alt101=24;
                }
                break;
            case 94:
                {
                alt101=25;
                }
                break;
            case 95:
                {
                alt101=26;
                }
                break;
            case 96:
                {
                alt101=27;
                }
                break;
            case 97:
                {
                alt101=28;
                }
                break;
            case 98:
                {
                alt101=29;
                }
                break;
            case 99:
                {
                alt101=30;
                }
                break;
            case 100:
                {
                alt101=31;
                }
                break;
            case 101:
                {
                alt101=32;
                }
                break;
            case 102:
                {
                alt101=33;
                }
                break;
            case 103:
                {
                alt101=34;
                }
                break;
            case 104:
                {
                alt101=35;
                }
                break;
            case 105:
                {
                alt101=36;
                }
                break;
            case 106:
                {
                alt101=37;
                }
                break;
            case 107:
                {
                alt101=38;
                }
                break;
            case 108:
                {
                alt101=39;
                }
                break;
            case 109:
                {
                alt101=40;
                }
                break;
            case 110:
                {
                alt101=41;
                }
                break;
            case 111:
                {
                alt101=42;
                }
                break;
            case 112:
                {
                alt101=43;
                }
                break;
            case 113:
                {
                alt101=44;
                }
                break;
            case 114:
                {
                alt101=45;
                }
                break;
            case 115:
                {
                alt101=46;
                }
                break;
            case 116:
                {
                alt101=47;
                }
                break;
            case 117:
                {
                alt101=48;
                }
                break;
            case 118:
                {
                alt101=49;
                }
                break;
            case 119:
                {
                alt101=50;
                }
                break;
            case 120:
                {
                alt101=51;
                }
                break;
            case 121:
                {
                alt101=52;
                }
                break;
            case 122:
                {
                alt101=53;
                }
                break;
            case 123:
                {
                alt101=54;
                }
                break;
            case 124:
                {
                alt101=55;
                }
                break;
            case 125:
                {
                alt101=56;
                }
                break;
            case 126:
                {
                alt101=57;
                }
                break;
            case 127:
                {
                alt101=58;
                }
                break;
            case 128:
                {
                alt101=59;
                }
                break;
            case 129:
                {
                alt101=60;
                }
                break;
            case 130:
                {
                alt101=61;
                }
                break;
            case 131:
                {
                alt101=62;
                }
                break;
            case 132:
                {
                alt101=63;
                }
                break;
            case 133:
                {
                alt101=64;
                }
                break;
            case 134:
                {
                alt101=65;
                }
                break;
            case 135:
                {
                alt101=66;
                }
                break;
            case 136:
                {
                alt101=67;
                }
                break;
            case 137:
                {
                alt101=68;
                }
                break;
            case 138:
                {
                alt101=69;
                }
                break;
            case 139:
                {
                alt101=70;
                }
                break;
            case 140:
                {
                alt101=71;
                }
                break;
            case 141:
                {
                alt101=72;
                }
                break;
            case 142:
                {
                alt101=73;
                }
                break;
            case 143:
                {
                alt101=74;
                }
                break;
            case 144:
                {
                alt101=75;
                }
                break;
            case 145:
                {
                alt101=76;
                }
                break;
            case 146:
                {
                alt101=77;
                }
                break;
            case 147:
                {
                alt101=78;
                }
                break;
            case 148:
                {
                alt101=79;
                }
                break;
            case 149:
                {
                alt101=80;
                }
                break;
            case 150:
                {
                alt101=81;
                }
                break;
            case 151:
                {
                alt101=82;
                }
                break;
            case 152:
                {
                alt101=83;
                }
                break;
            case 153:
                {
                alt101=84;
                }
                break;
            case 154:
                {
                alt101=85;
                }
                break;
            case 155:
                {
                alt101=86;
                }
                break;
            case 156:
                {
                alt101=87;
                }
                break;
            case 157:
                {
                alt101=88;
                }
                break;
            case 158:
                {
                alt101=89;
                }
                break;
            case 159:
                {
                alt101=90;
                }
                break;
            case 160:
                {
                alt101=91;
                }
                break;
            case 161:
                {
                alt101=92;
                }
                break;
            case 162:
                {
                alt101=93;
                }
                break;
            case 163:
                {
                alt101=94;
                }
                break;
            case 164:
                {
                alt101=95;
                }
                break;
            case 165:
                {
                alt101=96;
                }
                break;
            case 166:
                {
                alt101=97;
                }
                break;
            case 167:
                {
                alt101=98;
                }
                break;
            case 168:
                {
                alt101=99;
                }
                break;
            case 169:
                {
                alt101=100;
                }
                break;
            case 170:
                {
                alt101=101;
                }
                break;
            case 171:
                {
                alt101=102;
                }
                break;
            case 172:
                {
                alt101=103;
                }
                break;
            case 173:
                {
                alt101=104;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalTryIde.g:6684:3: (enumLiteral_0= 'int' )
                    {
                    // InternalTryIde.g:6684:3: (enumLiteral_0= 'int' )
                    // InternalTryIde.g:6685:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getElementaryTypeNameEnumAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:6692:3: (enumLiteral_1= 'int16' )
                    {
                    // InternalTryIde.g:6692:3: (enumLiteral_1= 'int16' )
                    // InternalTryIde.g:6693:4: enumLiteral_1= 'int16'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getElementaryTypeNameEnumAccess().getINT16EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryIde.g:6700:3: (enumLiteral_2= 'int24' )
                    {
                    // InternalTryIde.g:6700:3: (enumLiteral_2= 'int24' )
                    // InternalTryIde.g:6701:4: enumLiteral_2= 'int24'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT24EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getElementaryTypeNameEnumAccess().getINT24EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryIde.g:6708:3: (enumLiteral_3= 'int32' )
                    {
                    // InternalTryIde.g:6708:3: (enumLiteral_3= 'int32' )
                    // InternalTryIde.g:6709:4: enumLiteral_3= 'int32'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT32EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getElementaryTypeNameEnumAccess().getINT32EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryIde.g:6716:3: (enumLiteral_4= 'int40' )
                    {
                    // InternalTryIde.g:6716:3: (enumLiteral_4= 'int40' )
                    // InternalTryIde.g:6717:4: enumLiteral_4= 'int40'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT40EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getElementaryTypeNameEnumAccess().getINT40EnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryIde.g:6724:3: (enumLiteral_5= 'int48' )
                    {
                    // InternalTryIde.g:6724:3: (enumLiteral_5= 'int48' )
                    // InternalTryIde.g:6725:4: enumLiteral_5= 'int48'
                    {
                    enumLiteral_5=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT48EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getElementaryTypeNameEnumAccess().getINT48EnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTryIde.g:6732:3: (enumLiteral_6= 'int56' )
                    {
                    // InternalTryIde.g:6732:3: (enumLiteral_6= 'int56' )
                    // InternalTryIde.g:6733:4: enumLiteral_6= 'int56'
                    {
                    enumLiteral_6=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT56EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getElementaryTypeNameEnumAccess().getINT56EnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalTryIde.g:6740:3: (enumLiteral_7= 'int64' )
                    {
                    // InternalTryIde.g:6740:3: (enumLiteral_7= 'int64' )
                    // InternalTryIde.g:6741:4: enumLiteral_7= 'int64'
                    {
                    enumLiteral_7=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getElementaryTypeNameEnumAccess().getINT64EnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalTryIde.g:6748:3: (enumLiteral_8= 'int72' )
                    {
                    // InternalTryIde.g:6748:3: (enumLiteral_8= 'int72' )
                    // InternalTryIde.g:6749:4: enumLiteral_8= 'int72'
                    {
                    enumLiteral_8=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT72EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getElementaryTypeNameEnumAccess().getINT72EnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalTryIde.g:6756:3: (enumLiteral_9= 'int80' )
                    {
                    // InternalTryIde.g:6756:3: (enumLiteral_9= 'int80' )
                    // InternalTryIde.g:6757:4: enumLiteral_9= 'int80'
                    {
                    enumLiteral_9=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT80EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getElementaryTypeNameEnumAccess().getINT80EnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalTryIde.g:6764:3: (enumLiteral_10= 'int88' )
                    {
                    // InternalTryIde.g:6764:3: (enumLiteral_10= 'int88' )
                    // InternalTryIde.g:6765:4: enumLiteral_10= 'int88'
                    {
                    enumLiteral_10=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT88EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getElementaryTypeNameEnumAccess().getINT88EnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalTryIde.g:6772:3: (enumLiteral_11= 'int96' )
                    {
                    // InternalTryIde.g:6772:3: (enumLiteral_11= 'int96' )
                    // InternalTryIde.g:6773:4: enumLiteral_11= 'int96'
                    {
                    enumLiteral_11=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT96EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getElementaryTypeNameEnumAccess().getINT96EnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalTryIde.g:6780:3: (enumLiteral_12= 'int104' )
                    {
                    // InternalTryIde.g:6780:3: (enumLiteral_12= 'int104' )
                    // InternalTryIde.g:6781:4: enumLiteral_12= 'int104'
                    {
                    enumLiteral_12=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT104EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getElementaryTypeNameEnumAccess().getINT104EnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalTryIde.g:6788:3: (enumLiteral_13= 'int112' )
                    {
                    // InternalTryIde.g:6788:3: (enumLiteral_13= 'int112' )
                    // InternalTryIde.g:6789:4: enumLiteral_13= 'int112'
                    {
                    enumLiteral_13=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT112EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getElementaryTypeNameEnumAccess().getINT112EnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalTryIde.g:6796:3: (enumLiteral_14= 'int120' )
                    {
                    // InternalTryIde.g:6796:3: (enumLiteral_14= 'int120' )
                    // InternalTryIde.g:6797:4: enumLiteral_14= 'int120'
                    {
                    enumLiteral_14=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT120EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getElementaryTypeNameEnumAccess().getINT120EnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalTryIde.g:6804:3: (enumLiteral_15= 'int128' )
                    {
                    // InternalTryIde.g:6804:3: (enumLiteral_15= 'int128' )
                    // InternalTryIde.g:6805:4: enumLiteral_15= 'int128'
                    {
                    enumLiteral_15=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT128EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_15, grammarAccess.getElementaryTypeNameEnumAccess().getINT128EnumLiteralDeclaration_15());
                      			
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalTryIde.g:6812:3: (enumLiteral_16= 'int136' )
                    {
                    // InternalTryIde.g:6812:3: (enumLiteral_16= 'int136' )
                    // InternalTryIde.g:6813:4: enumLiteral_16= 'int136'
                    {
                    enumLiteral_16=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT136EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_16, grammarAccess.getElementaryTypeNameEnumAccess().getINT136EnumLiteralDeclaration_16());
                      			
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalTryIde.g:6820:3: (enumLiteral_17= 'int144' )
                    {
                    // InternalTryIde.g:6820:3: (enumLiteral_17= 'int144' )
                    // InternalTryIde.g:6821:4: enumLiteral_17= 'int144'
                    {
                    enumLiteral_17=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT144EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_17, grammarAccess.getElementaryTypeNameEnumAccess().getINT144EnumLiteralDeclaration_17());
                      			
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalTryIde.g:6828:3: (enumLiteral_18= 'int152' )
                    {
                    // InternalTryIde.g:6828:3: (enumLiteral_18= 'int152' )
                    // InternalTryIde.g:6829:4: enumLiteral_18= 'int152'
                    {
                    enumLiteral_18=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT152EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_18, grammarAccess.getElementaryTypeNameEnumAccess().getINT152EnumLiteralDeclaration_18());
                      			
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalTryIde.g:6836:3: (enumLiteral_19= 'int160' )
                    {
                    // InternalTryIde.g:6836:3: (enumLiteral_19= 'int160' )
                    // InternalTryIde.g:6837:4: enumLiteral_19= 'int160'
                    {
                    enumLiteral_19=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT160EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_19, grammarAccess.getElementaryTypeNameEnumAccess().getINT160EnumLiteralDeclaration_19());
                      			
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalTryIde.g:6844:3: (enumLiteral_20= 'int168' )
                    {
                    // InternalTryIde.g:6844:3: (enumLiteral_20= 'int168' )
                    // InternalTryIde.g:6845:4: enumLiteral_20= 'int168'
                    {
                    enumLiteral_20=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT168EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_20, grammarAccess.getElementaryTypeNameEnumAccess().getINT168EnumLiteralDeclaration_20());
                      			
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalTryIde.g:6852:3: (enumLiteral_21= 'int178' )
                    {
                    // InternalTryIde.g:6852:3: (enumLiteral_21= 'int178' )
                    // InternalTryIde.g:6853:4: enumLiteral_21= 'int178'
                    {
                    enumLiteral_21=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT178EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_21, grammarAccess.getElementaryTypeNameEnumAccess().getINT178EnumLiteralDeclaration_21());
                      			
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalTryIde.g:6860:3: (enumLiteral_22= 'int184' )
                    {
                    // InternalTryIde.g:6860:3: (enumLiteral_22= 'int184' )
                    // InternalTryIde.g:6861:4: enumLiteral_22= 'int184'
                    {
                    enumLiteral_22=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT184EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_22, grammarAccess.getElementaryTypeNameEnumAccess().getINT184EnumLiteralDeclaration_22());
                      			
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalTryIde.g:6868:3: (enumLiteral_23= 'int192' )
                    {
                    // InternalTryIde.g:6868:3: (enumLiteral_23= 'int192' )
                    // InternalTryIde.g:6869:4: enumLiteral_23= 'int192'
                    {
                    enumLiteral_23=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT192EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_23, grammarAccess.getElementaryTypeNameEnumAccess().getINT192EnumLiteralDeclaration_23());
                      			
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalTryIde.g:6876:3: (enumLiteral_24= 'int200' )
                    {
                    // InternalTryIde.g:6876:3: (enumLiteral_24= 'int200' )
                    // InternalTryIde.g:6877:4: enumLiteral_24= 'int200'
                    {
                    enumLiteral_24=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT200EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_24, grammarAccess.getElementaryTypeNameEnumAccess().getINT200EnumLiteralDeclaration_24());
                      			
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalTryIde.g:6884:3: (enumLiteral_25= 'int208' )
                    {
                    // InternalTryIde.g:6884:3: (enumLiteral_25= 'int208' )
                    // InternalTryIde.g:6885:4: enumLiteral_25= 'int208'
                    {
                    enumLiteral_25=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT208EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_25, grammarAccess.getElementaryTypeNameEnumAccess().getINT208EnumLiteralDeclaration_25());
                      			
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalTryIde.g:6892:3: (enumLiteral_26= 'int216' )
                    {
                    // InternalTryIde.g:6892:3: (enumLiteral_26= 'int216' )
                    // InternalTryIde.g:6893:4: enumLiteral_26= 'int216'
                    {
                    enumLiteral_26=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT216EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_26, grammarAccess.getElementaryTypeNameEnumAccess().getINT216EnumLiteralDeclaration_26());
                      			
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalTryIde.g:6900:3: (enumLiteral_27= 'int224' )
                    {
                    // InternalTryIde.g:6900:3: (enumLiteral_27= 'int224' )
                    // InternalTryIde.g:6901:4: enumLiteral_27= 'int224'
                    {
                    enumLiteral_27=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT224EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_27, grammarAccess.getElementaryTypeNameEnumAccess().getINT224EnumLiteralDeclaration_27());
                      			
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalTryIde.g:6908:3: (enumLiteral_28= 'int232' )
                    {
                    // InternalTryIde.g:6908:3: (enumLiteral_28= 'int232' )
                    // InternalTryIde.g:6909:4: enumLiteral_28= 'int232'
                    {
                    enumLiteral_28=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT232EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_28, grammarAccess.getElementaryTypeNameEnumAccess().getINT232EnumLiteralDeclaration_28());
                      			
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalTryIde.g:6916:3: (enumLiteral_29= 'int240' )
                    {
                    // InternalTryIde.g:6916:3: (enumLiteral_29= 'int240' )
                    // InternalTryIde.g:6917:4: enumLiteral_29= 'int240'
                    {
                    enumLiteral_29=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT240EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_29, grammarAccess.getElementaryTypeNameEnumAccess().getINT240EnumLiteralDeclaration_29());
                      			
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalTryIde.g:6924:3: (enumLiteral_30= 'int248' )
                    {
                    // InternalTryIde.g:6924:3: (enumLiteral_30= 'int248' )
                    // InternalTryIde.g:6925:4: enumLiteral_30= 'int248'
                    {
                    enumLiteral_30=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT248EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_30, grammarAccess.getElementaryTypeNameEnumAccess().getINT248EnumLiteralDeclaration_30());
                      			
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalTryIde.g:6932:3: (enumLiteral_31= 'int256' )
                    {
                    // InternalTryIde.g:6932:3: (enumLiteral_31= 'int256' )
                    // InternalTryIde.g:6933:4: enumLiteral_31= 'int256'
                    {
                    enumLiteral_31=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT256EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_31, grammarAccess.getElementaryTypeNameEnumAccess().getINT256EnumLiteralDeclaration_31());
                      			
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalTryIde.g:6940:3: (enumLiteral_32= 'uint' )
                    {
                    // InternalTryIde.g:6940:3: (enumLiteral_32= 'uint' )
                    // InternalTryIde.g:6941:4: enumLiteral_32= 'uint'
                    {
                    enumLiteral_32=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINTEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_32, grammarAccess.getElementaryTypeNameEnumAccess().getUINTEnumLiteralDeclaration_32());
                      			
                    }

                    }


                    }
                    break;
                case 34 :
                    // InternalTryIde.g:6948:3: (enumLiteral_33= 'uint8' )
                    {
                    // InternalTryIde.g:6948:3: (enumLiteral_33= 'uint8' )
                    // InternalTryIde.g:6949:4: enumLiteral_33= 'uint8'
                    {
                    enumLiteral_33=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT8EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_33, grammarAccess.getElementaryTypeNameEnumAccess().getUINT8EnumLiteralDeclaration_33());
                      			
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalTryIde.g:6956:3: (enumLiteral_34= 'uint16' )
                    {
                    // InternalTryIde.g:6956:3: (enumLiteral_34= 'uint16' )
                    // InternalTryIde.g:6957:4: enumLiteral_34= 'uint16'
                    {
                    enumLiteral_34=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT16EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_34, grammarAccess.getElementaryTypeNameEnumAccess().getUINT16EnumLiteralDeclaration_34());
                      			
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalTryIde.g:6964:3: (enumLiteral_35= 'uint24' )
                    {
                    // InternalTryIde.g:6964:3: (enumLiteral_35= 'uint24' )
                    // InternalTryIde.g:6965:4: enumLiteral_35= 'uint24'
                    {
                    enumLiteral_35=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUNIT24EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_35, grammarAccess.getElementaryTypeNameEnumAccess().getUNIT24EnumLiteralDeclaration_35());
                      			
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalTryIde.g:6972:3: (enumLiteral_36= 'uint32' )
                    {
                    // InternalTryIde.g:6972:3: (enumLiteral_36= 'uint32' )
                    // InternalTryIde.g:6973:4: enumLiteral_36= 'uint32'
                    {
                    enumLiteral_36=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT32EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_36, grammarAccess.getElementaryTypeNameEnumAccess().getUINT32EnumLiteralDeclaration_36());
                      			
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalTryIde.g:6980:3: (enumLiteral_37= 'uint40' )
                    {
                    // InternalTryIde.g:6980:3: (enumLiteral_37= 'uint40' )
                    // InternalTryIde.g:6981:4: enumLiteral_37= 'uint40'
                    {
                    enumLiteral_37=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT40EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_37, grammarAccess.getElementaryTypeNameEnumAccess().getUINT40EnumLiteralDeclaration_37());
                      			
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalTryIde.g:6988:3: (enumLiteral_38= 'uint48' )
                    {
                    // InternalTryIde.g:6988:3: (enumLiteral_38= 'uint48' )
                    // InternalTryIde.g:6989:4: enumLiteral_38= 'uint48'
                    {
                    enumLiteral_38=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT48EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_38, grammarAccess.getElementaryTypeNameEnumAccess().getUINT48EnumLiteralDeclaration_38());
                      			
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalTryIde.g:6996:3: (enumLiteral_39= 'uint56' )
                    {
                    // InternalTryIde.g:6996:3: (enumLiteral_39= 'uint56' )
                    // InternalTryIde.g:6997:4: enumLiteral_39= 'uint56'
                    {
                    enumLiteral_39=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUNIT56EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_39, grammarAccess.getElementaryTypeNameEnumAccess().getUNIT56EnumLiteralDeclaration_39());
                      			
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalTryIde.g:7004:3: (enumLiteral_40= 'uint64' )
                    {
                    // InternalTryIde.g:7004:3: (enumLiteral_40= 'uint64' )
                    // InternalTryIde.g:7005:4: enumLiteral_40= 'uint64'
                    {
                    enumLiteral_40=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT64EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_40, grammarAccess.getElementaryTypeNameEnumAccess().getUINT64EnumLiteralDeclaration_40());
                      			
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalTryIde.g:7012:3: (enumLiteral_41= 'uint72' )
                    {
                    // InternalTryIde.g:7012:3: (enumLiteral_41= 'uint72' )
                    // InternalTryIde.g:7013:4: enumLiteral_41= 'uint72'
                    {
                    enumLiteral_41=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT72EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_41, grammarAccess.getElementaryTypeNameEnumAccess().getUINT72EnumLiteralDeclaration_41());
                      			
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalTryIde.g:7020:3: (enumLiteral_42= 'uint80' )
                    {
                    // InternalTryIde.g:7020:3: (enumLiteral_42= 'uint80' )
                    // InternalTryIde.g:7021:4: enumLiteral_42= 'uint80'
                    {
                    enumLiteral_42=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT80EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_42, grammarAccess.getElementaryTypeNameEnumAccess().getUINT80EnumLiteralDeclaration_42());
                      			
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalTryIde.g:7028:3: (enumLiteral_43= 'uint88' )
                    {
                    // InternalTryIde.g:7028:3: (enumLiteral_43= 'uint88' )
                    // InternalTryIde.g:7029:4: enumLiteral_43= 'uint88'
                    {
                    enumLiteral_43=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT88EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_43, grammarAccess.getElementaryTypeNameEnumAccess().getUINT88EnumLiteralDeclaration_43());
                      			
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalTryIde.g:7036:3: (enumLiteral_44= 'uint96' )
                    {
                    // InternalTryIde.g:7036:3: (enumLiteral_44= 'uint96' )
                    // InternalTryIde.g:7037:4: enumLiteral_44= 'uint96'
                    {
                    enumLiteral_44=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT96EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_44, grammarAccess.getElementaryTypeNameEnumAccess().getUINT96EnumLiteralDeclaration_44());
                      			
                    }

                    }


                    }
                    break;
                case 46 :
                    // InternalTryIde.g:7044:3: (enumLiteral_45= 'uint104' )
                    {
                    // InternalTryIde.g:7044:3: (enumLiteral_45= 'uint104' )
                    // InternalTryIde.g:7045:4: enumLiteral_45= 'uint104'
                    {
                    enumLiteral_45=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT104EnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_45, grammarAccess.getElementaryTypeNameEnumAccess().getUINT104EnumLiteralDeclaration_45());
                      			
                    }

                    }


                    }
                    break;
                case 47 :
                    // InternalTryIde.g:7052:3: (enumLiteral_46= 'uint112' )
                    {
                    // InternalTryIde.g:7052:3: (enumLiteral_46= 'uint112' )
                    // InternalTryIde.g:7053:4: enumLiteral_46= 'uint112'
                    {
                    enumLiteral_46=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT112EnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_46, grammarAccess.getElementaryTypeNameEnumAccess().getUINT112EnumLiteralDeclaration_46());
                      			
                    }

                    }


                    }
                    break;
                case 48 :
                    // InternalTryIde.g:7060:3: (enumLiteral_47= 'uint120' )
                    {
                    // InternalTryIde.g:7060:3: (enumLiteral_47= 'uint120' )
                    // InternalTryIde.g:7061:4: enumLiteral_47= 'uint120'
                    {
                    enumLiteral_47=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT120EnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_47, grammarAccess.getElementaryTypeNameEnumAccess().getUINT120EnumLiteralDeclaration_47());
                      			
                    }

                    }


                    }
                    break;
                case 49 :
                    // InternalTryIde.g:7068:3: (enumLiteral_48= 'uint128' )
                    {
                    // InternalTryIde.g:7068:3: (enumLiteral_48= 'uint128' )
                    // InternalTryIde.g:7069:4: enumLiteral_48= 'uint128'
                    {
                    enumLiteral_48=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT128EnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_48, grammarAccess.getElementaryTypeNameEnumAccess().getUINT128EnumLiteralDeclaration_48());
                      			
                    }

                    }


                    }
                    break;
                case 50 :
                    // InternalTryIde.g:7076:3: (enumLiteral_49= 'uint136' )
                    {
                    // InternalTryIde.g:7076:3: (enumLiteral_49= 'uint136' )
                    // InternalTryIde.g:7077:4: enumLiteral_49= 'uint136'
                    {
                    enumLiteral_49=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT136EnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_49, grammarAccess.getElementaryTypeNameEnumAccess().getUINT136EnumLiteralDeclaration_49());
                      			
                    }

                    }


                    }
                    break;
                case 51 :
                    // InternalTryIde.g:7084:3: (enumLiteral_50= 'uint144' )
                    {
                    // InternalTryIde.g:7084:3: (enumLiteral_50= 'uint144' )
                    // InternalTryIde.g:7085:4: enumLiteral_50= 'uint144'
                    {
                    enumLiteral_50=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT144EnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_50, grammarAccess.getElementaryTypeNameEnumAccess().getUINT144EnumLiteralDeclaration_50());
                      			
                    }

                    }


                    }
                    break;
                case 52 :
                    // InternalTryIde.g:7092:3: (enumLiteral_51= 'uint152' )
                    {
                    // InternalTryIde.g:7092:3: (enumLiteral_51= 'uint152' )
                    // InternalTryIde.g:7093:4: enumLiteral_51= 'uint152'
                    {
                    enumLiteral_51=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT152EnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_51, grammarAccess.getElementaryTypeNameEnumAccess().getUINT152EnumLiteralDeclaration_51());
                      			
                    }

                    }


                    }
                    break;
                case 53 :
                    // InternalTryIde.g:7100:3: (enumLiteral_52= 'uint160' )
                    {
                    // InternalTryIde.g:7100:3: (enumLiteral_52= 'uint160' )
                    // InternalTryIde.g:7101:4: enumLiteral_52= 'uint160'
                    {
                    enumLiteral_52=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT160EnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_52, grammarAccess.getElementaryTypeNameEnumAccess().getUINT160EnumLiteralDeclaration_52());
                      			
                    }

                    }


                    }
                    break;
                case 54 :
                    // InternalTryIde.g:7108:3: (enumLiteral_53= 'uint168' )
                    {
                    // InternalTryIde.g:7108:3: (enumLiteral_53= 'uint168' )
                    // InternalTryIde.g:7109:4: enumLiteral_53= 'uint168'
                    {
                    enumLiteral_53=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT168EnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_53, grammarAccess.getElementaryTypeNameEnumAccess().getUINT168EnumLiteralDeclaration_53());
                      			
                    }

                    }


                    }
                    break;
                case 55 :
                    // InternalTryIde.g:7116:3: (enumLiteral_54= 'uint178' )
                    {
                    // InternalTryIde.g:7116:3: (enumLiteral_54= 'uint178' )
                    // InternalTryIde.g:7117:4: enumLiteral_54= 'uint178'
                    {
                    enumLiteral_54=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT178EnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_54, grammarAccess.getElementaryTypeNameEnumAccess().getUINT178EnumLiteralDeclaration_54());
                      			
                    }

                    }


                    }
                    break;
                case 56 :
                    // InternalTryIde.g:7124:3: (enumLiteral_55= 'uint184' )
                    {
                    // InternalTryIde.g:7124:3: (enumLiteral_55= 'uint184' )
                    // InternalTryIde.g:7125:4: enumLiteral_55= 'uint184'
                    {
                    enumLiteral_55=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT184EnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_55, grammarAccess.getElementaryTypeNameEnumAccess().getUINT184EnumLiteralDeclaration_55());
                      			
                    }

                    }


                    }
                    break;
                case 57 :
                    // InternalTryIde.g:7132:3: (enumLiteral_56= 'uint192' )
                    {
                    // InternalTryIde.g:7132:3: (enumLiteral_56= 'uint192' )
                    // InternalTryIde.g:7133:4: enumLiteral_56= 'uint192'
                    {
                    enumLiteral_56=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT192EnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_56, grammarAccess.getElementaryTypeNameEnumAccess().getUINT192EnumLiteralDeclaration_56());
                      			
                    }

                    }


                    }
                    break;
                case 58 :
                    // InternalTryIde.g:7140:3: (enumLiteral_57= 'uint200' )
                    {
                    // InternalTryIde.g:7140:3: (enumLiteral_57= 'uint200' )
                    // InternalTryIde.g:7141:4: enumLiteral_57= 'uint200'
                    {
                    enumLiteral_57=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT200EnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_57, grammarAccess.getElementaryTypeNameEnumAccess().getUINT200EnumLiteralDeclaration_57());
                      			
                    }

                    }


                    }
                    break;
                case 59 :
                    // InternalTryIde.g:7148:3: (enumLiteral_58= 'uint208' )
                    {
                    // InternalTryIde.g:7148:3: (enumLiteral_58= 'uint208' )
                    // InternalTryIde.g:7149:4: enumLiteral_58= 'uint208'
                    {
                    enumLiteral_58=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT208EnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_58, grammarAccess.getElementaryTypeNameEnumAccess().getUINT208EnumLiteralDeclaration_58());
                      			
                    }

                    }


                    }
                    break;
                case 60 :
                    // InternalTryIde.g:7156:3: (enumLiteral_59= 'uint216' )
                    {
                    // InternalTryIde.g:7156:3: (enumLiteral_59= 'uint216' )
                    // InternalTryIde.g:7157:4: enumLiteral_59= 'uint216'
                    {
                    enumLiteral_59=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT216EnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_59, grammarAccess.getElementaryTypeNameEnumAccess().getUINT216EnumLiteralDeclaration_59());
                      			
                    }

                    }


                    }
                    break;
                case 61 :
                    // InternalTryIde.g:7164:3: (enumLiteral_60= 'uint224' )
                    {
                    // InternalTryIde.g:7164:3: (enumLiteral_60= 'uint224' )
                    // InternalTryIde.g:7165:4: enumLiteral_60= 'uint224'
                    {
                    enumLiteral_60=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT244EnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_60, grammarAccess.getElementaryTypeNameEnumAccess().getUINT244EnumLiteralDeclaration_60());
                      			
                    }

                    }


                    }
                    break;
                case 62 :
                    // InternalTryIde.g:7172:3: (enumLiteral_61= 'uint232' )
                    {
                    // InternalTryIde.g:7172:3: (enumLiteral_61= 'uint232' )
                    // InternalTryIde.g:7173:4: enumLiteral_61= 'uint232'
                    {
                    enumLiteral_61=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT232EnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_61, grammarAccess.getElementaryTypeNameEnumAccess().getUINT232EnumLiteralDeclaration_61());
                      			
                    }

                    }


                    }
                    break;
                case 63 :
                    // InternalTryIde.g:7180:3: (enumLiteral_62= 'uint240' )
                    {
                    // InternalTryIde.g:7180:3: (enumLiteral_62= 'uint240' )
                    // InternalTryIde.g:7181:4: enumLiteral_62= 'uint240'
                    {
                    enumLiteral_62=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT240EnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_62, grammarAccess.getElementaryTypeNameEnumAccess().getUINT240EnumLiteralDeclaration_62());
                      			
                    }

                    }


                    }
                    break;
                case 64 :
                    // InternalTryIde.g:7188:3: (enumLiteral_63= 'uint248' )
                    {
                    // InternalTryIde.g:7188:3: (enumLiteral_63= 'uint248' )
                    // InternalTryIde.g:7189:4: enumLiteral_63= 'uint248'
                    {
                    enumLiteral_63=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT248EnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_63, grammarAccess.getElementaryTypeNameEnumAccess().getUINT248EnumLiteralDeclaration_63());
                      			
                    }

                    }


                    }
                    break;
                case 65 :
                    // InternalTryIde.g:7196:3: (enumLiteral_64= 'uint256' )
                    {
                    // InternalTryIde.g:7196:3: (enumLiteral_64= 'uint256' )
                    // InternalTryIde.g:7197:4: enumLiteral_64= 'uint256'
                    {
                    enumLiteral_64=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT256EnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_64, grammarAccess.getElementaryTypeNameEnumAccess().getUINT256EnumLiteralDeclaration_64());
                      			
                    }

                    }


                    }
                    break;
                case 66 :
                    // InternalTryIde.g:7204:3: (enumLiteral_65= 'byte' )
                    {
                    // InternalTryIde.g:7204:3: (enumLiteral_65= 'byte' )
                    // InternalTryIde.g:7205:4: enumLiteral_65= 'byte'
                    {
                    enumLiteral_65=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTEEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_65, grammarAccess.getElementaryTypeNameEnumAccess().getBYTEEnumLiteralDeclaration_65());
                      			
                    }

                    }


                    }
                    break;
                case 67 :
                    // InternalTryIde.g:7212:3: (enumLiteral_66= 'bytes' )
                    {
                    // InternalTryIde.g:7212:3: (enumLiteral_66= 'bytes' )
                    // InternalTryIde.g:7213:4: enumLiteral_66= 'bytes'
                    {
                    enumLiteral_66=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTESEnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_66, grammarAccess.getElementaryTypeNameEnumAccess().getBYTESEnumLiteralDeclaration_66());
                      			
                    }

                    }


                    }
                    break;
                case 68 :
                    // InternalTryIde.g:7220:3: (enumLiteral_67= 'bytes1' )
                    {
                    // InternalTryIde.g:7220:3: (enumLiteral_67= 'bytes1' )
                    // InternalTryIde.g:7221:4: enumLiteral_67= 'bytes1'
                    {
                    enumLiteral_67=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES1EnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_67, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES1EnumLiteralDeclaration_67());
                      			
                    }

                    }


                    }
                    break;
                case 69 :
                    // InternalTryIde.g:7228:3: (enumLiteral_68= 'bytes2' )
                    {
                    // InternalTryIde.g:7228:3: (enumLiteral_68= 'bytes2' )
                    // InternalTryIde.g:7229:4: enumLiteral_68= 'bytes2'
                    {
                    enumLiteral_68=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES2EnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_68, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES2EnumLiteralDeclaration_68());
                      			
                    }

                    }


                    }
                    break;
                case 70 :
                    // InternalTryIde.g:7236:3: (enumLiteral_69= 'bytes3' )
                    {
                    // InternalTryIde.g:7236:3: (enumLiteral_69= 'bytes3' )
                    // InternalTryIde.g:7237:4: enumLiteral_69= 'bytes3'
                    {
                    enumLiteral_69=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES3EnumLiteralDeclaration_69().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_69, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES3EnumLiteralDeclaration_69());
                      			
                    }

                    }


                    }
                    break;
                case 71 :
                    // InternalTryIde.g:7244:3: (enumLiteral_70= 'bytes4' )
                    {
                    // InternalTryIde.g:7244:3: (enumLiteral_70= 'bytes4' )
                    // InternalTryIde.g:7245:4: enumLiteral_70= 'bytes4'
                    {
                    enumLiteral_70=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES4EnumLiteralDeclaration_70().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_70, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES4EnumLiteralDeclaration_70());
                      			
                    }

                    }


                    }
                    break;
                case 72 :
                    // InternalTryIde.g:7252:3: (enumLiteral_71= 'bytes5' )
                    {
                    // InternalTryIde.g:7252:3: (enumLiteral_71= 'bytes5' )
                    // InternalTryIde.g:7253:4: enumLiteral_71= 'bytes5'
                    {
                    enumLiteral_71=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES5EnumLiteralDeclaration_71().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_71, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES5EnumLiteralDeclaration_71());
                      			
                    }

                    }


                    }
                    break;
                case 73 :
                    // InternalTryIde.g:7260:3: (enumLiteral_72= 'bytes6' )
                    {
                    // InternalTryIde.g:7260:3: (enumLiteral_72= 'bytes6' )
                    // InternalTryIde.g:7261:4: enumLiteral_72= 'bytes6'
                    {
                    enumLiteral_72=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES6EnumLiteralDeclaration_72().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_72, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES6EnumLiteralDeclaration_72());
                      			
                    }

                    }


                    }
                    break;
                case 74 :
                    // InternalTryIde.g:7268:3: (enumLiteral_73= 'bytes7' )
                    {
                    // InternalTryIde.g:7268:3: (enumLiteral_73= 'bytes7' )
                    // InternalTryIde.g:7269:4: enumLiteral_73= 'bytes7'
                    {
                    enumLiteral_73=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES7EnumLiteralDeclaration_73().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_73, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES7EnumLiteralDeclaration_73());
                      			
                    }

                    }


                    }
                    break;
                case 75 :
                    // InternalTryIde.g:7276:3: (enumLiteral_74= 'bytes8' )
                    {
                    // InternalTryIde.g:7276:3: (enumLiteral_74= 'bytes8' )
                    // InternalTryIde.g:7277:4: enumLiteral_74= 'bytes8'
                    {
                    enumLiteral_74=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES8EnumLiteralDeclaration_74().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_74, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES8EnumLiteralDeclaration_74());
                      			
                    }

                    }


                    }
                    break;
                case 76 :
                    // InternalTryIde.g:7284:3: (enumLiteral_75= 'bytes9' )
                    {
                    // InternalTryIde.g:7284:3: (enumLiteral_75= 'bytes9' )
                    // InternalTryIde.g:7285:4: enumLiteral_75= 'bytes9'
                    {
                    enumLiteral_75=(Token)match(input,145,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES9EnumLiteralDeclaration_75().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_75, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES9EnumLiteralDeclaration_75());
                      			
                    }

                    }


                    }
                    break;
                case 77 :
                    // InternalTryIde.g:7292:3: (enumLiteral_76= 'bytes10' )
                    {
                    // InternalTryIde.g:7292:3: (enumLiteral_76= 'bytes10' )
                    // InternalTryIde.g:7293:4: enumLiteral_76= 'bytes10'
                    {
                    enumLiteral_76=(Token)match(input,146,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES10EnumLiteralDeclaration_76().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_76, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES10EnumLiteralDeclaration_76());
                      			
                    }

                    }


                    }
                    break;
                case 78 :
                    // InternalTryIde.g:7300:3: (enumLiteral_77= 'bytes11' )
                    {
                    // InternalTryIde.g:7300:3: (enumLiteral_77= 'bytes11' )
                    // InternalTryIde.g:7301:4: enumLiteral_77= 'bytes11'
                    {
                    enumLiteral_77=(Token)match(input,147,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES11EnumLiteralDeclaration_77().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_77, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES11EnumLiteralDeclaration_77());
                      			
                    }

                    }


                    }
                    break;
                case 79 :
                    // InternalTryIde.g:7308:3: (enumLiteral_78= 'bytes12' )
                    {
                    // InternalTryIde.g:7308:3: (enumLiteral_78= 'bytes12' )
                    // InternalTryIde.g:7309:4: enumLiteral_78= 'bytes12'
                    {
                    enumLiteral_78=(Token)match(input,148,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES12EnumLiteralDeclaration_78().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_78, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES12EnumLiteralDeclaration_78());
                      			
                    }

                    }


                    }
                    break;
                case 80 :
                    // InternalTryIde.g:7316:3: (enumLiteral_79= 'bytes13' )
                    {
                    // InternalTryIde.g:7316:3: (enumLiteral_79= 'bytes13' )
                    // InternalTryIde.g:7317:4: enumLiteral_79= 'bytes13'
                    {
                    enumLiteral_79=(Token)match(input,149,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES13EnumLiteralDeclaration_79().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_79, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES13EnumLiteralDeclaration_79());
                      			
                    }

                    }


                    }
                    break;
                case 81 :
                    // InternalTryIde.g:7324:3: (enumLiteral_80= 'bytes14' )
                    {
                    // InternalTryIde.g:7324:3: (enumLiteral_80= 'bytes14' )
                    // InternalTryIde.g:7325:4: enumLiteral_80= 'bytes14'
                    {
                    enumLiteral_80=(Token)match(input,150,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES14EnumLiteralDeclaration_80().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_80, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES14EnumLiteralDeclaration_80());
                      			
                    }

                    }


                    }
                    break;
                case 82 :
                    // InternalTryIde.g:7332:3: (enumLiteral_81= 'bytes15' )
                    {
                    // InternalTryIde.g:7332:3: (enumLiteral_81= 'bytes15' )
                    // InternalTryIde.g:7333:4: enumLiteral_81= 'bytes15'
                    {
                    enumLiteral_81=(Token)match(input,151,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES15EnumLiteralDeclaration_81().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_81, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES15EnumLiteralDeclaration_81());
                      			
                    }

                    }


                    }
                    break;
                case 83 :
                    // InternalTryIde.g:7340:3: (enumLiteral_82= 'bytes16' )
                    {
                    // InternalTryIde.g:7340:3: (enumLiteral_82= 'bytes16' )
                    // InternalTryIde.g:7341:4: enumLiteral_82= 'bytes16'
                    {
                    enumLiteral_82=(Token)match(input,152,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES16EnumLiteralDeclaration_82().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_82, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES16EnumLiteralDeclaration_82());
                      			
                    }

                    }


                    }
                    break;
                case 84 :
                    // InternalTryIde.g:7348:3: (enumLiteral_83= 'bytes17' )
                    {
                    // InternalTryIde.g:7348:3: (enumLiteral_83= 'bytes17' )
                    // InternalTryIde.g:7349:4: enumLiteral_83= 'bytes17'
                    {
                    enumLiteral_83=(Token)match(input,153,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES17EnumLiteralDeclaration_83().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_83, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES17EnumLiteralDeclaration_83());
                      			
                    }

                    }


                    }
                    break;
                case 85 :
                    // InternalTryIde.g:7356:3: (enumLiteral_84= 'bytes18' )
                    {
                    // InternalTryIde.g:7356:3: (enumLiteral_84= 'bytes18' )
                    // InternalTryIde.g:7357:4: enumLiteral_84= 'bytes18'
                    {
                    enumLiteral_84=(Token)match(input,154,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES18EnumLiteralDeclaration_84().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_84, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES18EnumLiteralDeclaration_84());
                      			
                    }

                    }


                    }
                    break;
                case 86 :
                    // InternalTryIde.g:7364:3: (enumLiteral_85= 'bytes19' )
                    {
                    // InternalTryIde.g:7364:3: (enumLiteral_85= 'bytes19' )
                    // InternalTryIde.g:7365:4: enumLiteral_85= 'bytes19'
                    {
                    enumLiteral_85=(Token)match(input,155,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES19EnumLiteralDeclaration_85().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_85, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES19EnumLiteralDeclaration_85());
                      			
                    }

                    }


                    }
                    break;
                case 87 :
                    // InternalTryIde.g:7372:3: (enumLiteral_86= 'bytes20' )
                    {
                    // InternalTryIde.g:7372:3: (enumLiteral_86= 'bytes20' )
                    // InternalTryIde.g:7373:4: enumLiteral_86= 'bytes20'
                    {
                    enumLiteral_86=(Token)match(input,156,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES20EnumLiteralDeclaration_86().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_86, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES20EnumLiteralDeclaration_86());
                      			
                    }

                    }


                    }
                    break;
                case 88 :
                    // InternalTryIde.g:7380:3: (enumLiteral_87= 'bytes21' )
                    {
                    // InternalTryIde.g:7380:3: (enumLiteral_87= 'bytes21' )
                    // InternalTryIde.g:7381:4: enumLiteral_87= 'bytes21'
                    {
                    enumLiteral_87=(Token)match(input,157,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES21EnumLiteralDeclaration_87().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_87, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES21EnumLiteralDeclaration_87());
                      			
                    }

                    }


                    }
                    break;
                case 89 :
                    // InternalTryIde.g:7388:3: (enumLiteral_88= 'bytes22' )
                    {
                    // InternalTryIde.g:7388:3: (enumLiteral_88= 'bytes22' )
                    // InternalTryIde.g:7389:4: enumLiteral_88= 'bytes22'
                    {
                    enumLiteral_88=(Token)match(input,158,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES22EnumLiteralDeclaration_88().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_88, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES22EnumLiteralDeclaration_88());
                      			
                    }

                    }


                    }
                    break;
                case 90 :
                    // InternalTryIde.g:7396:3: (enumLiteral_89= 'bytes23' )
                    {
                    // InternalTryIde.g:7396:3: (enumLiteral_89= 'bytes23' )
                    // InternalTryIde.g:7397:4: enumLiteral_89= 'bytes23'
                    {
                    enumLiteral_89=(Token)match(input,159,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES23EnumLiteralDeclaration_89().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_89, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES23EnumLiteralDeclaration_89());
                      			
                    }

                    }


                    }
                    break;
                case 91 :
                    // InternalTryIde.g:7404:3: (enumLiteral_90= 'bytes24' )
                    {
                    // InternalTryIde.g:7404:3: (enumLiteral_90= 'bytes24' )
                    // InternalTryIde.g:7405:4: enumLiteral_90= 'bytes24'
                    {
                    enumLiteral_90=(Token)match(input,160,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES24EnumLiteralDeclaration_90().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_90, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES24EnumLiteralDeclaration_90());
                      			
                    }

                    }


                    }
                    break;
                case 92 :
                    // InternalTryIde.g:7412:3: (enumLiteral_91= 'bytes25' )
                    {
                    // InternalTryIde.g:7412:3: (enumLiteral_91= 'bytes25' )
                    // InternalTryIde.g:7413:4: enumLiteral_91= 'bytes25'
                    {
                    enumLiteral_91=(Token)match(input,161,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES25EnumLiteralDeclaration_91().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_91, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES25EnumLiteralDeclaration_91());
                      			
                    }

                    }


                    }
                    break;
                case 93 :
                    // InternalTryIde.g:7420:3: (enumLiteral_92= 'bytes26' )
                    {
                    // InternalTryIde.g:7420:3: (enumLiteral_92= 'bytes26' )
                    // InternalTryIde.g:7421:4: enumLiteral_92= 'bytes26'
                    {
                    enumLiteral_92=(Token)match(input,162,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES26EnumLiteralDeclaration_92().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_92, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES26EnumLiteralDeclaration_92());
                      			
                    }

                    }


                    }
                    break;
                case 94 :
                    // InternalTryIde.g:7428:3: (enumLiteral_93= 'bytes27' )
                    {
                    // InternalTryIde.g:7428:3: (enumLiteral_93= 'bytes27' )
                    // InternalTryIde.g:7429:4: enumLiteral_93= 'bytes27'
                    {
                    enumLiteral_93=(Token)match(input,163,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES27EnumLiteralDeclaration_93().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_93, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES27EnumLiteralDeclaration_93());
                      			
                    }

                    }


                    }
                    break;
                case 95 :
                    // InternalTryIde.g:7436:3: (enumLiteral_94= 'bytes28' )
                    {
                    // InternalTryIde.g:7436:3: (enumLiteral_94= 'bytes28' )
                    // InternalTryIde.g:7437:4: enumLiteral_94= 'bytes28'
                    {
                    enumLiteral_94=(Token)match(input,164,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES28EnumLiteralDeclaration_94().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_94, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES28EnumLiteralDeclaration_94());
                      			
                    }

                    }


                    }
                    break;
                case 96 :
                    // InternalTryIde.g:7444:3: (enumLiteral_95= 'bytes29' )
                    {
                    // InternalTryIde.g:7444:3: (enumLiteral_95= 'bytes29' )
                    // InternalTryIde.g:7445:4: enumLiteral_95= 'bytes29'
                    {
                    enumLiteral_95=(Token)match(input,165,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES29EnumLiteralDeclaration_95().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_95, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES29EnumLiteralDeclaration_95());
                      			
                    }

                    }


                    }
                    break;
                case 97 :
                    // InternalTryIde.g:7452:3: (enumLiteral_96= 'bytes30' )
                    {
                    // InternalTryIde.g:7452:3: (enumLiteral_96= 'bytes30' )
                    // InternalTryIde.g:7453:4: enumLiteral_96= 'bytes30'
                    {
                    enumLiteral_96=(Token)match(input,166,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES30EnumLiteralDeclaration_96().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_96, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES30EnumLiteralDeclaration_96());
                      			
                    }

                    }


                    }
                    break;
                case 98 :
                    // InternalTryIde.g:7460:3: (enumLiteral_97= 'bytes31' )
                    {
                    // InternalTryIde.g:7460:3: (enumLiteral_97= 'bytes31' )
                    // InternalTryIde.g:7461:4: enumLiteral_97= 'bytes31'
                    {
                    enumLiteral_97=(Token)match(input,167,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES31EnumLiteralDeclaration_97().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_97, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES31EnumLiteralDeclaration_97());
                      			
                    }

                    }


                    }
                    break;
                case 99 :
                    // InternalTryIde.g:7468:3: (enumLiteral_98= 'bytes32' )
                    {
                    // InternalTryIde.g:7468:3: (enumLiteral_98= 'bytes32' )
                    // InternalTryIde.g:7469:4: enumLiteral_98= 'bytes32'
                    {
                    enumLiteral_98=(Token)match(input,168,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES32EnumLiteralDeclaration_98().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_98, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES32EnumLiteralDeclaration_98());
                      			
                    }

                    }


                    }
                    break;
                case 100 :
                    // InternalTryIde.g:7476:3: (enumLiteral_99= 'string' )
                    {
                    // InternalTryIde.g:7476:3: (enumLiteral_99= 'string' )
                    // InternalTryIde.g:7477:4: enumLiteral_99= 'string'
                    {
                    enumLiteral_99=(Token)match(input,169,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getSTRINGEnumLiteralDeclaration_99().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_99, grammarAccess.getElementaryTypeNameEnumAccess().getSTRINGEnumLiteralDeclaration_99());
                      			
                    }

                    }


                    }
                    break;
                case 101 :
                    // InternalTryIde.g:7484:3: (enumLiteral_100= 'address' )
                    {
                    // InternalTryIde.g:7484:3: (enumLiteral_100= 'address' )
                    // InternalTryIde.g:7485:4: enumLiteral_100= 'address'
                    {
                    enumLiteral_100=(Token)match(input,170,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getADDRESSEnumLiteralDeclaration_100().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_100, grammarAccess.getElementaryTypeNameEnumAccess().getADDRESSEnumLiteralDeclaration_100());
                      			
                    }

                    }


                    }
                    break;
                case 102 :
                    // InternalTryIde.g:7492:3: (enumLiteral_101= 'bool' )
                    {
                    // InternalTryIde.g:7492:3: (enumLiteral_101= 'bool' )
                    // InternalTryIde.g:7493:4: enumLiteral_101= 'bool'
                    {
                    enumLiteral_101=(Token)match(input,171,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBOOLEnumLiteralDeclaration_101().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_101, grammarAccess.getElementaryTypeNameEnumAccess().getBOOLEnumLiteralDeclaration_101());
                      			
                    }

                    }


                    }
                    break;
                case 103 :
                    // InternalTryIde.g:7500:3: (enumLiteral_102= 'real' )
                    {
                    // InternalTryIde.g:7500:3: (enumLiteral_102= 'real' )
                    // InternalTryIde.g:7501:4: enumLiteral_102= 'real'
                    {
                    enumLiteral_102=(Token)match(input,172,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getREALEnumLiteralDeclaration_102().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_102, grammarAccess.getElementaryTypeNameEnumAccess().getREALEnumLiteralDeclaration_102());
                      			
                    }

                    }


                    }
                    break;
                case 104 :
                    // InternalTryIde.g:7508:3: (enumLiteral_103= 'ureal' )
                    {
                    // InternalTryIde.g:7508:3: (enumLiteral_103= 'ureal' )
                    // InternalTryIde.g:7509:4: enumLiteral_103= 'ureal'
                    {
                    enumLiteral_103=(Token)match(input,173,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7519:1: ruleLocationSpecifierEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) ) ;
    public final Enumerator ruleLocationSpecifierEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTryIde.g:7525:2: ( ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) ) )
            // InternalTryIde.g:7526:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) )
            {
            // InternalTryIde.g:7526:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) )
            int alt102=3;
            switch ( input.LA(1) ) {
            case 174:
                {
                alt102=1;
                }
                break;
            case 175:
                {
                alt102=2;
                }
                break;
            case 176:
                {
                alt102=3;
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
                    // InternalTryIde.g:7527:3: (enumLiteral_0= 'memory' )
                    {
                    // InternalTryIde.g:7527:3: (enumLiteral_0= 'memory' )
                    // InternalTryIde.g:7528:4: enumLiteral_0= 'memory'
                    {
                    enumLiteral_0=(Token)match(input,174,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7535:3: (enumLiteral_1= 'storage' )
                    {
                    // InternalTryIde.g:7535:3: (enumLiteral_1= 'storage' )
                    // InternalTryIde.g:7536:4: enumLiteral_1= 'storage'
                    {
                    enumLiteral_1=(Token)match(input,175,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryIde.g:7543:3: (enumLiteral_2= 'calldata' )
                    {
                    // InternalTryIde.g:7543:3: (enumLiteral_2= 'calldata' )
                    // InternalTryIde.g:7544:4: enumLiteral_2= 'calldata'
                    {
                    enumLiteral_2=(Token)match(input,176,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getCALLDATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getLocationSpecifierEnumAccess().getCALLDATAEnumLiteralDeclaration_2());
                      			
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
    // InternalTryIde.g:7554:1: ruleVisibilityEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) ;
    public final Enumerator ruleVisibilityEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTryIde.g:7560:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) )
            // InternalTryIde.g:7561:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            {
            // InternalTryIde.g:7561:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            int alt103=4;
            switch ( input.LA(1) ) {
            case 177:
                {
                alt103=1;
                }
                break;
            case 178:
                {
                alt103=2;
                }
                break;
            case 179:
                {
                alt103=3;
                }
                break;
            case 180:
                {
                alt103=4;
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
                    // InternalTryIde.g:7562:3: (enumLiteral_0= 'public' )
                    {
                    // InternalTryIde.g:7562:3: (enumLiteral_0= 'public' )
                    // InternalTryIde.g:7563:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,177,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7570:3: (enumLiteral_1= 'internal' )
                    {
                    // InternalTryIde.g:7570:3: (enumLiteral_1= 'internal' )
                    // InternalTryIde.g:7571:4: enumLiteral_1= 'internal'
                    {
                    enumLiteral_1=(Token)match(input,178,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryIde.g:7578:3: (enumLiteral_2= 'private' )
                    {
                    // InternalTryIde.g:7578:3: (enumLiteral_2= 'private' )
                    // InternalTryIde.g:7579:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,179,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryIde.g:7586:3: (enumLiteral_3= 'external' )
                    {
                    // InternalTryIde.g:7586:3: (enumLiteral_3= 'external' )
                    // InternalTryIde.g:7587:4: enumLiteral_3= 'external'
                    {
                    enumLiteral_3=(Token)match(input,180,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7597:1: ruleAssignmentOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) ;
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
            // InternalTryIde.g:7603:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) )
            // InternalTryIde.g:7604:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            {
            // InternalTryIde.g:7604:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            int alt104=12;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt104=1;
                }
                break;
            case 181:
                {
                alt104=2;
                }
                break;
            case 182:
                {
                alt104=3;
                }
                break;
            case 183:
                {
                alt104=4;
                }
                break;
            case 184:
                {
                alt104=5;
                }
                break;
            case 185:
                {
                alt104=6;
                }
                break;
            case 186:
                {
                alt104=7;
                }
                break;
            case 187:
                {
                alt104=8;
                }
                break;
            case 188:
                {
                alt104=9;
                }
                break;
            case 189:
                {
                alt104=10;
                }
                break;
            case 190:
                {
                alt104=11;
                }
                break;
            case 191:
                {
                alt104=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalTryIde.g:7605:3: (enumLiteral_0= '=' )
                    {
                    // InternalTryIde.g:7605:3: (enumLiteral_0= '=' )
                    // InternalTryIde.g:7606:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOpEnumAccess().getASSIGNEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7613:3: (enumLiteral_1= '|=' )
                    {
                    // InternalTryIde.g:7613:3: (enumLiteral_1= '|=' )
                    // InternalTryIde.g:7614:4: enumLiteral_1= '|='
                    {
                    enumLiteral_1=(Token)match(input,181,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryIde.g:7621:3: (enumLiteral_2= '^=' )
                    {
                    // InternalTryIde.g:7621:3: (enumLiteral_2= '^=' )
                    // InternalTryIde.g:7622:4: enumLiteral_2= '^='
                    {
                    enumLiteral_2=(Token)match(input,182,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryIde.g:7629:3: (enumLiteral_3= '&=' )
                    {
                    // InternalTryIde.g:7629:3: (enumLiteral_3= '&=' )
                    // InternalTryIde.g:7630:4: enumLiteral_3= '&='
                    {
                    enumLiteral_3=(Token)match(input,183,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryIde.g:7637:3: (enumLiteral_4= '<<=' )
                    {
                    // InternalTryIde.g:7637:3: (enumLiteral_4= '<<=' )
                    // InternalTryIde.g:7638:4: enumLiteral_4= '<<='
                    {
                    enumLiteral_4=(Token)match(input,184,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryIde.g:7645:3: (enumLiteral_5= '>>=' )
                    {
                    // InternalTryIde.g:7645:3: (enumLiteral_5= '>>=' )
                    // InternalTryIde.g:7646:4: enumLiteral_5= '>>='
                    {
                    enumLiteral_5=(Token)match(input,185,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTryIde.g:7653:3: (enumLiteral_6= '>>>=' )
                    {
                    // InternalTryIde.g:7653:3: (enumLiteral_6= '>>>=' )
                    // InternalTryIde.g:7654:4: enumLiteral_6= '>>>='
                    {
                    enumLiteral_6=(Token)match(input,186,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalTryIde.g:7661:3: (enumLiteral_7= '+=' )
                    {
                    // InternalTryIde.g:7661:3: (enumLiteral_7= '+=' )
                    // InternalTryIde.g:7662:4: enumLiteral_7= '+='
                    {
                    enumLiteral_7=(Token)match(input,187,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalTryIde.g:7669:3: (enumLiteral_8= '-=' )
                    {
                    // InternalTryIde.g:7669:3: (enumLiteral_8= '-=' )
                    // InternalTryIde.g:7670:4: enumLiteral_8= '-='
                    {
                    enumLiteral_8=(Token)match(input,188,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalTryIde.g:7677:3: (enumLiteral_9= '*=' )
                    {
                    // InternalTryIde.g:7677:3: (enumLiteral_9= '*=' )
                    // InternalTryIde.g:7678:4: enumLiteral_9= '*='
                    {
                    enumLiteral_9=(Token)match(input,189,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalTryIde.g:7685:3: (enumLiteral_10= '/=' )
                    {
                    // InternalTryIde.g:7685:3: (enumLiteral_10= '/=' )
                    // InternalTryIde.g:7686:4: enumLiteral_10= '/='
                    {
                    enumLiteral_10=(Token)match(input,190,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalTryIde.g:7693:3: (enumLiteral_11= '%=' )
                    {
                    // InternalTryIde.g:7693:3: (enumLiteral_11= '%=' )
                    // InternalTryIde.g:7694:4: enumLiteral_11= '%='
                    {
                    enumLiteral_11=(Token)match(input,191,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7704:1: ruleEqualityOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryIde.g:7710:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalTryIde.g:7711:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalTryIde.g:7711:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==192) ) {
                alt105=1;
            }
            else if ( (LA105_0==193) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalTryIde.g:7712:3: (enumLiteral_0= '==' )
                    {
                    // InternalTryIde.g:7712:3: (enumLiteral_0= '==' )
                    // InternalTryIde.g:7713:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,192,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7720:3: (enumLiteral_1= '!=' )
                    {
                    // InternalTryIde.g:7720:3: (enumLiteral_1= '!=' )
                    // InternalTryIde.g:7721:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,193,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7731:1: ruleComparisonOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) ;
    public final Enumerator ruleComparisonOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalTryIde.g:7737:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) )
            // InternalTryIde.g:7738:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            {
            // InternalTryIde.g:7738:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            int alt106=5;
            switch ( input.LA(1) ) {
            case 194:
                {
                alt106=1;
                }
                break;
            case 195:
                {
                alt106=2;
                }
                break;
            case 196:
                {
                alt106=3;
                }
                break;
            case 197:
                {
                alt106=4;
                }
                break;
            case 198:
                {
                alt106=5;
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
                    // InternalTryIde.g:7739:3: (enumLiteral_0= '<' )
                    {
                    // InternalTryIde.g:7739:3: (enumLiteral_0= '<' )
                    // InternalTryIde.g:7740:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,194,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7747:3: (enumLiteral_1= '>' )
                    {
                    // InternalTryIde.g:7747:3: (enumLiteral_1= '>' )
                    // InternalTryIde.g:7748:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,195,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryIde.g:7755:3: (enumLiteral_2= '<=' )
                    {
                    // InternalTryIde.g:7755:3: (enumLiteral_2= '<=' )
                    // InternalTryIde.g:7756:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,196,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryIde.g:7763:3: (enumLiteral_3= '>=' )
                    {
                    // InternalTryIde.g:7763:3: (enumLiteral_3= '>=' )
                    // InternalTryIde.g:7764:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,197,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryIde.g:7771:3: (enumLiteral_4= 'in' )
                    {
                    // InternalTryIde.g:7771:3: (enumLiteral_4= 'in' )
                    // InternalTryIde.g:7772:4: enumLiteral_4= 'in'
                    {
                    enumLiteral_4=(Token)match(input,198,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7782:1: ruleShiftOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) ;
    public final Enumerator ruleShiftOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTryIde.g:7788:2: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) )
            // InternalTryIde.g:7789:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            {
            // InternalTryIde.g:7789:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            int alt107=3;
            switch ( input.LA(1) ) {
            case 199:
                {
                alt107=1;
                }
                break;
            case 200:
                {
                alt107=2;
                }
                break;
            case 201:
                {
                alt107=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalTryIde.g:7790:3: (enumLiteral_0= '<<' )
                    {
                    // InternalTryIde.g:7790:3: (enumLiteral_0= '<<' )
                    // InternalTryIde.g:7791:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,199,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7798:3: (enumLiteral_1= '>>' )
                    {
                    // InternalTryIde.g:7798:3: (enumLiteral_1= '>>' )
                    // InternalTryIde.g:7799:4: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,200,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryIde.g:7806:3: (enumLiteral_2= '>>>' )
                    {
                    // InternalTryIde.g:7806:3: (enumLiteral_2= '>>>' )
                    // InternalTryIde.g:7807:4: enumLiteral_2= '>>>'
                    {
                    enumLiteral_2=(Token)match(input,201,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7817:1: ruleAdditionOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryIde.g:7823:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalTryIde.g:7824:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalTryIde.g:7824:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==65) ) {
                alt108=1;
            }
            else if ( (LA108_0==66) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalTryIde.g:7825:3: (enumLiteral_0= '+' )
                    {
                    // InternalTryIde.g:7825:3: (enumLiteral_0= '+' )
                    // InternalTryIde.g:7826:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7833:3: (enumLiteral_1= '-' )
                    {
                    // InternalTryIde.g:7833:3: (enumLiteral_1= '-' )
                    // InternalTryIde.g:7834:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7844:1: ruleMulDivModOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMulDivModOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTryIde.g:7850:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalTryIde.g:7851:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalTryIde.g:7851:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt109=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt109=1;
                }
                break;
            case 202:
                {
                alt109=2;
                }
                break;
            case 203:
                {
                alt109=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalTryIde.g:7852:3: (enumLiteral_0= '*' )
                    {
                    // InternalTryIde.g:7852:3: (enumLiteral_0= '*' )
                    // InternalTryIde.g:7853:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7860:3: (enumLiteral_1= '/' )
                    {
                    // InternalTryIde.g:7860:3: (enumLiteral_1= '/' )
                    // InternalTryIde.g:7861:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,202,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMulDivModOpEnumAccess().getDIVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryIde.g:7868:3: (enumLiteral_2= '%' )
                    {
                    // InternalTryIde.g:7868:3: (enumLiteral_2= '%' )
                    // InternalTryIde.g:7869:4: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,203,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7879:1: ruleIncDecOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncDecOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryIde.g:7885:2: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalTryIde.g:7886:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalTryIde.g:7886:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==68) ) {
                alt110=1;
            }
            else if ( (LA110_0==69) ) {
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
                    // InternalTryIde.g:7887:3: (enumLiteral_0= '++' )
                    {
                    // InternalTryIde.g:7887:3: (enumLiteral_0= '++' )
                    // InternalTryIde.g:7888:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7895:3: (enumLiteral_1= '--' )
                    {
                    // InternalTryIde.g:7895:3: (enumLiteral_1= '--' )
                    // InternalTryIde.g:7896:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7906:1: ruleBooleanLiteralEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteralEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryIde.g:7912:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalTryIde.g:7913:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalTryIde.g:7913:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==204) ) {
                alt111=1;
            }
            else if ( (LA111_0==205) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalTryIde.g:7914:3: (enumLiteral_0= 'true' )
                    {
                    // InternalTryIde.g:7914:3: (enumLiteral_0= 'true' )
                    // InternalTryIde.g:7915:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,204,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7922:3: (enumLiteral_1= 'false' )
                    {
                    // InternalTryIde.g:7922:3: (enumLiteral_1= 'false' )
                    // InternalTryIde.g:7923:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,205,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7933:1: ruleEtherSubDenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) ;
    public final Enumerator ruleEtherSubDenominationEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTryIde.g:7939:2: ( ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) )
            // InternalTryIde.g:7940:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            {
            // InternalTryIde.g:7940:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            int alt112=4;
            switch ( input.LA(1) ) {
            case 206:
                {
                alt112=1;
                }
                break;
            case 207:
                {
                alt112=2;
                }
                break;
            case 208:
                {
                alt112=3;
                }
                break;
            case 209:
                {
                alt112=4;
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
                    // InternalTryIde.g:7941:3: (enumLiteral_0= 'wei' )
                    {
                    // InternalTryIde.g:7941:3: (enumLiteral_0= 'wei' )
                    // InternalTryIde.g:7942:4: enumLiteral_0= 'wei'
                    {
                    enumLiteral_0=(Token)match(input,206,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getWEIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEtherSubDenominationEnumAccess().getWEIEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7949:3: (enumLiteral_1= 'szabo' )
                    {
                    // InternalTryIde.g:7949:3: (enumLiteral_1= 'szabo' )
                    // InternalTryIde.g:7950:4: enumLiteral_1= 'szabo'
                    {
                    enumLiteral_1=(Token)match(input,207,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getSZABOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEtherSubDenominationEnumAccess().getSZABOEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryIde.g:7957:3: (enumLiteral_2= 'finney' )
                    {
                    // InternalTryIde.g:7957:3: (enumLiteral_2= 'finney' )
                    // InternalTryIde.g:7958:4: enumLiteral_2= 'finney'
                    {
                    enumLiteral_2=(Token)match(input,208,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getFINNEYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEtherSubDenominationEnumAccess().getFINNEYEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryIde.g:7965:3: (enumLiteral_3= 'ether' )
                    {
                    // InternalTryIde.g:7965:3: (enumLiteral_3= 'ether' )
                    // InternalTryIde.g:7966:4: enumLiteral_3= 'ether'
                    {
                    enumLiteral_3=(Token)match(input,209,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryIde.g:7976:1: ruleTimeSubdenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) ;
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
            // InternalTryIde.g:7982:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) )
            // InternalTryIde.g:7983:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            {
            // InternalTryIde.g:7983:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            int alt113=6;
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
            case 213:
                {
                alt113=4;
                }
                break;
            case 214:
                {
                alt113=5;
                }
                break;
            case 215:
                {
                alt113=6;
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
                    // InternalTryIde.g:7984:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalTryIde.g:7984:3: (enumLiteral_0= 'seconds' )
                    // InternalTryIde.g:7985:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,210,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeSubdenominationEnumAccess().getSECONDSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:7992:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalTryIde.g:7992:3: (enumLiteral_1= 'minutes' )
                    // InternalTryIde.g:7993:4: enumLiteral_1= 'minutes'
                    {
                    enumLiteral_1=(Token)match(input,211,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getMINUTESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeSubdenominationEnumAccess().getMINUTESEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryIde.g:8000:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalTryIde.g:8000:3: (enumLiteral_2= 'hours' )
                    // InternalTryIde.g:8001:4: enumLiteral_2= 'hours'
                    {
                    enumLiteral_2=(Token)match(input,212,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getHOURSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeSubdenominationEnumAccess().getHOURSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryIde.g:8008:3: (enumLiteral_3= 'days' )
                    {
                    // InternalTryIde.g:8008:3: (enumLiteral_3= 'days' )
                    // InternalTryIde.g:8009:4: enumLiteral_3= 'days'
                    {
                    enumLiteral_3=(Token)match(input,213,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getDAYSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTimeSubdenominationEnumAccess().getDAYSEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryIde.g:8016:3: (enumLiteral_4= 'weeks' )
                    {
                    // InternalTryIde.g:8016:3: (enumLiteral_4= 'weeks' )
                    // InternalTryIde.g:8017:4: enumLiteral_4= 'weeks'
                    {
                    enumLiteral_4=(Token)match(input,214,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getWEEKSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTimeSubdenominationEnumAccess().getWEEKSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryIde.g:8024:3: (enumLiteral_5= 'years' )
                    {
                    // InternalTryIde.g:8024:3: (enumLiteral_5= 'years' )
                    // InternalTryIde.g:8025:4: enumLiteral_5= 'years'
                    {
                    enumLiteral_5=(Token)match(input,215,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleSpecialExpressionTypeEnum"
    // InternalTryIde.g:8035:1: ruleSpecialExpressionTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) ;
    public final Enumerator ruleSpecialExpressionTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryIde.g:8041:2: ( ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) )
            // InternalTryIde.g:8042:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            {
            // InternalTryIde.g:8042:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==216) ) {
                alt114=1;
            }
            else if ( (LA114_0==217) ) {
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
                    // InternalTryIde.g:8043:3: (enumLiteral_0= 'super' )
                    {
                    // InternalTryIde.g:8043:3: (enumLiteral_0= 'super' )
                    // InternalTryIde.g:8044:4: enumLiteral_0= 'super'
                    {
                    enumLiteral_0=(Token)match(input,216,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSpecialExpressionTypeEnumAccess().getSUPEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSpecialExpressionTypeEnumAccess().getSUPEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryIde.g:8051:3: (enumLiteral_1= 'this' )
                    {
                    // InternalTryIde.g:8051:3: (enumLiteral_1= 'this' )
                    // InternalTryIde.g:8052:4: enumLiteral_1= 'this'
                    {
                    enumLiteral_1=(Token)match(input,217,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalTryIde
    public final void synpred1_InternalTryIde_fragment() throws RecognitionException {   
        // InternalTryIde.g:3934:5: ( 'else' )
        // InternalTryIde.g:3934:6: 'else'
        {
        match(input,49,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTryIde

    // $ANTLR start synpred2_InternalTryIde
    public final void synpred2_InternalTryIde_fragment() throws RecognitionException {   
        // InternalTryIde.g:4076:4: ( ';' )
        // InternalTryIde.g:4076:5: ';'
        {
        match(input,18,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTryIde

    // $ANTLR start synpred3_InternalTryIde
    public final void synpred3_InternalTryIde_fragment() throws RecognitionException {   
        // InternalTryIde.g:5225:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )
        // InternalTryIde.g:5225:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        {
        // InternalTryIde.g:5225:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        // InternalTryIde.g:5226:5: () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) )
        {
        // InternalTryIde.g:5226:5: ()
        // InternalTryIde.g:5227:5: 
        {
        }

        // InternalTryIde.g:5228:5: ( ( ruleAdditionOpEnum ) )
        // InternalTryIde.g:5229:6: ( ruleAdditionOpEnum )
        {
        // InternalTryIde.g:5229:6: ( ruleAdditionOpEnum )
        // InternalTryIde.g:5230:7: ruleAdditionOpEnum
        {
        pushFollow(FOLLOW_19);
        ruleAdditionOpEnum();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalTryIde.g:5233:5: ( ( ruleMulDivMod ) )
        // InternalTryIde.g:5234:6: ( ruleMulDivMod )
        {
        // InternalTryIde.g:5234:6: ( ruleMulDivMod )
        // InternalTryIde.g:5235:7: ruleMulDivMod
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
    // $ANTLR end synpred3_InternalTryIde

    // Delegated rules

    public final boolean synpred3_InternalTryIde() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalTryIde_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalTryIde() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTryIde_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalTryIde() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTryIde_fragment(); // can never throw exception
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
    static final String dfa_3s = "\1\u00d9\150\u00b4\3\uffff";
    static final String dfa_4s = "\151\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\154\uffff}>";
    static final String[] dfa_6s = {
            "\11\153\17\uffff\1\153\11\uffff\1\151\3\uffff\1\152\24\uffff\7\153\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\36\uffff\2\153\12\uffff\2\153",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
            "\1\151\26\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0085\uffff\7\151",
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
            return "2551:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
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
            return "2795:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000A020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000344C81000020L,0xFFFFFFFFFFFFFFC0L,0x001E3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x8000004030001FF0L,0xFFFFFFFFFFFFFFFFL,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8000004010001FF0L,0xFFFFFFFFFFFFFFFFL,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300440020L,0x0000000000000000L,0x001E000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000044001000020L,0xFFFFFFFFFFFFFFC0L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002200000020L,0x0000000000000000L,0x001FC00000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFFFFFFFC0L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000044000000020L,0xFFFFFFFFFFFFFFC0L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000024010001FF0L,0xFFFFFFFFFFFFFFFFL,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8000004030801FF0L,0xFFFFFFFFFFFFFFFFL,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8000004010801FF0L,0xFFFFFFFFFFFFFFFFL,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002210000020L,0x0000000000000000L,0x001FC00000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000090010000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000010400020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400010040020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000044020000020L,0xFFFFFFFFFFFFFFC0L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000002200000022L,0x0000000000000000L,0x001FC00000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000020L,0xFFFFFFFFFFFFFFC0L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x81FD844010401FF0L,0xFFFFFFFFFFFFFFFFL,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x81FD844010441FF0L,0xFFFFFFFFFFFFFFFFL,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000004010041FF0L,0xFFFFFFFFFFFFFFFFL,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x81FD844030401FF0L,0xFFFFFFFFFFFFFFFFL,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x81FD844011401FF0L,0xFFFFFFFFFFFFFFFFL,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000003200000022L,0x0000000000000000L,0xFFFFC00000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000004010001FF0L,0xFFFFFFFFFFFFFFC0L,0x00003FFFFFFFFFFFL,0x0000000003003000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000003C000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000FC0000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000080000000000L});

}