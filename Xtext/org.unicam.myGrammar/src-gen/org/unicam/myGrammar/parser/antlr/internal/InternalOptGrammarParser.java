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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEX", "RULE_DECIMAL", "RULE_BLOCK", "RULE_MSG", "RULE_TX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'contract'", "'{'", "';'", "'}'", "'payable'", "'function'", "'returns'", "'('", "','", "')'", "':'", "'constant'", "'struct'", "'enum'", "'='", "'indexed'", "'mapping'", "'=>'", "'['", "']'", "'var'", "'.'", "'delete'", "'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'return'", "'throw'", "'_'", "'NOT'", "'TERNARY'", "'?'", "'gasleft'", "'blockhash'", "'addmod'", "'mulmod'", "'ecrecover'", "'keccak256'", "'sha256'", "'ripemd160'", "'+'", "'-'", "'/'", "'*'", "'now'", "'int'", "'int16'", "'int24'", "'int32'", "'int40'", "'int48'", "'int56'", "'int64'", "'int72'", "'int80'", "'int88'", "'int96'", "'int104'", "'int112'", "'int120'", "'int128'", "'int136'", "'int144'", "'int152'", "'int160'", "'int168'", "'int178'", "'int184'", "'int192'", "'int200'", "'int208'", "'int216'", "'int224'", "'int232'", "'int240'", "'int248'", "'int256'", "'uint'", "'uint8'", "'uint16'", "'uint24'", "'uint32'", "'uint40'", "'uint48'", "'uint56'", "'uint64'", "'uint72'", "'uint80'", "'uint88'", "'uint96'", "'uint104'", "'uint112'", "'uint120'", "'uint128'", "'uint136'", "'uint144'", "'uint152'", "'uint160'", "'uint168'", "'uint178'", "'uint184'", "'uint192'", "'uint200'", "'uint208'", "'uint216'", "'uint224'", "'uint232'", "'uint240'", "'uint248'", "'uint256'", "'byte'", "'bytes'", "'bytes1'", "'bytes2'", "'bytes3'", "'bytes4'", "'bytes5'", "'bytes6'", "'bytes7'", "'bytes8'", "'bytes9'", "'bytes10'", "'bytes11'", "'bytes12'", "'bytes13'", "'bytes14'", "'bytes15'", "'bytes16'", "'bytes17'", "'bytes18'", "'bytes19'", "'bytes20'", "'bytes21'", "'bytes22'", "'bytes23'", "'bytes24'", "'bytes25'", "'bytes26'", "'bytes27'", "'bytes28'", "'bytes29'", "'bytes30'", "'bytes31'", "'bytes32'", "'string'", "'address'", "'bool'", "'real'", "'ureal'", "'storage'", "'memory'", "'calldata'", "'public'", "'internal'", "'private'", "'external'", "'!='", "'=='", "'&&'", "'||'", "'>='", "'<='", "'>'", "'<'", "'true'", "'false'", "'wei'", "'szabo'", "'finney'", "'ether'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'years'"
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
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=6;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__194=194;
    public static final int RULE_WS=14;
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
        	return "Model";
       	}

       	@Override
       	protected OptGrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalOptGrammar.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOptGrammar.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalOptGrammar.g:66:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOptGrammar.g:72:1: ruleModel returns [EObject current=null] : ( (lv_operations_0_0= ruleContract ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:78:2: ( ( (lv_operations_0_0= ruleContract ) )* )
            // InternalOptGrammar.g:79:2: ( (lv_operations_0_0= ruleContract ) )*
            {
            // InternalOptGrammar.g:79:2: ( (lv_operations_0_0= ruleContract ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOptGrammar.g:80:3: (lv_operations_0_0= ruleContract )
            	    {
            	    // InternalOptGrammar.g:80:3: (lv_operations_0_0= ruleContract )
            	    // InternalOptGrammar.g:81:4: lv_operations_0_0= ruleContract
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getOperationsContractParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_operations_0_0=ruleContract();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"operations",
            	      					lv_operations_0_0,
            	      					"org.unicam.myGrammar.OptGrammar.Contract");
            	      				afterParserOrEnumRuleCall();
            	      			
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleContract"
    // InternalOptGrammar.g:101:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalOptGrammar.g:101:49: (iv_ruleContract= ruleContract EOF )
            // InternalOptGrammar.g:102:2: iv_ruleContract= ruleContract EOF
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
    // InternalOptGrammar.g:108:1: ruleContract returns [EObject current=null] : (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_blocks_3_0= ruleDeclaration ) ) otherlv_4= ';' ) | ( (lv_blocks_5_0= ruleFunctionDefinition ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_blocks_3_0 = null;

        EObject lv_blocks_5_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:114:2: ( (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_blocks_3_0= ruleDeclaration ) ) otherlv_4= ';' ) | ( (lv_blocks_5_0= ruleFunctionDefinition ) ) )* otherlv_6= '}' ) )
            // InternalOptGrammar.g:115:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_blocks_3_0= ruleDeclaration ) ) otherlv_4= ';' ) | ( (lv_blocks_5_0= ruleFunctionDefinition ) ) )* otherlv_6= '}' )
            {
            // InternalOptGrammar.g:115:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_blocks_3_0= ruleDeclaration ) ) otherlv_4= ';' ) | ( (lv_blocks_5_0= ruleFunctionDefinition ) ) )* otherlv_6= '}' )
            // InternalOptGrammar.g:116:3: otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_blocks_3_0= ruleDeclaration ) ) otherlv_4= ';' ) | ( (lv_blocks_5_0= ruleFunctionDefinition ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
              		
            }
            // InternalOptGrammar.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOptGrammar.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalOptGrammar.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalOptGrammar.g:142:3: ( ( ( (lv_blocks_3_0= ruleDeclaration ) ) otherlv_4= ';' ) | ( (lv_blocks_5_0= ruleFunctionDefinition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=28 && LA2_0<=29)||(LA2_0>=171 && LA2_0<=174)) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>=20 && LA2_0<=21)) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOptGrammar.g:143:4: ( ( (lv_blocks_3_0= ruleDeclaration ) ) otherlv_4= ';' )
            	    {
            	    // InternalOptGrammar.g:143:4: ( ( (lv_blocks_3_0= ruleDeclaration ) ) otherlv_4= ';' )
            	    // InternalOptGrammar.g:144:5: ( (lv_blocks_3_0= ruleDeclaration ) ) otherlv_4= ';'
            	    {
            	    // InternalOptGrammar.g:144:5: ( (lv_blocks_3_0= ruleDeclaration ) )
            	    // InternalOptGrammar.g:145:6: (lv_blocks_3_0= ruleDeclaration )
            	    {
            	    // InternalOptGrammar.g:145:6: (lv_blocks_3_0= ruleDeclaration )
            	    // InternalOptGrammar.g:146:7: lv_blocks_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getContractAccess().getBlocksDeclarationParserRuleCall_3_0_0_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_blocks_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getContractRule());
            	      							}
            	      							add(
            	      								current,
            	      								"blocks",
            	      								lv_blocks_3_0,
            	      								"org.unicam.myGrammar.OptGrammar.Declaration");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getContractAccess().getSemicolonKeyword_3_0_1());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptGrammar.g:169:4: ( (lv_blocks_5_0= ruleFunctionDefinition ) )
            	    {
            	    // InternalOptGrammar.g:169:4: ( (lv_blocks_5_0= ruleFunctionDefinition ) )
            	    // InternalOptGrammar.g:170:5: (lv_blocks_5_0= ruleFunctionDefinition )
            	    {
            	    // InternalOptGrammar.g:170:5: (lv_blocks_5_0= ruleFunctionDefinition )
            	    // InternalOptGrammar.g:171:6: lv_blocks_5_0= ruleFunctionDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContractAccess().getBlocksFunctionDefinitionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_blocks_5_0=ruleFunctionDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContractRule());
            	      						}
            	      						add(
            	      							current,
            	      							"blocks",
            	      							lv_blocks_5_0,
            	      							"org.unicam.myGrammar.OptGrammar.FunctionDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_4());
              		
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


    // $ANTLR start "entryRuleDeclaration"
    // InternalOptGrammar.g:197:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalOptGrammar.g:197:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalOptGrammar.g:198:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalOptGrammar.g:204:1: ruleDeclaration returns [EObject current=null] : (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_StructDefinition_1= ruleStructDefinition ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDeclaration_0 = null;

        EObject this_StructDefinition_1 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:210:2: ( (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_StructDefinition_1= ruleStructDefinition ) )
            // InternalOptGrammar.g:211:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_StructDefinition_1= ruleStructDefinition )
            {
            // InternalOptGrammar.g:211:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_StructDefinition_1= ruleStructDefinition )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 171:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==29) ) {
                    alt3=1;
                }
                else if ( (LA3_1==28) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 172:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==28) ) {
                    alt3=2;
                }
                else if ( (LA3_2==29) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 173:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==28) ) {
                    alt3=2;
                }
                else if ( (LA3_3==29) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 174:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==29) ) {
                    alt3=1;
                }
                else if ( (LA3_4==28) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOptGrammar.g:212:3: this_FunctionDeclaration_0= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getFunctionDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionDeclaration_0=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:221:3: this_StructDefinition_1= ruleStructDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getStructDefinitionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StructDefinition_1=ruleStructDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StructDefinition_1;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalOptGrammar.g:233:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // InternalOptGrammar.g:233:60: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalOptGrammar.g:234:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalOptGrammar.g:240:1: ruleFunctionDeclaration returns [EObject current=null] : this_EnumDefinition_0= ruleEnumDefinition ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:246:2: (this_EnumDefinition_0= ruleEnumDefinition )
            // InternalOptGrammar.g:247:2: this_EnumDefinition_0= ruleEnumDefinition
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getEnumDefinitionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_EnumDefinition_0=ruleEnumDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_EnumDefinition_0;
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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleFunctionDefinition"
    // InternalOptGrammar.g:258:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // InternalOptGrammar.g:258:59: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // InternalOptGrammar.g:259:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
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
    // InternalOptGrammar.g:265:1: ruleFunctionDefinition returns [EObject current=null] : ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) ) ;
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
            // InternalOptGrammar.g:271:2: ( ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) ) )
            // InternalOptGrammar.g:272:2: ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) )
            {
            // InternalOptGrammar.g:272:2: ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) )
            // InternalOptGrammar.g:273:3: ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' )
            {
            // InternalOptGrammar.g:273:3: ( (lv_payable_0_0= 'payable' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOptGrammar.g:274:4: (lv_payable_0_0= 'payable' )
                    {
                    // InternalOptGrammar.g:274:4: (lv_payable_0_0= 'payable' )
                    // InternalOptGrammar.g:275:5: lv_payable_0_0= 'payable'
                    {
                    lv_payable_0_0=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getFunctionKeyword_1());
              		
            }
            // InternalOptGrammar.g:291:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOptGrammar.g:292:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:292:4: (lv_name_2_0= RULE_ID )
            // InternalOptGrammar.g:293:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            // InternalOptGrammar.g:309:3: ( (lv_parameters_3_0= ruleParameterList ) )
            // InternalOptGrammar.g:310:4: (lv_parameters_3_0= ruleParameterList )
            {
            // InternalOptGrammar.g:310:4: (lv_parameters_3_0= ruleParameterList )
            // InternalOptGrammar.g:311:5: lv_parameters_3_0= ruleParameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersParameterListParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            // InternalOptGrammar.g:328:3: ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==27||(LA5_0>=171 && LA5_0<=174)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOptGrammar.g:329:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    {
            	    // InternalOptGrammar.g:329:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    // InternalOptGrammar.g:330:5: lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOptionalElementsFunctionDefinitionOptionalElementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
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
            	    break loop5;
                }
            } while (true);

            // InternalOptGrammar.g:347:3: (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOptGrammar.g:348:4: otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getReturnsKeyword_5_0());
                      			
                    }
                    // InternalOptGrammar.g:352:4: ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    // InternalOptGrammar.g:353:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    {
                    // InternalOptGrammar.g:353:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    // InternalOptGrammar.g:354:6: lv_returnParameters_6_0= ruleReturnsParameterList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnParametersReturnsParameterListParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
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

            // InternalOptGrammar.g:372:3: ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOptGrammar.g:373:4: ( (lv_block_7_0= ruleBody ) )
                    {
                    // InternalOptGrammar.g:373:4: ( (lv_block_7_0= ruleBody ) )
                    // InternalOptGrammar.g:374:5: (lv_block_7_0= ruleBody )
                    {
                    // InternalOptGrammar.g:374:5: (lv_block_7_0= ruleBody )
                    // InternalOptGrammar.g:375:6: lv_block_7_0= ruleBody
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
                    // InternalOptGrammar.g:393:4: otherlv_8= ';'
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


    // $ANTLR start "entryRuleFunctionCallListArguments"
    // InternalOptGrammar.g:402:1: entryRuleFunctionCallListArguments returns [EObject current=null] : iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF ;
    public final EObject entryRuleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallListArguments = null;


        try {
            // InternalOptGrammar.g:402:66: (iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF )
            // InternalOptGrammar.g:403:2: iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF
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
    // InternalOptGrammar.g:409:1: ruleFunctionCallListArguments returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:415:2: ( (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:416:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:416:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:417:3: otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallListArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:421:3: ()
            // InternalOptGrammar.g:422:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallListArgumentsAccess().getFunctionCallListArgumentsAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:428:3: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_TX)||(LA9_0>=48 && LA9_0<=49)||(LA9_0>=51 && LA9_0<=58)||LA9_0==63||(LA9_0>=183 && LA9_0<=184)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOptGrammar.g:429:4: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // InternalOptGrammar.g:429:4: ( (lv_arguments_2_0= ruleExpression ) )
                    // InternalOptGrammar.g:430:5: (lv_arguments_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:430:5: (lv_arguments_2_0= ruleExpression )
                    // InternalOptGrammar.g:431:6: lv_arguments_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallListArgumentsAccess().getArgumentsExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalOptGrammar.g:448:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==24) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalOptGrammar.g:449:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallListArgumentsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:453:5: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // InternalOptGrammar.g:454:6: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // InternalOptGrammar.g:454:6: (lv_arguments_4_0= ruleExpression )
                    	    // InternalOptGrammar.g:455:7: lv_arguments_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallListArgumentsAccess().getArgumentsExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:482:1: entryRuleFunctionCallArguments returns [EObject current=null] : iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF ;
    public final EObject entryRuleFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArguments = null;


        try {
            // InternalOptGrammar.g:482:62: (iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF )
            // InternalOptGrammar.g:483:2: iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF
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
    // InternalOptGrammar.g:489:1: ruleFunctionCallArguments returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) ;
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
            // InternalOptGrammar.g:495:2: ( ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) )
            // InternalOptGrammar.g:496:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            {
            // InternalOptGrammar.g:496:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=RULE_INT && LA12_1<=RULE_TX)||LA12_1==25||(LA12_1>=48 && LA12_1<=49)||(LA12_1>=51 && LA12_1<=58)||LA12_1==63||(LA12_1>=183 && LA12_1<=184)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==17) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalOptGrammar.g:497:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    {
                    // InternalOptGrammar.g:497:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    // InternalOptGrammar.g:498:4: otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunctionCallArgumentsAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgumentsAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalOptGrammar.g:506:4: ()
                    // InternalOptGrammar.g:507:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFunctionCallArgumentsAccess().getFunctionCallArgumentsAction_0_2(),
                      						current);
                      				
                    }

                    }

                    // InternalOptGrammar.g:513:4: ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalOptGrammar.g:514:5: ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            {
                            // InternalOptGrammar.g:514:5: ( (lv_args_3_0= ruleFunctionCallArg ) )
                            // InternalOptGrammar.g:515:6: (lv_args_3_0= ruleFunctionCallArg )
                            {
                            // InternalOptGrammar.g:515:6: (lv_args_3_0= ruleFunctionCallArg )
                            // InternalOptGrammar.g:516:7: lv_args_3_0= ruleFunctionCallArg
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFunctionCallArgumentsAccess().getArgsFunctionCallArgParserRuleCall_0_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_16);
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

                            // InternalOptGrammar.g:533:5: (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==24) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalOptGrammar.g:534:6: otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    {
                            	    otherlv_4=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallArgumentsAccess().getCommaKeyword_0_3_1_0());
                            	      					
                            	    }
                            	    // InternalOptGrammar.g:538:6: ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    // InternalOptGrammar.g:539:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    {
                            	    // InternalOptGrammar.g:539:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    // InternalOptGrammar.g:540:8: lv_args_5_0= ruleFunctionCallArg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getFunctionCallArgumentsAccess().getArgsFunctionCallArgParserRuleCall_0_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_16);
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
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFunctionCallArgumentsAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }
                    otherlv_7=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFunctionCallArgumentsAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:569:3: this_FunctionCallListArguments_8= ruleFunctionCallListArguments
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
    // InternalOptGrammar.g:581:1: entryRuleFunctionCallArg returns [EObject current=null] : iv_ruleFunctionCallArg= ruleFunctionCallArg EOF ;
    public final EObject entryRuleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArg = null;


        try {
            // InternalOptGrammar.g:581:56: (iv_ruleFunctionCallArg= ruleFunctionCallArg EOF )
            // InternalOptGrammar.g:582:2: iv_ruleFunctionCallArg= ruleFunctionCallArg EOF
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
    // InternalOptGrammar.g:588:1: ruleFunctionCallArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:594:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalOptGrammar.g:595:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalOptGrammar.g:595:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalOptGrammar.g:596:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalOptGrammar.g:596:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:597:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:597:4: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:598:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgAccess().getColonKeyword_1());
              		
            }
            // InternalOptGrammar.g:618:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalOptGrammar.g:619:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:619:4: (lv_expr_2_0= ruleExpression )
            // InternalOptGrammar.g:620:5: lv_expr_2_0= ruleExpression
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
    // InternalOptGrammar.g:641:1: entryRuleFunctionDefinitionOptionalElement returns [EObject current=null] : iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF ;
    public final EObject entryRuleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOptionalElement = null;


        try {
            // InternalOptGrammar.g:641:74: (iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF )
            // InternalOptGrammar.g:642:2: iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF
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
    // InternalOptGrammar.g:648:1: ruleFunctionDefinitionOptionalElement returns [EObject current=null] : (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) ;
    public final EObject ruleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_ModifierInvocation_1 = null;

        EObject this_VisibilitySpecifier_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:654:2: ( (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) )
            // InternalOptGrammar.g:655:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            {
            // InternalOptGrammar.g:655:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 171:
            case 172:
            case 173:
            case 174:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalOptGrammar.g:656:3: this_Const_0= ruleConst
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
                    // InternalOptGrammar.g:665:3: this_ModifierInvocation_1= ruleModifierInvocation
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
                    // InternalOptGrammar.g:674:3: this_VisibilitySpecifier_2= ruleVisibilitySpecifier
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
    // InternalOptGrammar.g:686:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalOptGrammar.g:686:46: (iv_ruleConst= ruleConst EOF )
            // InternalOptGrammar.g:687:2: iv_ruleConst= ruleConst EOF
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
    // InternalOptGrammar.g:693:1: ruleConst returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:699:2: ( (otherlv_0= 'constant' () ) )
            // InternalOptGrammar.g:700:2: (otherlv_0= 'constant' () )
            {
            // InternalOptGrammar.g:700:2: (otherlv_0= 'constant' () )
            // InternalOptGrammar.g:701:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstAccess().getConstantKeyword_0());
              		
            }
            // InternalOptGrammar.g:705:3: ()
            // InternalOptGrammar.g:706:4: 
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
    // InternalOptGrammar.g:716:1: entryRuleVisibilitySpecifier returns [EObject current=null] : iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF ;
    public final EObject entryRuleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilitySpecifier = null;


        try {
            // InternalOptGrammar.g:716:60: (iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF )
            // InternalOptGrammar.g:717:2: iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF
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
    // InternalOptGrammar.g:723:1: ruleVisibilitySpecifier returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ;
    public final EObject ruleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        EObject lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:729:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) )
            // InternalOptGrammar.g:730:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            {
            // InternalOptGrammar.g:730:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            // InternalOptGrammar.g:731:3: (lv_visibility_0_0= ruleVisibilityEnum )
            {
            // InternalOptGrammar.g:731:3: (lv_visibility_0_0= ruleVisibilityEnum )
            // InternalOptGrammar.g:732:4: lv_visibility_0_0= ruleVisibilityEnum
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getVisibilitySpecifierAccess().getVisibilityVisibilityEnumParserRuleCall_0());
              			
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
    // InternalOptGrammar.g:752:1: entryRuleStructDefinition returns [EObject current=null] : iv_ruleStructDefinition= ruleStructDefinition EOF ;
    public final EObject entryRuleStructDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDefinition = null;


        try {
            // InternalOptGrammar.g:752:57: (iv_ruleStructDefinition= ruleStructDefinition EOF )
            // InternalOptGrammar.g:753:2: iv_ruleStructDefinition= ruleStructDefinition EOF
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
    // InternalOptGrammar.g:759:1: ruleStructDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleStructDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_visibility_0_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:765:2: ( ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // InternalOptGrammar.g:766:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // InternalOptGrammar.g:766:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // InternalOptGrammar.g:767:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // InternalOptGrammar.g:767:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=171 && LA14_0<=174)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOptGrammar.g:768:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    {
                    // InternalOptGrammar.g:768:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    // InternalOptGrammar.g:769:5: lv_visibility_0_0= ruleVisibilityEnum
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStructDefinitionAccess().getVisibilityVisibilityEnumParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
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

            otherlv_1=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStructDefinitionAccess().getStructKeyword_1());
              		
            }
            // InternalOptGrammar.g:790:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOptGrammar.g:791:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:791:4: (lv_name_2_0= RULE_ID )
            // InternalOptGrammar.g:792:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,17,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStructDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalOptGrammar.g:812:3: ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==32||LA15_0==36||(LA15_0>=64 && LA15_0<=167)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOptGrammar.g:813:4: ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';'
            	    {
            	    // InternalOptGrammar.g:813:4: ( (lv_members_4_0= ruleVariableDeclaration ) )
            	    // InternalOptGrammar.g:814:5: (lv_members_4_0= ruleVariableDeclaration )
            	    {
            	    // InternalOptGrammar.g:814:5: (lv_members_4_0= ruleVariableDeclaration )
            	    // InternalOptGrammar.g:815:6: lv_members_4_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStructDefinitionAccess().getMembersVariableDeclarationParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
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

            	    otherlv_5=(Token)match(input,18,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getStructDefinitionAccess().getSemicolonKeyword_4_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:845:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // InternalOptGrammar.g:845:55: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // InternalOptGrammar.g:846:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
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
    // InternalOptGrammar.g:852:1: ruleEnumDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* otherlv_7= '}' ) ;
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
            // InternalOptGrammar.g:858:2: ( ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* otherlv_7= '}' ) )
            // InternalOptGrammar.g:859:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* otherlv_7= '}' )
            {
            // InternalOptGrammar.g:859:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* otherlv_7= '}' )
            // InternalOptGrammar.g:860:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* otherlv_7= '}'
            {
            // InternalOptGrammar.g:860:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=171 && LA16_0<=174)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOptGrammar.g:861:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    {
                    // InternalOptGrammar.g:861:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    // InternalOptGrammar.g:862:5: lv_visibility_0_0= ruleVisibilityEnum
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEnumDefinitionAccess().getVisibilityVisibilityEnumParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
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

            otherlv_1=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumDefinitionAccess().getEnumKeyword_1());
              		
            }
            // InternalOptGrammar.g:883:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOptGrammar.g:884:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:884:4: (lv_name_2_0= RULE_ID )
            // InternalOptGrammar.g:885:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalOptGrammar.g:905:3: ( (lv_members_4_0= ruleEnumValue ) )
            // InternalOptGrammar.g:906:4: (lv_members_4_0= ruleEnumValue )
            {
            // InternalOptGrammar.g:906:4: (lv_members_4_0= ruleEnumValue )
            // InternalOptGrammar.g:907:5: lv_members_4_0= ruleEnumValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            // InternalOptGrammar.g:924:3: (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOptGrammar.g:925:4: otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getEnumDefinitionAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalOptGrammar.g:929:4: ( (lv_members_6_0= ruleEnumValue ) )
            	    // InternalOptGrammar.g:930:5: (lv_members_6_0= ruleEnumValue )
            	    {
            	    // InternalOptGrammar.g:930:5: (lv_members_6_0= ruleEnumValue )
            	    // InternalOptGrammar.g:931:6: lv_members_6_0= ruleEnumValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
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
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:957:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalOptGrammar.g:957:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalOptGrammar.g:958:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalOptGrammar.g:964:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:970:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalOptGrammar.g:971:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalOptGrammar.g:971:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:972:3: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:972:3: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:973:4: lv_name_0_0= RULE_ID
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
    // InternalOptGrammar.g:992:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalOptGrammar.g:992:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalOptGrammar.g:993:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalOptGrammar.g:999:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1005:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalOptGrammar.g:1006:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalOptGrammar.g:1006:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:1007:3: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:1007:3: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:1008:4: lv_name_0_0= RULE_ID
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
    // InternalOptGrammar.g:1027:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1027:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalOptGrammar.g:1028:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalOptGrammar.g:1034:1: ruleVariableDeclaration returns [EObject current=null] : (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_StandardVariableDeclaration_0 = null;

        EObject this_VarVariableDeclaration_1 = null;

        EObject this_VarVariableTupleVariableDeclaration_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1040:2: ( (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) )
            // InternalOptGrammar.g:1041:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            {
            // InternalOptGrammar.g:1041:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==32||(LA18_0>=64 && LA18_0<=167)) ) {
                alt18=1;
            }
            else if ( (LA18_0==36) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==RULE_ID) ) {
                    alt18=2;
                }
                else if ( (LA18_2==23) ) {
                    alt18=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalOptGrammar.g:1042:3: this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration
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
                    // InternalOptGrammar.g:1051:3: this_VarVariableDeclaration_1= ruleVarVariableDeclaration
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
                    // InternalOptGrammar.g:1060:3: this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration
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
    // InternalOptGrammar.g:1072:1: entryRuleStandardVariableDeclaration returns [EObject current=null] : iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF ;
    public final EObject entryRuleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1072:68: (iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF )
            // InternalOptGrammar.g:1073:2: iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF
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
    // InternalOptGrammar.g:1079:1: ruleStandardVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_optionalElements_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1085:2: ( ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1086:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1086:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1087:3: ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1087:3: ( (lv_type_0_0= ruleStandardType ) )
            // InternalOptGrammar.g:1088:4: (lv_type_0_0= ruleStandardType )
            {
            // InternalOptGrammar.g:1088:4: (lv_type_0_0= ruleStandardType )
            // InternalOptGrammar.g:1089:5: lv_type_0_0= ruleStandardType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getTypeStandardTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalOptGrammar.g:1106:3: ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27||LA19_0==31||(LA19_0>=168 && LA19_0<=174)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOptGrammar.g:1107:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    {
            	    // InternalOptGrammar.g:1107:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    // InternalOptGrammar.g:1108:5: lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
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
            	    break loop19;
                }
            } while (true);

            // InternalOptGrammar.g:1125:3: ( (lv_variable_2_0= ruleVariable ) )
            // InternalOptGrammar.g:1126:4: (lv_variable_2_0= ruleVariable )
            {
            // InternalOptGrammar.g:1126:4: (lv_variable_2_0= ruleVariable )
            // InternalOptGrammar.g:1127:5: lv_variable_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getVariableVariableParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            // InternalOptGrammar.g:1144:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOptGrammar.g:1145:4: otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStandardVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalOptGrammar.g:1149:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalOptGrammar.g:1150:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1150:5: (lv_expression_4_0= ruleExpression )
                    // InternalOptGrammar.g:1151:6: lv_expression_4_0= ruleExpression
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
    // InternalOptGrammar.g:1173:1: entryRuleVarVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1173:63: (iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF )
            // InternalOptGrammar.g:1174:2: iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF
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
    // InternalOptGrammar.g:1180:1: ruleVarVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1186:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1187:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1187:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1188:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1188:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalOptGrammar.g:1189:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalOptGrammar.g:1189:4: (lv_varType_0_0= ruleVarType )
            // InternalOptGrammar.g:1190:5: lv_varType_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getVarTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalOptGrammar.g:1207:3: ( (lv_variable_1_0= ruleVariable ) )
            // InternalOptGrammar.g:1208:4: (lv_variable_1_0= ruleVariable )
            {
            // InternalOptGrammar.g:1208:4: (lv_variable_1_0= ruleVariable )
            // InternalOptGrammar.g:1209:5: lv_variable_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getVariableVariableParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            // InternalOptGrammar.g:1226:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOptGrammar.g:1227:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalOptGrammar.g:1231:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalOptGrammar.g:1232:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1232:5: (lv_expression_3_0= ruleExpression )
                    // InternalOptGrammar.g:1233:6: lv_expression_3_0= ruleExpression
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
    // InternalOptGrammar.g:1255:1: entryRuleVarVariableTupleVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableTupleVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1255:76: (iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF )
            // InternalOptGrammar.g:1256:2: iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF
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
    // InternalOptGrammar.g:1262:1: ruleVarVariableTupleVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_tuple_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1268:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1269:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1269:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1270:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1270:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalOptGrammar.g:1271:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalOptGrammar.g:1271:4: (lv_varType_0_0= ruleVarType )
            // InternalOptGrammar.g:1272:5: lv_varType_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getVarTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            // InternalOptGrammar.g:1289:3: ( (lv_tuple_1_0= ruleTuple ) )
            // InternalOptGrammar.g:1290:4: (lv_tuple_1_0= ruleTuple )
            {
            // InternalOptGrammar.g:1290:4: (lv_tuple_1_0= ruleTuple )
            // InternalOptGrammar.g:1291:5: lv_tuple_1_0= ruleTuple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getTupleTupleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            // InternalOptGrammar.g:1308:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOptGrammar.g:1309:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableTupleVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalOptGrammar.g:1313:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalOptGrammar.g:1314:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1314:5: (lv_expression_3_0= ruleExpression )
                    // InternalOptGrammar.g:1315:6: lv_expression_3_0= ruleExpression
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
    // InternalOptGrammar.g:1337:1: entryRuleVariableDeclarationOptionalElement returns [EObject current=null] : iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF ;
    public final EObject entryRuleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationOptionalElement = null;


        try {
            // InternalOptGrammar.g:1337:75: (iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF )
            // InternalOptGrammar.g:1338:2: iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF
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
    // InternalOptGrammar.g:1344:1: ruleVariableDeclarationOptionalElement returns [EObject current=null] : (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) ;
    public final EObject ruleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_VisibilitySpecifier_0 = null;

        EObject this_IndexedSpecifer_1 = null;

        EObject this_ConstantSpecifier_2 = null;

        EObject this_LocationSpecifier_3 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1350:2: ( (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) )
            // InternalOptGrammar.g:1351:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            {
            // InternalOptGrammar.g:1351:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 171:
            case 172:
            case 173:
            case 174:
                {
                alt23=1;
                }
                break;
            case 31:
                {
                alt23=2;
                }
                break;
            case 27:
                {
                alt23=3;
                }
                break;
            case 168:
            case 169:
            case 170:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalOptGrammar.g:1352:3: this_VisibilitySpecifier_0= ruleVisibilitySpecifier
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
                    // InternalOptGrammar.g:1361:3: this_IndexedSpecifer_1= ruleIndexedSpecifer
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
                    // InternalOptGrammar.g:1370:3: this_ConstantSpecifier_2= ruleConstantSpecifier
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
                    // InternalOptGrammar.g:1379:3: this_LocationSpecifier_3= ruleLocationSpecifier
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
    // InternalOptGrammar.g:1391:1: entryRuleIndexedSpecifer returns [EObject current=null] : iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF ;
    public final EObject entryRuleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedSpecifer = null;


        try {
            // InternalOptGrammar.g:1391:56: (iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF )
            // InternalOptGrammar.g:1392:2: iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF
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
    // InternalOptGrammar.g:1398:1: ruleIndexedSpecifer returns [EObject current=null] : (otherlv_0= 'indexed' () ) ;
    public final EObject ruleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1404:2: ( (otherlv_0= 'indexed' () ) )
            // InternalOptGrammar.g:1405:2: (otherlv_0= 'indexed' () )
            {
            // InternalOptGrammar.g:1405:2: (otherlv_0= 'indexed' () )
            // InternalOptGrammar.g:1406:3: otherlv_0= 'indexed' ()
            {
            otherlv_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexedSpeciferAccess().getIndexedKeyword_0());
              		
            }
            // InternalOptGrammar.g:1410:3: ()
            // InternalOptGrammar.g:1411:4: 
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
    // InternalOptGrammar.g:1421:1: entryRuleConstantSpecifier returns [EObject current=null] : iv_ruleConstantSpecifier= ruleConstantSpecifier EOF ;
    public final EObject entryRuleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSpecifier = null;


        try {
            // InternalOptGrammar.g:1421:58: (iv_ruleConstantSpecifier= ruleConstantSpecifier EOF )
            // InternalOptGrammar.g:1422:2: iv_ruleConstantSpecifier= ruleConstantSpecifier EOF
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
    // InternalOptGrammar.g:1428:1: ruleConstantSpecifier returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1434:2: ( (otherlv_0= 'constant' () ) )
            // InternalOptGrammar.g:1435:2: (otherlv_0= 'constant' () )
            {
            // InternalOptGrammar.g:1435:2: (otherlv_0= 'constant' () )
            // InternalOptGrammar.g:1436:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantSpecifierAccess().getConstantKeyword_0());
              		
            }
            // InternalOptGrammar.g:1440:3: ()
            // InternalOptGrammar.g:1441:4: 
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
    // InternalOptGrammar.g:1451:1: entryRuleLocationSpecifier returns [EObject current=null] : iv_ruleLocationSpecifier= ruleLocationSpecifier EOF ;
    public final EObject entryRuleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifier = null;


        try {
            // InternalOptGrammar.g:1451:58: (iv_ruleLocationSpecifier= ruleLocationSpecifier EOF )
            // InternalOptGrammar.g:1452:2: iv_ruleLocationSpecifier= ruleLocationSpecifier EOF
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
    // InternalOptGrammar.g:1458:1: ruleLocationSpecifier returns [EObject current=null] : ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) ;
    public final EObject ruleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject lv_location_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1464:2: ( ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) )
            // InternalOptGrammar.g:1465:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            {
            // InternalOptGrammar.g:1465:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            // InternalOptGrammar.g:1466:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            {
            // InternalOptGrammar.g:1466:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            // InternalOptGrammar.g:1467:4: lv_location_0_0= ruleLocationSpecifierEnum
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLocationSpecifierAccess().getLocationLocationSpecifierEnumParserRuleCall_0());
              			
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
    // InternalOptGrammar.g:1487:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalOptGrammar.g:1487:45: (iv_ruleType= ruleType EOF )
            // InternalOptGrammar.g:1488:2: iv_ruleType= ruleType EOF
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
    // InternalOptGrammar.g:1494:1: ruleType returns [EObject current=null] : (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_StandardType_0 = null;

        AntlrDatatypeRuleToken lv_isVarType_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1500:2: ( (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) )
            // InternalOptGrammar.g:1501:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            {
            // InternalOptGrammar.g:1501:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==32||(LA24_0>=64 && LA24_0<=167)) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalOptGrammar.g:1502:3: this_StandardType_0= ruleStandardType
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
                    // InternalOptGrammar.g:1511:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    {
                    // InternalOptGrammar.g:1511:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    // InternalOptGrammar.g:1512:4: (lv_isVarType_1_0= ruleVarType )
                    {
                    // InternalOptGrammar.g:1512:4: (lv_isVarType_1_0= ruleVarType )
                    // InternalOptGrammar.g:1513:5: lv_isVarType_1_0= ruleVarType
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
    // InternalOptGrammar.g:1534:1: entryRuleStandardType returns [EObject current=null] : iv_ruleStandardType= ruleStandardType EOF ;
    public final EObject entryRuleStandardType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardType = null;


        try {
            // InternalOptGrammar.g:1534:53: (iv_ruleStandardType= ruleStandardType EOF )
            // InternalOptGrammar.g:1535:2: iv_ruleStandardType= ruleStandardType EOF
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
    // InternalOptGrammar.g:1541:1: ruleStandardType returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) ;
    public final EObject ruleStandardType() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;

        EObject this_QualifiedIdentifier_3 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1547:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) )
            // InternalOptGrammar.g:1548:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            {
            // InternalOptGrammar.g:1548:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            int alt26=3;
            switch ( input.LA(1) ) {
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
                {
                alt26=1;
                }
                break;
            case 32:
                {
                alt26=2;
                }
                break;
            case RULE_ID:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalOptGrammar.g:1549:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalOptGrammar.g:1549:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalOptGrammar.g:1550:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStandardTypeAccess().getElementaryTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_24);
                    this_ElementaryType_0=ruleElementaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementaryType_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalOptGrammar.g:1558:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==34) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalOptGrammar.g:1559:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalOptGrammar.g:1559:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalOptGrammar.g:1560:6: lv_dimension_1_0= ruleArrayDimensions
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
                    // InternalOptGrammar.g:1579:3: this_Mapping_2= ruleMapping
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
                    // InternalOptGrammar.g:1588:3: this_QualifiedIdentifier_3= ruleQualifiedIdentifier
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
    // InternalOptGrammar.g:1600:1: entryRuleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF ;
    public final EObject entryRuleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardTypeWithoutQualifiedIdentifier = null;


        try {
            // InternalOptGrammar.g:1600:79: (iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF )
            // InternalOptGrammar.g:1601:2: iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF
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
    // InternalOptGrammar.g:1607:1: ruleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) ;
    public final EObject ruleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1613:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) )
            // InternalOptGrammar.g:1614:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            {
            // InternalOptGrammar.g:1614:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=64 && LA28_0<=167)) ) {
                alt28=1;
            }
            else if ( (LA28_0==32) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalOptGrammar.g:1615:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalOptGrammar.g:1615:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalOptGrammar.g:1616:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStandardTypeWithoutQualifiedIdentifierAccess().getElementaryTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_24);
                    this_ElementaryType_0=ruleElementaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementaryType_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalOptGrammar.g:1624:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==34) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalOptGrammar.g:1625:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalOptGrammar.g:1625:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalOptGrammar.g:1626:6: lv_dimension_1_0= ruleArrayDimensions
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
                    // InternalOptGrammar.g:1645:3: this_Mapping_2= ruleMapping
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
    // InternalOptGrammar.g:1657:1: entryRuleElementaryType returns [EObject current=null] : iv_ruleElementaryType= ruleElementaryType EOF ;
    public final EObject entryRuleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryType = null;


        try {
            // InternalOptGrammar.g:1657:55: (iv_ruleElementaryType= ruleElementaryType EOF )
            // InternalOptGrammar.g:1658:2: iv_ruleElementaryType= ruleElementaryType EOF
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
    // InternalOptGrammar.g:1664:1: ruleElementaryType returns [EObject current=null] : ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) ;
    public final EObject ruleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1670:2: ( ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) )
            // InternalOptGrammar.g:1671:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            {
            // InternalOptGrammar.g:1671:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            // InternalOptGrammar.g:1672:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalOptGrammar.g:1672:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            // InternalOptGrammar.g:1673:4: lv_name_0_0= ruleElementaryTypeNameEnum
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
    // InternalOptGrammar.g:1693:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalOptGrammar.g:1693:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalOptGrammar.g:1694:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalOptGrammar.g:1700:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) ;
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
            // InternalOptGrammar.g:1706:2: ( (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) )
            // InternalOptGrammar.g:1707:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            {
            // InternalOptGrammar.g:1707:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            // InternalOptGrammar.g:1708:3: otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:1716:3: ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) )
            // InternalOptGrammar.g:1717:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            {
            // InternalOptGrammar.g:1717:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            // InternalOptGrammar.g:1718:5: lv_keyType_2_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getKeyTypeElementaryTypeNameEnumParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
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

            otherlv_3=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalOptGrammar.g:1739:3: ( (lv_valueType_4_0= ruleType ) )
            // InternalOptGrammar.g:1740:4: (lv_valueType_4_0= ruleType )
            {
            // InternalOptGrammar.g:1740:4: (lv_valueType_4_0= ruleType )
            // InternalOptGrammar.g:1741:5: lv_valueType_4_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getValueTypeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:1766:1: entryRuleArrayDimensions returns [EObject current=null] : iv_ruleArrayDimensions= ruleArrayDimensions EOF ;
    public final EObject entryRuleArrayDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimensions = null;


        try {
            // InternalOptGrammar.g:1766:56: (iv_ruleArrayDimensions= ruleArrayDimensions EOF )
            // InternalOptGrammar.g:1767:2: iv_ruleArrayDimensions= ruleArrayDimensions EOF
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
    // InternalOptGrammar.g:1773:1: ruleArrayDimensions returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) ;
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
            // InternalOptGrammar.g:1779:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) )
            // InternalOptGrammar.g:1780:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            {
            // InternalOptGrammar.g:1780:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            // InternalOptGrammar.g:1781:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:1785:3: ()
            // InternalOptGrammar.g:1786:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayDimensionsAccess().getArrayDimensionsAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:1792:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_TX)||(LA29_0>=48 && LA29_0<=49)||(LA29_0>=51 && LA29_0<=58)||LA29_0==63||(LA29_0>=183 && LA29_0<=184)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOptGrammar.g:1793:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1793:4: (lv_value_2_0= ruleExpression )
                    // InternalOptGrammar.g:1794:5: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArrayDimensionsAccess().getValueExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
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

            otherlv_3=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalOptGrammar.g:1815:3: (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOptGrammar.g:1816:4: otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']'
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_4_0());
            	      			
            	    }
            	    // InternalOptGrammar.g:1820:4: ( (lv_value_5_0= ruleExpression ) )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( ((LA30_0>=RULE_INT && LA30_0<=RULE_TX)||(LA30_0>=48 && LA30_0<=49)||(LA30_0>=51 && LA30_0<=58)||LA30_0==63||(LA30_0>=183 && LA30_0<=184)) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalOptGrammar.g:1821:5: (lv_value_5_0= ruleExpression )
            	            {
            	            // InternalOptGrammar.g:1821:5: (lv_value_5_0= ruleExpression )
            	            // InternalOptGrammar.g:1822:6: lv_value_5_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getArrayDimensionsAccess().getValueExpressionParserRuleCall_4_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_29);
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

            	    otherlv_6=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_4_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalOptGrammar.g:1848:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalOptGrammar.g:1848:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalOptGrammar.g:1849:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalOptGrammar.g:1855:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1861:2: (kw= 'var' )
            // InternalOptGrammar.g:1862:2: kw= 'var'
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
    // InternalOptGrammar.g:1870:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalOptGrammar.g:1870:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalOptGrammar.g:1871:2: iv_ruleTuple= ruleTuple EOF
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
    // InternalOptGrammar.g:1877:1: ruleTuple returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_3_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1883:2: ( (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:1884:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:1884:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            // InternalOptGrammar.g:1885:3: otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:1889:3: ()
            // InternalOptGrammar.g:1890:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleAccess().getTupleAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:1896:3: ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_TX)||LA35_0==24||(LA35_0>=48 && LA35_0<=49)||(LA35_0>=51 && LA35_0<=58)||LA35_0==63||(LA35_0>=183 && LA35_0<=184)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOptGrammar.g:1897:4: ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    {
                    // InternalOptGrammar.g:1897:4: ( (lv_members_2_0= ruleExpression ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=RULE_INT && LA32_0<=RULE_TX)||(LA32_0>=48 && LA32_0<=49)||(LA32_0>=51 && LA32_0<=58)||LA32_0==63||(LA32_0>=183 && LA32_0<=184)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalOptGrammar.g:1898:5: (lv_members_2_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:1898:5: (lv_members_2_0= ruleExpression )
                            // InternalOptGrammar.g:1899:6: lv_members_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getTupleAccess().getMembersExpressionParserRuleCall_2_0_0());
                              					
                            }
                            pushFollow(FOLLOW_31);
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

                    // InternalOptGrammar.g:1916:4: ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==24) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalOptGrammar.g:1917:5: ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )?
                    	    {
                    	    // InternalOptGrammar.g:1917:5: ( (lv_members_3_0= ruleTupleSeparator ) )
                    	    // InternalOptGrammar.g:1918:6: (lv_members_3_0= ruleTupleSeparator )
                    	    {
                    	    // InternalOptGrammar.g:1918:6: (lv_members_3_0= ruleTupleSeparator )
                    	    // InternalOptGrammar.g:1919:7: lv_members_3_0= ruleTupleSeparator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTupleAccess().getMembersTupleSeparatorParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
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

                    	    // InternalOptGrammar.g:1936:5: ( (lv_members_4_0= ruleExpression ) )?
                    	    int alt33=2;
                    	    int LA33_0 = input.LA(1);

                    	    if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_TX)||(LA33_0>=48 && LA33_0<=49)||(LA33_0>=51 && LA33_0<=58)||LA33_0==63||(LA33_0>=183 && LA33_0<=184)) ) {
                    	        alt33=1;
                    	    }
                    	    switch (alt33) {
                    	        case 1 :
                    	            // InternalOptGrammar.g:1937:6: (lv_members_4_0= ruleExpression )
                    	            {
                    	            // InternalOptGrammar.g:1937:6: (lv_members_4_0= ruleExpression )
                    	            // InternalOptGrammar.g:1938:7: lv_members_4_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getTupleAccess().getMembersExpressionParserRuleCall_2_1_1_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_30);
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
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:1965:1: entryRuleTupleSeparator returns [EObject current=null] : iv_ruleTupleSeparator= ruleTupleSeparator EOF ;
    public final EObject entryRuleTupleSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleSeparator = null;


        try {
            // InternalOptGrammar.g:1965:55: (iv_ruleTupleSeparator= ruleTupleSeparator EOF )
            // InternalOptGrammar.g:1966:2: iv_ruleTupleSeparator= ruleTupleSeparator EOF
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
    // InternalOptGrammar.g:1972:1: ruleTupleSeparator returns [EObject current=null] : (otherlv_0= ',' () ) ;
    public final EObject ruleTupleSeparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1978:2: ( (otherlv_0= ',' () ) )
            // InternalOptGrammar.g:1979:2: (otherlv_0= ',' () )
            {
            // InternalOptGrammar.g:1979:2: (otherlv_0= ',' () )
            // InternalOptGrammar.g:1980:3: otherlv_0= ',' ()
            {
            otherlv_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleSeparatorAccess().getCommaKeyword_0());
              		
            }
            // InternalOptGrammar.g:1984:3: ()
            // InternalOptGrammar.g:1985:4: 
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
    // InternalOptGrammar.g:1995:1: entryRuleSimpleStatement returns [EObject current=null] : iv_ruleSimpleStatement= ruleSimpleStatement EOF ;
    public final EObject entryRuleSimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement = null;


        try {
            // InternalOptGrammar.g:1995:56: (iv_ruleSimpleStatement= ruleSimpleStatement EOF )
            // InternalOptGrammar.g:1996:2: iv_ruleSimpleStatement= ruleSimpleStatement EOF
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
    // InternalOptGrammar.g:2002:1: ruleSimpleStatement returns [EObject current=null] : ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) ;
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
            // InternalOptGrammar.g:2008:2: ( ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) )
            // InternalOptGrammar.g:2009:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            {
            // InternalOptGrammar.g:2009:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            // InternalOptGrammar.g:2010:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) )
            {
            // InternalOptGrammar.g:2010:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 32:
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
                {
                alt39=1;
                }
                break;
            case 36:
                {
                alt39=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 48:
            case 49:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 63:
            case 183:
            case 184:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalOptGrammar.g:2011:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalOptGrammar.g:2011:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalOptGrammar.g:2012:5: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStatementAccess().getStandardTypeWithoutQualifiedIdentifierParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
                    this_StandardTypeWithoutQualifiedIdentifier_0=ruleStandardTypeWithoutQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_StandardTypeWithoutQualifiedIdentifier_0;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalOptGrammar.g:2020:5: ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalOptGrammar.g:2021:6: () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalOptGrammar.g:2021:6: ()
                    // InternalOptGrammar.g:2022:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getSimpleStatementAccess().getStandardVariableDeclarationTypeAction_0_0_1_0(),
                      								current);
                      						
                    }

                    }

                    // InternalOptGrammar.g:2028:6: ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==27||LA36_0==31||(LA36_0>=168 && LA36_0<=174)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2029:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalOptGrammar.g:2029:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalOptGrammar.g:2030:8: lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getPtionalElementsVariableDeclarationOptionalElementParserRuleCall_0_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop36;
                        }
                    } while (true);

                    // InternalOptGrammar.g:2047:6: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalOptGrammar.g:2048:7: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:2048:7: (lv_variable_3_0= ruleVariable )
                    // InternalOptGrammar.g:2049:8: lv_variable_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getVariableVariableParserRuleCall_0_0_1_2_0());
                      							
                    }
                    pushFollow(FOLLOW_32);
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

                    // InternalOptGrammar.g:2066:6: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==30) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalOptGrammar.g:2067:7: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_0_1_3_0());
                              						
                            }
                            // InternalOptGrammar.g:2071:7: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalOptGrammar.g:2072:8: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2072:8: (lv_expression_5_0= ruleExpression )
                            // InternalOptGrammar.g:2073:9: lv_expression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionExpressionParserRuleCall_0_0_1_3_1_0());
                              								
                            }
                            pushFollow(FOLLOW_7);
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
                    // InternalOptGrammar.g:2094:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalOptGrammar.g:2094:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalOptGrammar.g:2095:5: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStatementAccess().getVarTypeParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalOptGrammar.g:2102:5: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==23) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalOptGrammar.g:2103:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2103:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2104:7: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2104:7: ()
                            // InternalOptGrammar.g:2105:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTypeDeclarationAction_0_1_1_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalOptGrammar.g:2111:7: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalOptGrammar.g:2112:8: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalOptGrammar.g:2112:8: (lv_variable_8_0= ruleVariable )
                            // InternalOptGrammar.g:2113:9: lv_variable_8_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getVariableVariableParserRuleCall_0_1_1_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_34);
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

                            // InternalOptGrammar.g:2130:7: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2131:8: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_9, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_0_2_0());
                              							
                            }
                            // InternalOptGrammar.g:2135:8: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalOptGrammar.g:2136:9: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2136:9: (lv_expression_10_0= ruleExpression )
                            // InternalOptGrammar.g:2137:10: lv_expression_10_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              										newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionExpressionParserRuleCall_0_1_1_0_2_1_0());
                              									
                            }
                            pushFollow(FOLLOW_7);
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
                            // InternalOptGrammar.g:2157:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2157:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2158:7: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2158:7: ()
                            // InternalOptGrammar.g:2159:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTupleVariableDeclarationAction_0_1_1_1_0(),
                              									current);
                              							
                            }

                            }

                            // InternalOptGrammar.g:2165:7: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalOptGrammar.g:2166:8: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalOptGrammar.g:2166:8: (lv_tuple_12_0= ruleTuple )
                            // InternalOptGrammar.g:2167:9: lv_tuple_12_0= ruleTuple
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getTupleTupleParserRuleCall_0_1_1_1_1_0());
                              								
                            }
                            pushFollow(FOLLOW_34);
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

                            // InternalOptGrammar.g:2184:7: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2185:8: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_13, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_1_2_0());
                              							
                            }
                            // InternalOptGrammar.g:2189:8: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalOptGrammar.g:2190:9: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2190:9: (lv_expression_14_0= ruleExpression )
                            // InternalOptGrammar.g:2191:10: lv_expression_14_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              										newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionExpressionParserRuleCall_0_1_1_1_2_1_0());
                              									
                            }
                            pushFollow(FOLLOW_7);
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
                    // InternalOptGrammar.g:2213:4: this_ExpressionStatement_15= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionStatementParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_7);
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

            // InternalOptGrammar.g:2222:3: ( (lv_semicolon_16_0= ';' ) )
            // InternalOptGrammar.g:2223:4: (lv_semicolon_16_0= ';' )
            {
            // InternalOptGrammar.g:2223:4: (lv_semicolon_16_0= ';' )
            // InternalOptGrammar.g:2224:5: lv_semicolon_16_0= ';'
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
    // InternalOptGrammar.g:2240:1: entryRuleSimpleStatement2 returns [EObject current=null] : iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF ;
    public final EObject entryRuleSimpleStatement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement2 = null;


        try {
            // InternalOptGrammar.g:2240:57: (iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF )
            // InternalOptGrammar.g:2241:2: iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF
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
    // InternalOptGrammar.g:2247:1: ruleSimpleStatement2 returns [EObject current=null] : ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ;
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
            // InternalOptGrammar.g:2253:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) )
            // InternalOptGrammar.g:2254:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            {
            // InternalOptGrammar.g:2254:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 32:
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
                {
                alt43=1;
                }
                break;
            case 36:
                {
                alt43=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 48:
            case 49:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 63:
            case 183:
            case 184:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalOptGrammar.g:2255:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalOptGrammar.g:2255:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalOptGrammar.g:2256:4: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatement2Access().getStandardTypeWithoutQualifiedIdentifierParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_StandardTypeWithoutQualifiedIdentifier_0=ruleStandardTypeWithoutQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_StandardTypeWithoutQualifiedIdentifier_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalOptGrammar.g:2264:4: ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalOptGrammar.g:2265:5: () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalOptGrammar.g:2265:5: ()
                    // InternalOptGrammar.g:2266:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getSimpleStatement2Access().getStandardVariableDeclarationTypeAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalOptGrammar.g:2272:5: ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==27||LA40_0==31||(LA40_0>=168 && LA40_0<=174)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2273:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalOptGrammar.g:2273:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalOptGrammar.g:2274:7: lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSimpleStatement2Access().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_0_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop40;
                        }
                    } while (true);

                    // InternalOptGrammar.g:2291:5: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalOptGrammar.g:2292:6: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:2292:6: (lv_variable_3_0= ruleVariable )
                    // InternalOptGrammar.g:2293:7: lv_variable_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSimpleStatement2Access().getVariableVariableParserRuleCall_0_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
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

                    // InternalOptGrammar.g:2310:5: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==30) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalOptGrammar.g:2311:6: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_0_1_3_0());
                              					
                            }
                            // InternalOptGrammar.g:2315:6: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalOptGrammar.g:2316:7: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2316:7: (lv_expression_5_0= ruleExpression )
                            // InternalOptGrammar.g:2317:8: lv_expression_5_0= ruleExpression
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
                    // InternalOptGrammar.g:2338:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalOptGrammar.g:2338:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalOptGrammar.g:2339:4: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatement2Access().getVarTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_33);
                    ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalOptGrammar.g:2346:4: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==23) ) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalOptGrammar.g:2347:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2347:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2348:6: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2348:6: ()
                            // InternalOptGrammar.g:2349:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTypeDeclarationAction_1_1_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalOptGrammar.g:2355:6: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalOptGrammar.g:2356:7: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalOptGrammar.g:2356:7: (lv_variable_8_0= ruleVariable )
                            // InternalOptGrammar.g:2357:8: lv_variable_8_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getVariableVariableParserRuleCall_1_1_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_34);
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

                            // InternalOptGrammar.g:2374:6: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2375:7: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_9, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_0_2_0());
                              						
                            }
                            // InternalOptGrammar.g:2379:7: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalOptGrammar.g:2380:8: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2380:8: (lv_expression_10_0= ruleExpression )
                            // InternalOptGrammar.g:2381:9: lv_expression_10_0= ruleExpression
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
                            // InternalOptGrammar.g:2401:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2401:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2402:6: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2402:6: ()
                            // InternalOptGrammar.g:2403:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTupleVariableDeclarationAction_1_1_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalOptGrammar.g:2409:6: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalOptGrammar.g:2410:7: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalOptGrammar.g:2410:7: (lv_tuple_12_0= ruleTuple )
                            // InternalOptGrammar.g:2411:8: lv_tuple_12_0= ruleTuple
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getTupleTupleParserRuleCall_1_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_34);
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

                            // InternalOptGrammar.g:2428:6: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2429:7: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_13, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_1_2_0());
                              						
                            }
                            // InternalOptGrammar.g:2433:7: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalOptGrammar.g:2434:8: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2434:8: (lv_expression_14_0= ruleExpression )
                            // InternalOptGrammar.g:2435:9: lv_expression_14_0= ruleExpression
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
                    // InternalOptGrammar.g:2457:3: this_ExpressionStatement_15= ruleExpressionStatement
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
    // InternalOptGrammar.g:2469:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalOptGrammar.g:2469:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalOptGrammar.g:2470:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
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
    // InternalOptGrammar.g:2476:1: ruleExpressionStatement returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2482:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalOptGrammar.g:2483:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalOptGrammar.g:2483:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalOptGrammar.g:2484:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalOptGrammar.g:2484:3: (lv_expression_0_0= ruleExpression )
            // InternalOptGrammar.g:2485:4: lv_expression_0_0= ruleExpression
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
    // InternalOptGrammar.g:2505:1: entryRuleQualifiedIdentifier returns [EObject current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final EObject entryRuleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedIdentifier = null;


        try {
            // InternalOptGrammar.g:2505:60: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // InternalOptGrammar.g:2506:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
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
    // InternalOptGrammar.g:2512:1: ruleQualifiedIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) ;
    public final EObject ruleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        EObject lv_qualifiers_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2518:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) )
            // InternalOptGrammar.g:2519:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            {
            // InternalOptGrammar.g:2519:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            // InternalOptGrammar.g:2520:3: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )*
            {
            // InternalOptGrammar.g:2520:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalOptGrammar.g:2521:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:2521:4: (lv_identifier_0_0= RULE_ID )
            // InternalOptGrammar.g:2522:5: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            // InternalOptGrammar.g:2538:3: ( (lv_qualifiers_1_0= ruleQualifier ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==23||LA44_0==34||LA44_0==37) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalOptGrammar.g:2539:4: (lv_qualifiers_1_0= ruleQualifier )
            	    {
            	    // InternalOptGrammar.g:2539:4: (lv_qualifiers_1_0= ruleQualifier )
            	    // InternalOptGrammar.g:2540:5: lv_qualifiers_1_0= ruleQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getQualifiedIdentifierAccess().getQualifiersQualifierParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
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
            	    break loop44;
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
    // InternalOptGrammar.g:2561:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalOptGrammar.g:2561:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalOptGrammar.g:2562:2: iv_ruleQualifier= ruleQualifier EOF
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
    // InternalOptGrammar.g:2568:1: ruleQualifier returns [EObject current=null] : (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Index_1 = null;

        EObject this_Arguments_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2574:2: ( (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) )
            // InternalOptGrammar.g:2575:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            {
            // InternalOptGrammar.g:2575:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt45=1;
                }
                break;
            case 34:
                {
                alt45=2;
                }
                break;
            case 23:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalOptGrammar.g:2576:3: this_Field_0= ruleField
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
                    // InternalOptGrammar.g:2585:3: this_Index_1= ruleIndex
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
                    // InternalOptGrammar.g:2594:3: this_Arguments_2= ruleArguments
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
    // InternalOptGrammar.g:2606:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalOptGrammar.g:2606:46: (iv_ruleField= ruleField EOF )
            // InternalOptGrammar.g:2607:2: iv_ruleField= ruleField EOF
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
    // InternalOptGrammar.g:2613:1: ruleField returns [EObject current=null] : (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_field_1_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:2619:2: ( (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) )
            // InternalOptGrammar.g:2620:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            {
            // InternalOptGrammar.g:2620:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            // InternalOptGrammar.g:2621:3: otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFullStopKeyword_0());
              		
            }
            // InternalOptGrammar.g:2625:3: ( (lv_field_1_0= RULE_ID ) )
            // InternalOptGrammar.g:2626:4: (lv_field_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:2626:4: (lv_field_1_0= RULE_ID )
            // InternalOptGrammar.g:2627:5: lv_field_1_0= RULE_ID
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
    // InternalOptGrammar.g:2647:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // InternalOptGrammar.g:2647:46: (iv_ruleIndex= ruleIndex EOF )
            // InternalOptGrammar.g:2648:2: iv_ruleIndex= ruleIndex EOF
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
    // InternalOptGrammar.g:2654:1: ruleIndex returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2660:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) )
            // InternalOptGrammar.g:2661:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            {
            // InternalOptGrammar.g:2661:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            // InternalOptGrammar.g:2662:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:2666:3: ()
            // InternalOptGrammar.g:2667:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndexAccess().getIndexAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:2673:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_INT && LA46_0<=RULE_TX)||(LA46_0>=48 && LA46_0<=49)||(LA46_0>=51 && LA46_0<=58)||LA46_0==63||(LA46_0>=183 && LA46_0<=184)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOptGrammar.g:2674:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:2674:4: (lv_value_2_0= ruleExpression )
                    // InternalOptGrammar.g:2675:5: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIndexAccess().getValueExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
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
    // InternalOptGrammar.g:2700:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalOptGrammar.g:2700:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalOptGrammar.g:2701:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalOptGrammar.g:2707:1: ruleArguments returns [EObject current=null] : ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2713:2: ( ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) )
            // InternalOptGrammar.g:2714:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            {
            // InternalOptGrammar.g:2714:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            // InternalOptGrammar.g:2715:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            {
            // InternalOptGrammar.g:2715:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            // InternalOptGrammar.g:2716:4: lv_arguments_0_0= ruleFunctionCallArguments
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


    // $ANTLR start "entryRuleModifierInvocation"
    // InternalOptGrammar.g:2736:1: entryRuleModifierInvocation returns [EObject current=null] : iv_ruleModifierInvocation= ruleModifierInvocation EOF ;
    public final EObject entryRuleModifierInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierInvocation = null;


        try {
            // InternalOptGrammar.g:2736:59: (iv_ruleModifierInvocation= ruleModifierInvocation EOF )
            // InternalOptGrammar.g:2737:2: iv_ruleModifierInvocation= ruleModifierInvocation EOF
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
    // InternalOptGrammar.g:2743:1: ruleModifierInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleModifierInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2749:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalOptGrammar.g:2750:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalOptGrammar.g:2750:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalOptGrammar.g:2751:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalOptGrammar.g:2751:3: ( (otherlv_0= RULE_ID ) )
            // InternalOptGrammar.g:2752:4: (otherlv_0= RULE_ID )
            {
            // InternalOptGrammar.g:2752:4: (otherlv_0= RULE_ID )
            // InternalOptGrammar.g:2753:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModifierInvocationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModifierInvocationAccess().getNameModifierCrossReference_0_0());
              				
            }

            }


            }

            // InternalOptGrammar.g:2764:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==23) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOptGrammar.g:2765:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalOptGrammar.g:2765:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalOptGrammar.g:2766:5: lv_args_1_0= ruleFunctionCallListArguments
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
    // InternalOptGrammar.g:2787:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalOptGrammar.g:2787:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalOptGrammar.g:2788:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalOptGrammar.g:2794:1: ruleParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2800:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:2801:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:2801:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:2802:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:2806:3: ()
            // InternalOptGrammar.g:2807:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:2813:3: ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||LA49_0==32||LA49_0==36||(LA49_0>=64 && LA49_0<=167)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOptGrammar.g:2814:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // InternalOptGrammar.g:2814:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) )
                    // InternalOptGrammar.g:2815:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    {
                    // InternalOptGrammar.g:2815:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    // InternalOptGrammar.g:2816:6: lv_parameters_2_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterListAccess().getParametersVariableDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalOptGrammar.g:2833:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==24) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2834:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:2838:5: ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    // InternalOptGrammar.g:2839:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalOptGrammar.g:2839:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    // InternalOptGrammar.g:2840:7: lv_parameters_4_0= ruleVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParameterListAccess().getParametersVariableDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:2867:1: entryRuleReturnsParameterList returns [EObject current=null] : iv_ruleReturnsParameterList= ruleReturnsParameterList EOF ;
    public final EObject entryRuleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsParameterList = null;


        try {
            // InternalOptGrammar.g:2867:61: (iv_ruleReturnsParameterList= ruleReturnsParameterList EOF )
            // InternalOptGrammar.g:2868:2: iv_ruleReturnsParameterList= ruleReturnsParameterList EOF
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
    // InternalOptGrammar.g:2874:1: ruleReturnsParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2880:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:2881:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:2881:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:2882:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnsParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:2886:3: ()
            // InternalOptGrammar.g:2887:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnsParameterListAccess().getReturnsParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:2893:3: ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==32||LA51_0==36||(LA51_0>=64 && LA51_0<=167)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOptGrammar.g:2894:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    {
                    // InternalOptGrammar.g:2894:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) )
                    // InternalOptGrammar.g:2895:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    {
                    // InternalOptGrammar.g:2895:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    // InternalOptGrammar.g:2896:6: lv_parameters_2_0= ruleReturnParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReturnsParameterListAccess().getParametersReturnParameterDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalOptGrammar.g:2913:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==24) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2914:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReturnsParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:2918:5: ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    // InternalOptGrammar.g:2919:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    {
                    	    // InternalOptGrammar.g:2919:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    // InternalOptGrammar.g:2920:7: lv_parameters_4_0= ruleReturnParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReturnsParameterListAccess().getParametersReturnParameterDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:2947:1: entryRuleReturnParameterDeclaration returns [EObject current=null] : iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF ;
    public final EObject entryRuleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterDeclaration = null;


        try {
            // InternalOptGrammar.g:2947:67: (iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF )
            // InternalOptGrammar.g:2948:2: iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF
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
    // InternalOptGrammar.g:2954:1: ruleReturnParameterDeclaration returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) ;
    public final EObject ruleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_typeRef_0_0 = null;

        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2960:2: ( ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) )
            // InternalOptGrammar.g:2961:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            {
            // InternalOptGrammar.g:2961:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            // InternalOptGrammar.g:2962:3: ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )?
            {
            // InternalOptGrammar.g:2962:3: ( (lv_typeRef_0_0= ruleType ) )
            // InternalOptGrammar.g:2963:4: (lv_typeRef_0_0= ruleType )
            {
            // InternalOptGrammar.g:2963:4: (lv_typeRef_0_0= ruleType )
            // InternalOptGrammar.g:2964:5: lv_typeRef_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnParameterDeclarationAccess().getTypeRefTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            // InternalOptGrammar.g:2981:3: ( (lv_variable_1_0= ruleVariable ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOptGrammar.g:2982:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:2982:4: (lv_variable_1_0= ruleVariable )
                    // InternalOptGrammar.g:2983:5: lv_variable_1_0= ruleVariable
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


    // $ANTLR start "entryRuleLoopStructures"
    // InternalOptGrammar.g:3004:1: entryRuleLoopStructures returns [EObject current=null] : iv_ruleLoopStructures= ruleLoopStructures EOF ;
    public final EObject entryRuleLoopStructures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStructures = null;


        try {
            // InternalOptGrammar.g:3004:55: (iv_ruleLoopStructures= ruleLoopStructures EOF )
            // InternalOptGrammar.g:3005:2: iv_ruleLoopStructures= ruleLoopStructures EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopStructuresRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoopStructures=ruleLoopStructures();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopStructures; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopStructures"


    // $ANTLR start "ruleLoopStructures"
    // InternalOptGrammar.g:3011:1: ruleLoopStructures returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement ) ;
    public final EObject ruleLoopStructures() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_WhileStatement_1 = null;

        EObject this_ForStatement_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3017:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement ) )
            // InternalOptGrammar.g:3018:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement )
            {
            // InternalOptGrammar.g:3018:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt53=1;
                }
                break;
            case 41:
                {
                alt53=2;
                }
                break;
            case 42:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalOptGrammar.g:3019:3: this_IfStatement_0= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLoopStructuresAccess().getIfStatementParserRuleCall_0());
                      		
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
                    // InternalOptGrammar.g:3028:3: this_WhileStatement_1= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLoopStructuresAccess().getWhileStatementParserRuleCall_1());
                      		
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
                    // InternalOptGrammar.g:3037:3: this_ForStatement_2= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLoopStructuresAccess().getForStatementParserRuleCall_2());
                      		
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

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopStructures"


    // $ANTLR start "entryRuleStatement"
    // InternalOptGrammar.g:3049:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalOptGrammar.g:3049:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalOptGrammar.g:3050:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalOptGrammar.g:3056:1: ruleStatement returns [EObject current=null] : (this_LoopStructures_0= ruleLoopStructures | this_Body_1= ruleBody | this_PlaceHolderStatement_2= rulePlaceHolderStatement | (this_ContinueStatement_3= ruleContinueStatement | this_BreakStatement_4= ruleBreakStatement | this_ReturnStatement_5= ruleReturnStatement | this_ThrowStatement_6= ruleThrowStatement | this_DeleteStatement_7= ruleDeleteStatement | this_SimpleStatement_8= ruleSimpleStatement ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_LoopStructures_0 = null;

        EObject this_Body_1 = null;

        EObject this_PlaceHolderStatement_2 = null;

        EObject this_ContinueStatement_3 = null;

        EObject this_BreakStatement_4 = null;

        EObject this_ReturnStatement_5 = null;

        EObject this_ThrowStatement_6 = null;

        EObject this_DeleteStatement_7 = null;

        EObject this_SimpleStatement_8 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3062:2: ( (this_LoopStructures_0= ruleLoopStructures | this_Body_1= ruleBody | this_PlaceHolderStatement_2= rulePlaceHolderStatement | (this_ContinueStatement_3= ruleContinueStatement | this_BreakStatement_4= ruleBreakStatement | this_ReturnStatement_5= ruleReturnStatement | this_ThrowStatement_6= ruleThrowStatement | this_DeleteStatement_7= ruleDeleteStatement | this_SimpleStatement_8= ruleSimpleStatement ) ) )
            // InternalOptGrammar.g:3063:2: (this_LoopStructures_0= ruleLoopStructures | this_Body_1= ruleBody | this_PlaceHolderStatement_2= rulePlaceHolderStatement | (this_ContinueStatement_3= ruleContinueStatement | this_BreakStatement_4= ruleBreakStatement | this_ReturnStatement_5= ruleReturnStatement | this_ThrowStatement_6= ruleThrowStatement | this_DeleteStatement_7= ruleDeleteStatement | this_SimpleStatement_8= ruleSimpleStatement ) )
            {
            // InternalOptGrammar.g:3063:2: (this_LoopStructures_0= ruleLoopStructures | this_Body_1= ruleBody | this_PlaceHolderStatement_2= rulePlaceHolderStatement | (this_ContinueStatement_3= ruleContinueStatement | this_BreakStatement_4= ruleBreakStatement | this_ReturnStatement_5= ruleReturnStatement | this_ThrowStatement_6= ruleThrowStatement | this_DeleteStatement_7= ruleDeleteStatement | this_SimpleStatement_8= ruleSimpleStatement ) )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 39:
            case 41:
            case 42:
                {
                alt55=1;
                }
                break;
            case 17:
                {
                alt55=2;
                }
                break;
            case 47:
                {
                alt55=3;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 32:
            case 36:
            case 38:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
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
            case 183:
            case 184:
                {
                alt55=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalOptGrammar.g:3064:3: this_LoopStructures_0= ruleLoopStructures
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLoopStructuresParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LoopStructures_0=ruleLoopStructures();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LoopStructures_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:3073:3: this_Body_1= ruleBody
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBodyParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Body_1=ruleBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Body_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:3082:3: this_PlaceHolderStatement_2= rulePlaceHolderStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getPlaceHolderStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PlaceHolderStatement_2=rulePlaceHolderStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PlaceHolderStatement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:3091:3: (this_ContinueStatement_3= ruleContinueStatement | this_BreakStatement_4= ruleBreakStatement | this_ReturnStatement_5= ruleReturnStatement | this_ThrowStatement_6= ruleThrowStatement | this_DeleteStatement_7= ruleDeleteStatement | this_SimpleStatement_8= ruleSimpleStatement )
                    {
                    // InternalOptGrammar.g:3091:3: (this_ContinueStatement_3= ruleContinueStatement | this_BreakStatement_4= ruleBreakStatement | this_ReturnStatement_5= ruleReturnStatement | this_ThrowStatement_6= ruleThrowStatement | this_DeleteStatement_7= ruleDeleteStatement | this_SimpleStatement_8= ruleSimpleStatement )
                    int alt54=6;
                    switch ( input.LA(1) ) {
                    case 43:
                        {
                        alt54=1;
                        }
                        break;
                    case 44:
                        {
                        alt54=2;
                        }
                        break;
                    case 45:
                        {
                        alt54=3;
                        }
                        break;
                    case 46:
                        {
                        alt54=4;
                        }
                        break;
                    case 38:
                        {
                        alt54=5;
                        }
                        break;
                    case RULE_INT:
                    case RULE_STRING:
                    case RULE_HEX:
                    case RULE_DECIMAL:
                    case RULE_BLOCK:
                    case RULE_MSG:
                    case RULE_TX:
                    case 32:
                    case 36:
                    case 48:
                    case 49:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
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
                    case 183:
                    case 184:
                        {
                        alt54=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // InternalOptGrammar.g:3092:4: this_ContinueStatement_3= ruleContinueStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_3_0());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_ContinueStatement_3=ruleContinueStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_ContinueStatement_3;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 2 :
                            // InternalOptGrammar.g:3101:4: this_BreakStatement_4= ruleBreakStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_3_1());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_BreakStatement_4=ruleBreakStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_BreakStatement_4;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 3 :
                            // InternalOptGrammar.g:3110:4: this_ReturnStatement_5= ruleReturnStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_3_2());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_ReturnStatement_5=ruleReturnStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_ReturnStatement_5;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 4 :
                            // InternalOptGrammar.g:3119:4: this_ThrowStatement_6= ruleThrowStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getThrowStatementParserRuleCall_3_3());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_ThrowStatement_6=ruleThrowStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_ThrowStatement_6;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 5 :
                            // InternalOptGrammar.g:3128:4: this_DeleteStatement_7= ruleDeleteStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getDeleteStatementParserRuleCall_3_4());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_DeleteStatement_7=ruleDeleteStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_DeleteStatement_7;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 6 :
                            // InternalOptGrammar.g:3137:4: this_SimpleStatement_8= ruleSimpleStatement
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getStatementAccess().getSimpleStatementParserRuleCall_3_5());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_SimpleStatement_8=ruleSimpleStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_SimpleStatement_8;
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
    // InternalOptGrammar.g:3150:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // InternalOptGrammar.g:3150:56: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // InternalOptGrammar.g:3151:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
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
    // InternalOptGrammar.g:3157:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3163:2: ( (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) )
            // InternalOptGrammar.g:3164:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3164:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            // InternalOptGrammar.g:3165:3: otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
              		
            }
            // InternalOptGrammar.g:3169:3: ( (lv_variable_1_0= ruleQualifiedIdentifier ) )
            // InternalOptGrammar.g:3170:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            {
            // InternalOptGrammar.g:3170:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            // InternalOptGrammar.g:3171:5: lv_variable_1_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeleteStatementAccess().getVariableQualifiedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
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
    // InternalOptGrammar.g:3196:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalOptGrammar.g:3196:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalOptGrammar.g:3197:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalOptGrammar.g:3203:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) ;
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
            // InternalOptGrammar.g:3209:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) )
            // InternalOptGrammar.g:3210:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            {
            // InternalOptGrammar.g:3210:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            // InternalOptGrammar.g:3211:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3219:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalOptGrammar.g:3220:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:3220:4: (lv_condition_2_0= ruleExpression )
            // InternalOptGrammar.g:3221:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,25,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalOptGrammar.g:3242:3: ( (lv_trueBody_4_0= ruleStatement ) )
            // InternalOptGrammar.g:3243:4: (lv_trueBody_4_0= ruleStatement )
            {
            // InternalOptGrammar.g:3243:4: (lv_trueBody_4_0= ruleStatement )
            // InternalOptGrammar.g:3244:5: lv_trueBody_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getTrueBodyStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_40);
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

            // InternalOptGrammar.g:3261:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==40) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred1_InternalOptGrammar()) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalOptGrammar.g:3262:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) )
                    {
                    // InternalOptGrammar.g:3262:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalOptGrammar.g:3263:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalOptGrammar.g:3269:4: ( (lv_falseBody_6_0= ruleStatement ) )
                    // InternalOptGrammar.g:3270:5: (lv_falseBody_6_0= ruleStatement )
                    {
                    // InternalOptGrammar.g:3270:5: (lv_falseBody_6_0= ruleStatement )
                    // InternalOptGrammar.g:3271:6: lv_falseBody_6_0= ruleStatement
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
    // InternalOptGrammar.g:3293:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalOptGrammar.g:3293:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalOptGrammar.g:3294:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalOptGrammar.g:3300:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3306:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) )
            // InternalOptGrammar.g:3307:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // InternalOptGrammar.g:3307:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            // InternalOptGrammar.g:3308:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3316:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalOptGrammar.g:3317:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:3317:4: (lv_condition_2_0= ruleExpression )
            // InternalOptGrammar.g:3318:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,25,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalOptGrammar.g:3339:3: ( (lv_body_4_0= ruleStatement ) )
            // InternalOptGrammar.g:3340:4: (lv_body_4_0= ruleStatement )
            {
            // InternalOptGrammar.g:3340:4: (lv_body_4_0= ruleStatement )
            // InternalOptGrammar.g:3341:5: lv_body_4_0= ruleStatement
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
    // InternalOptGrammar.g:3362:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalOptGrammar.g:3362:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalOptGrammar.g:3363:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalOptGrammar.g:3369:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) ;
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
            // InternalOptGrammar.g:3375:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) )
            // InternalOptGrammar.g:3376:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            {
            // InternalOptGrammar.g:3376:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            // InternalOptGrammar.g:3377:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3385:3: ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_INT && LA57_0<=RULE_TX)||LA57_0==32||LA57_0==36||(LA57_0>=48 && LA57_0<=49)||(LA57_0>=51 && LA57_0<=58)||(LA57_0>=63 && LA57_0<=167)||(LA57_0>=183 && LA57_0<=184)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOptGrammar.g:3386:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    {
                    // InternalOptGrammar.g:3386:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    // InternalOptGrammar.g:3387:5: lv_initExpression_2_0= ruleSimpleStatement2
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getInitExpressionSimpleStatement2ParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
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

            // InternalOptGrammar.g:3404:3: ( ( ';' )=>otherlv_3= ';' )
            // InternalOptGrammar.g:3405:4: ( ';' )=>otherlv_3= ';'
            {
            otherlv_3=(Token)match(input,18,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
              			
            }

            }

            // InternalOptGrammar.g:3411:3: ( (lv_conditionExpression_4_0= ruleExpression ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_INT && LA58_0<=RULE_TX)||(LA58_0>=48 && LA58_0<=49)||(LA58_0>=51 && LA58_0<=58)||LA58_0==63||(LA58_0>=183 && LA58_0<=184)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOptGrammar.g:3412:4: (lv_conditionExpression_4_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:3412:4: (lv_conditionExpression_4_0= ruleExpression )
                    // InternalOptGrammar.g:3413:5: lv_conditionExpression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getConditionExpressionExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,18,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_5());
              		
            }
            // InternalOptGrammar.g:3434:3: ( (lv_loopExpression_6_0= ruleExpressionStatement ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_INT && LA59_0<=RULE_TX)||(LA59_0>=48 && LA59_0<=49)||(LA59_0>=51 && LA59_0<=58)||LA59_0==63||(LA59_0>=183 && LA59_0<=184)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOptGrammar.g:3435:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    {
                    // InternalOptGrammar.g:3435:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    // InternalOptGrammar.g:3436:5: lv_loopExpression_6_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getLoopExpressionExpressionStatementParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
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

            otherlv_7=(Token)match(input,25,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalOptGrammar.g:3457:3: ( (lv_body_8_0= ruleStatement ) )
            // InternalOptGrammar.g:3458:4: (lv_body_8_0= ruleStatement )
            {
            // InternalOptGrammar.g:3458:4: (lv_body_8_0= ruleStatement )
            // InternalOptGrammar.g:3459:5: lv_body_8_0= ruleStatement
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
    // InternalOptGrammar.g:3480:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalOptGrammar.g:3480:45: (iv_ruleBody= ruleBody EOF )
            // InternalOptGrammar.g:3481:2: iv_ruleBody= ruleBody EOF
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
    // InternalOptGrammar.g:3487:1: ruleBody returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3493:2: ( (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) )
            // InternalOptGrammar.g:3494:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            {
            // InternalOptGrammar.g:3494:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            // InternalOptGrammar.g:3495:3: otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:3499:3: ()
            // InternalOptGrammar.g:3500:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBodyAccess().getBodyAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3506:3: ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_INT && LA61_0<=RULE_TX)||LA61_0==17||LA61_0==32||LA61_0==36||(LA61_0>=38 && LA61_0<=39)||(LA61_0>=41 && LA61_0<=49)||(LA61_0>=51 && LA61_0<=58)||(LA61_0>=63 && LA61_0<=167)||(LA61_0>=183 && LA61_0<=184)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOptGrammar.g:3507:4: ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )*
                    {
                    // InternalOptGrammar.g:3507:4: ( (lv_statements_2_0= ruleStatement ) )
                    // InternalOptGrammar.g:3508:5: (lv_statements_2_0= ruleStatement )
                    {
                    // InternalOptGrammar.g:3508:5: (lv_statements_2_0= ruleStatement )
                    // InternalOptGrammar.g:3509:6: lv_statements_2_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBodyAccess().getStatementsStatementParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    // InternalOptGrammar.g:3526:4: ( (lv_statements_3_0= ruleStatement ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=RULE_INT && LA60_0<=RULE_TX)||LA60_0==17||LA60_0==32||LA60_0==36||(LA60_0>=38 && LA60_0<=39)||(LA60_0>=41 && LA60_0<=49)||(LA60_0>=51 && LA60_0<=58)||(LA60_0>=63 && LA60_0<=167)||(LA60_0>=183 && LA60_0<=184)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalOptGrammar.g:3527:5: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // InternalOptGrammar.g:3527:5: (lv_statements_3_0= ruleStatement )
                    	    // InternalOptGrammar.g:3528:6: lv_statements_3_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBodyAccess().getStatementsStatementParserRuleCall_2_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3554:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // InternalOptGrammar.g:3554:58: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalOptGrammar.g:3555:2: iv_ruleContinueStatement= ruleContinueStatement EOF
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
    // InternalOptGrammar.g:3561:1: ruleContinueStatement returns [EObject current=null] : (otherlv_0= 'continue' () otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3567:2: ( (otherlv_0= 'continue' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:3568:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3568:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            // InternalOptGrammar.g:3569:3: otherlv_0= 'continue' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContinueStatementAccess().getContinueKeyword_0());
              		
            }
            // InternalOptGrammar.g:3573:3: ()
            // InternalOptGrammar.g:3574:4: 
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
    // InternalOptGrammar.g:3588:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalOptGrammar.g:3588:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalOptGrammar.g:3589:2: iv_ruleBreakStatement= ruleBreakStatement EOF
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
    // InternalOptGrammar.g:3595:1: ruleBreakStatement returns [EObject current=null] : (otherlv_0= 'break' () otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3601:2: ( (otherlv_0= 'break' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:3602:2: (otherlv_0= 'break' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3602:2: (otherlv_0= 'break' () otherlv_2= ';' )
            // InternalOptGrammar.g:3603:3: otherlv_0= 'break' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakStatementAccess().getBreakKeyword_0());
              		
            }
            // InternalOptGrammar.g:3607:3: ()
            // InternalOptGrammar.g:3608:4: 
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
    // InternalOptGrammar.g:3622:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalOptGrammar.g:3622:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalOptGrammar.g:3623:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalOptGrammar.g:3629:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3635:2: ( (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) )
            // InternalOptGrammar.g:3636:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            {
            // InternalOptGrammar.g:3636:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            // InternalOptGrammar.g:3637:3: otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
              		
            }
            // InternalOptGrammar.g:3641:3: ()
            // InternalOptGrammar.g:3642:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3648:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_INT && LA62_0<=RULE_TX)||(LA62_0>=48 && LA62_0<=49)||(LA62_0>=51 && LA62_0<=58)||LA62_0==63||(LA62_0>=183 && LA62_0<=184)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOptGrammar.g:3649:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:3649:4: (lv_expression_2_0= ruleExpression )
                    // InternalOptGrammar.g:3650:5: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
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
    // InternalOptGrammar.g:3675:1: entryRuleThrowStatement returns [EObject current=null] : iv_ruleThrowStatement= ruleThrowStatement EOF ;
    public final EObject entryRuleThrowStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStatement = null;


        try {
            // InternalOptGrammar.g:3675:55: (iv_ruleThrowStatement= ruleThrowStatement EOF )
            // InternalOptGrammar.g:3676:2: iv_ruleThrowStatement= ruleThrowStatement EOF
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
    // InternalOptGrammar.g:3682:1: ruleThrowStatement returns [EObject current=null] : (otherlv_0= 'throw' () otherlv_2= ';' ) ;
    public final EObject ruleThrowStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3688:2: ( (otherlv_0= 'throw' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:3689:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3689:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            // InternalOptGrammar.g:3690:3: otherlv_0= 'throw' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getThrowStatementAccess().getThrowKeyword_0());
              		
            }
            // InternalOptGrammar.g:3694:3: ()
            // InternalOptGrammar.g:3695:4: 
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
    // InternalOptGrammar.g:3709:1: entryRulePlaceHolderStatement returns [EObject current=null] : iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF ;
    public final EObject entryRulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceHolderStatement = null;


        try {
            // InternalOptGrammar.g:3709:61: (iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF )
            // InternalOptGrammar.g:3710:2: iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF
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
    // InternalOptGrammar.g:3716:1: rulePlaceHolderStatement returns [EObject current=null] : (otherlv_0= '_' () (otherlv_2= ';' )? ) ;
    public final EObject rulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3722:2: ( (otherlv_0= '_' () (otherlv_2= ';' )? ) )
            // InternalOptGrammar.g:3723:2: (otherlv_0= '_' () (otherlv_2= ';' )? )
            {
            // InternalOptGrammar.g:3723:2: (otherlv_0= '_' () (otherlv_2= ';' )? )
            // InternalOptGrammar.g:3724:3: otherlv_0= '_' () (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlaceHolderStatementAccess().get_Keyword_0());
              		
            }
            // InternalOptGrammar.g:3728:3: ()
            // InternalOptGrammar.g:3729:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPlaceHolderStatementAccess().getPlaceHolderStatementAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3735:3: (otherlv_2= ';' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==18) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOptGrammar.g:3736:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPlaceHolderStatementAccess().getSemicolonKeyword_2());
                      			
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
    // $ANTLR end "rulePlaceHolderStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalOptGrammar.g:3745:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalOptGrammar.g:3745:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalOptGrammar.g:3746:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalOptGrammar.g:3752:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* ) | ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* ) | ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) ) ) ;
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
            // InternalOptGrammar.g:3758:2: ( ( ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* ) | ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* ) | ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) ) ) )
            // InternalOptGrammar.g:3759:2: ( ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* ) | ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* ) | ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) ) )
            {
            // InternalOptGrammar.g:3759:2: ( ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* ) | ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* ) | ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 63:
            case 183:
            case 184:
                {
                alt66=1;
                }
                break;
            case 48:
                {
                alt66=2;
                }
                break;
            case 49:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalOptGrammar.g:3760:3: ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* )
                    {
                    // InternalOptGrammar.g:3760:3: ( ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )* )
                    // InternalOptGrammar.g:3761:4: ( (lv_first_0_0= ruleLiteral ) ) ( (lv_operations_1_0= ruleConditionOperation ) )*
                    {
                    // InternalOptGrammar.g:3761:4: ( (lv_first_0_0= ruleLiteral ) )
                    // InternalOptGrammar.g:3762:5: (lv_first_0_0= ruleLiteral )
                    {
                    // InternalOptGrammar.g:3762:5: (lv_first_0_0= ruleLiteral )
                    // InternalOptGrammar.g:3763:6: lv_first_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getFirstLiteralParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
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

                    // InternalOptGrammar.g:3780:4: ( (lv_operations_1_0= ruleConditionOperation ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( ((LA64_0>=175 && LA64_0<=182)) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalOptGrammar.g:3781:5: (lv_operations_1_0= ruleConditionOperation )
                    	    {
                    	    // InternalOptGrammar.g:3781:5: (lv_operations_1_0= ruleConditionOperation )
                    	    // InternalOptGrammar.g:3782:6: lv_operations_1_0= ruleConditionOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getExpressionAccess().getOperationsConditionOperationParserRuleCall_0_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_46);
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
                    	    break loop64;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:3801:3: ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* )
                    {
                    // InternalOptGrammar.g:3801:3: ( ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )* )
                    // InternalOptGrammar.g:3802:4: ( (lv_negate_2_0= 'NOT' ) ) ( (lv_first_3_0= ruleLiteral ) ) ( (lv_operations_4_0= ruleConditionOperation ) )*
                    {
                    // InternalOptGrammar.g:3802:4: ( (lv_negate_2_0= 'NOT' ) )
                    // InternalOptGrammar.g:3803:5: (lv_negate_2_0= 'NOT' )
                    {
                    // InternalOptGrammar.g:3803:5: (lv_negate_2_0= 'NOT' )
                    // InternalOptGrammar.g:3804:6: lv_negate_2_0= 'NOT'
                    {
                    lv_negate_2_0=(Token)match(input,48,FOLLOW_47); if (state.failed) return current;
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

                    // InternalOptGrammar.g:3816:4: ( (lv_first_3_0= ruleLiteral ) )
                    // InternalOptGrammar.g:3817:5: (lv_first_3_0= ruleLiteral )
                    {
                    // InternalOptGrammar.g:3817:5: (lv_first_3_0= ruleLiteral )
                    // InternalOptGrammar.g:3818:6: lv_first_3_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getFirstLiteralParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
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

                    // InternalOptGrammar.g:3835:4: ( (lv_operations_4_0= ruleConditionOperation ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=175 && LA65_0<=182)) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalOptGrammar.g:3836:5: (lv_operations_4_0= ruleConditionOperation )
                    	    {
                    	    // InternalOptGrammar.g:3836:5: (lv_operations_4_0= ruleConditionOperation )
                    	    // InternalOptGrammar.g:3837:6: lv_operations_4_0= ruleConditionOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getExpressionAccess().getOperationsConditionOperationParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_46);
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
                    	    break loop65;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:3856:3: ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) )
                    {
                    // InternalOptGrammar.g:3856:3: ( ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) ) )
                    // InternalOptGrammar.g:3857:4: ( (lv_ternary_5_0= 'TERNARY' ) ) ( (lv_first_6_0= ruleLiteral ) ) otherlv_7= '?' ( (lv_true_8_0= ruleLiteral ) ) otherlv_9= ':' ( (lv_false_10_0= ruleLiteral ) )
                    {
                    // InternalOptGrammar.g:3857:4: ( (lv_ternary_5_0= 'TERNARY' ) )
                    // InternalOptGrammar.g:3858:5: (lv_ternary_5_0= 'TERNARY' )
                    {
                    // InternalOptGrammar.g:3858:5: (lv_ternary_5_0= 'TERNARY' )
                    // InternalOptGrammar.g:3859:6: lv_ternary_5_0= 'TERNARY'
                    {
                    lv_ternary_5_0=(Token)match(input,49,FOLLOW_47); if (state.failed) return current;
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

                    // InternalOptGrammar.g:3871:4: ( (lv_first_6_0= ruleLiteral ) )
                    // InternalOptGrammar.g:3872:5: (lv_first_6_0= ruleLiteral )
                    {
                    // InternalOptGrammar.g:3872:5: (lv_first_6_0= ruleLiteral )
                    // InternalOptGrammar.g:3873:6: lv_first_6_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getFirstLiteralParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
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

                    otherlv_7=(Token)match(input,50,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getQuestionMarkKeyword_2_2());
                      			
                    }
                    // InternalOptGrammar.g:3894:4: ( (lv_true_8_0= ruleLiteral ) )
                    // InternalOptGrammar.g:3895:5: (lv_true_8_0= ruleLiteral )
                    {
                    // InternalOptGrammar.g:3895:5: (lv_true_8_0= ruleLiteral )
                    // InternalOptGrammar.g:3896:6: lv_true_8_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getTrueLiteralParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
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

                    otherlv_9=(Token)match(input,26,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getColonKeyword_2_4());
                      			
                    }
                    // InternalOptGrammar.g:3917:4: ( (lv_false_10_0= ruleLiteral ) )
                    // InternalOptGrammar.g:3918:5: (lv_false_10_0= ruleLiteral )
                    {
                    // InternalOptGrammar.g:3918:5: (lv_false_10_0= ruleLiteral )
                    // InternalOptGrammar.g:3919:6: lv_false_10_0= ruleLiteral
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
    // InternalOptGrammar.g:3941:1: entryRuleConditionOperation returns [EObject current=null] : iv_ruleConditionOperation= ruleConditionOperation EOF ;
    public final EObject entryRuleConditionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionOperation = null;


        try {
            // InternalOptGrammar.g:3941:59: (iv_ruleConditionOperation= ruleConditionOperation EOF )
            // InternalOptGrammar.g:3942:2: iv_ruleConditionOperation= ruleConditionOperation EOF
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
    // InternalOptGrammar.g:3948:1: ruleConditionOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleLogicalOperationLiteral ) ) ( (lv_negateSecond_1_0= 'NOT' ) )? ( (lv_seconds_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleConditionOperation() throws RecognitionException {
        EObject current = null;

        Token lv_negateSecond_1_0=null;
        Enumerator lv_operation_0_0 = null;

        EObject lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3954:2: ( ( ( (lv_operation_0_0= ruleLogicalOperationLiteral ) ) ( (lv_negateSecond_1_0= 'NOT' ) )? ( (lv_seconds_2_0= ruleLiteral ) ) ) )
            // InternalOptGrammar.g:3955:2: ( ( (lv_operation_0_0= ruleLogicalOperationLiteral ) ) ( (lv_negateSecond_1_0= 'NOT' ) )? ( (lv_seconds_2_0= ruleLiteral ) ) )
            {
            // InternalOptGrammar.g:3955:2: ( ( (lv_operation_0_0= ruleLogicalOperationLiteral ) ) ( (lv_negateSecond_1_0= 'NOT' ) )? ( (lv_seconds_2_0= ruleLiteral ) ) )
            // InternalOptGrammar.g:3956:3: ( (lv_operation_0_0= ruleLogicalOperationLiteral ) ) ( (lv_negateSecond_1_0= 'NOT' ) )? ( (lv_seconds_2_0= ruleLiteral ) )
            {
            // InternalOptGrammar.g:3956:3: ( (lv_operation_0_0= ruleLogicalOperationLiteral ) )
            // InternalOptGrammar.g:3957:4: (lv_operation_0_0= ruleLogicalOperationLiteral )
            {
            // InternalOptGrammar.g:3957:4: (lv_operation_0_0= ruleLogicalOperationLiteral )
            // InternalOptGrammar.g:3958:5: lv_operation_0_0= ruleLogicalOperationLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionOperationAccess().getOperationLogicalOperationLiteralEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_49);
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

            // InternalOptGrammar.g:3975:3: ( (lv_negateSecond_1_0= 'NOT' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==48) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOptGrammar.g:3976:4: (lv_negateSecond_1_0= 'NOT' )
                    {
                    // InternalOptGrammar.g:3976:4: (lv_negateSecond_1_0= 'NOT' )
                    // InternalOptGrammar.g:3977:5: lv_negateSecond_1_0= 'NOT'
                    {
                    lv_negateSecond_1_0=(Token)match(input,48,FOLLOW_47); if (state.failed) return current;
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

            // InternalOptGrammar.g:3989:3: ( (lv_seconds_2_0= ruleLiteral ) )
            // InternalOptGrammar.g:3990:4: (lv_seconds_2_0= ruleLiteral )
            {
            // InternalOptGrammar.g:3990:4: (lv_seconds_2_0= ruleLiteral )
            // InternalOptGrammar.g:3991:5: lv_seconds_2_0= ruleLiteral
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
    // InternalOptGrammar.g:4012:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalOptGrammar.g:4012:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalOptGrammar.g:4013:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalOptGrammar.g:4019:1: ruleLiteral returns [EObject current=null] : (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction ) ;
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
            // InternalOptGrammar.g:4025:2: ( (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction ) )
            // InternalOptGrammar.g:4026:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction )
            {
            // InternalOptGrammar.g:4026:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction )
            int alt68=9;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
                {
                alt68=1;
                }
                break;
            case 183:
            case 184:
                {
                alt68=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case 63:
                {
                alt68=3;
                }
                break;
            case RULE_STRING:
                {
                alt68=4;
                }
                break;
            case 51:
                {
                alt68=5;
                }
                break;
            case 52:
                {
                alt68=6;
                }
                break;
            case 53:
            case 54:
                {
                alt68=7;
                }
                break;
            case 56:
            case 57:
            case 58:
                {
                alt68=8;
                }
                break;
            case 55:
                {
                alt68=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalOptGrammar.g:4027:3: this_SpecialVariables_0= ruleSpecialVariables
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
                    // InternalOptGrammar.g:4036:3: this_BooleanConst_1= ruleBooleanConst
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
                    // InternalOptGrammar.g:4045:3: this_NumericLiteral_2= ruleNumericLiteral
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
                    // InternalOptGrammar.g:4054:3: this_StringLiteral_3= ruleStringLiteral
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
                    // InternalOptGrammar.g:4063:3: this_GasleftFunction_4= ruleGasleftFunction
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
                    // InternalOptGrammar.g:4072:3: this_BlockhashFunction_5= ruleBlockhashFunction
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
                    // InternalOptGrammar.g:4081:3: this_MathematicalFunction_6= ruleMathematicalFunction
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
                    // InternalOptGrammar.g:4090:3: this_HashFunction_7= ruleHashFunction
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
                    // InternalOptGrammar.g:4099:3: this_EcrecoverFunction_8= ruleEcrecoverFunction
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
    // InternalOptGrammar.g:4111:1: entryRuleGasleftFunction returns [EObject current=null] : iv_ruleGasleftFunction= ruleGasleftFunction EOF ;
    public final EObject entryRuleGasleftFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGasleftFunction = null;


        try {
            // InternalOptGrammar.g:4111:56: (iv_ruleGasleftFunction= ruleGasleftFunction EOF )
            // InternalOptGrammar.g:4112:2: iv_ruleGasleftFunction= ruleGasleftFunction EOF
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
    // InternalOptGrammar.g:4118:1: ruleGasleftFunction returns [EObject current=null] : ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleGasleftFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:4124:2: ( ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalOptGrammar.g:4125:2: ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalOptGrammar.g:4125:2: ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalOptGrammar.g:4126:3: ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalOptGrammar.g:4126:3: ( (lv_name_0_0= 'gasleft' ) )
            // InternalOptGrammar.g:4127:4: (lv_name_0_0= 'gasleft' )
            {
            // InternalOptGrammar.g:4127:4: (lv_name_0_0= 'gasleft' )
            // InternalOptGrammar.g:4128:5: lv_name_0_0= 'gasleft'
            {
            lv_name_0_0=(Token)match(input,51,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGasleftFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:4152:1: entryRuleBlockhashFunction returns [EObject current=null] : iv_ruleBlockhashFunction= ruleBlockhashFunction EOF ;
    public final EObject entryRuleBlockhashFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockhashFunction = null;


        try {
            // InternalOptGrammar.g:4152:58: (iv_ruleBlockhashFunction= ruleBlockhashFunction EOF )
            // InternalOptGrammar.g:4153:2: iv_ruleBlockhashFunction= ruleBlockhashFunction EOF
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
    // InternalOptGrammar.g:4159:1: ruleBlockhashFunction returns [EObject current=null] : (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' ) ;
    public final EObject ruleBlockhashFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameter_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4165:2: ( (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' ) )
            // InternalOptGrammar.g:4166:2: (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            {
            // InternalOptGrammar.g:4166:2: (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            // InternalOptGrammar.g:4167:3: otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockhashFunctionAccess().getBlockhashKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockhashFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:4175:3: ( (lv_parameter_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4176:4: (lv_parameter_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4176:4: (lv_parameter_2_0= ruleIntParameter )
            // InternalOptGrammar.g:4177:5: lv_parameter_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockhashFunctionAccess().getParameterIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:4202:1: entryRuleMathematicalFunction returns [EObject current=null] : iv_ruleMathematicalFunction= ruleMathematicalFunction EOF ;
    public final EObject entryRuleMathematicalFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathematicalFunction = null;


        try {
            // InternalOptGrammar.g:4202:61: (iv_ruleMathematicalFunction= ruleMathematicalFunction EOF )
            // InternalOptGrammar.g:4203:2: iv_ruleMathematicalFunction= ruleMathematicalFunction EOF
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
    // InternalOptGrammar.g:4209:1: ruleMathematicalFunction returns [EObject current=null] : ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' ) ;
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
            // InternalOptGrammar.g:4215:2: ( ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' ) )
            // InternalOptGrammar.g:4216:2: ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' )
            {
            // InternalOptGrammar.g:4216:2: ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' )
            // InternalOptGrammar.g:4217:3: ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')'
            {
            // InternalOptGrammar.g:4217:3: ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) )
            // InternalOptGrammar.g:4218:4: ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) )
            {
            // InternalOptGrammar.g:4218:4: ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) )
            // InternalOptGrammar.g:4219:5: (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' )
            {
            // InternalOptGrammar.g:4219:5: (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==53) ) {
                alt69=1;
            }
            else if ( (LA69_0==54) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalOptGrammar.g:4220:6: lv_function_0_1= 'addmod'
                    {
                    lv_function_0_1=(Token)match(input,53,FOLLOW_9); if (state.failed) return current;
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
                    // InternalOptGrammar.g:4231:6: lv_function_0_2= 'mulmod'
                    {
                    lv_function_0_2=(Token)match(input,54,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMathematicalFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:4248:3: ( (lv_parameters_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4249:4: (lv_parameters_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4249:4: (lv_parameters_2_0= ruleIntParameter )
            // InternalOptGrammar.g:4250:5: lv_parameters_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMathematicalFunctionAccess().getParametersIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            otherlv_3=(Token)match(input,24,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMathematicalFunctionAccess().getCommaKeyword_3());
              		
            }
            // InternalOptGrammar.g:4271:3: ( (lv_parameters_4_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4272:4: (lv_parameters_4_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4272:4: (lv_parameters_4_0= ruleIntParameter )
            // InternalOptGrammar.g:4273:5: lv_parameters_4_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMathematicalFunctionAccess().getParametersIntParameterParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            otherlv_5=(Token)match(input,24,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMathematicalFunctionAccess().getCommaKeyword_5());
              		
            }
            // InternalOptGrammar.g:4294:3: ( (lv_parameters_6_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4295:4: (lv_parameters_6_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4295:4: (lv_parameters_6_0= ruleIntParameter )
            // InternalOptGrammar.g:4296:5: lv_parameters_6_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMathematicalFunctionAccess().getParametersIntParameterParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_7=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:4321:1: entryRuleEcrecoverFunction returns [EObject current=null] : iv_ruleEcrecoverFunction= ruleEcrecoverFunction EOF ;
    public final EObject entryRuleEcrecoverFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEcrecoverFunction = null;


        try {
            // InternalOptGrammar.g:4321:58: (iv_ruleEcrecoverFunction= ruleEcrecoverFunction EOF )
            // InternalOptGrammar.g:4322:2: iv_ruleEcrecoverFunction= ruleEcrecoverFunction EOF
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
    // InternalOptGrammar.g:4328:1: ruleEcrecoverFunction returns [EObject current=null] : ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' ) ;
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
            // InternalOptGrammar.g:4334:2: ( ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' ) )
            // InternalOptGrammar.g:4335:2: ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' )
            {
            // InternalOptGrammar.g:4335:2: ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' )
            // InternalOptGrammar.g:4336:3: ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')'
            {
            // InternalOptGrammar.g:4336:3: ( (lv_function_0_0= 'ecrecover' ) )
            // InternalOptGrammar.g:4337:4: (lv_function_0_0= 'ecrecover' )
            {
            // InternalOptGrammar.g:4337:4: (lv_function_0_0= 'ecrecover' )
            // InternalOptGrammar.g:4338:5: lv_function_0_0= 'ecrecover'
            {
            lv_function_0_0=(Token)match(input,55,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEcrecoverFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:4354:3: ( (lv_parameters_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4355:4: (lv_parameters_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4355:4: (lv_parameters_2_0= ruleIntParameter )
            // InternalOptGrammar.g:4356:5: lv_parameters_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            otherlv_3=(Token)match(input,24,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEcrecoverFunctionAccess().getCommaKeyword_3());
              		
            }
            // InternalOptGrammar.g:4377:3: ( (lv_parameters_4_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4378:4: (lv_parameters_4_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4378:4: (lv_parameters_4_0= ruleIntParameter )
            // InternalOptGrammar.g:4379:5: lv_parameters_4_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            otherlv_5=(Token)match(input,24,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEcrecoverFunctionAccess().getCommaKeyword_5());
              		
            }
            // InternalOptGrammar.g:4400:3: ( (lv_parameters_6_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4401:4: (lv_parameters_6_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4401:4: (lv_parameters_6_0= ruleIntParameter )
            // InternalOptGrammar.g:4402:5: lv_parameters_6_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            otherlv_7=(Token)match(input,24,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEcrecoverFunctionAccess().getCommaKeyword_7());
              		
            }
            // InternalOptGrammar.g:4423:3: ( (lv_parameters_8_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4424:4: (lv_parameters_8_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4424:4: (lv_parameters_8_0= ruleIntParameter )
            // InternalOptGrammar.g:4425:5: lv_parameters_8_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_9=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:4450:1: entryRuleHashFunction returns [EObject current=null] : iv_ruleHashFunction= ruleHashFunction EOF ;
    public final EObject entryRuleHashFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashFunction = null;


        try {
            // InternalOptGrammar.g:4450:53: (iv_ruleHashFunction= ruleHashFunction EOF )
            // InternalOptGrammar.g:4451:2: iv_ruleHashFunction= ruleHashFunction EOF
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
    // InternalOptGrammar.g:4457:1: ruleHashFunction returns [EObject current=null] : ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' ) ;
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
            // InternalOptGrammar.g:4463:2: ( ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' ) )
            // InternalOptGrammar.g:4464:2: ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            {
            // InternalOptGrammar.g:4464:2: ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            // InternalOptGrammar.g:4465:3: ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')'
            {
            // InternalOptGrammar.g:4465:3: ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) )
            // InternalOptGrammar.g:4466:4: ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) )
            {
            // InternalOptGrammar.g:4466:4: ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) )
            // InternalOptGrammar.g:4467:5: (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' )
            {
            // InternalOptGrammar.g:4467:5: (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt70=1;
                }
                break;
            case 57:
                {
                alt70=2;
                }
                break;
            case 58:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalOptGrammar.g:4468:6: lv_name_0_1= 'keccak256'
                    {
                    lv_name_0_1=(Token)match(input,56,FOLLOW_9); if (state.failed) return current;
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
                    // InternalOptGrammar.g:4479:6: lv_name_0_2= 'sha256'
                    {
                    lv_name_0_2=(Token)match(input,57,FOLLOW_9); if (state.failed) return current;
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
                    // InternalOptGrammar.g:4490:6: lv_name_0_3= 'ripemd160'
                    {
                    lv_name_0_3=(Token)match(input,58,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHashFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:4507:3: ( (lv_parameters_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:4508:4: (lv_parameters_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:4508:4: (lv_parameters_2_0= ruleIntParameter )
            // InternalOptGrammar.g:4509:5: lv_parameters_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHashFunctionAccess().getParametersIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:4534:1: entryRuleIntParameter returns [EObject current=null] : iv_ruleIntParameter= ruleIntParameter EOF ;
    public final EObject entryRuleIntParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntParameter = null;


        try {
            // InternalOptGrammar.g:4534:53: (iv_ruleIntParameter= ruleIntParameter EOF )
            // InternalOptGrammar.g:4535:2: iv_ruleIntParameter= ruleIntParameter EOF
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
    // InternalOptGrammar.g:4541:1: ruleIntParameter returns [EObject current=null] : ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) ) ;
    public final EObject ruleIntParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_fun_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4547:2: ( ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) ) )
            // InternalOptGrammar.g:4548:2: ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) )
            {
            // InternalOptGrammar.g:4548:2: ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_INT||(LA71_0>=RULE_HEX && LA71_0<=RULE_DECIMAL)||LA71_0==23||LA71_0==63) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_ID) ) {
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
                    // InternalOptGrammar.g:4549:3: ( (lv_param_0_0= ruleArithmeticOperations ) )
                    {
                    // InternalOptGrammar.g:4549:3: ( (lv_param_0_0= ruleArithmeticOperations ) )
                    // InternalOptGrammar.g:4550:4: (lv_param_0_0= ruleArithmeticOperations )
                    {
                    // InternalOptGrammar.g:4550:4: (lv_param_0_0= ruleArithmeticOperations )
                    // InternalOptGrammar.g:4551:5: lv_param_0_0= ruleArithmeticOperations
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
                    // InternalOptGrammar.g:4569:3: ( (lv_fun_1_0= ruleFunctionCall ) )
                    {
                    // InternalOptGrammar.g:4569:3: ( (lv_fun_1_0= ruleFunctionCall ) )
                    // InternalOptGrammar.g:4570:4: (lv_fun_1_0= ruleFunctionCall )
                    {
                    // InternalOptGrammar.g:4570:4: (lv_fun_1_0= ruleFunctionCall )
                    // InternalOptGrammar.g:4571:5: lv_fun_1_0= ruleFunctionCall
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
    // InternalOptGrammar.g:4592:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalOptGrammar.g:4592:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalOptGrammar.g:4593:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalOptGrammar.g:4599:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalOptGrammar.g:4605:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:4606:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:4606:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:4607:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalOptGrammar.g:4607:3: ( (otherlv_0= RULE_ID ) )
            // InternalOptGrammar.g:4608:4: (otherlv_0= RULE_ID )
            {
            // InternalOptGrammar.g:4608:4: (otherlv_0= RULE_ID )
            // InternalOptGrammar.g:4609:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getNameFunctionDefinitionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:4624:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_INT && LA73_0<=RULE_TX)||(LA73_0>=48 && LA73_0<=49)||(LA73_0>=51 && LA73_0<=58)||LA73_0==63||(LA73_0>=183 && LA73_0<=184)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalOptGrammar.g:4625:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalOptGrammar.g:4625:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalOptGrammar.g:4626:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:4626:5: (lv_parameters_2_0= ruleExpression )
                    // InternalOptGrammar.g:4627:6: lv_parameters_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalOptGrammar.g:4644:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==24) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalOptGrammar.g:4645:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:4649:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalOptGrammar.g:4650:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalOptGrammar.g:4650:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalOptGrammar.g:4651:7: lv_parameters_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop72;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:4678:1: entryRuleArithmeticOperations returns [EObject current=null] : iv_ruleArithmeticOperations= ruleArithmeticOperations EOF ;
    public final EObject entryRuleArithmeticOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticOperations = null;


        try {
            // InternalOptGrammar.g:4678:61: (iv_ruleArithmeticOperations= ruleArithmeticOperations EOF )
            // InternalOptGrammar.g:4679:2: iv_ruleArithmeticOperations= ruleArithmeticOperations EOF
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
    // InternalOptGrammar.g:4685:1: ruleArithmeticOperations returns [EObject current=null] : ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* ) ;
    public final EObject ruleArithmeticOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_first_0_0 = null;

        EObject lv_seconds_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4691:2: ( ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* ) )
            // InternalOptGrammar.g:4692:2: ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* )
            {
            // InternalOptGrammar.g:4692:2: ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* )
            // InternalOptGrammar.g:4693:3: ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )*
            {
            // InternalOptGrammar.g:4693:3: ( (lv_first_0_0= rulePrimaryArithmetic ) )
            // InternalOptGrammar.g:4694:4: (lv_first_0_0= rulePrimaryArithmetic )
            {
            // InternalOptGrammar.g:4694:4: (lv_first_0_0= rulePrimaryArithmetic )
            // InternalOptGrammar.g:4695:5: lv_first_0_0= rulePrimaryArithmetic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArithmeticOperationsAccess().getFirstPrimaryArithmeticParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_52);
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

            // InternalOptGrammar.g:4712:3: ( (lv_seconds_1_0= ruleSecondOperators ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=59 && LA74_0<=62)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalOptGrammar.g:4713:4: (lv_seconds_1_0= ruleSecondOperators )
            	    {
            	    // InternalOptGrammar.g:4713:4: (lv_seconds_1_0= ruleSecondOperators )
            	    // InternalOptGrammar.g:4714:5: lv_seconds_1_0= ruleSecondOperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getArithmeticOperationsAccess().getSecondsSecondOperatorsParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_52);
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
            	    break loop74;
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
    // InternalOptGrammar.g:4735:1: entryRulePrimaryArithmetic returns [EObject current=null] : iv_rulePrimaryArithmetic= rulePrimaryArithmetic EOF ;
    public final EObject entryRulePrimaryArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryArithmetic = null;


        try {
            // InternalOptGrammar.g:4735:58: (iv_rulePrimaryArithmetic= rulePrimaryArithmetic EOF )
            // InternalOptGrammar.g:4736:2: iv_rulePrimaryArithmetic= rulePrimaryArithmetic EOF
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
    // InternalOptGrammar.g:4742:1: rulePrimaryArithmetic returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryArithmetic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_NumericLiteral_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4748:2: ( (this_NumericLiteral_0= ruleNumericLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalOptGrammar.g:4749:2: (this_NumericLiteral_0= ruleNumericLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalOptGrammar.g:4749:2: (this_NumericLiteral_0= ruleNumericLiteral | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_INT||(LA75_0>=RULE_HEX && LA75_0<=RULE_DECIMAL)||LA75_0==63) ) {
                alt75=1;
            }
            else if ( (LA75_0==23) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalOptGrammar.g:4750:3: this_NumericLiteral_0= ruleNumericLiteral
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
                    // InternalOptGrammar.g:4759:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalOptGrammar.g:4759:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalOptGrammar.g:4760:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryArithmeticAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryArithmeticAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:4781:1: entryRuleSecondOperators returns [EObject current=null] : iv_ruleSecondOperators= ruleSecondOperators EOF ;
    public final EObject entryRuleSecondOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondOperators = null;


        try {
            // InternalOptGrammar.g:4781:56: (iv_ruleSecondOperators= ruleSecondOperators EOF )
            // InternalOptGrammar.g:4782:2: iv_ruleSecondOperators= ruleSecondOperators EOF
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
    // InternalOptGrammar.g:4788:1: ruleSecondOperators returns [EObject current=null] : ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) ) ;
    public final EObject ruleSecondOperators() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        Token lv_operator_0_3=null;
        Token lv_operator_0_4=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4794:2: ( ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) ) )
            // InternalOptGrammar.g:4795:2: ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) )
            {
            // InternalOptGrammar.g:4795:2: ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) )
            // InternalOptGrammar.g:4796:3: ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) )
            {
            // InternalOptGrammar.g:4796:3: ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) )
            // InternalOptGrammar.g:4797:4: ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) )
            {
            // InternalOptGrammar.g:4797:4: ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) )
            // InternalOptGrammar.g:4798:5: (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' )
            {
            // InternalOptGrammar.g:4798:5: (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt76=1;
                }
                break;
            case 60:
                {
                alt76=2;
                }
                break;
            case 61:
                {
                alt76=3;
                }
                break;
            case 62:
                {
                alt76=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalOptGrammar.g:4799:6: lv_operator_0_1= '+'
                    {
                    lv_operator_0_1=(Token)match(input,59,FOLLOW_53); if (state.failed) return current;
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
                    // InternalOptGrammar.g:4810:6: lv_operator_0_2= '-'
                    {
                    lv_operator_0_2=(Token)match(input,60,FOLLOW_53); if (state.failed) return current;
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
                    // InternalOptGrammar.g:4821:6: lv_operator_0_3= '/'
                    {
                    lv_operator_0_3=(Token)match(input,61,FOLLOW_53); if (state.failed) return current;
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
                    // InternalOptGrammar.g:4832:6: lv_operator_0_4= '*'
                    {
                    lv_operator_0_4=(Token)match(input,62,FOLLOW_53); if (state.failed) return current;
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

            // InternalOptGrammar.g:4845:3: ( (lv_value_1_0= rulePrimaryArithmetic ) )
            // InternalOptGrammar.g:4846:4: (lv_value_1_0= rulePrimaryArithmetic )
            {
            // InternalOptGrammar.g:4846:4: (lv_value_1_0= rulePrimaryArithmetic )
            // InternalOptGrammar.g:4847:5: lv_value_1_0= rulePrimaryArithmetic
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
    // InternalOptGrammar.g:4868:1: entryRuleBooleanConst returns [EObject current=null] : iv_ruleBooleanConst= ruleBooleanConst EOF ;
    public final EObject entryRuleBooleanConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConst = null;


        try {
            // InternalOptGrammar.g:4868:53: (iv_ruleBooleanConst= ruleBooleanConst EOF )
            // InternalOptGrammar.g:4869:2: iv_ruleBooleanConst= ruleBooleanConst EOF
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
    // InternalOptGrammar.g:4875:1: ruleBooleanConst returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) ;
    public final EObject ruleBooleanConst() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4881:2: ( ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) )
            // InternalOptGrammar.g:4882:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            {
            // InternalOptGrammar.g:4882:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            // InternalOptGrammar.g:4883:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            {
            // InternalOptGrammar.g:4883:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            // InternalOptGrammar.g:4884:4: lv_value_0_0= ruleBooleanLiteralEnum
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
    // InternalOptGrammar.g:4904:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalOptGrammar.g:4904:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalOptGrammar.g:4905:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalOptGrammar.g:4911:1: ruleNumericLiteral returns [EObject current=null] : ( ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_intValue_0_0 = null;

        EObject lv_hexValue_1_0 = null;

        EObject lv_decimalValue_2_0 = null;

        EObject lv_now_3_0 = null;

        EObject lv_etherUnit_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4917:2: ( ( ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? ) )
            // InternalOptGrammar.g:4918:2: ( ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? )
            {
            // InternalOptGrammar.g:4918:2: ( ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? )
            // InternalOptGrammar.g:4919:3: ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )?
            {
            // InternalOptGrammar.g:4919:3: ( ( (lv_intValue_0_0= ruleNumberDimensionless ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) | ( (lv_now_3_0= ruleNow ) ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt77=1;
                }
                break;
            case RULE_HEX:
                {
                alt77=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt77=3;
                }
                break;
            case 63:
                {
                alt77=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalOptGrammar.g:4920:4: ( (lv_intValue_0_0= ruleNumberDimensionless ) )
                    {
                    // InternalOptGrammar.g:4920:4: ( (lv_intValue_0_0= ruleNumberDimensionless ) )
                    // InternalOptGrammar.g:4921:5: (lv_intValue_0_0= ruleNumberDimensionless )
                    {
                    // InternalOptGrammar.g:4921:5: (lv_intValue_0_0= ruleNumberDimensionless )
                    // InternalOptGrammar.g:4922:6: lv_intValue_0_0= ruleNumberDimensionless
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getIntValueNumberDimensionlessParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
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
                    // InternalOptGrammar.g:4940:4: ( (lv_hexValue_1_0= ruleHexLiteral ) )
                    {
                    // InternalOptGrammar.g:4940:4: ( (lv_hexValue_1_0= ruleHexLiteral ) )
                    // InternalOptGrammar.g:4941:5: (lv_hexValue_1_0= ruleHexLiteral )
                    {
                    // InternalOptGrammar.g:4941:5: (lv_hexValue_1_0= ruleHexLiteral )
                    // InternalOptGrammar.g:4942:6: lv_hexValue_1_0= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getHexValueHexLiteralParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
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
                    // InternalOptGrammar.g:4960:4: ( (lv_decimalValue_2_0= ruleDecimalLiteral ) )
                    {
                    // InternalOptGrammar.g:4960:4: ( (lv_decimalValue_2_0= ruleDecimalLiteral ) )
                    // InternalOptGrammar.g:4961:5: (lv_decimalValue_2_0= ruleDecimalLiteral )
                    {
                    // InternalOptGrammar.g:4961:5: (lv_decimalValue_2_0= ruleDecimalLiteral )
                    // InternalOptGrammar.g:4962:6: lv_decimalValue_2_0= ruleDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getDecimalValueDecimalLiteralParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
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
                    // InternalOptGrammar.g:4980:4: ( (lv_now_3_0= ruleNow ) )
                    {
                    // InternalOptGrammar.g:4980:4: ( (lv_now_3_0= ruleNow ) )
                    // InternalOptGrammar.g:4981:5: (lv_now_3_0= ruleNow )
                    {
                    // InternalOptGrammar.g:4981:5: (lv_now_3_0= ruleNow )
                    // InternalOptGrammar.g:4982:6: lv_now_3_0= ruleNow
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getNowNowParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
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

            // InternalOptGrammar.g:5000:3: ( (lv_etherUnit_4_0= ruleUnitTypes ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_INT) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalOptGrammar.g:5001:4: (lv_etherUnit_4_0= ruleUnitTypes )
                    {
                    // InternalOptGrammar.g:5001:4: (lv_etherUnit_4_0= ruleUnitTypes )
                    // InternalOptGrammar.g:5002:5: lv_etherUnit_4_0= ruleUnitTypes
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
    // InternalOptGrammar.g:5023:1: entryRuleNow returns [EObject current=null] : iv_ruleNow= ruleNow EOF ;
    public final EObject entryRuleNow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNow = null;


        try {
            // InternalOptGrammar.g:5023:44: (iv_ruleNow= ruleNow EOF )
            // InternalOptGrammar.g:5024:2: iv_ruleNow= ruleNow EOF
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
    // InternalOptGrammar.g:5030:1: ruleNow returns [EObject current=null] : ( () otherlv_1= 'now' ) ;
    public final EObject ruleNow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5036:2: ( ( () otherlv_1= 'now' ) )
            // InternalOptGrammar.g:5037:2: ( () otherlv_1= 'now' )
            {
            // InternalOptGrammar.g:5037:2: ( () otherlv_1= 'now' )
            // InternalOptGrammar.g:5038:3: () otherlv_1= 'now'
            {
            // InternalOptGrammar.g:5038:3: ()
            // InternalOptGrammar.g:5039:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNowAccess().getNowAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:5053:1: entryRuleUnitTypes returns [EObject current=null] : iv_ruleUnitTypes= ruleUnitTypes EOF ;
    public final EObject entryRuleUnitTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitTypes = null;


        try {
            // InternalOptGrammar.g:5053:50: (iv_ruleUnitTypes= ruleUnitTypes EOF )
            // InternalOptGrammar.g:5054:2: iv_ruleUnitTypes= ruleUnitTypes EOF
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
    // InternalOptGrammar.g:5060:1: ruleUnitTypes returns [EObject current=null] : ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) ) ;
    public final EObject ruleUnitTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_time_0_0 = null;

        EObject lv_units_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5066:2: ( ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) ) )
            // InternalOptGrammar.g:5067:2: ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) )
            {
            // InternalOptGrammar.g:5067:2: ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_INT) ) {
                int LA79_1 = input.LA(2);

                if ( ((LA79_1>=189 && LA79_1<=194)) ) {
                    alt79=1;
                }
                else if ( ((LA79_1>=185 && LA79_1<=188)) ) {
                    alt79=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalOptGrammar.g:5068:3: ( (lv_time_0_0= ruleTime ) )
                    {
                    // InternalOptGrammar.g:5068:3: ( (lv_time_0_0= ruleTime ) )
                    // InternalOptGrammar.g:5069:4: (lv_time_0_0= ruleTime )
                    {
                    // InternalOptGrammar.g:5069:4: (lv_time_0_0= ruleTime )
                    // InternalOptGrammar.g:5070:5: lv_time_0_0= ruleTime
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
                    // InternalOptGrammar.g:5088:3: ( (lv_units_1_0= ruleEther ) )
                    {
                    // InternalOptGrammar.g:5088:3: ( (lv_units_1_0= ruleEther ) )
                    // InternalOptGrammar.g:5089:4: (lv_units_1_0= ruleEther )
                    {
                    // InternalOptGrammar.g:5089:4: (lv_units_1_0= ruleEther )
                    // InternalOptGrammar.g:5090:5: lv_units_1_0= ruleEther
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
    // InternalOptGrammar.g:5111:1: entryRuleNumberDimensionless returns [EObject current=null] : iv_ruleNumberDimensionless= ruleNumberDimensionless EOF ;
    public final EObject entryRuleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberDimensionless = null;


        try {
            // InternalOptGrammar.g:5111:60: (iv_ruleNumberDimensionless= ruleNumberDimensionless EOF )
            // InternalOptGrammar.g:5112:2: iv_ruleNumberDimensionless= ruleNumberDimensionless EOF
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
    // InternalOptGrammar.g:5118:1: ruleNumberDimensionless returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5124:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalOptGrammar.g:5125:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalOptGrammar.g:5125:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalOptGrammar.g:5126:3: (lv_value_0_0= RULE_INT )
            {
            // InternalOptGrammar.g:5126:3: (lv_value_0_0= RULE_INT )
            // InternalOptGrammar.g:5127:4: lv_value_0_0= RULE_INT
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
    // InternalOptGrammar.g:5146:1: entryRuleEther returns [EObject current=null] : iv_ruleEther= ruleEther EOF ;
    public final EObject entryRuleEther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEther = null;


        try {
            // InternalOptGrammar.g:5146:46: (iv_ruleEther= ruleEther EOF )
            // InternalOptGrammar.g:5147:2: iv_ruleEther= ruleEther EOF
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
    // InternalOptGrammar.g:5153:1: ruleEther returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) ;
    public final EObject ruleEther() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_ether_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5159:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) )
            // InternalOptGrammar.g:5160:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            {
            // InternalOptGrammar.g:5160:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            // InternalOptGrammar.g:5161:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            {
            // InternalOptGrammar.g:5161:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalOptGrammar.g:5162:4: (lv_value_0_0= RULE_INT )
            {
            // InternalOptGrammar.g:5162:4: (lv_value_0_0= RULE_INT )
            // InternalOptGrammar.g:5163:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_55); if (state.failed) return current;
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

            // InternalOptGrammar.g:5179:3: ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            // InternalOptGrammar.g:5180:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            {
            // InternalOptGrammar.g:5180:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            // InternalOptGrammar.g:5181:5: lv_ether_1_0= ruleEtherSubDenominationEnum
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
    // InternalOptGrammar.g:5202:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalOptGrammar.g:5202:45: (iv_ruleTime= ruleTime EOF )
            // InternalOptGrammar.g:5203:2: iv_ruleTime= ruleTime EOF
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
    // InternalOptGrammar.g:5209:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_time_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5215:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) )
            // InternalOptGrammar.g:5216:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            {
            // InternalOptGrammar.g:5216:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            // InternalOptGrammar.g:5217:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            {
            // InternalOptGrammar.g:5217:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalOptGrammar.g:5218:4: (lv_value_0_0= RULE_INT )
            {
            // InternalOptGrammar.g:5218:4: (lv_value_0_0= RULE_INT )
            // InternalOptGrammar.g:5219:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_56); if (state.failed) return current;
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

            // InternalOptGrammar.g:5235:3: ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            // InternalOptGrammar.g:5236:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            {
            // InternalOptGrammar.g:5236:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            // InternalOptGrammar.g:5237:5: lv_time_1_0= ruleTimeSubdenominationEnum
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
    // InternalOptGrammar.g:5258:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalOptGrammar.g:5258:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalOptGrammar.g:5259:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalOptGrammar.g:5265:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5271:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalOptGrammar.g:5272:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalOptGrammar.g:5272:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalOptGrammar.g:5273:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalOptGrammar.g:5273:3: (lv_value_0_0= RULE_STRING )
            // InternalOptGrammar.g:5274:4: lv_value_0_0= RULE_STRING
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
    // InternalOptGrammar.g:5293:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // InternalOptGrammar.g:5293:51: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // InternalOptGrammar.g:5294:2: iv_ruleHexLiteral= ruleHexLiteral EOF
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
    // InternalOptGrammar.g:5300:1: ruleHexLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_HEX ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5306:2: ( ( (lv_value_0_0= RULE_HEX ) ) )
            // InternalOptGrammar.g:5307:2: ( (lv_value_0_0= RULE_HEX ) )
            {
            // InternalOptGrammar.g:5307:2: ( (lv_value_0_0= RULE_HEX ) )
            // InternalOptGrammar.g:5308:3: (lv_value_0_0= RULE_HEX )
            {
            // InternalOptGrammar.g:5308:3: (lv_value_0_0= RULE_HEX )
            // InternalOptGrammar.g:5309:4: lv_value_0_0= RULE_HEX
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
    // InternalOptGrammar.g:5328:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalOptGrammar.g:5328:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalOptGrammar.g:5329:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalOptGrammar.g:5335:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5341:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalOptGrammar.g:5342:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalOptGrammar.g:5342:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalOptGrammar.g:5343:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalOptGrammar.g:5343:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalOptGrammar.g:5344:4: lv_value_0_0= RULE_DECIMAL
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
    // InternalOptGrammar.g:5363:1: entryRuleSpecialVariables returns [EObject current=null] : iv_ruleSpecialVariables= ruleSpecialVariables EOF ;
    public final EObject entryRuleSpecialVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariables = null;


        try {
            // InternalOptGrammar.g:5363:57: (iv_ruleSpecialVariables= ruleSpecialVariables EOF )
            // InternalOptGrammar.g:5364:2: iv_ruleSpecialVariables= ruleSpecialVariables EOF
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
    // InternalOptGrammar.g:5370:1: ruleSpecialVariables returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) ;
    public final EObject ruleSpecialVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_field_2_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_qualifiers_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5376:2: ( ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) )
            // InternalOptGrammar.g:5377:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            {
            // InternalOptGrammar.g:5377:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            // InternalOptGrammar.g:5378:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )*
            {
            // InternalOptGrammar.g:5378:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) )
            // InternalOptGrammar.g:5379:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            {
            // InternalOptGrammar.g:5379:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            // InternalOptGrammar.g:5380:5: lv_type_0_0= ruleSpecialVariablesTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getTypeSpecialVariablesTypeEnumParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_57);
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

            otherlv_1=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpecialVariablesAccess().getFullStopKeyword_1());
              		
            }
            // InternalOptGrammar.g:5401:3: ( (lv_field_2_0= RULE_ID ) )
            // InternalOptGrammar.g:5402:4: (lv_field_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:5402:4: (lv_field_2_0= RULE_ID )
            // InternalOptGrammar.g:5403:5: lv_field_2_0= RULE_ID
            {
            lv_field_2_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            // InternalOptGrammar.g:5419:3: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==23||LA80_0==34||LA80_0==37) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalOptGrammar.g:5420:4: (lv_qualifiers_3_0= ruleQualifier )
            	    {
            	    // InternalOptGrammar.g:5420:4: (lv_qualifiers_3_0= ruleQualifier )
            	    // InternalOptGrammar.g:5421:5: lv_qualifiers_3_0= ruleQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getQualifiersQualifierParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleSpecialVariables"


    // $ANTLR start "entryRuleElementaryTypeNameEnum"
    // InternalOptGrammar.g:5442:1: entryRuleElementaryTypeNameEnum returns [EObject current=null] : iv_ruleElementaryTypeNameEnum= ruleElementaryTypeNameEnum EOF ;
    public final EObject entryRuleElementaryTypeNameEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryTypeNameEnum = null;


        try {
            // InternalOptGrammar.g:5442:63: (iv_ruleElementaryTypeNameEnum= ruleElementaryTypeNameEnum EOF )
            // InternalOptGrammar.g:5443:2: iv_ruleElementaryTypeNameEnum= ruleElementaryTypeNameEnum EOF
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
    // InternalOptGrammar.g:5449:1: ruleElementaryTypeNameEnum returns [EObject current=null] : ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' | lv_type_0_33= 'uint' | lv_type_0_34= 'uint8' | lv_type_0_35= 'uint16' | lv_type_0_36= 'uint24' | lv_type_0_37= 'uint32' | lv_type_0_38= 'uint40' | lv_type_0_39= 'uint48' | lv_type_0_40= 'uint56' | lv_type_0_41= 'uint64' | lv_type_0_42= 'uint72' | lv_type_0_43= 'uint80' | lv_type_0_44= 'uint88' | lv_type_0_45= 'uint96' | lv_type_0_46= 'uint104' | lv_type_0_47= 'uint112' | lv_type_0_48= 'uint120' | lv_type_0_49= 'uint128' | lv_type_0_50= 'uint136' | lv_type_0_51= 'uint144' | lv_type_0_52= 'uint152' | lv_type_0_53= 'uint160' | lv_type_0_54= 'uint168' | lv_type_0_55= 'uint178' | lv_type_0_56= 'uint184' | lv_type_0_57= 'uint192' | lv_type_0_58= 'uint200' | lv_type_0_59= 'uint208' | lv_type_0_60= 'uint216' | lv_type_0_61= 'uint224' | lv_type_0_62= 'uint232' | lv_type_0_63= 'uint240' | lv_type_0_64= 'uint248' | lv_type_0_65= 'uint256' | lv_type_0_66= 'byte' | lv_type_0_67= 'bytes' | lv_type_0_68= 'bytes1' | lv_type_0_69= 'bytes2' | lv_type_0_70= 'bytes3' | lv_type_0_71= 'bytes4' | lv_type_0_72= 'bytes5' | lv_type_0_73= 'bytes6' | lv_type_0_74= 'bytes7' | lv_type_0_75= 'bytes8' | lv_type_0_76= 'bytes9' | lv_type_0_77= 'bytes10' | lv_type_0_78= 'bytes11' | lv_type_0_79= 'bytes12' | lv_type_0_80= 'bytes13' | lv_type_0_81= 'bytes14' | lv_type_0_82= 'bytes15' | lv_type_0_83= 'bytes16' | lv_type_0_84= 'bytes17' | lv_type_0_85= 'bytes18' | lv_type_0_86= 'bytes19' | lv_type_0_87= 'bytes20' | lv_type_0_88= 'bytes21' | lv_type_0_89= 'bytes22' | lv_type_0_90= 'bytes23' | lv_type_0_91= 'bytes24' | lv_type_0_92= 'bytes25' | lv_type_0_93= 'bytes26' | lv_type_0_94= 'bytes27' | lv_type_0_95= 'bytes28' | lv_type_0_96= 'bytes29' | lv_type_0_97= 'bytes30' | lv_type_0_98= 'bytes31' | lv_type_0_99= 'bytes32' | lv_type_0_100= 'string' | lv_type_0_101= 'address' | lv_type_0_102= 'bool' | lv_type_0_103= 'real' | lv_type_0_104= 'ureal' ) ) ) ;
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
        Token lv_type_0_33=null;
        Token lv_type_0_34=null;
        Token lv_type_0_35=null;
        Token lv_type_0_36=null;
        Token lv_type_0_37=null;
        Token lv_type_0_38=null;
        Token lv_type_0_39=null;
        Token lv_type_0_40=null;
        Token lv_type_0_41=null;
        Token lv_type_0_42=null;
        Token lv_type_0_43=null;
        Token lv_type_0_44=null;
        Token lv_type_0_45=null;
        Token lv_type_0_46=null;
        Token lv_type_0_47=null;
        Token lv_type_0_48=null;
        Token lv_type_0_49=null;
        Token lv_type_0_50=null;
        Token lv_type_0_51=null;
        Token lv_type_0_52=null;
        Token lv_type_0_53=null;
        Token lv_type_0_54=null;
        Token lv_type_0_55=null;
        Token lv_type_0_56=null;
        Token lv_type_0_57=null;
        Token lv_type_0_58=null;
        Token lv_type_0_59=null;
        Token lv_type_0_60=null;
        Token lv_type_0_61=null;
        Token lv_type_0_62=null;
        Token lv_type_0_63=null;
        Token lv_type_0_64=null;
        Token lv_type_0_65=null;
        Token lv_type_0_66=null;
        Token lv_type_0_67=null;
        Token lv_type_0_68=null;
        Token lv_type_0_69=null;
        Token lv_type_0_70=null;
        Token lv_type_0_71=null;
        Token lv_type_0_72=null;
        Token lv_type_0_73=null;
        Token lv_type_0_74=null;
        Token lv_type_0_75=null;
        Token lv_type_0_76=null;
        Token lv_type_0_77=null;
        Token lv_type_0_78=null;
        Token lv_type_0_79=null;
        Token lv_type_0_80=null;
        Token lv_type_0_81=null;
        Token lv_type_0_82=null;
        Token lv_type_0_83=null;
        Token lv_type_0_84=null;
        Token lv_type_0_85=null;
        Token lv_type_0_86=null;
        Token lv_type_0_87=null;
        Token lv_type_0_88=null;
        Token lv_type_0_89=null;
        Token lv_type_0_90=null;
        Token lv_type_0_91=null;
        Token lv_type_0_92=null;
        Token lv_type_0_93=null;
        Token lv_type_0_94=null;
        Token lv_type_0_95=null;
        Token lv_type_0_96=null;
        Token lv_type_0_97=null;
        Token lv_type_0_98=null;
        Token lv_type_0_99=null;
        Token lv_type_0_100=null;
        Token lv_type_0_101=null;
        Token lv_type_0_102=null;
        Token lv_type_0_103=null;
        Token lv_type_0_104=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5455:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' | lv_type_0_33= 'uint' | lv_type_0_34= 'uint8' | lv_type_0_35= 'uint16' | lv_type_0_36= 'uint24' | lv_type_0_37= 'uint32' | lv_type_0_38= 'uint40' | lv_type_0_39= 'uint48' | lv_type_0_40= 'uint56' | lv_type_0_41= 'uint64' | lv_type_0_42= 'uint72' | lv_type_0_43= 'uint80' | lv_type_0_44= 'uint88' | lv_type_0_45= 'uint96' | lv_type_0_46= 'uint104' | lv_type_0_47= 'uint112' | lv_type_0_48= 'uint120' | lv_type_0_49= 'uint128' | lv_type_0_50= 'uint136' | lv_type_0_51= 'uint144' | lv_type_0_52= 'uint152' | lv_type_0_53= 'uint160' | lv_type_0_54= 'uint168' | lv_type_0_55= 'uint178' | lv_type_0_56= 'uint184' | lv_type_0_57= 'uint192' | lv_type_0_58= 'uint200' | lv_type_0_59= 'uint208' | lv_type_0_60= 'uint216' | lv_type_0_61= 'uint224' | lv_type_0_62= 'uint232' | lv_type_0_63= 'uint240' | lv_type_0_64= 'uint248' | lv_type_0_65= 'uint256' | lv_type_0_66= 'byte' | lv_type_0_67= 'bytes' | lv_type_0_68= 'bytes1' | lv_type_0_69= 'bytes2' | lv_type_0_70= 'bytes3' | lv_type_0_71= 'bytes4' | lv_type_0_72= 'bytes5' | lv_type_0_73= 'bytes6' | lv_type_0_74= 'bytes7' | lv_type_0_75= 'bytes8' | lv_type_0_76= 'bytes9' | lv_type_0_77= 'bytes10' | lv_type_0_78= 'bytes11' | lv_type_0_79= 'bytes12' | lv_type_0_80= 'bytes13' | lv_type_0_81= 'bytes14' | lv_type_0_82= 'bytes15' | lv_type_0_83= 'bytes16' | lv_type_0_84= 'bytes17' | lv_type_0_85= 'bytes18' | lv_type_0_86= 'bytes19' | lv_type_0_87= 'bytes20' | lv_type_0_88= 'bytes21' | lv_type_0_89= 'bytes22' | lv_type_0_90= 'bytes23' | lv_type_0_91= 'bytes24' | lv_type_0_92= 'bytes25' | lv_type_0_93= 'bytes26' | lv_type_0_94= 'bytes27' | lv_type_0_95= 'bytes28' | lv_type_0_96= 'bytes29' | lv_type_0_97= 'bytes30' | lv_type_0_98= 'bytes31' | lv_type_0_99= 'bytes32' | lv_type_0_100= 'string' | lv_type_0_101= 'address' | lv_type_0_102= 'bool' | lv_type_0_103= 'real' | lv_type_0_104= 'ureal' ) ) ) )
            // InternalOptGrammar.g:5456:2: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' | lv_type_0_33= 'uint' | lv_type_0_34= 'uint8' | lv_type_0_35= 'uint16' | lv_type_0_36= 'uint24' | lv_type_0_37= 'uint32' | lv_type_0_38= 'uint40' | lv_type_0_39= 'uint48' | lv_type_0_40= 'uint56' | lv_type_0_41= 'uint64' | lv_type_0_42= 'uint72' | lv_type_0_43= 'uint80' | lv_type_0_44= 'uint88' | lv_type_0_45= 'uint96' | lv_type_0_46= 'uint104' | lv_type_0_47= 'uint112' | lv_type_0_48= 'uint120' | lv_type_0_49= 'uint128' | lv_type_0_50= 'uint136' | lv_type_0_51= 'uint144' | lv_type_0_52= 'uint152' | lv_type_0_53= 'uint160' | lv_type_0_54= 'uint168' | lv_type_0_55= 'uint178' | lv_type_0_56= 'uint184' | lv_type_0_57= 'uint192' | lv_type_0_58= 'uint200' | lv_type_0_59= 'uint208' | lv_type_0_60= 'uint216' | lv_type_0_61= 'uint224' | lv_type_0_62= 'uint232' | lv_type_0_63= 'uint240' | lv_type_0_64= 'uint248' | lv_type_0_65= 'uint256' | lv_type_0_66= 'byte' | lv_type_0_67= 'bytes' | lv_type_0_68= 'bytes1' | lv_type_0_69= 'bytes2' | lv_type_0_70= 'bytes3' | lv_type_0_71= 'bytes4' | lv_type_0_72= 'bytes5' | lv_type_0_73= 'bytes6' | lv_type_0_74= 'bytes7' | lv_type_0_75= 'bytes8' | lv_type_0_76= 'bytes9' | lv_type_0_77= 'bytes10' | lv_type_0_78= 'bytes11' | lv_type_0_79= 'bytes12' | lv_type_0_80= 'bytes13' | lv_type_0_81= 'bytes14' | lv_type_0_82= 'bytes15' | lv_type_0_83= 'bytes16' | lv_type_0_84= 'bytes17' | lv_type_0_85= 'bytes18' | lv_type_0_86= 'bytes19' | lv_type_0_87= 'bytes20' | lv_type_0_88= 'bytes21' | lv_type_0_89= 'bytes22' | lv_type_0_90= 'bytes23' | lv_type_0_91= 'bytes24' | lv_type_0_92= 'bytes25' | lv_type_0_93= 'bytes26' | lv_type_0_94= 'bytes27' | lv_type_0_95= 'bytes28' | lv_type_0_96= 'bytes29' | lv_type_0_97= 'bytes30' | lv_type_0_98= 'bytes31' | lv_type_0_99= 'bytes32' | lv_type_0_100= 'string' | lv_type_0_101= 'address' | lv_type_0_102= 'bool' | lv_type_0_103= 'real' | lv_type_0_104= 'ureal' ) ) )
            {
            // InternalOptGrammar.g:5456:2: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' | lv_type_0_33= 'uint' | lv_type_0_34= 'uint8' | lv_type_0_35= 'uint16' | lv_type_0_36= 'uint24' | lv_type_0_37= 'uint32' | lv_type_0_38= 'uint40' | lv_type_0_39= 'uint48' | lv_type_0_40= 'uint56' | lv_type_0_41= 'uint64' | lv_type_0_42= 'uint72' | lv_type_0_43= 'uint80' | lv_type_0_44= 'uint88' | lv_type_0_45= 'uint96' | lv_type_0_46= 'uint104' | lv_type_0_47= 'uint112' | lv_type_0_48= 'uint120' | lv_type_0_49= 'uint128' | lv_type_0_50= 'uint136' | lv_type_0_51= 'uint144' | lv_type_0_52= 'uint152' | lv_type_0_53= 'uint160' | lv_type_0_54= 'uint168' | lv_type_0_55= 'uint178' | lv_type_0_56= 'uint184' | lv_type_0_57= 'uint192' | lv_type_0_58= 'uint200' | lv_type_0_59= 'uint208' | lv_type_0_60= 'uint216' | lv_type_0_61= 'uint224' | lv_type_0_62= 'uint232' | lv_type_0_63= 'uint240' | lv_type_0_64= 'uint248' | lv_type_0_65= 'uint256' | lv_type_0_66= 'byte' | lv_type_0_67= 'bytes' | lv_type_0_68= 'bytes1' | lv_type_0_69= 'bytes2' | lv_type_0_70= 'bytes3' | lv_type_0_71= 'bytes4' | lv_type_0_72= 'bytes5' | lv_type_0_73= 'bytes6' | lv_type_0_74= 'bytes7' | lv_type_0_75= 'bytes8' | lv_type_0_76= 'bytes9' | lv_type_0_77= 'bytes10' | lv_type_0_78= 'bytes11' | lv_type_0_79= 'bytes12' | lv_type_0_80= 'bytes13' | lv_type_0_81= 'bytes14' | lv_type_0_82= 'bytes15' | lv_type_0_83= 'bytes16' | lv_type_0_84= 'bytes17' | lv_type_0_85= 'bytes18' | lv_type_0_86= 'bytes19' | lv_type_0_87= 'bytes20' | lv_type_0_88= 'bytes21' | lv_type_0_89= 'bytes22' | lv_type_0_90= 'bytes23' | lv_type_0_91= 'bytes24' | lv_type_0_92= 'bytes25' | lv_type_0_93= 'bytes26' | lv_type_0_94= 'bytes27' | lv_type_0_95= 'bytes28' | lv_type_0_96= 'bytes29' | lv_type_0_97= 'bytes30' | lv_type_0_98= 'bytes31' | lv_type_0_99= 'bytes32' | lv_type_0_100= 'string' | lv_type_0_101= 'address' | lv_type_0_102= 'bool' | lv_type_0_103= 'real' | lv_type_0_104= 'ureal' ) ) )
            // InternalOptGrammar.g:5457:3: ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' | lv_type_0_33= 'uint' | lv_type_0_34= 'uint8' | lv_type_0_35= 'uint16' | lv_type_0_36= 'uint24' | lv_type_0_37= 'uint32' | lv_type_0_38= 'uint40' | lv_type_0_39= 'uint48' | lv_type_0_40= 'uint56' | lv_type_0_41= 'uint64' | lv_type_0_42= 'uint72' | lv_type_0_43= 'uint80' | lv_type_0_44= 'uint88' | lv_type_0_45= 'uint96' | lv_type_0_46= 'uint104' | lv_type_0_47= 'uint112' | lv_type_0_48= 'uint120' | lv_type_0_49= 'uint128' | lv_type_0_50= 'uint136' | lv_type_0_51= 'uint144' | lv_type_0_52= 'uint152' | lv_type_0_53= 'uint160' | lv_type_0_54= 'uint168' | lv_type_0_55= 'uint178' | lv_type_0_56= 'uint184' | lv_type_0_57= 'uint192' | lv_type_0_58= 'uint200' | lv_type_0_59= 'uint208' | lv_type_0_60= 'uint216' | lv_type_0_61= 'uint224' | lv_type_0_62= 'uint232' | lv_type_0_63= 'uint240' | lv_type_0_64= 'uint248' | lv_type_0_65= 'uint256' | lv_type_0_66= 'byte' | lv_type_0_67= 'bytes' | lv_type_0_68= 'bytes1' | lv_type_0_69= 'bytes2' | lv_type_0_70= 'bytes3' | lv_type_0_71= 'bytes4' | lv_type_0_72= 'bytes5' | lv_type_0_73= 'bytes6' | lv_type_0_74= 'bytes7' | lv_type_0_75= 'bytes8' | lv_type_0_76= 'bytes9' | lv_type_0_77= 'bytes10' | lv_type_0_78= 'bytes11' | lv_type_0_79= 'bytes12' | lv_type_0_80= 'bytes13' | lv_type_0_81= 'bytes14' | lv_type_0_82= 'bytes15' | lv_type_0_83= 'bytes16' | lv_type_0_84= 'bytes17' | lv_type_0_85= 'bytes18' | lv_type_0_86= 'bytes19' | lv_type_0_87= 'bytes20' | lv_type_0_88= 'bytes21' | lv_type_0_89= 'bytes22' | lv_type_0_90= 'bytes23' | lv_type_0_91= 'bytes24' | lv_type_0_92= 'bytes25' | lv_type_0_93= 'bytes26' | lv_type_0_94= 'bytes27' | lv_type_0_95= 'bytes28' | lv_type_0_96= 'bytes29' | lv_type_0_97= 'bytes30' | lv_type_0_98= 'bytes31' | lv_type_0_99= 'bytes32' | lv_type_0_100= 'string' | lv_type_0_101= 'address' | lv_type_0_102= 'bool' | lv_type_0_103= 'real' | lv_type_0_104= 'ureal' ) )
            {
            // InternalOptGrammar.g:5457:3: ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' | lv_type_0_33= 'uint' | lv_type_0_34= 'uint8' | lv_type_0_35= 'uint16' | lv_type_0_36= 'uint24' | lv_type_0_37= 'uint32' | lv_type_0_38= 'uint40' | lv_type_0_39= 'uint48' | lv_type_0_40= 'uint56' | lv_type_0_41= 'uint64' | lv_type_0_42= 'uint72' | lv_type_0_43= 'uint80' | lv_type_0_44= 'uint88' | lv_type_0_45= 'uint96' | lv_type_0_46= 'uint104' | lv_type_0_47= 'uint112' | lv_type_0_48= 'uint120' | lv_type_0_49= 'uint128' | lv_type_0_50= 'uint136' | lv_type_0_51= 'uint144' | lv_type_0_52= 'uint152' | lv_type_0_53= 'uint160' | lv_type_0_54= 'uint168' | lv_type_0_55= 'uint178' | lv_type_0_56= 'uint184' | lv_type_0_57= 'uint192' | lv_type_0_58= 'uint200' | lv_type_0_59= 'uint208' | lv_type_0_60= 'uint216' | lv_type_0_61= 'uint224' | lv_type_0_62= 'uint232' | lv_type_0_63= 'uint240' | lv_type_0_64= 'uint248' | lv_type_0_65= 'uint256' | lv_type_0_66= 'byte' | lv_type_0_67= 'bytes' | lv_type_0_68= 'bytes1' | lv_type_0_69= 'bytes2' | lv_type_0_70= 'bytes3' | lv_type_0_71= 'bytes4' | lv_type_0_72= 'bytes5' | lv_type_0_73= 'bytes6' | lv_type_0_74= 'bytes7' | lv_type_0_75= 'bytes8' | lv_type_0_76= 'bytes9' | lv_type_0_77= 'bytes10' | lv_type_0_78= 'bytes11' | lv_type_0_79= 'bytes12' | lv_type_0_80= 'bytes13' | lv_type_0_81= 'bytes14' | lv_type_0_82= 'bytes15' | lv_type_0_83= 'bytes16' | lv_type_0_84= 'bytes17' | lv_type_0_85= 'bytes18' | lv_type_0_86= 'bytes19' | lv_type_0_87= 'bytes20' | lv_type_0_88= 'bytes21' | lv_type_0_89= 'bytes22' | lv_type_0_90= 'bytes23' | lv_type_0_91= 'bytes24' | lv_type_0_92= 'bytes25' | lv_type_0_93= 'bytes26' | lv_type_0_94= 'bytes27' | lv_type_0_95= 'bytes28' | lv_type_0_96= 'bytes29' | lv_type_0_97= 'bytes30' | lv_type_0_98= 'bytes31' | lv_type_0_99= 'bytes32' | lv_type_0_100= 'string' | lv_type_0_101= 'address' | lv_type_0_102= 'bool' | lv_type_0_103= 'real' | lv_type_0_104= 'ureal' ) )
            // InternalOptGrammar.g:5458:4: (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' | lv_type_0_33= 'uint' | lv_type_0_34= 'uint8' | lv_type_0_35= 'uint16' | lv_type_0_36= 'uint24' | lv_type_0_37= 'uint32' | lv_type_0_38= 'uint40' | lv_type_0_39= 'uint48' | lv_type_0_40= 'uint56' | lv_type_0_41= 'uint64' | lv_type_0_42= 'uint72' | lv_type_0_43= 'uint80' | lv_type_0_44= 'uint88' | lv_type_0_45= 'uint96' | lv_type_0_46= 'uint104' | lv_type_0_47= 'uint112' | lv_type_0_48= 'uint120' | lv_type_0_49= 'uint128' | lv_type_0_50= 'uint136' | lv_type_0_51= 'uint144' | lv_type_0_52= 'uint152' | lv_type_0_53= 'uint160' | lv_type_0_54= 'uint168' | lv_type_0_55= 'uint178' | lv_type_0_56= 'uint184' | lv_type_0_57= 'uint192' | lv_type_0_58= 'uint200' | lv_type_0_59= 'uint208' | lv_type_0_60= 'uint216' | lv_type_0_61= 'uint224' | lv_type_0_62= 'uint232' | lv_type_0_63= 'uint240' | lv_type_0_64= 'uint248' | lv_type_0_65= 'uint256' | lv_type_0_66= 'byte' | lv_type_0_67= 'bytes' | lv_type_0_68= 'bytes1' | lv_type_0_69= 'bytes2' | lv_type_0_70= 'bytes3' | lv_type_0_71= 'bytes4' | lv_type_0_72= 'bytes5' | lv_type_0_73= 'bytes6' | lv_type_0_74= 'bytes7' | lv_type_0_75= 'bytes8' | lv_type_0_76= 'bytes9' | lv_type_0_77= 'bytes10' | lv_type_0_78= 'bytes11' | lv_type_0_79= 'bytes12' | lv_type_0_80= 'bytes13' | lv_type_0_81= 'bytes14' | lv_type_0_82= 'bytes15' | lv_type_0_83= 'bytes16' | lv_type_0_84= 'bytes17' | lv_type_0_85= 'bytes18' | lv_type_0_86= 'bytes19' | lv_type_0_87= 'bytes20' | lv_type_0_88= 'bytes21' | lv_type_0_89= 'bytes22' | lv_type_0_90= 'bytes23' | lv_type_0_91= 'bytes24' | lv_type_0_92= 'bytes25' | lv_type_0_93= 'bytes26' | lv_type_0_94= 'bytes27' | lv_type_0_95= 'bytes28' | lv_type_0_96= 'bytes29' | lv_type_0_97= 'bytes30' | lv_type_0_98= 'bytes31' | lv_type_0_99= 'bytes32' | lv_type_0_100= 'string' | lv_type_0_101= 'address' | lv_type_0_102= 'bool' | lv_type_0_103= 'real' | lv_type_0_104= 'ureal' )
            {
            // InternalOptGrammar.g:5458:4: (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' | lv_type_0_33= 'uint' | lv_type_0_34= 'uint8' | lv_type_0_35= 'uint16' | lv_type_0_36= 'uint24' | lv_type_0_37= 'uint32' | lv_type_0_38= 'uint40' | lv_type_0_39= 'uint48' | lv_type_0_40= 'uint56' | lv_type_0_41= 'uint64' | lv_type_0_42= 'uint72' | lv_type_0_43= 'uint80' | lv_type_0_44= 'uint88' | lv_type_0_45= 'uint96' | lv_type_0_46= 'uint104' | lv_type_0_47= 'uint112' | lv_type_0_48= 'uint120' | lv_type_0_49= 'uint128' | lv_type_0_50= 'uint136' | lv_type_0_51= 'uint144' | lv_type_0_52= 'uint152' | lv_type_0_53= 'uint160' | lv_type_0_54= 'uint168' | lv_type_0_55= 'uint178' | lv_type_0_56= 'uint184' | lv_type_0_57= 'uint192' | lv_type_0_58= 'uint200' | lv_type_0_59= 'uint208' | lv_type_0_60= 'uint216' | lv_type_0_61= 'uint224' | lv_type_0_62= 'uint232' | lv_type_0_63= 'uint240' | lv_type_0_64= 'uint248' | lv_type_0_65= 'uint256' | lv_type_0_66= 'byte' | lv_type_0_67= 'bytes' | lv_type_0_68= 'bytes1' | lv_type_0_69= 'bytes2' | lv_type_0_70= 'bytes3' | lv_type_0_71= 'bytes4' | lv_type_0_72= 'bytes5' | lv_type_0_73= 'bytes6' | lv_type_0_74= 'bytes7' | lv_type_0_75= 'bytes8' | lv_type_0_76= 'bytes9' | lv_type_0_77= 'bytes10' | lv_type_0_78= 'bytes11' | lv_type_0_79= 'bytes12' | lv_type_0_80= 'bytes13' | lv_type_0_81= 'bytes14' | lv_type_0_82= 'bytes15' | lv_type_0_83= 'bytes16' | lv_type_0_84= 'bytes17' | lv_type_0_85= 'bytes18' | lv_type_0_86= 'bytes19' | lv_type_0_87= 'bytes20' | lv_type_0_88= 'bytes21' | lv_type_0_89= 'bytes22' | lv_type_0_90= 'bytes23' | lv_type_0_91= 'bytes24' | lv_type_0_92= 'bytes25' | lv_type_0_93= 'bytes26' | lv_type_0_94= 'bytes27' | lv_type_0_95= 'bytes28' | lv_type_0_96= 'bytes29' | lv_type_0_97= 'bytes30' | lv_type_0_98= 'bytes31' | lv_type_0_99= 'bytes32' | lv_type_0_100= 'string' | lv_type_0_101= 'address' | lv_type_0_102= 'bool' | lv_type_0_103= 'real' | lv_type_0_104= 'ureal' )
            int alt81=104;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt81=1;
                }
                break;
            case 65:
                {
                alt81=2;
                }
                break;
            case 66:
                {
                alt81=3;
                }
                break;
            case 67:
                {
                alt81=4;
                }
                break;
            case 68:
                {
                alt81=5;
                }
                break;
            case 69:
                {
                alt81=6;
                }
                break;
            case 70:
                {
                alt81=7;
                }
                break;
            case 71:
                {
                alt81=8;
                }
                break;
            case 72:
                {
                alt81=9;
                }
                break;
            case 73:
                {
                alt81=10;
                }
                break;
            case 74:
                {
                alt81=11;
                }
                break;
            case 75:
                {
                alt81=12;
                }
                break;
            case 76:
                {
                alt81=13;
                }
                break;
            case 77:
                {
                alt81=14;
                }
                break;
            case 78:
                {
                alt81=15;
                }
                break;
            case 79:
                {
                alt81=16;
                }
                break;
            case 80:
                {
                alt81=17;
                }
                break;
            case 81:
                {
                alt81=18;
                }
                break;
            case 82:
                {
                alt81=19;
                }
                break;
            case 83:
                {
                alt81=20;
                }
                break;
            case 84:
                {
                alt81=21;
                }
                break;
            case 85:
                {
                alt81=22;
                }
                break;
            case 86:
                {
                alt81=23;
                }
                break;
            case 87:
                {
                alt81=24;
                }
                break;
            case 88:
                {
                alt81=25;
                }
                break;
            case 89:
                {
                alt81=26;
                }
                break;
            case 90:
                {
                alt81=27;
                }
                break;
            case 91:
                {
                alt81=28;
                }
                break;
            case 92:
                {
                alt81=29;
                }
                break;
            case 93:
                {
                alt81=30;
                }
                break;
            case 94:
                {
                alt81=31;
                }
                break;
            case 95:
                {
                alt81=32;
                }
                break;
            case 96:
                {
                alt81=33;
                }
                break;
            case 97:
                {
                alt81=34;
                }
                break;
            case 98:
                {
                alt81=35;
                }
                break;
            case 99:
                {
                alt81=36;
                }
                break;
            case 100:
                {
                alt81=37;
                }
                break;
            case 101:
                {
                alt81=38;
                }
                break;
            case 102:
                {
                alt81=39;
                }
                break;
            case 103:
                {
                alt81=40;
                }
                break;
            case 104:
                {
                alt81=41;
                }
                break;
            case 105:
                {
                alt81=42;
                }
                break;
            case 106:
                {
                alt81=43;
                }
                break;
            case 107:
                {
                alt81=44;
                }
                break;
            case 108:
                {
                alt81=45;
                }
                break;
            case 109:
                {
                alt81=46;
                }
                break;
            case 110:
                {
                alt81=47;
                }
                break;
            case 111:
                {
                alt81=48;
                }
                break;
            case 112:
                {
                alt81=49;
                }
                break;
            case 113:
                {
                alt81=50;
                }
                break;
            case 114:
                {
                alt81=51;
                }
                break;
            case 115:
                {
                alt81=52;
                }
                break;
            case 116:
                {
                alt81=53;
                }
                break;
            case 117:
                {
                alt81=54;
                }
                break;
            case 118:
                {
                alt81=55;
                }
                break;
            case 119:
                {
                alt81=56;
                }
                break;
            case 120:
                {
                alt81=57;
                }
                break;
            case 121:
                {
                alt81=58;
                }
                break;
            case 122:
                {
                alt81=59;
                }
                break;
            case 123:
                {
                alt81=60;
                }
                break;
            case 124:
                {
                alt81=61;
                }
                break;
            case 125:
                {
                alt81=62;
                }
                break;
            case 126:
                {
                alt81=63;
                }
                break;
            case 127:
                {
                alt81=64;
                }
                break;
            case 128:
                {
                alt81=65;
                }
                break;
            case 129:
                {
                alt81=66;
                }
                break;
            case 130:
                {
                alt81=67;
                }
                break;
            case 131:
                {
                alt81=68;
                }
                break;
            case 132:
                {
                alt81=69;
                }
                break;
            case 133:
                {
                alt81=70;
                }
                break;
            case 134:
                {
                alt81=71;
                }
                break;
            case 135:
                {
                alt81=72;
                }
                break;
            case 136:
                {
                alt81=73;
                }
                break;
            case 137:
                {
                alt81=74;
                }
                break;
            case 138:
                {
                alt81=75;
                }
                break;
            case 139:
                {
                alt81=76;
                }
                break;
            case 140:
                {
                alt81=77;
                }
                break;
            case 141:
                {
                alt81=78;
                }
                break;
            case 142:
                {
                alt81=79;
                }
                break;
            case 143:
                {
                alt81=80;
                }
                break;
            case 144:
                {
                alt81=81;
                }
                break;
            case 145:
                {
                alt81=82;
                }
                break;
            case 146:
                {
                alt81=83;
                }
                break;
            case 147:
                {
                alt81=84;
                }
                break;
            case 148:
                {
                alt81=85;
                }
                break;
            case 149:
                {
                alt81=86;
                }
                break;
            case 150:
                {
                alt81=87;
                }
                break;
            case 151:
                {
                alt81=88;
                }
                break;
            case 152:
                {
                alt81=89;
                }
                break;
            case 153:
                {
                alt81=90;
                }
                break;
            case 154:
                {
                alt81=91;
                }
                break;
            case 155:
                {
                alt81=92;
                }
                break;
            case 156:
                {
                alt81=93;
                }
                break;
            case 157:
                {
                alt81=94;
                }
                break;
            case 158:
                {
                alt81=95;
                }
                break;
            case 159:
                {
                alt81=96;
                }
                break;
            case 160:
                {
                alt81=97;
                }
                break;
            case 161:
                {
                alt81=98;
                }
                break;
            case 162:
                {
                alt81=99;
                }
                break;
            case 163:
                {
                alt81=100;
                }
                break;
            case 164:
                {
                alt81=101;
                }
                break;
            case 165:
                {
                alt81=102;
                }
                break;
            case 166:
                {
                alt81=103;
                }
                break;
            case 167:
                {
                alt81=104;
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
                    // InternalOptGrammar.g:5459:5: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_1, grammarAccess.getElementaryTypeNameEnumAccess().getTypeIntKeyword_0_0());
                      				
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
                    // InternalOptGrammar.g:5470:5: lv_type_0_2= 'int16'
                    {
                    lv_type_0_2=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_2, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt16Keyword_0_1());
                      				
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
                    // InternalOptGrammar.g:5481:5: lv_type_0_3= 'int24'
                    {
                    lv_type_0_3=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_3, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt24Keyword_0_2());
                      				
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
                    // InternalOptGrammar.g:5492:5: lv_type_0_4= 'int32'
                    {
                    lv_type_0_4=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_4, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt32Keyword_0_3());
                      				
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
                    // InternalOptGrammar.g:5503:5: lv_type_0_5= 'int40'
                    {
                    lv_type_0_5=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_5, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt40Keyword_0_4());
                      				
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
                    // InternalOptGrammar.g:5514:5: lv_type_0_6= 'int48'
                    {
                    lv_type_0_6=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_6, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt48Keyword_0_5());
                      				
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
                    // InternalOptGrammar.g:5525:5: lv_type_0_7= 'int56'
                    {
                    lv_type_0_7=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_7, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt56Keyword_0_6());
                      				
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
                    // InternalOptGrammar.g:5536:5: lv_type_0_8= 'int64'
                    {
                    lv_type_0_8=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_8, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt64Keyword_0_7());
                      				
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
                    // InternalOptGrammar.g:5547:5: lv_type_0_9= 'int72'
                    {
                    lv_type_0_9=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_9, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt72Keyword_0_8());
                      				
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
                    // InternalOptGrammar.g:5558:5: lv_type_0_10= 'int80'
                    {
                    lv_type_0_10=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_10, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt80Keyword_0_9());
                      				
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
                    // InternalOptGrammar.g:5569:5: lv_type_0_11= 'int88'
                    {
                    lv_type_0_11=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_11, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt88Keyword_0_10());
                      				
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
                    // InternalOptGrammar.g:5580:5: lv_type_0_12= 'int96'
                    {
                    lv_type_0_12=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_12, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt96Keyword_0_11());
                      				
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
                    // InternalOptGrammar.g:5591:5: lv_type_0_13= 'int104'
                    {
                    lv_type_0_13=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_13, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt104Keyword_0_12());
                      				
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
                    // InternalOptGrammar.g:5602:5: lv_type_0_14= 'int112'
                    {
                    lv_type_0_14=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_14, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt112Keyword_0_13());
                      				
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
                    // InternalOptGrammar.g:5613:5: lv_type_0_15= 'int120'
                    {
                    lv_type_0_15=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_15, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt120Keyword_0_14());
                      				
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
                    // InternalOptGrammar.g:5624:5: lv_type_0_16= 'int128'
                    {
                    lv_type_0_16=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_16, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt128Keyword_0_15());
                      				
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
                    // InternalOptGrammar.g:5635:5: lv_type_0_17= 'int136'
                    {
                    lv_type_0_17=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_17, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt136Keyword_0_16());
                      				
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
                    // InternalOptGrammar.g:5646:5: lv_type_0_18= 'int144'
                    {
                    lv_type_0_18=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_18, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt144Keyword_0_17());
                      				
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
                    // InternalOptGrammar.g:5657:5: lv_type_0_19= 'int152'
                    {
                    lv_type_0_19=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_19, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt152Keyword_0_18());
                      				
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
                    // InternalOptGrammar.g:5668:5: lv_type_0_20= 'int160'
                    {
                    lv_type_0_20=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_20, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt160Keyword_0_19());
                      				
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
                    // InternalOptGrammar.g:5679:5: lv_type_0_21= 'int168'
                    {
                    lv_type_0_21=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_21, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt168Keyword_0_20());
                      				
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
                    // InternalOptGrammar.g:5690:5: lv_type_0_22= 'int178'
                    {
                    lv_type_0_22=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_22, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt178Keyword_0_21());
                      				
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
                    // InternalOptGrammar.g:5701:5: lv_type_0_23= 'int184'
                    {
                    lv_type_0_23=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_23, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt184Keyword_0_22());
                      				
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
                    // InternalOptGrammar.g:5712:5: lv_type_0_24= 'int192'
                    {
                    lv_type_0_24=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_24, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt192Keyword_0_23());
                      				
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
                    // InternalOptGrammar.g:5723:5: lv_type_0_25= 'int200'
                    {
                    lv_type_0_25=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_25, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt200Keyword_0_24());
                      				
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
                    // InternalOptGrammar.g:5734:5: lv_type_0_26= 'int208'
                    {
                    lv_type_0_26=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_26, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt208Keyword_0_25());
                      				
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
                    // InternalOptGrammar.g:5745:5: lv_type_0_27= 'int216'
                    {
                    lv_type_0_27=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_27, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt216Keyword_0_26());
                      				
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
                    // InternalOptGrammar.g:5756:5: lv_type_0_28= 'int224'
                    {
                    lv_type_0_28=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_28, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt224Keyword_0_27());
                      				
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
                    // InternalOptGrammar.g:5767:5: lv_type_0_29= 'int232'
                    {
                    lv_type_0_29=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_29, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt232Keyword_0_28());
                      				
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
                    // InternalOptGrammar.g:5778:5: lv_type_0_30= 'int240'
                    {
                    lv_type_0_30=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_30, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt240Keyword_0_29());
                      				
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
                    // InternalOptGrammar.g:5789:5: lv_type_0_31= 'int248'
                    {
                    lv_type_0_31=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_31, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt248Keyword_0_30());
                      				
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
                    // InternalOptGrammar.g:5800:5: lv_type_0_32= 'int256'
                    {
                    lv_type_0_32=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_32, grammarAccess.getElementaryTypeNameEnumAccess().getTypeInt256Keyword_0_31());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_32, null);
                      				
                    }

                    }
                    break;
                case 33 :
                    // InternalOptGrammar.g:5811:5: lv_type_0_33= 'uint'
                    {
                    lv_type_0_33=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_33, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUintKeyword_0_32());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_33, null);
                      				
                    }

                    }
                    break;
                case 34 :
                    // InternalOptGrammar.g:5822:5: lv_type_0_34= 'uint8'
                    {
                    lv_type_0_34=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_34, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint8Keyword_0_33());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_34, null);
                      				
                    }

                    }
                    break;
                case 35 :
                    // InternalOptGrammar.g:5833:5: lv_type_0_35= 'uint16'
                    {
                    lv_type_0_35=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_35, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint16Keyword_0_34());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_35, null);
                      				
                    }

                    }
                    break;
                case 36 :
                    // InternalOptGrammar.g:5844:5: lv_type_0_36= 'uint24'
                    {
                    lv_type_0_36=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_36, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint24Keyword_0_35());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_36, null);
                      				
                    }

                    }
                    break;
                case 37 :
                    // InternalOptGrammar.g:5855:5: lv_type_0_37= 'uint32'
                    {
                    lv_type_0_37=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_37, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint32Keyword_0_36());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_37, null);
                      				
                    }

                    }
                    break;
                case 38 :
                    // InternalOptGrammar.g:5866:5: lv_type_0_38= 'uint40'
                    {
                    lv_type_0_38=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_38, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint40Keyword_0_37());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_38, null);
                      				
                    }

                    }
                    break;
                case 39 :
                    // InternalOptGrammar.g:5877:5: lv_type_0_39= 'uint48'
                    {
                    lv_type_0_39=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_39, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint48Keyword_0_38());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_39, null);
                      				
                    }

                    }
                    break;
                case 40 :
                    // InternalOptGrammar.g:5888:5: lv_type_0_40= 'uint56'
                    {
                    lv_type_0_40=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_40, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint56Keyword_0_39());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_40, null);
                      				
                    }

                    }
                    break;
                case 41 :
                    // InternalOptGrammar.g:5899:5: lv_type_0_41= 'uint64'
                    {
                    lv_type_0_41=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_41, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint64Keyword_0_40());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_41, null);
                      				
                    }

                    }
                    break;
                case 42 :
                    // InternalOptGrammar.g:5910:5: lv_type_0_42= 'uint72'
                    {
                    lv_type_0_42=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_42, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint72Keyword_0_41());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_42, null);
                      				
                    }

                    }
                    break;
                case 43 :
                    // InternalOptGrammar.g:5921:5: lv_type_0_43= 'uint80'
                    {
                    lv_type_0_43=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_43, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint80Keyword_0_42());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_43, null);
                      				
                    }

                    }
                    break;
                case 44 :
                    // InternalOptGrammar.g:5932:5: lv_type_0_44= 'uint88'
                    {
                    lv_type_0_44=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_44, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint88Keyword_0_43());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_44, null);
                      				
                    }

                    }
                    break;
                case 45 :
                    // InternalOptGrammar.g:5943:5: lv_type_0_45= 'uint96'
                    {
                    lv_type_0_45=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_45, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint96Keyword_0_44());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_45, null);
                      				
                    }

                    }
                    break;
                case 46 :
                    // InternalOptGrammar.g:5954:5: lv_type_0_46= 'uint104'
                    {
                    lv_type_0_46=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_46, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint104Keyword_0_45());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_46, null);
                      				
                    }

                    }
                    break;
                case 47 :
                    // InternalOptGrammar.g:5965:5: lv_type_0_47= 'uint112'
                    {
                    lv_type_0_47=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_47, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint112Keyword_0_46());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_47, null);
                      				
                    }

                    }
                    break;
                case 48 :
                    // InternalOptGrammar.g:5976:5: lv_type_0_48= 'uint120'
                    {
                    lv_type_0_48=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_48, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint120Keyword_0_47());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_48, null);
                      				
                    }

                    }
                    break;
                case 49 :
                    // InternalOptGrammar.g:5987:5: lv_type_0_49= 'uint128'
                    {
                    lv_type_0_49=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_49, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint128Keyword_0_48());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_49, null);
                      				
                    }

                    }
                    break;
                case 50 :
                    // InternalOptGrammar.g:5998:5: lv_type_0_50= 'uint136'
                    {
                    lv_type_0_50=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_50, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint136Keyword_0_49());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_50, null);
                      				
                    }

                    }
                    break;
                case 51 :
                    // InternalOptGrammar.g:6009:5: lv_type_0_51= 'uint144'
                    {
                    lv_type_0_51=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_51, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint144Keyword_0_50());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_51, null);
                      				
                    }

                    }
                    break;
                case 52 :
                    // InternalOptGrammar.g:6020:5: lv_type_0_52= 'uint152'
                    {
                    lv_type_0_52=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_52, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint152Keyword_0_51());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_52, null);
                      				
                    }

                    }
                    break;
                case 53 :
                    // InternalOptGrammar.g:6031:5: lv_type_0_53= 'uint160'
                    {
                    lv_type_0_53=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_53, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint160Keyword_0_52());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_53, null);
                      				
                    }

                    }
                    break;
                case 54 :
                    // InternalOptGrammar.g:6042:5: lv_type_0_54= 'uint168'
                    {
                    lv_type_0_54=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_54, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint168Keyword_0_53());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_54, null);
                      				
                    }

                    }
                    break;
                case 55 :
                    // InternalOptGrammar.g:6053:5: lv_type_0_55= 'uint178'
                    {
                    lv_type_0_55=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_55, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint178Keyword_0_54());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_55, null);
                      				
                    }

                    }
                    break;
                case 56 :
                    // InternalOptGrammar.g:6064:5: lv_type_0_56= 'uint184'
                    {
                    lv_type_0_56=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_56, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint184Keyword_0_55());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_56, null);
                      				
                    }

                    }
                    break;
                case 57 :
                    // InternalOptGrammar.g:6075:5: lv_type_0_57= 'uint192'
                    {
                    lv_type_0_57=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_57, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint192Keyword_0_56());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_57, null);
                      				
                    }

                    }
                    break;
                case 58 :
                    // InternalOptGrammar.g:6086:5: lv_type_0_58= 'uint200'
                    {
                    lv_type_0_58=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_58, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint200Keyword_0_57());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_58, null);
                      				
                    }

                    }
                    break;
                case 59 :
                    // InternalOptGrammar.g:6097:5: lv_type_0_59= 'uint208'
                    {
                    lv_type_0_59=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_59, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint208Keyword_0_58());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_59, null);
                      				
                    }

                    }
                    break;
                case 60 :
                    // InternalOptGrammar.g:6108:5: lv_type_0_60= 'uint216'
                    {
                    lv_type_0_60=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_60, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint216Keyword_0_59());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_60, null);
                      				
                    }

                    }
                    break;
                case 61 :
                    // InternalOptGrammar.g:6119:5: lv_type_0_61= 'uint224'
                    {
                    lv_type_0_61=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_61, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint224Keyword_0_60());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_61, null);
                      				
                    }

                    }
                    break;
                case 62 :
                    // InternalOptGrammar.g:6130:5: lv_type_0_62= 'uint232'
                    {
                    lv_type_0_62=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_62, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint232Keyword_0_61());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_62, null);
                      				
                    }

                    }
                    break;
                case 63 :
                    // InternalOptGrammar.g:6141:5: lv_type_0_63= 'uint240'
                    {
                    lv_type_0_63=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_63, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint240Keyword_0_62());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_63, null);
                      				
                    }

                    }
                    break;
                case 64 :
                    // InternalOptGrammar.g:6152:5: lv_type_0_64= 'uint248'
                    {
                    lv_type_0_64=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_64, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint248Keyword_0_63());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_64, null);
                      				
                    }

                    }
                    break;
                case 65 :
                    // InternalOptGrammar.g:6163:5: lv_type_0_65= 'uint256'
                    {
                    lv_type_0_65=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_65, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUint256Keyword_0_64());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_65, null);
                      				
                    }

                    }
                    break;
                case 66 :
                    // InternalOptGrammar.g:6174:5: lv_type_0_66= 'byte'
                    {
                    lv_type_0_66=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_66, grammarAccess.getElementaryTypeNameEnumAccess().getTypeByteKeyword_0_65());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_66, null);
                      				
                    }

                    }
                    break;
                case 67 :
                    // InternalOptGrammar.g:6185:5: lv_type_0_67= 'bytes'
                    {
                    lv_type_0_67=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_67, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytesKeyword_0_66());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_67, null);
                      				
                    }

                    }
                    break;
                case 68 :
                    // InternalOptGrammar.g:6196:5: lv_type_0_68= 'bytes1'
                    {
                    lv_type_0_68=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_68, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes1Keyword_0_67());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_68, null);
                      				
                    }

                    }
                    break;
                case 69 :
                    // InternalOptGrammar.g:6207:5: lv_type_0_69= 'bytes2'
                    {
                    lv_type_0_69=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_69, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes2Keyword_0_68());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_69, null);
                      				
                    }

                    }
                    break;
                case 70 :
                    // InternalOptGrammar.g:6218:5: lv_type_0_70= 'bytes3'
                    {
                    lv_type_0_70=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_70, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes3Keyword_0_69());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_70, null);
                      				
                    }

                    }
                    break;
                case 71 :
                    // InternalOptGrammar.g:6229:5: lv_type_0_71= 'bytes4'
                    {
                    lv_type_0_71=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_71, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes4Keyword_0_70());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_71, null);
                      				
                    }

                    }
                    break;
                case 72 :
                    // InternalOptGrammar.g:6240:5: lv_type_0_72= 'bytes5'
                    {
                    lv_type_0_72=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_72, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes5Keyword_0_71());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_72, null);
                      				
                    }

                    }
                    break;
                case 73 :
                    // InternalOptGrammar.g:6251:5: lv_type_0_73= 'bytes6'
                    {
                    lv_type_0_73=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_73, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes6Keyword_0_72());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_73, null);
                      				
                    }

                    }
                    break;
                case 74 :
                    // InternalOptGrammar.g:6262:5: lv_type_0_74= 'bytes7'
                    {
                    lv_type_0_74=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_74, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes7Keyword_0_73());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_74, null);
                      				
                    }

                    }
                    break;
                case 75 :
                    // InternalOptGrammar.g:6273:5: lv_type_0_75= 'bytes8'
                    {
                    lv_type_0_75=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_75, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes8Keyword_0_74());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_75, null);
                      				
                    }

                    }
                    break;
                case 76 :
                    // InternalOptGrammar.g:6284:5: lv_type_0_76= 'bytes9'
                    {
                    lv_type_0_76=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_76, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes9Keyword_0_75());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_76, null);
                      				
                    }

                    }
                    break;
                case 77 :
                    // InternalOptGrammar.g:6295:5: lv_type_0_77= 'bytes10'
                    {
                    lv_type_0_77=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_77, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes10Keyword_0_76());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_77, null);
                      				
                    }

                    }
                    break;
                case 78 :
                    // InternalOptGrammar.g:6306:5: lv_type_0_78= 'bytes11'
                    {
                    lv_type_0_78=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_78, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes11Keyword_0_77());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_78, null);
                      				
                    }

                    }
                    break;
                case 79 :
                    // InternalOptGrammar.g:6317:5: lv_type_0_79= 'bytes12'
                    {
                    lv_type_0_79=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_79, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes12Keyword_0_78());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_79, null);
                      				
                    }

                    }
                    break;
                case 80 :
                    // InternalOptGrammar.g:6328:5: lv_type_0_80= 'bytes13'
                    {
                    lv_type_0_80=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_80, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes13Keyword_0_79());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_80, null);
                      				
                    }

                    }
                    break;
                case 81 :
                    // InternalOptGrammar.g:6339:5: lv_type_0_81= 'bytes14'
                    {
                    lv_type_0_81=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_81, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes14Keyword_0_80());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_81, null);
                      				
                    }

                    }
                    break;
                case 82 :
                    // InternalOptGrammar.g:6350:5: lv_type_0_82= 'bytes15'
                    {
                    lv_type_0_82=(Token)match(input,145,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_82, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes15Keyword_0_81());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_82, null);
                      				
                    }

                    }
                    break;
                case 83 :
                    // InternalOptGrammar.g:6361:5: lv_type_0_83= 'bytes16'
                    {
                    lv_type_0_83=(Token)match(input,146,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_83, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes16Keyword_0_82());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_83, null);
                      				
                    }

                    }
                    break;
                case 84 :
                    // InternalOptGrammar.g:6372:5: lv_type_0_84= 'bytes17'
                    {
                    lv_type_0_84=(Token)match(input,147,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_84, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes17Keyword_0_83());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_84, null);
                      				
                    }

                    }
                    break;
                case 85 :
                    // InternalOptGrammar.g:6383:5: lv_type_0_85= 'bytes18'
                    {
                    lv_type_0_85=(Token)match(input,148,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_85, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes18Keyword_0_84());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_85, null);
                      				
                    }

                    }
                    break;
                case 86 :
                    // InternalOptGrammar.g:6394:5: lv_type_0_86= 'bytes19'
                    {
                    lv_type_0_86=(Token)match(input,149,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_86, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes19Keyword_0_85());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_86, null);
                      				
                    }

                    }
                    break;
                case 87 :
                    // InternalOptGrammar.g:6405:5: lv_type_0_87= 'bytes20'
                    {
                    lv_type_0_87=(Token)match(input,150,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_87, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes20Keyword_0_86());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_87, null);
                      				
                    }

                    }
                    break;
                case 88 :
                    // InternalOptGrammar.g:6416:5: lv_type_0_88= 'bytes21'
                    {
                    lv_type_0_88=(Token)match(input,151,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_88, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes21Keyword_0_87());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_88, null);
                      				
                    }

                    }
                    break;
                case 89 :
                    // InternalOptGrammar.g:6427:5: lv_type_0_89= 'bytes22'
                    {
                    lv_type_0_89=(Token)match(input,152,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_89, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes22Keyword_0_88());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_89, null);
                      				
                    }

                    }
                    break;
                case 90 :
                    // InternalOptGrammar.g:6438:5: lv_type_0_90= 'bytes23'
                    {
                    lv_type_0_90=(Token)match(input,153,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_90, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes23Keyword_0_89());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_90, null);
                      				
                    }

                    }
                    break;
                case 91 :
                    // InternalOptGrammar.g:6449:5: lv_type_0_91= 'bytes24'
                    {
                    lv_type_0_91=(Token)match(input,154,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_91, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes24Keyword_0_90());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_91, null);
                      				
                    }

                    }
                    break;
                case 92 :
                    // InternalOptGrammar.g:6460:5: lv_type_0_92= 'bytes25'
                    {
                    lv_type_0_92=(Token)match(input,155,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_92, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes25Keyword_0_91());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_92, null);
                      				
                    }

                    }
                    break;
                case 93 :
                    // InternalOptGrammar.g:6471:5: lv_type_0_93= 'bytes26'
                    {
                    lv_type_0_93=(Token)match(input,156,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_93, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes26Keyword_0_92());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_93, null);
                      				
                    }

                    }
                    break;
                case 94 :
                    // InternalOptGrammar.g:6482:5: lv_type_0_94= 'bytes27'
                    {
                    lv_type_0_94=(Token)match(input,157,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_94, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes27Keyword_0_93());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_94, null);
                      				
                    }

                    }
                    break;
                case 95 :
                    // InternalOptGrammar.g:6493:5: lv_type_0_95= 'bytes28'
                    {
                    lv_type_0_95=(Token)match(input,158,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_95, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes28Keyword_0_94());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_95, null);
                      				
                    }

                    }
                    break;
                case 96 :
                    // InternalOptGrammar.g:6504:5: lv_type_0_96= 'bytes29'
                    {
                    lv_type_0_96=(Token)match(input,159,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_96, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes29Keyword_0_95());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_96, null);
                      				
                    }

                    }
                    break;
                case 97 :
                    // InternalOptGrammar.g:6515:5: lv_type_0_97= 'bytes30'
                    {
                    lv_type_0_97=(Token)match(input,160,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_97, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes30Keyword_0_96());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_97, null);
                      				
                    }

                    }
                    break;
                case 98 :
                    // InternalOptGrammar.g:6526:5: lv_type_0_98= 'bytes31'
                    {
                    lv_type_0_98=(Token)match(input,161,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_98, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes31Keyword_0_97());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_98, null);
                      				
                    }

                    }
                    break;
                case 99 :
                    // InternalOptGrammar.g:6537:5: lv_type_0_99= 'bytes32'
                    {
                    lv_type_0_99=(Token)match(input,162,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_99, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes32Keyword_0_98());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_99, null);
                      				
                    }

                    }
                    break;
                case 100 :
                    // InternalOptGrammar.g:6548:5: lv_type_0_100= 'string'
                    {
                    lv_type_0_100=(Token)match(input,163,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_100, grammarAccess.getElementaryTypeNameEnumAccess().getTypeStringKeyword_0_99());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_100, null);
                      				
                    }

                    }
                    break;
                case 101 :
                    // InternalOptGrammar.g:6559:5: lv_type_0_101= 'address'
                    {
                    lv_type_0_101=(Token)match(input,164,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_101, grammarAccess.getElementaryTypeNameEnumAccess().getTypeAddressKeyword_0_100());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_101, null);
                      				
                    }

                    }
                    break;
                case 102 :
                    // InternalOptGrammar.g:6570:5: lv_type_0_102= 'bool'
                    {
                    lv_type_0_102=(Token)match(input,165,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_102, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBoolKeyword_0_101());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_102, null);
                      				
                    }

                    }
                    break;
                case 103 :
                    // InternalOptGrammar.g:6581:5: lv_type_0_103= 'real'
                    {
                    lv_type_0_103=(Token)match(input,166,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_103, grammarAccess.getElementaryTypeNameEnumAccess().getTypeRealKeyword_0_102());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_103, null);
                      				
                    }

                    }
                    break;
                case 104 :
                    // InternalOptGrammar.g:6592:5: lv_type_0_104= 'ureal'
                    {
                    lv_type_0_104=(Token)match(input,167,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_104, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUrealKeyword_0_103());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_104, null);
                      				
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
    // $ANTLR end "ruleElementaryTypeNameEnum"


    // $ANTLR start "entryRuleMapLocationLiteral"
    // InternalOptGrammar.g:6608:1: entryRuleMapLocationLiteral returns [String current=null] : iv_ruleMapLocationLiteral= ruleMapLocationLiteral EOF ;
    public final String entryRuleMapLocationLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMapLocationLiteral = null;


        try {
            // InternalOptGrammar.g:6608:58: (iv_ruleMapLocationLiteral= ruleMapLocationLiteral EOF )
            // InternalOptGrammar.g:6609:2: iv_ruleMapLocationLiteral= ruleMapLocationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLocationLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapLocationLiteral=ruleMapLocationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLocationLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapLocationLiteral"


    // $ANTLR start "ruleMapLocationLiteral"
    // InternalOptGrammar.g:6615:1: ruleMapLocationLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'storage' ;
    public final AntlrDatatypeRuleToken ruleMapLocationLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6621:2: (kw= 'storage' )
            // InternalOptGrammar.g:6622:2: kw= 'storage'
            {
            kw=(Token)match(input,168,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getMapLocationLiteralAccess().getStorageKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapLocationLiteral"


    // $ANTLR start "entryRuleLocationSpecifierEnum"
    // InternalOptGrammar.g:6630:1: entryRuleLocationSpecifierEnum returns [EObject current=null] : iv_ruleLocationSpecifierEnum= ruleLocationSpecifierEnum EOF ;
    public final EObject entryRuleLocationSpecifierEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifierEnum = null;


        try {
            // InternalOptGrammar.g:6630:62: (iv_ruleLocationSpecifierEnum= ruleLocationSpecifierEnum EOF )
            // InternalOptGrammar.g:6631:2: iv_ruleLocationSpecifierEnum= ruleLocationSpecifierEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationSpecifierEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocationSpecifierEnum=ruleLocationSpecifierEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationSpecifierEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationSpecifierEnum"


    // $ANTLR start "ruleLocationSpecifierEnum"
    // InternalOptGrammar.g:6637:1: ruleLocationSpecifierEnum returns [EObject current=null] : ( ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) ) ) ;
    public final EObject ruleLocationSpecifierEnum() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_3=null;
        AntlrDatatypeRuleToken lv_type_0_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6643:2: ( ( ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) ) ) )
            // InternalOptGrammar.g:6644:2: ( ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) ) )
            {
            // InternalOptGrammar.g:6644:2: ( ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) ) )
            // InternalOptGrammar.g:6645:3: ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) )
            {
            // InternalOptGrammar.g:6645:3: ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) )
            // InternalOptGrammar.g:6646:4: (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' )
            {
            // InternalOptGrammar.g:6646:4: (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' )
            int alt82=3;
            switch ( input.LA(1) ) {
            case 169:
                {
                alt82=1;
                }
                break;
            case 168:
                {
                alt82=2;
                }
                break;
            case 170:
                {
                alt82=3;
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
                    // InternalOptGrammar.g:6647:5: lv_type_0_1= 'memory'
                    {
                    lv_type_0_1=(Token)match(input,169,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_1, grammarAccess.getLocationSpecifierEnumAccess().getTypeMemoryKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLocationSpecifierEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:6658:5: lv_type_0_2= ruleMapLocationLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLocationSpecifierEnumAccess().getTypeMapLocationLiteralParserRuleCall_0_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_0_2=ruleMapLocationLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLocationSpecifierEnumRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_0_2,
                      						"org.unicam.myGrammar.OptGrammar.MapLocationLiteral");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:6674:5: lv_type_0_3= 'calldata'
                    {
                    lv_type_0_3=(Token)match(input,170,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_3, grammarAccess.getLocationSpecifierEnumAccess().getTypeCalldataKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLocationSpecifierEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_3, null);
                      				
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
    // $ANTLR end "ruleLocationSpecifierEnum"


    // $ANTLR start "entryRuleVisibilityEnum"
    // InternalOptGrammar.g:6690:1: entryRuleVisibilityEnum returns [EObject current=null] : iv_ruleVisibilityEnum= ruleVisibilityEnum EOF ;
    public final EObject entryRuleVisibilityEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilityEnum = null;


        try {
            // InternalOptGrammar.g:6690:55: (iv_ruleVisibilityEnum= ruleVisibilityEnum EOF )
            // InternalOptGrammar.g:6691:2: iv_ruleVisibilityEnum= ruleVisibilityEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisibilityEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVisibilityEnum=ruleVisibilityEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisibilityEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibilityEnum"


    // $ANTLR start "ruleVisibilityEnum"
    // InternalOptGrammar.g:6697:1: ruleVisibilityEnum returns [EObject current=null] : ( ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) ) ) ;
    public final EObject ruleVisibilityEnum() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6703:2: ( ( ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) ) ) )
            // InternalOptGrammar.g:6704:2: ( ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) ) )
            {
            // InternalOptGrammar.g:6704:2: ( ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) ) )
            // InternalOptGrammar.g:6705:3: ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) )
            {
            // InternalOptGrammar.g:6705:3: ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) )
            // InternalOptGrammar.g:6706:4: (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' )
            {
            // InternalOptGrammar.g:6706:4: (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 171:
                {
                alt83=1;
                }
                break;
            case 172:
                {
                alt83=2;
                }
                break;
            case 173:
                {
                alt83=3;
                }
                break;
            case 174:
                {
                alt83=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalOptGrammar.g:6707:5: lv_type_0_1= 'public'
                    {
                    lv_type_0_1=(Token)match(input,171,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_1, grammarAccess.getVisibilityEnumAccess().getTypePublicKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVisibilityEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:6718:5: lv_type_0_2= 'internal'
                    {
                    lv_type_0_2=(Token)match(input,172,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_2, grammarAccess.getVisibilityEnumAccess().getTypeInternalKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVisibilityEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:6729:5: lv_type_0_3= 'private'
                    {
                    lv_type_0_3=(Token)match(input,173,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_3, grammarAccess.getVisibilityEnumAccess().getTypePrivateKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVisibilityEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:6740:5: lv_type_0_4= 'external'
                    {
                    lv_type_0_4=(Token)match(input,174,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_4, grammarAccess.getVisibilityEnumAccess().getTypeExternalKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVisibilityEnumRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_4, null);
                      				
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
    // $ANTLR end "ruleVisibilityEnum"


    // $ANTLR start "entryRuleSpecialVariablesTypeEnum"
    // InternalOptGrammar.g:6756:1: entryRuleSpecialVariablesTypeEnum returns [EObject current=null] : iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF ;
    public final EObject entryRuleSpecialVariablesTypeEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariablesTypeEnum = null;


        try {
            // InternalOptGrammar.g:6756:65: (iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF )
            // InternalOptGrammar.g:6757:2: iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF
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
    // InternalOptGrammar.g:6763:1: ruleSpecialVariablesTypeEnum returns [EObject current=null] : ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) ) ;
    public final EObject ruleSpecialVariablesTypeEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6769:2: ( ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) ) )
            // InternalOptGrammar.g:6770:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) )
            {
            // InternalOptGrammar.g:6770:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) )
            // InternalOptGrammar.g:6771:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) )
            {
            // InternalOptGrammar.g:6771:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) )
            // InternalOptGrammar.g:6772:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX )
            {
            // InternalOptGrammar.g:6772:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX )
            int alt84=3;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
                {
                alt84=1;
                }
                break;
            case RULE_MSG:
                {
                alt84=2;
                }
                break;
            case RULE_TX:
                {
                alt84=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalOptGrammar.g:6773:5: lv_name_0_1= RULE_BLOCK
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
                    // InternalOptGrammar.g:6788:5: lv_name_0_2= RULE_MSG
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
                    // InternalOptGrammar.g:6803:5: lv_name_0_3= RULE_TX
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
    // InternalOptGrammar.g:6823:1: ruleLogicalOperationLiteral returns [Enumerator current=null] : ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '<' ) ) ;
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
            // InternalOptGrammar.g:6829:2: ( ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '<' ) ) )
            // InternalOptGrammar.g:6830:2: ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '<' ) )
            {
            // InternalOptGrammar.g:6830:2: ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '&&' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '<' ) )
            int alt85=8;
            switch ( input.LA(1) ) {
            case 175:
                {
                alt85=1;
                }
                break;
            case 176:
                {
                alt85=2;
                }
                break;
            case 177:
                {
                alt85=3;
                }
                break;
            case 178:
                {
                alt85=4;
                }
                break;
            case 179:
                {
                alt85=5;
                }
                break;
            case 180:
                {
                alt85=6;
                }
                break;
            case 181:
                {
                alt85=7;
                }
                break;
            case 182:
                {
                alt85=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalOptGrammar.g:6831:3: (enumLiteral_0= '!=' )
                    {
                    // InternalOptGrammar.g:6831:3: (enumLiteral_0= '!=' )
                    // InternalOptGrammar.g:6832:4: enumLiteral_0= '!='
                    {
                    enumLiteral_0=(Token)match(input,175,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getNOTEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperationLiteralAccess().getNOTEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:6839:3: (enumLiteral_1= '==' )
                    {
                    // InternalOptGrammar.g:6839:3: (enumLiteral_1= '==' )
                    // InternalOptGrammar.g:6840:4: enumLiteral_1= '=='
                    {
                    enumLiteral_1=(Token)match(input,176,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLogicalOperationLiteralAccess().getEQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:6847:3: (enumLiteral_2= '&&' )
                    {
                    // InternalOptGrammar.g:6847:3: (enumLiteral_2= '&&' )
                    // InternalOptGrammar.g:6848:4: enumLiteral_2= '&&'
                    {
                    enumLiteral_2=(Token)match(input,177,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getLogicalOperationLiteralAccess().getANDEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:6855:3: (enumLiteral_3= '||' )
                    {
                    // InternalOptGrammar.g:6855:3: (enumLiteral_3= '||' )
                    // InternalOptGrammar.g:6856:4: enumLiteral_3= '||'
                    {
                    enumLiteral_3=(Token)match(input,178,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getLogicalOperationLiteralAccess().getOREnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalOptGrammar.g:6863:3: (enumLiteral_4= '>=' )
                    {
                    // InternalOptGrammar.g:6863:3: (enumLiteral_4= '>=' )
                    // InternalOptGrammar.g:6864:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,179,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getGTEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getLogicalOperationLiteralAccess().getGTEEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalOptGrammar.g:6871:3: (enumLiteral_5= '<=' )
                    {
                    // InternalOptGrammar.g:6871:3: (enumLiteral_5= '<=' )
                    // InternalOptGrammar.g:6872:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,180,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getLTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getLogicalOperationLiteralAccess().getLTEEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalOptGrammar.g:6879:3: (enumLiteral_6= '>' )
                    {
                    // InternalOptGrammar.g:6879:3: (enumLiteral_6= '>' )
                    // InternalOptGrammar.g:6880:4: enumLiteral_6= '>'
                    {
                    enumLiteral_6=(Token)match(input,181,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicalOperationLiteralAccess().getGTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getLogicalOperationLiteralAccess().getGTEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalOptGrammar.g:6887:3: (enumLiteral_7= '<' )
                    {
                    // InternalOptGrammar.g:6887:3: (enumLiteral_7= '<' )
                    // InternalOptGrammar.g:6888:4: enumLiteral_7= '<'
                    {
                    enumLiteral_7=(Token)match(input,182,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleBooleanLiteralEnum"
    // InternalOptGrammar.g:6898:1: ruleBooleanLiteralEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteralEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6904:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalOptGrammar.g:6905:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalOptGrammar.g:6905:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==183) ) {
                alt86=1;
            }
            else if ( (LA86_0==184) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalOptGrammar.g:6906:3: (enumLiteral_0= 'true' )
                    {
                    // InternalOptGrammar.g:6906:3: (enumLiteral_0= 'true' )
                    // InternalOptGrammar.g:6907:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,183,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:6914:3: (enumLiteral_1= 'false' )
                    {
                    // InternalOptGrammar.g:6914:3: (enumLiteral_1= 'false' )
                    // InternalOptGrammar.g:6915:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,184,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:6925:1: ruleEtherSubDenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) ;
    public final Enumerator ruleEtherSubDenominationEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6931:2: ( ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) )
            // InternalOptGrammar.g:6932:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            {
            // InternalOptGrammar.g:6932:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            int alt87=4;
            switch ( input.LA(1) ) {
            case 185:
                {
                alt87=1;
                }
                break;
            case 186:
                {
                alt87=2;
                }
                break;
            case 187:
                {
                alt87=3;
                }
                break;
            case 188:
                {
                alt87=4;
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
                    // InternalOptGrammar.g:6933:3: (enumLiteral_0= 'wei' )
                    {
                    // InternalOptGrammar.g:6933:3: (enumLiteral_0= 'wei' )
                    // InternalOptGrammar.g:6934:4: enumLiteral_0= 'wei'
                    {
                    enumLiteral_0=(Token)match(input,185,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getWEIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEtherSubDenominationEnumAccess().getWEIEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:6941:3: (enumLiteral_1= 'szabo' )
                    {
                    // InternalOptGrammar.g:6941:3: (enumLiteral_1= 'szabo' )
                    // InternalOptGrammar.g:6942:4: enumLiteral_1= 'szabo'
                    {
                    enumLiteral_1=(Token)match(input,186,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getSZABOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEtherSubDenominationEnumAccess().getSZABOEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:6949:3: (enumLiteral_2= 'finney' )
                    {
                    // InternalOptGrammar.g:6949:3: (enumLiteral_2= 'finney' )
                    // InternalOptGrammar.g:6950:4: enumLiteral_2= 'finney'
                    {
                    enumLiteral_2=(Token)match(input,187,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEtherSubDenominationEnumAccess().getFINNEYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEtherSubDenominationEnumAccess().getFINNEYEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:6957:3: (enumLiteral_3= 'ether' )
                    {
                    // InternalOptGrammar.g:6957:3: (enumLiteral_3= 'ether' )
                    // InternalOptGrammar.g:6958:4: enumLiteral_3= 'ether'
                    {
                    enumLiteral_3=(Token)match(input,188,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:6968:1: ruleTimeSubdenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) ;
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
            // InternalOptGrammar.g:6974:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) )
            // InternalOptGrammar.g:6975:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            {
            // InternalOptGrammar.g:6975:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            int alt88=6;
            switch ( input.LA(1) ) {
            case 189:
                {
                alt88=1;
                }
                break;
            case 190:
                {
                alt88=2;
                }
                break;
            case 191:
                {
                alt88=3;
                }
                break;
            case 192:
                {
                alt88=4;
                }
                break;
            case 193:
                {
                alt88=5;
                }
                break;
            case 194:
                {
                alt88=6;
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
                    // InternalOptGrammar.g:6976:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalOptGrammar.g:6976:3: (enumLiteral_0= 'seconds' )
                    // InternalOptGrammar.g:6977:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,189,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeSubdenominationEnumAccess().getSECONDSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:6984:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalOptGrammar.g:6984:3: (enumLiteral_1= 'minutes' )
                    // InternalOptGrammar.g:6985:4: enumLiteral_1= 'minutes'
                    {
                    enumLiteral_1=(Token)match(input,190,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getMINUTESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeSubdenominationEnumAccess().getMINUTESEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:6992:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalOptGrammar.g:6992:3: (enumLiteral_2= 'hours' )
                    // InternalOptGrammar.g:6993:4: enumLiteral_2= 'hours'
                    {
                    enumLiteral_2=(Token)match(input,191,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getHOURSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeSubdenominationEnumAccess().getHOURSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7000:3: (enumLiteral_3= 'days' )
                    {
                    // InternalOptGrammar.g:7000:3: (enumLiteral_3= 'days' )
                    // InternalOptGrammar.g:7001:4: enumLiteral_3= 'days'
                    {
                    enumLiteral_3=(Token)match(input,192,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getDAYSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTimeSubdenominationEnumAccess().getDAYSEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalOptGrammar.g:7008:3: (enumLiteral_4= 'weeks' )
                    {
                    // InternalOptGrammar.g:7008:3: (enumLiteral_4= 'weeks' )
                    // InternalOptGrammar.g:7009:4: enumLiteral_4= 'weeks'
                    {
                    enumLiteral_4=(Token)match(input,193,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeSubdenominationEnumAccess().getWEEKSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTimeSubdenominationEnumAccess().getWEEKSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalOptGrammar.g:7016:3: (enumLiteral_5= 'years' )
                    {
                    // InternalOptGrammar.g:7016:3: (enumLiteral_5= 'years' )
                    // InternalOptGrammar.g:7017:4: enumLiteral_5= 'years'
                    {
                    enumLiteral_5=(Token)match(input,194,FOLLOW_2); if (state.failed) return current;
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
        // InternalOptGrammar.g:3263:5: ( 'else' )
        // InternalOptGrammar.g:3263:6: 'else'
        {
        match(input,40,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalOptGrammar

    // $ANTLR start synpred2_InternalOptGrammar
    public final void synpred2_InternalOptGrammar_fragment() throws RecognitionException {   
        // InternalOptGrammar.g:3405:4: ( ';' )
        // InternalOptGrammar.g:3405:5: ';'
        {
        match(input,18,FOLLOW_2); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000030380000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008460010L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x87FB000002000FE0L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x87FB000000000FE0L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001100080010L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000088000010L,0x0000000000000000L,0x00007F0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001100000010L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x87FB000800000FE0L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x87FB000003000FE0L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x87FB000001000FE0L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000088800010L,0x0000000000000000L,0x00007F0000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002400800002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001102000010L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000088000012L,0x0000000000000000L,0x00007F0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000010L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x87FBFED100020FE0L,0xFFFFFFFFFFFFFFFFL,0x018000FFFFFFFFFFL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x87FBFED100060FE0L,0xFFFFFFFFFFFFFFFFL,0x018000FFFFFFFFFFL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x87FB000000040FE0L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x87FBFED102020FE0L,0xFFFFFFFFFFFFFFFFL,0x018000FFFFFFFFFFL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x87FBFED1000A0FE0L,0xFFFFFFFFFFFFFFFFL,0x018000FFFFFFFFFFL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x007F800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x87F8000000000FE0L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x87F9000000000FE0L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x80000000008001B0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x80000000008001A0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1E00000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xE000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000002000000000L});

}