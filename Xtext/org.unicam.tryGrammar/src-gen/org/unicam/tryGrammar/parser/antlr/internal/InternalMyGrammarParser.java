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
import org.unicam.tryGrammar.services.MyGrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyGrammarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEX", "RULE_DECIMAL", "RULE_BLOCK", "RULE_MSG", "RULE_TX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'*'", "'as'", "'from'", "'{'", "','", "'}'", "'contract'", "'is'", "'library'", "'('", "')'", "':'", "'payable'", "'function'", "'returns'", "'constant'", "'struct'", "'enum'", "'='", "'indexed'", "'mapping'", "'=>'", "'['", "']'", "'var'", "'.'", "'modifier'", "'event'", "'delete'", "'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'return'", "'throw'", "'_'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'**'", "'!'", "'~'", "'+'", "'-'", "'new'", "'++'", "'--'", "'gasleft'", "'now'", "'int'", "'int16'", "'int24'", "'int32'", "'int40'", "'int48'", "'int56'", "'int64'", "'int72'", "'int80'", "'int88'", "'int96'", "'int104'", "'int112'", "'int120'", "'int128'", "'int136'", "'int144'", "'int152'", "'int160'", "'int168'", "'int178'", "'int184'", "'int192'", "'int200'", "'int208'", "'int216'", "'int224'", "'int232'", "'int240'", "'int248'", "'int256'", "'uint'", "'uint8'", "'uint16'", "'uint24'", "'uint32'", "'uint40'", "'uint48'", "'uint56'", "'uint64'", "'uint72'", "'uint80'", "'uint88'", "'uint96'", "'uint104'", "'uint112'", "'uint120'", "'uint128'", "'uint136'", "'uint144'", "'uint152'", "'uint160'", "'uint168'", "'uint178'", "'uint184'", "'uint192'", "'uint200'", "'uint208'", "'uint216'", "'uint224'", "'uint232'", "'uint240'", "'uint248'", "'uint256'", "'byte'", "'bytes'", "'bytes1'", "'bytes2'", "'bytes3'", "'bytes4'", "'bytes5'", "'bytes6'", "'bytes7'", "'bytes8'", "'bytes9'", "'bytes10'", "'bytes11'", "'bytes12'", "'bytes13'", "'bytes14'", "'bytes15'", "'bytes16'", "'bytes17'", "'bytes18'", "'bytes19'", "'bytes20'", "'bytes21'", "'bytes22'", "'bytes23'", "'bytes24'", "'bytes25'", "'bytes26'", "'bytes27'", "'bytes28'", "'bytes29'", "'bytes30'", "'bytes31'", "'bytes32'", "'string'", "'address'", "'bool'", "'real'", "'ureal'", "'memory'", "'storage'", "'calldata'", "'public'", "'internal'", "'private'", "'external'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'>>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'in'", "'<<'", "'>>'", "'>>>'", "'/'", "'%'", "'true'", "'false'", "'wei'", "'szabo'", "'finney'", "'ether'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'years'", "'super'", "'this'"
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
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__218=218;
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
    public static final int RULE_SL_COMMENT=13;
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
    public static final int RULE_ML_COMMENT=12;
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
    public static final int RULE_WS=14;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMyGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyGrammar.g"; }



     	private MyGrammarGrammarAccess grammarAccess;

        public InternalMyGrammarParser(TokenStream input, MyGrammarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Solidity";
       	}

       	@Override
       	protected MyGrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSolidity"
    // InternalMyGrammar.g:65:1: entryRuleSolidity returns [EObject current=null] : iv_ruleSolidity= ruleSolidity EOF ;
    public final EObject entryRuleSolidity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolidity = null;


        try {
            // InternalMyGrammar.g:65:49: (iv_ruleSolidity= ruleSolidity EOF )
            // InternalMyGrammar.g:66:2: iv_ruleSolidity= ruleSolidity EOF
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
    // InternalMyGrammar.g:72:1: ruleSolidity returns [EObject current=null] : ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )* ;
    public final EObject ruleSolidity() throws RecognitionException {
        EObject current = null;

        EObject lv_importDirective_0_0 = null;

        EObject lv_contract_1_0 = null;

        EObject lv_library_2_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:78:2: ( ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )* )
            // InternalMyGrammar.g:79:2: ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )*
            {
            // InternalMyGrammar.g:79:2: ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) | ( (lv_library_2_0= ruleLibrary ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt1=1;
                    }
                    break;
                case 24:
                    {
                    alt1=2;
                    }
                    break;
                case 26:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalMyGrammar.g:80:3: ( (lv_importDirective_0_0= ruleImportDirective ) )
            	    {
            	    // InternalMyGrammar.g:80:3: ( (lv_importDirective_0_0= ruleImportDirective ) )
            	    // InternalMyGrammar.g:81:4: (lv_importDirective_0_0= ruleImportDirective )
            	    {
            	    // InternalMyGrammar.g:81:4: (lv_importDirective_0_0= ruleImportDirective )
            	    // InternalMyGrammar.g:82:5: lv_importDirective_0_0= ruleImportDirective
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
            	      						"org.unicam.tryGrammar.MyGrammar.ImportDirective");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyGrammar.g:100:3: ( (lv_contract_1_0= ruleContract ) )
            	    {
            	    // InternalMyGrammar.g:100:3: ( (lv_contract_1_0= ruleContract ) )
            	    // InternalMyGrammar.g:101:4: (lv_contract_1_0= ruleContract )
            	    {
            	    // InternalMyGrammar.g:101:4: (lv_contract_1_0= ruleContract )
            	    // InternalMyGrammar.g:102:5: lv_contract_1_0= ruleContract
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
            	      						"org.unicam.tryGrammar.MyGrammar.Contract");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyGrammar.g:120:3: ( (lv_library_2_0= ruleLibrary ) )
            	    {
            	    // InternalMyGrammar.g:120:3: ( (lv_library_2_0= ruleLibrary ) )
            	    // InternalMyGrammar.g:121:4: (lv_library_2_0= ruleLibrary )
            	    {
            	    // InternalMyGrammar.g:121:4: (lv_library_2_0= ruleLibrary )
            	    // InternalMyGrammar.g:122:5: lv_library_2_0= ruleLibrary
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
            	      						"org.unicam.tryGrammar.MyGrammar.Library");
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
    // InternalMyGrammar.g:143:1: entryRuleImportDirective returns [EObject current=null] : iv_ruleImportDirective= ruleImportDirective EOF ;
    public final EObject entryRuleImportDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDirective = null;


        try {
            // InternalMyGrammar.g:143:56: (iv_ruleImportDirective= ruleImportDirective EOF )
            // InternalMyGrammar.g:144:2: iv_ruleImportDirective= ruleImportDirective EOF
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
    // InternalMyGrammar.g:150:1: ruleImportDirective returns [EObject current=null] : ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) ) ;
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
            // InternalMyGrammar.g:156:2: ( ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) ) )
            // InternalMyGrammar.g:157:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) )
            {
            // InternalMyGrammar.g:157:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    alt3=3;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt3=1;
                    }
                    break;
                case 18:
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
                    // InternalMyGrammar.g:158:3: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
                    {
                    // InternalMyGrammar.g:158:3: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
                    // InternalMyGrammar.g:159:4: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getImportDirectiveAccess().getImportKeyword_0_0());
                      			
                    }
                    // InternalMyGrammar.g:163:4: ( (lv_importURI_1_0= RULE_STRING ) )
                    // InternalMyGrammar.g:164:5: (lv_importURI_1_0= RULE_STRING )
                    {
                    // InternalMyGrammar.g:164:5: (lv_importURI_1_0= RULE_STRING )
                    // InternalMyGrammar.g:165:6: lv_importURI_1_0= RULE_STRING
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
                      							"org.unicam.tryGrammar.MyGrammar.STRING");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getImportDirectiveAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:187:3: (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' )
                    {
                    // InternalMyGrammar.g:187:3: (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' )
                    // InternalMyGrammar.g:188:4: otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getImportDirectiveAccess().getImportKeyword_1_0());
                      			
                    }
                    otherlv_4=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getImportDirectiveAccess().getAsteriskKeyword_1_1());
                      			
                    }
                    otherlv_5=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getImportDirectiveAccess().getAsKeyword_1_2());
                      			
                    }
                    // InternalMyGrammar.g:200:4: ( (lv_unitAlias_6_0= RULE_ID ) )
                    // InternalMyGrammar.g:201:5: (lv_unitAlias_6_0= RULE_ID )
                    {
                    // InternalMyGrammar.g:201:5: (lv_unitAlias_6_0= RULE_ID )
                    // InternalMyGrammar.g:202:6: lv_unitAlias_6_0= RULE_ID
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
                      							"org.unicam.tryGrammar.MyGrammar.ID");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getImportDirectiveAccess().getFromKeyword_1_4());
                      			
                    }
                    // InternalMyGrammar.g:222:4: ( (lv_importURI_8_0= RULE_STRING ) )
                    // InternalMyGrammar.g:223:5: (lv_importURI_8_0= RULE_STRING )
                    {
                    // InternalMyGrammar.g:223:5: (lv_importURI_8_0= RULE_STRING )
                    // InternalMyGrammar.g:224:6: lv_importURI_8_0= RULE_STRING
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
                      							"org.unicam.tryGrammar.MyGrammar.STRING");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getImportDirectiveAccess().getSemicolonKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:246:3: (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' )
                    {
                    // InternalMyGrammar.g:246:3: (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' )
                    // InternalMyGrammar.g:247:4: otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getImportDirectiveAccess().getImportKeyword_2_0());
                      			
                    }
                    otherlv_11=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getImportDirectiveAccess().getLeftCurlyBracketKeyword_2_1());
                      			
                    }
                    // InternalMyGrammar.g:255:4: ( (lv_symbolAliases_12_0= ruleSymbolAlias ) )
                    // InternalMyGrammar.g:256:5: (lv_symbolAliases_12_0= ruleSymbolAlias )
                    {
                    // InternalMyGrammar.g:256:5: (lv_symbolAliases_12_0= ruleSymbolAlias )
                    // InternalMyGrammar.g:257:6: lv_symbolAliases_12_0= ruleSymbolAlias
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
                      							"org.unicam.tryGrammar.MyGrammar.SymbolAlias");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyGrammar.g:274:4: (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==22) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalMyGrammar.g:275:5: otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) )
                            {
                            otherlv_13=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getImportDirectiveAccess().getCommaKeyword_2_3_0());
                              				
                            }
                            // InternalMyGrammar.g:279:5: ( (lv_symbolAliases_14_0= ruleSymbolAlias ) )
                            // InternalMyGrammar.g:280:6: (lv_symbolAliases_14_0= ruleSymbolAlias )
                            {
                            // InternalMyGrammar.g:280:6: (lv_symbolAliases_14_0= ruleSymbolAlias )
                            // InternalMyGrammar.g:281:7: lv_symbolAliases_14_0= ruleSymbolAlias
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
                              								"org.unicam.tryGrammar.MyGrammar.SymbolAlias");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getImportDirectiveAccess().getRightCurlyBracketKeyword_2_4());
                      			
                    }
                    otherlv_16=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getImportDirectiveAccess().getFromKeyword_2_5());
                      			
                    }
                    // InternalMyGrammar.g:307:4: ( (lv_importURI_17_0= RULE_STRING ) )
                    // InternalMyGrammar.g:308:5: (lv_importURI_17_0= RULE_STRING )
                    {
                    // InternalMyGrammar.g:308:5: (lv_importURI_17_0= RULE_STRING )
                    // InternalMyGrammar.g:309:6: lv_importURI_17_0= RULE_STRING
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
                      							"org.unicam.tryGrammar.MyGrammar.STRING");
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:334:1: entryRuleSymbolAlias returns [EObject current=null] : iv_ruleSymbolAlias= ruleSymbolAlias EOF ;
    public final EObject entryRuleSymbolAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolAlias = null;


        try {
            // InternalMyGrammar.g:334:52: (iv_ruleSymbolAlias= ruleSymbolAlias EOF )
            // InternalMyGrammar.g:335:2: iv_ruleSymbolAlias= ruleSymbolAlias EOF
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
    // InternalMyGrammar.g:341:1: ruleSymbolAlias returns [EObject current=null] : ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSymbolAlias() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:347:2: ( ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) ) )
            // InternalMyGrammar.g:348:2: ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )
            {
            // InternalMyGrammar.g:348:2: ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )
            // InternalMyGrammar.g:349:3: ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
            {
            // InternalMyGrammar.g:349:3: ( (lv_symbol_0_0= RULE_ID ) )
            // InternalMyGrammar.g:350:4: (lv_symbol_0_0= RULE_ID )
            {
            // InternalMyGrammar.g:350:4: (lv_symbol_0_0= RULE_ID )
            // InternalMyGrammar.g:351:5: lv_symbol_0_0= RULE_ID
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSymbolAliasAccess().getAsKeyword_1());
              		
            }
            // InternalMyGrammar.g:371:3: ( (lv_alias_2_0= RULE_ID ) )
            // InternalMyGrammar.g:372:4: (lv_alias_2_0= RULE_ID )
            {
            // InternalMyGrammar.g:372:4: (lv_alias_2_0= RULE_ID )
            // InternalMyGrammar.g:373:5: lv_alias_2_0= RULE_ID
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
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
    // InternalMyGrammar.g:393:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalMyGrammar.g:393:49: (iv_ruleContract= ruleContract EOF )
            // InternalMyGrammar.g:394:2: iv_ruleContract= ruleContract EOF
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
    // InternalMyGrammar.g:400:1: ruleContract returns [EObject current=null] : (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) ;
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
            // InternalMyGrammar.g:406:2: ( (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) )
            // InternalMyGrammar.g:407:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            {
            // InternalMyGrammar.g:407:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            // InternalMyGrammar.g:408:3: otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
              		
            }
            // InternalMyGrammar.g:412:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyGrammar.g:413:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyGrammar.g:413:4: (lv_name_1_0= RULE_ID )
            // InternalMyGrammar.g:414:5: lv_name_1_0= RULE_ID
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            // InternalMyGrammar.g:430:3: (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyGrammar.g:431:4: otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContractAccess().getIsKeyword_2_0());
                      			
                    }
                    // InternalMyGrammar.g:435:4: ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) )
                    // InternalMyGrammar.g:436:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    {
                    // InternalMyGrammar.g:436:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    // InternalMyGrammar.g:437:6: lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier
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
                      							"org.unicam.tryGrammar.MyGrammar.InheritanceSpecifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyGrammar.g:454:4: (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyGrammar.g:455:5: otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getContractAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalMyGrammar.g:459:5: ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    // InternalMyGrammar.g:460:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    {
                    	    // InternalMyGrammar.g:460:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    // InternalMyGrammar.g:461:7: lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier
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
                    	      								"org.unicam.tryGrammar.MyGrammar.InheritanceSpecifier");
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

            // InternalMyGrammar.g:480:3: ( (lv_body_6_0= ruleDefinitionBody ) )
            // InternalMyGrammar.g:481:4: (lv_body_6_0= ruleDefinitionBody )
            {
            // InternalMyGrammar.g:481:4: (lv_body_6_0= ruleDefinitionBody )
            // InternalMyGrammar.g:482:5: lv_body_6_0= ruleDefinitionBody
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
              						"org.unicam.tryGrammar.MyGrammar.DefinitionBody");
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
    // InternalMyGrammar.g:503:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalMyGrammar.g:503:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalMyGrammar.g:504:2: iv_ruleLibrary= ruleLibrary EOF
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
    // InternalMyGrammar.g:510:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) ;
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
            // InternalMyGrammar.g:516:2: ( (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) )
            // InternalMyGrammar.g:517:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            {
            // InternalMyGrammar.g:517:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            // InternalMyGrammar.g:518:3: otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
              		
            }
            // InternalMyGrammar.g:522:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyGrammar.g:523:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyGrammar.g:523:4: (lv_name_1_0= RULE_ID )
            // InternalMyGrammar.g:524:5: lv_name_1_0= RULE_ID
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            // InternalMyGrammar.g:540:3: (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyGrammar.g:541:4: otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getIsKeyword_2_0());
                      			
                    }
                    // InternalMyGrammar.g:545:4: ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) )
                    // InternalMyGrammar.g:546:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    {
                    // InternalMyGrammar.g:546:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    // InternalMyGrammar.g:547:6: lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier
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
                      							"org.unicam.tryGrammar.MyGrammar.InheritanceSpecifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyGrammar.g:564:4: (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyGrammar.g:565:5: otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalMyGrammar.g:569:5: ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    // InternalMyGrammar.g:570:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    {
                    	    // InternalMyGrammar.g:570:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    // InternalMyGrammar.g:571:7: lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier
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
                    	      								"org.unicam.tryGrammar.MyGrammar.InheritanceSpecifier");
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

            // InternalMyGrammar.g:590:3: ( (lv_body_6_0= ruleDefinitionBody ) )
            // InternalMyGrammar.g:591:4: (lv_body_6_0= ruleDefinitionBody )
            {
            // InternalMyGrammar.g:591:4: (lv_body_6_0= ruleDefinitionBody )
            // InternalMyGrammar.g:592:5: lv_body_6_0= ruleDefinitionBody
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
              						"org.unicam.tryGrammar.MyGrammar.DefinitionBody");
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
    // InternalMyGrammar.g:613:1: entryRuleDefinitionBody returns [EObject current=null] : iv_ruleDefinitionBody= ruleDefinitionBody EOF ;
    public final EObject entryRuleDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionBody = null;


        try {
            // InternalMyGrammar.g:613:55: (iv_ruleDefinitionBody= ruleDefinitionBody EOF )
            // InternalMyGrammar.g:614:2: iv_ruleDefinitionBody= ruleDefinitionBody EOF
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
    // InternalMyGrammar.g:620:1: ruleDefinitionBody returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) ;
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
            // InternalMyGrammar.g:626:2: ( ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) )
            // InternalMyGrammar.g:627:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            {
            // InternalMyGrammar.g:627:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            // InternalMyGrammar.g:628:3: () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}'
            {
            // InternalMyGrammar.g:628:3: ()
            // InternalMyGrammar.g:629:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDefinitionBodyAccess().getDefinitionBodyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefinitionBodyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyGrammar.g:639:3: ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )*
            loop8:
            do {
                int alt8=7;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalMyGrammar.g:640:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    {
            	    // InternalMyGrammar.g:640:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    // InternalMyGrammar.g:641:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    {
            	    // InternalMyGrammar.g:641:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    // InternalMyGrammar.g:642:6: lv_functions_2_0= ruleFunctionDefinition
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
            	      							"org.unicam.tryGrammar.MyGrammar.FunctionDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyGrammar.g:660:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    {
            	    // InternalMyGrammar.g:660:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    // InternalMyGrammar.g:661:5: (lv_structs_3_0= ruleStructDefinition )
            	    {
            	    // InternalMyGrammar.g:661:5: (lv_structs_3_0= ruleStructDefinition )
            	    // InternalMyGrammar.g:662:6: lv_structs_3_0= ruleStructDefinition
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
            	      							"org.unicam.tryGrammar.MyGrammar.StructDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyGrammar.g:680:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    {
            	    // InternalMyGrammar.g:680:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    // InternalMyGrammar.g:681:5: (lv_enums_4_0= ruleEnumDefinition )
            	    {
            	    // InternalMyGrammar.g:681:5: (lv_enums_4_0= ruleEnumDefinition )
            	    // InternalMyGrammar.g:682:6: lv_enums_4_0= ruleEnumDefinition
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
            	      							"org.unicam.tryGrammar.MyGrammar.EnumDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyGrammar.g:700:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    {
            	    // InternalMyGrammar.g:700:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    // InternalMyGrammar.g:701:5: ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';'
            	    {
            	    // InternalMyGrammar.g:701:5: ( (lv_variables_5_0= ruleVariableDeclaration ) )
            	    // InternalMyGrammar.g:702:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    {
            	    // InternalMyGrammar.g:702:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    // InternalMyGrammar.g:703:7: lv_variables_5_0= ruleVariableDeclaration
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
            	      								"org.unicam.tryGrammar.MyGrammar.VariableDeclaration");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getDefinitionBodyAccess().getSemicolonKeyword_2_3_1());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyGrammar.g:726:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    {
            	    // InternalMyGrammar.g:726:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    // InternalMyGrammar.g:727:5: (lv_modifiers_7_0= ruleModifier )
            	    {
            	    // InternalMyGrammar.g:727:5: (lv_modifiers_7_0= ruleModifier )
            	    // InternalMyGrammar.g:728:6: lv_modifiers_7_0= ruleModifier
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
            	      							"org.unicam.tryGrammar.MyGrammar.Modifier");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyGrammar.g:746:4: ( (lv_events_8_0= ruleEvent ) )
            	    {
            	    // InternalMyGrammar.g:746:4: ( (lv_events_8_0= ruleEvent ) )
            	    // InternalMyGrammar.g:747:5: (lv_events_8_0= ruleEvent )
            	    {
            	    // InternalMyGrammar.g:747:5: (lv_events_8_0= ruleEvent )
            	    // InternalMyGrammar.g:748:6: lv_events_8_0= ruleEvent
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
            	      							"org.unicam.tryGrammar.MyGrammar.Event");
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

            otherlv_9=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:774:1: entryRuleInheritanceSpecifier returns [EObject current=null] : iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF ;
    public final EObject entryRuleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceSpecifier = null;


        try {
            // InternalMyGrammar.g:774:61: (iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF )
            // InternalMyGrammar.g:775:2: iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF
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
    // InternalMyGrammar.g:781:1: ruleInheritanceSpecifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:787:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalMyGrammar.g:788:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalMyGrammar.g:788:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalMyGrammar.g:789:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalMyGrammar.g:789:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyGrammar.g:790:4: (otherlv_0= RULE_ID )
            {
            // InternalMyGrammar.g:790:4: (otherlv_0= RULE_ID )
            // InternalMyGrammar.g:791:5: otherlv_0= RULE_ID
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

            // InternalMyGrammar.g:802:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyGrammar.g:803:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalMyGrammar.g:803:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalMyGrammar.g:804:5: lv_args_1_0= ruleFunctionCallListArguments
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
                      						"org.unicam.tryGrammar.MyGrammar.FunctionCallListArguments");
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
    // InternalMyGrammar.g:825:1: entryRuleFunctionCallListArguments returns [EObject current=null] : iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF ;
    public final EObject entryRuleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallListArguments = null;


        try {
            // InternalMyGrammar.g:825:66: (iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF )
            // InternalMyGrammar.g:826:2: iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF
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
    // InternalMyGrammar.g:832:1: ruleFunctionCallListArguments returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:838:2: ( (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalMyGrammar.g:839:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalMyGrammar.g:839:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalMyGrammar.g:840:3: otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallListArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyGrammar.g:844:3: ()
            // InternalMyGrammar.g:845:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallListArgumentsAccess().getFunctionCallListArgumentsAction_1(),
              					current);
              			
            }

            }

            // InternalMyGrammar.g:851:3: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_TX)||LA11_0==27||(LA11_0>=62 && LA11_0<=174)||(LA11_0>=205 && LA11_0<=206)||(LA11_0>=217 && LA11_0<=218)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyGrammar.g:852:4: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // InternalMyGrammar.g:852:4: ( (lv_arguments_2_0= ruleExpression ) )
                    // InternalMyGrammar.g:853:5: (lv_arguments_2_0= ruleExpression )
                    {
                    // InternalMyGrammar.g:853:5: (lv_arguments_2_0= ruleExpression )
                    // InternalMyGrammar.g:854:6: lv_arguments_2_0= ruleExpression
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
                      							"org.unicam.tryGrammar.MyGrammar.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyGrammar.g:871:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==22) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyGrammar.g:872:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallListArgumentsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalMyGrammar.g:876:5: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // InternalMyGrammar.g:877:6: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // InternalMyGrammar.g:877:6: (lv_arguments_4_0= ruleExpression )
                    	    // InternalMyGrammar.g:878:7: lv_arguments_4_0= ruleExpression
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
                    	      								"org.unicam.tryGrammar.MyGrammar.Expression");
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

            otherlv_5=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:905:1: entryRuleFunctionCallArguments returns [EObject current=null] : iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF ;
    public final EObject entryRuleFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArguments = null;


        try {
            // InternalMyGrammar.g:905:62: (iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF )
            // InternalMyGrammar.g:906:2: iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF
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
    // InternalMyGrammar.g:912:1: ruleFunctionCallArguments returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) ;
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
            // InternalMyGrammar.g:918:2: ( ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) )
            // InternalMyGrammar.g:919:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            {
            // InternalMyGrammar.g:919:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=RULE_STRING && LA14_1<=RULE_TX)||(LA14_1>=27 && LA14_1<=28)||(LA14_1>=62 && LA14_1<=174)||(LA14_1>=205 && LA14_1<=206)||(LA14_1>=217 && LA14_1<=218)) ) {
                    alt14=2;
                }
                else if ( (LA14_1==21) ) {
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
                    // InternalMyGrammar.g:920:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    {
                    // InternalMyGrammar.g:920:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    // InternalMyGrammar.g:921:4: otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunctionCallArgumentsAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgumentsAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalMyGrammar.g:929:4: ()
                    // InternalMyGrammar.g:930:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFunctionCallArgumentsAccess().getFunctionCallArgumentsAction_0_2(),
                      						current);
                      				
                    }

                    }

                    // InternalMyGrammar.g:936:4: ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyGrammar.g:937:5: ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            {
                            // InternalMyGrammar.g:937:5: ( (lv_args_3_0= ruleFunctionCallArg ) )
                            // InternalMyGrammar.g:938:6: (lv_args_3_0= ruleFunctionCallArg )
                            {
                            // InternalMyGrammar.g:938:6: (lv_args_3_0= ruleFunctionCallArg )
                            // InternalMyGrammar.g:939:7: lv_args_3_0= ruleFunctionCallArg
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
                              								"org.unicam.tryGrammar.MyGrammar.FunctionCallArg");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalMyGrammar.g:956:5: (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==22) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalMyGrammar.g:957:6: otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    {
                            	    otherlv_4=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallArgumentsAccess().getCommaKeyword_0_3_1_0());
                            	      					
                            	    }
                            	    // InternalMyGrammar.g:961:6: ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    // InternalMyGrammar.g:962:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    {
                            	    // InternalMyGrammar.g:962:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    // InternalMyGrammar.g:963:8: lv_args_5_0= ruleFunctionCallArg
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
                            	      									"org.unicam.tryGrammar.MyGrammar.FunctionCallArg");
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

                    otherlv_6=(Token)match(input,23,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFunctionCallArgumentsAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }
                    otherlv_7=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFunctionCallArgumentsAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:992:3: this_FunctionCallListArguments_8= ruleFunctionCallListArguments
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
    // InternalMyGrammar.g:1004:1: entryRuleFunctionCallArg returns [EObject current=null] : iv_ruleFunctionCallArg= ruleFunctionCallArg EOF ;
    public final EObject entryRuleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArg = null;


        try {
            // InternalMyGrammar.g:1004:56: (iv_ruleFunctionCallArg= ruleFunctionCallArg EOF )
            // InternalMyGrammar.g:1005:2: iv_ruleFunctionCallArg= ruleFunctionCallArg EOF
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
    // InternalMyGrammar.g:1011:1: ruleFunctionCallArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1017:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalMyGrammar.g:1018:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalMyGrammar.g:1018:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalMyGrammar.g:1019:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalMyGrammar.g:1019:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyGrammar.g:1020:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyGrammar.g:1020:4: (lv_name_0_0= RULE_ID )
            // InternalMyGrammar.g:1021:5: lv_name_0_0= RULE_ID
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgAccess().getColonKeyword_1());
              		
            }
            // InternalMyGrammar.g:1041:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalMyGrammar.g:1042:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalMyGrammar.g:1042:4: (lv_expr_2_0= ruleExpression )
            // InternalMyGrammar.g:1043:5: lv_expr_2_0= ruleExpression
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
              						"org.unicam.tryGrammar.MyGrammar.Expression");
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
    // InternalMyGrammar.g:1064:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // InternalMyGrammar.g:1064:59: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // InternalMyGrammar.g:1065:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
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
    // InternalMyGrammar.g:1071:1: ruleFunctionDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ( (lv_payable_1_0= 'payable' ) )? otherlv_2= 'function' ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameterList ) ) ( (lv_optionalElements_5_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_6= 'returns' ( (lv_returnParameters_7_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_8_0= ruleBody ) ) | otherlv_9= ';' ) ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_payable_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_optionalElements_5_0 = null;

        EObject lv_returnParameters_7_0 = null;

        EObject lv_block_8_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1077:2: ( ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ( (lv_payable_1_0= 'payable' ) )? otherlv_2= 'function' ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameterList ) ) ( (lv_optionalElements_5_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_6= 'returns' ( (lv_returnParameters_7_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_8_0= ruleBody ) ) | otherlv_9= ';' ) ) )
            // InternalMyGrammar.g:1078:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ( (lv_payable_1_0= 'payable' ) )? otherlv_2= 'function' ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameterList ) ) ( (lv_optionalElements_5_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_6= 'returns' ( (lv_returnParameters_7_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_8_0= ruleBody ) ) | otherlv_9= ';' ) )
            {
            // InternalMyGrammar.g:1078:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ( (lv_payable_1_0= 'payable' ) )? otherlv_2= 'function' ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameterList ) ) ( (lv_optionalElements_5_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_6= 'returns' ( (lv_returnParameters_7_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_8_0= ruleBody ) ) | otherlv_9= ';' ) )
            // InternalMyGrammar.g:1079:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ( (lv_payable_1_0= 'payable' ) )? otherlv_2= 'function' ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameterList ) ) ( (lv_optionalElements_5_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_6= 'returns' ( (lv_returnParameters_7_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_8_0= ruleBody ) ) | otherlv_9= ';' )
            {
            // InternalMyGrammar.g:1079:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            // InternalMyGrammar.g:1080:4: (lv_visibility_0_0= ruleVisibilityEnum )
            {
            // InternalMyGrammar.g:1080:4: (lv_visibility_0_0= ruleVisibilityEnum )
            // InternalMyGrammar.g:1081:5: lv_visibility_0_0= ruleVisibilityEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getVisibilityVisibilityEnumEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_visibility_0_0=ruleVisibilityEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"visibility",
              						lv_visibility_0_0,
              						"org.unicam.tryGrammar.MyGrammar.VisibilityEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:1098:3: ( (lv_payable_1_0= 'payable' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyGrammar.g:1099:4: (lv_payable_1_0= 'payable' )
                    {
                    // InternalMyGrammar.g:1099:4: (lv_payable_1_0= 'payable' )
                    // InternalMyGrammar.g:1100:5: lv_payable_1_0= 'payable'
                    {
                    lv_payable_1_0=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_payable_1_0, grammarAccess.getFunctionDefinitionAccess().getPayablePayableKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionDefinitionRule());
                      					}
                      					setWithLastConsumed(current, "payable", true, "payable");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionDefinitionAccess().getFunctionKeyword_2());
              		
            }
            // InternalMyGrammar.g:1116:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyGrammar.g:1117:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyGrammar.g:1117:4: (lv_name_3_0= RULE_ID )
            // InternalMyGrammar.g:1118:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            // InternalMyGrammar.g:1134:3: ( (lv_parameters_4_0= ruleParameterList ) )
            // InternalMyGrammar.g:1135:4: (lv_parameters_4_0= ruleParameterList )
            {
            // InternalMyGrammar.g:1135:4: (lv_parameters_4_0= ruleParameterList )
            // InternalMyGrammar.g:1136:5: lv_parameters_4_0= ruleParameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersParameterListParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_parameters_4_0=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
              					}
              					set(
              						current,
              						"parameters",
              						lv_parameters_4_0,
              						"org.unicam.tryGrammar.MyGrammar.ParameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:1153:3: ( (lv_optionalElements_5_0= ruleFunctionDefinitionOptionalElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==33||(LA16_0>=178 && LA16_0<=181)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyGrammar.g:1154:4: (lv_optionalElements_5_0= ruleFunctionDefinitionOptionalElement )
            	    {
            	    // InternalMyGrammar.g:1154:4: (lv_optionalElements_5_0= ruleFunctionDefinitionOptionalElement )
            	    // InternalMyGrammar.g:1155:5: lv_optionalElements_5_0= ruleFunctionDefinitionOptionalElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOptionalElementsFunctionDefinitionOptionalElementParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_optionalElements_5_0=ruleFunctionDefinitionOptionalElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"optionalElements",
            	      						lv_optionalElements_5_0,
            	      						"org.unicam.tryGrammar.MyGrammar.FunctionDefinitionOptionalElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalMyGrammar.g:1172:3: (otherlv_6= 'returns' ( (lv_returnParameters_7_0= ruleReturnsParameterList ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyGrammar.g:1173:4: otherlv_6= 'returns' ( (lv_returnParameters_7_0= ruleReturnsParameterList ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFunctionDefinitionAccess().getReturnsKeyword_6_0());
                      			
                    }
                    // InternalMyGrammar.g:1177:4: ( (lv_returnParameters_7_0= ruleReturnsParameterList ) )
                    // InternalMyGrammar.g:1178:5: (lv_returnParameters_7_0= ruleReturnsParameterList )
                    {
                    // InternalMyGrammar.g:1178:5: (lv_returnParameters_7_0= ruleReturnsParameterList )
                    // InternalMyGrammar.g:1179:6: lv_returnParameters_7_0= ruleReturnsParameterList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnParametersReturnsParameterListParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_returnParameters_7_0=ruleReturnsParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"returnParameters",
                      							lv_returnParameters_7_0,
                      							"org.unicam.tryGrammar.MyGrammar.ReturnsParameterList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMyGrammar.g:1197:3: ( ( (lv_block_8_0= ruleBody ) ) | otherlv_9= ';' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            else if ( (LA18_0==17) ) {
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
                    // InternalMyGrammar.g:1198:4: ( (lv_block_8_0= ruleBody ) )
                    {
                    // InternalMyGrammar.g:1198:4: ( (lv_block_8_0= ruleBody ) )
                    // InternalMyGrammar.g:1199:5: (lv_block_8_0= ruleBody )
                    {
                    // InternalMyGrammar.g:1199:5: (lv_block_8_0= ruleBody )
                    // InternalMyGrammar.g:1200:6: lv_block_8_0= ruleBody
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBlockBodyParserRuleCall_7_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_8_0=ruleBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_8_0,
                      							"org.unicam.tryGrammar.MyGrammar.Body");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:1218:4: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getFunctionDefinitionAccess().getSemicolonKeyword_7_1());
                      			
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
    // InternalMyGrammar.g:1227:1: entryRuleFunctionDefinitionOptionalElement returns [EObject current=null] : iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF ;
    public final EObject entryRuleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOptionalElement = null;


        try {
            // InternalMyGrammar.g:1227:74: (iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF )
            // InternalMyGrammar.g:1228:2: iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF
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
    // InternalMyGrammar.g:1234:1: ruleFunctionDefinitionOptionalElement returns [EObject current=null] : (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) ;
    public final EObject ruleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_ModifierInvocation_1 = null;

        EObject this_VisibilitySpecifier_2 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1240:2: ( (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) )
            // InternalMyGrammar.g:1241:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            {
            // InternalMyGrammar.g:1241:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
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
            case 178:
            case 179:
            case 180:
            case 181:
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
                    // InternalMyGrammar.g:1242:3: this_Const_0= ruleConst
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
                    // InternalMyGrammar.g:1251:3: this_ModifierInvocation_1= ruleModifierInvocation
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
                    // InternalMyGrammar.g:1260:3: this_VisibilitySpecifier_2= ruleVisibilitySpecifier
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
    // InternalMyGrammar.g:1272:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalMyGrammar.g:1272:46: (iv_ruleConst= ruleConst EOF )
            // InternalMyGrammar.g:1273:2: iv_ruleConst= ruleConst EOF
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
    // InternalMyGrammar.g:1279:1: ruleConst returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:1285:2: ( (otherlv_0= 'constant' () ) )
            // InternalMyGrammar.g:1286:2: (otherlv_0= 'constant' () )
            {
            // InternalMyGrammar.g:1286:2: (otherlv_0= 'constant' () )
            // InternalMyGrammar.g:1287:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstAccess().getConstantKeyword_0());
              		
            }
            // InternalMyGrammar.g:1291:3: ()
            // InternalMyGrammar.g:1292:4: 
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
    // InternalMyGrammar.g:1302:1: entryRuleVisibilitySpecifier returns [EObject current=null] : iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF ;
    public final EObject entryRuleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilitySpecifier = null;


        try {
            // InternalMyGrammar.g:1302:60: (iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF )
            // InternalMyGrammar.g:1303:2: iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF
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
    // InternalMyGrammar.g:1309:1: ruleVisibilitySpecifier returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ;
    public final EObject ruleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1315:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) )
            // InternalMyGrammar.g:1316:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            {
            // InternalMyGrammar.g:1316:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            // InternalMyGrammar.g:1317:3: (lv_visibility_0_0= ruleVisibilityEnum )
            {
            // InternalMyGrammar.g:1317:3: (lv_visibility_0_0= ruleVisibilityEnum )
            // InternalMyGrammar.g:1318:4: lv_visibility_0_0= ruleVisibilityEnum
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
              					"org.unicam.tryGrammar.MyGrammar.VisibilityEnum");
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
    // InternalMyGrammar.g:1338:1: entryRuleStructDefinition returns [EObject current=null] : iv_ruleStructDefinition= ruleStructDefinition EOF ;
    public final EObject entryRuleStructDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDefinition = null;


        try {
            // InternalMyGrammar.g:1338:57: (iv_ruleStructDefinition= ruleStructDefinition EOF )
            // InternalMyGrammar.g:1339:2: iv_ruleStructDefinition= ruleStructDefinition EOF
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
    // InternalMyGrammar.g:1345:1: ruleStructDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleStructDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1351:2: ( ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // InternalMyGrammar.g:1352:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // InternalMyGrammar.g:1352:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // InternalMyGrammar.g:1353:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // InternalMyGrammar.g:1353:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=178 && LA20_0<=181)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyGrammar.g:1354:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    {
                    // InternalMyGrammar.g:1354:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    // InternalMyGrammar.g:1355:5: lv_visibility_0_0= ruleVisibilityEnum
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStructDefinitionAccess().getVisibilityVisibilityEnumEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_visibility_0_0=ruleVisibilityEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStructDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"visibility",
                      						lv_visibility_0_0,
                      						"org.unicam.tryGrammar.MyGrammar.VisibilityEnum");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStructDefinitionAccess().getStructKeyword_1());
              		
            }
            // InternalMyGrammar.g:1376:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyGrammar.g:1377:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyGrammar.g:1377:4: (lv_name_2_0= RULE_ID )
            // InternalMyGrammar.g:1378:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getStructDefinitionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStructDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStructDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalMyGrammar.g:1398:3: ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==38||LA21_0==42||(LA21_0>=71 && LA21_0<=174)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyGrammar.g:1399:4: ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';'
            	    {
            	    // InternalMyGrammar.g:1399:4: ( (lv_members_4_0= ruleVariableDeclaration ) )
            	    // InternalMyGrammar.g:1400:5: (lv_members_4_0= ruleVariableDeclaration )
            	    {
            	    // InternalMyGrammar.g:1400:5: (lv_members_4_0= ruleVariableDeclaration )
            	    // InternalMyGrammar.g:1401:6: lv_members_4_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStructDefinitionAccess().getMembersVariableDeclarationParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_members_4_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStructDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"members",
            	      							lv_members_4_0,
            	      							"org.unicam.tryGrammar.MyGrammar.VariableDeclaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,17,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getStructDefinitionAccess().getSemicolonKeyword_4_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getStructDefinitionAccess().getRightCurlyBracketKeyword_5());
              		
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
    // InternalMyGrammar.g:1431:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // InternalMyGrammar.g:1431:55: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // InternalMyGrammar.g:1432:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
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
    // InternalMyGrammar.g:1438:1: ruleEnumDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_members_4_0 = null;

        EObject lv_members_6_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1444:2: ( ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' ) )
            // InternalMyGrammar.g:1445:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' )
            {
            // InternalMyGrammar.g:1445:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' )
            // InternalMyGrammar.g:1446:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}'
            {
            // InternalMyGrammar.g:1446:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=178 && LA22_0<=181)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyGrammar.g:1447:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    {
                    // InternalMyGrammar.g:1447:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    // InternalMyGrammar.g:1448:5: lv_visibility_0_0= ruleVisibilityEnum
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEnumDefinitionAccess().getVisibilityVisibilityEnumEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_30);
                    lv_visibility_0_0=ruleVisibilityEnum();

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
                      						"org.unicam.tryGrammar.MyGrammar.VisibilityEnum");
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
            // InternalMyGrammar.g:1469:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyGrammar.g:1470:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyGrammar.g:1470:4: (lv_name_2_0= RULE_ID )
            // InternalMyGrammar.g:1471:5: lv_name_2_0= RULE_ID
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalMyGrammar.g:1491:3: ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyGrammar.g:1492:4: ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )*
                    {
                    // InternalMyGrammar.g:1492:4: ( (lv_members_4_0= ruleEnumValue ) )
                    // InternalMyGrammar.g:1493:5: (lv_members_4_0= ruleEnumValue )
                    {
                    // InternalMyGrammar.g:1493:5: (lv_members_4_0= ruleEnumValue )
                    // InternalMyGrammar.g:1494:6: lv_members_4_0= ruleEnumValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_4_0_0());
                      					
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
                      							"org.unicam.tryGrammar.MyGrammar.EnumValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyGrammar.g:1511:4: (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==22) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMyGrammar.g:1512:5: otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getEnumDefinitionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalMyGrammar.g:1516:5: ( (lv_members_6_0= ruleEnumValue ) )
                    	    // InternalMyGrammar.g:1517:6: (lv_members_6_0= ruleEnumValue )
                    	    {
                    	    // InternalMyGrammar.g:1517:6: (lv_members_6_0= ruleEnumValue )
                    	    // InternalMyGrammar.g:1518:7: lv_members_6_0= ruleEnumValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_4_1_1_0());
                    	      						
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
                    	      								"org.unicam.tryGrammar.MyGrammar.EnumValue");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_5());
              		
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
    // InternalMyGrammar.g:1545:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalMyGrammar.g:1545:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalMyGrammar.g:1546:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalMyGrammar.g:1552:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:1558:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyGrammar.g:1559:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyGrammar.g:1559:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyGrammar.g:1560:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyGrammar.g:1560:3: (lv_name_0_0= RULE_ID )
            // InternalMyGrammar.g:1561:4: lv_name_0_0= RULE_ID
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
              					"org.unicam.tryGrammar.MyGrammar.ID");
              			
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
    // InternalMyGrammar.g:1580:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyGrammar.g:1580:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyGrammar.g:1581:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMyGrammar.g:1587:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:1593:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyGrammar.g:1594:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyGrammar.g:1594:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyGrammar.g:1595:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyGrammar.g:1595:3: (lv_name_0_0= RULE_ID )
            // InternalMyGrammar.g:1596:4: lv_name_0_0= RULE_ID
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
              					"org.unicam.tryGrammar.MyGrammar.ID");
              			
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
    // InternalMyGrammar.g:1615:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMyGrammar.g:1615:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMyGrammar.g:1616:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalMyGrammar.g:1622:1: ruleVariableDeclaration returns [EObject current=null] : (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_StandardVariableDeclaration_0 = null;

        EObject this_VarVariableDeclaration_1 = null;

        EObject this_VarVariableTupleVariableDeclaration_2 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1628:2: ( (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) )
            // InternalMyGrammar.g:1629:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            {
            // InternalMyGrammar.g:1629:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||LA25_0==38||(LA25_0>=71 && LA25_0<=174)) ) {
                alt25=1;
            }
            else if ( (LA25_0==42) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==RULE_ID) ) {
                    alt25=2;
                }
                else if ( (LA25_2==27) ) {
                    alt25=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyGrammar.g:1630:3: this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration
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
                    // InternalMyGrammar.g:1639:3: this_VarVariableDeclaration_1= ruleVarVariableDeclaration
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
                    // InternalMyGrammar.g:1648:3: this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration
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
    // InternalMyGrammar.g:1660:1: entryRuleStandardVariableDeclaration returns [EObject current=null] : iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF ;
    public final EObject entryRuleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardVariableDeclaration = null;


        try {
            // InternalMyGrammar.g:1660:68: (iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF )
            // InternalMyGrammar.g:1661:2: iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF
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
    // InternalMyGrammar.g:1667:1: ruleStandardVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_optionalElements_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1673:2: ( ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) )
            // InternalMyGrammar.g:1674:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            {
            // InternalMyGrammar.g:1674:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            // InternalMyGrammar.g:1675:3: ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            {
            // InternalMyGrammar.g:1675:3: ( (lv_type_0_0= ruleStandardType ) )
            // InternalMyGrammar.g:1676:4: (lv_type_0_0= ruleStandardType )
            {
            // InternalMyGrammar.g:1676:4: (lv_type_0_0= ruleStandardType )
            // InternalMyGrammar.g:1677:5: lv_type_0_0= ruleStandardType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getTypeStandardTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
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
              						"org.unicam.tryGrammar.MyGrammar.StandardType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:1694:3: ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33||LA26_0==37||(LA26_0>=175 && LA26_0<=181)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyGrammar.g:1695:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    {
            	    // InternalMyGrammar.g:1695:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    // InternalMyGrammar.g:1696:5: lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
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
            	      						"org.unicam.tryGrammar.MyGrammar.VariableDeclarationOptionalElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalMyGrammar.g:1713:3: ( (lv_variable_2_0= ruleVariable ) )
            // InternalMyGrammar.g:1714:4: (lv_variable_2_0= ruleVariable )
            {
            // InternalMyGrammar.g:1714:4: (lv_variable_2_0= ruleVariable )
            // InternalMyGrammar.g:1715:5: lv_variable_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getVariableVariableParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
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
              						"org.unicam.tryGrammar.MyGrammar.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:1732:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyGrammar.g:1733:4: otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStandardVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMyGrammar.g:1737:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalMyGrammar.g:1738:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalMyGrammar.g:1738:5: (lv_expression_4_0= ruleExpression )
                    // InternalMyGrammar.g:1739:6: lv_expression_4_0= ruleExpression
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
                      							"org.unicam.tryGrammar.MyGrammar.Expression");
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
    // InternalMyGrammar.g:1761:1: entryRuleVarVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableDeclaration = null;


        try {
            // InternalMyGrammar.g:1761:63: (iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF )
            // InternalMyGrammar.g:1762:2: iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF
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
    // InternalMyGrammar.g:1768:1: ruleVarVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1774:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalMyGrammar.g:1775:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalMyGrammar.g:1775:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalMyGrammar.g:1776:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalMyGrammar.g:1776:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalMyGrammar.g:1777:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalMyGrammar.g:1777:4: (lv_varType_0_0= ruleVarType )
            // InternalMyGrammar.g:1778:5: lv_varType_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getVarTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
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
              						"org.unicam.tryGrammar.MyGrammar.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:1795:3: ( (lv_variable_1_0= ruleVariable ) )
            // InternalMyGrammar.g:1796:4: (lv_variable_1_0= ruleVariable )
            {
            // InternalMyGrammar.g:1796:4: (lv_variable_1_0= ruleVariable )
            // InternalMyGrammar.g:1797:5: lv_variable_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getVariableVariableParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_32);
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
              						"org.unicam.tryGrammar.MyGrammar.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:1814:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyGrammar.g:1815:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalMyGrammar.g:1819:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalMyGrammar.g:1820:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalMyGrammar.g:1820:5: (lv_expression_3_0= ruleExpression )
                    // InternalMyGrammar.g:1821:6: lv_expression_3_0= ruleExpression
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
                      							"org.unicam.tryGrammar.MyGrammar.Expression");
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
    // InternalMyGrammar.g:1843:1: entryRuleVarVariableTupleVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableTupleVariableDeclaration = null;


        try {
            // InternalMyGrammar.g:1843:76: (iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF )
            // InternalMyGrammar.g:1844:2: iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF
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
    // InternalMyGrammar.g:1850:1: ruleVarVariableTupleVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_tuple_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1856:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalMyGrammar.g:1857:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalMyGrammar.g:1857:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalMyGrammar.g:1858:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalMyGrammar.g:1858:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalMyGrammar.g:1859:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalMyGrammar.g:1859:4: (lv_varType_0_0= ruleVarType )
            // InternalMyGrammar.g:1860:5: lv_varType_0_0= ruleVarType
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
              						"org.unicam.tryGrammar.MyGrammar.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:1877:3: ( (lv_tuple_1_0= ruleTuple ) )
            // InternalMyGrammar.g:1878:4: (lv_tuple_1_0= ruleTuple )
            {
            // InternalMyGrammar.g:1878:4: (lv_tuple_1_0= ruleTuple )
            // InternalMyGrammar.g:1879:5: lv_tuple_1_0= ruleTuple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getTupleTupleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_32);
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
              						"org.unicam.tryGrammar.MyGrammar.Tuple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:1896:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyGrammar.g:1897:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableTupleVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalMyGrammar.g:1901:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalMyGrammar.g:1902:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalMyGrammar.g:1902:5: (lv_expression_3_0= ruleExpression )
                    // InternalMyGrammar.g:1903:6: lv_expression_3_0= ruleExpression
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
                      							"org.unicam.tryGrammar.MyGrammar.Expression");
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
    // InternalMyGrammar.g:1925:1: entryRuleVariableDeclarationOptionalElement returns [EObject current=null] : iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF ;
    public final EObject entryRuleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationOptionalElement = null;


        try {
            // InternalMyGrammar.g:1925:75: (iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF )
            // InternalMyGrammar.g:1926:2: iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF
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
    // InternalMyGrammar.g:1932:1: ruleVariableDeclarationOptionalElement returns [EObject current=null] : (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) ;
    public final EObject ruleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_VisibilitySpecifier_0 = null;

        EObject this_IndexedSpecifer_1 = null;

        EObject this_ConstantSpecifier_2 = null;

        EObject this_LocationSpecifier_3 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:1938:2: ( (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) )
            // InternalMyGrammar.g:1939:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            {
            // InternalMyGrammar.g:1939:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 178:
            case 179:
            case 180:
            case 181:
                {
                alt30=1;
                }
                break;
            case 37:
                {
                alt30=2;
                }
                break;
            case 33:
                {
                alt30=3;
                }
                break;
            case 175:
            case 176:
            case 177:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyGrammar.g:1940:3: this_VisibilitySpecifier_0= ruleVisibilitySpecifier
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
                    // InternalMyGrammar.g:1949:3: this_IndexedSpecifer_1= ruleIndexedSpecifer
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
                    // InternalMyGrammar.g:1958:3: this_ConstantSpecifier_2= ruleConstantSpecifier
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
                    // InternalMyGrammar.g:1967:3: this_LocationSpecifier_3= ruleLocationSpecifier
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
    // InternalMyGrammar.g:1979:1: entryRuleIndexedSpecifer returns [EObject current=null] : iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF ;
    public final EObject entryRuleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedSpecifer = null;


        try {
            // InternalMyGrammar.g:1979:56: (iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF )
            // InternalMyGrammar.g:1980:2: iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF
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
    // InternalMyGrammar.g:1986:1: ruleIndexedSpecifer returns [EObject current=null] : (otherlv_0= 'indexed' () ) ;
    public final EObject ruleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:1992:2: ( (otherlv_0= 'indexed' () ) )
            // InternalMyGrammar.g:1993:2: (otherlv_0= 'indexed' () )
            {
            // InternalMyGrammar.g:1993:2: (otherlv_0= 'indexed' () )
            // InternalMyGrammar.g:1994:3: otherlv_0= 'indexed' ()
            {
            otherlv_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexedSpeciferAccess().getIndexedKeyword_0());
              		
            }
            // InternalMyGrammar.g:1998:3: ()
            // InternalMyGrammar.g:1999:4: 
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
    // InternalMyGrammar.g:2009:1: entryRuleConstantSpecifier returns [EObject current=null] : iv_ruleConstantSpecifier= ruleConstantSpecifier EOF ;
    public final EObject entryRuleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSpecifier = null;


        try {
            // InternalMyGrammar.g:2009:58: (iv_ruleConstantSpecifier= ruleConstantSpecifier EOF )
            // InternalMyGrammar.g:2010:2: iv_ruleConstantSpecifier= ruleConstantSpecifier EOF
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
    // InternalMyGrammar.g:2016:1: ruleConstantSpecifier returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:2022:2: ( (otherlv_0= 'constant' () ) )
            // InternalMyGrammar.g:2023:2: (otherlv_0= 'constant' () )
            {
            // InternalMyGrammar.g:2023:2: (otherlv_0= 'constant' () )
            // InternalMyGrammar.g:2024:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantSpecifierAccess().getConstantKeyword_0());
              		
            }
            // InternalMyGrammar.g:2028:3: ()
            // InternalMyGrammar.g:2029:4: 
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
    // InternalMyGrammar.g:2039:1: entryRuleLocationSpecifier returns [EObject current=null] : iv_ruleLocationSpecifier= ruleLocationSpecifier EOF ;
    public final EObject entryRuleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifier = null;


        try {
            // InternalMyGrammar.g:2039:58: (iv_ruleLocationSpecifier= ruleLocationSpecifier EOF )
            // InternalMyGrammar.g:2040:2: iv_ruleLocationSpecifier= ruleLocationSpecifier EOF
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
    // InternalMyGrammar.g:2046:1: ruleLocationSpecifier returns [EObject current=null] : ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) ;
    public final EObject ruleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_location_0_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:2052:2: ( ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) )
            // InternalMyGrammar.g:2053:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            {
            // InternalMyGrammar.g:2053:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            // InternalMyGrammar.g:2054:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            {
            // InternalMyGrammar.g:2054:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            // InternalMyGrammar.g:2055:4: lv_location_0_0= ruleLocationSpecifierEnum
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
              					"org.unicam.tryGrammar.MyGrammar.LocationSpecifierEnum");
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
    // InternalMyGrammar.g:2075:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyGrammar.g:2075:45: (iv_ruleType= ruleType EOF )
            // InternalMyGrammar.g:2076:2: iv_ruleType= ruleType EOF
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
    // InternalMyGrammar.g:2082:1: ruleType returns [EObject current=null] : (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_StandardType_0 = null;

        AntlrDatatypeRuleToken lv_isVarType_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:2088:2: ( (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) )
            // InternalMyGrammar.g:2089:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            {
            // InternalMyGrammar.g:2089:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||LA31_0==38||(LA31_0>=71 && LA31_0<=174)) ) {
                alt31=1;
            }
            else if ( (LA31_0==42) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyGrammar.g:2090:3: this_StandardType_0= ruleStandardType
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
                    // InternalMyGrammar.g:2099:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    {
                    // InternalMyGrammar.g:2099:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    // InternalMyGrammar.g:2100:4: (lv_isVarType_1_0= ruleVarType )
                    {
                    // InternalMyGrammar.g:2100:4: (lv_isVarType_1_0= ruleVarType )
                    // InternalMyGrammar.g:2101:5: lv_isVarType_1_0= ruleVarType
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
                      						"org.unicam.tryGrammar.MyGrammar.VarType");
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
    // InternalMyGrammar.g:2122:1: entryRuleStandardType returns [EObject current=null] : iv_ruleStandardType= ruleStandardType EOF ;
    public final EObject entryRuleStandardType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardType = null;


        try {
            // InternalMyGrammar.g:2122:53: (iv_ruleStandardType= ruleStandardType EOF )
            // InternalMyGrammar.g:2123:2: iv_ruleStandardType= ruleStandardType EOF
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
    // InternalMyGrammar.g:2129:1: ruleStandardType returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) ;
    public final EObject ruleStandardType() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;

        EObject this_QualifiedIdentifier_3 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:2135:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) )
            // InternalMyGrammar.g:2136:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            {
            // InternalMyGrammar.g:2136:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            int alt33=3;
            switch ( input.LA(1) ) {
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
            case 174:
                {
                alt33=1;
                }
                break;
            case 38:
                {
                alt33=2;
                }
                break;
            case RULE_ID:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyGrammar.g:2137:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalMyGrammar.g:2137:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalMyGrammar.g:2138:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStandardTypeAccess().getElementaryTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_33);
                    this_ElementaryType_0=ruleElementaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementaryType_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyGrammar.g:2146:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==40) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMyGrammar.g:2147:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalMyGrammar.g:2147:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalMyGrammar.g:2148:6: lv_dimension_1_0= ruleArrayDimensions
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
                              							"org.unicam.tryGrammar.MyGrammar.ArrayDimensions");
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
                    // InternalMyGrammar.g:2167:3: this_Mapping_2= ruleMapping
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
                    // InternalMyGrammar.g:2176:3: this_QualifiedIdentifier_3= ruleQualifiedIdentifier
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
    // InternalMyGrammar.g:2188:1: entryRuleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF ;
    public final EObject entryRuleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardTypeWithoutQualifiedIdentifier = null;


        try {
            // InternalMyGrammar.g:2188:79: (iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF )
            // InternalMyGrammar.g:2189:2: iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF
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
    // InternalMyGrammar.g:2195:1: ruleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) ;
    public final EObject ruleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:2201:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) )
            // InternalMyGrammar.g:2202:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            {
            // InternalMyGrammar.g:2202:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=71 && LA35_0<=174)) ) {
                alt35=1;
            }
            else if ( (LA35_0==38) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyGrammar.g:2203:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalMyGrammar.g:2203:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalMyGrammar.g:2204:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStandardTypeWithoutQualifiedIdentifierAccess().getElementaryTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_33);
                    this_ElementaryType_0=ruleElementaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementaryType_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyGrammar.g:2212:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==40) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalMyGrammar.g:2213:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalMyGrammar.g:2213:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalMyGrammar.g:2214:6: lv_dimension_1_0= ruleArrayDimensions
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
                              							"org.unicam.tryGrammar.MyGrammar.ArrayDimensions");
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
                    // InternalMyGrammar.g:2233:3: this_Mapping_2= ruleMapping
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
    // InternalMyGrammar.g:2245:1: entryRuleElementaryType returns [EObject current=null] : iv_ruleElementaryType= ruleElementaryType EOF ;
    public final EObject entryRuleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryType = null;


        try {
            // InternalMyGrammar.g:2245:55: (iv_ruleElementaryType= ruleElementaryType EOF )
            // InternalMyGrammar.g:2246:2: iv_ruleElementaryType= ruleElementaryType EOF
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
    // InternalMyGrammar.g:2252:1: ruleElementaryType returns [EObject current=null] : ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) ;
    public final EObject ruleElementaryType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:2258:2: ( ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) )
            // InternalMyGrammar.g:2259:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            {
            // InternalMyGrammar.g:2259:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            // InternalMyGrammar.g:2260:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalMyGrammar.g:2260:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            // InternalMyGrammar.g:2261:4: lv_name_0_0= ruleElementaryTypeNameEnum
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
              					"org.unicam.tryGrammar.MyGrammar.ElementaryTypeNameEnum");
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
    // InternalMyGrammar.g:2281:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalMyGrammar.g:2281:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalMyGrammar.g:2282:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalMyGrammar.g:2288:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) ;
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
            // InternalMyGrammar.g:2294:2: ( (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) )
            // InternalMyGrammar.g:2295:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            {
            // InternalMyGrammar.g:2295:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            // InternalMyGrammar.g:2296:3: otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMyGrammar.g:2304:3: ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) )
            // InternalMyGrammar.g:2305:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            {
            // InternalMyGrammar.g:2305:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            // InternalMyGrammar.g:2306:5: lv_keyType_2_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getKeyTypeElementaryTypeNameEnumEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_35);
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
              						"org.unicam.tryGrammar.MyGrammar.ElementaryTypeNameEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalMyGrammar.g:2327:3: ( (lv_valueType_4_0= ruleType ) )
            // InternalMyGrammar.g:2328:4: (lv_valueType_4_0= ruleType )
            {
            // InternalMyGrammar.g:2328:4: (lv_valueType_4_0= ruleType )
            // InternalMyGrammar.g:2329:5: lv_valueType_4_0= ruleType
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
              						"org.unicam.tryGrammar.MyGrammar.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:2354:1: entryRuleArrayDimensions returns [EObject current=null] : iv_ruleArrayDimensions= ruleArrayDimensions EOF ;
    public final EObject entryRuleArrayDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimensions = null;


        try {
            // InternalMyGrammar.g:2354:56: (iv_ruleArrayDimensions= ruleArrayDimensions EOF )
            // InternalMyGrammar.g:2355:2: iv_ruleArrayDimensions= ruleArrayDimensions EOF
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
    // InternalMyGrammar.g:2361:1: ruleArrayDimensions returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) ;
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
            // InternalMyGrammar.g:2367:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) )
            // InternalMyGrammar.g:2368:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            {
            // InternalMyGrammar.g:2368:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            // InternalMyGrammar.g:2369:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            {
            otherlv_0=(Token)match(input,40,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMyGrammar.g:2373:3: ()
            // InternalMyGrammar.g:2374:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayDimensionsAccess().getArrayDimensionsAction_1(),
              					current);
              			
            }

            }

            // InternalMyGrammar.g:2380:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_TX)||LA36_0==27||(LA36_0>=62 && LA36_0<=174)||(LA36_0>=205 && LA36_0<=206)||(LA36_0>=217 && LA36_0<=218)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyGrammar.g:2381:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalMyGrammar.g:2381:4: (lv_value_2_0= ruleExpression )
                    // InternalMyGrammar.g:2382:5: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArrayDimensionsAccess().getValueExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_38);
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
                      						"org.unicam.tryGrammar.MyGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalMyGrammar.g:2403:3: (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==40) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyGrammar.g:2404:4: otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']'
            	    {
            	    otherlv_4=(Token)match(input,40,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_4_0());
            	      			
            	    }
            	    // InternalMyGrammar.g:2408:4: ( (lv_value_5_0= ruleExpression ) )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_TX)||LA37_0==27||(LA37_0>=62 && LA37_0<=174)||(LA37_0>=205 && LA37_0<=206)||(LA37_0>=217 && LA37_0<=218)) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalMyGrammar.g:2409:5: (lv_value_5_0= ruleExpression )
            	            {
            	            // InternalMyGrammar.g:2409:5: (lv_value_5_0= ruleExpression )
            	            // InternalMyGrammar.g:2410:6: lv_value_5_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getArrayDimensionsAccess().getValueExpressionParserRuleCall_4_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_38);
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
            	              							"org.unicam.tryGrammar.MyGrammar.Expression");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,41,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_4_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalMyGrammar.g:2436:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalMyGrammar.g:2436:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalMyGrammar.g:2437:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalMyGrammar.g:2443:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:2449:2: (kw= 'var' )
            // InternalMyGrammar.g:2450:2: kw= 'var'
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
    // InternalMyGrammar.g:2458:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalMyGrammar.g:2458:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalMyGrammar.g:2459:2: iv_ruleTuple= ruleTuple EOF
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
    // InternalMyGrammar.g:2465:1: ruleTuple returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_3_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:2471:2: ( (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) )
            // InternalMyGrammar.g:2472:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            {
            // InternalMyGrammar.g:2472:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            // InternalMyGrammar.g:2473:3: otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyGrammar.g:2477:3: ()
            // InternalMyGrammar.g:2478:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleAccess().getTupleAction_1(),
              					current);
              			
            }

            }

            // InternalMyGrammar.g:2484:3: ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_TX)||LA42_0==22||LA42_0==27||(LA42_0>=62 && LA42_0<=174)||(LA42_0>=205 && LA42_0<=206)||(LA42_0>=217 && LA42_0<=218)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyGrammar.g:2485:4: ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    {
                    // InternalMyGrammar.g:2485:4: ( (lv_members_2_0= ruleExpression ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_TX)||LA39_0==27||(LA39_0>=62 && LA39_0<=174)||(LA39_0>=205 && LA39_0<=206)||(LA39_0>=217 && LA39_0<=218)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalMyGrammar.g:2486:5: (lv_members_2_0= ruleExpression )
                            {
                            // InternalMyGrammar.g:2486:5: (lv_members_2_0= ruleExpression )
                            // InternalMyGrammar.g:2487:6: lv_members_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getTupleAccess().getMembersExpressionParserRuleCall_2_0_0());
                              					
                            }
                            pushFollow(FOLLOW_40);
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
                              							"org.unicam.tryGrammar.MyGrammar.Expression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalMyGrammar.g:2504:4: ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==22) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalMyGrammar.g:2505:5: ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )?
                    	    {
                    	    // InternalMyGrammar.g:2505:5: ( (lv_members_3_0= ruleTupleSeparator ) )
                    	    // InternalMyGrammar.g:2506:6: (lv_members_3_0= ruleTupleSeparator )
                    	    {
                    	    // InternalMyGrammar.g:2506:6: (lv_members_3_0= ruleTupleSeparator )
                    	    // InternalMyGrammar.g:2507:7: lv_members_3_0= ruleTupleSeparator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTupleAccess().getMembersTupleSeparatorParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
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
                    	      								"org.unicam.tryGrammar.MyGrammar.TupleSeparator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalMyGrammar.g:2524:5: ( (lv_members_4_0= ruleExpression ) )?
                    	    int alt40=2;
                    	    int LA40_0 = input.LA(1);

                    	    if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_TX)||LA40_0==27||(LA40_0>=62 && LA40_0<=174)||(LA40_0>=205 && LA40_0<=206)||(LA40_0>=217 && LA40_0<=218)) ) {
                    	        alt40=1;
                    	    }
                    	    switch (alt40) {
                    	        case 1 :
                    	            // InternalMyGrammar.g:2525:6: (lv_members_4_0= ruleExpression )
                    	            {
                    	            // InternalMyGrammar.g:2525:6: (lv_members_4_0= ruleExpression )
                    	            // InternalMyGrammar.g:2526:7: lv_members_4_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getTupleAccess().getMembersExpressionParserRuleCall_2_1_1_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_39);
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
                    	              								"org.unicam.tryGrammar.MyGrammar.Expression");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:2553:1: entryRuleTupleSeparator returns [EObject current=null] : iv_ruleTupleSeparator= ruleTupleSeparator EOF ;
    public final EObject entryRuleTupleSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleSeparator = null;


        try {
            // InternalMyGrammar.g:2553:55: (iv_ruleTupleSeparator= ruleTupleSeparator EOF )
            // InternalMyGrammar.g:2554:2: iv_ruleTupleSeparator= ruleTupleSeparator EOF
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
    // InternalMyGrammar.g:2560:1: ruleTupleSeparator returns [EObject current=null] : (otherlv_0= ',' () ) ;
    public final EObject ruleTupleSeparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:2566:2: ( (otherlv_0= ',' () ) )
            // InternalMyGrammar.g:2567:2: (otherlv_0= ',' () )
            {
            // InternalMyGrammar.g:2567:2: (otherlv_0= ',' () )
            // InternalMyGrammar.g:2568:3: otherlv_0= ',' ()
            {
            otherlv_0=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleSeparatorAccess().getCommaKeyword_0());
              		
            }
            // InternalMyGrammar.g:2572:3: ()
            // InternalMyGrammar.g:2573:4: 
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
    // InternalMyGrammar.g:2583:1: entryRuleSimpleStatement returns [EObject current=null] : iv_ruleSimpleStatement= ruleSimpleStatement EOF ;
    public final EObject entryRuleSimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement = null;


        try {
            // InternalMyGrammar.g:2583:56: (iv_ruleSimpleStatement= ruleSimpleStatement EOF )
            // InternalMyGrammar.g:2584:2: iv_ruleSimpleStatement= ruleSimpleStatement EOF
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
    // InternalMyGrammar.g:2590:1: ruleSimpleStatement returns [EObject current=null] : ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) ;
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
            // InternalMyGrammar.g:2596:2: ( ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) )
            // InternalMyGrammar.g:2597:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            {
            // InternalMyGrammar.g:2597:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            // InternalMyGrammar.g:2598:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) )
            {
            // InternalMyGrammar.g:2598:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalMyGrammar.g:2599:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalMyGrammar.g:2599:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalMyGrammar.g:2600:5: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStatementAccess().getStandardTypeWithoutQualifiedIdentifierParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_31);
                    this_StandardTypeWithoutQualifiedIdentifier_0=ruleStandardTypeWithoutQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_StandardTypeWithoutQualifiedIdentifier_0;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMyGrammar.g:2608:5: ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalMyGrammar.g:2609:6: () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalMyGrammar.g:2609:6: ()
                    // InternalMyGrammar.g:2610:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getSimpleStatementAccess().getStandardVariableDeclarationTypeAction_0_0_1_0(),
                      								current);
                      						
                    }

                    }

                    // InternalMyGrammar.g:2616:6: ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==33||LA43_0==37||(LA43_0>=175 && LA43_0<=181)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalMyGrammar.g:2617:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalMyGrammar.g:2617:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalMyGrammar.g:2618:8: lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getPtionalElementsVariableDeclarationOptionalElementParserRuleCall_0_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_31);
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
                    	      									"org.unicam.tryGrammar.MyGrammar.VariableDeclarationOptionalElement");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    // InternalMyGrammar.g:2635:6: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalMyGrammar.g:2636:7: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalMyGrammar.g:2636:7: (lv_variable_3_0= ruleVariable )
                    // InternalMyGrammar.g:2637:8: lv_variable_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getVariableVariableParserRuleCall_0_0_1_2_0());
                      							
                    }
                    pushFollow(FOLLOW_41);
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
                      									"org.unicam.tryGrammar.MyGrammar.Variable");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalMyGrammar.g:2654:6: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==36) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalMyGrammar.g:2655:7: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_0_1_3_0());
                              						
                            }
                            // InternalMyGrammar.g:2659:7: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalMyGrammar.g:2660:8: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalMyGrammar.g:2660:8: (lv_expression_5_0= ruleExpression )
                            // InternalMyGrammar.g:2661:9: lv_expression_5_0= ruleExpression
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
                              										"org.unicam.tryGrammar.MyGrammar.Expression");
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
                    // InternalMyGrammar.g:2682:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalMyGrammar.g:2682:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalMyGrammar.g:2683:5: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStatementAccess().getVarTypeParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_42);
                    ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMyGrammar.g:2690:5: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==27) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalMyGrammar.g:2691:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalMyGrammar.g:2691:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalMyGrammar.g:2692:7: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalMyGrammar.g:2692:7: ()
                            // InternalMyGrammar.g:2693:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTypeDeclarationAction_0_1_1_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalMyGrammar.g:2699:7: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalMyGrammar.g:2700:8: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalMyGrammar.g:2700:8: (lv_variable_8_0= ruleVariable )
                            // InternalMyGrammar.g:2701:9: lv_variable_8_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getVariableVariableParserRuleCall_0_1_1_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_43);
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
                              										"org.unicam.tryGrammar.MyGrammar.Variable");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalMyGrammar.g:2718:7: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalMyGrammar.g:2719:8: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_9, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_0_2_0());
                              							
                            }
                            // InternalMyGrammar.g:2723:8: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalMyGrammar.g:2724:9: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalMyGrammar.g:2724:9: (lv_expression_10_0= ruleExpression )
                            // InternalMyGrammar.g:2725:10: lv_expression_10_0= ruleExpression
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
                              											"org.unicam.tryGrammar.MyGrammar.Expression");
                              										afterParserOrEnumRuleCall();
                              									
                            }

                            }


                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyGrammar.g:2745:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalMyGrammar.g:2745:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalMyGrammar.g:2746:7: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalMyGrammar.g:2746:7: ()
                            // InternalMyGrammar.g:2747:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTupleVariableDeclarationAction_0_1_1_1_0(),
                              									current);
                              							
                            }

                            }

                            // InternalMyGrammar.g:2753:7: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalMyGrammar.g:2754:8: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalMyGrammar.g:2754:8: (lv_tuple_12_0= ruleTuple )
                            // InternalMyGrammar.g:2755:9: lv_tuple_12_0= ruleTuple
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getTupleTupleParserRuleCall_0_1_1_1_1_0());
                              								
                            }
                            pushFollow(FOLLOW_43);
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
                              										"org.unicam.tryGrammar.MyGrammar.Tuple");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalMyGrammar.g:2772:7: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalMyGrammar.g:2773:8: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_13, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_1_2_0());
                              							
                            }
                            // InternalMyGrammar.g:2777:8: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalMyGrammar.g:2778:9: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalMyGrammar.g:2778:9: (lv_expression_14_0= ruleExpression )
                            // InternalMyGrammar.g:2779:10: lv_expression_14_0= ruleExpression
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
                              											"org.unicam.tryGrammar.MyGrammar.Expression");
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
                    // InternalMyGrammar.g:2801:4: this_ExpressionStatement_15= ruleExpressionStatement
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

            // InternalMyGrammar.g:2810:3: ( (lv_semicolon_16_0= ';' ) )
            // InternalMyGrammar.g:2811:4: (lv_semicolon_16_0= ';' )
            {
            // InternalMyGrammar.g:2811:4: (lv_semicolon_16_0= ';' )
            // InternalMyGrammar.g:2812:5: lv_semicolon_16_0= ';'
            {
            lv_semicolon_16_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:2828:1: entryRuleSimpleStatement2 returns [EObject current=null] : iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF ;
    public final EObject entryRuleSimpleStatement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement2 = null;


        try {
            // InternalMyGrammar.g:2828:57: (iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF )
            // InternalMyGrammar.g:2829:2: iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF
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
    // InternalMyGrammar.g:2835:1: ruleSimpleStatement2 returns [EObject current=null] : ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ;
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
            // InternalMyGrammar.g:2841:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) )
            // InternalMyGrammar.g:2842:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            {
            // InternalMyGrammar.g:2842:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt50=3;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalMyGrammar.g:2843:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalMyGrammar.g:2843:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalMyGrammar.g:2844:4: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatement2Access().getStandardTypeWithoutQualifiedIdentifierParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_StandardTypeWithoutQualifiedIdentifier_0=ruleStandardTypeWithoutQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_StandardTypeWithoutQualifiedIdentifier_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyGrammar.g:2852:4: ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalMyGrammar.g:2853:5: () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalMyGrammar.g:2853:5: ()
                    // InternalMyGrammar.g:2854:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getSimpleStatement2Access().getStandardVariableDeclarationTypeAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalMyGrammar.g:2860:5: ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==33||LA47_0==37||(LA47_0>=175 && LA47_0<=181)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalMyGrammar.g:2861:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalMyGrammar.g:2861:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalMyGrammar.g:2862:7: lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSimpleStatement2Access().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_0_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
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
                    	      								"org.unicam.tryGrammar.MyGrammar.VariableDeclarationOptionalElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    // InternalMyGrammar.g:2879:5: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalMyGrammar.g:2880:6: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalMyGrammar.g:2880:6: (lv_variable_3_0= ruleVariable )
                    // InternalMyGrammar.g:2881:7: lv_variable_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSimpleStatement2Access().getVariableVariableParserRuleCall_0_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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
                      								"org.unicam.tryGrammar.MyGrammar.Variable");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyGrammar.g:2898:5: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==36) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalMyGrammar.g:2899:6: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_0_1_3_0());
                              					
                            }
                            // InternalMyGrammar.g:2903:6: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalMyGrammar.g:2904:7: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalMyGrammar.g:2904:7: (lv_expression_5_0= ruleExpression )
                            // InternalMyGrammar.g:2905:8: lv_expression_5_0= ruleExpression
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
                              									"org.unicam.tryGrammar.MyGrammar.Expression");
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
                    // InternalMyGrammar.g:2926:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalMyGrammar.g:2926:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalMyGrammar.g:2927:4: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatement2Access().getVarTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_42);
                    ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyGrammar.g:2934:4: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==27) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalMyGrammar.g:2935:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalMyGrammar.g:2935:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalMyGrammar.g:2936:6: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalMyGrammar.g:2936:6: ()
                            // InternalMyGrammar.g:2937:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTypeDeclarationAction_1_1_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalMyGrammar.g:2943:6: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalMyGrammar.g:2944:7: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalMyGrammar.g:2944:7: (lv_variable_8_0= ruleVariable )
                            // InternalMyGrammar.g:2945:8: lv_variable_8_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getVariableVariableParserRuleCall_1_1_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_43);
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
                              									"org.unicam.tryGrammar.MyGrammar.Variable");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalMyGrammar.g:2962:6: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalMyGrammar.g:2963:7: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_9, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_0_2_0());
                              						
                            }
                            // InternalMyGrammar.g:2967:7: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalMyGrammar.g:2968:8: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalMyGrammar.g:2968:8: (lv_expression_10_0= ruleExpression )
                            // InternalMyGrammar.g:2969:9: lv_expression_10_0= ruleExpression
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
                              										"org.unicam.tryGrammar.MyGrammar.Expression");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyGrammar.g:2989:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalMyGrammar.g:2989:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalMyGrammar.g:2990:6: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalMyGrammar.g:2990:6: ()
                            // InternalMyGrammar.g:2991:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTupleVariableDeclarationAction_1_1_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalMyGrammar.g:2997:6: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalMyGrammar.g:2998:7: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalMyGrammar.g:2998:7: (lv_tuple_12_0= ruleTuple )
                            // InternalMyGrammar.g:2999:8: lv_tuple_12_0= ruleTuple
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getTupleTupleParserRuleCall_1_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_43);
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
                              									"org.unicam.tryGrammar.MyGrammar.Tuple");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalMyGrammar.g:3016:6: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalMyGrammar.g:3017:7: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_13, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_1_2_0());
                              						
                            }
                            // InternalMyGrammar.g:3021:7: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalMyGrammar.g:3022:8: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalMyGrammar.g:3022:8: (lv_expression_14_0= ruleExpression )
                            // InternalMyGrammar.g:3023:9: lv_expression_14_0= ruleExpression
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
                              										"org.unicam.tryGrammar.MyGrammar.Expression");
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
                    // InternalMyGrammar.g:3045:3: this_ExpressionStatement_15= ruleExpressionStatement
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
    // InternalMyGrammar.g:3057:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalMyGrammar.g:3057:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalMyGrammar.g:3058:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
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
    // InternalMyGrammar.g:3064:1: ruleExpressionStatement returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3070:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalMyGrammar.g:3071:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalMyGrammar.g:3071:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalMyGrammar.g:3072:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalMyGrammar.g:3072:3: (lv_expression_0_0= ruleExpression )
            // InternalMyGrammar.g:3073:4: lv_expression_0_0= ruleExpression
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
              					"org.unicam.tryGrammar.MyGrammar.Expression");
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
    // InternalMyGrammar.g:3093:1: entryRuleQualifiedIdentifier returns [EObject current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final EObject entryRuleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedIdentifier = null;


        try {
            // InternalMyGrammar.g:3093:60: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // InternalMyGrammar.g:3094:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
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
    // InternalMyGrammar.g:3100:1: ruleQualifiedIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) ;
    public final EObject ruleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        EObject lv_qualifiers_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3106:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) )
            // InternalMyGrammar.g:3107:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            {
            // InternalMyGrammar.g:3107:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            // InternalMyGrammar.g:3108:3: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )*
            {
            // InternalMyGrammar.g:3108:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMyGrammar.g:3109:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMyGrammar.g:3109:4: (lv_identifier_0_0= RULE_ID )
            // InternalMyGrammar.g:3110:5: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            // InternalMyGrammar.g:3126:3: ( (lv_qualifiers_1_0= ruleQualifier ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==27||LA51_0==40||LA51_0==43) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalMyGrammar.g:3127:4: (lv_qualifiers_1_0= ruleQualifier )
            	    {
            	    // InternalMyGrammar.g:3127:4: (lv_qualifiers_1_0= ruleQualifier )
            	    // InternalMyGrammar.g:3128:5: lv_qualifiers_1_0= ruleQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getQualifiedIdentifierAccess().getQualifiersQualifierParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_44);
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
            	      						"org.unicam.tryGrammar.MyGrammar.Qualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalMyGrammar.g:3149:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalMyGrammar.g:3149:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalMyGrammar.g:3150:2: iv_ruleQualifier= ruleQualifier EOF
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
    // InternalMyGrammar.g:3156:1: ruleQualifier returns [EObject current=null] : (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Index_1 = null;

        EObject this_Arguments_2 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3162:2: ( (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) )
            // InternalMyGrammar.g:3163:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            {
            // InternalMyGrammar.g:3163:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt52=1;
                }
                break;
            case 40:
                {
                alt52=2;
                }
                break;
            case 27:
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalMyGrammar.g:3164:3: this_Field_0= ruleField
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
                    // InternalMyGrammar.g:3173:3: this_Index_1= ruleIndex
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
                    // InternalMyGrammar.g:3182:3: this_Arguments_2= ruleArguments
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
    // InternalMyGrammar.g:3194:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMyGrammar.g:3194:46: (iv_ruleField= ruleField EOF )
            // InternalMyGrammar.g:3195:2: iv_ruleField= ruleField EOF
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
    // InternalMyGrammar.g:3201:1: ruleField returns [EObject current=null] : (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_field_1_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:3207:2: ( (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) )
            // InternalMyGrammar.g:3208:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            {
            // InternalMyGrammar.g:3208:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            // InternalMyGrammar.g:3209:3: otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFullStopKeyword_0());
              		
            }
            // InternalMyGrammar.g:3213:3: ( (lv_field_1_0= RULE_ID ) )
            // InternalMyGrammar.g:3214:4: (lv_field_1_0= RULE_ID )
            {
            // InternalMyGrammar.g:3214:4: (lv_field_1_0= RULE_ID )
            // InternalMyGrammar.g:3215:5: lv_field_1_0= RULE_ID
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
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
    // InternalMyGrammar.g:3235:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // InternalMyGrammar.g:3235:46: (iv_ruleIndex= ruleIndex EOF )
            // InternalMyGrammar.g:3236:2: iv_ruleIndex= ruleIndex EOF
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
    // InternalMyGrammar.g:3242:1: ruleIndex returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3248:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) )
            // InternalMyGrammar.g:3249:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            {
            // InternalMyGrammar.g:3249:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            // InternalMyGrammar.g:3250:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMyGrammar.g:3254:3: ()
            // InternalMyGrammar.g:3255:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndexAccess().getIndexAction_1(),
              					current);
              			
            }

            }

            // InternalMyGrammar.g:3261:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_TX)||LA53_0==27||(LA53_0>=62 && LA53_0<=174)||(LA53_0>=205 && LA53_0<=206)||(LA53_0>=217 && LA53_0<=218)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyGrammar.g:3262:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalMyGrammar.g:3262:4: (lv_value_2_0= ruleExpression )
                    // InternalMyGrammar.g:3263:5: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIndexAccess().getValueExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_38);
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
                      						"org.unicam.tryGrammar.MyGrammar.Expression");
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
    // InternalMyGrammar.g:3288:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalMyGrammar.g:3288:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalMyGrammar.g:3289:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalMyGrammar.g:3295:1: ruleArguments returns [EObject current=null] : ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3301:2: ( ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) )
            // InternalMyGrammar.g:3302:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            {
            // InternalMyGrammar.g:3302:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            // InternalMyGrammar.g:3303:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            {
            // InternalMyGrammar.g:3303:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            // InternalMyGrammar.g:3304:4: lv_arguments_0_0= ruleFunctionCallArguments
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
              					"org.unicam.tryGrammar.MyGrammar.FunctionCallArguments");
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
    // InternalMyGrammar.g:3324:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalMyGrammar.g:3324:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalMyGrammar.g:3325:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalMyGrammar.g:3331:1: ruleModifier returns [EObject current=null] : (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3337:2: ( (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) ) )
            // InternalMyGrammar.g:3338:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) )
            {
            // InternalMyGrammar.g:3338:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) )
            // InternalMyGrammar.g:3339:3: otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModifierAccess().getModifierKeyword_0());
              		
            }
            // InternalMyGrammar.g:3343:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyGrammar.g:3344:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyGrammar.g:3344:4: (lv_name_1_0= RULE_ID )
            // InternalMyGrammar.g:3345:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            // InternalMyGrammar.g:3361:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==27) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyGrammar.g:3362:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalMyGrammar.g:3362:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalMyGrammar.g:3363:5: lv_parameters_2_0= ruleParameterList
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
                      						"org.unicam.tryGrammar.MyGrammar.ParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyGrammar.g:3380:3: ( (lv_block_3_0= ruleBody ) )
            // InternalMyGrammar.g:3381:4: (lv_block_3_0= ruleBody )
            {
            // InternalMyGrammar.g:3381:4: (lv_block_3_0= ruleBody )
            // InternalMyGrammar.g:3382:5: lv_block_3_0= ruleBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModifierAccess().getBlockBodyParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_3_0=ruleBody();

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
              						"org.unicam.tryGrammar.MyGrammar.Body");
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
    // InternalMyGrammar.g:3403:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMyGrammar.g:3403:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMyGrammar.g:3404:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalMyGrammar.g:3410:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? otherlv_3= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3416:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? otherlv_3= ';' ) )
            // InternalMyGrammar.g:3417:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? otherlv_3= ';' )
            {
            // InternalMyGrammar.g:3417:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? otherlv_3= ';' )
            // InternalMyGrammar.g:3418:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
              		
            }
            // InternalMyGrammar.g:3422:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyGrammar.g:3423:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyGrammar.g:3423:4: (lv_name_1_0= RULE_ID )
            // InternalMyGrammar.g:3424:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            // InternalMyGrammar.g:3440:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==27) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyGrammar.g:3441:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalMyGrammar.g:3441:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalMyGrammar.g:3442:5: lv_parameters_2_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEventAccess().getParametersParameterListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
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
                      						"org.unicam.tryGrammar.MyGrammar.ParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEventAccess().getSemicolonKeyword_3());
              		
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
    // InternalMyGrammar.g:3467:1: entryRuleModifierInvocation returns [EObject current=null] : iv_ruleModifierInvocation= ruleModifierInvocation EOF ;
    public final EObject entryRuleModifierInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierInvocation = null;


        try {
            // InternalMyGrammar.g:3467:59: (iv_ruleModifierInvocation= ruleModifierInvocation EOF )
            // InternalMyGrammar.g:3468:2: iv_ruleModifierInvocation= ruleModifierInvocation EOF
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
    // InternalMyGrammar.g:3474:1: ruleModifierInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleModifierInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3480:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalMyGrammar.g:3481:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalMyGrammar.g:3481:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalMyGrammar.g:3482:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalMyGrammar.g:3482:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyGrammar.g:3483:4: (otherlv_0= RULE_ID )
            {
            // InternalMyGrammar.g:3483:4: (otherlv_0= RULE_ID )
            // InternalMyGrammar.g:3484:5: otherlv_0= RULE_ID
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

            // InternalMyGrammar.g:3495:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==27) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyGrammar.g:3496:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalMyGrammar.g:3496:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalMyGrammar.g:3497:5: lv_args_1_0= ruleFunctionCallListArguments
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
                      						"org.unicam.tryGrammar.MyGrammar.FunctionCallListArguments");
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
    // InternalMyGrammar.g:3518:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalMyGrammar.g:3518:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalMyGrammar.g:3519:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalMyGrammar.g:3525:1: ruleParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3531:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalMyGrammar.g:3532:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalMyGrammar.g:3532:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalMyGrammar.g:3533:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyGrammar.g:3537:3: ()
            // InternalMyGrammar.g:3538:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalMyGrammar.g:3544:3: ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID||LA58_0==38||LA58_0==42||(LA58_0>=71 && LA58_0<=174)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyGrammar.g:3545:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // InternalMyGrammar.g:3545:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) )
                    // InternalMyGrammar.g:3546:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    {
                    // InternalMyGrammar.g:3546:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    // InternalMyGrammar.g:3547:6: lv_parameters_2_0= ruleVariableDeclaration
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
                      							"org.unicam.tryGrammar.MyGrammar.VariableDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyGrammar.g:3564:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==22) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalMyGrammar.g:3565:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalMyGrammar.g:3569:5: ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    // InternalMyGrammar.g:3570:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyGrammar.g:3570:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    // InternalMyGrammar.g:3571:7: lv_parameters_4_0= ruleVariableDeclaration
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
                    	      								"org.unicam.tryGrammar.MyGrammar.VariableDeclaration");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:3598:1: entryRuleReturnsParameterList returns [EObject current=null] : iv_ruleReturnsParameterList= ruleReturnsParameterList EOF ;
    public final EObject entryRuleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsParameterList = null;


        try {
            // InternalMyGrammar.g:3598:61: (iv_ruleReturnsParameterList= ruleReturnsParameterList EOF )
            // InternalMyGrammar.g:3599:2: iv_ruleReturnsParameterList= ruleReturnsParameterList EOF
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
    // InternalMyGrammar.g:3605:1: ruleReturnsParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3611:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalMyGrammar.g:3612:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalMyGrammar.g:3612:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalMyGrammar.g:3613:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnsParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyGrammar.g:3617:3: ()
            // InternalMyGrammar.g:3618:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnsParameterListAccess().getReturnsParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalMyGrammar.g:3624:3: ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID||LA60_0==38||LA60_0==42||(LA60_0>=71 && LA60_0<=174)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyGrammar.g:3625:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    {
                    // InternalMyGrammar.g:3625:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) )
                    // InternalMyGrammar.g:3626:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    {
                    // InternalMyGrammar.g:3626:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    // InternalMyGrammar.g:3627:6: lv_parameters_2_0= ruleReturnParameterDeclaration
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
                      							"org.unicam.tryGrammar.MyGrammar.ReturnParameterDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyGrammar.g:3644:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==22) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalMyGrammar.g:3645:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReturnsParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalMyGrammar.g:3649:5: ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    // InternalMyGrammar.g:3650:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    {
                    	    // InternalMyGrammar.g:3650:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    // InternalMyGrammar.g:3651:7: lv_parameters_4_0= ruleReturnParameterDeclaration
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
                    	      								"org.unicam.tryGrammar.MyGrammar.ReturnParameterDeclaration");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:3678:1: entryRuleReturnParameterDeclaration returns [EObject current=null] : iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF ;
    public final EObject entryRuleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterDeclaration = null;


        try {
            // InternalMyGrammar.g:3678:67: (iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF )
            // InternalMyGrammar.g:3679:2: iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF
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
    // InternalMyGrammar.g:3685:1: ruleReturnParameterDeclaration returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) ;
    public final EObject ruleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_typeRef_0_0 = null;

        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3691:2: ( ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) )
            // InternalMyGrammar.g:3692:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            {
            // InternalMyGrammar.g:3692:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            // InternalMyGrammar.g:3693:3: ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )?
            {
            // InternalMyGrammar.g:3693:3: ( (lv_typeRef_0_0= ruleType ) )
            // InternalMyGrammar.g:3694:4: (lv_typeRef_0_0= ruleType )
            {
            // InternalMyGrammar.g:3694:4: (lv_typeRef_0_0= ruleType )
            // InternalMyGrammar.g:3695:5: lv_typeRef_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnParameterDeclarationAccess().getTypeRefTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_48);
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
              						"org.unicam.tryGrammar.MyGrammar.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:3712:3: ( (lv_variable_1_0= ruleVariable ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyGrammar.g:3713:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalMyGrammar.g:3713:4: (lv_variable_1_0= ruleVariable )
                    // InternalMyGrammar.g:3714:5: lv_variable_1_0= ruleVariable
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
                      						"org.unicam.tryGrammar.MyGrammar.Variable");
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
    // InternalMyGrammar.g:3735:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyGrammar.g:3735:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyGrammar.g:3736:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyGrammar.g:3742:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_WhileStatement_1 = null;

        EObject this_ForStatement_2 = null;

        EObject this_Body_3 = null;

        EObject this_PlaceHolderStatement_4 = null;

        EObject this_ContinueStatement_5 = null;

        EObject this_BreakStatement_6 = null;

        EObject this_ReturnStatement_7 = null;

        EObject this_ThrowStatement_8 = null;

        EObject this_DeleteStatement_9 = null;

        EObject this_SimpleStatement_10 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3748:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) )
            // InternalMyGrammar.g:3749:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            {
            // InternalMyGrammar.g:3749:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            int alt63=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt63=1;
                }
                break;
            case 49:
                {
                alt63=2;
                }
                break;
            case 50:
                {
                alt63=3;
                }
                break;
            case 21:
                {
                alt63=4;
                }
                break;
            case 55:
                {
                alt63=5;
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
            case 27:
            case 38:
            case 42:
            case 46:
            case 51:
            case 52:
            case 53:
            case 54:
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
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 205:
            case 206:
            case 217:
            case 218:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalMyGrammar.g:3750:3: this_IfStatement_0= ruleIfStatement
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
                    // InternalMyGrammar.g:3759:3: this_WhileStatement_1= ruleWhileStatement
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
                    // InternalMyGrammar.g:3768:3: this_ForStatement_2= ruleForStatement
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
                    // InternalMyGrammar.g:3777:3: this_Body_3= ruleBody
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBodyParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Body_3=ruleBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Body_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyGrammar.g:3786:3: this_PlaceHolderStatement_4= rulePlaceHolderStatement
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
                    // InternalMyGrammar.g:3795:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    {
                    // InternalMyGrammar.g:3795:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    int alt62=6;
                    switch ( input.LA(1) ) {
                    case 51:
                        {
                        alt62=1;
                        }
                        break;
                    case 52:
                        {
                        alt62=2;
                        }
                        break;
                    case 53:
                        {
                        alt62=3;
                        }
                        break;
                    case 54:
                        {
                        alt62=4;
                        }
                        break;
                    case 46:
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
                    case 27:
                    case 38:
                    case 42:
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
                    case 169:
                    case 170:
                    case 171:
                    case 172:
                    case 173:
                    case 174:
                    case 205:
                    case 206:
                    case 217:
                    case 218:
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
                            // InternalMyGrammar.g:3796:4: this_ContinueStatement_5= ruleContinueStatement
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
                            // InternalMyGrammar.g:3805:4: this_BreakStatement_6= ruleBreakStatement
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
                            // InternalMyGrammar.g:3814:4: this_ReturnStatement_7= ruleReturnStatement
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
                            // InternalMyGrammar.g:3823:4: this_ThrowStatement_8= ruleThrowStatement
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
                            // InternalMyGrammar.g:3832:4: this_DeleteStatement_9= ruleDeleteStatement
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
                            // InternalMyGrammar.g:3841:4: this_SimpleStatement_10= ruleSimpleStatement
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
    // InternalMyGrammar.g:3854:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // InternalMyGrammar.g:3854:56: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // InternalMyGrammar.g:3855:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
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
    // InternalMyGrammar.g:3861:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:3867:2: ( (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) )
            // InternalMyGrammar.g:3868:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            {
            // InternalMyGrammar.g:3868:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            // InternalMyGrammar.g:3869:3: otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
              		
            }
            // InternalMyGrammar.g:3873:3: ( (lv_variable_1_0= ruleQualifiedIdentifier ) )
            // InternalMyGrammar.g:3874:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            {
            // InternalMyGrammar.g:3874:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            // InternalMyGrammar.g:3875:5: lv_variable_1_0= ruleQualifiedIdentifier
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
              						"org.unicam.tryGrammar.MyGrammar.QualifiedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:3900:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalMyGrammar.g:3900:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalMyGrammar.g:3901:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalMyGrammar.g:3907:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) ;
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
            // InternalMyGrammar.g:3913:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) )
            // InternalMyGrammar.g:3914:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            {
            // InternalMyGrammar.g:3914:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            // InternalMyGrammar.g:3915:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMyGrammar.g:3923:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalMyGrammar.g:3924:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalMyGrammar.g:3924:4: (lv_condition_2_0= ruleExpression )
            // InternalMyGrammar.g:3925:5: lv_condition_2_0= ruleExpression
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
              						"org.unicam.tryGrammar.MyGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalMyGrammar.g:3946:3: ( (lv_trueBody_4_0= ruleStatement ) )
            // InternalMyGrammar.g:3947:4: (lv_trueBody_4_0= ruleStatement )
            {
            // InternalMyGrammar.g:3947:4: (lv_trueBody_4_0= ruleStatement )
            // InternalMyGrammar.g:3948:5: lv_trueBody_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getTrueBodyStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_51);
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
              						"org.unicam.tryGrammar.MyGrammar.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:3965:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==48) ) {
                int LA64_1 = input.LA(2);

                if ( (synpred1_InternalMyGrammar()) ) {
                    alt64=1;
                }
            }
            switch (alt64) {
                case 1 :
                    // InternalMyGrammar.g:3966:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) )
                    {
                    // InternalMyGrammar.g:3966:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalMyGrammar.g:3967:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalMyGrammar.g:3973:4: ( (lv_falseBody_6_0= ruleStatement ) )
                    // InternalMyGrammar.g:3974:5: (lv_falseBody_6_0= ruleStatement )
                    {
                    // InternalMyGrammar.g:3974:5: (lv_falseBody_6_0= ruleStatement )
                    // InternalMyGrammar.g:3975:6: lv_falseBody_6_0= ruleStatement
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
                      							"org.unicam.tryGrammar.MyGrammar.Statement");
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
    // InternalMyGrammar.g:3997:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalMyGrammar.g:3997:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalMyGrammar.g:3998:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalMyGrammar.g:4004:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4010:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) )
            // InternalMyGrammar.g:4011:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // InternalMyGrammar.g:4011:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            // InternalMyGrammar.g:4012:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMyGrammar.g:4020:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalMyGrammar.g:4021:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalMyGrammar.g:4021:4: (lv_condition_2_0= ruleExpression )
            // InternalMyGrammar.g:4022:5: lv_condition_2_0= ruleExpression
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
              						"org.unicam.tryGrammar.MyGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalMyGrammar.g:4043:3: ( (lv_body_4_0= ruleStatement ) )
            // InternalMyGrammar.g:4044:4: (lv_body_4_0= ruleStatement )
            {
            // InternalMyGrammar.g:4044:4: (lv_body_4_0= ruleStatement )
            // InternalMyGrammar.g:4045:5: lv_body_4_0= ruleStatement
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
              						"org.unicam.tryGrammar.MyGrammar.Statement");
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
    // InternalMyGrammar.g:4066:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalMyGrammar.g:4066:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalMyGrammar.g:4067:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalMyGrammar.g:4073:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) ;
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
            // InternalMyGrammar.g:4079:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) )
            // InternalMyGrammar.g:4080:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            {
            // InternalMyGrammar.g:4080:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            // InternalMyGrammar.g:4081:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMyGrammar.g:4089:3: ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_TX)||LA65_0==27||LA65_0==38||LA65_0==42||(LA65_0>=62 && LA65_0<=174)||(LA65_0>=205 && LA65_0<=206)||(LA65_0>=217 && LA65_0<=218)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyGrammar.g:4090:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    {
                    // InternalMyGrammar.g:4090:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    // InternalMyGrammar.g:4091:5: lv_initExpression_2_0= ruleSimpleStatement2
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
                      						"org.unicam.tryGrammar.MyGrammar.SimpleStatement2");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyGrammar.g:4108:3: ( ( ';' )=>otherlv_3= ';' )
            // InternalMyGrammar.g:4109:4: ( ';' )=>otherlv_3= ';'
            {
            otherlv_3=(Token)match(input,17,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
              			
            }

            }

            // InternalMyGrammar.g:4115:3: ( (lv_conditionExpression_4_0= ruleExpression ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_TX)||LA66_0==27||(LA66_0>=62 && LA66_0<=174)||(LA66_0>=205 && LA66_0<=206)||(LA66_0>=217 && LA66_0<=218)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyGrammar.g:4116:4: (lv_conditionExpression_4_0= ruleExpression )
                    {
                    // InternalMyGrammar.g:4116:4: (lv_conditionExpression_4_0= ruleExpression )
                    // InternalMyGrammar.g:4117:5: lv_conditionExpression_4_0= ruleExpression
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
                      						"org.unicam.tryGrammar.MyGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_5());
              		
            }
            // InternalMyGrammar.g:4138:3: ( (lv_loopExpression_6_0= ruleExpressionStatement ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_TX)||LA67_0==27||(LA67_0>=62 && LA67_0<=174)||(LA67_0>=205 && LA67_0<=206)||(LA67_0>=217 && LA67_0<=218)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyGrammar.g:4139:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    {
                    // InternalMyGrammar.g:4139:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    // InternalMyGrammar.g:4140:5: lv_loopExpression_6_0= ruleExpressionStatement
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
                      						"org.unicam.tryGrammar.MyGrammar.ExpressionStatement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalMyGrammar.g:4161:3: ( (lv_body_8_0= ruleStatement ) )
            // InternalMyGrammar.g:4162:4: (lv_body_8_0= ruleStatement )
            {
            // InternalMyGrammar.g:4162:4: (lv_body_8_0= ruleStatement )
            // InternalMyGrammar.g:4163:5: lv_body_8_0= ruleStatement
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
              						"org.unicam.tryGrammar.MyGrammar.Statement");
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


    // $ANTLR start "entryRuleBody"
    // InternalMyGrammar.g:4184:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalMyGrammar.g:4184:45: (iv_ruleBody= ruleBody EOF )
            // InternalMyGrammar.g:4185:2: iv_ruleBody= ruleBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBody; 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalMyGrammar.g:4191:1: ruleBody returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4197:2: ( (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) )
            // InternalMyGrammar.g:4198:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            {
            // InternalMyGrammar.g:4198:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            // InternalMyGrammar.g:4199:3: otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMyGrammar.g:4203:3: ()
            // InternalMyGrammar.g:4204:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBodyAccess().getBlockAction_1(),
              					current);
              			
            }

            }

            // InternalMyGrammar.g:4210:3: ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_TX)||LA69_0==21||LA69_0==27||LA69_0==38||LA69_0==42||(LA69_0>=46 && LA69_0<=47)||(LA69_0>=49 && LA69_0<=55)||(LA69_0>=62 && LA69_0<=174)||(LA69_0>=205 && LA69_0<=206)||(LA69_0>=217 && LA69_0<=218)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyGrammar.g:4211:4: ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )*
                    {
                    // InternalMyGrammar.g:4211:4: ( (lv_statements_2_0= ruleStatement ) )
                    // InternalMyGrammar.g:4212:5: (lv_statements_2_0= ruleStatement )
                    {
                    // InternalMyGrammar.g:4212:5: (lv_statements_2_0= ruleStatement )
                    // InternalMyGrammar.g:4213:6: lv_statements_2_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBodyAccess().getStatementsStatementParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_55);
                    lv_statements_2_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBodyRule());
                      						}
                      						add(
                      							current,
                      							"statements",
                      							lv_statements_2_0,
                      							"org.unicam.tryGrammar.MyGrammar.Statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyGrammar.g:4230:4: ( (lv_statements_3_0= ruleStatement ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( ((LA68_0>=RULE_STRING && LA68_0<=RULE_TX)||LA68_0==21||LA68_0==27||LA68_0==38||LA68_0==42||(LA68_0>=46 && LA68_0<=47)||(LA68_0>=49 && LA68_0<=55)||(LA68_0>=62 && LA68_0<=174)||(LA68_0>=205 && LA68_0<=206)||(LA68_0>=217 && LA68_0<=218)) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalMyGrammar.g:4231:5: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // InternalMyGrammar.g:4231:5: (lv_statements_3_0= ruleStatement )
                    	    // InternalMyGrammar.g:4232:6: lv_statements_3_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBodyAccess().getStatementsStatementParserRuleCall_2_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_55);
                    	    lv_statements_3_0=ruleStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getBodyRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"statements",
                    	      							lv_statements_3_0,
                    	      							"org.unicam.tryGrammar.MyGrammar.Statement");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleContinueStatement"
    // InternalMyGrammar.g:4258:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // InternalMyGrammar.g:4258:58: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalMyGrammar.g:4259:2: iv_ruleContinueStatement= ruleContinueStatement EOF
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
    // InternalMyGrammar.g:4265:1: ruleContinueStatement returns [EObject current=null] : (otherlv_0= 'continue' () otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:4271:2: ( (otherlv_0= 'continue' () otherlv_2= ';' ) )
            // InternalMyGrammar.g:4272:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            {
            // InternalMyGrammar.g:4272:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            // InternalMyGrammar.g:4273:3: otherlv_0= 'continue' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContinueStatementAccess().getContinueKeyword_0());
              		
            }
            // InternalMyGrammar.g:4277:3: ()
            // InternalMyGrammar.g:4278:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContinueStatementAccess().getContinueAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:4292:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalMyGrammar.g:4292:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalMyGrammar.g:4293:2: iv_ruleBreakStatement= ruleBreakStatement EOF
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
    // InternalMyGrammar.g:4299:1: ruleBreakStatement returns [EObject current=null] : (otherlv_0= 'break' () otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:4305:2: ( (otherlv_0= 'break' () otherlv_2= ';' ) )
            // InternalMyGrammar.g:4306:2: (otherlv_0= 'break' () otherlv_2= ';' )
            {
            // InternalMyGrammar.g:4306:2: (otherlv_0= 'break' () otherlv_2= ';' )
            // InternalMyGrammar.g:4307:3: otherlv_0= 'break' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakStatementAccess().getBreakKeyword_0());
              		
            }
            // InternalMyGrammar.g:4311:3: ()
            // InternalMyGrammar.g:4312:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBreakStatementAccess().getBreakStatementAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:4326:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalMyGrammar.g:4326:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalMyGrammar.g:4327:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalMyGrammar.g:4333:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4339:2: ( (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) )
            // InternalMyGrammar.g:4340:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            {
            // InternalMyGrammar.g:4340:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            // InternalMyGrammar.g:4341:3: otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
              		
            }
            // InternalMyGrammar.g:4345:3: ()
            // InternalMyGrammar.g:4346:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_1(),
              					current);
              			
            }

            }

            // InternalMyGrammar.g:4352:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_TX)||LA70_0==27||(LA70_0>=62 && LA70_0<=174)||(LA70_0>=205 && LA70_0<=206)||(LA70_0>=217 && LA70_0<=218)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyGrammar.g:4353:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalMyGrammar.g:4353:4: (lv_expression_2_0= ruleExpression )
                    // InternalMyGrammar.g:4354:5: lv_expression_2_0= ruleExpression
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
                      						"org.unicam.tryGrammar.MyGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:4379:1: entryRuleThrowStatement returns [EObject current=null] : iv_ruleThrowStatement= ruleThrowStatement EOF ;
    public final EObject entryRuleThrowStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStatement = null;


        try {
            // InternalMyGrammar.g:4379:55: (iv_ruleThrowStatement= ruleThrowStatement EOF )
            // InternalMyGrammar.g:4380:2: iv_ruleThrowStatement= ruleThrowStatement EOF
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
    // InternalMyGrammar.g:4386:1: ruleThrowStatement returns [EObject current=null] : (otherlv_0= 'throw' () otherlv_2= ';' ) ;
    public final EObject ruleThrowStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:4392:2: ( (otherlv_0= 'throw' () otherlv_2= ';' ) )
            // InternalMyGrammar.g:4393:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            {
            // InternalMyGrammar.g:4393:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            // InternalMyGrammar.g:4394:3: otherlv_0= 'throw' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getThrowStatementAccess().getThrowKeyword_0());
              		
            }
            // InternalMyGrammar.g:4398:3: ()
            // InternalMyGrammar.g:4399:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getThrowStatementAccess().getThrowStatementAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:4413:1: entryRulePlaceHolderStatement returns [EObject current=null] : iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF ;
    public final EObject entryRulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceHolderStatement = null;


        try {
            // InternalMyGrammar.g:4413:61: (iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF )
            // InternalMyGrammar.g:4414:2: iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF
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
    // InternalMyGrammar.g:4420:1: rulePlaceHolderStatement returns [EObject current=null] : (otherlv_0= '_' () ) ;
    public final EObject rulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:4426:2: ( (otherlv_0= '_' () ) )
            // InternalMyGrammar.g:4427:2: (otherlv_0= '_' () )
            {
            // InternalMyGrammar.g:4427:2: (otherlv_0= '_' () )
            // InternalMyGrammar.g:4428:3: otherlv_0= '_' ()
            {
            otherlv_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlaceHolderStatementAccess().get_Keyword_0());
              		
            }
            // InternalMyGrammar.g:4432:3: ()
            // InternalMyGrammar.g:4433:4: 
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
    // InternalMyGrammar.g:4443:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyGrammar.g:4443:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyGrammar.g:4444:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyGrammar.g:4450:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4456:2: (this_Assignment_0= ruleAssignment )
            // InternalMyGrammar.g:4457:2: this_Assignment_0= ruleAssignment
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
    // InternalMyGrammar.g:4468:1: entryRuleSpecialExpression returns [EObject current=null] : iv_ruleSpecialExpression= ruleSpecialExpression EOF ;
    public final EObject entryRuleSpecialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialExpression = null;


        try {
            // InternalMyGrammar.g:4468:58: (iv_ruleSpecialExpression= ruleSpecialExpression EOF )
            // InternalMyGrammar.g:4469:2: iv_ruleSpecialExpression= ruleSpecialExpression EOF
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
    // InternalMyGrammar.g:4475:1: ruleSpecialExpression returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) ;
    public final EObject ruleSpecialExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_fieldOrMethod_1_0 = null;

        EObject lv_qualifiers_2_1 = null;

        EObject lv_qualifiers_2_2 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4481:2: ( ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) )
            // InternalMyGrammar.g:4482:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            {
            // InternalMyGrammar.g:4482:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            // InternalMyGrammar.g:4483:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            {
            // InternalMyGrammar.g:4483:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) )
            // InternalMyGrammar.g:4484:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            {
            // InternalMyGrammar.g:4484:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            // InternalMyGrammar.g:4485:5: lv_type_0_0= ruleSpecialExpressionTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialExpressionAccess().getTypeSpecialExpressionTypeEnumEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
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
              						"org.unicam.tryGrammar.MyGrammar.SpecialExpressionTypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyGrammar.g:4502:3: ( (lv_fieldOrMethod_1_0= ruleField ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==43) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyGrammar.g:4503:4: (lv_fieldOrMethod_1_0= ruleField )
                    {
                    // InternalMyGrammar.g:4503:4: (lv_fieldOrMethod_1_0= ruleField )
                    // InternalMyGrammar.g:4504:5: lv_fieldOrMethod_1_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecialExpressionAccess().getFieldOrMethodFieldParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_44);
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
                      						"org.unicam.tryGrammar.MyGrammar.Field");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyGrammar.g:4521:3: ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==27||LA73_0==40) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalMyGrammar.g:4522:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    {
            	    // InternalMyGrammar.g:4522:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    // InternalMyGrammar.g:4523:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    {
            	    // InternalMyGrammar.g:4523:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==40) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==27) ) {
            	        alt72=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 72, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalMyGrammar.g:4524:6: lv_qualifiers_2_1= ruleIndex
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getSpecialExpressionAccess().getQualifiersIndexParserRuleCall_2_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_44);
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
            	              							"org.unicam.tryGrammar.MyGrammar.Index");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyGrammar.g:4540:6: lv_qualifiers_2_2= ruleArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getSpecialExpressionAccess().getQualifiersArgumentsParserRuleCall_2_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_44);
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
            	              							"org.unicam.tryGrammar.MyGrammar.Arguments");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
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
    // InternalMyGrammar.g:4562:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMyGrammar.g:4562:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMyGrammar.g:4563:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalMyGrammar.g:4569:1: ruleAssignment returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) ;
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
            // InternalMyGrammar.g:4575:2: ( (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) )
            // InternalMyGrammar.g:4576:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            {
            // InternalMyGrammar.g:4576:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            // InternalMyGrammar.g:4577:3: this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getBinaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_BinaryExpression_0=ruleBinaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BinaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:4585:3: ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==36||(LA75_0>=182 && LA75_0<=192)) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                alt75=2;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyGrammar.g:4586:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // InternalMyGrammar.g:4586:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    // InternalMyGrammar.g:4587:5: () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // InternalMyGrammar.g:4587:5: ()
                    // InternalMyGrammar.g:4588:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalMyGrammar.g:4594:5: ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) )
                    // InternalMyGrammar.g:4595:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    {
                    // InternalMyGrammar.g:4595:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    // InternalMyGrammar.g:4596:7: lv_assignmentOp_2_0= ruleAssignmentOpEnum
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
                      								"org.unicam.tryGrammar.MyGrammar.AssignmentOpEnum");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyGrammar.g:4613:5: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalMyGrammar.g:4614:6: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalMyGrammar.g:4614:6: (lv_expression_3_0= ruleExpression )
                    // InternalMyGrammar.g:4615:7: lv_expression_3_0= ruleExpression
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
                      								"org.unicam.tryGrammar.MyGrammar.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:4634:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    {
                    // InternalMyGrammar.g:4634:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    // InternalMyGrammar.g:4635:5: () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    {
                    // InternalMyGrammar.g:4635:5: ()
                    // InternalMyGrammar.g:4636:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getVariableDeclarationExpressionTypeAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalMyGrammar.g:4642:5: ( (lv_variable_5_0= ruleVariable ) )
                    // InternalMyGrammar.g:4643:6: (lv_variable_5_0= ruleVariable )
                    {
                    // InternalMyGrammar.g:4643:6: (lv_variable_5_0= ruleVariable )
                    // InternalMyGrammar.g:4644:7: lv_variable_5_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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
                      								"org.unicam.tryGrammar.MyGrammar.Variable");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMyGrammar.g:4661:5: (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==36) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalMyGrammar.g:4662:6: otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) )
                            {
                            otherlv_6=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1_2_0());
                              					
                            }
                            // InternalMyGrammar.g:4666:6: ( (lv_expression_7_0= ruleExpression ) )
                            // InternalMyGrammar.g:4667:7: (lv_expression_7_0= ruleExpression )
                            {
                            // InternalMyGrammar.g:4667:7: (lv_expression_7_0= ruleExpression )
                            // InternalMyGrammar.g:4668:8: lv_expression_7_0= ruleExpression
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
                              									"org.unicam.tryGrammar.MyGrammar.Expression");
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
    // InternalMyGrammar.g:4692:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalMyGrammar.g:4692:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalMyGrammar.g:4693:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalMyGrammar.g:4699:1: ruleBinaryExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4705:2: (this_Or_0= ruleOr )
            // InternalMyGrammar.g:4706:2: this_Or_0= ruleOr
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
    // InternalMyGrammar.g:4717:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalMyGrammar.g:4717:43: (iv_ruleOr= ruleOr EOF )
            // InternalMyGrammar.g:4718:2: iv_ruleOr= ruleOr EOF
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
    // InternalMyGrammar.g:4724:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4730:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalMyGrammar.g:4731:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalMyGrammar.g:4731:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalMyGrammar.g:4732:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:4740:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==56) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalMyGrammar.g:4741:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalMyGrammar.g:4741:4: ()
            	    // InternalMyGrammar.g:4742:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalMyGrammar.g:4752:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalMyGrammar.g:4753:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalMyGrammar.g:4753:5: (lv_right_3_0= ruleAnd )
            	    // InternalMyGrammar.g:4754:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
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
            	      							"org.unicam.tryGrammar.MyGrammar.And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMyGrammar.g:4776:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalMyGrammar.g:4776:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalMyGrammar.g:4777:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalMyGrammar.g:4783:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4789:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalMyGrammar.g:4790:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalMyGrammar.g:4790:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalMyGrammar.g:4791:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:4799:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==57) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalMyGrammar.g:4800:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalMyGrammar.g:4800:4: ()
            	    // InternalMyGrammar.g:4801:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,57,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalMyGrammar.g:4811:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalMyGrammar.g:4812:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalMyGrammar.g:4812:5: (lv_right_3_0= ruleEquality )
            	    // InternalMyGrammar.g:4813:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
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
            	      							"org.unicam.tryGrammar.MyGrammar.Equality");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMyGrammar.g:4835:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalMyGrammar.g:4835:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalMyGrammar.g:4836:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalMyGrammar.g:4842:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_equalityOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4848:2: ( (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalMyGrammar.g:4849:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalMyGrammar.g:4849:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalMyGrammar.g:4850:3: this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:4858:3: ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=193 && LA78_0<=194)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalMyGrammar.g:4859:4: () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalMyGrammar.g:4859:4: ()
            	    // InternalMyGrammar.g:4860:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMyGrammar.g:4866:4: ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) )
            	    // InternalMyGrammar.g:4867:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    {
            	    // InternalMyGrammar.g:4867:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    // InternalMyGrammar.g:4868:6: lv_equalityOp_2_0= ruleEqualityOpEnum
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
            	      							"org.unicam.tryGrammar.MyGrammar.EqualityOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalMyGrammar.g:4885:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalMyGrammar.g:4886:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalMyGrammar.g:4886:5: (lv_right_3_0= ruleComparison )
            	    // InternalMyGrammar.g:4887:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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
            	      							"org.unicam.tryGrammar.MyGrammar.Comparison");
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMyGrammar.g:4909:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMyGrammar.g:4909:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMyGrammar.g:4910:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalMyGrammar.g:4916:1: ruleComparison returns [EObject current=null] : (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BitOr_0 = null;

        Enumerator lv_comparisonOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4922:2: ( (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) )
            // InternalMyGrammar.g:4923:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            {
            // InternalMyGrammar.g:4923:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            // InternalMyGrammar.g:4924:3: this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getBitOrParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_BitOr_0=ruleBitOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitOr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:4932:3: ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=195 && LA79_0<=199)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalMyGrammar.g:4933:4: () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) )
            	    {
            	    // InternalMyGrammar.g:4933:4: ()
            	    // InternalMyGrammar.g:4934:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMyGrammar.g:4940:4: ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) )
            	    // InternalMyGrammar.g:4941:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    {
            	    // InternalMyGrammar.g:4941:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    // InternalMyGrammar.g:4942:6: lv_comparisonOp_2_0= ruleComparisonOpEnum
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
            	      							"org.unicam.tryGrammar.MyGrammar.ComparisonOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalMyGrammar.g:4959:4: ( (lv_right_3_0= ruleBitOr ) )
            	    // InternalMyGrammar.g:4960:5: (lv_right_3_0= ruleBitOr )
            	    {
            	    // InternalMyGrammar.g:4960:5: (lv_right_3_0= ruleBitOr )
            	    // InternalMyGrammar.g:4961:6: lv_right_3_0= ruleBitOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightBitOrParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
            	      							"org.unicam.tryGrammar.MyGrammar.BitOr");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBitOr"
    // InternalMyGrammar.g:4983:1: entryRuleBitOr returns [EObject current=null] : iv_ruleBitOr= ruleBitOr EOF ;
    public final EObject entryRuleBitOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitOr = null;


        try {
            // InternalMyGrammar.g:4983:46: (iv_ruleBitOr= ruleBitOr EOF )
            // InternalMyGrammar.g:4984:2: iv_ruleBitOr= ruleBitOr EOF
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
    // InternalMyGrammar.g:4990:1: ruleBitOr returns [EObject current=null] : (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) ;
    public final EObject ruleBitOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitXor_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:4996:2: ( (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) )
            // InternalMyGrammar.g:4997:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            {
            // InternalMyGrammar.g:4997:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            // InternalMyGrammar.g:4998:3: this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitOrAccess().getBitXorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_BitXor_0=ruleBitXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitXor_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:5006:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==58) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalMyGrammar.g:5007:4: () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) )
            	    {
            	    // InternalMyGrammar.g:5007:4: ()
            	    // InternalMyGrammar.g:5008:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitOrAccess().getBitOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,58,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitOrAccess().getVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalMyGrammar.g:5018:4: ( (lv_right_3_0= ruleBitXor ) )
            	    // InternalMyGrammar.g:5019:5: (lv_right_3_0= ruleBitXor )
            	    {
            	    // InternalMyGrammar.g:5019:5: (lv_right_3_0= ruleBitXor )
            	    // InternalMyGrammar.g:5020:6: lv_right_3_0= ruleBitXor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitOrAccess().getRightBitXorParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
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
            	      							"org.unicam.tryGrammar.MyGrammar.BitXor");
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
    // $ANTLR end "ruleBitOr"


    // $ANTLR start "entryRuleBitXor"
    // InternalMyGrammar.g:5042:1: entryRuleBitXor returns [EObject current=null] : iv_ruleBitXor= ruleBitXor EOF ;
    public final EObject entryRuleBitXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitXor = null;


        try {
            // InternalMyGrammar.g:5042:47: (iv_ruleBitXor= ruleBitXor EOF )
            // InternalMyGrammar.g:5043:2: iv_ruleBitXor= ruleBitXor EOF
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
    // InternalMyGrammar.g:5049:1: ruleBitXor returns [EObject current=null] : (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) ;
    public final EObject ruleBitXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitAnd_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5055:2: ( (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) )
            // InternalMyGrammar.g:5056:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            {
            // InternalMyGrammar.g:5056:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            // InternalMyGrammar.g:5057:3: this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitXorAccess().getBitAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_BitAnd_0=ruleBitAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitAnd_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:5065:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==59) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalMyGrammar.g:5066:4: () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) )
            	    {
            	    // InternalMyGrammar.g:5066:4: ()
            	    // InternalMyGrammar.g:5067:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitXorAccess().getBitXorLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,59,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitXorAccess().getCircumflexAccentKeyword_1_1());
            	      			
            	    }
            	    // InternalMyGrammar.g:5077:4: ( (lv_right_3_0= ruleBitAnd ) )
            	    // InternalMyGrammar.g:5078:5: (lv_right_3_0= ruleBitAnd )
            	    {
            	    // InternalMyGrammar.g:5078:5: (lv_right_3_0= ruleBitAnd )
            	    // InternalMyGrammar.g:5079:6: lv_right_3_0= ruleBitAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitXorAccess().getRightBitAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
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
            	      							"org.unicam.tryGrammar.MyGrammar.BitAnd");
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
    // $ANTLR end "ruleBitXor"


    // $ANTLR start "entryRuleBitAnd"
    // InternalMyGrammar.g:5101:1: entryRuleBitAnd returns [EObject current=null] : iv_ruleBitAnd= ruleBitAnd EOF ;
    public final EObject entryRuleBitAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitAnd = null;


        try {
            // InternalMyGrammar.g:5101:47: (iv_ruleBitAnd= ruleBitAnd EOF )
            // InternalMyGrammar.g:5102:2: iv_ruleBitAnd= ruleBitAnd EOF
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
    // InternalMyGrammar.g:5108:1: ruleBitAnd returns [EObject current=null] : (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) ;
    public final EObject ruleBitAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Shift_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5114:2: ( (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) )
            // InternalMyGrammar.g:5115:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            {
            // InternalMyGrammar.g:5115:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            // InternalMyGrammar.g:5116:3: this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitAndAccess().getShiftParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_63);
            this_Shift_0=ruleShift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Shift_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:5124:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==60) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalMyGrammar.g:5125:4: () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) )
            	    {
            	    // InternalMyGrammar.g:5125:4: ()
            	    // InternalMyGrammar.g:5126:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitAndAccess().getBitAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitAndAccess().getAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalMyGrammar.g:5136:4: ( (lv_right_3_0= ruleShift ) )
            	    // InternalMyGrammar.g:5137:5: (lv_right_3_0= ruleShift )
            	    {
            	    // InternalMyGrammar.g:5137:5: (lv_right_3_0= ruleShift )
            	    // InternalMyGrammar.g:5138:6: lv_right_3_0= ruleShift
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitAndAccess().getRightShiftParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
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
            	      							"org.unicam.tryGrammar.MyGrammar.Shift");
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
    // $ANTLR end "ruleBitAnd"


    // $ANTLR start "entryRuleShift"
    // InternalMyGrammar.g:5160:1: entryRuleShift returns [EObject current=null] : iv_ruleShift= ruleShift EOF ;
    public final EObject entryRuleShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShift = null;


        try {
            // InternalMyGrammar.g:5160:46: (iv_ruleShift= ruleShift EOF )
            // InternalMyGrammar.g:5161:2: iv_ruleShift= ruleShift EOF
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
    // InternalMyGrammar.g:5167:1: ruleShift returns [EObject current=null] : (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) ;
    public final EObject ruleShift() throws RecognitionException {
        EObject current = null;

        EObject this_AddSub_0 = null;

        Enumerator lv_shiftOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5173:2: ( (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) )
            // InternalMyGrammar.g:5174:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            {
            // InternalMyGrammar.g:5174:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            // InternalMyGrammar.g:5175:3: this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftAccess().getAddSubParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_64);
            this_AddSub_0=ruleAddSub();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddSub_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:5183:3: ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( ((LA83_0>=200 && LA83_0<=202)) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalMyGrammar.g:5184:4: () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) )
            	    {
            	    // InternalMyGrammar.g:5184:4: ()
            	    // InternalMyGrammar.g:5185:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getShiftAccess().getShiftLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMyGrammar.g:5191:4: ( (lv_shiftOp_2_0= ruleShiftOpEnum ) )
            	    // InternalMyGrammar.g:5192:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    {
            	    // InternalMyGrammar.g:5192:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    // InternalMyGrammar.g:5193:6: lv_shiftOp_2_0= ruleShiftOpEnum
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
            	      							"org.unicam.tryGrammar.MyGrammar.ShiftOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalMyGrammar.g:5210:4: ( (lv_right_3_0= ruleAddSub ) )
            	    // InternalMyGrammar.g:5211:5: (lv_right_3_0= ruleAddSub )
            	    {
            	    // InternalMyGrammar.g:5211:5: (lv_right_3_0= ruleAddSub )
            	    // InternalMyGrammar.g:5212:6: lv_right_3_0= ruleAddSub
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftAccess().getRightAddSubParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_64);
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
            	      							"org.unicam.tryGrammar.MyGrammar.AddSub");
            	      						afterParserOrEnumRuleCall();
            	      					
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
    // $ANTLR end "ruleShift"


    // $ANTLR start "entryRuleAddSub"
    // InternalMyGrammar.g:5234:1: entryRuleAddSub returns [EObject current=null] : iv_ruleAddSub= ruleAddSub EOF ;
    public final EObject entryRuleAddSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSub = null;


        try {
            // InternalMyGrammar.g:5234:47: (iv_ruleAddSub= ruleAddSub EOF )
            // InternalMyGrammar.g:5235:2: iv_ruleAddSub= ruleAddSub EOF
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
    // InternalMyGrammar.g:5241:1: ruleAddSub returns [EObject current=null] : (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) ;
    public final EObject ruleAddSub() throws RecognitionException {
        EObject current = null;

        EObject this_MulDivMod_0 = null;

        Enumerator lv_additionOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5247:2: ( (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) )
            // InternalMyGrammar.g:5248:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            {
            // InternalMyGrammar.g:5248:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            // InternalMyGrammar.g:5249:3: this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddSubAccess().getMulDivModParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_65);
            this_MulDivMod_0=ruleMulDivMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulDivMod_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:5257:3: ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==64) && (synpred3_InternalMyGrammar())) {
                    alt84=1;
                }
                else if ( (LA84_0==65) && (synpred3_InternalMyGrammar())) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalMyGrammar.g:5258:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    {
            	    // InternalMyGrammar.g:5273:4: ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    // InternalMyGrammar.g:5274:5: () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) )
            	    {
            	    // InternalMyGrammar.g:5274:5: ()
            	    // InternalMyGrammar.g:5275:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAddSubAccess().getAddSubLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalMyGrammar.g:5281:5: ( (lv_additionOp_2_0= ruleAdditionOpEnum ) )
            	    // InternalMyGrammar.g:5282:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    {
            	    // InternalMyGrammar.g:5282:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    // InternalMyGrammar.g:5283:7: lv_additionOp_2_0= ruleAdditionOpEnum
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
            	      								"org.unicam.tryGrammar.MyGrammar.AdditionOpEnum");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalMyGrammar.g:5300:5: ( (lv_right_3_0= ruleMulDivMod ) )
            	    // InternalMyGrammar.g:5301:6: (lv_right_3_0= ruleMulDivMod )
            	    {
            	    // InternalMyGrammar.g:5301:6: (lv_right_3_0= ruleMulDivMod )
            	    // InternalMyGrammar.g:5302:7: lv_right_3_0= ruleMulDivMod
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddSubAccess().getRightMulDivModParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_65);
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
            	      								"org.unicam.tryGrammar.MyGrammar.MulDivMod");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

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
    // $ANTLR end "ruleAddSub"


    // $ANTLR start "entryRuleMulDivMod"
    // InternalMyGrammar.g:5325:1: entryRuleMulDivMod returns [EObject current=null] : iv_ruleMulDivMod= ruleMulDivMod EOF ;
    public final EObject entryRuleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDivMod = null;


        try {
            // InternalMyGrammar.g:5325:50: (iv_ruleMulDivMod= ruleMulDivMod EOF )
            // InternalMyGrammar.g:5326:2: iv_ruleMulDivMod= ruleMulDivMod EOF
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
    // InternalMyGrammar.g:5332:1: ruleMulDivMod returns [EObject current=null] : (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) ;
    public final EObject ruleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject this_Exponent_0 = null;

        Enumerator lv_multipliciativeOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5338:2: ( (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) )
            // InternalMyGrammar.g:5339:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            {
            // InternalMyGrammar.g:5339:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            // InternalMyGrammar.g:5340:3: this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulDivModAccess().getExponentParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_66);
            this_Exponent_0=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Exponent_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:5348:3: ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==18||(LA85_0>=203 && LA85_0<=204)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalMyGrammar.g:5349:4: () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) )
            	    {
            	    // InternalMyGrammar.g:5349:4: ()
            	    // InternalMyGrammar.g:5350:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulDivModAccess().getMulDivModLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMyGrammar.g:5356:4: ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) )
            	    // InternalMyGrammar.g:5357:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    {
            	    // InternalMyGrammar.g:5357:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    // InternalMyGrammar.g:5358:6: lv_multipliciativeOp_2_0= ruleMulDivModOpEnum
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
            	      							"org.unicam.tryGrammar.MyGrammar.MulDivModOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalMyGrammar.g:5375:4: ( (lv_right_3_0= ruleExponent ) )
            	    // InternalMyGrammar.g:5376:5: (lv_right_3_0= ruleExponent )
            	    {
            	    // InternalMyGrammar.g:5376:5: (lv_right_3_0= ruleExponent )
            	    // InternalMyGrammar.g:5377:6: lv_right_3_0= ruleExponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulDivModAccess().getRightExponentParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_66);
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
            	      							"org.unicam.tryGrammar.MyGrammar.Exponent");
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
    // $ANTLR end "ruleMulDivMod"


    // $ANTLR start "entryRuleExponent"
    // InternalMyGrammar.g:5399:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalMyGrammar.g:5399:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalMyGrammar.g:5400:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalMyGrammar.g:5406:1: ruleExponent returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5412:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalMyGrammar.g:5413:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalMyGrammar.g:5413:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalMyGrammar.g:5414:3: this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExponentAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_67);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:5422:3: ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==61) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalMyGrammar.g:5423:4: () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalMyGrammar.g:5423:4: ()
            	    // InternalMyGrammar.g:5424:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExponentAccess().getExponentLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
            	      			
            	    }
            	    // InternalMyGrammar.g:5434:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalMyGrammar.g:5435:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalMyGrammar.g:5435:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalMyGrammar.g:5436:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExponentAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_67);
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
            	      							"org.unicam.tryGrammar.MyGrammar.UnaryExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
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
    // InternalMyGrammar.g:5458:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalMyGrammar.g:5458:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalMyGrammar.g:5459:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalMyGrammar.g:5465:1: ruleUnaryExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_BinaryNotExpression_1 = null;

        EObject this_SignExpression_2 = null;

        EObject this_NewExpression_3 = null;

        EObject this_PreExpression_4 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5471:2: ( (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) )
            // InternalMyGrammar.g:5472:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            {
            // InternalMyGrammar.g:5472:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            int alt87=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt87=1;
                }
                break;
            case 63:
                {
                alt87=2;
                }
                break;
            case 64:
            case 65:
                {
                alt87=3;
                }
                break;
            case 66:
                {
                alt87=4;
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
            case 27:
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
            case 174:
            case 205:
            case 206:
            case 217:
            case 218:
                {
                alt87=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalMyGrammar.g:5473:3: this_NotExpression_0= ruleNotExpression
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
                    // InternalMyGrammar.g:5482:3: this_BinaryNotExpression_1= ruleBinaryNotExpression
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
                    // InternalMyGrammar.g:5491:3: this_SignExpression_2= ruleSignExpression
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
                    // InternalMyGrammar.g:5500:3: this_NewExpression_3= ruleNewExpression
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
                    // InternalMyGrammar.g:5509:3: this_PreExpression_4= rulePreExpression
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
    // InternalMyGrammar.g:5521:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalMyGrammar.g:5521:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalMyGrammar.g:5522:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalMyGrammar.g:5528:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5534:2: ( (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalMyGrammar.g:5535:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalMyGrammar.g:5535:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalMyGrammar.g:5536:3: otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalMyGrammar.g:5540:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalMyGrammar.g:5541:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalMyGrammar.g:5541:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalMyGrammar.g:5542:5: lv_expression_1_0= ruleUnaryExpression
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
              						"org.unicam.tryGrammar.MyGrammar.UnaryExpression");
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
    // InternalMyGrammar.g:5563:1: entryRuleBinaryNotExpression returns [EObject current=null] : iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF ;
    public final EObject entryRuleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryNotExpression = null;


        try {
            // InternalMyGrammar.g:5563:60: (iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF )
            // InternalMyGrammar.g:5564:2: iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF
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
    // InternalMyGrammar.g:5570:1: ruleBinaryNotExpression returns [EObject current=null] : (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5576:2: ( (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalMyGrammar.g:5577:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalMyGrammar.g:5577:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalMyGrammar.g:5578:3: otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBinaryNotExpressionAccess().getTildeKeyword_0());
              		
            }
            // InternalMyGrammar.g:5582:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalMyGrammar.g:5583:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalMyGrammar.g:5583:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalMyGrammar.g:5584:5: lv_expression_1_0= ruleUnaryExpression
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
              						"org.unicam.tryGrammar.MyGrammar.UnaryExpression");
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
    // InternalMyGrammar.g:5605:1: entryRuleSignExpression returns [EObject current=null] : iv_ruleSignExpression= ruleSignExpression EOF ;
    public final EObject entryRuleSignExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignExpression = null;


        try {
            // InternalMyGrammar.g:5605:55: (iv_ruleSignExpression= ruleSignExpression EOF )
            // InternalMyGrammar.g:5606:2: iv_ruleSignExpression= ruleSignExpression EOF
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
    // InternalMyGrammar.g:5612:1: ruleSignExpression returns [EObject current=null] : ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleSignExpression() throws RecognitionException {
        EObject current = null;

        Token lv_signOp_0_1=null;
        Token lv_signOp_0_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5618:2: ( ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalMyGrammar.g:5619:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalMyGrammar.g:5619:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalMyGrammar.g:5620:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            // InternalMyGrammar.g:5620:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) )
            // InternalMyGrammar.g:5621:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            {
            // InternalMyGrammar.g:5621:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            // InternalMyGrammar.g:5622:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            {
            // InternalMyGrammar.g:5622:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==64) ) {
                alt88=1;
            }
            else if ( (LA88_0==65) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalMyGrammar.g:5623:6: lv_signOp_0_1= '+'
                    {
                    lv_signOp_0_1=(Token)match(input,64,FOLLOW_19); if (state.failed) return current;
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
                    // InternalMyGrammar.g:5634:6: lv_signOp_0_2= '-'
                    {
                    lv_signOp_0_2=(Token)match(input,65,FOLLOW_19); if (state.failed) return current;
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

            // InternalMyGrammar.g:5647:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalMyGrammar.g:5648:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalMyGrammar.g:5648:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalMyGrammar.g:5649:5: lv_expression_1_0= ruleUnaryExpression
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
              						"org.unicam.tryGrammar.MyGrammar.UnaryExpression");
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
    // InternalMyGrammar.g:5670:1: entryRuleNewExpression returns [EObject current=null] : iv_ruleNewExpression= ruleNewExpression EOF ;
    public final EObject entryRuleNewExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewExpression = null;


        try {
            // InternalMyGrammar.g:5670:54: (iv_ruleNewExpression= ruleNewExpression EOF )
            // InternalMyGrammar.g:5671:2: iv_ruleNewExpression= ruleNewExpression EOF
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
    // InternalMyGrammar.g:5677:1: ruleNewExpression returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) ;
    public final EObject ruleNewExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5683:2: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) )
            // InternalMyGrammar.g:5684:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            {
            // InternalMyGrammar.g:5684:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            // InternalMyGrammar.g:5685:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNewExpressionAccess().getNewKeyword_0());
              		
            }
            // InternalMyGrammar.g:5689:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyGrammar.g:5690:4: (otherlv_1= RULE_ID )
            {
            // InternalMyGrammar.g:5690:4: (otherlv_1= RULE_ID )
            // InternalMyGrammar.g:5691:5: otherlv_1= RULE_ID
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

            // InternalMyGrammar.g:5702:3: ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            // InternalMyGrammar.g:5703:4: (lv_args_2_0= ruleFunctionCallListArguments )
            {
            // InternalMyGrammar.g:5703:4: (lv_args_2_0= ruleFunctionCallListArguments )
            // InternalMyGrammar.g:5704:5: lv_args_2_0= ruleFunctionCallListArguments
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
              						"org.unicam.tryGrammar.MyGrammar.FunctionCallListArguments");
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
    // InternalMyGrammar.g:5725:1: entryRulePreExpression returns [EObject current=null] : iv_rulePreExpression= rulePreExpression EOF ;
    public final EObject entryRulePreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreExpression = null;


        try {
            // InternalMyGrammar.g:5725:54: (iv_rulePreExpression= rulePreExpression EOF )
            // InternalMyGrammar.g:5726:2: iv_rulePreExpression= rulePreExpression EOF
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
    // InternalMyGrammar.g:5732:1: rulePreExpression returns [EObject current=null] : (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) ;
    public final EObject rulePreExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_PostIncDecExpression_0 = null;

        EObject this_PostIncDecExpression_2 = null;

        EObject this_PostIncDecExpression_5 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5738:2: ( (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) )
            // InternalMyGrammar.g:5739:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            {
            // InternalMyGrammar.g:5739:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            int alt89=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 27:
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
            case 174:
            case 205:
            case 206:
            case 217:
            case 218:
                {
                alt89=1;
                }
                break;
            case 67:
                {
                alt89=2;
                }
                break;
            case 68:
                {
                alt89=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalMyGrammar.g:5740:3: this_PostIncDecExpression_0= rulePostIncDecExpression
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
                    // InternalMyGrammar.g:5749:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    {
                    // InternalMyGrammar.g:5749:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    // InternalMyGrammar.g:5750:4: otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression ()
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_68); if (state.failed) return current;
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
                    // InternalMyGrammar.g:5762:4: ()
                    // InternalMyGrammar.g:5763:5: 
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
                    // InternalMyGrammar.g:5771:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    {
                    // InternalMyGrammar.g:5771:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    // InternalMyGrammar.g:5772:4: otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression ()
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_68); if (state.failed) return current;
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
                    // InternalMyGrammar.g:5784:4: ()
                    // InternalMyGrammar.g:5785:5: 
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
    // InternalMyGrammar.g:5796:1: entryRulePostIncDecExpression returns [EObject current=null] : iv_rulePostIncDecExpression= rulePostIncDecExpression EOF ;
    public final EObject entryRulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostIncDecExpression = null;


        try {
            // InternalMyGrammar.g:5796:61: (iv_rulePostIncDecExpression= rulePostIncDecExpression EOF )
            // InternalMyGrammar.g:5797:2: iv_rulePostIncDecExpression= rulePostIncDecExpression EOF
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
    // InternalMyGrammar.g:5803:1: rulePostIncDecExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) ;
    public final EObject rulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_postOp_2_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:5809:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) )
            // InternalMyGrammar.g:5810:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            {
            // InternalMyGrammar.g:5810:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            // InternalMyGrammar.g:5811:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPostIncDecExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_69);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyGrammar.g:5819:3: ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( ((LA90_0>=67 && LA90_0<=68)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalMyGrammar.g:5820:4: () ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    {
            	    // InternalMyGrammar.g:5820:4: ()
            	    // InternalMyGrammar.g:5821:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPostIncDecExpressionAccess().getPostIncDecExpressionExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMyGrammar.g:5827:4: ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    // InternalMyGrammar.g:5828:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    {
            	    // InternalMyGrammar.g:5828:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    // InternalMyGrammar.g:5829:6: lv_postOp_2_0= ruleIncDecOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPostIncDecExpressionAccess().getPostOpIncDecOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_69);
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
            	      							"org.unicam.tryGrammar.MyGrammar.IncDecOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
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
    // InternalMyGrammar.g:5851:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalMyGrammar.g:5851:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalMyGrammar.g:5852:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalMyGrammar.g:5858:1: rulePrimaryExpression returns [EObject current=null] : (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) ;
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
            // InternalMyGrammar.g:5864:2: ( (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) )
            // InternalMyGrammar.g:5865:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            {
            // InternalMyGrammar.g:5865:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            int alt97=7;
            switch ( input.LA(1) ) {
            case 217:
            case 218:
                {
                alt97=1;
                }
                break;
            case RULE_ID:
                {
                alt97=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 69:
            case 70:
            case 205:
            case 206:
                {
                alt97=3;
                }
                break;
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
            case 174:
                {
                alt97=4;
                }
                break;
            case 27:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt97=6;
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
                case 27:
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
                case 169:
                case 170:
                case 171:
                case 172:
                case 173:
                case 174:
                case 205:
                case 206:
                case 217:
                case 218:
                    {
                    alt97=5;
                    }
                    break;
                case 28:
                    {
                    alt97=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 5, input);

                    throw nvae;
                }

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
                    // InternalMyGrammar.g:5866:3: this_SpecialExpression_0= ruleSpecialExpression
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
                    // InternalMyGrammar.g:5875:3: this_QualifiedIdentifier_1= ruleQualifiedIdentifier
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
                    // InternalMyGrammar.g:5884:3: this_Literal_2= ruleLiteral
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
                    // InternalMyGrammar.g:5893:3: this_TypeCast_3= ruleTypeCast
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
                    // InternalMyGrammar.g:5902:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    {
                    // InternalMyGrammar.g:5902:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    // InternalMyGrammar.g:5903:4: otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_39);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyGrammar.g:5915:4: ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==22) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalMyGrammar.g:5916:5: () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            {
                            // InternalMyGrammar.g:5916:5: ()
                            // InternalMyGrammar.g:5917:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndAdd(
                              							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_4_2_0(),
                              							current);
                              					
                            }

                            }

                            // InternalMyGrammar.g:5923:5: ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            int cnt92=0;
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==22) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // InternalMyGrammar.g:5924:6: ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )?
                            	    {
                            	    // InternalMyGrammar.g:5924:6: ( (lv_members_7_0= ruleTupleSeparator ) )
                            	    // InternalMyGrammar.g:5925:7: (lv_members_7_0= ruleTupleSeparator )
                            	    {
                            	    // InternalMyGrammar.g:5925:7: (lv_members_7_0= ruleTupleSeparator )
                            	    // InternalMyGrammar.g:5926:8: lv_members_7_0= ruleTupleSeparator
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersTupleSeparatorParserRuleCall_4_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_39);
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
                            	      									"org.unicam.tryGrammar.MyGrammar.TupleSeparator");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    // InternalMyGrammar.g:5943:6: ( (lv_members_8_0= ruleExpression ) )?
                            	    int alt91=2;
                            	    int LA91_0 = input.LA(1);

                            	    if ( ((LA91_0>=RULE_STRING && LA91_0<=RULE_TX)||LA91_0==27||(LA91_0>=62 && LA91_0<=174)||(LA91_0>=205 && LA91_0<=206)||(LA91_0>=217 && LA91_0<=218)) ) {
                            	        alt91=1;
                            	    }
                            	    switch (alt91) {
                            	        case 1 :
                            	            // InternalMyGrammar.g:5944:7: (lv_members_8_0= ruleExpression )
                            	            {
                            	            // InternalMyGrammar.g:5944:7: (lv_members_8_0= ruleExpression )
                            	            // InternalMyGrammar.g:5945:8: lv_members_8_0= ruleExpression
                            	            {
                            	            if ( state.backtracking==0 ) {

                            	              								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_4_2_1_1_0());
                            	              							
                            	            }
                            	            pushFollow(FOLLOW_39);
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
                            	              									"org.unicam.tryGrammar.MyGrammar.Expression");
                            	              								afterParserOrEnumRuleCall();
                            	              							
                            	            }

                            	            }


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt92 >= 1 ) break loop92;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(92, input);
                                        throw eee;
                                }
                                cnt92++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyGrammar.g:5970:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    {
                    // InternalMyGrammar.g:5970:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    // InternalMyGrammar.g:5971:4: otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTupleSeparatorParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_39);
                    this_TupleSeparator_11=ruleTupleSeparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TupleSeparator_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyGrammar.g:5983:4: ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* )
                    // InternalMyGrammar.g:5984:5: () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    {
                    // InternalMyGrammar.g:5984:5: ()
                    // InternalMyGrammar.g:5985:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_5_2_0(),
                      							current);
                      					
                    }

                    }

                    // InternalMyGrammar.g:5991:5: ( (lv_members_13_0= ruleExpression ) )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( ((LA94_0>=RULE_STRING && LA94_0<=RULE_TX)||LA94_0==27||(LA94_0>=62 && LA94_0<=174)||(LA94_0>=205 && LA94_0<=206)||(LA94_0>=217 && LA94_0<=218)) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // InternalMyGrammar.g:5992:6: (lv_members_13_0= ruleExpression )
                            {
                            // InternalMyGrammar.g:5992:6: (lv_members_13_0= ruleExpression )
                            // InternalMyGrammar.g:5993:7: lv_members_13_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_5_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_39);
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
                              								"org.unicam.tryGrammar.MyGrammar.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalMyGrammar.g:6010:5: ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==22) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // InternalMyGrammar.g:6011:6: ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )?
                    	    {
                    	    // InternalMyGrammar.g:6011:6: ( (lv_members_14_0= ruleTupleSeparator ) )
                    	    // InternalMyGrammar.g:6012:7: (lv_members_14_0= ruleTupleSeparator )
                    	    {
                    	    // InternalMyGrammar.g:6012:7: (lv_members_14_0= ruleTupleSeparator )
                    	    // InternalMyGrammar.g:6013:8: lv_members_14_0= ruleTupleSeparator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersTupleSeparatorParserRuleCall_5_2_2_0_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_39);
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
                    	      									"org.unicam.tryGrammar.MyGrammar.TupleSeparator");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }

                    	    // InternalMyGrammar.g:6030:6: ( (lv_members_15_0= ruleExpression ) )?
                    	    int alt95=2;
                    	    int LA95_0 = input.LA(1);

                    	    if ( ((LA95_0>=RULE_STRING && LA95_0<=RULE_TX)||LA95_0==27||(LA95_0>=62 && LA95_0<=174)||(LA95_0>=205 && LA95_0<=206)||(LA95_0>=217 && LA95_0<=218)) ) {
                    	        alt95=1;
                    	    }
                    	    switch (alt95) {
                    	        case 1 :
                    	            // InternalMyGrammar.g:6031:7: (lv_members_15_0= ruleExpression )
                    	            {
                    	            // InternalMyGrammar.g:6031:7: (lv_members_15_0= ruleExpression )
                    	            // InternalMyGrammar.g:6032:8: lv_members_15_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_5_2_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_39);
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
                    	              									"org.unicam.tryGrammar.MyGrammar.Expression");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);


                    }

                    otherlv_16=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyGrammar.g:6057:3: (otherlv_17= '(' otherlv_18= ')' () )
                    {
                    // InternalMyGrammar.g:6057:3: (otherlv_17= '(' otherlv_18= ')' () )
                    // InternalMyGrammar.g:6058:4: otherlv_17= '(' otherlv_18= ')' ()
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    otherlv_18=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_6_1());
                      			
                    }
                    // InternalMyGrammar.g:6066:4: ()
                    // InternalMyGrammar.g:6067:5: 
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
    // InternalMyGrammar.g:6078:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalMyGrammar.g:6078:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMyGrammar.g:6079:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalMyGrammar.g:6085:1: ruleLiteral returns [EObject current=null] : (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialVariables_0 = null;

        EObject this_BooleanConst_1 = null;

        EObject this_Number_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_GasleftFunction_4 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:6091:2: ( (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction ) )
            // InternalMyGrammar.g:6092:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction )
            {
            // InternalMyGrammar.g:6092:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction )
            int alt98=5;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
                {
                alt98=1;
                }
                break;
            case 205:
            case 206:
                {
                alt98=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case 70:
                {
                alt98=3;
                }
                break;
            case RULE_STRING:
                {
                alt98=4;
                }
                break;
            case 69:
                {
                alt98=5;
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
                    // InternalMyGrammar.g:6093:3: this_SpecialVariables_0= ruleSpecialVariables
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
                    // InternalMyGrammar.g:6102:3: this_BooleanConst_1= ruleBooleanConst
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
                    // InternalMyGrammar.g:6111:3: this_Number_2= ruleNumber
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
                    // InternalMyGrammar.g:6120:3: this_StringLiteral_3= ruleStringLiteral
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
                case 5 :
                    // InternalMyGrammar.g:6129:3: this_GasleftFunction_4= ruleGasleftFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getGasleftFunctionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GasleftFunction_4=ruleGasleftFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GasleftFunction_4;
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


    // $ANTLR start "entryRuleGasleftFunction"
    // InternalMyGrammar.g:6141:1: entryRuleGasleftFunction returns [EObject current=null] : iv_ruleGasleftFunction= ruleGasleftFunction EOF ;
    public final EObject entryRuleGasleftFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGasleftFunction = null;


        try {
            // InternalMyGrammar.g:6141:56: (iv_ruleGasleftFunction= ruleGasleftFunction EOF )
            // InternalMyGrammar.g:6142:2: iv_ruleGasleftFunction= ruleGasleftFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGasleftFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGasleftFunction=ruleGasleftFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGasleftFunction; 
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
    // $ANTLR end "entryRuleGasleftFunction"


    // $ANTLR start "ruleGasleftFunction"
    // InternalMyGrammar.g:6148:1: ruleGasleftFunction returns [EObject current=null] : ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleGasleftFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:6154:2: ( ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalMyGrammar.g:6155:2: ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalMyGrammar.g:6155:2: ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalMyGrammar.g:6156:3: ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalMyGrammar.g:6156:3: ( (lv_name_0_0= 'gasleft' ) )
            // InternalMyGrammar.g:6157:4: (lv_name_0_0= 'gasleft' )
            {
            // InternalMyGrammar.g:6157:4: (lv_name_0_0= 'gasleft' )
            // InternalMyGrammar.g:6158:5: lv_name_0_0= 'gasleft'
            {
            lv_name_0_0=(Token)match(input,69,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getGasleftFunctionAccess().getNameGasleftKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGasleftFunctionRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "gasleft");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGasleftFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGasleftFunctionAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleGasleftFunction"


    // $ANTLR start "entryRuleBooleanConst"
    // InternalMyGrammar.g:6182:1: entryRuleBooleanConst returns [EObject current=null] : iv_ruleBooleanConst= ruleBooleanConst EOF ;
    public final EObject entryRuleBooleanConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConst = null;


        try {
            // InternalMyGrammar.g:6182:53: (iv_ruleBooleanConst= ruleBooleanConst EOF )
            // InternalMyGrammar.g:6183:2: iv_ruleBooleanConst= ruleBooleanConst EOF
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
    // InternalMyGrammar.g:6189:1: ruleBooleanConst returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) ;
    public final EObject ruleBooleanConst() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:6195:2: ( ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) )
            // InternalMyGrammar.g:6196:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            {
            // InternalMyGrammar.g:6196:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            // InternalMyGrammar.g:6197:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            {
            // InternalMyGrammar.g:6197:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            // InternalMyGrammar.g:6198:4: lv_value_0_0= ruleBooleanLiteralEnum
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
              					"org.unicam.tryGrammar.MyGrammar.BooleanLiteralEnum");
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
    // InternalMyGrammar.g:6218:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMyGrammar.g:6218:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMyGrammar.g:6219:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalMyGrammar.g:6225:1: ruleNumber returns [EObject current=null] : (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Time_2= ruleTime | this_Now_3= ruleNow | this_HexLiteral_4= ruleHexLiteral | this_DecimalLiteral_5= ruleDecimalLiteral ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        EObject this_NumberDimensionless_0 = null;

        EObject this_Ether_1 = null;

        EObject this_Time_2 = null;

        EObject this_Now_3 = null;

        EObject this_HexLiteral_4 = null;

        EObject this_DecimalLiteral_5 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:6231:2: ( (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Time_2= ruleTime | this_Now_3= ruleNow | this_HexLiteral_4= ruleHexLiteral | this_DecimalLiteral_5= ruleDecimalLiteral ) )
            // InternalMyGrammar.g:6232:2: (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Time_2= ruleTime | this_Now_3= ruleNow | this_HexLiteral_4= ruleHexLiteral | this_DecimalLiteral_5= ruleDecimalLiteral )
            {
            // InternalMyGrammar.g:6232:2: (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Time_2= ruleTime | this_Now_3= ruleNow | this_HexLiteral_4= ruleHexLiteral | this_DecimalLiteral_5= ruleDecimalLiteral )
            int alt99=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 207:
                case 208:
                case 209:
                case 210:
                    {
                    alt99=2;
                    }
                    break;
                case 211:
                case 212:
                case 213:
                case 214:
                case 215:
                case 216:
                    {
                    alt99=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 17:
                case 18:
                case 22:
                case 23:
                case 28:
                case 36:
                case 41:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 64:
                case 65:
                case 67:
                case 68:
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
                case 204:
                    {
                    alt99=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 1, input);

                    throw nvae;
                }

                }
                break;
            case 70:
                {
                alt99=4;
                }
                break;
            case RULE_HEX:
                {
                alt99=5;
                }
                break;
            case RULE_DECIMAL:
                {
                alt99=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalMyGrammar.g:6233:3: this_NumberDimensionless_0= ruleNumberDimensionless
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
                    // InternalMyGrammar.g:6242:3: this_Ether_1= ruleEther
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
                    // InternalMyGrammar.g:6251:3: this_Time_2= ruleTime
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getTimeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Time_2=ruleTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Time_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyGrammar.g:6260:3: this_Now_3= ruleNow
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getNowParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Now_3=ruleNow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Now_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyGrammar.g:6269:3: this_HexLiteral_4= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getHexLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_HexLiteral_4=ruleHexLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_HexLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyGrammar.g:6278:3: this_DecimalLiteral_5= ruleDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumberAccess().getDecimalLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DecimalLiteral_5=ruleDecimalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalLiteral_5;
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
    // InternalMyGrammar.g:6290:1: entryRuleNumberDimensionless returns [EObject current=null] : iv_ruleNumberDimensionless= ruleNumberDimensionless EOF ;
    public final EObject entryRuleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberDimensionless = null;


        try {
            // InternalMyGrammar.g:6290:60: (iv_ruleNumberDimensionless= ruleNumberDimensionless EOF )
            // InternalMyGrammar.g:6291:2: iv_ruleNumberDimensionless= ruleNumberDimensionless EOF
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
    // InternalMyGrammar.g:6297:1: ruleNumberDimensionless returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:6303:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMyGrammar.g:6304:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMyGrammar.g:6304:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyGrammar.g:6305:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMyGrammar.g:6305:3: (lv_value_0_0= RULE_INT )
            // InternalMyGrammar.g:6306:4: lv_value_0_0= RULE_INT
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
              					"org.unicam.tryGrammar.MyGrammar.INT");
              			
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
    // InternalMyGrammar.g:6325:1: entryRuleEther returns [EObject current=null] : iv_ruleEther= ruleEther EOF ;
    public final EObject entryRuleEther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEther = null;


        try {
            // InternalMyGrammar.g:6325:46: (iv_ruleEther= ruleEther EOF )
            // InternalMyGrammar.g:6326:2: iv_ruleEther= ruleEther EOF
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
    // InternalMyGrammar.g:6332:1: ruleEther returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) ;
    public final EObject ruleEther() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_ether_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:6338:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) )
            // InternalMyGrammar.g:6339:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            {
            // InternalMyGrammar.g:6339:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            // InternalMyGrammar.g:6340:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            {
            // InternalMyGrammar.g:6340:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyGrammar.g:6341:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyGrammar.g:6341:4: (lv_value_0_0= RULE_INT )
            // InternalMyGrammar.g:6342:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_70); if (state.failed) return current;
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
              						"org.unicam.tryGrammar.MyGrammar.INT");
              				
            }

            }


            }

            // InternalMyGrammar.g:6358:3: ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            // InternalMyGrammar.g:6359:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            {
            // InternalMyGrammar.g:6359:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            // InternalMyGrammar.g:6360:5: lv_ether_1_0= ruleEtherSubDenominationEnum
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
              						"org.unicam.tryGrammar.MyGrammar.EtherSubDenominationEnum");
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
    // InternalMyGrammar.g:6381:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalMyGrammar.g:6381:45: (iv_ruleTime= ruleTime EOF )
            // InternalMyGrammar.g:6382:2: iv_ruleTime= ruleTime EOF
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
    // InternalMyGrammar.g:6388:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_time_1_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:6394:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) )
            // InternalMyGrammar.g:6395:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            {
            // InternalMyGrammar.g:6395:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            // InternalMyGrammar.g:6396:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            {
            // InternalMyGrammar.g:6396:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyGrammar.g:6397:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyGrammar.g:6397:4: (lv_value_0_0= RULE_INT )
            // InternalMyGrammar.g:6398:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_71); if (state.failed) return current;
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
              						"org.unicam.tryGrammar.MyGrammar.INT");
              				
            }

            }


            }

            // InternalMyGrammar.g:6414:3: ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            // InternalMyGrammar.g:6415:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            {
            // InternalMyGrammar.g:6415:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            // InternalMyGrammar.g:6416:5: lv_time_1_0= ruleTimeSubdenominationEnum
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
              						"org.unicam.tryGrammar.MyGrammar.TimeSubdenominationEnum");
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
    // InternalMyGrammar.g:6437:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMyGrammar.g:6437:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyGrammar.g:6438:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMyGrammar.g:6444:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:6450:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyGrammar.g:6451:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyGrammar.g:6451:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyGrammar.g:6452:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyGrammar.g:6452:3: (lv_value_0_0= RULE_STRING )
            // InternalMyGrammar.g:6453:4: lv_value_0_0= RULE_STRING
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
              					"org.unicam.tryGrammar.MyGrammar.STRING");
              			
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


    // $ANTLR start "entryRuleHexLiteral"
    // InternalMyGrammar.g:6472:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // InternalMyGrammar.g:6472:51: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // InternalMyGrammar.g:6473:2: iv_ruleHexLiteral= ruleHexLiteral EOF
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
    // InternalMyGrammar.g:6479:1: ruleHexLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_HEX ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:6485:2: ( ( (lv_value_0_0= RULE_HEX ) ) )
            // InternalMyGrammar.g:6486:2: ( (lv_value_0_0= RULE_HEX ) )
            {
            // InternalMyGrammar.g:6486:2: ( (lv_value_0_0= RULE_HEX ) )
            // InternalMyGrammar.g:6487:3: (lv_value_0_0= RULE_HEX )
            {
            // InternalMyGrammar.g:6487:3: (lv_value_0_0= RULE_HEX )
            // InternalMyGrammar.g:6488:4: lv_value_0_0= RULE_HEX
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
              					"org.unicam.tryGrammar.MyGrammar.HEX");
              			
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
    // InternalMyGrammar.g:6507:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalMyGrammar.g:6507:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalMyGrammar.g:6508:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalMyGrammar.g:6514:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:6520:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalMyGrammar.g:6521:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalMyGrammar.g:6521:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalMyGrammar.g:6522:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalMyGrammar.g:6522:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalMyGrammar.g:6523:4: lv_value_0_0= RULE_DECIMAL
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
              					"org.unicam.tryGrammar.MyGrammar.DECIMAL");
              			
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


    // $ANTLR start "entryRuleTypeCast"
    // InternalMyGrammar.g:6542:1: entryRuleTypeCast returns [EObject current=null] : iv_ruleTypeCast= ruleTypeCast EOF ;
    public final EObject entryRuleTypeCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCast = null;


        try {
            // InternalMyGrammar.g:6542:49: (iv_ruleTypeCast= ruleTypeCast EOF )
            // InternalMyGrammar.g:6543:2: iv_ruleTypeCast= ruleTypeCast EOF
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
    // InternalMyGrammar.g:6549:1: ruleTypeCast returns [EObject current=null] : ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypeCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:6555:2: ( ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalMyGrammar.g:6556:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalMyGrammar.g:6556:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalMyGrammar.g:6557:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalMyGrammar.g:6557:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) )
            // InternalMyGrammar.g:6558:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalMyGrammar.g:6558:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            // InternalMyGrammar.g:6559:5: lv_value_0_0= ruleElementaryTypeNameEnum
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
              						"org.unicam.tryGrammar.MyGrammar.ElementaryTypeNameEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTypeCastAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMyGrammar.g:6580:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMyGrammar.g:6581:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMyGrammar.g:6581:4: (lv_expression_2_0= ruleExpression )
            // InternalMyGrammar.g:6582:5: lv_expression_2_0= ruleExpression
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
              						"org.unicam.tryGrammar.MyGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:6607:1: entryRuleNow returns [EObject current=null] : iv_ruleNow= ruleNow EOF ;
    public final EObject entryRuleNow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNow = null;


        try {
            // InternalMyGrammar.g:6607:44: (iv_ruleNow= ruleNow EOF )
            // InternalMyGrammar.g:6608:2: iv_ruleNow= ruleNow EOF
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
    // InternalMyGrammar.g:6614:1: ruleNow returns [EObject current=null] : ( () otherlv_1= 'now' ) ;
    public final EObject ruleNow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:6620:2: ( ( () otherlv_1= 'now' ) )
            // InternalMyGrammar.g:6621:2: ( () otherlv_1= 'now' )
            {
            // InternalMyGrammar.g:6621:2: ( () otherlv_1= 'now' )
            // InternalMyGrammar.g:6622:3: () otherlv_1= 'now'
            {
            // InternalMyGrammar.g:6622:3: ()
            // InternalMyGrammar.g:6623:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNowAccess().getNowAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:6637:1: entryRuleSpecialVariables returns [EObject current=null] : iv_ruleSpecialVariables= ruleSpecialVariables EOF ;
    public final EObject entryRuleSpecialVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariables = null;


        try {
            // InternalMyGrammar.g:6637:57: (iv_ruleSpecialVariables= ruleSpecialVariables EOF )
            // InternalMyGrammar.g:6638:2: iv_ruleSpecialVariables= ruleSpecialVariables EOF
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
    // InternalMyGrammar.g:6644:1: ruleSpecialVariables returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) ;
    public final EObject ruleSpecialVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_field_2_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_qualifiers_3_0 = null;



        	enterRule();

        try {
            // InternalMyGrammar.g:6650:2: ( ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) )
            // InternalMyGrammar.g:6651:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            {
            // InternalMyGrammar.g:6651:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            // InternalMyGrammar.g:6652:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )*
            {
            // InternalMyGrammar.g:6652:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) )
            // InternalMyGrammar.g:6653:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            {
            // InternalMyGrammar.g:6653:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            // InternalMyGrammar.g:6654:5: lv_type_0_0= ruleSpecialVariablesTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getTypeSpecialVariablesTypeEnumParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_72);
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
              						"org.unicam.tryGrammar.MyGrammar.SpecialVariablesTypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpecialVariablesAccess().getFullStopKeyword_1());
              		
            }
            // InternalMyGrammar.g:6675:3: ( (lv_field_2_0= RULE_ID ) )
            // InternalMyGrammar.g:6676:4: (lv_field_2_0= RULE_ID )
            {
            // InternalMyGrammar.g:6676:4: (lv_field_2_0= RULE_ID )
            // InternalMyGrammar.g:6677:5: lv_field_2_0= RULE_ID
            {
            lv_field_2_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
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
              						"org.unicam.tryGrammar.MyGrammar.ID");
              				
            }

            }


            }

            // InternalMyGrammar.g:6693:3: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==27||LA100_0==40||LA100_0==43) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalMyGrammar.g:6694:4: (lv_qualifiers_3_0= ruleQualifier )
            	    {
            	    // InternalMyGrammar.g:6694:4: (lv_qualifiers_3_0= ruleQualifier )
            	    // InternalMyGrammar.g:6695:5: lv_qualifiers_3_0= ruleQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getQualifiersQualifierParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_44);
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
            	      						"org.unicam.tryGrammar.MyGrammar.Qualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
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
    // InternalMyGrammar.g:6716:1: entryRuleSpecialVariablesTypeEnum returns [EObject current=null] : iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF ;
    public final EObject entryRuleSpecialVariablesTypeEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariablesTypeEnum = null;


        try {
            // InternalMyGrammar.g:6716:65: (iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF )
            // InternalMyGrammar.g:6717:2: iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF
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
    // InternalMyGrammar.g:6723:1: ruleSpecialVariablesTypeEnum returns [EObject current=null] : ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) ) ;
    public final EObject ruleSpecialVariablesTypeEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:6729:2: ( ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) ) )
            // InternalMyGrammar.g:6730:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) )
            {
            // InternalMyGrammar.g:6730:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) )
            // InternalMyGrammar.g:6731:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) )
            {
            // InternalMyGrammar.g:6731:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) )
            // InternalMyGrammar.g:6732:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX )
            {
            // InternalMyGrammar.g:6732:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX )
            int alt101=3;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
                {
                alt101=1;
                }
                break;
            case RULE_MSG:
                {
                alt101=2;
                }
                break;
            case RULE_TX:
                {
                alt101=3;
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
                    // InternalMyGrammar.g:6733:5: lv_name_0_1= RULE_BLOCK
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
                      						"org.unicam.tryGrammar.MyGrammar.BLOCK");
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:6748:5: lv_name_0_2= RULE_MSG
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
                      						"org.unicam.tryGrammar.MyGrammar.MSG");
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:6763:5: lv_name_0_3= RULE_TX
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
                      						"org.unicam.tryGrammar.MyGrammar.TX");
                      				
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
    // InternalMyGrammar.g:6783:1: ruleElementaryTypeNameEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) ) ;
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
            // InternalMyGrammar.g:6789:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) ) )
            // InternalMyGrammar.g:6790:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) )
            {
            // InternalMyGrammar.g:6790:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) )
            int alt102=104;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt102=1;
                }
                break;
            case 72:
                {
                alt102=2;
                }
                break;
            case 73:
                {
                alt102=3;
                }
                break;
            case 74:
                {
                alt102=4;
                }
                break;
            case 75:
                {
                alt102=5;
                }
                break;
            case 76:
                {
                alt102=6;
                }
                break;
            case 77:
                {
                alt102=7;
                }
                break;
            case 78:
                {
                alt102=8;
                }
                break;
            case 79:
                {
                alt102=9;
                }
                break;
            case 80:
                {
                alt102=10;
                }
                break;
            case 81:
                {
                alt102=11;
                }
                break;
            case 82:
                {
                alt102=12;
                }
                break;
            case 83:
                {
                alt102=13;
                }
                break;
            case 84:
                {
                alt102=14;
                }
                break;
            case 85:
                {
                alt102=15;
                }
                break;
            case 86:
                {
                alt102=16;
                }
                break;
            case 87:
                {
                alt102=17;
                }
                break;
            case 88:
                {
                alt102=18;
                }
                break;
            case 89:
                {
                alt102=19;
                }
                break;
            case 90:
                {
                alt102=20;
                }
                break;
            case 91:
                {
                alt102=21;
                }
                break;
            case 92:
                {
                alt102=22;
                }
                break;
            case 93:
                {
                alt102=23;
                }
                break;
            case 94:
                {
                alt102=24;
                }
                break;
            case 95:
                {
                alt102=25;
                }
                break;
            case 96:
                {
                alt102=26;
                }
                break;
            case 97:
                {
                alt102=27;
                }
                break;
            case 98:
                {
                alt102=28;
                }
                break;
            case 99:
                {
                alt102=29;
                }
                break;
            case 100:
                {
                alt102=30;
                }
                break;
            case 101:
                {
                alt102=31;
                }
                break;
            case 102:
                {
                alt102=32;
                }
                break;
            case 103:
                {
                alt102=33;
                }
                break;
            case 104:
                {
                alt102=34;
                }
                break;
            case 105:
                {
                alt102=35;
                }
                break;
            case 106:
                {
                alt102=36;
                }
                break;
            case 107:
                {
                alt102=37;
                }
                break;
            case 108:
                {
                alt102=38;
                }
                break;
            case 109:
                {
                alt102=39;
                }
                break;
            case 110:
                {
                alt102=40;
                }
                break;
            case 111:
                {
                alt102=41;
                }
                break;
            case 112:
                {
                alt102=42;
                }
                break;
            case 113:
                {
                alt102=43;
                }
                break;
            case 114:
                {
                alt102=44;
                }
                break;
            case 115:
                {
                alt102=45;
                }
                break;
            case 116:
                {
                alt102=46;
                }
                break;
            case 117:
                {
                alt102=47;
                }
                break;
            case 118:
                {
                alt102=48;
                }
                break;
            case 119:
                {
                alt102=49;
                }
                break;
            case 120:
                {
                alt102=50;
                }
                break;
            case 121:
                {
                alt102=51;
                }
                break;
            case 122:
                {
                alt102=52;
                }
                break;
            case 123:
                {
                alt102=53;
                }
                break;
            case 124:
                {
                alt102=54;
                }
                break;
            case 125:
                {
                alt102=55;
                }
                break;
            case 126:
                {
                alt102=56;
                }
                break;
            case 127:
                {
                alt102=57;
                }
                break;
            case 128:
                {
                alt102=58;
                }
                break;
            case 129:
                {
                alt102=59;
                }
                break;
            case 130:
                {
                alt102=60;
                }
                break;
            case 131:
                {
                alt102=61;
                }
                break;
            case 132:
                {
                alt102=62;
                }
                break;
            case 133:
                {
                alt102=63;
                }
                break;
            case 134:
                {
                alt102=64;
                }
                break;
            case 135:
                {
                alt102=65;
                }
                break;
            case 136:
                {
                alt102=66;
                }
                break;
            case 137:
                {
                alt102=67;
                }
                break;
            case 138:
                {
                alt102=68;
                }
                break;
            case 139:
                {
                alt102=69;
                }
                break;
            case 140:
                {
                alt102=70;
                }
                break;
            case 141:
                {
                alt102=71;
                }
                break;
            case 142:
                {
                alt102=72;
                }
                break;
            case 143:
                {
                alt102=73;
                }
                break;
            case 144:
                {
                alt102=74;
                }
                break;
            case 145:
                {
                alt102=75;
                }
                break;
            case 146:
                {
                alt102=76;
                }
                break;
            case 147:
                {
                alt102=77;
                }
                break;
            case 148:
                {
                alt102=78;
                }
                break;
            case 149:
                {
                alt102=79;
                }
                break;
            case 150:
                {
                alt102=80;
                }
                break;
            case 151:
                {
                alt102=81;
                }
                break;
            case 152:
                {
                alt102=82;
                }
                break;
            case 153:
                {
                alt102=83;
                }
                break;
            case 154:
                {
                alt102=84;
                }
                break;
            case 155:
                {
                alt102=85;
                }
                break;
            case 156:
                {
                alt102=86;
                }
                break;
            case 157:
                {
                alt102=87;
                }
                break;
            case 158:
                {
                alt102=88;
                }
                break;
            case 159:
                {
                alt102=89;
                }
                break;
            case 160:
                {
                alt102=90;
                }
                break;
            case 161:
                {
                alt102=91;
                }
                break;
            case 162:
                {
                alt102=92;
                }
                break;
            case 163:
                {
                alt102=93;
                }
                break;
            case 164:
                {
                alt102=94;
                }
                break;
            case 165:
                {
                alt102=95;
                }
                break;
            case 166:
                {
                alt102=96;
                }
                break;
            case 167:
                {
                alt102=97;
                }
                break;
            case 168:
                {
                alt102=98;
                }
                break;
            case 169:
                {
                alt102=99;
                }
                break;
            case 170:
                {
                alt102=100;
                }
                break;
            case 171:
                {
                alt102=101;
                }
                break;
            case 172:
                {
                alt102=102;
                }
                break;
            case 173:
                {
                alt102=103;
                }
                break;
            case 174:
                {
                alt102=104;
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
                    // InternalMyGrammar.g:6791:3: (enumLiteral_0= 'int' )
                    {
                    // InternalMyGrammar.g:6791:3: (enumLiteral_0= 'int' )
                    // InternalMyGrammar.g:6792:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getElementaryTypeNameEnumAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:6799:3: (enumLiteral_1= 'int16' )
                    {
                    // InternalMyGrammar.g:6799:3: (enumLiteral_1= 'int16' )
                    // InternalMyGrammar.g:6800:4: enumLiteral_1= 'int16'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getElementaryTypeNameEnumAccess().getINT16EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:6807:3: (enumLiteral_2= 'int24' )
                    {
                    // InternalMyGrammar.g:6807:3: (enumLiteral_2= 'int24' )
                    // InternalMyGrammar.g:6808:4: enumLiteral_2= 'int24'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT24EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getElementaryTypeNameEnumAccess().getINT24EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyGrammar.g:6815:3: (enumLiteral_3= 'int32' )
                    {
                    // InternalMyGrammar.g:6815:3: (enumLiteral_3= 'int32' )
                    // InternalMyGrammar.g:6816:4: enumLiteral_3= 'int32'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT32EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getElementaryTypeNameEnumAccess().getINT32EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyGrammar.g:6823:3: (enumLiteral_4= 'int40' )
                    {
                    // InternalMyGrammar.g:6823:3: (enumLiteral_4= 'int40' )
                    // InternalMyGrammar.g:6824:4: enumLiteral_4= 'int40'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT40EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getElementaryTypeNameEnumAccess().getINT40EnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyGrammar.g:6831:3: (enumLiteral_5= 'int48' )
                    {
                    // InternalMyGrammar.g:6831:3: (enumLiteral_5= 'int48' )
                    // InternalMyGrammar.g:6832:4: enumLiteral_5= 'int48'
                    {
                    enumLiteral_5=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT48EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getElementaryTypeNameEnumAccess().getINT48EnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyGrammar.g:6839:3: (enumLiteral_6= 'int56' )
                    {
                    // InternalMyGrammar.g:6839:3: (enumLiteral_6= 'int56' )
                    // InternalMyGrammar.g:6840:4: enumLiteral_6= 'int56'
                    {
                    enumLiteral_6=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT56EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getElementaryTypeNameEnumAccess().getINT56EnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyGrammar.g:6847:3: (enumLiteral_7= 'int64' )
                    {
                    // InternalMyGrammar.g:6847:3: (enumLiteral_7= 'int64' )
                    // InternalMyGrammar.g:6848:4: enumLiteral_7= 'int64'
                    {
                    enumLiteral_7=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getElementaryTypeNameEnumAccess().getINT64EnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMyGrammar.g:6855:3: (enumLiteral_8= 'int72' )
                    {
                    // InternalMyGrammar.g:6855:3: (enumLiteral_8= 'int72' )
                    // InternalMyGrammar.g:6856:4: enumLiteral_8= 'int72'
                    {
                    enumLiteral_8=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT72EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getElementaryTypeNameEnumAccess().getINT72EnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMyGrammar.g:6863:3: (enumLiteral_9= 'int80' )
                    {
                    // InternalMyGrammar.g:6863:3: (enumLiteral_9= 'int80' )
                    // InternalMyGrammar.g:6864:4: enumLiteral_9= 'int80'
                    {
                    enumLiteral_9=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT80EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getElementaryTypeNameEnumAccess().getINT80EnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalMyGrammar.g:6871:3: (enumLiteral_10= 'int88' )
                    {
                    // InternalMyGrammar.g:6871:3: (enumLiteral_10= 'int88' )
                    // InternalMyGrammar.g:6872:4: enumLiteral_10= 'int88'
                    {
                    enumLiteral_10=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT88EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getElementaryTypeNameEnumAccess().getINT88EnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalMyGrammar.g:6879:3: (enumLiteral_11= 'int96' )
                    {
                    // InternalMyGrammar.g:6879:3: (enumLiteral_11= 'int96' )
                    // InternalMyGrammar.g:6880:4: enumLiteral_11= 'int96'
                    {
                    enumLiteral_11=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT96EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getElementaryTypeNameEnumAccess().getINT96EnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalMyGrammar.g:6887:3: (enumLiteral_12= 'int104' )
                    {
                    // InternalMyGrammar.g:6887:3: (enumLiteral_12= 'int104' )
                    // InternalMyGrammar.g:6888:4: enumLiteral_12= 'int104'
                    {
                    enumLiteral_12=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT104EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getElementaryTypeNameEnumAccess().getINT104EnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalMyGrammar.g:6895:3: (enumLiteral_13= 'int112' )
                    {
                    // InternalMyGrammar.g:6895:3: (enumLiteral_13= 'int112' )
                    // InternalMyGrammar.g:6896:4: enumLiteral_13= 'int112'
                    {
                    enumLiteral_13=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT112EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getElementaryTypeNameEnumAccess().getINT112EnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalMyGrammar.g:6903:3: (enumLiteral_14= 'int120' )
                    {
                    // InternalMyGrammar.g:6903:3: (enumLiteral_14= 'int120' )
                    // InternalMyGrammar.g:6904:4: enumLiteral_14= 'int120'
                    {
                    enumLiteral_14=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT120EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getElementaryTypeNameEnumAccess().getINT120EnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalMyGrammar.g:6911:3: (enumLiteral_15= 'int128' )
                    {
                    // InternalMyGrammar.g:6911:3: (enumLiteral_15= 'int128' )
                    // InternalMyGrammar.g:6912:4: enumLiteral_15= 'int128'
                    {
                    enumLiteral_15=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT128EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_15, grammarAccess.getElementaryTypeNameEnumAccess().getINT128EnumLiteralDeclaration_15());
                      			
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalMyGrammar.g:6919:3: (enumLiteral_16= 'int136' )
                    {
                    // InternalMyGrammar.g:6919:3: (enumLiteral_16= 'int136' )
                    // InternalMyGrammar.g:6920:4: enumLiteral_16= 'int136'
                    {
                    enumLiteral_16=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT136EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_16, grammarAccess.getElementaryTypeNameEnumAccess().getINT136EnumLiteralDeclaration_16());
                      			
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalMyGrammar.g:6927:3: (enumLiteral_17= 'int144' )
                    {
                    // InternalMyGrammar.g:6927:3: (enumLiteral_17= 'int144' )
                    // InternalMyGrammar.g:6928:4: enumLiteral_17= 'int144'
                    {
                    enumLiteral_17=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT144EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_17, grammarAccess.getElementaryTypeNameEnumAccess().getINT144EnumLiteralDeclaration_17());
                      			
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalMyGrammar.g:6935:3: (enumLiteral_18= 'int152' )
                    {
                    // InternalMyGrammar.g:6935:3: (enumLiteral_18= 'int152' )
                    // InternalMyGrammar.g:6936:4: enumLiteral_18= 'int152'
                    {
                    enumLiteral_18=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT152EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_18, grammarAccess.getElementaryTypeNameEnumAccess().getINT152EnumLiteralDeclaration_18());
                      			
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalMyGrammar.g:6943:3: (enumLiteral_19= 'int160' )
                    {
                    // InternalMyGrammar.g:6943:3: (enumLiteral_19= 'int160' )
                    // InternalMyGrammar.g:6944:4: enumLiteral_19= 'int160'
                    {
                    enumLiteral_19=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT160EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_19, grammarAccess.getElementaryTypeNameEnumAccess().getINT160EnumLiteralDeclaration_19());
                      			
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalMyGrammar.g:6951:3: (enumLiteral_20= 'int168' )
                    {
                    // InternalMyGrammar.g:6951:3: (enumLiteral_20= 'int168' )
                    // InternalMyGrammar.g:6952:4: enumLiteral_20= 'int168'
                    {
                    enumLiteral_20=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT168EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_20, grammarAccess.getElementaryTypeNameEnumAccess().getINT168EnumLiteralDeclaration_20());
                      			
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalMyGrammar.g:6959:3: (enumLiteral_21= 'int178' )
                    {
                    // InternalMyGrammar.g:6959:3: (enumLiteral_21= 'int178' )
                    // InternalMyGrammar.g:6960:4: enumLiteral_21= 'int178'
                    {
                    enumLiteral_21=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT178EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_21, grammarAccess.getElementaryTypeNameEnumAccess().getINT178EnumLiteralDeclaration_21());
                      			
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalMyGrammar.g:6967:3: (enumLiteral_22= 'int184' )
                    {
                    // InternalMyGrammar.g:6967:3: (enumLiteral_22= 'int184' )
                    // InternalMyGrammar.g:6968:4: enumLiteral_22= 'int184'
                    {
                    enumLiteral_22=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT184EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_22, grammarAccess.getElementaryTypeNameEnumAccess().getINT184EnumLiteralDeclaration_22());
                      			
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalMyGrammar.g:6975:3: (enumLiteral_23= 'int192' )
                    {
                    // InternalMyGrammar.g:6975:3: (enumLiteral_23= 'int192' )
                    // InternalMyGrammar.g:6976:4: enumLiteral_23= 'int192'
                    {
                    enumLiteral_23=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT192EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_23, grammarAccess.getElementaryTypeNameEnumAccess().getINT192EnumLiteralDeclaration_23());
                      			
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalMyGrammar.g:6983:3: (enumLiteral_24= 'int200' )
                    {
                    // InternalMyGrammar.g:6983:3: (enumLiteral_24= 'int200' )
                    // InternalMyGrammar.g:6984:4: enumLiteral_24= 'int200'
                    {
                    enumLiteral_24=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT200EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_24, grammarAccess.getElementaryTypeNameEnumAccess().getINT200EnumLiteralDeclaration_24());
                      			
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalMyGrammar.g:6991:3: (enumLiteral_25= 'int208' )
                    {
                    // InternalMyGrammar.g:6991:3: (enumLiteral_25= 'int208' )
                    // InternalMyGrammar.g:6992:4: enumLiteral_25= 'int208'
                    {
                    enumLiteral_25=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT208EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_25, grammarAccess.getElementaryTypeNameEnumAccess().getINT208EnumLiteralDeclaration_25());
                      			
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalMyGrammar.g:6999:3: (enumLiteral_26= 'int216' )
                    {
                    // InternalMyGrammar.g:6999:3: (enumLiteral_26= 'int216' )
                    // InternalMyGrammar.g:7000:4: enumLiteral_26= 'int216'
                    {
                    enumLiteral_26=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT216EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_26, grammarAccess.getElementaryTypeNameEnumAccess().getINT216EnumLiteralDeclaration_26());
                      			
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalMyGrammar.g:7007:3: (enumLiteral_27= 'int224' )
                    {
                    // InternalMyGrammar.g:7007:3: (enumLiteral_27= 'int224' )
                    // InternalMyGrammar.g:7008:4: enumLiteral_27= 'int224'
                    {
                    enumLiteral_27=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT224EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_27, grammarAccess.getElementaryTypeNameEnumAccess().getINT224EnumLiteralDeclaration_27());
                      			
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalMyGrammar.g:7015:3: (enumLiteral_28= 'int232' )
                    {
                    // InternalMyGrammar.g:7015:3: (enumLiteral_28= 'int232' )
                    // InternalMyGrammar.g:7016:4: enumLiteral_28= 'int232'
                    {
                    enumLiteral_28=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT232EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_28, grammarAccess.getElementaryTypeNameEnumAccess().getINT232EnumLiteralDeclaration_28());
                      			
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalMyGrammar.g:7023:3: (enumLiteral_29= 'int240' )
                    {
                    // InternalMyGrammar.g:7023:3: (enumLiteral_29= 'int240' )
                    // InternalMyGrammar.g:7024:4: enumLiteral_29= 'int240'
                    {
                    enumLiteral_29=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT240EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_29, grammarAccess.getElementaryTypeNameEnumAccess().getINT240EnumLiteralDeclaration_29());
                      			
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalMyGrammar.g:7031:3: (enumLiteral_30= 'int248' )
                    {
                    // InternalMyGrammar.g:7031:3: (enumLiteral_30= 'int248' )
                    // InternalMyGrammar.g:7032:4: enumLiteral_30= 'int248'
                    {
                    enumLiteral_30=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT248EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_30, grammarAccess.getElementaryTypeNameEnumAccess().getINT248EnumLiteralDeclaration_30());
                      			
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalMyGrammar.g:7039:3: (enumLiteral_31= 'int256' )
                    {
                    // InternalMyGrammar.g:7039:3: (enumLiteral_31= 'int256' )
                    // InternalMyGrammar.g:7040:4: enumLiteral_31= 'int256'
                    {
                    enumLiteral_31=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT256EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_31, grammarAccess.getElementaryTypeNameEnumAccess().getINT256EnumLiteralDeclaration_31());
                      			
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalMyGrammar.g:7047:3: (enumLiteral_32= 'uint' )
                    {
                    // InternalMyGrammar.g:7047:3: (enumLiteral_32= 'uint' )
                    // InternalMyGrammar.g:7048:4: enumLiteral_32= 'uint'
                    {
                    enumLiteral_32=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINTEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_32, grammarAccess.getElementaryTypeNameEnumAccess().getUINTEnumLiteralDeclaration_32());
                      			
                    }

                    }


                    }
                    break;
                case 34 :
                    // InternalMyGrammar.g:7055:3: (enumLiteral_33= 'uint8' )
                    {
                    // InternalMyGrammar.g:7055:3: (enumLiteral_33= 'uint8' )
                    // InternalMyGrammar.g:7056:4: enumLiteral_33= 'uint8'
                    {
                    enumLiteral_33=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT8EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_33, grammarAccess.getElementaryTypeNameEnumAccess().getUINT8EnumLiteralDeclaration_33());
                      			
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalMyGrammar.g:7063:3: (enumLiteral_34= 'uint16' )
                    {
                    // InternalMyGrammar.g:7063:3: (enumLiteral_34= 'uint16' )
                    // InternalMyGrammar.g:7064:4: enumLiteral_34= 'uint16'
                    {
                    enumLiteral_34=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT16EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_34, grammarAccess.getElementaryTypeNameEnumAccess().getUINT16EnumLiteralDeclaration_34());
                      			
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalMyGrammar.g:7071:3: (enumLiteral_35= 'uint24' )
                    {
                    // InternalMyGrammar.g:7071:3: (enumLiteral_35= 'uint24' )
                    // InternalMyGrammar.g:7072:4: enumLiteral_35= 'uint24'
                    {
                    enumLiteral_35=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUNIT24EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_35, grammarAccess.getElementaryTypeNameEnumAccess().getUNIT24EnumLiteralDeclaration_35());
                      			
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalMyGrammar.g:7079:3: (enumLiteral_36= 'uint32' )
                    {
                    // InternalMyGrammar.g:7079:3: (enumLiteral_36= 'uint32' )
                    // InternalMyGrammar.g:7080:4: enumLiteral_36= 'uint32'
                    {
                    enumLiteral_36=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT32EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_36, grammarAccess.getElementaryTypeNameEnumAccess().getUINT32EnumLiteralDeclaration_36());
                      			
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalMyGrammar.g:7087:3: (enumLiteral_37= 'uint40' )
                    {
                    // InternalMyGrammar.g:7087:3: (enumLiteral_37= 'uint40' )
                    // InternalMyGrammar.g:7088:4: enumLiteral_37= 'uint40'
                    {
                    enumLiteral_37=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT40EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_37, grammarAccess.getElementaryTypeNameEnumAccess().getUINT40EnumLiteralDeclaration_37());
                      			
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalMyGrammar.g:7095:3: (enumLiteral_38= 'uint48' )
                    {
                    // InternalMyGrammar.g:7095:3: (enumLiteral_38= 'uint48' )
                    // InternalMyGrammar.g:7096:4: enumLiteral_38= 'uint48'
                    {
                    enumLiteral_38=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT48EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_38, grammarAccess.getElementaryTypeNameEnumAccess().getUINT48EnumLiteralDeclaration_38());
                      			
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalMyGrammar.g:7103:3: (enumLiteral_39= 'uint56' )
                    {
                    // InternalMyGrammar.g:7103:3: (enumLiteral_39= 'uint56' )
                    // InternalMyGrammar.g:7104:4: enumLiteral_39= 'uint56'
                    {
                    enumLiteral_39=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUNIT56EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_39, grammarAccess.getElementaryTypeNameEnumAccess().getUNIT56EnumLiteralDeclaration_39());
                      			
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalMyGrammar.g:7111:3: (enumLiteral_40= 'uint64' )
                    {
                    // InternalMyGrammar.g:7111:3: (enumLiteral_40= 'uint64' )
                    // InternalMyGrammar.g:7112:4: enumLiteral_40= 'uint64'
                    {
                    enumLiteral_40=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT64EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_40, grammarAccess.getElementaryTypeNameEnumAccess().getUINT64EnumLiteralDeclaration_40());
                      			
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalMyGrammar.g:7119:3: (enumLiteral_41= 'uint72' )
                    {
                    // InternalMyGrammar.g:7119:3: (enumLiteral_41= 'uint72' )
                    // InternalMyGrammar.g:7120:4: enumLiteral_41= 'uint72'
                    {
                    enumLiteral_41=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT72EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_41, grammarAccess.getElementaryTypeNameEnumAccess().getUINT72EnumLiteralDeclaration_41());
                      			
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalMyGrammar.g:7127:3: (enumLiteral_42= 'uint80' )
                    {
                    // InternalMyGrammar.g:7127:3: (enumLiteral_42= 'uint80' )
                    // InternalMyGrammar.g:7128:4: enumLiteral_42= 'uint80'
                    {
                    enumLiteral_42=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT80EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_42, grammarAccess.getElementaryTypeNameEnumAccess().getUINT80EnumLiteralDeclaration_42());
                      			
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalMyGrammar.g:7135:3: (enumLiteral_43= 'uint88' )
                    {
                    // InternalMyGrammar.g:7135:3: (enumLiteral_43= 'uint88' )
                    // InternalMyGrammar.g:7136:4: enumLiteral_43= 'uint88'
                    {
                    enumLiteral_43=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT88EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_43, grammarAccess.getElementaryTypeNameEnumAccess().getUINT88EnumLiteralDeclaration_43());
                      			
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalMyGrammar.g:7143:3: (enumLiteral_44= 'uint96' )
                    {
                    // InternalMyGrammar.g:7143:3: (enumLiteral_44= 'uint96' )
                    // InternalMyGrammar.g:7144:4: enumLiteral_44= 'uint96'
                    {
                    enumLiteral_44=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT96EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_44, grammarAccess.getElementaryTypeNameEnumAccess().getUINT96EnumLiteralDeclaration_44());
                      			
                    }

                    }


                    }
                    break;
                case 46 :
                    // InternalMyGrammar.g:7151:3: (enumLiteral_45= 'uint104' )
                    {
                    // InternalMyGrammar.g:7151:3: (enumLiteral_45= 'uint104' )
                    // InternalMyGrammar.g:7152:4: enumLiteral_45= 'uint104'
                    {
                    enumLiteral_45=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT104EnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_45, grammarAccess.getElementaryTypeNameEnumAccess().getUINT104EnumLiteralDeclaration_45());
                      			
                    }

                    }


                    }
                    break;
                case 47 :
                    // InternalMyGrammar.g:7159:3: (enumLiteral_46= 'uint112' )
                    {
                    // InternalMyGrammar.g:7159:3: (enumLiteral_46= 'uint112' )
                    // InternalMyGrammar.g:7160:4: enumLiteral_46= 'uint112'
                    {
                    enumLiteral_46=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT112EnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_46, grammarAccess.getElementaryTypeNameEnumAccess().getUINT112EnumLiteralDeclaration_46());
                      			
                    }

                    }


                    }
                    break;
                case 48 :
                    // InternalMyGrammar.g:7167:3: (enumLiteral_47= 'uint120' )
                    {
                    // InternalMyGrammar.g:7167:3: (enumLiteral_47= 'uint120' )
                    // InternalMyGrammar.g:7168:4: enumLiteral_47= 'uint120'
                    {
                    enumLiteral_47=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT120EnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_47, grammarAccess.getElementaryTypeNameEnumAccess().getUINT120EnumLiteralDeclaration_47());
                      			
                    }

                    }


                    }
                    break;
                case 49 :
                    // InternalMyGrammar.g:7175:3: (enumLiteral_48= 'uint128' )
                    {
                    // InternalMyGrammar.g:7175:3: (enumLiteral_48= 'uint128' )
                    // InternalMyGrammar.g:7176:4: enumLiteral_48= 'uint128'
                    {
                    enumLiteral_48=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT128EnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_48, grammarAccess.getElementaryTypeNameEnumAccess().getUINT128EnumLiteralDeclaration_48());
                      			
                    }

                    }


                    }
                    break;
                case 50 :
                    // InternalMyGrammar.g:7183:3: (enumLiteral_49= 'uint136' )
                    {
                    // InternalMyGrammar.g:7183:3: (enumLiteral_49= 'uint136' )
                    // InternalMyGrammar.g:7184:4: enumLiteral_49= 'uint136'
                    {
                    enumLiteral_49=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT136EnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_49, grammarAccess.getElementaryTypeNameEnumAccess().getUINT136EnumLiteralDeclaration_49());
                      			
                    }

                    }


                    }
                    break;
                case 51 :
                    // InternalMyGrammar.g:7191:3: (enumLiteral_50= 'uint144' )
                    {
                    // InternalMyGrammar.g:7191:3: (enumLiteral_50= 'uint144' )
                    // InternalMyGrammar.g:7192:4: enumLiteral_50= 'uint144'
                    {
                    enumLiteral_50=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT144EnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_50, grammarAccess.getElementaryTypeNameEnumAccess().getUINT144EnumLiteralDeclaration_50());
                      			
                    }

                    }


                    }
                    break;
                case 52 :
                    // InternalMyGrammar.g:7199:3: (enumLiteral_51= 'uint152' )
                    {
                    // InternalMyGrammar.g:7199:3: (enumLiteral_51= 'uint152' )
                    // InternalMyGrammar.g:7200:4: enumLiteral_51= 'uint152'
                    {
                    enumLiteral_51=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT152EnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_51, grammarAccess.getElementaryTypeNameEnumAccess().getUINT152EnumLiteralDeclaration_51());
                      			
                    }

                    }


                    }
                    break;
                case 53 :
                    // InternalMyGrammar.g:7207:3: (enumLiteral_52= 'uint160' )
                    {
                    // InternalMyGrammar.g:7207:3: (enumLiteral_52= 'uint160' )
                    // InternalMyGrammar.g:7208:4: enumLiteral_52= 'uint160'
                    {
                    enumLiteral_52=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT160EnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_52, grammarAccess.getElementaryTypeNameEnumAccess().getUINT160EnumLiteralDeclaration_52());
                      			
                    }

                    }


                    }
                    break;
                case 54 :
                    // InternalMyGrammar.g:7215:3: (enumLiteral_53= 'uint168' )
                    {
                    // InternalMyGrammar.g:7215:3: (enumLiteral_53= 'uint168' )
                    // InternalMyGrammar.g:7216:4: enumLiteral_53= 'uint168'
                    {
                    enumLiteral_53=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT168EnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_53, grammarAccess.getElementaryTypeNameEnumAccess().getUINT168EnumLiteralDeclaration_53());
                      			
                    }

                    }


                    }
                    break;
                case 55 :
                    // InternalMyGrammar.g:7223:3: (enumLiteral_54= 'uint178' )
                    {
                    // InternalMyGrammar.g:7223:3: (enumLiteral_54= 'uint178' )
                    // InternalMyGrammar.g:7224:4: enumLiteral_54= 'uint178'
                    {
                    enumLiteral_54=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT178EnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_54, grammarAccess.getElementaryTypeNameEnumAccess().getUINT178EnumLiteralDeclaration_54());
                      			
                    }

                    }


                    }
                    break;
                case 56 :
                    // InternalMyGrammar.g:7231:3: (enumLiteral_55= 'uint184' )
                    {
                    // InternalMyGrammar.g:7231:3: (enumLiteral_55= 'uint184' )
                    // InternalMyGrammar.g:7232:4: enumLiteral_55= 'uint184'
                    {
                    enumLiteral_55=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT184EnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_55, grammarAccess.getElementaryTypeNameEnumAccess().getUINT184EnumLiteralDeclaration_55());
                      			
                    }

                    }


                    }
                    break;
                case 57 :
                    // InternalMyGrammar.g:7239:3: (enumLiteral_56= 'uint192' )
                    {
                    // InternalMyGrammar.g:7239:3: (enumLiteral_56= 'uint192' )
                    // InternalMyGrammar.g:7240:4: enumLiteral_56= 'uint192'
                    {
                    enumLiteral_56=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT192EnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_56, grammarAccess.getElementaryTypeNameEnumAccess().getUINT192EnumLiteralDeclaration_56());
                      			
                    }

                    }


                    }
                    break;
                case 58 :
                    // InternalMyGrammar.g:7247:3: (enumLiteral_57= 'uint200' )
                    {
                    // InternalMyGrammar.g:7247:3: (enumLiteral_57= 'uint200' )
                    // InternalMyGrammar.g:7248:4: enumLiteral_57= 'uint200'
                    {
                    enumLiteral_57=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT200EnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_57, grammarAccess.getElementaryTypeNameEnumAccess().getUINT200EnumLiteralDeclaration_57());
                      			
                    }

                    }


                    }
                    break;
                case 59 :
                    // InternalMyGrammar.g:7255:3: (enumLiteral_58= 'uint208' )
                    {
                    // InternalMyGrammar.g:7255:3: (enumLiteral_58= 'uint208' )
                    // InternalMyGrammar.g:7256:4: enumLiteral_58= 'uint208'
                    {
                    enumLiteral_58=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT208EnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_58, grammarAccess.getElementaryTypeNameEnumAccess().getUINT208EnumLiteralDeclaration_58());
                      			
                    }

                    }


                    }
                    break;
                case 60 :
                    // InternalMyGrammar.g:7263:3: (enumLiteral_59= 'uint216' )
                    {
                    // InternalMyGrammar.g:7263:3: (enumLiteral_59= 'uint216' )
                    // InternalMyGrammar.g:7264:4: enumLiteral_59= 'uint216'
                    {
                    enumLiteral_59=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT216EnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_59, grammarAccess.getElementaryTypeNameEnumAccess().getUINT216EnumLiteralDeclaration_59());
                      			
                    }

                    }


                    }
                    break;
                case 61 :
                    // InternalMyGrammar.g:7271:3: (enumLiteral_60= 'uint224' )
                    {
                    // InternalMyGrammar.g:7271:3: (enumLiteral_60= 'uint224' )
                    // InternalMyGrammar.g:7272:4: enumLiteral_60= 'uint224'
                    {
                    enumLiteral_60=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT244EnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_60, grammarAccess.getElementaryTypeNameEnumAccess().getUINT244EnumLiteralDeclaration_60());
                      			
                    }

                    }


                    }
                    break;
                case 62 :
                    // InternalMyGrammar.g:7279:3: (enumLiteral_61= 'uint232' )
                    {
                    // InternalMyGrammar.g:7279:3: (enumLiteral_61= 'uint232' )
                    // InternalMyGrammar.g:7280:4: enumLiteral_61= 'uint232'
                    {
                    enumLiteral_61=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT232EnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_61, grammarAccess.getElementaryTypeNameEnumAccess().getUINT232EnumLiteralDeclaration_61());
                      			
                    }

                    }


                    }
                    break;
                case 63 :
                    // InternalMyGrammar.g:7287:3: (enumLiteral_62= 'uint240' )
                    {
                    // InternalMyGrammar.g:7287:3: (enumLiteral_62= 'uint240' )
                    // InternalMyGrammar.g:7288:4: enumLiteral_62= 'uint240'
                    {
                    enumLiteral_62=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT240EnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_62, grammarAccess.getElementaryTypeNameEnumAccess().getUINT240EnumLiteralDeclaration_62());
                      			
                    }

                    }


                    }
                    break;
                case 64 :
                    // InternalMyGrammar.g:7295:3: (enumLiteral_63= 'uint248' )
                    {
                    // InternalMyGrammar.g:7295:3: (enumLiteral_63= 'uint248' )
                    // InternalMyGrammar.g:7296:4: enumLiteral_63= 'uint248'
                    {
                    enumLiteral_63=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT248EnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_63, grammarAccess.getElementaryTypeNameEnumAccess().getUINT248EnumLiteralDeclaration_63());
                      			
                    }

                    }


                    }
                    break;
                case 65 :
                    // InternalMyGrammar.g:7303:3: (enumLiteral_64= 'uint256' )
                    {
                    // InternalMyGrammar.g:7303:3: (enumLiteral_64= 'uint256' )
                    // InternalMyGrammar.g:7304:4: enumLiteral_64= 'uint256'
                    {
                    enumLiteral_64=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT256EnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_64, grammarAccess.getElementaryTypeNameEnumAccess().getUINT256EnumLiteralDeclaration_64());
                      			
                    }

                    }


                    }
                    break;
                case 66 :
                    // InternalMyGrammar.g:7311:3: (enumLiteral_65= 'byte' )
                    {
                    // InternalMyGrammar.g:7311:3: (enumLiteral_65= 'byte' )
                    // InternalMyGrammar.g:7312:4: enumLiteral_65= 'byte'
                    {
                    enumLiteral_65=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTEEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_65, grammarAccess.getElementaryTypeNameEnumAccess().getBYTEEnumLiteralDeclaration_65());
                      			
                    }

                    }


                    }
                    break;
                case 67 :
                    // InternalMyGrammar.g:7319:3: (enumLiteral_66= 'bytes' )
                    {
                    // InternalMyGrammar.g:7319:3: (enumLiteral_66= 'bytes' )
                    // InternalMyGrammar.g:7320:4: enumLiteral_66= 'bytes'
                    {
                    enumLiteral_66=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTESEnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_66, grammarAccess.getElementaryTypeNameEnumAccess().getBYTESEnumLiteralDeclaration_66());
                      			
                    }

                    }


                    }
                    break;
                case 68 :
                    // InternalMyGrammar.g:7327:3: (enumLiteral_67= 'bytes1' )
                    {
                    // InternalMyGrammar.g:7327:3: (enumLiteral_67= 'bytes1' )
                    // InternalMyGrammar.g:7328:4: enumLiteral_67= 'bytes1'
                    {
                    enumLiteral_67=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES1EnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_67, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES1EnumLiteralDeclaration_67());
                      			
                    }

                    }


                    }
                    break;
                case 69 :
                    // InternalMyGrammar.g:7335:3: (enumLiteral_68= 'bytes2' )
                    {
                    // InternalMyGrammar.g:7335:3: (enumLiteral_68= 'bytes2' )
                    // InternalMyGrammar.g:7336:4: enumLiteral_68= 'bytes2'
                    {
                    enumLiteral_68=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES2EnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_68, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES2EnumLiteralDeclaration_68());
                      			
                    }

                    }


                    }
                    break;
                case 70 :
                    // InternalMyGrammar.g:7343:3: (enumLiteral_69= 'bytes3' )
                    {
                    // InternalMyGrammar.g:7343:3: (enumLiteral_69= 'bytes3' )
                    // InternalMyGrammar.g:7344:4: enumLiteral_69= 'bytes3'
                    {
                    enumLiteral_69=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES3EnumLiteralDeclaration_69().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_69, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES3EnumLiteralDeclaration_69());
                      			
                    }

                    }


                    }
                    break;
                case 71 :
                    // InternalMyGrammar.g:7351:3: (enumLiteral_70= 'bytes4' )
                    {
                    // InternalMyGrammar.g:7351:3: (enumLiteral_70= 'bytes4' )
                    // InternalMyGrammar.g:7352:4: enumLiteral_70= 'bytes4'
                    {
                    enumLiteral_70=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES4EnumLiteralDeclaration_70().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_70, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES4EnumLiteralDeclaration_70());
                      			
                    }

                    }


                    }
                    break;
                case 72 :
                    // InternalMyGrammar.g:7359:3: (enumLiteral_71= 'bytes5' )
                    {
                    // InternalMyGrammar.g:7359:3: (enumLiteral_71= 'bytes5' )
                    // InternalMyGrammar.g:7360:4: enumLiteral_71= 'bytes5'
                    {
                    enumLiteral_71=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES5EnumLiteralDeclaration_71().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_71, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES5EnumLiteralDeclaration_71());
                      			
                    }

                    }


                    }
                    break;
                case 73 :
                    // InternalMyGrammar.g:7367:3: (enumLiteral_72= 'bytes6' )
                    {
                    // InternalMyGrammar.g:7367:3: (enumLiteral_72= 'bytes6' )
                    // InternalMyGrammar.g:7368:4: enumLiteral_72= 'bytes6'
                    {
                    enumLiteral_72=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES6EnumLiteralDeclaration_72().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_72, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES6EnumLiteralDeclaration_72());
                      			
                    }

                    }


                    }
                    break;
                case 74 :
                    // InternalMyGrammar.g:7375:3: (enumLiteral_73= 'bytes7' )
                    {
                    // InternalMyGrammar.g:7375:3: (enumLiteral_73= 'bytes7' )
                    // InternalMyGrammar.g:7376:4: enumLiteral_73= 'bytes7'
                    {
                    enumLiteral_73=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES7EnumLiteralDeclaration_73().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_73, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES7EnumLiteralDeclaration_73());
                      			
                    }

                    }


                    }
                    break;
                case 75 :
                    // InternalMyGrammar.g:7383:3: (enumLiteral_74= 'bytes8' )
                    {
                    // InternalMyGrammar.g:7383:3: (enumLiteral_74= 'bytes8' )
                    // InternalMyGrammar.g:7384:4: enumLiteral_74= 'bytes8'
                    {
                    enumLiteral_74=(Token)match(input,145,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES8EnumLiteralDeclaration_74().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_74, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES8EnumLiteralDeclaration_74());
                      			
                    }

                    }


                    }
                    break;
                case 76 :
                    // InternalMyGrammar.g:7391:3: (enumLiteral_75= 'bytes9' )
                    {
                    // InternalMyGrammar.g:7391:3: (enumLiteral_75= 'bytes9' )
                    // InternalMyGrammar.g:7392:4: enumLiteral_75= 'bytes9'
                    {
                    enumLiteral_75=(Token)match(input,146,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES9EnumLiteralDeclaration_75().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_75, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES9EnumLiteralDeclaration_75());
                      			
                    }

                    }


                    }
                    break;
                case 77 :
                    // InternalMyGrammar.g:7399:3: (enumLiteral_76= 'bytes10' )
                    {
                    // InternalMyGrammar.g:7399:3: (enumLiteral_76= 'bytes10' )
                    // InternalMyGrammar.g:7400:4: enumLiteral_76= 'bytes10'
                    {
                    enumLiteral_76=(Token)match(input,147,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES10EnumLiteralDeclaration_76().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_76, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES10EnumLiteralDeclaration_76());
                      			
                    }

                    }


                    }
                    break;
                case 78 :
                    // InternalMyGrammar.g:7407:3: (enumLiteral_77= 'bytes11' )
                    {
                    // InternalMyGrammar.g:7407:3: (enumLiteral_77= 'bytes11' )
                    // InternalMyGrammar.g:7408:4: enumLiteral_77= 'bytes11'
                    {
                    enumLiteral_77=(Token)match(input,148,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES11EnumLiteralDeclaration_77().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_77, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES11EnumLiteralDeclaration_77());
                      			
                    }

                    }


                    }
                    break;
                case 79 :
                    // InternalMyGrammar.g:7415:3: (enumLiteral_78= 'bytes12' )
                    {
                    // InternalMyGrammar.g:7415:3: (enumLiteral_78= 'bytes12' )
                    // InternalMyGrammar.g:7416:4: enumLiteral_78= 'bytes12'
                    {
                    enumLiteral_78=(Token)match(input,149,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES12EnumLiteralDeclaration_78().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_78, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES12EnumLiteralDeclaration_78());
                      			
                    }

                    }


                    }
                    break;
                case 80 :
                    // InternalMyGrammar.g:7423:3: (enumLiteral_79= 'bytes13' )
                    {
                    // InternalMyGrammar.g:7423:3: (enumLiteral_79= 'bytes13' )
                    // InternalMyGrammar.g:7424:4: enumLiteral_79= 'bytes13'
                    {
                    enumLiteral_79=(Token)match(input,150,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES13EnumLiteralDeclaration_79().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_79, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES13EnumLiteralDeclaration_79());
                      			
                    }

                    }


                    }
                    break;
                case 81 :
                    // InternalMyGrammar.g:7431:3: (enumLiteral_80= 'bytes14' )
                    {
                    // InternalMyGrammar.g:7431:3: (enumLiteral_80= 'bytes14' )
                    // InternalMyGrammar.g:7432:4: enumLiteral_80= 'bytes14'
                    {
                    enumLiteral_80=(Token)match(input,151,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES14EnumLiteralDeclaration_80().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_80, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES14EnumLiteralDeclaration_80());
                      			
                    }

                    }


                    }
                    break;
                case 82 :
                    // InternalMyGrammar.g:7439:3: (enumLiteral_81= 'bytes15' )
                    {
                    // InternalMyGrammar.g:7439:3: (enumLiteral_81= 'bytes15' )
                    // InternalMyGrammar.g:7440:4: enumLiteral_81= 'bytes15'
                    {
                    enumLiteral_81=(Token)match(input,152,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES15EnumLiteralDeclaration_81().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_81, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES15EnumLiteralDeclaration_81());
                      			
                    }

                    }


                    }
                    break;
                case 83 :
                    // InternalMyGrammar.g:7447:3: (enumLiteral_82= 'bytes16' )
                    {
                    // InternalMyGrammar.g:7447:3: (enumLiteral_82= 'bytes16' )
                    // InternalMyGrammar.g:7448:4: enumLiteral_82= 'bytes16'
                    {
                    enumLiteral_82=(Token)match(input,153,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES16EnumLiteralDeclaration_82().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_82, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES16EnumLiteralDeclaration_82());
                      			
                    }

                    }


                    }
                    break;
                case 84 :
                    // InternalMyGrammar.g:7455:3: (enumLiteral_83= 'bytes17' )
                    {
                    // InternalMyGrammar.g:7455:3: (enumLiteral_83= 'bytes17' )
                    // InternalMyGrammar.g:7456:4: enumLiteral_83= 'bytes17'
                    {
                    enumLiteral_83=(Token)match(input,154,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES17EnumLiteralDeclaration_83().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_83, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES17EnumLiteralDeclaration_83());
                      			
                    }

                    }


                    }
                    break;
                case 85 :
                    // InternalMyGrammar.g:7463:3: (enumLiteral_84= 'bytes18' )
                    {
                    // InternalMyGrammar.g:7463:3: (enumLiteral_84= 'bytes18' )
                    // InternalMyGrammar.g:7464:4: enumLiteral_84= 'bytes18'
                    {
                    enumLiteral_84=(Token)match(input,155,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES18EnumLiteralDeclaration_84().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_84, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES18EnumLiteralDeclaration_84());
                      			
                    }

                    }


                    }
                    break;
                case 86 :
                    // InternalMyGrammar.g:7471:3: (enumLiteral_85= 'bytes19' )
                    {
                    // InternalMyGrammar.g:7471:3: (enumLiteral_85= 'bytes19' )
                    // InternalMyGrammar.g:7472:4: enumLiteral_85= 'bytes19'
                    {
                    enumLiteral_85=(Token)match(input,156,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES19EnumLiteralDeclaration_85().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_85, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES19EnumLiteralDeclaration_85());
                      			
                    }

                    }


                    }
                    break;
                case 87 :
                    // InternalMyGrammar.g:7479:3: (enumLiteral_86= 'bytes20' )
                    {
                    // InternalMyGrammar.g:7479:3: (enumLiteral_86= 'bytes20' )
                    // InternalMyGrammar.g:7480:4: enumLiteral_86= 'bytes20'
                    {
                    enumLiteral_86=(Token)match(input,157,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES20EnumLiteralDeclaration_86().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_86, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES20EnumLiteralDeclaration_86());
                      			
                    }

                    }


                    }
                    break;
                case 88 :
                    // InternalMyGrammar.g:7487:3: (enumLiteral_87= 'bytes21' )
                    {
                    // InternalMyGrammar.g:7487:3: (enumLiteral_87= 'bytes21' )
                    // InternalMyGrammar.g:7488:4: enumLiteral_87= 'bytes21'
                    {
                    enumLiteral_87=(Token)match(input,158,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES21EnumLiteralDeclaration_87().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_87, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES21EnumLiteralDeclaration_87());
                      			
                    }

                    }


                    }
                    break;
                case 89 :
                    // InternalMyGrammar.g:7495:3: (enumLiteral_88= 'bytes22' )
                    {
                    // InternalMyGrammar.g:7495:3: (enumLiteral_88= 'bytes22' )
                    // InternalMyGrammar.g:7496:4: enumLiteral_88= 'bytes22'
                    {
                    enumLiteral_88=(Token)match(input,159,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES22EnumLiteralDeclaration_88().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_88, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES22EnumLiteralDeclaration_88());
                      			
                    }

                    }


                    }
                    break;
                case 90 :
                    // InternalMyGrammar.g:7503:3: (enumLiteral_89= 'bytes23' )
                    {
                    // InternalMyGrammar.g:7503:3: (enumLiteral_89= 'bytes23' )
                    // InternalMyGrammar.g:7504:4: enumLiteral_89= 'bytes23'
                    {
                    enumLiteral_89=(Token)match(input,160,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES23EnumLiteralDeclaration_89().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_89, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES23EnumLiteralDeclaration_89());
                      			
                    }

                    }


                    }
                    break;
                case 91 :
                    // InternalMyGrammar.g:7511:3: (enumLiteral_90= 'bytes24' )
                    {
                    // InternalMyGrammar.g:7511:3: (enumLiteral_90= 'bytes24' )
                    // InternalMyGrammar.g:7512:4: enumLiteral_90= 'bytes24'
                    {
                    enumLiteral_90=(Token)match(input,161,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES24EnumLiteralDeclaration_90().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_90, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES24EnumLiteralDeclaration_90());
                      			
                    }

                    }


                    }
                    break;
                case 92 :
                    // InternalMyGrammar.g:7519:3: (enumLiteral_91= 'bytes25' )
                    {
                    // InternalMyGrammar.g:7519:3: (enumLiteral_91= 'bytes25' )
                    // InternalMyGrammar.g:7520:4: enumLiteral_91= 'bytes25'
                    {
                    enumLiteral_91=(Token)match(input,162,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES25EnumLiteralDeclaration_91().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_91, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES25EnumLiteralDeclaration_91());
                      			
                    }

                    }


                    }
                    break;
                case 93 :
                    // InternalMyGrammar.g:7527:3: (enumLiteral_92= 'bytes26' )
                    {
                    // InternalMyGrammar.g:7527:3: (enumLiteral_92= 'bytes26' )
                    // InternalMyGrammar.g:7528:4: enumLiteral_92= 'bytes26'
                    {
                    enumLiteral_92=(Token)match(input,163,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES26EnumLiteralDeclaration_92().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_92, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES26EnumLiteralDeclaration_92());
                      			
                    }

                    }


                    }
                    break;
                case 94 :
                    // InternalMyGrammar.g:7535:3: (enumLiteral_93= 'bytes27' )
                    {
                    // InternalMyGrammar.g:7535:3: (enumLiteral_93= 'bytes27' )
                    // InternalMyGrammar.g:7536:4: enumLiteral_93= 'bytes27'
                    {
                    enumLiteral_93=(Token)match(input,164,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES27EnumLiteralDeclaration_93().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_93, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES27EnumLiteralDeclaration_93());
                      			
                    }

                    }


                    }
                    break;
                case 95 :
                    // InternalMyGrammar.g:7543:3: (enumLiteral_94= 'bytes28' )
                    {
                    // InternalMyGrammar.g:7543:3: (enumLiteral_94= 'bytes28' )
                    // InternalMyGrammar.g:7544:4: enumLiteral_94= 'bytes28'
                    {
                    enumLiteral_94=(Token)match(input,165,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES28EnumLiteralDeclaration_94().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_94, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES28EnumLiteralDeclaration_94());
                      			
                    }

                    }


                    }
                    break;
                case 96 :
                    // InternalMyGrammar.g:7551:3: (enumLiteral_95= 'bytes29' )
                    {
                    // InternalMyGrammar.g:7551:3: (enumLiteral_95= 'bytes29' )
                    // InternalMyGrammar.g:7552:4: enumLiteral_95= 'bytes29'
                    {
                    enumLiteral_95=(Token)match(input,166,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES29EnumLiteralDeclaration_95().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_95, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES29EnumLiteralDeclaration_95());
                      			
                    }

                    }


                    }
                    break;
                case 97 :
                    // InternalMyGrammar.g:7559:3: (enumLiteral_96= 'bytes30' )
                    {
                    // InternalMyGrammar.g:7559:3: (enumLiteral_96= 'bytes30' )
                    // InternalMyGrammar.g:7560:4: enumLiteral_96= 'bytes30'
                    {
                    enumLiteral_96=(Token)match(input,167,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES30EnumLiteralDeclaration_96().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_96, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES30EnumLiteralDeclaration_96());
                      			
                    }

                    }


                    }
                    break;
                case 98 :
                    // InternalMyGrammar.g:7567:3: (enumLiteral_97= 'bytes31' )
                    {
                    // InternalMyGrammar.g:7567:3: (enumLiteral_97= 'bytes31' )
                    // InternalMyGrammar.g:7568:4: enumLiteral_97= 'bytes31'
                    {
                    enumLiteral_97=(Token)match(input,168,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES31EnumLiteralDeclaration_97().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_97, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES31EnumLiteralDeclaration_97());
                      			
                    }

                    }


                    }
                    break;
                case 99 :
                    // InternalMyGrammar.g:7575:3: (enumLiteral_98= 'bytes32' )
                    {
                    // InternalMyGrammar.g:7575:3: (enumLiteral_98= 'bytes32' )
                    // InternalMyGrammar.g:7576:4: enumLiteral_98= 'bytes32'
                    {
                    enumLiteral_98=(Token)match(input,169,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES32EnumLiteralDeclaration_98().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_98, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES32EnumLiteralDeclaration_98());
                      			
                    }

                    }


                    }
                    break;
                case 100 :
                    // InternalMyGrammar.g:7583:3: (enumLiteral_99= 'string' )
                    {
                    // InternalMyGrammar.g:7583:3: (enumLiteral_99= 'string' )
                    // InternalMyGrammar.g:7584:4: enumLiteral_99= 'string'
                    {
                    enumLiteral_99=(Token)match(input,170,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getSTRINGEnumLiteralDeclaration_99().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_99, grammarAccess.getElementaryTypeNameEnumAccess().getSTRINGEnumLiteralDeclaration_99());
                      			
                    }

                    }


                    }
                    break;
                case 101 :
                    // InternalMyGrammar.g:7591:3: (enumLiteral_100= 'address' )
                    {
                    // InternalMyGrammar.g:7591:3: (enumLiteral_100= 'address' )
                    // InternalMyGrammar.g:7592:4: enumLiteral_100= 'address'
                    {
                    enumLiteral_100=(Token)match(input,171,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getADDRESSEnumLiteralDeclaration_100().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_100, grammarAccess.getElementaryTypeNameEnumAccess().getADDRESSEnumLiteralDeclaration_100());
                      			
                    }

                    }


                    }
                    break;
                case 102 :
                    // InternalMyGrammar.g:7599:3: (enumLiteral_101= 'bool' )
                    {
                    // InternalMyGrammar.g:7599:3: (enumLiteral_101= 'bool' )
                    // InternalMyGrammar.g:7600:4: enumLiteral_101= 'bool'
                    {
                    enumLiteral_101=(Token)match(input,172,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBOOLEnumLiteralDeclaration_101().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_101, grammarAccess.getElementaryTypeNameEnumAccess().getBOOLEnumLiteralDeclaration_101());
                      			
                    }

                    }


                    }
                    break;
                case 103 :
                    // InternalMyGrammar.g:7607:3: (enumLiteral_102= 'real' )
                    {
                    // InternalMyGrammar.g:7607:3: (enumLiteral_102= 'real' )
                    // InternalMyGrammar.g:7608:4: enumLiteral_102= 'real'
                    {
                    enumLiteral_102=(Token)match(input,173,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getREALEnumLiteralDeclaration_102().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_102, grammarAccess.getElementaryTypeNameEnumAccess().getREALEnumLiteralDeclaration_102());
                      			
                    }

                    }


                    }
                    break;
                case 104 :
                    // InternalMyGrammar.g:7615:3: (enumLiteral_103= 'ureal' )
                    {
                    // InternalMyGrammar.g:7615:3: (enumLiteral_103= 'ureal' )
                    // InternalMyGrammar.g:7616:4: enumLiteral_103= 'ureal'
                    {
                    enumLiteral_103=(Token)match(input,174,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:7626:1: ruleLocationSpecifierEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) ) ;
    public final Enumerator ruleLocationSpecifierEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:7632:2: ( ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) ) )
            // InternalMyGrammar.g:7633:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) )
            {
            // InternalMyGrammar.g:7633:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) )
            int alt103=3;
            switch ( input.LA(1) ) {
            case 175:
                {
                alt103=1;
                }
                break;
            case 176:
                {
                alt103=2;
                }
                break;
            case 177:
                {
                alt103=3;
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
                    // InternalMyGrammar.g:7634:3: (enumLiteral_0= 'memory' )
                    {
                    // InternalMyGrammar.g:7634:3: (enumLiteral_0= 'memory' )
                    // InternalMyGrammar.g:7635:4: enumLiteral_0= 'memory'
                    {
                    enumLiteral_0=(Token)match(input,175,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:7642:3: (enumLiteral_1= 'storage' )
                    {
                    // InternalMyGrammar.g:7642:3: (enumLiteral_1= 'storage' )
                    // InternalMyGrammar.g:7643:4: enumLiteral_1= 'storage'
                    {
                    enumLiteral_1=(Token)match(input,176,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:7650:3: (enumLiteral_2= 'calldata' )
                    {
                    // InternalMyGrammar.g:7650:3: (enumLiteral_2= 'calldata' )
                    // InternalMyGrammar.g:7651:4: enumLiteral_2= 'calldata'
                    {
                    enumLiteral_2=(Token)match(input,177,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:7661:1: ruleVisibilityEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) ;
    public final Enumerator ruleVisibilityEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:7667:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) )
            // InternalMyGrammar.g:7668:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            {
            // InternalMyGrammar.g:7668:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            int alt104=4;
            switch ( input.LA(1) ) {
            case 178:
                {
                alt104=1;
                }
                break;
            case 179:
                {
                alt104=2;
                }
                break;
            case 180:
                {
                alt104=3;
                }
                break;
            case 181:
                {
                alt104=4;
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
                    // InternalMyGrammar.g:7669:3: (enumLiteral_0= 'public' )
                    {
                    // InternalMyGrammar.g:7669:3: (enumLiteral_0= 'public' )
                    // InternalMyGrammar.g:7670:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,178,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:7677:3: (enumLiteral_1= 'internal' )
                    {
                    // InternalMyGrammar.g:7677:3: (enumLiteral_1= 'internal' )
                    // InternalMyGrammar.g:7678:4: enumLiteral_1= 'internal'
                    {
                    enumLiteral_1=(Token)match(input,179,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:7685:3: (enumLiteral_2= 'private' )
                    {
                    // InternalMyGrammar.g:7685:3: (enumLiteral_2= 'private' )
                    // InternalMyGrammar.g:7686:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,180,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyGrammar.g:7693:3: (enumLiteral_3= 'external' )
                    {
                    // InternalMyGrammar.g:7693:3: (enumLiteral_3= 'external' )
                    // InternalMyGrammar.g:7694:4: enumLiteral_3= 'external'
                    {
                    enumLiteral_3=(Token)match(input,181,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:7704:1: ruleAssignmentOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) ;
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
            // InternalMyGrammar.g:7710:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) )
            // InternalMyGrammar.g:7711:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            {
            // InternalMyGrammar.g:7711:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            int alt105=12;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt105=1;
                }
                break;
            case 182:
                {
                alt105=2;
                }
                break;
            case 183:
                {
                alt105=3;
                }
                break;
            case 184:
                {
                alt105=4;
                }
                break;
            case 185:
                {
                alt105=5;
                }
                break;
            case 186:
                {
                alt105=6;
                }
                break;
            case 187:
                {
                alt105=7;
                }
                break;
            case 188:
                {
                alt105=8;
                }
                break;
            case 189:
                {
                alt105=9;
                }
                break;
            case 190:
                {
                alt105=10;
                }
                break;
            case 191:
                {
                alt105=11;
                }
                break;
            case 192:
                {
                alt105=12;
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
                    // InternalMyGrammar.g:7712:3: (enumLiteral_0= '=' )
                    {
                    // InternalMyGrammar.g:7712:3: (enumLiteral_0= '=' )
                    // InternalMyGrammar.g:7713:4: enumLiteral_0= '='
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
                    // InternalMyGrammar.g:7720:3: (enumLiteral_1= '|=' )
                    {
                    // InternalMyGrammar.g:7720:3: (enumLiteral_1= '|=' )
                    // InternalMyGrammar.g:7721:4: enumLiteral_1= '|='
                    {
                    enumLiteral_1=(Token)match(input,182,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:7728:3: (enumLiteral_2= '^=' )
                    {
                    // InternalMyGrammar.g:7728:3: (enumLiteral_2= '^=' )
                    // InternalMyGrammar.g:7729:4: enumLiteral_2= '^='
                    {
                    enumLiteral_2=(Token)match(input,183,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyGrammar.g:7736:3: (enumLiteral_3= '&=' )
                    {
                    // InternalMyGrammar.g:7736:3: (enumLiteral_3= '&=' )
                    // InternalMyGrammar.g:7737:4: enumLiteral_3= '&='
                    {
                    enumLiteral_3=(Token)match(input,184,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyGrammar.g:7744:3: (enumLiteral_4= '<<=' )
                    {
                    // InternalMyGrammar.g:7744:3: (enumLiteral_4= '<<=' )
                    // InternalMyGrammar.g:7745:4: enumLiteral_4= '<<='
                    {
                    enumLiteral_4=(Token)match(input,185,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyGrammar.g:7752:3: (enumLiteral_5= '>>=' )
                    {
                    // InternalMyGrammar.g:7752:3: (enumLiteral_5= '>>=' )
                    // InternalMyGrammar.g:7753:4: enumLiteral_5= '>>='
                    {
                    enumLiteral_5=(Token)match(input,186,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyGrammar.g:7760:3: (enumLiteral_6= '>>>=' )
                    {
                    // InternalMyGrammar.g:7760:3: (enumLiteral_6= '>>>=' )
                    // InternalMyGrammar.g:7761:4: enumLiteral_6= '>>>='
                    {
                    enumLiteral_6=(Token)match(input,187,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyGrammar.g:7768:3: (enumLiteral_7= '+=' )
                    {
                    // InternalMyGrammar.g:7768:3: (enumLiteral_7= '+=' )
                    // InternalMyGrammar.g:7769:4: enumLiteral_7= '+='
                    {
                    enumLiteral_7=(Token)match(input,188,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMyGrammar.g:7776:3: (enumLiteral_8= '-=' )
                    {
                    // InternalMyGrammar.g:7776:3: (enumLiteral_8= '-=' )
                    // InternalMyGrammar.g:7777:4: enumLiteral_8= '-='
                    {
                    enumLiteral_8=(Token)match(input,189,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMyGrammar.g:7784:3: (enumLiteral_9= '*=' )
                    {
                    // InternalMyGrammar.g:7784:3: (enumLiteral_9= '*=' )
                    // InternalMyGrammar.g:7785:4: enumLiteral_9= '*='
                    {
                    enumLiteral_9=(Token)match(input,190,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalMyGrammar.g:7792:3: (enumLiteral_10= '/=' )
                    {
                    // InternalMyGrammar.g:7792:3: (enumLiteral_10= '/=' )
                    // InternalMyGrammar.g:7793:4: enumLiteral_10= '/='
                    {
                    enumLiteral_10=(Token)match(input,191,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalMyGrammar.g:7800:3: (enumLiteral_11= '%=' )
                    {
                    // InternalMyGrammar.g:7800:3: (enumLiteral_11= '%=' )
                    // InternalMyGrammar.g:7801:4: enumLiteral_11= '%='
                    {
                    enumLiteral_11=(Token)match(input,192,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:7811:1: ruleEqualityOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:7817:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalMyGrammar.g:7818:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalMyGrammar.g:7818:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==193) ) {
                alt106=1;
            }
            else if ( (LA106_0==194) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalMyGrammar.g:7819:3: (enumLiteral_0= '==' )
                    {
                    // InternalMyGrammar.g:7819:3: (enumLiteral_0= '==' )
                    // InternalMyGrammar.g:7820:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,193,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:7827:3: (enumLiteral_1= '!=' )
                    {
                    // InternalMyGrammar.g:7827:3: (enumLiteral_1= '!=' )
                    // InternalMyGrammar.g:7828:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,194,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:7838:1: ruleComparisonOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) ;
    public final Enumerator ruleComparisonOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:7844:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) )
            // InternalMyGrammar.g:7845:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            {
            // InternalMyGrammar.g:7845:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            int alt107=5;
            switch ( input.LA(1) ) {
            case 195:
                {
                alt107=1;
                }
                break;
            case 196:
                {
                alt107=2;
                }
                break;
            case 197:
                {
                alt107=3;
                }
                break;
            case 198:
                {
                alt107=4;
                }
                break;
            case 199:
                {
                alt107=5;
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
                    // InternalMyGrammar.g:7846:3: (enumLiteral_0= '<' )
                    {
                    // InternalMyGrammar.g:7846:3: (enumLiteral_0= '<' )
                    // InternalMyGrammar.g:7847:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,195,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:7854:3: (enumLiteral_1= '>' )
                    {
                    // InternalMyGrammar.g:7854:3: (enumLiteral_1= '>' )
                    // InternalMyGrammar.g:7855:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,196,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:7862:3: (enumLiteral_2= '<=' )
                    {
                    // InternalMyGrammar.g:7862:3: (enumLiteral_2= '<=' )
                    // InternalMyGrammar.g:7863:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,197,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyGrammar.g:7870:3: (enumLiteral_3= '>=' )
                    {
                    // InternalMyGrammar.g:7870:3: (enumLiteral_3= '>=' )
                    // InternalMyGrammar.g:7871:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,198,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyGrammar.g:7878:3: (enumLiteral_4= 'in' )
                    {
                    // InternalMyGrammar.g:7878:3: (enumLiteral_4= 'in' )
                    // InternalMyGrammar.g:7879:4: enumLiteral_4= 'in'
                    {
                    enumLiteral_4=(Token)match(input,199,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:7889:1: ruleShiftOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) ;
    public final Enumerator ruleShiftOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:7895:2: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) )
            // InternalMyGrammar.g:7896:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            {
            // InternalMyGrammar.g:7896:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            int alt108=3;
            switch ( input.LA(1) ) {
            case 200:
                {
                alt108=1;
                }
                break;
            case 201:
                {
                alt108=2;
                }
                break;
            case 202:
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
                    // InternalMyGrammar.g:7897:3: (enumLiteral_0= '<<' )
                    {
                    // InternalMyGrammar.g:7897:3: (enumLiteral_0= '<<' )
                    // InternalMyGrammar.g:7898:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,200,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:7905:3: (enumLiteral_1= '>>' )
                    {
                    // InternalMyGrammar.g:7905:3: (enumLiteral_1= '>>' )
                    // InternalMyGrammar.g:7906:4: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,201,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:7913:3: (enumLiteral_2= '>>>' )
                    {
                    // InternalMyGrammar.g:7913:3: (enumLiteral_2= '>>>' )
                    // InternalMyGrammar.g:7914:4: enumLiteral_2= '>>>'
                    {
                    enumLiteral_2=(Token)match(input,202,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:7924:1: ruleAdditionOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:7930:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalMyGrammar.g:7931:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalMyGrammar.g:7931:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==64) ) {
                alt109=1;
            }
            else if ( (LA109_0==65) ) {
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
                    // InternalMyGrammar.g:7932:3: (enumLiteral_0= '+' )
                    {
                    // InternalMyGrammar.g:7932:3: (enumLiteral_0= '+' )
                    // InternalMyGrammar.g:7933:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:7940:3: (enumLiteral_1= '-' )
                    {
                    // InternalMyGrammar.g:7940:3: (enumLiteral_1= '-' )
                    // InternalMyGrammar.g:7941:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:7951:1: ruleMulDivModOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMulDivModOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:7957:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalMyGrammar.g:7958:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalMyGrammar.g:7958:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt110=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt110=1;
                }
                break;
            case 203:
                {
                alt110=2;
                }
                break;
            case 204:
                {
                alt110=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalMyGrammar.g:7959:3: (enumLiteral_0= '*' )
                    {
                    // InternalMyGrammar.g:7959:3: (enumLiteral_0= '*' )
                    // InternalMyGrammar.g:7960:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:7967:3: (enumLiteral_1= '/' )
                    {
                    // InternalMyGrammar.g:7967:3: (enumLiteral_1= '/' )
                    // InternalMyGrammar.g:7968:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,203,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMulDivModOpEnumAccess().getDIVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:7975:3: (enumLiteral_2= '%' )
                    {
                    // InternalMyGrammar.g:7975:3: (enumLiteral_2= '%' )
                    // InternalMyGrammar.g:7976:4: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,204,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:7986:1: ruleIncDecOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncDecOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:7992:2: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalMyGrammar.g:7993:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalMyGrammar.g:7993:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==67) ) {
                alt111=1;
            }
            else if ( (LA111_0==68) ) {
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
                    // InternalMyGrammar.g:7994:3: (enumLiteral_0= '++' )
                    {
                    // InternalMyGrammar.g:7994:3: (enumLiteral_0= '++' )
                    // InternalMyGrammar.g:7995:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:8002:3: (enumLiteral_1= '--' )
                    {
                    // InternalMyGrammar.g:8002:3: (enumLiteral_1= '--' )
                    // InternalMyGrammar.g:8003:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:8013:1: ruleBooleanLiteralEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteralEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:8019:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalMyGrammar.g:8020:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalMyGrammar.g:8020:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==205) ) {
                alt112=1;
            }
            else if ( (LA112_0==206) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalMyGrammar.g:8021:3: (enumLiteral_0= 'true' )
                    {
                    // InternalMyGrammar.g:8021:3: (enumLiteral_0= 'true' )
                    // InternalMyGrammar.g:8022:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,205,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:8029:3: (enumLiteral_1= 'false' )
                    {
                    // InternalMyGrammar.g:8029:3: (enumLiteral_1= 'false' )
                    // InternalMyGrammar.g:8030:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,206,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:8040:1: ruleEtherSubDenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) ;
    public final Enumerator ruleEtherSubDenominationEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:8046:2: ( ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) )
            // InternalMyGrammar.g:8047:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            {
            // InternalMyGrammar.g:8047:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            int alt113=4;
            switch ( input.LA(1) ) {
            case 207:
                {
                alt113=1;
                }
                break;
            case 208:
                {
                alt113=2;
                }
                break;
            case 209:
                {
                alt113=3;
                }
                break;
            case 210:
                {
                alt113=4;
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
                    // InternalMyGrammar.g:8048:3: (enumLiteral_0= 'wei' )
                    {
                    // InternalMyGrammar.g:8048:3: (enumLiteral_0= 'wei' )
                    // InternalMyGrammar.g:8049:4: enumLiteral_0= 'wei'
                    {
                    enumLiteral_0=(Token)match(input,207,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getWEIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEtherSubDenominationEnumAccess().getWEIEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:8056:3: (enumLiteral_1= 'szabo' )
                    {
                    // InternalMyGrammar.g:8056:3: (enumLiteral_1= 'szabo' )
                    // InternalMyGrammar.g:8057:4: enumLiteral_1= 'szabo'
                    {
                    enumLiteral_1=(Token)match(input,208,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getSZABOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEtherSubDenominationEnumAccess().getSZABOEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:8064:3: (enumLiteral_2= 'finney' )
                    {
                    // InternalMyGrammar.g:8064:3: (enumLiteral_2= 'finney' )
                    // InternalMyGrammar.g:8065:4: enumLiteral_2= 'finney'
                    {
                    enumLiteral_2=(Token)match(input,209,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getFINNEYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEtherSubDenominationEnumAccess().getFINNEYEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyGrammar.g:8072:3: (enumLiteral_3= 'ether' )
                    {
                    // InternalMyGrammar.g:8072:3: (enumLiteral_3= 'ether' )
                    // InternalMyGrammar.g:8073:4: enumLiteral_3= 'ether'
                    {
                    enumLiteral_3=(Token)match(input,210,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:8083:1: ruleTimeSubdenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) ;
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
            // InternalMyGrammar.g:8089:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) )
            // InternalMyGrammar.g:8090:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            {
            // InternalMyGrammar.g:8090:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            int alt114=6;
            switch ( input.LA(1) ) {
            case 211:
                {
                alt114=1;
                }
                break;
            case 212:
                {
                alt114=2;
                }
                break;
            case 213:
                {
                alt114=3;
                }
                break;
            case 214:
                {
                alt114=4;
                }
                break;
            case 215:
                {
                alt114=5;
                }
                break;
            case 216:
                {
                alt114=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalMyGrammar.g:8091:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalMyGrammar.g:8091:3: (enumLiteral_0= 'seconds' )
                    // InternalMyGrammar.g:8092:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,211,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeSubdenominationEnumAccess().getSECONDSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:8099:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalMyGrammar.g:8099:3: (enumLiteral_1= 'minutes' )
                    // InternalMyGrammar.g:8100:4: enumLiteral_1= 'minutes'
                    {
                    enumLiteral_1=(Token)match(input,212,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getMINUTESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeSubdenominationEnumAccess().getMINUTESEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyGrammar.g:8107:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalMyGrammar.g:8107:3: (enumLiteral_2= 'hours' )
                    // InternalMyGrammar.g:8108:4: enumLiteral_2= 'hours'
                    {
                    enumLiteral_2=(Token)match(input,213,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getHOURSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeSubdenominationEnumAccess().getHOURSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyGrammar.g:8115:3: (enumLiteral_3= 'days' )
                    {
                    // InternalMyGrammar.g:8115:3: (enumLiteral_3= 'days' )
                    // InternalMyGrammar.g:8116:4: enumLiteral_3= 'days'
                    {
                    enumLiteral_3=(Token)match(input,214,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getDAYSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTimeSubdenominationEnumAccess().getDAYSEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyGrammar.g:8123:3: (enumLiteral_4= 'weeks' )
                    {
                    // InternalMyGrammar.g:8123:3: (enumLiteral_4= 'weeks' )
                    // InternalMyGrammar.g:8124:4: enumLiteral_4= 'weeks'
                    {
                    enumLiteral_4=(Token)match(input,215,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getWEEKSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTimeSubdenominationEnumAccess().getWEEKSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyGrammar.g:8131:3: (enumLiteral_5= 'years' )
                    {
                    // InternalMyGrammar.g:8131:3: (enumLiteral_5= 'years' )
                    // InternalMyGrammar.g:8132:4: enumLiteral_5= 'years'
                    {
                    enumLiteral_5=(Token)match(input,216,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyGrammar.g:8142:1: ruleSpecialExpressionTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) ;
    public final Enumerator ruleSpecialExpressionTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyGrammar.g:8148:2: ( ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) )
            // InternalMyGrammar.g:8149:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            {
            // InternalMyGrammar.g:8149:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==217) ) {
                alt115=1;
            }
            else if ( (LA115_0==218) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // InternalMyGrammar.g:8150:3: (enumLiteral_0= 'super' )
                    {
                    // InternalMyGrammar.g:8150:3: (enumLiteral_0= 'super' )
                    // InternalMyGrammar.g:8151:4: enumLiteral_0= 'super'
                    {
                    enumLiteral_0=(Token)match(input,217,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSpecialExpressionTypeEnumAccess().getSUPEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSpecialExpressionTypeEnumAccess().getSUPEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGrammar.g:8158:3: (enumLiteral_1= 'this' )
                    {
                    // InternalMyGrammar.g:8158:3: (enumLiteral_1= 'this' )
                    // InternalMyGrammar.g:8159:4: enumLiteral_1= 'this'
                    {
                    enumLiteral_1=(Token)match(input,218,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalMyGrammar
    public final void synpred1_InternalMyGrammar_fragment() throws RecognitionException {   
        // InternalMyGrammar.g:3967:5: ( 'else' )
        // InternalMyGrammar.g:3967:6: 'else'
        {
        match(input,48,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMyGrammar

    // $ANTLR start synpred2_InternalMyGrammar
    public final void synpred2_InternalMyGrammar_fragment() throws RecognitionException {   
        // InternalMyGrammar.g:4109:4: ( ';' )
        // InternalMyGrammar.g:4109:5: ';'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMyGrammar

    // $ANTLR start synpred3_InternalMyGrammar
    public final void synpred3_InternalMyGrammar_fragment() throws RecognitionException {   
        // InternalMyGrammar.g:5258:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )
        // InternalMyGrammar.g:5258:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        {
        // InternalMyGrammar.g:5258:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        // InternalMyGrammar.g:5259:5: () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) )
        {
        // InternalMyGrammar.g:5259:5: ()
        // InternalMyGrammar.g:5260:5: 
        {
        }

        // InternalMyGrammar.g:5261:5: ( ( ruleAdditionOpEnum ) )
        // InternalMyGrammar.g:5262:6: ( ruleAdditionOpEnum )
        {
        // InternalMyGrammar.g:5262:6: ( ruleAdditionOpEnum )
        // InternalMyGrammar.g:5263:7: ruleAdditionOpEnum
        {
        pushFollow(FOLLOW_19);
        ruleAdditionOpEnum();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyGrammar.g:5266:5: ( ( ruleMulDivMod ) )
        // InternalMyGrammar.g:5267:6: ( ruleMulDivMod )
        {
        // InternalMyGrammar.g:5267:6: ( ruleMulDivMod )
        // InternalMyGrammar.g:5268:7: ruleMulDivMod
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
    // $ANTLR end synpred3_InternalMyGrammar

    // Delegated rules

    public final boolean synpred3_InternalMyGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMyGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMyGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMyGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMyGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\5\1\uffff\4\36\6\uffff";
    static final String dfa_3s = "\1\u00b5\1\uffff\4\43\6\uffff";
    static final String dfa_4s = "\1\uffff\1\7\4\uffff\1\2\1\3\1\4\1\5\1\6\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\21\uffff\1\1\12\uffff\1\6\1\7\2\uffff\1\10\3\uffff\1\10\1\uffff\1\11\1\12\31\uffff\150\10\3\uffff\1\2\1\3\1\4\1\5",
            "",
            "\2\13\2\uffff\1\6\1\7",
            "\2\13\2\uffff\1\6\1\7",
            "\2\13\2\uffff\1\6\1\7",
            "\2\13\2\uffff\1\6\1\7",
            "",
            "",
            "",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 639:3: ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )*";
        }
    }
    static final String dfa_7s = "\154\uffff";
    static final String dfa_8s = "\1\4\150\5\3\uffff";
    static final String dfa_9s = "\1\u00da\150\u00b5\3\uffff";
    static final String dfa_10s = "\151\uffff\1\1\1\2\1\3";
    static final String dfa_11s = "\154\uffff}>";
    static final String[] dfa_12s = {
            "\10\153\17\uffff\1\153\12\uffff\1\151\3\uffff\1\152\23\uffff\11\153\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\36\uffff\2\153\12\uffff\2\153",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\25\uffff\1\153\5\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2598:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2842:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000005010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000344C00800020L,0xFFFFFFFFFFFFFF80L,0x003C7FFFFFFFFFFFL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xC000004018000FF0L,0xFFFFFFFFFFFFFFFFL,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xC000004008000FF0L,0xFFFFFFFFFFFFFFFFL,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000300220020L,0x0000000000000000L,0x003C000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000044000800020L,0xFFFFFFFFFFFFFF80L,0x00007FFFFFFFFFFFL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002200000020L,0x0000000000000000L,0x003F800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFFFFFFF80L,0x00007FFFFFFFFFFFL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000044000000020L,0xFFFFFFFFFFFFFF80L,0x00007FFFFFFFFFFFL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xC000024008000FF0L,0xFFFFFFFFFFFFFFFFL,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xC000004018400FF0L,0xFFFFFFFFFFFFFFFFL,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC000004008400FF0L,0xFFFFFFFFFFFFFFFFL,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002208000020L,0x0000000000000000L,0x003F800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000090008000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000044010000020L,0xFFFFFFFFFFFFFF80L,0x00007FFFFFFFFFFFL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000002200000022L,0x0000000000000000L,0x003F800000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000020L,0xFFFFFFFFFFFFFF80L,0x00007FFFFFFFFFFFL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xC0FEC44008200FF0L,0xFFFFFFFFFFFFFFFFL,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xC0FEC44008220FF0L,0xFFFFFFFFFFFFFFFFL,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xC000004008020FF0L,0xFFFFFFFFFFFFFFFFL,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xC0FEC44018200FF0L,0xFFFFFFFFFFFFFFFFL,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xC0FEC44008A00FF0L,0xFFFFFFFFFFFFFFFFL,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000003200000022L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000004008000FF0L,0xFFFFFFFFFFFFFFE0L,0x00007FFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000080000000000L});

}