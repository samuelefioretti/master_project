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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BLOCK", "RULE_MSG", "RULE_TX", "RULE_NOW", "RULE_INT", "RULE_HEX", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'contract'", "'is'", "','", "'{'", "';'", "'}'", "'('", "')'", "':'", "'function'", "'returns'", "'constant'", "'struct'", "'enum'", "'='", "'indexed'", "'mapping'", "'=>'", "'['", "']'", "'var'", "'.'", "'modifier'", "'event'", "'anonymous'", "'delete'", "'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'return'", "'throw'", "'_'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'**'", "'!'", "'~'", "'+'", "'-'", "'new'", "'++'", "'--'", "'int'", "'int16'", "'int24'", "'int32'", "'int40'", "'int48'", "'int56'", "'int64'", "'int72'", "'int80'", "'int88'", "'int96'", "'int104'", "'int112'", "'int120'", "'int128'", "'int136'", "'int144'", "'int152'", "'int160'", "'int168'", "'int178'", "'int184'", "'int192'", "'int200'", "'int208'", "'int216'", "'int224'", "'int232'", "'int240'", "'int248'", "'int256'", "'uint'", "'uint8'", "'uint16'", "'uint24'", "'uint32'", "'uint40'", "'uint48'", "'uint56'", "'uint64'", "'uint72'", "'uint80'", "'uint88'", "'uint96'", "'uint104'", "'uint112'", "'uint120'", "'uint128'", "'uint136'", "'uint144'", "'uint152'", "'uint160'", "'uint168'", "'uint178'", "'uint184'", "'uint192'", "'uint200'", "'uint208'", "'uint216'", "'uint224'", "'uint232'", "'uint240'", "'uint248'", "'uint256'", "'bytes1'", "'bytes2'", "'bytes3'", "'bytes4'", "'bytes5'", "'bytes6'", "'bytes7'", "'bytes8'", "'bytes9'", "'bytes10'", "'bytes11'", "'bytes12'", "'bytes13'", "'bytes14'", "'bytes15'", "'bytes16'", "'bytes17'", "'bytes18'", "'bytes19'", "'bytes20'", "'bytes21'", "'bytes22'", "'bytes23'", "'bytes24'", "'bytes25'", "'bytes26'", "'bytes27'", "'bytes28'", "'bytes29'", "'bytes30'", "'bytes31'", "'bytes32'", "'bytes'", "'byte'", "'address'", "'real'", "'ureal'", "'storage'", "'memory'", "'calldata'", "'public'", "'internal'", "'private'", "'external'", "'wei'", "'szabo'", "'finney'", "'ether'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'years'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'>>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'in'", "'<<'", "'>>'", "'>>>'", "'*'", "'/'", "'%'", "'true'", "'false'", "'super'", "'this'"
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
    public static final int RULE_INT=9;
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
    public static final int RULE_BLOCK=5;
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
    public static final int T__210=210;
    public static final int T__211=211;
    public static final int RULE_DECIMAL=11;
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
    public static final int RULE_NOW=8;
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
    public static final int RULE_HEX=10;
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
    public static final int RULE_MSG=6;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int RULE_TX=7;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=12;
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

                if ( (LA1_0==17) ) {
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
    // InternalOptGrammar.g:108:1: ruleContract returns [EObject current=null] : (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) ;
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
            // InternalOptGrammar.g:114:2: ( (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) ) )
            // InternalOptGrammar.g:115:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            {
            // InternalOptGrammar.g:115:2: (otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) ) )
            // InternalOptGrammar.g:116:3: otherlv_0= 'contract' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )? ( (lv_body_6_0= ruleDefinitionBody ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
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

            // InternalOptGrammar.g:138:3: (otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOptGrammar.g:139:4: otherlv_2= 'is' ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) ) (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContractAccess().getIsKeyword_2_0());
                      			
                    }
                    // InternalOptGrammar.g:143:4: ( (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier ) )
                    // InternalOptGrammar.g:144:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    {
                    // InternalOptGrammar.g:144:5: (lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier )
                    // InternalOptGrammar.g:145:6: lv_inheritanceSpecifiers_3_0= ruleInheritanceSpecifier
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
                      							"org.unicam.myGrammar.OptGrammar.InheritanceSpecifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:162:4: (otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==19) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalOptGrammar.g:163:5: otherlv_4= ',' ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getContractAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:167:5: ( (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier ) )
                    	    // InternalOptGrammar.g:168:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    {
                    	    // InternalOptGrammar.g:168:6: (lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier )
                    	    // InternalOptGrammar.g:169:7: lv_inheritanceSpecifiers_5_0= ruleInheritanceSpecifier
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
                    	      								"org.unicam.myGrammar.OptGrammar.InheritanceSpecifier");
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

            // InternalOptGrammar.g:188:3: ( (lv_body_6_0= ruleDefinitionBody ) )
            // InternalOptGrammar.g:189:4: (lv_body_6_0= ruleDefinitionBody )
            {
            // InternalOptGrammar.g:189:4: (lv_body_6_0= ruleDefinitionBody )
            // InternalOptGrammar.g:190:5: lv_body_6_0= ruleDefinitionBody
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


    // $ANTLR start "entryRuleDefinitionBody"
    // InternalOptGrammar.g:211:1: entryRuleDefinitionBody returns [EObject current=null] : iv_ruleDefinitionBody= ruleDefinitionBody EOF ;
    public final EObject entryRuleDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionBody = null;


        try {
            // InternalOptGrammar.g:211:55: (iv_ruleDefinitionBody= ruleDefinitionBody EOF )
            // InternalOptGrammar.g:212:2: iv_ruleDefinitionBody= ruleDefinitionBody EOF
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
    // InternalOptGrammar.g:218:1: ruleDefinitionBody returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) ;
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
            // InternalOptGrammar.g:224:2: ( ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ) )
            // InternalOptGrammar.g:225:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            {
            // InternalOptGrammar.g:225:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' )
            // InternalOptGrammar.g:226:3: () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}'
            {
            // InternalOptGrammar.g:226:3: ()
            // InternalOptGrammar.g:227:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDefinitionBodyAccess().getDefinitionBodyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefinitionBodyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalOptGrammar.g:237:3: ( ( (lv_functions_2_0= ruleFunctionDefinition ) ) | ( (lv_structs_3_0= ruleStructDefinition ) ) | ( (lv_enums_4_0= ruleEnumDefinition ) ) | ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' ) | ( (lv_modifiers_7_0= ruleModifier ) ) | ( (lv_events_8_0= ruleEvent ) ) )*
            loop4:
            do {
                int alt4=7;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt4=1;
                    }
                    break;
                case 29:
                    {
                    alt4=2;
                    }
                    break;
                case 30:
                    {
                    alt4=3;
                    }
                    break;
                case RULE_ID:
                case 33:
                case 37:
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
                    alt4=4;
                    }
                    break;
                case 39:
                    {
                    alt4=5;
                    }
                    break;
                case 40:
                    {
                    alt4=6;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalOptGrammar.g:238:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    {
            	    // InternalOptGrammar.g:238:4: ( (lv_functions_2_0= ruleFunctionDefinition ) )
            	    // InternalOptGrammar.g:239:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    {
            	    // InternalOptGrammar.g:239:5: (lv_functions_2_0= ruleFunctionDefinition )
            	    // InternalOptGrammar.g:240:6: lv_functions_2_0= ruleFunctionDefinition
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
            	      							"org.unicam.myGrammar.OptGrammar.FunctionDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptGrammar.g:258:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    {
            	    // InternalOptGrammar.g:258:4: ( (lv_structs_3_0= ruleStructDefinition ) )
            	    // InternalOptGrammar.g:259:5: (lv_structs_3_0= ruleStructDefinition )
            	    {
            	    // InternalOptGrammar.g:259:5: (lv_structs_3_0= ruleStructDefinition )
            	    // InternalOptGrammar.g:260:6: lv_structs_3_0= ruleStructDefinition
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
            	      							"org.unicam.myGrammar.OptGrammar.StructDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOptGrammar.g:278:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    {
            	    // InternalOptGrammar.g:278:4: ( (lv_enums_4_0= ruleEnumDefinition ) )
            	    // InternalOptGrammar.g:279:5: (lv_enums_4_0= ruleEnumDefinition )
            	    {
            	    // InternalOptGrammar.g:279:5: (lv_enums_4_0= ruleEnumDefinition )
            	    // InternalOptGrammar.g:280:6: lv_enums_4_0= ruleEnumDefinition
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
            	      							"org.unicam.myGrammar.OptGrammar.EnumDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOptGrammar.g:298:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    {
            	    // InternalOptGrammar.g:298:4: ( ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';' )
            	    // InternalOptGrammar.g:299:5: ( (lv_variables_5_0= ruleVariableDeclaration ) ) otherlv_6= ';'
            	    {
            	    // InternalOptGrammar.g:299:5: ( (lv_variables_5_0= ruleVariableDeclaration ) )
            	    // InternalOptGrammar.g:300:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    {
            	    // InternalOptGrammar.g:300:6: (lv_variables_5_0= ruleVariableDeclaration )
            	    // InternalOptGrammar.g:301:7: lv_variables_5_0= ruleVariableDeclaration
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
            	      								"org.unicam.myGrammar.OptGrammar.VariableDeclaration");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getDefinitionBodyAccess().getSemicolonKeyword_2_3_1());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalOptGrammar.g:324:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    {
            	    // InternalOptGrammar.g:324:4: ( (lv_modifiers_7_0= ruleModifier ) )
            	    // InternalOptGrammar.g:325:5: (lv_modifiers_7_0= ruleModifier )
            	    {
            	    // InternalOptGrammar.g:325:5: (lv_modifiers_7_0= ruleModifier )
            	    // InternalOptGrammar.g:326:6: lv_modifiers_7_0= ruleModifier
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
            	      							"org.unicam.myGrammar.OptGrammar.Modifier");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalOptGrammar.g:344:4: ( (lv_events_8_0= ruleEvent ) )
            	    {
            	    // InternalOptGrammar.g:344:4: ( (lv_events_8_0= ruleEvent ) )
            	    // InternalOptGrammar.g:345:5: (lv_events_8_0= ruleEvent )
            	    {
            	    // InternalOptGrammar.g:345:5: (lv_events_8_0= ruleEvent )
            	    // InternalOptGrammar.g:346:6: lv_events_8_0= ruleEvent
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
            	      							"org.unicam.myGrammar.OptGrammar.Event");
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

            otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:372:1: entryRuleInheritanceSpecifier returns [EObject current=null] : iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF ;
    public final EObject entryRuleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceSpecifier = null;


        try {
            // InternalOptGrammar.g:372:61: (iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF )
            // InternalOptGrammar.g:373:2: iv_ruleInheritanceSpecifier= ruleInheritanceSpecifier EOF
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
    // InternalOptGrammar.g:379:1: ruleInheritanceSpecifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleInheritanceSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:385:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalOptGrammar.g:386:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalOptGrammar.g:386:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalOptGrammar.g:387:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalOptGrammar.g:387:3: ( (otherlv_0= RULE_ID ) )
            // InternalOptGrammar.g:388:4: (otherlv_0= RULE_ID )
            {
            // InternalOptGrammar.g:388:4: (otherlv_0= RULE_ID )
            // InternalOptGrammar.g:389:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInheritanceSpecifierRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getInheritanceSpecifierAccess().getSuperTypeContractCrossReference_0_0());
              				
            }

            }


            }

            // InternalOptGrammar.g:400:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOptGrammar.g:401:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalOptGrammar.g:401:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalOptGrammar.g:402:5: lv_args_1_0= ruleFunctionCallListArguments
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


    // $ANTLR start "entryRuleFunctionCallListArguments"
    // InternalOptGrammar.g:423:1: entryRuleFunctionCallListArguments returns [EObject current=null] : iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF ;
    public final EObject entryRuleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallListArguments = null;


        try {
            // InternalOptGrammar.g:423:66: (iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF )
            // InternalOptGrammar.g:424:2: iv_ruleFunctionCallListArguments= ruleFunctionCallListArguments EOF
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
    // InternalOptGrammar.g:430:1: ruleFunctionCallListArguments returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCallListArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:436:2: ( (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:437:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:437:2: (otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:438:3: otherlv_0= '(' () ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallListArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:442:3: ()
            // InternalOptGrammar.g:443:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallListArgumentsAccess().getFunctionCallListArgumentsAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:449:3: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||LA7_0==23||(LA7_0>=58 && LA7_0<=166)||(LA7_0>=208 && LA7_0<=211)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOptGrammar.g:450:4: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // InternalOptGrammar.g:450:4: ( (lv_arguments_2_0= ruleExpression ) )
                    // InternalOptGrammar.g:451:5: (lv_arguments_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:451:5: (lv_arguments_2_0= ruleExpression )
                    // InternalOptGrammar.g:452:6: lv_arguments_2_0= ruleExpression
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
                      							"org.unicam.myGrammar.OptGrammar.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:469:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOptGrammar.g:470:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallListArgumentsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:474:5: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // InternalOptGrammar.g:475:6: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // InternalOptGrammar.g:475:6: (lv_arguments_4_0= ruleExpression )
                    	    // InternalOptGrammar.g:476:7: lv_arguments_4_0= ruleExpression
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
                    	      								"org.unicam.myGrammar.OptGrammar.Expression");
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

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:503:1: entryRuleFunctionCallArguments returns [EObject current=null] : iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF ;
    public final EObject entryRuleFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArguments = null;


        try {
            // InternalOptGrammar.g:503:62: (iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF )
            // InternalOptGrammar.g:504:2: iv_ruleFunctionCallArguments= ruleFunctionCallArguments EOF
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
    // InternalOptGrammar.g:510:1: ruleFunctionCallArguments returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) ;
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
            // InternalOptGrammar.g:516:2: ( ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments ) )
            // InternalOptGrammar.g:517:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            {
            // InternalOptGrammar.g:517:2: ( (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' ) | this_FunctionCallListArguments_8= ruleFunctionCallListArguments )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=RULE_ID && LA10_1<=RULE_STRING)||(LA10_1>=23 && LA10_1<=24)||(LA10_1>=58 && LA10_1<=166)||(LA10_1>=208 && LA10_1<=211)) ) {
                    alt10=2;
                }
                else if ( (LA10_1==20) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOptGrammar.g:518:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    {
                    // InternalOptGrammar.g:518:3: (otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')' )
                    // InternalOptGrammar.g:519:4: otherlv_0= '(' otherlv_1= '{' () ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )? otherlv_6= '}' otherlv_7= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunctionCallArgumentsAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgumentsAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalOptGrammar.g:527:4: ()
                    // InternalOptGrammar.g:528:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFunctionCallArgumentsAccess().getFunctionCallArgumentsAction_0_2(),
                      						current);
                      				
                    }

                    }

                    // InternalOptGrammar.g:534:4: ( ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalOptGrammar.g:535:5: ( (lv_args_3_0= ruleFunctionCallArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            {
                            // InternalOptGrammar.g:535:5: ( (lv_args_3_0= ruleFunctionCallArg ) )
                            // InternalOptGrammar.g:536:6: (lv_args_3_0= ruleFunctionCallArg )
                            {
                            // InternalOptGrammar.g:536:6: (lv_args_3_0= ruleFunctionCallArg )
                            // InternalOptGrammar.g:537:7: lv_args_3_0= ruleFunctionCallArg
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
                              								"org.unicam.myGrammar.OptGrammar.FunctionCallArg");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalOptGrammar.g:554:5: (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==19) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalOptGrammar.g:555:6: otherlv_4= ',' ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallArgumentsAccess().getCommaKeyword_0_3_1_0());
                            	      					
                            	    }
                            	    // InternalOptGrammar.g:559:6: ( (lv_args_5_0= ruleFunctionCallArg ) )
                            	    // InternalOptGrammar.g:560:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    {
                            	    // InternalOptGrammar.g:560:7: (lv_args_5_0= ruleFunctionCallArg )
                            	    // InternalOptGrammar.g:561:8: lv_args_5_0= ruleFunctionCallArg
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
                            	      									"org.unicam.myGrammar.OptGrammar.FunctionCallArg");
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

                    otherlv_6=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFunctionCallArgumentsAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }
                    otherlv_7=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFunctionCallArgumentsAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:590:3: this_FunctionCallListArguments_8= ruleFunctionCallListArguments
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
    // InternalOptGrammar.g:602:1: entryRuleFunctionCallArg returns [EObject current=null] : iv_ruleFunctionCallArg= ruleFunctionCallArg EOF ;
    public final EObject entryRuleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArg = null;


        try {
            // InternalOptGrammar.g:602:56: (iv_ruleFunctionCallArg= ruleFunctionCallArg EOF )
            // InternalOptGrammar.g:603:2: iv_ruleFunctionCallArg= ruleFunctionCallArg EOF
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
    // InternalOptGrammar.g:609:1: ruleFunctionCallArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFunctionCallArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:615:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalOptGrammar.g:616:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalOptGrammar.g:616:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalOptGrammar.g:617:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalOptGrammar.g:617:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:618:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:618:4: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:619:5: lv_name_0_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgAccess().getColonKeyword_1());
              		
            }
            // InternalOptGrammar.g:639:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalOptGrammar.g:640:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:640:4: (lv_expr_2_0= ruleExpression )
            // InternalOptGrammar.g:641:5: lv_expr_2_0= ruleExpression
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


    // $ANTLR start "entryRuleFunctionDefinition"
    // InternalOptGrammar.g:662:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // InternalOptGrammar.g:662:59: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // InternalOptGrammar.g:663:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
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
    // InternalOptGrammar.g:669:1: ruleFunctionDefinition returns [EObject current=null] : (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) ) ;
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
            // InternalOptGrammar.g:675:2: ( (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) ) )
            // InternalOptGrammar.g:676:2: (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) )
            {
            // InternalOptGrammar.g:676:2: (otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' ) )
            // InternalOptGrammar.g:677:3: otherlv_0= 'function' () ( (lv_name_2_0= RULE_ID ) )? ( (lv_parameters_3_0= ruleParameterList ) ) ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )* (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )? ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionDefinitionAccess().getFunctionKeyword_0());
              		
            }
            // InternalOptGrammar.g:681:3: ()
            // InternalOptGrammar.g:682:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:688:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOptGrammar.g:689:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalOptGrammar.g:689:4: (lv_name_2_0= RULE_ID )
                    // InternalOptGrammar.g:690:5: lv_name_2_0= RULE_ID
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
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalOptGrammar.g:706:3: ( (lv_parameters_3_0= ruleParameterList ) )
            // InternalOptGrammar.g:707:4: (lv_parameters_3_0= ruleParameterList )
            {
            // InternalOptGrammar.g:707:4: (lv_parameters_3_0= ruleParameterList )
            // InternalOptGrammar.g:708:5: lv_parameters_3_0= ruleParameterList
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
              						"org.unicam.myGrammar.OptGrammar.ParameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:725:3: ( (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==28||(LA12_0>=170 && LA12_0<=173)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOptGrammar.g:726:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    {
            	    // InternalOptGrammar.g:726:4: (lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement )
            	    // InternalOptGrammar.g:727:5: lv_optionalElements_4_0= ruleFunctionDefinitionOptionalElement
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
            	      						"org.unicam.myGrammar.OptGrammar.FunctionDefinitionOptionalElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalOptGrammar.g:744:3: (otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOptGrammar.g:745:4: otherlv_5= 'returns' ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getReturnsKeyword_5_0());
                      			
                    }
                    // InternalOptGrammar.g:749:4: ( (lv_returnParameters_6_0= ruleReturnsParameterList ) )
                    // InternalOptGrammar.g:750:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    {
                    // InternalOptGrammar.g:750:5: (lv_returnParameters_6_0= ruleReturnsParameterList )
                    // InternalOptGrammar.g:751:6: lv_returnParameters_6_0= ruleReturnsParameterList
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

            // InternalOptGrammar.g:769:3: ( ( (lv_block_7_0= ruleBody ) ) | otherlv_8= ';' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==21) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalOptGrammar.g:770:4: ( (lv_block_7_0= ruleBody ) )
                    {
                    // InternalOptGrammar.g:770:4: ( (lv_block_7_0= ruleBody ) )
                    // InternalOptGrammar.g:771:5: (lv_block_7_0= ruleBody )
                    {
                    // InternalOptGrammar.g:771:5: (lv_block_7_0= ruleBody )
                    // InternalOptGrammar.g:772:6: lv_block_7_0= ruleBody
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
                    // InternalOptGrammar.g:790:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:799:1: entryRuleFunctionDefinitionOptionalElement returns [EObject current=null] : iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF ;
    public final EObject entryRuleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOptionalElement = null;


        try {
            // InternalOptGrammar.g:799:74: (iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF )
            // InternalOptGrammar.g:800:2: iv_ruleFunctionDefinitionOptionalElement= ruleFunctionDefinitionOptionalElement EOF
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
    // InternalOptGrammar.g:806:1: ruleFunctionDefinitionOptionalElement returns [EObject current=null] : (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) ;
    public final EObject ruleFunctionDefinitionOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_ModifierInvocation_1 = null;

        EObject this_VisibilitySpecifier_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:812:2: ( (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier ) )
            // InternalOptGrammar.g:813:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            {
            // InternalOptGrammar.g:813:2: (this_Const_0= ruleConst | this_ModifierInvocation_1= ruleModifierInvocation | this_VisibilitySpecifier_2= ruleVisibilitySpecifier )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case 170:
            case 171:
            case 172:
            case 173:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalOptGrammar.g:814:3: this_Const_0= ruleConst
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
                    // InternalOptGrammar.g:823:3: this_ModifierInvocation_1= ruleModifierInvocation
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
                    // InternalOptGrammar.g:832:3: this_VisibilitySpecifier_2= ruleVisibilitySpecifier
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
    // InternalOptGrammar.g:844:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalOptGrammar.g:844:46: (iv_ruleConst= ruleConst EOF )
            // InternalOptGrammar.g:845:2: iv_ruleConst= ruleConst EOF
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
    // InternalOptGrammar.g:851:1: ruleConst returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:857:2: ( (otherlv_0= 'constant' () ) )
            // InternalOptGrammar.g:858:2: (otherlv_0= 'constant' () )
            {
            // InternalOptGrammar.g:858:2: (otherlv_0= 'constant' () )
            // InternalOptGrammar.g:859:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstAccess().getConstantKeyword_0());
              		
            }
            // InternalOptGrammar.g:863:3: ()
            // InternalOptGrammar.g:864:4: 
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
    // InternalOptGrammar.g:874:1: entryRuleVisibilitySpecifier returns [EObject current=null] : iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF ;
    public final EObject entryRuleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilitySpecifier = null;


        try {
            // InternalOptGrammar.g:874:60: (iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF )
            // InternalOptGrammar.g:875:2: iv_ruleVisibilitySpecifier= ruleVisibilitySpecifier EOF
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
    // InternalOptGrammar.g:881:1: ruleVisibilitySpecifier returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibilityEnum ) ) ;
    public final EObject ruleVisibilitySpecifier() throws RecognitionException {
        EObject current = null;

        EObject lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:887:2: ( ( (lv_visibility_0_0= ruleVisibilityEnum ) ) )
            // InternalOptGrammar.g:888:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            {
            // InternalOptGrammar.g:888:2: ( (lv_visibility_0_0= ruleVisibilityEnum ) )
            // InternalOptGrammar.g:889:3: (lv_visibility_0_0= ruleVisibilityEnum )
            {
            // InternalOptGrammar.g:889:3: (lv_visibility_0_0= ruleVisibilityEnum )
            // InternalOptGrammar.g:890:4: lv_visibility_0_0= ruleVisibilityEnum
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
    // InternalOptGrammar.g:910:1: entryRuleStructDefinition returns [EObject current=null] : iv_ruleStructDefinition= ruleStructDefinition EOF ;
    public final EObject entryRuleStructDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDefinition = null;


        try {
            // InternalOptGrammar.g:910:57: (iv_ruleStructDefinition= ruleStructDefinition EOF )
            // InternalOptGrammar.g:911:2: iv_ruleStructDefinition= ruleStructDefinition EOF
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
    // InternalOptGrammar.g:917:1: ruleStructDefinition returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
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
            // InternalOptGrammar.g:923:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // InternalOptGrammar.g:924:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // InternalOptGrammar.g:924:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // InternalOptGrammar.g:925:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStructDefinitionAccess().getStructKeyword_0());
              		
            }
            // InternalOptGrammar.g:929:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOptGrammar.g:930:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:930:4: (lv_name_1_0= RULE_ID )
            // InternalOptGrammar.g:931:5: lv_name_1_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStructDefinitionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalOptGrammar.g:951:3: ( ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==33||LA16_0==37||(LA16_0>=65 && LA16_0<=166)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOptGrammar.g:952:4: ( (lv_members_3_0= ruleVariableDeclaration ) ) otherlv_4= ';'
            	    {
            	    // InternalOptGrammar.g:952:4: ( (lv_members_3_0= ruleVariableDeclaration ) )
            	    // InternalOptGrammar.g:953:5: (lv_members_3_0= ruleVariableDeclaration )
            	    {
            	    // InternalOptGrammar.g:953:5: (lv_members_3_0= ruleVariableDeclaration )
            	    // InternalOptGrammar.g:954:6: lv_members_3_0= ruleVariableDeclaration
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
            	      							"org.unicam.myGrammar.OptGrammar.VariableDeclaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,21,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getStructDefinitionAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:984:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // InternalOptGrammar.g:984:55: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // InternalOptGrammar.g:985:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
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
    // InternalOptGrammar.g:991:1: ruleEnumDefinition returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalOptGrammar.g:997:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' ) )
            // InternalOptGrammar.g:998:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' )
            {
            // InternalOptGrammar.g:998:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}' )
            // InternalOptGrammar.g:999:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0());
              		
            }
            // InternalOptGrammar.g:1003:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOptGrammar.g:1004:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:1004:4: (lv_name_1_0= RULE_ID )
            // InternalOptGrammar.g:1005:5: lv_name_1_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalOptGrammar.g:1025:3: ( ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOptGrammar.g:1026:4: ( (lv_members_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )*
                    {
                    // InternalOptGrammar.g:1026:4: ( (lv_members_3_0= ruleEnumValue ) )
                    // InternalOptGrammar.g:1027:5: (lv_members_3_0= ruleEnumValue )
                    {
                    // InternalOptGrammar.g:1027:5: (lv_members_3_0= ruleEnumValue )
                    // InternalOptGrammar.g:1028:6: lv_members_3_0= ruleEnumValue
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
                      							"org.unicam.myGrammar.OptGrammar.EnumValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:1045:4: (otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==19) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalOptGrammar.g:1046:5: otherlv_4= ',' ( (lv_members_5_0= ruleEnumValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getEnumDefinitionAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:1050:5: ( (lv_members_5_0= ruleEnumValue ) )
                    	    // InternalOptGrammar.g:1051:6: (lv_members_5_0= ruleEnumValue )
                    	    {
                    	    // InternalOptGrammar.g:1051:6: (lv_members_5_0= ruleEnumValue )
                    	    // InternalOptGrammar.g:1052:7: lv_members_5_0= ruleEnumValue
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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:1079:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalOptGrammar.g:1079:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalOptGrammar.g:1080:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalOptGrammar.g:1086:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1092:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalOptGrammar.g:1093:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalOptGrammar.g:1093:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:1094:3: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:1094:3: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:1095:4: lv_name_0_0= RULE_ID
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
    // InternalOptGrammar.g:1114:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalOptGrammar.g:1114:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalOptGrammar.g:1115:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalOptGrammar.g:1121:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1127:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalOptGrammar.g:1128:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalOptGrammar.g:1128:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalOptGrammar.g:1129:3: (lv_name_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:1129:3: (lv_name_0_0= RULE_ID )
            // InternalOptGrammar.g:1130:4: lv_name_0_0= RULE_ID
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
    // InternalOptGrammar.g:1149:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1149:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalOptGrammar.g:1150:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalOptGrammar.g:1156:1: ruleVariableDeclaration returns [EObject current=null] : (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_StandardVariableDeclaration_0 = null;

        EObject this_VarVariableDeclaration_1 = null;

        EObject this_VarVariableTupleVariableDeclaration_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1162:2: ( (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration ) )
            // InternalOptGrammar.g:1163:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            {
            // InternalOptGrammar.g:1163:2: (this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration | this_VarVariableDeclaration_1= ruleVarVariableDeclaration | this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==33||(LA19_0>=65 && LA19_0<=166)) ) {
                alt19=1;
            }
            else if ( (LA19_0==37) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==RULE_ID) ) {
                    alt19=2;
                }
                else if ( (LA19_2==23) ) {
                    alt19=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalOptGrammar.g:1164:3: this_StandardVariableDeclaration_0= ruleStandardVariableDeclaration
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
                    // InternalOptGrammar.g:1173:3: this_VarVariableDeclaration_1= ruleVarVariableDeclaration
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
                    // InternalOptGrammar.g:1182:3: this_VarVariableTupleVariableDeclaration_2= ruleVarVariableTupleVariableDeclaration
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
    // InternalOptGrammar.g:1194:1: entryRuleStandardVariableDeclaration returns [EObject current=null] : iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF ;
    public final EObject entryRuleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1194:68: (iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF )
            // InternalOptGrammar.g:1195:2: iv_ruleStandardVariableDeclaration= ruleStandardVariableDeclaration EOF
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
    // InternalOptGrammar.g:1201:1: ruleStandardVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleStandardVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_optionalElements_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1207:2: ( ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1208:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1208:2: ( ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1209:3: ( (lv_type_0_0= ruleStandardType ) ) ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1209:3: ( (lv_type_0_0= ruleStandardType ) )
            // InternalOptGrammar.g:1210:4: (lv_type_0_0= ruleStandardType )
            {
            // InternalOptGrammar.g:1210:4: (lv_type_0_0= ruleStandardType )
            // InternalOptGrammar.g:1211:5: lv_type_0_0= ruleStandardType
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

            // InternalOptGrammar.g:1228:3: ( (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28||LA20_0==32||(LA20_0>=167 && LA20_0<=173)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOptGrammar.g:1229:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    {
            	    // InternalOptGrammar.g:1229:4: (lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement )
            	    // InternalOptGrammar.g:1230:5: lv_optionalElements_1_0= ruleVariableDeclarationOptionalElement
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
            	    break loop20;
                }
            } while (true);

            // InternalOptGrammar.g:1247:3: ( (lv_variable_2_0= ruleVariable ) )
            // InternalOptGrammar.g:1248:4: (lv_variable_2_0= ruleVariable )
            {
            // InternalOptGrammar.g:1248:4: (lv_variable_2_0= ruleVariable )
            // InternalOptGrammar.g:1249:5: lv_variable_2_0= ruleVariable
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

            // InternalOptGrammar.g:1266:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOptGrammar.g:1267:4: otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStandardVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalOptGrammar.g:1271:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalOptGrammar.g:1272:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1272:5: (lv_expression_4_0= ruleExpression )
                    // InternalOptGrammar.g:1273:6: lv_expression_4_0= ruleExpression
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
    // InternalOptGrammar.g:1295:1: entryRuleVarVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1295:63: (iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF )
            // InternalOptGrammar.g:1296:2: iv_ruleVarVariableDeclaration= ruleVarVariableDeclaration EOF
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
    // InternalOptGrammar.g:1302:1: ruleVarVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1308:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1309:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1309:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1310:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_variable_1_0= ruleVariable ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1310:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalOptGrammar.g:1311:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalOptGrammar.g:1311:4: (lv_varType_0_0= ruleVarType )
            // InternalOptGrammar.g:1312:5: lv_varType_0_0= ruleVarType
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

            // InternalOptGrammar.g:1329:3: ( (lv_variable_1_0= ruleVariable ) )
            // InternalOptGrammar.g:1330:4: (lv_variable_1_0= ruleVariable )
            {
            // InternalOptGrammar.g:1330:4: (lv_variable_1_0= ruleVariable )
            // InternalOptGrammar.g:1331:5: lv_variable_1_0= ruleVariable
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

            // InternalOptGrammar.g:1348:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOptGrammar.g:1349:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalOptGrammar.g:1353:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalOptGrammar.g:1354:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1354:5: (lv_expression_3_0= ruleExpression )
                    // InternalOptGrammar.g:1355:6: lv_expression_3_0= ruleExpression
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
    // InternalOptGrammar.g:1377:1: entryRuleVarVariableTupleVariableDeclaration returns [EObject current=null] : iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF ;
    public final EObject entryRuleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarVariableTupleVariableDeclaration = null;


        try {
            // InternalOptGrammar.g:1377:76: (iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF )
            // InternalOptGrammar.g:1378:2: iv_ruleVarVariableTupleVariableDeclaration= ruleVarVariableTupleVariableDeclaration EOF
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
    // InternalOptGrammar.g:1384:1: ruleVarVariableTupleVariableDeclaration returns [EObject current=null] : ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVarVariableTupleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        EObject lv_tuple_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1390:2: ( ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalOptGrammar.g:1391:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalOptGrammar.g:1391:2: ( ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalOptGrammar.g:1392:3: ( (lv_varType_0_0= ruleVarType ) ) ( (lv_tuple_1_0= ruleTuple ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalOptGrammar.g:1392:3: ( (lv_varType_0_0= ruleVarType ) )
            // InternalOptGrammar.g:1393:4: (lv_varType_0_0= ruleVarType )
            {
            // InternalOptGrammar.g:1393:4: (lv_varType_0_0= ruleVarType )
            // InternalOptGrammar.g:1394:5: lv_varType_0_0= ruleVarType
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
              						"org.unicam.myGrammar.OptGrammar.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:1411:3: ( (lv_tuple_1_0= ruleTuple ) )
            // InternalOptGrammar.g:1412:4: (lv_tuple_1_0= ruleTuple )
            {
            // InternalOptGrammar.g:1412:4: (lv_tuple_1_0= ruleTuple )
            // InternalOptGrammar.g:1413:5: lv_tuple_1_0= ruleTuple
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

            // InternalOptGrammar.g:1430:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOptGrammar.g:1431:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVarVariableTupleVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalOptGrammar.g:1435:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalOptGrammar.g:1436:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1436:5: (lv_expression_3_0= ruleExpression )
                    // InternalOptGrammar.g:1437:6: lv_expression_3_0= ruleExpression
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
    // InternalOptGrammar.g:1459:1: entryRuleVariableDeclarationOptionalElement returns [EObject current=null] : iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF ;
    public final EObject entryRuleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationOptionalElement = null;


        try {
            // InternalOptGrammar.g:1459:75: (iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF )
            // InternalOptGrammar.g:1460:2: iv_ruleVariableDeclarationOptionalElement= ruleVariableDeclarationOptionalElement EOF
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
    // InternalOptGrammar.g:1466:1: ruleVariableDeclarationOptionalElement returns [EObject current=null] : (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) ;
    public final EObject ruleVariableDeclarationOptionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_VisibilitySpecifier_0 = null;

        EObject this_IndexedSpecifer_1 = null;

        EObject this_ConstantSpecifier_2 = null;

        EObject this_LocationSpecifier_3 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1472:2: ( (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier ) )
            // InternalOptGrammar.g:1473:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            {
            // InternalOptGrammar.g:1473:2: (this_VisibilitySpecifier_0= ruleVisibilitySpecifier | this_IndexedSpecifer_1= ruleIndexedSpecifer | this_ConstantSpecifier_2= ruleConstantSpecifier | this_LocationSpecifier_3= ruleLocationSpecifier )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 170:
            case 171:
            case 172:
            case 173:
                {
                alt24=1;
                }
                break;
            case 32:
                {
                alt24=2;
                }
                break;
            case 28:
                {
                alt24=3;
                }
                break;
            case 167:
            case 168:
            case 169:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalOptGrammar.g:1474:3: this_VisibilitySpecifier_0= ruleVisibilitySpecifier
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
                    // InternalOptGrammar.g:1483:3: this_IndexedSpecifer_1= ruleIndexedSpecifer
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
                    // InternalOptGrammar.g:1492:3: this_ConstantSpecifier_2= ruleConstantSpecifier
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
                    // InternalOptGrammar.g:1501:3: this_LocationSpecifier_3= ruleLocationSpecifier
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
    // InternalOptGrammar.g:1513:1: entryRuleIndexedSpecifer returns [EObject current=null] : iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF ;
    public final EObject entryRuleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedSpecifer = null;


        try {
            // InternalOptGrammar.g:1513:56: (iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF )
            // InternalOptGrammar.g:1514:2: iv_ruleIndexedSpecifer= ruleIndexedSpecifer EOF
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
    // InternalOptGrammar.g:1520:1: ruleIndexedSpecifer returns [EObject current=null] : (otherlv_0= 'indexed' () ) ;
    public final EObject ruleIndexedSpecifer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1526:2: ( (otherlv_0= 'indexed' () ) )
            // InternalOptGrammar.g:1527:2: (otherlv_0= 'indexed' () )
            {
            // InternalOptGrammar.g:1527:2: (otherlv_0= 'indexed' () )
            // InternalOptGrammar.g:1528:3: otherlv_0= 'indexed' ()
            {
            otherlv_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexedSpeciferAccess().getIndexedKeyword_0());
              		
            }
            // InternalOptGrammar.g:1532:3: ()
            // InternalOptGrammar.g:1533:4: 
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
    // InternalOptGrammar.g:1543:1: entryRuleConstantSpecifier returns [EObject current=null] : iv_ruleConstantSpecifier= ruleConstantSpecifier EOF ;
    public final EObject entryRuleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSpecifier = null;


        try {
            // InternalOptGrammar.g:1543:58: (iv_ruleConstantSpecifier= ruleConstantSpecifier EOF )
            // InternalOptGrammar.g:1544:2: iv_ruleConstantSpecifier= ruleConstantSpecifier EOF
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
    // InternalOptGrammar.g:1550:1: ruleConstantSpecifier returns [EObject current=null] : (otherlv_0= 'constant' () ) ;
    public final EObject ruleConstantSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1556:2: ( (otherlv_0= 'constant' () ) )
            // InternalOptGrammar.g:1557:2: (otherlv_0= 'constant' () )
            {
            // InternalOptGrammar.g:1557:2: (otherlv_0= 'constant' () )
            // InternalOptGrammar.g:1558:3: otherlv_0= 'constant' ()
            {
            otherlv_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantSpecifierAccess().getConstantKeyword_0());
              		
            }
            // InternalOptGrammar.g:1562:3: ()
            // InternalOptGrammar.g:1563:4: 
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
    // InternalOptGrammar.g:1573:1: entryRuleLocationSpecifier returns [EObject current=null] : iv_ruleLocationSpecifier= ruleLocationSpecifier EOF ;
    public final EObject entryRuleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifier = null;


        try {
            // InternalOptGrammar.g:1573:58: (iv_ruleLocationSpecifier= ruleLocationSpecifier EOF )
            // InternalOptGrammar.g:1574:2: iv_ruleLocationSpecifier= ruleLocationSpecifier EOF
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
    // InternalOptGrammar.g:1580:1: ruleLocationSpecifier returns [EObject current=null] : ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) ;
    public final EObject ruleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject lv_location_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1586:2: ( ( (lv_location_0_0= ruleLocationSpecifierEnum ) ) )
            // InternalOptGrammar.g:1587:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            {
            // InternalOptGrammar.g:1587:2: ( (lv_location_0_0= ruleLocationSpecifierEnum ) )
            // InternalOptGrammar.g:1588:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            {
            // InternalOptGrammar.g:1588:3: (lv_location_0_0= ruleLocationSpecifierEnum )
            // InternalOptGrammar.g:1589:4: lv_location_0_0= ruleLocationSpecifierEnum
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
    // InternalOptGrammar.g:1609:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalOptGrammar.g:1609:45: (iv_ruleType= ruleType EOF )
            // InternalOptGrammar.g:1610:2: iv_ruleType= ruleType EOF
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
    // InternalOptGrammar.g:1616:1: ruleType returns [EObject current=null] : (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_StandardType_0 = null;

        AntlrDatatypeRuleToken lv_isVarType_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1622:2: ( (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) ) )
            // InternalOptGrammar.g:1623:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            {
            // InternalOptGrammar.g:1623:2: (this_StandardType_0= ruleStandardType | ( (lv_isVarType_1_0= ruleVarType ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||LA25_0==33||(LA25_0>=65 && LA25_0<=166)) ) {
                alt25=1;
            }
            else if ( (LA25_0==37) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalOptGrammar.g:1624:3: this_StandardType_0= ruleStandardType
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
                    // InternalOptGrammar.g:1633:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    {
                    // InternalOptGrammar.g:1633:3: ( (lv_isVarType_1_0= ruleVarType ) )
                    // InternalOptGrammar.g:1634:4: (lv_isVarType_1_0= ruleVarType )
                    {
                    // InternalOptGrammar.g:1634:4: (lv_isVarType_1_0= ruleVarType )
                    // InternalOptGrammar.g:1635:5: lv_isVarType_1_0= ruleVarType
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
    // InternalOptGrammar.g:1656:1: entryRuleStandardType returns [EObject current=null] : iv_ruleStandardType= ruleStandardType EOF ;
    public final EObject entryRuleStandardType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardType = null;


        try {
            // InternalOptGrammar.g:1656:53: (iv_ruleStandardType= ruleStandardType EOF )
            // InternalOptGrammar.g:1657:2: iv_ruleStandardType= ruleStandardType EOF
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
    // InternalOptGrammar.g:1663:1: ruleStandardType returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) ;
    public final EObject ruleStandardType() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;

        EObject this_QualifiedIdentifier_3 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1669:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier ) )
            // InternalOptGrammar.g:1670:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            {
            // InternalOptGrammar.g:1670:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping | this_QualifiedIdentifier_3= ruleQualifiedIdentifier )
            int alt27=3;
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
                {
                alt27=1;
                }
                break;
            case 33:
                {
                alt27=2;
                }
                break;
            case RULE_ID:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalOptGrammar.g:1671:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalOptGrammar.g:1671:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalOptGrammar.g:1672:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
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
                    // InternalOptGrammar.g:1680:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==35) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalOptGrammar.g:1681:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalOptGrammar.g:1681:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalOptGrammar.g:1682:6: lv_dimension_1_0= ruleArrayDimensions
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
                    // InternalOptGrammar.g:1701:3: this_Mapping_2= ruleMapping
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
                    // InternalOptGrammar.g:1710:3: this_QualifiedIdentifier_3= ruleQualifiedIdentifier
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
    // InternalOptGrammar.g:1722:1: entryRuleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF ;
    public final EObject entryRuleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardTypeWithoutQualifiedIdentifier = null;


        try {
            // InternalOptGrammar.g:1722:79: (iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF )
            // InternalOptGrammar.g:1723:2: iv_ruleStandardTypeWithoutQualifiedIdentifier= ruleStandardTypeWithoutQualifiedIdentifier EOF
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
    // InternalOptGrammar.g:1729:1: ruleStandardTypeWithoutQualifiedIdentifier returns [EObject current=null] : ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) ;
    public final EObject ruleStandardTypeWithoutQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_ElementaryType_0 = null;

        EObject lv_dimension_1_0 = null;

        EObject this_Mapping_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1735:2: ( ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping ) )
            // InternalOptGrammar.g:1736:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            {
            // InternalOptGrammar.g:1736:2: ( (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? ) | this_Mapping_2= ruleMapping )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=65 && LA29_0<=166)) ) {
                alt29=1;
            }
            else if ( (LA29_0==33) ) {
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
                    // InternalOptGrammar.g:1737:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    {
                    // InternalOptGrammar.g:1737:3: (this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )? )
                    // InternalOptGrammar.g:1738:4: this_ElementaryType_0= ruleElementaryType ( (lv_dimension_1_0= ruleArrayDimensions ) )?
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
                    // InternalOptGrammar.g:1746:4: ( (lv_dimension_1_0= ruleArrayDimensions ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==35) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalOptGrammar.g:1747:5: (lv_dimension_1_0= ruleArrayDimensions )
                            {
                            // InternalOptGrammar.g:1747:5: (lv_dimension_1_0= ruleArrayDimensions )
                            // InternalOptGrammar.g:1748:6: lv_dimension_1_0= ruleArrayDimensions
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
                    // InternalOptGrammar.g:1767:3: this_Mapping_2= ruleMapping
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
    // InternalOptGrammar.g:1779:1: entryRuleElementaryType returns [EObject current=null] : iv_ruleElementaryType= ruleElementaryType EOF ;
    public final EObject entryRuleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryType = null;


        try {
            // InternalOptGrammar.g:1779:55: (iv_ruleElementaryType= ruleElementaryType EOF )
            // InternalOptGrammar.g:1780:2: iv_ruleElementaryType= ruleElementaryType EOF
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
    // InternalOptGrammar.g:1786:1: ruleElementaryType returns [EObject current=null] : ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) ;
    public final EObject ruleElementaryType() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:1792:2: ( ( (lv_name_0_0= ruleElementaryTypeNameEnum ) ) )
            // InternalOptGrammar.g:1793:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            {
            // InternalOptGrammar.g:1793:2: ( (lv_name_0_0= ruleElementaryTypeNameEnum ) )
            // InternalOptGrammar.g:1794:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalOptGrammar.g:1794:3: (lv_name_0_0= ruleElementaryTypeNameEnum )
            // InternalOptGrammar.g:1795:4: lv_name_0_0= ruleElementaryTypeNameEnum
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
    // InternalOptGrammar.g:1815:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalOptGrammar.g:1815:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalOptGrammar.g:1816:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalOptGrammar.g:1822:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) ;
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
            // InternalOptGrammar.g:1828:2: ( (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' ) )
            // InternalOptGrammar.g:1829:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            {
            // InternalOptGrammar.g:1829:2: (otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')' )
            // InternalOptGrammar.g:1830:3: otherlv_0= 'mapping' otherlv_1= '(' ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) ) otherlv_3= '=>' ( (lv_valueType_4_0= ruleType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:1838:3: ( (lv_keyType_2_0= ruleElementaryTypeNameEnum ) )
            // InternalOptGrammar.g:1839:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            {
            // InternalOptGrammar.g:1839:4: (lv_keyType_2_0= ruleElementaryTypeNameEnum )
            // InternalOptGrammar.g:1840:5: lv_keyType_2_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMappingAccess().getKeyTypeElementaryTypeNameEnumParserRuleCall_2_0());
              				
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

            otherlv_3=(Token)match(input,34,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalOptGrammar.g:1861:3: ( (lv_valueType_4_0= ruleType ) )
            // InternalOptGrammar.g:1862:4: (lv_valueType_4_0= ruleType )
            {
            // InternalOptGrammar.g:1862:4: (lv_valueType_4_0= ruleType )
            // InternalOptGrammar.g:1863:5: lv_valueType_4_0= ruleType
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
              						"org.unicam.myGrammar.OptGrammar.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:1888:1: entryRuleArrayDimensions returns [EObject current=null] : iv_ruleArrayDimensions= ruleArrayDimensions EOF ;
    public final EObject entryRuleArrayDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimensions = null;


        try {
            // InternalOptGrammar.g:1888:56: (iv_ruleArrayDimensions= ruleArrayDimensions EOF )
            // InternalOptGrammar.g:1889:2: iv_ruleArrayDimensions= ruleArrayDimensions EOF
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
    // InternalOptGrammar.g:1895:1: ruleArrayDimensions returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) ;
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
            // InternalOptGrammar.g:1901:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* ) )
            // InternalOptGrammar.g:1902:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            {
            // InternalOptGrammar.g:1902:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )* )
            // InternalOptGrammar.g:1903:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:1907:3: ()
            // InternalOptGrammar.g:1908:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayDimensionsAccess().getArrayDimensionsAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:1914:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||LA30_0==23||(LA30_0>=58 && LA30_0<=166)||(LA30_0>=208 && LA30_0<=211)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOptGrammar.g:1915:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:1915:4: (lv_value_2_0= ruleExpression )
                    // InternalOptGrammar.g:1916:5: lv_value_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,36,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalOptGrammar.g:1937:3: (otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOptGrammar.g:1938:4: otherlv_4= '[' ( (lv_value_5_0= ruleExpression ) )? otherlv_6= ']'
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getArrayDimensionsAccess().getLeftSquareBracketKeyword_4_0());
            	      			
            	    }
            	    // InternalOptGrammar.g:1942:4: ( (lv_value_5_0= ruleExpression ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)||LA31_0==23||(LA31_0>=58 && LA31_0<=166)||(LA31_0>=208 && LA31_0<=211)) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalOptGrammar.g:1943:5: (lv_value_5_0= ruleExpression )
            	            {
            	            // InternalOptGrammar.g:1943:5: (lv_value_5_0= ruleExpression )
            	            // InternalOptGrammar.g:1944:6: lv_value_5_0= ruleExpression
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

            	    otherlv_6=(Token)match(input,36,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getArrayDimensionsAccess().getRightSquareBracketKeyword_4_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalOptGrammar.g:1970:1: entryRuleVarType returns [String current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final String entryRuleVarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarType = null;


        try {
            // InternalOptGrammar.g:1970:47: (iv_ruleVarType= ruleVarType EOF )
            // InternalOptGrammar.g:1971:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalOptGrammar.g:1977:1: ruleVarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:1983:2: (kw= 'var' )
            // InternalOptGrammar.g:1984:2: kw= 'var'
            {
            kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:1992:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalOptGrammar.g:1992:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalOptGrammar.g:1993:2: iv_ruleTuple= ruleTuple EOF
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
    // InternalOptGrammar.g:1999:1: ruleTuple returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_3_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2005:2: ( (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:2006:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:2006:2: (otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')' )
            // InternalOptGrammar.g:2007:3: otherlv_0= '(' () ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:2011:3: ()
            // InternalOptGrammar.g:2012:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleAccess().getTupleAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:2018:3: ( ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STRING)||LA36_0==19||LA36_0==23||(LA36_0>=58 && LA36_0<=166)||(LA36_0>=208 && LA36_0<=211)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOptGrammar.g:2019:4: ( (lv_members_2_0= ruleExpression ) )? ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    {
                    // InternalOptGrammar.g:2019:4: ( (lv_members_2_0= ruleExpression ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)||LA33_0==23||(LA33_0>=58 && LA33_0<=166)||(LA33_0>=208 && LA33_0<=211)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalOptGrammar.g:2020:5: (lv_members_2_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2020:5: (lv_members_2_0= ruleExpression )
                            // InternalOptGrammar.g:2021:6: lv_members_2_0= ruleExpression
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

                    // InternalOptGrammar.g:2038:4: ( ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )? )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==19) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2039:5: ( (lv_members_3_0= ruleTupleSeparator ) ) ( (lv_members_4_0= ruleExpression ) )?
                    	    {
                    	    // InternalOptGrammar.g:2039:5: ( (lv_members_3_0= ruleTupleSeparator ) )
                    	    // InternalOptGrammar.g:2040:6: (lv_members_3_0= ruleTupleSeparator )
                    	    {
                    	    // InternalOptGrammar.g:2040:6: (lv_members_3_0= ruleTupleSeparator )
                    	    // InternalOptGrammar.g:2041:7: lv_members_3_0= ruleTupleSeparator
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

                    	    // InternalOptGrammar.g:2058:5: ( (lv_members_4_0= ruleExpression ) )?
                    	    int alt34=2;
                    	    int LA34_0 = input.LA(1);

                    	    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==23||(LA34_0>=58 && LA34_0<=166)||(LA34_0>=208 && LA34_0<=211)) ) {
                    	        alt34=1;
                    	    }
                    	    switch (alt34) {
                    	        case 1 :
                    	            // InternalOptGrammar.g:2059:6: (lv_members_4_0= ruleExpression )
                    	            {
                    	            // InternalOptGrammar.g:2059:6: (lv_members_4_0= ruleExpression )
                    	            // InternalOptGrammar.g:2060:7: lv_members_4_0= ruleExpression
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
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:2087:1: entryRuleTupleSeparator returns [EObject current=null] : iv_ruleTupleSeparator= ruleTupleSeparator EOF ;
    public final EObject entryRuleTupleSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleSeparator = null;


        try {
            // InternalOptGrammar.g:2087:55: (iv_ruleTupleSeparator= ruleTupleSeparator EOF )
            // InternalOptGrammar.g:2088:2: iv_ruleTupleSeparator= ruleTupleSeparator EOF
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
    // InternalOptGrammar.g:2094:1: ruleTupleSeparator returns [EObject current=null] : (otherlv_0= ',' () ) ;
    public final EObject ruleTupleSeparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:2100:2: ( (otherlv_0= ',' () ) )
            // InternalOptGrammar.g:2101:2: (otherlv_0= ',' () )
            {
            // InternalOptGrammar.g:2101:2: (otherlv_0= ',' () )
            // InternalOptGrammar.g:2102:3: otherlv_0= ',' ()
            {
            otherlv_0=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleSeparatorAccess().getCommaKeyword_0());
              		
            }
            // InternalOptGrammar.g:2106:3: ()
            // InternalOptGrammar.g:2107:4: 
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
    // InternalOptGrammar.g:2117:1: entryRuleSimpleStatement returns [EObject current=null] : iv_ruleSimpleStatement= ruleSimpleStatement EOF ;
    public final EObject entryRuleSimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement = null;


        try {
            // InternalOptGrammar.g:2117:56: (iv_ruleSimpleStatement= ruleSimpleStatement EOF )
            // InternalOptGrammar.g:2118:2: iv_ruleSimpleStatement= ruleSimpleStatement EOF
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
    // InternalOptGrammar.g:2124:1: ruleSimpleStatement returns [EObject current=null] : ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) ;
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
            // InternalOptGrammar.g:2130:2: ( ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) ) )
            // InternalOptGrammar.g:2131:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            {
            // InternalOptGrammar.g:2131:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) ) )
            // InternalOptGrammar.g:2132:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ( (lv_semicolon_16_0= ';' ) )
            {
            // InternalOptGrammar.g:2132:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt40=3;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalOptGrammar.g:2133:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalOptGrammar.g:2133:4: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalOptGrammar.g:2134:5: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
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
                    // InternalOptGrammar.g:2142:5: ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalOptGrammar.g:2143:6: () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalOptGrammar.g:2143:6: ()
                    // InternalOptGrammar.g:2144:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getSimpleStatementAccess().getStandardVariableDeclarationTypeAction_0_0_1_0(),
                      								current);
                      						
                    }

                    }

                    // InternalOptGrammar.g:2150:6: ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==28||LA37_0==32||(LA37_0>=167 && LA37_0<=173)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2151:7: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalOptGrammar.g:2151:7: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalOptGrammar.g:2152:8: lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getSimpleStatementAccess().getOptionalElementsVariableDeclarationOptionalElementParserRuleCall_0_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_23);
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
                    	      									"org.unicam.myGrammar.OptGrammar.VariableDeclarationOptionalElement");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    // InternalOptGrammar.g:2169:6: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalOptGrammar.g:2170:7: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:2170:7: (lv_variable_3_0= ruleVariable )
                    // InternalOptGrammar.g:2171:8: lv_variable_3_0= ruleVariable
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

                    // InternalOptGrammar.g:2188:6: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==31) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalOptGrammar.g:2189:7: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_0_1_3_0());
                              						
                            }
                            // InternalOptGrammar.g:2193:7: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalOptGrammar.g:2194:8: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2194:8: (lv_expression_5_0= ruleExpression )
                            // InternalOptGrammar.g:2195:9: lv_expression_5_0= ruleExpression
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
                    // InternalOptGrammar.g:2216:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalOptGrammar.g:2216:4: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalOptGrammar.g:2217:5: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
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
                    // InternalOptGrammar.g:2224:5: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==23) ) {
                        alt39=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalOptGrammar.g:2225:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2225:6: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2226:7: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2226:7: ()
                            // InternalOptGrammar.g:2227:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTypeDeclarationAction_0_1_1_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalOptGrammar.g:2233:7: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalOptGrammar.g:2234:8: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalOptGrammar.g:2234:8: (lv_variable_8_0= ruleVariable )
                            // InternalOptGrammar.g:2235:9: lv_variable_8_0= ruleVariable
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

                            // InternalOptGrammar.g:2252:7: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2253:8: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_9, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_0_2_0());
                              							
                            }
                            // InternalOptGrammar.g:2257:8: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalOptGrammar.g:2258:9: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2258:9: (lv_expression_10_0= ruleExpression )
                            // InternalOptGrammar.g:2259:10: lv_expression_10_0= ruleExpression
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
                            // InternalOptGrammar.g:2279:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2279:6: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2280:7: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2280:7: ()
                            // InternalOptGrammar.g:2281:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElement(
                              									grammarAccess.getSimpleStatementAccess().getVarVariableTupleVariableDeclarationAction_0_1_1_1_0(),
                              									current);
                              							
                            }

                            }

                            // InternalOptGrammar.g:2287:7: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalOptGrammar.g:2288:8: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalOptGrammar.g:2288:8: (lv_tuple_12_0= ruleTuple )
                            // InternalOptGrammar.g:2289:9: lv_tuple_12_0= ruleTuple
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

                            // InternalOptGrammar.g:2306:7: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2307:8: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_13, grammarAccess.getSimpleStatementAccess().getEqualsSignKeyword_0_1_1_1_2_0());
                              							
                            }
                            // InternalOptGrammar.g:2311:8: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalOptGrammar.g:2312:9: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2312:9: (lv_expression_14_0= ruleExpression )
                            // InternalOptGrammar.g:2313:10: lv_expression_14_0= ruleExpression
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
                    // InternalOptGrammar.g:2335:4: this_ExpressionStatement_15= ruleExpressionStatement
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

            // InternalOptGrammar.g:2344:3: ( (lv_semicolon_16_0= ';' ) )
            // InternalOptGrammar.g:2345:4: (lv_semicolon_16_0= ';' )
            {
            // InternalOptGrammar.g:2345:4: (lv_semicolon_16_0= ';' )
            // InternalOptGrammar.g:2346:5: lv_semicolon_16_0= ';'
            {
            lv_semicolon_16_0=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:2362:1: entryRuleSimpleStatement2 returns [EObject current=null] : iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF ;
    public final EObject entryRuleSimpleStatement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStatement2 = null;


        try {
            // InternalOptGrammar.g:2362:57: (iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF )
            // InternalOptGrammar.g:2363:2: iv_ruleSimpleStatement2= ruleSimpleStatement2 EOF
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
    // InternalOptGrammar.g:2369:1: ruleSimpleStatement2 returns [EObject current=null] : ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) ;
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
            // InternalOptGrammar.g:2375:2: ( ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement ) )
            // InternalOptGrammar.g:2376:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            {
            // InternalOptGrammar.g:2376:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalOptGrammar.g:2377:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    {
                    // InternalOptGrammar.g:2377:3: (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
                    // InternalOptGrammar.g:2378:4: this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
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
                    // InternalOptGrammar.g:2386:4: ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? )
                    // InternalOptGrammar.g:2387:5: () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    {
                    // InternalOptGrammar.g:2387:5: ()
                    // InternalOptGrammar.g:2388:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getSimpleStatement2Access().getStandardVariableDeclarationTypeAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalOptGrammar.g:2394:5: ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==28||LA41_0==32||(LA41_0>=167 && LA41_0<=173)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalOptGrammar.g:2395:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    {
                    	    // InternalOptGrammar.g:2395:6: (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement )
                    	    // InternalOptGrammar.g:2396:7: lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement
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
                    	    break loop41;
                        }
                    } while (true);

                    // InternalOptGrammar.g:2413:5: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalOptGrammar.g:2414:6: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:2414:6: (lv_variable_3_0= ruleVariable )
                    // InternalOptGrammar.g:2415:7: lv_variable_3_0= ruleVariable
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

                    // InternalOptGrammar.g:2432:5: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==31) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalOptGrammar.g:2433:6: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                            {
                            otherlv_4=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_0_1_3_0());
                              					
                            }
                            // InternalOptGrammar.g:2437:6: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalOptGrammar.g:2438:7: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2438:7: (lv_expression_5_0= ruleExpression )
                            // InternalOptGrammar.g:2439:8: lv_expression_5_0= ruleExpression
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
                    // InternalOptGrammar.g:2460:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    {
                    // InternalOptGrammar.g:2460:3: ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) )
                    // InternalOptGrammar.g:2461:4: ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
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
                    // InternalOptGrammar.g:2468:4: ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==23) ) {
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
                            // InternalOptGrammar.g:2469:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2469:5: ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2470:6: () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2470:6: ()
                            // InternalOptGrammar.g:2471:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTypeDeclarationAction_1_1_0_0(),
                              								current);
                              						
                            }

                            }

                            // InternalOptGrammar.g:2477:6: ( (lv_variable_8_0= ruleVariable ) )
                            // InternalOptGrammar.g:2478:7: (lv_variable_8_0= ruleVariable )
                            {
                            // InternalOptGrammar.g:2478:7: (lv_variable_8_0= ruleVariable )
                            // InternalOptGrammar.g:2479:8: lv_variable_8_0= ruleVariable
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

                            // InternalOptGrammar.g:2496:6: (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2497:7: otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) )
                            {
                            otherlv_9=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_9, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_0_2_0());
                              						
                            }
                            // InternalOptGrammar.g:2501:7: ( (lv_expression_10_0= ruleExpression ) )
                            // InternalOptGrammar.g:2502:8: (lv_expression_10_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2502:8: (lv_expression_10_0= ruleExpression )
                            // InternalOptGrammar.g:2503:9: lv_expression_10_0= ruleExpression
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
                            // InternalOptGrammar.g:2523:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            {
                            // InternalOptGrammar.g:2523:5: ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) )
                            // InternalOptGrammar.g:2524:6: () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            {
                            // InternalOptGrammar.g:2524:6: ()
                            // InternalOptGrammar.g:2525:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElement(
                              								grammarAccess.getSimpleStatement2Access().getVarVariableTupleVariableDeclarationAction_1_1_1_0(),
                              								current);
                              						
                            }

                            }

                            // InternalOptGrammar.g:2531:6: ( (lv_tuple_12_0= ruleTuple ) )
                            // InternalOptGrammar.g:2532:7: (lv_tuple_12_0= ruleTuple )
                            {
                            // InternalOptGrammar.g:2532:7: (lv_tuple_12_0= ruleTuple )
                            // InternalOptGrammar.g:2533:8: lv_tuple_12_0= ruleTuple
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

                            // InternalOptGrammar.g:2550:6: (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) )
                            // InternalOptGrammar.g:2551:7: otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) )
                            {
                            otherlv_13=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_13, grammarAccess.getSimpleStatement2Access().getEqualsSignKeyword_1_1_1_2_0());
                              						
                            }
                            // InternalOptGrammar.g:2555:7: ( (lv_expression_14_0= ruleExpression ) )
                            // InternalOptGrammar.g:2556:8: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:2556:8: (lv_expression_14_0= ruleExpression )
                            // InternalOptGrammar.g:2557:9: lv_expression_14_0= ruleExpression
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
                    // InternalOptGrammar.g:2579:3: this_ExpressionStatement_15= ruleExpressionStatement
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
    // InternalOptGrammar.g:2591:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalOptGrammar.g:2591:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalOptGrammar.g:2592:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
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
    // InternalOptGrammar.g:2598:1: ruleExpressionStatement returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2604:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalOptGrammar.g:2605:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalOptGrammar.g:2605:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalOptGrammar.g:2606:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalOptGrammar.g:2606:3: (lv_expression_0_0= ruleExpression )
            // InternalOptGrammar.g:2607:4: lv_expression_0_0= ruleExpression
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
    // InternalOptGrammar.g:2627:1: entryRuleQualifiedIdentifier returns [EObject current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final EObject entryRuleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedIdentifier = null;


        try {
            // InternalOptGrammar.g:2627:60: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // InternalOptGrammar.g:2628:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
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
    // InternalOptGrammar.g:2634:1: ruleQualifiedIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) ;
    public final EObject ruleQualifiedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        EObject lv_qualifiers_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2640:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* ) )
            // InternalOptGrammar.g:2641:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            {
            // InternalOptGrammar.g:2641:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )* )
            // InternalOptGrammar.g:2642:3: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_qualifiers_1_0= ruleQualifier ) )*
            {
            // InternalOptGrammar.g:2642:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalOptGrammar.g:2643:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalOptGrammar.g:2643:4: (lv_identifier_0_0= RULE_ID )
            // InternalOptGrammar.g:2644:5: lv_identifier_0_0= RULE_ID
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

            // InternalOptGrammar.g:2660:3: ( (lv_qualifiers_1_0= ruleQualifier ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==23||LA45_0==35||LA45_0==38) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalOptGrammar.g:2661:4: (lv_qualifiers_1_0= ruleQualifier )
            	    {
            	    // InternalOptGrammar.g:2661:4: (lv_qualifiers_1_0= ruleQualifier )
            	    // InternalOptGrammar.g:2662:5: lv_qualifiers_1_0= ruleQualifier
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
            	    break loop45;
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
    // InternalOptGrammar.g:2683:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalOptGrammar.g:2683:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalOptGrammar.g:2684:2: iv_ruleQualifier= ruleQualifier EOF
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
    // InternalOptGrammar.g:2690:1: ruleQualifier returns [EObject current=null] : (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Index_1 = null;

        EObject this_Arguments_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2696:2: ( (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments ) )
            // InternalOptGrammar.g:2697:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            {
            // InternalOptGrammar.g:2697:2: (this_Field_0= ruleField | this_Index_1= ruleIndex | this_Arguments_2= ruleArguments )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt46=1;
                }
                break;
            case 35:
                {
                alt46=2;
                }
                break;
            case 23:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalOptGrammar.g:2698:3: this_Field_0= ruleField
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
                    // InternalOptGrammar.g:2707:3: this_Index_1= ruleIndex
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
                    // InternalOptGrammar.g:2716:3: this_Arguments_2= ruleArguments
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
    // InternalOptGrammar.g:2728:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalOptGrammar.g:2728:46: (iv_ruleField= ruleField EOF )
            // InternalOptGrammar.g:2729:2: iv_ruleField= ruleField EOF
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
    // InternalOptGrammar.g:2735:1: ruleField returns [EObject current=null] : (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_field_1_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:2741:2: ( (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) ) )
            // InternalOptGrammar.g:2742:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            {
            // InternalOptGrammar.g:2742:2: (otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) ) )
            // InternalOptGrammar.g:2743:3: otherlv_0= '.' ( (lv_field_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFullStopKeyword_0());
              		
            }
            // InternalOptGrammar.g:2747:3: ( (lv_field_1_0= RULE_ID ) )
            // InternalOptGrammar.g:2748:4: (lv_field_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:2748:4: (lv_field_1_0= RULE_ID )
            // InternalOptGrammar.g:2749:5: lv_field_1_0= RULE_ID
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
    // InternalOptGrammar.g:2769:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // InternalOptGrammar.g:2769:46: (iv_ruleIndex= ruleIndex EOF )
            // InternalOptGrammar.g:2770:2: iv_ruleIndex= ruleIndex EOF
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
    // InternalOptGrammar.g:2776:1: ruleIndex returns [EObject current=null] : (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2782:2: ( (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' ) )
            // InternalOptGrammar.g:2783:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            {
            // InternalOptGrammar.g:2783:2: (otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']' )
            // InternalOptGrammar.g:2784:3: otherlv_0= '[' () ( (lv_value_2_0= ruleExpression ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:2788:3: ()
            // InternalOptGrammar.g:2789:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndexAccess().getIndexAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:2795:3: ( (lv_value_2_0= ruleExpression ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_STRING)||LA47_0==23||(LA47_0>=58 && LA47_0<=166)||(LA47_0>=208 && LA47_0<=211)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOptGrammar.g:2796:4: (lv_value_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:2796:4: (lv_value_2_0= ruleExpression )
                    // InternalOptGrammar.g:2797:5: lv_value_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:2822:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalOptGrammar.g:2822:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalOptGrammar.g:2823:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalOptGrammar.g:2829:1: ruleArguments returns [EObject current=null] : ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2835:2: ( ( (lv_arguments_0_0= ruleFunctionCallArguments ) ) )
            // InternalOptGrammar.g:2836:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            {
            // InternalOptGrammar.g:2836:2: ( (lv_arguments_0_0= ruleFunctionCallArguments ) )
            // InternalOptGrammar.g:2837:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            {
            // InternalOptGrammar.g:2837:3: (lv_arguments_0_0= ruleFunctionCallArguments )
            // InternalOptGrammar.g:2838:4: lv_arguments_0_0= ruleFunctionCallArguments
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
    // InternalOptGrammar.g:2858:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalOptGrammar.g:2858:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalOptGrammar.g:2859:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalOptGrammar.g:2865:1: ruleModifier returns [EObject current=null] : (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2871:2: ( (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) ) )
            // InternalOptGrammar.g:2872:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) )
            {
            // InternalOptGrammar.g:2872:2: (otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) ) )
            // InternalOptGrammar.g:2873:3: otherlv_0= 'modifier' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_block_3_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModifierAccess().getModifierKeyword_0());
              		
            }
            // InternalOptGrammar.g:2877:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOptGrammar.g:2878:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:2878:4: (lv_name_1_0= RULE_ID )
            // InternalOptGrammar.g:2879:5: lv_name_1_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalOptGrammar.g:2895:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==23) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOptGrammar.g:2896:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalOptGrammar.g:2896:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalOptGrammar.g:2897:5: lv_parameters_2_0= ruleParameterList
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
                      						"org.unicam.myGrammar.OptGrammar.ParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalOptGrammar.g:2914:3: ( (lv_block_3_0= ruleBody ) )
            // InternalOptGrammar.g:2915:4: (lv_block_3_0= ruleBody )
            {
            // InternalOptGrammar.g:2915:4: (lv_block_3_0= ruleBody )
            // InternalOptGrammar.g:2916:5: lv_block_3_0= ruleBody
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
    // InternalOptGrammar.g:2937:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalOptGrammar.g:2937:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalOptGrammar.g:2938:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalOptGrammar.g:2944:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isAnonymous_3_0=null;
        Token otherlv_4=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:2950:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' ) )
            // InternalOptGrammar.g:2951:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' )
            {
            // InternalOptGrammar.g:2951:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';' )
            // InternalOptGrammar.g:2952:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? ( (lv_isAnonymous_3_0= 'anonymous' ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
              		
            }
            // InternalOptGrammar.g:2956:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOptGrammar.g:2957:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOptGrammar.g:2957:4: (lv_name_1_0= RULE_ID )
            // InternalOptGrammar.g:2958:5: lv_name_1_0= RULE_ID
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
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalOptGrammar.g:2974:3: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==23) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOptGrammar.g:2975:4: (lv_parameters_2_0= ruleParameterList )
                    {
                    // InternalOptGrammar.g:2975:4: (lv_parameters_2_0= ruleParameterList )
                    // InternalOptGrammar.g:2976:5: lv_parameters_2_0= ruleParameterList
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
                      						"org.unicam.myGrammar.OptGrammar.ParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalOptGrammar.g:2993:3: ( (lv_isAnonymous_3_0= 'anonymous' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==41) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOptGrammar.g:2994:4: (lv_isAnonymous_3_0= 'anonymous' )
                    {
                    // InternalOptGrammar.g:2994:4: (lv_isAnonymous_3_0= 'anonymous' )
                    // InternalOptGrammar.g:2995:5: lv_isAnonymous_3_0= 'anonymous'
                    {
                    lv_isAnonymous_3_0=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3015:1: entryRuleModifierInvocation returns [EObject current=null] : iv_ruleModifierInvocation= ruleModifierInvocation EOF ;
    public final EObject entryRuleModifierInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierInvocation = null;


        try {
            // InternalOptGrammar.g:3015:59: (iv_ruleModifierInvocation= ruleModifierInvocation EOF )
            // InternalOptGrammar.g:3016:2: iv_ruleModifierInvocation= ruleModifierInvocation EOF
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
    // InternalOptGrammar.g:3022:1: ruleModifierInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) ;
    public final EObject ruleModifierInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3028:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? ) )
            // InternalOptGrammar.g:3029:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            {
            // InternalOptGrammar.g:3029:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )? )
            // InternalOptGrammar.g:3030:3: ( (otherlv_0= RULE_ID ) ) ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            {
            // InternalOptGrammar.g:3030:3: ( (otherlv_0= RULE_ID ) )
            // InternalOptGrammar.g:3031:4: (otherlv_0= RULE_ID )
            {
            // InternalOptGrammar.g:3031:4: (otherlv_0= RULE_ID )
            // InternalOptGrammar.g:3032:5: otherlv_0= RULE_ID
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

            // InternalOptGrammar.g:3043:3: ( (lv_args_1_0= ruleFunctionCallListArguments ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==23) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOptGrammar.g:3044:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    {
                    // InternalOptGrammar.g:3044:4: (lv_args_1_0= ruleFunctionCallListArguments )
                    // InternalOptGrammar.g:3045:5: lv_args_1_0= ruleFunctionCallListArguments
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
    // InternalOptGrammar.g:3066:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalOptGrammar.g:3066:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalOptGrammar.g:3067:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalOptGrammar.g:3073:1: ruleParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3079:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:3080:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:3080:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:3081:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:3085:3: ()
            // InternalOptGrammar.g:3086:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3092:3: ( ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||LA53_0==33||LA53_0==37||(LA53_0>=65 && LA53_0<=166)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOptGrammar.g:3093:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // InternalOptGrammar.g:3093:4: ( (lv_parameters_2_0= ruleVariableDeclaration ) )
                    // InternalOptGrammar.g:3094:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    {
                    // InternalOptGrammar.g:3094:5: (lv_parameters_2_0= ruleVariableDeclaration )
                    // InternalOptGrammar.g:3095:6: lv_parameters_2_0= ruleVariableDeclaration
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
                      							"org.unicam.myGrammar.OptGrammar.VariableDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:3112:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==19) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalOptGrammar.g:3113:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:3117:5: ( (lv_parameters_4_0= ruleVariableDeclaration ) )
                    	    // InternalOptGrammar.g:3118:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalOptGrammar.g:3118:6: (lv_parameters_4_0= ruleVariableDeclaration )
                    	    // InternalOptGrammar.g:3119:7: lv_parameters_4_0= ruleVariableDeclaration
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
                    	      								"org.unicam.myGrammar.OptGrammar.VariableDeclaration");
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

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3146:1: entryRuleReturnsParameterList returns [EObject current=null] : iv_ruleReturnsParameterList= ruleReturnsParameterList EOF ;
    public final EObject entryRuleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsParameterList = null;


        try {
            // InternalOptGrammar.g:3146:61: (iv_ruleReturnsParameterList= ruleReturnsParameterList EOF )
            // InternalOptGrammar.g:3147:2: iv_ruleReturnsParameterList= ruleReturnsParameterList EOF
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
    // InternalOptGrammar.g:3153:1: ruleReturnsParameterList returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleReturnsParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3159:2: ( (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' ) )
            // InternalOptGrammar.g:3160:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            {
            // InternalOptGrammar.g:3160:2: (otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')' )
            // InternalOptGrammar.g:3161:3: otherlv_0= '(' () ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnsParameterListAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalOptGrammar.g:3165:3: ()
            // InternalOptGrammar.g:3166:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnsParameterListAccess().getReturnsParameterListAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3172:3: ( ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||LA55_0==33||LA55_0==37||(LA55_0>=65 && LA55_0<=166)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOptGrammar.g:3173:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    {
                    // InternalOptGrammar.g:3173:4: ( (lv_parameters_2_0= ruleReturnParameterDeclaration ) )
                    // InternalOptGrammar.g:3174:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    {
                    // InternalOptGrammar.g:3174:5: (lv_parameters_2_0= ruleReturnParameterDeclaration )
                    // InternalOptGrammar.g:3175:6: lv_parameters_2_0= ruleReturnParameterDeclaration
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
                      							"org.unicam.myGrammar.OptGrammar.ReturnParameterDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalOptGrammar.g:3192:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==19) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalOptGrammar.g:3193:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReturnsParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalOptGrammar.g:3197:5: ( (lv_parameters_4_0= ruleReturnParameterDeclaration ) )
                    	    // InternalOptGrammar.g:3198:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    {
                    	    // InternalOptGrammar.g:3198:6: (lv_parameters_4_0= ruleReturnParameterDeclaration )
                    	    // InternalOptGrammar.g:3199:7: lv_parameters_4_0= ruleReturnParameterDeclaration
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
                    	      								"org.unicam.myGrammar.OptGrammar.ReturnParameterDeclaration");
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

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3226:1: entryRuleReturnParameterDeclaration returns [EObject current=null] : iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF ;
    public final EObject entryRuleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterDeclaration = null;


        try {
            // InternalOptGrammar.g:3226:67: (iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF )
            // InternalOptGrammar.g:3227:2: iv_ruleReturnParameterDeclaration= ruleReturnParameterDeclaration EOF
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
    // InternalOptGrammar.g:3233:1: ruleReturnParameterDeclaration returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) ;
    public final EObject ruleReturnParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_typeRef_0_0 = null;

        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3239:2: ( ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? ) )
            // InternalOptGrammar.g:3240:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            {
            // InternalOptGrammar.g:3240:2: ( ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )? )
            // InternalOptGrammar.g:3241:3: ( (lv_typeRef_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) )?
            {
            // InternalOptGrammar.g:3241:3: ( (lv_typeRef_0_0= ruleType ) )
            // InternalOptGrammar.g:3242:4: (lv_typeRef_0_0= ruleType )
            {
            // InternalOptGrammar.g:3242:4: (lv_typeRef_0_0= ruleType )
            // InternalOptGrammar.g:3243:5: lv_typeRef_0_0= ruleType
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
              						"org.unicam.myGrammar.OptGrammar.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:3260:3: ( (lv_variable_1_0= ruleVariable ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOptGrammar.g:3261:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:3261:4: (lv_variable_1_0= ruleVariable )
                    // InternalOptGrammar.g:3262:5: lv_variable_1_0= ruleVariable
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
    // InternalOptGrammar.g:3283:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalOptGrammar.g:3283:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalOptGrammar.g:3284:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalOptGrammar.g:3290:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) ;
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
            // InternalOptGrammar.g:3296:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) ) )
            // InternalOptGrammar.g:3297:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            {
            // InternalOptGrammar.g:3297:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_ForStatement_2= ruleForStatement | this_Body_3= ruleBody | this_PlaceHolderStatement_4= rulePlaceHolderStatement | (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt58=1;
                }
                break;
            case 45:
                {
                alt58=2;
                }
                break;
            case 46:
                {
                alt58=3;
                }
                break;
            case 20:
                {
                alt58=4;
                }
                break;
            case 51:
                {
                alt58=5;
                }
                break;
            case RULE_ID:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case RULE_NOW:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_STRING:
            case 23:
            case 33:
            case 37:
            case 42:
            case 47:
            case 48:
            case 49:
            case 50:
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
            case 208:
            case 209:
            case 210:
            case 211:
                {
                alt58=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalOptGrammar.g:3298:3: this_IfStatement_0= ruleIfStatement
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
                    // InternalOptGrammar.g:3307:3: this_WhileStatement_1= ruleWhileStatement
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
                    // InternalOptGrammar.g:3316:3: this_ForStatement_2= ruleForStatement
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
                    // InternalOptGrammar.g:3325:3: this_Body_3= ruleBody
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
                    // InternalOptGrammar.g:3334:3: this_PlaceHolderStatement_4= rulePlaceHolderStatement
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
                    // InternalOptGrammar.g:3343:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    {
                    // InternalOptGrammar.g:3343:3: (this_ContinueStatement_5= ruleContinueStatement | this_BreakStatement_6= ruleBreakStatement | this_ReturnStatement_7= ruleReturnStatement | this_ThrowStatement_8= ruleThrowStatement | this_DeleteStatement_9= ruleDeleteStatement | this_SimpleStatement_10= ruleSimpleStatement )
                    int alt57=6;
                    switch ( input.LA(1) ) {
                    case 47:
                        {
                        alt57=1;
                        }
                        break;
                    case 48:
                        {
                        alt57=2;
                        }
                        break;
                    case 49:
                        {
                        alt57=3;
                        }
                        break;
                    case 50:
                        {
                        alt57=4;
                        }
                        break;
                    case 42:
                        {
                        alt57=5;
                        }
                        break;
                    case RULE_ID:
                    case RULE_BLOCK:
                    case RULE_MSG:
                    case RULE_TX:
                    case RULE_NOW:
                    case RULE_INT:
                    case RULE_HEX:
                    case RULE_DECIMAL:
                    case RULE_STRING:
                    case 23:
                    case 33:
                    case 37:
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
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                        {
                        alt57=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }

                    switch (alt57) {
                        case 1 :
                            // InternalOptGrammar.g:3344:4: this_ContinueStatement_5= ruleContinueStatement
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
                            // InternalOptGrammar.g:3353:4: this_BreakStatement_6= ruleBreakStatement
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
                            // InternalOptGrammar.g:3362:4: this_ReturnStatement_7= ruleReturnStatement
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
                            // InternalOptGrammar.g:3371:4: this_ThrowStatement_8= ruleThrowStatement
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
                            // InternalOptGrammar.g:3380:4: this_DeleteStatement_9= ruleDeleteStatement
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
                            // InternalOptGrammar.g:3389:4: this_SimpleStatement_10= ruleSimpleStatement
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
    // InternalOptGrammar.g:3402:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // InternalOptGrammar.g:3402:56: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // InternalOptGrammar.g:3403:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
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
    // InternalOptGrammar.g:3409:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3415:2: ( (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' ) )
            // InternalOptGrammar.g:3416:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3416:2: (otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';' )
            // InternalOptGrammar.g:3417:3: otherlv_0= 'delete' ( (lv_variable_1_0= ruleQualifiedIdentifier ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
              		
            }
            // InternalOptGrammar.g:3421:3: ( (lv_variable_1_0= ruleQualifiedIdentifier ) )
            // InternalOptGrammar.g:3422:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            {
            // InternalOptGrammar.g:3422:4: (lv_variable_1_0= ruleQualifiedIdentifier )
            // InternalOptGrammar.g:3423:5: lv_variable_1_0= ruleQualifiedIdentifier
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
              						"org.unicam.myGrammar.OptGrammar.QualifiedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3448:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalOptGrammar.g:3448:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalOptGrammar.g:3449:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalOptGrammar.g:3455:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) ;
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
            // InternalOptGrammar.g:3461:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? ) )
            // InternalOptGrammar.g:3462:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            {
            // InternalOptGrammar.g:3462:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )? )
            // InternalOptGrammar.g:3463:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_trueBody_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3471:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalOptGrammar.g:3472:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:3472:4: (lv_condition_2_0= ruleExpression )
            // InternalOptGrammar.g:3473:5: lv_condition_2_0= ruleExpression
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
              						"org.unicam.myGrammar.OptGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalOptGrammar.g:3494:3: ( (lv_trueBody_4_0= ruleStatement ) )
            // InternalOptGrammar.g:3495:4: (lv_trueBody_4_0= ruleStatement )
            {
            // InternalOptGrammar.g:3495:4: (lv_trueBody_4_0= ruleStatement )
            // InternalOptGrammar.g:3496:5: lv_trueBody_4_0= ruleStatement
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
              						"org.unicam.myGrammar.OptGrammar.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalOptGrammar.g:3513:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred1_InternalOptGrammar()) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // InternalOptGrammar.g:3514:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_falseBody_6_0= ruleStatement ) )
                    {
                    // InternalOptGrammar.g:3514:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalOptGrammar.g:3515:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalOptGrammar.g:3521:4: ( (lv_falseBody_6_0= ruleStatement ) )
                    // InternalOptGrammar.g:3522:5: (lv_falseBody_6_0= ruleStatement )
                    {
                    // InternalOptGrammar.g:3522:5: (lv_falseBody_6_0= ruleStatement )
                    // InternalOptGrammar.g:3523:6: lv_falseBody_6_0= ruleStatement
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
    // InternalOptGrammar.g:3545:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalOptGrammar.g:3545:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalOptGrammar.g:3546:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalOptGrammar.g:3552:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3558:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) )
            // InternalOptGrammar.g:3559:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // InternalOptGrammar.g:3559:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            // InternalOptGrammar.g:3560:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3568:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalOptGrammar.g:3569:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:3569:4: (lv_condition_2_0= ruleExpression )
            // InternalOptGrammar.g:3570:5: lv_condition_2_0= ruleExpression
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
              						"org.unicam.myGrammar.OptGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalOptGrammar.g:3591:3: ( (lv_body_4_0= ruleStatement ) )
            // InternalOptGrammar.g:3592:4: (lv_body_4_0= ruleStatement )
            {
            // InternalOptGrammar.g:3592:4: (lv_body_4_0= ruleStatement )
            // InternalOptGrammar.g:3593:5: lv_body_4_0= ruleStatement
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
    // InternalOptGrammar.g:3614:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalOptGrammar.g:3614:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalOptGrammar.g:3615:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalOptGrammar.g:3621:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) ;
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
            // InternalOptGrammar.g:3627:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) ) )
            // InternalOptGrammar.g:3628:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            {
            // InternalOptGrammar.g:3628:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) ) )
            // InternalOptGrammar.g:3629:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )? ( ( ';' )=>otherlv_3= ';' ) ( (lv_conditionExpression_4_0= ruleExpression ) )? otherlv_5= ';' ( (lv_loopExpression_6_0= ruleExpressionStatement ) )? otherlv_7= ')' ( (lv_body_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:3637:3: ( (lv_initExpression_2_0= ruleSimpleStatement2 ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_STRING)||LA60_0==23||LA60_0==33||LA60_0==37||(LA60_0>=58 && LA60_0<=166)||(LA60_0>=208 && LA60_0<=211)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOptGrammar.g:3638:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    {
                    // InternalOptGrammar.g:3638:4: (lv_initExpression_2_0= ruleSimpleStatement2 )
                    // InternalOptGrammar.g:3639:5: lv_initExpression_2_0= ruleSimpleStatement2
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
                      						"org.unicam.myGrammar.OptGrammar.SimpleStatement2");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalOptGrammar.g:3656:3: ( ( ';' )=>otherlv_3= ';' )
            // InternalOptGrammar.g:3657:4: ( ';' )=>otherlv_3= ';'
            {
            otherlv_3=(Token)match(input,21,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
              			
            }

            }

            // InternalOptGrammar.g:3663:3: ( (lv_conditionExpression_4_0= ruleExpression ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_STRING)||LA61_0==23||(LA61_0>=58 && LA61_0<=166)||(LA61_0>=208 && LA61_0<=211)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOptGrammar.g:3664:4: (lv_conditionExpression_4_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:3664:4: (lv_conditionExpression_4_0= ruleExpression )
                    // InternalOptGrammar.g:3665:5: lv_conditionExpression_4_0= ruleExpression
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
                      						"org.unicam.myGrammar.OptGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_5());
              		
            }
            // InternalOptGrammar.g:3686:3: ( (lv_loopExpression_6_0= ruleExpressionStatement ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_STRING)||LA62_0==23||(LA62_0>=58 && LA62_0<=166)||(LA62_0>=208 && LA62_0<=211)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOptGrammar.g:3687:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    {
                    // InternalOptGrammar.g:3687:4: (lv_loopExpression_6_0= ruleExpressionStatement )
                    // InternalOptGrammar.g:3688:5: lv_loopExpression_6_0= ruleExpressionStatement
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
                      						"org.unicam.myGrammar.OptGrammar.ExpressionStatement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalOptGrammar.g:3709:3: ( (lv_body_8_0= ruleStatement ) )
            // InternalOptGrammar.g:3710:4: (lv_body_8_0= ruleStatement )
            {
            // InternalOptGrammar.g:3710:4: (lv_body_8_0= ruleStatement )
            // InternalOptGrammar.g:3711:5: lv_body_8_0= ruleStatement
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
    // InternalOptGrammar.g:3732:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalOptGrammar.g:3732:45: (iv_ruleBody= ruleBody EOF )
            // InternalOptGrammar.g:3733:2: iv_ruleBody= ruleBody EOF
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
    // InternalOptGrammar.g:3739:1: ruleBody returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3745:2: ( (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) )
            // InternalOptGrammar.g:3746:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            {
            // InternalOptGrammar.g:3746:2: (otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            // InternalOptGrammar.g:3747:3: otherlv_0= '{' () ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalOptGrammar.g:3751:3: ()
            // InternalOptGrammar.g:3752:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBodyAccess().getBlockAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3758:3: ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_STRING)||LA64_0==20||LA64_0==23||LA64_0==33||LA64_0==37||(LA64_0>=42 && LA64_0<=43)||(LA64_0>=45 && LA64_0<=51)||(LA64_0>=58 && LA64_0<=166)||(LA64_0>=208 && LA64_0<=211)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalOptGrammar.g:3759:4: ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )*
                    {
                    // InternalOptGrammar.g:3759:4: ( (lv_statements_2_0= ruleStatement ) )
                    // InternalOptGrammar.g:3760:5: (lv_statements_2_0= ruleStatement )
                    {
                    // InternalOptGrammar.g:3760:5: (lv_statements_2_0= ruleStatement )
                    // InternalOptGrammar.g:3761:6: lv_statements_2_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBodyAccess().getStatementsStatementParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
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

                    // InternalOptGrammar.g:3778:4: ( (lv_statements_3_0= ruleStatement ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_STRING)||LA63_0==20||LA63_0==23||LA63_0==33||LA63_0==37||(LA63_0>=42 && LA63_0<=43)||(LA63_0>=45 && LA63_0<=51)||(LA63_0>=58 && LA63_0<=166)||(LA63_0>=208 && LA63_0<=211)) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalOptGrammar.g:3779:5: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // InternalOptGrammar.g:3779:5: (lv_statements_3_0= ruleStatement )
                    	    // InternalOptGrammar.g:3780:6: lv_statements_3_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBodyAccess().getStatementsStatementParserRuleCall_2_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_48);
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
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3806:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // InternalOptGrammar.g:3806:58: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalOptGrammar.g:3807:2: iv_ruleContinueStatement= ruleContinueStatement EOF
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
    // InternalOptGrammar.g:3813:1: ruleContinueStatement returns [EObject current=null] : (otherlv_0= 'continue' () otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3819:2: ( (otherlv_0= 'continue' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:3820:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3820:2: (otherlv_0= 'continue' () otherlv_2= ';' )
            // InternalOptGrammar.g:3821:3: otherlv_0= 'continue' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContinueStatementAccess().getContinueKeyword_0());
              		
            }
            // InternalOptGrammar.g:3825:3: ()
            // InternalOptGrammar.g:3826:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContinueStatementAccess().getContinueAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3840:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalOptGrammar.g:3840:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalOptGrammar.g:3841:2: iv_ruleBreakStatement= ruleBreakStatement EOF
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
    // InternalOptGrammar.g:3847:1: ruleBreakStatement returns [EObject current=null] : (otherlv_0= 'break' () otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3853:2: ( (otherlv_0= 'break' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:3854:2: (otherlv_0= 'break' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3854:2: (otherlv_0= 'break' () otherlv_2= ';' )
            // InternalOptGrammar.g:3855:3: otherlv_0= 'break' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakStatementAccess().getBreakKeyword_0());
              		
            }
            // InternalOptGrammar.g:3859:3: ()
            // InternalOptGrammar.g:3860:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBreakStatementAccess().getBreakStatementAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3874:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalOptGrammar.g:3874:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalOptGrammar.g:3875:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalOptGrammar.g:3881:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:3887:2: ( (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) )
            // InternalOptGrammar.g:3888:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            {
            // InternalOptGrammar.g:3888:2: (otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            // InternalOptGrammar.g:3889:3: otherlv_0= 'return' () ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
              		
            }
            // InternalOptGrammar.g:3893:3: ()
            // InternalOptGrammar.g:3894:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_1(),
              					current);
              			
            }

            }

            // InternalOptGrammar.g:3900:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_STRING)||LA65_0==23||(LA65_0>=58 && LA65_0<=166)||(LA65_0>=208 && LA65_0<=211)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOptGrammar.g:3901:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:3901:4: (lv_expression_2_0= ruleExpression )
                    // InternalOptGrammar.g:3902:5: lv_expression_2_0= ruleExpression
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
                      						"org.unicam.myGrammar.OptGrammar.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3927:1: entryRuleThrowStatement returns [EObject current=null] : iv_ruleThrowStatement= ruleThrowStatement EOF ;
    public final EObject entryRuleThrowStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStatement = null;


        try {
            // InternalOptGrammar.g:3927:55: (iv_ruleThrowStatement= ruleThrowStatement EOF )
            // InternalOptGrammar.g:3928:2: iv_ruleThrowStatement= ruleThrowStatement EOF
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
    // InternalOptGrammar.g:3934:1: ruleThrowStatement returns [EObject current=null] : (otherlv_0= 'throw' () otherlv_2= ';' ) ;
    public final EObject ruleThrowStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3940:2: ( (otherlv_0= 'throw' () otherlv_2= ';' ) )
            // InternalOptGrammar.g:3941:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            {
            // InternalOptGrammar.g:3941:2: (otherlv_0= 'throw' () otherlv_2= ';' )
            // InternalOptGrammar.g:3942:3: otherlv_0= 'throw' () otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getThrowStatementAccess().getThrowKeyword_0());
              		
            }
            // InternalOptGrammar.g:3946:3: ()
            // InternalOptGrammar.g:3947:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getThrowStatementAccess().getThrowStatementAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:3961:1: entryRulePlaceHolderStatement returns [EObject current=null] : iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF ;
    public final EObject entryRulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceHolderStatement = null;


        try {
            // InternalOptGrammar.g:3961:61: (iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF )
            // InternalOptGrammar.g:3962:2: iv_rulePlaceHolderStatement= rulePlaceHolderStatement EOF
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
    // InternalOptGrammar.g:3968:1: rulePlaceHolderStatement returns [EObject current=null] : (otherlv_0= '_' () ) ;
    public final EObject rulePlaceHolderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:3974:2: ( (otherlv_0= '_' () ) )
            // InternalOptGrammar.g:3975:2: (otherlv_0= '_' () )
            {
            // InternalOptGrammar.g:3975:2: (otherlv_0= '_' () )
            // InternalOptGrammar.g:3976:3: otherlv_0= '_' ()
            {
            otherlv_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlaceHolderStatementAccess().get_Keyword_0());
              		
            }
            // InternalOptGrammar.g:3980:3: ()
            // InternalOptGrammar.g:3981:4: 
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
    // InternalOptGrammar.g:3991:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalOptGrammar.g:3991:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalOptGrammar.g:3992:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalOptGrammar.g:3998:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4004:2: (this_Assignment_0= ruleAssignment )
            // InternalOptGrammar.g:4005:2: this_Assignment_0= ruleAssignment
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
    // InternalOptGrammar.g:4016:1: entryRuleSpecialExpression returns [EObject current=null] : iv_ruleSpecialExpression= ruleSpecialExpression EOF ;
    public final EObject entryRuleSpecialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialExpression = null;


        try {
            // InternalOptGrammar.g:4016:58: (iv_ruleSpecialExpression= ruleSpecialExpression EOF )
            // InternalOptGrammar.g:4017:2: iv_ruleSpecialExpression= ruleSpecialExpression EOF
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
    // InternalOptGrammar.g:4023:1: ruleSpecialExpression returns [EObject current=null] : ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) ;
    public final EObject ruleSpecialExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_fieldOrMethod_1_0 = null;

        EObject lv_qualifiers_2_1 = null;

        EObject lv_qualifiers_2_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4029:2: ( ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* ) )
            // InternalOptGrammar.g:4030:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            {
            // InternalOptGrammar.g:4030:2: ( ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )* )
            // InternalOptGrammar.g:4031:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) ) ( (lv_fieldOrMethod_1_0= ruleField ) )? ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            {
            // InternalOptGrammar.g:4031:3: ( (lv_type_0_0= ruleSpecialExpressionTypeEnum ) )
            // InternalOptGrammar.g:4032:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            {
            // InternalOptGrammar.g:4032:4: (lv_type_0_0= ruleSpecialExpressionTypeEnum )
            // InternalOptGrammar.g:4033:5: lv_type_0_0= ruleSpecialExpressionTypeEnum
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

            // InternalOptGrammar.g:4050:3: ( (lv_fieldOrMethod_1_0= ruleField ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==38) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalOptGrammar.g:4051:4: (lv_fieldOrMethod_1_0= ruleField )
                    {
                    // InternalOptGrammar.g:4051:4: (lv_fieldOrMethod_1_0= ruleField )
                    // InternalOptGrammar.g:4052:5: lv_fieldOrMethod_1_0= ruleField
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

            // InternalOptGrammar.g:4069:3: ( ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==23||LA68_0==35) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalOptGrammar.g:4070:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    {
            	    // InternalOptGrammar.g:4070:4: ( (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments ) )
            	    // InternalOptGrammar.g:4071:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    {
            	    // InternalOptGrammar.g:4071:5: (lv_qualifiers_2_1= ruleIndex | lv_qualifiers_2_2= ruleArguments )
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==35) ) {
            	        alt67=1;
            	    }
            	    else if ( (LA67_0==23) ) {
            	        alt67=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 67, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalOptGrammar.g:4072:6: lv_qualifiers_2_1= ruleIndex
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
            	            // InternalOptGrammar.g:4088:6: lv_qualifiers_2_2= ruleArguments
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
            	    break loop68;
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
    // InternalOptGrammar.g:4110:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalOptGrammar.g:4110:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalOptGrammar.g:4111:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalOptGrammar.g:4117:1: ruleAssignment returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) ;
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
            // InternalOptGrammar.g:4123:2: ( (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? ) )
            // InternalOptGrammar.g:4124:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            {
            // InternalOptGrammar.g:4124:2: (this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )? )
            // InternalOptGrammar.g:4125:3: this_BinaryExpression_0= ruleBinaryExpression ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
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
            // InternalOptGrammar.g:4133:3: ( ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) ) | ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? ) )?
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==31||(LA70_0>=184 && LA70_0<=194)) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_ID) ) {
                alt70=2;
            }
            switch (alt70) {
                case 1 :
                    // InternalOptGrammar.g:4134:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // InternalOptGrammar.g:4134:4: ( () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) ) )
                    // InternalOptGrammar.g:4135:5: () ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) ) ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // InternalOptGrammar.g:4135:5: ()
                    // InternalOptGrammar.g:4136:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalOptGrammar.g:4142:5: ( (lv_assignmentOp_2_0= ruleAssignmentOpEnum ) )
                    // InternalOptGrammar.g:4143:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    {
                    // InternalOptGrammar.g:4143:6: (lv_assignmentOp_2_0= ruleAssignmentOpEnum )
                    // InternalOptGrammar.g:4144:7: lv_assignmentOp_2_0= ruleAssignmentOpEnum
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
                      								"org.unicam.myGrammar.OptGrammar.AssignmentOpEnum");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalOptGrammar.g:4161:5: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalOptGrammar.g:4162:6: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalOptGrammar.g:4162:6: (lv_expression_3_0= ruleExpression )
                    // InternalOptGrammar.g:4163:7: lv_expression_3_0= ruleExpression
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
                    // InternalOptGrammar.g:4182:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    {
                    // InternalOptGrammar.g:4182:4: ( () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )? )
                    // InternalOptGrammar.g:4183:5: () ( (lv_variable_5_0= ruleVariable ) ) (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    {
                    // InternalOptGrammar.g:4183:5: ()
                    // InternalOptGrammar.g:4184:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentAccess().getVariableDeclarationExpressionTypeAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalOptGrammar.g:4190:5: ( (lv_variable_5_0= ruleVariable ) )
                    // InternalOptGrammar.g:4191:6: (lv_variable_5_0= ruleVariable )
                    {
                    // InternalOptGrammar.g:4191:6: (lv_variable_5_0= ruleVariable )
                    // InternalOptGrammar.g:4192:7: lv_variable_5_0= ruleVariable
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

                    // InternalOptGrammar.g:4209:5: (otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==31) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalOptGrammar.g:4210:6: otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) )
                            {
                            otherlv_6=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1_2_0());
                              					
                            }
                            // InternalOptGrammar.g:4214:6: ( (lv_expression_7_0= ruleExpression ) )
                            // InternalOptGrammar.g:4215:7: (lv_expression_7_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:4215:7: (lv_expression_7_0= ruleExpression )
                            // InternalOptGrammar.g:4216:8: lv_expression_7_0= ruleExpression
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
    // InternalOptGrammar.g:4240:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalOptGrammar.g:4240:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalOptGrammar.g:4241:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalOptGrammar.g:4247:1: ruleBinaryExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4253:2: (this_Or_0= ruleOr )
            // InternalOptGrammar.g:4254:2: this_Or_0= ruleOr
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
    // InternalOptGrammar.g:4265:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalOptGrammar.g:4265:43: (iv_ruleOr= ruleOr EOF )
            // InternalOptGrammar.g:4266:2: iv_ruleOr= ruleOr EOF
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
    // InternalOptGrammar.g:4272:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4278:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalOptGrammar.g:4279:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalOptGrammar.g:4279:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalOptGrammar.g:4280:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
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
            // InternalOptGrammar.g:4288:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==52) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalOptGrammar.g:4289:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalOptGrammar.g:4289:4: ()
            	    // InternalOptGrammar.g:4290:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4300:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalOptGrammar.g:4301:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalOptGrammar.g:4301:5: (lv_right_3_0= ruleAnd )
            	    // InternalOptGrammar.g:4302:6: lv_right_3_0= ruleAnd
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
            	      							"org.unicam.myGrammar.OptGrammar.And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalOptGrammar.g:4324:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalOptGrammar.g:4324:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalOptGrammar.g:4325:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalOptGrammar.g:4331:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4337:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalOptGrammar.g:4338:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalOptGrammar.g:4338:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalOptGrammar.g:4339:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
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
            // InternalOptGrammar.g:4347:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==53) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalOptGrammar.g:4348:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalOptGrammar.g:4348:4: ()
            	    // InternalOptGrammar.g:4349:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4359:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalOptGrammar.g:4360:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalOptGrammar.g:4360:5: (lv_right_3_0= ruleEquality )
            	    // InternalOptGrammar.g:4361:6: lv_right_3_0= ruleEquality
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
            	      							"org.unicam.myGrammar.OptGrammar.Equality");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalOptGrammar.g:4383:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalOptGrammar.g:4383:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalOptGrammar.g:4384:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalOptGrammar.g:4390:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_equalityOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4396:2: ( (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalOptGrammar.g:4397:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalOptGrammar.g:4397:2: (this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalOptGrammar.g:4398:3: this_Comparison_0= ruleComparison ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
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
            // InternalOptGrammar.g:4406:3: ( () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=195 && LA73_0<=196)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalOptGrammar.g:4407:4: () ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalOptGrammar.g:4407:4: ()
            	    // InternalOptGrammar.g:4408:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalOptGrammar.g:4414:4: ( (lv_equalityOp_2_0= ruleEqualityOpEnum ) )
            	    // InternalOptGrammar.g:4415:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    {
            	    // InternalOptGrammar.g:4415:5: (lv_equalityOp_2_0= ruleEqualityOpEnum )
            	    // InternalOptGrammar.g:4416:6: lv_equalityOp_2_0= ruleEqualityOpEnum
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
            	      							"org.unicam.myGrammar.OptGrammar.EqualityOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalOptGrammar.g:4433:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalOptGrammar.g:4434:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalOptGrammar.g:4434:5: (lv_right_3_0= ruleComparison )
            	    // InternalOptGrammar.g:4435:6: lv_right_3_0= ruleComparison
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
            	      							"org.unicam.myGrammar.OptGrammar.Comparison");
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalOptGrammar.g:4457:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalOptGrammar.g:4457:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalOptGrammar.g:4458:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalOptGrammar.g:4464:1: ruleComparison returns [EObject current=null] : (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BitOr_0 = null;

        Enumerator lv_comparisonOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4470:2: ( (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* ) )
            // InternalOptGrammar.g:4471:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            {
            // InternalOptGrammar.g:4471:2: (this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )* )
            // InternalOptGrammar.g:4472:3: this_BitOr_0= ruleBitOr ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
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
            // InternalOptGrammar.g:4480:3: ( () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=197 && LA74_0<=201)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalOptGrammar.g:4481:4: () ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) ) ( (lv_right_3_0= ruleBitOr ) )
            	    {
            	    // InternalOptGrammar.g:4481:4: ()
            	    // InternalOptGrammar.g:4482:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalOptGrammar.g:4488:4: ( (lv_comparisonOp_2_0= ruleComparisonOpEnum ) )
            	    // InternalOptGrammar.g:4489:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    {
            	    // InternalOptGrammar.g:4489:5: (lv_comparisonOp_2_0= ruleComparisonOpEnum )
            	    // InternalOptGrammar.g:4490:6: lv_comparisonOp_2_0= ruleComparisonOpEnum
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
            	      							"org.unicam.myGrammar.OptGrammar.ComparisonOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalOptGrammar.g:4507:4: ( (lv_right_3_0= ruleBitOr ) )
            	    // InternalOptGrammar.g:4508:5: (lv_right_3_0= ruleBitOr )
            	    {
            	    // InternalOptGrammar.g:4508:5: (lv_right_3_0= ruleBitOr )
            	    // InternalOptGrammar.g:4509:6: lv_right_3_0= ruleBitOr
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
            	      							"org.unicam.myGrammar.OptGrammar.BitOr");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBitOr"
    // InternalOptGrammar.g:4531:1: entryRuleBitOr returns [EObject current=null] : iv_ruleBitOr= ruleBitOr EOF ;
    public final EObject entryRuleBitOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitOr = null;


        try {
            // InternalOptGrammar.g:4531:46: (iv_ruleBitOr= ruleBitOr EOF )
            // InternalOptGrammar.g:4532:2: iv_ruleBitOr= ruleBitOr EOF
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
    // InternalOptGrammar.g:4538:1: ruleBitOr returns [EObject current=null] : (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) ;
    public final EObject ruleBitOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitXor_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4544:2: ( (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* ) )
            // InternalOptGrammar.g:4545:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            {
            // InternalOptGrammar.g:4545:2: (this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )* )
            // InternalOptGrammar.g:4546:3: this_BitXor_0= ruleBitXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
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
            // InternalOptGrammar.g:4554:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==54) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalOptGrammar.g:4555:4: () otherlv_2= '|' ( (lv_right_3_0= ruleBitXor ) )
            	    {
            	    // InternalOptGrammar.g:4555:4: ()
            	    // InternalOptGrammar.g:4556:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitOrAccess().getBitOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitOrAccess().getVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4566:4: ( (lv_right_3_0= ruleBitXor ) )
            	    // InternalOptGrammar.g:4567:5: (lv_right_3_0= ruleBitXor )
            	    {
            	    // InternalOptGrammar.g:4567:5: (lv_right_3_0= ruleBitXor )
            	    // InternalOptGrammar.g:4568:6: lv_right_3_0= ruleBitXor
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
            	      							"org.unicam.myGrammar.OptGrammar.BitXor");
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
    // $ANTLR end "ruleBitOr"


    // $ANTLR start "entryRuleBitXor"
    // InternalOptGrammar.g:4590:1: entryRuleBitXor returns [EObject current=null] : iv_ruleBitXor= ruleBitXor EOF ;
    public final EObject entryRuleBitXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitXor = null;


        try {
            // InternalOptGrammar.g:4590:47: (iv_ruleBitXor= ruleBitXor EOF )
            // InternalOptGrammar.g:4591:2: iv_ruleBitXor= ruleBitXor EOF
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
    // InternalOptGrammar.g:4597:1: ruleBitXor returns [EObject current=null] : (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) ;
    public final EObject ruleBitXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitAnd_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4603:2: ( (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* ) )
            // InternalOptGrammar.g:4604:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            {
            // InternalOptGrammar.g:4604:2: (this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )* )
            // InternalOptGrammar.g:4605:3: this_BitAnd_0= ruleBitAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
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
            // InternalOptGrammar.g:4613:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==55) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalOptGrammar.g:4614:4: () otherlv_2= '^' ( (lv_right_3_0= ruleBitAnd ) )
            	    {
            	    // InternalOptGrammar.g:4614:4: ()
            	    // InternalOptGrammar.g:4615:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitXorAccess().getBitXorLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitXorAccess().getCircumflexAccentKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4625:4: ( (lv_right_3_0= ruleBitAnd ) )
            	    // InternalOptGrammar.g:4626:5: (lv_right_3_0= ruleBitAnd )
            	    {
            	    // InternalOptGrammar.g:4626:5: (lv_right_3_0= ruleBitAnd )
            	    // InternalOptGrammar.g:4627:6: lv_right_3_0= ruleBitAnd
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
            	      							"org.unicam.myGrammar.OptGrammar.BitAnd");
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
    // $ANTLR end "ruleBitXor"


    // $ANTLR start "entryRuleBitAnd"
    // InternalOptGrammar.g:4649:1: entryRuleBitAnd returns [EObject current=null] : iv_ruleBitAnd= ruleBitAnd EOF ;
    public final EObject entryRuleBitAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitAnd = null;


        try {
            // InternalOptGrammar.g:4649:47: (iv_ruleBitAnd= ruleBitAnd EOF )
            // InternalOptGrammar.g:4650:2: iv_ruleBitAnd= ruleBitAnd EOF
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
    // InternalOptGrammar.g:4656:1: ruleBitAnd returns [EObject current=null] : (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) ;
    public final EObject ruleBitAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Shift_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4662:2: ( (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* ) )
            // InternalOptGrammar.g:4663:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            {
            // InternalOptGrammar.g:4663:2: (this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )* )
            // InternalOptGrammar.g:4664:3: this_Shift_0= ruleShift ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
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
            // InternalOptGrammar.g:4672:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==56) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalOptGrammar.g:4673:4: () otherlv_2= '&' ( (lv_right_3_0= ruleShift ) )
            	    {
            	    // InternalOptGrammar.g:4673:4: ()
            	    // InternalOptGrammar.g:4674:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitAndAccess().getBitAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitAndAccess().getAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4684:4: ( (lv_right_3_0= ruleShift ) )
            	    // InternalOptGrammar.g:4685:5: (lv_right_3_0= ruleShift )
            	    {
            	    // InternalOptGrammar.g:4685:5: (lv_right_3_0= ruleShift )
            	    // InternalOptGrammar.g:4686:6: lv_right_3_0= ruleShift
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
            	      							"org.unicam.myGrammar.OptGrammar.Shift");
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
    // $ANTLR end "ruleBitAnd"


    // $ANTLR start "entryRuleShift"
    // InternalOptGrammar.g:4708:1: entryRuleShift returns [EObject current=null] : iv_ruleShift= ruleShift EOF ;
    public final EObject entryRuleShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShift = null;


        try {
            // InternalOptGrammar.g:4708:46: (iv_ruleShift= ruleShift EOF )
            // InternalOptGrammar.g:4709:2: iv_ruleShift= ruleShift EOF
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
    // InternalOptGrammar.g:4715:1: ruleShift returns [EObject current=null] : (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) ;
    public final EObject ruleShift() throws RecognitionException {
        EObject current = null;

        EObject this_AddSub_0 = null;

        Enumerator lv_shiftOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4721:2: ( (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* ) )
            // InternalOptGrammar.g:4722:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            {
            // InternalOptGrammar.g:4722:2: (this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )* )
            // InternalOptGrammar.g:4723:3: this_AddSub_0= ruleAddSub ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
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
            // InternalOptGrammar.g:4731:3: ( () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=202 && LA78_0<=204)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalOptGrammar.g:4732:4: () ( (lv_shiftOp_2_0= ruleShiftOpEnum ) ) ( (lv_right_3_0= ruleAddSub ) )
            	    {
            	    // InternalOptGrammar.g:4732:4: ()
            	    // InternalOptGrammar.g:4733:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getShiftAccess().getShiftLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalOptGrammar.g:4739:4: ( (lv_shiftOp_2_0= ruleShiftOpEnum ) )
            	    // InternalOptGrammar.g:4740:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    {
            	    // InternalOptGrammar.g:4740:5: (lv_shiftOp_2_0= ruleShiftOpEnum )
            	    // InternalOptGrammar.g:4741:6: lv_shiftOp_2_0= ruleShiftOpEnum
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
            	      							"org.unicam.myGrammar.OptGrammar.ShiftOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalOptGrammar.g:4758:4: ( (lv_right_3_0= ruleAddSub ) )
            	    // InternalOptGrammar.g:4759:5: (lv_right_3_0= ruleAddSub )
            	    {
            	    // InternalOptGrammar.g:4759:5: (lv_right_3_0= ruleAddSub )
            	    // InternalOptGrammar.g:4760:6: lv_right_3_0= ruleAddSub
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
            	      							"org.unicam.myGrammar.OptGrammar.AddSub");
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
    // $ANTLR end "ruleShift"


    // $ANTLR start "entryRuleAddSub"
    // InternalOptGrammar.g:4782:1: entryRuleAddSub returns [EObject current=null] : iv_ruleAddSub= ruleAddSub EOF ;
    public final EObject entryRuleAddSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSub = null;


        try {
            // InternalOptGrammar.g:4782:47: (iv_ruleAddSub= ruleAddSub EOF )
            // InternalOptGrammar.g:4783:2: iv_ruleAddSub= ruleAddSub EOF
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
    // InternalOptGrammar.g:4789:1: ruleAddSub returns [EObject current=null] : (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) ;
    public final EObject ruleAddSub() throws RecognitionException {
        EObject current = null;

        EObject this_MulDivMod_0 = null;

        Enumerator lv_additionOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4795:2: ( (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* ) )
            // InternalOptGrammar.g:4796:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            {
            // InternalOptGrammar.g:4796:2: (this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )* )
            // InternalOptGrammar.g:4797:3: this_MulDivMod_0= ruleMulDivMod ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
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
            // InternalOptGrammar.g:4805:3: ( ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==60) && (synpred3_InternalOptGrammar())) {
                    alt79=1;
                }
                else if ( (LA79_0==61) && (synpred3_InternalOptGrammar())) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalOptGrammar.g:4806:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )=> ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    {
            	    // InternalOptGrammar.g:4821:4: ( () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) ) )
            	    // InternalOptGrammar.g:4822:5: () ( (lv_additionOp_2_0= ruleAdditionOpEnum ) ) ( (lv_right_3_0= ruleMulDivMod ) )
            	    {
            	    // InternalOptGrammar.g:4822:5: ()
            	    // InternalOptGrammar.g:4823:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAddSubAccess().getAddSubLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalOptGrammar.g:4829:5: ( (lv_additionOp_2_0= ruleAdditionOpEnum ) )
            	    // InternalOptGrammar.g:4830:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    {
            	    // InternalOptGrammar.g:4830:6: (lv_additionOp_2_0= ruleAdditionOpEnum )
            	    // InternalOptGrammar.g:4831:7: lv_additionOp_2_0= ruleAdditionOpEnum
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
            	      								"org.unicam.myGrammar.OptGrammar.AdditionOpEnum");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalOptGrammar.g:4848:5: ( (lv_right_3_0= ruleMulDivMod ) )
            	    // InternalOptGrammar.g:4849:6: (lv_right_3_0= ruleMulDivMod )
            	    {
            	    // InternalOptGrammar.g:4849:6: (lv_right_3_0= ruleMulDivMod )
            	    // InternalOptGrammar.g:4850:7: lv_right_3_0= ruleMulDivMod
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
            	      								"org.unicam.myGrammar.OptGrammar.MulDivMod");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

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
    // $ANTLR end "ruleAddSub"


    // $ANTLR start "entryRuleMulDivMod"
    // InternalOptGrammar.g:4873:1: entryRuleMulDivMod returns [EObject current=null] : iv_ruleMulDivMod= ruleMulDivMod EOF ;
    public final EObject entryRuleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDivMod = null;


        try {
            // InternalOptGrammar.g:4873:50: (iv_ruleMulDivMod= ruleMulDivMod EOF )
            // InternalOptGrammar.g:4874:2: iv_ruleMulDivMod= ruleMulDivMod EOF
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
    // InternalOptGrammar.g:4880:1: ruleMulDivMod returns [EObject current=null] : (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) ;
    public final EObject ruleMulDivMod() throws RecognitionException {
        EObject current = null;

        EObject this_Exponent_0 = null;

        Enumerator lv_multipliciativeOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4886:2: ( (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* ) )
            // InternalOptGrammar.g:4887:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            {
            // InternalOptGrammar.g:4887:2: (this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )* )
            // InternalOptGrammar.g:4888:3: this_Exponent_0= ruleExponent ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
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
            // InternalOptGrammar.g:4896:3: ( () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=205 && LA80_0<=207)) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalOptGrammar.g:4897:4: () ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) ) ( (lv_right_3_0= ruleExponent ) )
            	    {
            	    // InternalOptGrammar.g:4897:4: ()
            	    // InternalOptGrammar.g:4898:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulDivModAccess().getMulDivModLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalOptGrammar.g:4904:4: ( (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum ) )
            	    // InternalOptGrammar.g:4905:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    {
            	    // InternalOptGrammar.g:4905:5: (lv_multipliciativeOp_2_0= ruleMulDivModOpEnum )
            	    // InternalOptGrammar.g:4906:6: lv_multipliciativeOp_2_0= ruleMulDivModOpEnum
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
            	      							"org.unicam.myGrammar.OptGrammar.MulDivModOpEnum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalOptGrammar.g:4923:4: ( (lv_right_3_0= ruleExponent ) )
            	    // InternalOptGrammar.g:4924:5: (lv_right_3_0= ruleExponent )
            	    {
            	    // InternalOptGrammar.g:4924:5: (lv_right_3_0= ruleExponent )
            	    // InternalOptGrammar.g:4925:6: lv_right_3_0= ruleExponent
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
            	      							"org.unicam.myGrammar.OptGrammar.Exponent");
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
    // $ANTLR end "ruleMulDivMod"


    // $ANTLR start "entryRuleExponent"
    // InternalOptGrammar.g:4947:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalOptGrammar.g:4947:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalOptGrammar.g:4948:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalOptGrammar.g:4954:1: ruleExponent returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:4960:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalOptGrammar.g:4961:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalOptGrammar.g:4961:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalOptGrammar.g:4962:3: this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
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
            // InternalOptGrammar.g:4970:3: ( () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==57) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalOptGrammar.g:4971:4: () otherlv_2= '**' ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalOptGrammar.g:4971:4: ()
            	    // InternalOptGrammar.g:4972:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExponentAccess().getExponentLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,57,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
            	      			
            	    }
            	    // InternalOptGrammar.g:4982:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalOptGrammar.g:4983:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalOptGrammar.g:4983:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalOptGrammar.g:4984:6: lv_right_3_0= ruleUnaryExpression
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
            	      							"org.unicam.myGrammar.OptGrammar.UnaryExpression");
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
    // $ANTLR end "ruleExponent"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalOptGrammar.g:5006:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalOptGrammar.g:5006:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalOptGrammar.g:5007:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalOptGrammar.g:5013:1: ruleUnaryExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_BinaryNotExpression_1 = null;

        EObject this_SignExpression_2 = null;

        EObject this_NewExpression_3 = null;

        EObject this_PreExpression_4 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5019:2: ( (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression ) )
            // InternalOptGrammar.g:5020:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            {
            // InternalOptGrammar.g:5020:2: (this_NotExpression_0= ruleNotExpression | this_BinaryNotExpression_1= ruleBinaryNotExpression | this_SignExpression_2= ruleSignExpression | this_NewExpression_3= ruleNewExpression | this_PreExpression_4= rulePreExpression )
            int alt82=5;
            switch ( input.LA(1) ) {
            case 58:
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
            case 61:
                {
                alt82=3;
                }
                break;
            case 62:
                {
                alt82=4;
                }
                break;
            case RULE_ID:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case RULE_NOW:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_STRING:
            case 23:
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
            case 208:
            case 209:
            case 210:
            case 211:
                {
                alt82=5;
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
                    // InternalOptGrammar.g:5021:3: this_NotExpression_0= ruleNotExpression
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
                    // InternalOptGrammar.g:5030:3: this_BinaryNotExpression_1= ruleBinaryNotExpression
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
                    // InternalOptGrammar.g:5039:3: this_SignExpression_2= ruleSignExpression
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
                    // InternalOptGrammar.g:5048:3: this_NewExpression_3= ruleNewExpression
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
                    // InternalOptGrammar.g:5057:3: this_PreExpression_4= rulePreExpression
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
    // InternalOptGrammar.g:5069:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalOptGrammar.g:5069:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalOptGrammar.g:5070:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalOptGrammar.g:5076:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5082:2: ( (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalOptGrammar.g:5083:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalOptGrammar.g:5083:2: (otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalOptGrammar.g:5084:3: otherlv_0= '!' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalOptGrammar.g:5088:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalOptGrammar.g:5089:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalOptGrammar.g:5089:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalOptGrammar.g:5090:5: lv_expression_1_0= ruleUnaryExpression
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
    // InternalOptGrammar.g:5111:1: entryRuleBinaryNotExpression returns [EObject current=null] : iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF ;
    public final EObject entryRuleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryNotExpression = null;


        try {
            // InternalOptGrammar.g:5111:60: (iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF )
            // InternalOptGrammar.g:5112:2: iv_ruleBinaryNotExpression= ruleBinaryNotExpression EOF
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
    // InternalOptGrammar.g:5118:1: ruleBinaryNotExpression returns [EObject current=null] : (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleBinaryNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5124:2: ( (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalOptGrammar.g:5125:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalOptGrammar.g:5125:2: (otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalOptGrammar.g:5126:3: otherlv_0= '~' ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBinaryNotExpressionAccess().getTildeKeyword_0());
              		
            }
            // InternalOptGrammar.g:5130:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalOptGrammar.g:5131:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalOptGrammar.g:5131:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalOptGrammar.g:5132:5: lv_expression_1_0= ruleUnaryExpression
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
    // InternalOptGrammar.g:5153:1: entryRuleSignExpression returns [EObject current=null] : iv_ruleSignExpression= ruleSignExpression EOF ;
    public final EObject entryRuleSignExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignExpression = null;


        try {
            // InternalOptGrammar.g:5153:55: (iv_ruleSignExpression= ruleSignExpression EOF )
            // InternalOptGrammar.g:5154:2: iv_ruleSignExpression= ruleSignExpression EOF
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
    // InternalOptGrammar.g:5160:1: ruleSignExpression returns [EObject current=null] : ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleSignExpression() throws RecognitionException {
        EObject current = null;

        Token lv_signOp_0_1=null;
        Token lv_signOp_0_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5166:2: ( ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) ) )
            // InternalOptGrammar.g:5167:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            {
            // InternalOptGrammar.g:5167:2: ( ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) ) )
            // InternalOptGrammar.g:5168:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) ) ( (lv_expression_1_0= ruleUnaryExpression ) )
            {
            // InternalOptGrammar.g:5168:3: ( ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) ) )
            // InternalOptGrammar.g:5169:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            {
            // InternalOptGrammar.g:5169:4: ( (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' ) )
            // InternalOptGrammar.g:5170:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            {
            // InternalOptGrammar.g:5170:5: (lv_signOp_0_1= '+' | lv_signOp_0_2= '-' )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==60) ) {
                alt83=1;
            }
            else if ( (LA83_0==61) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalOptGrammar.g:5171:6: lv_signOp_0_1= '+'
                    {
                    lv_signOp_0_1=(Token)match(input,60,FOLLOW_12); if (state.failed) return current;
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
                    // InternalOptGrammar.g:5182:6: lv_signOp_0_2= '-'
                    {
                    lv_signOp_0_2=(Token)match(input,61,FOLLOW_12); if (state.failed) return current;
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

            // InternalOptGrammar.g:5195:3: ( (lv_expression_1_0= ruleUnaryExpression ) )
            // InternalOptGrammar.g:5196:4: (lv_expression_1_0= ruleUnaryExpression )
            {
            // InternalOptGrammar.g:5196:4: (lv_expression_1_0= ruleUnaryExpression )
            // InternalOptGrammar.g:5197:5: lv_expression_1_0= ruleUnaryExpression
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
    // InternalOptGrammar.g:5218:1: entryRuleNewExpression returns [EObject current=null] : iv_ruleNewExpression= ruleNewExpression EOF ;
    public final EObject entryRuleNewExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewExpression = null;


        try {
            // InternalOptGrammar.g:5218:54: (iv_ruleNewExpression= ruleNewExpression EOF )
            // InternalOptGrammar.g:5219:2: iv_ruleNewExpression= ruleNewExpression EOF
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
    // InternalOptGrammar.g:5225:1: ruleNewExpression returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) ;
    public final EObject ruleNewExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5231:2: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) ) )
            // InternalOptGrammar.g:5232:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            {
            // InternalOptGrammar.g:5232:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) ) )
            // InternalOptGrammar.g:5233:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNewExpressionAccess().getNewKeyword_0());
              		
            }
            // InternalOptGrammar.g:5237:3: ( (otherlv_1= RULE_ID ) )
            // InternalOptGrammar.g:5238:4: (otherlv_1= RULE_ID )
            {
            // InternalOptGrammar.g:5238:4: (otherlv_1= RULE_ID )
            // InternalOptGrammar.g:5239:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNewExpressionRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getNewExpressionAccess().getContractContractCrossReference_1_0());
              				
            }

            }


            }

            // InternalOptGrammar.g:5250:3: ( (lv_args_2_0= ruleFunctionCallListArguments ) )
            // InternalOptGrammar.g:5251:4: (lv_args_2_0= ruleFunctionCallListArguments )
            {
            // InternalOptGrammar.g:5251:4: (lv_args_2_0= ruleFunctionCallListArguments )
            // InternalOptGrammar.g:5252:5: lv_args_2_0= ruleFunctionCallListArguments
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
    // InternalOptGrammar.g:5273:1: entryRulePreExpression returns [EObject current=null] : iv_rulePreExpression= rulePreExpression EOF ;
    public final EObject entryRulePreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreExpression = null;


        try {
            // InternalOptGrammar.g:5273:54: (iv_rulePreExpression= rulePreExpression EOF )
            // InternalOptGrammar.g:5274:2: iv_rulePreExpression= rulePreExpression EOF
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
    // InternalOptGrammar.g:5280:1: rulePreExpression returns [EObject current=null] : (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) ;
    public final EObject rulePreExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_PostIncDecExpression_0 = null;

        EObject this_PostIncDecExpression_2 = null;

        EObject this_PostIncDecExpression_5 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5286:2: ( (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) ) )
            // InternalOptGrammar.g:5287:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            {
            // InternalOptGrammar.g:5287:2: (this_PostIncDecExpression_0= rulePostIncDecExpression | (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () ) | (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () ) )
            int alt84=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case RULE_NOW:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_STRING:
            case 23:
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
            case 208:
            case 209:
            case 210:
            case 211:
                {
                alt84=1;
                }
                break;
            case 63:
                {
                alt84=2;
                }
                break;
            case 64:
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
                    // InternalOptGrammar.g:5288:3: this_PostIncDecExpression_0= rulePostIncDecExpression
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
                    // InternalOptGrammar.g:5297:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    {
                    // InternalOptGrammar.g:5297:3: (otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression () )
                    // InternalOptGrammar.g:5298:4: otherlv_1= '++' this_PostIncDecExpression_2= rulePostIncDecExpression ()
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_61); if (state.failed) return current;
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
                    // InternalOptGrammar.g:5310:4: ()
                    // InternalOptGrammar.g:5311:5: 
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
                    // InternalOptGrammar.g:5319:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    {
                    // InternalOptGrammar.g:5319:3: (otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression () )
                    // InternalOptGrammar.g:5320:4: otherlv_4= '--' this_PostIncDecExpression_5= rulePostIncDecExpression ()
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_61); if (state.failed) return current;
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
                    // InternalOptGrammar.g:5332:4: ()
                    // InternalOptGrammar.g:5333:5: 
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
    // InternalOptGrammar.g:5344:1: entryRulePostIncDecExpression returns [EObject current=null] : iv_rulePostIncDecExpression= rulePostIncDecExpression EOF ;
    public final EObject entryRulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostIncDecExpression = null;


        try {
            // InternalOptGrammar.g:5344:61: (iv_rulePostIncDecExpression= rulePostIncDecExpression EOF )
            // InternalOptGrammar.g:5345:2: iv_rulePostIncDecExpression= rulePostIncDecExpression EOF
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
    // InternalOptGrammar.g:5351:1: rulePostIncDecExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) ;
    public final EObject rulePostIncDecExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_postOp_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5357:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* ) )
            // InternalOptGrammar.g:5358:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            {
            // InternalOptGrammar.g:5358:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )* )
            // InternalOptGrammar.g:5359:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
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
            // InternalOptGrammar.g:5367:3: ( () ( (lv_postOp_2_0= ruleIncDecOpEnum ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=63 && LA85_0<=64)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalOptGrammar.g:5368:4: () ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    {
            	    // InternalOptGrammar.g:5368:4: ()
            	    // InternalOptGrammar.g:5369:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPostIncDecExpressionAccess().getPostIncDecExpressionExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalOptGrammar.g:5375:4: ( (lv_postOp_2_0= ruleIncDecOpEnum ) )
            	    // InternalOptGrammar.g:5376:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    {
            	    // InternalOptGrammar.g:5376:5: (lv_postOp_2_0= ruleIncDecOpEnum )
            	    // InternalOptGrammar.g:5377:6: lv_postOp_2_0= ruleIncDecOpEnum
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
            	      							"org.unicam.myGrammar.OptGrammar.IncDecOpEnum");
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
    // $ANTLR end "rulePostIncDecExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalOptGrammar.g:5399:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalOptGrammar.g:5399:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalOptGrammar.g:5400:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalOptGrammar.g:5406:1: rulePrimaryExpression returns [EObject current=null] : (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) ;
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
            // InternalOptGrammar.g:5412:2: ( (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) ) )
            // InternalOptGrammar.g:5413:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            {
            // InternalOptGrammar.g:5413:2: (this_SpecialExpression_0= ruleSpecialExpression | this_QualifiedIdentifier_1= ruleQualifiedIdentifier | this_Literal_2= ruleLiteral | this_TypeCast_3= ruleTypeCast | (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' ) | (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' ) | (otherlv_17= '(' otherlv_18= ')' () ) )
            int alt92=7;
            switch ( input.LA(1) ) {
            case 210:
            case 211:
                {
                alt92=1;
                }
                break;
            case RULE_ID:
                {
                alt92=2;
                }
                break;
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case RULE_NOW:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case RULE_STRING:
            case 208:
            case 209:
                {
                alt92=3;
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
                {
                alt92=4;
                }
                break;
            case 23:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt92=7;
                    }
                    break;
                case 19:
                    {
                    alt92=6;
                    }
                    break;
                case RULE_ID:
                case RULE_BLOCK:
                case RULE_MSG:
                case RULE_TX:
                case RULE_NOW:
                case RULE_INT:
                case RULE_HEX:
                case RULE_DECIMAL:
                case RULE_STRING:
                case 23:
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
                case 208:
                case 209:
                case 210:
                case 211:
                    {
                    alt92=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 5, input);

                    throw nvae;
                }

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
                    // InternalOptGrammar.g:5414:3: this_SpecialExpression_0= ruleSpecialExpression
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
                    // InternalOptGrammar.g:5423:3: this_QualifiedIdentifier_1= ruleQualifiedIdentifier
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
                    // InternalOptGrammar.g:5432:3: this_Literal_2= ruleLiteral
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
                    // InternalOptGrammar.g:5441:3: this_TypeCast_3= ruleTypeCast
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
                    // InternalOptGrammar.g:5450:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    {
                    // InternalOptGrammar.g:5450:3: (otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')' )
                    // InternalOptGrammar.g:5451:4: otherlv_4= '(' this_Expression_5= ruleExpression ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )? otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
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
                    // InternalOptGrammar.g:5463:4: ( () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+ )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==19) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalOptGrammar.g:5464:5: () ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            {
                            // InternalOptGrammar.g:5464:5: ()
                            // InternalOptGrammar.g:5465:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndAdd(
                              							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_4_2_0(),
                              							current);
                              					
                            }

                            }

                            // InternalOptGrammar.g:5471:5: ( ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )? )+
                            int cnt87=0;
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==19) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // InternalOptGrammar.g:5472:6: ( (lv_members_7_0= ruleTupleSeparator ) ) ( (lv_members_8_0= ruleExpression ) )?
                            	    {
                            	    // InternalOptGrammar.g:5472:6: ( (lv_members_7_0= ruleTupleSeparator ) )
                            	    // InternalOptGrammar.g:5473:7: (lv_members_7_0= ruleTupleSeparator )
                            	    {
                            	    // InternalOptGrammar.g:5473:7: (lv_members_7_0= ruleTupleSeparator )
                            	    // InternalOptGrammar.g:5474:8: lv_members_7_0= ruleTupleSeparator
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

                            	    // InternalOptGrammar.g:5491:6: ( (lv_members_8_0= ruleExpression ) )?
                            	    int alt86=2;
                            	    int LA86_0 = input.LA(1);

                            	    if ( ((LA86_0>=RULE_ID && LA86_0<=RULE_STRING)||LA86_0==23||(LA86_0>=58 && LA86_0<=166)||(LA86_0>=208 && LA86_0<=211)) ) {
                            	        alt86=1;
                            	    }
                            	    switch (alt86) {
                            	        case 1 :
                            	            // InternalOptGrammar.g:5492:7: (lv_members_8_0= ruleExpression )
                            	            {
                            	            // InternalOptGrammar.g:5492:7: (lv_members_8_0= ruleExpression )
                            	            // InternalOptGrammar.g:5493:8: lv_members_8_0= ruleExpression
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
                            	    if ( cnt87 >= 1 ) break loop87;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(87, input);
                                        throw eee;
                                }
                                cnt87++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalOptGrammar.g:5518:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    {
                    // InternalOptGrammar.g:5518:3: (otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')' )
                    // InternalOptGrammar.g:5519:4: otherlv_10= '(' this_TupleSeparator_11= ruleTupleSeparator ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* ) otherlv_16= ')'
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
                    // InternalOptGrammar.g:5531:4: ( () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )* )
                    // InternalOptGrammar.g:5532:5: () ( (lv_members_13_0= ruleExpression ) )? ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    {
                    // InternalOptGrammar.g:5532:5: ()
                    // InternalOptGrammar.g:5533:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getPrimaryExpressionAccess().getTupleMembersAction_5_2_0(),
                      							current);
                      					
                    }

                    }

                    // InternalOptGrammar.g:5539:5: ( (lv_members_13_0= ruleExpression ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( ((LA89_0>=RULE_ID && LA89_0<=RULE_STRING)||LA89_0==23||(LA89_0>=58 && LA89_0<=166)||(LA89_0>=208 && LA89_0<=211)) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalOptGrammar.g:5540:6: (lv_members_13_0= ruleExpression )
                            {
                            // InternalOptGrammar.g:5540:6: (lv_members_13_0= ruleExpression )
                            // InternalOptGrammar.g:5541:7: lv_members_13_0= ruleExpression
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

                    // InternalOptGrammar.g:5558:5: ( ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )? )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==19) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalOptGrammar.g:5559:6: ( (lv_members_14_0= ruleTupleSeparator ) ) ( (lv_members_15_0= ruleExpression ) )?
                    	    {
                    	    // InternalOptGrammar.g:5559:6: ( (lv_members_14_0= ruleTupleSeparator ) )
                    	    // InternalOptGrammar.g:5560:7: (lv_members_14_0= ruleTupleSeparator )
                    	    {
                    	    // InternalOptGrammar.g:5560:7: (lv_members_14_0= ruleTupleSeparator )
                    	    // InternalOptGrammar.g:5561:8: lv_members_14_0= ruleTupleSeparator
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

                    	    // InternalOptGrammar.g:5578:6: ( (lv_members_15_0= ruleExpression ) )?
                    	    int alt90=2;
                    	    int LA90_0 = input.LA(1);

                    	    if ( ((LA90_0>=RULE_ID && LA90_0<=RULE_STRING)||LA90_0==23||(LA90_0>=58 && LA90_0<=166)||(LA90_0>=208 && LA90_0<=211)) ) {
                    	        alt90=1;
                    	    }
                    	    switch (alt90) {
                    	        case 1 :
                    	            // InternalOptGrammar.g:5579:7: (lv_members_15_0= ruleExpression )
                    	            {
                    	            // InternalOptGrammar.g:5579:7: (lv_members_15_0= ruleExpression )
                    	            // InternalOptGrammar.g:5580:8: lv_members_15_0= ruleExpression
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
                    	    break loop91;
                        }
                    } while (true);


                    }

                    otherlv_16=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalOptGrammar.g:5605:3: (otherlv_17= '(' otherlv_18= ')' () )
                    {
                    // InternalOptGrammar.g:5605:3: (otherlv_17= '(' otherlv_18= ')' () )
                    // InternalOptGrammar.g:5606:4: otherlv_17= '(' otherlv_18= ')' ()
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    otherlv_18=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_6_1());
                      			
                    }
                    // InternalOptGrammar.g:5614:4: ()
                    // InternalOptGrammar.g:5615:5: 
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
    // InternalOptGrammar.g:5626:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalOptGrammar.g:5626:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalOptGrammar.g:5627:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalOptGrammar.g:5633:1: ruleLiteral returns [EObject current=null] : (this_SpecialLiteral_0= ruleSpecialLiteral | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialLiteral_0 = null;

        EObject this_BooleanConst_1 = null;

        EObject this_NumericLiteral_2 = null;

        EObject this_StringLiteral_3 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5639:2: ( (this_SpecialLiteral_0= ruleSpecialLiteral | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // InternalOptGrammar.g:5640:2: (this_SpecialLiteral_0= ruleSpecialLiteral | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // InternalOptGrammar.g:5640:2: (this_SpecialLiteral_0= ruleSpecialLiteral | this_BooleanConst_1= ruleBooleanConst | this_NumericLiteral_2= ruleNumericLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt93=4;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
            case RULE_MSG:
            case RULE_TX:
            case RULE_NOW:
                {
                alt93=1;
                }
                break;
            case 208:
            case 209:
                {
                alt93=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
                {
                alt93=3;
                }
                break;
            case RULE_STRING:
                {
                alt93=4;
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
                    // InternalOptGrammar.g:5641:3: this_SpecialLiteral_0= ruleSpecialLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getSpecialLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SpecialLiteral_0=ruleSpecialLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SpecialLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:5650:3: this_BooleanConst_1= ruleBooleanConst
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
                    // InternalOptGrammar.g:5659:3: this_NumericLiteral_2= ruleNumericLiteral
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
                    // InternalOptGrammar.g:5668:3: this_StringLiteral_3= ruleStringLiteral
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


    // $ANTLR start "entryRuleSpecialLiteral"
    // InternalOptGrammar.g:5680:1: entryRuleSpecialLiteral returns [EObject current=null] : iv_ruleSpecialLiteral= ruleSpecialLiteral EOF ;
    public final EObject entryRuleSpecialLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialLiteral = null;


        try {
            // InternalOptGrammar.g:5680:55: (iv_ruleSpecialLiteral= ruleSpecialLiteral EOF )
            // InternalOptGrammar.g:5681:2: iv_ruleSpecialLiteral= ruleSpecialLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecialLiteral=ruleSpecialLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecialLiteral"


    // $ANTLR start "ruleSpecialLiteral"
    // InternalOptGrammar.g:5687:1: ruleSpecialLiteral returns [EObject current=null] : ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) ) ) ;
    public final EObject ruleSpecialLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5693:2: ( ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) ) ) )
            // InternalOptGrammar.g:5694:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) ) )
            {
            // InternalOptGrammar.g:5694:2: ( ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) ) )
            // InternalOptGrammar.g:5695:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) )
            {
            // InternalOptGrammar.g:5695:3: ( (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW ) )
            // InternalOptGrammar.g:5696:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW )
            {
            // InternalOptGrammar.g:5696:4: (lv_name_0_1= RULE_BLOCK | lv_name_0_2= RULE_MSG | lv_name_0_3= RULE_TX | lv_name_0_4= RULE_NOW )
            int alt94=4;
            switch ( input.LA(1) ) {
            case RULE_BLOCK:
                {
                alt94=1;
                }
                break;
            case RULE_MSG:
                {
                alt94=2;
                }
                break;
            case RULE_TX:
                {
                alt94=3;
                }
                break;
            case RULE_NOW:
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
                    // InternalOptGrammar.g:5697:5: lv_name_0_1= RULE_BLOCK
                    {
                    lv_name_0_1=(Token)match(input,RULE_BLOCK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_1, grammarAccess.getSpecialLiteralAccess().getNameBLOCKTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSpecialLiteralRule());
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
                    // InternalOptGrammar.g:5712:5: lv_name_0_2= RULE_MSG
                    {
                    lv_name_0_2=(Token)match(input,RULE_MSG,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_2, grammarAccess.getSpecialLiteralAccess().getNameMSGTerminalRuleCall_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSpecialLiteralRule());
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
                    // InternalOptGrammar.g:5727:5: lv_name_0_3= RULE_TX
                    {
                    lv_name_0_3=(Token)match(input,RULE_TX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_3, grammarAccess.getSpecialLiteralAccess().getNameTXTerminalRuleCall_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSpecialLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_0_3,
                      						"org.unicam.myGrammar.OptGrammar.TX");
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:5742:5: lv_name_0_4= RULE_NOW
                    {
                    lv_name_0_4=(Token)match(input,RULE_NOW,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_4, grammarAccess.getSpecialLiteralAccess().getNameNOWTerminalRuleCall_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSpecialLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_0_4,
                      						"org.unicam.myGrammar.OptGrammar.NOW");
                      				
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
    // $ANTLR end "ruleSpecialLiteral"


    // $ANTLR start "entryRuleBooleanConst"
    // InternalOptGrammar.g:5762:1: entryRuleBooleanConst returns [EObject current=null] : iv_ruleBooleanConst= ruleBooleanConst EOF ;
    public final EObject entryRuleBooleanConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConst = null;


        try {
            // InternalOptGrammar.g:5762:53: (iv_ruleBooleanConst= ruleBooleanConst EOF )
            // InternalOptGrammar.g:5763:2: iv_ruleBooleanConst= ruleBooleanConst EOF
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
    // InternalOptGrammar.g:5769:1: ruleBooleanConst returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) ;
    public final EObject ruleBooleanConst() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5775:2: ( ( (lv_value_0_0= ruleBooleanLiteralEnum ) ) )
            // InternalOptGrammar.g:5776:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            {
            // InternalOptGrammar.g:5776:2: ( (lv_value_0_0= ruleBooleanLiteralEnum ) )
            // InternalOptGrammar.g:5777:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            {
            // InternalOptGrammar.g:5777:3: (lv_value_0_0= ruleBooleanLiteralEnum )
            // InternalOptGrammar.g:5778:4: lv_value_0_0= ruleBooleanLiteralEnum
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
    // InternalOptGrammar.g:5798:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalOptGrammar.g:5798:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalOptGrammar.g:5799:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalOptGrammar.g:5805:1: ruleNumericLiteral returns [EObject current=null] : ( ( ( (lv_intValue_0_0= ruleIntLiteral ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) ) ( (lv_etherUnit_3_0= ruleUnitTypes ) )? ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_intValue_0_0 = null;

        EObject lv_hexValue_1_0 = null;

        EObject lv_decimalValue_2_0 = null;

        EObject lv_etherUnit_3_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5811:2: ( ( ( ( (lv_intValue_0_0= ruleIntLiteral ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) ) ( (lv_etherUnit_3_0= ruleUnitTypes ) )? ) )
            // InternalOptGrammar.g:5812:2: ( ( ( (lv_intValue_0_0= ruleIntLiteral ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) ) ( (lv_etherUnit_3_0= ruleUnitTypes ) )? )
            {
            // InternalOptGrammar.g:5812:2: ( ( ( (lv_intValue_0_0= ruleIntLiteral ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) ) ( (lv_etherUnit_3_0= ruleUnitTypes ) )? )
            // InternalOptGrammar.g:5813:3: ( ( (lv_intValue_0_0= ruleIntLiteral ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) ) ( (lv_etherUnit_3_0= ruleUnitTypes ) )?
            {
            // InternalOptGrammar.g:5813:3: ( ( (lv_intValue_0_0= ruleIntLiteral ) ) | ( (lv_hexValue_1_0= ruleHexLiteral ) ) | ( (lv_decimalValue_2_0= ruleDecimalLiteral ) ) )
            int alt95=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt95=1;
                }
                break;
            case RULE_HEX:
                {
                alt95=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt95=3;
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
                    // InternalOptGrammar.g:5814:4: ( (lv_intValue_0_0= ruleIntLiteral ) )
                    {
                    // InternalOptGrammar.g:5814:4: ( (lv_intValue_0_0= ruleIntLiteral ) )
                    // InternalOptGrammar.g:5815:5: (lv_intValue_0_0= ruleIntLiteral )
                    {
                    // InternalOptGrammar.g:5815:5: (lv_intValue_0_0= ruleIntLiteral )
                    // InternalOptGrammar.g:5816:6: lv_intValue_0_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getIntValueIntLiteralParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_63);
                    lv_intValue_0_0=ruleIntLiteral();

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
                      							"org.unicam.myGrammar.OptGrammar.IntLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:5834:4: ( (lv_hexValue_1_0= ruleHexLiteral ) )
                    {
                    // InternalOptGrammar.g:5834:4: ( (lv_hexValue_1_0= ruleHexLiteral ) )
                    // InternalOptGrammar.g:5835:5: (lv_hexValue_1_0= ruleHexLiteral )
                    {
                    // InternalOptGrammar.g:5835:5: (lv_hexValue_1_0= ruleHexLiteral )
                    // InternalOptGrammar.g:5836:6: lv_hexValue_1_0= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getHexValueHexLiteralParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_63);
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
                    // InternalOptGrammar.g:5854:4: ( (lv_decimalValue_2_0= ruleDecimalLiteral ) )
                    {
                    // InternalOptGrammar.g:5854:4: ( (lv_decimalValue_2_0= ruleDecimalLiteral ) )
                    // InternalOptGrammar.g:5855:5: (lv_decimalValue_2_0= ruleDecimalLiteral )
                    {
                    // InternalOptGrammar.g:5855:5: (lv_decimalValue_2_0= ruleDecimalLiteral )
                    // InternalOptGrammar.g:5856:6: lv_decimalValue_2_0= ruleDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericLiteralAccess().getDecimalValueDecimalLiteralParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_63);
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

            }

            // InternalOptGrammar.g:5874:3: ( (lv_etherUnit_3_0= ruleUnitTypes ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=174 && LA96_0<=183)) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalOptGrammar.g:5875:4: (lv_etherUnit_3_0= ruleUnitTypes )
                    {
                    // InternalOptGrammar.g:5875:4: (lv_etherUnit_3_0= ruleUnitTypes )
                    // InternalOptGrammar.g:5876:5: lv_etherUnit_3_0= ruleUnitTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNumericLiteralAccess().getEtherUnitUnitTypesParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_etherUnit_3_0=ruleUnitTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNumericLiteralRule());
                      					}
                      					set(
                      						current,
                      						"etherUnit",
                      						lv_etherUnit_3_0,
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


    // $ANTLR start "entryRuleUnitTypes"
    // InternalOptGrammar.g:5897:1: entryRuleUnitTypes returns [EObject current=null] : iv_ruleUnitTypes= ruleUnitTypes EOF ;
    public final EObject entryRuleUnitTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitTypes = null;


        try {
            // InternalOptGrammar.g:5897:50: (iv_ruleUnitTypes= ruleUnitTypes EOF )
            // InternalOptGrammar.g:5898:2: iv_ruleUnitTypes= ruleUnitTypes EOF
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
    // InternalOptGrammar.g:5904:1: ruleUnitTypes returns [EObject current=null] : ( ( (lv_time_0_0= ruleTimeUnitsLiteral ) ) | ( (lv_units_1_0= ruleUnitsLiteral ) ) ) ;
    public final EObject ruleUnitTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_time_0_0 = null;

        EObject lv_units_1_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:5910:2: ( ( ( (lv_time_0_0= ruleTimeUnitsLiteral ) ) | ( (lv_units_1_0= ruleUnitsLiteral ) ) ) )
            // InternalOptGrammar.g:5911:2: ( ( (lv_time_0_0= ruleTimeUnitsLiteral ) ) | ( (lv_units_1_0= ruleUnitsLiteral ) ) )
            {
            // InternalOptGrammar.g:5911:2: ( ( (lv_time_0_0= ruleTimeUnitsLiteral ) ) | ( (lv_units_1_0= ruleUnitsLiteral ) ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=178 && LA97_0<=183)) ) {
                alt97=1;
            }
            else if ( ((LA97_0>=174 && LA97_0<=177)) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalOptGrammar.g:5912:3: ( (lv_time_0_0= ruleTimeUnitsLiteral ) )
                    {
                    // InternalOptGrammar.g:5912:3: ( (lv_time_0_0= ruleTimeUnitsLiteral ) )
                    // InternalOptGrammar.g:5913:4: (lv_time_0_0= ruleTimeUnitsLiteral )
                    {
                    // InternalOptGrammar.g:5913:4: (lv_time_0_0= ruleTimeUnitsLiteral )
                    // InternalOptGrammar.g:5914:5: lv_time_0_0= ruleTimeUnitsLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnitTypesAccess().getTimeTimeUnitsLiteralParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_time_0_0=ruleTimeUnitsLiteral();

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
                      						"org.unicam.myGrammar.OptGrammar.TimeUnitsLiteral");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:5932:3: ( (lv_units_1_0= ruleUnitsLiteral ) )
                    {
                    // InternalOptGrammar.g:5932:3: ( (lv_units_1_0= ruleUnitsLiteral ) )
                    // InternalOptGrammar.g:5933:4: (lv_units_1_0= ruleUnitsLiteral )
                    {
                    // InternalOptGrammar.g:5933:4: (lv_units_1_0= ruleUnitsLiteral )
                    // InternalOptGrammar.g:5934:5: lv_units_1_0= ruleUnitsLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnitTypesAccess().getUnitsUnitsLiteralParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_units_1_0=ruleUnitsLiteral();

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
                      						"org.unicam.myGrammar.OptGrammar.UnitsLiteral");
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


    // $ANTLR start "entryRuleIntLiteral"
    // InternalOptGrammar.g:5955:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalOptGrammar.g:5955:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalOptGrammar.g:5956:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalOptGrammar.g:5962:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:5968:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalOptGrammar.g:5969:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalOptGrammar.g:5969:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalOptGrammar.g:5970:3: (lv_value_0_0= RULE_INT )
            {
            // InternalOptGrammar.g:5970:3: (lv_value_0_0= RULE_INT )
            // InternalOptGrammar.g:5971:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntLiteralRule());
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleHexLiteral"
    // InternalOptGrammar.g:5990:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // InternalOptGrammar.g:5990:51: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // InternalOptGrammar.g:5991:2: iv_ruleHexLiteral= ruleHexLiteral EOF
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
    // InternalOptGrammar.g:5997:1: ruleHexLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_HEX ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6003:2: ( ( (lv_value_0_0= RULE_HEX ) ) )
            // InternalOptGrammar.g:6004:2: ( (lv_value_0_0= RULE_HEX ) )
            {
            // InternalOptGrammar.g:6004:2: ( (lv_value_0_0= RULE_HEX ) )
            // InternalOptGrammar.g:6005:3: (lv_value_0_0= RULE_HEX )
            {
            // InternalOptGrammar.g:6005:3: (lv_value_0_0= RULE_HEX )
            // InternalOptGrammar.g:6006:4: lv_value_0_0= RULE_HEX
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
    // InternalOptGrammar.g:6025:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalOptGrammar.g:6025:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalOptGrammar.g:6026:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
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
    // InternalOptGrammar.g:6032:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6038:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalOptGrammar.g:6039:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalOptGrammar.g:6039:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalOptGrammar.g:6040:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalOptGrammar.g:6040:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalOptGrammar.g:6041:4: lv_value_0_0= RULE_DECIMAL
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


    // $ANTLR start "entryRuleStringLiteral"
    // InternalOptGrammar.g:6060:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalOptGrammar.g:6060:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalOptGrammar.g:6061:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalOptGrammar.g:6067:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:6073:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalOptGrammar.g:6074:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalOptGrammar.g:6074:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalOptGrammar.g:6075:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalOptGrammar.g:6075:3: (lv_value_0_0= RULE_STRING )
            // InternalOptGrammar.g:6076:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleTypeCast"
    // InternalOptGrammar.g:6095:1: entryRuleTypeCast returns [EObject current=null] : iv_ruleTypeCast= ruleTypeCast EOF ;
    public final EObject entryRuleTypeCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCast = null;


        try {
            // InternalOptGrammar.g:6095:49: (iv_ruleTypeCast= ruleTypeCast EOF )
            // InternalOptGrammar.g:6096:2: iv_ruleTypeCast= ruleTypeCast EOF
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
    // InternalOptGrammar.g:6102:1: ruleTypeCast returns [EObject current=null] : ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypeCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:6108:2: ( ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalOptGrammar.g:6109:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalOptGrammar.g:6109:2: ( ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalOptGrammar.g:6110:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalOptGrammar.g:6110:3: ( (lv_value_0_0= ruleElementaryTypeNameEnum ) )
            // InternalOptGrammar.g:6111:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            {
            // InternalOptGrammar.g:6111:4: (lv_value_0_0= ruleElementaryTypeNameEnum )
            // InternalOptGrammar.g:6112:5: lv_value_0_0= ruleElementaryTypeNameEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeCastAccess().getValueElementaryTypeNameEnumParserRuleCall_0_0());
              				
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
              						"org.unicam.myGrammar.OptGrammar.ElementaryTypeNameEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTypeCastAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalOptGrammar.g:6133:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalOptGrammar.g:6134:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalOptGrammar.g:6134:4: (lv_expression_2_0= ruleExpression )
            // InternalOptGrammar.g:6135:5: lv_expression_2_0= ruleExpression
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
              						"org.unicam.myGrammar.OptGrammar.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleElementaryTypeNameEnum"
    // InternalOptGrammar.g:6160:1: entryRuleElementaryTypeNameEnum returns [EObject current=null] : iv_ruleElementaryTypeNameEnum= ruleElementaryTypeNameEnum EOF ;
    public final EObject entryRuleElementaryTypeNameEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryTypeNameEnum = null;


        try {
            // InternalOptGrammar.g:6160:63: (iv_ruleElementaryTypeNameEnum= ruleElementaryTypeNameEnum EOF )
            // InternalOptGrammar.g:6161:2: iv_ruleElementaryTypeNameEnum= ruleElementaryTypeNameEnum EOF
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
    // InternalOptGrammar.g:6167:1: ruleElementaryTypeNameEnum returns [EObject current=null] : ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) ) | ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) ) | ( ( (lv_type_2_1= 'bytes1' | lv_type_2_2= 'bytes2' | lv_type_2_3= 'bytes3' | lv_type_2_4= 'bytes4' | lv_type_2_5= 'bytes5' | lv_type_2_6= 'bytes6' | lv_type_2_7= 'bytes7' | lv_type_2_8= 'bytes8' | lv_type_2_9= 'bytes9' | lv_type_2_10= 'bytes10' | lv_type_2_11= 'bytes11' | lv_type_2_12= 'bytes12' | lv_type_2_13= 'bytes13' | lv_type_2_14= 'bytes14' | lv_type_2_15= 'bytes15' | lv_type_2_16= 'bytes16' | lv_type_2_17= 'bytes17' | lv_type_2_18= 'bytes18' | lv_type_2_19= 'bytes19' | lv_type_2_20= 'bytes20' | lv_type_2_21= 'bytes21' | lv_type_2_22= 'bytes22' | lv_type_2_23= 'bytes23' | lv_type_2_24= 'bytes24' | lv_type_2_25= 'bytes25' | lv_type_2_26= 'bytes26' | lv_type_2_27= 'bytes27' | lv_type_2_28= 'bytes28' | lv_type_2_29= 'bytes29' | lv_type_2_30= 'bytes30' | lv_type_2_31= 'bytes31' | lv_type_2_32= 'bytes32' | lv_type_2_33= 'bytes' | lv_type_2_34= 'byte' ) ) ) | ( ( (lv_type_3_1= 'address' | lv_type_3_2= 'real' | lv_type_3_3= 'ureal' ) ) ) ) ;
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


        	enterRule();

        try {
            // InternalOptGrammar.g:6173:2: ( ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) ) | ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) ) | ( ( (lv_type_2_1= 'bytes1' | lv_type_2_2= 'bytes2' | lv_type_2_3= 'bytes3' | lv_type_2_4= 'bytes4' | lv_type_2_5= 'bytes5' | lv_type_2_6= 'bytes6' | lv_type_2_7= 'bytes7' | lv_type_2_8= 'bytes8' | lv_type_2_9= 'bytes9' | lv_type_2_10= 'bytes10' | lv_type_2_11= 'bytes11' | lv_type_2_12= 'bytes12' | lv_type_2_13= 'bytes13' | lv_type_2_14= 'bytes14' | lv_type_2_15= 'bytes15' | lv_type_2_16= 'bytes16' | lv_type_2_17= 'bytes17' | lv_type_2_18= 'bytes18' | lv_type_2_19= 'bytes19' | lv_type_2_20= 'bytes20' | lv_type_2_21= 'bytes21' | lv_type_2_22= 'bytes22' | lv_type_2_23= 'bytes23' | lv_type_2_24= 'bytes24' | lv_type_2_25= 'bytes25' | lv_type_2_26= 'bytes26' | lv_type_2_27= 'bytes27' | lv_type_2_28= 'bytes28' | lv_type_2_29= 'bytes29' | lv_type_2_30= 'bytes30' | lv_type_2_31= 'bytes31' | lv_type_2_32= 'bytes32' | lv_type_2_33= 'bytes' | lv_type_2_34= 'byte' ) ) ) | ( ( (lv_type_3_1= 'address' | lv_type_3_2= 'real' | lv_type_3_3= 'ureal' ) ) ) ) )
            // InternalOptGrammar.g:6174:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) ) | ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) ) | ( ( (lv_type_2_1= 'bytes1' | lv_type_2_2= 'bytes2' | lv_type_2_3= 'bytes3' | lv_type_2_4= 'bytes4' | lv_type_2_5= 'bytes5' | lv_type_2_6= 'bytes6' | lv_type_2_7= 'bytes7' | lv_type_2_8= 'bytes8' | lv_type_2_9= 'bytes9' | lv_type_2_10= 'bytes10' | lv_type_2_11= 'bytes11' | lv_type_2_12= 'bytes12' | lv_type_2_13= 'bytes13' | lv_type_2_14= 'bytes14' | lv_type_2_15= 'bytes15' | lv_type_2_16= 'bytes16' | lv_type_2_17= 'bytes17' | lv_type_2_18= 'bytes18' | lv_type_2_19= 'bytes19' | lv_type_2_20= 'bytes20' | lv_type_2_21= 'bytes21' | lv_type_2_22= 'bytes22' | lv_type_2_23= 'bytes23' | lv_type_2_24= 'bytes24' | lv_type_2_25= 'bytes25' | lv_type_2_26= 'bytes26' | lv_type_2_27= 'bytes27' | lv_type_2_28= 'bytes28' | lv_type_2_29= 'bytes29' | lv_type_2_30= 'bytes30' | lv_type_2_31= 'bytes31' | lv_type_2_32= 'bytes32' | lv_type_2_33= 'bytes' | lv_type_2_34= 'byte' ) ) ) | ( ( (lv_type_3_1= 'address' | lv_type_3_2= 'real' | lv_type_3_3= 'ureal' ) ) ) )
            {
            // InternalOptGrammar.g:6174:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) ) | ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) ) | ( ( (lv_type_2_1= 'bytes1' | lv_type_2_2= 'bytes2' | lv_type_2_3= 'bytes3' | lv_type_2_4= 'bytes4' | lv_type_2_5= 'bytes5' | lv_type_2_6= 'bytes6' | lv_type_2_7= 'bytes7' | lv_type_2_8= 'bytes8' | lv_type_2_9= 'bytes9' | lv_type_2_10= 'bytes10' | lv_type_2_11= 'bytes11' | lv_type_2_12= 'bytes12' | lv_type_2_13= 'bytes13' | lv_type_2_14= 'bytes14' | lv_type_2_15= 'bytes15' | lv_type_2_16= 'bytes16' | lv_type_2_17= 'bytes17' | lv_type_2_18= 'bytes18' | lv_type_2_19= 'bytes19' | lv_type_2_20= 'bytes20' | lv_type_2_21= 'bytes21' | lv_type_2_22= 'bytes22' | lv_type_2_23= 'bytes23' | lv_type_2_24= 'bytes24' | lv_type_2_25= 'bytes25' | lv_type_2_26= 'bytes26' | lv_type_2_27= 'bytes27' | lv_type_2_28= 'bytes28' | lv_type_2_29= 'bytes29' | lv_type_2_30= 'bytes30' | lv_type_2_31= 'bytes31' | lv_type_2_32= 'bytes32' | lv_type_2_33= 'bytes' | lv_type_2_34= 'byte' ) ) ) | ( ( (lv_type_3_1= 'address' | lv_type_3_2= 'real' | lv_type_3_3= 'ureal' ) ) ) )
            int alt102=4;
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
                {
                alt102=1;
                }
                break;
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
                {
                alt102=2;
                }
                break;
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
                {
                alt102=3;
                }
                break;
            case 164:
            case 165:
            case 166:
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
                    // InternalOptGrammar.g:6175:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) )
                    {
                    // InternalOptGrammar.g:6175:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) ) )
                    // InternalOptGrammar.g:6176:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) )
                    {
                    // InternalOptGrammar.g:6176:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' ) )
                    // InternalOptGrammar.g:6177:5: (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' )
                    {
                    // InternalOptGrammar.g:6177:5: (lv_type_0_1= 'int' | lv_type_0_2= 'int16' | lv_type_0_3= 'int24' | lv_type_0_4= 'int32' | lv_type_0_5= 'int40' | lv_type_0_6= 'int48' | lv_type_0_7= 'int56' | lv_type_0_8= 'int64' | lv_type_0_9= 'int72' | lv_type_0_10= 'int80' | lv_type_0_11= 'int88' | lv_type_0_12= 'int96' | lv_type_0_13= 'int104' | lv_type_0_14= 'int112' | lv_type_0_15= 'int120' | lv_type_0_16= 'int128' | lv_type_0_17= 'int136' | lv_type_0_18= 'int144' | lv_type_0_19= 'int152' | lv_type_0_20= 'int160' | lv_type_0_21= 'int168' | lv_type_0_22= 'int178' | lv_type_0_23= 'int184' | lv_type_0_24= 'int192' | lv_type_0_25= 'int200' | lv_type_0_26= 'int208' | lv_type_0_27= 'int216' | lv_type_0_28= 'int224' | lv_type_0_29= 'int232' | lv_type_0_30= 'int240' | lv_type_0_31= 'int248' | lv_type_0_32= 'int256' )
                    int alt98=32;
                    switch ( input.LA(1) ) {
                    case 65:
                        {
                        alt98=1;
                        }
                        break;
                    case 66:
                        {
                        alt98=2;
                        }
                        break;
                    case 67:
                        {
                        alt98=3;
                        }
                        break;
                    case 68:
                        {
                        alt98=4;
                        }
                        break;
                    case 69:
                        {
                        alt98=5;
                        }
                        break;
                    case 70:
                        {
                        alt98=6;
                        }
                        break;
                    case 71:
                        {
                        alt98=7;
                        }
                        break;
                    case 72:
                        {
                        alt98=8;
                        }
                        break;
                    case 73:
                        {
                        alt98=9;
                        }
                        break;
                    case 74:
                        {
                        alt98=10;
                        }
                        break;
                    case 75:
                        {
                        alt98=11;
                        }
                        break;
                    case 76:
                        {
                        alt98=12;
                        }
                        break;
                    case 77:
                        {
                        alt98=13;
                        }
                        break;
                    case 78:
                        {
                        alt98=14;
                        }
                        break;
                    case 79:
                        {
                        alt98=15;
                        }
                        break;
                    case 80:
                        {
                        alt98=16;
                        }
                        break;
                    case 81:
                        {
                        alt98=17;
                        }
                        break;
                    case 82:
                        {
                        alt98=18;
                        }
                        break;
                    case 83:
                        {
                        alt98=19;
                        }
                        break;
                    case 84:
                        {
                        alt98=20;
                        }
                        break;
                    case 85:
                        {
                        alt98=21;
                        }
                        break;
                    case 86:
                        {
                        alt98=22;
                        }
                        break;
                    case 87:
                        {
                        alt98=23;
                        }
                        break;
                    case 88:
                        {
                        alt98=24;
                        }
                        break;
                    case 89:
                        {
                        alt98=25;
                        }
                        break;
                    case 90:
                        {
                        alt98=26;
                        }
                        break;
                    case 91:
                        {
                        alt98=27;
                        }
                        break;
                    case 92:
                        {
                        alt98=28;
                        }
                        break;
                    case 93:
                        {
                        alt98=29;
                        }
                        break;
                    case 94:
                        {
                        alt98=30;
                        }
                        break;
                    case 95:
                        {
                        alt98=31;
                        }
                        break;
                    case 96:
                        {
                        alt98=32;
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
                            // InternalOptGrammar.g:6178:6: lv_type_0_1= 'int'
                            {
                            lv_type_0_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6189:6: lv_type_0_2= 'int16'
                            {
                            lv_type_0_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6200:6: lv_type_0_3= 'int24'
                            {
                            lv_type_0_3=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6211:6: lv_type_0_4= 'int32'
                            {
                            lv_type_0_4=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6222:6: lv_type_0_5= 'int40'
                            {
                            lv_type_0_5=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6233:6: lv_type_0_6= 'int48'
                            {
                            lv_type_0_6=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6244:6: lv_type_0_7= 'int56'
                            {
                            lv_type_0_7=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6255:6: lv_type_0_8= 'int64'
                            {
                            lv_type_0_8=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6266:6: lv_type_0_9= 'int72'
                            {
                            lv_type_0_9=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6277:6: lv_type_0_10= 'int80'
                            {
                            lv_type_0_10=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6288:6: lv_type_0_11= 'int88'
                            {
                            lv_type_0_11=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6299:6: lv_type_0_12= 'int96'
                            {
                            lv_type_0_12=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6310:6: lv_type_0_13= 'int104'
                            {
                            lv_type_0_13=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6321:6: lv_type_0_14= 'int112'
                            {
                            lv_type_0_14=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6332:6: lv_type_0_15= 'int120'
                            {
                            lv_type_0_15=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6343:6: lv_type_0_16= 'int128'
                            {
                            lv_type_0_16=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6354:6: lv_type_0_17= 'int136'
                            {
                            lv_type_0_17=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6365:6: lv_type_0_18= 'int144'
                            {
                            lv_type_0_18=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6376:6: lv_type_0_19= 'int152'
                            {
                            lv_type_0_19=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6387:6: lv_type_0_20= 'int160'
                            {
                            lv_type_0_20=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6398:6: lv_type_0_21= 'int168'
                            {
                            lv_type_0_21=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6409:6: lv_type_0_22= 'int178'
                            {
                            lv_type_0_22=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6420:6: lv_type_0_23= 'int184'
                            {
                            lv_type_0_23=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6431:6: lv_type_0_24= 'int192'
                            {
                            lv_type_0_24=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6442:6: lv_type_0_25= 'int200'
                            {
                            lv_type_0_25=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6453:6: lv_type_0_26= 'int208'
                            {
                            lv_type_0_26=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6464:6: lv_type_0_27= 'int216'
                            {
                            lv_type_0_27=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6475:6: lv_type_0_28= 'int224'
                            {
                            lv_type_0_28=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6486:6: lv_type_0_29= 'int232'
                            {
                            lv_type_0_29=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6497:6: lv_type_0_30= 'int240'
                            {
                            lv_type_0_30=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6508:6: lv_type_0_31= 'int248'
                            {
                            lv_type_0_31=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6519:6: lv_type_0_32= 'int256'
                            {
                            lv_type_0_32=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
                    // InternalOptGrammar.g:6533:3: ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) )
                    {
                    // InternalOptGrammar.g:6533:3: ( ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) ) )
                    // InternalOptGrammar.g:6534:4: ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) )
                    {
                    // InternalOptGrammar.g:6534:4: ( (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' ) )
                    // InternalOptGrammar.g:6535:5: (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' )
                    {
                    // InternalOptGrammar.g:6535:5: (lv_type_1_1= 'uint' | lv_type_1_2= 'uint8' | lv_type_1_3= 'uint16' | lv_type_1_4= 'uint24' | lv_type_1_5= 'uint32' | lv_type_1_6= 'uint40' | lv_type_1_7= 'uint48' | lv_type_1_8= 'uint56' | lv_type_1_9= 'uint64' | lv_type_1_10= 'uint72' | lv_type_1_11= 'uint80' | lv_type_1_12= 'uint88' | lv_type_1_13= 'uint96' | lv_type_1_14= 'uint104' | lv_type_1_15= 'uint112' | lv_type_1_16= 'uint120' | lv_type_1_17= 'uint128' | lv_type_1_18= 'uint136' | lv_type_1_19= 'uint144' | lv_type_1_20= 'uint152' | lv_type_1_21= 'uint160' | lv_type_1_22= 'uint168' | lv_type_1_23= 'uint178' | lv_type_1_24= 'uint184' | lv_type_1_25= 'uint192' | lv_type_1_26= 'uint200' | lv_type_1_27= 'uint208' | lv_type_1_28= 'uint216' | lv_type_1_29= 'uint224' | lv_type_1_30= 'uint232' | lv_type_1_31= 'uint240' | lv_type_1_32= 'uint248' | lv_type_1_33= 'uint256' )
                    int alt99=33;
                    switch ( input.LA(1) ) {
                    case 97:
                        {
                        alt99=1;
                        }
                        break;
                    case 98:
                        {
                        alt99=2;
                        }
                        break;
                    case 99:
                        {
                        alt99=3;
                        }
                        break;
                    case 100:
                        {
                        alt99=4;
                        }
                        break;
                    case 101:
                        {
                        alt99=5;
                        }
                        break;
                    case 102:
                        {
                        alt99=6;
                        }
                        break;
                    case 103:
                        {
                        alt99=7;
                        }
                        break;
                    case 104:
                        {
                        alt99=8;
                        }
                        break;
                    case 105:
                        {
                        alt99=9;
                        }
                        break;
                    case 106:
                        {
                        alt99=10;
                        }
                        break;
                    case 107:
                        {
                        alt99=11;
                        }
                        break;
                    case 108:
                        {
                        alt99=12;
                        }
                        break;
                    case 109:
                        {
                        alt99=13;
                        }
                        break;
                    case 110:
                        {
                        alt99=14;
                        }
                        break;
                    case 111:
                        {
                        alt99=15;
                        }
                        break;
                    case 112:
                        {
                        alt99=16;
                        }
                        break;
                    case 113:
                        {
                        alt99=17;
                        }
                        break;
                    case 114:
                        {
                        alt99=18;
                        }
                        break;
                    case 115:
                        {
                        alt99=19;
                        }
                        break;
                    case 116:
                        {
                        alt99=20;
                        }
                        break;
                    case 117:
                        {
                        alt99=21;
                        }
                        break;
                    case 118:
                        {
                        alt99=22;
                        }
                        break;
                    case 119:
                        {
                        alt99=23;
                        }
                        break;
                    case 120:
                        {
                        alt99=24;
                        }
                        break;
                    case 121:
                        {
                        alt99=25;
                        }
                        break;
                    case 122:
                        {
                        alt99=26;
                        }
                        break;
                    case 123:
                        {
                        alt99=27;
                        }
                        break;
                    case 124:
                        {
                        alt99=28;
                        }
                        break;
                    case 125:
                        {
                        alt99=29;
                        }
                        break;
                    case 126:
                        {
                        alt99=30;
                        }
                        break;
                    case 127:
                        {
                        alt99=31;
                        }
                        break;
                    case 128:
                        {
                        alt99=32;
                        }
                        break;
                    case 129:
                        {
                        alt99=33;
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
                            // InternalOptGrammar.g:6536:6: lv_type_1_1= 'uint'
                            {
                            lv_type_1_1=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6547:6: lv_type_1_2= 'uint8'
                            {
                            lv_type_1_2=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6558:6: lv_type_1_3= 'uint16'
                            {
                            lv_type_1_3=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6569:6: lv_type_1_4= 'uint24'
                            {
                            lv_type_1_4=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6580:6: lv_type_1_5= 'uint32'
                            {
                            lv_type_1_5=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6591:6: lv_type_1_6= 'uint40'
                            {
                            lv_type_1_6=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6602:6: lv_type_1_7= 'uint48'
                            {
                            lv_type_1_7=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6613:6: lv_type_1_8= 'uint56'
                            {
                            lv_type_1_8=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6624:6: lv_type_1_9= 'uint64'
                            {
                            lv_type_1_9=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6635:6: lv_type_1_10= 'uint72'
                            {
                            lv_type_1_10=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6646:6: lv_type_1_11= 'uint80'
                            {
                            lv_type_1_11=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6657:6: lv_type_1_12= 'uint88'
                            {
                            lv_type_1_12=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6668:6: lv_type_1_13= 'uint96'
                            {
                            lv_type_1_13=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6679:6: lv_type_1_14= 'uint104'
                            {
                            lv_type_1_14=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6690:6: lv_type_1_15= 'uint112'
                            {
                            lv_type_1_15=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6701:6: lv_type_1_16= 'uint120'
                            {
                            lv_type_1_16=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6712:6: lv_type_1_17= 'uint128'
                            {
                            lv_type_1_17=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6723:6: lv_type_1_18= 'uint136'
                            {
                            lv_type_1_18=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6734:6: lv_type_1_19= 'uint144'
                            {
                            lv_type_1_19=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6745:6: lv_type_1_20= 'uint152'
                            {
                            lv_type_1_20=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6756:6: lv_type_1_21= 'uint160'
                            {
                            lv_type_1_21=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6767:6: lv_type_1_22= 'uint168'
                            {
                            lv_type_1_22=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6778:6: lv_type_1_23= 'uint178'
                            {
                            lv_type_1_23=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6789:6: lv_type_1_24= 'uint184'
                            {
                            lv_type_1_24=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6800:6: lv_type_1_25= 'uint192'
                            {
                            lv_type_1_25=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6811:6: lv_type_1_26= 'uint200'
                            {
                            lv_type_1_26=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6822:6: lv_type_1_27= 'uint208'
                            {
                            lv_type_1_27=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6833:6: lv_type_1_28= 'uint216'
                            {
                            lv_type_1_28=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6844:6: lv_type_1_29= 'uint224'
                            {
                            lv_type_1_29=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6855:6: lv_type_1_30= 'uint232'
                            {
                            lv_type_1_30=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6866:6: lv_type_1_31= 'uint240'
                            {
                            lv_type_1_31=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6877:6: lv_type_1_32= 'uint248'
                            {
                            lv_type_1_32=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
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
                            // InternalOptGrammar.g:6888:6: lv_type_1_33= 'uint256'
                            {
                            lv_type_1_33=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
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
                    // InternalOptGrammar.g:6902:3: ( ( (lv_type_2_1= 'bytes1' | lv_type_2_2= 'bytes2' | lv_type_2_3= 'bytes3' | lv_type_2_4= 'bytes4' | lv_type_2_5= 'bytes5' | lv_type_2_6= 'bytes6' | lv_type_2_7= 'bytes7' | lv_type_2_8= 'bytes8' | lv_type_2_9= 'bytes9' | lv_type_2_10= 'bytes10' | lv_type_2_11= 'bytes11' | lv_type_2_12= 'bytes12' | lv_type_2_13= 'bytes13' | lv_type_2_14= 'bytes14' | lv_type_2_15= 'bytes15' | lv_type_2_16= 'bytes16' | lv_type_2_17= 'bytes17' | lv_type_2_18= 'bytes18' | lv_type_2_19= 'bytes19' | lv_type_2_20= 'bytes20' | lv_type_2_21= 'bytes21' | lv_type_2_22= 'bytes22' | lv_type_2_23= 'bytes23' | lv_type_2_24= 'bytes24' | lv_type_2_25= 'bytes25' | lv_type_2_26= 'bytes26' | lv_type_2_27= 'bytes27' | lv_type_2_28= 'bytes28' | lv_type_2_29= 'bytes29' | lv_type_2_30= 'bytes30' | lv_type_2_31= 'bytes31' | lv_type_2_32= 'bytes32' | lv_type_2_33= 'bytes' | lv_type_2_34= 'byte' ) ) )
                    {
                    // InternalOptGrammar.g:6902:3: ( ( (lv_type_2_1= 'bytes1' | lv_type_2_2= 'bytes2' | lv_type_2_3= 'bytes3' | lv_type_2_4= 'bytes4' | lv_type_2_5= 'bytes5' | lv_type_2_6= 'bytes6' | lv_type_2_7= 'bytes7' | lv_type_2_8= 'bytes8' | lv_type_2_9= 'bytes9' | lv_type_2_10= 'bytes10' | lv_type_2_11= 'bytes11' | lv_type_2_12= 'bytes12' | lv_type_2_13= 'bytes13' | lv_type_2_14= 'bytes14' | lv_type_2_15= 'bytes15' | lv_type_2_16= 'bytes16' | lv_type_2_17= 'bytes17' | lv_type_2_18= 'bytes18' | lv_type_2_19= 'bytes19' | lv_type_2_20= 'bytes20' | lv_type_2_21= 'bytes21' | lv_type_2_22= 'bytes22' | lv_type_2_23= 'bytes23' | lv_type_2_24= 'bytes24' | lv_type_2_25= 'bytes25' | lv_type_2_26= 'bytes26' | lv_type_2_27= 'bytes27' | lv_type_2_28= 'bytes28' | lv_type_2_29= 'bytes29' | lv_type_2_30= 'bytes30' | lv_type_2_31= 'bytes31' | lv_type_2_32= 'bytes32' | lv_type_2_33= 'bytes' | lv_type_2_34= 'byte' ) ) )
                    // InternalOptGrammar.g:6903:4: ( (lv_type_2_1= 'bytes1' | lv_type_2_2= 'bytes2' | lv_type_2_3= 'bytes3' | lv_type_2_4= 'bytes4' | lv_type_2_5= 'bytes5' | lv_type_2_6= 'bytes6' | lv_type_2_7= 'bytes7' | lv_type_2_8= 'bytes8' | lv_type_2_9= 'bytes9' | lv_type_2_10= 'bytes10' | lv_type_2_11= 'bytes11' | lv_type_2_12= 'bytes12' | lv_type_2_13= 'bytes13' | lv_type_2_14= 'bytes14' | lv_type_2_15= 'bytes15' | lv_type_2_16= 'bytes16' | lv_type_2_17= 'bytes17' | lv_type_2_18= 'bytes18' | lv_type_2_19= 'bytes19' | lv_type_2_20= 'bytes20' | lv_type_2_21= 'bytes21' | lv_type_2_22= 'bytes22' | lv_type_2_23= 'bytes23' | lv_type_2_24= 'bytes24' | lv_type_2_25= 'bytes25' | lv_type_2_26= 'bytes26' | lv_type_2_27= 'bytes27' | lv_type_2_28= 'bytes28' | lv_type_2_29= 'bytes29' | lv_type_2_30= 'bytes30' | lv_type_2_31= 'bytes31' | lv_type_2_32= 'bytes32' | lv_type_2_33= 'bytes' | lv_type_2_34= 'byte' ) )
                    {
                    // InternalOptGrammar.g:6903:4: ( (lv_type_2_1= 'bytes1' | lv_type_2_2= 'bytes2' | lv_type_2_3= 'bytes3' | lv_type_2_4= 'bytes4' | lv_type_2_5= 'bytes5' | lv_type_2_6= 'bytes6' | lv_type_2_7= 'bytes7' | lv_type_2_8= 'bytes8' | lv_type_2_9= 'bytes9' | lv_type_2_10= 'bytes10' | lv_type_2_11= 'bytes11' | lv_type_2_12= 'bytes12' | lv_type_2_13= 'bytes13' | lv_type_2_14= 'bytes14' | lv_type_2_15= 'bytes15' | lv_type_2_16= 'bytes16' | lv_type_2_17= 'bytes17' | lv_type_2_18= 'bytes18' | lv_type_2_19= 'bytes19' | lv_type_2_20= 'bytes20' | lv_type_2_21= 'bytes21' | lv_type_2_22= 'bytes22' | lv_type_2_23= 'bytes23' | lv_type_2_24= 'bytes24' | lv_type_2_25= 'bytes25' | lv_type_2_26= 'bytes26' | lv_type_2_27= 'bytes27' | lv_type_2_28= 'bytes28' | lv_type_2_29= 'bytes29' | lv_type_2_30= 'bytes30' | lv_type_2_31= 'bytes31' | lv_type_2_32= 'bytes32' | lv_type_2_33= 'bytes' | lv_type_2_34= 'byte' ) )
                    // InternalOptGrammar.g:6904:5: (lv_type_2_1= 'bytes1' | lv_type_2_2= 'bytes2' | lv_type_2_3= 'bytes3' | lv_type_2_4= 'bytes4' | lv_type_2_5= 'bytes5' | lv_type_2_6= 'bytes6' | lv_type_2_7= 'bytes7' | lv_type_2_8= 'bytes8' | lv_type_2_9= 'bytes9' | lv_type_2_10= 'bytes10' | lv_type_2_11= 'bytes11' | lv_type_2_12= 'bytes12' | lv_type_2_13= 'bytes13' | lv_type_2_14= 'bytes14' | lv_type_2_15= 'bytes15' | lv_type_2_16= 'bytes16' | lv_type_2_17= 'bytes17' | lv_type_2_18= 'bytes18' | lv_type_2_19= 'bytes19' | lv_type_2_20= 'bytes20' | lv_type_2_21= 'bytes21' | lv_type_2_22= 'bytes22' | lv_type_2_23= 'bytes23' | lv_type_2_24= 'bytes24' | lv_type_2_25= 'bytes25' | lv_type_2_26= 'bytes26' | lv_type_2_27= 'bytes27' | lv_type_2_28= 'bytes28' | lv_type_2_29= 'bytes29' | lv_type_2_30= 'bytes30' | lv_type_2_31= 'bytes31' | lv_type_2_32= 'bytes32' | lv_type_2_33= 'bytes' | lv_type_2_34= 'byte' )
                    {
                    // InternalOptGrammar.g:6904:5: (lv_type_2_1= 'bytes1' | lv_type_2_2= 'bytes2' | lv_type_2_3= 'bytes3' | lv_type_2_4= 'bytes4' | lv_type_2_5= 'bytes5' | lv_type_2_6= 'bytes6' | lv_type_2_7= 'bytes7' | lv_type_2_8= 'bytes8' | lv_type_2_9= 'bytes9' | lv_type_2_10= 'bytes10' | lv_type_2_11= 'bytes11' | lv_type_2_12= 'bytes12' | lv_type_2_13= 'bytes13' | lv_type_2_14= 'bytes14' | lv_type_2_15= 'bytes15' | lv_type_2_16= 'bytes16' | lv_type_2_17= 'bytes17' | lv_type_2_18= 'bytes18' | lv_type_2_19= 'bytes19' | lv_type_2_20= 'bytes20' | lv_type_2_21= 'bytes21' | lv_type_2_22= 'bytes22' | lv_type_2_23= 'bytes23' | lv_type_2_24= 'bytes24' | lv_type_2_25= 'bytes25' | lv_type_2_26= 'bytes26' | lv_type_2_27= 'bytes27' | lv_type_2_28= 'bytes28' | lv_type_2_29= 'bytes29' | lv_type_2_30= 'bytes30' | lv_type_2_31= 'bytes31' | lv_type_2_32= 'bytes32' | lv_type_2_33= 'bytes' | lv_type_2_34= 'byte' )
                    int alt100=34;
                    switch ( input.LA(1) ) {
                    case 130:
                        {
                        alt100=1;
                        }
                        break;
                    case 131:
                        {
                        alt100=2;
                        }
                        break;
                    case 132:
                        {
                        alt100=3;
                        }
                        break;
                    case 133:
                        {
                        alt100=4;
                        }
                        break;
                    case 134:
                        {
                        alt100=5;
                        }
                        break;
                    case 135:
                        {
                        alt100=6;
                        }
                        break;
                    case 136:
                        {
                        alt100=7;
                        }
                        break;
                    case 137:
                        {
                        alt100=8;
                        }
                        break;
                    case 138:
                        {
                        alt100=9;
                        }
                        break;
                    case 139:
                        {
                        alt100=10;
                        }
                        break;
                    case 140:
                        {
                        alt100=11;
                        }
                        break;
                    case 141:
                        {
                        alt100=12;
                        }
                        break;
                    case 142:
                        {
                        alt100=13;
                        }
                        break;
                    case 143:
                        {
                        alt100=14;
                        }
                        break;
                    case 144:
                        {
                        alt100=15;
                        }
                        break;
                    case 145:
                        {
                        alt100=16;
                        }
                        break;
                    case 146:
                        {
                        alt100=17;
                        }
                        break;
                    case 147:
                        {
                        alt100=18;
                        }
                        break;
                    case 148:
                        {
                        alt100=19;
                        }
                        break;
                    case 149:
                        {
                        alt100=20;
                        }
                        break;
                    case 150:
                        {
                        alt100=21;
                        }
                        break;
                    case 151:
                        {
                        alt100=22;
                        }
                        break;
                    case 152:
                        {
                        alt100=23;
                        }
                        break;
                    case 153:
                        {
                        alt100=24;
                        }
                        break;
                    case 154:
                        {
                        alt100=25;
                        }
                        break;
                    case 155:
                        {
                        alt100=26;
                        }
                        break;
                    case 156:
                        {
                        alt100=27;
                        }
                        break;
                    case 157:
                        {
                        alt100=28;
                        }
                        break;
                    case 158:
                        {
                        alt100=29;
                        }
                        break;
                    case 159:
                        {
                        alt100=30;
                        }
                        break;
                    case 160:
                        {
                        alt100=31;
                        }
                        break;
                    case 161:
                        {
                        alt100=32;
                        }
                        break;
                    case 162:
                        {
                        alt100=33;
                        }
                        break;
                    case 163:
                        {
                        alt100=34;
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
                            // InternalOptGrammar.g:6905:6: lv_type_2_1= 'bytes1'
                            {
                            lv_type_2_1=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_1, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes1Keyword_2_0_0());
                              					
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
                            // InternalOptGrammar.g:6916:6: lv_type_2_2= 'bytes2'
                            {
                            lv_type_2_2=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_2, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes2Keyword_2_0_1());
                              					
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
                            // InternalOptGrammar.g:6927:6: lv_type_2_3= 'bytes3'
                            {
                            lv_type_2_3=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_3, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes3Keyword_2_0_2());
                              					
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
                            // InternalOptGrammar.g:6938:6: lv_type_2_4= 'bytes4'
                            {
                            lv_type_2_4=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_4, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes4Keyword_2_0_3());
                              					
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
                            // InternalOptGrammar.g:6949:6: lv_type_2_5= 'bytes5'
                            {
                            lv_type_2_5=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_5, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes5Keyword_2_0_4());
                              					
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
                            // InternalOptGrammar.g:6960:6: lv_type_2_6= 'bytes6'
                            {
                            lv_type_2_6=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_6, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes6Keyword_2_0_5());
                              					
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
                            // InternalOptGrammar.g:6971:6: lv_type_2_7= 'bytes7'
                            {
                            lv_type_2_7=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_7, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes7Keyword_2_0_6());
                              					
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
                            // InternalOptGrammar.g:6982:6: lv_type_2_8= 'bytes8'
                            {
                            lv_type_2_8=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_8, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes8Keyword_2_0_7());
                              					
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
                            // InternalOptGrammar.g:6993:6: lv_type_2_9= 'bytes9'
                            {
                            lv_type_2_9=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_9, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes9Keyword_2_0_8());
                              					
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
                            // InternalOptGrammar.g:7004:6: lv_type_2_10= 'bytes10'
                            {
                            lv_type_2_10=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_10, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes10Keyword_2_0_9());
                              					
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
                            // InternalOptGrammar.g:7015:6: lv_type_2_11= 'bytes11'
                            {
                            lv_type_2_11=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_11, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes11Keyword_2_0_10());
                              					
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
                            // InternalOptGrammar.g:7026:6: lv_type_2_12= 'bytes12'
                            {
                            lv_type_2_12=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_12, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes12Keyword_2_0_11());
                              					
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
                            // InternalOptGrammar.g:7037:6: lv_type_2_13= 'bytes13'
                            {
                            lv_type_2_13=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_13, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes13Keyword_2_0_12());
                              					
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
                            // InternalOptGrammar.g:7048:6: lv_type_2_14= 'bytes14'
                            {
                            lv_type_2_14=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_14, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes14Keyword_2_0_13());
                              					
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
                            // InternalOptGrammar.g:7059:6: lv_type_2_15= 'bytes15'
                            {
                            lv_type_2_15=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_15, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes15Keyword_2_0_14());
                              					
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
                            // InternalOptGrammar.g:7070:6: lv_type_2_16= 'bytes16'
                            {
                            lv_type_2_16=(Token)match(input,145,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_16, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes16Keyword_2_0_15());
                              					
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
                            // InternalOptGrammar.g:7081:6: lv_type_2_17= 'bytes17'
                            {
                            lv_type_2_17=(Token)match(input,146,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_17, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes17Keyword_2_0_16());
                              					
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
                            // InternalOptGrammar.g:7092:6: lv_type_2_18= 'bytes18'
                            {
                            lv_type_2_18=(Token)match(input,147,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_18, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes18Keyword_2_0_17());
                              					
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
                            // InternalOptGrammar.g:7103:6: lv_type_2_19= 'bytes19'
                            {
                            lv_type_2_19=(Token)match(input,148,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_19, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes19Keyword_2_0_18());
                              					
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
                            // InternalOptGrammar.g:7114:6: lv_type_2_20= 'bytes20'
                            {
                            lv_type_2_20=(Token)match(input,149,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_20, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes20Keyword_2_0_19());
                              					
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
                            // InternalOptGrammar.g:7125:6: lv_type_2_21= 'bytes21'
                            {
                            lv_type_2_21=(Token)match(input,150,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_21, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes21Keyword_2_0_20());
                              					
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
                            // InternalOptGrammar.g:7136:6: lv_type_2_22= 'bytes22'
                            {
                            lv_type_2_22=(Token)match(input,151,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_22, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes22Keyword_2_0_21());
                              					
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
                            // InternalOptGrammar.g:7147:6: lv_type_2_23= 'bytes23'
                            {
                            lv_type_2_23=(Token)match(input,152,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_23, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes23Keyword_2_0_22());
                              					
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
                            // InternalOptGrammar.g:7158:6: lv_type_2_24= 'bytes24'
                            {
                            lv_type_2_24=(Token)match(input,153,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_24, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes24Keyword_2_0_23());
                              					
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
                            // InternalOptGrammar.g:7169:6: lv_type_2_25= 'bytes25'
                            {
                            lv_type_2_25=(Token)match(input,154,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_25, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes25Keyword_2_0_24());
                              					
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
                            // InternalOptGrammar.g:7180:6: lv_type_2_26= 'bytes26'
                            {
                            lv_type_2_26=(Token)match(input,155,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_26, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes26Keyword_2_0_25());
                              					
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
                            // InternalOptGrammar.g:7191:6: lv_type_2_27= 'bytes27'
                            {
                            lv_type_2_27=(Token)match(input,156,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_27, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes27Keyword_2_0_26());
                              					
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
                            // InternalOptGrammar.g:7202:6: lv_type_2_28= 'bytes28'
                            {
                            lv_type_2_28=(Token)match(input,157,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_28, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes28Keyword_2_0_27());
                              					
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
                            // InternalOptGrammar.g:7213:6: lv_type_2_29= 'bytes29'
                            {
                            lv_type_2_29=(Token)match(input,158,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_29, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes29Keyword_2_0_28());
                              					
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
                            // InternalOptGrammar.g:7224:6: lv_type_2_30= 'bytes30'
                            {
                            lv_type_2_30=(Token)match(input,159,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_30, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes30Keyword_2_0_29());
                              					
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
                            // InternalOptGrammar.g:7235:6: lv_type_2_31= 'bytes31'
                            {
                            lv_type_2_31=(Token)match(input,160,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_31, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes31Keyword_2_0_30());
                              					
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
                            // InternalOptGrammar.g:7246:6: lv_type_2_32= 'bytes32'
                            {
                            lv_type_2_32=(Token)match(input,161,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_32, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytes32Keyword_2_0_31());
                              					
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
                            // InternalOptGrammar.g:7257:6: lv_type_2_33= 'bytes'
                            {
                            lv_type_2_33=(Token)match(input,162,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_33, grammarAccess.getElementaryTypeNameEnumAccess().getTypeBytesKeyword_2_0_32());
                              					
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
                            // InternalOptGrammar.g:7268:6: lv_type_2_34= 'byte'
                            {
                            lv_type_2_34=(Token)match(input,163,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_2_34, grammarAccess.getElementaryTypeNameEnumAccess().getTypeByteKeyword_2_0_33());
                              					
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
                    // InternalOptGrammar.g:7282:3: ( ( (lv_type_3_1= 'address' | lv_type_3_2= 'real' | lv_type_3_3= 'ureal' ) ) )
                    {
                    // InternalOptGrammar.g:7282:3: ( ( (lv_type_3_1= 'address' | lv_type_3_2= 'real' | lv_type_3_3= 'ureal' ) ) )
                    // InternalOptGrammar.g:7283:4: ( (lv_type_3_1= 'address' | lv_type_3_2= 'real' | lv_type_3_3= 'ureal' ) )
                    {
                    // InternalOptGrammar.g:7283:4: ( (lv_type_3_1= 'address' | lv_type_3_2= 'real' | lv_type_3_3= 'ureal' ) )
                    // InternalOptGrammar.g:7284:5: (lv_type_3_1= 'address' | lv_type_3_2= 'real' | lv_type_3_3= 'ureal' )
                    {
                    // InternalOptGrammar.g:7284:5: (lv_type_3_1= 'address' | lv_type_3_2= 'real' | lv_type_3_3= 'ureal' )
                    int alt101=3;
                    switch ( input.LA(1) ) {
                    case 164:
                        {
                        alt101=1;
                        }
                        break;
                    case 165:
                        {
                        alt101=2;
                        }
                        break;
                    case 166:
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
                            // InternalOptGrammar.g:7285:6: lv_type_3_1= 'address'
                            {
                            lv_type_3_1=(Token)match(input,164,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_3_1, grammarAccess.getElementaryTypeNameEnumAccess().getTypeAddressKeyword_3_0_0());
                              					
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
                            // InternalOptGrammar.g:7296:6: lv_type_3_2= 'real'
                            {
                            lv_type_3_2=(Token)match(input,165,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_3_2, grammarAccess.getElementaryTypeNameEnumAccess().getTypeRealKeyword_3_0_1());
                              					
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
                            // InternalOptGrammar.g:7307:6: lv_type_3_3= 'ureal'
                            {
                            lv_type_3_3=(Token)match(input,166,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_type_3_3, grammarAccess.getElementaryTypeNameEnumAccess().getTypeUrealKeyword_3_0_2());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getElementaryTypeNameEnumRule());
                              						}
                              						setWithLastConsumed(current, "type", lv_type_3_3, null);
                              					
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


    // $ANTLR start "entryRuleMapLocationLiteral"
    // InternalOptGrammar.g:7324:1: entryRuleMapLocationLiteral returns [String current=null] : iv_ruleMapLocationLiteral= ruleMapLocationLiteral EOF ;
    public final String entryRuleMapLocationLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMapLocationLiteral = null;


        try {
            // InternalOptGrammar.g:7324:58: (iv_ruleMapLocationLiteral= ruleMapLocationLiteral EOF )
            // InternalOptGrammar.g:7325:2: iv_ruleMapLocationLiteral= ruleMapLocationLiteral EOF
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
    // InternalOptGrammar.g:7331:1: ruleMapLocationLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'storage' ;
    public final AntlrDatatypeRuleToken ruleMapLocationLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7337:2: (kw= 'storage' )
            // InternalOptGrammar.g:7338:2: kw= 'storage'
            {
            kw=(Token)match(input,167,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7346:1: entryRuleLocationSpecifierEnum returns [EObject current=null] : iv_ruleLocationSpecifierEnum= ruleLocationSpecifierEnum EOF ;
    public final EObject entryRuleLocationSpecifierEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifierEnum = null;


        try {
            // InternalOptGrammar.g:7346:62: (iv_ruleLocationSpecifierEnum= ruleLocationSpecifierEnum EOF )
            // InternalOptGrammar.g:7347:2: iv_ruleLocationSpecifierEnum= ruleLocationSpecifierEnum EOF
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
    // InternalOptGrammar.g:7353:1: ruleLocationSpecifierEnum returns [EObject current=null] : ( ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) ) ) ;
    public final EObject ruleLocationSpecifierEnum() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_3=null;
        AntlrDatatypeRuleToken lv_type_0_2 = null;



        	enterRule();

        try {
            // InternalOptGrammar.g:7359:2: ( ( ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) ) ) )
            // InternalOptGrammar.g:7360:2: ( ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) ) )
            {
            // InternalOptGrammar.g:7360:2: ( ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) ) )
            // InternalOptGrammar.g:7361:3: ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) )
            {
            // InternalOptGrammar.g:7361:3: ( (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' ) )
            // InternalOptGrammar.g:7362:4: (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' )
            {
            // InternalOptGrammar.g:7362:4: (lv_type_0_1= 'memory' | lv_type_0_2= ruleMapLocationLiteral | lv_type_0_3= 'calldata' )
            int alt103=3;
            switch ( input.LA(1) ) {
            case 168:
                {
                alt103=1;
                }
                break;
            case 167:
                {
                alt103=2;
                }
                break;
            case 169:
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
                    // InternalOptGrammar.g:7363:5: lv_type_0_1= 'memory'
                    {
                    lv_type_0_1=(Token)match(input,168,FOLLOW_2); if (state.failed) return current;
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
                    // InternalOptGrammar.g:7374:5: lv_type_0_2= ruleMapLocationLiteral
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
                    // InternalOptGrammar.g:7390:5: lv_type_0_3= 'calldata'
                    {
                    lv_type_0_3=(Token)match(input,169,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7406:1: entryRuleVisibilityEnum returns [EObject current=null] : iv_ruleVisibilityEnum= ruleVisibilityEnum EOF ;
    public final EObject entryRuleVisibilityEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilityEnum = null;


        try {
            // InternalOptGrammar.g:7406:55: (iv_ruleVisibilityEnum= ruleVisibilityEnum EOF )
            // InternalOptGrammar.g:7407:2: iv_ruleVisibilityEnum= ruleVisibilityEnum EOF
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
    // InternalOptGrammar.g:7413:1: ruleVisibilityEnum returns [EObject current=null] : ( ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) ) ) ;
    public final EObject ruleVisibilityEnum() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7419:2: ( ( ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) ) ) )
            // InternalOptGrammar.g:7420:2: ( ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) ) )
            {
            // InternalOptGrammar.g:7420:2: ( ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) ) )
            // InternalOptGrammar.g:7421:3: ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) )
            {
            // InternalOptGrammar.g:7421:3: ( (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' ) )
            // InternalOptGrammar.g:7422:4: (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' )
            {
            // InternalOptGrammar.g:7422:4: (lv_type_0_1= 'public' | lv_type_0_2= 'internal' | lv_type_0_3= 'private' | lv_type_0_4= 'external' )
            int alt104=4;
            switch ( input.LA(1) ) {
            case 170:
                {
                alt104=1;
                }
                break;
            case 171:
                {
                alt104=2;
                }
                break;
            case 172:
                {
                alt104=3;
                }
                break;
            case 173:
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
                    // InternalOptGrammar.g:7423:5: lv_type_0_1= 'public'
                    {
                    lv_type_0_1=(Token)match(input,170,FOLLOW_2); if (state.failed) return current;
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
                    // InternalOptGrammar.g:7434:5: lv_type_0_2= 'internal'
                    {
                    lv_type_0_2=(Token)match(input,171,FOLLOW_2); if (state.failed) return current;
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
                    // InternalOptGrammar.g:7445:5: lv_type_0_3= 'private'
                    {
                    lv_type_0_3=(Token)match(input,172,FOLLOW_2); if (state.failed) return current;
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
                    // InternalOptGrammar.g:7456:5: lv_type_0_4= 'external'
                    {
                    lv_type_0_4=(Token)match(input,173,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleUnitsLiteral"
    // InternalOptGrammar.g:7472:1: entryRuleUnitsLiteral returns [EObject current=null] : iv_ruleUnitsLiteral= ruleUnitsLiteral EOF ;
    public final EObject entryRuleUnitsLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitsLiteral = null;


        try {
            // InternalOptGrammar.g:7472:53: (iv_ruleUnitsLiteral= ruleUnitsLiteral EOF )
            // InternalOptGrammar.g:7473:2: iv_ruleUnitsLiteral= ruleUnitsLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitsLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnitsLiteral=ruleUnitsLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitsLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitsLiteral"


    // $ANTLR start "ruleUnitsLiteral"
    // InternalOptGrammar.g:7479:1: ruleUnitsLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'wei' | lv_value_0_2= 'szabo' | lv_value_0_3= 'finney' | lv_value_0_4= 'ether' ) ) ) ;
    public final EObject ruleUnitsLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7485:2: ( ( ( (lv_value_0_1= 'wei' | lv_value_0_2= 'szabo' | lv_value_0_3= 'finney' | lv_value_0_4= 'ether' ) ) ) )
            // InternalOptGrammar.g:7486:2: ( ( (lv_value_0_1= 'wei' | lv_value_0_2= 'szabo' | lv_value_0_3= 'finney' | lv_value_0_4= 'ether' ) ) )
            {
            // InternalOptGrammar.g:7486:2: ( ( (lv_value_0_1= 'wei' | lv_value_0_2= 'szabo' | lv_value_0_3= 'finney' | lv_value_0_4= 'ether' ) ) )
            // InternalOptGrammar.g:7487:3: ( (lv_value_0_1= 'wei' | lv_value_0_2= 'szabo' | lv_value_0_3= 'finney' | lv_value_0_4= 'ether' ) )
            {
            // InternalOptGrammar.g:7487:3: ( (lv_value_0_1= 'wei' | lv_value_0_2= 'szabo' | lv_value_0_3= 'finney' | lv_value_0_4= 'ether' ) )
            // InternalOptGrammar.g:7488:4: (lv_value_0_1= 'wei' | lv_value_0_2= 'szabo' | lv_value_0_3= 'finney' | lv_value_0_4= 'ether' )
            {
            // InternalOptGrammar.g:7488:4: (lv_value_0_1= 'wei' | lv_value_0_2= 'szabo' | lv_value_0_3= 'finney' | lv_value_0_4= 'ether' )
            int alt105=4;
            switch ( input.LA(1) ) {
            case 174:
                {
                alt105=1;
                }
                break;
            case 175:
                {
                alt105=2;
                }
                break;
            case 176:
                {
                alt105=3;
                }
                break;
            case 177:
                {
                alt105=4;
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
                    // InternalOptGrammar.g:7489:5: lv_value_0_1= 'wei'
                    {
                    lv_value_0_1=(Token)match(input,174,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_1, grammarAccess.getUnitsLiteralAccess().getValueWeiKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnitsLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7500:5: lv_value_0_2= 'szabo'
                    {
                    lv_value_0_2=(Token)match(input,175,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_2, grammarAccess.getUnitsLiteralAccess().getValueSzaboKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnitsLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7511:5: lv_value_0_3= 'finney'
                    {
                    lv_value_0_3=(Token)match(input,176,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_3, grammarAccess.getUnitsLiteralAccess().getValueFinneyKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnitsLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7522:5: lv_value_0_4= 'ether'
                    {
                    lv_value_0_4=(Token)match(input,177,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_4, grammarAccess.getUnitsLiteralAccess().getValueEtherKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnitsLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_4, null);
                      				
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
    // $ANTLR end "ruleUnitsLiteral"


    // $ANTLR start "entryRuleTimeUnitsLiteral"
    // InternalOptGrammar.g:7538:1: entryRuleTimeUnitsLiteral returns [EObject current=null] : iv_ruleTimeUnitsLiteral= ruleTimeUnitsLiteral EOF ;
    public final EObject entryRuleTimeUnitsLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUnitsLiteral = null;


        try {
            // InternalOptGrammar.g:7538:57: (iv_ruleTimeUnitsLiteral= ruleTimeUnitsLiteral EOF )
            // InternalOptGrammar.g:7539:2: iv_ruleTimeUnitsLiteral= ruleTimeUnitsLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeUnitsLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeUnitsLiteral=ruleTimeUnitsLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeUnitsLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeUnitsLiteral"


    // $ANTLR start "ruleTimeUnitsLiteral"
    // InternalOptGrammar.g:7545:1: ruleTimeUnitsLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'seconds' | lv_value_0_2= 'minutes' | lv_value_0_3= 'hours' | lv_value_0_4= 'days' | lv_value_0_5= 'weeks' | lv_value_0_6= 'years' ) ) ) ;
    public final EObject ruleTimeUnitsLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7551:2: ( ( ( (lv_value_0_1= 'seconds' | lv_value_0_2= 'minutes' | lv_value_0_3= 'hours' | lv_value_0_4= 'days' | lv_value_0_5= 'weeks' | lv_value_0_6= 'years' ) ) ) )
            // InternalOptGrammar.g:7552:2: ( ( (lv_value_0_1= 'seconds' | lv_value_0_2= 'minutes' | lv_value_0_3= 'hours' | lv_value_0_4= 'days' | lv_value_0_5= 'weeks' | lv_value_0_6= 'years' ) ) )
            {
            // InternalOptGrammar.g:7552:2: ( ( (lv_value_0_1= 'seconds' | lv_value_0_2= 'minutes' | lv_value_0_3= 'hours' | lv_value_0_4= 'days' | lv_value_0_5= 'weeks' | lv_value_0_6= 'years' ) ) )
            // InternalOptGrammar.g:7553:3: ( (lv_value_0_1= 'seconds' | lv_value_0_2= 'minutes' | lv_value_0_3= 'hours' | lv_value_0_4= 'days' | lv_value_0_5= 'weeks' | lv_value_0_6= 'years' ) )
            {
            // InternalOptGrammar.g:7553:3: ( (lv_value_0_1= 'seconds' | lv_value_0_2= 'minutes' | lv_value_0_3= 'hours' | lv_value_0_4= 'days' | lv_value_0_5= 'weeks' | lv_value_0_6= 'years' ) )
            // InternalOptGrammar.g:7554:4: (lv_value_0_1= 'seconds' | lv_value_0_2= 'minutes' | lv_value_0_3= 'hours' | lv_value_0_4= 'days' | lv_value_0_5= 'weeks' | lv_value_0_6= 'years' )
            {
            // InternalOptGrammar.g:7554:4: (lv_value_0_1= 'seconds' | lv_value_0_2= 'minutes' | lv_value_0_3= 'hours' | lv_value_0_4= 'days' | lv_value_0_5= 'weeks' | lv_value_0_6= 'years' )
            int alt106=6;
            switch ( input.LA(1) ) {
            case 178:
                {
                alt106=1;
                }
                break;
            case 179:
                {
                alt106=2;
                }
                break;
            case 180:
                {
                alt106=3;
                }
                break;
            case 181:
                {
                alt106=4;
                }
                break;
            case 182:
                {
                alt106=5;
                }
                break;
            case 183:
                {
                alt106=6;
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
                    // InternalOptGrammar.g:7555:5: lv_value_0_1= 'seconds'
                    {
                    lv_value_0_1=(Token)match(input,178,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_1, grammarAccess.getTimeUnitsLiteralAccess().getValueSecondsKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTimeUnitsLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7566:5: lv_value_0_2= 'minutes'
                    {
                    lv_value_0_2=(Token)match(input,179,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_2, grammarAccess.getTimeUnitsLiteralAccess().getValueMinutesKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTimeUnitsLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7577:5: lv_value_0_3= 'hours'
                    {
                    lv_value_0_3=(Token)match(input,180,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_3, grammarAccess.getTimeUnitsLiteralAccess().getValueHoursKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTimeUnitsLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7588:5: lv_value_0_4= 'days'
                    {
                    lv_value_0_4=(Token)match(input,181,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_4, grammarAccess.getTimeUnitsLiteralAccess().getValueDaysKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTimeUnitsLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_4, null);
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalOptGrammar.g:7599:5: lv_value_0_5= 'weeks'
                    {
                    lv_value_0_5=(Token)match(input,182,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_5, grammarAccess.getTimeUnitsLiteralAccess().getValueWeeksKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTimeUnitsLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_5, null);
                      				
                    }

                    }
                    break;
                case 6 :
                    // InternalOptGrammar.g:7610:5: lv_value_0_6= 'years'
                    {
                    lv_value_0_6=(Token)match(input,183,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_6, grammarAccess.getTimeUnitsLiteralAccess().getValueYearsKeyword_0_5());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTimeUnitsLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_6, null);
                      				
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
    // $ANTLR end "ruleTimeUnitsLiteral"


    // $ANTLR start "ruleAssignmentOpEnum"
    // InternalOptGrammar.g:7626:1: ruleAssignmentOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) ;
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
            // InternalOptGrammar.g:7632:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) ) )
            // InternalOptGrammar.g:7633:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            {
            // InternalOptGrammar.g:7633:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '|=' ) | (enumLiteral_2= '^=' ) | (enumLiteral_3= '&=' ) | (enumLiteral_4= '<<=' ) | (enumLiteral_5= '>>=' ) | (enumLiteral_6= '>>>=' ) | (enumLiteral_7= '+=' ) | (enumLiteral_8= '-=' ) | (enumLiteral_9= '*=' ) | (enumLiteral_10= '/=' ) | (enumLiteral_11= '%=' ) )
            int alt107=12;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt107=1;
                }
                break;
            case 184:
                {
                alt107=2;
                }
                break;
            case 185:
                {
                alt107=3;
                }
                break;
            case 186:
                {
                alt107=4;
                }
                break;
            case 187:
                {
                alt107=5;
                }
                break;
            case 188:
                {
                alt107=6;
                }
                break;
            case 189:
                {
                alt107=7;
                }
                break;
            case 190:
                {
                alt107=8;
                }
                break;
            case 191:
                {
                alt107=9;
                }
                break;
            case 192:
                {
                alt107=10;
                }
                break;
            case 193:
                {
                alt107=11;
                }
                break;
            case 194:
                {
                alt107=12;
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
                    // InternalOptGrammar.g:7634:3: (enumLiteral_0= '=' )
                    {
                    // InternalOptGrammar.g:7634:3: (enumLiteral_0= '=' )
                    // InternalOptGrammar.g:7635:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOpEnumAccess().getASSIGNEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7642:3: (enumLiteral_1= '|=' )
                    {
                    // InternalOptGrammar.g:7642:3: (enumLiteral_1= '|=' )
                    // InternalOptGrammar.g:7643:4: enumLiteral_1= '|='
                    {
                    enumLiteral_1=(Token)match(input,184,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_OREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7650:3: (enumLiteral_2= '^=' )
                    {
                    // InternalOptGrammar.g:7650:3: (enumLiteral_2= '^=' )
                    // InternalOptGrammar.g:7651:4: enumLiteral_2= '^='
                    {
                    enumLiteral_2=(Token)match(input,185,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_XOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7658:3: (enumLiteral_3= '&=' )
                    {
                    // InternalOptGrammar.g:7658:3: (enumLiteral_3= '&=' )
                    // InternalOptGrammar.g:7659:4: enumLiteral_3= '&='
                    {
                    enumLiteral_3=(Token)match(input,186,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ANDEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalOptGrammar.g:7666:3: (enumLiteral_4= '<<=' )
                    {
                    // InternalOptGrammar.g:7666:3: (enumLiteral_4= '<<=' )
                    // InternalOptGrammar.g:7667:4: enumLiteral_4= '<<='
                    {
                    enumLiteral_4=(Token)match(input,187,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_LEFTEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalOptGrammar.g:7674:3: (enumLiteral_5= '>>=' )
                    {
                    // InternalOptGrammar.g:7674:3: (enumLiteral_5= '>>=' )
                    // InternalOptGrammar.g:7675:4: enumLiteral_5= '>>='
                    {
                    enumLiteral_5=(Token)match(input,188,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalOptGrammar.g:7682:3: (enumLiteral_6= '>>>=' )
                    {
                    // InternalOptGrammar.g:7682:3: (enumLiteral_6= '>>>=' )
                    // InternalOptGrammar.g:7683:4: enumLiteral_6= '>>>='
                    {
                    enumLiteral_6=(Token)match(input,189,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SHIFT_RIGHT_ARIMETICEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalOptGrammar.g:7690:3: (enumLiteral_7= '+=' )
                    {
                    // InternalOptGrammar.g:7690:3: (enumLiteral_7= '+=' )
                    // InternalOptGrammar.g:7691:4: enumLiteral_7= '+='
                    {
                    enumLiteral_7=(Token)match(input,190,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_ADDEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalOptGrammar.g:7698:3: (enumLiteral_8= '-=' )
                    {
                    // InternalOptGrammar.g:7698:3: (enumLiteral_8= '-=' )
                    // InternalOptGrammar.g:7699:4: enumLiteral_8= '-='
                    {
                    enumLiteral_8=(Token)match(input,191,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_SUBEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalOptGrammar.g:7706:3: (enumLiteral_9= '*=' )
                    {
                    // InternalOptGrammar.g:7706:3: (enumLiteral_9= '*=' )
                    // InternalOptGrammar.g:7707:4: enumLiteral_9= '*='
                    {
                    enumLiteral_9=(Token)match(input,192,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_MULTEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalOptGrammar.g:7714:3: (enumLiteral_10= '/=' )
                    {
                    // InternalOptGrammar.g:7714:3: (enumLiteral_10= '/=' )
                    // InternalOptGrammar.g:7715:4: enumLiteral_10= '/='
                    {
                    enumLiteral_10=(Token)match(input,193,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOpEnumAccess().getASSIGN_DIVEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalOptGrammar.g:7722:3: (enumLiteral_11= '%=' )
                    {
                    // InternalOptGrammar.g:7722:3: (enumLiteral_11= '%=' )
                    // InternalOptGrammar.g:7723:4: enumLiteral_11= '%='
                    {
                    enumLiteral_11=(Token)match(input,194,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7733:1: ruleEqualityOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7739:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalOptGrammar.g:7740:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalOptGrammar.g:7740:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==195) ) {
                alt108=1;
            }
            else if ( (LA108_0==196) ) {
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
                    // InternalOptGrammar.g:7741:3: (enumLiteral_0= '==' )
                    {
                    // InternalOptGrammar.g:7741:3: (enumLiteral_0= '==' )
                    // InternalOptGrammar.g:7742:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,195,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOpEnumAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7749:3: (enumLiteral_1= '!=' )
                    {
                    // InternalOptGrammar.g:7749:3: (enumLiteral_1= '!=' )
                    // InternalOptGrammar.g:7750:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,196,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7760:1: ruleComparisonOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) ;
    public final Enumerator ruleComparisonOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7766:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) ) )
            // InternalOptGrammar.g:7767:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            {
            // InternalOptGrammar.g:7767:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= 'in' ) )
            int alt109=5;
            switch ( input.LA(1) ) {
            case 197:
                {
                alt109=1;
                }
                break;
            case 198:
                {
                alt109=2;
                }
                break;
            case 199:
                {
                alt109=3;
                }
                break;
            case 200:
                {
                alt109=4;
                }
                break;
            case 201:
                {
                alt109=5;
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
                    // InternalOptGrammar.g:7768:3: (enumLiteral_0= '<' )
                    {
                    // InternalOptGrammar.g:7768:3: (enumLiteral_0= '<' )
                    // InternalOptGrammar.g:7769:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,197,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOpEnumAccess().getLTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7776:3: (enumLiteral_1= '>' )
                    {
                    // InternalOptGrammar.g:7776:3: (enumLiteral_1= '>' )
                    // InternalOptGrammar.g:7777:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,198,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOpEnumAccess().getGTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7784:3: (enumLiteral_2= '<=' )
                    {
                    // InternalOptGrammar.g:7784:3: (enumLiteral_2= '<=' )
                    // InternalOptGrammar.g:7785:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,199,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOpEnumAccess().getLTEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOptGrammar.g:7792:3: (enumLiteral_3= '>=' )
                    {
                    // InternalOptGrammar.g:7792:3: (enumLiteral_3= '>=' )
                    // InternalOptGrammar.g:7793:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,200,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOpEnumAccess().getGTEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalOptGrammar.g:7800:3: (enumLiteral_4= 'in' )
                    {
                    // InternalOptGrammar.g:7800:3: (enumLiteral_4= 'in' )
                    // InternalOptGrammar.g:7801:4: enumLiteral_4= 'in'
                    {
                    enumLiteral_4=(Token)match(input,201,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7811:1: ruleShiftOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) ;
    public final Enumerator ruleShiftOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7817:2: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) ) )
            // InternalOptGrammar.g:7818:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            {
            // InternalOptGrammar.g:7818:2: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) | (enumLiteral_2= '>>>' ) )
            int alt110=3;
            switch ( input.LA(1) ) {
            case 202:
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
                    // InternalOptGrammar.g:7819:3: (enumLiteral_0= '<<' )
                    {
                    // InternalOptGrammar.g:7819:3: (enumLiteral_0= '<<' )
                    // InternalOptGrammar.g:7820:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,202,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getShiftOpEnumAccess().getLEFT_SHIFTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7827:3: (enumLiteral_1= '>>' )
                    {
                    // InternalOptGrammar.g:7827:3: (enumLiteral_1= '>>' )
                    // InternalOptGrammar.g:7828:4: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,203,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getShiftOpEnumAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7835:3: (enumLiteral_2= '>>>' )
                    {
                    // InternalOptGrammar.g:7835:3: (enumLiteral_2= '>>>' )
                    // InternalOptGrammar.g:7836:4: enumLiteral_2= '>>>'
                    {
                    enumLiteral_2=(Token)match(input,204,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7846:1: ruleAdditionOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7852:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalOptGrammar.g:7853:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalOptGrammar.g:7853:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==60) ) {
                alt111=1;
            }
            else if ( (LA111_0==61) ) {
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
                    // InternalOptGrammar.g:7854:3: (enumLiteral_0= '+' )
                    {
                    // InternalOptGrammar.g:7854:3: (enumLiteral_0= '+' )
                    // InternalOptGrammar.g:7855:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOpEnumAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7862:3: (enumLiteral_1= '-' )
                    {
                    // InternalOptGrammar.g:7862:3: (enumLiteral_1= '-' )
                    // InternalOptGrammar.g:7863:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7873:1: ruleMulDivModOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMulDivModOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7879:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalOptGrammar.g:7880:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalOptGrammar.g:7880:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt112=3;
            switch ( input.LA(1) ) {
            case 205:
                {
                alt112=1;
                }
                break;
            case 206:
                {
                alt112=2;
                }
                break;
            case 207:
                {
                alt112=3;
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
                    // InternalOptGrammar.g:7881:3: (enumLiteral_0= '*' )
                    {
                    // InternalOptGrammar.g:7881:3: (enumLiteral_0= '*' )
                    // InternalOptGrammar.g:7882:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,205,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMulDivModOpEnumAccess().getMULTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7889:3: (enumLiteral_1= '/' )
                    {
                    // InternalOptGrammar.g:7889:3: (enumLiteral_1= '/' )
                    // InternalOptGrammar.g:7890:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,206,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMulDivModOpEnumAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMulDivModOpEnumAccess().getDIVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOptGrammar.g:7897:3: (enumLiteral_2= '%' )
                    {
                    // InternalOptGrammar.g:7897:3: (enumLiteral_2= '%' )
                    // InternalOptGrammar.g:7898:4: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,207,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7908:1: ruleIncDecOpEnum returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncDecOpEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7914:2: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalOptGrammar.g:7915:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalOptGrammar.g:7915:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==63) ) {
                alt113=1;
            }
            else if ( (LA113_0==64) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalOptGrammar.g:7916:3: (enumLiteral_0= '++' )
                    {
                    // InternalOptGrammar.g:7916:3: (enumLiteral_0= '++' )
                    // InternalOptGrammar.g:7917:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getIncDecOpEnumAccess().getINCEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7924:3: (enumLiteral_1= '--' )
                    {
                    // InternalOptGrammar.g:7924:3: (enumLiteral_1= '--' )
                    // InternalOptGrammar.g:7925:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalOptGrammar.g:7935:1: ruleBooleanLiteralEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanLiteralEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7941:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalOptGrammar.g:7942:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalOptGrammar.g:7942:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==208) ) {
                alt114=1;
            }
            else if ( (LA114_0==209) ) {
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
                    // InternalOptGrammar.g:7943:3: (enumLiteral_0= 'true' )
                    {
                    // InternalOptGrammar.g:7943:3: (enumLiteral_0= 'true' )
                    // InternalOptGrammar.g:7944:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,208,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBooleanLiteralEnumAccess().getTRUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7951:3: (enumLiteral_1= 'false' )
                    {
                    // InternalOptGrammar.g:7951:3: (enumLiteral_1= 'false' )
                    // InternalOptGrammar.g:7952:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,209,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleSpecialExpressionTypeEnum"
    // InternalOptGrammar.g:7962:1: ruleSpecialExpressionTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) ;
    public final Enumerator ruleSpecialExpressionTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptGrammar.g:7968:2: ( ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) ) )
            // InternalOptGrammar.g:7969:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            {
            // InternalOptGrammar.g:7969:2: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'this' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==210) ) {
                alt115=1;
            }
            else if ( (LA115_0==211) ) {
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
                    // InternalOptGrammar.g:7970:3: (enumLiteral_0= 'super' )
                    {
                    // InternalOptGrammar.g:7970:3: (enumLiteral_0= 'super' )
                    // InternalOptGrammar.g:7971:4: enumLiteral_0= 'super'
                    {
                    enumLiteral_0=(Token)match(input,210,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSpecialExpressionTypeEnumAccess().getSUPEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSpecialExpressionTypeEnumAccess().getSUPEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOptGrammar.g:7978:3: (enumLiteral_1= 'this' )
                    {
                    // InternalOptGrammar.g:7978:3: (enumLiteral_1= 'this' )
                    // InternalOptGrammar.g:7979:4: enumLiteral_1= 'this'
                    {
                    enumLiteral_1=(Token)match(input,211,FOLLOW_2); if (state.failed) return current;
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
        // InternalOptGrammar.g:3515:5: ( 'else' )
        // InternalOptGrammar.g:3515:6: 'else'
        {
        match(input,44,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalOptGrammar

    // $ANTLR start synpred2_InternalOptGrammar
    public final void synpred2_InternalOptGrammar_fragment() throws RecognitionException {   
        // InternalOptGrammar.g:3657:4: ( ';' )
        // InternalOptGrammar.g:3657:5: ';'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalOptGrammar

    // $ANTLR start synpred3_InternalOptGrammar
    public final void synpred3_InternalOptGrammar_fragment() throws RecognitionException {   
        // InternalOptGrammar.g:4806:4: ( ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) ) )
        // InternalOptGrammar.g:4806:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        {
        // InternalOptGrammar.g:4806:5: ( () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) ) )
        // InternalOptGrammar.g:4807:5: () ( ( ruleAdditionOpEnum ) ) ( ( ruleMulDivMod ) )
        {
        // InternalOptGrammar.g:4807:5: ()
        // InternalOptGrammar.g:4808:5: 
        {
        }

        // InternalOptGrammar.g:4809:5: ( ( ruleAdditionOpEnum ) )
        // InternalOptGrammar.g:4810:6: ( ruleAdditionOpEnum )
        {
        // InternalOptGrammar.g:4810:6: ( ruleAdditionOpEnum )
        // InternalOptGrammar.g:4811:7: ruleAdditionOpEnum
        {
        pushFollow(FOLLOW_12);
        ruleAdditionOpEnum();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalOptGrammar.g:4814:5: ( ( ruleMulDivMod ) )
        // InternalOptGrammar.g:4815:6: ( ruleMulDivMod )
        {
        // InternalOptGrammar.g:4815:6: ( ruleMulDivMod )
        // InternalOptGrammar.g:4816:7: ruleMulDivMod
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


    protected DFA40 dfa40 = new DFA40(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String dfa_1s = "\152\uffff";
    static final String dfa_2s = "\147\4\3\uffff";
    static final String dfa_3s = "\1\u00d3\146\u00ad\3\uffff";
    static final String dfa_4s = "\147\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\152\uffff}>";
    static final String[] dfa_6s = {
            "\11\151\12\uffff\1\151\11\uffff\1\147\3\uffff\1\150\24\uffff\7\151\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\51\uffff\4\151",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
            "\1\147\22\uffff\1\151\4\uffff\1\147\3\uffff\1\147\2\uffff\1\147\u0083\uffff\7\147",
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

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2132:3: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }

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
            return "2376:2: ( (this_StandardTypeWithoutQualifiedIdentifier_0= ruleStandardTypeWithoutQualifiedIdentifier ( () ( (lv_optionalElements_2_0= ruleVariableDeclarationOptionalElement ) )* ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ) | ( ruleVarType ( ( () ( (lv_variable_8_0= ruleVariable ) ) (otherlv_9= '=' ( (lv_expression_10_0= ruleExpression ) ) ) ) | ( () ( (lv_tuple_12_0= ruleTuple ) ) (otherlv_13= '=' ( (lv_expression_14_0= ruleExpression ) ) ) ) ) ) | this_ExpressionStatement_15= ruleExpressionStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001A264400010L,0xFFFFFFFFFFFFFFFEL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xFC00000201801FF0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xFC00000200801FF0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018300010L,0x0000000000000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002200400010L,0xFFFFFFFFFFFFFFFEL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000110000010L,0x0000000000000000L,0x00003F8000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0xFFFFFFFFFFFFFFFEL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002200000010L,0xFFFFFFFFFFFFFFFEL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xFC00001200801FF0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xFC00000201881FF0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xFC00000200881FF0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000110800010L,0x0000000000000000L,0x00003F8000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004800800002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000900010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000A00010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002201000010L,0xFFFFFFFFFFFFFFFEL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000110000012L,0x0000000000000000L,0x00003F8000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000200000010L,0xFFFFFFFFFFFFFFFEL,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xFC0FEC2200901FF0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xFC0FEC2200B01FF0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xFC00000200A01FF0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xFC0FEC2201901FF0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xFC0FEC2200D01FF0L,0xFFFFFFFFFFFFFFFFL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000190000012L,0x0000000000000000L,0xFF003F8000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000200801FF0L,0xFFFFFFFFFFFFFFFEL,0x0000007FFFFFFFFFL,0x00000000000F0000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00FFC00000000000L});

}