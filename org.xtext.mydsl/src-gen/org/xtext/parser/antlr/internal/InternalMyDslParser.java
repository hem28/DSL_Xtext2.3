package org.xtext.parser.antlr.internal; 

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
import org.xtext.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Interface'", "'namespace:'", "'Operation'", "'Event'", "'[in]'", "':'", "'[out]'", "'boolean'", "'integer'", "'int'", "'time'", "'date'", "'string'", "'decimal'", "'dateTime'", "'positiveInteger'", "'nonNegativeInteger'", "'token'", "'base64Binary'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Interface";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface75);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:77:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'namespace:' ( (lv_nsURI_3_0= RULE_STRING ) ) ( (lv_items_4_0= ruleItem ) )* ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_nsURI_3_0=null;
        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:80:28: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'namespace:' ( (lv_nsURI_3_0= RULE_STRING ) ) ( (lv_items_4_0= ruleItem ) )* ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'namespace:' ( (lv_nsURI_3_0= RULE_STRING ) ) ( (lv_items_4_0= ruleItem ) )* )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'namespace:' ( (lv_nsURI_3_0= RULE_STRING ) ) ( (lv_items_4_0= ruleItem ) )* )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:81:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'namespace:' ( (lv_nsURI_3_0= RULE_STRING ) ) ( (lv_items_4_0= ruleItem ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInterface122); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:86:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInterface156); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getNamespaceKeyword_2());
                
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:107:1: ( (lv_nsURI_3_0= RULE_STRING ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:108:1: (lv_nsURI_3_0= RULE_STRING )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:108:1: (lv_nsURI_3_0= RULE_STRING )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:109:3: lv_nsURI_3_0= RULE_STRING
            {
            lv_nsURI_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface173); 

            			newLeafNode(lv_nsURI_3_0, grammarAccess.getInterfaceAccess().getNsURISTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nsURI",
                    		lv_nsURI_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:125:2: ( (lv_items_4_0= ruleItem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:126:1: (lv_items_4_0= ruleItem )
            	    {
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:126:1: (lv_items_4_0= ruleItem )
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:127:3: lv_items_4_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getItemsItemParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleInterface199);
            	    lv_items_4_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_4_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleItem"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:151:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:152:2: (iv_ruleItem= ruleItem EOF )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:153:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem236);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem246); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:160:1: ruleItem returns [EObject current=null] : (this_Operation_0= ruleOperation | this_Event_1= ruleEvent ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Operation_0 = null;

        EObject this_Event_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:163:28: ( (this_Operation_0= ruleOperation | this_Event_1= ruleEvent ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:164:1: (this_Operation_0= ruleOperation | this_Event_1= ruleEvent )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:164:1: (this_Operation_0= ruleOperation | this_Event_1= ruleEvent )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:165:5: this_Operation_0= ruleOperation
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getOperationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOperation_in_ruleItem293);
                    this_Operation_0=ruleOperation();

                    state._fsp--;

                     
                            current = this_Operation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:175:5: this_Event_1= ruleEvent
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getEventParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEvent_in_ruleItem320);
                    this_Event_1=ruleEvent();

                    state._fsp--;

                     
                            current = this_Event_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:191:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:192:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:193:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation355);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation365); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:200:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'Operation' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_ins_2_0= ruleInparam ) ) | ( (lv_outs_3_0= ruleOutparam ) ) )* ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_ins_2_0 = null;

        EObject lv_outs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:203:28: ( (otherlv_0= 'Operation' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_ins_2_0= ruleInparam ) ) | ( (lv_outs_3_0= ruleOutparam ) ) )* ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:204:1: (otherlv_0= 'Operation' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_ins_2_0= ruleInparam ) ) | ( (lv_outs_3_0= ruleOutparam ) ) )* )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:204:1: (otherlv_0= 'Operation' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_ins_2_0= ruleInparam ) ) | ( (lv_outs_3_0= ruleOutparam ) ) )* )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:204:3: otherlv_0= 'Operation' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_ins_2_0= ruleInparam ) ) | ( (lv_outs_3_0= ruleOutparam ) ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleOperation402); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
                
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:208:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:209:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:209:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:210:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation419); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:226:2: ( ( (lv_ins_2_0= ruleInparam ) ) | ( (lv_outs_3_0= ruleOutparam ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }
                else if ( (LA3_0==17) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:226:3: ( (lv_ins_2_0= ruleInparam ) )
            	    {
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:226:3: ( (lv_ins_2_0= ruleInparam ) )
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:227:1: (lv_ins_2_0= ruleInparam )
            	    {
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:227:1: (lv_ins_2_0= ruleInparam )
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:228:3: lv_ins_2_0= ruleInparam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperationAccess().getInsInparamParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInparam_in_ruleOperation446);
            	    lv_ins_2_0=ruleInparam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ins",
            	            		lv_ins_2_0, 
            	            		"Inparam");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:245:6: ( (lv_outs_3_0= ruleOutparam ) )
            	    {
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:245:6: ( (lv_outs_3_0= ruleOutparam ) )
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:246:1: (lv_outs_3_0= ruleOutparam )
            	    {
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:246:1: (lv_outs_3_0= ruleOutparam )
            	    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:247:3: lv_outs_3_0= ruleOutparam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperationAccess().getOutsOutparamParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOutparam_in_ruleOperation473);
            	    lv_outs_3_0=ruleOutparam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"outs",
            	            		lv_outs_3_0, 
            	            		"Outparam");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:271:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:272:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:273:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent511);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent521); 

            }

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
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:280:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_outs_2_0= ruleOutparam ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_outs_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:283:28: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_outs_2_0= ruleOutparam ) ) ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:284:1: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_outs_2_0= ruleOutparam ) ) )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:284:1: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_outs_2_0= ruleOutparam ) ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:284:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_outs_2_0= ruleOutparam ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleEvent558); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:288:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:289:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:289:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:290:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent575); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:306:2: ( (lv_outs_2_0= ruleOutparam ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:307:1: (lv_outs_2_0= ruleOutparam )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:307:1: (lv_outs_2_0= ruleOutparam )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:308:3: lv_outs_2_0= ruleOutparam
            {
             
            	        newCompositeNode(grammarAccess.getEventAccess().getOutsOutparamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOutparam_in_ruleEvent601);
            lv_outs_2_0=ruleOutparam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRule());
            	        }
                   		set(
                   			current, 
                   			"outs",
                    		lv_outs_2_0, 
                    		"Outparam");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleInparam"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:332:1: entryRuleInparam returns [EObject current=null] : iv_ruleInparam= ruleInparam EOF ;
    public final EObject entryRuleInparam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInparam = null;


        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:333:2: (iv_ruleInparam= ruleInparam EOF )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:334:2: iv_ruleInparam= ruleInparam EOF
            {
             newCompositeNode(grammarAccess.getInparamRule()); 
            pushFollow(FOLLOW_ruleInparam_in_entryRuleInparam637);
            iv_ruleInparam=ruleInparam();

            state._fsp--;

             current =iv_ruleInparam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInparam647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInparam"


    // $ANTLR start "ruleInparam"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:341:1: ruleInparam returns [EObject current=null] : (otherlv_0= '[in]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleBuiltinType ) ) ) ;
    public final EObject ruleInparam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:344:28: ( (otherlv_0= '[in]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleBuiltinType ) ) ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:345:1: (otherlv_0= '[in]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleBuiltinType ) ) )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:345:1: (otherlv_0= '[in]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleBuiltinType ) ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:345:3: otherlv_0= '[in]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleBuiltinType ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleInparam684); 

                	newLeafNode(otherlv_0, grammarAccess.getInparamAccess().getInKeyword_0());
                
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:349:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:350:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:350:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:351:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInparam701); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInparamAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInparamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleInparam718); 

                	newLeafNode(otherlv_2, grammarAccess.getInparamAccess().getColonKeyword_2());
                
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:371:1: ( (lv_type_3_0= ruleBuiltinType ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:372:1: (lv_type_3_0= ruleBuiltinType )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:372:1: (lv_type_3_0= ruleBuiltinType )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:373:3: lv_type_3_0= ruleBuiltinType
            {
             
            	        newCompositeNode(grammarAccess.getInparamAccess().getTypeBuiltinTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBuiltinType_in_ruleInparam739);
            lv_type_3_0=ruleBuiltinType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInparamRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"BuiltinType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInparam"


    // $ANTLR start "entryRuleOutparam"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:397:1: entryRuleOutparam returns [EObject current=null] : iv_ruleOutparam= ruleOutparam EOF ;
    public final EObject entryRuleOutparam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutparam = null;


        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:398:2: (iv_ruleOutparam= ruleOutparam EOF )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:399:2: iv_ruleOutparam= ruleOutparam EOF
            {
             newCompositeNode(grammarAccess.getOutparamRule()); 
            pushFollow(FOLLOW_ruleOutparam_in_entryRuleOutparam775);
            iv_ruleOutparam=ruleOutparam();

            state._fsp--;

             current =iv_ruleOutparam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutparam785); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutparam"


    // $ANTLR start "ruleOutparam"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:406:1: ruleOutparam returns [EObject current=null] : (otherlv_0= '[out]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleBuiltinType ) ) ) ;
    public final EObject ruleOutparam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:409:28: ( (otherlv_0= '[out]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleBuiltinType ) ) ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:410:1: (otherlv_0= '[out]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleBuiltinType ) ) )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:410:1: (otherlv_0= '[out]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleBuiltinType ) ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:410:3: otherlv_0= '[out]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleBuiltinType ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleOutparam822); 

                	newLeafNode(otherlv_0, grammarAccess.getOutparamAccess().getOutKeyword_0());
                
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:414:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:415:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:415:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:416:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutparam839); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOutparamAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutparamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleOutparam856); 

                	newLeafNode(otherlv_2, grammarAccess.getOutparamAccess().getColonKeyword_2());
                
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:436:1: ( (lv_type_3_0= ruleBuiltinType ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:437:1: (lv_type_3_0= ruleBuiltinType )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:437:1: (lv_type_3_0= ruleBuiltinType )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:438:3: lv_type_3_0= ruleBuiltinType
            {
             
            	        newCompositeNode(grammarAccess.getOutparamAccess().getTypeBuiltinTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBuiltinType_in_ruleOutparam877);
            lv_type_3_0=ruleBuiltinType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutparamRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"BuiltinType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutparam"


    // $ANTLR start "ruleBuiltinType"
    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:462:1: ruleBuiltinType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'decimal' ) | (enumLiteral_7= 'dateTime' ) | (enumLiteral_8= 'positiveInteger' ) | (enumLiteral_9= 'nonNegativeInteger' ) | (enumLiteral_10= 'token' ) | (enumLiteral_11= 'base64Binary' ) ) ;
    public final Enumerator ruleBuiltinType() throws RecognitionException {
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
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:464:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'decimal' ) | (enumLiteral_7= 'dateTime' ) | (enumLiteral_8= 'positiveInteger' ) | (enumLiteral_9= 'nonNegativeInteger' ) | (enumLiteral_10= 'token' ) | (enumLiteral_11= 'base64Binary' ) ) )
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:465:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'decimal' ) | (enumLiteral_7= 'dateTime' ) | (enumLiteral_8= 'positiveInteger' ) | (enumLiteral_9= 'nonNegativeInteger' ) | (enumLiteral_10= 'token' ) | (enumLiteral_11= 'base64Binary' ) )
            {
            // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:465:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'decimal' ) | (enumLiteral_7= 'dateTime' ) | (enumLiteral_8= 'positiveInteger' ) | (enumLiteral_9= 'nonNegativeInteger' ) | (enumLiteral_10= 'token' ) | (enumLiteral_11= 'base64Binary' ) )
            int alt4=12;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            case 23:
                {
                alt4=6;
                }
                break;
            case 24:
                {
                alt4=7;
                }
                break;
            case 25:
                {
                alt4=8;
                }
                break;
            case 26:
                {
                alt4=9;
                }
                break;
            case 27:
                {
                alt4=10;
                }
                break;
            case 28:
                {
                alt4=11;
                }
                break;
            case 29:
                {
                alt4=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:465:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:465:2: (enumLiteral_0= 'boolean' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:465:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleBuiltinType927); 

                            current = grammarAccess.getBuiltinTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBuiltinTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:471:6: (enumLiteral_1= 'integer' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:471:6: (enumLiteral_1= 'integer' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:471:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_19_in_ruleBuiltinType944); 

                            current = grammarAccess.getBuiltinTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBuiltinTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:477:6: (enumLiteral_2= 'int' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:477:6: (enumLiteral_2= 'int' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:477:8: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_20_in_ruleBuiltinType961); 

                            current = grammarAccess.getBuiltinTypeAccess().getIntEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBuiltinTypeAccess().getIntEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:483:6: (enumLiteral_3= 'time' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:483:6: (enumLiteral_3= 'time' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:483:8: enumLiteral_3= 'time'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_21_in_ruleBuiltinType978); 

                            current = grammarAccess.getBuiltinTypeAccess().getTimeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBuiltinTypeAccess().getTimeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:489:6: (enumLiteral_4= 'date' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:489:6: (enumLiteral_4= 'date' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:489:8: enumLiteral_4= 'date'
                    {
                    enumLiteral_4=(Token)match(input,22,FOLLOW_22_in_ruleBuiltinType995); 

                            current = grammarAccess.getBuiltinTypeAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBuiltinTypeAccess().getDateEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:495:6: (enumLiteral_5= 'string' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:495:6: (enumLiteral_5= 'string' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:495:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_23_in_ruleBuiltinType1012); 

                            current = grammarAccess.getBuiltinTypeAccess().getStringEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBuiltinTypeAccess().getStringEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:501:6: (enumLiteral_6= 'decimal' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:501:6: (enumLiteral_6= 'decimal' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:501:8: enumLiteral_6= 'decimal'
                    {
                    enumLiteral_6=(Token)match(input,24,FOLLOW_24_in_ruleBuiltinType1029); 

                            current = grammarAccess.getBuiltinTypeAccess().getDecimalEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBuiltinTypeAccess().getDecimalEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:507:6: (enumLiteral_7= 'dateTime' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:507:6: (enumLiteral_7= 'dateTime' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:507:8: enumLiteral_7= 'dateTime'
                    {
                    enumLiteral_7=(Token)match(input,25,FOLLOW_25_in_ruleBuiltinType1046); 

                            current = grammarAccess.getBuiltinTypeAccess().getDateTimeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBuiltinTypeAccess().getDateTimeEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:513:6: (enumLiteral_8= 'positiveInteger' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:513:6: (enumLiteral_8= 'positiveInteger' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:513:8: enumLiteral_8= 'positiveInteger'
                    {
                    enumLiteral_8=(Token)match(input,26,FOLLOW_26_in_ruleBuiltinType1063); 

                            current = grammarAccess.getBuiltinTypeAccess().getPositiveIntegerEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getBuiltinTypeAccess().getPositiveIntegerEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:519:6: (enumLiteral_9= 'nonNegativeInteger' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:519:6: (enumLiteral_9= 'nonNegativeInteger' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:519:8: enumLiteral_9= 'nonNegativeInteger'
                    {
                    enumLiteral_9=(Token)match(input,27,FOLLOW_27_in_ruleBuiltinType1080); 

                            current = grammarAccess.getBuiltinTypeAccess().getNonNegativeIntegerEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getBuiltinTypeAccess().getNonNegativeIntegerEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:525:6: (enumLiteral_10= 'token' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:525:6: (enumLiteral_10= 'token' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:525:8: enumLiteral_10= 'token'
                    {
                    enumLiteral_10=(Token)match(input,28,FOLLOW_28_in_ruleBuiltinType1097); 

                            current = grammarAccess.getBuiltinTypeAccess().getTokenEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getBuiltinTypeAccess().getTokenEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:531:6: (enumLiteral_11= 'base64Binary' )
                    {
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:531:6: (enumLiteral_11= 'base64Binary' )
                    // ../org.xtext.mydsl/src-gen/org/xtext/parser/antlr/internal/InternalMyDsl.g:531:8: enumLiteral_11= 'base64Binary'
                    {
                    enumLiteral_11=(Token)match(input,29,FOLLOW_29_in_ruleBuiltinType1114); 

                            current = grammarAccess.getBuiltinTypeAccess().getBase64BinaryEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getBuiltinTypeAccess().getBase64BinaryEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuiltinType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInterface122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterface156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface173 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleItem_in_ruleInterface199 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleItem293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleItem320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOperation402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation419 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_ruleInparam_in_ruleOperation446 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_ruleOutparam_in_ruleOperation473 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEvent558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent575 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ruleOutparam_in_ruleEvent601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInparam_in_entryRuleInparam637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInparam647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleInparam684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInparam701 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInparam718 = new BitSet(new long[]{0x000000003FFC0000L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_ruleInparam739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutparam_in_entryRuleOutparam775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutparam785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOutparam822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutparam839 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOutparam856 = new BitSet(new long[]{0x000000003FFC0000L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_ruleOutparam877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBuiltinType927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBuiltinType944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBuiltinType961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBuiltinType978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBuiltinType995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBuiltinType1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBuiltinType1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBuiltinType1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBuiltinType1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBuiltinType1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBuiltinType1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBuiltinType1114 = new BitSet(new long[]{0x0000000000000002L});

}