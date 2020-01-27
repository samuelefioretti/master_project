package org.unicam.myGrammar.parser.antlr.internal;

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
import org.unicam.myGrammar.services.OptGrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalOptGrammarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEX", "RULE_DECIMAL", "RULE_BLOCK", "RULE_MSG", "RULE_TX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'*'", "'as'", "'from'", "'{'", "','", "'}'", "'contract'", "'payable'", "'function'", "'returns'", "'('", "')'", "':'", "'constant'", "'struct'", "'enum'", "'='", "'indexed'", "'mapping'", "'=>'", "'['", "']'", "'var'", "'.'", "'modifier'", "'event'", "'delete'", "'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'return'", "'throw'", "'_'", "'NOT'", "'TERNARY'", "'?'", "'gasleft'", "'blockhash'", "'addmod'", "'mulmod'", "'ecrecover'", "'keccak256'", "'sha256'", "'ripemd160'", "'+'", "'-'", "'/'", "'now'", "'int'", "'int16'", "'int24'", "'int32'", "'int40'", "'int48'", "'int56'", "'int64'", "'int72'", "'int80'", "'int88'", "'int96'", "'int104'", "'int112'", "'int120'", "'int128'", "'int136'", "'int144'", "'int152'", "'int160'", "'int168'", "'int178'", "'int184'", "'int192'", "'int200'", "'int208'", "'int216'", "'int224'", "'int232'", "'int240'", "'int248'", "'int256'", "'uint'", "'uint8'", "'uint16'", "'uint24'", "'uint32'", "'uint40'", "'uint48'", "'uint56'", "'uint64'", "'uint72'", "'uint80'", "'uint88'", "'uint96'", "'uint104'", "'uint112'", "'uint120'", "'uint128'", "'uint136'", "'uint144'", "'uint152'", "'uint160'", "'uint168'", "'uint178'", "'uint184'", "'uint192'", "'uint200'", "'uint208'", "'uint216'", "'uint224'", "'uint232'", "'uint240'", "'uint248'", "'uint256'", "'byte'", "'bytes'", "'bytes1'", "'bytes2'", "'bytes3'", "'bytes4'", "'bytes5'", "'bytes6'", "'bytes7'", "'bytes8'", "'bytes9'", "'bytes10'", "'bytes11'", "'bytes12'", "'bytes13'", "'bytes14'", "'bytes15'", "'bytes16'", "'bytes17'", "'bytes18'", "'bytes19'", "'bytes20'", "'bytes21'", "'bytes22'", "'bytes23'", "'bytes24'", "'bytes25'", "'bytes26'", "'bytes27'", "'bytes28'", "'bytes29'", "'bytes30'", "'bytes31'", "'bytes32'", "'string'", "'address'", "'bool'", "'real'", "'ureal'", "'!='", "'=='", "'&&'", "'||'", "'>='", "'<='", "'>'", "'<'", "'memory'", "'storage'", "'calldata'", "'public'", "'internal'", "'private'", "'external'", "'true'", "'false'", "'wei'", "'szabo'", "'finney'", "'ether'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'years'"
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
    public static final int RULE_DECIMAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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


        public InternalOptGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOptGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOptGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOptGrammar.g"; }



     	private OptGrammarGrammarAccess grammarAccess;

        public InternalOptGrammarParser(TokenStream input, OptGrammarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Solidity";
       	}

       	@Override
       	protected OptGrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSolidity"
    // InternalOptGrammar.g:65:1: entryRuleSolidity returns [EObject current=null] : iv_ruleSolidity= ruleSolidity EOF ;
    public final EObject entryRuleSolidity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolidity = null;


        try {
            // InternalOptGrammar.g:65:49: (iv_ruleSolidity= ruleSolidity EOF )
            // InternalOptGrammar.g:66:2: iv_ruleSolidity= ruleSolidity EOF
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
    // InternalOptGrammar.g:72:1: ruleSolidity returns [EObject current=null] : ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) )* ;
    public final EObject ruleSolidity() throws RecognitionException {
        EObject current = null;

        EObject lv_importDirective_0_0 = null;

        EObject lv_contract_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:78:2: ( ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) )* )
            // InternalOptGrammar.g:79:2: ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) )*
            {
            // InternalOptGrammar.g:79:2: ( ( (lv_importDirective_0_0= ruleImportDirective ) ) | ( (lv_contract_1_0= ruleContract ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }
                else if ( (LA1_0==24) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOptGrammar.g:80:3: ( (lv_importDirective_0_0= ruleImportDirective ) )
            	    {
            	    // InternalOptGrammar.g:80:3: ( (lv_importDirective_0_0= ruleImportDirective ) )
            	    // InternalOptGrammar.g:81:4: (lv_importDirective_0_0= ruleImportDirective )
            	    {
            	    // InternalOptGrammar.g:81:4: (lv_importDirective_0_0= ruleImportDirective )
            	    // InternalOptGrammar.g:82:5: lv_importDirective_0_0= ruleImportDirective
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
            	      						"org.unicam.myGrammar.OptGrammar.ImportDirective");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptGrammar.g:100:3: ( (lv_contract_1_0= ruleContract ) )
            	    {
            	    // InternalOptGrammar.g:100:3: ( (lv_contract_1_0= ruleContract ) )
            	    // InternalOptGrammar.g:101:4: (lv_contract_1_0= ruleContract )
            	    {
            	    // InternalOptGrammar.g:101:4: (lv_contract_1_0= ruleContract )
            	    // InternalOptGrammar.g:102:5: lv_contract_1_0= ruleContract
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
            	      						"org.unicam.myGrammar.OptGrammar.Contract");
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
    // InternalOptGrammar.g:123:1: entryRuleImportDirective returns [EObject current=null] : iv_ruleImportDirective= ruleImportDirective EOF ;
    public final EObject entryRuleImportDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDirective = null;


        try {
            // InternalOptGrammar.g:123:56: (iv_ruleImportDirective= ruleImportDirective EOF )
            // InternalOptGrammar.g:124:2: iv_ruleImportDirective= ruleImportDirective EOF
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
    // InternalOptGrammar.g:130:1: ruleImportDirective returns [EObject current=null] : ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) ) ;
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
            // InternalOptGrammar.g:136:2: ( ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) ) )
            // InternalOptGrammar.g:137:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) )
            {
            // InternalOptGrammar.g:137:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) | (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                switch ( input.LA(2) ) {
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
                case 21:
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
                    // InternalOptGrammar.g:138:3: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
                    {
                    // InternalOptGrammar.g:138:3: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
                    // InternalOptGrammar.g:139:4: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getImportDirectiveAccess().getImportKeyword_0_0());
                      			
                    }
                    // InternalOptGrammar.g:143:4: ( (lv_importURI_1_0= RULE_STRING ) )
                    // InternalOptGrammar.g:144:5: (lv_importURI_1_0= RULE_STRING )
                    {
                    // InternalOptGrammar.g:144:5: (lv_importURI_1_0= RULE_STRING )
                    // InternalOptGrammar.g:145:6: lv_importURI_1_0= RULE_STRING
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
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
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
                    // InternalOptGrammar.g:167:3: (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' )
                    {
                    // InternalOptGrammar.g:167:3: (otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';' )
                    // InternalOptGrammar.g:168:4: otherlv_3= 'import' otherlv_4= '*' otherlv_5= 'as' ( (lv_unitAlias_6_0= RULE_ID ) ) otherlv_7= 'from' ( (lv_importURI_8_0= RULE_STRING ) ) otherlv_9= ';'
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
                    // InternalOptGrammar.g:180:4: ( (lv_unitAlias_6_0= RULE_ID ) )
                    // InternalOptGrammar.g:181:5: (lv_unitAlias_6_0= RULE_ID )
                    {
                    // InternalOptGrammar.g:181:5: (lv_unitAlias_6_0= RULE_ID )
                    // InternalOptGrammar.g:182:6: lv_unitAlias_6_0= RULE_ID
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
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getImportDirectiveAccess().getFromKeyword_1_4());
                      			
                    }
                    // InternalOptGrammar.g:202:4: ( (lv_importURI_8_0= RULE_STRING ) )
                    // InternalOptGrammar.g:203:5: (lv_importURI_8_0= RULE_STRING )
                    {
                    // InternalOptGrammar.g:203:5: (lv_importURI_8_0= RULE_STRING )
                    // InternalOptGrammar.g:204:6: lv_importURI_8_0= RULE_STRING
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
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
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
                    // InternalOptGrammar.g:226:3: (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' )
                    {
                    // InternalOptGrammar.g:226:3: (otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';' )
                    // InternalOptGrammar.g:227:4: otherlv_10= 'import' otherlv_11= '{' ( (lv_symbolAliases_12_0= ruleSymbolAlias ) ) (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )? otherlv_15= '}' otherlv_16= 'from' ( (lv_importURI_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getImportDirectiveAccess().getImportKeyword_2_0());
                      			
                    }
                    otherlv_11=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getImportDirectiveAccess().getLeftCurlyBracketKeyword_2_1());
                      			
                    }
                    // InternalOptGrammar.g:235:4: ( (lv_symbolAliases_12_0= ruleSymbolAlias ) )
                    // InternalOptGrammar.g:236:5: (lv_symbolAliases_12_0= ruleSymbolAlias )
                    {
                    // InternalOptGrammar.g:236:5: (lv_symbolAliases_12_0= ruleSymbolAlias )
                    // InternalOptGrammar.g:237:6: lv_symbolAliases_12_0= ruleSymbolAlias
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
                      							"org.unicam.myGrammar.OptGrammar.SymbolAlias");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:254:4: (otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==22) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalOptGrammar.g:255:5: otherlv_13= ',' ( (lv_symbolAliases_14_0= ruleSymbolAlias ) )
                            {
                            otherlv_13=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getImportDirectiveAccess().getCommaKeyword_2_3_0());
                              				
                            }
                            // InternalOptGrammar.g:259:5: ( (lv_symbolAliases_14_0= ruleSymbolAlias ) )
                            // InternalOptGrammar.g:260:6: (lv_symbolAliases_14_0= ruleSymbolAlias )
                            {
                            // InternalOptGrammar.g:260:6: (lv_symbolAliases_14_0= ruleSymbolAlias )
                            // InternalOptGrammar.g:261:7: lv_symbolAliases_14_0= ruleSymbolAlias
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
                              								"org.unicam.myGrammar.OptGrammar.SymbolAlias");
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
                    // InternalOptGrammar.g:287:4: ( (lv_importURI_17_0= RULE_STRING ) )
                    // InternalOptGrammar.g:288:5: (lv_importURI_17_0= RULE_STRING )
                    {
                    // InternalOptGrammar.g:288:5: (lv_importURI_17_0= RULE_STRING )
                    // InternalOptGrammar.g:289:6: lv_importURI_17_0= RULE_STRING
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
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
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
    // InternalOptGrammar.g:314:1: entryRuleSymbolAlias returns [EObject current=null] : iv_ruleSymbolAlias= ruleSymbolAlias EOF ;
    public final EObject entryRuleSymbolAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolAlias = null;


        try {
            // InternalOptGrammar.g:314:52: (iv_ruleSymbolAlias= ruleSymbolAlias EOF )
            // InternalOptGrammar.g:315:2: iv_ruleSymbolAlias= ruleSymbolAlias EOF
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
    // InternalOptGrammar.g:321:1: ruleSymbolAlias returns [EObject current=null] : ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSymbolAlias() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:327:2: ( ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) ) )
            // InternalOptGrammar.g:328:2: ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )
            {
            // InternalOptGrammar.g:328:2: ( ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )
            // InternalOptGrammar.g:329:3: ( (lv_symbol_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
            {
            // InternalOptGrammar.g:329:3: ( (lv_symbol_0_0= RULE_ID ) )
            // InternalOptGrammar.g:330:4: (lv_symbol_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:330:4: (lv_symbol_0_0= RULE_ID )
            // InternalOptGrammar.g:331:5: lv_symbol_0_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSymbolAliasAccess().getAsKeyword_1());
              		
            }
            // InternalOptGrammar.g:351:3: ( (lv_alias_2_0= RULE_ID ) )
            // InternalOptGrammar.g:352:4: (lv_alias_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:352:4: (lv_alias_2_0= RULE_ID )
            // InternalOptGrammar.g:353:5: lv_alias_2_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // InternalOptGrammar.g:373:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalOptGrammar.g:373:49: (iv_ruleContract= ruleContract EOF )
            // InternalOptGrammar.g:374:2: iv_ruleContract= ruleContract EOF
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
    // InternalOptGrammar.g:380:1: ruleContract returns [EObject current=null] : (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier ) ) (otherlv_3= ',' ( (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_5_0= ruleDefinitionBody ) ) ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_inheritanceSpecifiers_2_0 = null;

        EObject lv_inheritanceSpecifiers_4_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:386:2: ( (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier ) ) (otherlv_3= ',' ( (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_5_0= ruleDefinitionBody ) ) ) )
            // InternalOptGrammar.g:387:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier ) ) (otherlv_3= ',' ( (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_5_0= ruleDefinitionBody ) ) )
            {
            // InternalOptGrammar.g:387:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier ) ) (otherlv_3= ',' ( (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_5_0= ruleDefinitionBody ) ) )
            // InternalOptGrammar.g:388:3: otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier ) ) (otherlv_3= ',' ( (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_5_0= ruleDefinitionBody ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
              		
            }
            // InternalOptGrammar.g:392:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOptGrammar.g:393:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:393:4: (lv_name_1_0= RULE_ID )
            // InternalOptGrammar.g:394:5: lv_name_1_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalOptGrammar.g:410:3: ( ( (lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier ) ) (otherlv_3= ',' ( (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOptGrammar.g:411:4: ( (lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier ) ) (otherlv_3= ',' ( (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier ) ) )*
                    {
                    // InternalOptGrammar.g:411:4: ( (lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier ) )
                    // InternalOptGrammar.g:412:5: (lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier )
                    {
                    // InternalOptGrammar.g:412:5: (lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier )
                    // InternalOptGrammar.g:413:6: lv_inheritanceSpecifiers_2_0= ruleInheritanceSpecifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContractAccess().getInheritanceSpecifiersInheritanceSpecifierParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_inheritanceSpecifiers_2_0=ruleInheritanceSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getContractRule());
                      						}
                      						add(
                      							current,
                      							"inheritanceSpecifiers",
                      							lv_inheritanceSpecifiers_2_0,
                      							"org.unicam.myGrammar.OptGrammar.InheritanceSpecifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:430:4: (otherlv_3= ',' ( (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalOptGrammar.g:431:5: otherlv_3= ',' ( (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getContractAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:435:5: ( (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier ) )
                    	    // InternalOptGrammar.g:436:6: (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier )
                    	    {
                    	    // InternalOptGrammar.g:436:6: (lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier )
                    	    // InternalOptGrammar.g:437:7: lv_inheritanceSpecifiers_4_0= ruleInheritanceSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContractAccess().getInheritanceSpecifiersInheritanceSpecifierParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_inheritanceSpecifiers_4_0=ruleInheritanceSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getContractRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"inheritanceSpecifiers",
                    	      								lv_inheritanceSpecifiers_4_0,
                    	      								"org.unicam.myGrammar.OptGrammar.InheritanceSpecifier");
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

            // InternalOptGrammar.g:456:3: ( (lv_body_5_0= ruleDefinitionBody ) )
            // InternalOptGrammar.g:457:4: (lv_body_5_0= ruleDefinitionBody )
            {
            // InternalOptGrammar.g:457:4: (lv_body_5_0= ruleDefinitionBody )
            // InternalOptGrammar.g:458:5: lv_body_5_0= ruleDefinitionBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContractAccess().getBodyDefinitionBodyParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_5_0=ruleDefinitionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContractRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_5_0,
              						"org.unicam.myGrammar.OptGrammar.DefinitionBody");
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


    // $ANTLR start "entryRuleInheritanceSpecifier"
    // InternalOptGrammar.g:479:1: entryRuleInheritanceSpecifier returns [EObject current=null] : iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF ;
    public final EObject entryRuleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceSpecifier = null;


        try {
            // InternalOptGrammar.g:479:61: (iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF )
            // InternalOptGrammar.g:480:2: iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF
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
    // InternalOptGrammar.g:486:1: ruleInheritanceSpecifier returns [EObject current=null] : ( ( (lv_SuperType_0_0= ruleContract ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        EObject lv_SuperType_0_0 = null;

        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:492:2: ( ( ( (lv_SuperType_0_0= ruleContract ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalOptGrammar.g:493:2: ( ( (lv_SuperType_0_0= ruleContract ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalOptGrammar.g:493:2: ( ( (lv_SuperType_0_0= ruleContract ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalOptGrammar.g:494:3: ( (lv_SuperType_0_0= ruleContract ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalOptGrammar.g:494:3: ( (lv_SuperType_0_0= ruleContract ) )
            // InternalOptGrammar.g:495:4: (lv_SuperType_0_0= ruleContract )
            {
            // InternalOptGrammar.g:495:4: (lv_SuperType_0_0= ruleContract )
            // InternalOptGrammar.g:496:5: lv_SuperType_0_0= ruleContract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInheritanceSpecifierAccess().getSuperTypeContractParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_SuperType_0_0=ruleContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInheritanceSpecifierRule());
              					}
              					set(
              						current,
              						"SuperType",
              						lv_SuperType_0_0,
              						"org.unicam.myGrammar.OptGrammar.Contract");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:513:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOptGrammar.g:514:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalOptGrammar.g:514:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalOptGrammar.g:515:5: lv_args_1_0= ruleFunctionCallListArguments
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
                      						"org.unicam.myGrammar.OptGrammar.FunctionCallListArguments");
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


    // $ANTLR start "entryRuleDefinitionBody"
    // InternalOptGrammar.g:536:1: entryRuleDefinitionBody returns [EObject current=null] : iv_ruleDefinitionBody= ruleDefinitionBody EOF ;
    public final EObject entryRuleDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionBody = null;


        try {
            // InternalOptGrammar.g:536:55: (iv_ruleDefinitionBody= ruleDefinitionBody EOF )
            // InternalOptGrammar.g:537:2: iv_ruleDefinitionBody= ruleDefinitionBody EOF
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
    // InternalOptGrammar.g:543:1: ruleDefinitionBody returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) ;
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
            // InternalOptGrammar.g:549:2: ( ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) )
            // InternalOptGrammar.g:550:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            {
            // InternalOptGrammar.g:550:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            // InternalOptGrammar.g:551:3: () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}'
            {
            // InternalOptGrammar.g:551:3: ()
            // InternalOptGrammar.g:552:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDefinitionBodyAccess().getDefinitionBodyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefinitionBodyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalOptGrammar.g:562:3: ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )*
            loop7:
            do {
                int alt7=7;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalOptGrammar.g:563:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    {
            	    // InternalOptGrammar.g:563:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    // InternalOptGrammar.g:564:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    {
            	    // InternalOptGrammar.g:564:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    // InternalOptGrammar.g:565:6: lv_functions_2_0= ruleFunctionDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getFunctionsFunctionDefinitionParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
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
            	      							"org.unicam.myGrammar.OptGrammar.FunctionDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptGrammar.g:583:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    {
            	    // InternalOptGrammar.g:583:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    // InternalOptGrammar.g:584:5: (lv_structs_3_0= ruleStructDefinition )
            	    {
            	    // InternalOptGrammar.g:584:5: (lv_structs_3_0= ruleStructDefinition )
            	    // InternalOptGrammar.g:585:6: lv_structs_3_0= ruleStructDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getStructsStructDefinitionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
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
            	      							"org.unicam.myGrammar.OptGrammar.StructDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOptGrammar.g:603:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    {
            	    // InternalOptGrammar.g:603:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    // InternalOptGrammar.g:604:5: (lv_enums_4_0= ruleEnumDefinition )
            	    {
            	    // InternalOptGrammar.g:604:5: (lv_enums_4_0= ruleEnumDefinition )
            	    // InternalOptGrammar.g:605:6: lv_enums_4_0= ruleEnumDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getEnumsEnumDefinitionParserRuleCall_2_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
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
            	      							"org.unicam.myGrammar.OptGrammar.EnumDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOptGrammar.g:623:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    {
            	    // InternalOptGrammar.g:623:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    // InternalOptGrammar.g:624:5: ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';'
            	    {
            	    // InternalOptGrammar.g:624:5: ( (lv_variables_5_0= ruleVariableDeclaration ) )
            	    // InternalOptGrammar.g:625:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    {
            	    // InternalOptGrammar.g:625:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    // InternalOptGrammar.g:626:7: lv_variables_5_0= ruleVariableDeclaration
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
            	      								"org.unicam.myGrammar.OptGrammar.VariableDeclaration");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,17,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getDefinitionBodyAccess().getSemicolonKeyword_2_3_1());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalOptGrammar.g:649:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    {
            	    // InternalOptGrammar.g:649:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    // InternalOptGrammar.g:650:5: (lv_modifiers_7_0= ruleModifier )
            	    {
            	    // InternalOptGrammar.g:650:5: (lv_modifiers_7_0= ruleModifier )
            	    // InternalOptGrammar.g:651:6: lv_modifiers_7_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getModifiersModifierParserRuleCall_2_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
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
            	      							"org.unicam.myGrammar.OptGrammar.Modifier");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalOptGrammar.g:669:4: ( (lv_events_8_0= ruleEvent ) )
            	    {
            	    // InternalOptGrammar.g:669:4: ( (lv_events_8_0= ruleEvent ) )
            	    // InternalOptGrammar.g:670:5: (lv_events_8_0= ruleEvent )
            	    {
            	    // InternalOptGrammar.g:670:5: (lv_events_8_0= ruleEvent )
            	    // InternalOptGrammar.g:671:6: lv_events_8_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getEventsEventParserRuleCall_2_5_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
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
            	      							"org.unicam.myGrammar.OptGrammar.Event");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "entryRuleFunctionDefinition"
    // InternalOptGrammar.g:697:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // InternalOptGrammar.g:697:59: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // InternalOptGrammar.g:698:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
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
    // InternalOptGrammar.g:704:1: ruleFunctionDefinition returns [EObject current=null] : ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_payable_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_optionalElements_4_0 = null;

        EObject lv_returnParameters_6_0 = null;

        EObject lv_block_7_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:710:2: ( ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) ) )
            // InternalOptGrammar.g:711:2: ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) )
            {
            // InternalOptGrammar.g:711:2: ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) )
            // InternalOptGrammar.g:712:3: ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' )
            {
            // InternalOptGrammar.g:712:3: ( (lv_payable_0_0= 'payable' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOptGrammar.g:713:4: (lv_payable_0_0= 'payable' )
                    {
                    // InternalOptGrammar.g:713:4: (lv_payable_0_0= 'payable' )
                    // InternalOptGrammar.g:714:5: lv_payable_0_0= 'payable'
                    {
                    lv_payable_0_0=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_payable_0_0, grammarAccess.getFunctionDefinitionAccess().getPayablePayableKeyword_0_0());
                      				
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

            otherlv_1=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getFunctionKeyword_1());
              		
            }
            // InternalOptGrammar.g:730:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOptGrammar.g:731:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:731:4: (lv_name_2_0= RULE_ID )
            // InternalOptGrammar.g:732:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalOptGrammar.g:748:3: ( (lv_parameters_3_0= ruleParameterList ) )
            // InternalOptGrammar.g:749:4: (lv_parameters_3_0= ruleParameterList )
            {
            // InternalOptGrammar.g:749:4: (lv_parameters_3_0= ruleParameterList )
            // InternalOptGrammar.g:750:5: lv_parameters_3_0= ruleParameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersParameterListParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_20);
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
              						"org.unicam.myGrammar.OptGrammar.ParameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:767:3: ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==31||(LA9_0>=184 && LA9_0<=187)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOptGrammar.g:768:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    {
            	    // InternalOptGrammar.g:768:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    // InternalOptGrammar.g:769:5: lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOptionalElementsFunctionDefinitionOptionalElementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
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
            	      						"org.unicam.myGrammar.OptGrammar.FunctionDefinitionOptionalElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalOptGrammar.g:786:3: (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOptGrammar.g:787:4: otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getReturnsKeyword_5_0());
                      			
                    }
                    // InternalOptGrammar.g:791:4: ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    // InternalOptGrammar.g:792:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    {
                    // InternalOptGrammar.g:792:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    // InternalOptGrammar.g:793:6: lv_returnParameters_6_0= ruleReturnsParameterList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnParametersReturnsParameterListParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
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
                      							"org.unicam.myGrammar.OptGrammar.ReturnsParameterList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalOptGrammar.g:811:3: ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalOptGrammar.g:812:4: ( (lv_block_7_0= ruleBody ) )
                    {
                    // InternalOptGrammar.g:812:4: ( (lv_block_7_0= ruleBody ) )
                    // InternalOptGrammar.g:813:5: (lv_block_7_0= ruleBody )
                    {
                    // InternalOptGrammar.g:813:5: (lv_block_7_0= ruleBody )
                    // InternalOptGrammar.g:814:6: lv_block_7_0= ruleBody
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBlockBodyParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_7_0=ruleBody();

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
                      							"org.unicam.myGrammar.OptGrammar.Body");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:832:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFunctionCallListArguments"
    // InternalOptGrammar.g:841:1: entryRuleFunctionCallListArguments returns [EObject current=null] : iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF ;
    public final EObject entryRuleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallListArguments = null;


        try {
            // InternalOptGrammar.g:841:66: (iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF )
            // InternalOptGrammar.g:842:2: iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF
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
    // InternalOptGrammar.g:848:1: ruleFunctionCallListArguments returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:854:2: ( (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:855:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:855:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:856:3: otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallListArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:860:3: ()
            // InternalOptGrammar.g:861:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallListArgumentsAccess().getFunctionCallListArgumentsAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:867:3: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING||(LA13_0>=RULE_INT && LA13_0<=RULE_TX)||(LA13_0>=54 && LA13_0<=55)||(LA13_0>=57 && LA13_0<=64)||LA13_0==68||(LA13_0>=188 && LA13_0<=189)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOptGrammar.g:868:4: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // InternalOptGrammar.g:868:4: ( (lv_arguments_2_0= ruleExpression ) )
                    // InternalOptGrammar.g:869:5: (lv_arguments_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:869:5: (lv_arguments_2_0= ruleExpression )
                    // InternalOptGrammar.g:870:6: lv_arguments_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallListArgumentsAccess().getArgumentsExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
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
                      							"org.unicam.myGrammar.OptGrammar.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:887:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==22) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalOptGrammar.g:888:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallListArgumentsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:892:5: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // InternalOptGrammar.g:893:6: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // InternalOptGrammar.g:893:6: (lv_arguments_4_0= ruleExpression )
                    	    // InternalOptGrammar.g:894:7: lv_arguments_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallListArgumentsAccess().getArgumentsExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
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
                    	      								"org.unicam.myGrammar.OptGrammar.Expression");
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
    // InternalOptGrammar.g:921:1: entryRuleFunctionCallArguments returns [EObject current=null] : iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF ;
    public final EObject entryRuleFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArguments = null;


        try {
            // InternalOptGrammar.g:921:62: (iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF )
            // InternalOptGrammar.g:922:2: iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF
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
    // InternalOptGrammar.g:928:1: ruleFunctionCallArguments returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) ;
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
            // InternalOptGrammar.g:934:2: ( ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) )
            // InternalOptGrammar.g:935:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            {
            // InternalOptGrammar.g:935:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==21) ) {
                    alt16=1;
                }
                else if ( (LA16_1==RULE_STRING||(LA16_1>=RULE_INT && LA16_1<=RULE_TX)||LA16_1==29||(LA16_1>=54 && LA16_1<=55)||(LA16_1>=57 && LA16_1<=64)||LA16_1==68||(LA16_1>=188 && LA16_1<=189)) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalOptGrammar.g:936:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    {
                    // InternalOptGrammar.g:936:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    // InternalOptGrammar.g:937:4: otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunctionCallArgumentsAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgumentsAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalOptGrammar.g:945:4: ()
                    // InternalOptGrammar.g:946:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFunctionCallArgumentsAccess().getFunctionCallArgumentsAction_0_2(),
                      						current);
                      				
                    }

                    }

                    // InternalOptGrammar.g:952:4: ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalOptGrammar.g:953:5: ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            {
                            // InternalOptGrammar.g:953:5: ( (lv_args_3_0= ruleFunctionCallArg ) )
                            // InternalOptGrammar.g:954:6: (lv_args_3_0= ruleFunctionCallArg )
                            {
                            // InternalOptGrammar.g:954:6: (lv_args_3_0= ruleFunctionCallArg )
                            // InternalOptGrammar.g:955:7: lv_args_3_0= ruleFunctionCallArg
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
                              								"org.unicam.myGrammar.OptGrammar.FunctionCallArg");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalOptGrammar.g:972:5: (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==22) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalOptGrammar.g:973:6: otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    {
                            	    otherlv_4=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallArgumentsAccess().getCommaKeyword_0_3_1_0());
                            	      					
                            	    }
                            	    // InternalOptGrammar.g:977:6: ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    // InternalOptGrammar.g:978:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    {
                            	    // InternalOptGrammar.g:978:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    // InternalOptGrammar.g:979:8: lv_args_5_0= ruleFunctionCallArg
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
                            	      									"org.unicam.myGrammar.OptGrammar.FunctionCallArg");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_26); if (state.failed) return current;
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
                    // InternalOptGrammar.g:1008:3: this_FunctionCallListArguments_8= ruleFunctionCallListArguments
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
    // InternalOptGrammar.g:1020:1: entryRuleFunctionCallArg returns [EObject current=null] : iv_ruleFunctionCallArg= ruleFunctionCallArg EOF ;
    public final EObject entryRuleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArg = null;


        try {
            // InternalOptGrammar.g:1020:56: (iv_ruleFunctionCallArg= ruleFunctionCallArg EOF )
            // InternalOptGrammar.g:1021:2: iv_ruleFunctionCallArg= ruleFunctionCallArg EOF
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
    // InternalOptGrammar.g:1027:1: ruleFunctionCallArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1033:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalOptGrammar.g:1034:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalOptGrammar.g:1034:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalOptGrammar.g:1035:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalOptGrammar.g:1035:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:1036:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:1036:4: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:1037:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgAccess().getColonKeyword_1());
              		
            }
            // InternalOptGrammar.g:1057:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalOptGrammar.g:1058:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:1058:4: (lv_expr_2_0= ruleExpression )
            // InternalOptGrammar.g:1059:5: lv_expr_2_0= ruleExpression
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
              						"org.unicam.myGrammar.OptGrammar.Expression");
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


    // $ANTLR start "entryRuleFunctionDefinitionOptionalElement"
    // InternalOptGrammar.g:1080:1: entryRuleFunctionDefinitionOptionalElement returns [EObject current=null] : iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF ;
    public final EObject entryRuleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOptionalElement = null;


        try {
            // InternalOptGrammar.g:1080:74: (iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF )
            // InternalOptGrammar.g:1081:2: iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF
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
    // InternalOptGrammar.g:1087:1: ruleFunctionDefinitionOptionalElement returns [EObject current=null] : (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) ;
    public final EObject ruleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_ModifierInvocation_1 = null;

        EObject this_VisibilitySpecifier_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1093:2: ( (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) )
            // InternalOptGrammar.g:1094:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            {
            // InternalOptGrammar.g:1094:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                alt17=2;
                }
                break;
            case 184:
            case 185:
            case 186:
            case 187:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalOptGrammar.g:1095:3: this_Const_0= ruleConst
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
                    // InternalOptGrammar.g:1104:3: this_ModifierInvocation_1= ruleModifierInvocation
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
                    // InternalOptGrammar.g:1113:3: this_VisibilitySpecifier_2= ruleVisibilitySpecifier
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
    // InternalOptGrammar.g:1125:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalOptGrammar.g:1125:46: (iv_ruleConst= ruleConst EOF )
            // InternalOptGrammar.g:1126:2: iv_ruleConst= ruleConst EOF
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
    // InternalOptGrammar.g:1132:1: ruleConst returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1138:2: ( (otherlv_0= 'constant' () ) )
            // InternalOptGrammar.g:1139:2: (otherlv_0= 'constant' () )
            {
            // InternalOptGrammar.g:1139:2: (otherlv_0= 'constant' () )
            // InternalOptGrammar.g:1140:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstAccess().getConstantKeyword_0());
              		
            }
            // InternalOptGrammar.g:1144:3: ()
            // InternalOptGrammar.g:1145:4: 
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
    // InternalOptGrammar.g:1155:1: entryRuleVisibilitySpecifier returns [EObject current=null] : iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF ;
    public final EObject entryRuleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilitySpecifier = null;


        try {
            // InternalOptGrammar.g:1155:60: (iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF )
            // InternalOptGrammar.g:1156:2: iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF
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
    // InternalOptGrammar.g:1162:1: ruleVisibilitySpecifier returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ;
    public final EObject ruleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1168:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) )
            // InternalOptGrammar.g:1169:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            {
            // InternalOptGrammar.g:1169:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            // InternalOptGrammar.g:1170:3: (lv_visibility_0_0= ruleVisibilityEnum )
            {
            // InternalOptGrammar.g:1170:3: (lv_visibility_0_0= ruleVisibilityEnum )
            // InternalOptGrammar.g:1171:4: lv_visibility_0_0= ruleVisibilityEnum
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
              					"org.unicam.myGrammar.OptGrammar.VisibilityEnum");
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
    // InternalOptGrammar.g:1191:1: entryRuleStructDefinition returns [EObject current=null] : iv_ruleStructDefinition= ruleStructDefinition EOF ;
    public final EObject entryRuleStructDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDefinition = null;


        try {
            // InternalOptGrammar.g:1191:57: (iv_ruleStructDefinition= ruleStructDefinition EOF )
            // InternalOptGrammar.g:1192:2: iv_ruleStructDefinition= ruleStructDefinition EOF
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
    // InternalOptGrammar.g:1198:1: ruleStructDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
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
            // InternalOptGrammar.g:1204:2: ( ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // InternalOptGrammar.g:1205:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // InternalOptGrammar.g:1205:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // InternalOptGrammar.g:1206:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // InternalOptGrammar.g:1206:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=184 && LA18_0<=187)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOptGrammar.g:1207:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    {
                    // InternalOptGrammar.g:1207:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    // InternalOptGrammar.g:1208:5: lv_visibility_0_0= ruleVisibilityEnum
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
                      						"org.unicam.myGrammar.OptGrammar.VisibilityEnum");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStructDefinitionAccess().getStructKeyword_1());
              		
            }
            // InternalOptGrammar.g:1229:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOptGrammar.g:1230:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:1230:4: (lv_name_2_0= RULE_ID )
            // InternalOptGrammar.g:1231:5: lv_name_2_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStructDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalOptGrammar.g:1251:3: ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==36||LA19_0==40||(LA19_0>=69 && LA19_0<=172)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOptGrammar.g:1252:4: ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';'
            	    {
            	    // InternalOptGrammar.g:1252:4: ( (lv_members_4_0= ruleVariableDeclaration ) )
            	    // InternalOptGrammar.g:1253:5: (lv_members_4_0= ruleVariableDeclaration )
            	    {
            	    // InternalOptGrammar.g:1253:5: (lv_members_4_0= ruleVariableDeclaration )
            	    // InternalOptGrammar.g:1254:6: lv_members_4_0= ruleVariableDeclaration
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
            	      							"org.unicam.myGrammar.OptGrammar.VariableDeclaration");
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
            	    break loop19;
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
    // InternalOptGrammar.g:1284:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // InternalOptGrammar.g:1284:55: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // InternalOptGrammar.g:1285:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
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
    // InternalOptGrammar.g:1291:1: ruleEnumDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' ) ;
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
            // InternalOptGrammar.g:1297:2: ( ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' ) )
            // InternalOptGrammar.g:1298:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' )
            {
            // InternalOptGrammar.g:1298:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' )
            // InternalOptGrammar.g:1299:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}'
            {
            // InternalOptGrammar.g:1299:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=184 && LA20_0<=187)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOptGrammar.g:1300:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    {
                    // InternalOptGrammar.g:1300:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    // InternalOptGrammar.g:1301:5: lv_visibility_0_0= ruleVisibilityEnum
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
                      						"org.unicam.myGrammar.OptGrammar.VisibilityEnum");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumDefinitionAccess().getEnumKeyword_1());
              		
            }
            // InternalOptGrammar.g:1322:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOptGrammar.g:1323:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:1323:4: (lv_name_2_0= RULE_ID )
            // InternalOptGrammar.g:1324:5: lv_name_2_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalOptGrammar.g:1344:3: ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOptGrammar.g:1345:4: ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )*
                    {
                    // InternalOptGrammar.g:1345:4: ( (lv_members_4_0= ruleEnumValue ) )
                    // InternalOptGrammar.g:1346:5: (lv_members_4_0= ruleEnumValue )
                    {
                    // InternalOptGrammar.g:1346:5: (lv_members_4_0= ruleEnumValue )
                    // InternalOptGrammar.g:1347:6: lv_members_4_0= ruleEnumValue
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
                      							"org.unicam.myGrammar.OptGrammar.EnumValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:1364:4: (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==22) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalOptGrammar.g:1365:5: otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getEnumDefinitionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:1369:5: ( (lv_members_6_0= ruleEnumValue ) )
                    	    // InternalOptGrammar.g:1370:6: (lv_members_6_0= ruleEnumValue )
                    	    {
                    	    // InternalOptGrammar.g:1370:6: (lv_members_6_0= ruleEnumValue )
                    	    // InternalOptGrammar.g:1371:7: lv_members_6_0= ruleEnumValue
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
                    	      								"org.unicam.myGrammar.OptGrammar.EnumValue");
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
    // InternalOptGrammar.g:1398:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalOptGrammar.g:1398:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalOptGrammar.g:1399:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalOptGrammar.g:1405:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1411:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalOptGrammar.g:1412:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalOptGrammar.g:1412:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:1413:3: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:1413:3: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:1414:4: lv_name_0_0= RULE_ID
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
              					"org.eclipse.xtext.common.Terminals.ID");
              			
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
    // InternalOptGrammar.g:1433:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalOptGrammar.g:1433:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalOptGrammar.g:1434:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalOptGrammar.g:1440:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1446:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalOptGrammar.g:1447:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalOptGrammar.g:1447:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:1448:3: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:1448:3: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:1449:4: lv_name_0_0= RULE_ID
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
              					"org.eclipse.xtext.common.Terminals.ID");
              			
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
    // InternalOptGrammar.g:1468:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1468:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalOptGrammar.g:1469:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalOptGrammar.g:1475:1: ruleVariableDeclaration returns [EObject current=null] : (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_StandardVariableDeclaration_0 = null;

        EObject this_VarVariableDeclaration_1 = null;

        EObject this_VarVariableTupleVariableDeclaration_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1481:2: ( (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) )
            // InternalOptGrammar.g:1482:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            {
            // InternalOptGrammar.g:1482:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==36||(LA23_0>=69 && LA23_0<=172)) ) {
                alt23=1;
            }
            else if ( (LA23_0==40) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==28) ) {
                    alt23=3;
                }
                else if ( (LA23_2==RULE_ID) ) {
                    alt23=2;
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
                    // InternalOptGrammar.g:1483:3: this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration
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
                    // InternalOptGrammar.g:1492:3: this_VarVariableDeclaration_1= ruleVarVariableDeclaration
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
                    // InternalOptGrammar.g:1501:3: this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration
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
    // InternalOptGrammar.g:1513:1: entryRuleStandardVariableDeclaration returns [EObject current=null] : iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF ;
    public final EObject entryRuleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1513:68: (iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF )
            // InternalOptGrammar.g:1514:2: iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF
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
    // InternalOptGrammar.g:1520:1: ruleStandardVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_optionalElements_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1526:2: ( ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1527:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1527:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1528:3: ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1528:3: ( (lv_type_0_0= ruleStandardType ) )
            // InternalOptGrammar.g:1529:4: (lv_type_0_0= ruleStandardType )
            {
            // InternalOptGrammar.g:1529:4: (lv_type_0_0= ruleStandardType )
            // InternalOptGrammar.g:1530:5: lv_type_0_0= ruleStandardType
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
              						"org.unicam.myGrammar.OptGrammar.StandardType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:1547:3: ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31||LA24_0==35||(LA24_0>=181 && LA24_0<=187)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOptGrammar.g:1548:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    {
            	    // InternalOptGrammar.g:1548:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    // InternalOptGrammar.g:1549:5: lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement
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
            	      						"org.unicam.myGrammar.OptGrammar.VariableDeclarationOptionalElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalOptGrammar.g:1566:3: ( (lv_variable_2_0= ruleVariable ) )
            // InternalOptGrammar.g:1567:4: (lv_variable_2_0= ruleVariable )
            {
            // InternalOptGrammar.g:1567:4: (lv_variable_2_0= ruleVariable )
            // InternalOptGrammar.g:1568:5: lv_variable_2_0= ruleVariable
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
              						"org.unicam.myGrammar.OptGrammar.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:1585:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOptGrammar.g:1586:4: otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStandardVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalOptGrammar.g:1590:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalOptGrammar.g:1591:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1591:5: (lv_expression_4_0= ruleExpression )
                    // InternalOptGrammar.g:1592:6: lv_expression_4_0= ruleExpression
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
                      							"org.unicam.myGrammar.OptGrammar.Expression");
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
    // InternalOptGrammar.g:1614:1: entryRuleVarVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1614:63: (iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF )
            // InternalOptGrammar.g:1615:2: iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF
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
    // InternalOptGrammar.g:1621:1: ruleVarVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1627:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1628:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1628:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1629:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1629:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalOptGrammar.g:1630:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalOptGrammar.g:1630:4: (lv_varType_0_0= ruleVarType )
            // InternalOptGrammar.g:1631:5: lv_varType_0_0= ruleVarType
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
              						"org.unicam.myGrammar.OptGrammar.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:1648:3: ( (lv_variable_1_0= ruleVariable ) )
            // InternalOptGrammar.g:1649:4: (lv_variable_1_0= ruleVariable )
            {
            // InternalOptGrammar.g:1649:4: (lv_variable_1_0= ruleVariable )
            // InternalOptGrammar.g:1650:5: lv_variable_1_0= ruleVariable
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
              						"org.unicam.myGrammar.OptGrammar.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:1667:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOptGrammar.g:1668:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalOptGrammar.g:1672:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalOptGrammar.g:1673:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1673:5: (lv_expression_3_0= ruleExpression )
                    // InternalOptGrammar.g:1674:6: lv_expression_3_0= ruleExpression
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
                      							"org.unicam.myGrammar.OptGrammar.Expression");
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
    // InternalOptGrammar.g:1696:1: entryRuleVarVariableTupleVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableTupleVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1696:76: (iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF )
            // InternalOptGrammar.g:1697:2: iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF
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
    // InternalOptGrammar.g:1703:1: ruleVarVariableTupleVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_tuple_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1709:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1710:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1710:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1711:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1711:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalOptGrammar.g:1712:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalOptGrammar.g:1712:4: (lv_varType_0_0= ruleVarType )
            // InternalOptGrammar.g:1713:5: lv_varType_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getVarTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
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
              						"org.unicam.myGrammar.OptGrammar.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:1730:3: ( (lv_tuple_1_0= ruleTuple ) )
            // InternalOptGrammar.g:1731:4: (lv_tuple_1_0= ruleTuple )
            {
            // InternalOptGrammar.g:1731:4: (lv_tuple_1_0= ruleTuple )
            // InternalOptGrammar.g:1732:5: lv_tuple_1_0= ruleTuple
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
              						"org.unicam.myGrammar.OptGrammar.Tuple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:1749:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOptGrammar.g:1750:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableTupleVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalOptGrammar.g:1754:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalOptGrammar.g:1755:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1755:5: (lv_expression_3_0= ruleExpression )
                    // InternalOptGrammar.g:1756:6: lv_expression_3_0= ruleExpression
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
                      							"org.unicam.myGrammar.OptGrammar.Expression");
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
    // InternalOptGrammar.g:1778:1: entryRuleVariableDeclarationOptionalElement returns [EObject current=null] : iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF ;
    public final EObject entryRuleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationOptionalElement = null;


        try {
            // InternalOptGrammar.g:1778:75: (iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF )
            // InternalOptGrammar.g:1779:2: iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF
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
    // InternalOptGrammar.g:1785:1: ruleVariableDeclarationOptionalElement returns [EObject current=null] : (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) ;
    public final EObject ruleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_VisibilitySpecifier_0 = null;

        EObject this_IndexedSpecifer_1 = null;

        EObject this_ConstantSpecifier_2 = null;

        EObject this_LocationSpecifier_3 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1791:2: ( (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) )
            // InternalOptGrammar.g:1792:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            {
            // InternalOptGrammar.g:1792:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 184:
            case 185:
            case 186:
            case 187:
                {
                alt28=1;
                }
                break;
            case 35:
                {
                alt28=2;
                }
                break;
            case 31:
                {
                alt28=3;
                }
                break;
            case 181:
            case 182:
            case 183:
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
                    // InternalOptGrammar.g:1793:3: this_VisibilitySpecifier_0= ruleVisibilitySpecifier
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
                    // InternalOptGrammar.g:1802:3: this_IndexedSpecifer_1= ruleIndexedSpecifer
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
                    // InternalOptGrammar.g:1811:3: this_ConstantSpecifier_2= ruleConstantSpecifier
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
                    // InternalOptGrammar.g:1820:3: this_LocationSpecifier_3= ruleLocationSpecifier
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
    // InternalOptGrammar.g:1832:1: entryRuleIndexedSpecifer returns [EObject current=null] : iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF ;
    public final EObject entryRuleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedSpecifer = null;


        try {
            // InternalOptGrammar.g:1832:56: (iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF )
            // InternalOptGrammar.g:1833:2: iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF
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
    // InternalOptGrammar.g:1839:1: ruleIndexedSpecifer returns [EObject current=null] : (otherlv_0= 'indexed' () ) ;
    public final EObject ruleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1845:2: ( (otherlv_0= 'indexed' () ) )
            // InternalOptGrammar.g:1846:2: (otherlv_0= 'indexed' () )
            {
            // InternalOptGrammar.g:1846:2: (otherlv_0= 'indexed' () )
            // InternalOptGrammar.g:1847:3: otherlv_0= 'indexed' ()
            {
            otherlv_0=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexedSpeciferAccess().getIndexedKeyword_0());
              		
            }
            // InternalOptGrammar.g:1851:3: ()
            // InternalOptGrammar.g:1852:4: 
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
    // InternalOptGrammar.g:1862:1: entryRuleConstantSpecifier returns [EObject current=null] : iv_ruleConstantSpecifier= ruleConstantSpecifier EOF ;
    public final EObject entryRuleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSpecifier = null;


        try {
            // InternalOptGrammar.g:1862:58: (iv_ruleConstantSpecifier= ruleConstantSpecifier EOF )
            // InternalOptGrammar.g:1863:2: iv_ruleConstantSpecifier= ruleConstantSpecifier EOF
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
    // InternalOptGrammar.g:1869:1: ruleConstantSpecifier returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1875:2: ( (otherlv_0= 'constant' () ) )
            // InternalOptGrammar.g:1876:2: (otherlv_0= 'constant' () )
            {
            // InternalOptGrammar.g:1876:2: (otherlv_0= 'constant' () )
            // InternalOptGrammar.g:1877:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantSpecifierAccess().getConstantKeyword_0());
              		
            }
            // InternalOptGrammar.g:1881:3: ()
            // InternalOptGrammar.g:1882:4: 
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
    // InternalOptGrammar.g:1892:1: entryRuleLocationSpecifier returns [EObject current=null] : iv_ruleLocationSpecifier= ruleLocationSpecifier EOF ;
    public final EObject entryRuleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifier = null;


        try {
            // InternalOptGrammar.g:1892:58: (iv_ruleLocationSpecifier= ruleLocationSpecifier EOF )
            // InternalOptGrammar.g:1893:2: iv_ruleLocationSpecifier= ruleLocationSpecifier EOF
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
    // InternalOptGrammar.g:1899:1: ruleLocationSpecifier returns [EObject current=null] : ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) ;
    public final EObject ruleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_location_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1905:2: ( ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) )
            // InternalOptGrammar.g:1906:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            {
            // InternalOptGrammar.g:1906:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            // InternalOptGrammar.g:1907:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            {
            // InternalOptGrammar.g:1907:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            // InternalOptGrammar.g:1908:4: lv_location_0_0= ruleLocationSpecifierEnum
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
              					"org.unicam.myGrammar.OptGrammar.LocationSpecifierEnum");
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
    // InternalOptGrammar.g:1928:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalOptGrammar.g:1928:45: (iv_ruleType= ruleType EOF )
            // InternalOptGrammar.g:1929:2: iv_ruleType= ruleType EOF
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
    // InternalOptGrammar.g:1935:1: ruleType returns [EObject current=null] : (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_StandardType_0 = null;

        AntlrDatatypeRuleToken lv_isVarType_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1941:2: ( (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) )
            // InternalOptGrammar.g:1942:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            {
            // InternalOptGrammar.g:1942:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==36||(LA29_0>=69 && LA29_0<=172)) ) {
                alt29=1;
            }
            else if ( (LA29_0==40) ) {
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
                    // InternalOptGrammar.g:1943:3: this_StandardType_0= ruleStandardType
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
                    // InternalOptGrammar.g:1952:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    {
                    // InternalOptGrammar.g:1952:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    // InternalOptGrammar.g:1953:4: (lv_isVarType_1_0= ruleVarType )
                    {
                    // InternalOptGrammar.g:1953:4: (lv_isVarType_1_0= ruleVarType )
                    // InternalOptGrammar.g:1954:5: lv_isVarType_1_0= ruleVarType
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
                      						"org.unicam.myGrammar.OptGrammar.VarType");
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
    // InternalOptGrammar.g:1975:1: entryRuleStandardType returns [EObject current=null] : iv_ruleStandardType= ruleStandardType EOF ;
    public final EObject entryRuleStandardType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardType = null;


        try {
            // InternalOptGrammar.g:1975:53: (iv_ruleStandardType= ruleStandardType EOF )
            // InternalOptGrammar.g:1976:2: iv_ruleStandardType= ruleStandardType EOF
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
    // InternalOptGrammar.g:1982:1: ruleStandardType returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) ;
    public final EObject ruleStandardType() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;

        EObject this_QualifiedIdentifier_3 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1988:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) )
            // InternalOptGrammar.g:1989:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            {
            // InternalOptGrammar.g:1989:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            int alt31=3;
            switch ( input.LA(1) ) {
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
                {
                alt31=1;
                }
                break;
            case 36:
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
                    // InternalOptGrammar.g:1990:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalOptGrammar.g:1990:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalOptGrammar.g:1991:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
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
                    // InternalOptGrammar.g:1999:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==38) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalOptGrammar.g:2000:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalOptGrammar.g:2000:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalOptGrammar.g:2001:6: lv_dimension_1_0= ruleArrayDimensions
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
                              							"org.unicam.myGrammar.OptGrammar.ArrayDimensions");
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
                    // InternalOptGrammar.g:2020:3: this_Mapping_2= ruleMapping
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
                    // InternalOptGrammar.g:2029:3: this_QualifiedIdentifier_3= ruleQualifiedIdentifier
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
    // InternalOptGrammar.g:2041:1: entryRuleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF ;
    public final EObject entryRuleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardTypeWithoutQualifiedIdentifier = null;


        try {
            // InternalOptGrammar.g:2041:79: (iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF )
            // InternalOptGrammar.g:2042:2: iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF
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
    // InternalOptGrammar.g:2048:1: ruleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) ;
    public final EObject ruleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2054:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) )
            // InternalOptGrammar.g:2055:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            {
            // InternalOptGrammar.g:2055:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=69 && LA33_0<=172)) ) {
                alt33=1;
            }
            else if ( (LA33_0==36) ) {
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
                    // InternalOptGrammar.g:2056:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalOptGrammar.g:2056:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalOptGrammar.g:2057:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
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
                    // InternalOptGrammar.g:2065:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==38) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalOptGrammar.g:2066:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalOptGrammar.g:2066:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalOptGrammar.g:2067:6: lv_dimension_1_0= ruleArrayDimensions
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
                              							"org.unicam.myGrammar.OptGrammar.ArrayDimensions");
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
                    // InternalOptGrammar.g:2086:3: this_Mapping_2= ruleMapping
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
    // InternalOptGrammar.g:2098:1: entryRuleElementaryType returns [EObject current=null] : iv_ruleElementaryType= ruleElementaryType EOF ;
    public final EObject entryRuleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryType = null;


        try {
            // InternalOptGrammar.g:2098:55: (iv_ruleElementaryType= ruleElementaryType EOF )
            // InternalOptGrammar.g:2099:2: iv_ruleElementaryType= ruleElementaryType EOF
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
    // InternalOptGrammar.g:2105:1: ruleElementaryType returns [EObject current=null] : ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) ;
    public final EObject ruleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2111:2: ( ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) )
            // InternalOptGrammar.g:2112:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            {
            // InternalOptGrammar.g:2112:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            // InternalOptGrammar.g:2113:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalOptGrammar.g:2113:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            // InternalOptGrammar.g:2114:4: lv_name_0_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElementaryTypeAccess().getNameElementaryTypeNameEnumParserRuleCall_0());
              			
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
              					"org.unicam.myGrammar.OptGrammar.ElementaryTypeNameEnum");
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
    // InternalOptGrammar.g:2134:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalOptGrammar.g:2134:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalOptGrammar.g:2135:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalOptGrammar.g:2141:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyType_2_0 = null;

        EObject lv_valueType_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2147:2: ( (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) )
            // InternalOptGrammar.g:2148:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            {
            // InternalOptGrammar.g:2148:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            // InternalOptGrammar.g:2149:3: otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:2157:3: ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) )
            // InternalOptGrammar.g:2158:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            {
            // InternalOptGrammar.g:2158:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            // InternalOptGrammar.g:2159:5: lv_keyType_2_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getKeyTypeElementaryTypeNameEnumParserRuleCall_2_0());
              				
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
              						"org.unicam.myGrammar.OptGrammar.ElementaryTypeNameEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalOptGrammar.g:2180:3: ( (lv_valueType_4_0= ruleType ) )
            // InternalOptGrammar.g:2181:4: (lv_valueType_4_0= ruleType )
            {
            // InternalOptGrammar.g:2181:4: (lv_valueType_4_0= ruleType )
            // InternalOptGrammar.g:2182:5: lv_valueType_4_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getValueTypeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_26);
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
              						"org.unicam.myGrammar.OptGrammar.Type");
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
    // InternalOptGrammar.g:2207:1: entryRuleArrayDimensions returns [EObject current=null] : iv_ruleArrayDimensions= ruleArrayDimensions EOF ;
    public final EObject entryRuleArrayDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimensions = null;


        try {
            // InternalOptGrammar.g:2207:56: (iv_ruleArrayDimensions= ruleArrayDimensions EOF )
            // InternalOptGrammar.g:2208:2: iv_ruleArrayDimensions= ruleArrayDimensions EOF
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
    // InternalOptGrammar.g:2214:1: ruleArrayDimensions returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) ;
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
            // InternalOptGrammar.g:2220:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) )
            // InternalOptGrammar.g:2221:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            {
            // InternalOptGrammar.g:2221:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            // InternalOptGrammar.g:2222:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            {
            otherlv_0=(Token)match(input,38,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:2226:3: ()
            // InternalOptGrammar.g:2227:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayDimensionsAccess().getArrayDimensionsAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:2233:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING||(LA34_0>=RULE_INT && LA34_0<=RULE_TX)||(LA34_0>=54 && LA34_0<=55)||(LA34_0>=57 && LA34_0<=64)||LA34_0==68||(LA34_0>=188 && LA34_0<=189)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOptGrammar.g:2234:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:2234:4: (lv_value_2_0= ruleExpression )
                    // InternalOptGrammar.g:2235:5: lv_value_2_0= ruleExpression
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
                      						"org.unicam.myGrammar.OptGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalOptGrammar.g:2256:3: (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==38) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalOptGrammar.g:2257:4: otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']'
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_4_0());
            	      			
            	    }
            	    // InternalOptGrammar.g:2261:4: ( (lv_value_5_0= ruleExpression ) )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_STRING||(LA35_0>=RULE_INT && LA35_0<=RULE_TX)||(LA35_0>=54 && LA35_0<=55)||(LA35_0>=57 && LA35_0<=64)||LA35_0==68||(LA35_0>=188 && LA35_0<=189)) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalOptGrammar.g:2262:5: (lv_value_5_0= ruleExpression )
            	            {
            	            // InternalOptGrammar.g:2262:5: (lv_value_5_0= ruleExpression )
            	            // InternalOptGrammar.g:2263:6: lv_value_5_0= ruleExpression
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
            	              							"org.unicam.myGrammar.OptGrammar.Expression");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,39,FOLLOW_33); if (state.failed) return current;
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
    // InternalOptGrammar.g:2289:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalOptGrammar.g:2289:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalOptGrammar.g:2290:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalOptGrammar.g:2296:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:2302:2: (kw= 'var' )
            // InternalOptGrammar.g:2303:2: kw= 'var'
            {
            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:2311:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalOptGrammar.g:2311:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalOptGrammar.g:2312:2: iv_ruleTuple= ruleTuple EOF
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
    // InternalOptGrammar.g:2318:1: ruleTuple returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_3_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2324:2: ( (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:2325:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:2325:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            // InternalOptGrammar.g:2326:3: otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:2330:3: ()
            // InternalOptGrammar.g:2331:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleAccess().getTupleAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:2337:3: ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING||(LA40_0>=RULE_INT && LA40_0<=RULE_TX)||LA40_0==22||(LA40_0>=54 && LA40_0<=55)||(LA40_0>=57 && LA40_0<=64)||LA40_0==68||(LA40_0>=188 && LA40_0<=189)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOptGrammar.g:2338:4: ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    {
                    // InternalOptGrammar.g:2338:4: ( (lv_members_2_0= ruleExpression ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_STRING||(LA37_0>=RULE_INT && LA37_0<=RULE_TX)||(LA37_0>=54 && LA37_0<=55)||(LA37_0>=57 && LA37_0<=64)||LA37_0==68||(LA37_0>=188 && LA37_0<=189)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalOptGrammar.g:2339:5: (lv_members_2_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2339:5: (lv_members_2_0= ruleExpression )
                            // InternalOptGrammar.g:2340:6: lv_members_2_0= ruleExpression
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
                              							"org.unicam.myGrammar.OptGrammar.Expression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalOptGrammar.g:2357:4: ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==22) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2358:5: ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )?
                    	    {
                    	    // InternalOptGrammar.g:2358:5: ( (lv_members_3_0= ruleTupleSeparator ) )
                    	    // InternalOptGrammar.g:2359:6: (lv_members_3_0= ruleTupleSeparator )
                    	    {
                    	    // InternalOptGrammar.g:2359:6: (lv_members_3_0= ruleTupleSeparator )
                    	    // InternalOptGrammar.g:2360:7: lv_members_3_0= ruleTupleSeparator
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
                    	      								"org.unicam.myGrammar.OptGrammar.TupleSeparator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalOptGrammar.g:2377:5: ( (lv_members_4_0= ruleExpression ) )?
                    	    int alt38=2;
                    	    int LA38_0 = input.LA(1);

                    	    if ( (LA38_0==RULE_STRING||(LA38_0>=RULE_INT && LA38_0<=RULE_TX)||(LA38_0>=54 && LA38_0<=55)||(LA38_0>=57 && LA38_0<=64)||LA38_0==68||(LA38_0>=188 && LA38_0<=189)) ) {
                    	        alt38=1;
                    	    }
                    	    switch (alt38) {
                    	        case 1 :
                    	            // InternalOptGrammar.g:2378:6: (lv_members_4_0= ruleExpression )
                    	            {
                    	            // InternalOptGrammar.g:2378:6: (lv_members_4_0= ruleExpression )
                    	            // InternalOptGrammar.g:2379:7: lv_members_4_0= ruleExpression
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
                    	              								"org.unicam.myGrammar.OptGrammar.Expression");
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
    // InternalOptGrammar.g:2406:1: entryRuleTupleSeparator returns [EObject current=null] : iv_ruleTupleSeparator= ruleTupleSeparator EOF ;
    public final EObject entryRuleTupleSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleSeparator = null;


        try {
            // InternalOptGrammar.g:2406:55: (iv_ruleTupleSeparator= ruleTupleSeparator EOF )
            // InternalOptGrammar.g:2407:2: iv_ruleTupleSeparator= ruleTupleSeparator EOF
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
    // InternalOptGrammar.g:2413:1: ruleTupleSeparator returns [EObject current=null] : (otherlv_0= ',' () ) ;
    public final EObject ruleTupleSeparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:2419:2: ( (otherlv_0= ',' () ) )
            // InternalOptGrammar.g:2420:2: (otherlv_0= ',' () )
            {
            // InternalOptGrammar.g:2420:2: (otherlv_0= ',' () )
            // InternalOptGrammar.g:2421:3: otherlv_0= ',' ()
            {
            otherlv_0=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleSeparatorAccess().getCommaKeyword_0());
              		
            }
            // InternalOptGrammar.g:2425:3: ()
            // InternalOptGrammar.g:2426:4: 
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
    // InternalOptGrammar.g:2436:1: entryRuleSimpleStatement returns [EObject current=null] : iv_ruleSimpleStatement= ruleSimpleStatement EOF ;
    public final EObject entryRuleSimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement = null;


        try {
            // InternalOptGrammar.g:2436:56: (iv_ruleSimpleStatement= ruleSimpleStatement EOF )
            // InternalOptGrammar.g:2437:2: iv_ruleSimpleStatement= ruleSimpleStatement EOF
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
    // InternalOptGrammar.g:2443:1: ruleSimpleStatement returns [EObject current=null] : ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) ;
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
            // InternalOptGrammar.g:2449:2: ( ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) )
            // InternalOptGrammar.g:2450:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            {
            // InternalOptGrammar.g:2450:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            // InternalOptGrammar.g:2451:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) )
            {
            // InternalOptGrammar.g:2451:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 36:
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
                {
                alt44=1;
                }
                break;
            case 40:
                {
                alt44=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 54:
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 68:
            case 188:
            case 189:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalOptGrammar.g:2452:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalOptGrammar.g:2452:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalOptGrammar.g:2453:5: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
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
                    // InternalOptGrammar.g:2461:5: ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalOptGrammar.g:2462:6: () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalOptGrammar.g:2462:6: ()
                    // InternalOptGrammar.g:2463:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getSimpleStatementAccess().getStandardVariableDeclarationTypeAction_0_0_1_0(),
                      								current);
                      						
                    }

                    }

                    // InternalOptGrammar.g:2469:6: ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==31||LA41_0==35||(LA41_0>=181 && LA41_0<=187)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2470:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalOptGrammar.g:2470:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalOptGrammar.g:2471:8: lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement
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
                    	      									"org.unicam.myGrammar.OptGrammar.VariableDeclarationOptionalElement");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // InternalOptGrammar.g:2488:6: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalOptGrammar.g:2489:7: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:2489:7: (lv_variable_3_0= ruleVariable )
                    // InternalOptGrammar.g:2490:8: lv_variable_3_0= ruleVariable
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
                      									"org.unicam.myGrammar.OptGrammar.Variable");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalOptGrammar.g:2507:6: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==34) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalOptGrammar.g:2508:7: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_0_1_3_0());
                              						
                            }
                            // InternalOptGrammar.g:2512:7: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalOptGrammar.g:2513:8: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2513:8: (lv_expression_5_0= ruleExpression )
                            // InternalOptGrammar.g:2514:9: lv_expression_5_0= ruleExpression
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
                              										"org.unicam.myGrammar.OptGrammar.Expression");
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
                    // InternalOptGrammar.g:2535:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalOptGrammar.g:2535:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalOptGrammar.g:2536:5: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
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
                    // InternalOptGrammar.g:2543:5: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
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
                            // InternalOptGrammar.g:2544:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2544:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2545:7: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2545:7: ()
                            // InternalOptGrammar.g:2546:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTypeDeclarationAction_0_1_1_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalOptGrammar.g:2552:7: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalOptGrammar.g:2553:8: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalOptGrammar.g:2553:8: (lv_variable_8_0= ruleVariable )
                            // InternalOptGrammar.g:2554:9: lv_variable_8_0= ruleVariable
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
                              										"org.unicam.myGrammar.OptGrammar.Variable");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalOptGrammar.g:2571:7: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2572:8: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_9, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_0_2_0());
                              							
                            }
                            // InternalOptGrammar.g:2576:8: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalOptGrammar.g:2577:9: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2577:9: (lv_expression_10_0= ruleExpression )
                            // InternalOptGrammar.g:2578:10: lv_expression_10_0= ruleExpression
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
                              											"org.unicam.myGrammar.OptGrammar.Expression");
                              										afterParserOrEnumRuleCall();
                              									
                            }

                            }


                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalOptGrammar.g:2598:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2598:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2599:7: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2599:7: ()
                            // InternalOptGrammar.g:2600:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTupleVariableDeclarationAction_0_1_1_1_0(),
                              									current);
                              							
                            }

                            }

                            // InternalOptGrammar.g:2606:7: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalOptGrammar.g:2607:8: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalOptGrammar.g:2607:8: (lv_tuple_12_0= ruleTuple )
                            // InternalOptGrammar.g:2608:9: lv_tuple_12_0= ruleTuple
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
                              										"org.unicam.myGrammar.OptGrammar.Tuple");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalOptGrammar.g:2625:7: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2626:8: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_13, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_1_2_0());
                              							
                            }
                            // InternalOptGrammar.g:2630:8: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalOptGrammar.g:2631:9: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2631:9: (lv_expression_14_0= ruleExpression )
                            // InternalOptGrammar.g:2632:10: lv_expression_14_0= ruleExpression
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
                              											"org.unicam.myGrammar.OptGrammar.Expression");
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
                    // InternalOptGrammar.g:2654:4: this_ExpressionStatement_15= ruleExpressionStatement
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

            // InternalOptGrammar.g:2663:3: ( (lv_semicolon_16_0= ';' ) )
            // InternalOptGrammar.g:2664:4: (lv_semicolon_16_0= ';' )
            {
            // InternalOptGrammar.g:2664:4: (lv_semicolon_16_0= ';' )
            // InternalOptGrammar.g:2665:5: lv_semicolon_16_0= ';'
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
    // InternalOptGrammar.g:2681:1: entryRuleSimpleStatement2 returns [EObject current=null] : iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF ;
    public final EObject entryRuleSimpleStatement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement2 = null;


        try {
            // InternalOptGrammar.g:2681:57: (iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF )
            // InternalOptGrammar.g:2682:2: iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF
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
    // InternalOptGrammar.g:2688:1: ruleSimpleStatement2 returns [EObject current=null] : ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ;
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
            // InternalOptGrammar.g:2694:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) )
            // InternalOptGrammar.g:2695:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            {
            // InternalOptGrammar.g:2695:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 36:
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
                {
                alt48=1;
                }
                break;
            case 40:
                {
                alt48=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 54:
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 68:
            case 188:
            case 189:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalOptGrammar.g:2696:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalOptGrammar.g:2696:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalOptGrammar.g:2697:4: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
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
                    // InternalOptGrammar.g:2705:4: ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalOptGrammar.g:2706:5: () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalOptGrammar.g:2706:5: ()
                    // InternalOptGrammar.g:2707:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getSimpleStatement2Access().getStandardVariableDeclarationTypeAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalOptGrammar.g:2713:5: ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==31||LA45_0==35||(LA45_0>=181 && LA45_0<=187)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2714:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalOptGrammar.g:2714:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalOptGrammar.g:2715:7: lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement
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
                    	      								"org.unicam.myGrammar.OptGrammar.VariableDeclarationOptionalElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    // InternalOptGrammar.g:2732:5: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalOptGrammar.g:2733:6: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:2733:6: (lv_variable_3_0= ruleVariable )
                    // InternalOptGrammar.g:2734:7: lv_variable_3_0= ruleVariable
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
                      								"org.unicam.myGrammar.OptGrammar.Variable");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalOptGrammar.g:2751:5: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==34) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalOptGrammar.g:2752:6: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_0_1_3_0());
                              					
                            }
                            // InternalOptGrammar.g:2756:6: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalOptGrammar.g:2757:7: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2757:7: (lv_expression_5_0= ruleExpression )
                            // InternalOptGrammar.g:2758:8: lv_expression_5_0= ruleExpression
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
                              									"org.unicam.myGrammar.OptGrammar.Expression");
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
                    // InternalOptGrammar.g:2779:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalOptGrammar.g:2779:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalOptGrammar.g:2780:4: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
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
                    // InternalOptGrammar.g:2787:4: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
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
                            // InternalOptGrammar.g:2788:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2788:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2789:6: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2789:6: ()
                            // InternalOptGrammar.g:2790:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTypeDeclarationAction_1_1_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalOptGrammar.g:2796:6: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalOptGrammar.g:2797:7: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalOptGrammar.g:2797:7: (lv_variable_8_0= ruleVariable )
                            // InternalOptGrammar.g:2798:8: lv_variable_8_0= ruleVariable
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
                              									"org.unicam.myGrammar.OptGrammar.Variable");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalOptGrammar.g:2815:6: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2816:7: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_9, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_0_2_0());
                              						
                            }
                            // InternalOptGrammar.g:2820:7: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalOptGrammar.g:2821:8: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2821:8: (lv_expression_10_0= ruleExpression )
                            // InternalOptGrammar.g:2822:9: lv_expression_10_0= ruleExpression
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
                              										"org.unicam.myGrammar.OptGrammar.Expression");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalOptGrammar.g:2842:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2842:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2843:6: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2843:6: ()
                            // InternalOptGrammar.g:2844:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTupleVariableDeclarationAction_1_1_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalOptGrammar.g:2850:6: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalOptGrammar.g:2851:7: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalOptGrammar.g:2851:7: (lv_tuple_12_0= ruleTuple )
                            // InternalOptGrammar.g:2852:8: lv_tuple_12_0= ruleTuple
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
                              									"org.unicam.myGrammar.OptGrammar.Tuple");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalOptGrammar.g:2869:6: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2870:7: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_13, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_1_2_0());
                              						
                            }
                            // InternalOptGrammar.g:2874:7: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalOptGrammar.g:2875:8: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2875:8: (lv_expression_14_0= ruleExpression )
                            // InternalOptGrammar.g:2876:9: lv_expression_14_0= ruleExpression
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
                              										"org.unicam.myGrammar.OptGrammar.Expression");
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
                    // InternalOptGrammar.g:2898:3: this_ExpressionStatement_15= ruleExpressionStatement
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
    // InternalOptGrammar.g:2910:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalOptGrammar.g:2910:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalOptGrammar.g:2911:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
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
    // InternalOptGrammar.g:2917:1: ruleExpressionStatement returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2923:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalOptGrammar.g:2924:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalOptGrammar.g:2924:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalOptGrammar.g:2925:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalOptGrammar.g:2925:3: (lv_expression_0_0= ruleExpression )
            // InternalOptGrammar.g:2926:4: lv_expression_0_0= ruleExpression
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
              					"org.unicam.myGrammar.OptGrammar.Expression");
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
    // InternalOptGrammar.g:2946:1: entryRuleQualifiedIdentifier returns [EObject current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final EObject entryRuleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedIdentifier = null;


        try {
            // InternalOptGrammar.g:2946:60: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // InternalOptGrammar.g:2947:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
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
    // InternalOptGrammar.g:2953:1: ruleQualifiedIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) ;
    public final EObject ruleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        EObject lv_qualifiers_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2959:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) )
            // InternalOptGrammar.g:2960:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            {
            // InternalOptGrammar.g:2960:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            // InternalOptGrammar.g:2961:3: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )*
            {
            // InternalOptGrammar.g:2961:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalOptGrammar.g:2962:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:2962:4: (lv_identifier_0_0= RULE_ID )
            // InternalOptGrammar.g:2963:5: lv_identifier_0_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalOptGrammar.g:2979:3: ( (lv_qualifiers_1_0= ruleQualifier ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==28||LA49_0==38||LA49_0==41) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalOptGrammar.g:2980:4: (lv_qualifiers_1_0= ruleQualifier )
            	    {
            	    // InternalOptGrammar.g:2980:4: (lv_qualifiers_1_0= ruleQualifier )
            	    // InternalOptGrammar.g:2981:5: lv_qualifiers_1_0= ruleQualifier
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
            	      						"org.unicam.myGrammar.OptGrammar.Qualifier");
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
    // InternalOptGrammar.g:3002:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalOptGrammar.g:3002:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalOptGrammar.g:3003:2: iv_ruleQualifier= ruleQualifier EOF
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
    // InternalOptGrammar.g:3009:1: ruleQualifier returns [EObject current=null] : (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Index_1 = null;

        EObject this_Arguments_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3015:2: ( (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) )
            // InternalOptGrammar.g:3016:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            {
            // InternalOptGrammar.g:3016:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt50=1;
                }
                break;
            case 38:
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
                    // InternalOptGrammar.g:3017:3: this_Field_0= ruleField
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
                    // InternalOptGrammar.g:3026:3: this_Index_1= ruleIndex
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
                    // InternalOptGrammar.g:3035:3: this_Arguments_2= ruleArguments
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
    // InternalOptGrammar.g:3047:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalOptGrammar.g:3047:46: (iv_ruleField= ruleField EOF )
            // InternalOptGrammar.g:3048:2: iv_ruleField= ruleField EOF
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
    // InternalOptGrammar.g:3054:1: ruleField returns [EObject current=null] : (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_field_1_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3060:2: ( (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) )
            // InternalOptGrammar.g:3061:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            {
            // InternalOptGrammar.g:3061:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            // InternalOptGrammar.g:3062:3: otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFullStopKeyword_0());
              		
            }
            // InternalOptGrammar.g:3066:3: ( (lv_field_1_0= RULE_ID ) )
            // InternalOptGrammar.g:3067:4: (lv_field_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:3067:4: (lv_field_1_0= RULE_ID )
            // InternalOptGrammar.g:3068:5: lv_field_1_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // InternalOptGrammar.g:3088:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // InternalOptGrammar.g:3088:46: (iv_ruleIndex= ruleIndex EOF )
            // InternalOptGrammar.g:3089:2: iv_ruleIndex= ruleIndex EOF
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
    // InternalOptGrammar.g:3095:1: ruleIndex returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3101:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) )
            // InternalOptGrammar.g:3102:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            {
            // InternalOptGrammar.g:3102:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            // InternalOptGrammar.g:3103:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:3107:3: ()
            // InternalOptGrammar.g:3108:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndexAccess().getIndexAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3114:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING||(LA51_0>=RULE_INT && LA51_0<=RULE_TX)||(LA51_0>=54 && LA51_0<=55)||(LA51_0>=57 && LA51_0<=64)||LA51_0==68||(LA51_0>=188 && LA51_0<=189)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOptGrammar.g:3115:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:3115:4: (lv_value_2_0= ruleExpression )
                    // InternalOptGrammar.g:3116:5: lv_value_2_0= ruleExpression
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
                      						"org.unicam.myGrammar.OptGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3141:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalOptGrammar.g:3141:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalOptGrammar.g:3142:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalOptGrammar.g:3148:1: ruleArguments returns [EObject current=null] : ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3154:2: ( ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) )
            // InternalOptGrammar.g:3155:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            {
            // InternalOptGrammar.g:3155:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            // InternalOptGrammar.g:3156:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            {
            // InternalOptGrammar.g:3156:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            // InternalOptGrammar.g:3157:4: lv_arguments_0_0= ruleFunctionCallArguments
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
              					"org.unicam.myGrammar.OptGrammar.FunctionCallArguments");
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
    // InternalOptGrammar.g:3177:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalOptGrammar.g:3177:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalOptGrammar.g:3178:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalOptGrammar.g:3184:1: ruleModifier returns [EObject current=null] : (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3190:2: ( (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) ) )
            // InternalOptGrammar.g:3191:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) )
            {
            // InternalOptGrammar.g:3191:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) )
            // InternalOptGrammar.g:3192:3: otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModifierAccess().getModifierKeyword_0());
              		
            }
            // InternalOptGrammar.g:3196:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOptGrammar.g:3197:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:3197:4: (lv_name_1_0= RULE_ID )
            // InternalOptGrammar.g:3198:5: lv_name_1_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalOptGrammar.g:3214:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==28) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOptGrammar.g:3215:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalOptGrammar.g:3215:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalOptGrammar.g:3216:5: lv_parameters_2_0= ruleParameterList
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
                      						"org.unicam.myGrammar.OptGrammar.ParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalOptGrammar.g:3233:3: ( (lv_block_3_0= ruleBody ) )
            // InternalOptGrammar.g:3234:4: (lv_block_3_0= ruleBody )
            {
            // InternalOptGrammar.g:3234:4: (lv_block_3_0= ruleBody )
            // InternalOptGrammar.g:3235:5: lv_block_3_0= ruleBody
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
              						"org.unicam.myGrammar.OptGrammar.Body");
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
    // InternalOptGrammar.g:3256:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalOptGrammar.g:3256:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalOptGrammar.g:3257:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalOptGrammar.g:3263:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? otherlv_3= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3269:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? otherlv_3= ';' ) )
            // InternalOptGrammar.g:3270:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? otherlv_3= ';' )
            {
            // InternalOptGrammar.g:3270:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? otherlv_3= ';' )
            // InternalOptGrammar.g:3271:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
              		
            }
            // InternalOptGrammar.g:3275:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOptGrammar.g:3276:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:3276:4: (lv_name_1_0= RULE_ID )
            // InternalOptGrammar.g:3277:5: lv_name_1_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalOptGrammar.g:3293:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==28) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOptGrammar.g:3294:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalOptGrammar.g:3294:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalOptGrammar.g:3295:5: lv_parameters_2_0= ruleParameterList
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
                      						"org.unicam.myGrammar.OptGrammar.ParameterList");
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
    // InternalOptGrammar.g:3320:1: entryRuleModifierInvocation returns [EObject current=null] : iv_ruleModifierInvocation= ruleModifierInvocation EOF ;
    public final EObject entryRuleModifierInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierInvocation = null;


        try {
            // InternalOptGrammar.g:3320:59: (iv_ruleModifierInvocation= ruleModifierInvocation EOF )
            // InternalOptGrammar.g:3321:2: iv_ruleModifierInvocation= ruleModifierInvocation EOF
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
    // InternalOptGrammar.g:3327:1: ruleModifierInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleModifierInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3333:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalOptGrammar.g:3334:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalOptGrammar.g:3334:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalOptGrammar.g:3335:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalOptGrammar.g:3335:3: ( (otherlv_0= RULE_ID ) )
            // InternalOptGrammar.g:3336:4: (otherlv_0= RULE_ID )
            {
            // InternalOptGrammar.g:3336:4: (otherlv_0= RULE_ID )
            // InternalOptGrammar.g:3337:5: otherlv_0= RULE_ID
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

            // InternalOptGrammar.g:3348:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==28) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOptGrammar.g:3349:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalOptGrammar.g:3349:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalOptGrammar.g:3350:5: lv_args_1_0= ruleFunctionCallListArguments
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
                      						"org.unicam.myGrammar.OptGrammar.FunctionCallListArguments");
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
    // InternalOptGrammar.g:3371:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalOptGrammar.g:3371:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalOptGrammar.g:3372:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalOptGrammar.g:3378:1: ruleParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3384:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:3385:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:3385:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:3386:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:3390:3: ()
            // InternalOptGrammar.g:3391:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3397:3: ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==36||LA56_0==40||(LA56_0>=69 && LA56_0<=172)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOptGrammar.g:3398:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // InternalOptGrammar.g:3398:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) )
                    // InternalOptGrammar.g:3399:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    {
                    // InternalOptGrammar.g:3399:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    // InternalOptGrammar.g:3400:6: lv_parameters_2_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterListAccess().getParametersVariableDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
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
                      							"org.unicam.myGrammar.OptGrammar.VariableDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:3417:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==22) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalOptGrammar.g:3418:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:3422:5: ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    // InternalOptGrammar.g:3423:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalOptGrammar.g:3423:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    // InternalOptGrammar.g:3424:7: lv_parameters_4_0= ruleVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParameterListAccess().getParametersVariableDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
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
                    	      								"org.unicam.myGrammar.OptGrammar.VariableDeclaration");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
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
    // InternalOptGrammar.g:3451:1: entryRuleReturnsParameterList returns [EObject current=null] : iv_ruleReturnsParameterList= ruleReturnsParameterList EOF ;
    public final EObject entryRuleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsParameterList = null;


        try {
            // InternalOptGrammar.g:3451:61: (iv_ruleReturnsParameterList= ruleReturnsParameterList EOF )
            // InternalOptGrammar.g:3452:2: iv_ruleReturnsParameterList= ruleReturnsParameterList EOF
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
    // InternalOptGrammar.g:3458:1: ruleReturnsParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3464:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:3465:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:3465:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:3466:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnsParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:3470:3: ()
            // InternalOptGrammar.g:3471:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnsParameterListAccess().getReturnsParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3477:3: ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID||LA58_0==36||LA58_0==40||(LA58_0>=69 && LA58_0<=172)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOptGrammar.g:3478:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    {
                    // InternalOptGrammar.g:3478:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) )
                    // InternalOptGrammar.g:3479:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    {
                    // InternalOptGrammar.g:3479:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    // InternalOptGrammar.g:3480:6: lv_parameters_2_0= ruleReturnParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReturnsParameterListAccess().getParametersReturnParameterDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
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
                      							"org.unicam.myGrammar.OptGrammar.ReturnParameterDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:3497:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==22) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalOptGrammar.g:3498:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReturnsParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:3502:5: ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    // InternalOptGrammar.g:3503:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    {
                    	    // InternalOptGrammar.g:3503:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    // InternalOptGrammar.g:3504:7: lv_parameters_4_0= ruleReturnParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReturnsParameterListAccess().getParametersReturnParameterDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
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
                    	      								"org.unicam.myGrammar.OptGrammar.ReturnParameterDeclaration");
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
    // InternalOptGrammar.g:3531:1: entryRuleReturnParameterDeclaration returns [EObject current=null] : iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF ;
    public final EObject entryRuleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterDeclaration = null;


        try {
            // InternalOptGrammar.g:3531:67: (iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF )
            // InternalOptGrammar.g:3532:2: iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF
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
    // InternalOptGrammar.g:3538:1: ruleReturnParameterDeclaration returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) ;
    public final EObject ruleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_typeRef_0_0 = null;

        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3544:2: ( ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) )
            // InternalOptGrammar.g:3545:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            {
            // InternalOptGrammar.g:3545:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            // InternalOptGrammar.g:3546:3: ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )?
            {
            // InternalOptGrammar.g:3546:3: ( (lv_typeRef_0_0= ruleType ) )
            // InternalOptGrammar.g:3547:4: (lv_typeRef_0_0= ruleType )
            {
            // InternalOptGrammar.g:3547:4: (lv_typeRef_0_0= ruleType )
            // InternalOptGrammar.g:3548:5: lv_typeRef_0_0= ruleType
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
              						"org.unicam.myGrammar.OptGrammar.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:3565:3: ( (lv_variable_1_0= ruleVariable ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOptGrammar.g:3566:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:3566:4: (lv_variable_1_0= ruleVariable )
                    // InternalOptGrammar.g:3567:5: lv_variable_1_0= ruleVariable
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
                      						"org.unicam.myGrammar.OptGrammar.Variable");
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
    // InternalOptGrammar.g:3588:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalOptGrammar.g:3588:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalOptGrammar.g:3589:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalOptGrammar.g:3595:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) ;
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
            // InternalOptGrammar.g:3601:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) )
            // InternalOptGrammar.g:3602:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            {
            // InternalOptGrammar.g:3602:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            int alt61=6;
            switch ( input.LA(1) ) {
            case 45:
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
            case 21:
                {
                alt61=4;
                }
                break;
            case 53:
                {
                alt61=5;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 36:
            case 40:
            case 44:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
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
            case 188:
            case 189:
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
                    // InternalOptGrammar.g:3603:3: this_IfStatement_0= ruleIfStatement
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
                    // InternalOptGrammar.g:3612:3: this_WhileStatement_1= ruleWhileStatement
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
                    // InternalOptGrammar.g:3621:3: this_ForStatement_2= ruleForStatement
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
                    // InternalOptGrammar.g:3630:3: this_Body_3= ruleBody
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
                    // InternalOptGrammar.g:3639:3: this_PlaceHolderStatement_4= rulePlaceHolderStatement
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
                    // InternalOptGrammar.g:3648:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    {
                    // InternalOptGrammar.g:3648:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    int alt60=6;
                    switch ( input.LA(1) ) {
                    case 49:
                        {
                        alt60=1;
                        }
                        break;
                    case 50:
                        {
                        alt60=2;
                        }
                        break;
                    case 51:
                        {
                        alt60=3;
                        }
                        break;
                    case 52:
                        {
                        alt60=4;
                        }
                        break;
                    case 44:
                        {
                        alt60=5;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_INT:
                    case RULE_HEX:
                    case RULE_DECIMAL:
                    case RULE_BLOCK:
                    case RULE_MSG:
                    case RULE_TX:
                    case 36:
                    case 40:
                    case 54:
                    case 55:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
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
                    case 188:
                    case 189:
                        {
                        alt60=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }

                    switch (alt60) {
                        case 1 :
                            // InternalOptGrammar.g:3649:4: this_ContinueStatement_5= ruleContinueStatement
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
                            // InternalOptGrammar.g:3658:4: this_BreakStatement_6= ruleBreakStatement
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
                            // InternalOptGrammar.g:3667:4: this_ReturnStatement_7= ruleReturnStatement
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
                            // InternalOptGrammar.g:3676:4: this_ThrowStatement_8= ruleThrowStatement
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
                            // InternalOptGrammar.g:3685:4: this_DeleteStatement_9= ruleDeleteStatement
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
                            // InternalOptGrammar.g:3694:4: this_SimpleStatement_10= ruleSimpleStatement
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
    // InternalOptGrammar.g:3707:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // InternalOptGrammar.g:3707:56: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // InternalOptGrammar.g:3708:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
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
    // InternalOptGrammar.g:3714:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3720:2: ( (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) )
            // InternalOptGrammar.g:3721:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3721:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            // InternalOptGrammar.g:3722:3: otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
              		
            }
            // InternalOptGrammar.g:3726:3: ( (lv_variable_1_0= ruleQualifiedIdentifier ) )
            // InternalOptGrammar.g:3727:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            {
            // InternalOptGrammar.g:3727:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            // InternalOptGrammar.g:3728:5: lv_variable_1_0= ruleQualifiedIdentifier
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
              						"org.unicam.myGrammar.OptGrammar.QualifiedIdentifier");
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
    // InternalOptGrammar.g:3753:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalOptGrammar.g:3753:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalOptGrammar.g:3754:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalOptGrammar.g:3760:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) ;
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
            // InternalOptGrammar.g:3766:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) )
            // InternalOptGrammar.g:3767:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            {
            // InternalOptGrammar.g:3767:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            // InternalOptGrammar.g:3768:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3776:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalOptGrammar.g:3777:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:3777:4: (lv_condition_2_0= ruleExpression )
            // InternalOptGrammar.g:3778:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
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
              						"org.unicam.myGrammar.OptGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalOptGrammar.g:3799:3: ( (lv_trueBody_4_0= ruleStatement ) )
            // InternalOptGrammar.g:3800:4: (lv_trueBody_4_0= ruleStatement )
            {
            // InternalOptGrammar.g:3800:4: (lv_trueBody_4_0= ruleStatement )
            // InternalOptGrammar.g:3801:5: lv_trueBody_4_0= ruleStatement
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
              						"org.unicam.myGrammar.OptGrammar.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:3818:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==46) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred1_InternalOptGrammar()) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // InternalOptGrammar.g:3819:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) )
                    {
                    // InternalOptGrammar.g:3819:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalOptGrammar.g:3820:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalOptGrammar.g:3826:4: ( (lv_falseBody_6_0= ruleStatement ) )
                    // InternalOptGrammar.g:3827:5: (lv_falseBody_6_0= ruleStatement )
                    {
                    // InternalOptGrammar.g:3827:5: (lv_falseBody_6_0= ruleStatement )
                    // InternalOptGrammar.g:3828:6: lv_falseBody_6_0= ruleStatement
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
                      							"org.unicam.myGrammar.OptGrammar.Statement");
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
    // InternalOptGrammar.g:3850:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalOptGrammar.g:3850:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalOptGrammar.g:3851:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalOptGrammar.g:3857:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3863:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) )
            // InternalOptGrammar.g:3864:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // InternalOptGrammar.g:3864:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            // InternalOptGrammar.g:3865:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3873:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalOptGrammar.g:3874:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:3874:4: (lv_condition_2_0= ruleExpression )
            // InternalOptGrammar.g:3875:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
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
              						"org.unicam.myGrammar.OptGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalOptGrammar.g:3896:3: ( (lv_body_4_0= ruleStatement ) )
            // InternalOptGrammar.g:3897:4: (lv_body_4_0= ruleStatement )
            {
            // InternalOptGrammar.g:3897:4: (lv_body_4_0= ruleStatement )
            // InternalOptGrammar.g:3898:5: lv_body_4_0= ruleStatement
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
              						"org.unicam.myGrammar.OptGrammar.Statement");
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
    // InternalOptGrammar.g:3919:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalOptGrammar.g:3919:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalOptGrammar.g:3920:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalOptGrammar.g:3926:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) ;
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
            // InternalOptGrammar.g:3932:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) )
            // InternalOptGrammar.g:3933:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            {
            // InternalOptGrammar.g:3933:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            // InternalOptGrammar.g:3934:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3942:3: ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING||(LA63_0>=RULE_INT && LA63_0<=RULE_TX)||LA63_0==36||LA63_0==40||(LA63_0>=54 && LA63_0<=55)||(LA63_0>=57 && LA63_0<=64)||(LA63_0>=68 && LA63_0<=172)||(LA63_0>=188 && LA63_0<=189)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOptGrammar.g:3943:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    {
                    // InternalOptGrammar.g:3943:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    // InternalOptGrammar.g:3944:5: lv_initExpression_2_0= ruleSimpleStatement2
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
                      						"org.unicam.myGrammar.OptGrammar.SimpleStatement2");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalOptGrammar.g:3961:3: ( ( ';' )=>otherlv_3= ';' )
            // InternalOptGrammar.g:3962:4: ( ';' )=>otherlv_3= ';'
            {
            otherlv_3=(Token)match(input,17,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
              			
            }

            }

            // InternalOptGrammar.g:3968:3: ( (lv_conditionExpression_4_0= ruleExpression ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_STRING||(LA64_0>=RULE_INT && LA64_0<=RULE_TX)||(LA64_0>=54 && LA64_0<=55)||(LA64_0>=57 && LA64_0<=64)||LA64_0==68||(LA64_0>=188 && LA64_0<=189)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalOptGrammar.g:3969:4: (lv_conditionExpression_4_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:3969:4: (lv_conditionExpression_4_0= ruleExpression )
                    // InternalOptGrammar.g:3970:5: lv_conditionExpression_4_0= ruleExpression
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
                      						"org.unicam.myGrammar.OptGrammar.Expression");
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
            // InternalOptGrammar.g:3991:3: ( (lv_loopExpression_6_0= ruleExpressionStatement ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_STRING||(LA65_0>=RULE_INT && LA65_0<=RULE_TX)||(LA65_0>=54 && LA65_0<=55)||(LA65_0>=57 && LA65_0<=64)||LA65_0==68||(LA65_0>=188 && LA65_0<=189)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOptGrammar.g:3992:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    {
                    // InternalOptGrammar.g:3992:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    // InternalOptGrammar.g:3993:5: lv_loopExpression_6_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getLoopExpressionExpressionStatementParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_26);
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
                      						"org.unicam.myGrammar.OptGrammar.ExpressionStatement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalOptGrammar.g:4014:3: ( (lv_body_8_0= ruleStatement ) )
            // InternalOptGrammar.g:4015:4: (lv_body_8_0= ruleStatement )
            {
            // InternalOptGrammar.g:4015:4: (lv_body_8_0= ruleStatement )
            // InternalOptGrammar.g:4016:5: lv_body_8_0= ruleStatement
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
              						"org.unicam.myGrammar.OptGrammar.Statement");
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
    // InternalOptGrammar.g:4037:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalOptGrammar.g:4037:45: (iv_ruleBody= ruleBody EOF )
            // InternalOptGrammar.g:4038:2: iv_ruleBody= ruleBody EOF
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
    // InternalOptGrammar.g:4044:1: ruleBody returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4050:2: ( (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) )
            // InternalOptGrammar.g:4051:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            {
            // InternalOptGrammar.g:4051:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            // InternalOptGrammar.g:4052:3: otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:4056:3: ()
            // InternalOptGrammar.g:4057:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBodyAccess().getBlockAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:4063:3: ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING||(LA67_0>=RULE_INT && LA67_0<=RULE_TX)||LA67_0==21||LA67_0==36||LA67_0==40||(LA67_0>=44 && LA67_0<=45)||(LA67_0>=47 && LA67_0<=55)||(LA67_0>=57 && LA67_0<=64)||(LA67_0>=68 && LA67_0<=172)||(LA67_0>=188 && LA67_0<=189)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOptGrammar.g:4064:4: ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )*
                    {
                    // InternalOptGrammar.g:4064:4: ( (lv_statements_2_0= ruleStatement ) )
                    // InternalOptGrammar.g:4065:5: (lv_statements_2_0= ruleStatement )
                    {
                    // InternalOptGrammar.g:4065:5: (lv_statements_2_0= ruleStatement )
                    // InternalOptGrammar.g:4066:6: lv_statements_2_0= ruleStatement
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
                      							"org.unicam.myGrammar.OptGrammar.Statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:4083:4: ( (lv_statements_3_0= ruleStatement ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==RULE_STRING||(LA66_0>=RULE_INT && LA66_0<=RULE_TX)||LA66_0==21||LA66_0==36||LA66_0==40||(LA66_0>=44 && LA66_0<=45)||(LA66_0>=47 && LA66_0<=55)||(LA66_0>=57 && LA66_0<=64)||(LA66_0>=68 && LA66_0<=172)||(LA66_0>=188 && LA66_0<=189)) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalOptGrammar.g:4084:5: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // InternalOptGrammar.g:4084:5: (lv_statements_3_0= ruleStatement )
                    	    // InternalOptGrammar.g:4085:6: lv_statements_3_0= ruleStatement
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
                    	      							"org.unicam.myGrammar.OptGrammar.Statement");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
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
    // InternalOptGrammar.g:4111:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // InternalOptGrammar.g:4111:58: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalOptGrammar.g:4112:2: iv_ruleContinueStatement= ruleContinueStatement EOF
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
    // InternalOptGrammar.g:4118:1: ruleContinueStatement returns [EObject current=null] : (otherlv_0= 'continue' () otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:4124:2: ( (otherlv_0= 'continue' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:4125:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:4125:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            // InternalOptGrammar.g:4126:3: otherlv_0= 'continue' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContinueStatementAccess().getContinueKeyword_0());
              		
            }
            // InternalOptGrammar.g:4130:3: ()
            // InternalOptGrammar.g:4131:4: 
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
    // InternalOptGrammar.g:4145:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalOptGrammar.g:4145:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalOptGrammar.g:4146:2: iv_ruleBreakStatement= ruleBreakStatement EOF
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
    // InternalOptGrammar.g:4152:1: ruleBreakStatement returns [EObject current=null] : (otherlv_0= 'break' () otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:4158:2: ( (otherlv_0= 'break' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:4159:2: (otherlv_0= 'break' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:4159:2: (otherlv_0= 'break' () otherlv_2= ';' )
            // InternalOptGrammar.g:4160:3: otherlv_0= 'break' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakStatementAccess().getBreakKeyword_0());
              		
            }
            // InternalOptGrammar.g:4164:3: ()
            // InternalOptGrammar.g:4165:4: 
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
    // InternalOptGrammar.g:4179:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalOptGrammar.g:4179:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalOptGrammar.g:4180:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalOptGrammar.g:4186:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4192:2: ( (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) )
            // InternalOptGrammar.g:4193:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            {
            // InternalOptGrammar.g:4193:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            // InternalOptGrammar.g:4194:3: otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
              		
            }
            // InternalOptGrammar.g:4198:3: ()
            // InternalOptGrammar.g:4199:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:4205:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING||(LA68_0>=RULE_INT && LA68_0<=RULE_TX)||(LA68_0>=54 && LA68_0<=55)||(LA68_0>=57 && LA68_0<=64)||LA68_0==68||(LA68_0>=188 && LA68_0<=189)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalOptGrammar.g:4206:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:4206:4: (lv_expression_2_0= ruleExpression )
                    // InternalOptGrammar.g:4207:5: lv_expression_2_0= ruleExpression
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
                      						"org.unicam.myGrammar.OptGrammar.Expression");
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
    // InternalOptGrammar.g:4232:1: entryRuleThrowStatement returns [EObject current=null] : iv_ruleThrowStatement= ruleThrowStatement EOF ;
    public final EObject entryRuleThrowStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStatement = null;


        try {
            // InternalOptGrammar.g:4232:55: (iv_ruleThrowStatement= ruleThrowStatement EOF )
            // InternalOptGrammar.g:4233:2: iv_ruleThrowStatement= ruleThrowStatement EOF
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
    // InternalOptGrammar.g:4239:1: ruleThrowStatement returns [EObject current=null] : (otherlv_0= 'throw' () otherlv_2= ';' ) ;
    public final EObject ruleThrowStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:4245:2: ( (otherlv_0= 'throw' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:4246:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:4246:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            // InternalOptGrammar.g:4247:3: otherlv_0= 'throw' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getThrowStatementAccess().getThrowKeyword_0());
              		
            }
            // InternalOptGrammar.g:4251:3: ()
            // InternalOptGrammar.g:4252:4: 
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
    // InternalOptGrammar.g:4266:1: entryRulePlaceHolderStatement returns [EObject current=null] : iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF ;
    public final EObject entryRulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceHolderStatement = null;


        try {
            // InternalOptGrammar.g:4266:61: (iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF )
            // InternalOptGrammar.g:4267:2: iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF
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
    // InternalOptGrammar.g:4273:1: rulePlaceHolderStatement returns [EObject current=null] : (otherlv_0= '_' () ) ;
    public final EObject rulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:4279:2: ( (otherlv_0= '_' () ) )
            // InternalOptGrammar.g:4280:2: (otherlv_0= '_' () )
            {
            // InternalOptGrammar.g:4280:2: (otherlv_0= '_' () )
            // InternalOptGrammar.g:4281:3: otherlv_0= '_' ()
            {
            otherlv_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlaceHolderStatementAccess().get_Keyword_0());
              		
            }
            // InternalOptGrammar.g:4285:3: ()
            // InternalOptGrammar.g:4286:4: 
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
    // InternalOptGrammar.g:4296:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalOptGrammar.g:4296:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalOptGrammar.g:4297:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalOptGrammar.g:4303:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* ) | ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* ) | ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_negate_2_0=null;
        Token lv_ternary_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_first_0_0 = null;

        EObject lv_operations_1_0 = null;

        EObject lv_first_3_0 = null;

        EObject lv_operations_4_0 = null;

        EObject lv_first_6_0 = null;

        EObject lv_true_8_0 = null;

        EObject lv_false_10_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4309:2: ( ( ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* ) | ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* ) | ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) ) ) )
            // InternalOptGrammar.g:4310:2: ( ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* ) | ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* ) | ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) ) )
            {
            // InternalOptGrammar.g:4310:2: ( ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* ) | ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* ) | ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 68:
            case 188:
            case 189:
                {
                alt71=1;
                }
                break;
            case 54:
                {
                alt71=2;
                }
                break;
            case 55:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalOptGrammar.g:4311:3: ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* )
                    {
                    // InternalOptGrammar.g:4311:3: ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* )
                    // InternalOptGrammar.g:4312:4: ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )*
                    {
                    // InternalOptGrammar.g:4312:4: ( (lv_first_0_0= ruleLiteral ) )
                    // InternalOptGrammar.g:4313:5: (lv_first_0_0= ruleLiteral )
                    {
                    // InternalOptGrammar.g:4313:5: (lv_first_0_0= ruleLiteral )
                    // InternalOptGrammar.g:4314:6: lv_first_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getFirstLiteralParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_56);
                    lv_first_0_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"first",
                      							lv_first_0_0,
                      							"org.unicam.myGrammar.OptGrammar.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:4331:4: ( (lv_operations_1_0= ruleConditionOperation ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( ((LA69_0>=173 && LA69_0<=180)) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalOptGrammar.g:4332:5: (lv_operations_1_0= ruleConditionOperation )
                    	    {
                    	    // InternalOptGrammar.g:4332:5: (lv_operations_1_0= ruleConditionOperation )
                    	    // InternalOptGrammar.g:4333:6: lv_operations_1_0= ruleConditionOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getExpressionAccess().getOperationsConditionOperationParserRuleCall_0_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_56);
                    	    lv_operations_1_0=ruleConditionOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"operations",
                    	      							lv_operations_1_0,
                    	      							"org.unicam.myGrammar.OptGrammar.ConditionOperation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:4352:3: ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* )
                    {
                    // InternalOptGrammar.g:4352:3: ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* )
                    // InternalOptGrammar.g:4353:4: ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )*
                    {
                    // InternalOptGrammar.g:4353:4: ( (lv_negate_2_0= 'NOT' ) )
                    // InternalOptGrammar.g:4354:5: (lv_negate_2_0= 'NOT' )
                    {
                    // InternalOptGrammar.g:4354:5: (lv_negate_2_0= 'NOT' )
                    // InternalOptGrammar.g:4355:6: lv_negate_2_0= 'NOT'
                    {
                    lv_negate_2_0=(Token)match(input,54,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_negate_2_0, grammarAccess.getExpressionAccess().getNegateNOTKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpressionRule());
                      						}
                      						setWithLastConsumed(current, "negate", true, "NOT");
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:4367:4: ( (lv_first_3_0= ruleLiteral ) )
                    // InternalOptGrammar.g:4368:5: (lv_first_3_0= ruleLiteral )
                    {
                    // InternalOptGrammar.g:4368:5: (lv_first_3_0= ruleLiteral )
                    // InternalOptGrammar.g:4369:6: lv_first_3_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getFirstLiteralParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_56);
                    lv_first_3_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"first",
                      							lv_first_3_0,
                      							"org.unicam.myGrammar.OptGrammar.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:4386:4: ( (lv_operations_4_0= ruleConditionOperation ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( ((LA70_0>=173 && LA70_0<=180)) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalOptGrammar.g:4387:5: (lv_operations_4_0= ruleConditionOperation )
                    	    {
                    	    // InternalOptGrammar.g:4387:5: (lv_operations_4_0= ruleConditionOperation )
                    	    // InternalOptGrammar.g:4388:6: lv_operations_4_0= ruleConditionOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getExpressionAccess().getOperationsConditionOperationParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_56);
                    	    lv_operations_4_0=ruleConditionOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"operations",
                    	      							lv_operations_4_0,
                    	      							"org.unicam.myGrammar.OptGrammar.ConditionOperation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:4407:3: ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) )
                    {
                    // InternalOptGrammar.g:4407:3: ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) )
                    // InternalOptGrammar.g:4408:4: ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) )
                    {
                    // InternalOptGrammar.g:4408:4: ( (lv_ternary_5_0= 'TERNARY' ) )
                    // InternalOptGrammar.g:4409:5: (lv_ternary_5_0= 'TERNARY' )
                    {
                    // InternalOptGrammar.g:4409:5: (lv_ternary_5_0= 'TERNARY' )
                    // InternalOptGrammar.g:4410:6: lv_ternary_5_0= 'TERNARY'
                    {
                    lv_ternary_5_0=(Token)match(input,55,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ternary_5_0, grammarAccess.getExpressionAccess().getTernaryTERNARYKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpressionRule());
                      						}
                      						setWithLastConsumed(current, "ternary", true, "TERNARY");
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:4422:4: ( (lv_first_6_0= ruleLiteral ) )
                    // InternalOptGrammar.g:4423:5: (lv_first_6_0= ruleLiteral )
                    {
                    // InternalOptGrammar.g:4423:5: (lv_first_6_0= ruleLiteral )
                    // InternalOptGrammar.g:4424:6: lv_first_6_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getFirstLiteralParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_first_6_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"first",
                      							lv_first_6_0,
                      							"org.unicam.myGrammar.OptGrammar.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,56,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getQuestionMarkKeyword_2_2());
                      			
                    }
                    // InternalOptGrammar.g:4445:4: ( (lv_true_8_0= ruleLiteral ) )
                    // InternalOptGrammar.g:4446:5: (lv_true_8_0= ruleLiteral )
                    {
                    // InternalOptGrammar.g:4446:5: (lv_true_8_0= ruleLiteral )
                    // InternalOptGrammar.g:4447:6: lv_true_8_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getTrueLiteralParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_true_8_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"true",
                      							lv_true_8_0,
                      							"org.unicam.myGrammar.OptGrammar.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getColonKeyword_2_4());
                      			
                    }
                    // InternalOptGrammar.g:4468:4: ( (lv_false_10_0= ruleLiteral ) )
                    // InternalOptGrammar.g:4469:5: (lv_false_10_0= ruleLiteral )
                    {
                    // InternalOptGrammar.g:4469:5: (lv_false_10_0= ruleLiteral )
                    // InternalOptGrammar.g:4470:6: lv_false_10_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getFalseLiteralParserRuleCall_2_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_false_10_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"false",
                      							lv_false_10_0,
                      							"org.unicam.myGrammar.OptGrammar.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConditionOperation"
    // InternalOptGrammar.g:4492:1: entryRuleConditionOperation returns [EObject current=null] : iv_ruleConditionOperation= ruleConditionOperation EOF ;
    public final EObject entryRuleConditionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionOperation = null;


        try {
            // InternalOptGrammar.g:4492:59: (iv_ruleConditionOperation= ruleConditionOperation EOF )
            // InternalOptGrammar.g:4493:2: iv_ruleConditionOperation= ruleConditionOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionOperation=ruleConditionOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionOperation"


    // $ANTLR start "ruleConditionOperation"
    // InternalOptGrammar.g:4499:1: ruleConditionOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleLogicalOperationLiteral ) ) ( (lv_negateSecond_1_0= 'NOT' ) )? ( (lv_seconds_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleConditionOperation() throws RecognitionException {
        EObject current = null;

        Token lv_negateSecond_1_0=null;
        Enumerator lv_operation_0_0 = null;

        EObject lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4505:2: ( ( ( (lv_operation_0_0= ruleLogicalOperationLiteral ) ) ( (lv_negateSecond_1_0= 'NOT' ) )? ( (lv_seconds_2_0= ruleLiteral ) ) ) )
            // InternalOptGrammar.g:4506:2: ( ( (lv_operation_0_0= ruleLogicalOperationLiteral ) ) ( (lv_negateSecond_1_0= 'NOT' ) )? ( (lv_seconds_2_0= ruleLiteral ) ) )
            {
            // InternalOptGrammar.g:4506:2: ( ( (lv_operation_0_0= ruleLogicalOperationLiteral ) ) ( (lv_negateSecond_1_0= 'NOT' ) )? ( (lv_seconds_2_0= ruleLiteral ) ) )
            // InternalOptGrammar.g:4507:3: ( (lv_operation_0_0= ruleLogicalOperationLiteral ) ) ( (lv_negateSecond_1_0= 'NOT' ) )? ( (lv_seconds_2_0= ruleLiteral ) )
            {
            // InternalOptGrammar.g:4507:3: ( (lv_operation_0_0= ruleLogicalOperationLiteral ) )
            // InternalOptGrammar.g:4508:4: (lv_operation_0_0= ruleLogicalOperationLiteral )
            {
            // InternalOptGrammar.g:4508:4: (lv_operation_0_0= ruleLogicalOperationLiteral )
            // InternalOptGrammar.g:4509:5: lv_operation_0_0= ruleLogicalOperationLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionOperationAccess().getOperationLogicalOperationLiteralEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_operation_0_0=ruleLogicalOperationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionOperationRule());
              					}
              					set(
              						current,
              						"operation",
              						lv_operation_0_0,
              						"org.unicam.myGrammar.OptGrammar.LogicalOperationLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:4526:3: ( (lv_negateSecond_1_0= 'NOT' ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==54) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalOptGrammar.g:4527:4: (lv_negateSecond_1_0= 'NOT' )
                    {
                    // InternalOptGrammar.g:4527:4: (lv_negateSecond_1_0= 'NOT' )
                    // InternalOptGrammar.g:4528:5: lv_negateSecond_1_0= 'NOT'
                    {
                    lv_negateSecond_1_0=(Token)match(input,54,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_negateSecond_1_0, grammarAccess.getConditionOperationAccess().getNegateSecondNOTKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConditionOperationRule());
                      					}
                      					setWithLastConsumed(current, "negateSecond", lv_negateSecond_1_0, "NOT");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalOptGrammar.g:4540:3: ( (lv_seconds_2_0= ruleLiteral ) )
            // InternalOptGrammar.g:4541:4: (lv_seconds_2_0= ruleLiteral )
            {
            // InternalOptGrammar.g:4541:4: (lv_seconds_2_0= ruleLiteral )
            // InternalOptGrammar.g:4542:5: lv_seconds_2_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionOperationAccess().getSecondsLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_seconds_2_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionOperationRule());
              					}
              					set(
              						current,
              						"seconds",
              						lv_seconds_2_0,
              						"org.unicam.myGrammar.OptGrammar.Literal");
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
    // $ANTLR end "ruleConditionOperation"


    // $ANTLR start "entryRuleLiteral"
    // InternalOptGrammar.g:4563:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalOptGrammar.g:4563:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalOptGrammar.g:4564:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalOptGrammar.g:4570:1: ruleLiteral returns [EObject current=null] : (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialVariables_0 = null;

        EObject this_BooleanConst_1 = null;

        EObject this_NumericLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_GasleftFunction_4 = null;

        EObject this_BlockhashFunction_5 = null;

        EObject this_MathematicalFunction_6 = null;

        EObject this_HashFunction_7 = null;

        EObject this_EcrecoverFunction_8 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4576:2: ( (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction ) )
            // InternalOptGrammar.g:4577:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction )
            {
            // InternalOptGrammar.g:4577:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction )
            int alt73=9;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
                {
                alt73=1;
                }
                break;
            case 188:
            case 189:
                {
                alt73=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case 68:
                {
                alt73=3;
                }
                break;
            case RULE_STRING:
                {
                alt73=4;
                }
                break;
            case 57:
                {
                alt73=5;
                }
                break;
            case 58:
                {
                alt73=6;
                }
                break;
            case 59:
            case 60:
                {
                alt73=7;
                }
                break;
            case 62:
            case 63:
            case 64:
                {
                alt73=8;
                }
                break;
            case 61:
                {
                alt73=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalOptGrammar.g:4578:3: this_SpecialVariables_0= ruleSpecialVariables
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
                    // InternalOptGrammar.g:4587:3: this_BooleanConst_1= ruleBooleanConst
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
                    // InternalOptGrammar.g:4596:3: this_NumericLiteral_2= ruleNumericLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumericLiteral_2=ruleNumericLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:4605:3: this_StringLiteral_3= ruleStringLiteral
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
                    // InternalOptGrammar.g:4614:3: this_GasleftFunction_4= ruleGasleftFunction
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
                case 6 :
                    // InternalOptGrammar.g:4623:3: this_BlockhashFunction_5= ruleBlockhashFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBlockhashFunctionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BlockhashFunction_5=ruleBlockhashFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BlockhashFunction_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalOptGrammar.g:4632:3: this_MathematicalFunction_6= ruleMathematicalFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getMathematicalFunctionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MathematicalFunction_6=ruleMathematicalFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MathematicalFunction_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalOptGrammar.g:4641:3: this_HashFunction_7= ruleHashFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getHashFunctionParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_HashFunction_7=ruleHashFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_HashFunction_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalOptGrammar.g:4650:3: this_EcrecoverFunction_8= ruleEcrecoverFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getEcrecoverFunctionParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EcrecoverFunction_8=ruleEcrecoverFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EcrecoverFunction_8;
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
    // InternalOptGrammar.g:4662:1: entryRuleGasleftFunction returns [EObject current=null] : iv_ruleGasleftFunction= ruleGasleftFunction EOF ;
    public final EObject entryRuleGasleftFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGasleftFunction = null;


        try {
            // InternalOptGrammar.g:4662:56: (iv_ruleGasleftFunction= ruleGasleftFunction EOF )
            // InternalOptGrammar.g:4663:2: iv_ruleGasleftFunction= ruleGasleftFunction EOF
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
    // InternalOptGrammar.g:4669:1: ruleGasleftFunction returns [EObject current=null] : ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleGasleftFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:4675:2: ( ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalOptGrammar.g:4676:2: ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalOptGrammar.g:4676:2: ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalOptGrammar.g:4677:3: ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalOptGrammar.g:4677:3: ( (lv_name_0_0= 'gasleft' ) )
            // InternalOptGrammar.g:4678:4: (lv_name_0_0= 'gasleft' )
            {
            // InternalOptGrammar.g:4678:4: (lv_name_0_0= 'gasleft' )
            // InternalOptGrammar.g:4679:5: lv_name_0_0= 'gasleft'
            {
            lv_name_0_0=(Token)match(input,57,FOLLOW_19); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,28,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGasleftFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBlockhashFunction"
    // InternalOptGrammar.g:4703:1: entryRuleBlockhashFunction returns [EObject current=null] : iv_ruleBlockhashFunction= ruleBlockhashFunction EOF ;
    public final EObject entryRuleBlockhashFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockhashFunction = null;


        try {
            // InternalOptGrammar.g:4703:58: (iv_ruleBlockhashFunction= ruleBlockhashFunction EOF )
            // InternalOptGrammar.g:4704:2: iv_ruleBlockhashFunction= ruleBlockhashFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockhashFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockhashFunction=ruleBlockhashFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockhashFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockhashFunction"


    // $ANTLR start "ruleBlockhashFunction"
    // InternalOptGrammar.g:4710:1: ruleBlockhashFunction returns [EObject current=null] : (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' ) ;
    public final EObject ruleBlockhashFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameter_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4716:2: ( (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' ) )
            // InternalOptGrammar.g:4717:2: (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            {
            // InternalOptGrammar.g:4717:2: (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            // InternalOptGrammar.g:4718:3: otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockhashFunctionAccess().getBlockhashKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockhashFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:4726:3: ( (lv_parameter_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4727:4: (lv_parameter_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4727:4: (lv_parameter_2_0= ruleIntParameter )
            // InternalOptGrammar.g:4728:5: lv_parameter_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockhashFunctionAccess().getParameterIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_parameter_2_0=ruleIntParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockhashFunctionRule());
              					}
              					set(
              						current,
              						"parameter",
              						lv_parameter_2_0,
              						"org.unicam.myGrammar.OptGrammar.IntParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockhashFunctionAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleBlockhashFunction"


    // $ANTLR start "entryRuleMathematicalFunction"
    // InternalOptGrammar.g:4753:1: entryRuleMathematicalFunction returns [EObject current=null] : iv_ruleMathematicalFunction= ruleMathematicalFunction EOF ;
    public final EObject entryRuleMathematicalFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathematicalFunction = null;


        try {
            // InternalOptGrammar.g:4753:61: (iv_ruleMathematicalFunction= ruleMathematicalFunction EOF )
            // InternalOptGrammar.g:4754:2: iv_ruleMathematicalFunction= ruleMathematicalFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMathematicalFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMathematicalFunction=ruleMathematicalFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMathematicalFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathematicalFunction"


    // $ANTLR start "ruleMathematicalFunction"
    // InternalOptGrammar.g:4760:1: ruleMathematicalFunction returns [EObject current=null] : ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' ) ;
    public final EObject ruleMathematicalFunction() throws RecognitionException {
        EObject current = null;

        Token lv_function_0_1=null;
        Token lv_function_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4766:2: ( ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' ) )
            // InternalOptGrammar.g:4767:2: ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' )
            {
            // InternalOptGrammar.g:4767:2: ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' )
            // InternalOptGrammar.g:4768:3: ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')'
            {
            // InternalOptGrammar.g:4768:3: ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) )
            // InternalOptGrammar.g:4769:4: ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) )
            {
            // InternalOptGrammar.g:4769:4: ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) )
            // InternalOptGrammar.g:4770:5: (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' )
            {
            // InternalOptGrammar.g:4770:5: (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==59) ) {
                alt74=1;
            }
            else if ( (LA74_0==60) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalOptGrammar.g:4771:6: lv_function_0_1= 'addmod'
                    {
                    lv_function_0_1=(Token)match(input,59,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_function_0_1, grammarAccess.getMathematicalFunctionAccess().getFunctionAddmodKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMathematicalFunctionRule());
                      						}
                      						setWithLastConsumed(current, "function", lv_function_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:4782:6: lv_function_0_2= 'mulmod'
                    {
                    lv_function_0_2=(Token)match(input,60,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_function_0_2, grammarAccess.getMathematicalFunctionAccess().getFunctionMulmodKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMathematicalFunctionRule());
                      						}
                      						setWithLastConsumed(current, "function", lv_function_0_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMathematicalFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:4799:3: ( (lv_parameters_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4800:4: (lv_parameters_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4800:4: (lv_parameters_2_0= ruleIntParameter )
            // InternalOptGrammar.g:4801:5: lv_parameters_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMathematicalFunctionAccess().getParametersIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_parameters_2_0=ruleIntParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMathematicalFunctionRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_2_0,
              						"org.unicam.myGrammar.OptGrammar.IntParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMathematicalFunctionAccess().getCommaKeyword_3());
              		
            }
            // InternalOptGrammar.g:4822:3: ( (lv_parameters_4_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4823:4: (lv_parameters_4_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4823:4: (lv_parameters_4_0= ruleIntParameter )
            // InternalOptGrammar.g:4824:5: lv_parameters_4_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMathematicalFunctionAccess().getParametersIntParameterParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_parameters_4_0=ruleIntParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMathematicalFunctionRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_4_0,
              						"org.unicam.myGrammar.OptGrammar.IntParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMathematicalFunctionAccess().getCommaKeyword_5());
              		
            }
            // InternalOptGrammar.g:4845:3: ( (lv_parameters_6_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4846:4: (lv_parameters_6_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4846:4: (lv_parameters_6_0= ruleIntParameter )
            // InternalOptGrammar.g:4847:5: lv_parameters_6_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMathematicalFunctionAccess().getParametersIntParameterParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_parameters_6_0=ruleIntParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMathematicalFunctionRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_6_0,
              						"org.unicam.myGrammar.OptGrammar.IntParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMathematicalFunctionAccess().getRightParenthesisKeyword_7());
              		
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
    // $ANTLR end "ruleMathematicalFunction"


    // $ANTLR start "entryRuleEcrecoverFunction"
    // InternalOptGrammar.g:4872:1: entryRuleEcrecoverFunction returns [EObject current=null] : iv_ruleEcrecoverFunction= ruleEcrecoverFunction EOF ;
    public final EObject entryRuleEcrecoverFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEcrecoverFunction = null;


        try {
            // InternalOptGrammar.g:4872:58: (iv_ruleEcrecoverFunction= ruleEcrecoverFunction EOF )
            // InternalOptGrammar.g:4873:2: iv_ruleEcrecoverFunction= ruleEcrecoverFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEcrecoverFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEcrecoverFunction=ruleEcrecoverFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEcrecoverFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEcrecoverFunction"


    // $ANTLR start "ruleEcrecoverFunction"
    // InternalOptGrammar.g:4879:1: ruleEcrecoverFunction returns [EObject current=null] : ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' ) ;
    public final EObject ruleEcrecoverFunction() throws RecognitionException {
        EObject current = null;

        Token lv_function_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4885:2: ( ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' ) )
            // InternalOptGrammar.g:4886:2: ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' )
            {
            // InternalOptGrammar.g:4886:2: ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' )
            // InternalOptGrammar.g:4887:3: ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')'
            {
            // InternalOptGrammar.g:4887:3: ( (lv_function_0_0= 'ecrecover' ) )
            // InternalOptGrammar.g:4888:4: (lv_function_0_0= 'ecrecover' )
            {
            // InternalOptGrammar.g:4888:4: (lv_function_0_0= 'ecrecover' )
            // InternalOptGrammar.g:4889:5: lv_function_0_0= 'ecrecover'
            {
            lv_function_0_0=(Token)match(input,61,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_function_0_0, grammarAccess.getEcrecoverFunctionAccess().getFunctionEcrecoverKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEcrecoverFunctionRule());
              					}
              					setWithLastConsumed(current, "function", lv_function_0_0, "ecrecover");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEcrecoverFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:4905:3: ( (lv_parameters_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4906:4: (lv_parameters_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4906:4: (lv_parameters_2_0= ruleIntParameter )
            // InternalOptGrammar.g:4907:5: lv_parameters_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_parameters_2_0=ruleIntParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEcrecoverFunctionRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_2_0,
              						"org.unicam.myGrammar.OptGrammar.IntParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEcrecoverFunctionAccess().getCommaKeyword_3());
              		
            }
            // InternalOptGrammar.g:4928:3: ( (lv_parameters_4_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4929:4: (lv_parameters_4_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4929:4: (lv_parameters_4_0= ruleIntParameter )
            // InternalOptGrammar.g:4930:5: lv_parameters_4_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_parameters_4_0=ruleIntParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEcrecoverFunctionRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_4_0,
              						"org.unicam.myGrammar.OptGrammar.IntParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEcrecoverFunctionAccess().getCommaKeyword_5());
              		
            }
            // InternalOptGrammar.g:4951:3: ( (lv_parameters_6_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4952:4: (lv_parameters_6_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4952:4: (lv_parameters_6_0= ruleIntParameter )
            // InternalOptGrammar.g:4953:5: lv_parameters_6_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_parameters_6_0=ruleIntParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEcrecoverFunctionRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_6_0,
              						"org.unicam.myGrammar.OptGrammar.IntParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEcrecoverFunctionAccess().getCommaKeyword_7());
              		
            }
            // InternalOptGrammar.g:4974:3: ( (lv_parameters_8_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4975:4: (lv_parameters_8_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4975:4: (lv_parameters_8_0= ruleIntParameter )
            // InternalOptGrammar.g:4976:5: lv_parameters_8_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_parameters_8_0=ruleIntParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEcrecoverFunctionRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_8_0,
              						"org.unicam.myGrammar.OptGrammar.IntParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getEcrecoverFunctionAccess().getRightParenthesisKeyword_9());
              		
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
    // $ANTLR end "ruleEcrecoverFunction"


    // $ANTLR start "entryRuleHashFunction"
    // InternalOptGrammar.g:5001:1: entryRuleHashFunction returns [EObject current=null] : iv_ruleHashFunction= ruleHashFunction EOF ;
    public final EObject entryRuleHashFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashFunction = null;


        try {
            // InternalOptGrammar.g:5001:53: (iv_ruleHashFunction= ruleHashFunction EOF )
            // InternalOptGrammar.g:5002:2: iv_ruleHashFunction= ruleHashFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHashFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHashFunction=ruleHashFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHashFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHashFunction"


    // $ANTLR start "ruleHashFunction"
    // InternalOptGrammar.g:5008:1: ruleHashFunction returns [EObject current=null] : ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' ) ;
    public final EObject ruleHashFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5014:2: ( ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' ) )
            // InternalOptGrammar.g:5015:2: ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            {
            // InternalOptGrammar.g:5015:2: ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            // InternalOptGrammar.g:5016:3: ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')'
            {
            // InternalOptGrammar.g:5016:3: ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) )
            // InternalOptGrammar.g:5017:4: ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) )
            {
            // InternalOptGrammar.g:5017:4: ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) )
            // InternalOptGrammar.g:5018:5: (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' )
            {
            // InternalOptGrammar.g:5018:5: (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt75=1;
                }
                break;
            case 63:
                {
                alt75=2;
                }
                break;
            case 64:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalOptGrammar.g:5019:6: lv_name_0_1= 'keccak256'
                    {
                    lv_name_0_1=(Token)match(input,62,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_1, grammarAccess.getHashFunctionAccess().getNameKeccak256Keyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getHashFunctionRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:5030:6: lv_name_0_2= 'sha256'
                    {
                    lv_name_0_2=(Token)match(input,63,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_2, grammarAccess.getHashFunctionAccess().getNameSha256Keyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getHashFunctionRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:5041:6: lv_name_0_3= 'ripemd160'
                    {
                    lv_name_0_3=(Token)match(input,64,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_3, grammarAccess.getHashFunctionAccess().getNameRipemd160Keyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getHashFunctionRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHashFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:5058:3: ( (lv_parameters_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:5059:4: (lv_parameters_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:5059:4: (lv_parameters_2_0= ruleIntParameter )
            // InternalOptGrammar.g:5060:5: lv_parameters_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHashFunctionAccess().getParametersIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_parameters_2_0=ruleIntParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHashFunctionRule());
              					}
              					set(
              						current,
              						"parameters",
              						lv_parameters_2_0,
              						"org.unicam.myGrammar.OptGrammar.IntParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getHashFunctionAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleHashFunction"


    // $ANTLR start "entryRuleIntParameter"
    // InternalOptGrammar.g:5085:1: entryRuleIntParameter returns [EObject current=null] : iv_ruleIntParameter= ruleIntParameter EOF ;
    public final EObject entryRuleIntParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntParameter = null;


        try {
            // InternalOptGrammar.g:5085:53: (iv_ruleIntParameter= ruleIntParameter EOF )
            // InternalOptGrammar.g:5086:2: iv_ruleIntParameter= ruleIntParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntParameter=ruleIntParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntParameter"


    // $ANTLR start "ruleIntParameter"
    // InternalOptGrammar.g:5092:1: ruleIntParameter returns [EObject current=null] : ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) ) ;
    public final EObject ruleIntParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_fun_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5098:2: ( ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) ) )
            // InternalOptGrammar.g:5099:2: ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) )
            {
            // InternalOptGrammar.g:5099:2: ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_INT && LA76_0<=RULE_DECIMAL)||LA76_0==28||LA76_0==68) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_ID) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalOptGrammar.g:5100:3: ( (lv_param_0_0= ruleArithmeticOperations ) )
                    {
                    // InternalOptGrammar.g:5100:3: ( (lv_param_0_0= ruleArithmeticOperations ) )
                    // InternalOptGrammar.g:5101:4: (lv_param_0_0= ruleArithmeticOperations )
                    {
                    // InternalOptGrammar.g:5101:4: (lv_param_0_0= ruleArithmeticOperations )
                    // InternalOptGrammar.g:5102:5: lv_param_0_0= ruleArithmeticOperations
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIntParameterAccess().getParamArithmeticOperationsParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_param_0_0=ruleArithmeticOperations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIntParameterRule());
                      					}
                      					set(
                      						current,
                      						"param",
                      						lv_param_0_0,
                      						"org.unicam.myGrammar.OptGrammar.ArithmeticOperations");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:5120:3: ( (lv_fun_1_0= ruleFunctionCall ) )
                    {
                    // InternalOptGrammar.g:5120:3: ( (lv_fun_1_0= ruleFunctionCall ) )
                    // InternalOptGrammar.g:5121:4: (lv_fun_1_0= ruleFunctionCall )
                    {
                    // InternalOptGrammar.g:5121:4: (lv_fun_1_0= ruleFunctionCall )
                    // InternalOptGrammar.g:5122:5: lv_fun_1_0= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIntParameterAccess().getFunFunctionCallParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_fun_1_0=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIntParameterRule());
                      					}
                      					set(
                      						current,
                      						"fun",
                      						lv_fun_1_0,
                      						"org.unicam.myGrammar.OptGrammar.FunctionCall");
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
    // $ANTLR end "ruleIntParameter"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalOptGrammar.g:5143:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalOptGrammar.g:5143:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalOptGrammar.g:5144:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalOptGrammar.g:5150:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5156:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:5157:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:5157:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:5158:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalOptGrammar.g:5158:3: ( (otherlv_0= RULE_ID ) )
            // InternalOptGrammar.g:5159:4: (otherlv_0= RULE_ID )
            {
            // InternalOptGrammar.g:5159:4: (otherlv_0= RULE_ID )
            // InternalOptGrammar.g:5160:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getNameFunctionDefinitionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:5175:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_STRING||(LA78_0>=RULE_INT && LA78_0<=RULE_TX)||(LA78_0>=54 && LA78_0<=55)||(LA78_0>=57 && LA78_0<=64)||LA78_0==68||(LA78_0>=188 && LA78_0<=189)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalOptGrammar.g:5176:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalOptGrammar.g:5176:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalOptGrammar.g:5177:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:5177:5: (lv_parameters_2_0= ruleExpression )
                    // InternalOptGrammar.g:5178:6: lv_parameters_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_parameters_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"org.unicam.myGrammar.OptGrammar.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:5195:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==22) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalOptGrammar.g:5196:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:5200:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalOptGrammar.g:5201:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalOptGrammar.g:5201:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalOptGrammar.g:5202:7: lv_parameters_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_parameters_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"org.unicam.myGrammar.OptGrammar.Expression");
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
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleArithmeticOperations"
    // InternalOptGrammar.g:5229:1: entryRuleArithmeticOperations returns [EObject current=null] : iv_ruleArithmeticOperations= ruleArithmeticOperations EOF ;
    public final EObject entryRuleArithmeticOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticOperations = null;


        try {
            // InternalOptGrammar.g:5229:61: (iv_ruleArithmeticOperations= ruleArithmeticOperations EOF )
            // InternalOptGrammar.g:5230:2: iv_ruleArithmeticOperations= ruleArithmeticOperations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticOperationsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticOperations=ruleArithmeticOperations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticOperations; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticOperations"


    // $ANTLR start "ruleArithmeticOperations"
    // InternalOptGrammar.g:5236:1: ruleArithmeticOperations returns [EObject current=null] : ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* ) ;
    public final EObject ruleArithmeticOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_first_0_0 = null;

        EObject lv_seconds_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5242:2: ( ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* ) )
            // InternalOptGrammar.g:5243:2: ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* )
            {
            // InternalOptGrammar.g:5243:2: ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* )
            // InternalOptGrammar.g:5244:3: ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )*
            {
            // InternalOptGrammar.g:5244:3: ( (lv_first_0_0= rulePrimaryArithmetic ) )
            // InternalOptGrammar.g:5245:4: (lv_first_0_0= rulePrimaryArithmetic )
            {
            // InternalOptGrammar.g:5245:4: (lv_first_0_0= rulePrimaryArithmetic )
            // InternalOptGrammar.g:5246:5: lv_first_0_0= rulePrimaryArithmetic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArithmeticOperationsAccess().getFirstPrimaryArithmeticParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_62);
            lv_first_0_0=rulePrimaryArithmetic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArithmeticOperationsRule());
              					}
              					set(
              						current,
              						"first",
              						lv_first_0_0,
              						"org.unicam.myGrammar.OptGrammar.PrimaryArithmetic");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:5263:3: ( (lv_seconds_1_0= ruleSecondOperators ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==18||(LA79_0>=65 && LA79_0<=67)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalOptGrammar.g:5264:4: (lv_seconds_1_0= ruleSecondOperators )
            	    {
            	    // InternalOptGrammar.g:5264:4: (lv_seconds_1_0= ruleSecondOperators )
            	    // InternalOptGrammar.g:5265:5: lv_seconds_1_0= ruleSecondOperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getArithmeticOperationsAccess().getSecondsSecondOperatorsParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_62);
            	    lv_seconds_1_0=ruleSecondOperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getArithmeticOperationsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"seconds",
            	      						lv_seconds_1_0,
            	      						"org.unicam.myGrammar.OptGrammar.SecondOperators");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleArithmeticOperations"


    // $ANTLR start "entryRulePrimaryArithmetic"
    // InternalOptGrammar.g:5286:1: entryRulePrimaryArithmetic returns [EObject current=null] : iv_rulePrimaryArithmetic= rulePrimaryArithmetic EOF ;
    public final EObject entryRulePrimaryArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryArithmetic = null;


        try {
            // InternalOptGrammar.g:5286:58: (iv_rulePrimaryArithmetic= rulePrimaryArithmetic EOF )
            // InternalOptGrammar.g:5287:2: iv_rulePrimaryArithmetic= rulePrimaryArithmetic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryArithmeticRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryArithmetic=rulePrimaryArithmetic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryArithmetic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryArithmetic"


    // $ANTLR start "rulePrimaryArithmetic"
    // InternalOptGrammar.g:5293:1: rulePrimaryArithmetic returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryArithmetic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_NumericLiteral_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5299:2: ( (this_NumericLiteral_0= ruleNumericLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalOptGrammar.g:5300:2: (this_NumericLiteral_0= ruleNumericLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalOptGrammar.g:5300:2: (this_NumericLiteral_0= ruleNumericLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_INT && LA80_0<=RULE_DECIMAL)||LA80_0==68) ) {
                alt80=1;
            }
            else if ( (LA80_0==28) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalOptGrammar.g:5301:3: this_NumericLiteral_0= ruleNumericLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryArithmeticAccess().getNumericLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumericLiteral_0=ruleNumericLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:5310:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalOptGrammar.g:5310:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalOptGrammar.g:5311:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryArithmeticAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryArithmeticAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryArithmeticAccess().getRightParenthesisKeyword_1_2());
                      			
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
    // $ANTLR end "rulePrimaryArithmetic"


    // $ANTLR start "entryRuleSecondOperators"
    // InternalOptGrammar.g:5332:1: entryRuleSecondOperators returns [EObject current=null] : iv_ruleSecondOperators= ruleSecondOperators EOF ;
    public final EObject entryRuleSecondOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondOperators = null;


        try {
            // InternalOptGrammar.g:5332:56: (iv_ruleSecondOperators= ruleSecondOperators EOF )
            // InternalOptGrammar.g:5333:2: iv_ruleSecondOperators= ruleSecondOperators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSecondOperatorsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSecondOperators=ruleSecondOperators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSecondOperators; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecondOperators"


    // $ANTLR start "ruleSecondOperators"
    // InternalOptGrammar.g:5339:1: ruleSecondOperators returns [EObject current=null] : ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) ) ;
    public final EObject ruleSecondOperators() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        Token lv_operator_0_3=null;
        Token lv_operator_0_4=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5345:2: ( ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) ) )
            // InternalOptGrammar.g:5346:2: ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) )
            {
            // InternalOptGrammar.g:5346:2: ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) )
            // InternalOptGrammar.g:5347:3: ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) )
            {
            // InternalOptGrammar.g:5347:3: ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) )
            // InternalOptGrammar.g:5348:4: ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) )
            {
            // InternalOptGrammar.g:5348:4: ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) )
            // InternalOptGrammar.g:5349:5: (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' )
            {
            // InternalOptGrammar.g:5349:5: (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt81=1;
                }
                break;
            case 66:
                {
                alt81=2;
                }
                break;
            case 67:
                {
                alt81=3;
                }
                break;
            case 18:
                {
                alt81=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalOptGrammar.g:5350:6: lv_operator_0_1= '+'
                    {
                    lv_operator_0_1=(Token)match(input,65,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_1, grammarAccess.getSecondOperatorsAccess().getOperatorPlusSignKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSecondOperatorsRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:5361:6: lv_operator_0_2= '-'
                    {
                    lv_operator_0_2=(Token)match(input,66,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_2, grammarAccess.getSecondOperatorsAccess().getOperatorHyphenMinusKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSecondOperatorsRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:5372:6: lv_operator_0_3= '/'
                    {
                    lv_operator_0_3=(Token)match(input,67,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_3, grammarAccess.getSecondOperatorsAccess().getOperatorSolidusKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSecondOperatorsRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:5383:6: lv_operator_0_4= '*'
                    {
                    lv_operator_0_4=(Token)match(input,18,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_4, grammarAccess.getSecondOperatorsAccess().getOperatorAsteriskKeyword_0_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSecondOperatorsRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_4, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalOptGrammar.g:5396:3: ( (lv_value_1_0= rulePrimaryArithmetic ) )
            // InternalOptGrammar.g:5397:4: (lv_value_1_0= rulePrimaryArithmetic )
            {
            // InternalOptGrammar.g:5397:4: (lv_value_1_0= rulePrimaryArithmetic )
            // InternalOptGrammar.g:5398:5: lv_value_1_0= rulePrimaryArithmetic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSecondOperatorsAccess().getValuePrimaryArithmeticParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=rulePrimaryArithmetic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSecondOperatorsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.unicam.myGrammar.OptGrammar.PrimaryArithmetic");
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
    // $ANTLR end "ruleSecondOperators"


    // $ANTLR start "entryRuleBooleanConst"
    // InternalOptGrammar.g:5419:1: entryRuleBooleanConst returns [EObject current=null] : iv_ruleBooleanConst= ruleBooleanConst EOF ;
    public final EObject entryRuleBooleanConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConst = null;


        try {
            // InternalOptGrammar.g:5419:53: (iv_ruleBooleanConst= ruleBooleanConst EOF )
            // InternalOptGrammar.g:5420:2: iv_ruleBooleanConst= ruleBooleanConst EOF
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
    // InternalOptGrammar.g:5426:1: ruleBooleanConst returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) ;
    public final EObject ruleBooleanConst() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5432:2: ( ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) )
            // InternalOptGrammar.g:5433:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            {
            // InternalOptGrammar.g:5433:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            // InternalOptGrammar.g:5434:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            {
            // InternalOptGrammar.g:5434:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            // InternalOptGrammar.g:5435:4: lv_value_0_0= ruleBooleanLiteralEnum
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
              					"org.unicam.myGrammar.OptGrammar.BooleanLiteralEnum");
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


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalOptGrammar.g:5455:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalOptGrammar.g:5455:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalOptGrammar.g:5456:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // InternalOptGrammar.g:5462:1: ruleNumericLiteral returns [EObject current=null] : ( ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_intValue_0_0 = null;

        EObject lv_hexValue_1_0 = null;

        EObject lv_decimalValue_2_0 = null;

        EObject lv_now_3_0 = null;

        EObject lv_etherUnit_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5468:2: ( ( ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? ) )
            // InternalOptGrammar.g:5469:2: ( ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? )
            {
            // InternalOptGrammar.g:5469:2: ( ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? )
            // InternalOptGrammar.g:5470:3: ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )?
            {
            // InternalOptGrammar.g:5470:3: ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt82=1;
                }
                break;
            case RULE_HEX:
                {
                alt82=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt82=3;
                }
                break;
            case 68:
                {
                alt82=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalOptGrammar.g:5471:4: ( (lv_intValue_0_0= ruleNumberDimensionless ) )
                    {
                    // InternalOptGrammar.g:5471:4: ( (lv_intValue_0_0= ruleNumberDimensionless ) )
                    // InternalOptGrammar.g:5472:5: (lv_intValue_0_0= ruleNumberDimensionless )
                    {
                    // InternalOptGrammar.g:5472:5: (lv_intValue_0_0= ruleNumberDimensionless )
                    // InternalOptGrammar.g:5473:6: lv_intValue_0_0= ruleNumberDimensionless
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getIntValueNumberDimensionlessParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
                    lv_intValue_0_0=ruleNumberDimensionless();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericLiteralRule());
                      						}
                      						set(
                      							current,
                      							"intValue",
                      							lv_intValue_0_0,
                      							"org.unicam.myGrammar.OptGrammar.NumberDimensionless");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:5491:4: ( (lv_hexValue_1_0= ruleHexLiteral ) )
                    {
                    // InternalOptGrammar.g:5491:4: ( (lv_hexValue_1_0= ruleHexLiteral ) )
                    // InternalOptGrammar.g:5492:5: (lv_hexValue_1_0= ruleHexLiteral )
                    {
                    // InternalOptGrammar.g:5492:5: (lv_hexValue_1_0= ruleHexLiteral )
                    // InternalOptGrammar.g:5493:6: lv_hexValue_1_0= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getHexValueHexLiteralParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
                    lv_hexValue_1_0=ruleHexLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericLiteralRule());
                      						}
                      						set(
                      							current,
                      							"hexValue",
                      							lv_hexValue_1_0,
                      							"org.unicam.myGrammar.OptGrammar.HexLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:5511:4: ( (lv_decimalValue_2_0= ruleDecimalLiteral ) )
                    {
                    // InternalOptGrammar.g:5511:4: ( (lv_decimalValue_2_0= ruleDecimalLiteral ) )
                    // InternalOptGrammar.g:5512:5: (lv_decimalValue_2_0= ruleDecimalLiteral )
                    {
                    // InternalOptGrammar.g:5512:5: (lv_decimalValue_2_0= ruleDecimalLiteral )
                    // InternalOptGrammar.g:5513:6: lv_decimalValue_2_0= ruleDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getDecimalValueDecimalLiteralParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
                    lv_decimalValue_2_0=ruleDecimalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericLiteralRule());
                      						}
                      						set(
                      							current,
                      							"decimalValue",
                      							lv_decimalValue_2_0,
                      							"org.unicam.myGrammar.OptGrammar.DecimalLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:5531:4: ( (lv_now_3_0= ruleNow ) )
                    {
                    // InternalOptGrammar.g:5531:4: ( (lv_now_3_0= ruleNow ) )
                    // InternalOptGrammar.g:5532:5: (lv_now_3_0= ruleNow )
                    {
                    // InternalOptGrammar.g:5532:5: (lv_now_3_0= ruleNow )
                    // InternalOptGrammar.g:5533:6: lv_now_3_0= ruleNow
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getNowNowParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
                    lv_now_3_0=ruleNow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericLiteralRule());
                      						}
                      						set(
                      							current,
                      							"now",
                      							lv_now_3_0,
                      							"org.unicam.myGrammar.OptGrammar.Now");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalOptGrammar.g:5551:3: ( (lv_etherUnit_4_0= ruleUnitTypes ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_INT) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalOptGrammar.g:5552:4: (lv_etherUnit_4_0= ruleUnitTypes )
                    {
                    // InternalOptGrammar.g:5552:4: (lv_etherUnit_4_0= ruleUnitTypes )
                    // InternalOptGrammar.g:5553:5: lv_etherUnit_4_0= ruleUnitTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNumericLiteralAccess().getEtherUnitUnitTypesParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_etherUnit_4_0=ruleUnitTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNumericLiteralRule());
                      					}
                      					set(
                      						current,
                      						"etherUnit",
                      						lv_etherUnit_4_0,
                      						"org.unicam.myGrammar.OptGrammar.UnitTypes");
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
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleNow"
    // InternalOptGrammar.g:5574:1: entryRuleNow returns [EObject current=null] : iv_ruleNow= ruleNow EOF ;
    public final EObject entryRuleNow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNow = null;


        try {
            // InternalOptGrammar.g:5574:44: (iv_ruleNow= ruleNow EOF )
            // InternalOptGrammar.g:5575:2: iv_ruleNow= ruleNow EOF
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
    // InternalOptGrammar.g:5581:1: ruleNow returns [EObject current=null] : ( () otherlv_1= 'now' ) ;
    public final EObject ruleNow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5587:2: ( ( () otherlv_1= 'now' ) )
            // InternalOptGrammar.g:5588:2: ( () otherlv_1= 'now' )
            {
            // InternalOptGrammar.g:5588:2: ( () otherlv_1= 'now' )
            // InternalOptGrammar.g:5589:3: () otherlv_1= 'now'
            {
            // InternalOptGrammar.g:5589:3: ()
            // InternalOptGrammar.g:5590:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNowAccess().getNowAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleUnitTypes"
    // InternalOptGrammar.g:5604:1: entryRuleUnitTypes returns [EObject current=null] : iv_ruleUnitTypes= ruleUnitTypes EOF ;
    public final EObject entryRuleUnitTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitTypes = null;


        try {
            // InternalOptGrammar.g:5604:50: (iv_ruleUnitTypes= ruleUnitTypes EOF )
            // InternalOptGrammar.g:5605:2: iv_ruleUnitTypes= ruleUnitTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnitTypes=ruleUnitTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitTypes"


    // $ANTLR start "ruleUnitTypes"
    // InternalOptGrammar.g:5611:1: ruleUnitTypes returns [EObject current=null] : ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) ) ;
    public final EObject ruleUnitTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_time_0_0 = null;

        EObject lv_units_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5617:2: ( ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) ) )
            // InternalOptGrammar.g:5618:2: ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) )
            {
            // InternalOptGrammar.g:5618:2: ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_INT) ) {
                int LA84_1 = input.LA(2);

                if ( ((LA84_1>=190 && LA84_1<=193)) ) {
                    alt84=2;
                }
                else if ( ((LA84_1>=194 && LA84_1<=199)) ) {
                    alt84=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalOptGrammar.g:5619:3: ( (lv_time_0_0= ruleTime ) )
                    {
                    // InternalOptGrammar.g:5619:3: ( (lv_time_0_0= ruleTime ) )
                    // InternalOptGrammar.g:5620:4: (lv_time_0_0= ruleTime )
                    {
                    // InternalOptGrammar.g:5620:4: (lv_time_0_0= ruleTime )
                    // InternalOptGrammar.g:5621:5: lv_time_0_0= ruleTime
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnitTypesAccess().getTimeTimeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_time_0_0=ruleTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getUnitTypesRule());
                      					}
                      					set(
                      						current,
                      						"time",
                      						lv_time_0_0,
                      						"org.unicam.myGrammar.OptGrammar.Time");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:5639:3: ( (lv_units_1_0= ruleEther ) )
                    {
                    // InternalOptGrammar.g:5639:3: ( (lv_units_1_0= ruleEther ) )
                    // InternalOptGrammar.g:5640:4: (lv_units_1_0= ruleEther )
                    {
                    // InternalOptGrammar.g:5640:4: (lv_units_1_0= ruleEther )
                    // InternalOptGrammar.g:5641:5: lv_units_1_0= ruleEther
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnitTypesAccess().getUnitsEtherParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_units_1_0=ruleEther();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getUnitTypesRule());
                      					}
                      					set(
                      						current,
                      						"units",
                      						lv_units_1_0,
                      						"org.unicam.myGrammar.OptGrammar.Ether");
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
    // $ANTLR end "ruleUnitTypes"


    // $ANTLR start "entryRuleNumberDimensionless"
    // InternalOptGrammar.g:5662:1: entryRuleNumberDimensionless returns [EObject current=null] : iv_ruleNumberDimensionless= ruleNumberDimensionless EOF ;
    public final EObject entryRuleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberDimensionless = null;


        try {
            // InternalOptGrammar.g:5662:60: (iv_ruleNumberDimensionless= ruleNumberDimensionless EOF )
            // InternalOptGrammar.g:5663:2: iv_ruleNumberDimensionless= ruleNumberDimensionless EOF
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
    // InternalOptGrammar.g:5669:1: ruleNumberDimensionless returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5675:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalOptGrammar.g:5676:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalOptGrammar.g:5676:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalOptGrammar.g:5677:3: (lv_value_0_0= RULE_INT )
            {
            // InternalOptGrammar.g:5677:3: (lv_value_0_0= RULE_INT )
            // InternalOptGrammar.g:5678:4: lv_value_0_0= RULE_INT
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
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // InternalOptGrammar.g:5697:1: entryRuleEther returns [EObject current=null] : iv_ruleEther= ruleEther EOF ;
    public final EObject entryRuleEther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEther = null;


        try {
            // InternalOptGrammar.g:5697:46: (iv_ruleEther= ruleEther EOF )
            // InternalOptGrammar.g:5698:2: iv_ruleEther= ruleEther EOF
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
    // InternalOptGrammar.g:5704:1: ruleEther returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) ;
    public final EObject ruleEther() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_ether_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5710:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) )
            // InternalOptGrammar.g:5711:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            {
            // InternalOptGrammar.g:5711:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            // InternalOptGrammar.g:5712:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            {
            // InternalOptGrammar.g:5712:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalOptGrammar.g:5713:4: (lv_value_0_0= RULE_INT )
            {
            // InternalOptGrammar.g:5713:4: (lv_value_0_0= RULE_INT )
            // InternalOptGrammar.g:5714:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_65); if (state.failed) return current;
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
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalOptGrammar.g:5730:3: ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            // InternalOptGrammar.g:5731:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            {
            // InternalOptGrammar.g:5731:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            // InternalOptGrammar.g:5732:5: lv_ether_1_0= ruleEtherSubDenominationEnum
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
              						"org.unicam.myGrammar.OptGrammar.EtherSubDenominationEnum");
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
    // InternalOptGrammar.g:5753:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalOptGrammar.g:5753:45: (iv_ruleTime= ruleTime EOF )
            // InternalOptGrammar.g:5754:2: iv_ruleTime= ruleTime EOF
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
    // InternalOptGrammar.g:5760:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_time_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5766:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) )
            // InternalOptGrammar.g:5767:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            {
            // InternalOptGrammar.g:5767:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            // InternalOptGrammar.g:5768:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            {
            // InternalOptGrammar.g:5768:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalOptGrammar.g:5769:4: (lv_value_0_0= RULE_INT )
            {
            // InternalOptGrammar.g:5769:4: (lv_value_0_0= RULE_INT )
            // InternalOptGrammar.g:5770:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_66); if (state.failed) return current;
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
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalOptGrammar.g:5786:3: ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            // InternalOptGrammar.g:5787:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            {
            // InternalOptGrammar.g:5787:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            // InternalOptGrammar.g:5788:5: lv_time_1_0= ruleTimeSubdenominationEnum
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
              						"org.unicam.myGrammar.OptGrammar.TimeSubdenominationEnum");
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
    // InternalOptGrammar.g:5809:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalOptGrammar.g:5809:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalOptGrammar.g:5810:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalOptGrammar.g:5816:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5822:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalOptGrammar.g:5823:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalOptGrammar.g:5823:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalOptGrammar.g:5824:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalOptGrammar.g:5824:3: (lv_value_0_0= RULE_STRING )
            // InternalOptGrammar.g:5825:4: lv_value_0_0= RULE_STRING
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
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
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
    // InternalOptGrammar.g:5844:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // InternalOptGrammar.g:5844:51: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // InternalOptGrammar.g:5845:2: iv_ruleHexLiteral= ruleHexLiteral EOF
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
    // InternalOptGrammar.g:5851:1: ruleHexLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_HEX ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5857:2: ( ( (lv_value_0_0= RULE_HEX ) ) )
            // InternalOptGrammar.g:5858:2: ( (lv_value_0_0= RULE_HEX ) )
            {
            // InternalOptGrammar.g:5858:2: ( (lv_value_0_0= RULE_HEX ) )
            // InternalOptGrammar.g:5859:3: (lv_value_0_0= RULE_HEX )
            {
            // InternalOptGrammar.g:5859:3: (lv_value_0_0= RULE_HEX )
            // InternalOptGrammar.g:5860:4: lv_value_0_0= RULE_HEX
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
              					"org.unicam.myGrammar.OptGrammar.HEX");
              			
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
    // InternalOptGrammar.g:5879:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalOptGrammar.g:5879:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalOptGrammar.g:5880:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalOptGrammar.g:5886:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5892:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalOptGrammar.g:5893:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalOptGrammar.g:5893:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalOptGrammar.g:5894:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalOptGrammar.g:5894:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalOptGrammar.g:5895:4: lv_value_0_0= RULE_DECIMAL
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
              					"org.unicam.myGrammar.OptGrammar.DECIMAL");
              			
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


    // $ANTLR start "entryRuleSpecialVariables"
    // InternalOptGrammar.g:5914:1: entryRuleSpecialVariables returns [EObject current=null] : iv_ruleSpecialVariables= ruleSpecialVariables EOF ;
    public final EObject entryRuleSpecialVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariables = null;


        try {
            // InternalOptGrammar.g:5914:57: (iv_ruleSpecialVariables= ruleSpecialVariables EOF )
            // InternalOptGrammar.g:5915:2: iv_ruleSpecialVariables= ruleSpecialVariables EOF
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
    // InternalOptGrammar.g:5921:1: ruleSpecialVariables returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) ;
    public final EObject ruleSpecialVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_field_2_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_qualifiers_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5927:2: ( ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) )
            // InternalOptGrammar.g:5928:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            {
            // InternalOptGrammar.g:5928:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            // InternalOptGrammar.g:5929:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )*
            {
            // InternalOptGrammar.g:5929:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) )
            // InternalOptGrammar.g:5930:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            {
            // InternalOptGrammar.g:5930:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            // InternalOptGrammar.g:5931:5: lv_type_0_0= ruleSpecialVariablesTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getTypeSpecialVariablesTypeEnumParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_67);
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
              						"org.unicam.myGrammar.OptGrammar.SpecialVariablesTypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpecialVariablesAccess().getFullStopKeyword_1());
              		
            }
            // InternalOptGrammar.g:5952:3: ( (lv_field_2_0= RULE_ID ) )
            // InternalOptGrammar.g:5953:4: (lv_field_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:5953:4: (lv_field_2_0= RULE_ID )
            // InternalOptGrammar.g:5954:5: lv_field_2_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalOptGrammar.g:5970:3: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==28||LA85_0==38||LA85_0==41) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalOptGrammar.g:5971:4: (lv_qualifiers_3_0= ruleQualifier )
            	    {
            	    // InternalOptGrammar.g:5971:4: (lv_qualifiers_3_0= ruleQualifier )
            	    // InternalOptGrammar.g:5972:5: lv_qualifiers_3_0= ruleQualifier
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
            	      						"org.unicam.myGrammar.OptGrammar.Qualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleSpecialVariables"


    // $ANTLR start "entryRuleElementaryTypeNameEnum"
    // InternalOptGrammar.g:5993:1: entryRuleElementaryTypeNameEnum returns [EObject current=null] : iv_ruleElementaryTypeNameEnum= ruleElementaryTypeNameEnum EOF ;
    public final EObject entryRuleElementaryTypeNameEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryTypeNameEnum = null;


        try {
            // InternalOptGrammar.g:5993:63: (iv_ruleElementaryTypeNameEnum= ruleElementaryTypeNameEnum EOF )
            // InternalOptGrammar.g:5994:2: iv_ruleElementaryTypeNameEnum= ruleElementaryTypeNameEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementaryTypeNameEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementaryTypeNameEnum=ruleElementaryTypeNameEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementaryTypeNameEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementaryTypeNameEnum"


    // $ANTLR start "ruleElementaryTypeNameEnum"
    // InternalOptGrammar.g:6000:1: ruleElementaryTypeNameEnum returns [EObject current=null] : ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) ) | ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) ) | ( ( (lv_type_2_1= 'byte' | lv_type_2_2= 'bytes' | lv_type_2_3= 'bytes1' | lv_type_2_4= 'bytes2' | lv_type_2_5= 'bytes3' | lv_type_2_6= 'bytes4' | lv_type_2_7= 'bytes5' | lv_type_2_8= 'bytes6' | lv_type_2_9= 'bytes7' | lv_type_2_10= 'bytes8' | lv_type_2_11= 'bytes9' | lv_type_2_12= 'bytes10' | lv_type_2_13= 'bytes11' | lv_type_2_14= 'bytes12' | lv_type_2_15= 'bytes13' | lv_type_2_16= 'bytes14' | lv_type_2_17= 'bytes15' | lv_type_2_18= 'bytes16' | lv_type_2_19= 'bytes17' | lv_type_2_20= 'bytes18' | lv_type_2_21= 'bytes19' | lv_type_2_22= 'bytes20' | lv_type_2_23= 'bytes21' | lv_type_2_24= 'bytes22' | lv_type_2_25= 'bytes23' | lv_type_2_26= 'bytes24' | lv_type_2_27= 'bytes25' | lv_type_2_28= 'bytes26' | lv_type_2_29= 'bytes27' | lv_type_2_30= 'bytes28' | lv_type_2_31= 'bytes29' | lv_type_2_32= 'bytes30' | lv_type_2_33= 'bytes31' | lv_type_2_34= 'bytes32' ) ) ) | ( ( (lv_type_3_1= 'string' | lv_type_3_2= 'address' | lv_type_3_3= 'bool' | lv_type_3_4= 'real' | lv_type_3_5= 'ureal' ) ) ) ) ;
    public final EObject ruleElementaryTypeNameEnum() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;
        Token lv_type_0_7=null;
        Token lv_type_0_8=null;
        Token lv_type_0_9=null;
        Token lv_type_0_10=null;
        Token lv_type_0_11=null;
        Token lv_type_0_12=null;
        Token lv_type_0_13=null;
        Token lv_type_0_14=null;
        Token lv_type_0_15=null;
        Token lv_type_0_16=null;
        Token lv_type_0_17=null;
        Token lv_type_0_18=null;
        Token lv_type_0_19=null;
        Token lv_type_0_20=null;
        Token lv_type_0_21=null;
        Token lv_type_0_22=null;
        Token lv_type_0_23=null;
        Token lv_type_0_24=null;
        Token lv_type_0_25=null;
        Token lv_type_0_26=null;
        Token lv_type_0_27=null;
        Token lv_type_0_28=null;
        Token lv_type_0_29=null;
        Token lv_type_0_30=null;
        Token lv_type_0_31=null;
        Token lv_type_0_32=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        Token lv_type_1_4=null;
        Token lv_type_1_5=null;
        Token lv_type_1_6=null;
        Token lv_type_1_7=null;
        Token lv_type_1_8=null;
        Token lv_type_1_9=null;
        Token lv_type_1_10=null;
        Token lv_type_1_11=null;
        Token lv_type_1_12=null;
        Token lv_type_1_13=null;
        Token lv_type_1_14=null;
        Token lv_type_1_15=null;
        Token lv_type_1_16=null;
        Token lv_type_1_17=null;
        Token lv_type_1_18=null;
        Token lv_type_1_19=null;
        Token lv_type_1_20=null;
        Token lv_type_1_21=null;
        Token lv_type_1_22=null;
        Token lv_type_1_23=null;
        Token lv_type_1_24=null;
        Token lv_type_1_25=null;
        Token lv_type_1_26=null;
        Token lv_type_1_27=null;
        Token lv_type_1_28=null;
        Token lv_type_1_29=null;
        Token lv_type_1_30=null;
        Token lv_type_1_31=null;
        Token lv_type_1_32=null;
        Token lv_type_1_33=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token lv_type_2_4=null;
        Token lv_type_2_5=null;
        Token lv_type_2_6=null;
        Token lv_type_2_7=null;
        Token lv_type_2_8=null;
        Token lv_type_2_9=null;
        Token lv_type_2_10=null;
        Token lv_type_2_11=null;
        Token lv_type_2_12=null;
        Token lv_type_2_13=null;
        Token lv_type_2_14=null;
        Token lv_type_2_15=null;
        Token lv_type_2_16=null;
        Token lv_type_2_17=null;
        Token lv_type_2_18=null;
        Token lv_type_2_19=null;
        Token lv_type_2_20=null;
        Token lv_type_2_21=null;
        Token lv_type_2_22=null;
        Token lv_type_2_23=null;
        Token lv_type_2_24=null;
        Token lv_type_2_25=null;
        Token lv_type_2_26=null;
        Token lv_type_2_27=null;
        Token lv_type_2_28=null;
        Token lv_type_2_29=null;
        Token lv_type_2_30=null;
        Token lv_type_2_31=null;
        Token lv_type_2_32=null;
        Token lv_type_2_33=null;
        Token lv_type_2_34=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token lv_type_3_4=null;
        Token lv_type_3_5=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6006:2: ( ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) ) | ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) ) | ( ( (lv_type_2_1= 'byte' | lv_type_2_2= 'bytes' | lv_type_2_3= 'bytes1' | lv_type_2_4= 'bytes2' | lv_type_2_5= 'bytes3' | lv_type_2_6= 'bytes4' | lv_type_2_7= 'bytes5' | lv_type_2_8= 'bytes6' | lv_type_2_9= 'bytes7' | lv_type_2_10= 'bytes8' | lv_type_2_11= 'bytes9' | lv_type_2_12= 'bytes10' | lv_type_2_13= 'bytes11' | lv_type_2_14= 'bytes12' | lv_type_2_15= 'bytes13' | lv_type_2_16= 'bytes14' | lv_type_2_17= 'bytes15' | lv_type_2_18= 'bytes16' | lv_type_2_19= 'bytes17' | lv_type_2_20= 'bytes18' | lv_type_2_21= 'bytes19' | lv_type_2_22= 'bytes20' | lv_type_2_23= 'bytes21' | lv_type_2_24= 'bytes22' | lv_type_2_25= 'bytes23' | lv_type_2_26= 'bytes24' | lv_type_2_27= 'bytes25' | lv_type_2_28= 'bytes26' | lv_type_2_29= 'bytes27' | lv_type_2_30= 'bytes28' | lv_type_2_31= 'bytes29' | lv_type_2_32= 'bytes30' | lv_type_2_33= 'bytes31' | lv_type_2_34= 'bytes32' ) ) ) | ( ( (lv_type_3_1= 'string' | lv_type_3_2= 'address' | lv_type_3_3= 'bool' | lv_type_3_4= 'real' | lv_type_3_5= 'ureal' ) ) ) ) )
            // InternalOptGrammar.g:6007:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) ) | ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) ) | ( ( (lv_type_2_1= 'byte' | lv_type_2_2= 'bytes' | lv_type_2_3= 'bytes1' | lv_type_2_4= 'bytes2' | lv_type_2_5= 'bytes3' | lv_type_2_6= 'bytes4' | lv_type_2_7= 'bytes5' | lv_type_2_8= 'bytes6' | lv_type_2_9= 'bytes7' | lv_type_2_10= 'bytes8' | lv_type_2_11= 'bytes9' | lv_type_2_12= 'bytes10' | lv_type_2_13= 'bytes11' | lv_type_2_14= 'bytes12' | lv_type_2_15= 'bytes13' | lv_type_2_16= 'bytes14' | lv_type_2_17= 'bytes15' | lv_type_2_18= 'bytes16' | lv_type_2_19= 'bytes17' | lv_type_2_20= 'bytes18' | lv_type_2_21= 'bytes19' | lv_type_2_22= 'bytes20' | lv_type_2_23= 'bytes21' | lv_type_2_24= 'bytes22' | lv_type_2_25= 'bytes23' | lv_type_2_26= 'bytes24' | lv_type_2_27= 'bytes25' | lv_type_2_28= 'bytes26' | lv_type_2_29= 'bytes27' | lv_type_2_30= 'bytes28' | lv_type_2_31= 'bytes29' | lv_type_2_32= 'bytes30' | lv_type_2_33= 'bytes31' | lv_type_2_34= 'bytes32' ) ) ) | ( ( (lv_type_3_1= 'string' | lv_type_3_2= 'address' | lv_type_3_3= 'bool' | lv_type_3_4= 'real' | lv_type_3_5= 'ureal' ) ) ) )
            {
            // InternalOptGrammar.g:6007:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) ) | ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) ) | ( ( (lv_type_2_1= 'byte' | lv_type_2_2= 'bytes' | lv_type_2_3= 'bytes1' | lv_type_2_4= 'bytes2' | lv_type_2_5= 'bytes3' | lv_type_2_6= 'bytes4' | lv_type_2_7= 'bytes5' | lv_type_2_8= 'bytes6' | lv_type_2_9= 'bytes7' | lv_type_2_10= 'bytes8' | lv_type_2_11= 'bytes9' | lv_type_2_12= 'bytes10' | lv_type_2_13= 'bytes11' | lv_type_2_14= 'bytes12' | lv_type_2_15= 'bytes13' | lv_type_2_16= 'bytes14' | lv_type_2_17= 'bytes15' | lv_type_2_18= 'bytes16' | lv_type_2_19= 'bytes17' | lv_type_2_20= 'bytes18' | lv_type_2_21= 'bytes19' | lv_type_2_22= 'bytes20' | lv_type_2_23= 'bytes21' | lv_type_2_24= 'bytes22' | lv_type_2_25= 'bytes23' | lv_type_2_26= 'bytes24' | lv_type_2_27= 'bytes25' | lv_type_2_28= 'bytes26' | lv_type_2_29= 'bytes27' | lv_type_2_30= 'bytes28' | lv_type_2_31= 'bytes29' | lv_type_2_32= 'bytes30' | lv_type_2_33= 'bytes31' | lv_type_2_34= 'bytes32' ) ) ) | ( ( (lv_type_3_1= 'string' | lv_type_3_2= 'address' | lv_type_3_3= 'bool' | lv_type_3_4= 'real' | lv_type_3_5= 'ureal' ) ) ) )
            int alt90=4;
            switch ( input.LA(1) ) {
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
                {
                alt90=1;
                }
                break;
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
                {
                alt90=2;
                }
                break;
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
                {
                alt90=3;
                }
                break;
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
                {
                alt90=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalOptGrammar.g:6008:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) )
                    {
                    // InternalOptGrammar.g:6008:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) )
                    // InternalOptGrammar.g:6009:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) )
                    {
                    // InternalOptGrammar.g:6009:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) )
                    // InternalOptGrammar.g:6010:5: (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' )
                    {
                    // InternalOptGrammar.g:6010:5: (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' )
                    int alt86=32;
                    switch ( input.LA(1) ) {
                    case 69:
                        {
                        alt86=1;
                        }
                        break;
                    case 70:
                        {
                        alt86=2;
                        }
                        break;
                    case 71:
                        {
                        alt86=3;
                        }
                        break;
                    case 72:
                        {
                        alt86=4;
                        }
                        break;
                    case 73:
                        {
                        alt86=5;
                        }
                        break;
                    case 74:
                        {
                        alt86=6;
                        }
                        break;
                    case 75:
                        {
                        alt86=7;
                        }
                        break;
                    case 76:
                        {
                        alt86=8;
                        }
                        break;
                    case 77:
                        {
                        alt86=9;
                        }
                        break;
                    case 78:
                        {
                        alt86=10;
                        }
                        break;
                    case 79:
                        {
                        alt86=11;
                        }
                        break;
                    case 80:
                        {
                        alt86=12;
                        }
                        break;
                    case 81:
                        {
                        alt86=13;
                        }
                        break;
                    case 82:
                        {
                        alt86=14;
                        }
                        break;
                    case 83:
                        {
                        alt86=15;
                        }
                        break;
                    case 84:
                        {
                        alt86=16;
                        }
                        break;
                    case 85:
                        {
                        alt86=17;
                        }
                        break;
                    case 86:
                        {
                        alt86=18;
                        }
                        break;
                    case 87:
                        {
                        alt86=19;
                        }
                        break;
                    case 88:
                        {
                        alt86=20;
                        }
                        break;
                    case 89:
                        {
                        alt86=21;
                        }
                        break;
                    case 90:
                        {
                        alt86=22;
                        }
                        break;
                    case 91:
                        {
                        alt86=23;
                        }
                        break;
                    case 92:
                        {
                        alt86=24;
                        }
                        break;
                    case 93:
                        {
                        alt86=25;
                        }
                        break;
                    case 94:
                        {
                        alt86=26;
                        }
                        break;
                    case 95:
                        {
                        alt86=27;
                        }
                        break;
                    case 96:
                        {
                        alt86=28;
                        }
                        break;
                    case 97:
                        {
                        alt86=29;
                        }
                        break;
                    case 98:
                        {
                        alt86=30;
                        }
                        break;
                    case 99:
                        {
                        alt86=31;
                        }
                        break;
                    case 100:
                        {
                        alt86=32;
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
                            // InternalOptGrammar.g:6011:6: lv_type_0_1= 'int'
                            {
                            lv_type_0_1=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_1, grammarAccess.getElementaryTypeNameEnumAccess().getTypeIntKeyword_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalOptGrammar.g:6022:6: lv_type_0_2= 'int16'
                            {
                            lv_type_0_2=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_2, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt16Keyword_0_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_2, null);
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalOptGrammar.g:6033:6: lv_type_0_3= 'int24'
                            {
                            lv_type_0_3=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_3, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt24Keyword_0_0_2());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_3, null);
                              					
                            }

                            }
                            break;
                        case 4 :
                            // InternalOptGrammar.g:6044:6: lv_type_0_4= 'int32'
                            {
                            lv_type_0_4=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_4, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt32Keyword_0_0_3());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_4, null);
                              					
                            }

                            }
                            break;
                        case 5 :
                            // InternalOptGrammar.g:6055:6: lv_type_0_5= 'int40'
                            {
                            lv_type_0_5=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_5, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt40Keyword_0_0_4());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_5, null);
                              					
                            }

                            }
                            break;
                        case 6 :
                            // InternalOptGrammar.g:6066:6: lv_type_0_6= 'int48'
                            {
                            lv_type_0_6=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_6, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt48Keyword_0_0_5());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_6, null);
                              					
                            }

                            }
                            break;
                        case 7 :
                            // InternalOptGrammar.g:6077:6: lv_type_0_7= 'int56'
                            {
                            lv_type_0_7=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_7, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt56Keyword_0_0_6());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_7, null);
                              					
                            }

                            }
                            break;
                        case 8 :
                            // InternalOptGrammar.g:6088:6: lv_type_0_8= 'int64'
                            {
                            lv_type_0_8=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_8, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt64Keyword_0_0_7());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_8, null);
                              					
                            }

                            }
                            break;
                        case 9 :
                            // InternalOptGrammar.g:6099:6: lv_type_0_9= 'int72'
                            {
                            lv_type_0_9=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_9, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt72Keyword_0_0_8());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_9, null);
                              					
                            }

                            }
                            break;
                        case 10 :
                            // InternalOptGrammar.g:6110:6: lv_type_0_10= 'int80'
                            {
                            lv_type_0_10=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_10, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt80Keyword_0_0_9());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_10, null);
                              					
                            }

                            }
                            break;
                        case 11 :
                            // InternalOptGrammar.g:6121:6: lv_type_0_11= 'int88'
                            {
                            lv_type_0_11=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_11, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt88Keyword_0_0_10());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_11, null);
                              					
                            }

                            }
                            break;
                        case 12 :
                            // InternalOptGrammar.g:6132:6: lv_type_0_12= 'int96'
                            {
                            lv_type_0_12=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_12, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt96Keyword_0_0_11());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_12, null);
                              					
                            }

                            }
                            break;
                        case 13 :
                            // InternalOptGrammar.g:6143:6: lv_type_0_13= 'int104'
                            {
                            lv_type_0_13=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_13, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt104Keyword_0_0_12());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_13, null);
                              					
                            }

                            }
                            break;
                        case 14 :
                            // InternalOptGrammar.g:6154:6: lv_type_0_14= 'int112'
                            {
                            lv_type_0_14=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_14, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt112Keyword_0_0_13());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_14, null);
                              					
                            }

                            }
                            break;
                        case 15 :
                            // InternalOptGrammar.g:6165:6: lv_type_0_15= 'int120'
                            {
                            lv_type_0_15=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_15, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt120Keyword_0_0_14());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_15, null);
                              					
                            }

                            }
                            break;
                        case 16 :
                            // InternalOptGrammar.g:6176:6: lv_type_0_16= 'int128'
                            {
                            lv_type_0_16=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_16, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt128Keyword_0_0_15());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_16, null);
                              					
                            }

                            }
                            break;
                        case 17 :
                            // InternalOptGrammar.g:6187:6: lv_type_0_17= 'int136'
                            {
                            lv_type_0_17=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_17, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt136Keyword_0_0_16());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_17, null);
                              					
                            }

                            }
                            break;
                        case 18 :
                            // InternalOptGrammar.g:6198:6: lv_type_0_18= 'int144'
                            {
                            lv_type_0_18=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_18, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt144Keyword_0_0_17());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_18, null);
                              					
                            }

                            }
                            break;
                        case 19 :
                            // InternalOptGrammar.g:6209:6: lv_type_0_19= 'int152'
                            {
                            lv_type_0_19=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_19, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt152Keyword_0_0_18());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_19, null);
                              					
                            }

                            }
                            break;
                        case 20 :
                            // InternalOptGrammar.g:6220:6: lv_type_0_20= 'int160'
                            {
                            lv_type_0_20=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_20, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt160Keyword_0_0_19());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_20, null);
                              					
                            }

                            }
                            break;
                        case 21 :
                            // InternalOptGrammar.g:6231:6: lv_type_0_21= 'int168'
                            {
                            lv_type_0_21=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_21, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt168Keyword_0_0_20());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_21, null);
                              					
                            }

                            }
                            break;
                        case 22 :
                            // InternalOptGrammar.g:6242:6: lv_type_0_22= 'int178'
                            {
                            lv_type_0_22=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_22, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt178Keyword_0_0_21());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_22, null);
                              					
                            }

                            }
                            break;
                        case 23 :
                            // InternalOptGrammar.g:6253:6: lv_type_0_23= 'int184'
                            {
                            lv_type_0_23=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_23, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt184Keyword_0_0_22());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_23, null);
                              					
                            }

                            }
                            break;
                        case 24 :
                            // InternalOptGrammar.g:6264:6: lv_type_0_24= 'int192'
                            {
                            lv_type_0_24=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_24, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt192Keyword_0_0_23());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_24, null);
                              					
                            }

                            }
                            break;
                        case 25 :
                            // InternalOptGrammar.g:6275:6: lv_type_0_25= 'int200'
                            {
                            lv_type_0_25=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_25, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt200Keyword_0_0_24());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_25, null);
                              					
                            }

                            }
                            break;
                        case 26 :
                            // InternalOptGrammar.g:6286:6: lv_type_0_26= 'int208'
                            {
                            lv_type_0_26=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_26, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt208Keyword_0_0_25());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_26, null);
                              					
                            }

                            }
                            break;
                        case 27 :
                            // InternalOptGrammar.g:6297:6: lv_type_0_27= 'int216'
                            {
                            lv_type_0_27=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_27, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt216Keyword_0_0_26());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_27, null);
                              					
                            }

                            }
                            break;
                        case 28 :
                            // InternalOptGrammar.g:6308:6: lv_type_0_28= 'int224'
                            {
                            lv_type_0_28=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_28, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt224Keyword_0_0_27());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_28, null);
                              					
                            }

                            }
                            break;
                        case 29 :
                            // InternalOptGrammar.g:6319:6: lv_type_0_29= 'int232'
                            {
                            lv_type_0_29=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_29, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt232Keyword_0_0_28());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_29, null);
                              					
                            }

                            }
                            break;
                        case 30 :
                            // InternalOptGrammar.g:6330:6: lv_type_0_30= 'int240'
                            {
                            lv_type_0_30=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_30, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt240Keyword_0_0_29());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_30, null);
                              					
                            }

                            }
                            break;
                        case 31 :
                            // InternalOptGrammar.g:6341:6: lv_type_0_31= 'int248'
                            {
                            lv_type_0_31=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_31, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt248Keyword_0_0_30());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_31, null);
                              					
                            }

                            }
                            break;
                        case 32 :
                            // InternalOptGrammar.g:6352:6: lv_type_0_32= 'int256'
                            {
                            lv_type_0_32=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_0_32, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt256Keyword_0_0_31());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_0_32, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:6366:3: ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) )
                    {
                    // InternalOptGrammar.g:6366:3: ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) )
                    // InternalOptGrammar.g:6367:4: ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) )
                    {
                    // InternalOptGrammar.g:6367:4: ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) )
                    // InternalOptGrammar.g:6368:5: (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' )
                    {
                    // InternalOptGrammar.g:6368:5: (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' )
                    int alt87=33;
                    switch ( input.LA(1) ) {
                    case 101:
                        {
                        alt87=1;
                        }
                        break;
                    case 102:
                        {
                        alt87=2;
                        }
                        break;
                    case 103:
                        {
                        alt87=3;
                        }
                        break;
                    case 104:
                        {
                        alt87=4;
                        }
                        break;
                    case 105:
                        {
                        alt87=5;
                        }
                        break;
                    case 106:
                        {
                        alt87=6;
                        }
                        break;
                    case 107:
                        {
                        alt87=7;
                        }
                        break;
                    case 108:
                        {
                        alt87=8;
                        }
                        break;
                    case 109:
                        {
                        alt87=9;
                        }
                        break;
                    case 110:
                        {
                        alt87=10;
                        }
                        break;
                    case 111:
                        {
                        alt87=11;
                        }
                        break;
                    case 112:
                        {
                        alt87=12;
                        }
                        break;
                    case 113:
                        {
                        alt87=13;
                        }
                        break;
                    case 114:
                        {
                        alt87=14;
                        }
                        break;
                    case 115:
                        {
                        alt87=15;
                        }
                        break;
                    case 116:
                        {
                        alt87=16;
                        }
                        break;
                    case 117:
                        {
                        alt87=17;
                        }
                        break;
                    case 118:
                        {
                        alt87=18;
                        }
                        break;
                    case 119:
                        {
                        alt87=19;
                        }
                        break;
                    case 120:
                        {
                        alt87=20;
                        }
                        break;
                    case 121:
                        {
                        alt87=21;
                        }
                        break;
                    case 122:
                        {
                        alt87=22;
                        }
                        break;
                    case 123:
                        {
                        alt87=23;
                        }
                        break;
                    case 124:
                        {
                        alt87=24;
                        }
                        break;
                    case 125:
                        {
                        alt87=25;
                        }
                        break;
                    case 126:
                        {
                        alt87=26;
                        }
                        break;
                    case 127:
                        {
                        alt87=27;
                        }
                        break;
                    case 128:
                        {
                        alt87=28;
                        }
                        break;
                    case 129:
                        {
                        alt87=29;
                        }
                        break;
                    case 130:
                        {
                        alt87=30;
                        }
                        break;
                    case 131:
                        {
                        alt87=31;
                        }
                        break;
                    case 132:
                        {
                        alt87=32;
                        }
                        break;
                    case 133:
                        {
                        alt87=33;
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
                            // InternalOptGrammar.g:6369:6: lv_type_1_1= 'uint'
                            {
                            lv_type_1_1=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_1, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUintKeyword_1_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalOptGrammar.g:6380:6: lv_type_1_2= 'uint8'
                            {
                            lv_type_1_2=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_2, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint8Keyword_1_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_2, null);
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalOptGrammar.g:6391:6: lv_type_1_3= 'uint16'
                            {
                            lv_type_1_3=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_3, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint16Keyword_1_0_2());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_3, null);
                              					
                            }

                            }
                            break;
                        case 4 :
                            // InternalOptGrammar.g:6402:6: lv_type_1_4= 'uint24'
                            {
                            lv_type_1_4=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_4, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint24Keyword_1_0_3());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_4, null);
                              					
                            }

                            }
                            break;
                        case 5 :
                            // InternalOptGrammar.g:6413:6: lv_type_1_5= 'uint32'
                            {
                            lv_type_1_5=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_5, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint32Keyword_1_0_4());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_5, null);
                              					
                            }

                            }
                            break;
                        case 6 :
                            // InternalOptGrammar.g:6424:6: lv_type_1_6= 'uint40'
                            {
                            lv_type_1_6=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_6, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint40Keyword_1_0_5());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_6, null);
                              					
                            }

                            }
                            break;
                        case 7 :
                            // InternalOptGrammar.g:6435:6: lv_type_1_7= 'uint48'
                            {
                            lv_type_1_7=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_7, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint48Keyword_1_0_6());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_7, null);
                              					
                            }

                            }
                            break;
                        case 8 :
                            // InternalOptGrammar.g:6446:6: lv_type_1_8= 'uint56'
                            {
                            lv_type_1_8=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_8, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint56Keyword_1_0_7());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_8, null);
                              					
                            }

                            }
                            break;
                        case 9 :
                            // InternalOptGrammar.g:6457:6: lv_type_1_9= 'uint64'
                            {
                            lv_type_1_9=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_9, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint64Keyword_1_0_8());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_9, null);
                              					
                            }

                            }
                            break;
                        case 10 :
                            // InternalOptGrammar.g:6468:6: lv_type_1_10= 'uint72'
                            {
                            lv_type_1_10=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_10, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint72Keyword_1_0_9());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_10, null);
                              					
                            }

                            }
                            break;
                        case 11 :
                            // InternalOptGrammar.g:6479:6: lv_type_1_11= 'uint80'
                            {
                            lv_type_1_11=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_11, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint80Keyword_1_0_10());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_11, null);
                              					
                            }

                            }
                            break;
                        case 12 :
                            // InternalOptGrammar.g:6490:6: lv_type_1_12= 'uint88'
                            {
                            lv_type_1_12=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_12, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint88Keyword_1_0_11());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_12, null);
                              					
                            }

                            }
                            break;
                        case 13 :
                            // InternalOptGrammar.g:6501:6: lv_type_1_13= 'uint96'
                            {
                            lv_type_1_13=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_13, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint96Keyword_1_0_12());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_13, null);
                              					
                            }

                            }
                            break;
                        case 14 :
                            // InternalOptGrammar.g:6512:6: lv_type_1_14= 'uint104'
                            {
                            lv_type_1_14=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_14, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint104Keyword_1_0_13());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_14, null);
                              					
                            }

                            }
                            break;
                        case 15 :
                            // InternalOptGrammar.g:6523:6: lv_type_1_15= 'uint112'
                            {
                            lv_type_1_15=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_15, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint112Keyword_1_0_14());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_15, null);
                              					
                            }

                            }
                            break;
                        case 16 :
                            // InternalOptGrammar.g:6534:6: lv_type_1_16= 'uint120'
                            {
                            lv_type_1_16=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_16, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint120Keyword_1_0_15());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_16, null);
                              					
                            }

                            }
                            break;
                        case 17 :
                            // InternalOptGrammar.g:6545:6: lv_type_1_17= 'uint128'
                            {
                            lv_type_1_17=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_17, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint128Keyword_1_0_16());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_17, null);
                              					
                            }

                            }
                            break;
                        case 18 :
                            // InternalOptGrammar.g:6556:6: lv_type_1_18= 'uint136'
                            {
                            lv_type_1_18=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_18, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint136Keyword_1_0_17());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_18, null);
                              					
                            }

                            }
                            break;
                        case 19 :
                            // InternalOptGrammar.g:6567:6: lv_type_1_19= 'uint144'
                            {
                            lv_type_1_19=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_19, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint144Keyword_1_0_18());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_19, null);
                              					
                            }

                            }
                            break;
                        case 20 :
                            // InternalOptGrammar.g:6578:6: lv_type_1_20= 'uint152'
                            {
                            lv_type_1_20=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_20, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint152Keyword_1_0_19());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_20, null);
                              					
                            }

                            }
                            break;
                        case 21 :
                            // InternalOptGrammar.g:6589:6: lv_type_1_21= 'uint160'
                            {
                            lv_type_1_21=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_21, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint160Keyword_1_0_20());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_21, null);
                              					
                            }

                            }
                            break;
                        case 22 :
                            // InternalOptGrammar.g:6600:6: lv_type_1_22= 'uint168'
                            {
                            lv_type_1_22=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_22, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint168Keyword_1_0_21());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_22, null);
                              					
                            }

                            }
                            break;
                        case 23 :
                            // InternalOptGrammar.g:6611:6: lv_type_1_23= 'uint178'
                            {
                            lv_type_1_23=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_23, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint178Keyword_1_0_22());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_23, null);
                              					
                            }

                            }
                            break;
                        case 24 :
                            // InternalOptGrammar.g:6622:6: lv_type_1_24= 'uint184'
                            {
                            lv_type_1_24=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_24, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint184Keyword_1_0_23());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_24, null);
                              					
                            }

                            }
                            break;
                        case 25 :
                            // InternalOptGrammar.g:6633:6: lv_type_1_25= 'uint192'
                            {
                            lv_type_1_25=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_25, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint192Keyword_1_0_24());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_25, null);
                              					
                            }

                            }
                            break;
                        case 26 :
                            // InternalOptGrammar.g:6644:6: lv_type_1_26= 'uint200'
                            {
                            lv_type_1_26=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_26, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint200Keyword_1_0_25());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_26, null);
                              					
                            }

                            }
                            break;
                        case 27 :
                            // InternalOptGrammar.g:6655:6: lv_type_1_27= 'uint208'
                            {
                            lv_type_1_27=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_27, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint208Keyword_1_0_26());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_27, null);
                              					
                            }

                            }
                            break;
                        case 28 :
                            // InternalOptGrammar.g:6666:6: lv_type_1_28= 'uint216'
                            {
                            lv_type_1_28=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_28, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint216Keyword_1_0_27());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_28, null);
                              					
                            }

                            }
                            break;
                        case 29 :
                            // InternalOptGrammar.g:6677:6: lv_type_1_29= 'uint224'
                            {
                            lv_type_1_29=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_29, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint224Keyword_1_0_28());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_29, null);
                              					
                            }

                            }
                            break;
                        case 30 :
                            // InternalOptGrammar.g:6688:6: lv_type_1_30= 'uint232'
                            {
                            lv_type_1_30=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_30, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint232Keyword_1_0_29());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_30, null);
                              					
                            }

                            }
                            break;
                        case 31 :
                            // InternalOptGrammar.g:6699:6: lv_type_1_31= 'uint240'
                            {
                            lv_type_1_31=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_31, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint240Keyword_1_0_30());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_31, null);
                              					
                            }

                            }
                            break;
                        case 32 :
                            // InternalOptGrammar.g:6710:6: lv_type_1_32= 'uint248'
                            {
                            lv_type_1_32=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_32, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint248Keyword_1_0_31());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_32, null);
                              					
                            }

                            }
                            break;
                        case 33 :
                            // InternalOptGrammar.g:6721:6: lv_type_1_33= 'uint256'
                            {
                            lv_type_1_33=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_1_33, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint256Keyword_1_0_32());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_1_33, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:6735:3: ( ( (lv_type_2_1= 'byte' | lv_type_2_2= 'bytes' | lv_type_2_3= 'bytes1' | lv_type_2_4= 'bytes2' | lv_type_2_5= 'bytes3' | lv_type_2_6= 'bytes4' | lv_type_2_7= 'bytes5' | lv_type_2_8= 'bytes6' | lv_type_2_9= 'bytes7' | lv_type_2_10= 'bytes8' | lv_type_2_11= 'bytes9' | lv_type_2_12= 'bytes10' | lv_type_2_13= 'bytes11' | lv_type_2_14= 'bytes12' | lv_type_2_15= 'bytes13' | lv_type_2_16= 'bytes14' | lv_type_2_17= 'bytes15' | lv_type_2_18= 'bytes16' | lv_type_2_19= 'bytes17' | lv_type_2_20= 'bytes18' | lv_type_2_21= 'bytes19' | lv_type_2_22= 'bytes20' | lv_type_2_23= 'bytes21' | lv_type_2_24= 'bytes22' | lv_type_2_25= 'bytes23' | lv_type_2_26= 'bytes24' | lv_type_2_27= 'bytes25' | lv_type_2_28= 'bytes26' | lv_type_2_29= 'bytes27' | lv_type_2_30= 'bytes28' | lv_type_2_31= 'bytes29' | lv_type_2_32= 'bytes30' | lv_type_2_33= 'bytes31' | lv_type_2_34= 'bytes32' ) ) )
                    {
                    // InternalOptGrammar.g:6735:3: ( ( (lv_type_2_1= 'byte' | lv_type_2_2= 'bytes' | lv_type_2_3= 'bytes1' | lv_type_2_4= 'bytes2' | lv_type_2_5= 'bytes3' | lv_type_2_6= 'bytes4' | lv_type_2_7= 'bytes5' | lv_type_2_8= 'bytes6' | lv_type_2_9= 'bytes7' | lv_type_2_10= 'bytes8' | lv_type_2_11= 'bytes9' | lv_type_2_12= 'bytes10' | lv_type_2_13= 'bytes11' | lv_type_2_14= 'bytes12' | lv_type_2_15= 'bytes13' | lv_type_2_16= 'bytes14' | lv_type_2_17= 'bytes15' | lv_type_2_18= 'bytes16' | lv_type_2_19= 'bytes17' | lv_type_2_20= 'bytes18' | lv_type_2_21= 'bytes19' | lv_type_2_22= 'bytes20' | lv_type_2_23= 'bytes21' | lv_type_2_24= 'bytes22' | lv_type_2_25= 'bytes23' | lv_type_2_26= 'bytes24' | lv_type_2_27= 'bytes25' | lv_type_2_28= 'bytes26' | lv_type_2_29= 'bytes27' | lv_type_2_30= 'bytes28' | lv_type_2_31= 'bytes29' | lv_type_2_32= 'bytes30' | lv_type_2_33= 'bytes31' | lv_type_2_34= 'bytes32' ) ) )
                    // InternalOptGrammar.g:6736:4: ( (lv_type_2_1= 'byte' | lv_type_2_2= 'bytes' | lv_type_2_3= 'bytes1' | lv_type_2_4= 'bytes2' | lv_type_2_5= 'bytes3' | lv_type_2_6= 'bytes4' | lv_type_2_7= 'bytes5' | lv_type_2_8= 'bytes6' | lv_type_2_9= 'bytes7' | lv_type_2_10= 'bytes8' | lv_type_2_11= 'bytes9' | lv_type_2_12= 'bytes10' | lv_type_2_13= 'bytes11' | lv_type_2_14= 'bytes12' | lv_type_2_15= 'bytes13' | lv_type_2_16= 'bytes14' | lv_type_2_17= 'bytes15' | lv_type_2_18= 'bytes16' | lv_type_2_19= 'bytes17' | lv_type_2_20= 'bytes18' | lv_type_2_21= 'bytes19' | lv_type_2_22= 'bytes20' | lv_type_2_23= 'bytes21' | lv_type_2_24= 'bytes22' | lv_type_2_25= 'bytes23' | lv_type_2_26= 'bytes24' | lv_type_2_27= 'bytes25' | lv_type_2_28= 'bytes26' | lv_type_2_29= 'bytes27' | lv_type_2_30= 'bytes28' | lv_type_2_31= 'bytes29' | lv_type_2_32= 'bytes30' | lv_type_2_33= 'bytes31' | lv_type_2_34= 'bytes32' ) )
                    {
                    // InternalOptGrammar.g:6736:4: ( (lv_type_2_1= 'byte' | lv_type_2_2= 'bytes' | lv_type_2_3= 'bytes1' | lv_type_2_4= 'bytes2' | lv_type_2_5= 'bytes3' | lv_type_2_6= 'bytes4' | lv_type_2_7= 'bytes5' | lv_type_2_8= 'bytes6' | lv_type_2_9= 'bytes7' | lv_type_2_10= 'bytes8' | lv_type_2_11= 'bytes9' | lv_type_2_12= 'bytes10' | lv_type_2_13= 'bytes11' | lv_type_2_14= 'bytes12' | lv_type_2_15= 'bytes13' | lv_type_2_16= 'bytes14' | lv_type_2_17= 'bytes15' | lv_type_2_18= 'bytes16' | lv_type_2_19= 'bytes17' | lv_type_2_20= 'bytes18' | lv_type_2_21= 'bytes19' | lv_type_2_22= 'bytes20' | lv_type_2_23= 'bytes21' | lv_type_2_24= 'bytes22' | lv_type_2_25= 'bytes23' | lv_type_2_26= 'bytes24' | lv_type_2_27= 'bytes25' | lv_type_2_28= 'bytes26' | lv_type_2_29= 'bytes27' | lv_type_2_30= 'bytes28' | lv_type_2_31= 'bytes29' | lv_type_2_32= 'bytes30' | lv_type_2_33= 'bytes31' | lv_type_2_34= 'bytes32' ) )
                    // InternalOptGrammar.g:6737:5: (lv_type_2_1= 'byte' | lv_type_2_2= 'bytes' | lv_type_2_3= 'bytes1' | lv_type_2_4= 'bytes2' | lv_type_2_5= 'bytes3' | lv_type_2_6= 'bytes4' | lv_type_2_7= 'bytes5' | lv_type_2_8= 'bytes6' | lv_type_2_9= 'bytes7' | lv_type_2_10= 'bytes8' | lv_type_2_11= 'bytes9' | lv_type_2_12= 'bytes10' | lv_type_2_13= 'bytes11' | lv_type_2_14= 'bytes12' | lv_type_2_15= 'bytes13' | lv_type_2_16= 'bytes14' | lv_type_2_17= 'bytes15' | lv_type_2_18= 'bytes16' | lv_type_2_19= 'bytes17' | lv_type_2_20= 'bytes18' | lv_type_2_21= 'bytes19' | lv_type_2_22= 'bytes20' | lv_type_2_23= 'bytes21' | lv_type_2_24= 'bytes22' | lv_type_2_25= 'bytes23' | lv_type_2_26= 'bytes24' | lv_type_2_27= 'bytes25' | lv_type_2_28= 'bytes26' | lv_type_2_29= 'bytes27' | lv_type_2_30= 'bytes28' | lv_type_2_31= 'bytes29' | lv_type_2_32= 'bytes30' | lv_type_2_33= 'bytes31' | lv_type_2_34= 'bytes32' )
                    {
                    // InternalOptGrammar.g:6737:5: (lv_type_2_1= 'byte' | lv_type_2_2= 'bytes' | lv_type_2_3= 'bytes1' | lv_type_2_4= 'bytes2' | lv_type_2_5= 'bytes3' | lv_type_2_6= 'bytes4' | lv_type_2_7= 'bytes5' | lv_type_2_8= 'bytes6' | lv_type_2_9= 'bytes7' | lv_type_2_10= 'bytes8' | lv_type_2_11= 'bytes9' | lv_type_2_12= 'bytes10' | lv_type_2_13= 'bytes11' | lv_type_2_14= 'bytes12' | lv_type_2_15= 'bytes13' | lv_type_2_16= 'bytes14' | lv_type_2_17= 'bytes15' | lv_type_2_18= 'bytes16' | lv_type_2_19= 'bytes17' | lv_type_2_20= 'bytes18' | lv_type_2_21= 'bytes19' | lv_type_2_22= 'bytes20' | lv_type_2_23= 'bytes21' | lv_type_2_24= 'bytes22' | lv_type_2_25= 'bytes23' | lv_type_2_26= 'bytes24' | lv_type_2_27= 'bytes25' | lv_type_2_28= 'bytes26' | lv_type_2_29= 'bytes27' | lv_type_2_30= 'bytes28' | lv_type_2_31= 'bytes29' | lv_type_2_32= 'bytes30' | lv_type_2_33= 'bytes31' | lv_type_2_34= 'bytes32' )
                    int alt88=34;
                    switch ( input.LA(1) ) {
                    case 134:
                        {
                        alt88=1;
                        }
                        break;
                    case 135:
                        {
                        alt88=2;
                        }
                        break;
                    case 136:
                        {
                        alt88=3;
                        }
                        break;
                    case 137:
                        {
                        alt88=4;
                        }
                        break;
                    case 138:
                        {
                        alt88=5;
                        }
                        break;
                    case 139:
                        {
                        alt88=6;
                        }
                        break;
                    case 140:
                        {
                        alt88=7;
                        }
                        break;
                    case 141:
                        {
                        alt88=8;
                        }
                        break;
                    case 142:
                        {
                        alt88=9;
                        }
                        break;
                    case 143:
                        {
                        alt88=10;
                        }
                        break;
                    case 144:
                        {
                        alt88=11;
                        }
                        break;
                    case 145:
                        {
                        alt88=12;
                        }
                        break;
                    case 146:
                        {
                        alt88=13;
                        }
                        break;
                    case 147:
                        {
                        alt88=14;
                        }
                        break;
                    case 148:
                        {
                        alt88=15;
                        }
                        break;
                    case 149:
                        {
                        alt88=16;
                        }
                        break;
                    case 150:
                        {
                        alt88=17;
                        }
                        break;
                    case 151:
                        {
                        alt88=18;
                        }
                        break;
                    case 152:
                        {
                        alt88=19;
                        }
                        break;
                    case 153:
                        {
                        alt88=20;
                        }
                        break;
                    case 154:
                        {
                        alt88=21;
                        }
                        break;
                    case 155:
                        {
                        alt88=22;
                        }
                        break;
                    case 156:
                        {
                        alt88=23;
                        }
                        break;
                    case 157:
                        {
                        alt88=24;
                        }
                        break;
                    case 158:
                        {
                        alt88=25;
                        }
                        break;
                    case 159:
                        {
                        alt88=26;
                        }
                        break;
                    case 160:
                        {
                        alt88=27;
                        }
                        break;
                    case 161:
                        {
                        alt88=28;
                        }
                        break;
                    case 162:
                        {
                        alt88=29;
                        }
                        break;
                    case 163:
                        {
                        alt88=30;
                        }
                        break;
                    case 164:
                        {
                        alt88=31;
                        }
                        break;
                    case 165:
                        {
                        alt88=32;
                        }
                        break;
                    case 166:
                        {
                        alt88=33;
                        }
                        break;
                    case 167:
                        {
                        alt88=34;
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
                            // InternalOptGrammar.g:6738:6: lv_type_2_1= 'byte'
                            {
                            lv_type_2_1=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_1, grammarAccess.getElementaryTypeNameEnumAccess().getTypeByteKeyword_2_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalOptGrammar.g:6749:6: lv_type_2_2= 'bytes'
                            {
                            lv_type_2_2=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_2, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytesKeyword_2_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_2, null);
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalOptGrammar.g:6760:6: lv_type_2_3= 'bytes1'
                            {
                            lv_type_2_3=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_3, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes1Keyword_2_0_2());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_3, null);
                              					
                            }

                            }
                            break;
                        case 4 :
                            // InternalOptGrammar.g:6771:6: lv_type_2_4= 'bytes2'
                            {
                            lv_type_2_4=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_4, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes2Keyword_2_0_3());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_4, null);
                              					
                            }

                            }
                            break;
                        case 5 :
                            // InternalOptGrammar.g:6782:6: lv_type_2_5= 'bytes3'
                            {
                            lv_type_2_5=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_5, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes3Keyword_2_0_4());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_5, null);
                              					
                            }

                            }
                            break;
                        case 6 :
                            // InternalOptGrammar.g:6793:6: lv_type_2_6= 'bytes4'
                            {
                            lv_type_2_6=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_6, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes4Keyword_2_0_5());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_6, null);
                              					
                            }

                            }
                            break;
                        case 7 :
                            // InternalOptGrammar.g:6804:6: lv_type_2_7= 'bytes5'
                            {
                            lv_type_2_7=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_7, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes5Keyword_2_0_6());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_7, null);
                              					
                            }

                            }
                            break;
                        case 8 :
                            // InternalOptGrammar.g:6815:6: lv_type_2_8= 'bytes6'
                            {
                            lv_type_2_8=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_8, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes6Keyword_2_0_7());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_8, null);
                              					
                            }

                            }
                            break;
                        case 9 :
                            // InternalOptGrammar.g:6826:6: lv_type_2_9= 'bytes7'
                            {
                            lv_type_2_9=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_9, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes7Keyword_2_0_8());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_9, null);
                              					
                            }

                            }
                            break;
                        case 10 :
                            // InternalOptGrammar.g:6837:6: lv_type_2_10= 'bytes8'
                            {
                            lv_type_2_10=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_10, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes8Keyword_2_0_9());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_10, null);
                              					
                            }

                            }
                            break;
                        case 11 :
                            // InternalOptGrammar.g:6848:6: lv_type_2_11= 'bytes9'
                            {
                            lv_type_2_11=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_11, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes9Keyword_2_0_10());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_11, null);
                              					
                            }

                            }
                            break;
                        case 12 :
                            // InternalOptGrammar.g:6859:6: lv_type_2_12= 'bytes10'
                            {
                            lv_type_2_12=(Token)match(input,145,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_12, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes10Keyword_2_0_11());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_12, null);
                              					
                            }

                            }
                            break;
                        case 13 :
                            // InternalOptGrammar.g:6870:6: lv_type_2_13= 'bytes11'
                            {
                            lv_type_2_13=(Token)match(input,146,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_13, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes11Keyword_2_0_12());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_13, null);
                              					
                            }

                            }
                            break;
                        case 14 :
                            // InternalOptGrammar.g:6881:6: lv_type_2_14= 'bytes12'
                            {
                            lv_type_2_14=(Token)match(input,147,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_14, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes12Keyword_2_0_13());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_14, null);
                              					
                            }

                            }
                            break;
                        case 15 :
                            // InternalOptGrammar.g:6892:6: lv_type_2_15= 'bytes13'
                            {
                            lv_type_2_15=(Token)match(input,148,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_15, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes13Keyword_2_0_14());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_15, null);
                              					
                            }

                            }
                            break;
                        case 16 :
                            // InternalOptGrammar.g:6903:6: lv_type_2_16= 'bytes14'
                            {
                            lv_type_2_16=(Token)match(input,149,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_16, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes14Keyword_2_0_15());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_16, null);
                              					
                            }

                            }
                            break;
                        case 17 :
                            // InternalOptGrammar.g:6914:6: lv_type_2_17= 'bytes15'
                            {
                            lv_type_2_17=(Token)match(input,150,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_17, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes15Keyword_2_0_16());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_17, null);
                              					
                            }

                            }
                            break;
                        case 18 :
                            // InternalOptGrammar.g:6925:6: lv_type_2_18= 'bytes16'
                            {
                            lv_type_2_18=(Token)match(input,151,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_18, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes16Keyword_2_0_17());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_18, null);
                              					
                            }

                            }
                            break;
                        case 19 :
                            // InternalOptGrammar.g:6936:6: lv_type_2_19= 'bytes17'
                            {
                            lv_type_2_19=(Token)match(input,152,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_19, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes17Keyword_2_0_18());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_19, null);
                              					
                            }

                            }
                            break;
                        case 20 :
                            // InternalOptGrammar.g:6947:6: lv_type_2_20= 'bytes18'
                            {
                            lv_type_2_20=(Token)match(input,153,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_20, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes18Keyword_2_0_19());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_20, null);
                              					
                            }

                            }
                            break;
                        case 21 :
                            // InternalOptGrammar.g:6958:6: lv_type_2_21= 'bytes19'
                            {
                            lv_type_2_21=(Token)match(input,154,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_21, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes19Keyword_2_0_20());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_21, null);
                              					
                            }

                            }
                            break;
                        case 22 :
                            // InternalOptGrammar.g:6969:6: lv_type_2_22= 'bytes20'
                            {
                            lv_type_2_22=(Token)match(input,155,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_22, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes20Keyword_2_0_21());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_22, null);
                              					
                            }

                            }
                            break;
                        case 23 :
                            // InternalOptGrammar.g:6980:6: lv_type_2_23= 'bytes21'
                            {
                            lv_type_2_23=(Token)match(input,156,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_23, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes21Keyword_2_0_22());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_23, null);
                              					
                            }

                            }
                            break;
                        case 24 :
                            // InternalOptGrammar.g:6991:6: lv_type_2_24= 'bytes22'
                            {
                            lv_type_2_24=(Token)match(input,157,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_24, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes22Keyword_2_0_23());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_24, null);
                              					
                            }

                            }
                            break;
                        case 25 :
                            // InternalOptGrammar.g:7002:6: lv_type_2_25= 'bytes23'
                            {
                            lv_type_2_25=(Token)match(input,158,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_25, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes23Keyword_2_0_24());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_25, null);
                              					
                            }

                            }
                            break;
                        case 26 :
                            // InternalOptGrammar.g:7013:6: lv_type_2_26= 'bytes24'
                            {
                            lv_type_2_26=(Token)match(input,159,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_26, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes24Keyword_2_0_25());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_26, null);
                              					
                            }

                            }
                            break;
                        case 27 :
                            // InternalOptGrammar.g:7024:6: lv_type_2_27= 'bytes25'
                            {
                            lv_type_2_27=(Token)match(input,160,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_27, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes25Keyword_2_0_26());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_27, null);
                              					
                            }

                            }
                            break;
                        case 28 :
                            // InternalOptGrammar.g:7035:6: lv_type_2_28= 'bytes26'
                            {
                            lv_type_2_28=(Token)match(input,161,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_28, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes26Keyword_2_0_27());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_28, null);
                              					
                            }

                            }
                            break;
                        case 29 :
                            // InternalOptGrammar.g:7046:6: lv_type_2_29= 'bytes27'
                            {
                            lv_type_2_29=(Token)match(input,162,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_29, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes27Keyword_2_0_28());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_29, null);
                              					
                            }

                            }
                            break;
                        case 30 :
                            // InternalOptGrammar.g:7057:6: lv_type_2_30= 'bytes28'
                            {
                            lv_type_2_30=(Token)match(input,163,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_30, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes28Keyword_2_0_29());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_30, null);
                              					
                            }

                            }
                            break;
                        case 31 :
                            // InternalOptGrammar.g:7068:6: lv_type_2_31= 'bytes29'
                            {
                            lv_type_2_31=(Token)match(input,164,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_31, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes29Keyword_2_0_30());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_31, null);
                              					
                            }

                            }
                            break;
                        case 32 :
                            // InternalOptGrammar.g:7079:6: lv_type_2_32= 'bytes30'
                            {
                            lv_type_2_32=(Token)match(input,165,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_32, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes30Keyword_2_0_31());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_32, null);
                              					
                            }

                            }
                            break;
                        case 33 :
                            // InternalOptGrammar.g:7090:6: lv_type_2_33= 'bytes31'
                            {
                            lv_type_2_33=(Token)match(input,166,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_33, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes31Keyword_2_0_32());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_33, null);
                              					
                            }

                            }
                            break;
                        case 34 :
                            // InternalOptGrammar.g:7101:6: lv_type_2_34= 'bytes32'
                            {
                            lv_type_2_34=(Token)match(input,167,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_34, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes32Keyword_2_0_33());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_2_34, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7115:3: ( ( (lv_type_3_1= 'string' | lv_type_3_2= 'address' | lv_type_3_3= 'bool' | lv_type_3_4= 'real' | lv_type_3_5= 'ureal' ) ) )
                    {
                    // InternalOptGrammar.g:7115:3: ( ( (lv_type_3_1= 'string' | lv_type_3_2= 'address' | lv_type_3_3= 'bool' | lv_type_3_4= 'real' | lv_type_3_5= 'ureal' ) ) )
                    // InternalOptGrammar.g:7116:4: ( (lv_type_3_1= 'string' | lv_type_3_2= 'address' | lv_type_3_3= 'bool' | lv_type_3_4= 'real' | lv_type_3_5= 'ureal' ) )
                    {
                    // InternalOptGrammar.g:7116:4: ( (lv_type_3_1= 'string' | lv_type_3_2= 'address' | lv_type_3_3= 'bool' | lv_type_3_4= 'real' | lv_type_3_5= 'ureal' ) )
                    // InternalOptGrammar.g:7117:5: (lv_type_3_1= 'string' | lv_type_3_2= 'address' | lv_type_3_3= 'bool' | lv_type_3_4= 'real' | lv_type_3_5= 'ureal' )
                    {
                    // InternalOptGrammar.g:7117:5: (lv_type_3_1= 'string' | lv_type_3_2= 'address' | lv_type_3_3= 'bool' | lv_type_3_4= 'real' | lv_type_3_5= 'ureal' )
                    int alt89=5;
                    switch ( input.LA(1) ) {
                    case 168:
                        {
                        alt89=1;
                        }
                        break;
                    case 169:
                        {
                        alt89=2;
                        }
                        break;
                    case 170:
                        {
                        alt89=3;
                        }
                        break;
                    case 171:
                        {
                        alt89=4;
                        }
                        break;
                    case 172:
                        {
                        alt89=5;
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
                            // InternalOptGrammar.g:7118:6: lv_type_3_1= 'string'
                            {
                            lv_type_3_1=(Token)match(input,168,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_3_1, grammarAccess.getElementaryTypeNameEnumAccess().getTypeStringKeyword_3_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_3_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalOptGrammar.g:7129:6: lv_type_3_2= 'address'
                            {
                            lv_type_3_2=(Token)match(input,169,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_3_2, grammarAccess.getElementaryTypeNameEnumAccess().getTypeAddressKeyword_3_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_3_2, null);
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalOptGrammar.g:7140:6: lv_type_3_3= 'bool'
                            {
                            lv_type_3_3=(Token)match(input,170,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_3_3, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBoolKeyword_3_0_2());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_3_3, null);
                              					
                            }

                            }
                            break;
                        case 4 :
                            // InternalOptGrammar.g:7151:6: lv_type_3_4= 'real'
                            {
                            lv_type_3_4=(Token)match(input,171,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_3_4, grammarAccess.getElementaryTypeNameEnumAccess().getTypeRealKeyword_3_0_3());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_3_4, null);
                              					
                            }

                            }
                            break;
                        case 5 :
                            // InternalOptGrammar.g:7162:6: lv_type_3_5= 'ureal'
                            {
                            lv_type_3_5=(Token)match(input,172,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_3_5, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUrealKeyword_3_0_4());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_3_5, null);
                              					
                            }

                            }
                            break;

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
    // $ANTLR end "ruleElementaryTypeNameEnum"


    // $ANTLR start "entryRuleSpecialVariablesTypeEnum"
    // InternalOptGrammar.g:7179:1: entryRuleSpecialVariablesTypeEnum returns [EObject current=null] : iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF ;
    public final EObject entryRuleSpecialVariablesTypeEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariablesTypeEnum = null;


        try {
            // InternalOptGrammar.g:7179:65: (iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF )
            // InternalOptGrammar.g:7180:2: iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF
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
    // InternalOptGrammar.g:7186:1: ruleSpecialVariablesTypeEnum returns [EObject current=null] : ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) ) ;
    public final EObject ruleSpecialVariablesTypeEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7192:2: ( ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) ) )
            // InternalOptGrammar.g:7193:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) )
            {
            // InternalOptGrammar.g:7193:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) )
            // InternalOptGrammar.g:7194:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) )
            {
            // InternalOptGrammar.g:7194:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) )
            // InternalOptGrammar.g:7195:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX )
            {
            // InternalOptGrammar.g:7195:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX )
            int alt91=3;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
                {
                alt91=1;
                }
                break;
            case RULE_MSG:
                {
                alt91=2;
                }
                break;
            case RULE_TX:
                {
                alt91=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalOptGrammar.g:7196:5: lv_name_0_1= RULE_BLOCK
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
                      						"org.unicam.myGrammar.OptGrammar.BLOCK");
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7211:5: lv_name_0_2= RULE_MSG
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
                      						"org.unicam.myGrammar.OptGrammar.MSG");
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7226:5: lv_name_0_3= RULE_TX
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
                      						"org.unicam.myGrammar.OptGrammar.TX");
                      				
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


    // $ANTLR start "ruleLogicalOperationLiteral"
    // InternalOptGrammar.g:7246:1: ruleLogicalOperationLiteral returns [Enumerator current=null] : ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '<' ) ) ;
    public final Enumerator ruleLogicalOperationLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7252:2: ( ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '<' ) ) )
            // InternalOptGrammar.g:7253:2: ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '<' ) )
            {
            // InternalOptGrammar.g:7253:2: ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '<' ) )
            int alt92=8;
            switch ( input.LA(1) ) {
            case 173:
                {
                alt92=1;
                }
                break;
            case 174:
                {
                alt92=2;
                }
                break;
            case 175:
                {
                alt92=3;
                }
                break;
            case 176:
                {
                alt92=4;
                }
                break;
            case 177:
                {
                alt92=5;
                }
                break;
            case 178:
                {
                alt92=6;
                }
                break;
            case 179:
                {
                alt92=7;
                }
                break;
            case 180:
                {
                alt92=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalOptGrammar.g:7254:3: (enumLiteral_0= '!=' )
                    {
                    // InternalOptGrammar.g:7254:3: (enumLiteral_0= '!=' )
                    // InternalOptGrammar.g:7255:4: enumLiteral_0= '!='
                    {
                    enumLiteral_0=(Token)match(input,173,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getNOTEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperationLiteralAccess().getNOTEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7262:3: (enumLiteral_1= '==' )
                    {
                    // InternalOptGrammar.g:7262:3: (enumLiteral_1= '==' )
                    // InternalOptGrammar.g:7263:4: enumLiteral_1= '=='
                    {
                    enumLiteral_1=(Token)match(input,174,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLogicalOperationLiteralAccess().getEQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7270:3: (enumLiteral_2= '&&' )
                    {
                    // InternalOptGrammar.g:7270:3: (enumLiteral_2= '&&' )
                    // InternalOptGrammar.g:7271:4: enumLiteral_2= '&&'
                    {
                    enumLiteral_2=(Token)match(input,175,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getLogicalOperationLiteralAccess().getANDEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7278:3: (enumLiteral_3= '||' )
                    {
                    // InternalOptGrammar.g:7278:3: (enumLiteral_3= '||' )
                    // InternalOptGrammar.g:7279:4: enumLiteral_3= '||'
                    {
                    enumLiteral_3=(Token)match(input,176,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getLogicalOperationLiteralAccess().getOREnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalOptGrammar.g:7286:3: (enumLiteral_4= '>=' )
                    {
                    // InternalOptGrammar.g:7286:3: (enumLiteral_4= '>=' )
                    // InternalOptGrammar.g:7287:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,177,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getGTEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getLogicalOperationLiteralAccess().getGTEEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalOptGrammar.g:7294:3: (enumLiteral_5= '<=' )
                    {
                    // InternalOptGrammar.g:7294:3: (enumLiteral_5= '<=' )
                    // InternalOptGrammar.g:7295:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,178,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getLTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getLogicalOperationLiteralAccess().getLTEEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalOptGrammar.g:7302:3: (enumLiteral_6= '>' )
                    {
                    // InternalOptGrammar.g:7302:3: (enumLiteral_6= '>' )
                    // InternalOptGrammar.g:7303:4: enumLiteral_6= '>'
                    {
                    enumLiteral_6=(Token)match(input,179,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getGTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getLogicalOperationLiteralAccess().getGTEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalOptGrammar.g:7310:3: (enumLiteral_7= '<' )
                    {
                    // InternalOptGrammar.g:7310:3: (enumLiteral_7= '<' )
                    // InternalOptGrammar.g:7311:4: enumLiteral_7= '<'
                    {
                    enumLiteral_7=(Token)match(input,180,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getLTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getLogicalOperationLiteralAccess().getLTEnumLiteralDeclaration_7());
                      			
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
    // $ANTLR end "ruleLogicalOperationLiteral"


    // $ANTLR start "ruleLocationSpecifierEnum"
    // InternalOptGrammar.g:7321:1: ruleLocationSpecifierEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) ) ;
    public final Enumerator ruleLocationSpecifierEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7327:2: ( ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) ) )
            // InternalOptGrammar.g:7328:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) )
            {
            // InternalOptGrammar.g:7328:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 181:
                {
                alt93=1;
                }
                break;
            case 182:
                {
                alt93=2;
                }
                break;
            case 183:
                {
                alt93=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalOptGrammar.g:7329:3: (enumLiteral_0= 'memory' )
                    {
                    // InternalOptGrammar.g:7329:3: (enumLiteral_0= 'memory' )
                    // InternalOptGrammar.g:7330:4: enumLiteral_0= 'memory'
                    {
                    enumLiteral_0=(Token)match(input,181,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7337:3: (enumLiteral_1= 'storage' )
                    {
                    // InternalOptGrammar.g:7337:3: (enumLiteral_1= 'storage' )
                    // InternalOptGrammar.g:7338:4: enumLiteral_1= 'storage'
                    {
                    enumLiteral_1=(Token)match(input,182,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7345:3: (enumLiteral_2= 'calldata' )
                    {
                    // InternalOptGrammar.g:7345:3: (enumLiteral_2= 'calldata' )
                    // InternalOptGrammar.g:7346:4: enumLiteral_2= 'calldata'
                    {
                    enumLiteral_2=(Token)match(input,183,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7356:1: ruleVisibilityEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) ;
    public final Enumerator ruleVisibilityEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7362:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) )
            // InternalOptGrammar.g:7363:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            {
            // InternalOptGrammar.g:7363:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case 184:
                {
                alt94=1;
                }
                break;
            case 185:
                {
                alt94=2;
                }
                break;
            case 186:
                {
                alt94=3;
                }
                break;
            case 187:
                {
                alt94=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalOptGrammar.g:7364:3: (enumLiteral_0= 'public' )
                    {
                    // InternalOptGrammar.g:7364:3: (enumLiteral_0= 'public' )
                    // InternalOptGrammar.g:7365:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,184,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7372:3: (enumLiteral_1= 'internal' )
                    {
                    // InternalOptGrammar.g:7372:3: (enumLiteral_1= 'internal' )
                    // InternalOptGrammar.g:7373:4: enumLiteral_1= 'internal'
                    {
                    enumLiteral_1=(Token)match(input,185,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7380:3: (enumLiteral_2= 'private' )
                    {
                    // InternalOptGrammar.g:7380:3: (enumLiteral_2= 'private' )
                    // InternalOptGrammar.g:7381:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,186,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7388:3: (enumLiteral_3= 'external' )
                    {
                    // InternalOptGrammar.g:7388:3: (enumLiteral_3= 'external' )
                    // InternalOptGrammar.g:7389:4: enumLiteral_3= 'external'
                    {
                    enumLiteral_3=(Token)match(input,187,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleBooleanLiteralEnum"
    // InternalOptGrammar.g:7399:1: ruleBooleanLiteralEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteralEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7405:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalOptGrammar.g:7406:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalOptGrammar.g:7406:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==188) ) {
                alt95=1;
            }
            else if ( (LA95_0==189) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalOptGrammar.g:7407:3: (enumLiteral_0= 'true' )
                    {
                    // InternalOptGrammar.g:7407:3: (enumLiteral_0= 'true' )
                    // InternalOptGrammar.g:7408:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,188,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7415:3: (enumLiteral_1= 'false' )
                    {
                    // InternalOptGrammar.g:7415:3: (enumLiteral_1= 'false' )
                    // InternalOptGrammar.g:7416:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,189,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7426:1: ruleEtherSubDenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) ;
    public final Enumerator ruleEtherSubDenominationEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7432:2: ( ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) )
            // InternalOptGrammar.g:7433:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            {
            // InternalOptGrammar.g:7433:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 190:
                {
                alt96=1;
                }
                break;
            case 191:
                {
                alt96=2;
                }
                break;
            case 192:
                {
                alt96=3;
                }
                break;
            case 193:
                {
                alt96=4;
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
                    // InternalOptGrammar.g:7434:3: (enumLiteral_0= 'wei' )
                    {
                    // InternalOptGrammar.g:7434:3: (enumLiteral_0= 'wei' )
                    // InternalOptGrammar.g:7435:4: enumLiteral_0= 'wei'
                    {
                    enumLiteral_0=(Token)match(input,190,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getWEIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEtherSubDenominationEnumAccess().getWEIEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7442:3: (enumLiteral_1= 'szabo' )
                    {
                    // InternalOptGrammar.g:7442:3: (enumLiteral_1= 'szabo' )
                    // InternalOptGrammar.g:7443:4: enumLiteral_1= 'szabo'
                    {
                    enumLiteral_1=(Token)match(input,191,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getSZABOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEtherSubDenominationEnumAccess().getSZABOEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7450:3: (enumLiteral_2= 'finney' )
                    {
                    // InternalOptGrammar.g:7450:3: (enumLiteral_2= 'finney' )
                    // InternalOptGrammar.g:7451:4: enumLiteral_2= 'finney'
                    {
                    enumLiteral_2=(Token)match(input,192,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getFINNEYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEtherSubDenominationEnumAccess().getFINNEYEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7458:3: (enumLiteral_3= 'ether' )
                    {
                    // InternalOptGrammar.g:7458:3: (enumLiteral_3= 'ether' )
                    // InternalOptGrammar.g:7459:4: enumLiteral_3= 'ether'
                    {
                    enumLiteral_3=(Token)match(input,193,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7469:1: ruleTimeSubdenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) ;
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
            // InternalOptGrammar.g:7475:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) )
            // InternalOptGrammar.g:7476:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            {
            // InternalOptGrammar.g:7476:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            int alt97=6;
            switch ( input.LA(1) ) {
            case 194:
                {
                alt97=1;
                }
                break;
            case 195:
                {
                alt97=2;
                }
                break;
            case 196:
                {
                alt97=3;
                }
                break;
            case 197:
                {
                alt97=4;
                }
                break;
            case 198:
                {
                alt97=5;
                }
                break;
            case 199:
                {
                alt97=6;
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
                    // InternalOptGrammar.g:7477:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalOptGrammar.g:7477:3: (enumLiteral_0= 'seconds' )
                    // InternalOptGrammar.g:7478:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,194,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeSubdenominationEnumAccess().getSECONDSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7485:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalOptGrammar.g:7485:3: (enumLiteral_1= 'minutes' )
                    // InternalOptGrammar.g:7486:4: enumLiteral_1= 'minutes'
                    {
                    enumLiteral_1=(Token)match(input,195,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getMINUTESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeSubdenominationEnumAccess().getMINUTESEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7493:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalOptGrammar.g:7493:3: (enumLiteral_2= 'hours' )
                    // InternalOptGrammar.g:7494:4: enumLiteral_2= 'hours'
                    {
                    enumLiteral_2=(Token)match(input,196,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getHOURSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeSubdenominationEnumAccess().getHOURSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7501:3: (enumLiteral_3= 'days' )
                    {
                    // InternalOptGrammar.g:7501:3: (enumLiteral_3= 'days' )
                    // InternalOptGrammar.g:7502:4: enumLiteral_3= 'days'
                    {
                    enumLiteral_3=(Token)match(input,197,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getDAYSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTimeSubdenominationEnumAccess().getDAYSEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalOptGrammar.g:7509:3: (enumLiteral_4= 'weeks' )
                    {
                    // InternalOptGrammar.g:7509:3: (enumLiteral_4= 'weeks' )
                    // InternalOptGrammar.g:7510:4: enumLiteral_4= 'weeks'
                    {
                    enumLiteral_4=(Token)match(input,198,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getWEEKSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTimeSubdenominationEnumAccess().getWEEKSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalOptGrammar.g:7517:3: (enumLiteral_5= 'years' )
                    {
                    // InternalOptGrammar.g:7517:3: (enumLiteral_5= 'years' )
                    // InternalOptGrammar.g:7518:4: enumLiteral_5= 'years'
                    {
                    enumLiteral_5=(Token)match(input,199,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalOptGrammar
    public final void synpred1_InternalOptGrammar_fragment() throws RecognitionException {   
        // InternalOptGrammar.g:3820:5: ( 'else' )
        // InternalOptGrammar.g:3820:6: 'else'
        {
        match(input,46,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalOptGrammar

    // $ANTLR start synpred2_InternalOptGrammar
    public final void synpred2_InternalOptGrammar_fragment() throws RecognitionException {   
        // InternalOptGrammar.g:3962:4: ( ';' )
        // InternalOptGrammar.g:3962:5: ';'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalOptGrammar

    // Delegated rules

    public final boolean synpred1_InternalOptGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalOptGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalOptGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalOptGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\5\2\uffff\4\40\5\uffff";
    static final String dfa_3s = "\1\u00bb\2\uffff\4\41\5\uffff";
    static final String dfa_4s = "\1\uffff\1\7\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\21\uffff\1\1\1\uffff\2\2\5\uffff\1\7\1\10\2\uffff\1\11\3\uffff\1\11\1\uffff\1\12\1\13\31\uffff\150\11\13\uffff\1\3\1\4\1\5\1\6",
            "",
            "",
            "\1\7\1\10",
            "\1\7\1\10",
            "\1\7\1\10",
            "\1\7\1\10",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 562:3: ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000011210000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000011610000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000011010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000D1306800020L,0xFFFFFFFFFFFFFFE0L,0x0F001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000088220020L,0x0000000000000000L,0x0F00000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xFEC0000020000FD0L,0x0000000000000011L,0x3000000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xFEC0000000000FD0L,0x0000000000000011L,0x3000000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000011000800020L,0xFFFFFFFFFFFFFFE0L,0x00001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000880000020L,0x0000000000000000L,0x0FE0000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFFFFFFFE0L,0x00001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000011000000020L,0xFFFFFFFFFFFFFFE0L,0x00001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xFEC0008000000FD0L,0x0000000000000011L,0x3000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xFEC0000020400FD0L,0x0000000000000011L,0x3000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xFEC0000000400FD0L,0x0000000000000011L,0x3000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000890000020L,0x0000000000000000L,0x0FE0000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000024010000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000011020000020L,0xFFFFFFFFFFFFFFE0L,0x00001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000880000022L,0x0000000000000000L,0x0FE0000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000001000000020L,0xFFFFFFFFFFFFFFE0L,0x00001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xFEFFB11000200FD0L,0xFFFFFFFFFFFFFFF1L,0x30001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xFEFFB11000220FD0L,0xFFFFFFFFFFFFFFF1L,0x30001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xFEC0000000020FD0L,0x0000000000000011L,0x3000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xFEFFB11020200FD0L,0xFFFFFFFFFFFFFFF1L,0x30001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xFEFFB11000A00FD0L,0xFFFFFFFFFFFFFFF1L,0x30001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x001FE00000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xFE00000000000FD0L,0x0000000000000011L,0x3000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xFE40000000000FD0L,0x0000000000000011L,0x3000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00000000100001E0L,0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000040002L,0x000000000000000EL});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00000000100001C0L,0x0000000000000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000020000000000L});

}