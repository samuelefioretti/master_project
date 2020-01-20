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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEX", "RULE_DECIMAL", "RULE_BLOCK", "RULE_MSG", "RULE_TX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'contract'", "'{'", "';'", "'}'", "'payable'", "'function'", "'returns'", "'('", "','", "')'", "':'", "'constant'", "'struct'", "'enum'", "'='", "'indexed'", "'mapping'", "'=>'", "'['", "']'", "'var'", "'.'", "'delete'", "'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'return'", "'throw'", "'_'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'**'", "'!'", "'~'", "'+'", "'-'", "'new'", "'++'", "'--'", "'gasleft'", "'blockhash'", "'addmod'", "'mulmod'", "'ecrecover'", "'keccak256'", "'sha256'", "'ripemd160'", "'/'", "'*'", "'now'", "'int'", "'int16'", "'int24'", "'int32'", "'int40'", "'int48'", "'int56'", "'int64'", "'int72'", "'int80'", "'int88'", "'int96'", "'int104'", "'int112'", "'int120'", "'int128'", "'int136'", "'int144'", "'int152'", "'int160'", "'int168'", "'int178'", "'int184'", "'int192'", "'int200'", "'int208'", "'int216'", "'int224'", "'int232'", "'int240'", "'int248'", "'int256'", "'uint'", "'uint8'", "'uint16'", "'uint24'", "'uint32'", "'uint40'", "'uint48'", "'uint56'", "'uint64'", "'uint72'", "'uint80'", "'uint88'", "'uint96'", "'uint104'", "'uint112'", "'uint120'", "'uint128'", "'uint136'", "'uint144'", "'uint152'", "'uint160'", "'uint168'", "'uint178'", "'uint184'", "'uint192'", "'uint200'", "'uint208'", "'uint216'", "'uint224'", "'uint232'", "'uint240'", "'uint248'", "'uint256'", "'byte'", "'bytes'", "'bytes1'", "'bytes2'", "'bytes3'", "'bytes4'", "'bytes5'", "'bytes6'", "'bytes7'", "'bytes8'", "'bytes9'", "'bytes10'", "'bytes11'", "'bytes12'", "'bytes13'", "'bytes14'", "'bytes15'", "'bytes16'", "'bytes17'", "'bytes18'", "'bytes19'", "'bytes20'", "'bytes21'", "'bytes22'", "'bytes23'", "'bytes24'", "'bytes25'", "'bytes26'", "'bytes27'", "'bytes28'", "'bytes29'", "'bytes30'", "'bytes31'", "'bytes32'", "'string'", "'address'", "'bool'", "'real'", "'ureal'", "'memory'", "'storage'", "'calldata'", "'public'", "'internal'", "'private'", "'external'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'>>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'in'", "'<<'", "'>>'", "'>>>'", "'%'", "'true'", "'false'", "'wei'", "'szabo'", "'finney'", "'ether'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'years'", "'super'", "'this'"
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
    public static final int RULE_STRING=6;
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

                if ( (LA2_0==23||(LA2_0>=28 && LA2_0<=29)||(LA2_0>=179 && LA2_0<=182)) ) {
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
            case 179:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==28) ) {
                    alt3=2;
                }
                else if ( (LA3_1==29) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 180:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==29) ) {
                    alt3=1;
                }
                else if ( (LA3_2==28) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 181:
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
            case 182:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==28) ) {
                    alt3=2;
                }
                else if ( (LA3_4==29) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 23:
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
    // InternalOptGrammar.g:240:1: ruleFunctionDeclaration returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_ParameterList_1= ruleParameterList ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_ParameterList_1 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:246:2: ( (this_EnumDefinition_0= ruleEnumDefinition | this_ParameterList_1= ruleParameterList ) )
            // InternalOptGrammar.g:247:2: (this_EnumDefinition_0= ruleEnumDefinition | this_ParameterList_1= ruleParameterList )
            {
            // InternalOptGrammar.g:247:2: (this_EnumDefinition_0= ruleEnumDefinition | this_ParameterList_1= ruleParameterList )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29||(LA4_0>=179 && LA4_0<=182)) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOptGrammar.g:248:3: this_EnumDefinition_0= ruleEnumDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getEnumDefinitionParserRuleCall_0());
                      		
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
                    break;
                case 2 :
                    // InternalOptGrammar.g:257:3: this_ParameterList_1= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParameterListParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterList_1=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterList_1;
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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleFunctionDefinition"
    // InternalOptGrammar.g:269:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // InternalOptGrammar.g:269:59: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // InternalOptGrammar.g:270:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
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
    // InternalOptGrammar.g:276:1: ruleFunctionDefinition returns [EObject current=null] : ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) ) ;
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
            // InternalOptGrammar.g:282:2: ( ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) ) )
            // InternalOptGrammar.g:283:2: ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) )
            {
            // InternalOptGrammar.g:283:2: ( ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) )
            // InternalOptGrammar.g:284:3: ( (lv_payable_0_0= 'payable' ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' )
            {
            // InternalOptGrammar.g:284:3: ( (lv_payable_0_0= 'payable' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOptGrammar.g:285:4: (lv_payable_0_0= 'payable' )
                    {
                    // InternalOptGrammar.g:285:4: (lv_payable_0_0= 'payable' )
                    // InternalOptGrammar.g:286:5: lv_payable_0_0= 'payable'
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
            // InternalOptGrammar.g:302:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOptGrammar.g:303:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:303:4: (lv_name_2_0= RULE_ID )
            // InternalOptGrammar.g:304:5: lv_name_2_0= RULE_ID
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

            // InternalOptGrammar.g:320:3: ( (lv_parameters_3_0= ruleParameterList ) )
            // InternalOptGrammar.g:321:4: (lv_parameters_3_0= ruleParameterList )
            {
            // InternalOptGrammar.g:321:4: (lv_parameters_3_0= ruleParameterList )
            // InternalOptGrammar.g:322:5: lv_parameters_3_0= ruleParameterList
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

            // InternalOptGrammar.g:339:3: ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==27||(LA6_0>=179 && LA6_0<=182)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOptGrammar.g:340:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    {
            	    // InternalOptGrammar.g:340:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    // InternalOptGrammar.g:341:5: lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement
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
            	    break loop6;
                }
            } while (true);

            // InternalOptGrammar.g:358:3: (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOptGrammar.g:359:4: otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getReturnsKeyword_5_0());
                      			
                    }
                    // InternalOptGrammar.g:363:4: ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    // InternalOptGrammar.g:364:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    {
                    // InternalOptGrammar.g:364:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    // InternalOptGrammar.g:365:6: lv_returnParameters_6_0= ruleReturnsParameterList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnParametersReturnsParameterListParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
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

            // InternalOptGrammar.g:383:3: ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOptGrammar.g:384:4: ( (lv_block_7_0= ruleBody ) )
                    {
                    // InternalOptGrammar.g:384:4: ( (lv_block_7_0= ruleBody ) )
                    // InternalOptGrammar.g:385:5: (lv_block_7_0= ruleBody )
                    {
                    // InternalOptGrammar.g:385:5: (lv_block_7_0= ruleBody )
                    // InternalOptGrammar.g:386:6: lv_block_7_0= ruleBody
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
                    // InternalOptGrammar.g:404:4: otherlv_8= ';'
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
    // InternalOptGrammar.g:413:1: entryRuleFunctionCallListArguments returns [EObject current=null] : iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF ;
    public final EObject entryRuleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallListArguments = null;


        try {
            // InternalOptGrammar.g:413:66: (iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF )
            // InternalOptGrammar.g:414:2: iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF
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
    // InternalOptGrammar.g:420:1: ruleFunctionCallListArguments returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:426:2: ( (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:427:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:427:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:428:3: otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallListArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:432:3: ()
            // InternalOptGrammar.g:433:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallListArgumentsAccess().getFunctionCallListArgumentsAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:439:3: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_TX)||LA10_0==23||(LA10_0>=54 && LA10_0<=68)||(LA10_0>=71 && LA10_0<=175)||(LA10_0>=205 && LA10_0<=206)||(LA10_0>=217 && LA10_0<=218)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOptGrammar.g:440:4: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // InternalOptGrammar.g:440:4: ( (lv_arguments_2_0= ruleExpression ) )
                    // InternalOptGrammar.g:441:5: (lv_arguments_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:441:5: (lv_arguments_2_0= ruleExpression )
                    // InternalOptGrammar.g:442:6: lv_arguments_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallListArgumentsAccess().getArgumentsExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

                    // InternalOptGrammar.g:459:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalOptGrammar.g:460:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallListArgumentsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:464:5: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // InternalOptGrammar.g:465:6: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // InternalOptGrammar.g:465:6: (lv_arguments_4_0= ruleExpression )
                    	    // InternalOptGrammar.g:466:7: lv_arguments_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallListArgumentsAccess().getArgumentsExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop9;
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
    // InternalOptGrammar.g:493:1: entryRuleFunctionCallArguments returns [EObject current=null] : iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF ;
    public final EObject entryRuleFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArguments = null;


        try {
            // InternalOptGrammar.g:493:62: (iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF )
            // InternalOptGrammar.g:494:2: iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF
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
    // InternalOptGrammar.g:500:1: ruleFunctionCallArguments returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) ;
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
            // InternalOptGrammar.g:506:2: ( ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) )
            // InternalOptGrammar.g:507:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            {
            // InternalOptGrammar.g:507:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>=RULE_ID && LA13_1<=RULE_TX)||LA13_1==23||LA13_1==25||(LA13_1>=54 && LA13_1<=68)||(LA13_1>=71 && LA13_1<=175)||(LA13_1>=205 && LA13_1<=206)||(LA13_1>=217 && LA13_1<=218)) ) {
                    alt13=2;
                }
                else if ( (LA13_1==17) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOptGrammar.g:508:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    {
                    // InternalOptGrammar.g:508:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    // InternalOptGrammar.g:509:4: otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunctionCallArgumentsAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,17,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgumentsAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalOptGrammar.g:517:4: ()
                    // InternalOptGrammar.g:518:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFunctionCallArgumentsAccess().getFunctionCallArgumentsAction_0_2(),
                      						current);
                      				
                    }

                    }

                    // InternalOptGrammar.g:524:4: ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalOptGrammar.g:525:5: ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            {
                            // InternalOptGrammar.g:525:5: ( (lv_args_3_0= ruleFunctionCallArg ) )
                            // InternalOptGrammar.g:526:6: (lv_args_3_0= ruleFunctionCallArg )
                            {
                            // InternalOptGrammar.g:526:6: (lv_args_3_0= ruleFunctionCallArg )
                            // InternalOptGrammar.g:527:7: lv_args_3_0= ruleFunctionCallArg
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFunctionCallArgumentsAccess().getArgsFunctionCallArgParserRuleCall_0_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_17);
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

                            // InternalOptGrammar.g:544:5: (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==24) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalOptGrammar.g:545:6: otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    {
                            	    otherlv_4=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallArgumentsAccess().getCommaKeyword_0_3_1_0());
                            	      					
                            	    }
                            	    // InternalOptGrammar.g:549:6: ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    // InternalOptGrammar.g:550:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    {
                            	    // InternalOptGrammar.g:550:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    // InternalOptGrammar.g:551:8: lv_args_5_0= ruleFunctionCallArg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getFunctionCallArgumentsAccess().getArgsFunctionCallArgParserRuleCall_0_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_17);
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
                            	    break loop11;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
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
                    // InternalOptGrammar.g:580:3: this_FunctionCallListArguments_8= ruleFunctionCallListArguments
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
    // InternalOptGrammar.g:592:1: entryRuleFunctionCallArg returns [EObject current=null] : iv_ruleFunctionCallArg= ruleFunctionCallArg EOF ;
    public final EObject entryRuleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArg = null;


        try {
            // InternalOptGrammar.g:592:56: (iv_ruleFunctionCallArg= ruleFunctionCallArg EOF )
            // InternalOptGrammar.g:593:2: iv_ruleFunctionCallArg= ruleFunctionCallArg EOF
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
    // InternalOptGrammar.g:599:1: ruleFunctionCallArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:605:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalOptGrammar.g:606:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalOptGrammar.g:606:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalOptGrammar.g:607:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalOptGrammar.g:607:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:608:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:608:4: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:609:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgAccess().getColonKeyword_1());
              		
            }
            // InternalOptGrammar.g:629:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalOptGrammar.g:630:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:630:4: (lv_expr_2_0= ruleExpression )
            // InternalOptGrammar.g:631:5: lv_expr_2_0= ruleExpression
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
    // InternalOptGrammar.g:652:1: entryRuleFunctionDefinitionOptionalElement returns [EObject current=null] : iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF ;
    public final EObject entryRuleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOptionalElement = null;


        try {
            // InternalOptGrammar.g:652:74: (iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF )
            // InternalOptGrammar.g:653:2: iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF
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
    // InternalOptGrammar.g:659:1: ruleFunctionDefinitionOptionalElement returns [EObject current=null] : (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) ;
    public final EObject ruleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_ModifierInvocation_1 = null;

        EObject this_VisibilitySpecifier_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:665:2: ( (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) )
            // InternalOptGrammar.g:666:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            {
            // InternalOptGrammar.g:666:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case 179:
            case 180:
            case 181:
            case 182:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalOptGrammar.g:667:3: this_Const_0= ruleConst
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
                    // InternalOptGrammar.g:676:3: this_ModifierInvocation_1= ruleModifierInvocation
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
                    // InternalOptGrammar.g:685:3: this_VisibilitySpecifier_2= ruleVisibilitySpecifier
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
    // InternalOptGrammar.g:697:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalOptGrammar.g:697:46: (iv_ruleConst= ruleConst EOF )
            // InternalOptGrammar.g:698:2: iv_ruleConst= ruleConst EOF
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
    // InternalOptGrammar.g:704:1: ruleConst returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:710:2: ( (otherlv_0= 'constant' () ) )
            // InternalOptGrammar.g:711:2: (otherlv_0= 'constant' () )
            {
            // InternalOptGrammar.g:711:2: (otherlv_0= 'constant' () )
            // InternalOptGrammar.g:712:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstAccess().getConstantKeyword_0());
              		
            }
            // InternalOptGrammar.g:716:3: ()
            // InternalOptGrammar.g:717:4: 
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
    // InternalOptGrammar.g:727:1: entryRuleVisibilitySpecifier returns [EObject current=null] : iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF ;
    public final EObject entryRuleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilitySpecifier = null;


        try {
            // InternalOptGrammar.g:727:60: (iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF )
            // InternalOptGrammar.g:728:2: iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF
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
    // InternalOptGrammar.g:734:1: ruleVisibilitySpecifier returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ;
    public final EObject ruleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:740:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) )
            // InternalOptGrammar.g:741:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            {
            // InternalOptGrammar.g:741:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            // InternalOptGrammar.g:742:3: (lv_visibility_0_0= ruleVisibilityEnum )
            {
            // InternalOptGrammar.g:742:3: (lv_visibility_0_0= ruleVisibilityEnum )
            // InternalOptGrammar.g:743:4: lv_visibility_0_0= ruleVisibilityEnum
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
    // InternalOptGrammar.g:763:1: entryRuleStructDefinition returns [EObject current=null] : iv_ruleStructDefinition= ruleStructDefinition EOF ;
    public final EObject entryRuleStructDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDefinition = null;


        try {
            // InternalOptGrammar.g:763:57: (iv_ruleStructDefinition= ruleStructDefinition EOF )
            // InternalOptGrammar.g:764:2: iv_ruleStructDefinition= ruleStructDefinition EOF
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
    // InternalOptGrammar.g:770:1: ruleStructDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
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
            // InternalOptGrammar.g:776:2: ( ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // InternalOptGrammar.g:777:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // InternalOptGrammar.g:777:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // InternalOptGrammar.g:778:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // InternalOptGrammar.g:778:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=179 && LA15_0<=182)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOptGrammar.g:779:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    {
                    // InternalOptGrammar.g:779:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    // InternalOptGrammar.g:780:5: lv_visibility_0_0= ruleVisibilityEnum
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStructDefinitionAccess().getVisibilityVisibilityEnumEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
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
            // InternalOptGrammar.g:801:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOptGrammar.g:802:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:802:4: (lv_name_2_0= RULE_ID )
            // InternalOptGrammar.g:803:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStructDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalOptGrammar.g:823:3: ( ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==32||LA16_0==36||(LA16_0>=72 && LA16_0<=175)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOptGrammar.g:824:4: ( (lv_members_4_0= ruleVariableDeclaration ) ) otherlv_5= ';'
            	    {
            	    // InternalOptGrammar.g:824:4: ( (lv_members_4_0= ruleVariableDeclaration ) )
            	    // InternalOptGrammar.g:825:5: (lv_members_4_0= ruleVariableDeclaration )
            	    {
            	    // InternalOptGrammar.g:825:5: (lv_members_4_0= ruleVariableDeclaration )
            	    // InternalOptGrammar.g:826:6: lv_members_4_0= ruleVariableDeclaration
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

            	    otherlv_5=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getStructDefinitionAccess().getSemicolonKeyword_4_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalOptGrammar.g:856:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // InternalOptGrammar.g:856:55: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // InternalOptGrammar.g:857:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
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
    // InternalOptGrammar.g:863:1: ruleEnumDefinition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' ) ;
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
            // InternalOptGrammar.g:869:2: ( ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' ) )
            // InternalOptGrammar.g:870:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' )
            {
            // InternalOptGrammar.g:870:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}' )
            // InternalOptGrammar.g:871:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )? otherlv_7= '}'
            {
            // InternalOptGrammar.g:871:3: ( (lv_visibility_0_0= ruleVisibilityEnum ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=179 && LA17_0<=182)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOptGrammar.g:872:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    {
                    // InternalOptGrammar.g:872:4: (lv_visibility_0_0= ruleVisibilityEnum )
                    // InternalOptGrammar.g:873:5: lv_visibility_0_0= ruleVisibilityEnum
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEnumDefinitionAccess().getVisibilityVisibilityEnumEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
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
            // InternalOptGrammar.g:894:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOptGrammar.g:895:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:895:4: (lv_name_2_0= RULE_ID )
            // InternalOptGrammar.g:896:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,17,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalOptGrammar.g:916:3: ( ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOptGrammar.g:917:4: ( (lv_members_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )*
                    {
                    // InternalOptGrammar.g:917:4: ( (lv_members_4_0= ruleEnumValue ) )
                    // InternalOptGrammar.g:918:5: (lv_members_4_0= ruleEnumValue )
                    {
                    // InternalOptGrammar.g:918:5: (lv_members_4_0= ruleEnumValue )
                    // InternalOptGrammar.g:919:6: lv_members_4_0= ruleEnumValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
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

                    // InternalOptGrammar.g:936:4: (otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalOptGrammar.g:937:5: otherlv_5= ',' ( (lv_members_6_0= ruleEnumValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getEnumDefinitionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:941:5: ( (lv_members_6_0= ruleEnumValue ) )
                    	    // InternalOptGrammar.g:942:6: (lv_members_6_0= ruleEnumValue )
                    	    {
                    	    // InternalOptGrammar.g:942:6: (lv_members_6_0= ruleEnumValue )
                    	    // InternalOptGrammar.g:943:7: lv_members_6_0= ruleEnumValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
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
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:970:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalOptGrammar.g:970:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalOptGrammar.g:971:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalOptGrammar.g:977:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:983:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalOptGrammar.g:984:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalOptGrammar.g:984:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:985:3: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:985:3: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:986:4: lv_name_0_0= RULE_ID
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
    // InternalOptGrammar.g:1005:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalOptGrammar.g:1005:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalOptGrammar.g:1006:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalOptGrammar.g:1012:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1018:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalOptGrammar.g:1019:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalOptGrammar.g:1019:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:1020:3: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:1020:3: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:1021:4: lv_name_0_0= RULE_ID
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
    // InternalOptGrammar.g:1040:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1040:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalOptGrammar.g:1041:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalOptGrammar.g:1047:1: ruleVariableDeclaration returns [EObject current=null] : (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_StandardVariableDeclaration_0 = null;

        EObject this_VarVariableDeclaration_1 = null;

        EObject this_VarVariableTupleVariableDeclaration_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1053:2: ( (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) )
            // InternalOptGrammar.g:1054:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            {
            // InternalOptGrammar.g:1054:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==32||(LA20_0>=72 && LA20_0<=175)) ) {
                alt20=1;
            }
            else if ( (LA20_0==36) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==RULE_ID) ) {
                    alt20=2;
                }
                else if ( (LA20_2==23) ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalOptGrammar.g:1055:3: this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration
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
                    // InternalOptGrammar.g:1064:3: this_VarVariableDeclaration_1= ruleVarVariableDeclaration
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
                    // InternalOptGrammar.g:1073:3: this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration
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
    // InternalOptGrammar.g:1085:1: entryRuleStandardVariableDeclaration returns [EObject current=null] : iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF ;
    public final EObject entryRuleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1085:68: (iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF )
            // InternalOptGrammar.g:1086:2: iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF
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
    // InternalOptGrammar.g:1092:1: ruleStandardVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_optionalElements_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1098:2: ( ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1099:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1099:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1100:3: ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1100:3: ( (lv_type_0_0= ruleStandardType ) )
            // InternalOptGrammar.g:1101:4: (lv_type_0_0= ruleStandardType )
            {
            // InternalOptGrammar.g:1101:4: (lv_type_0_0= ruleStandardType )
            // InternalOptGrammar.g:1102:5: lv_type_0_0= ruleStandardType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getTypeStandardTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            // InternalOptGrammar.g:1119:3: ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27||LA21_0==31||(LA21_0>=176 && LA21_0<=182)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOptGrammar.g:1120:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    {
            	    // InternalOptGrammar.g:1120:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    // InternalOptGrammar.g:1121:5: lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    break loop21;
                }
            } while (true);

            // InternalOptGrammar.g:1138:3: ( (lv_variable_2_0= ruleVariable ) )
            // InternalOptGrammar.g:1139:4: (lv_variable_2_0= ruleVariable )
            {
            // InternalOptGrammar.g:1139:4: (lv_variable_2_0= ruleVariable )
            // InternalOptGrammar.g:1140:5: lv_variable_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardVariableDeclarationAccess().getVariableVariableParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            // InternalOptGrammar.g:1157:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOptGrammar.g:1158:4: otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStandardVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalOptGrammar.g:1162:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalOptGrammar.g:1163:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1163:5: (lv_expression_4_0= ruleExpression )
                    // InternalOptGrammar.g:1164:6: lv_expression_4_0= ruleExpression
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
    // InternalOptGrammar.g:1186:1: entryRuleVarVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1186:63: (iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF )
            // InternalOptGrammar.g:1187:2: iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF
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
    // InternalOptGrammar.g:1193:1: ruleVarVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1199:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1200:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1200:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1201:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1201:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalOptGrammar.g:1202:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalOptGrammar.g:1202:4: (lv_varType_0_0= ruleVarType )
            // InternalOptGrammar.g:1203:5: lv_varType_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getVarTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            // InternalOptGrammar.g:1220:3: ( (lv_variable_1_0= ruleVariable ) )
            // InternalOptGrammar.g:1221:4: (lv_variable_1_0= ruleVariable )
            {
            // InternalOptGrammar.g:1221:4: (lv_variable_1_0= ruleVariable )
            // InternalOptGrammar.g:1222:5: lv_variable_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableDeclarationAccess().getVariableVariableParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            // InternalOptGrammar.g:1239:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOptGrammar.g:1240:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalOptGrammar.g:1244:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalOptGrammar.g:1245:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1245:5: (lv_expression_3_0= ruleExpression )
                    // InternalOptGrammar.g:1246:6: lv_expression_3_0= ruleExpression
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
    // InternalOptGrammar.g:1268:1: entryRuleVarVariableTupleVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableTupleVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1268:76: (iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF )
            // InternalOptGrammar.g:1269:2: iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF
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
    // InternalOptGrammar.g:1275:1: ruleVarVariableTupleVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_tuple_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1281:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1282:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1282:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1283:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1283:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalOptGrammar.g:1284:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalOptGrammar.g:1284:4: (lv_varType_0_0= ruleVarType )
            // InternalOptGrammar.g:1285:5: lv_varType_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getVarTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
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

            // InternalOptGrammar.g:1302:3: ( (lv_tuple_1_0= ruleTuple ) )
            // InternalOptGrammar.g:1303:4: (lv_tuple_1_0= ruleTuple )
            {
            // InternalOptGrammar.g:1303:4: (lv_tuple_1_0= ruleTuple )
            // InternalOptGrammar.g:1304:5: lv_tuple_1_0= ruleTuple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getTupleTupleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            // InternalOptGrammar.g:1321:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOptGrammar.g:1322:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableTupleVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalOptGrammar.g:1326:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalOptGrammar.g:1327:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1327:5: (lv_expression_3_0= ruleExpression )
                    // InternalOptGrammar.g:1328:6: lv_expression_3_0= ruleExpression
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
    // InternalOptGrammar.g:1350:1: entryRuleVariableDeclarationOptionalElement returns [EObject current=null] : iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF ;
    public final EObject entryRuleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationOptionalElement = null;


        try {
            // InternalOptGrammar.g:1350:75: (iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF )
            // InternalOptGrammar.g:1351:2: iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF
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
    // InternalOptGrammar.g:1357:1: ruleVariableDeclarationOptionalElement returns [EObject current=null] : (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) ;
    public final EObject ruleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_VisibilitySpecifier_0 = null;

        EObject this_IndexedSpecifer_1 = null;

        EObject this_ConstantSpecifier_2 = null;

        EObject this_LocationSpecifier_3 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1363:2: ( (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) )
            // InternalOptGrammar.g:1364:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            {
            // InternalOptGrammar.g:1364:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 179:
            case 180:
            case 181:
            case 182:
                {
                alt25=1;
                }
                break;
            case 31:
                {
                alt25=2;
                }
                break;
            case 27:
                {
                alt25=3;
                }
                break;
            case 176:
            case 177:
            case 178:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalOptGrammar.g:1365:3: this_VisibilitySpecifier_0= ruleVisibilitySpecifier
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
                    // InternalOptGrammar.g:1374:3: this_IndexedSpecifer_1= ruleIndexedSpecifer
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
                    // InternalOptGrammar.g:1383:3: this_ConstantSpecifier_2= ruleConstantSpecifier
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
                    // InternalOptGrammar.g:1392:3: this_LocationSpecifier_3= ruleLocationSpecifier
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
    // InternalOptGrammar.g:1404:1: entryRuleIndexedSpecifer returns [EObject current=null] : iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF ;
    public final EObject entryRuleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedSpecifer = null;


        try {
            // InternalOptGrammar.g:1404:56: (iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF )
            // InternalOptGrammar.g:1405:2: iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF
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
    // InternalOptGrammar.g:1411:1: ruleIndexedSpecifer returns [EObject current=null] : (otherlv_0= 'indexed' () ) ;
    public final EObject ruleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1417:2: ( (otherlv_0= 'indexed' () ) )
            // InternalOptGrammar.g:1418:2: (otherlv_0= 'indexed' () )
            {
            // InternalOptGrammar.g:1418:2: (otherlv_0= 'indexed' () )
            // InternalOptGrammar.g:1419:3: otherlv_0= 'indexed' ()
            {
            otherlv_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexedSpeciferAccess().getIndexedKeyword_0());
              		
            }
            // InternalOptGrammar.g:1423:3: ()
            // InternalOptGrammar.g:1424:4: 
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
    // InternalOptGrammar.g:1434:1: entryRuleConstantSpecifier returns [EObject current=null] : iv_ruleConstantSpecifier= ruleConstantSpecifier EOF ;
    public final EObject entryRuleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSpecifier = null;


        try {
            // InternalOptGrammar.g:1434:58: (iv_ruleConstantSpecifier= ruleConstantSpecifier EOF )
            // InternalOptGrammar.g:1435:2: iv_ruleConstantSpecifier= ruleConstantSpecifier EOF
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
    // InternalOptGrammar.g:1441:1: ruleConstantSpecifier returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1447:2: ( (otherlv_0= 'constant' () ) )
            // InternalOptGrammar.g:1448:2: (otherlv_0= 'constant' () )
            {
            // InternalOptGrammar.g:1448:2: (otherlv_0= 'constant' () )
            // InternalOptGrammar.g:1449:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantSpecifierAccess().getConstantKeyword_0());
              		
            }
            // InternalOptGrammar.g:1453:3: ()
            // InternalOptGrammar.g:1454:4: 
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
    // InternalOptGrammar.g:1464:1: entryRuleLocationSpecifier returns [EObject current=null] : iv_ruleLocationSpecifier= ruleLocationSpecifier EOF ;
    public final EObject entryRuleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifier = null;


        try {
            // InternalOptGrammar.g:1464:58: (iv_ruleLocationSpecifier= ruleLocationSpecifier EOF )
            // InternalOptGrammar.g:1465:2: iv_ruleLocationSpecifier= ruleLocationSpecifier EOF
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
    // InternalOptGrammar.g:1471:1: ruleLocationSpecifier returns [EObject current=null] : ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) ;
    public final EObject ruleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_location_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1477:2: ( ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) )
            // InternalOptGrammar.g:1478:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            {
            // InternalOptGrammar.g:1478:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            // InternalOptGrammar.g:1479:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            {
            // InternalOptGrammar.g:1479:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            // InternalOptGrammar.g:1480:4: lv_location_0_0= ruleLocationSpecifierEnum
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
    // InternalOptGrammar.g:1500:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalOptGrammar.g:1500:45: (iv_ruleType= ruleType EOF )
            // InternalOptGrammar.g:1501:2: iv_ruleType= ruleType EOF
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
    // InternalOptGrammar.g:1507:1: ruleType returns [EObject current=null] : (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_StandardType_0 = null;

        AntlrDatatypeRuleToken lv_isVarType_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1513:2: ( (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) )
            // InternalOptGrammar.g:1514:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            {
            // InternalOptGrammar.g:1514:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==32||(LA26_0>=72 && LA26_0<=175)) ) {
                alt26=1;
            }
            else if ( (LA26_0==36) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalOptGrammar.g:1515:3: this_StandardType_0= ruleStandardType
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
                    // InternalOptGrammar.g:1524:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    {
                    // InternalOptGrammar.g:1524:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    // InternalOptGrammar.g:1525:4: (lv_isVarType_1_0= ruleVarType )
                    {
                    // InternalOptGrammar.g:1525:4: (lv_isVarType_1_0= ruleVarType )
                    // InternalOptGrammar.g:1526:5: lv_isVarType_1_0= ruleVarType
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
    // InternalOptGrammar.g:1547:1: entryRuleStandardType returns [EObject current=null] : iv_ruleStandardType= ruleStandardType EOF ;
    public final EObject entryRuleStandardType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardType = null;


        try {
            // InternalOptGrammar.g:1547:53: (iv_ruleStandardType= ruleStandardType EOF )
            // InternalOptGrammar.g:1548:2: iv_ruleStandardType= ruleStandardType EOF
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
    // InternalOptGrammar.g:1554:1: ruleStandardType returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) ;
    public final EObject ruleStandardType() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;

        EObject this_QualifiedIdentifier_3 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1560:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) )
            // InternalOptGrammar.g:1561:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            {
            // InternalOptGrammar.g:1561:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            int alt28=3;
            switch ( input.LA(1) ) {
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
            case 175:
                {
                alt28=1;
                }
                break;
            case 32:
                {
                alt28=2;
                }
                break;
            case RULE_ID:
                {
                alt28=3;
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
                    // InternalOptGrammar.g:1562:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalOptGrammar.g:1562:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalOptGrammar.g:1563:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStandardTypeAccess().getElementaryTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_25);
                    this_ElementaryType_0=ruleElementaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementaryType_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalOptGrammar.g:1571:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==34) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalOptGrammar.g:1572:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalOptGrammar.g:1572:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalOptGrammar.g:1573:6: lv_dimension_1_0= ruleArrayDimensions
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
                    // InternalOptGrammar.g:1592:3: this_Mapping_2= ruleMapping
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
                    // InternalOptGrammar.g:1601:3: this_QualifiedIdentifier_3= ruleQualifiedIdentifier
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
    // InternalOptGrammar.g:1613:1: entryRuleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF ;
    public final EObject entryRuleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardTypeWithoutQualifiedIdentifier = null;


        try {
            // InternalOptGrammar.g:1613:79: (iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF )
            // InternalOptGrammar.g:1614:2: iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF
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
    // InternalOptGrammar.g:1620:1: ruleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) ;
    public final EObject ruleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1626:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) )
            // InternalOptGrammar.g:1627:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            {
            // InternalOptGrammar.g:1627:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=72 && LA30_0<=175)) ) {
                alt30=1;
            }
            else if ( (LA30_0==32) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalOptGrammar.g:1628:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalOptGrammar.g:1628:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalOptGrammar.g:1629:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStandardTypeWithoutQualifiedIdentifierAccess().getElementaryTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_25);
                    this_ElementaryType_0=ruleElementaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ElementaryType_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalOptGrammar.g:1637:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==34) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalOptGrammar.g:1638:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalOptGrammar.g:1638:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalOptGrammar.g:1639:6: lv_dimension_1_0= ruleArrayDimensions
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
                    // InternalOptGrammar.g:1658:3: this_Mapping_2= ruleMapping
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
    // InternalOptGrammar.g:1670:1: entryRuleElementaryType returns [EObject current=null] : iv_ruleElementaryType= ruleElementaryType EOF ;
    public final EObject entryRuleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryType = null;


        try {
            // InternalOptGrammar.g:1670:55: (iv_ruleElementaryType= ruleElementaryType EOF )
            // InternalOptGrammar.g:1671:2: iv_ruleElementaryType= ruleElementaryType EOF
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
    // InternalOptGrammar.g:1677:1: ruleElementaryType returns [EObject current=null] : ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) ;
    public final EObject ruleElementaryType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1683:2: ( ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) )
            // InternalOptGrammar.g:1684:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            {
            // InternalOptGrammar.g:1684:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            // InternalOptGrammar.g:1685:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalOptGrammar.g:1685:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            // InternalOptGrammar.g:1686:4: lv_name_0_0= ruleElementaryTypeNameEnum
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
    // InternalOptGrammar.g:1706:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalOptGrammar.g:1706:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalOptGrammar.g:1707:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalOptGrammar.g:1713:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) ;
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
            // InternalOptGrammar.g:1719:2: ( (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) )
            // InternalOptGrammar.g:1720:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            {
            // InternalOptGrammar.g:1720:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            // InternalOptGrammar.g:1721:3: otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:1729:3: ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) )
            // InternalOptGrammar.g:1730:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            {
            // InternalOptGrammar.g:1730:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            // InternalOptGrammar.g:1731:5: lv_keyType_2_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getKeyTypeElementaryTypeNameEnumEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_27);
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

            otherlv_3=(Token)match(input,33,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalOptGrammar.g:1752:3: ( (lv_valueType_4_0= ruleType ) )
            // InternalOptGrammar.g:1753:4: (lv_valueType_4_0= ruleType )
            {
            // InternalOptGrammar.g:1753:4: (lv_valueType_4_0= ruleType )
            // InternalOptGrammar.g:1754:5: lv_valueType_4_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getValueTypeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_18);
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
    // InternalOptGrammar.g:1779:1: entryRuleArrayDimensions returns [EObject current=null] : iv_ruleArrayDimensions= ruleArrayDimensions EOF ;
    public final EObject entryRuleArrayDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimensions = null;


        try {
            // InternalOptGrammar.g:1779:56: (iv_ruleArrayDimensions= ruleArrayDimensions EOF )
            // InternalOptGrammar.g:1780:2: iv_ruleArrayDimensions= ruleArrayDimensions EOF
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
    // InternalOptGrammar.g:1786:1: ruleArrayDimensions returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) ;
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
            // InternalOptGrammar.g:1792:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) )
            // InternalOptGrammar.g:1793:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            {
            // InternalOptGrammar.g:1793:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            // InternalOptGrammar.g:1794:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:1798:3: ()
            // InternalOptGrammar.g:1799:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayDimensionsAccess().getArrayDimensionsAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:1805:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_TX)||LA31_0==23||(LA31_0>=54 && LA31_0<=68)||(LA31_0>=71 && LA31_0<=175)||(LA31_0>=205 && LA31_0<=206)||(LA31_0>=217 && LA31_0<=218)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOptGrammar.g:1806:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1806:4: (lv_value_2_0= ruleExpression )
                    // InternalOptGrammar.g:1807:5: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArrayDimensionsAccess().getValueExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalOptGrammar.g:1828:3: (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==34) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOptGrammar.g:1829:4: otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']'
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_4_0());
            	      			
            	    }
            	    // InternalOptGrammar.g:1833:4: ( (lv_value_5_0= ruleExpression ) )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_TX)||LA32_0==23||(LA32_0>=54 && LA32_0<=68)||(LA32_0>=71 && LA32_0<=175)||(LA32_0>=205 && LA32_0<=206)||(LA32_0>=217 && LA32_0<=218)) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalOptGrammar.g:1834:5: (lv_value_5_0= ruleExpression )
            	            {
            	            // InternalOptGrammar.g:1834:5: (lv_value_5_0= ruleExpression )
            	            // InternalOptGrammar.g:1835:6: lv_value_5_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getArrayDimensionsAccess().getValueExpressionParserRuleCall_4_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_30);
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

            	    otherlv_6=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_4_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalOptGrammar.g:1861:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalOptGrammar.g:1861:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalOptGrammar.g:1862:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalOptGrammar.g:1868:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1874:2: (kw= 'var' )
            // InternalOptGrammar.g:1875:2: kw= 'var'
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
    // InternalOptGrammar.g:1883:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalOptGrammar.g:1883:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalOptGrammar.g:1884:2: iv_ruleTuple= ruleTuple EOF
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
    // InternalOptGrammar.g:1890:1: ruleTuple returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_3_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1896:2: ( (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:1897:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:1897:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            // InternalOptGrammar.g:1898:3: otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:1902:3: ()
            // InternalOptGrammar.g:1903:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleAccess().getTupleAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:1909:3: ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_TX)||(LA37_0>=23 && LA37_0<=24)||(LA37_0>=54 && LA37_0<=68)||(LA37_0>=71 && LA37_0<=175)||(LA37_0>=205 && LA37_0<=206)||(LA37_0>=217 && LA37_0<=218)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOptGrammar.g:1910:4: ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    {
                    // InternalOptGrammar.g:1910:4: ( (lv_members_2_0= ruleExpression ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_TX)||LA34_0==23||(LA34_0>=54 && LA34_0<=68)||(LA34_0>=71 && LA34_0<=175)||(LA34_0>=205 && LA34_0<=206)||(LA34_0>=217 && LA34_0<=218)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalOptGrammar.g:1911:5: (lv_members_2_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:1911:5: (lv_members_2_0= ruleExpression )
                            // InternalOptGrammar.g:1912:6: lv_members_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getTupleAccess().getMembersExpressionParserRuleCall_2_0_0());
                              					
                            }
                            pushFollow(FOLLOW_32);
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

                    // InternalOptGrammar.g:1929:4: ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==24) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalOptGrammar.g:1930:5: ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )?
                    	    {
                    	    // InternalOptGrammar.g:1930:5: ( (lv_members_3_0= ruleTupleSeparator ) )
                    	    // InternalOptGrammar.g:1931:6: (lv_members_3_0= ruleTupleSeparator )
                    	    {
                    	    // InternalOptGrammar.g:1931:6: (lv_members_3_0= ruleTupleSeparator )
                    	    // InternalOptGrammar.g:1932:7: lv_members_3_0= ruleTupleSeparator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTupleAccess().getMembersTupleSeparatorParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
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

                    	    // InternalOptGrammar.g:1949:5: ( (lv_members_4_0= ruleExpression ) )?
                    	    int alt35=2;
                    	    int LA35_0 = input.LA(1);

                    	    if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_TX)||LA35_0==23||(LA35_0>=54 && LA35_0<=68)||(LA35_0>=71 && LA35_0<=175)||(LA35_0>=205 && LA35_0<=206)||(LA35_0>=217 && LA35_0<=218)) ) {
                    	        alt35=1;
                    	    }
                    	    switch (alt35) {
                    	        case 1 :
                    	            // InternalOptGrammar.g:1950:6: (lv_members_4_0= ruleExpression )
                    	            {
                    	            // InternalOptGrammar.g:1950:6: (lv_members_4_0= ruleExpression )
                    	            // InternalOptGrammar.g:1951:7: lv_members_4_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getTupleAccess().getMembersExpressionParserRuleCall_2_1_1_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_31);
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
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
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
    // InternalOptGrammar.g:1978:1: entryRuleTupleSeparator returns [EObject current=null] : iv_ruleTupleSeparator= ruleTupleSeparator EOF ;
    public final EObject entryRuleTupleSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleSeparator = null;


        try {
            // InternalOptGrammar.g:1978:55: (iv_ruleTupleSeparator= ruleTupleSeparator EOF )
            // InternalOptGrammar.g:1979:2: iv_ruleTupleSeparator= ruleTupleSeparator EOF
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
    // InternalOptGrammar.g:1985:1: ruleTupleSeparator returns [EObject current=null] : (otherlv_0= ',' () ) ;
    public final EObject ruleTupleSeparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1991:2: ( (otherlv_0= ',' () ) )
            // InternalOptGrammar.g:1992:2: (otherlv_0= ',' () )
            {
            // InternalOptGrammar.g:1992:2: (otherlv_0= ',' () )
            // InternalOptGrammar.g:1993:3: otherlv_0= ',' ()
            {
            otherlv_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleSeparatorAccess().getCommaKeyword_0());
              		
            }
            // InternalOptGrammar.g:1997:3: ()
            // InternalOptGrammar.g:1998:4: 
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
    // InternalOptGrammar.g:2008:1: entryRuleSimpleStatement returns [EObject current=null] : iv_ruleSimpleStatement= ruleSimpleStatement EOF ;
    public final EObject entryRuleSimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement = null;


        try {
            // InternalOptGrammar.g:2008:56: (iv_ruleSimpleStatement= ruleSimpleStatement EOF )
            // InternalOptGrammar.g:2009:2: iv_ruleSimpleStatement= ruleSimpleStatement EOF
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
    // InternalOptGrammar.g:2015:1: ruleSimpleStatement returns [EObject current=null] : ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) ;
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
            // InternalOptGrammar.g:2021:2: ( ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) )
            // InternalOptGrammar.g:2022:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            {
            // InternalOptGrammar.g:2022:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            // InternalOptGrammar.g:2023:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) )
            {
            // InternalOptGrammar.g:2023:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt41=3;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalOptGrammar.g:2024:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalOptGrammar.g:2024:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalOptGrammar.g:2025:5: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStatementAccess().getStandardTypeWithoutQualifiedIdentifierParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    this_StandardTypeWithoutQualifiedIdentifier_0=ruleStandardTypeWithoutQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_StandardTypeWithoutQualifiedIdentifier_0;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalOptGrammar.g:2033:5: ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalOptGrammar.g:2034:6: () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalOptGrammar.g:2034:6: ()
                    // InternalOptGrammar.g:2035:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getSimpleStatementAccess().getStandardVariableDeclarationTypeAction_0_0_1_0(),
                      								current);
                      						
                    }

                    }

                    // InternalOptGrammar.g:2041:6: ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==27||LA38_0==31||(LA38_0>=176 && LA38_0<=182)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2042:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalOptGrammar.g:2042:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalOptGrammar.g:2043:8: lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getPtionalElementsVariableDeclarationOptionalElementParserRuleCall_0_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop38;
                        }
                    } while (true);

                    // InternalOptGrammar.g:2060:6: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalOptGrammar.g:2061:7: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:2061:7: (lv_variable_3_0= ruleVariable )
                    // InternalOptGrammar.g:2062:8: lv_variable_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getVariableVariableParserRuleCall_0_0_1_2_0());
                      							
                    }
                    pushFollow(FOLLOW_33);
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

                    // InternalOptGrammar.g:2079:6: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==30) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalOptGrammar.g:2080:7: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_0_1_3_0());
                              						
                            }
                            // InternalOptGrammar.g:2084:7: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalOptGrammar.g:2085:8: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2085:8: (lv_expression_5_0= ruleExpression )
                            // InternalOptGrammar.g:2086:9: lv_expression_5_0= ruleExpression
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
                    // InternalOptGrammar.g:2107:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalOptGrammar.g:2107:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalOptGrammar.g:2108:5: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStatementAccess().getVarTypeParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_34);
                    ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalOptGrammar.g:2115:5: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==23) ) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalOptGrammar.g:2116:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2116:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2117:7: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2117:7: ()
                            // InternalOptGrammar.g:2118:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTypeDeclarationAction_0_1_1_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalOptGrammar.g:2124:7: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalOptGrammar.g:2125:8: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalOptGrammar.g:2125:8: (lv_variable_8_0= ruleVariable )
                            // InternalOptGrammar.g:2126:9: lv_variable_8_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getVariableVariableParserRuleCall_0_1_1_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_35);
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

                            // InternalOptGrammar.g:2143:7: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2144:8: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_9, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_0_2_0());
                              							
                            }
                            // InternalOptGrammar.g:2148:8: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalOptGrammar.g:2149:9: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2149:9: (lv_expression_10_0= ruleExpression )
                            // InternalOptGrammar.g:2150:10: lv_expression_10_0= ruleExpression
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
                            // InternalOptGrammar.g:2170:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2170:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2171:7: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2171:7: ()
                            // InternalOptGrammar.g:2172:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTupleVariableDeclarationAction_0_1_1_1_0(),
                              									current);
                              							
                            }

                            }

                            // InternalOptGrammar.g:2178:7: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalOptGrammar.g:2179:8: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalOptGrammar.g:2179:8: (lv_tuple_12_0= ruleTuple )
                            // InternalOptGrammar.g:2180:9: lv_tuple_12_0= ruleTuple
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getTupleTupleParserRuleCall_0_1_1_1_1_0());
                              								
                            }
                            pushFollow(FOLLOW_35);
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

                            // InternalOptGrammar.g:2197:7: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2198:8: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_13, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_1_2_0());
                              							
                            }
                            // InternalOptGrammar.g:2202:8: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalOptGrammar.g:2203:9: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2203:9: (lv_expression_14_0= ruleExpression )
                            // InternalOptGrammar.g:2204:10: lv_expression_14_0= ruleExpression
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
                    // InternalOptGrammar.g:2226:4: this_ExpressionStatement_15= ruleExpressionStatement
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

            // InternalOptGrammar.g:2235:3: ( (lv_semicolon_16_0= ';' ) )
            // InternalOptGrammar.g:2236:4: (lv_semicolon_16_0= ';' )
            {
            // InternalOptGrammar.g:2236:4: (lv_semicolon_16_0= ';' )
            // InternalOptGrammar.g:2237:5: lv_semicolon_16_0= ';'
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
    // InternalOptGrammar.g:2253:1: entryRuleSimpleStatement2 returns [EObject current=null] : iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF ;
    public final EObject entryRuleSimpleStatement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement2 = null;


        try {
            // InternalOptGrammar.g:2253:57: (iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF )
            // InternalOptGrammar.g:2254:2: iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF
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
    // InternalOptGrammar.g:2260:1: ruleSimpleStatement2 returns [EObject current=null] : ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ;
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
            // InternalOptGrammar.g:2266:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) )
            // InternalOptGrammar.g:2267:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            {
            // InternalOptGrammar.g:2267:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt45=3;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalOptGrammar.g:2268:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalOptGrammar.g:2268:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalOptGrammar.g:2269:4: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatement2Access().getStandardTypeWithoutQualifiedIdentifierParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_StandardTypeWithoutQualifiedIdentifier_0=ruleStandardTypeWithoutQualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_StandardTypeWithoutQualifiedIdentifier_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalOptGrammar.g:2277:4: ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalOptGrammar.g:2278:5: () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalOptGrammar.g:2278:5: ()
                    // InternalOptGrammar.g:2279:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getSimpleStatement2Access().getStandardVariableDeclarationTypeAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalOptGrammar.g:2285:5: ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==27||LA42_0==31||(LA42_0>=176 && LA42_0<=182)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2286:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalOptGrammar.g:2286:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalOptGrammar.g:2287:7: lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSimpleStatement2Access().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_0_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop42;
                        }
                    } while (true);

                    // InternalOptGrammar.g:2304:5: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalOptGrammar.g:2305:6: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:2305:6: (lv_variable_3_0= ruleVariable )
                    // InternalOptGrammar.g:2306:7: lv_variable_3_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSimpleStatement2Access().getVariableVariableParserRuleCall_0_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalOptGrammar.g:2323:5: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==30) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalOptGrammar.g:2324:6: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_0_1_3_0());
                              					
                            }
                            // InternalOptGrammar.g:2328:6: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalOptGrammar.g:2329:7: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2329:7: (lv_expression_5_0= ruleExpression )
                            // InternalOptGrammar.g:2330:8: lv_expression_5_0= ruleExpression
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
                    // InternalOptGrammar.g:2351:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalOptGrammar.g:2351:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalOptGrammar.g:2352:4: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatement2Access().getVarTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_34);
                    ruleVarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalOptGrammar.g:2359:4: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==23) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalOptGrammar.g:2360:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2360:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2361:6: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2361:6: ()
                            // InternalOptGrammar.g:2362:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTypeDeclarationAction_1_1_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalOptGrammar.g:2368:6: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalOptGrammar.g:2369:7: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalOptGrammar.g:2369:7: (lv_variable_8_0= ruleVariable )
                            // InternalOptGrammar.g:2370:8: lv_variable_8_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getVariableVariableParserRuleCall_1_1_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_35);
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

                            // InternalOptGrammar.g:2387:6: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2388:7: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_9, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_0_2_0());
                              						
                            }
                            // InternalOptGrammar.g:2392:7: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalOptGrammar.g:2393:8: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2393:8: (lv_expression_10_0= ruleExpression )
                            // InternalOptGrammar.g:2394:9: lv_expression_10_0= ruleExpression
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
                            // InternalOptGrammar.g:2414:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2414:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2415:6: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2415:6: ()
                            // InternalOptGrammar.g:2416:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTupleVariableDeclarationAction_1_1_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalOptGrammar.g:2422:6: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalOptGrammar.g:2423:7: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalOptGrammar.g:2423:7: (lv_tuple_12_0= ruleTuple )
                            // InternalOptGrammar.g:2424:8: lv_tuple_12_0= ruleTuple
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleStatement2Access().getTupleTupleParserRuleCall_1_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_35);
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

                            // InternalOptGrammar.g:2441:6: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2442:7: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_13, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_1_2_0());
                              						
                            }
                            // InternalOptGrammar.g:2446:7: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalOptGrammar.g:2447:8: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2447:8: (lv_expression_14_0= ruleExpression )
                            // InternalOptGrammar.g:2448:9: lv_expression_14_0= ruleExpression
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
                    // InternalOptGrammar.g:2470:3: this_ExpressionStatement_15= ruleExpressionStatement
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
    // InternalOptGrammar.g:2482:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalOptGrammar.g:2482:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalOptGrammar.g:2483:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
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
    // InternalOptGrammar.g:2489:1: ruleExpressionStatement returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2495:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalOptGrammar.g:2496:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalOptGrammar.g:2496:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalOptGrammar.g:2497:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalOptGrammar.g:2497:3: (lv_expression_0_0= ruleExpression )
            // InternalOptGrammar.g:2498:4: lv_expression_0_0= ruleExpression
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
    // InternalOptGrammar.g:2518:1: entryRuleQualifiedIdentifier returns [EObject current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final EObject entryRuleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedIdentifier = null;


        try {
            // InternalOptGrammar.g:2518:60: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // InternalOptGrammar.g:2519:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
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
    // InternalOptGrammar.g:2525:1: ruleQualifiedIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) ;
    public final EObject ruleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        EObject lv_qualifiers_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2531:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) )
            // InternalOptGrammar.g:2532:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            {
            // InternalOptGrammar.g:2532:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            // InternalOptGrammar.g:2533:3: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )*
            {
            // InternalOptGrammar.g:2533:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalOptGrammar.g:2534:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:2534:4: (lv_identifier_0_0= RULE_ID )
            // InternalOptGrammar.g:2535:5: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
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

            // InternalOptGrammar.g:2551:3: ( (lv_qualifiers_1_0= ruleQualifier ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==23||LA46_0==34||LA46_0==37) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalOptGrammar.g:2552:4: (lv_qualifiers_1_0= ruleQualifier )
            	    {
            	    // InternalOptGrammar.g:2552:4: (lv_qualifiers_1_0= ruleQualifier )
            	    // InternalOptGrammar.g:2553:5: lv_qualifiers_1_0= ruleQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getQualifiedIdentifierAccess().getQualifiersQualifierParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop46;
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
    // InternalOptGrammar.g:2574:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalOptGrammar.g:2574:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalOptGrammar.g:2575:2: iv_ruleQualifier= ruleQualifier EOF
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
    // InternalOptGrammar.g:2581:1: ruleQualifier returns [EObject current=null] : (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Index_1 = null;

        EObject this_Arguments_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2587:2: ( (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) )
            // InternalOptGrammar.g:2588:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            {
            // InternalOptGrammar.g:2588:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt47=1;
                }
                break;
            case 34:
                {
                alt47=2;
                }
                break;
            case 23:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalOptGrammar.g:2589:3: this_Field_0= ruleField
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
                    // InternalOptGrammar.g:2598:3: this_Index_1= ruleIndex
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
                    // InternalOptGrammar.g:2607:3: this_Arguments_2= ruleArguments
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
    // InternalOptGrammar.g:2619:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalOptGrammar.g:2619:46: (iv_ruleField= ruleField EOF )
            // InternalOptGrammar.g:2620:2: iv_ruleField= ruleField EOF
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
    // InternalOptGrammar.g:2626:1: ruleField returns [EObject current=null] : (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_field_1_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:2632:2: ( (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) )
            // InternalOptGrammar.g:2633:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            {
            // InternalOptGrammar.g:2633:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            // InternalOptGrammar.g:2634:3: otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFullStopKeyword_0());
              		
            }
            // InternalOptGrammar.g:2638:3: ( (lv_field_1_0= RULE_ID ) )
            // InternalOptGrammar.g:2639:4: (lv_field_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:2639:4: (lv_field_1_0= RULE_ID )
            // InternalOptGrammar.g:2640:5: lv_field_1_0= RULE_ID
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
    // InternalOptGrammar.g:2660:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // InternalOptGrammar.g:2660:46: (iv_ruleIndex= ruleIndex EOF )
            // InternalOptGrammar.g:2661:2: iv_ruleIndex= ruleIndex EOF
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
    // InternalOptGrammar.g:2667:1: ruleIndex returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2673:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) )
            // InternalOptGrammar.g:2674:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            {
            // InternalOptGrammar.g:2674:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            // InternalOptGrammar.g:2675:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:2679:3: ()
            // InternalOptGrammar.g:2680:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndexAccess().getIndexAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:2686:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_TX)||LA48_0==23||(LA48_0>=54 && LA48_0<=68)||(LA48_0>=71 && LA48_0<=175)||(LA48_0>=205 && LA48_0<=206)||(LA48_0>=217 && LA48_0<=218)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOptGrammar.g:2687:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:2687:4: (lv_value_2_0= ruleExpression )
                    // InternalOptGrammar.g:2688:5: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIndexAccess().getValueExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_30);
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
    // InternalOptGrammar.g:2713:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalOptGrammar.g:2713:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalOptGrammar.g:2714:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalOptGrammar.g:2720:1: ruleArguments returns [EObject current=null] : ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2726:2: ( ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) )
            // InternalOptGrammar.g:2727:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            {
            // InternalOptGrammar.g:2727:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            // InternalOptGrammar.g:2728:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            {
            // InternalOptGrammar.g:2728:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            // InternalOptGrammar.g:2729:4: lv_arguments_0_0= ruleFunctionCallArguments
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
    // InternalOptGrammar.g:2749:1: entryRuleModifierInvocation returns [EObject current=null] : iv_ruleModifierInvocation= ruleModifierInvocation EOF ;
    public final EObject entryRuleModifierInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierInvocation = null;


        try {
            // InternalOptGrammar.g:2749:59: (iv_ruleModifierInvocation= ruleModifierInvocation EOF )
            // InternalOptGrammar.g:2750:2: iv_ruleModifierInvocation= ruleModifierInvocation EOF
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
    // InternalOptGrammar.g:2756:1: ruleModifierInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleModifierInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2762:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalOptGrammar.g:2763:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalOptGrammar.g:2763:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalOptGrammar.g:2764:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalOptGrammar.g:2764:3: ( (otherlv_0= RULE_ID ) )
            // InternalOptGrammar.g:2765:4: (otherlv_0= RULE_ID )
            {
            // InternalOptGrammar.g:2765:4: (otherlv_0= RULE_ID )
            // InternalOptGrammar.g:2766:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModifierInvocationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModifierInvocationAccess().getNameModifierCrossReference_0_0());
              				
            }

            }


            }

            // InternalOptGrammar.g:2777:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==23) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOptGrammar.g:2778:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalOptGrammar.g:2778:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalOptGrammar.g:2779:5: lv_args_1_0= ruleFunctionCallListArguments
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
    // InternalOptGrammar.g:2800:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalOptGrammar.g:2800:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalOptGrammar.g:2801:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalOptGrammar.g:2807:1: ruleParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2813:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:2814:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:2814:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:2815:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:2819:3: ()
            // InternalOptGrammar.g:2820:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:2826:3: ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==32||LA51_0==36||(LA51_0>=72 && LA51_0<=175)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOptGrammar.g:2827:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // InternalOptGrammar.g:2827:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) )
                    // InternalOptGrammar.g:2828:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    {
                    // InternalOptGrammar.g:2828:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    // InternalOptGrammar.g:2829:6: lv_parameters_2_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterListAccess().getParametersVariableDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

                    // InternalOptGrammar.g:2846:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==24) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2847:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:2851:5: ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    // InternalOptGrammar.g:2852:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalOptGrammar.g:2852:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    // InternalOptGrammar.g:2853:7: lv_parameters_4_0= ruleVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParameterListAccess().getParametersVariableDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop50;
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
    // InternalOptGrammar.g:2880:1: entryRuleReturnsParameterList returns [EObject current=null] : iv_ruleReturnsParameterList= ruleReturnsParameterList EOF ;
    public final EObject entryRuleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsParameterList = null;


        try {
            // InternalOptGrammar.g:2880:61: (iv_ruleReturnsParameterList= ruleReturnsParameterList EOF )
            // InternalOptGrammar.g:2881:2: iv_ruleReturnsParameterList= ruleReturnsParameterList EOF
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
    // InternalOptGrammar.g:2887:1: ruleReturnsParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2893:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:2894:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:2894:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:2895:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnsParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:2899:3: ()
            // InternalOptGrammar.g:2900:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnsParameterListAccess().getReturnsParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:2906:3: ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||LA53_0==32||LA53_0==36||(LA53_0>=72 && LA53_0<=175)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOptGrammar.g:2907:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    {
                    // InternalOptGrammar.g:2907:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) )
                    // InternalOptGrammar.g:2908:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    {
                    // InternalOptGrammar.g:2908:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    // InternalOptGrammar.g:2909:6: lv_parameters_2_0= ruleReturnParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReturnsParameterListAccess().getParametersReturnParameterDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

                    // InternalOptGrammar.g:2926:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==24) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2927:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReturnsParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:2931:5: ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    // InternalOptGrammar.g:2932:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    {
                    	    // InternalOptGrammar.g:2932:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    // InternalOptGrammar.g:2933:7: lv_parameters_4_0= ruleReturnParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReturnsParameterListAccess().getParametersReturnParameterDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop52;
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
    // InternalOptGrammar.g:2960:1: entryRuleReturnParameterDeclaration returns [EObject current=null] : iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF ;
    public final EObject entryRuleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterDeclaration = null;


        try {
            // InternalOptGrammar.g:2960:67: (iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF )
            // InternalOptGrammar.g:2961:2: iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF
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
    // InternalOptGrammar.g:2967:1: ruleReturnParameterDeclaration returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) ;
    public final EObject ruleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_typeRef_0_0 = null;

        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2973:2: ( ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) )
            // InternalOptGrammar.g:2974:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            {
            // InternalOptGrammar.g:2974:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            // InternalOptGrammar.g:2975:3: ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )?
            {
            // InternalOptGrammar.g:2975:3: ( (lv_typeRef_0_0= ruleType ) )
            // InternalOptGrammar.g:2976:4: (lv_typeRef_0_0= ruleType )
            {
            // InternalOptGrammar.g:2976:4: (lv_typeRef_0_0= ruleType )
            // InternalOptGrammar.g:2977:5: lv_typeRef_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnParameterDeclarationAccess().getTypeRefTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            // InternalOptGrammar.g:2994:3: ( (lv_variable_1_0= ruleVariable ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOptGrammar.g:2995:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:2995:4: (lv_variable_1_0= ruleVariable )
                    // InternalOptGrammar.g:2996:5: lv_variable_1_0= ruleVariable
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
    // InternalOptGrammar.g:3017:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalOptGrammar.g:3017:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalOptGrammar.g:3018:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalOptGrammar.g:3024:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) ;
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
            // InternalOptGrammar.g:3030:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) )
            // InternalOptGrammar.g:3031:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            {
            // InternalOptGrammar.g:3031:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            int alt56=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt56=1;
                }
                break;
            case 41:
                {
                alt56=2;
                }
                break;
            case 42:
                {
                alt56=3;
                }
                break;
            case 17:
                {
                alt56=4;
                }
                break;
            case 47:
                {
                alt56=5;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 23:
            case 32:
            case 36:
            case 38:
            case 43:
            case 44:
            case 45:
            case 46:
            case 54:
            case 55:
            case 56:
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
            case 175:
            case 205:
            case 206:
            case 217:
            case 218:
                {
                alt56=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalOptGrammar.g:3032:3: this_IfStatement_0= ruleIfStatement
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
                    // InternalOptGrammar.g:3041:3: this_WhileStatement_1= ruleWhileStatement
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
                    // InternalOptGrammar.g:3050:3: this_ForStatement_2= ruleForStatement
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
                    // InternalOptGrammar.g:3059:3: this_Body_3= ruleBody
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
                    // InternalOptGrammar.g:3068:3: this_PlaceHolderStatement_4= rulePlaceHolderStatement
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
                    // InternalOptGrammar.g:3077:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    {
                    // InternalOptGrammar.g:3077:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    int alt55=6;
                    switch ( input.LA(1) ) {
                    case 43:
                        {
                        alt55=1;
                        }
                        break;
                    case 44:
                        {
                        alt55=2;
                        }
                        break;
                    case 45:
                        {
                        alt55=3;
                        }
                        break;
                    case 46:
                        {
                        alt55=4;
                        }
                        break;
                    case 38:
                        {
                        alt55=5;
                        }
                        break;
                    case RULE_ID:
                    case RULE_INT:
                    case RULE_STRING:
                    case RULE_HEX:
                    case RULE_DECIMAL:
                    case RULE_BLOCK:
                    case RULE_MSG:
                    case RULE_TX:
                    case 23:
                    case 32:
                    case 36:
                    case 54:
                    case 55:
                    case 56:
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
                    case 175:
                    case 205:
                    case 206:
                    case 217:
                    case 218:
                        {
                        alt55=6;
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
                            // InternalOptGrammar.g:3078:4: this_ContinueStatement_5= ruleContinueStatement
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
                            // InternalOptGrammar.g:3087:4: this_BreakStatement_6= ruleBreakStatement
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
                            // InternalOptGrammar.g:3096:4: this_ReturnStatement_7= ruleReturnStatement
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
                            // InternalOptGrammar.g:3105:4: this_ThrowStatement_8= ruleThrowStatement
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
                            // InternalOptGrammar.g:3114:4: this_DeleteStatement_9= ruleDeleteStatement
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
                            // InternalOptGrammar.g:3123:4: this_SimpleStatement_10= ruleSimpleStatement
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
    // InternalOptGrammar.g:3136:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // InternalOptGrammar.g:3136:56: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // InternalOptGrammar.g:3137:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
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
    // InternalOptGrammar.g:3143:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3149:2: ( (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) )
            // InternalOptGrammar.g:3150:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3150:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            // InternalOptGrammar.g:3151:3: otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
              		
            }
            // InternalOptGrammar.g:3155:3: ( (lv_variable_1_0= ruleQualifiedIdentifier ) )
            // InternalOptGrammar.g:3156:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            {
            // InternalOptGrammar.g:3156:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            // InternalOptGrammar.g:3157:5: lv_variable_1_0= ruleQualifiedIdentifier
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
    // InternalOptGrammar.g:3182:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalOptGrammar.g:3182:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalOptGrammar.g:3183:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalOptGrammar.g:3189:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) ;
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
            // InternalOptGrammar.g:3195:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) )
            // InternalOptGrammar.g:3196:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            {
            // InternalOptGrammar.g:3196:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            // InternalOptGrammar.g:3197:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3205:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalOptGrammar.g:3206:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:3206:4: (lv_condition_2_0= ruleExpression )
            // InternalOptGrammar.g:3207:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
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
            // InternalOptGrammar.g:3228:3: ( (lv_trueBody_4_0= ruleStatement ) )
            // InternalOptGrammar.g:3229:4: (lv_trueBody_4_0= ruleStatement )
            {
            // InternalOptGrammar.g:3229:4: (lv_trueBody_4_0= ruleStatement )
            // InternalOptGrammar.g:3230:5: lv_trueBody_4_0= ruleStatement
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

            // InternalOptGrammar.g:3247:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==40) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred1_InternalOptGrammar()) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalOptGrammar.g:3248:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) )
                    {
                    // InternalOptGrammar.g:3248:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalOptGrammar.g:3249:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalOptGrammar.g:3255:4: ( (lv_falseBody_6_0= ruleStatement ) )
                    // InternalOptGrammar.g:3256:5: (lv_falseBody_6_0= ruleStatement )
                    {
                    // InternalOptGrammar.g:3256:5: (lv_falseBody_6_0= ruleStatement )
                    // InternalOptGrammar.g:3257:6: lv_falseBody_6_0= ruleStatement
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
    // InternalOptGrammar.g:3279:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalOptGrammar.g:3279:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalOptGrammar.g:3280:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalOptGrammar.g:3286:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3292:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) )
            // InternalOptGrammar.g:3293:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // InternalOptGrammar.g:3293:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            // InternalOptGrammar.g:3294:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3302:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalOptGrammar.g:3303:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:3303:4: (lv_condition_2_0= ruleExpression )
            // InternalOptGrammar.g:3304:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
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
            // InternalOptGrammar.g:3325:3: ( (lv_body_4_0= ruleStatement ) )
            // InternalOptGrammar.g:3326:4: (lv_body_4_0= ruleStatement )
            {
            // InternalOptGrammar.g:3326:4: (lv_body_4_0= ruleStatement )
            // InternalOptGrammar.g:3327:5: lv_body_4_0= ruleStatement
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
    // InternalOptGrammar.g:3348:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalOptGrammar.g:3348:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalOptGrammar.g:3349:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalOptGrammar.g:3355:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) ;
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
            // InternalOptGrammar.g:3361:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) )
            // InternalOptGrammar.g:3362:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            {
            // InternalOptGrammar.g:3362:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            // InternalOptGrammar.g:3363:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3371:3: ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_TX)||LA58_0==23||LA58_0==32||LA58_0==36||(LA58_0>=54 && LA58_0<=68)||(LA58_0>=71 && LA58_0<=175)||(LA58_0>=205 && LA58_0<=206)||(LA58_0>=217 && LA58_0<=218)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOptGrammar.g:3372:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    {
                    // InternalOptGrammar.g:3372:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    // InternalOptGrammar.g:3373:5: lv_initExpression_2_0= ruleSimpleStatement2
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

            // InternalOptGrammar.g:3390:3: ( ( ';' )=>otherlv_3= ';' )
            // InternalOptGrammar.g:3391:4: ( ';' )=>otherlv_3= ';'
            {
            otherlv_3=(Token)match(input,18,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
              			
            }

            }

            // InternalOptGrammar.g:3397:3: ( (lv_conditionExpression_4_0= ruleExpression ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_TX)||LA59_0==23||(LA59_0>=54 && LA59_0<=68)||(LA59_0>=71 && LA59_0<=175)||(LA59_0>=205 && LA59_0<=206)||(LA59_0>=217 && LA59_0<=218)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOptGrammar.g:3398:4: (lv_conditionExpression_4_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:3398:4: (lv_conditionExpression_4_0= ruleExpression )
                    // InternalOptGrammar.g:3399:5: lv_conditionExpression_4_0= ruleExpression
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
            // InternalOptGrammar.g:3420:3: ( (lv_loopExpression_6_0= ruleExpressionStatement ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_TX)||LA60_0==23||(LA60_0>=54 && LA60_0<=68)||(LA60_0>=71 && LA60_0<=175)||(LA60_0>=205 && LA60_0<=206)||(LA60_0>=217 && LA60_0<=218)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOptGrammar.g:3421:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    {
                    // InternalOptGrammar.g:3421:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    // InternalOptGrammar.g:3422:5: lv_loopExpression_6_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getLoopExpressionExpressionStatementParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_18);
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
            // InternalOptGrammar.g:3443:3: ( (lv_body_8_0= ruleStatement ) )
            // InternalOptGrammar.g:3444:4: (lv_body_8_0= ruleStatement )
            {
            // InternalOptGrammar.g:3444:4: (lv_body_8_0= ruleStatement )
            // InternalOptGrammar.g:3445:5: lv_body_8_0= ruleStatement
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
    // InternalOptGrammar.g:3466:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalOptGrammar.g:3466:45: (iv_ruleBody= ruleBody EOF )
            // InternalOptGrammar.g:3467:2: iv_ruleBody= ruleBody EOF
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
    // InternalOptGrammar.g:3473:1: ruleBody returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3479:2: ( (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) )
            // InternalOptGrammar.g:3480:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            {
            // InternalOptGrammar.g:3480:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            // InternalOptGrammar.g:3481:3: otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:3485:3: ()
            // InternalOptGrammar.g:3486:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBodyAccess().getBlockAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3492:3: ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_TX)||LA62_0==17||LA62_0==23||LA62_0==32||LA62_0==36||(LA62_0>=38 && LA62_0<=39)||(LA62_0>=41 && LA62_0<=47)||(LA62_0>=54 && LA62_0<=68)||(LA62_0>=71 && LA62_0<=175)||(LA62_0>=205 && LA62_0<=206)||(LA62_0>=217 && LA62_0<=218)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOptGrammar.g:3493:4: ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )*
                    {
                    // InternalOptGrammar.g:3493:4: ( (lv_statements_2_0= ruleStatement ) )
                    // InternalOptGrammar.g:3494:5: (lv_statements_2_0= ruleStatement )
                    {
                    // InternalOptGrammar.g:3494:5: (lv_statements_2_0= ruleStatement )
                    // InternalOptGrammar.g:3495:6: lv_statements_2_0= ruleStatement
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

                    // InternalOptGrammar.g:3512:4: ( (lv_statements_3_0= ruleStatement ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_TX)||LA61_0==17||LA61_0==23||LA61_0==32||LA61_0==36||(LA61_0>=38 && LA61_0<=39)||(LA61_0>=41 && LA61_0<=47)||(LA61_0>=54 && LA61_0<=68)||(LA61_0>=71 && LA61_0<=175)||(LA61_0>=205 && LA61_0<=206)||(LA61_0>=217 && LA61_0<=218)) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalOptGrammar.g:3513:5: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // InternalOptGrammar.g:3513:5: (lv_statements_3_0= ruleStatement )
                    	    // InternalOptGrammar.g:3514:6: lv_statements_3_0= ruleStatement
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
                    	    break loop61;
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
    // InternalOptGrammar.g:3540:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // InternalOptGrammar.g:3540:58: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalOptGrammar.g:3541:2: iv_ruleContinueStatement= ruleContinueStatement EOF
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
    // InternalOptGrammar.g:3547:1: ruleContinueStatement returns [EObject current=null] : (otherlv_0= 'continue' () otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3553:2: ( (otherlv_0= 'continue' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:3554:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3554:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            // InternalOptGrammar.g:3555:3: otherlv_0= 'continue' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContinueStatementAccess().getContinueKeyword_0());
              		
            }
            // InternalOptGrammar.g:3559:3: ()
            // InternalOptGrammar.g:3560:4: 
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
    // InternalOptGrammar.g:3574:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalOptGrammar.g:3574:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalOptGrammar.g:3575:2: iv_ruleBreakStatement= ruleBreakStatement EOF
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
    // InternalOptGrammar.g:3581:1: ruleBreakStatement returns [EObject current=null] : (otherlv_0= 'break' () otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3587:2: ( (otherlv_0= 'break' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:3588:2: (otherlv_0= 'break' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3588:2: (otherlv_0= 'break' () otherlv_2= ';' )
            // InternalOptGrammar.g:3589:3: otherlv_0= 'break' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakStatementAccess().getBreakKeyword_0());
              		
            }
            // InternalOptGrammar.g:3593:3: ()
            // InternalOptGrammar.g:3594:4: 
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
    // InternalOptGrammar.g:3608:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalOptGrammar.g:3608:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalOptGrammar.g:3609:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalOptGrammar.g:3615:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3621:2: ( (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) )
            // InternalOptGrammar.g:3622:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            {
            // InternalOptGrammar.g:3622:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            // InternalOptGrammar.g:3623:3: otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
              		
            }
            // InternalOptGrammar.g:3627:3: ()
            // InternalOptGrammar.g:3628:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3634:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_TX)||LA63_0==23||(LA63_0>=54 && LA63_0<=68)||(LA63_0>=71 && LA63_0<=175)||(LA63_0>=205 && LA63_0<=206)||(LA63_0>=217 && LA63_0<=218)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOptGrammar.g:3635:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:3635:4: (lv_expression_2_0= ruleExpression )
                    // InternalOptGrammar.g:3636:5: lv_expression_2_0= ruleExpression
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
    // InternalOptGrammar.g:3661:1: entryRuleThrowStatement returns [EObject current=null] : iv_ruleThrowStatement= ruleThrowStatement EOF ;
    public final EObject entryRuleThrowStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStatement = null;


        try {
            // InternalOptGrammar.g:3661:55: (iv_ruleThrowStatement= ruleThrowStatement EOF )
            // InternalOptGrammar.g:3662:2: iv_ruleThrowStatement= ruleThrowStatement EOF
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
    // InternalOptGrammar.g:3668:1: ruleThrowStatement returns [EObject current=null] : (otherlv_0= 'throw' () otherlv_2= ';' ) ;
    public final EObject ruleThrowStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3674:2: ( (otherlv_0= 'throw' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:3675:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3675:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            // InternalOptGrammar.g:3676:3: otherlv_0= 'throw' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getThrowStatementAccess().getThrowKeyword_0());
              		
            }
            // InternalOptGrammar.g:3680:3: ()
            // InternalOptGrammar.g:3681:4: 
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
    // InternalOptGrammar.g:3695:1: entryRulePlaceHolderStatement returns [EObject current=null] : iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF ;
    public final EObject entryRulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceHolderStatement = null;


        try {
            // InternalOptGrammar.g:3695:61: (iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF )
            // InternalOptGrammar.g:3696:2: iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF
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
    // InternalOptGrammar.g:3702:1: rulePlaceHolderStatement returns [EObject current=null] : (otherlv_0= '_' () ) ;
    public final EObject rulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3708:2: ( (otherlv_0= '_' () ) )
            // InternalOptGrammar.g:3709:2: (otherlv_0= '_' () )
            {
            // InternalOptGrammar.g:3709:2: (otherlv_0= '_' () )
            // InternalOptGrammar.g:3710:3: otherlv_0= '_' ()
            {
            otherlv_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlaceHolderStatementAccess().get_Keyword_0());
              		
            }
            // InternalOptGrammar.g:3714:3: ()
            // InternalOptGrammar.g:3715:4: 
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
    // InternalOptGrammar.g:3725:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalOptGrammar.g:3725:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalOptGrammar.g:3726:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalOptGrammar.g:3732:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3738:2: (this_Assignment_0= ruleAssignment )
            // InternalOptGrammar.g:3739:2: this_Assignment_0= ruleAssignment
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
    // InternalOptGrammar.g:3750:1: entryRuleSpecialExpression returns [EObject current=null] : iv_ruleSpecialExpression= ruleSpecialExpression EOF ;
    public final EObject entryRuleSpecialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialExpression = null;


        try {
            // InternalOptGrammar.g:3750:58: (iv_ruleSpecialExpression= ruleSpecialExpression EOF )
            // InternalOptGrammar.g:3751:2: iv_ruleSpecialExpression= ruleSpecialExpression EOF
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
    // InternalOptGrammar.g:3757:1: ruleSpecialExpression returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) ;
    public final EObject ruleSpecialExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_fieldOrMethod_1_0 = null;

        EObject lv_qualifiers_2_1 = null;

        EObject lv_qualifiers_2_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3763:2: ( ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) )
            // InternalOptGrammar.g:3764:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            {
            // InternalOptGrammar.g:3764:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            // InternalOptGrammar.g:3765:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            {
            // InternalOptGrammar.g:3765:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) )
            // InternalOptGrammar.g:3766:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            {
            // InternalOptGrammar.g:3766:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            // InternalOptGrammar.g:3767:5: lv_type_0_0= ruleSpecialExpressionTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialExpressionAccess().getTypeSpecialExpressionTypeEnumEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_36);
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
              						"org.unicam.myGrammar.OptGrammar.SpecialExpressionTypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:3784:3: ( (lv_fieldOrMethod_1_0= ruleField ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==37) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalOptGrammar.g:3785:4: (lv_fieldOrMethod_1_0= ruleField )
                    {
                    // InternalOptGrammar.g:3785:4: (lv_fieldOrMethod_1_0= ruleField )
                    // InternalOptGrammar.g:3786:5: lv_fieldOrMethod_1_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecialExpressionAccess().getFieldOrMethodFieldParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_36);
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
                      						"org.unicam.myGrammar.OptGrammar.Field");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalOptGrammar.g:3803:3: ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==23||LA66_0==34) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalOptGrammar.g:3804:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    {
            	    // InternalOptGrammar.g:3804:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    // InternalOptGrammar.g:3805:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    {
            	    // InternalOptGrammar.g:3805:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==34) ) {
            	        alt65=1;
            	    }
            	    else if ( (LA65_0==23) ) {
            	        alt65=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 65, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // InternalOptGrammar.g:3806:6: lv_qualifiers_2_1= ruleIndex
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getSpecialExpressionAccess().getQualifiersIndexParserRuleCall_2_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_36);
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
            	              							"org.unicam.myGrammar.OptGrammar.Index");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalOptGrammar.g:3822:6: lv_qualifiers_2_2= ruleArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getSpecialExpressionAccess().getQualifiersArgumentsParserRuleCall_2_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_36);
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
            	              							"org.unicam.myGrammar.OptGrammar.Arguments");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // InternalOptGrammar.g:3844:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalOptGrammar.g:3844:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalOptGrammar.g:3845:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalOptGrammar.g:3851:1: ruleAssignment returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) ;
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
            // InternalOptGrammar.g:3857:2: ( (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) )
            // InternalOptGrammar.g:3858:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            {
            // InternalOptGrammar.g:3858:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            // InternalOptGrammar.g:3859:3: this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getBinaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_BinaryExpression_0=ruleBinaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BinaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:3867:3: ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            int alt68=3;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==30||(LA68_0>=183 && LA68_0<=193)) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_ID) ) {
                alt68=2;
            }
            switch (alt68) {
                case 1 :
                    // InternalOptGrammar.g:3868:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // InternalOptGrammar.g:3868:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    // InternalOptGrammar.g:3869:5: () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // InternalOptGrammar.g:3869:5: ()
                    // InternalOptGrammar.g:3870:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalOptGrammar.g:3876:5: ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) )
                    // InternalOptGrammar.g:3877:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    {
                    // InternalOptGrammar.g:3877:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    // InternalOptGrammar.g:3878:7: lv_assignmentOp_2_0= ruleAssignmentOpEnum
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssignmentAccess().getAssignmentOpAssignmentOpEnumEnumRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
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
                      								"org.unicam.myGrammar.OptGrammar.AssignmentOpEnum");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalOptGrammar.g:3895:5: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalOptGrammar.g:3896:6: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:3896:6: (lv_expression_3_0= ruleExpression )
                    // InternalOptGrammar.g:3897:7: lv_expression_3_0= ruleExpression
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
                      								"org.unicam.myGrammar.OptGrammar.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:3916:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    {
                    // InternalOptGrammar.g:3916:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    // InternalOptGrammar.g:3917:5: () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    {
                    // InternalOptGrammar.g:3917:5: ()
                    // InternalOptGrammar.g:3918:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getVariableDeclarationExpressionTypeAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalOptGrammar.g:3924:5: ( (lv_variable_5_0= ruleVariable ) )
                    // InternalOptGrammar.g:3925:6: (lv_variable_5_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:3925:6: (lv_variable_5_0= ruleVariable )
                    // InternalOptGrammar.g:3926:7: lv_variable_5_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
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
                      								"org.unicam.myGrammar.OptGrammar.Variable");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalOptGrammar.g:3943:5: (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==30) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalOptGrammar.g:3944:6: otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) )
                            {
                            otherlv_6=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1_2_0());
                              					
                            }
                            // InternalOptGrammar.g:3948:6: ( (lv_expression_7_0= ruleExpression ) )
                            // InternalOptGrammar.g:3949:7: (lv_expression_7_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:3949:7: (lv_expression_7_0= ruleExpression )
                            // InternalOptGrammar.g:3950:8: lv_expression_7_0= ruleExpression
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
    // InternalOptGrammar.g:3974:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalOptGrammar.g:3974:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalOptGrammar.g:3975:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalOptGrammar.g:3981:1: ruleBinaryExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3987:2: (this_Or_0= ruleOr )
            // InternalOptGrammar.g:3988:2: this_Or_0= ruleOr
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
    // InternalOptGrammar.g:3999:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalOptGrammar.g:3999:43: (iv_ruleOr= ruleOr EOF )
            // InternalOptGrammar.g:4000:2: iv_ruleOr= ruleOr EOF
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
    // InternalOptGrammar.g:4006:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4012:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalOptGrammar.g:4013:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalOptGrammar.g:4013:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalOptGrammar.g:4014:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4022:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==48) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalOptGrammar.g:4023:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalOptGrammar.g:4023:4: ()
            	    // InternalOptGrammar.g:4024:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4034:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalOptGrammar.g:4035:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalOptGrammar.g:4035:5: (lv_right_3_0= ruleAnd )
            	    // InternalOptGrammar.g:4036:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
            	      							"org.unicam.myGrammar.OptGrammar.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalOptGrammar.g:4058:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalOptGrammar.g:4058:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalOptGrammar.g:4059:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalOptGrammar.g:4065:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4071:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalOptGrammar.g:4072:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalOptGrammar.g:4072:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalOptGrammar.g:4073:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4081:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==49) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalOptGrammar.g:4082:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalOptGrammar.g:4082:4: ()
            	    // InternalOptGrammar.g:4083:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4093:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalOptGrammar.g:4094:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalOptGrammar.g:4094:5: (lv_right_3_0= ruleEquality )
            	    // InternalOptGrammar.g:4095:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
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
            	      							"org.unicam.myGrammar.OptGrammar.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalOptGrammar.g:4117:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalOptGrammar.g:4117:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalOptGrammar.g:4118:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalOptGrammar.g:4124:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_equalityOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4130:2: ( (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalOptGrammar.g:4131:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalOptGrammar.g:4131:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalOptGrammar.g:4132:3: this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4140:3: ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=194 && LA71_0<=195)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalOptGrammar.g:4141:4: () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalOptGrammar.g:4141:4: ()
            	    // InternalOptGrammar.g:4142:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalOptGrammar.g:4148:4: ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) )
            	    // InternalOptGrammar.g:4149:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    {
            	    // InternalOptGrammar.g:4149:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    // InternalOptGrammar.g:4150:6: lv_equalityOp_2_0= ruleEqualityOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getEqualityOpEqualityOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
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
            	      							"org.unicam.myGrammar.OptGrammar.EqualityOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalOptGrammar.g:4167:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalOptGrammar.g:4168:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalOptGrammar.g:4168:5: (lv_right_3_0= ruleComparison )
            	    // InternalOptGrammar.g:4169:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
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
            	      							"org.unicam.myGrammar.OptGrammar.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // InternalOptGrammar.g:4191:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalOptGrammar.g:4191:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalOptGrammar.g:4192:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalOptGrammar.g:4198:1: ruleComparison returns [EObject current=null] : (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BitOr_0 = null;

        Enumerator lv_comparisonOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4204:2: ( (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) )
            // InternalOptGrammar.g:4205:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            {
            // InternalOptGrammar.g:4205:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            // InternalOptGrammar.g:4206:3: this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getBitOrParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_BitOr_0=ruleBitOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitOr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4214:3: ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=196 && LA72_0<=200)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalOptGrammar.g:4215:4: () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) )
            	    {
            	    // InternalOptGrammar.g:4215:4: ()
            	    // InternalOptGrammar.g:4216:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalOptGrammar.g:4222:4: ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) )
            	    // InternalOptGrammar.g:4223:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    {
            	    // InternalOptGrammar.g:4223:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    // InternalOptGrammar.g:4224:6: lv_comparisonOp_2_0= ruleComparisonOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getComparisonOpComparisonOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
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
            	      							"org.unicam.myGrammar.OptGrammar.ComparisonOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalOptGrammar.g:4241:4: ( (lv_right_3_0= ruleBitOr ) )
            	    // InternalOptGrammar.g:4242:5: (lv_right_3_0= ruleBitOr )
            	    {
            	    // InternalOptGrammar.g:4242:5: (lv_right_3_0= ruleBitOr )
            	    // InternalOptGrammar.g:4243:6: lv_right_3_0= ruleBitOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightBitOrParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
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
            	      							"org.unicam.myGrammar.OptGrammar.BitOr");
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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalOptGrammar.g:4265:1: entryRuleBitOr returns [EObject current=null] : iv_ruleBitOr= ruleBitOr EOF ;
    public final EObject entryRuleBitOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitOr = null;


        try {
            // InternalOptGrammar.g:4265:46: (iv_ruleBitOr= ruleBitOr EOF )
            // InternalOptGrammar.g:4266:2: iv_ruleBitOr= ruleBitOr EOF
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
    // InternalOptGrammar.g:4272:1: ruleBitOr returns [EObject current=null] : (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) ;
    public final EObject ruleBitOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitXor_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4278:2: ( (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) )
            // InternalOptGrammar.g:4279:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            {
            // InternalOptGrammar.g:4279:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            // InternalOptGrammar.g:4280:3: this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitOrAccess().getBitXorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_BitXor_0=ruleBitXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitXor_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4288:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==50) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalOptGrammar.g:4289:4: () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) )
            	    {
            	    // InternalOptGrammar.g:4289:4: ()
            	    // InternalOptGrammar.g:4290:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitOrAccess().getBitOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitOrAccess().getVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4300:4: ( (lv_right_3_0= ruleBitXor ) )
            	    // InternalOptGrammar.g:4301:5: (lv_right_3_0= ruleBitXor )
            	    {
            	    // InternalOptGrammar.g:4301:5: (lv_right_3_0= ruleBitXor )
            	    // InternalOptGrammar.g:4302:6: lv_right_3_0= ruleBitXor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitOrAccess().getRightBitXorParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
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
            	      							"org.unicam.myGrammar.OptGrammar.BitXor");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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
    // $ANTLR end "ruleBitOr"


    // $ANTLR start "entryRuleBitXor"
    // InternalOptGrammar.g:4324:1: entryRuleBitXor returns [EObject current=null] : iv_ruleBitXor= ruleBitXor EOF ;
    public final EObject entryRuleBitXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitXor = null;


        try {
            // InternalOptGrammar.g:4324:47: (iv_ruleBitXor= ruleBitXor EOF )
            // InternalOptGrammar.g:4325:2: iv_ruleBitXor= ruleBitXor EOF
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
    // InternalOptGrammar.g:4331:1: ruleBitXor returns [EObject current=null] : (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) ;
    public final EObject ruleBitXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitAnd_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4337:2: ( (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) )
            // InternalOptGrammar.g:4338:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            {
            // InternalOptGrammar.g:4338:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            // InternalOptGrammar.g:4339:3: this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitXorAccess().getBitAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_BitAnd_0=ruleBitAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitAnd_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4347:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==51) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalOptGrammar.g:4348:4: () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) )
            	    {
            	    // InternalOptGrammar.g:4348:4: ()
            	    // InternalOptGrammar.g:4349:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitXorAccess().getBitXorLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitXorAccess().getCircumflexAccentKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4359:4: ( (lv_right_3_0= ruleBitAnd ) )
            	    // InternalOptGrammar.g:4360:5: (lv_right_3_0= ruleBitAnd )
            	    {
            	    // InternalOptGrammar.g:4360:5: (lv_right_3_0= ruleBitAnd )
            	    // InternalOptGrammar.g:4361:6: lv_right_3_0= ruleBitAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitXorAccess().getRightBitAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
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
            	      							"org.unicam.myGrammar.OptGrammar.BitAnd");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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
    // $ANTLR end "ruleBitXor"


    // $ANTLR start "entryRuleBitAnd"
    // InternalOptGrammar.g:4383:1: entryRuleBitAnd returns [EObject current=null] : iv_ruleBitAnd= ruleBitAnd EOF ;
    public final EObject entryRuleBitAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitAnd = null;


        try {
            // InternalOptGrammar.g:4383:47: (iv_ruleBitAnd= ruleBitAnd EOF )
            // InternalOptGrammar.g:4384:2: iv_ruleBitAnd= ruleBitAnd EOF
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
    // InternalOptGrammar.g:4390:1: ruleBitAnd returns [EObject current=null] : (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) ;
    public final EObject ruleBitAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Shift_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4396:2: ( (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) )
            // InternalOptGrammar.g:4397:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            {
            // InternalOptGrammar.g:4397:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            // InternalOptGrammar.g:4398:3: this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitAndAccess().getShiftParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_Shift_0=ruleShift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Shift_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4406:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==52) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalOptGrammar.g:4407:4: () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) )
            	    {
            	    // InternalOptGrammar.g:4407:4: ()
            	    // InternalOptGrammar.g:4408:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitAndAccess().getBitAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitAndAccess().getAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4418:4: ( (lv_right_3_0= ruleShift ) )
            	    // InternalOptGrammar.g:4419:5: (lv_right_3_0= ruleShift )
            	    {
            	    // InternalOptGrammar.g:4419:5: (lv_right_3_0= ruleShift )
            	    // InternalOptGrammar.g:4420:6: lv_right_3_0= ruleShift
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitAndAccess().getRightShiftParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
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
            	      							"org.unicam.myGrammar.OptGrammar.Shift");
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
    // $ANTLR end "ruleBitAnd"


    // $ANTLR start "entryRuleShift"
    // InternalOptGrammar.g:4442:1: entryRuleShift returns [EObject current=null] : iv_ruleShift= ruleShift EOF ;
    public final EObject entryRuleShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShift = null;


        try {
            // InternalOptGrammar.g:4442:46: (iv_ruleShift= ruleShift EOF )
            // InternalOptGrammar.g:4443:2: iv_ruleShift= ruleShift EOF
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
    // InternalOptGrammar.g:4449:1: ruleShift returns [EObject current=null] : (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) ;
    public final EObject ruleShift() throws RecognitionException {
        EObject current = null;

        EObject this_AddSub_0 = null;

        Enumerator lv_shiftOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4455:2: ( (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) )
            // InternalOptGrammar.g:4456:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            {
            // InternalOptGrammar.g:4456:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            // InternalOptGrammar.g:4457:3: this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftAccess().getAddSubParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_AddSub_0=ruleAddSub();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddSub_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4465:3: ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=201 && LA76_0<=203)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalOptGrammar.g:4466:4: () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) )
            	    {
            	    // InternalOptGrammar.g:4466:4: ()
            	    // InternalOptGrammar.g:4467:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getShiftAccess().getShiftLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalOptGrammar.g:4473:4: ( (lv_shiftOp_2_0= ruleShiftOpEnum ) )
            	    // InternalOptGrammar.g:4474:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    {
            	    // InternalOptGrammar.g:4474:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    // InternalOptGrammar.g:4475:6: lv_shiftOp_2_0= ruleShiftOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftAccess().getShiftOpShiftOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
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
            	      							"org.unicam.myGrammar.OptGrammar.ShiftOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalOptGrammar.g:4492:4: ( (lv_right_3_0= ruleAddSub ) )
            	    // InternalOptGrammar.g:4493:5: (lv_right_3_0= ruleAddSub )
            	    {
            	    // InternalOptGrammar.g:4493:5: (lv_right_3_0= ruleAddSub )
            	    // InternalOptGrammar.g:4494:6: lv_right_3_0= ruleAddSub
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftAccess().getRightAddSubParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
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
            	      							"org.unicam.myGrammar.OptGrammar.AddSub");
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
    // $ANTLR end "ruleShift"


    // $ANTLR start "entryRuleAddSub"
    // InternalOptGrammar.g:4516:1: entryRuleAddSub returns [EObject current=null] : iv_ruleAddSub= ruleAddSub EOF ;
    public final EObject entryRuleAddSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSub = null;


        try {
            // InternalOptGrammar.g:4516:47: (iv_ruleAddSub= ruleAddSub EOF )
            // InternalOptGrammar.g:4517:2: iv_ruleAddSub= ruleAddSub EOF
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
    // InternalOptGrammar.g:4523:1: ruleAddSub returns [EObject current=null] : (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) ;
    public final EObject ruleAddSub() throws RecognitionException {
        EObject current = null;

        EObject this_MulDivMod_0 = null;

        Enumerator lv_additionOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4529:2: ( (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) )
            // InternalOptGrammar.g:4530:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            {
            // InternalOptGrammar.g:4530:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            // InternalOptGrammar.g:4531:3: this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddSubAccess().getMulDivModParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_MulDivMod_0=ruleMulDivMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulDivMod_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4539:3: ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==56) && (synpred3_InternalOptGrammar())) {
                    alt77=1;
                }
                else if ( (LA77_0==57) && (synpred3_InternalOptGrammar())) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalOptGrammar.g:4540:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    {
            	    // InternalOptGrammar.g:4555:4: ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    // InternalOptGrammar.g:4556:5: () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) )
            	    {
            	    // InternalOptGrammar.g:4556:5: ()
            	    // InternalOptGrammar.g:4557:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAddSubAccess().getAddSubLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalOptGrammar.g:4563:5: ( (lv_additionOp_2_0= ruleAdditionOpEnum ) )
            	    // InternalOptGrammar.g:4564:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    {
            	    // InternalOptGrammar.g:4564:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    // InternalOptGrammar.g:4565:7: lv_additionOp_2_0= ruleAdditionOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddSubAccess().getAdditionOpAdditionOpEnumEnumRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_15);
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
            	      								"org.unicam.myGrammar.OptGrammar.AdditionOpEnum");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalOptGrammar.g:4582:5: ( (lv_right_3_0= ruleMulDivMod ) )
            	    // InternalOptGrammar.g:4583:6: (lv_right_3_0= ruleMulDivMod )
            	    {
            	    // InternalOptGrammar.g:4583:6: (lv_right_3_0= ruleMulDivMod )
            	    // InternalOptGrammar.g:4584:7: lv_right_3_0= ruleMulDivMod
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddSubAccess().getRightMulDivModParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_54);
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
            	      								"org.unicam.myGrammar.OptGrammar.MulDivMod");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

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
    // $ANTLR end "ruleAddSub"


    // $ANTLR start "entryRuleMulDivMod"
    // InternalOptGrammar.g:4607:1: entryRuleMulDivMod returns [EObject current=null] : iv_ruleMulDivMod= ruleMulDivMod EOF ;
    public final EObject entryRuleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDivMod = null;


        try {
            // InternalOptGrammar.g:4607:50: (iv_ruleMulDivMod= ruleMulDivMod EOF )
            // InternalOptGrammar.g:4608:2: iv_ruleMulDivMod= ruleMulDivMod EOF
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
    // InternalOptGrammar.g:4614:1: ruleMulDivMod returns [EObject current=null] : (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) ;
    public final EObject ruleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject this_Exponent_0 = null;

        Enumerator lv_multipliciativeOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4620:2: ( (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) )
            // InternalOptGrammar.g:4621:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            {
            // InternalOptGrammar.g:4621:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            // InternalOptGrammar.g:4622:3: this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulDivModAccess().getExponentParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_Exponent_0=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Exponent_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4630:3: ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=69 && LA78_0<=70)||LA78_0==204) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalOptGrammar.g:4631:4: () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) )
            	    {
            	    // InternalOptGrammar.g:4631:4: ()
            	    // InternalOptGrammar.g:4632:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulDivModAccess().getMulDivModLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalOptGrammar.g:4638:4: ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) )
            	    // InternalOptGrammar.g:4639:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    {
            	    // InternalOptGrammar.g:4639:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    // InternalOptGrammar.g:4640:6: lv_multipliciativeOp_2_0= ruleMulDivModOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulDivModAccess().getMultipliciativeOpMulDivModOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
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
            	      							"org.unicam.myGrammar.OptGrammar.MulDivModOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalOptGrammar.g:4657:4: ( (lv_right_3_0= ruleExponent ) )
            	    // InternalOptGrammar.g:4658:5: (lv_right_3_0= ruleExponent )
            	    {
            	    // InternalOptGrammar.g:4658:5: (lv_right_3_0= ruleExponent )
            	    // InternalOptGrammar.g:4659:6: lv_right_3_0= ruleExponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulDivModAccess().getRightExponentParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
            	      							"org.unicam.myGrammar.OptGrammar.Exponent");
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
    // $ANTLR end "ruleMulDivMod"


    // $ANTLR start "entryRuleExponent"
    // InternalOptGrammar.g:4681:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalOptGrammar.g:4681:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalOptGrammar.g:4682:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalOptGrammar.g:4688:1: ruleExponent returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4694:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalOptGrammar.g:4695:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalOptGrammar.g:4695:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalOptGrammar.g:4696:3: this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExponentAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:4704:3: ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==53) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalOptGrammar.g:4705:4: () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalOptGrammar.g:4705:4: ()
            	    // InternalOptGrammar.g:4706:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExponentAccess().getExponentLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4716:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalOptGrammar.g:4717:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalOptGrammar.g:4717:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalOptGrammar.g:4718:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExponentAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
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
            	      							"org.unicam.myGrammar.OptGrammar.UnaryExpression");
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
    // $ANTLR end "ruleExponent"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalOptGrammar.g:4740:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalOptGrammar.g:4740:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalOptGrammar.g:4741:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalOptGrammar.g:4747:1: ruleUnaryExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_BinaryNotExpression_1 = null;

        EObject this_SignExpression_2 = null;

        EObject this_NewExpression_3 = null;

        EObject this_PreExpression_4 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4753:2: ( (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) )
            // InternalOptGrammar.g:4754:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            {
            // InternalOptGrammar.g:4754:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            int alt80=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt80=1;
                }
                break;
            case 55:
                {
                alt80=2;
                }
                break;
            case 56:
            case 57:
                {
                alt80=3;
                }
                break;
            case 58:
                {
                alt80=4;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 23:
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
            case 175:
            case 205:
            case 206:
            case 217:
            case 218:
                {
                alt80=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalOptGrammar.g:4755:3: this_NotExpression_0= ruleNotExpression
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
                    // InternalOptGrammar.g:4764:3: this_BinaryNotExpression_1= ruleBinaryNotExpression
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
                    // InternalOptGrammar.g:4773:3: this_SignExpression_2= ruleSignExpression
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
                    // InternalOptGrammar.g:4782:3: this_NewExpression_3= ruleNewExpression
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
                    // InternalOptGrammar.g:4791:3: this_PreExpression_4= rulePreExpression
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
    // InternalOptGrammar.g:4803:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalOptGrammar.g:4803:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalOptGrammar.g:4804:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalOptGrammar.g:4810:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4816:2: ( (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalOptGrammar.g:4817:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalOptGrammar.g:4817:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalOptGrammar.g:4818:3: otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalOptGrammar.g:4822:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalOptGrammar.g:4823:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalOptGrammar.g:4823:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalOptGrammar.g:4824:5: lv_expression_1_0= ruleUnaryExpression
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
              						"org.unicam.myGrammar.OptGrammar.UnaryExpression");
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
    // InternalOptGrammar.g:4845:1: entryRuleBinaryNotExpression returns [EObject current=null] : iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF ;
    public final EObject entryRuleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryNotExpression = null;


        try {
            // InternalOptGrammar.g:4845:60: (iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF )
            // InternalOptGrammar.g:4846:2: iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF
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
    // InternalOptGrammar.g:4852:1: ruleBinaryNotExpression returns [EObject current=null] : (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4858:2: ( (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalOptGrammar.g:4859:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalOptGrammar.g:4859:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalOptGrammar.g:4860:3: otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBinaryNotExpressionAccess().getTildeKeyword_0());
              		
            }
            // InternalOptGrammar.g:4864:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalOptGrammar.g:4865:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalOptGrammar.g:4865:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalOptGrammar.g:4866:5: lv_expression_1_0= ruleUnaryExpression
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
              						"org.unicam.myGrammar.OptGrammar.UnaryExpression");
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
    // InternalOptGrammar.g:4887:1: entryRuleSignExpression returns [EObject current=null] : iv_ruleSignExpression= ruleSignExpression EOF ;
    public final EObject entryRuleSignExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignExpression = null;


        try {
            // InternalOptGrammar.g:4887:55: (iv_ruleSignExpression= ruleSignExpression EOF )
            // InternalOptGrammar.g:4888:2: iv_ruleSignExpression= ruleSignExpression EOF
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
    // InternalOptGrammar.g:4894:1: ruleSignExpression returns [EObject current=null] : ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleSignExpression() throws RecognitionException {
        EObject current = null;

        Token lv_signOp_0_1=null;
        Token lv_signOp_0_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4900:2: ( ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalOptGrammar.g:4901:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalOptGrammar.g:4901:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalOptGrammar.g:4902:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            // InternalOptGrammar.g:4902:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) )
            // InternalOptGrammar.g:4903:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            {
            // InternalOptGrammar.g:4903:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            // InternalOptGrammar.g:4904:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            {
            // InternalOptGrammar.g:4904:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==56) ) {
                alt81=1;
            }
            else if ( (LA81_0==57) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalOptGrammar.g:4905:6: lv_signOp_0_1= '+'
                    {
                    lv_signOp_0_1=(Token)match(input,56,FOLLOW_15); if (state.failed) return current;
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
                    // InternalOptGrammar.g:4916:6: lv_signOp_0_2= '-'
                    {
                    lv_signOp_0_2=(Token)match(input,57,FOLLOW_15); if (state.failed) return current;
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

            // InternalOptGrammar.g:4929:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalOptGrammar.g:4930:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalOptGrammar.g:4930:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalOptGrammar.g:4931:5: lv_expression_1_0= ruleUnaryExpression
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
              						"org.unicam.myGrammar.OptGrammar.UnaryExpression");
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
    // InternalOptGrammar.g:4952:1: entryRuleNewExpression returns [EObject current=null] : iv_ruleNewExpression= ruleNewExpression EOF ;
    public final EObject entryRuleNewExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewExpression = null;


        try {
            // InternalOptGrammar.g:4952:54: (iv_ruleNewExpression= ruleNewExpression EOF )
            // InternalOptGrammar.g:4953:2: iv_ruleNewExpression= ruleNewExpression EOF
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
    // InternalOptGrammar.g:4959:1: ruleNewExpression returns [EObject current=null] : (otherlv_0= 'new' ( (lv_contract_1_0= ruleContract ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) ;
    public final EObject ruleNewExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_contract_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4965:2: ( (otherlv_0= 'new' ( (lv_contract_1_0= ruleContract ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) )
            // InternalOptGrammar.g:4966:2: (otherlv_0= 'new' ( (lv_contract_1_0= ruleContract ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            {
            // InternalOptGrammar.g:4966:2: (otherlv_0= 'new' ( (lv_contract_1_0= ruleContract ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            // InternalOptGrammar.g:4967:3: otherlv_0= 'new' ( (lv_contract_1_0= ruleContract ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNewExpressionAccess().getNewKeyword_0());
              		
            }
            // InternalOptGrammar.g:4971:3: ( (lv_contract_1_0= ruleContract ) )
            // InternalOptGrammar.g:4972:4: (lv_contract_1_0= ruleContract )
            {
            // InternalOptGrammar.g:4972:4: (lv_contract_1_0= ruleContract )
            // InternalOptGrammar.g:4973:5: lv_contract_1_0= ruleContract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNewExpressionAccess().getContractContractParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_58);
            lv_contract_1_0=ruleContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNewExpressionRule());
              					}
              					set(
              						current,
              						"contract",
              						lv_contract_1_0,
              						"org.unicam.myGrammar.OptGrammar.Contract");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:4990:3: ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            // InternalOptGrammar.g:4991:4: (lv_args_2_0= ruleFunctionCallListArguments )
            {
            // InternalOptGrammar.g:4991:4: (lv_args_2_0= ruleFunctionCallListArguments )
            // InternalOptGrammar.g:4992:5: lv_args_2_0= ruleFunctionCallListArguments
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
              						"org.unicam.myGrammar.OptGrammar.FunctionCallListArguments");
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
    // InternalOptGrammar.g:5013:1: entryRulePreExpression returns [EObject current=null] : iv_rulePreExpression= rulePreExpression EOF ;
    public final EObject entryRulePreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreExpression = null;


        try {
            // InternalOptGrammar.g:5013:54: (iv_rulePreExpression= rulePreExpression EOF )
            // InternalOptGrammar.g:5014:2: iv_rulePreExpression= rulePreExpression EOF
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
    // InternalOptGrammar.g:5020:1: rulePreExpression returns [EObject current=null] : (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) ;
    public final EObject rulePreExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_PostIncDecExpression_0 = null;

        EObject this_PostIncDecExpression_2 = null;

        EObject this_PostIncDecExpression_5 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5026:2: ( (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) )
            // InternalOptGrammar.g:5027:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            {
            // InternalOptGrammar.g:5027:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 23:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
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
            case 175:
            case 205:
            case 206:
            case 217:
            case 218:
                {
                alt82=1;
                }
                break;
            case 59:
                {
                alt82=2;
                }
                break;
            case 60:
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
                    // InternalOptGrammar.g:5028:3: this_PostIncDecExpression_0= rulePostIncDecExpression
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
                    // InternalOptGrammar.g:5037:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    {
                    // InternalOptGrammar.g:5037:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    // InternalOptGrammar.g:5038:4: otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression ()
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59); if (state.failed) return current;
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
                    // InternalOptGrammar.g:5050:4: ()
                    // InternalOptGrammar.g:5051:5: 
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
                    // InternalOptGrammar.g:5059:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    {
                    // InternalOptGrammar.g:5059:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    // InternalOptGrammar.g:5060:4: otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression ()
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_59); if (state.failed) return current;
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
                    // InternalOptGrammar.g:5072:4: ()
                    // InternalOptGrammar.g:5073:5: 
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
    // InternalOptGrammar.g:5084:1: entryRulePostIncDecExpression returns [EObject current=null] : iv_rulePostIncDecExpression= rulePostIncDecExpression EOF ;
    public final EObject entryRulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostIncDecExpression = null;


        try {
            // InternalOptGrammar.g:5084:61: (iv_rulePostIncDecExpression= rulePostIncDecExpression EOF )
            // InternalOptGrammar.g:5085:2: iv_rulePostIncDecExpression= rulePostIncDecExpression EOF
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
    // InternalOptGrammar.g:5091:1: rulePostIncDecExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) ;
    public final EObject rulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_postOp_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5097:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) )
            // InternalOptGrammar.g:5098:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            {
            // InternalOptGrammar.g:5098:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            // InternalOptGrammar.g:5099:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPostIncDecExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalOptGrammar.g:5107:3: ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( ((LA83_0>=59 && LA83_0<=60)) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalOptGrammar.g:5108:4: () ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    {
            	    // InternalOptGrammar.g:5108:4: ()
            	    // InternalOptGrammar.g:5109:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPostIncDecExpressionAccess().getPostIncDecExpressionExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalOptGrammar.g:5115:4: ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    // InternalOptGrammar.g:5116:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    {
            	    // InternalOptGrammar.g:5116:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    // InternalOptGrammar.g:5117:6: lv_postOp_2_0= ruleIncDecOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPostIncDecExpressionAccess().getPostOpIncDecOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
            	      							"org.unicam.myGrammar.OptGrammar.IncDecOpEnum");
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
    // $ANTLR end "rulePostIncDecExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalOptGrammar.g:5139:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalOptGrammar.g:5139:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalOptGrammar.g:5140:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalOptGrammar.g:5146:1: rulePrimaryExpression returns [EObject current=null] : (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) ;
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
            // InternalOptGrammar.g:5152:2: ( (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) )
            // InternalOptGrammar.g:5153:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            {
            // InternalOptGrammar.g:5153:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            int alt90=7;
            switch ( input.LA(1) ) {
            case 217:
            case 218:
                {
                alt90=1;
                }
                break;
            case RULE_ID:
                {
                alt90=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 71:
            case 205:
            case 206:
                {
                alt90=3;
                }
                break;
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
            case 175:
                {
                alt90=4;
                }
                break;
            case 23:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt90=6;
                    }
                    break;
                case RULE_ID:
                case RULE_INT:
                case RULE_STRING:
                case RULE_HEX:
                case RULE_DECIMAL:
                case RULE_BLOCK:
                case RULE_MSG:
                case RULE_TX:
                case 23:
                case 54:
                case 55:
                case 56:
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
                case 175:
                case 205:
                case 206:
                case 217:
                case 218:
                    {
                    alt90=5;
                    }
                    break;
                case 25:
                    {
                    alt90=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 5, input);

                    throw nvae;
                }

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
                    // InternalOptGrammar.g:5154:3: this_SpecialExpression_0= ruleSpecialExpression
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
                    // InternalOptGrammar.g:5163:3: this_QualifiedIdentifier_1= ruleQualifiedIdentifier
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
                    // InternalOptGrammar.g:5172:3: this_Literal_2= ruleLiteral
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
                    // InternalOptGrammar.g:5181:3: this_TypeCast_3= ruleTypeCast
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
                    // InternalOptGrammar.g:5190:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    {
                    // InternalOptGrammar.g:5190:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    // InternalOptGrammar.g:5191:4: otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalOptGrammar.g:5203:4: ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==24) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalOptGrammar.g:5204:5: () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            {
                            // InternalOptGrammar.g:5204:5: ()
                            // InternalOptGrammar.g:5205:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndAdd(
                              							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_4_2_0(),
                              							current);
                              					
                            }

                            }

                            // InternalOptGrammar.g:5211:5: ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            int cnt85=0;
                            loop85:
                            do {
                                int alt85=2;
                                int LA85_0 = input.LA(1);

                                if ( (LA85_0==24) ) {
                                    alt85=1;
                                }


                                switch (alt85) {
                            	case 1 :
                            	    // InternalOptGrammar.g:5212:6: ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )?
                            	    {
                            	    // InternalOptGrammar.g:5212:6: ( (lv_members_7_0= ruleTupleSeparator ) )
                            	    // InternalOptGrammar.g:5213:7: (lv_members_7_0= ruleTupleSeparator )
                            	    {
                            	    // InternalOptGrammar.g:5213:7: (lv_members_7_0= ruleTupleSeparator )
                            	    // InternalOptGrammar.g:5214:8: lv_members_7_0= ruleTupleSeparator
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersTupleSeparatorParserRuleCall_4_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_31);
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
                            	      									"org.unicam.myGrammar.OptGrammar.TupleSeparator");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    // InternalOptGrammar.g:5231:6: ( (lv_members_8_0= ruleExpression ) )?
                            	    int alt84=2;
                            	    int LA84_0 = input.LA(1);

                            	    if ( ((LA84_0>=RULE_ID && LA84_0<=RULE_TX)||LA84_0==23||(LA84_0>=54 && LA84_0<=68)||(LA84_0>=71 && LA84_0<=175)||(LA84_0>=205 && LA84_0<=206)||(LA84_0>=217 && LA84_0<=218)) ) {
                            	        alt84=1;
                            	    }
                            	    switch (alt84) {
                            	        case 1 :
                            	            // InternalOptGrammar.g:5232:7: (lv_members_8_0= ruleExpression )
                            	            {
                            	            // InternalOptGrammar.g:5232:7: (lv_members_8_0= ruleExpression )
                            	            // InternalOptGrammar.g:5233:8: lv_members_8_0= ruleExpression
                            	            {
                            	            if ( state.backtracking==0 ) {

                            	              								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_4_2_1_1_0());
                            	              							
                            	            }
                            	            pushFollow(FOLLOW_31);
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
                            	    if ( cnt85 >= 1 ) break loop85;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(85, input);
                                        throw eee;
                                }
                                cnt85++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalOptGrammar.g:5258:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    {
                    // InternalOptGrammar.g:5258:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    // InternalOptGrammar.g:5259:4: otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')'
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTupleSeparatorParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_TupleSeparator_11=ruleTupleSeparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TupleSeparator_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalOptGrammar.g:5271:4: ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* )
                    // InternalOptGrammar.g:5272:5: () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    {
                    // InternalOptGrammar.g:5272:5: ()
                    // InternalOptGrammar.g:5273:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_5_2_0(),
                      							current);
                      					
                    }

                    }

                    // InternalOptGrammar.g:5279:5: ( (lv_members_13_0= ruleExpression ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( ((LA87_0>=RULE_ID && LA87_0<=RULE_TX)||LA87_0==23||(LA87_0>=54 && LA87_0<=68)||(LA87_0>=71 && LA87_0<=175)||(LA87_0>=205 && LA87_0<=206)||(LA87_0>=217 && LA87_0<=218)) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalOptGrammar.g:5280:6: (lv_members_13_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:5280:6: (lv_members_13_0= ruleExpression )
                            // InternalOptGrammar.g:5281:7: lv_members_13_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_5_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_31);
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
                              								"org.unicam.myGrammar.OptGrammar.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalOptGrammar.g:5298:5: ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==24) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalOptGrammar.g:5299:6: ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )?
                    	    {
                    	    // InternalOptGrammar.g:5299:6: ( (lv_members_14_0= ruleTupleSeparator ) )
                    	    // InternalOptGrammar.g:5300:7: (lv_members_14_0= ruleTupleSeparator )
                    	    {
                    	    // InternalOptGrammar.g:5300:7: (lv_members_14_0= ruleTupleSeparator )
                    	    // InternalOptGrammar.g:5301:8: lv_members_14_0= ruleTupleSeparator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersTupleSeparatorParserRuleCall_5_2_2_0_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_31);
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
                    	      									"org.unicam.myGrammar.OptGrammar.TupleSeparator");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }

                    	    // InternalOptGrammar.g:5318:6: ( (lv_members_15_0= ruleExpression ) )?
                    	    int alt88=2;
                    	    int LA88_0 = input.LA(1);

                    	    if ( ((LA88_0>=RULE_ID && LA88_0<=RULE_TX)||LA88_0==23||(LA88_0>=54 && LA88_0<=68)||(LA88_0>=71 && LA88_0<=175)||(LA88_0>=205 && LA88_0<=206)||(LA88_0>=217 && LA88_0<=218)) ) {
                    	        alt88=1;
                    	    }
                    	    switch (alt88) {
                    	        case 1 :
                    	            // InternalOptGrammar.g:5319:7: (lv_members_15_0= ruleExpression )
                    	            {
                    	            // InternalOptGrammar.g:5319:7: (lv_members_15_0= ruleExpression )
                    	            // InternalOptGrammar.g:5320:8: lv_members_15_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMembersExpressionParserRuleCall_5_2_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_31);
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
                    	    break loop89;
                        }
                    } while (true);


                    }

                    otherlv_16=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalOptGrammar.g:5345:3: (otherlv_17= '(' otherlv_18= ')' () )
                    {
                    // InternalOptGrammar.g:5345:3: (otherlv_17= '(' otherlv_18= ')' () )
                    // InternalOptGrammar.g:5346:4: otherlv_17= '(' otherlv_18= ')' ()
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    otherlv_18=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_6_1());
                      			
                    }
                    // InternalOptGrammar.g:5354:4: ()
                    // InternalOptGrammar.g:5355:5: 
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
    // InternalOptGrammar.g:5366:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalOptGrammar.g:5366:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalOptGrammar.g:5367:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalOptGrammar.g:5373:1: ruleLiteral returns [EObject current=null] : (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialVariables_0 = null;

        EObject this_BooleanConst_1 = null;

        EObject this_Number_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_GasleftFunction_4 = null;

        EObject this_BlockhashFunction_5 = null;

        EObject this_MathematicalFunction_6 = null;

        EObject this_HashFunction_7 = null;

        EObject this_EcrecoverFunction_8 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5379:2: ( (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction ) )
            // InternalOptGrammar.g:5380:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction )
            {
            // InternalOptGrammar.g:5380:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral | this_GasleftFunction_4= ruleGasleftFunction | this_BlockhashFunction_5= ruleBlockhashFunction | this_MathematicalFunction_6= ruleMathematicalFunction | this_HashFunction_7= ruleHashFunction | this_EcrecoverFunction_8= ruleEcrecoverFunction )
            int alt91=9;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
                {
                alt91=1;
                }
                break;
            case 205:
            case 206:
                {
                alt91=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case 71:
                {
                alt91=3;
                }
                break;
            case RULE_STRING:
                {
                alt91=4;
                }
                break;
            case 61:
                {
                alt91=5;
                }
                break;
            case 62:
                {
                alt91=6;
                }
                break;
            case 63:
            case 64:
                {
                alt91=7;
                }
                break;
            case 66:
            case 67:
            case 68:
                {
                alt91=8;
                }
                break;
            case 65:
                {
                alt91=9;
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
                    // InternalOptGrammar.g:5381:3: this_SpecialVariables_0= ruleSpecialVariables
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
                    // InternalOptGrammar.g:5390:3: this_BooleanConst_1= ruleBooleanConst
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
                    // InternalOptGrammar.g:5399:3: this_Number_2= ruleNumber
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
                    // InternalOptGrammar.g:5408:3: this_StringLiteral_3= ruleStringLiteral
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
                    // InternalOptGrammar.g:5417:3: this_GasleftFunction_4= ruleGasleftFunction
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
                    // InternalOptGrammar.g:5426:3: this_BlockhashFunction_5= ruleBlockhashFunction
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
                    // InternalOptGrammar.g:5435:3: this_MathematicalFunction_6= ruleMathematicalFunction
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
                    // InternalOptGrammar.g:5444:3: this_HashFunction_7= ruleHashFunction
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
                    // InternalOptGrammar.g:5453:3: this_EcrecoverFunction_8= ruleEcrecoverFunction
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
    // InternalOptGrammar.g:5465:1: entryRuleGasleftFunction returns [EObject current=null] : iv_ruleGasleftFunction= ruleGasleftFunction EOF ;
    public final EObject entryRuleGasleftFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGasleftFunction = null;


        try {
            // InternalOptGrammar.g:5465:56: (iv_ruleGasleftFunction= ruleGasleftFunction EOF )
            // InternalOptGrammar.g:5466:2: iv_ruleGasleftFunction= ruleGasleftFunction EOF
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
    // InternalOptGrammar.g:5472:1: ruleGasleftFunction returns [EObject current=null] : ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleGasleftFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5478:2: ( ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalOptGrammar.g:5479:2: ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalOptGrammar.g:5479:2: ( ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalOptGrammar.g:5480:3: ( (lv_name_0_0= 'gasleft' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalOptGrammar.g:5480:3: ( (lv_name_0_0= 'gasleft' ) )
            // InternalOptGrammar.g:5481:4: (lv_name_0_0= 'gasleft' )
            {
            // InternalOptGrammar.g:5481:4: (lv_name_0_0= 'gasleft' )
            // InternalOptGrammar.g:5482:5: lv_name_0_0= 'gasleft'
            {
            lv_name_0_0=(Token)match(input,61,FOLLOW_11); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
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
    // InternalOptGrammar.g:5506:1: entryRuleBlockhashFunction returns [EObject current=null] : iv_ruleBlockhashFunction= ruleBlockhashFunction EOF ;
    public final EObject entryRuleBlockhashFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockhashFunction = null;


        try {
            // InternalOptGrammar.g:5506:58: (iv_ruleBlockhashFunction= ruleBlockhashFunction EOF )
            // InternalOptGrammar.g:5507:2: iv_ruleBlockhashFunction= ruleBlockhashFunction EOF
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
    // InternalOptGrammar.g:5513:1: ruleBlockhashFunction returns [EObject current=null] : (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' ) ;
    public final EObject ruleBlockhashFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameter_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5519:2: ( (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' ) )
            // InternalOptGrammar.g:5520:2: (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            {
            // InternalOptGrammar.g:5520:2: (otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            // InternalOptGrammar.g:5521:3: otherlv_0= 'blockhash' otherlv_1= '(' ( (lv_parameter_2_0= ruleIntParameter ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockhashFunctionAccess().getBlockhashKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockhashFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:5529:3: ( (lv_parameter_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:5530:4: (lv_parameter_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:5530:4: (lv_parameter_2_0= ruleIntParameter )
            // InternalOptGrammar.g:5531:5: lv_parameter_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockhashFunctionAccess().getParameterIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
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
    // InternalOptGrammar.g:5556:1: entryRuleMathematicalFunction returns [EObject current=null] : iv_ruleMathematicalFunction= ruleMathematicalFunction EOF ;
    public final EObject entryRuleMathematicalFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathematicalFunction = null;


        try {
            // InternalOptGrammar.g:5556:61: (iv_ruleMathematicalFunction= ruleMathematicalFunction EOF )
            // InternalOptGrammar.g:5557:2: iv_ruleMathematicalFunction= ruleMathematicalFunction EOF
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
    // InternalOptGrammar.g:5563:1: ruleMathematicalFunction returns [EObject current=null] : ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' ) ;
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
            // InternalOptGrammar.g:5569:2: ( ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' ) )
            // InternalOptGrammar.g:5570:2: ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' )
            {
            // InternalOptGrammar.g:5570:2: ( ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')' )
            // InternalOptGrammar.g:5571:3: ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ')'
            {
            // InternalOptGrammar.g:5571:3: ( ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) ) )
            // InternalOptGrammar.g:5572:4: ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) )
            {
            // InternalOptGrammar.g:5572:4: ( (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' ) )
            // InternalOptGrammar.g:5573:5: (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' )
            {
            // InternalOptGrammar.g:5573:5: (lv_function_0_1= 'addmod' | lv_function_0_2= 'mulmod' )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==63) ) {
                alt92=1;
            }
            else if ( (LA92_0==64) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalOptGrammar.g:5574:6: lv_function_0_1= 'addmod'
                    {
                    lv_function_0_1=(Token)match(input,63,FOLLOW_11); if (state.failed) return current;
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
                    // InternalOptGrammar.g:5585:6: lv_function_0_2= 'mulmod'
                    {
                    lv_function_0_2=(Token)match(input,64,FOLLOW_11); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMathematicalFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:5602:3: ( (lv_parameters_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:5603:4: (lv_parameters_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:5603:4: (lv_parameters_2_0= ruleIntParameter )
            // InternalOptGrammar.g:5604:5: lv_parameters_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMathematicalFunctionAccess().getParametersIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            otherlv_3=(Token)match(input,24,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMathematicalFunctionAccess().getCommaKeyword_3());
              		
            }
            // InternalOptGrammar.g:5625:3: ( (lv_parameters_4_0= ruleIntParameter ) )
            // InternalOptGrammar.g:5626:4: (lv_parameters_4_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:5626:4: (lv_parameters_4_0= ruleIntParameter )
            // InternalOptGrammar.g:5627:5: lv_parameters_4_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMathematicalFunctionAccess().getParametersIntParameterParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            otherlv_5=(Token)match(input,24,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMathematicalFunctionAccess().getCommaKeyword_5());
              		
            }
            // InternalOptGrammar.g:5648:3: ( (lv_parameters_6_0= ruleIntParameter ) )
            // InternalOptGrammar.g:5649:4: (lv_parameters_6_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:5649:4: (lv_parameters_6_0= ruleIntParameter )
            // InternalOptGrammar.g:5650:5: lv_parameters_6_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMathematicalFunctionAccess().getParametersIntParameterParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_18);
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
    // InternalOptGrammar.g:5675:1: entryRuleEcrecoverFunction returns [EObject current=null] : iv_ruleEcrecoverFunction= ruleEcrecoverFunction EOF ;
    public final EObject entryRuleEcrecoverFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEcrecoverFunction = null;


        try {
            // InternalOptGrammar.g:5675:58: (iv_ruleEcrecoverFunction= ruleEcrecoverFunction EOF )
            // InternalOptGrammar.g:5676:2: iv_ruleEcrecoverFunction= ruleEcrecoverFunction EOF
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
    // InternalOptGrammar.g:5682:1: ruleEcrecoverFunction returns [EObject current=null] : ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' ) ;
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
            // InternalOptGrammar.g:5688:2: ( ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' ) )
            // InternalOptGrammar.g:5689:2: ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' )
            {
            // InternalOptGrammar.g:5689:2: ( ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')' )
            // InternalOptGrammar.g:5690:3: ( (lv_function_0_0= 'ecrecover' ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleIntParameter ) ) otherlv_5= ',' ( (lv_parameters_6_0= ruleIntParameter ) ) otherlv_7= ',' ( (lv_parameters_8_0= ruleIntParameter ) ) otherlv_9= ')'
            {
            // InternalOptGrammar.g:5690:3: ( (lv_function_0_0= 'ecrecover' ) )
            // InternalOptGrammar.g:5691:4: (lv_function_0_0= 'ecrecover' )
            {
            // InternalOptGrammar.g:5691:4: (lv_function_0_0= 'ecrecover' )
            // InternalOptGrammar.g:5692:5: lv_function_0_0= 'ecrecover'
            {
            lv_function_0_0=(Token)match(input,65,FOLLOW_11); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEcrecoverFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:5708:3: ( (lv_parameters_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:5709:4: (lv_parameters_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:5709:4: (lv_parameters_2_0= ruleIntParameter )
            // InternalOptGrammar.g:5710:5: lv_parameters_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            otherlv_3=(Token)match(input,24,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEcrecoverFunctionAccess().getCommaKeyword_3());
              		
            }
            // InternalOptGrammar.g:5731:3: ( (lv_parameters_4_0= ruleIntParameter ) )
            // InternalOptGrammar.g:5732:4: (lv_parameters_4_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:5732:4: (lv_parameters_4_0= ruleIntParameter )
            // InternalOptGrammar.g:5733:5: lv_parameters_4_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            otherlv_5=(Token)match(input,24,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEcrecoverFunctionAccess().getCommaKeyword_5());
              		
            }
            // InternalOptGrammar.g:5754:3: ( (lv_parameters_6_0= ruleIntParameter ) )
            // InternalOptGrammar.g:5755:4: (lv_parameters_6_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:5755:4: (lv_parameters_6_0= ruleIntParameter )
            // InternalOptGrammar.g:5756:5: lv_parameters_6_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            otherlv_7=(Token)match(input,24,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEcrecoverFunctionAccess().getCommaKeyword_7());
              		
            }
            // InternalOptGrammar.g:5777:3: ( (lv_parameters_8_0= ruleIntParameter ) )
            // InternalOptGrammar.g:5778:4: (lv_parameters_8_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:5778:4: (lv_parameters_8_0= ruleIntParameter )
            // InternalOptGrammar.g:5779:5: lv_parameters_8_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEcrecoverFunctionAccess().getParametersIntParameterParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_18);
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
    // InternalOptGrammar.g:5804:1: entryRuleHashFunction returns [EObject current=null] : iv_ruleHashFunction= ruleHashFunction EOF ;
    public final EObject entryRuleHashFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashFunction = null;


        try {
            // InternalOptGrammar.g:5804:53: (iv_ruleHashFunction= ruleHashFunction EOF )
            // InternalOptGrammar.g:5805:2: iv_ruleHashFunction= ruleHashFunction EOF
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
    // InternalOptGrammar.g:5811:1: ruleHashFunction returns [EObject current=null] : ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' ) ;
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
            // InternalOptGrammar.g:5817:2: ( ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' ) )
            // InternalOptGrammar.g:5818:2: ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            {
            // InternalOptGrammar.g:5818:2: ( ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')' )
            // InternalOptGrammar.g:5819:3: ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleIntParameter ) ) otherlv_3= ')'
            {
            // InternalOptGrammar.g:5819:3: ( ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) ) )
            // InternalOptGrammar.g:5820:4: ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) )
            {
            // InternalOptGrammar.g:5820:4: ( (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' ) )
            // InternalOptGrammar.g:5821:5: (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' )
            {
            // InternalOptGrammar.g:5821:5: (lv_name_0_1= 'keccak256' | lv_name_0_2= 'sha256' | lv_name_0_3= 'ripemd160' )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt93=1;
                }
                break;
            case 67:
                {
                alt93=2;
                }
                break;
            case 68:
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
                    // InternalOptGrammar.g:5822:6: lv_name_0_1= 'keccak256'
                    {
                    lv_name_0_1=(Token)match(input,66,FOLLOW_11); if (state.failed) return current;
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
                    // InternalOptGrammar.g:5833:6: lv_name_0_2= 'sha256'
                    {
                    lv_name_0_2=(Token)match(input,67,FOLLOW_11); if (state.failed) return current;
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
                    // InternalOptGrammar.g:5844:6: lv_name_0_3= 'ripemd160'
                    {
                    lv_name_0_3=(Token)match(input,68,FOLLOW_11); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHashFunctionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:5861:3: ( (lv_parameters_2_0= ruleIntParameter ) )
            // InternalOptGrammar.g:5862:4: (lv_parameters_2_0= ruleIntParameter )
            {
            // InternalOptGrammar.g:5862:4: (lv_parameters_2_0= ruleIntParameter )
            // InternalOptGrammar.g:5863:5: lv_parameters_2_0= ruleIntParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHashFunctionAccess().getParametersIntParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
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
    // InternalOptGrammar.g:5888:1: entryRuleIntParameter returns [EObject current=null] : iv_ruleIntParameter= ruleIntParameter EOF ;
    public final EObject entryRuleIntParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntParameter = null;


        try {
            // InternalOptGrammar.g:5888:53: (iv_ruleIntParameter= ruleIntParameter EOF )
            // InternalOptGrammar.g:5889:2: iv_ruleIntParameter= ruleIntParameter EOF
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
    // InternalOptGrammar.g:5895:1: ruleIntParameter returns [EObject current=null] : ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) ) ;
    public final EObject ruleIntParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_fun_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5901:2: ( ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) ) )
            // InternalOptGrammar.g:5902:2: ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) )
            {
            // InternalOptGrammar.g:5902:2: ( ( (lv_param_0_0= ruleArithmeticOperations ) ) | ( (lv_fun_1_0= ruleFunctionCall ) ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_INT||(LA94_0>=RULE_HEX && LA94_0<=RULE_DECIMAL)||LA94_0==23||LA94_0==71) ) {
                alt94=1;
            }
            else if ( (LA94_0==RULE_ID) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalOptGrammar.g:5903:3: ( (lv_param_0_0= ruleArithmeticOperations ) )
                    {
                    // InternalOptGrammar.g:5903:3: ( (lv_param_0_0= ruleArithmeticOperations ) )
                    // InternalOptGrammar.g:5904:4: (lv_param_0_0= ruleArithmeticOperations )
                    {
                    // InternalOptGrammar.g:5904:4: (lv_param_0_0= ruleArithmeticOperations )
                    // InternalOptGrammar.g:5905:5: lv_param_0_0= ruleArithmeticOperations
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
                    // InternalOptGrammar.g:5923:3: ( (lv_fun_1_0= ruleFunctionCall ) )
                    {
                    // InternalOptGrammar.g:5923:3: ( (lv_fun_1_0= ruleFunctionCall ) )
                    // InternalOptGrammar.g:5924:4: (lv_fun_1_0= ruleFunctionCall )
                    {
                    // InternalOptGrammar.g:5924:4: (lv_fun_1_0= ruleFunctionCall )
                    // InternalOptGrammar.g:5925:5: lv_fun_1_0= ruleFunctionCall
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
    // InternalOptGrammar.g:5946:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalOptGrammar.g:5946:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalOptGrammar.g:5947:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalOptGrammar.g:5953:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalOptGrammar.g:5959:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:5960:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:5960:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:5961:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalOptGrammar.g:5961:3: ( (otherlv_0= RULE_ID ) )
            // InternalOptGrammar.g:5962:4: (otherlv_0= RULE_ID )
            {
            // InternalOptGrammar.g:5962:4: (otherlv_0= RULE_ID )
            // InternalOptGrammar.g:5963:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getNameFunctionDefinitionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:5978:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_ID && LA96_0<=RULE_TX)||LA96_0==23||(LA96_0>=54 && LA96_0<=68)||(LA96_0>=71 && LA96_0<=175)||(LA96_0>=205 && LA96_0<=206)||(LA96_0>=217 && LA96_0<=218)) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalOptGrammar.g:5979:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalOptGrammar.g:5979:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalOptGrammar.g:5980:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:5980:5: (lv_parameters_2_0= ruleExpression )
                    // InternalOptGrammar.g:5981:6: lv_parameters_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

                    // InternalOptGrammar.g:5998:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==24) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalOptGrammar.g:5999:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:6003:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalOptGrammar.g:6004:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalOptGrammar.g:6004:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalOptGrammar.g:6005:7: lv_parameters_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop95;
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
    // InternalOptGrammar.g:6032:1: entryRuleArithmeticOperations returns [EObject current=null] : iv_ruleArithmeticOperations= ruleArithmeticOperations EOF ;
    public final EObject entryRuleArithmeticOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticOperations = null;


        try {
            // InternalOptGrammar.g:6032:61: (iv_ruleArithmeticOperations= ruleArithmeticOperations EOF )
            // InternalOptGrammar.g:6033:2: iv_ruleArithmeticOperations= ruleArithmeticOperations EOF
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
    // InternalOptGrammar.g:6039:1: ruleArithmeticOperations returns [EObject current=null] : ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* ) ;
    public final EObject ruleArithmeticOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_first_0_0 = null;

        EObject lv_seconds_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6045:2: ( ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* ) )
            // InternalOptGrammar.g:6046:2: ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* )
            {
            // InternalOptGrammar.g:6046:2: ( ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )* )
            // InternalOptGrammar.g:6047:3: ( (lv_first_0_0= rulePrimaryArithmetic ) ) ( (lv_seconds_1_0= ruleSecondOperators ) )*
            {
            // InternalOptGrammar.g:6047:3: ( (lv_first_0_0= rulePrimaryArithmetic ) )
            // InternalOptGrammar.g:6048:4: (lv_first_0_0= rulePrimaryArithmetic )
            {
            // InternalOptGrammar.g:6048:4: (lv_first_0_0= rulePrimaryArithmetic )
            // InternalOptGrammar.g:6049:5: lv_first_0_0= rulePrimaryArithmetic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArithmeticOperationsAccess().getFirstPrimaryArithmeticParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_63);
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

            // InternalOptGrammar.g:6066:3: ( (lv_seconds_1_0= ruleSecondOperators ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=56 && LA97_0<=57)||(LA97_0>=69 && LA97_0<=70)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalOptGrammar.g:6067:4: (lv_seconds_1_0= ruleSecondOperators )
            	    {
            	    // InternalOptGrammar.g:6067:4: (lv_seconds_1_0= ruleSecondOperators )
            	    // InternalOptGrammar.g:6068:5: lv_seconds_1_0= ruleSecondOperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getArithmeticOperationsAccess().getSecondsSecondOperatorsParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_63);
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
            	    break loop97;
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
    // InternalOptGrammar.g:6089:1: entryRulePrimaryArithmetic returns [EObject current=null] : iv_rulePrimaryArithmetic= rulePrimaryArithmetic EOF ;
    public final EObject entryRulePrimaryArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryArithmetic = null;


        try {
            // InternalOptGrammar.g:6089:58: (iv_rulePrimaryArithmetic= rulePrimaryArithmetic EOF )
            // InternalOptGrammar.g:6090:2: iv_rulePrimaryArithmetic= rulePrimaryArithmetic EOF
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
    // InternalOptGrammar.g:6096:1: rulePrimaryArithmetic returns [EObject current=null] : (this_Number_0= ruleNumber | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryArithmetic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Number_0 = null;

        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6102:2: ( (this_Number_0= ruleNumber | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) ) )
            // InternalOptGrammar.g:6103:2: (this_Number_0= ruleNumber | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            {
            // InternalOptGrammar.g:6103:2: (this_Number_0= ruleNumber | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_INT||(LA98_0>=RULE_HEX && LA98_0<=RULE_DECIMAL)||LA98_0==71) ) {
                alt98=1;
            }
            else if ( (LA98_0==23) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalOptGrammar.g:6104:3: this_Number_0= ruleNumber
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryArithmeticAccess().getNumberParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Number_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:6113:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalOptGrammar.g:6113:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalOptGrammar.g:6114:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryArithmeticAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryArithmeticAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
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
    // InternalOptGrammar.g:6135:1: entryRuleSecondOperators returns [EObject current=null] : iv_ruleSecondOperators= ruleSecondOperators EOF ;
    public final EObject entryRuleSecondOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondOperators = null;


        try {
            // InternalOptGrammar.g:6135:56: (iv_ruleSecondOperators= ruleSecondOperators EOF )
            // InternalOptGrammar.g:6136:2: iv_ruleSecondOperators= ruleSecondOperators EOF
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
    // InternalOptGrammar.g:6142:1: ruleSecondOperators returns [EObject current=null] : ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) ) ;
    public final EObject ruleSecondOperators() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        Token lv_operator_0_3=null;
        Token lv_operator_0_4=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6148:2: ( ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) ) )
            // InternalOptGrammar.g:6149:2: ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) )
            {
            // InternalOptGrammar.g:6149:2: ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) ) )
            // InternalOptGrammar.g:6150:3: ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) ) ( (lv_value_1_0= rulePrimaryArithmetic ) )
            {
            // InternalOptGrammar.g:6150:3: ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) ) )
            // InternalOptGrammar.g:6151:4: ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) )
            {
            // InternalOptGrammar.g:6151:4: ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' ) )
            // InternalOptGrammar.g:6152:5: (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' )
            {
            // InternalOptGrammar.g:6152:5: (lv_operator_0_1= '+' | lv_operator_0_2= '-' | lv_operator_0_3= '/' | lv_operator_0_4= '*' )
            int alt99=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt99=1;
                }
                break;
            case 57:
                {
                alt99=2;
                }
                break;
            case 69:
                {
                alt99=3;
                }
                break;
            case 70:
                {
                alt99=4;
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
                    // InternalOptGrammar.g:6153:6: lv_operator_0_1= '+'
                    {
                    lv_operator_0_1=(Token)match(input,56,FOLLOW_64); if (state.failed) return current;
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
                    // InternalOptGrammar.g:6164:6: lv_operator_0_2= '-'
                    {
                    lv_operator_0_2=(Token)match(input,57,FOLLOW_64); if (state.failed) return current;
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
                    // InternalOptGrammar.g:6175:6: lv_operator_0_3= '/'
                    {
                    lv_operator_0_3=(Token)match(input,69,FOLLOW_64); if (state.failed) return current;
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
                    // InternalOptGrammar.g:6186:6: lv_operator_0_4= '*'
                    {
                    lv_operator_0_4=(Token)match(input,70,FOLLOW_64); if (state.failed) return current;
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

            // InternalOptGrammar.g:6199:3: ( (lv_value_1_0= rulePrimaryArithmetic ) )
            // InternalOptGrammar.g:6200:4: (lv_value_1_0= rulePrimaryArithmetic )
            {
            // InternalOptGrammar.g:6200:4: (lv_value_1_0= rulePrimaryArithmetic )
            // InternalOptGrammar.g:6201:5: lv_value_1_0= rulePrimaryArithmetic
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
    // InternalOptGrammar.g:6222:1: entryRuleBooleanConst returns [EObject current=null] : iv_ruleBooleanConst= ruleBooleanConst EOF ;
    public final EObject entryRuleBooleanConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConst = null;


        try {
            // InternalOptGrammar.g:6222:53: (iv_ruleBooleanConst= ruleBooleanConst EOF )
            // InternalOptGrammar.g:6223:2: iv_ruleBooleanConst= ruleBooleanConst EOF
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
    // InternalOptGrammar.g:6229:1: ruleBooleanConst returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) ;
    public final EObject ruleBooleanConst() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6235:2: ( ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) )
            // InternalOptGrammar.g:6236:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            {
            // InternalOptGrammar.g:6236:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            // InternalOptGrammar.g:6237:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            {
            // InternalOptGrammar.g:6237:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            // InternalOptGrammar.g:6238:4: lv_value_0_0= ruleBooleanLiteralEnum
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


    // $ANTLR start "entryRuleNumber"
    // InternalOptGrammar.g:6258:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalOptGrammar.g:6258:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalOptGrammar.g:6259:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalOptGrammar.g:6265:1: ruleNumber returns [EObject current=null] : ( (this_NumberDimensionless_0= ruleNumberDimensionless | this_HexLiteral_1= ruleHexLiteral | this_DecimalLiteral_2= ruleDecimalLiteral | this_Now_3= ruleNow ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        EObject this_NumberDimensionless_0 = null;

        EObject this_HexLiteral_1 = null;

        EObject this_DecimalLiteral_2 = null;

        EObject this_Now_3 = null;

        EObject lv_etherUnit_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6271:2: ( ( (this_NumberDimensionless_0= ruleNumberDimensionless | this_HexLiteral_1= ruleHexLiteral | this_DecimalLiteral_2= ruleDecimalLiteral | this_Now_3= ruleNow ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? ) )
            // InternalOptGrammar.g:6272:2: ( (this_NumberDimensionless_0= ruleNumberDimensionless | this_HexLiteral_1= ruleHexLiteral | this_DecimalLiteral_2= ruleDecimalLiteral | this_Now_3= ruleNow ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? )
            {
            // InternalOptGrammar.g:6272:2: ( (this_NumberDimensionless_0= ruleNumberDimensionless | this_HexLiteral_1= ruleHexLiteral | this_DecimalLiteral_2= ruleDecimalLiteral | this_Now_3= ruleNow ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )? )
            // InternalOptGrammar.g:6273:3: (this_NumberDimensionless_0= ruleNumberDimensionless | this_HexLiteral_1= ruleHexLiteral | this_DecimalLiteral_2= ruleDecimalLiteral | this_Now_3= ruleNow ) ( (lv_etherUnit_4_0= ruleUnitTypes ) )?
            {
            // InternalOptGrammar.g:6273:3: (this_NumberDimensionless_0= ruleNumberDimensionless | this_HexLiteral_1= ruleHexLiteral | this_DecimalLiteral_2= ruleDecimalLiteral | this_Now_3= ruleNow )
            int alt100=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt100=1;
                }
                break;
            case RULE_HEX:
                {
                alt100=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt100=3;
                }
                break;
            case 71:
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
                    // InternalOptGrammar.g:6274:4: this_NumberDimensionless_0= ruleNumberDimensionless
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNumberAccess().getNumberDimensionlessParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_65);
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
                    // InternalOptGrammar.g:6283:4: this_HexLiteral_1= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNumberAccess().getHexLiteralParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_65);
                    this_HexLiteral_1=ruleHexLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_HexLiteral_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:6292:4: this_DecimalLiteral_2= ruleDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNumberAccess().getDecimalLiteralParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_65);
                    this_DecimalLiteral_2=ruleDecimalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_DecimalLiteral_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:6301:4: this_Now_3= ruleNow
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNumberAccess().getNowParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_65);
                    this_Now_3=ruleNow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Now_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalOptGrammar.g:6310:3: ( (lv_etherUnit_4_0= ruleUnitTypes ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_INT) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalOptGrammar.g:6311:4: (lv_etherUnit_4_0= ruleUnitTypes )
                    {
                    // InternalOptGrammar.g:6311:4: (lv_etherUnit_4_0= ruleUnitTypes )
                    // InternalOptGrammar.g:6312:5: lv_etherUnit_4_0= ruleUnitTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNumberAccess().getEtherUnitUnitTypesParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_etherUnit_4_0=ruleUnitTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNumberRule());
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleNow"
    // InternalOptGrammar.g:6333:1: entryRuleNow returns [EObject current=null] : iv_ruleNow= ruleNow EOF ;
    public final EObject entryRuleNow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNow = null;


        try {
            // InternalOptGrammar.g:6333:44: (iv_ruleNow= ruleNow EOF )
            // InternalOptGrammar.g:6334:2: iv_ruleNow= ruleNow EOF
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
    // InternalOptGrammar.g:6340:1: ruleNow returns [EObject current=null] : ( () otherlv_1= 'now' ) ;
    public final EObject ruleNow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6346:2: ( ( () otherlv_1= 'now' ) )
            // InternalOptGrammar.g:6347:2: ( () otherlv_1= 'now' )
            {
            // InternalOptGrammar.g:6347:2: ( () otherlv_1= 'now' )
            // InternalOptGrammar.g:6348:3: () otherlv_1= 'now'
            {
            // InternalOptGrammar.g:6348:3: ()
            // InternalOptGrammar.g:6349:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNowAccess().getNowAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:6363:1: entryRuleUnitTypes returns [EObject current=null] : iv_ruleUnitTypes= ruleUnitTypes EOF ;
    public final EObject entryRuleUnitTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitTypes = null;


        try {
            // InternalOptGrammar.g:6363:50: (iv_ruleUnitTypes= ruleUnitTypes EOF )
            // InternalOptGrammar.g:6364:2: iv_ruleUnitTypes= ruleUnitTypes EOF
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
    // InternalOptGrammar.g:6370:1: ruleUnitTypes returns [EObject current=null] : ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) ) ;
    public final EObject ruleUnitTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_time_0_0 = null;

        EObject lv_units_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6376:2: ( ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) ) )
            // InternalOptGrammar.g:6377:2: ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) )
            {
            // InternalOptGrammar.g:6377:2: ( ( (lv_time_0_0= ruleTime ) ) | ( (lv_units_1_0= ruleEther ) ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_INT) ) {
                int LA102_1 = input.LA(2);

                if ( ((LA102_1>=207 && LA102_1<=210)) ) {
                    alt102=2;
                }
                else if ( ((LA102_1>=211 && LA102_1<=216)) ) {
                    alt102=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalOptGrammar.g:6378:3: ( (lv_time_0_0= ruleTime ) )
                    {
                    // InternalOptGrammar.g:6378:3: ( (lv_time_0_0= ruleTime ) )
                    // InternalOptGrammar.g:6379:4: (lv_time_0_0= ruleTime )
                    {
                    // InternalOptGrammar.g:6379:4: (lv_time_0_0= ruleTime )
                    // InternalOptGrammar.g:6380:5: lv_time_0_0= ruleTime
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
                    // InternalOptGrammar.g:6398:3: ( (lv_units_1_0= ruleEther ) )
                    {
                    // InternalOptGrammar.g:6398:3: ( (lv_units_1_0= ruleEther ) )
                    // InternalOptGrammar.g:6399:4: (lv_units_1_0= ruleEther )
                    {
                    // InternalOptGrammar.g:6399:4: (lv_units_1_0= ruleEther )
                    // InternalOptGrammar.g:6400:5: lv_units_1_0= ruleEther
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
    // InternalOptGrammar.g:6421:1: entryRuleNumberDimensionless returns [EObject current=null] : iv_ruleNumberDimensionless= ruleNumberDimensionless EOF ;
    public final EObject entryRuleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberDimensionless = null;


        try {
            // InternalOptGrammar.g:6421:60: (iv_ruleNumberDimensionless= ruleNumberDimensionless EOF )
            // InternalOptGrammar.g:6422:2: iv_ruleNumberDimensionless= ruleNumberDimensionless EOF
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
    // InternalOptGrammar.g:6428:1: ruleNumberDimensionless returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6434:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalOptGrammar.g:6435:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalOptGrammar.g:6435:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalOptGrammar.g:6436:3: (lv_value_0_0= RULE_INT )
            {
            // InternalOptGrammar.g:6436:3: (lv_value_0_0= RULE_INT )
            // InternalOptGrammar.g:6437:4: lv_value_0_0= RULE_INT
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
    // InternalOptGrammar.g:6456:1: entryRuleEther returns [EObject current=null] : iv_ruleEther= ruleEther EOF ;
    public final EObject entryRuleEther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEther = null;


        try {
            // InternalOptGrammar.g:6456:46: (iv_ruleEther= ruleEther EOF )
            // InternalOptGrammar.g:6457:2: iv_ruleEther= ruleEther EOF
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
    // InternalOptGrammar.g:6463:1: ruleEther returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) ;
    public final EObject ruleEther() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_ether_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6469:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) )
            // InternalOptGrammar.g:6470:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            {
            // InternalOptGrammar.g:6470:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            // InternalOptGrammar.g:6471:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            {
            // InternalOptGrammar.g:6471:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalOptGrammar.g:6472:4: (lv_value_0_0= RULE_INT )
            {
            // InternalOptGrammar.g:6472:4: (lv_value_0_0= RULE_INT )
            // InternalOptGrammar.g:6473:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_66); if (state.failed) return current;
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

            // InternalOptGrammar.g:6489:3: ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            // InternalOptGrammar.g:6490:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            {
            // InternalOptGrammar.g:6490:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            // InternalOptGrammar.g:6491:5: lv_ether_1_0= ruleEtherSubDenominationEnum
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
    // InternalOptGrammar.g:6512:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalOptGrammar.g:6512:45: (iv_ruleTime= ruleTime EOF )
            // InternalOptGrammar.g:6513:2: iv_ruleTime= ruleTime EOF
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
    // InternalOptGrammar.g:6519:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_time_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6525:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) )
            // InternalOptGrammar.g:6526:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            {
            // InternalOptGrammar.g:6526:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            // InternalOptGrammar.g:6527:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            {
            // InternalOptGrammar.g:6527:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalOptGrammar.g:6528:4: (lv_value_0_0= RULE_INT )
            {
            // InternalOptGrammar.g:6528:4: (lv_value_0_0= RULE_INT )
            // InternalOptGrammar.g:6529:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_67); if (state.failed) return current;
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

            // InternalOptGrammar.g:6545:3: ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            // InternalOptGrammar.g:6546:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            {
            // InternalOptGrammar.g:6546:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            // InternalOptGrammar.g:6547:5: lv_time_1_0= ruleTimeSubdenominationEnum
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
    // InternalOptGrammar.g:6568:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalOptGrammar.g:6568:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalOptGrammar.g:6569:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalOptGrammar.g:6575:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6581:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalOptGrammar.g:6582:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalOptGrammar.g:6582:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalOptGrammar.g:6583:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalOptGrammar.g:6583:3: (lv_value_0_0= RULE_STRING )
            // InternalOptGrammar.g:6584:4: lv_value_0_0= RULE_STRING
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
    // InternalOptGrammar.g:6603:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // InternalOptGrammar.g:6603:51: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // InternalOptGrammar.g:6604:2: iv_ruleHexLiteral= ruleHexLiteral EOF
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
    // InternalOptGrammar.g:6610:1: ruleHexLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_HEX ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6616:2: ( ( (lv_value_0_0= RULE_HEX ) ) )
            // InternalOptGrammar.g:6617:2: ( (lv_value_0_0= RULE_HEX ) )
            {
            // InternalOptGrammar.g:6617:2: ( (lv_value_0_0= RULE_HEX ) )
            // InternalOptGrammar.g:6618:3: (lv_value_0_0= RULE_HEX )
            {
            // InternalOptGrammar.g:6618:3: (lv_value_0_0= RULE_HEX )
            // InternalOptGrammar.g:6619:4: lv_value_0_0= RULE_HEX
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
    // InternalOptGrammar.g:6638:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalOptGrammar.g:6638:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalOptGrammar.g:6639:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalOptGrammar.g:6645:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6651:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalOptGrammar.g:6652:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalOptGrammar.g:6652:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalOptGrammar.g:6653:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalOptGrammar.g:6653:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalOptGrammar.g:6654:4: lv_value_0_0= RULE_DECIMAL
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


    // $ANTLR start "entryRuleTypeCast"
    // InternalOptGrammar.g:6673:1: entryRuleTypeCast returns [EObject current=null] : iv_ruleTypeCast= ruleTypeCast EOF ;
    public final EObject entryRuleTypeCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCast = null;


        try {
            // InternalOptGrammar.g:6673:49: (iv_ruleTypeCast= ruleTypeCast EOF )
            // InternalOptGrammar.g:6674:2: iv_ruleTypeCast= ruleTypeCast EOF
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
    // InternalOptGrammar.g:6680:1: ruleTypeCast returns [EObject current=null] : ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypeCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6686:2: ( ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalOptGrammar.g:6687:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalOptGrammar.g:6687:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalOptGrammar.g:6688:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalOptGrammar.g:6688:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) )
            // InternalOptGrammar.g:6689:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalOptGrammar.g:6689:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            // InternalOptGrammar.g:6690:5: lv_value_0_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeCastAccess().getValueElementaryTypeNameEnumEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
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
              						"org.unicam.myGrammar.OptGrammar.ElementaryTypeNameEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTypeCastAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:6711:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalOptGrammar.g:6712:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:6712:4: (lv_expression_2_0= ruleExpression )
            // InternalOptGrammar.g:6713:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeCastAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
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
              						"org.unicam.myGrammar.OptGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:6738:1: entryRuleSpecialVariables returns [EObject current=null] : iv_ruleSpecialVariables= ruleSpecialVariables EOF ;
    public final EObject entryRuleSpecialVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariables = null;


        try {
            // InternalOptGrammar.g:6738:57: (iv_ruleSpecialVariables= ruleSpecialVariables EOF )
            // InternalOptGrammar.g:6739:2: iv_ruleSpecialVariables= ruleSpecialVariables EOF
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
    // InternalOptGrammar.g:6745:1: ruleSpecialVariables returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) ;
    public final EObject ruleSpecialVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_field_2_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_qualifiers_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6751:2: ( ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) )
            // InternalOptGrammar.g:6752:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            {
            // InternalOptGrammar.g:6752:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            // InternalOptGrammar.g:6753:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )*
            {
            // InternalOptGrammar.g:6753:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) )
            // InternalOptGrammar.g:6754:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            {
            // InternalOptGrammar.g:6754:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            // InternalOptGrammar.g:6755:5: lv_type_0_0= ruleSpecialVariablesTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getTypeSpecialVariablesTypeEnumParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_68);
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
            // InternalOptGrammar.g:6776:3: ( (lv_field_2_0= RULE_ID ) )
            // InternalOptGrammar.g:6777:4: (lv_field_2_0= RULE_ID )
            {
            // InternalOptGrammar.g:6777:4: (lv_field_2_0= RULE_ID )
            // InternalOptGrammar.g:6778:5: lv_field_2_0= RULE_ID
            {
            lv_field_2_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
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

            // InternalOptGrammar.g:6794:3: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==23||LA103_0==34||LA103_0==37) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalOptGrammar.g:6795:4: (lv_qualifiers_3_0= ruleQualifier )
            	    {
            	    // InternalOptGrammar.g:6795:4: (lv_qualifiers_3_0= ruleQualifier )
            	    // InternalOptGrammar.g:6796:5: lv_qualifiers_3_0= ruleQualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getQualifiersQualifierParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop103;
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
    // InternalOptGrammar.g:6817:1: entryRuleSpecialVariablesTypeEnum returns [EObject current=null] : iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF ;
    public final EObject entryRuleSpecialVariablesTypeEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariablesTypeEnum = null;


        try {
            // InternalOptGrammar.g:6817:65: (iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF )
            // InternalOptGrammar.g:6818:2: iv_ruleSpecialVariablesTypeEnum= ruleSpecialVariablesTypeEnum EOF
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
    // InternalOptGrammar.g:6824:1: ruleSpecialVariablesTypeEnum returns [EObject current=null] : ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) ) ;
    public final EObject ruleSpecialVariablesTypeEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6830:2: ( ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) ) )
            // InternalOptGrammar.g:6831:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) )
            {
            // InternalOptGrammar.g:6831:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) ) )
            // InternalOptGrammar.g:6832:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) )
            {
            // InternalOptGrammar.g:6832:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX ) )
            // InternalOptGrammar.g:6833:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX )
            {
            // InternalOptGrammar.g:6833:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX )
            int alt104=3;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
                {
                alt104=1;
                }
                break;
            case RULE_MSG:
                {
                alt104=2;
                }
                break;
            case RULE_TX:
                {
                alt104=3;
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
                    // InternalOptGrammar.g:6834:5: lv_name_0_1= RULE_BLOCK
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
                    // InternalOptGrammar.g:6849:5: lv_name_0_2= RULE_MSG
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
                    // InternalOptGrammar.g:6864:5: lv_name_0_3= RULE_TX
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


    // $ANTLR start "ruleElementaryTypeNameEnum"
    // InternalOptGrammar.g:6884:1: ruleElementaryTypeNameEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) ) ;
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
            // InternalOptGrammar.g:6890:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) ) )
            // InternalOptGrammar.g:6891:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) )
            {
            // InternalOptGrammar.g:6891:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) )
            int alt105=104;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt105=1;
                }
                break;
            case 73:
                {
                alt105=2;
                }
                break;
            case 74:
                {
                alt105=3;
                }
                break;
            case 75:
                {
                alt105=4;
                }
                break;
            case 76:
                {
                alt105=5;
                }
                break;
            case 77:
                {
                alt105=6;
                }
                break;
            case 78:
                {
                alt105=7;
                }
                break;
            case 79:
                {
                alt105=8;
                }
                break;
            case 80:
                {
                alt105=9;
                }
                break;
            case 81:
                {
                alt105=10;
                }
                break;
            case 82:
                {
                alt105=11;
                }
                break;
            case 83:
                {
                alt105=12;
                }
                break;
            case 84:
                {
                alt105=13;
                }
                break;
            case 85:
                {
                alt105=14;
                }
                break;
            case 86:
                {
                alt105=15;
                }
                break;
            case 87:
                {
                alt105=16;
                }
                break;
            case 88:
                {
                alt105=17;
                }
                break;
            case 89:
                {
                alt105=18;
                }
                break;
            case 90:
                {
                alt105=19;
                }
                break;
            case 91:
                {
                alt105=20;
                }
                break;
            case 92:
                {
                alt105=21;
                }
                break;
            case 93:
                {
                alt105=22;
                }
                break;
            case 94:
                {
                alt105=23;
                }
                break;
            case 95:
                {
                alt105=24;
                }
                break;
            case 96:
                {
                alt105=25;
                }
                break;
            case 97:
                {
                alt105=26;
                }
                break;
            case 98:
                {
                alt105=27;
                }
                break;
            case 99:
                {
                alt105=28;
                }
                break;
            case 100:
                {
                alt105=29;
                }
                break;
            case 101:
                {
                alt105=30;
                }
                break;
            case 102:
                {
                alt105=31;
                }
                break;
            case 103:
                {
                alt105=32;
                }
                break;
            case 104:
                {
                alt105=33;
                }
                break;
            case 105:
                {
                alt105=34;
                }
                break;
            case 106:
                {
                alt105=35;
                }
                break;
            case 107:
                {
                alt105=36;
                }
                break;
            case 108:
                {
                alt105=37;
                }
                break;
            case 109:
                {
                alt105=38;
                }
                break;
            case 110:
                {
                alt105=39;
                }
                break;
            case 111:
                {
                alt105=40;
                }
                break;
            case 112:
                {
                alt105=41;
                }
                break;
            case 113:
                {
                alt105=42;
                }
                break;
            case 114:
                {
                alt105=43;
                }
                break;
            case 115:
                {
                alt105=44;
                }
                break;
            case 116:
                {
                alt105=45;
                }
                break;
            case 117:
                {
                alt105=46;
                }
                break;
            case 118:
                {
                alt105=47;
                }
                break;
            case 119:
                {
                alt105=48;
                }
                break;
            case 120:
                {
                alt105=49;
                }
                break;
            case 121:
                {
                alt105=50;
                }
                break;
            case 122:
                {
                alt105=51;
                }
                break;
            case 123:
                {
                alt105=52;
                }
                break;
            case 124:
                {
                alt105=53;
                }
                break;
            case 125:
                {
                alt105=54;
                }
                break;
            case 126:
                {
                alt105=55;
                }
                break;
            case 127:
                {
                alt105=56;
                }
                break;
            case 128:
                {
                alt105=57;
                }
                break;
            case 129:
                {
                alt105=58;
                }
                break;
            case 130:
                {
                alt105=59;
                }
                break;
            case 131:
                {
                alt105=60;
                }
                break;
            case 132:
                {
                alt105=61;
                }
                break;
            case 133:
                {
                alt105=62;
                }
                break;
            case 134:
                {
                alt105=63;
                }
                break;
            case 135:
                {
                alt105=64;
                }
                break;
            case 136:
                {
                alt105=65;
                }
                break;
            case 137:
                {
                alt105=66;
                }
                break;
            case 138:
                {
                alt105=67;
                }
                break;
            case 139:
                {
                alt105=68;
                }
                break;
            case 140:
                {
                alt105=69;
                }
                break;
            case 141:
                {
                alt105=70;
                }
                break;
            case 142:
                {
                alt105=71;
                }
                break;
            case 143:
                {
                alt105=72;
                }
                break;
            case 144:
                {
                alt105=73;
                }
                break;
            case 145:
                {
                alt105=74;
                }
                break;
            case 146:
                {
                alt105=75;
                }
                break;
            case 147:
                {
                alt105=76;
                }
                break;
            case 148:
                {
                alt105=77;
                }
                break;
            case 149:
                {
                alt105=78;
                }
                break;
            case 150:
                {
                alt105=79;
                }
                break;
            case 151:
                {
                alt105=80;
                }
                break;
            case 152:
                {
                alt105=81;
                }
                break;
            case 153:
                {
                alt105=82;
                }
                break;
            case 154:
                {
                alt105=83;
                }
                break;
            case 155:
                {
                alt105=84;
                }
                break;
            case 156:
                {
                alt105=85;
                }
                break;
            case 157:
                {
                alt105=86;
                }
                break;
            case 158:
                {
                alt105=87;
                }
                break;
            case 159:
                {
                alt105=88;
                }
                break;
            case 160:
                {
                alt105=89;
                }
                break;
            case 161:
                {
                alt105=90;
                }
                break;
            case 162:
                {
                alt105=91;
                }
                break;
            case 163:
                {
                alt105=92;
                }
                break;
            case 164:
                {
                alt105=93;
                }
                break;
            case 165:
                {
                alt105=94;
                }
                break;
            case 166:
                {
                alt105=95;
                }
                break;
            case 167:
                {
                alt105=96;
                }
                break;
            case 168:
                {
                alt105=97;
                }
                break;
            case 169:
                {
                alt105=98;
                }
                break;
            case 170:
                {
                alt105=99;
                }
                break;
            case 171:
                {
                alt105=100;
                }
                break;
            case 172:
                {
                alt105=101;
                }
                break;
            case 173:
                {
                alt105=102;
                }
                break;
            case 174:
                {
                alt105=103;
                }
                break;
            case 175:
                {
                alt105=104;
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
                    // InternalOptGrammar.g:6892:3: (enumLiteral_0= 'int' )
                    {
                    // InternalOptGrammar.g:6892:3: (enumLiteral_0= 'int' )
                    // InternalOptGrammar.g:6893:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getElementaryTypeNameEnumAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:6900:3: (enumLiteral_1= 'int16' )
                    {
                    // InternalOptGrammar.g:6900:3: (enumLiteral_1= 'int16' )
                    // InternalOptGrammar.g:6901:4: enumLiteral_1= 'int16'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getElementaryTypeNameEnumAccess().getINT16EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:6908:3: (enumLiteral_2= 'int24' )
                    {
                    // InternalOptGrammar.g:6908:3: (enumLiteral_2= 'int24' )
                    // InternalOptGrammar.g:6909:4: enumLiteral_2= 'int24'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT24EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getElementaryTypeNameEnumAccess().getINT24EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:6916:3: (enumLiteral_3= 'int32' )
                    {
                    // InternalOptGrammar.g:6916:3: (enumLiteral_3= 'int32' )
                    // InternalOptGrammar.g:6917:4: enumLiteral_3= 'int32'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT32EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getElementaryTypeNameEnumAccess().getINT32EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalOptGrammar.g:6924:3: (enumLiteral_4= 'int40' )
                    {
                    // InternalOptGrammar.g:6924:3: (enumLiteral_4= 'int40' )
                    // InternalOptGrammar.g:6925:4: enumLiteral_4= 'int40'
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT40EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getElementaryTypeNameEnumAccess().getINT40EnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalOptGrammar.g:6932:3: (enumLiteral_5= 'int48' )
                    {
                    // InternalOptGrammar.g:6932:3: (enumLiteral_5= 'int48' )
                    // InternalOptGrammar.g:6933:4: enumLiteral_5= 'int48'
                    {
                    enumLiteral_5=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT48EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getElementaryTypeNameEnumAccess().getINT48EnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalOptGrammar.g:6940:3: (enumLiteral_6= 'int56' )
                    {
                    // InternalOptGrammar.g:6940:3: (enumLiteral_6= 'int56' )
                    // InternalOptGrammar.g:6941:4: enumLiteral_6= 'int56'
                    {
                    enumLiteral_6=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT56EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getElementaryTypeNameEnumAccess().getINT56EnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalOptGrammar.g:6948:3: (enumLiteral_7= 'int64' )
                    {
                    // InternalOptGrammar.g:6948:3: (enumLiteral_7= 'int64' )
                    // InternalOptGrammar.g:6949:4: enumLiteral_7= 'int64'
                    {
                    enumLiteral_7=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getElementaryTypeNameEnumAccess().getINT64EnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalOptGrammar.g:6956:3: (enumLiteral_8= 'int72' )
                    {
                    // InternalOptGrammar.g:6956:3: (enumLiteral_8= 'int72' )
                    // InternalOptGrammar.g:6957:4: enumLiteral_8= 'int72'
                    {
                    enumLiteral_8=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT72EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getElementaryTypeNameEnumAccess().getINT72EnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalOptGrammar.g:6964:3: (enumLiteral_9= 'int80' )
                    {
                    // InternalOptGrammar.g:6964:3: (enumLiteral_9= 'int80' )
                    // InternalOptGrammar.g:6965:4: enumLiteral_9= 'int80'
                    {
                    enumLiteral_9=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT80EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getElementaryTypeNameEnumAccess().getINT80EnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalOptGrammar.g:6972:3: (enumLiteral_10= 'int88' )
                    {
                    // InternalOptGrammar.g:6972:3: (enumLiteral_10= 'int88' )
                    // InternalOptGrammar.g:6973:4: enumLiteral_10= 'int88'
                    {
                    enumLiteral_10=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT88EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getElementaryTypeNameEnumAccess().getINT88EnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalOptGrammar.g:6980:3: (enumLiteral_11= 'int96' )
                    {
                    // InternalOptGrammar.g:6980:3: (enumLiteral_11= 'int96' )
                    // InternalOptGrammar.g:6981:4: enumLiteral_11= 'int96'
                    {
                    enumLiteral_11=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT96EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getElementaryTypeNameEnumAccess().getINT96EnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalOptGrammar.g:6988:3: (enumLiteral_12= 'int104' )
                    {
                    // InternalOptGrammar.g:6988:3: (enumLiteral_12= 'int104' )
                    // InternalOptGrammar.g:6989:4: enumLiteral_12= 'int104'
                    {
                    enumLiteral_12=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT104EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getElementaryTypeNameEnumAccess().getINT104EnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalOptGrammar.g:6996:3: (enumLiteral_13= 'int112' )
                    {
                    // InternalOptGrammar.g:6996:3: (enumLiteral_13= 'int112' )
                    // InternalOptGrammar.g:6997:4: enumLiteral_13= 'int112'
                    {
                    enumLiteral_13=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT112EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getElementaryTypeNameEnumAccess().getINT112EnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalOptGrammar.g:7004:3: (enumLiteral_14= 'int120' )
                    {
                    // InternalOptGrammar.g:7004:3: (enumLiteral_14= 'int120' )
                    // InternalOptGrammar.g:7005:4: enumLiteral_14= 'int120'
                    {
                    enumLiteral_14=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT120EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getElementaryTypeNameEnumAccess().getINT120EnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalOptGrammar.g:7012:3: (enumLiteral_15= 'int128' )
                    {
                    // InternalOptGrammar.g:7012:3: (enumLiteral_15= 'int128' )
                    // InternalOptGrammar.g:7013:4: enumLiteral_15= 'int128'
                    {
                    enumLiteral_15=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT128EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_15, grammarAccess.getElementaryTypeNameEnumAccess().getINT128EnumLiteralDeclaration_15());
                      			
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalOptGrammar.g:7020:3: (enumLiteral_16= 'int136' )
                    {
                    // InternalOptGrammar.g:7020:3: (enumLiteral_16= 'int136' )
                    // InternalOptGrammar.g:7021:4: enumLiteral_16= 'int136'
                    {
                    enumLiteral_16=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT136EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_16, grammarAccess.getElementaryTypeNameEnumAccess().getINT136EnumLiteralDeclaration_16());
                      			
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalOptGrammar.g:7028:3: (enumLiteral_17= 'int144' )
                    {
                    // InternalOptGrammar.g:7028:3: (enumLiteral_17= 'int144' )
                    // InternalOptGrammar.g:7029:4: enumLiteral_17= 'int144'
                    {
                    enumLiteral_17=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT144EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_17, grammarAccess.getElementaryTypeNameEnumAccess().getINT144EnumLiteralDeclaration_17());
                      			
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalOptGrammar.g:7036:3: (enumLiteral_18= 'int152' )
                    {
                    // InternalOptGrammar.g:7036:3: (enumLiteral_18= 'int152' )
                    // InternalOptGrammar.g:7037:4: enumLiteral_18= 'int152'
                    {
                    enumLiteral_18=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT152EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_18, grammarAccess.getElementaryTypeNameEnumAccess().getINT152EnumLiteralDeclaration_18());
                      			
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalOptGrammar.g:7044:3: (enumLiteral_19= 'int160' )
                    {
                    // InternalOptGrammar.g:7044:3: (enumLiteral_19= 'int160' )
                    // InternalOptGrammar.g:7045:4: enumLiteral_19= 'int160'
                    {
                    enumLiteral_19=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT160EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_19, grammarAccess.getElementaryTypeNameEnumAccess().getINT160EnumLiteralDeclaration_19());
                      			
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalOptGrammar.g:7052:3: (enumLiteral_20= 'int168' )
                    {
                    // InternalOptGrammar.g:7052:3: (enumLiteral_20= 'int168' )
                    // InternalOptGrammar.g:7053:4: enumLiteral_20= 'int168'
                    {
                    enumLiteral_20=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT168EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_20, grammarAccess.getElementaryTypeNameEnumAccess().getINT168EnumLiteralDeclaration_20());
                      			
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalOptGrammar.g:7060:3: (enumLiteral_21= 'int178' )
                    {
                    // InternalOptGrammar.g:7060:3: (enumLiteral_21= 'int178' )
                    // InternalOptGrammar.g:7061:4: enumLiteral_21= 'int178'
                    {
                    enumLiteral_21=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT178EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_21, grammarAccess.getElementaryTypeNameEnumAccess().getINT178EnumLiteralDeclaration_21());
                      			
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalOptGrammar.g:7068:3: (enumLiteral_22= 'int184' )
                    {
                    // InternalOptGrammar.g:7068:3: (enumLiteral_22= 'int184' )
                    // InternalOptGrammar.g:7069:4: enumLiteral_22= 'int184'
                    {
                    enumLiteral_22=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT184EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_22, grammarAccess.getElementaryTypeNameEnumAccess().getINT184EnumLiteralDeclaration_22());
                      			
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalOptGrammar.g:7076:3: (enumLiteral_23= 'int192' )
                    {
                    // InternalOptGrammar.g:7076:3: (enumLiteral_23= 'int192' )
                    // InternalOptGrammar.g:7077:4: enumLiteral_23= 'int192'
                    {
                    enumLiteral_23=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT192EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_23, grammarAccess.getElementaryTypeNameEnumAccess().getINT192EnumLiteralDeclaration_23());
                      			
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalOptGrammar.g:7084:3: (enumLiteral_24= 'int200' )
                    {
                    // InternalOptGrammar.g:7084:3: (enumLiteral_24= 'int200' )
                    // InternalOptGrammar.g:7085:4: enumLiteral_24= 'int200'
                    {
                    enumLiteral_24=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT200EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_24, grammarAccess.getElementaryTypeNameEnumAccess().getINT200EnumLiteralDeclaration_24());
                      			
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalOptGrammar.g:7092:3: (enumLiteral_25= 'int208' )
                    {
                    // InternalOptGrammar.g:7092:3: (enumLiteral_25= 'int208' )
                    // InternalOptGrammar.g:7093:4: enumLiteral_25= 'int208'
                    {
                    enumLiteral_25=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT208EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_25, grammarAccess.getElementaryTypeNameEnumAccess().getINT208EnumLiteralDeclaration_25());
                      			
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalOptGrammar.g:7100:3: (enumLiteral_26= 'int216' )
                    {
                    // InternalOptGrammar.g:7100:3: (enumLiteral_26= 'int216' )
                    // InternalOptGrammar.g:7101:4: enumLiteral_26= 'int216'
                    {
                    enumLiteral_26=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT216EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_26, grammarAccess.getElementaryTypeNameEnumAccess().getINT216EnumLiteralDeclaration_26());
                      			
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalOptGrammar.g:7108:3: (enumLiteral_27= 'int224' )
                    {
                    // InternalOptGrammar.g:7108:3: (enumLiteral_27= 'int224' )
                    // InternalOptGrammar.g:7109:4: enumLiteral_27= 'int224'
                    {
                    enumLiteral_27=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT224EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_27, grammarAccess.getElementaryTypeNameEnumAccess().getINT224EnumLiteralDeclaration_27());
                      			
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalOptGrammar.g:7116:3: (enumLiteral_28= 'int232' )
                    {
                    // InternalOptGrammar.g:7116:3: (enumLiteral_28= 'int232' )
                    // InternalOptGrammar.g:7117:4: enumLiteral_28= 'int232'
                    {
                    enumLiteral_28=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT232EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_28, grammarAccess.getElementaryTypeNameEnumAccess().getINT232EnumLiteralDeclaration_28());
                      			
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalOptGrammar.g:7124:3: (enumLiteral_29= 'int240' )
                    {
                    // InternalOptGrammar.g:7124:3: (enumLiteral_29= 'int240' )
                    // InternalOptGrammar.g:7125:4: enumLiteral_29= 'int240'
                    {
                    enumLiteral_29=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT240EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_29, grammarAccess.getElementaryTypeNameEnumAccess().getINT240EnumLiteralDeclaration_29());
                      			
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalOptGrammar.g:7132:3: (enumLiteral_30= 'int248' )
                    {
                    // InternalOptGrammar.g:7132:3: (enumLiteral_30= 'int248' )
                    // InternalOptGrammar.g:7133:4: enumLiteral_30= 'int248'
                    {
                    enumLiteral_30=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT248EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_30, grammarAccess.getElementaryTypeNameEnumAccess().getINT248EnumLiteralDeclaration_30());
                      			
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalOptGrammar.g:7140:3: (enumLiteral_31= 'int256' )
                    {
                    // InternalOptGrammar.g:7140:3: (enumLiteral_31= 'int256' )
                    // InternalOptGrammar.g:7141:4: enumLiteral_31= 'int256'
                    {
                    enumLiteral_31=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT256EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_31, grammarAccess.getElementaryTypeNameEnumAccess().getINT256EnumLiteralDeclaration_31());
                      			
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalOptGrammar.g:7148:3: (enumLiteral_32= 'uint' )
                    {
                    // InternalOptGrammar.g:7148:3: (enumLiteral_32= 'uint' )
                    // InternalOptGrammar.g:7149:4: enumLiteral_32= 'uint'
                    {
                    enumLiteral_32=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINTEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_32, grammarAccess.getElementaryTypeNameEnumAccess().getUINTEnumLiteralDeclaration_32());
                      			
                    }

                    }


                    }
                    break;
                case 34 :
                    // InternalOptGrammar.g:7156:3: (enumLiteral_33= 'uint8' )
                    {
                    // InternalOptGrammar.g:7156:3: (enumLiteral_33= 'uint8' )
                    // InternalOptGrammar.g:7157:4: enumLiteral_33= 'uint8'
                    {
                    enumLiteral_33=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT8EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_33, grammarAccess.getElementaryTypeNameEnumAccess().getUINT8EnumLiteralDeclaration_33());
                      			
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalOptGrammar.g:7164:3: (enumLiteral_34= 'uint16' )
                    {
                    // InternalOptGrammar.g:7164:3: (enumLiteral_34= 'uint16' )
                    // InternalOptGrammar.g:7165:4: enumLiteral_34= 'uint16'
                    {
                    enumLiteral_34=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT16EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_34, grammarAccess.getElementaryTypeNameEnumAccess().getUINT16EnumLiteralDeclaration_34());
                      			
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalOptGrammar.g:7172:3: (enumLiteral_35= 'uint24' )
                    {
                    // InternalOptGrammar.g:7172:3: (enumLiteral_35= 'uint24' )
                    // InternalOptGrammar.g:7173:4: enumLiteral_35= 'uint24'
                    {
                    enumLiteral_35=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUNIT24EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_35, grammarAccess.getElementaryTypeNameEnumAccess().getUNIT24EnumLiteralDeclaration_35());
                      			
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalOptGrammar.g:7180:3: (enumLiteral_36= 'uint32' )
                    {
                    // InternalOptGrammar.g:7180:3: (enumLiteral_36= 'uint32' )
                    // InternalOptGrammar.g:7181:4: enumLiteral_36= 'uint32'
                    {
                    enumLiteral_36=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT32EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_36, grammarAccess.getElementaryTypeNameEnumAccess().getUINT32EnumLiteralDeclaration_36());
                      			
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalOptGrammar.g:7188:3: (enumLiteral_37= 'uint40' )
                    {
                    // InternalOptGrammar.g:7188:3: (enumLiteral_37= 'uint40' )
                    // InternalOptGrammar.g:7189:4: enumLiteral_37= 'uint40'
                    {
                    enumLiteral_37=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT40EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_37, grammarAccess.getElementaryTypeNameEnumAccess().getUINT40EnumLiteralDeclaration_37());
                      			
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalOptGrammar.g:7196:3: (enumLiteral_38= 'uint48' )
                    {
                    // InternalOptGrammar.g:7196:3: (enumLiteral_38= 'uint48' )
                    // InternalOptGrammar.g:7197:4: enumLiteral_38= 'uint48'
                    {
                    enumLiteral_38=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT48EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_38, grammarAccess.getElementaryTypeNameEnumAccess().getUINT48EnumLiteralDeclaration_38());
                      			
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalOptGrammar.g:7204:3: (enumLiteral_39= 'uint56' )
                    {
                    // InternalOptGrammar.g:7204:3: (enumLiteral_39= 'uint56' )
                    // InternalOptGrammar.g:7205:4: enumLiteral_39= 'uint56'
                    {
                    enumLiteral_39=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUNIT56EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_39, grammarAccess.getElementaryTypeNameEnumAccess().getUNIT56EnumLiteralDeclaration_39());
                      			
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalOptGrammar.g:7212:3: (enumLiteral_40= 'uint64' )
                    {
                    // InternalOptGrammar.g:7212:3: (enumLiteral_40= 'uint64' )
                    // InternalOptGrammar.g:7213:4: enumLiteral_40= 'uint64'
                    {
                    enumLiteral_40=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT64EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_40, grammarAccess.getElementaryTypeNameEnumAccess().getUINT64EnumLiteralDeclaration_40());
                      			
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalOptGrammar.g:7220:3: (enumLiteral_41= 'uint72' )
                    {
                    // InternalOptGrammar.g:7220:3: (enumLiteral_41= 'uint72' )
                    // InternalOptGrammar.g:7221:4: enumLiteral_41= 'uint72'
                    {
                    enumLiteral_41=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT72EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_41, grammarAccess.getElementaryTypeNameEnumAccess().getUINT72EnumLiteralDeclaration_41());
                      			
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalOptGrammar.g:7228:3: (enumLiteral_42= 'uint80' )
                    {
                    // InternalOptGrammar.g:7228:3: (enumLiteral_42= 'uint80' )
                    // InternalOptGrammar.g:7229:4: enumLiteral_42= 'uint80'
                    {
                    enumLiteral_42=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT80EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_42, grammarAccess.getElementaryTypeNameEnumAccess().getUINT80EnumLiteralDeclaration_42());
                      			
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalOptGrammar.g:7236:3: (enumLiteral_43= 'uint88' )
                    {
                    // InternalOptGrammar.g:7236:3: (enumLiteral_43= 'uint88' )
                    // InternalOptGrammar.g:7237:4: enumLiteral_43= 'uint88'
                    {
                    enumLiteral_43=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT88EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_43, grammarAccess.getElementaryTypeNameEnumAccess().getUINT88EnumLiteralDeclaration_43());
                      			
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalOptGrammar.g:7244:3: (enumLiteral_44= 'uint96' )
                    {
                    // InternalOptGrammar.g:7244:3: (enumLiteral_44= 'uint96' )
                    // InternalOptGrammar.g:7245:4: enumLiteral_44= 'uint96'
                    {
                    enumLiteral_44=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT96EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_44, grammarAccess.getElementaryTypeNameEnumAccess().getUINT96EnumLiteralDeclaration_44());
                      			
                    }

                    }


                    }
                    break;
                case 46 :
                    // InternalOptGrammar.g:7252:3: (enumLiteral_45= 'uint104' )
                    {
                    // InternalOptGrammar.g:7252:3: (enumLiteral_45= 'uint104' )
                    // InternalOptGrammar.g:7253:4: enumLiteral_45= 'uint104'
                    {
                    enumLiteral_45=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT104EnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_45, grammarAccess.getElementaryTypeNameEnumAccess().getUINT104EnumLiteralDeclaration_45());
                      			
                    }

                    }


                    }
                    break;
                case 47 :
                    // InternalOptGrammar.g:7260:3: (enumLiteral_46= 'uint112' )
                    {
                    // InternalOptGrammar.g:7260:3: (enumLiteral_46= 'uint112' )
                    // InternalOptGrammar.g:7261:4: enumLiteral_46= 'uint112'
                    {
                    enumLiteral_46=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT112EnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_46, grammarAccess.getElementaryTypeNameEnumAccess().getUINT112EnumLiteralDeclaration_46());
                      			
                    }

                    }


                    }
                    break;
                case 48 :
                    // InternalOptGrammar.g:7268:3: (enumLiteral_47= 'uint120' )
                    {
                    // InternalOptGrammar.g:7268:3: (enumLiteral_47= 'uint120' )
                    // InternalOptGrammar.g:7269:4: enumLiteral_47= 'uint120'
                    {
                    enumLiteral_47=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT120EnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_47, grammarAccess.getElementaryTypeNameEnumAccess().getUINT120EnumLiteralDeclaration_47());
                      			
                    }

                    }


                    }
                    break;
                case 49 :
                    // InternalOptGrammar.g:7276:3: (enumLiteral_48= 'uint128' )
                    {
                    // InternalOptGrammar.g:7276:3: (enumLiteral_48= 'uint128' )
                    // InternalOptGrammar.g:7277:4: enumLiteral_48= 'uint128'
                    {
                    enumLiteral_48=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT128EnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_48, grammarAccess.getElementaryTypeNameEnumAccess().getUINT128EnumLiteralDeclaration_48());
                      			
                    }

                    }


                    }
                    break;
                case 50 :
                    // InternalOptGrammar.g:7284:3: (enumLiteral_49= 'uint136' )
                    {
                    // InternalOptGrammar.g:7284:3: (enumLiteral_49= 'uint136' )
                    // InternalOptGrammar.g:7285:4: enumLiteral_49= 'uint136'
                    {
                    enumLiteral_49=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT136EnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_49, grammarAccess.getElementaryTypeNameEnumAccess().getUINT136EnumLiteralDeclaration_49());
                      			
                    }

                    }


                    }
                    break;
                case 51 :
                    // InternalOptGrammar.g:7292:3: (enumLiteral_50= 'uint144' )
                    {
                    // InternalOptGrammar.g:7292:3: (enumLiteral_50= 'uint144' )
                    // InternalOptGrammar.g:7293:4: enumLiteral_50= 'uint144'
                    {
                    enumLiteral_50=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT144EnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_50, grammarAccess.getElementaryTypeNameEnumAccess().getUINT144EnumLiteralDeclaration_50());
                      			
                    }

                    }


                    }
                    break;
                case 52 :
                    // InternalOptGrammar.g:7300:3: (enumLiteral_51= 'uint152' )
                    {
                    // InternalOptGrammar.g:7300:3: (enumLiteral_51= 'uint152' )
                    // InternalOptGrammar.g:7301:4: enumLiteral_51= 'uint152'
                    {
                    enumLiteral_51=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT152EnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_51, grammarAccess.getElementaryTypeNameEnumAccess().getUINT152EnumLiteralDeclaration_51());
                      			
                    }

                    }


                    }
                    break;
                case 53 :
                    // InternalOptGrammar.g:7308:3: (enumLiteral_52= 'uint160' )
                    {
                    // InternalOptGrammar.g:7308:3: (enumLiteral_52= 'uint160' )
                    // InternalOptGrammar.g:7309:4: enumLiteral_52= 'uint160'
                    {
                    enumLiteral_52=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT160EnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_52, grammarAccess.getElementaryTypeNameEnumAccess().getUINT160EnumLiteralDeclaration_52());
                      			
                    }

                    }


                    }
                    break;
                case 54 :
                    // InternalOptGrammar.g:7316:3: (enumLiteral_53= 'uint168' )
                    {
                    // InternalOptGrammar.g:7316:3: (enumLiteral_53= 'uint168' )
                    // InternalOptGrammar.g:7317:4: enumLiteral_53= 'uint168'
                    {
                    enumLiteral_53=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT168EnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_53, grammarAccess.getElementaryTypeNameEnumAccess().getUINT168EnumLiteralDeclaration_53());
                      			
                    }

                    }


                    }
                    break;
                case 55 :
                    // InternalOptGrammar.g:7324:3: (enumLiteral_54= 'uint178' )
                    {
                    // InternalOptGrammar.g:7324:3: (enumLiteral_54= 'uint178' )
                    // InternalOptGrammar.g:7325:4: enumLiteral_54= 'uint178'
                    {
                    enumLiteral_54=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT178EnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_54, grammarAccess.getElementaryTypeNameEnumAccess().getUINT178EnumLiteralDeclaration_54());
                      			
                    }

                    }


                    }
                    break;
                case 56 :
                    // InternalOptGrammar.g:7332:3: (enumLiteral_55= 'uint184' )
                    {
                    // InternalOptGrammar.g:7332:3: (enumLiteral_55= 'uint184' )
                    // InternalOptGrammar.g:7333:4: enumLiteral_55= 'uint184'
                    {
                    enumLiteral_55=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT184EnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_55, grammarAccess.getElementaryTypeNameEnumAccess().getUINT184EnumLiteralDeclaration_55());
                      			
                    }

                    }


                    }
                    break;
                case 57 :
                    // InternalOptGrammar.g:7340:3: (enumLiteral_56= 'uint192' )
                    {
                    // InternalOptGrammar.g:7340:3: (enumLiteral_56= 'uint192' )
                    // InternalOptGrammar.g:7341:4: enumLiteral_56= 'uint192'
                    {
                    enumLiteral_56=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT192EnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_56, grammarAccess.getElementaryTypeNameEnumAccess().getUINT192EnumLiteralDeclaration_56());
                      			
                    }

                    }


                    }
                    break;
                case 58 :
                    // InternalOptGrammar.g:7348:3: (enumLiteral_57= 'uint200' )
                    {
                    // InternalOptGrammar.g:7348:3: (enumLiteral_57= 'uint200' )
                    // InternalOptGrammar.g:7349:4: enumLiteral_57= 'uint200'
                    {
                    enumLiteral_57=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT200EnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_57, grammarAccess.getElementaryTypeNameEnumAccess().getUINT200EnumLiteralDeclaration_57());
                      			
                    }

                    }


                    }
                    break;
                case 59 :
                    // InternalOptGrammar.g:7356:3: (enumLiteral_58= 'uint208' )
                    {
                    // InternalOptGrammar.g:7356:3: (enumLiteral_58= 'uint208' )
                    // InternalOptGrammar.g:7357:4: enumLiteral_58= 'uint208'
                    {
                    enumLiteral_58=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT208EnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_58, grammarAccess.getElementaryTypeNameEnumAccess().getUINT208EnumLiteralDeclaration_58());
                      			
                    }

                    }


                    }
                    break;
                case 60 :
                    // InternalOptGrammar.g:7364:3: (enumLiteral_59= 'uint216' )
                    {
                    // InternalOptGrammar.g:7364:3: (enumLiteral_59= 'uint216' )
                    // InternalOptGrammar.g:7365:4: enumLiteral_59= 'uint216'
                    {
                    enumLiteral_59=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT216EnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_59, grammarAccess.getElementaryTypeNameEnumAccess().getUINT216EnumLiteralDeclaration_59());
                      			
                    }

                    }


                    }
                    break;
                case 61 :
                    // InternalOptGrammar.g:7372:3: (enumLiteral_60= 'uint224' )
                    {
                    // InternalOptGrammar.g:7372:3: (enumLiteral_60= 'uint224' )
                    // InternalOptGrammar.g:7373:4: enumLiteral_60= 'uint224'
                    {
                    enumLiteral_60=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT244EnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_60, grammarAccess.getElementaryTypeNameEnumAccess().getUINT244EnumLiteralDeclaration_60());
                      			
                    }

                    }


                    }
                    break;
                case 62 :
                    // InternalOptGrammar.g:7380:3: (enumLiteral_61= 'uint232' )
                    {
                    // InternalOptGrammar.g:7380:3: (enumLiteral_61= 'uint232' )
                    // InternalOptGrammar.g:7381:4: enumLiteral_61= 'uint232'
                    {
                    enumLiteral_61=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT232EnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_61, grammarAccess.getElementaryTypeNameEnumAccess().getUINT232EnumLiteralDeclaration_61());
                      			
                    }

                    }


                    }
                    break;
                case 63 :
                    // InternalOptGrammar.g:7388:3: (enumLiteral_62= 'uint240' )
                    {
                    // InternalOptGrammar.g:7388:3: (enumLiteral_62= 'uint240' )
                    // InternalOptGrammar.g:7389:4: enumLiteral_62= 'uint240'
                    {
                    enumLiteral_62=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT240EnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_62, grammarAccess.getElementaryTypeNameEnumAccess().getUINT240EnumLiteralDeclaration_62());
                      			
                    }

                    }


                    }
                    break;
                case 64 :
                    // InternalOptGrammar.g:7396:3: (enumLiteral_63= 'uint248' )
                    {
                    // InternalOptGrammar.g:7396:3: (enumLiteral_63= 'uint248' )
                    // InternalOptGrammar.g:7397:4: enumLiteral_63= 'uint248'
                    {
                    enumLiteral_63=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT248EnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_63, grammarAccess.getElementaryTypeNameEnumAccess().getUINT248EnumLiteralDeclaration_63());
                      			
                    }

                    }


                    }
                    break;
                case 65 :
                    // InternalOptGrammar.g:7404:3: (enumLiteral_64= 'uint256' )
                    {
                    // InternalOptGrammar.g:7404:3: (enumLiteral_64= 'uint256' )
                    // InternalOptGrammar.g:7405:4: enumLiteral_64= 'uint256'
                    {
                    enumLiteral_64=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT256EnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_64, grammarAccess.getElementaryTypeNameEnumAccess().getUINT256EnumLiteralDeclaration_64());
                      			
                    }

                    }


                    }
                    break;
                case 66 :
                    // InternalOptGrammar.g:7412:3: (enumLiteral_65= 'byte' )
                    {
                    // InternalOptGrammar.g:7412:3: (enumLiteral_65= 'byte' )
                    // InternalOptGrammar.g:7413:4: enumLiteral_65= 'byte'
                    {
                    enumLiteral_65=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTEEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_65, grammarAccess.getElementaryTypeNameEnumAccess().getBYTEEnumLiteralDeclaration_65());
                      			
                    }

                    }


                    }
                    break;
                case 67 :
                    // InternalOptGrammar.g:7420:3: (enumLiteral_66= 'bytes' )
                    {
                    // InternalOptGrammar.g:7420:3: (enumLiteral_66= 'bytes' )
                    // InternalOptGrammar.g:7421:4: enumLiteral_66= 'bytes'
                    {
                    enumLiteral_66=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTESEnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_66, grammarAccess.getElementaryTypeNameEnumAccess().getBYTESEnumLiteralDeclaration_66());
                      			
                    }

                    }


                    }
                    break;
                case 68 :
                    // InternalOptGrammar.g:7428:3: (enumLiteral_67= 'bytes1' )
                    {
                    // InternalOptGrammar.g:7428:3: (enumLiteral_67= 'bytes1' )
                    // InternalOptGrammar.g:7429:4: enumLiteral_67= 'bytes1'
                    {
                    enumLiteral_67=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES1EnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_67, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES1EnumLiteralDeclaration_67());
                      			
                    }

                    }


                    }
                    break;
                case 69 :
                    // InternalOptGrammar.g:7436:3: (enumLiteral_68= 'bytes2' )
                    {
                    // InternalOptGrammar.g:7436:3: (enumLiteral_68= 'bytes2' )
                    // InternalOptGrammar.g:7437:4: enumLiteral_68= 'bytes2'
                    {
                    enumLiteral_68=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES2EnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_68, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES2EnumLiteralDeclaration_68());
                      			
                    }

                    }


                    }
                    break;
                case 70 :
                    // InternalOptGrammar.g:7444:3: (enumLiteral_69= 'bytes3' )
                    {
                    // InternalOptGrammar.g:7444:3: (enumLiteral_69= 'bytes3' )
                    // InternalOptGrammar.g:7445:4: enumLiteral_69= 'bytes3'
                    {
                    enumLiteral_69=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES3EnumLiteralDeclaration_69().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_69, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES3EnumLiteralDeclaration_69());
                      			
                    }

                    }


                    }
                    break;
                case 71 :
                    // InternalOptGrammar.g:7452:3: (enumLiteral_70= 'bytes4' )
                    {
                    // InternalOptGrammar.g:7452:3: (enumLiteral_70= 'bytes4' )
                    // InternalOptGrammar.g:7453:4: enumLiteral_70= 'bytes4'
                    {
                    enumLiteral_70=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES4EnumLiteralDeclaration_70().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_70, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES4EnumLiteralDeclaration_70());
                      			
                    }

                    }


                    }
                    break;
                case 72 :
                    // InternalOptGrammar.g:7460:3: (enumLiteral_71= 'bytes5' )
                    {
                    // InternalOptGrammar.g:7460:3: (enumLiteral_71= 'bytes5' )
                    // InternalOptGrammar.g:7461:4: enumLiteral_71= 'bytes5'
                    {
                    enumLiteral_71=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES5EnumLiteralDeclaration_71().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_71, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES5EnumLiteralDeclaration_71());
                      			
                    }

                    }


                    }
                    break;
                case 73 :
                    // InternalOptGrammar.g:7468:3: (enumLiteral_72= 'bytes6' )
                    {
                    // InternalOptGrammar.g:7468:3: (enumLiteral_72= 'bytes6' )
                    // InternalOptGrammar.g:7469:4: enumLiteral_72= 'bytes6'
                    {
                    enumLiteral_72=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES6EnumLiteralDeclaration_72().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_72, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES6EnumLiteralDeclaration_72());
                      			
                    }

                    }


                    }
                    break;
                case 74 :
                    // InternalOptGrammar.g:7476:3: (enumLiteral_73= 'bytes7' )
                    {
                    // InternalOptGrammar.g:7476:3: (enumLiteral_73= 'bytes7' )
                    // InternalOptGrammar.g:7477:4: enumLiteral_73= 'bytes7'
                    {
                    enumLiteral_73=(Token)match(input,145,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES7EnumLiteralDeclaration_73().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_73, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES7EnumLiteralDeclaration_73());
                      			
                    }

                    }


                    }
                    break;
                case 75 :
                    // InternalOptGrammar.g:7484:3: (enumLiteral_74= 'bytes8' )
                    {
                    // InternalOptGrammar.g:7484:3: (enumLiteral_74= 'bytes8' )
                    // InternalOptGrammar.g:7485:4: enumLiteral_74= 'bytes8'
                    {
                    enumLiteral_74=(Token)match(input,146,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES8EnumLiteralDeclaration_74().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_74, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES8EnumLiteralDeclaration_74());
                      			
                    }

                    }


                    }
                    break;
                case 76 :
                    // InternalOptGrammar.g:7492:3: (enumLiteral_75= 'bytes9' )
                    {
                    // InternalOptGrammar.g:7492:3: (enumLiteral_75= 'bytes9' )
                    // InternalOptGrammar.g:7493:4: enumLiteral_75= 'bytes9'
                    {
                    enumLiteral_75=(Token)match(input,147,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES9EnumLiteralDeclaration_75().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_75, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES9EnumLiteralDeclaration_75());
                      			
                    }

                    }


                    }
                    break;
                case 77 :
                    // InternalOptGrammar.g:7500:3: (enumLiteral_76= 'bytes10' )
                    {
                    // InternalOptGrammar.g:7500:3: (enumLiteral_76= 'bytes10' )
                    // InternalOptGrammar.g:7501:4: enumLiteral_76= 'bytes10'
                    {
                    enumLiteral_76=(Token)match(input,148,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES10EnumLiteralDeclaration_76().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_76, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES10EnumLiteralDeclaration_76());
                      			
                    }

                    }


                    }
                    break;
                case 78 :
                    // InternalOptGrammar.g:7508:3: (enumLiteral_77= 'bytes11' )
                    {
                    // InternalOptGrammar.g:7508:3: (enumLiteral_77= 'bytes11' )
                    // InternalOptGrammar.g:7509:4: enumLiteral_77= 'bytes11'
                    {
                    enumLiteral_77=(Token)match(input,149,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES11EnumLiteralDeclaration_77().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_77, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES11EnumLiteralDeclaration_77());
                      			
                    }

                    }


                    }
                    break;
                case 79 :
                    // InternalOptGrammar.g:7516:3: (enumLiteral_78= 'bytes12' )
                    {
                    // InternalOptGrammar.g:7516:3: (enumLiteral_78= 'bytes12' )
                    // InternalOptGrammar.g:7517:4: enumLiteral_78= 'bytes12'
                    {
                    enumLiteral_78=(Token)match(input,150,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES12EnumLiteralDeclaration_78().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_78, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES12EnumLiteralDeclaration_78());
                      			
                    }

                    }


                    }
                    break;
                case 80 :
                    // InternalOptGrammar.g:7524:3: (enumLiteral_79= 'bytes13' )
                    {
                    // InternalOptGrammar.g:7524:3: (enumLiteral_79= 'bytes13' )
                    // InternalOptGrammar.g:7525:4: enumLiteral_79= 'bytes13'
                    {
                    enumLiteral_79=(Token)match(input,151,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES13EnumLiteralDeclaration_79().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_79, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES13EnumLiteralDeclaration_79());
                      			
                    }

                    }


                    }
                    break;
                case 81 :
                    // InternalOptGrammar.g:7532:3: (enumLiteral_80= 'bytes14' )
                    {
                    // InternalOptGrammar.g:7532:3: (enumLiteral_80= 'bytes14' )
                    // InternalOptGrammar.g:7533:4: enumLiteral_80= 'bytes14'
                    {
                    enumLiteral_80=(Token)match(input,152,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES14EnumLiteralDeclaration_80().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_80, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES14EnumLiteralDeclaration_80());
                      			
                    }

                    }


                    }
                    break;
                case 82 :
                    // InternalOptGrammar.g:7540:3: (enumLiteral_81= 'bytes15' )
                    {
                    // InternalOptGrammar.g:7540:3: (enumLiteral_81= 'bytes15' )
                    // InternalOptGrammar.g:7541:4: enumLiteral_81= 'bytes15'
                    {
                    enumLiteral_81=(Token)match(input,153,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES15EnumLiteralDeclaration_81().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_81, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES15EnumLiteralDeclaration_81());
                      			
                    }

                    }


                    }
                    break;
                case 83 :
                    // InternalOptGrammar.g:7548:3: (enumLiteral_82= 'bytes16' )
                    {
                    // InternalOptGrammar.g:7548:3: (enumLiteral_82= 'bytes16' )
                    // InternalOptGrammar.g:7549:4: enumLiteral_82= 'bytes16'
                    {
                    enumLiteral_82=(Token)match(input,154,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES16EnumLiteralDeclaration_82().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_82, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES16EnumLiteralDeclaration_82());
                      			
                    }

                    }


                    }
                    break;
                case 84 :
                    // InternalOptGrammar.g:7556:3: (enumLiteral_83= 'bytes17' )
                    {
                    // InternalOptGrammar.g:7556:3: (enumLiteral_83= 'bytes17' )
                    // InternalOptGrammar.g:7557:4: enumLiteral_83= 'bytes17'
                    {
                    enumLiteral_83=(Token)match(input,155,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES17EnumLiteralDeclaration_83().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_83, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES17EnumLiteralDeclaration_83());
                      			
                    }

                    }


                    }
                    break;
                case 85 :
                    // InternalOptGrammar.g:7564:3: (enumLiteral_84= 'bytes18' )
                    {
                    // InternalOptGrammar.g:7564:3: (enumLiteral_84= 'bytes18' )
                    // InternalOptGrammar.g:7565:4: enumLiteral_84= 'bytes18'
                    {
                    enumLiteral_84=(Token)match(input,156,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES18EnumLiteralDeclaration_84().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_84, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES18EnumLiteralDeclaration_84());
                      			
                    }

                    }


                    }
                    break;
                case 86 :
                    // InternalOptGrammar.g:7572:3: (enumLiteral_85= 'bytes19' )
                    {
                    // InternalOptGrammar.g:7572:3: (enumLiteral_85= 'bytes19' )
                    // InternalOptGrammar.g:7573:4: enumLiteral_85= 'bytes19'
                    {
                    enumLiteral_85=(Token)match(input,157,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES19EnumLiteralDeclaration_85().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_85, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES19EnumLiteralDeclaration_85());
                      			
                    }

                    }


                    }
                    break;
                case 87 :
                    // InternalOptGrammar.g:7580:3: (enumLiteral_86= 'bytes20' )
                    {
                    // InternalOptGrammar.g:7580:3: (enumLiteral_86= 'bytes20' )
                    // InternalOptGrammar.g:7581:4: enumLiteral_86= 'bytes20'
                    {
                    enumLiteral_86=(Token)match(input,158,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES20EnumLiteralDeclaration_86().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_86, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES20EnumLiteralDeclaration_86());
                      			
                    }

                    }


                    }
                    break;
                case 88 :
                    // InternalOptGrammar.g:7588:3: (enumLiteral_87= 'bytes21' )
                    {
                    // InternalOptGrammar.g:7588:3: (enumLiteral_87= 'bytes21' )
                    // InternalOptGrammar.g:7589:4: enumLiteral_87= 'bytes21'
                    {
                    enumLiteral_87=(Token)match(input,159,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES21EnumLiteralDeclaration_87().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_87, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES21EnumLiteralDeclaration_87());
                      			
                    }

                    }


                    }
                    break;
                case 89 :
                    // InternalOptGrammar.g:7596:3: (enumLiteral_88= 'bytes22' )
                    {
                    // InternalOptGrammar.g:7596:3: (enumLiteral_88= 'bytes22' )
                    // InternalOptGrammar.g:7597:4: enumLiteral_88= 'bytes22'
                    {
                    enumLiteral_88=(Token)match(input,160,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES22EnumLiteralDeclaration_88().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_88, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES22EnumLiteralDeclaration_88());
                      			
                    }

                    }


                    }
                    break;
                case 90 :
                    // InternalOptGrammar.g:7604:3: (enumLiteral_89= 'bytes23' )
                    {
                    // InternalOptGrammar.g:7604:3: (enumLiteral_89= 'bytes23' )
                    // InternalOptGrammar.g:7605:4: enumLiteral_89= 'bytes23'
                    {
                    enumLiteral_89=(Token)match(input,161,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES23EnumLiteralDeclaration_89().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_89, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES23EnumLiteralDeclaration_89());
                      			
                    }

                    }


                    }
                    break;
                case 91 :
                    // InternalOptGrammar.g:7612:3: (enumLiteral_90= 'bytes24' )
                    {
                    // InternalOptGrammar.g:7612:3: (enumLiteral_90= 'bytes24' )
                    // InternalOptGrammar.g:7613:4: enumLiteral_90= 'bytes24'
                    {
                    enumLiteral_90=(Token)match(input,162,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES24EnumLiteralDeclaration_90().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_90, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES24EnumLiteralDeclaration_90());
                      			
                    }

                    }


                    }
                    break;
                case 92 :
                    // InternalOptGrammar.g:7620:3: (enumLiteral_91= 'bytes25' )
                    {
                    // InternalOptGrammar.g:7620:3: (enumLiteral_91= 'bytes25' )
                    // InternalOptGrammar.g:7621:4: enumLiteral_91= 'bytes25'
                    {
                    enumLiteral_91=(Token)match(input,163,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES25EnumLiteralDeclaration_91().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_91, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES25EnumLiteralDeclaration_91());
                      			
                    }

                    }


                    }
                    break;
                case 93 :
                    // InternalOptGrammar.g:7628:3: (enumLiteral_92= 'bytes26' )
                    {
                    // InternalOptGrammar.g:7628:3: (enumLiteral_92= 'bytes26' )
                    // InternalOptGrammar.g:7629:4: enumLiteral_92= 'bytes26'
                    {
                    enumLiteral_92=(Token)match(input,164,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES26EnumLiteralDeclaration_92().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_92, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES26EnumLiteralDeclaration_92());
                      			
                    }

                    }


                    }
                    break;
                case 94 :
                    // InternalOptGrammar.g:7636:3: (enumLiteral_93= 'bytes27' )
                    {
                    // InternalOptGrammar.g:7636:3: (enumLiteral_93= 'bytes27' )
                    // InternalOptGrammar.g:7637:4: enumLiteral_93= 'bytes27'
                    {
                    enumLiteral_93=(Token)match(input,165,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES27EnumLiteralDeclaration_93().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_93, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES27EnumLiteralDeclaration_93());
                      			
                    }

                    }


                    }
                    break;
                case 95 :
                    // InternalOptGrammar.g:7644:3: (enumLiteral_94= 'bytes28' )
                    {
                    // InternalOptGrammar.g:7644:3: (enumLiteral_94= 'bytes28' )
                    // InternalOptGrammar.g:7645:4: enumLiteral_94= 'bytes28'
                    {
                    enumLiteral_94=(Token)match(input,166,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES28EnumLiteralDeclaration_94().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_94, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES28EnumLiteralDeclaration_94());
                      			
                    }

                    }


                    }
                    break;
                case 96 :
                    // InternalOptGrammar.g:7652:3: (enumLiteral_95= 'bytes29' )
                    {
                    // InternalOptGrammar.g:7652:3: (enumLiteral_95= 'bytes29' )
                    // InternalOptGrammar.g:7653:4: enumLiteral_95= 'bytes29'
                    {
                    enumLiteral_95=(Token)match(input,167,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES29EnumLiteralDeclaration_95().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_95, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES29EnumLiteralDeclaration_95());
                      			
                    }

                    }


                    }
                    break;
                case 97 :
                    // InternalOptGrammar.g:7660:3: (enumLiteral_96= 'bytes30' )
                    {
                    // InternalOptGrammar.g:7660:3: (enumLiteral_96= 'bytes30' )
                    // InternalOptGrammar.g:7661:4: enumLiteral_96= 'bytes30'
                    {
                    enumLiteral_96=(Token)match(input,168,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES30EnumLiteralDeclaration_96().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_96, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES30EnumLiteralDeclaration_96());
                      			
                    }

                    }


                    }
                    break;
                case 98 :
                    // InternalOptGrammar.g:7668:3: (enumLiteral_97= 'bytes31' )
                    {
                    // InternalOptGrammar.g:7668:3: (enumLiteral_97= 'bytes31' )
                    // InternalOptGrammar.g:7669:4: enumLiteral_97= 'bytes31'
                    {
                    enumLiteral_97=(Token)match(input,169,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES31EnumLiteralDeclaration_97().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_97, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES31EnumLiteralDeclaration_97());
                      			
                    }

                    }


                    }
                    break;
                case 99 :
                    // InternalOptGrammar.g:7676:3: (enumLiteral_98= 'bytes32' )
                    {
                    // InternalOptGrammar.g:7676:3: (enumLiteral_98= 'bytes32' )
                    // InternalOptGrammar.g:7677:4: enumLiteral_98= 'bytes32'
                    {
                    enumLiteral_98=(Token)match(input,170,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES32EnumLiteralDeclaration_98().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_98, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES32EnumLiteralDeclaration_98());
                      			
                    }

                    }


                    }
                    break;
                case 100 :
                    // InternalOptGrammar.g:7684:3: (enumLiteral_99= 'string' )
                    {
                    // InternalOptGrammar.g:7684:3: (enumLiteral_99= 'string' )
                    // InternalOptGrammar.g:7685:4: enumLiteral_99= 'string'
                    {
                    enumLiteral_99=(Token)match(input,171,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getSTRINGEnumLiteralDeclaration_99().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_99, grammarAccess.getElementaryTypeNameEnumAccess().getSTRINGEnumLiteralDeclaration_99());
                      			
                    }

                    }


                    }
                    break;
                case 101 :
                    // InternalOptGrammar.g:7692:3: (enumLiteral_100= 'address' )
                    {
                    // InternalOptGrammar.g:7692:3: (enumLiteral_100= 'address' )
                    // InternalOptGrammar.g:7693:4: enumLiteral_100= 'address'
                    {
                    enumLiteral_100=(Token)match(input,172,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getADDRESSEnumLiteralDeclaration_100().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_100, grammarAccess.getElementaryTypeNameEnumAccess().getADDRESSEnumLiteralDeclaration_100());
                      			
                    }

                    }


                    }
                    break;
                case 102 :
                    // InternalOptGrammar.g:7700:3: (enumLiteral_101= 'bool' )
                    {
                    // InternalOptGrammar.g:7700:3: (enumLiteral_101= 'bool' )
                    // InternalOptGrammar.g:7701:4: enumLiteral_101= 'bool'
                    {
                    enumLiteral_101=(Token)match(input,173,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBOOLEnumLiteralDeclaration_101().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_101, grammarAccess.getElementaryTypeNameEnumAccess().getBOOLEnumLiteralDeclaration_101());
                      			
                    }

                    }


                    }
                    break;
                case 103 :
                    // InternalOptGrammar.g:7708:3: (enumLiteral_102= 'real' )
                    {
                    // InternalOptGrammar.g:7708:3: (enumLiteral_102= 'real' )
                    // InternalOptGrammar.g:7709:4: enumLiteral_102= 'real'
                    {
                    enumLiteral_102=(Token)match(input,174,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getREALEnumLiteralDeclaration_102().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_102, grammarAccess.getElementaryTypeNameEnumAccess().getREALEnumLiteralDeclaration_102());
                      			
                    }

                    }


                    }
                    break;
                case 104 :
                    // InternalOptGrammar.g:7716:3: (enumLiteral_103= 'ureal' )
                    {
                    // InternalOptGrammar.g:7716:3: (enumLiteral_103= 'ureal' )
                    // InternalOptGrammar.g:7717:4: enumLiteral_103= 'ureal'
                    {
                    enumLiteral_103=(Token)match(input,175,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7727:1: ruleLocationSpecifierEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) ) ;
    public final Enumerator ruleLocationSpecifierEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7733:2: ( ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) ) )
            // InternalOptGrammar.g:7734:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) )
            {
            // InternalOptGrammar.g:7734:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 176:
                {
                alt106=1;
                }
                break;
            case 177:
                {
                alt106=2;
                }
                break;
            case 178:
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
                    // InternalOptGrammar.g:7735:3: (enumLiteral_0= 'memory' )
                    {
                    // InternalOptGrammar.g:7735:3: (enumLiteral_0= 'memory' )
                    // InternalOptGrammar.g:7736:4: enumLiteral_0= 'memory'
                    {
                    enumLiteral_0=(Token)match(input,176,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7743:3: (enumLiteral_1= 'storage' )
                    {
                    // InternalOptGrammar.g:7743:3: (enumLiteral_1= 'storage' )
                    // InternalOptGrammar.g:7744:4: enumLiteral_1= 'storage'
                    {
                    enumLiteral_1=(Token)match(input,177,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7751:3: (enumLiteral_2= 'calldata' )
                    {
                    // InternalOptGrammar.g:7751:3: (enumLiteral_2= 'calldata' )
                    // InternalOptGrammar.g:7752:4: enumLiteral_2= 'calldata'
                    {
                    enumLiteral_2=(Token)match(input,178,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7762:1: ruleVisibilityEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) ;
    public final Enumerator ruleVisibilityEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7768:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) )
            // InternalOptGrammar.g:7769:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            {
            // InternalOptGrammar.g:7769:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            int alt107=4;
            switch ( input.LA(1) ) {
            case 179:
                {
                alt107=1;
                }
                break;
            case 180:
                {
                alt107=2;
                }
                break;
            case 181:
                {
                alt107=3;
                }
                break;
            case 182:
                {
                alt107=4;
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
                    // InternalOptGrammar.g:7770:3: (enumLiteral_0= 'public' )
                    {
                    // InternalOptGrammar.g:7770:3: (enumLiteral_0= 'public' )
                    // InternalOptGrammar.g:7771:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,179,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7778:3: (enumLiteral_1= 'internal' )
                    {
                    // InternalOptGrammar.g:7778:3: (enumLiteral_1= 'internal' )
                    // InternalOptGrammar.g:7779:4: enumLiteral_1= 'internal'
                    {
                    enumLiteral_1=(Token)match(input,180,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7786:3: (enumLiteral_2= 'private' )
                    {
                    // InternalOptGrammar.g:7786:3: (enumLiteral_2= 'private' )
                    // InternalOptGrammar.g:7787:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,181,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7794:3: (enumLiteral_3= 'external' )
                    {
                    // InternalOptGrammar.g:7794:3: (enumLiteral_3= 'external' )
                    // InternalOptGrammar.g:7795:4: enumLiteral_3= 'external'
                    {
                    enumLiteral_3=(Token)match(input,182,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7805:1: ruleAssignmentOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) ;
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
            // InternalOptGrammar.g:7811:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) )
            // InternalOptGrammar.g:7812:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            {
            // InternalOptGrammar.g:7812:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            int alt108=12;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt108=1;
                }
                break;
            case 183:
                {
                alt108=2;
                }
                break;
            case 184:
                {
                alt108=3;
                }
                break;
            case 185:
                {
                alt108=4;
                }
                break;
            case 186:
                {
                alt108=5;
                }
                break;
            case 187:
                {
                alt108=6;
                }
                break;
            case 188:
                {
                alt108=7;
                }
                break;
            case 189:
                {
                alt108=8;
                }
                break;
            case 190:
                {
                alt108=9;
                }
                break;
            case 191:
                {
                alt108=10;
                }
                break;
            case 192:
                {
                alt108=11;
                }
                break;
            case 193:
                {
                alt108=12;
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
                    // InternalOptGrammar.g:7813:3: (enumLiteral_0= '=' )
                    {
                    // InternalOptGrammar.g:7813:3: (enumLiteral_0= '=' )
                    // InternalOptGrammar.g:7814:4: enumLiteral_0= '='
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
                    // InternalOptGrammar.g:7821:3: (enumLiteral_1= '|=' )
                    {
                    // InternalOptGrammar.g:7821:3: (enumLiteral_1= '|=' )
                    // InternalOptGrammar.g:7822:4: enumLiteral_1= '|='
                    {
                    enumLiteral_1=(Token)match(input,183,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7829:3: (enumLiteral_2= '^=' )
                    {
                    // InternalOptGrammar.g:7829:3: (enumLiteral_2= '^=' )
                    // InternalOptGrammar.g:7830:4: enumLiteral_2= '^='
                    {
                    enumLiteral_2=(Token)match(input,184,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7837:3: (enumLiteral_3= '&=' )
                    {
                    // InternalOptGrammar.g:7837:3: (enumLiteral_3= '&=' )
                    // InternalOptGrammar.g:7838:4: enumLiteral_3= '&='
                    {
                    enumLiteral_3=(Token)match(input,185,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalOptGrammar.g:7845:3: (enumLiteral_4= '<<=' )
                    {
                    // InternalOptGrammar.g:7845:3: (enumLiteral_4= '<<=' )
                    // InternalOptGrammar.g:7846:4: enumLiteral_4= '<<='
                    {
                    enumLiteral_4=(Token)match(input,186,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalOptGrammar.g:7853:3: (enumLiteral_5= '>>=' )
                    {
                    // InternalOptGrammar.g:7853:3: (enumLiteral_5= '>>=' )
                    // InternalOptGrammar.g:7854:4: enumLiteral_5= '>>='
                    {
                    enumLiteral_5=(Token)match(input,187,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalOptGrammar.g:7861:3: (enumLiteral_6= '>>>=' )
                    {
                    // InternalOptGrammar.g:7861:3: (enumLiteral_6= '>>>=' )
                    // InternalOptGrammar.g:7862:4: enumLiteral_6= '>>>='
                    {
                    enumLiteral_6=(Token)match(input,188,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalOptGrammar.g:7869:3: (enumLiteral_7= '+=' )
                    {
                    // InternalOptGrammar.g:7869:3: (enumLiteral_7= '+=' )
                    // InternalOptGrammar.g:7870:4: enumLiteral_7= '+='
                    {
                    enumLiteral_7=(Token)match(input,189,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalOptGrammar.g:7877:3: (enumLiteral_8= '-=' )
                    {
                    // InternalOptGrammar.g:7877:3: (enumLiteral_8= '-=' )
                    // InternalOptGrammar.g:7878:4: enumLiteral_8= '-='
                    {
                    enumLiteral_8=(Token)match(input,190,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalOptGrammar.g:7885:3: (enumLiteral_9= '*=' )
                    {
                    // InternalOptGrammar.g:7885:3: (enumLiteral_9= '*=' )
                    // InternalOptGrammar.g:7886:4: enumLiteral_9= '*='
                    {
                    enumLiteral_9=(Token)match(input,191,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalOptGrammar.g:7893:3: (enumLiteral_10= '/=' )
                    {
                    // InternalOptGrammar.g:7893:3: (enumLiteral_10= '/=' )
                    // InternalOptGrammar.g:7894:4: enumLiteral_10= '/='
                    {
                    enumLiteral_10=(Token)match(input,192,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalOptGrammar.g:7901:3: (enumLiteral_11= '%=' )
                    {
                    // InternalOptGrammar.g:7901:3: (enumLiteral_11= '%=' )
                    // InternalOptGrammar.g:7902:4: enumLiteral_11= '%='
                    {
                    enumLiteral_11=(Token)match(input,193,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7912:1: ruleEqualityOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7918:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalOptGrammar.g:7919:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalOptGrammar.g:7919:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==194) ) {
                alt109=1;
            }
            else if ( (LA109_0==195) ) {
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
                    // InternalOptGrammar.g:7920:3: (enumLiteral_0= '==' )
                    {
                    // InternalOptGrammar.g:7920:3: (enumLiteral_0= '==' )
                    // InternalOptGrammar.g:7921:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,194,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7928:3: (enumLiteral_1= '!=' )
                    {
                    // InternalOptGrammar.g:7928:3: (enumLiteral_1= '!=' )
                    // InternalOptGrammar.g:7929:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,195,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7939:1: ruleComparisonOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) ;
    public final Enumerator ruleComparisonOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7945:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) )
            // InternalOptGrammar.g:7946:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            {
            // InternalOptGrammar.g:7946:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            int alt110=5;
            switch ( input.LA(1) ) {
            case 196:
                {
                alt110=1;
                }
                break;
            case 197:
                {
                alt110=2;
                }
                break;
            case 198:
                {
                alt110=3;
                }
                break;
            case 199:
                {
                alt110=4;
                }
                break;
            case 200:
                {
                alt110=5;
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
                    // InternalOptGrammar.g:7947:3: (enumLiteral_0= '<' )
                    {
                    // InternalOptGrammar.g:7947:3: (enumLiteral_0= '<' )
                    // InternalOptGrammar.g:7948:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,196,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7955:3: (enumLiteral_1= '>' )
                    {
                    // InternalOptGrammar.g:7955:3: (enumLiteral_1= '>' )
                    // InternalOptGrammar.g:7956:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,197,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7963:3: (enumLiteral_2= '<=' )
                    {
                    // InternalOptGrammar.g:7963:3: (enumLiteral_2= '<=' )
                    // InternalOptGrammar.g:7964:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,198,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7971:3: (enumLiteral_3= '>=' )
                    {
                    // InternalOptGrammar.g:7971:3: (enumLiteral_3= '>=' )
                    // InternalOptGrammar.g:7972:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,199,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalOptGrammar.g:7979:3: (enumLiteral_4= 'in' )
                    {
                    // InternalOptGrammar.g:7979:3: (enumLiteral_4= 'in' )
                    // InternalOptGrammar.g:7980:4: enumLiteral_4= 'in'
                    {
                    enumLiteral_4=(Token)match(input,200,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7990:1: ruleShiftOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) ;
    public final Enumerator ruleShiftOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7996:2: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) )
            // InternalOptGrammar.g:7997:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            {
            // InternalOptGrammar.g:7997:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 201:
                {
                alt111=1;
                }
                break;
            case 202:
                {
                alt111=2;
                }
                break;
            case 203:
                {
                alt111=3;
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
                    // InternalOptGrammar.g:7998:3: (enumLiteral_0= '<<' )
                    {
                    // InternalOptGrammar.g:7998:3: (enumLiteral_0= '<<' )
                    // InternalOptGrammar.g:7999:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,201,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:8006:3: (enumLiteral_1= '>>' )
                    {
                    // InternalOptGrammar.g:8006:3: (enumLiteral_1= '>>' )
                    // InternalOptGrammar.g:8007:4: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,202,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:8014:3: (enumLiteral_2= '>>>' )
                    {
                    // InternalOptGrammar.g:8014:3: (enumLiteral_2= '>>>' )
                    // InternalOptGrammar.g:8015:4: enumLiteral_2= '>>>'
                    {
                    enumLiteral_2=(Token)match(input,203,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:8025:1: ruleAdditionOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:8031:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalOptGrammar.g:8032:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalOptGrammar.g:8032:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==56) ) {
                alt112=1;
            }
            else if ( (LA112_0==57) ) {
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
                    // InternalOptGrammar.g:8033:3: (enumLiteral_0= '+' )
                    {
                    // InternalOptGrammar.g:8033:3: (enumLiteral_0= '+' )
                    // InternalOptGrammar.g:8034:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:8041:3: (enumLiteral_1= '-' )
                    {
                    // InternalOptGrammar.g:8041:3: (enumLiteral_1= '-' )
                    // InternalOptGrammar.g:8042:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:8052:1: ruleMulDivModOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMulDivModOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:8058:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalOptGrammar.g:8059:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalOptGrammar.g:8059:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt113=1;
                }
                break;
            case 69:
                {
                alt113=2;
                }
                break;
            case 204:
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
                    // InternalOptGrammar.g:8060:3: (enumLiteral_0= '*' )
                    {
                    // InternalOptGrammar.g:8060:3: (enumLiteral_0= '*' )
                    // InternalOptGrammar.g:8061:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:8068:3: (enumLiteral_1= '/' )
                    {
                    // InternalOptGrammar.g:8068:3: (enumLiteral_1= '/' )
                    // InternalOptGrammar.g:8069:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMulDivModOpEnumAccess().getDIVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:8076:3: (enumLiteral_2= '%' )
                    {
                    // InternalOptGrammar.g:8076:3: (enumLiteral_2= '%' )
                    // InternalOptGrammar.g:8077:4: enumLiteral_2= '%'
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
    // InternalOptGrammar.g:8087:1: ruleIncDecOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncDecOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:8093:2: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalOptGrammar.g:8094:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalOptGrammar.g:8094:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==59) ) {
                alt114=1;
            }
            else if ( (LA114_0==60) ) {
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
                    // InternalOptGrammar.g:8095:3: (enumLiteral_0= '++' )
                    {
                    // InternalOptGrammar.g:8095:3: (enumLiteral_0= '++' )
                    // InternalOptGrammar.g:8096:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:8103:3: (enumLiteral_1= '--' )
                    {
                    // InternalOptGrammar.g:8103:3: (enumLiteral_1= '--' )
                    // InternalOptGrammar.g:8104:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:8114:1: ruleBooleanLiteralEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteralEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:8120:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalOptGrammar.g:8121:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalOptGrammar.g:8121:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==205) ) {
                alt115=1;
            }
            else if ( (LA115_0==206) ) {
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
                    // InternalOptGrammar.g:8122:3: (enumLiteral_0= 'true' )
                    {
                    // InternalOptGrammar.g:8122:3: (enumLiteral_0= 'true' )
                    // InternalOptGrammar.g:8123:4: enumLiteral_0= 'true'
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
                    // InternalOptGrammar.g:8130:3: (enumLiteral_1= 'false' )
                    {
                    // InternalOptGrammar.g:8130:3: (enumLiteral_1= 'false' )
                    // InternalOptGrammar.g:8131:4: enumLiteral_1= 'false'
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
    // InternalOptGrammar.g:8141:1: ruleEtherSubDenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) ;
    public final Enumerator ruleEtherSubDenominationEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:8147:2: ( ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) )
            // InternalOptGrammar.g:8148:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            {
            // InternalOptGrammar.g:8148:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            int alt116=4;
            switch ( input.LA(1) ) {
            case 207:
                {
                alt116=1;
                }
                break;
            case 208:
                {
                alt116=2;
                }
                break;
            case 209:
                {
                alt116=3;
                }
                break;
            case 210:
                {
                alt116=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalOptGrammar.g:8149:3: (enumLiteral_0= 'wei' )
                    {
                    // InternalOptGrammar.g:8149:3: (enumLiteral_0= 'wei' )
                    // InternalOptGrammar.g:8150:4: enumLiteral_0= 'wei'
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
                    // InternalOptGrammar.g:8157:3: (enumLiteral_1= 'szabo' )
                    {
                    // InternalOptGrammar.g:8157:3: (enumLiteral_1= 'szabo' )
                    // InternalOptGrammar.g:8158:4: enumLiteral_1= 'szabo'
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
                    // InternalOptGrammar.g:8165:3: (enumLiteral_2= 'finney' )
                    {
                    // InternalOptGrammar.g:8165:3: (enumLiteral_2= 'finney' )
                    // InternalOptGrammar.g:8166:4: enumLiteral_2= 'finney'
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
                    // InternalOptGrammar.g:8173:3: (enumLiteral_3= 'ether' )
                    {
                    // InternalOptGrammar.g:8173:3: (enumLiteral_3= 'ether' )
                    // InternalOptGrammar.g:8174:4: enumLiteral_3= 'ether'
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
    // InternalOptGrammar.g:8184:1: ruleTimeSubdenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) ;
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
            // InternalOptGrammar.g:8190:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) )
            // InternalOptGrammar.g:8191:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            {
            // InternalOptGrammar.g:8191:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            int alt117=6;
            switch ( input.LA(1) ) {
            case 211:
                {
                alt117=1;
                }
                break;
            case 212:
                {
                alt117=2;
                }
                break;
            case 213:
                {
                alt117=3;
                }
                break;
            case 214:
                {
                alt117=4;
                }
                break;
            case 215:
                {
                alt117=5;
                }
                break;
            case 216:
                {
                alt117=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalOptGrammar.g:8192:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalOptGrammar.g:8192:3: (enumLiteral_0= 'seconds' )
                    // InternalOptGrammar.g:8193:4: enumLiteral_0= 'seconds'
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
                    // InternalOptGrammar.g:8200:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalOptGrammar.g:8200:3: (enumLiteral_1= 'minutes' )
                    // InternalOptGrammar.g:8201:4: enumLiteral_1= 'minutes'
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
                    // InternalOptGrammar.g:8208:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalOptGrammar.g:8208:3: (enumLiteral_2= 'hours' )
                    // InternalOptGrammar.g:8209:4: enumLiteral_2= 'hours'
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
                    // InternalOptGrammar.g:8216:3: (enumLiteral_3= 'days' )
                    {
                    // InternalOptGrammar.g:8216:3: (enumLiteral_3= 'days' )
                    // InternalOptGrammar.g:8217:4: enumLiteral_3= 'days'
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
                    // InternalOptGrammar.g:8224:3: (enumLiteral_4= 'weeks' )
                    {
                    // InternalOptGrammar.g:8224:3: (enumLiteral_4= 'weeks' )
                    // InternalOptGrammar.g:8225:4: enumLiteral_4= 'weeks'
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
                    // InternalOptGrammar.g:8232:3: (enumLiteral_5= 'years' )
                    {
                    // InternalOptGrammar.g:8232:3: (enumLiteral_5= 'years' )
                    // InternalOptGrammar.g:8233:4: enumLiteral_5= 'years'
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
    // InternalOptGrammar.g:8243:1: ruleSpecialExpressionTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) ;
    public final Enumerator ruleSpecialExpressionTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:8249:2: ( ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) )
            // InternalOptGrammar.g:8250:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            {
            // InternalOptGrammar.g:8250:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==217) ) {
                alt118=1;
            }
            else if ( (LA118_0==218) ) {
                alt118=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // InternalOptGrammar.g:8251:3: (enumLiteral_0= 'super' )
                    {
                    // InternalOptGrammar.g:8251:3: (enumLiteral_0= 'super' )
                    // InternalOptGrammar.g:8252:4: enumLiteral_0= 'super'
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
                    // InternalOptGrammar.g:8259:3: (enumLiteral_1= 'this' )
                    {
                    // InternalOptGrammar.g:8259:3: (enumLiteral_1= 'this' )
                    // InternalOptGrammar.g:8260:4: enumLiteral_1= 'this'
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

    // $ANTLR start synpred1_InternalOptGrammar
    public final void synpred1_InternalOptGrammar_fragment() throws RecognitionException {   
        // InternalOptGrammar.g:3249:5: ( 'else' )
        // InternalOptGrammar.g:3249:6: 'else'
        {
        match(input,40,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalOptGrammar

    // $ANTLR start synpred2_InternalOptGrammar
    public final void synpred2_InternalOptGrammar_fragment() throws RecognitionException {   
        // InternalOptGrammar.g:3391:4: ( ';' )
        // InternalOptGrammar.g:3391:5: ';'
        {
        match(input,18,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalOptGrammar

    // $ANTLR start synpred3_InternalOptGrammar
    public final void synpred3_InternalOptGrammar_fragment() throws RecognitionException {   
        // InternalOptGrammar.g:4540:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )
        // InternalOptGrammar.g:4540:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        {
        // InternalOptGrammar.g:4540:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        // InternalOptGrammar.g:4541:5: () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) )
        {
        // InternalOptGrammar.g:4541:5: ()
        // InternalOptGrammar.g:4542:5: 
        {
        }

        // InternalOptGrammar.g:4543:5: ( ( ruleAdditionOpEnum ) )
        // InternalOptGrammar.g:4544:6: ( ruleAdditionOpEnum )
        {
        // InternalOptGrammar.g:4544:6: ( ruleAdditionOpEnum )
        // InternalOptGrammar.g:4545:7: ruleAdditionOpEnum
        {
        pushFollow(FOLLOW_15);
        ruleAdditionOpEnum();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalOptGrammar.g:4548:5: ( ( ruleMulDivMod ) )
        // InternalOptGrammar.g:4549:6: ( ruleMulDivMod )
        {
        // InternalOptGrammar.g:4549:6: ( ruleMulDivMod )
        // InternalOptGrammar.g:4550:7: ruleMulDivMod
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
    // $ANTLR end synpred3_InternalOptGrammar

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
    public final boolean synpred3_InternalOptGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalOptGrammar_fragment(); // can never throw exception
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


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String dfa_1s = "\154\uffff";
    static final String dfa_2s = "\151\4\3\uffff";
    static final String dfa_3s = "\1\u00da\150\u00b6\3\uffff";
    static final String dfa_4s = "\151\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\154\uffff}>";
    static final String[] dfa_6s = {
            "\10\153\13\uffff\1\153\10\uffff\1\151\3\uffff\1\152\21\uffff\17\153\2\uffff\1\153\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\35\uffff\2\153\12\uffff\2\153",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
            "\1\151\22\uffff\1\153\3\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u008d\uffff\7\151",
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

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2023:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2267:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000030B80000L,0x0000000000000000L,0x0078000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020800000L,0x0000000000000000L,0x0078000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008460010L,0x0000000000000000L,0x0078000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFC0000002800FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFFC0000000800FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001100080010L,0xFFFFFFFFFFFFFF00L,0x0000FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000088000010L,0x0000000000000000L,0x007F000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFFFFFFF00L,0x0000FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001100000010L,0xFFFFFFFFFFFFFF00L,0x0000FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xFFC0000800800FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xFFC0000003800FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xFFC0000001800FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000088800010L,0x0000000000000000L,0x007F000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002400800002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001102000010L,0xFFFFFFFFFFFFFF00L,0x0000FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000088000012L,0x0000000000000000L,0x007F000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xFFC0FED100820FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xFFC0FED100860FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xFFC0000000840FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xFFC0FED102820FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0xFFC0FED1008A0FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000C8000012L,0x0000000000000000L,0xFFFF000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000002400810000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000002400800000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xE000000000800FF0L,0xFFFFFFFFFFFFFF9FL,0x0000FFFFFFFFFFFFL,0x0000000006006000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00000000008001B0L,0x0000000000000080L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0300000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x00000000008001A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000002000000000L});

}