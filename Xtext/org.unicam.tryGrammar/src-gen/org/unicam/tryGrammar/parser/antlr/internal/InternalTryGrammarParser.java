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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'contract'", "'is'", "','", "'library'", "'{'", "';'", "'}'", "'('", "')'", "':'", "'function'", "'returns'", "'constant'", "'struct'", "'enum'", "'='", "'indexed'", "'mapping'", "'=>'", "'['", "']'", "'var'", "'.'", "'modifier'", "'event'", "'anonymous'", "'delete'", "'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'return'", "'throw'", "'_'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'**'", "'!'", "'~'", "'+'", "'-'", "'new'", "'++'", "'--'", "'now'", "'int'", "'int16'", "'int24'", "'int32'", "'int40'", "'int48'", "'int56'", "'int64'", "'int72'", "'int80'", "'int88'", "'int96'", "'int104'", "'int112'", "'int120'", "'int128'", "'int136'", "'int144'", "'int152'", "'int160'", "'int168'", "'int178'", "'int184'", "'int192'", "'int200'", "'int208'", "'int216'", "'int224'", "'int232'", "'int240'", "'int248'", "'int256'", "'uint'", "'uint8'", "'uint16'", "'uint24'", "'uint32'", "'uint40'", "'uint48'", "'uint56'", "'uint64'", "'uint72'", "'uint80'", "'uint88'", "'uint96'", "'uint104'", "'uint112'", "'uint120'", "'uint128'", "'uint136'", "'uint144'", "'uint152'", "'uint160'", "'uint168'", "'uint178'", "'uint184'", "'uint192'", "'uint200'", "'uint208'", "'uint216'", "'uint224'", "'uint232'", "'uint240'", "'uint248'", "'uint256'", "'byte'", "'bytes'", "'bytes1'", "'bytes2'", "'bytes3'", "'bytes4'", "'bytes5'", "'bytes6'", "'bytes7'", "'bytes8'", "'bytes9'", "'bytes10'", "'bytes11'", "'bytes12'", "'bytes13'", "'bytes14'", "'bytes15'", "'bytes16'", "'bytes17'", "'bytes18'", "'bytes19'", "'bytes20'", "'bytes21'", "'bytes22'", "'bytes23'", "'bytes24'", "'bytes25'", "'bytes26'", "'bytes27'", "'bytes28'", "'bytes29'", "'bytes30'", "'bytes31'", "'bytes32'", "'string'", "'address'", "'bool'", "'real'", "'ureal'", "'memory'", "'storage'", "'calldata'", "'public'", "'internal'", "'private'", "'external'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'>>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'in'", "'<<'", "'>>'", "'>>>'", "'*'", "'/'", "'%'", "'true'", "'false'", "'wei'", "'szabo'", "'finney'", "'ether'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'years'", "'msg'", "'block'", "'tx'", "'super'", "'this'"
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
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__214=214;
    public static final int T__213=213;
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
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_WS=11;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=12;
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
        	return "Model";
       	}

       	@Override
       	protected TryGrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTryGrammar.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTryGrammar.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalTryGrammar.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalTryGrammar.g:72:1: ruleModel returns [EObject current=null] : ( (lv_operations_0_0= ruleContract ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:78:2: ( ( (lv_operations_0_0= ruleContract ) )* )
            // InternalTryGrammar.g:79:2: ( (lv_operations_0_0= ruleContract ) )*
            {
            // InternalTryGrammar.g:79:2: ( (lv_operations_0_0= ruleContract ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTryGrammar.g:80:3: (lv_operations_0_0= ruleContract )
            	    {
            	    // InternalTryGrammar.g:80:3: (lv_operations_0_0= ruleContract )
            	    // InternalTryGrammar.g:81:4: lv_operations_0_0= ruleContract
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
            	      					"org.unicam.tryGrammar.TryGrammar.Contract");
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
    // InternalTryGrammar.g:101:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalTryGrammar.g:101:49: (iv_ruleContract= ruleContract EOF )
            // InternalTryGrammar.g:102:2: iv_ruleContract= ruleContract EOF
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
    // InternalTryGrammar.g:108:1: ruleContract returns [EObject current=null] : (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) ;
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
            // InternalTryGrammar.g:114:2: ( (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) )
            // InternalTryGrammar.g:115:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            {
            // InternalTryGrammar.g:115:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            // InternalTryGrammar.g:116:3: otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
              		
            }
            // InternalTryGrammar.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:122:5: lv_name_1_0= RULE_ID
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
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            // InternalTryGrammar.g:138:3: (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTryGrammar.g:139:4: otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContractAccess().getIsKeyword_2_0());
                      			
                    }
                    // InternalTryGrammar.g:143:4: ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) )
                    // InternalTryGrammar.g:144:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    {
                    // InternalTryGrammar.g:144:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    // InternalTryGrammar.g:145:6: lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContractAccess().getInheritanceSpecifiersInheritanceSpecifierParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
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

                    // InternalTryGrammar.g:162:4: (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalTryGrammar.g:163:5: otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getContractAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:167:5: ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    // InternalTryGrammar.g:168:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    {
                    	    // InternalTryGrammar.g:168:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    // InternalTryGrammar.g:169:7: lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContractAccess().getInheritanceSpecifiersInheritanceSpecifierParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTryGrammar.g:188:3: ( (lv_body_6_0= ruleDefinitionBody ) )
            // InternalTryGrammar.g:189:4: (lv_body_6_0= ruleDefinitionBody )
            {
            // InternalTryGrammar.g:189:4: (lv_body_6_0= ruleDefinitionBody )
            // InternalTryGrammar.g:190:5: lv_body_6_0= ruleDefinitionBody
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
    // InternalTryGrammar.g:211:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalTryGrammar.g:211:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalTryGrammar.g:212:2: iv_ruleLibrary= ruleLibrary EOF
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
    // InternalTryGrammar.g:218:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) ;
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
            // InternalTryGrammar.g:224:2: ( (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) )
            // InternalTryGrammar.g:225:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            {
            // InternalTryGrammar.g:225:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            // InternalTryGrammar.g:226:3: otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
              		
            }
            // InternalTryGrammar.g:230:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:231:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:231:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:232:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
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

            // InternalTryGrammar.g:248:3: (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTryGrammar.g:249:4: otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getIsKeyword_2_0());
                      			
                    }
                    // InternalTryGrammar.g:253:4: ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) )
                    // InternalTryGrammar.g:254:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    {
                    // InternalTryGrammar.g:254:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    // InternalTryGrammar.g:255:6: lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLibraryAccess().getInheritanceSpecifiersInheritanceSpecifierParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
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

                    // InternalTryGrammar.g:272:4: (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTryGrammar.g:273:5: otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:277:5: ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    // InternalTryGrammar.g:278:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    {
                    	    // InternalTryGrammar.g:278:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    // InternalTryGrammar.g:279:7: lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLibraryAccess().getInheritanceSpecifiersInheritanceSpecifierParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTryGrammar.g:298:3: ( (lv_body_6_0= ruleDefinitionBody ) )
            // InternalTryGrammar.g:299:4: (lv_body_6_0= ruleDefinitionBody )
            {
            // InternalTryGrammar.g:299:4: (lv_body_6_0= ruleDefinitionBody )
            // InternalTryGrammar.g:300:5: lv_body_6_0= ruleDefinitionBody
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
    // InternalTryGrammar.g:321:1: entryRuleDefinitionBody returns [EObject current=null] : iv_ruleDefinitionBody= ruleDefinitionBody EOF ;
    public final EObject entryRuleDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionBody = null;


        try {
            // InternalTryGrammar.g:321:55: (iv_ruleDefinitionBody= ruleDefinitionBody EOF )
            // InternalTryGrammar.g:322:2: iv_ruleDefinitionBody= ruleDefinitionBody EOF
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
    // InternalTryGrammar.g:328:1: ruleDefinitionBody returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) ;
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
            // InternalTryGrammar.g:334:2: ( ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) )
            // InternalTryGrammar.g:335:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            {
            // InternalTryGrammar.g:335:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            // InternalTryGrammar.g:336:3: () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}'
            {
            // InternalTryGrammar.g:336:3: ()
            // InternalTryGrammar.g:337:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDefinitionBodyAccess().getDefinitionBodyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefinitionBodyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalTryGrammar.g:347:3: ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )*
            loop6:
            do {
                int alt6=7;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    alt6=1;
                    }
                    break;
                case 26:
                    {
                    alt6=2;
                    }
                    break;
                case 27:
                    {
                    alt6=3;
                    }
                    break;
                case RULE_ID:
                case 30:
                case 34:
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
                    {
                    alt6=4;
                    }
                    break;
                case 36:
                    {
                    alt6=5;
                    }
                    break;
                case 37:
                    {
                    alt6=6;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalTryGrammar.g:348:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    {
            	    // InternalTryGrammar.g:348:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    // InternalTryGrammar.g:349:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    {
            	    // InternalTryGrammar.g:349:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    // InternalTryGrammar.g:350:6: lv_functions_2_0= ruleFunctionDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getFunctionsFunctionDefinitionParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
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
            	    // InternalTryGrammar.g:368:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    {
            	    // InternalTryGrammar.g:368:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    // InternalTryGrammar.g:369:5: (lv_structs_3_0= ruleStructDefinition )
            	    {
            	    // InternalTryGrammar.g:369:5: (lv_structs_3_0= ruleStructDefinition )
            	    // InternalTryGrammar.g:370:6: lv_structs_3_0= ruleStructDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getStructsStructDefinitionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
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
            	    // InternalTryGrammar.g:388:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    {
            	    // InternalTryGrammar.g:388:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    // InternalTryGrammar.g:389:5: (lv_enums_4_0= ruleEnumDefinition )
            	    {
            	    // InternalTryGrammar.g:389:5: (lv_enums_4_0= ruleEnumDefinition )
            	    // InternalTryGrammar.g:390:6: lv_enums_4_0= ruleEnumDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getEnumsEnumDefinitionParserRuleCall_2_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
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
            	    // InternalTryGrammar.g:408:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    {
            	    // InternalTryGrammar.g:408:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    // InternalTryGrammar.g:409:5: ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';'
            	    {
            	    // InternalTryGrammar.g:409:5: ( (lv_variables_5_0= ruleVariableDeclaration ) )
            	    // InternalTryGrammar.g:410:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    {
            	    // InternalTryGrammar.g:410:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    // InternalTryGrammar.g:411:7: lv_variables_5_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDefinitionBodyAccess().getVariablesVariableDeclarationParserRuleCall_2_3_0_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_8);
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

            	    otherlv_6=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getDefinitionBodyAccess().getSemicolonKeyword_2_3_1());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTryGrammar.g:434:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    {
            	    // InternalTryGrammar.g:434:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    // InternalTryGrammar.g:435:5: (lv_modifiers_7_0= ruleModifier )
            	    {
            	    // InternalTryGrammar.g:435:5: (lv_modifiers_7_0= ruleModifier )
            	    // InternalTryGrammar.g:436:6: lv_modifiers_7_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getModifiersModifierParserRuleCall_2_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
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
            	    // InternalTryGrammar.g:454:4: ( (lv_events_8_0= ruleEvent ) )
            	    {
            	    // InternalTryGrammar.g:454:4: ( (lv_events_8_0= ruleEvent ) )
            	    // InternalTryGrammar.g:455:5: (lv_events_8_0= ruleEvent )
            	    {
            	    // InternalTryGrammar.g:455:5: (lv_events_8_0= ruleEvent )
            	    // InternalTryGrammar.g:456:6: lv_events_8_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionBodyAccess().getEventsEventParserRuleCall_2_5_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
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
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:482:1: entryRuleInheritanceSpecifier returns [EObject current=null] : iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF ;
    public final EObject entryRuleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceSpecifier = null;


        try {
            // InternalTryGrammar.g:482:61: (iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF )
            // InternalTryGrammar.g:483:2: iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF
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
    // InternalTryGrammar.g:489:1: ruleInheritanceSpecifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:495:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalTryGrammar.g:496:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalTryGrammar.g:496:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalTryGrammar.g:497:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalTryGrammar.g:497:3: ( (otherlv_0= RULE_ID ) )
            // InternalTryGrammar.g:498:4: (otherlv_0= RULE_ID )
            {
            // InternalTryGrammar.g:498:4: (otherlv_0= RULE_ID )
            // InternalTryGrammar.g:499:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInheritanceSpecifierRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getInheritanceSpecifierAccess().getSuperTypeContractOrLibraryCrossReference_0_0());
              				
            }

            }


            }

            // InternalTryGrammar.g:510:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTryGrammar.g:511:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalTryGrammar.g:511:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalTryGrammar.g:512:5: lv_args_1_0= ruleFunctionCallListArguments
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
    // InternalTryGrammar.g:533:1: entryRuleFunctionCallListArguments returns [EObject current=null] : iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF ;
    public final EObject entryRuleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallListArguments = null;


        try {
            // InternalTryGrammar.g:533:66: (iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF )
            // InternalTryGrammar.g:534:2: iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF
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
    // InternalTryGrammar.g:540:1: ruleFunctionCallListArguments returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:546:2: ( (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalTryGrammar.g:547:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalTryGrammar.g:547:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalTryGrammar.g:548:3: otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallListArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryGrammar.g:552:3: ()
            // InternalTryGrammar.g:553:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallListArgumentsAccess().getFunctionCallListArgumentsAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:559:3: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_DECIMAL)||LA9_0==20||(LA9_0>=55 && LA9_0<=166)||(LA9_0>=198 && LA9_0<=199)||(LA9_0>=210 && LA9_0<=214)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTryGrammar.g:560:4: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // InternalTryGrammar.g:560:4: ( (lv_arguments_2_0= ruleExpression ) )
                    // InternalTryGrammar.g:561:5: (lv_arguments_2_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:561:5: (lv_arguments_2_0= ruleExpression )
                    // InternalTryGrammar.g:562:6: lv_arguments_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallListArgumentsAccess().getArgumentsExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
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

                    // InternalTryGrammar.g:579:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalTryGrammar.g:580:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallListArgumentsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:584:5: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // InternalTryGrammar.g:585:6: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // InternalTryGrammar.g:585:6: (lv_arguments_4_0= ruleExpression )
                    	    // InternalTryGrammar.g:586:7: lv_arguments_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallListArgumentsAccess().getArgumentsExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:613:1: entryRuleFunctionCallArguments returns [EObject current=null] : iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF ;
    public final EObject entryRuleFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArguments = null;


        try {
            // InternalTryGrammar.g:613:62: (iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF )
            // InternalTryGrammar.g:614:2: iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF
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
    // InternalTryGrammar.g:620:1: ruleFunctionCallArguments returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) ;
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
            // InternalTryGrammar.g:626:2: ( ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) )
            // InternalTryGrammar.g:627:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            {
            // InternalTryGrammar.g:627:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==17) ) {
                    alt12=1;
                }
                else if ( ((LA12_1>=RULE_ID && LA12_1<=RULE_DECIMAL)||(LA12_1>=20 && LA12_1<=21)||(LA12_1>=55 && LA12_1<=166)||(LA12_1>=198 && LA12_1<=199)||(LA12_1>=210 && LA12_1<=214)) ) {
                    alt12=2;
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
                    // InternalTryGrammar.g:628:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    {
                    // InternalTryGrammar.g:628:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    // InternalTryGrammar.g:629:4: otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunctionCallArgumentsAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgumentsAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalTryGrammar.g:637:4: ()
                    // InternalTryGrammar.g:638:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFunctionCallArgumentsAccess().getFunctionCallArgumentsAction_0_2(),
                      						current);
                      				
                    }

                    }

                    // InternalTryGrammar.g:644:4: ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTryGrammar.g:645:5: ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            {
                            // InternalTryGrammar.g:645:5: ( (lv_args_3_0= ruleFunctionCallArg ) )
                            // InternalTryGrammar.g:646:6: (lv_args_3_0= ruleFunctionCallArg )
                            {
                            // InternalTryGrammar.g:646:6: (lv_args_3_0= ruleFunctionCallArg )
                            // InternalTryGrammar.g:647:7: lv_args_3_0= ruleFunctionCallArg
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFunctionCallArgumentsAccess().getArgsFunctionCallArgParserRuleCall_0_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_15);
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

                            // InternalTryGrammar.g:664:5: (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==15) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalTryGrammar.g:665:6: otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallArgumentsAccess().getCommaKeyword_0_3_1_0());
                            	      					
                            	    }
                            	    // InternalTryGrammar.g:669:6: ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    // InternalTryGrammar.g:670:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    {
                            	    // InternalTryGrammar.g:670:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    // InternalTryGrammar.g:671:8: lv_args_5_0= ruleFunctionCallArg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getFunctionCallArgumentsAccess().getArgsFunctionCallArgParserRuleCall_0_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_15);
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
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFunctionCallArgumentsAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }
                    otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFunctionCallArgumentsAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:700:3: this_FunctionCallListArguments_8= ruleFunctionCallListArguments
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
    // InternalTryGrammar.g:712:1: entryRuleFunctionCallArg returns [EObject current=null] : iv_ruleFunctionCallArg= ruleFunctionCallArg EOF ;
    public final EObject entryRuleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArg = null;


        try {
            // InternalTryGrammar.g:712:56: (iv_ruleFunctionCallArg= ruleFunctionCallArg EOF )
            // InternalTryGrammar.g:713:2: iv_ruleFunctionCallArg= ruleFunctionCallArg EOF
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
    // InternalTryGrammar.g:719:1: ruleFunctionCallArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:725:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalTryGrammar.g:726:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalTryGrammar.g:726:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalTryGrammar.g:727:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalTryGrammar.g:727:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTryGrammar.g:728:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTryGrammar.g:728:4: (lv_name_0_0= RULE_ID )
            // InternalTryGrammar.g:729:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgAccess().getColonKeyword_1());
              		
            }
            // InternalTryGrammar.g:749:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalTryGrammar.g:750:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalTryGrammar.g:750:4: (lv_expr_2_0= ruleExpression )
            // InternalTryGrammar.g:751:5: lv_expr_2_0= ruleExpression
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
    // InternalTryGrammar.g:772:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // InternalTryGrammar.g:772:59: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // InternalTryGrammar.g:773:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
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
    // InternalTryGrammar.g:779:1: ruleFunctionDefinition returns [EObject current=null] : (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' ) ) ;
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
            // InternalTryGrammar.g:785:2: ( (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' ) ) )
            // InternalTryGrammar.g:786:2: (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' ) )
            {
            // InternalTryGrammar.g:786:2: (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' ) )
            // InternalTryGrammar.g:787:3: otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionDefinitionAccess().getFunctionKeyword_0());
              		
            }
            // InternalTryGrammar.g:791:3: ()
            // InternalTryGrammar.g:792:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:798:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTryGrammar.g:799:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalTryGrammar.g:799:4: (lv_name_2_0= RULE_ID )
                    // InternalTryGrammar.g:800:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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

            // InternalTryGrammar.g:816:3: ( (lv_parameters_3_0= ruleParameterList ) )
            // InternalTryGrammar.g:817:4: (lv_parameters_3_0= ruleParameterList )
            {
            // InternalTryGrammar.g:817:4: (lv_parameters_3_0= ruleParameterList )
            // InternalTryGrammar.g:818:5: lv_parameters_3_0= ruleParameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersParameterListParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalTryGrammar.g:835:3: ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==25||(LA14_0>=170 && LA14_0<=173)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTryGrammar.g:836:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    {
            	    // InternalTryGrammar.g:836:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    // InternalTryGrammar.g:837:5: lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOptionalElementsFunctionDefinitionOptionalElementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    break loop14;
                }
            } while (true);

            // InternalTryGrammar.g:854:3: (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTryGrammar.g:855:4: otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getReturnsKeyword_5_0());
                      			
                    }
                    // InternalTryGrammar.g:859:4: ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    // InternalTryGrammar.g:860:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    {
                    // InternalTryGrammar.g:860:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    // InternalTryGrammar.g:861:6: lv_returnParameters_6_0= ruleReturnsParameterList
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
                      							"org.unicam.tryGrammar.TryGrammar.ReturnsParameterList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTryGrammar.g:879:3: ( ( (lv_block_7_0= ruleBlock ) ) | otherlv_8= ';' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            else if ( (LA16_0==18) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalTryGrammar.g:880:4: ( (lv_block_7_0= ruleBlock ) )
                    {
                    // InternalTryGrammar.g:880:4: ( (lv_block_7_0= ruleBlock ) )
                    // InternalTryGrammar.g:881:5: (lv_block_7_0= ruleBlock )
                    {
                    // InternalTryGrammar.g:881:5: (lv_block_7_0= ruleBlock )
                    // InternalTryGrammar.g:882:6: lv_block_7_0= ruleBlock
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
                    // InternalTryGrammar.g:900:4: otherlv_8= ';'
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
    // InternalTryGrammar.g:909:1: entryRuleFunctionDefinitionOptionalElement returns [EObject current=null] : iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF ;
    public final EObject entryRuleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOptionalElement = null;


        try {
            // InternalTryGrammar.g:909:74: (iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF )
            // InternalTryGrammar.g:910:2: iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF
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
    // InternalTryGrammar.g:916:1: ruleFunctionDefinitionOptionalElement returns [EObject current=null] : (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) ;
    public final EObject ruleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_ModifierInvocation_1 = null;

        EObject this_VisibilitySpecifier_2 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:922:2: ( (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) )
            // InternalTryGrammar.g:923:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            {
            // InternalTryGrammar.g:923:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                alt17=2;
                }
                break;
            case 170:
            case 171:
            case 172:
            case 173:
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
                    // InternalTryGrammar.g:924:3: this_Const_0= ruleConst
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
                    // InternalTryGrammar.g:933:3: this_ModifierInvocation_1= ruleModifierInvocation
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
                    // InternalTryGrammar.g:942:3: this_VisibilitySpecifier_2= ruleVisibilitySpecifier
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
    // InternalTryGrammar.g:954:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalTryGrammar.g:954:46: (iv_ruleConst= ruleConst EOF )
            // InternalTryGrammar.g:955:2: iv_ruleConst= ruleConst EOF
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
    // InternalTryGrammar.g:961:1: ruleConst returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:967:2: ( (otherlv_0= 'constant' () ) )
            // InternalTryGrammar.g:968:2: (otherlv_0= 'constant' () )
            {
            // InternalTryGrammar.g:968:2: (otherlv_0= 'constant' () )
            // InternalTryGrammar.g:969:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstAccess().getConstantKeyword_0());
              		
            }
            // InternalTryGrammar.g:973:3: ()
            // InternalTryGrammar.g:974:4: 
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
    // InternalTryGrammar.g:984:1: entryRuleVisibilitySpecifier returns [EObject current=null] : iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF ;
    public final EObject entryRuleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilitySpecifier = null;


        try {
            // InternalTryGrammar.g:984:60: (iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF )
            // InternalTryGrammar.g:985:2: iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF
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
    // InternalTryGrammar.g:991:1: ruleVisibilitySpecifier returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ;
    public final EObject ruleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:997:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) )
            // InternalTryGrammar.g:998:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            {
            // InternalTryGrammar.g:998:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            // InternalTryGrammar.g:999:3: (lv_visibility_0_0= ruleVisibilityEnum )
            {
            // InternalTryGrammar.g:999:3: (lv_visibility_0_0= ruleVisibilityEnum )
            // InternalTryGrammar.g:1000:4: lv_visibility_0_0= ruleVisibilityEnum
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
    // InternalTryGrammar.g:1020:1: entryRuleStructDefinition returns [EObject current=null] : iv_ruleStructDefinition= ruleStructDefinition EOF ;
    public final EObject entryRuleStructDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDefinition = null;


        try {
            // InternalTryGrammar.g:1020:57: (iv_ruleStructDefinition= ruleStructDefinition EOF )
            // InternalTryGrammar.g:1021:2: iv_ruleStructDefinition= ruleStructDefinition EOF
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
    // InternalTryGrammar.g:1027:1: ruleStructDefinition returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
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
            // InternalTryGrammar.g:1033:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // InternalTryGrammar.g:1034:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // InternalTryGrammar.g:1034:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // InternalTryGrammar.g:1035:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStructDefinitionAccess().getStructKeyword_0());
              		
            }
            // InternalTryGrammar.g:1039:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:1040:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:1040:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:1041:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStructDefinitionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalTryGrammar.g:1061:3: ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==30||LA18_0==34||(LA18_0>=63 && LA18_0<=166)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTryGrammar.g:1062:4: ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';'
            	    {
            	    // InternalTryGrammar.g:1062:4: ( (lv_members_3_0= ruleVariableDeclaration ) )
            	    // InternalTryGrammar.g:1063:5: (lv_members_3_0= ruleVariableDeclaration )
            	    {
            	    // InternalTryGrammar.g:1063:5: (lv_members_3_0= ruleVariableDeclaration )
            	    // InternalTryGrammar.g:1064:6: lv_members_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStructDefinitionAccess().getMembersVariableDeclarationParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
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

            	    otherlv_4=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getStructDefinitionAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:1094:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // InternalTryGrammar.g:1094:55: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // InternalTryGrammar.g:1095:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
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
    // InternalTryGrammar.g:1101:1: ruleEnumDefinition returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalTryGrammar.g:1107:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' ) )
            // InternalTryGrammar.g:1108:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' )
            {
            // InternalTryGrammar.g:1108:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' )
            // InternalTryGrammar.g:1109:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0());
              		
            }
            // InternalTryGrammar.g:1113:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:1114:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:1114:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:1115:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalTryGrammar.g:1135:3: ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTryGrammar.g:1136:4: ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )*
                    {
                    // InternalTryGrammar.g:1136:4: ( (lv_members_3_0= ruleEnumValue ) )
                    // InternalTryGrammar.g:1137:5: (lv_members_3_0= ruleEnumValue )
                    {
                    // InternalTryGrammar.g:1137:5: (lv_members_3_0= ruleEnumValue )
                    // InternalTryGrammar.g:1138:6: lv_members_3_0= ruleEnumValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
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

                    // InternalTryGrammar.g:1155:4: (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalTryGrammar.g:1156:5: otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getEnumDefinitionAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:1160:5: ( (lv_members_5_0= ruleEnumValue ) )
                    	    // InternalTryGrammar.g:1161:6: (lv_members_5_0= ruleEnumValue )
                    	    {
                    	    // InternalTryGrammar.g:1161:6: (lv_members_5_0= ruleEnumValue )
                    	    // InternalTryGrammar.g:1162:7: lv_members_5_0= ruleEnumValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnumDefinitionAccess().getMembersEnumValueParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:1189:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalTryGrammar.g:1189:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalTryGrammar.g:1190:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalTryGrammar.g:1196:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:1202:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTryGrammar.g:1203:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTryGrammar.g:1203:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTryGrammar.g:1204:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTryGrammar.g:1204:3: (lv_name_0_0= RULE_ID )
            // InternalTryGrammar.g:1205:4: lv_name_0_0= RULE_ID
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
    // InternalTryGrammar.g:1224:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTryGrammar.g:1224:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTryGrammar.g:1225:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalTryGrammar.g:1231:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:1237:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTryGrammar.g:1238:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTryGrammar.g:1238:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTryGrammar.g:1239:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTryGrammar.g:1239:3: (lv_name_0_0= RULE_ID )
            // InternalTryGrammar.g:1240:4: lv_name_0_0= RULE_ID
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
    // InternalTryGrammar.g:1259:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTryGrammar.g:1259:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTryGrammar.g:1260:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalTryGrammar.g:1266:1: ruleVariableDeclaration returns [EObject current=null] : (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_StandardVariableDeclaration_0 = null;

        EObject this_VarVariableDeclaration_1 = null;

        EObject this_VarVariableTupleVariableDeclaration_2 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1272:2: ( (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) )
            // InternalTryGrammar.g:1273:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            {
            // InternalTryGrammar.g:1273:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==30||(LA21_0>=63 && LA21_0<=166)) ) {
                alt21=1;
            }
            else if ( (LA21_0==34) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==RULE_ID) ) {
                    alt21=2;
                }
                else if ( (LA21_2==20) ) {
                    alt21=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTryGrammar.g:1274:3: this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration
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
                    // InternalTryGrammar.g:1283:3: this_VarVariableDeclaration_1= ruleVarVariableDeclaration
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
                    // InternalTryGrammar.g:1292:3: this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration
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
    // InternalTryGrammar.g:1304:1: entryRuleStandardVariableDeclaration returns [EObject current=null] : iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF ;
    public final EObject entryRuleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardVariableDeclaration = null;


        try {
            // InternalTryGrammar.g:1304:68: (iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF )
            // InternalTryGrammar.g:1305:2: iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF
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
    // InternalTryGrammar.g:1311:1: ruleStandardVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_optionalElements_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1317:2: ( ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) )
            // InternalTryGrammar.g:1318:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            {
            // InternalTryGrammar.g:1318:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            // InternalTryGrammar.g:1319:3: ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            {
            // InternalTryGrammar.g:1319:3: ( (lv_type_0_0= ruleStandardType ) )
            // InternalTryGrammar.g:1320:4: (lv_type_0_0= ruleStandardType )
            {
            // InternalTryGrammar.g:1320:4: (lv_type_0_0= ruleStandardType )
            // InternalTryGrammar.g:1321:5: lv_type_0_0= ruleStandardType
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
              						"org.unicam.tryGrammar.TryGrammar.StandardType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1338:3: ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25||LA22_0==29||(LA22_0>=167 && LA22_0<=173)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTryGrammar.g:1339:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    {
            	    // InternalTryGrammar.g:1339:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    // InternalTryGrammar.g:1340:5: lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement
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
            	      						"org.unicam.tryGrammar.TryGrammar.VariableDeclarationOptionalElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalTryGrammar.g:1357:3: ( (lv_variable_2_0= ruleVariable ) )
            // InternalTryGrammar.g:1358:4: (lv_variable_2_0= ruleVariable )
            {
            // InternalTryGrammar.g:1358:4: (lv_variable_2_0= ruleVariable )
            // InternalTryGrammar.g:1359:5: lv_variable_2_0= ruleVariable
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
              						"org.unicam.tryGrammar.TryGrammar.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1376:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTryGrammar.g:1377:4: otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStandardVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalTryGrammar.g:1381:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalTryGrammar.g:1382:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:1382:5: (lv_expression_4_0= ruleExpression )
                    // InternalTryGrammar.g:1383:6: lv_expression_4_0= ruleExpression
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
    // InternalTryGrammar.g:1405:1: entryRuleVarVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableDeclaration = null;


        try {
            // InternalTryGrammar.g:1405:63: (iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF )
            // InternalTryGrammar.g:1406:2: iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF
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
    // InternalTryGrammar.g:1412:1: ruleVarVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1418:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalTryGrammar.g:1419:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalTryGrammar.g:1419:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalTryGrammar.g:1420:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalTryGrammar.g:1420:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalTryGrammar.g:1421:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalTryGrammar.g:1421:4: (lv_varType_0_0= ruleVarType )
            // InternalTryGrammar.g:1422:5: lv_varType_0_0= ruleVarType
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
              						"org.unicam.tryGrammar.TryGrammar.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1439:3: ( (lv_variable_1_0= ruleVariable ) )
            // InternalTryGrammar.g:1440:4: (lv_variable_1_0= ruleVariable )
            {
            // InternalTryGrammar.g:1440:4: (lv_variable_1_0= ruleVariable )
            // InternalTryGrammar.g:1441:5: lv_variable_1_0= ruleVariable
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
              						"org.unicam.tryGrammar.TryGrammar.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1458:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTryGrammar.g:1459:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalTryGrammar.g:1463:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalTryGrammar.g:1464:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:1464:5: (lv_expression_3_0= ruleExpression )
                    // InternalTryGrammar.g:1465:6: lv_expression_3_0= ruleExpression
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
    // InternalTryGrammar.g:1487:1: entryRuleVarVariableTupleVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableTupleVariableDeclaration = null;


        try {
            // InternalTryGrammar.g:1487:76: (iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF )
            // InternalTryGrammar.g:1488:2: iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF
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
    // InternalTryGrammar.g:1494:1: ruleVarVariableTupleVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_tuple_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1500:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalTryGrammar.g:1501:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalTryGrammar.g:1501:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalTryGrammar.g:1502:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalTryGrammar.g:1502:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalTryGrammar.g:1503:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalTryGrammar.g:1503:4: (lv_varType_0_0= ruleVarType )
            // InternalTryGrammar.g:1504:5: lv_varType_0_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarVariableTupleVariableDeclarationAccess().getVarTypeVarTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_20);
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

            // InternalTryGrammar.g:1521:3: ( (lv_tuple_1_0= ruleTuple ) )
            // InternalTryGrammar.g:1522:4: (lv_tuple_1_0= ruleTuple )
            {
            // InternalTryGrammar.g:1522:4: (lv_tuple_1_0= ruleTuple )
            // InternalTryGrammar.g:1523:5: lv_tuple_1_0= ruleTuple
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
              						"org.unicam.tryGrammar.TryGrammar.Tuple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:1540:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTryGrammar.g:1541:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableTupleVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalTryGrammar.g:1545:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalTryGrammar.g:1546:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:1546:5: (lv_expression_3_0= ruleExpression )
                    // InternalTryGrammar.g:1547:6: lv_expression_3_0= ruleExpression
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
    // InternalTryGrammar.g:1569:1: entryRuleVariableDeclarationOptionalElement returns [EObject current=null] : iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF ;
    public final EObject entryRuleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationOptionalElement = null;


        try {
            // InternalTryGrammar.g:1569:75: (iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF )
            // InternalTryGrammar.g:1570:2: iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF
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
    // InternalTryGrammar.g:1576:1: ruleVariableDeclarationOptionalElement returns [EObject current=null] : (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) ;
    public final EObject ruleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_VisibilitySpecifier_0 = null;

        EObject this_IndexedSpecifer_1 = null;

        EObject this_ConstantSpecifier_2 = null;

        EObject this_LocationSpecifier_3 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1582:2: ( (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) )
            // InternalTryGrammar.g:1583:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            {
            // InternalTryGrammar.g:1583:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 170:
            case 171:
            case 172:
            case 173:
                {
                alt26=1;
                }
                break;
            case 29:
                {
                alt26=2;
                }
                break;
            case 25:
                {
                alt26=3;
                }
                break;
            case 167:
            case 168:
            case 169:
                {
                alt26=4;
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
                    // InternalTryGrammar.g:1584:3: this_VisibilitySpecifier_0= ruleVisibilitySpecifier
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
                    // InternalTryGrammar.g:1593:3: this_IndexedSpecifer_1= ruleIndexedSpecifer
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
                    // InternalTryGrammar.g:1602:3: this_ConstantSpecifier_2= ruleConstantSpecifier
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
                    // InternalTryGrammar.g:1611:3: this_LocationSpecifier_3= ruleLocationSpecifier
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
    // InternalTryGrammar.g:1623:1: entryRuleIndexedSpecifer returns [EObject current=null] : iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF ;
    public final EObject entryRuleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedSpecifer = null;


        try {
            // InternalTryGrammar.g:1623:56: (iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF )
            // InternalTryGrammar.g:1624:2: iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF
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
    // InternalTryGrammar.g:1630:1: ruleIndexedSpecifer returns [EObject current=null] : (otherlv_0= 'indexed' () ) ;
    public final EObject ruleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:1636:2: ( (otherlv_0= 'indexed' () ) )
            // InternalTryGrammar.g:1637:2: (otherlv_0= 'indexed' () )
            {
            // InternalTryGrammar.g:1637:2: (otherlv_0= 'indexed' () )
            // InternalTryGrammar.g:1638:3: otherlv_0= 'indexed' ()
            {
            otherlv_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexedSpeciferAccess().getIndexedKeyword_0());
              		
            }
            // InternalTryGrammar.g:1642:3: ()
            // InternalTryGrammar.g:1643:4: 
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
    // InternalTryGrammar.g:1653:1: entryRuleConstantSpecifier returns [EObject current=null] : iv_ruleConstantSpecifier= ruleConstantSpecifier EOF ;
    public final EObject entryRuleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSpecifier = null;


        try {
            // InternalTryGrammar.g:1653:58: (iv_ruleConstantSpecifier= ruleConstantSpecifier EOF )
            // InternalTryGrammar.g:1654:2: iv_ruleConstantSpecifier= ruleConstantSpecifier EOF
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
    // InternalTryGrammar.g:1660:1: ruleConstantSpecifier returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:1666:2: ( (otherlv_0= 'constant' () ) )
            // InternalTryGrammar.g:1667:2: (otherlv_0= 'constant' () )
            {
            // InternalTryGrammar.g:1667:2: (otherlv_0= 'constant' () )
            // InternalTryGrammar.g:1668:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantSpecifierAccess().getConstantKeyword_0());
              		
            }
            // InternalTryGrammar.g:1672:3: ()
            // InternalTryGrammar.g:1673:4: 
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
    // InternalTryGrammar.g:1683:1: entryRuleLocationSpecifier returns [EObject current=null] : iv_ruleLocationSpecifier= ruleLocationSpecifier EOF ;
    public final EObject entryRuleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifier = null;


        try {
            // InternalTryGrammar.g:1683:58: (iv_ruleLocationSpecifier= ruleLocationSpecifier EOF )
            // InternalTryGrammar.g:1684:2: iv_ruleLocationSpecifier= ruleLocationSpecifier EOF
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
    // InternalTryGrammar.g:1690:1: ruleLocationSpecifier returns [EObject current=null] : ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) ;
    public final EObject ruleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_location_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1696:2: ( ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) )
            // InternalTryGrammar.g:1697:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            {
            // InternalTryGrammar.g:1697:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            // InternalTryGrammar.g:1698:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            {
            // InternalTryGrammar.g:1698:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            // InternalTryGrammar.g:1699:4: lv_location_0_0= ruleLocationSpecifierEnum
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
    // InternalTryGrammar.g:1719:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalTryGrammar.g:1719:45: (iv_ruleType= ruleType EOF )
            // InternalTryGrammar.g:1720:2: iv_ruleType= ruleType EOF
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
    // InternalTryGrammar.g:1726:1: ruleType returns [EObject current=null] : (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_StandardType_0 = null;

        AntlrDatatypeRuleToken lv_isVarType_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1732:2: ( (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) )
            // InternalTryGrammar.g:1733:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            {
            // InternalTryGrammar.g:1733:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||LA27_0==30||(LA27_0>=63 && LA27_0<=166)) ) {
                alt27=1;
            }
            else if ( (LA27_0==34) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalTryGrammar.g:1734:3: this_StandardType_0= ruleStandardType
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
                    // InternalTryGrammar.g:1743:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    {
                    // InternalTryGrammar.g:1743:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    // InternalTryGrammar.g:1744:4: (lv_isVarType_1_0= ruleVarType )
                    {
                    // InternalTryGrammar.g:1744:4: (lv_isVarType_1_0= ruleVarType )
                    // InternalTryGrammar.g:1745:5: lv_isVarType_1_0= ruleVarType
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
    // InternalTryGrammar.g:1766:1: entryRuleStandardType returns [EObject current=null] : iv_ruleStandardType= ruleStandardType EOF ;
    public final EObject entryRuleStandardType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardType = null;


        try {
            // InternalTryGrammar.g:1766:53: (iv_ruleStandardType= ruleStandardType EOF )
            // InternalTryGrammar.g:1767:2: iv_ruleStandardType= ruleStandardType EOF
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
    // InternalTryGrammar.g:1773:1: ruleStandardType returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) ;
    public final EObject ruleStandardType() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;

        EObject this_QualifiedIdentifier_3 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1779:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) )
            // InternalTryGrammar.g:1780:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            {
            // InternalTryGrammar.g:1780:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            int alt29=3;
            switch ( input.LA(1) ) {
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
                {
                alt29=1;
                }
                break;
            case 30:
                {
                alt29=2;
                }
                break;
            case RULE_ID:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalTryGrammar.g:1781:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalTryGrammar.g:1781:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalTryGrammar.g:1782:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
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
                    // InternalTryGrammar.g:1790:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==32) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalTryGrammar.g:1791:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalTryGrammar.g:1791:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalTryGrammar.g:1792:6: lv_dimension_1_0= ruleArrayDimensions
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
                    // InternalTryGrammar.g:1811:3: this_Mapping_2= ruleMapping
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
                    // InternalTryGrammar.g:1820:3: this_QualifiedIdentifier_3= ruleQualifiedIdentifier
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
    // InternalTryGrammar.g:1832:1: entryRuleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF ;
    public final EObject entryRuleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardTypeWithoutQualifiedIdentifier = null;


        try {
            // InternalTryGrammar.g:1832:79: (iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF )
            // InternalTryGrammar.g:1833:2: iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF
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
    // InternalTryGrammar.g:1839:1: ruleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) ;
    public final EObject ruleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1845:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) )
            // InternalTryGrammar.g:1846:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            {
            // InternalTryGrammar.g:1846:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=63 && LA31_0<=166)) ) {
                alt31=1;
            }
            else if ( (LA31_0==30) ) {
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
                    // InternalTryGrammar.g:1847:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalTryGrammar.g:1847:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalTryGrammar.g:1848:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
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
                    // InternalTryGrammar.g:1856:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==32) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalTryGrammar.g:1857:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalTryGrammar.g:1857:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalTryGrammar.g:1858:6: lv_dimension_1_0= ruleArrayDimensions
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
                    // InternalTryGrammar.g:1877:3: this_Mapping_2= ruleMapping
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
    // InternalTryGrammar.g:1889:1: entryRuleElementaryType returns [EObject current=null] : iv_ruleElementaryType= ruleElementaryType EOF ;
    public final EObject entryRuleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryType = null;


        try {
            // InternalTryGrammar.g:1889:55: (iv_ruleElementaryType= ruleElementaryType EOF )
            // InternalTryGrammar.g:1890:2: iv_ruleElementaryType= ruleElementaryType EOF
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
    // InternalTryGrammar.g:1896:1: ruleElementaryType returns [EObject current=null] : ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) ;
    public final EObject ruleElementaryType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:1902:2: ( ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) )
            // InternalTryGrammar.g:1903:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            {
            // InternalTryGrammar.g:1903:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            // InternalTryGrammar.g:1904:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalTryGrammar.g:1904:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            // InternalTryGrammar.g:1905:4: lv_name_0_0= ruleElementaryTypeNameEnum
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
    // InternalTryGrammar.g:1925:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalTryGrammar.g:1925:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalTryGrammar.g:1926:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalTryGrammar.g:1932:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) ;
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
            // InternalTryGrammar.g:1938:2: ( (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) )
            // InternalTryGrammar.g:1939:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            {
            // InternalTryGrammar.g:1939:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            // InternalTryGrammar.g:1940:3: otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryGrammar.g:1948:3: ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) )
            // InternalTryGrammar.g:1949:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            {
            // InternalTryGrammar.g:1949:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            // InternalTryGrammar.g:1950:5: lv_keyType_2_0= ruleElementaryTypeNameEnum
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
              						"org.unicam.tryGrammar.TryGrammar.ElementaryTypeNameEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalTryGrammar.g:1971:3: ( (lv_valueType_4_0= ruleType ) )
            // InternalTryGrammar.g:1972:4: (lv_valueType_4_0= ruleType )
            {
            // InternalTryGrammar.g:1972:4: (lv_valueType_4_0= ruleType )
            // InternalTryGrammar.g:1973:5: lv_valueType_4_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getValueTypeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:1998:1: entryRuleArrayDimensions returns [EObject current=null] : iv_ruleArrayDimensions= ruleArrayDimensions EOF ;
    public final EObject entryRuleArrayDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimensions = null;


        try {
            // InternalTryGrammar.g:1998:56: (iv_ruleArrayDimensions= ruleArrayDimensions EOF )
            // InternalTryGrammar.g:1999:2: iv_ruleArrayDimensions= ruleArrayDimensions EOF
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
    // InternalTryGrammar.g:2005:1: ruleArrayDimensions returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) ;
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
            // InternalTryGrammar.g:2011:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) )
            // InternalTryGrammar.g:2012:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            {
            // InternalTryGrammar.g:2012:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            // InternalTryGrammar.g:2013:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalTryGrammar.g:2017:3: ()
            // InternalTryGrammar.g:2018:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayDimensionsAccess().getArrayDimensionsAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:2024:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_DECIMAL)||LA32_0==20||(LA32_0>=55 && LA32_0<=166)||(LA32_0>=198 && LA32_0<=199)||(LA32_0>=210 && LA32_0<=214)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTryGrammar.g:2025:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:2025:4: (lv_value_2_0= ruleExpression )
                    // InternalTryGrammar.g:2026:5: lv_value_2_0= ruleExpression
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
                      						"org.unicam.tryGrammar.TryGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalTryGrammar.g:2047:3: (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==32) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalTryGrammar.g:2048:4: otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']'
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_4_0());
            	      			
            	    }
            	    // InternalTryGrammar.g:2052:4: ( (lv_value_5_0= ruleExpression ) )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_DECIMAL)||LA33_0==20||(LA33_0>=55 && LA33_0<=166)||(LA33_0>=198 && LA33_0<=199)||(LA33_0>=210 && LA33_0<=214)) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalTryGrammar.g:2053:5: (lv_value_5_0= ruleExpression )
            	            {
            	            // InternalTryGrammar.g:2053:5: (lv_value_5_0= ruleExpression )
            	            // InternalTryGrammar.g:2054:6: lv_value_5_0= ruleExpression
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
            	              							"org.unicam.tryGrammar.TryGrammar.Expression");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_4_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalTryGrammar.g:2080:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalTryGrammar.g:2080:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalTryGrammar.g:2081:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalTryGrammar.g:2087:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:2093:2: (kw= 'var' )
            // InternalTryGrammar.g:2094:2: kw= 'var'
            {
            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:2102:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalTryGrammar.g:2102:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalTryGrammar.g:2103:2: iv_ruleTuple= ruleTuple EOF
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
    // InternalTryGrammar.g:2109:1: ruleTuple returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_3_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2115:2: ( (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) )
            // InternalTryGrammar.g:2116:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            {
            // InternalTryGrammar.g:2116:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            // InternalTryGrammar.g:2117:3: otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryGrammar.g:2121:3: ()
            // InternalTryGrammar.g:2122:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleAccess().getTupleAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:2128:3: ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_DECIMAL)||LA38_0==15||LA38_0==20||(LA38_0>=55 && LA38_0<=166)||(LA38_0>=198 && LA38_0<=199)||(LA38_0>=210 && LA38_0<=214)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTryGrammar.g:2129:4: ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    {
                    // InternalTryGrammar.g:2129:4: ( (lv_members_2_0= ruleExpression ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_DECIMAL)||LA35_0==20||(LA35_0>=55 && LA35_0<=166)||(LA35_0>=198 && LA35_0<=199)||(LA35_0>=210 && LA35_0<=214)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalTryGrammar.g:2130:5: (lv_members_2_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2130:5: (lv_members_2_0= ruleExpression )
                            // InternalTryGrammar.g:2131:6: lv_members_2_0= ruleExpression
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
                              							"org.unicam.tryGrammar.TryGrammar.Expression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalTryGrammar.g:2148:4: ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==15) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalTryGrammar.g:2149:5: ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )?
                    	    {
                    	    // InternalTryGrammar.g:2149:5: ( (lv_members_3_0= ruleTupleSeparator ) )
                    	    // InternalTryGrammar.g:2150:6: (lv_members_3_0= ruleTupleSeparator )
                    	    {
                    	    // InternalTryGrammar.g:2150:6: (lv_members_3_0= ruleTupleSeparator )
                    	    // InternalTryGrammar.g:2151:7: lv_members_3_0= ruleTupleSeparator
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
                    	      								"org.unicam.tryGrammar.TryGrammar.TupleSeparator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalTryGrammar.g:2168:5: ( (lv_members_4_0= ruleExpression ) )?
                    	    int alt36=2;
                    	    int LA36_0 = input.LA(1);

                    	    if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_DECIMAL)||LA36_0==20||(LA36_0>=55 && LA36_0<=166)||(LA36_0>=198 && LA36_0<=199)||(LA36_0>=210 && LA36_0<=214)) ) {
                    	        alt36=1;
                    	    }
                    	    switch (alt36) {
                    	        case 1 :
                    	            // InternalTryGrammar.g:2169:6: (lv_members_4_0= ruleExpression )
                    	            {
                    	            // InternalTryGrammar.g:2169:6: (lv_members_4_0= ruleExpression )
                    	            // InternalTryGrammar.g:2170:7: lv_members_4_0= ruleExpression
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
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:2197:1: entryRuleTupleSeparator returns [EObject current=null] : iv_ruleTupleSeparator= ruleTupleSeparator EOF ;
    public final EObject entryRuleTupleSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleSeparator = null;


        try {
            // InternalTryGrammar.g:2197:55: (iv_ruleTupleSeparator= ruleTupleSeparator EOF )
            // InternalTryGrammar.g:2198:2: iv_ruleTupleSeparator= ruleTupleSeparator EOF
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
    // InternalTryGrammar.g:2204:1: ruleTupleSeparator returns [EObject current=null] : (otherlv_0= ',' () ) ;
    public final EObject ruleTupleSeparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:2210:2: ( (otherlv_0= ',' () ) )
            // InternalTryGrammar.g:2211:2: (otherlv_0= ',' () )
            {
            // InternalTryGrammar.g:2211:2: (otherlv_0= ',' () )
            // InternalTryGrammar.g:2212:3: otherlv_0= ',' ()
            {
            otherlv_0=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleSeparatorAccess().getCommaKeyword_0());
              		
            }
            // InternalTryGrammar.g:2216:3: ()
            // InternalTryGrammar.g:2217:4: 
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
    // InternalTryGrammar.g:2227:1: entryRuleSimpleStatement returns [EObject current=null] : iv_ruleSimpleStatement= ruleSimpleStatement EOF ;
    public final EObject entryRuleSimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement = null;


        try {
            // InternalTryGrammar.g:2227:56: (iv_ruleSimpleStatement= ruleSimpleStatement EOF )
            // InternalTryGrammar.g:2228:2: iv_ruleSimpleStatement= ruleSimpleStatement EOF
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
    // InternalTryGrammar.g:2234:1: ruleSimpleStatement returns [EObject current=null] : ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) ;
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
            // InternalTryGrammar.g:2240:2: ( ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) )
            // InternalTryGrammar.g:2241:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            {
            // InternalTryGrammar.g:2241:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            // InternalTryGrammar.g:2242:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) )
            {
            // InternalTryGrammar.g:2242:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt42=3;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalTryGrammar.g:2243:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalTryGrammar.g:2243:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalTryGrammar.g:2244:5: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
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
                    // InternalTryGrammar.g:2252:5: ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalTryGrammar.g:2253:6: () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalTryGrammar.g:2253:6: ()
                    // InternalTryGrammar.g:2254:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getSimpleStatementAccess().getStandardVariableDeclarationTypeAction_0_0_1_0(),
                      								current);
                      						
                    }

                    }

                    // InternalTryGrammar.g:2260:6: ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==25||LA39_0==29||(LA39_0>=167 && LA39_0<=173)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalTryGrammar.g:2261:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalTryGrammar.g:2261:7: (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalTryGrammar.g:2262:8: lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement
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
                    	      									"org.unicam.tryGrammar.TryGrammar.VariableDeclarationOptionalElement");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    // InternalTryGrammar.g:2279:6: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalTryGrammar.g:2280:7: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalTryGrammar.g:2280:7: (lv_variable_3_0= ruleVariable )
                    // InternalTryGrammar.g:2281:8: lv_variable_3_0= ruleVariable
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
                      									"org.unicam.tryGrammar.TryGrammar.Variable");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalTryGrammar.g:2298:6: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==28) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalTryGrammar.g:2299:7: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_0_1_3_0());
                              						
                            }
                            // InternalTryGrammar.g:2303:7: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalTryGrammar.g:2304:8: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2304:8: (lv_expression_5_0= ruleExpression )
                            // InternalTryGrammar.g:2305:9: lv_expression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionExpressionParserRuleCall_0_0_1_3_1_0());
                              								
                            }
                            pushFollow(FOLLOW_8);
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
                    // InternalTryGrammar.g:2326:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalTryGrammar.g:2326:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalTryGrammar.g:2327:5: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
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
                    // InternalTryGrammar.g:2334:5: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==20) ) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalTryGrammar.g:2335:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalTryGrammar.g:2335:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalTryGrammar.g:2336:7: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalTryGrammar.g:2336:7: ()
                            // InternalTryGrammar.g:2337:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTypeDeclarationAction_0_1_1_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalTryGrammar.g:2343:7: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalTryGrammar.g:2344:8: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalTryGrammar.g:2344:8: (lv_variable_8_0= ruleVariable )
                            // InternalTryGrammar.g:2345:9: lv_variable_8_0= ruleVariable
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
                              										"org.unicam.tryGrammar.TryGrammar.Variable");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalTryGrammar.g:2362:7: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalTryGrammar.g:2363:8: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_9, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_0_2_0());
                              							
                            }
                            // InternalTryGrammar.g:2367:8: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalTryGrammar.g:2368:9: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2368:9: (lv_expression_10_0= ruleExpression )
                            // InternalTryGrammar.g:2369:10: lv_expression_10_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              										newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionExpressionParserRuleCall_0_1_1_0_2_1_0());
                              									
                            }
                            pushFollow(FOLLOW_8);
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
                            // InternalTryGrammar.g:2389:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalTryGrammar.g:2389:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalTryGrammar.g:2390:7: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalTryGrammar.g:2390:7: ()
                            // InternalTryGrammar.g:2391:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTupleVariableDeclarationAction_0_1_1_1_0(),
                              									current);
                              							
                            }

                            }

                            // InternalTryGrammar.g:2397:7: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalTryGrammar.g:2398:8: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalTryGrammar.g:2398:8: (lv_tuple_12_0= ruleTuple )
                            // InternalTryGrammar.g:2399:9: lv_tuple_12_0= ruleTuple
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
                              										"org.unicam.tryGrammar.TryGrammar.Tuple");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalTryGrammar.g:2416:7: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalTryGrammar.g:2417:8: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_13, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_1_2_0());
                              							
                            }
                            // InternalTryGrammar.g:2421:8: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalTryGrammar.g:2422:9: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2422:9: (lv_expression_14_0= ruleExpression )
                            // InternalTryGrammar.g:2423:10: lv_expression_14_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              										newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionExpressionParserRuleCall_0_1_1_1_2_1_0());
                              									
                            }
                            pushFollow(FOLLOW_8);
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
                    // InternalTryGrammar.g:2445:4: this_ExpressionStatement_15= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStatementAccess().getExpressionStatementParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_8);
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

            // InternalTryGrammar.g:2454:3: ( (lv_semicolon_16_0= ';' ) )
            // InternalTryGrammar.g:2455:4: (lv_semicolon_16_0= ';' )
            {
            // InternalTryGrammar.g:2455:4: (lv_semicolon_16_0= ';' )
            // InternalTryGrammar.g:2456:5: lv_semicolon_16_0= ';'
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
    // InternalTryGrammar.g:2472:1: entryRuleSimpleStatement2 returns [EObject current=null] : iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF ;
    public final EObject entryRuleSimpleStatement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement2 = null;


        try {
            // InternalTryGrammar.g:2472:57: (iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF )
            // InternalTryGrammar.g:2473:2: iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF
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
    // InternalTryGrammar.g:2479:1: ruleSimpleStatement2 returns [EObject current=null] : ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ;
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
            // InternalTryGrammar.g:2485:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) )
            // InternalTryGrammar.g:2486:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            {
            // InternalTryGrammar.g:2486:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalTryGrammar.g:2487:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalTryGrammar.g:2487:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalTryGrammar.g:2488:4: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
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
                    // InternalTryGrammar.g:2496:4: ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalTryGrammar.g:2497:5: () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalTryGrammar.g:2497:5: ()
                    // InternalTryGrammar.g:2498:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getSimpleStatement2Access().getStandardVariableDeclarationTypeAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryGrammar.g:2504:5: ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==25||LA43_0==29||(LA43_0>=167 && LA43_0<=173)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalTryGrammar.g:2505:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalTryGrammar.g:2505:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalTryGrammar.g:2506:7: lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement
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
                    	      								"org.unicam.tryGrammar.TryGrammar.VariableDeclarationOptionalElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    // InternalTryGrammar.g:2523:5: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalTryGrammar.g:2524:6: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalTryGrammar.g:2524:6: (lv_variable_3_0= ruleVariable )
                    // InternalTryGrammar.g:2525:7: lv_variable_3_0= ruleVariable
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
                      								"org.unicam.tryGrammar.TryGrammar.Variable");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTryGrammar.g:2542:5: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==28) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalTryGrammar.g:2543:6: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_0_1_3_0());
                              					
                            }
                            // InternalTryGrammar.g:2547:6: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalTryGrammar.g:2548:7: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2548:7: (lv_expression_5_0= ruleExpression )
                            // InternalTryGrammar.g:2549:8: lv_expression_5_0= ruleExpression
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
                    // InternalTryGrammar.g:2570:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalTryGrammar.g:2570:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalTryGrammar.g:2571:4: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
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
                    // InternalTryGrammar.g:2578:4: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==20) ) {
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
                            // InternalTryGrammar.g:2579:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalTryGrammar.g:2579:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalTryGrammar.g:2580:6: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalTryGrammar.g:2580:6: ()
                            // InternalTryGrammar.g:2581:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTypeDeclarationAction_1_1_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalTryGrammar.g:2587:6: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalTryGrammar.g:2588:7: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalTryGrammar.g:2588:7: (lv_variable_8_0= ruleVariable )
                            // InternalTryGrammar.g:2589:8: lv_variable_8_0= ruleVariable
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
                              									"org.unicam.tryGrammar.TryGrammar.Variable");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalTryGrammar.g:2606:6: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalTryGrammar.g:2607:7: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_9, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_0_2_0());
                              						
                            }
                            // InternalTryGrammar.g:2611:7: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalTryGrammar.g:2612:8: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2612:8: (lv_expression_10_0= ruleExpression )
                            // InternalTryGrammar.g:2613:9: lv_expression_10_0= ruleExpression
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
                            // InternalTryGrammar.g:2633:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalTryGrammar.g:2633:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalTryGrammar.g:2634:6: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalTryGrammar.g:2634:6: ()
                            // InternalTryGrammar.g:2635:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTupleVariableDeclarationAction_1_1_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalTryGrammar.g:2641:6: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalTryGrammar.g:2642:7: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalTryGrammar.g:2642:7: (lv_tuple_12_0= ruleTuple )
                            // InternalTryGrammar.g:2643:8: lv_tuple_12_0= ruleTuple
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
                              									"org.unicam.tryGrammar.TryGrammar.Tuple");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalTryGrammar.g:2660:6: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalTryGrammar.g:2661:7: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_13, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_1_2_0());
                              						
                            }
                            // InternalTryGrammar.g:2665:7: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalTryGrammar.g:2666:8: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:2666:8: (lv_expression_14_0= ruleExpression )
                            // InternalTryGrammar.g:2667:9: lv_expression_14_0= ruleExpression
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
                    // InternalTryGrammar.g:2689:3: this_ExpressionStatement_15= ruleExpressionStatement
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
    // InternalTryGrammar.g:2701:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalTryGrammar.g:2701:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalTryGrammar.g:2702:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
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
    // InternalTryGrammar.g:2708:1: ruleExpressionStatement returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2714:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalTryGrammar.g:2715:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalTryGrammar.g:2715:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalTryGrammar.g:2716:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalTryGrammar.g:2716:3: (lv_expression_0_0= ruleExpression )
            // InternalTryGrammar.g:2717:4: lv_expression_0_0= ruleExpression
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
    // InternalTryGrammar.g:2737:1: entryRuleQualifiedIdentifier returns [EObject current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final EObject entryRuleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedIdentifier = null;


        try {
            // InternalTryGrammar.g:2737:60: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // InternalTryGrammar.g:2738:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
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
    // InternalTryGrammar.g:2744:1: ruleQualifiedIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) ;
    public final EObject ruleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        EObject lv_qualifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2750:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) )
            // InternalTryGrammar.g:2751:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            {
            // InternalTryGrammar.g:2751:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            // InternalTryGrammar.g:2752:3: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )*
            {
            // InternalTryGrammar.g:2752:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalTryGrammar.g:2753:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalTryGrammar.g:2753:4: (lv_identifier_0_0= RULE_ID )
            // InternalTryGrammar.g:2754:5: lv_identifier_0_0= RULE_ID
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
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            // InternalTryGrammar.g:2770:3: ( (lv_qualifiers_1_0= ruleQualifier ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==20||LA47_0==32||LA47_0==35) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalTryGrammar.g:2771:4: (lv_qualifiers_1_0= ruleQualifier )
            	    {
            	    // InternalTryGrammar.g:2771:4: (lv_qualifiers_1_0= ruleQualifier )
            	    // InternalTryGrammar.g:2772:5: lv_qualifiers_1_0= ruleQualifier
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
            	      						"org.unicam.tryGrammar.TryGrammar.Qualifier");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalTryGrammar.g:2793:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalTryGrammar.g:2793:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalTryGrammar.g:2794:2: iv_ruleQualifier= ruleQualifier EOF
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
    // InternalTryGrammar.g:2800:1: ruleQualifier returns [EObject current=null] : (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Index_1 = null;

        EObject this_Arguments_2 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2806:2: ( (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) )
            // InternalTryGrammar.g:2807:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            {
            // InternalTryGrammar.g:2807:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt48=1;
                }
                break;
            case 32:
                {
                alt48=2;
                }
                break;
            case 20:
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
                    // InternalTryGrammar.g:2808:3: this_Field_0= ruleField
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
                    // InternalTryGrammar.g:2817:3: this_Index_1= ruleIndex
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
                    // InternalTryGrammar.g:2826:3: this_Arguments_2= ruleArguments
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
    // InternalTryGrammar.g:2838:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalTryGrammar.g:2838:46: (iv_ruleField= ruleField EOF )
            // InternalTryGrammar.g:2839:2: iv_ruleField= ruleField EOF
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
    // InternalTryGrammar.g:2845:1: ruleField returns [EObject current=null] : (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_field_1_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:2851:2: ( (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) )
            // InternalTryGrammar.g:2852:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            {
            // InternalTryGrammar.g:2852:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            // InternalTryGrammar.g:2853:3: otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFullStopKeyword_0());
              		
            }
            // InternalTryGrammar.g:2857:3: ( (lv_field_1_0= RULE_ID ) )
            // InternalTryGrammar.g:2858:4: (lv_field_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:2858:4: (lv_field_1_0= RULE_ID )
            // InternalTryGrammar.g:2859:5: lv_field_1_0= RULE_ID
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
    // InternalTryGrammar.g:2879:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // InternalTryGrammar.g:2879:46: (iv_ruleIndex= ruleIndex EOF )
            // InternalTryGrammar.g:2880:2: iv_ruleIndex= ruleIndex EOF
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
    // InternalTryGrammar.g:2886:1: ruleIndex returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2892:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) )
            // InternalTryGrammar.g:2893:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            {
            // InternalTryGrammar.g:2893:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            // InternalTryGrammar.g:2894:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalTryGrammar.g:2898:3: ()
            // InternalTryGrammar.g:2899:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndexAccess().getIndexAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:2905:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_DECIMAL)||LA49_0==20||(LA49_0>=55 && LA49_0<=166)||(LA49_0>=198 && LA49_0<=199)||(LA49_0>=210 && LA49_0<=214)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTryGrammar.g:2906:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:2906:4: (lv_value_2_0= ruleExpression )
                    // InternalTryGrammar.g:2907:5: lv_value_2_0= ruleExpression
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
                      						"org.unicam.tryGrammar.TryGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:2932:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalTryGrammar.g:2932:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalTryGrammar.g:2933:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalTryGrammar.g:2939:1: ruleArguments returns [EObject current=null] : ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2945:2: ( ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) )
            // InternalTryGrammar.g:2946:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            {
            // InternalTryGrammar.g:2946:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            // InternalTryGrammar.g:2947:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            {
            // InternalTryGrammar.g:2947:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            // InternalTryGrammar.g:2948:4: lv_arguments_0_0= ruleFunctionCallArguments
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
    // InternalTryGrammar.g:2968:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalTryGrammar.g:2968:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalTryGrammar.g:2969:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalTryGrammar.g:2975:1: ruleModifier returns [EObject current=null] : (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBlock ) ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:2981:2: ( (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBlock ) ) ) )
            // InternalTryGrammar.g:2982:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBlock ) ) )
            {
            // InternalTryGrammar.g:2982:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBlock ) ) )
            // InternalTryGrammar.g:2983:3: otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModifierAccess().getModifierKeyword_0());
              		
            }
            // InternalTryGrammar.g:2987:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:2988:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:2988:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:2989:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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

            // InternalTryGrammar.g:3005:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==20) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTryGrammar.g:3006:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalTryGrammar.g:3006:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalTryGrammar.g:3007:5: lv_parameters_2_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModifierAccess().getParametersParameterListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
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

            // InternalTryGrammar.g:3024:3: ( (lv_block_3_0= ruleBlock ) )
            // InternalTryGrammar.g:3025:4: (lv_block_3_0= ruleBlock )
            {
            // InternalTryGrammar.g:3025:4: (lv_block_3_0= ruleBlock )
            // InternalTryGrammar.g:3026:5: lv_block_3_0= ruleBlock
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
    // InternalTryGrammar.g:3047:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalTryGrammar.g:3047:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalTryGrammar.g:3048:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalTryGrammar.g:3054:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isAnonymous_3_0=null;
        Token otherlv_4=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3060:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' ) )
            // InternalTryGrammar.g:3061:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' )
            {
            // InternalTryGrammar.g:3061:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' )
            // InternalTryGrammar.g:3062:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
              		
            }
            // InternalTryGrammar.g:3066:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTryGrammar.g:3067:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTryGrammar.g:3067:4: (lv_name_1_0= RULE_ID )
            // InternalTryGrammar.g:3068:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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

            // InternalTryGrammar.g:3084:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==20) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTryGrammar.g:3085:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalTryGrammar.g:3085:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalTryGrammar.g:3086:5: lv_parameters_2_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEventAccess().getParametersParameterListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_39);
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

            // InternalTryGrammar.g:3103:3: ( (lv_isAnonymous_3_0= 'anonymous' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTryGrammar.g:3104:4: (lv_isAnonymous_3_0= 'anonymous' )
                    {
                    // InternalTryGrammar.g:3104:4: (lv_isAnonymous_3_0= 'anonymous' )
                    // InternalTryGrammar.g:3105:5: lv_isAnonymous_3_0= 'anonymous'
                    {
                    lv_isAnonymous_3_0=(Token)match(input,38,FOLLOW_8); if (state.failed) return current;
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
    // InternalTryGrammar.g:3125:1: entryRuleModifierInvocation returns [EObject current=null] : iv_ruleModifierInvocation= ruleModifierInvocation EOF ;
    public final EObject entryRuleModifierInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierInvocation = null;


        try {
            // InternalTryGrammar.g:3125:59: (iv_ruleModifierInvocation= ruleModifierInvocation EOF )
            // InternalTryGrammar.g:3126:2: iv_ruleModifierInvocation= ruleModifierInvocation EOF
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
    // InternalTryGrammar.g:3132:1: ruleModifierInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleModifierInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3138:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalTryGrammar.g:3139:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalTryGrammar.g:3139:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalTryGrammar.g:3140:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalTryGrammar.g:3140:3: ( (otherlv_0= RULE_ID ) )
            // InternalTryGrammar.g:3141:4: (otherlv_0= RULE_ID )
            {
            // InternalTryGrammar.g:3141:4: (otherlv_0= RULE_ID )
            // InternalTryGrammar.g:3142:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModifierInvocationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModifierInvocationAccess().getNameModifierCrossReference_0_0());
              				
            }

            }


            }

            // InternalTryGrammar.g:3153:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==20) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTryGrammar.g:3154:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalTryGrammar.g:3154:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalTryGrammar.g:3155:5: lv_args_1_0= ruleFunctionCallListArguments
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
    // InternalTryGrammar.g:3176:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalTryGrammar.g:3176:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalTryGrammar.g:3177:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalTryGrammar.g:3183:1: ruleParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3189:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalTryGrammar.g:3190:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalTryGrammar.g:3190:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalTryGrammar.g:3191:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryGrammar.g:3195:3: ()
            // InternalTryGrammar.g:3196:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:3202:3: ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||LA55_0==30||LA55_0==34||(LA55_0>=63 && LA55_0<=166)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTryGrammar.g:3203:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // InternalTryGrammar.g:3203:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) )
                    // InternalTryGrammar.g:3204:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    {
                    // InternalTryGrammar.g:3204:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    // InternalTryGrammar.g:3205:6: lv_parameters_2_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterListAccess().getParametersVariableDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
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

                    // InternalTryGrammar.g:3222:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalTryGrammar.g:3223:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:3227:5: ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    // InternalTryGrammar.g:3228:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalTryGrammar.g:3228:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    // InternalTryGrammar.g:3229:7: lv_parameters_4_0= ruleVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParameterListAccess().getParametersVariableDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:3256:1: entryRuleReturnsParameterList returns [EObject current=null] : iv_ruleReturnsParameterList= ruleReturnsParameterList EOF ;
    public final EObject entryRuleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsParameterList = null;


        try {
            // InternalTryGrammar.g:3256:61: (iv_ruleReturnsParameterList= ruleReturnsParameterList EOF )
            // InternalTryGrammar.g:3257:2: iv_ruleReturnsParameterList= ruleReturnsParameterList EOF
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
    // InternalTryGrammar.g:3263:1: ruleReturnsParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3269:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalTryGrammar.g:3270:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalTryGrammar.g:3270:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalTryGrammar.g:3271:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnsParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTryGrammar.g:3275:3: ()
            // InternalTryGrammar.g:3276:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnsParameterListAccess().getReturnsParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:3282:3: ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||LA57_0==30||LA57_0==34||(LA57_0>=63 && LA57_0<=166)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalTryGrammar.g:3283:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    {
                    // InternalTryGrammar.g:3283:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) )
                    // InternalTryGrammar.g:3284:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    {
                    // InternalTryGrammar.g:3284:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    // InternalTryGrammar.g:3285:6: lv_parameters_2_0= ruleReturnParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReturnsParameterListAccess().getParametersReturnParameterDeclarationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
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

                    // InternalTryGrammar.g:3302:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalTryGrammar.g:3303:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReturnsParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalTryGrammar.g:3307:5: ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    // InternalTryGrammar.g:3308:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    {
                    	    // InternalTryGrammar.g:3308:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    // InternalTryGrammar.g:3309:7: lv_parameters_4_0= ruleReturnParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReturnsParameterListAccess().getParametersReturnParameterDeclarationParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:3336:1: entryRuleReturnParameterDeclaration returns [EObject current=null] : iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF ;
    public final EObject entryRuleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterDeclaration = null;


        try {
            // InternalTryGrammar.g:3336:67: (iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF )
            // InternalTryGrammar.g:3337:2: iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF
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
    // InternalTryGrammar.g:3343:1: ruleReturnParameterDeclaration returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) ;
    public final EObject ruleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_typeRef_0_0 = null;

        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3349:2: ( ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) )
            // InternalTryGrammar.g:3350:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            {
            // InternalTryGrammar.g:3350:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            // InternalTryGrammar.g:3351:3: ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )?
            {
            // InternalTryGrammar.g:3351:3: ( (lv_typeRef_0_0= ruleType ) )
            // InternalTryGrammar.g:3352:4: (lv_typeRef_0_0= ruleType )
            {
            // InternalTryGrammar.g:3352:4: (lv_typeRef_0_0= ruleType )
            // InternalTryGrammar.g:3353:5: lv_typeRef_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnParameterDeclarationAccess().getTypeRefTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_41);
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

            // InternalTryGrammar.g:3370:3: ( (lv_variable_1_0= ruleVariable ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTryGrammar.g:3371:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalTryGrammar.g:3371:4: (lv_variable_1_0= ruleVariable )
                    // InternalTryGrammar.g:3372:5: lv_variable_1_0= ruleVariable
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
    // InternalTryGrammar.g:3393:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTryGrammar.g:3393:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTryGrammar.g:3394:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalTryGrammar.g:3400:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Block_3= ruleBlock | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) ;
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
            // InternalTryGrammar.g:3406:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Block_3= ruleBlock | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) )
            // InternalTryGrammar.g:3407:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Block_3= ruleBlock | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            {
            // InternalTryGrammar.g:3407:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Block_3= ruleBlock | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt60=1;
                }
                break;
            case 42:
                {
                alt60=2;
                }
                break;
            case 43:
                {
                alt60=3;
                }
                break;
            case 17:
                {
                alt60=4;
                }
                break;
            case 48:
                {
                alt60=5;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case 20:
            case 30:
            case 34:
            case 39:
            case 44:
            case 45:
            case 46:
            case 47:
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
            case 198:
            case 199:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
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
                    // InternalTryGrammar.g:3408:3: this_IfStatement_0= ruleIfStatement
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
                    // InternalTryGrammar.g:3417:3: this_WhileStatement_1= ruleWhileStatement
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
                    // InternalTryGrammar.g:3426:3: this_ForStatement_2= ruleForStatement
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
                    // InternalTryGrammar.g:3435:3: this_Block_3= ruleBlock
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
                    // InternalTryGrammar.g:3444:3: this_PlaceHolderStatement_4= rulePlaceHolderStatement
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
                    // InternalTryGrammar.g:3453:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    {
                    // InternalTryGrammar.g:3453:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    int alt59=6;
                    switch ( input.LA(1) ) {
                    case 44:
                        {
                        alt59=1;
                        }
                        break;
                    case 45:
                        {
                        alt59=2;
                        }
                        break;
                    case 46:
                        {
                        alt59=3;
                        }
                        break;
                    case 47:
                        {
                        alt59=4;
                        }
                        break;
                    case 39:
                        {
                        alt59=5;
                        }
                        break;
                    case RULE_ID:
                    case RULE_INT:
                    case RULE_STRING:
                    case RULE_HEX:
                    case RULE_DECIMAL:
                    case 20:
                    case 30:
                    case 34:
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
                    case 198:
                    case 199:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                        {
                        alt59=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }

                    switch (alt59) {
                        case 1 :
                            // InternalTryGrammar.g:3454:4: this_ContinueStatement_5= ruleContinueStatement
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
                            // InternalTryGrammar.g:3463:4: this_BreakStatement_6= ruleBreakStatement
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
                            // InternalTryGrammar.g:3472:4: this_ReturnStatement_7= ruleReturnStatement
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
                            // InternalTryGrammar.g:3481:4: this_ThrowStatement_8= ruleThrowStatement
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
                            // InternalTryGrammar.g:3490:4: this_DeleteStatement_9= ruleDeleteStatement
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
                            // InternalTryGrammar.g:3499:4: this_SimpleStatement_10= ruleSimpleStatement
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
    // InternalTryGrammar.g:3512:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // InternalTryGrammar.g:3512:56: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // InternalTryGrammar.g:3513:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
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
    // InternalTryGrammar.g:3519:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3525:2: ( (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) )
            // InternalTryGrammar.g:3526:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            {
            // InternalTryGrammar.g:3526:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            // InternalTryGrammar.g:3527:3: otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
              		
            }
            // InternalTryGrammar.g:3531:3: ( (lv_variable_1_0= ruleQualifiedIdentifier ) )
            // InternalTryGrammar.g:3532:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            {
            // InternalTryGrammar.g:3532:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            // InternalTryGrammar.g:3533:5: lv_variable_1_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeleteStatementAccess().getVariableQualifiedIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
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
    // InternalTryGrammar.g:3558:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalTryGrammar.g:3558:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalTryGrammar.g:3559:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalTryGrammar.g:3565:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) ;
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
            // InternalTryGrammar.g:3571:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) )
            // InternalTryGrammar.g:3572:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            {
            // InternalTryGrammar.g:3572:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            // InternalTryGrammar.g:3573:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryGrammar.g:3581:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalTryGrammar.g:3582:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalTryGrammar.g:3582:4: (lv_condition_2_0= ruleExpression )
            // InternalTryGrammar.g:3583:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            otherlv_3=(Token)match(input,21,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalTryGrammar.g:3604:3: ( (lv_trueBody_4_0= ruleStatement ) )
            // InternalTryGrammar.g:3605:4: (lv_trueBody_4_0= ruleStatement )
            {
            // InternalTryGrammar.g:3605:4: (lv_trueBody_4_0= ruleStatement )
            // InternalTryGrammar.g:3606:5: lv_trueBody_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getTrueBodyStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalTryGrammar.g:3623:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==41) ) {
                int LA61_1 = input.LA(2);

                if ( (synpred1_InternalTryGrammar()) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // InternalTryGrammar.g:3624:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) )
                    {
                    // InternalTryGrammar.g:3624:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalTryGrammar.g:3625:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalTryGrammar.g:3631:4: ( (lv_falseBody_6_0= ruleStatement ) )
                    // InternalTryGrammar.g:3632:5: (lv_falseBody_6_0= ruleStatement )
                    {
                    // InternalTryGrammar.g:3632:5: (lv_falseBody_6_0= ruleStatement )
                    // InternalTryGrammar.g:3633:6: lv_falseBody_6_0= ruleStatement
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
    // InternalTryGrammar.g:3655:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalTryGrammar.g:3655:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalTryGrammar.g:3656:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalTryGrammar.g:3662:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3668:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) )
            // InternalTryGrammar.g:3669:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // InternalTryGrammar.g:3669:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            // InternalTryGrammar.g:3670:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryGrammar.g:3678:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalTryGrammar.g:3679:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalTryGrammar.g:3679:4: (lv_condition_2_0= ruleExpression )
            // InternalTryGrammar.g:3680:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            otherlv_3=(Token)match(input,21,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalTryGrammar.g:3701:3: ( (lv_body_4_0= ruleStatement ) )
            // InternalTryGrammar.g:3702:4: (lv_body_4_0= ruleStatement )
            {
            // InternalTryGrammar.g:3702:4: (lv_body_4_0= ruleStatement )
            // InternalTryGrammar.g:3703:5: lv_body_4_0= ruleStatement
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
    // InternalTryGrammar.g:3724:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalTryGrammar.g:3724:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalTryGrammar.g:3725:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalTryGrammar.g:3731:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) ;
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
            // InternalTryGrammar.g:3737:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) )
            // InternalTryGrammar.g:3738:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            {
            // InternalTryGrammar.g:3738:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            // InternalTryGrammar.g:3739:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryGrammar.g:3747:3: ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_DECIMAL)||LA62_0==20||LA62_0==30||LA62_0==34||(LA62_0>=55 && LA62_0<=166)||(LA62_0>=198 && LA62_0<=199)||(LA62_0>=210 && LA62_0<=214)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTryGrammar.g:3748:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    {
                    // InternalTryGrammar.g:3748:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    // InternalTryGrammar.g:3749:5: lv_initExpression_2_0= ruleSimpleStatement2
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getInitExpressionSimpleStatement2ParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
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

            // InternalTryGrammar.g:3766:3: ( ( ';' )=>otherlv_3= ';' )
            // InternalTryGrammar.g:3767:4: ( ';' )=>otherlv_3= ';'
            {
            otherlv_3=(Token)match(input,18,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
              			
            }

            }

            // InternalTryGrammar.g:3773:3: ( (lv_conditionExpression_4_0= ruleExpression ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_DECIMAL)||LA63_0==20||(LA63_0>=55 && LA63_0<=166)||(LA63_0>=198 && LA63_0<=199)||(LA63_0>=210 && LA63_0<=214)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalTryGrammar.g:3774:4: (lv_conditionExpression_4_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:3774:4: (lv_conditionExpression_4_0= ruleExpression )
                    // InternalTryGrammar.g:3775:5: lv_conditionExpression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getConditionExpressionExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
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

            otherlv_5=(Token)match(input,18,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_5());
              		
            }
            // InternalTryGrammar.g:3796:3: ( (lv_loopExpression_6_0= ruleExpressionStatement ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_DECIMAL)||LA64_0==20||(LA64_0>=55 && LA64_0<=166)||(LA64_0>=198 && LA64_0<=199)||(LA64_0>=210 && LA64_0<=214)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTryGrammar.g:3797:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    {
                    // InternalTryGrammar.g:3797:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    // InternalTryGrammar.g:3798:5: lv_loopExpression_6_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getLoopExpressionExpressionStatementParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            otherlv_7=(Token)match(input,21,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalTryGrammar.g:3819:3: ( (lv_body_8_0= ruleStatement ) )
            // InternalTryGrammar.g:3820:4: (lv_body_8_0= ruleStatement )
            {
            // InternalTryGrammar.g:3820:4: (lv_body_8_0= ruleStatement )
            // InternalTryGrammar.g:3821:5: lv_body_8_0= ruleStatement
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
    // InternalTryGrammar.g:3842:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalTryGrammar.g:3842:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalTryGrammar.g:3843:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalTryGrammar.g:3849:1: ruleBlock returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3855:2: ( (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) )
            // InternalTryGrammar.g:3856:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            {
            // InternalTryGrammar.g:3856:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            // InternalTryGrammar.g:3857:3: otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalTryGrammar.g:3861:3: ()
            // InternalTryGrammar.g:3862:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:3868:3: ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_DECIMAL)||LA66_0==17||LA66_0==20||LA66_0==30||LA66_0==34||(LA66_0>=39 && LA66_0<=40)||(LA66_0>=42 && LA66_0<=48)||(LA66_0>=55 && LA66_0<=166)||(LA66_0>=198 && LA66_0<=199)||(LA66_0>=210 && LA66_0<=214)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTryGrammar.g:3869:4: ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )*
                    {
                    // InternalTryGrammar.g:3869:4: ( (lv_statements_2_0= ruleStatement ) )
                    // InternalTryGrammar.g:3870:5: (lv_statements_2_0= ruleStatement )
                    {
                    // InternalTryGrammar.g:3870:5: (lv_statements_2_0= ruleStatement )
                    // InternalTryGrammar.g:3871:6: lv_statements_2_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
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

                    // InternalTryGrammar.g:3888:4: ( (lv_statements_3_0= ruleStatement ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_DECIMAL)||LA65_0==17||LA65_0==20||LA65_0==30||LA65_0==34||(LA65_0>=39 && LA65_0<=40)||(LA65_0>=42 && LA65_0<=48)||(LA65_0>=55 && LA65_0<=166)||(LA65_0>=198 && LA65_0<=199)||(LA65_0>=210 && LA65_0<=214)) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalTryGrammar.g:3889:5: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // InternalTryGrammar.g:3889:5: (lv_statements_3_0= ruleStatement )
                    	    // InternalTryGrammar.g:3890:6: lv_statements_3_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_48);
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
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:3916:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // InternalTryGrammar.g:3916:58: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalTryGrammar.g:3917:2: iv_ruleContinueStatement= ruleContinueStatement EOF
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
    // InternalTryGrammar.g:3923:1: ruleContinueStatement returns [EObject current=null] : (otherlv_0= 'continue' () otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:3929:2: ( (otherlv_0= 'continue' () otherlv_2= ';' ) )
            // InternalTryGrammar.g:3930:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            {
            // InternalTryGrammar.g:3930:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            // InternalTryGrammar.g:3931:3: otherlv_0= 'continue' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContinueStatementAccess().getContinueKeyword_0());
              		
            }
            // InternalTryGrammar.g:3935:3: ()
            // InternalTryGrammar.g:3936:4: 
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
    // InternalTryGrammar.g:3950:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalTryGrammar.g:3950:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalTryGrammar.g:3951:2: iv_ruleBreakStatement= ruleBreakStatement EOF
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
    // InternalTryGrammar.g:3957:1: ruleBreakStatement returns [EObject current=null] : (otherlv_0= 'break' () otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:3963:2: ( (otherlv_0= 'break' () otherlv_2= ';' ) )
            // InternalTryGrammar.g:3964:2: (otherlv_0= 'break' () otherlv_2= ';' )
            {
            // InternalTryGrammar.g:3964:2: (otherlv_0= 'break' () otherlv_2= ';' )
            // InternalTryGrammar.g:3965:3: otherlv_0= 'break' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakStatementAccess().getBreakKeyword_0());
              		
            }
            // InternalTryGrammar.g:3969:3: ()
            // InternalTryGrammar.g:3970:4: 
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
    // InternalTryGrammar.g:3984:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalTryGrammar.g:3984:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalTryGrammar.g:3985:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalTryGrammar.g:3991:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:3997:2: ( (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) )
            // InternalTryGrammar.g:3998:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            {
            // InternalTryGrammar.g:3998:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            // InternalTryGrammar.g:3999:3: otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
              		
            }
            // InternalTryGrammar.g:4003:3: ()
            // InternalTryGrammar.g:4004:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_1(),
              					current);
              			
            }

            }

            // InternalTryGrammar.g:4010:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_DECIMAL)||LA67_0==20||(LA67_0>=55 && LA67_0<=166)||(LA67_0>=198 && LA67_0<=199)||(LA67_0>=210 && LA67_0<=214)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalTryGrammar.g:4011:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:4011:4: (lv_expression_2_0= ruleExpression )
                    // InternalTryGrammar.g:4012:5: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
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
    // InternalTryGrammar.g:4037:1: entryRuleThrowStatement returns [EObject current=null] : iv_ruleThrowStatement= ruleThrowStatement EOF ;
    public final EObject entryRuleThrowStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStatement = null;


        try {
            // InternalTryGrammar.g:4037:55: (iv_ruleThrowStatement= ruleThrowStatement EOF )
            // InternalTryGrammar.g:4038:2: iv_ruleThrowStatement= ruleThrowStatement EOF
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
    // InternalTryGrammar.g:4044:1: ruleThrowStatement returns [EObject current=null] : (otherlv_0= 'throw' () otherlv_2= ';' ) ;
    public final EObject ruleThrowStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:4050:2: ( (otherlv_0= 'throw' () otherlv_2= ';' ) )
            // InternalTryGrammar.g:4051:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            {
            // InternalTryGrammar.g:4051:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            // InternalTryGrammar.g:4052:3: otherlv_0= 'throw' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getThrowStatementAccess().getThrowKeyword_0());
              		
            }
            // InternalTryGrammar.g:4056:3: ()
            // InternalTryGrammar.g:4057:4: 
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
    // InternalTryGrammar.g:4071:1: entryRulePlaceHolderStatement returns [EObject current=null] : iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF ;
    public final EObject entryRulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceHolderStatement = null;


        try {
            // InternalTryGrammar.g:4071:61: (iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF )
            // InternalTryGrammar.g:4072:2: iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF
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
    // InternalTryGrammar.g:4078:1: rulePlaceHolderStatement returns [EObject current=null] : (otherlv_0= '_' () ) ;
    public final EObject rulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:4084:2: ( (otherlv_0= '_' () ) )
            // InternalTryGrammar.g:4085:2: (otherlv_0= '_' () )
            {
            // InternalTryGrammar.g:4085:2: (otherlv_0= '_' () )
            // InternalTryGrammar.g:4086:3: otherlv_0= '_' ()
            {
            otherlv_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlaceHolderStatementAccess().get_Keyword_0());
              		
            }
            // InternalTryGrammar.g:4090:3: ()
            // InternalTryGrammar.g:4091:4: 
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
    // InternalTryGrammar.g:4101:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTryGrammar.g:4101:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTryGrammar.g:4102:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalTryGrammar.g:4108:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4114:2: (this_Assignment_0= ruleAssignment )
            // InternalTryGrammar.g:4115:2: this_Assignment_0= ruleAssignment
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
    // InternalTryGrammar.g:4126:1: entryRuleSpecialExpression returns [EObject current=null] : iv_ruleSpecialExpression= ruleSpecialExpression EOF ;
    public final EObject entryRuleSpecialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialExpression = null;


        try {
            // InternalTryGrammar.g:4126:58: (iv_ruleSpecialExpression= ruleSpecialExpression EOF )
            // InternalTryGrammar.g:4127:2: iv_ruleSpecialExpression= ruleSpecialExpression EOF
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
    // InternalTryGrammar.g:4133:1: ruleSpecialExpression returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) ;
    public final EObject ruleSpecialExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_fieldOrMethod_1_0 = null;

        EObject lv_qualifiers_2_1 = null;

        EObject lv_qualifiers_2_2 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4139:2: ( ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) )
            // InternalTryGrammar.g:4140:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            {
            // InternalTryGrammar.g:4140:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            // InternalTryGrammar.g:4141:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            {
            // InternalTryGrammar.g:4141:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) )
            // InternalTryGrammar.g:4142:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            {
            // InternalTryGrammar.g:4142:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            // InternalTryGrammar.g:4143:5: lv_type_0_0= ruleSpecialExpressionTypeEnum
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
              						"org.unicam.tryGrammar.TryGrammar.SpecialExpressionTypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTryGrammar.g:4160:3: ( (lv_fieldOrMethod_1_0= ruleField ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==35) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalTryGrammar.g:4161:4: (lv_fieldOrMethod_1_0= ruleField )
                    {
                    // InternalTryGrammar.g:4161:4: (lv_fieldOrMethod_1_0= ruleField )
                    // InternalTryGrammar.g:4162:5: lv_fieldOrMethod_1_0= ruleField
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
                      						"org.unicam.tryGrammar.TryGrammar.Field");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTryGrammar.g:4179:3: ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==20||LA70_0==32) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalTryGrammar.g:4180:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    {
            	    // InternalTryGrammar.g:4180:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    // InternalTryGrammar.g:4181:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    {
            	    // InternalTryGrammar.g:4181:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==32) ) {
            	        alt69=1;
            	    }
            	    else if ( (LA69_0==20) ) {
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
            	            // InternalTryGrammar.g:4182:6: lv_qualifiers_2_1= ruleIndex
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
            	              							"org.unicam.tryGrammar.TryGrammar.Index");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTryGrammar.g:4198:6: lv_qualifiers_2_2= ruleArguments
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
    // $ANTLR end "ruleSpecialExpression"


    // $ANTLR start "entryRuleAssignment"
    // InternalTryGrammar.g:4220:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalTryGrammar.g:4220:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalTryGrammar.g:4221:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalTryGrammar.g:4227:1: ruleAssignment returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) ;
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
            // InternalTryGrammar.g:4233:2: ( (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) )
            // InternalTryGrammar.g:4234:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            {
            // InternalTryGrammar.g:4234:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            // InternalTryGrammar.g:4235:3: this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getBinaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_BinaryExpression_0=ruleBinaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BinaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4243:3: ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==28||(LA72_0>=174 && LA72_0<=184)) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_ID) ) {
                alt72=2;
            }
            switch (alt72) {
                case 1 :
                    // InternalTryGrammar.g:4244:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // InternalTryGrammar.g:4244:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    // InternalTryGrammar.g:4245:5: () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // InternalTryGrammar.g:4245:5: ()
                    // InternalTryGrammar.g:4246:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryGrammar.g:4252:5: ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) )
                    // InternalTryGrammar.g:4253:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    {
                    // InternalTryGrammar.g:4253:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    // InternalTryGrammar.g:4254:7: lv_assignmentOp_2_0= ruleAssignmentOpEnum
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssignmentAccess().getAssignmentOpAssignmentOpEnumEnumRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_12);
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

                    // InternalTryGrammar.g:4271:5: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalTryGrammar.g:4272:6: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalTryGrammar.g:4272:6: (lv_expression_3_0= ruleExpression )
                    // InternalTryGrammar.g:4273:7: lv_expression_3_0= ruleExpression
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
                    // InternalTryGrammar.g:4292:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    {
                    // InternalTryGrammar.g:4292:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    // InternalTryGrammar.g:4293:5: () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    {
                    // InternalTryGrammar.g:4293:5: ()
                    // InternalTryGrammar.g:4294:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getVariableDeclarationExpressionTypeAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryGrammar.g:4300:5: ( (lv_variable_5_0= ruleVariable ) )
                    // InternalTryGrammar.g:4301:6: (lv_variable_5_0= ruleVariable )
                    {
                    // InternalTryGrammar.g:4301:6: (lv_variable_5_0= ruleVariable )
                    // InternalTryGrammar.g:4302:7: lv_variable_5_0= ruleVariable
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
                      								"org.unicam.tryGrammar.TryGrammar.Variable");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTryGrammar.g:4319:5: (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==28) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalTryGrammar.g:4320:6: otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) )
                            {
                            otherlv_6=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1_2_0());
                              					
                            }
                            // InternalTryGrammar.g:4324:6: ( (lv_expression_7_0= ruleExpression ) )
                            // InternalTryGrammar.g:4325:7: (lv_expression_7_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:4325:7: (lv_expression_7_0= ruleExpression )
                            // InternalTryGrammar.g:4326:8: lv_expression_7_0= ruleExpression
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
    // InternalTryGrammar.g:4350:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalTryGrammar.g:4350:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalTryGrammar.g:4351:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalTryGrammar.g:4357:1: ruleBinaryExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4363:2: (this_Or_0= ruleOr )
            // InternalTryGrammar.g:4364:2: this_Or_0= ruleOr
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
    // InternalTryGrammar.g:4375:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalTryGrammar.g:4375:43: (iv_ruleOr= ruleOr EOF )
            // InternalTryGrammar.g:4376:2: iv_ruleOr= ruleOr EOF
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
    // InternalTryGrammar.g:4382:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4388:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalTryGrammar.g:4389:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalTryGrammar.g:4389:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalTryGrammar.g:4390:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4398:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==49) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalTryGrammar.g:4399:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalTryGrammar.g:4399:4: ()
            	    // InternalTryGrammar.g:4400:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:4410:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalTryGrammar.g:4411:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalTryGrammar.g:4411:5: (lv_right_3_0= ruleAnd )
            	    // InternalTryGrammar.g:4412:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalTryGrammar.g:4434:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalTryGrammar.g:4434:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalTryGrammar.g:4435:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalTryGrammar.g:4441:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4447:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalTryGrammar.g:4448:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalTryGrammar.g:4448:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalTryGrammar.g:4449:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4457:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==50) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalTryGrammar.g:4458:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalTryGrammar.g:4458:4: ()
            	    // InternalTryGrammar.g:4459:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:4469:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalTryGrammar.g:4470:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalTryGrammar.g:4470:5: (lv_right_3_0= ruleEquality )
            	    // InternalTryGrammar.g:4471:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalTryGrammar.g:4493:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalTryGrammar.g:4493:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalTryGrammar.g:4494:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalTryGrammar.g:4500:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_equalityOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4506:2: ( (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalTryGrammar.g:4507:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalTryGrammar.g:4507:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalTryGrammar.g:4508:3: this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4516:3: ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=185 && LA75_0<=186)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalTryGrammar.g:4517:4: () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalTryGrammar.g:4517:4: ()
            	    // InternalTryGrammar.g:4518:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryGrammar.g:4524:4: ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) )
            	    // InternalTryGrammar.g:4525:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    {
            	    // InternalTryGrammar.g:4525:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    // InternalTryGrammar.g:4526:6: lv_equalityOp_2_0= ruleEqualityOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getEqualityOpEqualityOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
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

            	    // InternalTryGrammar.g:4543:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalTryGrammar.g:4544:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalTryGrammar.g:4544:5: (lv_right_3_0= ruleComparison )
            	    // InternalTryGrammar.g:4545:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalTryGrammar.g:4567:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalTryGrammar.g:4567:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalTryGrammar.g:4568:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalTryGrammar.g:4574:1: ruleComparison returns [EObject current=null] : (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BitOr_0 = null;

        Enumerator lv_comparisonOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4580:2: ( (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) )
            // InternalTryGrammar.g:4581:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            {
            // InternalTryGrammar.g:4581:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            // InternalTryGrammar.g:4582:3: this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getBitOrParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_BitOr_0=ruleBitOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitOr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4590:3: ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=187 && LA76_0<=191)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalTryGrammar.g:4591:4: () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) )
            	    {
            	    // InternalTryGrammar.g:4591:4: ()
            	    // InternalTryGrammar.g:4592:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryGrammar.g:4598:4: ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) )
            	    // InternalTryGrammar.g:4599:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    {
            	    // InternalTryGrammar.g:4599:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    // InternalTryGrammar.g:4600:6: lv_comparisonOp_2_0= ruleComparisonOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getComparisonOpComparisonOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
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

            	    // InternalTryGrammar.g:4617:4: ( (lv_right_3_0= ruleBitOr ) )
            	    // InternalTryGrammar.g:4618:5: (lv_right_3_0= ruleBitOr )
            	    {
            	    // InternalTryGrammar.g:4618:5: (lv_right_3_0= ruleBitOr )
            	    // InternalTryGrammar.g:4619:6: lv_right_3_0= ruleBitOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightBitOrParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBitOr"
    // InternalTryGrammar.g:4641:1: entryRuleBitOr returns [EObject current=null] : iv_ruleBitOr= ruleBitOr EOF ;
    public final EObject entryRuleBitOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitOr = null;


        try {
            // InternalTryGrammar.g:4641:46: (iv_ruleBitOr= ruleBitOr EOF )
            // InternalTryGrammar.g:4642:2: iv_ruleBitOr= ruleBitOr EOF
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
    // InternalTryGrammar.g:4648:1: ruleBitOr returns [EObject current=null] : (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) ;
    public final EObject ruleBitOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitXor_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4654:2: ( (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) )
            // InternalTryGrammar.g:4655:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            {
            // InternalTryGrammar.g:4655:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            // InternalTryGrammar.g:4656:3: this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitOrAccess().getBitXorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_BitXor_0=ruleBitXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitXor_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4664:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==51) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalTryGrammar.g:4665:4: () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) )
            	    {
            	    // InternalTryGrammar.g:4665:4: ()
            	    // InternalTryGrammar.g:4666:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitOrAccess().getBitOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitOrAccess().getVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:4676:4: ( (lv_right_3_0= ruleBitXor ) )
            	    // InternalTryGrammar.g:4677:5: (lv_right_3_0= ruleBitXor )
            	    {
            	    // InternalTryGrammar.g:4677:5: (lv_right_3_0= ruleBitXor )
            	    // InternalTryGrammar.g:4678:6: lv_right_3_0= ruleBitXor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitOrAccess().getRightBitXorParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleBitOr"


    // $ANTLR start "entryRuleBitXor"
    // InternalTryGrammar.g:4700:1: entryRuleBitXor returns [EObject current=null] : iv_ruleBitXor= ruleBitXor EOF ;
    public final EObject entryRuleBitXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitXor = null;


        try {
            // InternalTryGrammar.g:4700:47: (iv_ruleBitXor= ruleBitXor EOF )
            // InternalTryGrammar.g:4701:2: iv_ruleBitXor= ruleBitXor EOF
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
    // InternalTryGrammar.g:4707:1: ruleBitXor returns [EObject current=null] : (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) ;
    public final EObject ruleBitXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitAnd_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4713:2: ( (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) )
            // InternalTryGrammar.g:4714:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            {
            // InternalTryGrammar.g:4714:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            // InternalTryGrammar.g:4715:3: this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitXorAccess().getBitAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_BitAnd_0=ruleBitAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitAnd_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4723:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==52) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalTryGrammar.g:4724:4: () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) )
            	    {
            	    // InternalTryGrammar.g:4724:4: ()
            	    // InternalTryGrammar.g:4725:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitXorAccess().getBitXorLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitXorAccess().getCircumflexAccentKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:4735:4: ( (lv_right_3_0= ruleBitAnd ) )
            	    // InternalTryGrammar.g:4736:5: (lv_right_3_0= ruleBitAnd )
            	    {
            	    // InternalTryGrammar.g:4736:5: (lv_right_3_0= ruleBitAnd )
            	    // InternalTryGrammar.g:4737:6: lv_right_3_0= ruleBitAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitXorAccess().getRightBitAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
    // $ANTLR end "ruleBitXor"


    // $ANTLR start "entryRuleBitAnd"
    // InternalTryGrammar.g:4759:1: entryRuleBitAnd returns [EObject current=null] : iv_ruleBitAnd= ruleBitAnd EOF ;
    public final EObject entryRuleBitAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitAnd = null;


        try {
            // InternalTryGrammar.g:4759:47: (iv_ruleBitAnd= ruleBitAnd EOF )
            // InternalTryGrammar.g:4760:2: iv_ruleBitAnd= ruleBitAnd EOF
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
    // InternalTryGrammar.g:4766:1: ruleBitAnd returns [EObject current=null] : (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) ;
    public final EObject ruleBitAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Shift_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4772:2: ( (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) )
            // InternalTryGrammar.g:4773:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            {
            // InternalTryGrammar.g:4773:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            // InternalTryGrammar.g:4774:3: this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitAndAccess().getShiftParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_Shift_0=ruleShift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Shift_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4782:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==53) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalTryGrammar.g:4783:4: () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) )
            	    {
            	    // InternalTryGrammar.g:4783:4: ()
            	    // InternalTryGrammar.g:4784:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitAndAccess().getBitAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitAndAccess().getAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:4794:4: ( (lv_right_3_0= ruleShift ) )
            	    // InternalTryGrammar.g:4795:5: (lv_right_3_0= ruleShift )
            	    {
            	    // InternalTryGrammar.g:4795:5: (lv_right_3_0= ruleShift )
            	    // InternalTryGrammar.g:4796:6: lv_right_3_0= ruleShift
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitAndAccess().getRightShiftParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
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
    // $ANTLR end "ruleBitAnd"


    // $ANTLR start "entryRuleShift"
    // InternalTryGrammar.g:4818:1: entryRuleShift returns [EObject current=null] : iv_ruleShift= ruleShift EOF ;
    public final EObject entryRuleShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShift = null;


        try {
            // InternalTryGrammar.g:4818:46: (iv_ruleShift= ruleShift EOF )
            // InternalTryGrammar.g:4819:2: iv_ruleShift= ruleShift EOF
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
    // InternalTryGrammar.g:4825:1: ruleShift returns [EObject current=null] : (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) ;
    public final EObject ruleShift() throws RecognitionException {
        EObject current = null;

        EObject this_AddSub_0 = null;

        Enumerator lv_shiftOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4831:2: ( (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) )
            // InternalTryGrammar.g:4832:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            {
            // InternalTryGrammar.g:4832:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            // InternalTryGrammar.g:4833:3: this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftAccess().getAddSubParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_AddSub_0=ruleAddSub();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddSub_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4841:3: ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=192 && LA80_0<=194)) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalTryGrammar.g:4842:4: () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) )
            	    {
            	    // InternalTryGrammar.g:4842:4: ()
            	    // InternalTryGrammar.g:4843:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getShiftAccess().getShiftLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryGrammar.g:4849:4: ( (lv_shiftOp_2_0= ruleShiftOpEnum ) )
            	    // InternalTryGrammar.g:4850:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    {
            	    // InternalTryGrammar.g:4850:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    // InternalTryGrammar.g:4851:6: lv_shiftOp_2_0= ruleShiftOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftAccess().getShiftOpShiftOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
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

            	    // InternalTryGrammar.g:4868:4: ( (lv_right_3_0= ruleAddSub ) )
            	    // InternalTryGrammar.g:4869:5: (lv_right_3_0= ruleAddSub )
            	    {
            	    // InternalTryGrammar.g:4869:5: (lv_right_3_0= ruleAddSub )
            	    // InternalTryGrammar.g:4870:6: lv_right_3_0= ruleAddSub
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftAccess().getRightAddSubParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
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
    // $ANTLR end "ruleShift"


    // $ANTLR start "entryRuleAddSub"
    // InternalTryGrammar.g:4892:1: entryRuleAddSub returns [EObject current=null] : iv_ruleAddSub= ruleAddSub EOF ;
    public final EObject entryRuleAddSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSub = null;


        try {
            // InternalTryGrammar.g:4892:47: (iv_ruleAddSub= ruleAddSub EOF )
            // InternalTryGrammar.g:4893:2: iv_ruleAddSub= ruleAddSub EOF
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
    // InternalTryGrammar.g:4899:1: ruleAddSub returns [EObject current=null] : (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) ;
    public final EObject ruleAddSub() throws RecognitionException {
        EObject current = null;

        EObject this_MulDivMod_0 = null;

        Enumerator lv_additionOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4905:2: ( (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) )
            // InternalTryGrammar.g:4906:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            {
            // InternalTryGrammar.g:4906:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            // InternalTryGrammar.g:4907:3: this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddSubAccess().getMulDivModParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_MulDivMod_0=ruleMulDivMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulDivMod_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:4915:3: ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==57) && (synpred3_InternalTryGrammar())) {
                    alt81=1;
                }
                else if ( (LA81_0==58) && (synpred3_InternalTryGrammar())) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalTryGrammar.g:4916:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    {
            	    // InternalTryGrammar.g:4931:4: ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    // InternalTryGrammar.g:4932:5: () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) )
            	    {
            	    // InternalTryGrammar.g:4932:5: ()
            	    // InternalTryGrammar.g:4933:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAddSubAccess().getAddSubLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalTryGrammar.g:4939:5: ( (lv_additionOp_2_0= ruleAdditionOpEnum ) )
            	    // InternalTryGrammar.g:4940:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    {
            	    // InternalTryGrammar.g:4940:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    // InternalTryGrammar.g:4941:7: lv_additionOp_2_0= ruleAdditionOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddSubAccess().getAdditionOpAdditionOpEnumEnumRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_12);
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

            	    // InternalTryGrammar.g:4958:5: ( (lv_right_3_0= ruleMulDivMod ) )
            	    // InternalTryGrammar.g:4959:6: (lv_right_3_0= ruleMulDivMod )
            	    {
            	    // InternalTryGrammar.g:4959:6: (lv_right_3_0= ruleMulDivMod )
            	    // InternalTryGrammar.g:4960:7: lv_right_3_0= ruleMulDivMod
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddSubAccess().getRightMulDivModParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_58);
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
    // $ANTLR end "ruleAddSub"


    // $ANTLR start "entryRuleMulDivMod"
    // InternalTryGrammar.g:4983:1: entryRuleMulDivMod returns [EObject current=null] : iv_ruleMulDivMod= ruleMulDivMod EOF ;
    public final EObject entryRuleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDivMod = null;


        try {
            // InternalTryGrammar.g:4983:50: (iv_ruleMulDivMod= ruleMulDivMod EOF )
            // InternalTryGrammar.g:4984:2: iv_ruleMulDivMod= ruleMulDivMod EOF
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
    // InternalTryGrammar.g:4990:1: ruleMulDivMod returns [EObject current=null] : (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) ;
    public final EObject ruleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject this_Exponent_0 = null;

        Enumerator lv_multipliciativeOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:4996:2: ( (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) )
            // InternalTryGrammar.g:4997:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            {
            // InternalTryGrammar.g:4997:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            // InternalTryGrammar.g:4998:3: this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulDivModAccess().getExponentParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_Exponent_0=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Exponent_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:5006:3: ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( ((LA82_0>=195 && LA82_0<=197)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalTryGrammar.g:5007:4: () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) )
            	    {
            	    // InternalTryGrammar.g:5007:4: ()
            	    // InternalTryGrammar.g:5008:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulDivModAccess().getMulDivModLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryGrammar.g:5014:4: ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) )
            	    // InternalTryGrammar.g:5015:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    {
            	    // InternalTryGrammar.g:5015:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    // InternalTryGrammar.g:5016:6: lv_multipliciativeOp_2_0= ruleMulDivModOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulDivModAccess().getMultipliciativeOpMulDivModOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
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

            	    // InternalTryGrammar.g:5033:4: ( (lv_right_3_0= ruleExponent ) )
            	    // InternalTryGrammar.g:5034:5: (lv_right_3_0= ruleExponent )
            	    {
            	    // InternalTryGrammar.g:5034:5: (lv_right_3_0= ruleExponent )
            	    // InternalTryGrammar.g:5035:6: lv_right_3_0= ruleExponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulDivModAccess().getRightExponentParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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
    // $ANTLR end "ruleMulDivMod"


    // $ANTLR start "entryRuleExponent"
    // InternalTryGrammar.g:5057:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalTryGrammar.g:5057:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalTryGrammar.g:5058:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalTryGrammar.g:5064:1: ruleExponent returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5070:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalTryGrammar.g:5071:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalTryGrammar.g:5071:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalTryGrammar.g:5072:3: this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExponentAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:5080:3: ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==54) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalTryGrammar.g:5081:4: () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalTryGrammar.g:5081:4: ()
            	    // InternalTryGrammar.g:5082:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExponentAccess().getExponentLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
            	      			
            	    }
            	    // InternalTryGrammar.g:5092:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalTryGrammar.g:5093:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalTryGrammar.g:5093:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalTryGrammar.g:5094:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExponentAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
    // $ANTLR end "ruleExponent"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalTryGrammar.g:5116:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalTryGrammar.g:5116:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalTryGrammar.g:5117:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalTryGrammar.g:5123:1: ruleUnaryExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_BinaryNotExpression_1 = null;

        EObject this_SignExpression_2 = null;

        EObject this_NewExpression_3 = null;

        EObject this_PreExpression_4 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5129:2: ( (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) )
            // InternalTryGrammar.g:5130:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            {
            // InternalTryGrammar.g:5130:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            int alt84=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt84=1;
                }
                break;
            case 56:
                {
                alt84=2;
                }
                break;
            case 57:
            case 58:
                {
                alt84=3;
                }
                break;
            case 59:
                {
                alt84=4;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case 20:
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
            case 198:
            case 199:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
                {
                alt84=5;
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
                    // InternalTryGrammar.g:5131:3: this_NotExpression_0= ruleNotExpression
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
                    // InternalTryGrammar.g:5140:3: this_BinaryNotExpression_1= ruleBinaryNotExpression
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
                    // InternalTryGrammar.g:5149:3: this_SignExpression_2= ruleSignExpression
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
                    // InternalTryGrammar.g:5158:3: this_NewExpression_3= ruleNewExpression
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
                    // InternalTryGrammar.g:5167:3: this_PreExpression_4= rulePreExpression
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
    // InternalTryGrammar.g:5179:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalTryGrammar.g:5179:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalTryGrammar.g:5180:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalTryGrammar.g:5186:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5192:2: ( (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalTryGrammar.g:5193:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalTryGrammar.g:5193:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalTryGrammar.g:5194:3: otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalTryGrammar.g:5198:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalTryGrammar.g:5199:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalTryGrammar.g:5199:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalTryGrammar.g:5200:5: lv_expression_1_0= ruleUnaryExpression
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
    // InternalTryGrammar.g:5221:1: entryRuleBinaryNotExpression returns [EObject current=null] : iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF ;
    public final EObject entryRuleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryNotExpression = null;


        try {
            // InternalTryGrammar.g:5221:60: (iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF )
            // InternalTryGrammar.g:5222:2: iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF
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
    // InternalTryGrammar.g:5228:1: ruleBinaryNotExpression returns [EObject current=null] : (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5234:2: ( (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalTryGrammar.g:5235:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalTryGrammar.g:5235:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalTryGrammar.g:5236:3: otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBinaryNotExpressionAccess().getTildeKeyword_0());
              		
            }
            // InternalTryGrammar.g:5240:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalTryGrammar.g:5241:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalTryGrammar.g:5241:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalTryGrammar.g:5242:5: lv_expression_1_0= ruleUnaryExpression
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
    // InternalTryGrammar.g:5263:1: entryRuleSignExpression returns [EObject current=null] : iv_ruleSignExpression= ruleSignExpression EOF ;
    public final EObject entryRuleSignExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignExpression = null;


        try {
            // InternalTryGrammar.g:5263:55: (iv_ruleSignExpression= ruleSignExpression EOF )
            // InternalTryGrammar.g:5264:2: iv_ruleSignExpression= ruleSignExpression EOF
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
    // InternalTryGrammar.g:5270:1: ruleSignExpression returns [EObject current=null] : ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleSignExpression() throws RecognitionException {
        EObject current = null;

        Token lv_signOp_0_1=null;
        Token lv_signOp_0_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5276:2: ( ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalTryGrammar.g:5277:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalTryGrammar.g:5277:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalTryGrammar.g:5278:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            // InternalTryGrammar.g:5278:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) )
            // InternalTryGrammar.g:5279:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            {
            // InternalTryGrammar.g:5279:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            // InternalTryGrammar.g:5280:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            {
            // InternalTryGrammar.g:5280:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==57) ) {
                alt85=1;
            }
            else if ( (LA85_0==58) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalTryGrammar.g:5281:6: lv_signOp_0_1= '+'
                    {
                    lv_signOp_0_1=(Token)match(input,57,FOLLOW_12); if (state.failed) return current;
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
                    // InternalTryGrammar.g:5292:6: lv_signOp_0_2= '-'
                    {
                    lv_signOp_0_2=(Token)match(input,58,FOLLOW_12); if (state.failed) return current;
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

            // InternalTryGrammar.g:5305:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalTryGrammar.g:5306:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalTryGrammar.g:5306:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalTryGrammar.g:5307:5: lv_expression_1_0= ruleUnaryExpression
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
    // InternalTryGrammar.g:5328:1: entryRuleNewExpression returns [EObject current=null] : iv_ruleNewExpression= ruleNewExpression EOF ;
    public final EObject entryRuleNewExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewExpression = null;


        try {
            // InternalTryGrammar.g:5328:54: (iv_ruleNewExpression= ruleNewExpression EOF )
            // InternalTryGrammar.g:5329:2: iv_ruleNewExpression= ruleNewExpression EOF
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
    // InternalTryGrammar.g:5335:1: ruleNewExpression returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) ;
    public final EObject ruleNewExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5341:2: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) )
            // InternalTryGrammar.g:5342:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            {
            // InternalTryGrammar.g:5342:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            // InternalTryGrammar.g:5343:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNewExpressionAccess().getNewKeyword_0());
              		
            }
            // InternalTryGrammar.g:5347:3: ( (otherlv_1= RULE_ID ) )
            // InternalTryGrammar.g:5348:4: (otherlv_1= RULE_ID )
            {
            // InternalTryGrammar.g:5348:4: (otherlv_1= RULE_ID )
            // InternalTryGrammar.g:5349:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNewExpressionRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getNewExpressionAccess().getContractContractOrLibraryCrossReference_1_0());
              				
            }

            }


            }

            // InternalTryGrammar.g:5360:3: ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            // InternalTryGrammar.g:5361:4: (lv_args_2_0= ruleFunctionCallListArguments )
            {
            // InternalTryGrammar.g:5361:4: (lv_args_2_0= ruleFunctionCallListArguments )
            // InternalTryGrammar.g:5362:5: lv_args_2_0= ruleFunctionCallListArguments
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
    // InternalTryGrammar.g:5383:1: entryRulePreExpression returns [EObject current=null] : iv_rulePreExpression= rulePreExpression EOF ;
    public final EObject entryRulePreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreExpression = null;


        try {
            // InternalTryGrammar.g:5383:54: (iv_rulePreExpression= rulePreExpression EOF )
            // InternalTryGrammar.g:5384:2: iv_rulePreExpression= rulePreExpression EOF
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
    // InternalTryGrammar.g:5390:1: rulePreExpression returns [EObject current=null] : (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) ;
    public final EObject rulePreExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_PostIncDecExpression_0 = null;

        EObject this_PostIncDecExpression_2 = null;

        EObject this_PostIncDecExpression_5 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5396:2: ( (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) )
            // InternalTryGrammar.g:5397:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            {
            // InternalTryGrammar.g:5397:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            int alt86=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case 20:
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
            case 198:
            case 199:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
                {
                alt86=1;
                }
                break;
            case 60:
                {
                alt86=2;
                }
                break;
            case 61:
                {
                alt86=3;
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
                    // InternalTryGrammar.g:5398:3: this_PostIncDecExpression_0= rulePostIncDecExpression
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
                    // InternalTryGrammar.g:5407:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    {
                    // InternalTryGrammar.g:5407:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    // InternalTryGrammar.g:5408:4: otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression ()
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_61); if (state.failed) return current;
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
                    // InternalTryGrammar.g:5420:4: ()
                    // InternalTryGrammar.g:5421:5: 
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
                    // InternalTryGrammar.g:5429:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    {
                    // InternalTryGrammar.g:5429:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    // InternalTryGrammar.g:5430:4: otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression ()
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_61); if (state.failed) return current;
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
                    // InternalTryGrammar.g:5442:4: ()
                    // InternalTryGrammar.g:5443:5: 
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
    // InternalTryGrammar.g:5454:1: entryRulePostIncDecExpression returns [EObject current=null] : iv_rulePostIncDecExpression= rulePostIncDecExpression EOF ;
    public final EObject entryRulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostIncDecExpression = null;


        try {
            // InternalTryGrammar.g:5454:61: (iv_rulePostIncDecExpression= rulePostIncDecExpression EOF )
            // InternalTryGrammar.g:5455:2: iv_rulePostIncDecExpression= rulePostIncDecExpression EOF
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
    // InternalTryGrammar.g:5461:1: rulePostIncDecExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) ;
    public final EObject rulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_postOp_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5467:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) )
            // InternalTryGrammar.g:5468:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            {
            // InternalTryGrammar.g:5468:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            // InternalTryGrammar.g:5469:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPostIncDecExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTryGrammar.g:5477:3: ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( ((LA87_0>=60 && LA87_0<=61)) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalTryGrammar.g:5478:4: () ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    {
            	    // InternalTryGrammar.g:5478:4: ()
            	    // InternalTryGrammar.g:5479:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPostIncDecExpressionAccess().getPostIncDecExpressionExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTryGrammar.g:5485:4: ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    // InternalTryGrammar.g:5486:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    {
            	    // InternalTryGrammar.g:5486:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    // InternalTryGrammar.g:5487:6: lv_postOp_2_0= ruleIncDecOpEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPostIncDecExpressionAccess().getPostOpIncDecOpEnumEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
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
            	    break loop87;
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
    // InternalTryGrammar.g:5509:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalTryGrammar.g:5509:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalTryGrammar.g:5510:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalTryGrammar.g:5516:1: rulePrimaryExpression returns [EObject current=null] : (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) ;
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
            // InternalTryGrammar.g:5522:2: ( (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) )
            // InternalTryGrammar.g:5523:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            {
            // InternalTryGrammar.g:5523:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            int alt94=7;
            switch ( input.LA(1) ) {
            case 213:
            case 214:
                {
                alt94=1;
                }
                break;
            case RULE_ID:
                {
                alt94=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEX:
            case RULE_DECIMAL:
            case 62:
            case 198:
            case 199:
            case 210:
            case 211:
            case 212:
                {
                alt94=3;
                }
                break;
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
                {
                alt94=4;
                }
                break;
            case 20:
                {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    alt94=7;
                    }
                    break;
                case 15:
                    {
                    alt94=6;
                    }
                    break;
                case RULE_ID:
                case RULE_INT:
                case RULE_STRING:
                case RULE_HEX:
                case RULE_DECIMAL:
                case 20:
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
                case 198:
                case 199:
                case 210:
                case 211:
                case 212:
                case 213:
                case 214:
                    {
                    alt94=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 5, input);

                    throw nvae;
                }

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
                    // InternalTryGrammar.g:5524:3: this_SpecialExpression_0= ruleSpecialExpression
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
                    // InternalTryGrammar.g:5533:3: this_QualifiedIdentifier_1= ruleQualifiedIdentifier
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
                    // InternalTryGrammar.g:5542:3: this_Literal_2= ruleLiteral
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
                    // InternalTryGrammar.g:5551:3: this_TypeCast_3= ruleTypeCast
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
                    // InternalTryGrammar.g:5560:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    {
                    // InternalTryGrammar.g:5560:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    // InternalTryGrammar.g:5561:4: otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
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
                    // InternalTryGrammar.g:5573:4: ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==15) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalTryGrammar.g:5574:5: () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            {
                            // InternalTryGrammar.g:5574:5: ()
                            // InternalTryGrammar.g:5575:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndAdd(
                              							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_4_2_0(),
                              							current);
                              					
                            }

                            }

                            // InternalTryGrammar.g:5581:5: ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            int cnt89=0;
                            loop89:
                            do {
                                int alt89=2;
                                int LA89_0 = input.LA(1);

                                if ( (LA89_0==15) ) {
                                    alt89=1;
                                }


                                switch (alt89) {
                            	case 1 :
                            	    // InternalTryGrammar.g:5582:6: ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )?
                            	    {
                            	    // InternalTryGrammar.g:5582:6: ( (lv_members_7_0= ruleTupleSeparator ) )
                            	    // InternalTryGrammar.g:5583:7: (lv_members_7_0= ruleTupleSeparator )
                            	    {
                            	    // InternalTryGrammar.g:5583:7: (lv_members_7_0= ruleTupleSeparator )
                            	    // InternalTryGrammar.g:5584:8: lv_members_7_0= ruleTupleSeparator
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
                            	      									"org.unicam.tryGrammar.TryGrammar.TupleSeparator");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    // InternalTryGrammar.g:5601:6: ( (lv_members_8_0= ruleExpression ) )?
                            	    int alt88=2;
                            	    int LA88_0 = input.LA(1);

                            	    if ( ((LA88_0>=RULE_ID && LA88_0<=RULE_DECIMAL)||LA88_0==20||(LA88_0>=55 && LA88_0<=166)||(LA88_0>=198 && LA88_0<=199)||(LA88_0>=210 && LA88_0<=214)) ) {
                            	        alt88=1;
                            	    }
                            	    switch (alt88) {
                            	        case 1 :
                            	            // InternalTryGrammar.g:5602:7: (lv_members_8_0= ruleExpression )
                            	            {
                            	            // InternalTryGrammar.g:5602:7: (lv_members_8_0= ruleExpression )
                            	            // InternalTryGrammar.g:5603:8: lv_members_8_0= ruleExpression
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
                            	    if ( cnt89 >= 1 ) break loop89;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(89, input);
                                        throw eee;
                                }
                                cnt89++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryGrammar.g:5628:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    {
                    // InternalTryGrammar.g:5628:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    // InternalTryGrammar.g:5629:4: otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_32); if (state.failed) return current;
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
                    // InternalTryGrammar.g:5641:4: ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* )
                    // InternalTryGrammar.g:5642:5: () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    {
                    // InternalTryGrammar.g:5642:5: ()
                    // InternalTryGrammar.g:5643:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_5_2_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTryGrammar.g:5649:5: ( (lv_members_13_0= ruleExpression ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( ((LA91_0>=RULE_ID && LA91_0<=RULE_DECIMAL)||LA91_0==20||(LA91_0>=55 && LA91_0<=166)||(LA91_0>=198 && LA91_0<=199)||(LA91_0>=210 && LA91_0<=214)) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalTryGrammar.g:5650:6: (lv_members_13_0= ruleExpression )
                            {
                            // InternalTryGrammar.g:5650:6: (lv_members_13_0= ruleExpression )
                            // InternalTryGrammar.g:5651:7: lv_members_13_0= ruleExpression
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
                              								"org.unicam.tryGrammar.TryGrammar.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalTryGrammar.g:5668:5: ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==15) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalTryGrammar.g:5669:6: ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )?
                    	    {
                    	    // InternalTryGrammar.g:5669:6: ( (lv_members_14_0= ruleTupleSeparator ) )
                    	    // InternalTryGrammar.g:5670:7: (lv_members_14_0= ruleTupleSeparator )
                    	    {
                    	    // InternalTryGrammar.g:5670:7: (lv_members_14_0= ruleTupleSeparator )
                    	    // InternalTryGrammar.g:5671:8: lv_members_14_0= ruleTupleSeparator
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
                    	      									"org.unicam.tryGrammar.TryGrammar.TupleSeparator");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }

                    	    // InternalTryGrammar.g:5688:6: ( (lv_members_15_0= ruleExpression ) )?
                    	    int alt92=2;
                    	    int LA92_0 = input.LA(1);

                    	    if ( ((LA92_0>=RULE_ID && LA92_0<=RULE_DECIMAL)||LA92_0==20||(LA92_0>=55 && LA92_0<=166)||(LA92_0>=198 && LA92_0<=199)||(LA92_0>=210 && LA92_0<=214)) ) {
                    	        alt92=1;
                    	    }
                    	    switch (alt92) {
                    	        case 1 :
                    	            // InternalTryGrammar.g:5689:7: (lv_members_15_0= ruleExpression )
                    	            {
                    	            // InternalTryGrammar.g:5689:7: (lv_members_15_0= ruleExpression )
                    	            // InternalTryGrammar.g:5690:8: lv_members_15_0= ruleExpression
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
                    	    break loop93;
                        }
                    } while (true);


                    }

                    otherlv_16=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTryGrammar.g:5715:3: (otherlv_17= '(' otherlv_18= ')' () )
                    {
                    // InternalTryGrammar.g:5715:3: (otherlv_17= '(' otherlv_18= ')' () )
                    // InternalTryGrammar.g:5716:4: otherlv_17= '(' otherlv_18= ')' ()
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    otherlv_18=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_6_1());
                      			
                    }
                    // InternalTryGrammar.g:5724:4: ()
                    // InternalTryGrammar.g:5725:5: 
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
    // InternalTryGrammar.g:5736:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalTryGrammar.g:5736:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalTryGrammar.g:5737:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalTryGrammar.g:5743:1: ruleLiteral returns [EObject current=null] : (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialVariables_0 = null;

        EObject this_BooleanConst_1 = null;

        EObject this_Number_2 = null;

        EObject this_StringLiteral_3 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5749:2: ( (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral ) )
            // InternalTryGrammar.g:5750:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral )
            {
            // InternalTryGrammar.g:5750:2: (this_SpecialVariables_0= ruleSpecialVariables | this_BooleanConst_1= ruleBooleanConst | this_Number_2= ruleNumber | this_StringLiteral_3= ruleStringLiteral )
            int alt95=4;
            switch ( input.LA(1) ) {
            case 210:
            case 211:
            case 212:
                {
                alt95=1;
                }
                break;
            case 198:
            case 199:
                {
                alt95=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case 62:
                {
                alt95=3;
                }
                break;
            case RULE_STRING:
                {
                alt95=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalTryGrammar.g:5751:3: this_SpecialVariables_0= ruleSpecialVariables
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
                    // InternalTryGrammar.g:5760:3: this_BooleanConst_1= ruleBooleanConst
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
                    // InternalTryGrammar.g:5769:3: this_Number_2= ruleNumber
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
                    // InternalTryGrammar.g:5778:3: this_StringLiteral_3= ruleStringLiteral
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
    // InternalTryGrammar.g:5790:1: entryRuleBooleanConst returns [EObject current=null] : iv_ruleBooleanConst= ruleBooleanConst EOF ;
    public final EObject entryRuleBooleanConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConst = null;


        try {
            // InternalTryGrammar.g:5790:53: (iv_ruleBooleanConst= ruleBooleanConst EOF )
            // InternalTryGrammar.g:5791:2: iv_ruleBooleanConst= ruleBooleanConst EOF
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
    // InternalTryGrammar.g:5797:1: ruleBooleanConst returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) ;
    public final EObject ruleBooleanConst() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5803:2: ( ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) )
            // InternalTryGrammar.g:5804:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            {
            // InternalTryGrammar.g:5804:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            // InternalTryGrammar.g:5805:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            {
            // InternalTryGrammar.g:5805:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            // InternalTryGrammar.g:5806:4: lv_value_0_0= ruleBooleanLiteralEnum
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
    // InternalTryGrammar.g:5826:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalTryGrammar.g:5826:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalTryGrammar.g:5827:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalTryGrammar.g:5833:1: ruleNumber returns [EObject current=null] : (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Now_2= ruleNow | this_Time_3= ruleTime | this_HexLiteral_4= ruleHexLiteral | this_DecimalLiteral_5= ruleDecimalLiteral ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        EObject this_NumberDimensionless_0 = null;

        EObject this_Ether_1 = null;

        EObject this_Now_2 = null;

        EObject this_Time_3 = null;

        EObject this_HexLiteral_4 = null;

        EObject this_DecimalLiteral_5 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5839:2: ( (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Now_2= ruleNow | this_Time_3= ruleTime | this_HexLiteral_4= ruleHexLiteral | this_DecimalLiteral_5= ruleDecimalLiteral ) )
            // InternalTryGrammar.g:5840:2: (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Now_2= ruleNow | this_Time_3= ruleTime | this_HexLiteral_4= ruleHexLiteral | this_DecimalLiteral_5= ruleDecimalLiteral )
            {
            // InternalTryGrammar.g:5840:2: (this_NumberDimensionless_0= ruleNumberDimensionless | this_Ether_1= ruleEther | this_Now_2= ruleNow | this_Time_3= ruleTime | this_HexLiteral_4= ruleHexLiteral | this_DecimalLiteral_5= ruleDecimalLiteral )
            int alt96=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 15:
                case 18:
                case 19:
                case 21:
                case 28:
                case 33:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 57:
                case 58:
                case 60:
                case 61:
                case 174:
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
                    alt96=1;
                    }
                    break;
                case 204:
                case 205:
                case 206:
                case 207:
                case 208:
                case 209:
                    {
                    alt96=4;
                    }
                    break;
                case 200:
                case 201:
                case 202:
                case 203:
                    {
                    alt96=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 1, input);

                    throw nvae;
                }

                }
                break;
            case 62:
                {
                alt96=3;
                }
                break;
            case RULE_HEX:
                {
                alt96=5;
                }
                break;
            case RULE_DECIMAL:
                {
                alt96=6;
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
                    // InternalTryGrammar.g:5841:3: this_NumberDimensionless_0= ruleNumberDimensionless
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
                    // InternalTryGrammar.g:5850:3: this_Ether_1= ruleEther
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
                    // InternalTryGrammar.g:5859:3: this_Now_2= ruleNow
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
                    // InternalTryGrammar.g:5868:3: this_Time_3= ruleTime
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
                case 5 :
                    // InternalTryGrammar.g:5877:3: this_HexLiteral_4= ruleHexLiteral
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
                    // InternalTryGrammar.g:5886:3: this_DecimalLiteral_5= ruleDecimalLiteral
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
    // InternalTryGrammar.g:5898:1: entryRuleNumberDimensionless returns [EObject current=null] : iv_ruleNumberDimensionless= ruleNumberDimensionless EOF ;
    public final EObject entryRuleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberDimensionless = null;


        try {
            // InternalTryGrammar.g:5898:60: (iv_ruleNumberDimensionless= ruleNumberDimensionless EOF )
            // InternalTryGrammar.g:5899:2: iv_ruleNumberDimensionless= ruleNumberDimensionless EOF
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
    // InternalTryGrammar.g:5905:1: ruleNumberDimensionless returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberDimensionless() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:5911:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTryGrammar.g:5912:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTryGrammar.g:5912:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTryGrammar.g:5913:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTryGrammar.g:5913:3: (lv_value_0_0= RULE_INT )
            // InternalTryGrammar.g:5914:4: lv_value_0_0= RULE_INT
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
    // InternalTryGrammar.g:5933:1: entryRuleEther returns [EObject current=null] : iv_ruleEther= ruleEther EOF ;
    public final EObject entryRuleEther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEther = null;


        try {
            // InternalTryGrammar.g:5933:46: (iv_ruleEther= ruleEther EOF )
            // InternalTryGrammar.g:5934:2: iv_ruleEther= ruleEther EOF
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
    // InternalTryGrammar.g:5940:1: ruleEther returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) ;
    public final EObject ruleEther() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_ether_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:5946:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) ) )
            // InternalTryGrammar.g:5947:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            {
            // InternalTryGrammar.g:5947:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) ) )
            // InternalTryGrammar.g:5948:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            {
            // InternalTryGrammar.g:5948:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalTryGrammar.g:5949:4: (lv_value_0_0= RULE_INT )
            {
            // InternalTryGrammar.g:5949:4: (lv_value_0_0= RULE_INT )
            // InternalTryGrammar.g:5950:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_63); if (state.failed) return current;
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

            // InternalTryGrammar.g:5966:3: ( (lv_ether_1_0= ruleEtherSubDenominationEnum ) )
            // InternalTryGrammar.g:5967:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            {
            // InternalTryGrammar.g:5967:4: (lv_ether_1_0= ruleEtherSubDenominationEnum )
            // InternalTryGrammar.g:5968:5: lv_ether_1_0= ruleEtherSubDenominationEnum
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
    // InternalTryGrammar.g:5989:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalTryGrammar.g:5989:45: (iv_ruleTime= ruleTime EOF )
            // InternalTryGrammar.g:5990:2: iv_ruleTime= ruleTime EOF
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
    // InternalTryGrammar.g:5996:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_time_1_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:6002:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) ) )
            // InternalTryGrammar.g:6003:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            {
            // InternalTryGrammar.g:6003:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) ) )
            // InternalTryGrammar.g:6004:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            {
            // InternalTryGrammar.g:6004:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalTryGrammar.g:6005:4: (lv_value_0_0= RULE_INT )
            {
            // InternalTryGrammar.g:6005:4: (lv_value_0_0= RULE_INT )
            // InternalTryGrammar.g:6006:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_64); if (state.failed) return current;
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

            // InternalTryGrammar.g:6022:3: ( (lv_time_1_0= ruleTimeSubdenominationEnum ) )
            // InternalTryGrammar.g:6023:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            {
            // InternalTryGrammar.g:6023:4: (lv_time_1_0= ruleTimeSubdenominationEnum )
            // InternalTryGrammar.g:6024:5: lv_time_1_0= ruleTimeSubdenominationEnum
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
    // InternalTryGrammar.g:6045:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalTryGrammar.g:6045:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalTryGrammar.g:6046:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalTryGrammar.g:6052:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:6058:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTryGrammar.g:6059:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTryGrammar.g:6059:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTryGrammar.g:6060:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTryGrammar.g:6060:3: (lv_value_0_0= RULE_STRING )
            // InternalTryGrammar.g:6061:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleHexLiteral"
    // InternalTryGrammar.g:6080:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // InternalTryGrammar.g:6080:51: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // InternalTryGrammar.g:6081:2: iv_ruleHexLiteral= ruleHexLiteral EOF
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
    // InternalTryGrammar.g:6087:1: ruleHexLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_HEX ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:6093:2: ( ( (lv_value_0_0= RULE_HEX ) ) )
            // InternalTryGrammar.g:6094:2: ( (lv_value_0_0= RULE_HEX ) )
            {
            // InternalTryGrammar.g:6094:2: ( (lv_value_0_0= RULE_HEX ) )
            // InternalTryGrammar.g:6095:3: (lv_value_0_0= RULE_HEX )
            {
            // InternalTryGrammar.g:6095:3: (lv_value_0_0= RULE_HEX )
            // InternalTryGrammar.g:6096:4: lv_value_0_0= RULE_HEX
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
              					"org.unicam.tryGrammar.TryGrammar.HEX");
              			
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
    // InternalTryGrammar.g:6115:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalTryGrammar.g:6115:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalTryGrammar.g:6116:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalTryGrammar.g:6122:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:6128:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalTryGrammar.g:6129:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalTryGrammar.g:6129:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalTryGrammar.g:6130:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalTryGrammar.g:6130:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalTryGrammar.g:6131:4: lv_value_0_0= RULE_DECIMAL
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
              					"org.unicam.tryGrammar.TryGrammar.DECIMAL");
              			
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
    // InternalTryGrammar.g:6150:1: entryRuleTypeCast returns [EObject current=null] : iv_ruleTypeCast= ruleTypeCast EOF ;
    public final EObject entryRuleTypeCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCast = null;


        try {
            // InternalTryGrammar.g:6150:49: (iv_ruleTypeCast= ruleTypeCast EOF )
            // InternalTryGrammar.g:6151:2: iv_ruleTypeCast= ruleTypeCast EOF
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
    // InternalTryGrammar.g:6157:1: ruleTypeCast returns [EObject current=null] : ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypeCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:6163:2: ( ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalTryGrammar.g:6164:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalTryGrammar.g:6164:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalTryGrammar.g:6165:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalTryGrammar.g:6165:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) )
            // InternalTryGrammar.g:6166:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalTryGrammar.g:6166:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            // InternalTryGrammar.g:6167:5: lv_value_0_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeCastAccess().getValueElementaryTypeNameEnumEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_20);
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

            otherlv_1=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTypeCastAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalTryGrammar.g:6188:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalTryGrammar.g:6189:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalTryGrammar.g:6189:4: (lv_expression_2_0= ruleExpression )
            // InternalTryGrammar.g:6190:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeCastAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:6215:1: entryRuleNow returns [EObject current=null] : iv_ruleNow= ruleNow EOF ;
    public final EObject entryRuleNow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNow = null;


        try {
            // InternalTryGrammar.g:6215:44: (iv_ruleNow= ruleNow EOF )
            // InternalTryGrammar.g:6216:2: iv_ruleNow= ruleNow EOF
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
    // InternalTryGrammar.g:6222:1: ruleNow returns [EObject current=null] : ( () otherlv_1= 'now' ) ;
    public final EObject ruleNow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:6228:2: ( ( () otherlv_1= 'now' ) )
            // InternalTryGrammar.g:6229:2: ( () otherlv_1= 'now' )
            {
            // InternalTryGrammar.g:6229:2: ( () otherlv_1= 'now' )
            // InternalTryGrammar.g:6230:3: () otherlv_1= 'now'
            {
            // InternalTryGrammar.g:6230:3: ()
            // InternalTryGrammar.g:6231:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNowAccess().getNowAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:6245:1: entryRuleSpecialVariables returns [EObject current=null] : iv_ruleSpecialVariables= ruleSpecialVariables EOF ;
    public final EObject entryRuleSpecialVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVariables = null;


        try {
            // InternalTryGrammar.g:6245:57: (iv_ruleSpecialVariables= ruleSpecialVariables EOF )
            // InternalTryGrammar.g:6246:2: iv_ruleSpecialVariables= ruleSpecialVariables EOF
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
    // InternalTryGrammar.g:6252:1: ruleSpecialVariables returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) ;
    public final EObject ruleSpecialVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_field_2_0=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_qualifiers_3_0 = null;



        	enterRule();

        try {
            // InternalTryGrammar.g:6258:2: ( ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* ) )
            // InternalTryGrammar.g:6259:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            {
            // InternalTryGrammar.g:6259:2: ( ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )* )
            // InternalTryGrammar.g:6260:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( (lv_qualifiers_3_0= ruleQualifier ) )*
            {
            // InternalTryGrammar.g:6260:3: ( (lv_type_0_0= ruleSpecialVariablesTypeEnum ) )
            // InternalTryGrammar.g:6261:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            {
            // InternalTryGrammar.g:6261:4: (lv_type_0_0= ruleSpecialVariablesTypeEnum )
            // InternalTryGrammar.g:6262:5: lv_type_0_0= ruleSpecialVariablesTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialVariablesAccess().getTypeSpecialVariablesTypeEnumEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_65);
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

            otherlv_1=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpecialVariablesAccess().getFullStopKeyword_1());
              		
            }
            // InternalTryGrammar.g:6283:3: ( (lv_field_2_0= RULE_ID ) )
            // InternalTryGrammar.g:6284:4: (lv_field_2_0= RULE_ID )
            {
            // InternalTryGrammar.g:6284:4: (lv_field_2_0= RULE_ID )
            // InternalTryGrammar.g:6285:5: lv_field_2_0= RULE_ID
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
              						"org.unicam.tryGrammar.TryGrammar.ID");
              				
            }

            }


            }

            // InternalTryGrammar.g:6301:3: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==20||LA97_0==32||LA97_0==35) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalTryGrammar.g:6302:4: (lv_qualifiers_3_0= ruleQualifier )
            	    {
            	    // InternalTryGrammar.g:6302:4: (lv_qualifiers_3_0= ruleQualifier )
            	    // InternalTryGrammar.g:6303:5: lv_qualifiers_3_0= ruleQualifier
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
            	      						"org.unicam.tryGrammar.TryGrammar.Qualifier");
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
    // $ANTLR end "ruleSpecialVariables"


    // $ANTLR start "ruleElementaryTypeNameEnum"
    // InternalTryGrammar.g:6324:1: ruleElementaryTypeNameEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) ) ;
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
            // InternalTryGrammar.g:6330:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) ) )
            // InternalTryGrammar.g:6331:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) )
            {
            // InternalTryGrammar.g:6331:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'int16' ) | (enumLiteral_2= 'int24' ) | (enumLiteral_3= 'int32' ) | (enumLiteral_4= 'int40' ) | (enumLiteral_5= 'int48' ) | (enumLiteral_6= 'int56' ) | (enumLiteral_7= 'int64' ) | (enumLiteral_8= 'int72' ) | (enumLiteral_9= 'int80' ) | (enumLiteral_10= 'int88' ) | (enumLiteral_11= 'int96' ) | (enumLiteral_12= 'int104' ) | (enumLiteral_13= 'int112' ) | (enumLiteral_14= 'int120' ) | (enumLiteral_15= 'int128' ) | (enumLiteral_16= 'int136' ) | (enumLiteral_17= 'int144' ) | (enumLiteral_18= 'int152' ) | (enumLiteral_19= 'int160' ) | (enumLiteral_20= 'int168' ) | (enumLiteral_21= 'int178' ) | (enumLiteral_22= 'int184' ) | (enumLiteral_23= 'int192' ) | (enumLiteral_24= 'int200' ) | (enumLiteral_25= 'int208' ) | (enumLiteral_26= 'int216' ) | (enumLiteral_27= 'int224' ) | (enumLiteral_28= 'int232' ) | (enumLiteral_29= 'int240' ) | (enumLiteral_30= 'int248' ) | (enumLiteral_31= 'int256' ) | (enumLiteral_32= 'uint' ) | (enumLiteral_33= 'uint8' ) | (enumLiteral_34= 'uint16' ) | (enumLiteral_35= 'uint24' ) | (enumLiteral_36= 'uint32' ) | (enumLiteral_37= 'uint40' ) | (enumLiteral_38= 'uint48' ) | (enumLiteral_39= 'uint56' ) | (enumLiteral_40= 'uint64' ) | (enumLiteral_41= 'uint72' ) | (enumLiteral_42= 'uint80' ) | (enumLiteral_43= 'uint88' ) | (enumLiteral_44= 'uint96' ) | (enumLiteral_45= 'uint104' ) | (enumLiteral_46= 'uint112' ) | (enumLiteral_47= 'uint120' ) | (enumLiteral_48= 'uint128' ) | (enumLiteral_49= 'uint136' ) | (enumLiteral_50= 'uint144' ) | (enumLiteral_51= 'uint152' ) | (enumLiteral_52= 'uint160' ) | (enumLiteral_53= 'uint168' ) | (enumLiteral_54= 'uint178' ) | (enumLiteral_55= 'uint184' ) | (enumLiteral_56= 'uint192' ) | (enumLiteral_57= 'uint200' ) | (enumLiteral_58= 'uint208' ) | (enumLiteral_59= 'uint216' ) | (enumLiteral_60= 'uint224' ) | (enumLiteral_61= 'uint232' ) | (enumLiteral_62= 'uint240' ) | (enumLiteral_63= 'uint248' ) | (enumLiteral_64= 'uint256' ) | (enumLiteral_65= 'byte' ) | (enumLiteral_66= 'bytes' ) | (enumLiteral_67= 'bytes1' ) | (enumLiteral_68= 'bytes2' ) | (enumLiteral_69= 'bytes3' ) | (enumLiteral_70= 'bytes4' ) | (enumLiteral_71= 'bytes5' ) | (enumLiteral_72= 'bytes6' ) | (enumLiteral_73= 'bytes7' ) | (enumLiteral_74= 'bytes8' ) | (enumLiteral_75= 'bytes9' ) | (enumLiteral_76= 'bytes10' ) | (enumLiteral_77= 'bytes11' ) | (enumLiteral_78= 'bytes12' ) | (enumLiteral_79= 'bytes13' ) | (enumLiteral_80= 'bytes14' ) | (enumLiteral_81= 'bytes15' ) | (enumLiteral_82= 'bytes16' ) | (enumLiteral_83= 'bytes17' ) | (enumLiteral_84= 'bytes18' ) | (enumLiteral_85= 'bytes19' ) | (enumLiteral_86= 'bytes20' ) | (enumLiteral_87= 'bytes21' ) | (enumLiteral_88= 'bytes22' ) | (enumLiteral_89= 'bytes23' ) | (enumLiteral_90= 'bytes24' ) | (enumLiteral_91= 'bytes25' ) | (enumLiteral_92= 'bytes26' ) | (enumLiteral_93= 'bytes27' ) | (enumLiteral_94= 'bytes28' ) | (enumLiteral_95= 'bytes29' ) | (enumLiteral_96= 'bytes30' ) | (enumLiteral_97= 'bytes31' ) | (enumLiteral_98= 'bytes32' ) | (enumLiteral_99= 'string' ) | (enumLiteral_100= 'address' ) | (enumLiteral_101= 'bool' ) | (enumLiteral_102= 'real' ) | (enumLiteral_103= 'ureal' ) )
            int alt98=104;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt98=1;
                }
                break;
            case 64:
                {
                alt98=2;
                }
                break;
            case 65:
                {
                alt98=3;
                }
                break;
            case 66:
                {
                alt98=4;
                }
                break;
            case 67:
                {
                alt98=5;
                }
                break;
            case 68:
                {
                alt98=6;
                }
                break;
            case 69:
                {
                alt98=7;
                }
                break;
            case 70:
                {
                alt98=8;
                }
                break;
            case 71:
                {
                alt98=9;
                }
                break;
            case 72:
                {
                alt98=10;
                }
                break;
            case 73:
                {
                alt98=11;
                }
                break;
            case 74:
                {
                alt98=12;
                }
                break;
            case 75:
                {
                alt98=13;
                }
                break;
            case 76:
                {
                alt98=14;
                }
                break;
            case 77:
                {
                alt98=15;
                }
                break;
            case 78:
                {
                alt98=16;
                }
                break;
            case 79:
                {
                alt98=17;
                }
                break;
            case 80:
                {
                alt98=18;
                }
                break;
            case 81:
                {
                alt98=19;
                }
                break;
            case 82:
                {
                alt98=20;
                }
                break;
            case 83:
                {
                alt98=21;
                }
                break;
            case 84:
                {
                alt98=22;
                }
                break;
            case 85:
                {
                alt98=23;
                }
                break;
            case 86:
                {
                alt98=24;
                }
                break;
            case 87:
                {
                alt98=25;
                }
                break;
            case 88:
                {
                alt98=26;
                }
                break;
            case 89:
                {
                alt98=27;
                }
                break;
            case 90:
                {
                alt98=28;
                }
                break;
            case 91:
                {
                alt98=29;
                }
                break;
            case 92:
                {
                alt98=30;
                }
                break;
            case 93:
                {
                alt98=31;
                }
                break;
            case 94:
                {
                alt98=32;
                }
                break;
            case 95:
                {
                alt98=33;
                }
                break;
            case 96:
                {
                alt98=34;
                }
                break;
            case 97:
                {
                alt98=35;
                }
                break;
            case 98:
                {
                alt98=36;
                }
                break;
            case 99:
                {
                alt98=37;
                }
                break;
            case 100:
                {
                alt98=38;
                }
                break;
            case 101:
                {
                alt98=39;
                }
                break;
            case 102:
                {
                alt98=40;
                }
                break;
            case 103:
                {
                alt98=41;
                }
                break;
            case 104:
                {
                alt98=42;
                }
                break;
            case 105:
                {
                alt98=43;
                }
                break;
            case 106:
                {
                alt98=44;
                }
                break;
            case 107:
                {
                alt98=45;
                }
                break;
            case 108:
                {
                alt98=46;
                }
                break;
            case 109:
                {
                alt98=47;
                }
                break;
            case 110:
                {
                alt98=48;
                }
                break;
            case 111:
                {
                alt98=49;
                }
                break;
            case 112:
                {
                alt98=50;
                }
                break;
            case 113:
                {
                alt98=51;
                }
                break;
            case 114:
                {
                alt98=52;
                }
                break;
            case 115:
                {
                alt98=53;
                }
                break;
            case 116:
                {
                alt98=54;
                }
                break;
            case 117:
                {
                alt98=55;
                }
                break;
            case 118:
                {
                alt98=56;
                }
                break;
            case 119:
                {
                alt98=57;
                }
                break;
            case 120:
                {
                alt98=58;
                }
                break;
            case 121:
                {
                alt98=59;
                }
                break;
            case 122:
                {
                alt98=60;
                }
                break;
            case 123:
                {
                alt98=61;
                }
                break;
            case 124:
                {
                alt98=62;
                }
                break;
            case 125:
                {
                alt98=63;
                }
                break;
            case 126:
                {
                alt98=64;
                }
                break;
            case 127:
                {
                alt98=65;
                }
                break;
            case 128:
                {
                alt98=66;
                }
                break;
            case 129:
                {
                alt98=67;
                }
                break;
            case 130:
                {
                alt98=68;
                }
                break;
            case 131:
                {
                alt98=69;
                }
                break;
            case 132:
                {
                alt98=70;
                }
                break;
            case 133:
                {
                alt98=71;
                }
                break;
            case 134:
                {
                alt98=72;
                }
                break;
            case 135:
                {
                alt98=73;
                }
                break;
            case 136:
                {
                alt98=74;
                }
                break;
            case 137:
                {
                alt98=75;
                }
                break;
            case 138:
                {
                alt98=76;
                }
                break;
            case 139:
                {
                alt98=77;
                }
                break;
            case 140:
                {
                alt98=78;
                }
                break;
            case 141:
                {
                alt98=79;
                }
                break;
            case 142:
                {
                alt98=80;
                }
                break;
            case 143:
                {
                alt98=81;
                }
                break;
            case 144:
                {
                alt98=82;
                }
                break;
            case 145:
                {
                alt98=83;
                }
                break;
            case 146:
                {
                alt98=84;
                }
                break;
            case 147:
                {
                alt98=85;
                }
                break;
            case 148:
                {
                alt98=86;
                }
                break;
            case 149:
                {
                alt98=87;
                }
                break;
            case 150:
                {
                alt98=88;
                }
                break;
            case 151:
                {
                alt98=89;
                }
                break;
            case 152:
                {
                alt98=90;
                }
                break;
            case 153:
                {
                alt98=91;
                }
                break;
            case 154:
                {
                alt98=92;
                }
                break;
            case 155:
                {
                alt98=93;
                }
                break;
            case 156:
                {
                alt98=94;
                }
                break;
            case 157:
                {
                alt98=95;
                }
                break;
            case 158:
                {
                alt98=96;
                }
                break;
            case 159:
                {
                alt98=97;
                }
                break;
            case 160:
                {
                alt98=98;
                }
                break;
            case 161:
                {
                alt98=99;
                }
                break;
            case 162:
                {
                alt98=100;
                }
                break;
            case 163:
                {
                alt98=101;
                }
                break;
            case 164:
                {
                alt98=102;
                }
                break;
            case 165:
                {
                alt98=103;
                }
                break;
            case 166:
                {
                alt98=104;
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
                    // InternalTryGrammar.g:6332:3: (enumLiteral_0= 'int' )
                    {
                    // InternalTryGrammar.g:6332:3: (enumLiteral_0= 'int' )
                    // InternalTryGrammar.g:6333:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getElementaryTypeNameEnumAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:6340:3: (enumLiteral_1= 'int16' )
                    {
                    // InternalTryGrammar.g:6340:3: (enumLiteral_1= 'int16' )
                    // InternalTryGrammar.g:6341:4: enumLiteral_1= 'int16'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getElementaryTypeNameEnumAccess().getINT16EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:6348:3: (enumLiteral_2= 'int24' )
                    {
                    // InternalTryGrammar.g:6348:3: (enumLiteral_2= 'int24' )
                    // InternalTryGrammar.g:6349:4: enumLiteral_2= 'int24'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT24EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getElementaryTypeNameEnumAccess().getINT24EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:6356:3: (enumLiteral_3= 'int32' )
                    {
                    // InternalTryGrammar.g:6356:3: (enumLiteral_3= 'int32' )
                    // InternalTryGrammar.g:6357:4: enumLiteral_3= 'int32'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT32EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getElementaryTypeNameEnumAccess().getINT32EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryGrammar.g:6364:3: (enumLiteral_4= 'int40' )
                    {
                    // InternalTryGrammar.g:6364:3: (enumLiteral_4= 'int40' )
                    // InternalTryGrammar.g:6365:4: enumLiteral_4= 'int40'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT40EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getElementaryTypeNameEnumAccess().getINT40EnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryGrammar.g:6372:3: (enumLiteral_5= 'int48' )
                    {
                    // InternalTryGrammar.g:6372:3: (enumLiteral_5= 'int48' )
                    // InternalTryGrammar.g:6373:4: enumLiteral_5= 'int48'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT48EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getElementaryTypeNameEnumAccess().getINT48EnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTryGrammar.g:6380:3: (enumLiteral_6= 'int56' )
                    {
                    // InternalTryGrammar.g:6380:3: (enumLiteral_6= 'int56' )
                    // InternalTryGrammar.g:6381:4: enumLiteral_6= 'int56'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT56EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getElementaryTypeNameEnumAccess().getINT56EnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalTryGrammar.g:6388:3: (enumLiteral_7= 'int64' )
                    {
                    // InternalTryGrammar.g:6388:3: (enumLiteral_7= 'int64' )
                    // InternalTryGrammar.g:6389:4: enumLiteral_7= 'int64'
                    {
                    enumLiteral_7=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getElementaryTypeNameEnumAccess().getINT64EnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalTryGrammar.g:6396:3: (enumLiteral_8= 'int72' )
                    {
                    // InternalTryGrammar.g:6396:3: (enumLiteral_8= 'int72' )
                    // InternalTryGrammar.g:6397:4: enumLiteral_8= 'int72'
                    {
                    enumLiteral_8=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT72EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getElementaryTypeNameEnumAccess().getINT72EnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalTryGrammar.g:6404:3: (enumLiteral_9= 'int80' )
                    {
                    // InternalTryGrammar.g:6404:3: (enumLiteral_9= 'int80' )
                    // InternalTryGrammar.g:6405:4: enumLiteral_9= 'int80'
                    {
                    enumLiteral_9=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT80EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getElementaryTypeNameEnumAccess().getINT80EnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalTryGrammar.g:6412:3: (enumLiteral_10= 'int88' )
                    {
                    // InternalTryGrammar.g:6412:3: (enumLiteral_10= 'int88' )
                    // InternalTryGrammar.g:6413:4: enumLiteral_10= 'int88'
                    {
                    enumLiteral_10=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT88EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getElementaryTypeNameEnumAccess().getINT88EnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalTryGrammar.g:6420:3: (enumLiteral_11= 'int96' )
                    {
                    // InternalTryGrammar.g:6420:3: (enumLiteral_11= 'int96' )
                    // InternalTryGrammar.g:6421:4: enumLiteral_11= 'int96'
                    {
                    enumLiteral_11=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT96EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getElementaryTypeNameEnumAccess().getINT96EnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalTryGrammar.g:6428:3: (enumLiteral_12= 'int104' )
                    {
                    // InternalTryGrammar.g:6428:3: (enumLiteral_12= 'int104' )
                    // InternalTryGrammar.g:6429:4: enumLiteral_12= 'int104'
                    {
                    enumLiteral_12=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT104EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getElementaryTypeNameEnumAccess().getINT104EnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalTryGrammar.g:6436:3: (enumLiteral_13= 'int112' )
                    {
                    // InternalTryGrammar.g:6436:3: (enumLiteral_13= 'int112' )
                    // InternalTryGrammar.g:6437:4: enumLiteral_13= 'int112'
                    {
                    enumLiteral_13=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT112EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getElementaryTypeNameEnumAccess().getINT112EnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalTryGrammar.g:6444:3: (enumLiteral_14= 'int120' )
                    {
                    // InternalTryGrammar.g:6444:3: (enumLiteral_14= 'int120' )
                    // InternalTryGrammar.g:6445:4: enumLiteral_14= 'int120'
                    {
                    enumLiteral_14=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT120EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getElementaryTypeNameEnumAccess().getINT120EnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalTryGrammar.g:6452:3: (enumLiteral_15= 'int128' )
                    {
                    // InternalTryGrammar.g:6452:3: (enumLiteral_15= 'int128' )
                    // InternalTryGrammar.g:6453:4: enumLiteral_15= 'int128'
                    {
                    enumLiteral_15=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT128EnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_15, grammarAccess.getElementaryTypeNameEnumAccess().getINT128EnumLiteralDeclaration_15());
                      			
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalTryGrammar.g:6460:3: (enumLiteral_16= 'int136' )
                    {
                    // InternalTryGrammar.g:6460:3: (enumLiteral_16= 'int136' )
                    // InternalTryGrammar.g:6461:4: enumLiteral_16= 'int136'
                    {
                    enumLiteral_16=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT136EnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_16, grammarAccess.getElementaryTypeNameEnumAccess().getINT136EnumLiteralDeclaration_16());
                      			
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalTryGrammar.g:6468:3: (enumLiteral_17= 'int144' )
                    {
                    // InternalTryGrammar.g:6468:3: (enumLiteral_17= 'int144' )
                    // InternalTryGrammar.g:6469:4: enumLiteral_17= 'int144'
                    {
                    enumLiteral_17=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT144EnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_17, grammarAccess.getElementaryTypeNameEnumAccess().getINT144EnumLiteralDeclaration_17());
                      			
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalTryGrammar.g:6476:3: (enumLiteral_18= 'int152' )
                    {
                    // InternalTryGrammar.g:6476:3: (enumLiteral_18= 'int152' )
                    // InternalTryGrammar.g:6477:4: enumLiteral_18= 'int152'
                    {
                    enumLiteral_18=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT152EnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_18, grammarAccess.getElementaryTypeNameEnumAccess().getINT152EnumLiteralDeclaration_18());
                      			
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalTryGrammar.g:6484:3: (enumLiteral_19= 'int160' )
                    {
                    // InternalTryGrammar.g:6484:3: (enumLiteral_19= 'int160' )
                    // InternalTryGrammar.g:6485:4: enumLiteral_19= 'int160'
                    {
                    enumLiteral_19=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT160EnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_19, grammarAccess.getElementaryTypeNameEnumAccess().getINT160EnumLiteralDeclaration_19());
                      			
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalTryGrammar.g:6492:3: (enumLiteral_20= 'int168' )
                    {
                    // InternalTryGrammar.g:6492:3: (enumLiteral_20= 'int168' )
                    // InternalTryGrammar.g:6493:4: enumLiteral_20= 'int168'
                    {
                    enumLiteral_20=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT168EnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_20, grammarAccess.getElementaryTypeNameEnumAccess().getINT168EnumLiteralDeclaration_20());
                      			
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalTryGrammar.g:6500:3: (enumLiteral_21= 'int178' )
                    {
                    // InternalTryGrammar.g:6500:3: (enumLiteral_21= 'int178' )
                    // InternalTryGrammar.g:6501:4: enumLiteral_21= 'int178'
                    {
                    enumLiteral_21=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT178EnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_21, grammarAccess.getElementaryTypeNameEnumAccess().getINT178EnumLiteralDeclaration_21());
                      			
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalTryGrammar.g:6508:3: (enumLiteral_22= 'int184' )
                    {
                    // InternalTryGrammar.g:6508:3: (enumLiteral_22= 'int184' )
                    // InternalTryGrammar.g:6509:4: enumLiteral_22= 'int184'
                    {
                    enumLiteral_22=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT184EnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_22, grammarAccess.getElementaryTypeNameEnumAccess().getINT184EnumLiteralDeclaration_22());
                      			
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalTryGrammar.g:6516:3: (enumLiteral_23= 'int192' )
                    {
                    // InternalTryGrammar.g:6516:3: (enumLiteral_23= 'int192' )
                    // InternalTryGrammar.g:6517:4: enumLiteral_23= 'int192'
                    {
                    enumLiteral_23=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT192EnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_23, grammarAccess.getElementaryTypeNameEnumAccess().getINT192EnumLiteralDeclaration_23());
                      			
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalTryGrammar.g:6524:3: (enumLiteral_24= 'int200' )
                    {
                    // InternalTryGrammar.g:6524:3: (enumLiteral_24= 'int200' )
                    // InternalTryGrammar.g:6525:4: enumLiteral_24= 'int200'
                    {
                    enumLiteral_24=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT200EnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_24, grammarAccess.getElementaryTypeNameEnumAccess().getINT200EnumLiteralDeclaration_24());
                      			
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalTryGrammar.g:6532:3: (enumLiteral_25= 'int208' )
                    {
                    // InternalTryGrammar.g:6532:3: (enumLiteral_25= 'int208' )
                    // InternalTryGrammar.g:6533:4: enumLiteral_25= 'int208'
                    {
                    enumLiteral_25=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT208EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_25, grammarAccess.getElementaryTypeNameEnumAccess().getINT208EnumLiteralDeclaration_25());
                      			
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalTryGrammar.g:6540:3: (enumLiteral_26= 'int216' )
                    {
                    // InternalTryGrammar.g:6540:3: (enumLiteral_26= 'int216' )
                    // InternalTryGrammar.g:6541:4: enumLiteral_26= 'int216'
                    {
                    enumLiteral_26=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT216EnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_26, grammarAccess.getElementaryTypeNameEnumAccess().getINT216EnumLiteralDeclaration_26());
                      			
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalTryGrammar.g:6548:3: (enumLiteral_27= 'int224' )
                    {
                    // InternalTryGrammar.g:6548:3: (enumLiteral_27= 'int224' )
                    // InternalTryGrammar.g:6549:4: enumLiteral_27= 'int224'
                    {
                    enumLiteral_27=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT224EnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_27, grammarAccess.getElementaryTypeNameEnumAccess().getINT224EnumLiteralDeclaration_27());
                      			
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalTryGrammar.g:6556:3: (enumLiteral_28= 'int232' )
                    {
                    // InternalTryGrammar.g:6556:3: (enumLiteral_28= 'int232' )
                    // InternalTryGrammar.g:6557:4: enumLiteral_28= 'int232'
                    {
                    enumLiteral_28=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT232EnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_28, grammarAccess.getElementaryTypeNameEnumAccess().getINT232EnumLiteralDeclaration_28());
                      			
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalTryGrammar.g:6564:3: (enumLiteral_29= 'int240' )
                    {
                    // InternalTryGrammar.g:6564:3: (enumLiteral_29= 'int240' )
                    // InternalTryGrammar.g:6565:4: enumLiteral_29= 'int240'
                    {
                    enumLiteral_29=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT240EnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_29, grammarAccess.getElementaryTypeNameEnumAccess().getINT240EnumLiteralDeclaration_29());
                      			
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalTryGrammar.g:6572:3: (enumLiteral_30= 'int248' )
                    {
                    // InternalTryGrammar.g:6572:3: (enumLiteral_30= 'int248' )
                    // InternalTryGrammar.g:6573:4: enumLiteral_30= 'int248'
                    {
                    enumLiteral_30=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT248EnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_30, grammarAccess.getElementaryTypeNameEnumAccess().getINT248EnumLiteralDeclaration_30());
                      			
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalTryGrammar.g:6580:3: (enumLiteral_31= 'int256' )
                    {
                    // InternalTryGrammar.g:6580:3: (enumLiteral_31= 'int256' )
                    // InternalTryGrammar.g:6581:4: enumLiteral_31= 'int256'
                    {
                    enumLiteral_31=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getINT256EnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_31, grammarAccess.getElementaryTypeNameEnumAccess().getINT256EnumLiteralDeclaration_31());
                      			
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalTryGrammar.g:6588:3: (enumLiteral_32= 'uint' )
                    {
                    // InternalTryGrammar.g:6588:3: (enumLiteral_32= 'uint' )
                    // InternalTryGrammar.g:6589:4: enumLiteral_32= 'uint'
                    {
                    enumLiteral_32=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINTEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_32, grammarAccess.getElementaryTypeNameEnumAccess().getUINTEnumLiteralDeclaration_32());
                      			
                    }

                    }


                    }
                    break;
                case 34 :
                    // InternalTryGrammar.g:6596:3: (enumLiteral_33= 'uint8' )
                    {
                    // InternalTryGrammar.g:6596:3: (enumLiteral_33= 'uint8' )
                    // InternalTryGrammar.g:6597:4: enumLiteral_33= 'uint8'
                    {
                    enumLiteral_33=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT8EnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_33, grammarAccess.getElementaryTypeNameEnumAccess().getUINT8EnumLiteralDeclaration_33());
                      			
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalTryGrammar.g:6604:3: (enumLiteral_34= 'uint16' )
                    {
                    // InternalTryGrammar.g:6604:3: (enumLiteral_34= 'uint16' )
                    // InternalTryGrammar.g:6605:4: enumLiteral_34= 'uint16'
                    {
                    enumLiteral_34=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT16EnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_34, grammarAccess.getElementaryTypeNameEnumAccess().getUINT16EnumLiteralDeclaration_34());
                      			
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalTryGrammar.g:6612:3: (enumLiteral_35= 'uint24' )
                    {
                    // InternalTryGrammar.g:6612:3: (enumLiteral_35= 'uint24' )
                    // InternalTryGrammar.g:6613:4: enumLiteral_35= 'uint24'
                    {
                    enumLiteral_35=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUNIT24EnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_35, grammarAccess.getElementaryTypeNameEnumAccess().getUNIT24EnumLiteralDeclaration_35());
                      			
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalTryGrammar.g:6620:3: (enumLiteral_36= 'uint32' )
                    {
                    // InternalTryGrammar.g:6620:3: (enumLiteral_36= 'uint32' )
                    // InternalTryGrammar.g:6621:4: enumLiteral_36= 'uint32'
                    {
                    enumLiteral_36=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT32EnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_36, grammarAccess.getElementaryTypeNameEnumAccess().getUINT32EnumLiteralDeclaration_36());
                      			
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalTryGrammar.g:6628:3: (enumLiteral_37= 'uint40' )
                    {
                    // InternalTryGrammar.g:6628:3: (enumLiteral_37= 'uint40' )
                    // InternalTryGrammar.g:6629:4: enumLiteral_37= 'uint40'
                    {
                    enumLiteral_37=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT40EnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_37, grammarAccess.getElementaryTypeNameEnumAccess().getUINT40EnumLiteralDeclaration_37());
                      			
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalTryGrammar.g:6636:3: (enumLiteral_38= 'uint48' )
                    {
                    // InternalTryGrammar.g:6636:3: (enumLiteral_38= 'uint48' )
                    // InternalTryGrammar.g:6637:4: enumLiteral_38= 'uint48'
                    {
                    enumLiteral_38=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT48EnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_38, grammarAccess.getElementaryTypeNameEnumAccess().getUINT48EnumLiteralDeclaration_38());
                      			
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalTryGrammar.g:6644:3: (enumLiteral_39= 'uint56' )
                    {
                    // InternalTryGrammar.g:6644:3: (enumLiteral_39= 'uint56' )
                    // InternalTryGrammar.g:6645:4: enumLiteral_39= 'uint56'
                    {
                    enumLiteral_39=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUNIT56EnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_39, grammarAccess.getElementaryTypeNameEnumAccess().getUNIT56EnumLiteralDeclaration_39());
                      			
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalTryGrammar.g:6652:3: (enumLiteral_40= 'uint64' )
                    {
                    // InternalTryGrammar.g:6652:3: (enumLiteral_40= 'uint64' )
                    // InternalTryGrammar.g:6653:4: enumLiteral_40= 'uint64'
                    {
                    enumLiteral_40=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT64EnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_40, grammarAccess.getElementaryTypeNameEnumAccess().getUINT64EnumLiteralDeclaration_40());
                      			
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalTryGrammar.g:6660:3: (enumLiteral_41= 'uint72' )
                    {
                    // InternalTryGrammar.g:6660:3: (enumLiteral_41= 'uint72' )
                    // InternalTryGrammar.g:6661:4: enumLiteral_41= 'uint72'
                    {
                    enumLiteral_41=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT72EnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_41, grammarAccess.getElementaryTypeNameEnumAccess().getUINT72EnumLiteralDeclaration_41());
                      			
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalTryGrammar.g:6668:3: (enumLiteral_42= 'uint80' )
                    {
                    // InternalTryGrammar.g:6668:3: (enumLiteral_42= 'uint80' )
                    // InternalTryGrammar.g:6669:4: enumLiteral_42= 'uint80'
                    {
                    enumLiteral_42=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT80EnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_42, grammarAccess.getElementaryTypeNameEnumAccess().getUINT80EnumLiteralDeclaration_42());
                      			
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalTryGrammar.g:6676:3: (enumLiteral_43= 'uint88' )
                    {
                    // InternalTryGrammar.g:6676:3: (enumLiteral_43= 'uint88' )
                    // InternalTryGrammar.g:6677:4: enumLiteral_43= 'uint88'
                    {
                    enumLiteral_43=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT88EnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_43, grammarAccess.getElementaryTypeNameEnumAccess().getUINT88EnumLiteralDeclaration_43());
                      			
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalTryGrammar.g:6684:3: (enumLiteral_44= 'uint96' )
                    {
                    // InternalTryGrammar.g:6684:3: (enumLiteral_44= 'uint96' )
                    // InternalTryGrammar.g:6685:4: enumLiteral_44= 'uint96'
                    {
                    enumLiteral_44=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT96EnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_44, grammarAccess.getElementaryTypeNameEnumAccess().getUINT96EnumLiteralDeclaration_44());
                      			
                    }

                    }


                    }
                    break;
                case 46 :
                    // InternalTryGrammar.g:6692:3: (enumLiteral_45= 'uint104' )
                    {
                    // InternalTryGrammar.g:6692:3: (enumLiteral_45= 'uint104' )
                    // InternalTryGrammar.g:6693:4: enumLiteral_45= 'uint104'
                    {
                    enumLiteral_45=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT104EnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_45, grammarAccess.getElementaryTypeNameEnumAccess().getUINT104EnumLiteralDeclaration_45());
                      			
                    }

                    }


                    }
                    break;
                case 47 :
                    // InternalTryGrammar.g:6700:3: (enumLiteral_46= 'uint112' )
                    {
                    // InternalTryGrammar.g:6700:3: (enumLiteral_46= 'uint112' )
                    // InternalTryGrammar.g:6701:4: enumLiteral_46= 'uint112'
                    {
                    enumLiteral_46=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT112EnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_46, grammarAccess.getElementaryTypeNameEnumAccess().getUINT112EnumLiteralDeclaration_46());
                      			
                    }

                    }


                    }
                    break;
                case 48 :
                    // InternalTryGrammar.g:6708:3: (enumLiteral_47= 'uint120' )
                    {
                    // InternalTryGrammar.g:6708:3: (enumLiteral_47= 'uint120' )
                    // InternalTryGrammar.g:6709:4: enumLiteral_47= 'uint120'
                    {
                    enumLiteral_47=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT120EnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_47, grammarAccess.getElementaryTypeNameEnumAccess().getUINT120EnumLiteralDeclaration_47());
                      			
                    }

                    }


                    }
                    break;
                case 49 :
                    // InternalTryGrammar.g:6716:3: (enumLiteral_48= 'uint128' )
                    {
                    // InternalTryGrammar.g:6716:3: (enumLiteral_48= 'uint128' )
                    // InternalTryGrammar.g:6717:4: enumLiteral_48= 'uint128'
                    {
                    enumLiteral_48=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT128EnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_48, grammarAccess.getElementaryTypeNameEnumAccess().getUINT128EnumLiteralDeclaration_48());
                      			
                    }

                    }


                    }
                    break;
                case 50 :
                    // InternalTryGrammar.g:6724:3: (enumLiteral_49= 'uint136' )
                    {
                    // InternalTryGrammar.g:6724:3: (enumLiteral_49= 'uint136' )
                    // InternalTryGrammar.g:6725:4: enumLiteral_49= 'uint136'
                    {
                    enumLiteral_49=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT136EnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_49, grammarAccess.getElementaryTypeNameEnumAccess().getUINT136EnumLiteralDeclaration_49());
                      			
                    }

                    }


                    }
                    break;
                case 51 :
                    // InternalTryGrammar.g:6732:3: (enumLiteral_50= 'uint144' )
                    {
                    // InternalTryGrammar.g:6732:3: (enumLiteral_50= 'uint144' )
                    // InternalTryGrammar.g:6733:4: enumLiteral_50= 'uint144'
                    {
                    enumLiteral_50=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT144EnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_50, grammarAccess.getElementaryTypeNameEnumAccess().getUINT144EnumLiteralDeclaration_50());
                      			
                    }

                    }


                    }
                    break;
                case 52 :
                    // InternalTryGrammar.g:6740:3: (enumLiteral_51= 'uint152' )
                    {
                    // InternalTryGrammar.g:6740:3: (enumLiteral_51= 'uint152' )
                    // InternalTryGrammar.g:6741:4: enumLiteral_51= 'uint152'
                    {
                    enumLiteral_51=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT152EnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_51, grammarAccess.getElementaryTypeNameEnumAccess().getUINT152EnumLiteralDeclaration_51());
                      			
                    }

                    }


                    }
                    break;
                case 53 :
                    // InternalTryGrammar.g:6748:3: (enumLiteral_52= 'uint160' )
                    {
                    // InternalTryGrammar.g:6748:3: (enumLiteral_52= 'uint160' )
                    // InternalTryGrammar.g:6749:4: enumLiteral_52= 'uint160'
                    {
                    enumLiteral_52=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT160EnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_52, grammarAccess.getElementaryTypeNameEnumAccess().getUINT160EnumLiteralDeclaration_52());
                      			
                    }

                    }


                    }
                    break;
                case 54 :
                    // InternalTryGrammar.g:6756:3: (enumLiteral_53= 'uint168' )
                    {
                    // InternalTryGrammar.g:6756:3: (enumLiteral_53= 'uint168' )
                    // InternalTryGrammar.g:6757:4: enumLiteral_53= 'uint168'
                    {
                    enumLiteral_53=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT168EnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_53, grammarAccess.getElementaryTypeNameEnumAccess().getUINT168EnumLiteralDeclaration_53());
                      			
                    }

                    }


                    }
                    break;
                case 55 :
                    // InternalTryGrammar.g:6764:3: (enumLiteral_54= 'uint178' )
                    {
                    // InternalTryGrammar.g:6764:3: (enumLiteral_54= 'uint178' )
                    // InternalTryGrammar.g:6765:4: enumLiteral_54= 'uint178'
                    {
                    enumLiteral_54=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT178EnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_54, grammarAccess.getElementaryTypeNameEnumAccess().getUINT178EnumLiteralDeclaration_54());
                      			
                    }

                    }


                    }
                    break;
                case 56 :
                    // InternalTryGrammar.g:6772:3: (enumLiteral_55= 'uint184' )
                    {
                    // InternalTryGrammar.g:6772:3: (enumLiteral_55= 'uint184' )
                    // InternalTryGrammar.g:6773:4: enumLiteral_55= 'uint184'
                    {
                    enumLiteral_55=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT184EnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_55, grammarAccess.getElementaryTypeNameEnumAccess().getUINT184EnumLiteralDeclaration_55());
                      			
                    }

                    }


                    }
                    break;
                case 57 :
                    // InternalTryGrammar.g:6780:3: (enumLiteral_56= 'uint192' )
                    {
                    // InternalTryGrammar.g:6780:3: (enumLiteral_56= 'uint192' )
                    // InternalTryGrammar.g:6781:4: enumLiteral_56= 'uint192'
                    {
                    enumLiteral_56=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT192EnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_56, grammarAccess.getElementaryTypeNameEnumAccess().getUINT192EnumLiteralDeclaration_56());
                      			
                    }

                    }


                    }
                    break;
                case 58 :
                    // InternalTryGrammar.g:6788:3: (enumLiteral_57= 'uint200' )
                    {
                    // InternalTryGrammar.g:6788:3: (enumLiteral_57= 'uint200' )
                    // InternalTryGrammar.g:6789:4: enumLiteral_57= 'uint200'
                    {
                    enumLiteral_57=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT200EnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_57, grammarAccess.getElementaryTypeNameEnumAccess().getUINT200EnumLiteralDeclaration_57());
                      			
                    }

                    }


                    }
                    break;
                case 59 :
                    // InternalTryGrammar.g:6796:3: (enumLiteral_58= 'uint208' )
                    {
                    // InternalTryGrammar.g:6796:3: (enumLiteral_58= 'uint208' )
                    // InternalTryGrammar.g:6797:4: enumLiteral_58= 'uint208'
                    {
                    enumLiteral_58=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT208EnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_58, grammarAccess.getElementaryTypeNameEnumAccess().getUINT208EnumLiteralDeclaration_58());
                      			
                    }

                    }


                    }
                    break;
                case 60 :
                    // InternalTryGrammar.g:6804:3: (enumLiteral_59= 'uint216' )
                    {
                    // InternalTryGrammar.g:6804:3: (enumLiteral_59= 'uint216' )
                    // InternalTryGrammar.g:6805:4: enumLiteral_59= 'uint216'
                    {
                    enumLiteral_59=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT216EnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_59, grammarAccess.getElementaryTypeNameEnumAccess().getUINT216EnumLiteralDeclaration_59());
                      			
                    }

                    }


                    }
                    break;
                case 61 :
                    // InternalTryGrammar.g:6812:3: (enumLiteral_60= 'uint224' )
                    {
                    // InternalTryGrammar.g:6812:3: (enumLiteral_60= 'uint224' )
                    // InternalTryGrammar.g:6813:4: enumLiteral_60= 'uint224'
                    {
                    enumLiteral_60=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT244EnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_60, grammarAccess.getElementaryTypeNameEnumAccess().getUINT244EnumLiteralDeclaration_60());
                      			
                    }

                    }


                    }
                    break;
                case 62 :
                    // InternalTryGrammar.g:6820:3: (enumLiteral_61= 'uint232' )
                    {
                    // InternalTryGrammar.g:6820:3: (enumLiteral_61= 'uint232' )
                    // InternalTryGrammar.g:6821:4: enumLiteral_61= 'uint232'
                    {
                    enumLiteral_61=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT232EnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_61, grammarAccess.getElementaryTypeNameEnumAccess().getUINT232EnumLiteralDeclaration_61());
                      			
                    }

                    }


                    }
                    break;
                case 63 :
                    // InternalTryGrammar.g:6828:3: (enumLiteral_62= 'uint240' )
                    {
                    // InternalTryGrammar.g:6828:3: (enumLiteral_62= 'uint240' )
                    // InternalTryGrammar.g:6829:4: enumLiteral_62= 'uint240'
                    {
                    enumLiteral_62=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT240EnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_62, grammarAccess.getElementaryTypeNameEnumAccess().getUINT240EnumLiteralDeclaration_62());
                      			
                    }

                    }


                    }
                    break;
                case 64 :
                    // InternalTryGrammar.g:6836:3: (enumLiteral_63= 'uint248' )
                    {
                    // InternalTryGrammar.g:6836:3: (enumLiteral_63= 'uint248' )
                    // InternalTryGrammar.g:6837:4: enumLiteral_63= 'uint248'
                    {
                    enumLiteral_63=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT248EnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_63, grammarAccess.getElementaryTypeNameEnumAccess().getUINT248EnumLiteralDeclaration_63());
                      			
                    }

                    }


                    }
                    break;
                case 65 :
                    // InternalTryGrammar.g:6844:3: (enumLiteral_64= 'uint256' )
                    {
                    // InternalTryGrammar.g:6844:3: (enumLiteral_64= 'uint256' )
                    // InternalTryGrammar.g:6845:4: enumLiteral_64= 'uint256'
                    {
                    enumLiteral_64=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getUINT256EnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_64, grammarAccess.getElementaryTypeNameEnumAccess().getUINT256EnumLiteralDeclaration_64());
                      			
                    }

                    }


                    }
                    break;
                case 66 :
                    // InternalTryGrammar.g:6852:3: (enumLiteral_65= 'byte' )
                    {
                    // InternalTryGrammar.g:6852:3: (enumLiteral_65= 'byte' )
                    // InternalTryGrammar.g:6853:4: enumLiteral_65= 'byte'
                    {
                    enumLiteral_65=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTEEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_65, grammarAccess.getElementaryTypeNameEnumAccess().getBYTEEnumLiteralDeclaration_65());
                      			
                    }

                    }


                    }
                    break;
                case 67 :
                    // InternalTryGrammar.g:6860:3: (enumLiteral_66= 'bytes' )
                    {
                    // InternalTryGrammar.g:6860:3: (enumLiteral_66= 'bytes' )
                    // InternalTryGrammar.g:6861:4: enumLiteral_66= 'bytes'
                    {
                    enumLiteral_66=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTESEnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_66, grammarAccess.getElementaryTypeNameEnumAccess().getBYTESEnumLiteralDeclaration_66());
                      			
                    }

                    }


                    }
                    break;
                case 68 :
                    // InternalTryGrammar.g:6868:3: (enumLiteral_67= 'bytes1' )
                    {
                    // InternalTryGrammar.g:6868:3: (enumLiteral_67= 'bytes1' )
                    // InternalTryGrammar.g:6869:4: enumLiteral_67= 'bytes1'
                    {
                    enumLiteral_67=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES1EnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_67, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES1EnumLiteralDeclaration_67());
                      			
                    }

                    }


                    }
                    break;
                case 69 :
                    // InternalTryGrammar.g:6876:3: (enumLiteral_68= 'bytes2' )
                    {
                    // InternalTryGrammar.g:6876:3: (enumLiteral_68= 'bytes2' )
                    // InternalTryGrammar.g:6877:4: enumLiteral_68= 'bytes2'
                    {
                    enumLiteral_68=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES2EnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_68, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES2EnumLiteralDeclaration_68());
                      			
                    }

                    }


                    }
                    break;
                case 70 :
                    // InternalTryGrammar.g:6884:3: (enumLiteral_69= 'bytes3' )
                    {
                    // InternalTryGrammar.g:6884:3: (enumLiteral_69= 'bytes3' )
                    // InternalTryGrammar.g:6885:4: enumLiteral_69= 'bytes3'
                    {
                    enumLiteral_69=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES3EnumLiteralDeclaration_69().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_69, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES3EnumLiteralDeclaration_69());
                      			
                    }

                    }


                    }
                    break;
                case 71 :
                    // InternalTryGrammar.g:6892:3: (enumLiteral_70= 'bytes4' )
                    {
                    // InternalTryGrammar.g:6892:3: (enumLiteral_70= 'bytes4' )
                    // InternalTryGrammar.g:6893:4: enumLiteral_70= 'bytes4'
                    {
                    enumLiteral_70=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES4EnumLiteralDeclaration_70().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_70, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES4EnumLiteralDeclaration_70());
                      			
                    }

                    }


                    }
                    break;
                case 72 :
                    // InternalTryGrammar.g:6900:3: (enumLiteral_71= 'bytes5' )
                    {
                    // InternalTryGrammar.g:6900:3: (enumLiteral_71= 'bytes5' )
                    // InternalTryGrammar.g:6901:4: enumLiteral_71= 'bytes5'
                    {
                    enumLiteral_71=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES5EnumLiteralDeclaration_71().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_71, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES5EnumLiteralDeclaration_71());
                      			
                    }

                    }


                    }
                    break;
                case 73 :
                    // InternalTryGrammar.g:6908:3: (enumLiteral_72= 'bytes6' )
                    {
                    // InternalTryGrammar.g:6908:3: (enumLiteral_72= 'bytes6' )
                    // InternalTryGrammar.g:6909:4: enumLiteral_72= 'bytes6'
                    {
                    enumLiteral_72=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES6EnumLiteralDeclaration_72().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_72, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES6EnumLiteralDeclaration_72());
                      			
                    }

                    }


                    }
                    break;
                case 74 :
                    // InternalTryGrammar.g:6916:3: (enumLiteral_73= 'bytes7' )
                    {
                    // InternalTryGrammar.g:6916:3: (enumLiteral_73= 'bytes7' )
                    // InternalTryGrammar.g:6917:4: enumLiteral_73= 'bytes7'
                    {
                    enumLiteral_73=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES7EnumLiteralDeclaration_73().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_73, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES7EnumLiteralDeclaration_73());
                      			
                    }

                    }


                    }
                    break;
                case 75 :
                    // InternalTryGrammar.g:6924:3: (enumLiteral_74= 'bytes8' )
                    {
                    // InternalTryGrammar.g:6924:3: (enumLiteral_74= 'bytes8' )
                    // InternalTryGrammar.g:6925:4: enumLiteral_74= 'bytes8'
                    {
                    enumLiteral_74=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES8EnumLiteralDeclaration_74().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_74, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES8EnumLiteralDeclaration_74());
                      			
                    }

                    }


                    }
                    break;
                case 76 :
                    // InternalTryGrammar.g:6932:3: (enumLiteral_75= 'bytes9' )
                    {
                    // InternalTryGrammar.g:6932:3: (enumLiteral_75= 'bytes9' )
                    // InternalTryGrammar.g:6933:4: enumLiteral_75= 'bytes9'
                    {
                    enumLiteral_75=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES9EnumLiteralDeclaration_75().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_75, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES9EnumLiteralDeclaration_75());
                      			
                    }

                    }


                    }
                    break;
                case 77 :
                    // InternalTryGrammar.g:6940:3: (enumLiteral_76= 'bytes10' )
                    {
                    // InternalTryGrammar.g:6940:3: (enumLiteral_76= 'bytes10' )
                    // InternalTryGrammar.g:6941:4: enumLiteral_76= 'bytes10'
                    {
                    enumLiteral_76=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES10EnumLiteralDeclaration_76().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_76, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES10EnumLiteralDeclaration_76());
                      			
                    }

                    }


                    }
                    break;
                case 78 :
                    // InternalTryGrammar.g:6948:3: (enumLiteral_77= 'bytes11' )
                    {
                    // InternalTryGrammar.g:6948:3: (enumLiteral_77= 'bytes11' )
                    // InternalTryGrammar.g:6949:4: enumLiteral_77= 'bytes11'
                    {
                    enumLiteral_77=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES11EnumLiteralDeclaration_77().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_77, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES11EnumLiteralDeclaration_77());
                      			
                    }

                    }


                    }
                    break;
                case 79 :
                    // InternalTryGrammar.g:6956:3: (enumLiteral_78= 'bytes12' )
                    {
                    // InternalTryGrammar.g:6956:3: (enumLiteral_78= 'bytes12' )
                    // InternalTryGrammar.g:6957:4: enumLiteral_78= 'bytes12'
                    {
                    enumLiteral_78=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES12EnumLiteralDeclaration_78().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_78, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES12EnumLiteralDeclaration_78());
                      			
                    }

                    }


                    }
                    break;
                case 80 :
                    // InternalTryGrammar.g:6964:3: (enumLiteral_79= 'bytes13' )
                    {
                    // InternalTryGrammar.g:6964:3: (enumLiteral_79= 'bytes13' )
                    // InternalTryGrammar.g:6965:4: enumLiteral_79= 'bytes13'
                    {
                    enumLiteral_79=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES13EnumLiteralDeclaration_79().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_79, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES13EnumLiteralDeclaration_79());
                      			
                    }

                    }


                    }
                    break;
                case 81 :
                    // InternalTryGrammar.g:6972:3: (enumLiteral_80= 'bytes14' )
                    {
                    // InternalTryGrammar.g:6972:3: (enumLiteral_80= 'bytes14' )
                    // InternalTryGrammar.g:6973:4: enumLiteral_80= 'bytes14'
                    {
                    enumLiteral_80=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES14EnumLiteralDeclaration_80().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_80, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES14EnumLiteralDeclaration_80());
                      			
                    }

                    }


                    }
                    break;
                case 82 :
                    // InternalTryGrammar.g:6980:3: (enumLiteral_81= 'bytes15' )
                    {
                    // InternalTryGrammar.g:6980:3: (enumLiteral_81= 'bytes15' )
                    // InternalTryGrammar.g:6981:4: enumLiteral_81= 'bytes15'
                    {
                    enumLiteral_81=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES15EnumLiteralDeclaration_81().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_81, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES15EnumLiteralDeclaration_81());
                      			
                    }

                    }


                    }
                    break;
                case 83 :
                    // InternalTryGrammar.g:6988:3: (enumLiteral_82= 'bytes16' )
                    {
                    // InternalTryGrammar.g:6988:3: (enumLiteral_82= 'bytes16' )
                    // InternalTryGrammar.g:6989:4: enumLiteral_82= 'bytes16'
                    {
                    enumLiteral_82=(Token)match(input,145,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES16EnumLiteralDeclaration_82().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_82, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES16EnumLiteralDeclaration_82());
                      			
                    }

                    }


                    }
                    break;
                case 84 :
                    // InternalTryGrammar.g:6996:3: (enumLiteral_83= 'bytes17' )
                    {
                    // InternalTryGrammar.g:6996:3: (enumLiteral_83= 'bytes17' )
                    // InternalTryGrammar.g:6997:4: enumLiteral_83= 'bytes17'
                    {
                    enumLiteral_83=(Token)match(input,146,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES17EnumLiteralDeclaration_83().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_83, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES17EnumLiteralDeclaration_83());
                      			
                    }

                    }


                    }
                    break;
                case 85 :
                    // InternalTryGrammar.g:7004:3: (enumLiteral_84= 'bytes18' )
                    {
                    // InternalTryGrammar.g:7004:3: (enumLiteral_84= 'bytes18' )
                    // InternalTryGrammar.g:7005:4: enumLiteral_84= 'bytes18'
                    {
                    enumLiteral_84=(Token)match(input,147,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES18EnumLiteralDeclaration_84().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_84, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES18EnumLiteralDeclaration_84());
                      			
                    }

                    }


                    }
                    break;
                case 86 :
                    // InternalTryGrammar.g:7012:3: (enumLiteral_85= 'bytes19' )
                    {
                    // InternalTryGrammar.g:7012:3: (enumLiteral_85= 'bytes19' )
                    // InternalTryGrammar.g:7013:4: enumLiteral_85= 'bytes19'
                    {
                    enumLiteral_85=(Token)match(input,148,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES19EnumLiteralDeclaration_85().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_85, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES19EnumLiteralDeclaration_85());
                      			
                    }

                    }


                    }
                    break;
                case 87 :
                    // InternalTryGrammar.g:7020:3: (enumLiteral_86= 'bytes20' )
                    {
                    // InternalTryGrammar.g:7020:3: (enumLiteral_86= 'bytes20' )
                    // InternalTryGrammar.g:7021:4: enumLiteral_86= 'bytes20'
                    {
                    enumLiteral_86=(Token)match(input,149,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES20EnumLiteralDeclaration_86().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_86, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES20EnumLiteralDeclaration_86());
                      			
                    }

                    }


                    }
                    break;
                case 88 :
                    // InternalTryGrammar.g:7028:3: (enumLiteral_87= 'bytes21' )
                    {
                    // InternalTryGrammar.g:7028:3: (enumLiteral_87= 'bytes21' )
                    // InternalTryGrammar.g:7029:4: enumLiteral_87= 'bytes21'
                    {
                    enumLiteral_87=(Token)match(input,150,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES21EnumLiteralDeclaration_87().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_87, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES21EnumLiteralDeclaration_87());
                      			
                    }

                    }


                    }
                    break;
                case 89 :
                    // InternalTryGrammar.g:7036:3: (enumLiteral_88= 'bytes22' )
                    {
                    // InternalTryGrammar.g:7036:3: (enumLiteral_88= 'bytes22' )
                    // InternalTryGrammar.g:7037:4: enumLiteral_88= 'bytes22'
                    {
                    enumLiteral_88=(Token)match(input,151,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES22EnumLiteralDeclaration_88().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_88, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES22EnumLiteralDeclaration_88());
                      			
                    }

                    }


                    }
                    break;
                case 90 :
                    // InternalTryGrammar.g:7044:3: (enumLiteral_89= 'bytes23' )
                    {
                    // InternalTryGrammar.g:7044:3: (enumLiteral_89= 'bytes23' )
                    // InternalTryGrammar.g:7045:4: enumLiteral_89= 'bytes23'
                    {
                    enumLiteral_89=(Token)match(input,152,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES23EnumLiteralDeclaration_89().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_89, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES23EnumLiteralDeclaration_89());
                      			
                    }

                    }


                    }
                    break;
                case 91 :
                    // InternalTryGrammar.g:7052:3: (enumLiteral_90= 'bytes24' )
                    {
                    // InternalTryGrammar.g:7052:3: (enumLiteral_90= 'bytes24' )
                    // InternalTryGrammar.g:7053:4: enumLiteral_90= 'bytes24'
                    {
                    enumLiteral_90=(Token)match(input,153,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES24EnumLiteralDeclaration_90().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_90, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES24EnumLiteralDeclaration_90());
                      			
                    }

                    }


                    }
                    break;
                case 92 :
                    // InternalTryGrammar.g:7060:3: (enumLiteral_91= 'bytes25' )
                    {
                    // InternalTryGrammar.g:7060:3: (enumLiteral_91= 'bytes25' )
                    // InternalTryGrammar.g:7061:4: enumLiteral_91= 'bytes25'
                    {
                    enumLiteral_91=(Token)match(input,154,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES25EnumLiteralDeclaration_91().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_91, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES25EnumLiteralDeclaration_91());
                      			
                    }

                    }


                    }
                    break;
                case 93 :
                    // InternalTryGrammar.g:7068:3: (enumLiteral_92= 'bytes26' )
                    {
                    // InternalTryGrammar.g:7068:3: (enumLiteral_92= 'bytes26' )
                    // InternalTryGrammar.g:7069:4: enumLiteral_92= 'bytes26'
                    {
                    enumLiteral_92=(Token)match(input,155,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES26EnumLiteralDeclaration_92().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_92, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES26EnumLiteralDeclaration_92());
                      			
                    }

                    }


                    }
                    break;
                case 94 :
                    // InternalTryGrammar.g:7076:3: (enumLiteral_93= 'bytes27' )
                    {
                    // InternalTryGrammar.g:7076:3: (enumLiteral_93= 'bytes27' )
                    // InternalTryGrammar.g:7077:4: enumLiteral_93= 'bytes27'
                    {
                    enumLiteral_93=(Token)match(input,156,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES27EnumLiteralDeclaration_93().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_93, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES27EnumLiteralDeclaration_93());
                      			
                    }

                    }


                    }
                    break;
                case 95 :
                    // InternalTryGrammar.g:7084:3: (enumLiteral_94= 'bytes28' )
                    {
                    // InternalTryGrammar.g:7084:3: (enumLiteral_94= 'bytes28' )
                    // InternalTryGrammar.g:7085:4: enumLiteral_94= 'bytes28'
                    {
                    enumLiteral_94=(Token)match(input,157,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES28EnumLiteralDeclaration_94().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_94, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES28EnumLiteralDeclaration_94());
                      			
                    }

                    }


                    }
                    break;
                case 96 :
                    // InternalTryGrammar.g:7092:3: (enumLiteral_95= 'bytes29' )
                    {
                    // InternalTryGrammar.g:7092:3: (enumLiteral_95= 'bytes29' )
                    // InternalTryGrammar.g:7093:4: enumLiteral_95= 'bytes29'
                    {
                    enumLiteral_95=(Token)match(input,158,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES29EnumLiteralDeclaration_95().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_95, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES29EnumLiteralDeclaration_95());
                      			
                    }

                    }


                    }
                    break;
                case 97 :
                    // InternalTryGrammar.g:7100:3: (enumLiteral_96= 'bytes30' )
                    {
                    // InternalTryGrammar.g:7100:3: (enumLiteral_96= 'bytes30' )
                    // InternalTryGrammar.g:7101:4: enumLiteral_96= 'bytes30'
                    {
                    enumLiteral_96=(Token)match(input,159,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES30EnumLiteralDeclaration_96().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_96, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES30EnumLiteralDeclaration_96());
                      			
                    }

                    }


                    }
                    break;
                case 98 :
                    // InternalTryGrammar.g:7108:3: (enumLiteral_97= 'bytes31' )
                    {
                    // InternalTryGrammar.g:7108:3: (enumLiteral_97= 'bytes31' )
                    // InternalTryGrammar.g:7109:4: enumLiteral_97= 'bytes31'
                    {
                    enumLiteral_97=(Token)match(input,160,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES31EnumLiteralDeclaration_97().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_97, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES31EnumLiteralDeclaration_97());
                      			
                    }

                    }


                    }
                    break;
                case 99 :
                    // InternalTryGrammar.g:7116:3: (enumLiteral_98= 'bytes32' )
                    {
                    // InternalTryGrammar.g:7116:3: (enumLiteral_98= 'bytes32' )
                    // InternalTryGrammar.g:7117:4: enumLiteral_98= 'bytes32'
                    {
                    enumLiteral_98=(Token)match(input,161,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBYTES32EnumLiteralDeclaration_98().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_98, grammarAccess.getElementaryTypeNameEnumAccess().getBYTES32EnumLiteralDeclaration_98());
                      			
                    }

                    }


                    }
                    break;
                case 100 :
                    // InternalTryGrammar.g:7124:3: (enumLiteral_99= 'string' )
                    {
                    // InternalTryGrammar.g:7124:3: (enumLiteral_99= 'string' )
                    // InternalTryGrammar.g:7125:4: enumLiteral_99= 'string'
                    {
                    enumLiteral_99=(Token)match(input,162,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getSTRINGEnumLiteralDeclaration_99().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_99, grammarAccess.getElementaryTypeNameEnumAccess().getSTRINGEnumLiteralDeclaration_99());
                      			
                    }

                    }


                    }
                    break;
                case 101 :
                    // InternalTryGrammar.g:7132:3: (enumLiteral_100= 'address' )
                    {
                    // InternalTryGrammar.g:7132:3: (enumLiteral_100= 'address' )
                    // InternalTryGrammar.g:7133:4: enumLiteral_100= 'address'
                    {
                    enumLiteral_100=(Token)match(input,163,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getADDRESSEnumLiteralDeclaration_100().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_100, grammarAccess.getElementaryTypeNameEnumAccess().getADDRESSEnumLiteralDeclaration_100());
                      			
                    }

                    }


                    }
                    break;
                case 102 :
                    // InternalTryGrammar.g:7140:3: (enumLiteral_101= 'bool' )
                    {
                    // InternalTryGrammar.g:7140:3: (enumLiteral_101= 'bool' )
                    // InternalTryGrammar.g:7141:4: enumLiteral_101= 'bool'
                    {
                    enumLiteral_101=(Token)match(input,164,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getBOOLEnumLiteralDeclaration_101().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_101, grammarAccess.getElementaryTypeNameEnumAccess().getBOOLEnumLiteralDeclaration_101());
                      			
                    }

                    }


                    }
                    break;
                case 103 :
                    // InternalTryGrammar.g:7148:3: (enumLiteral_102= 'real' )
                    {
                    // InternalTryGrammar.g:7148:3: (enumLiteral_102= 'real' )
                    // InternalTryGrammar.g:7149:4: enumLiteral_102= 'real'
                    {
                    enumLiteral_102=(Token)match(input,165,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementaryTypeNameEnumAccess().getREALEnumLiteralDeclaration_102().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_102, grammarAccess.getElementaryTypeNameEnumAccess().getREALEnumLiteralDeclaration_102());
                      			
                    }

                    }


                    }
                    break;
                case 104 :
                    // InternalTryGrammar.g:7156:3: (enumLiteral_103= 'ureal' )
                    {
                    // InternalTryGrammar.g:7156:3: (enumLiteral_103= 'ureal' )
                    // InternalTryGrammar.g:7157:4: enumLiteral_103= 'ureal'
                    {
                    enumLiteral_103=(Token)match(input,166,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:7167:1: ruleLocationSpecifierEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) ) ;
    public final Enumerator ruleLocationSpecifierEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7173:2: ( ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) ) )
            // InternalTryGrammar.g:7174:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) )
            {
            // InternalTryGrammar.g:7174:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'storage' ) | (enumLiteral_2= 'calldata' ) )
            int alt99=3;
            switch ( input.LA(1) ) {
            case 167:
                {
                alt99=1;
                }
                break;
            case 168:
                {
                alt99=2;
                }
                break;
            case 169:
                {
                alt99=3;
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
                    // InternalTryGrammar.g:7175:3: (enumLiteral_0= 'memory' )
                    {
                    // InternalTryGrammar.g:7175:3: (enumLiteral_0= 'memory' )
                    // InternalTryGrammar.g:7176:4: enumLiteral_0= 'memory'
                    {
                    enumLiteral_0=(Token)match(input,167,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLocationSpecifierEnumAccess().getMEMORYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7183:3: (enumLiteral_1= 'storage' )
                    {
                    // InternalTryGrammar.g:7183:3: (enumLiteral_1= 'storage' )
                    // InternalTryGrammar.g:7184:4: enumLiteral_1= 'storage'
                    {
                    enumLiteral_1=(Token)match(input,168,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLocationSpecifierEnumAccess().getSTORAGEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7191:3: (enumLiteral_2= 'calldata' )
                    {
                    // InternalTryGrammar.g:7191:3: (enumLiteral_2= 'calldata' )
                    // InternalTryGrammar.g:7192:4: enumLiteral_2= 'calldata'
                    {
                    enumLiteral_2=(Token)match(input,169,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:7202:1: ruleVisibilityEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) ;
    public final Enumerator ruleVisibilityEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7208:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) ) )
            // InternalTryGrammar.g:7209:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            {
            // InternalTryGrammar.g:7209:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'internal' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'external' ) )
            int alt100=4;
            switch ( input.LA(1) ) {
            case 170:
                {
                alt100=1;
                }
                break;
            case 171:
                {
                alt100=2;
                }
                break;
            case 172:
                {
                alt100=3;
                }
                break;
            case 173:
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
                    // InternalTryGrammar.g:7210:3: (enumLiteral_0= 'public' )
                    {
                    // InternalTryGrammar.g:7210:3: (enumLiteral_0= 'public' )
                    // InternalTryGrammar.g:7211:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,170,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityEnumAccess().getPUBLICEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7218:3: (enumLiteral_1= 'internal' )
                    {
                    // InternalTryGrammar.g:7218:3: (enumLiteral_1= 'internal' )
                    // InternalTryGrammar.g:7219:4: enumLiteral_1= 'internal'
                    {
                    enumLiteral_1=(Token)match(input,171,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityEnumAccess().getINTERNALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7226:3: (enumLiteral_2= 'private' )
                    {
                    // InternalTryGrammar.g:7226:3: (enumLiteral_2= 'private' )
                    // InternalTryGrammar.g:7227:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,172,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityEnumAccess().getPRIVATEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:7234:3: (enumLiteral_3= 'external' )
                    {
                    // InternalTryGrammar.g:7234:3: (enumLiteral_3= 'external' )
                    // InternalTryGrammar.g:7235:4: enumLiteral_3= 'external'
                    {
                    enumLiteral_3=(Token)match(input,173,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:7245:1: ruleAssignmentOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) ;
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
            // InternalTryGrammar.g:7251:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) )
            // InternalTryGrammar.g:7252:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            {
            // InternalTryGrammar.g:7252:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            int alt101=12;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt101=1;
                }
                break;
            case 174:
                {
                alt101=2;
                }
                break;
            case 175:
                {
                alt101=3;
                }
                break;
            case 176:
                {
                alt101=4;
                }
                break;
            case 177:
                {
                alt101=5;
                }
                break;
            case 178:
                {
                alt101=6;
                }
                break;
            case 179:
                {
                alt101=7;
                }
                break;
            case 180:
                {
                alt101=8;
                }
                break;
            case 181:
                {
                alt101=9;
                }
                break;
            case 182:
                {
                alt101=10;
                }
                break;
            case 183:
                {
                alt101=11;
                }
                break;
            case 184:
                {
                alt101=12;
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
                    // InternalTryGrammar.g:7253:3: (enumLiteral_0= '=' )
                    {
                    // InternalTryGrammar.g:7253:3: (enumLiteral_0= '=' )
                    // InternalTryGrammar.g:7254:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOpEnumAccess().getASSIGNEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7261:3: (enumLiteral_1= '|=' )
                    {
                    // InternalTryGrammar.g:7261:3: (enumLiteral_1= '|=' )
                    // InternalTryGrammar.g:7262:4: enumLiteral_1= '|='
                    {
                    enumLiteral_1=(Token)match(input,174,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7269:3: (enumLiteral_2= '^=' )
                    {
                    // InternalTryGrammar.g:7269:3: (enumLiteral_2= '^=' )
                    // InternalTryGrammar.g:7270:4: enumLiteral_2= '^='
                    {
                    enumLiteral_2=(Token)match(input,175,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:7277:3: (enumLiteral_3= '&=' )
                    {
                    // InternalTryGrammar.g:7277:3: (enumLiteral_3= '&=' )
                    // InternalTryGrammar.g:7278:4: enumLiteral_3= '&='
                    {
                    enumLiteral_3=(Token)match(input,176,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryGrammar.g:7285:3: (enumLiteral_4= '<<=' )
                    {
                    // InternalTryGrammar.g:7285:3: (enumLiteral_4= '<<=' )
                    // InternalTryGrammar.g:7286:4: enumLiteral_4= '<<='
                    {
                    enumLiteral_4=(Token)match(input,177,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTryGrammar.g:7293:3: (enumLiteral_5= '>>=' )
                    {
                    // InternalTryGrammar.g:7293:3: (enumLiteral_5= '>>=' )
                    // InternalTryGrammar.g:7294:4: enumLiteral_5= '>>='
                    {
                    enumLiteral_5=(Token)match(input,178,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTryGrammar.g:7301:3: (enumLiteral_6= '>>>=' )
                    {
                    // InternalTryGrammar.g:7301:3: (enumLiteral_6= '>>>=' )
                    // InternalTryGrammar.g:7302:4: enumLiteral_6= '>>>='
                    {
                    enumLiteral_6=(Token)match(input,179,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalTryGrammar.g:7309:3: (enumLiteral_7= '+=' )
                    {
                    // InternalTryGrammar.g:7309:3: (enumLiteral_7= '+=' )
                    // InternalTryGrammar.g:7310:4: enumLiteral_7= '+='
                    {
                    enumLiteral_7=(Token)match(input,180,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalTryGrammar.g:7317:3: (enumLiteral_8= '-=' )
                    {
                    // InternalTryGrammar.g:7317:3: (enumLiteral_8= '-=' )
                    // InternalTryGrammar.g:7318:4: enumLiteral_8= '-='
                    {
                    enumLiteral_8=(Token)match(input,181,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalTryGrammar.g:7325:3: (enumLiteral_9= '*=' )
                    {
                    // InternalTryGrammar.g:7325:3: (enumLiteral_9= '*=' )
                    // InternalTryGrammar.g:7326:4: enumLiteral_9= '*='
                    {
                    enumLiteral_9=(Token)match(input,182,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalTryGrammar.g:7333:3: (enumLiteral_10= '/=' )
                    {
                    // InternalTryGrammar.g:7333:3: (enumLiteral_10= '/=' )
                    // InternalTryGrammar.g:7334:4: enumLiteral_10= '/='
                    {
                    enumLiteral_10=(Token)match(input,183,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalTryGrammar.g:7341:3: (enumLiteral_11= '%=' )
                    {
                    // InternalTryGrammar.g:7341:3: (enumLiteral_11= '%=' )
                    // InternalTryGrammar.g:7342:4: enumLiteral_11= '%='
                    {
                    enumLiteral_11=(Token)match(input,184,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:7352:1: ruleEqualityOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7358:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalTryGrammar.g:7359:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalTryGrammar.g:7359:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==185) ) {
                alt102=1;
            }
            else if ( (LA102_0==186) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalTryGrammar.g:7360:3: (enumLiteral_0= '==' )
                    {
                    // InternalTryGrammar.g:7360:3: (enumLiteral_0= '==' )
                    // InternalTryGrammar.g:7361:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,185,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7368:3: (enumLiteral_1= '!=' )
                    {
                    // InternalTryGrammar.g:7368:3: (enumLiteral_1= '!=' )
                    // InternalTryGrammar.g:7369:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,186,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:7379:1: ruleComparisonOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) ;
    public final Enumerator ruleComparisonOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7385:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) )
            // InternalTryGrammar.g:7386:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            {
            // InternalTryGrammar.g:7386:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            int alt103=5;
            switch ( input.LA(1) ) {
            case 187:
                {
                alt103=1;
                }
                break;
            case 188:
                {
                alt103=2;
                }
                break;
            case 189:
                {
                alt103=3;
                }
                break;
            case 190:
                {
                alt103=4;
                }
                break;
            case 191:
                {
                alt103=5;
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
                    // InternalTryGrammar.g:7387:3: (enumLiteral_0= '<' )
                    {
                    // InternalTryGrammar.g:7387:3: (enumLiteral_0= '<' )
                    // InternalTryGrammar.g:7388:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,187,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7395:3: (enumLiteral_1= '>' )
                    {
                    // InternalTryGrammar.g:7395:3: (enumLiteral_1= '>' )
                    // InternalTryGrammar.g:7396:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,188,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7403:3: (enumLiteral_2= '<=' )
                    {
                    // InternalTryGrammar.g:7403:3: (enumLiteral_2= '<=' )
                    // InternalTryGrammar.g:7404:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,189,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTryGrammar.g:7411:3: (enumLiteral_3= '>=' )
                    {
                    // InternalTryGrammar.g:7411:3: (enumLiteral_3= '>=' )
                    // InternalTryGrammar.g:7412:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,190,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTryGrammar.g:7419:3: (enumLiteral_4= 'in' )
                    {
                    // InternalTryGrammar.g:7419:3: (enumLiteral_4= 'in' )
                    // InternalTryGrammar.g:7420:4: enumLiteral_4= 'in'
                    {
                    enumLiteral_4=(Token)match(input,191,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:7430:1: ruleShiftOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) ;
    public final Enumerator ruleShiftOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7436:2: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) )
            // InternalTryGrammar.g:7437:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            {
            // InternalTryGrammar.g:7437:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            int alt104=3;
            switch ( input.LA(1) ) {
            case 192:
                {
                alt104=1;
                }
                break;
            case 193:
                {
                alt104=2;
                }
                break;
            case 194:
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
                    // InternalTryGrammar.g:7438:3: (enumLiteral_0= '<<' )
                    {
                    // InternalTryGrammar.g:7438:3: (enumLiteral_0= '<<' )
                    // InternalTryGrammar.g:7439:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,192,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7446:3: (enumLiteral_1= '>>' )
                    {
                    // InternalTryGrammar.g:7446:3: (enumLiteral_1= '>>' )
                    // InternalTryGrammar.g:7447:4: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,193,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTryGrammar.g:7454:3: (enumLiteral_2= '>>>' )
                    {
                    // InternalTryGrammar.g:7454:3: (enumLiteral_2= '>>>' )
                    // InternalTryGrammar.g:7455:4: enumLiteral_2= '>>>'
                    {
                    enumLiteral_2=(Token)match(input,194,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:7465:1: ruleAdditionOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7471:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalTryGrammar.g:7472:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalTryGrammar.g:7472:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==57) ) {
                alt105=1;
            }
            else if ( (LA105_0==58) ) {
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
                    // InternalTryGrammar.g:7473:3: (enumLiteral_0= '+' )
                    {
                    // InternalTryGrammar.g:7473:3: (enumLiteral_0= '+' )
                    // InternalTryGrammar.g:7474:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7481:3: (enumLiteral_1= '-' )
                    {
                    // InternalTryGrammar.g:7481:3: (enumLiteral_1= '-' )
                    // InternalTryGrammar.g:7482:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:7492:1: ruleMulDivModOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMulDivModOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7498:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalTryGrammar.g:7499:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalTryGrammar.g:7499:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 195:
                {
                alt106=1;
                }
                break;
            case 196:
                {
                alt106=2;
                }
                break;
            case 197:
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
                    // InternalTryGrammar.g:7500:3: (enumLiteral_0= '*' )
                    {
                    // InternalTryGrammar.g:7500:3: (enumLiteral_0= '*' )
                    // InternalTryGrammar.g:7501:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,195,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7508:3: (enumLiteral_1= '/' )
                    {
                    // InternalTryGrammar.g:7508:3: (enumLiteral_1= '/' )
                    // InternalTryGrammar.g:7509:4: enumLiteral_1= '/'
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
                    // InternalTryGrammar.g:7516:3: (enumLiteral_2= '%' )
                    {
                    // InternalTryGrammar.g:7516:3: (enumLiteral_2= '%' )
                    // InternalTryGrammar.g:7517:4: enumLiteral_2= '%'
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
    // InternalTryGrammar.g:7527:1: ruleIncDecOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncDecOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7533:2: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalTryGrammar.g:7534:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalTryGrammar.g:7534:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==60) ) {
                alt107=1;
            }
            else if ( (LA107_0==61) ) {
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
                    // InternalTryGrammar.g:7535:3: (enumLiteral_0= '++' )
                    {
                    // InternalTryGrammar.g:7535:3: (enumLiteral_0= '++' )
                    // InternalTryGrammar.g:7536:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTryGrammar.g:7543:3: (enumLiteral_1= '--' )
                    {
                    // InternalTryGrammar.g:7543:3: (enumLiteral_1= '--' )
                    // InternalTryGrammar.g:7544:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalTryGrammar.g:7554:1: ruleBooleanLiteralEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteralEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7560:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalTryGrammar.g:7561:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalTryGrammar.g:7561:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==198) ) {
                alt108=1;
            }
            else if ( (LA108_0==199) ) {
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
                    // InternalTryGrammar.g:7562:3: (enumLiteral_0= 'true' )
                    {
                    // InternalTryGrammar.g:7562:3: (enumLiteral_0= 'true' )
                    // InternalTryGrammar.g:7563:4: enumLiteral_0= 'true'
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
                    // InternalTryGrammar.g:7570:3: (enumLiteral_1= 'false' )
                    {
                    // InternalTryGrammar.g:7570:3: (enumLiteral_1= 'false' )
                    // InternalTryGrammar.g:7571:4: enumLiteral_1= 'false'
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
    // InternalTryGrammar.g:7581:1: ruleEtherSubDenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) ;
    public final Enumerator ruleEtherSubDenominationEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7587:2: ( ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) ) )
            // InternalTryGrammar.g:7588:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            {
            // InternalTryGrammar.g:7588:2: ( (enumLiteral_0= 'wei' ) | (enumLiteral_1= 'szabo' ) | (enumLiteral_2= 'finney' ) | (enumLiteral_3= 'ether' ) )
            int alt109=4;
            switch ( input.LA(1) ) {
            case 200:
                {
                alt109=1;
                }
                break;
            case 201:
                {
                alt109=2;
                }
                break;
            case 202:
                {
                alt109=3;
                }
                break;
            case 203:
                {
                alt109=4;
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
                    // InternalTryGrammar.g:7589:3: (enumLiteral_0= 'wei' )
                    {
                    // InternalTryGrammar.g:7589:3: (enumLiteral_0= 'wei' )
                    // InternalTryGrammar.g:7590:4: enumLiteral_0= 'wei'
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
                    // InternalTryGrammar.g:7597:3: (enumLiteral_1= 'szabo' )
                    {
                    // InternalTryGrammar.g:7597:3: (enumLiteral_1= 'szabo' )
                    // InternalTryGrammar.g:7598:4: enumLiteral_1= 'szabo'
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
                    // InternalTryGrammar.g:7605:3: (enumLiteral_2= 'finney' )
                    {
                    // InternalTryGrammar.g:7605:3: (enumLiteral_2= 'finney' )
                    // InternalTryGrammar.g:7606:4: enumLiteral_2= 'finney'
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
                    // InternalTryGrammar.g:7613:3: (enumLiteral_3= 'ether' )
                    {
                    // InternalTryGrammar.g:7613:3: (enumLiteral_3= 'ether' )
                    // InternalTryGrammar.g:7614:4: enumLiteral_3= 'ether'
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
    // InternalTryGrammar.g:7624:1: ruleTimeSubdenominationEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) ;
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
            // InternalTryGrammar.g:7630:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) ) )
            // InternalTryGrammar.g:7631:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            {
            // InternalTryGrammar.g:7631:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'years' ) )
            int alt110=6;
            switch ( input.LA(1) ) {
            case 204:
                {
                alt110=1;
                }
                break;
            case 205:
                {
                alt110=2;
                }
                break;
            case 206:
                {
                alt110=3;
                }
                break;
            case 207:
                {
                alt110=4;
                }
                break;
            case 208:
                {
                alt110=5;
                }
                break;
            case 209:
                {
                alt110=6;
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
                    // InternalTryGrammar.g:7632:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalTryGrammar.g:7632:3: (enumLiteral_0= 'seconds' )
                    // InternalTryGrammar.g:7633:4: enumLiteral_0= 'seconds'
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
                    // InternalTryGrammar.g:7640:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalTryGrammar.g:7640:3: (enumLiteral_1= 'minutes' )
                    // InternalTryGrammar.g:7641:4: enumLiteral_1= 'minutes'
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
                    // InternalTryGrammar.g:7648:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalTryGrammar.g:7648:3: (enumLiteral_2= 'hours' )
                    // InternalTryGrammar.g:7649:4: enumLiteral_2= 'hours'
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
                    // InternalTryGrammar.g:7656:3: (enumLiteral_3= 'days' )
                    {
                    // InternalTryGrammar.g:7656:3: (enumLiteral_3= 'days' )
                    // InternalTryGrammar.g:7657:4: enumLiteral_3= 'days'
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
                    // InternalTryGrammar.g:7664:3: (enumLiteral_4= 'weeks' )
                    {
                    // InternalTryGrammar.g:7664:3: (enumLiteral_4= 'weeks' )
                    // InternalTryGrammar.g:7665:4: enumLiteral_4= 'weeks'
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
                    // InternalTryGrammar.g:7672:3: (enumLiteral_5= 'years' )
                    {
                    // InternalTryGrammar.g:7672:3: (enumLiteral_5= 'years' )
                    // InternalTryGrammar.g:7673:4: enumLiteral_5= 'years'
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
    // InternalTryGrammar.g:7683:1: ruleSpecialVariablesTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'msg' ) | (enumLiteral_1= 'block' ) | (enumLiteral_2= 'tx' ) ) ;
    public final Enumerator ruleSpecialVariablesTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7689:2: ( ( (enumLiteral_0= 'msg' ) | (enumLiteral_1= 'block' ) | (enumLiteral_2= 'tx' ) ) )
            // InternalTryGrammar.g:7690:2: ( (enumLiteral_0= 'msg' ) | (enumLiteral_1= 'block' ) | (enumLiteral_2= 'tx' ) )
            {
            // InternalTryGrammar.g:7690:2: ( (enumLiteral_0= 'msg' ) | (enumLiteral_1= 'block' ) | (enumLiteral_2= 'tx' ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 210:
                {
                alt111=1;
                }
                break;
            case 211:
                {
                alt111=2;
                }
                break;
            case 212:
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
                    // InternalTryGrammar.g:7691:3: (enumLiteral_0= 'msg' )
                    {
                    // InternalTryGrammar.g:7691:3: (enumLiteral_0= 'msg' )
                    // InternalTryGrammar.g:7692:4: enumLiteral_0= 'msg'
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
                    // InternalTryGrammar.g:7699:3: (enumLiteral_1= 'block' )
                    {
                    // InternalTryGrammar.g:7699:3: (enumLiteral_1= 'block' )
                    // InternalTryGrammar.g:7700:4: enumLiteral_1= 'block'
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
                    // InternalTryGrammar.g:7707:3: (enumLiteral_2= 'tx' )
                    {
                    // InternalTryGrammar.g:7707:3: (enumLiteral_2= 'tx' )
                    // InternalTryGrammar.g:7708:4: enumLiteral_2= 'tx'
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
    // InternalTryGrammar.g:7718:1: ruleSpecialExpressionTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) ;
    public final Enumerator ruleSpecialExpressionTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTryGrammar.g:7724:2: ( ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) )
            // InternalTryGrammar.g:7725:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            {
            // InternalTryGrammar.g:7725:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==213) ) {
                alt112=1;
            }
            else if ( (LA112_0==214) ) {
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
                    // InternalTryGrammar.g:7726:3: (enumLiteral_0= 'super' )
                    {
                    // InternalTryGrammar.g:7726:3: (enumLiteral_0= 'super' )
                    // InternalTryGrammar.g:7727:4: enumLiteral_0= 'super'
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
                    // InternalTryGrammar.g:7734:3: (enumLiteral_1= 'this' )
                    {
                    // InternalTryGrammar.g:7734:3: (enumLiteral_1= 'this' )
                    // InternalTryGrammar.g:7735:4: enumLiteral_1= 'this'
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
        // InternalTryGrammar.g:3625:5: ( 'else' )
        // InternalTryGrammar.g:3625:6: 'else'
        {
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTryGrammar

    // $ANTLR start synpred2_InternalTryGrammar
    public final void synpred2_InternalTryGrammar_fragment() throws RecognitionException {   
        // InternalTryGrammar.g:3767:4: ( ';' )
        // InternalTryGrammar.g:3767:5: ';'
        {
        match(input,18,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTryGrammar

    // $ANTLR start synpred3_InternalTryGrammar
    public final void synpred3_InternalTryGrammar_fragment() throws RecognitionException {   
        // InternalTryGrammar.g:4916:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )
        // InternalTryGrammar.g:4916:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        {
        // InternalTryGrammar.g:4916:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        // InternalTryGrammar.g:4917:5: () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) )
        {
        // InternalTryGrammar.g:4917:5: ()
        // InternalTryGrammar.g:4918:5: 
        {
        }

        // InternalTryGrammar.g:4919:5: ( ( ruleAdditionOpEnum ) )
        // InternalTryGrammar.g:4920:6: ( ruleAdditionOpEnum )
        {
        // InternalTryGrammar.g:4920:6: ( ruleAdditionOpEnum )
        // InternalTryGrammar.g:4921:7: ruleAdditionOpEnum
        {
        pushFollow(FOLLOW_12);
        ruleAdditionOpEnum();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalTryGrammar.g:4924:5: ( ( ruleMulDivMod ) )
        // InternalTryGrammar.g:4925:6: ( ruleMulDivMod )
        {
        // InternalTryGrammar.g:4925:6: ( ruleMulDivMod )
        // InternalTryGrammar.g:4926:7: ruleMulDivMod
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


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String dfa_1s = "\154\uffff";
    static final String dfa_2s = "\151\4\3\uffff";
    static final String dfa_3s = "\1\u00d6\150\u00ad\3\uffff";
    static final String dfa_4s = "\151\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\154\uffff}>";
    static final String[] dfa_6s = {
            "\5\153\13\uffff\1\153\11\uffff\1\151\3\uffff\1\152\24\uffff\10\153\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\37\uffff\2\153\12\uffff\5\153",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
            "\1\151\17\uffff\1\153\4\uffff\1\151\3\uffff\1\151\2\uffff\1\151\u0086\uffff\7\151",
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

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2242:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_ptionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2486:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x800000344C880010L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xFF800000403001F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xFF800000401001F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003060010L,0x0000000000000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x8000000440080010L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000022000010L,0x0000000000000000L,0x00003F8000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x8000000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8000000440000010L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xFF800002401001F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xFF800000403081F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xFF800000401081F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000022100010L,0x0000000000000000L,0x00003F8000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000900100002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000120010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000140010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000440200010L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000022000012L,0x0000000000000000L,0x00003F8000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000040000010L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xFF81FD84401201F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xFF81FD84401601F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xFF800000401401F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xFF81FD84403201F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xFF81FD84401A01F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000032000012L,0x0000000000000000L,0x01FFFF8000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xF800000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0xC0000000401001F0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000007C00C0L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000800000000L});

}