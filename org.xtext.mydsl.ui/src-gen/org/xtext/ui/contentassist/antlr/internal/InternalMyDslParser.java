package org.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'integer'", "'int'", "'time'", "'date'", "'string'", "'decimal'", "'dateTime'", "'positiveInteger'", "'nonNegativeInteger'", "'token'", "'base64Binary'", "'Interface'", "'namespace:'", "'Operation'", "'Event'", "'[in]'", "':'", "'[out]'"
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
    public String getGrammarFileName() { return "../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleInterface EOF )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface61);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Interface__Group__0 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Interface__Group__0 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface94);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleItem"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleItem EOF )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem121);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleItem : ( ( rule__Item__Alternatives ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Item__Alternatives ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Item__Alternatives ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Item__Alternatives ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Item__Alternatives )
            {
             before(grammarAccess.getItemAccess().getAlternatives()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Item__Alternatives )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Item__Alternatives
            {
            pushFollow(FOLLOW_rule__Item__Alternatives_in_ruleItem154);
            rule__Item__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleOperation EOF )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation181);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Operation__Group__0 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Operation__Group__0 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation214);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleEvent EOF )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent241);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Event__Group__0 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Event__Group__0 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Event__Group__0 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent274);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleInparam"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleInparam : ruleInparam EOF ;
    public final void entryRuleInparam() throws RecognitionException {
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleInparam EOF )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleInparam EOF
            {
             before(grammarAccess.getInparamRule()); 
            pushFollow(FOLLOW_ruleInparam_in_entryRuleInparam301);
            ruleInparam();

            state._fsp--;

             after(grammarAccess.getInparamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInparam308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInparam"


    // $ANTLR start "ruleInparam"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleInparam : ( ( rule__Inparam__Group__0 ) ) ;
    public final void ruleInparam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Inparam__Group__0 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Inparam__Group__0 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Inparam__Group__0 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Inparam__Group__0 )
            {
             before(grammarAccess.getInparamAccess().getGroup()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Inparam__Group__0 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Inparam__Group__0
            {
            pushFollow(FOLLOW_rule__Inparam__Group__0_in_ruleInparam334);
            rule__Inparam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInparamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInparam"


    // $ANTLR start "entryRuleOutparam"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleOutparam : ruleOutparam EOF ;
    public final void entryRuleOutparam() throws RecognitionException {
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleOutparam EOF )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleOutparam EOF
            {
             before(grammarAccess.getOutparamRule()); 
            pushFollow(FOLLOW_ruleOutparam_in_entryRuleOutparam361);
            ruleOutparam();

            state._fsp--;

             after(grammarAccess.getOutparamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutparam368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutparam"


    // $ANTLR start "ruleOutparam"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleOutparam : ( ( rule__Outparam__Group__0 ) ) ;
    public final void ruleOutparam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Outparam__Group__0 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Outparam__Group__0 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Outparam__Group__0 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Outparam__Group__0 )
            {
             before(grammarAccess.getOutparamAccess().getGroup()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Outparam__Group__0 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Outparam__Group__0
            {
            pushFollow(FOLLOW_rule__Outparam__Group__0_in_ruleOutparam394);
            rule__Outparam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutparamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutparam"


    // $ANTLR start "ruleBuiltinType"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ruleBuiltinType : ( ( rule__BuiltinType__Alternatives ) ) ;
    public final void ruleBuiltinType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:233:1: ( ( ( rule__BuiltinType__Alternatives ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:234:1: ( ( rule__BuiltinType__Alternatives ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:234:1: ( ( rule__BuiltinType__Alternatives ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:235:1: ( rule__BuiltinType__Alternatives )
            {
             before(grammarAccess.getBuiltinTypeAccess().getAlternatives()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:236:1: ( rule__BuiltinType__Alternatives )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:236:2: rule__BuiltinType__Alternatives
            {
            pushFollow(FOLLOW_rule__BuiltinType__Alternatives_in_ruleBuiltinType431);
            rule__BuiltinType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuiltinTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuiltinType"


    // $ANTLR start "rule__Item__Alternatives"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: rule__Item__Alternatives : ( ( ruleOperation ) | ( ruleEvent ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:251:1: ( ( ruleOperation ) | ( ruleEvent ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:252:1: ( ruleOperation )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:252:1: ( ruleOperation )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:253:1: ruleOperation
                    {
                     before(grammarAccess.getItemAccess().getOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOperation_in_rule__Item__Alternatives466);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:258:6: ( ruleEvent )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:258:6: ( ruleEvent )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: ruleEvent
                    {
                     before(grammarAccess.getItemAccess().getEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEvent_in_rule__Item__Alternatives483);
                    ruleEvent();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getEventParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives_2"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:269:1: rule__Operation__Alternatives_2 : ( ( ( rule__Operation__InsAssignment_2_0 ) ) | ( ( rule__Operation__OutsAssignment_2_1 ) ) );
    public final void rule__Operation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( ( ( rule__Operation__InsAssignment_2_0 ) ) | ( ( rule__Operation__OutsAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( ( rule__Operation__InsAssignment_2_0 ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( ( rule__Operation__InsAssignment_2_0 ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: ( rule__Operation__InsAssignment_2_0 )
                    {
                     before(grammarAccess.getOperationAccess().getInsAssignment_2_0()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: ( rule__Operation__InsAssignment_2_0 )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:276:2: rule__Operation__InsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Operation__InsAssignment_2_0_in_rule__Operation__Alternatives_2515);
                    rule__Operation__InsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationAccess().getInsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:280:6: ( ( rule__Operation__OutsAssignment_2_1 ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:280:6: ( ( rule__Operation__OutsAssignment_2_1 ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: ( rule__Operation__OutsAssignment_2_1 )
                    {
                     before(grammarAccess.getOperationAccess().getOutsAssignment_2_1()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: ( rule__Operation__OutsAssignment_2_1 )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:282:2: rule__Operation__OutsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Operation__OutsAssignment_2_1_in_rule__Operation__Alternatives_2533);
                    rule__Operation__OutsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationAccess().getOutsAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives_2"


    // $ANTLR start "rule__BuiltinType__Alternatives"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:291:1: rule__BuiltinType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'int' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'string' ) ) | ( ( 'decimal' ) ) | ( ( 'dateTime' ) ) | ( ( 'positiveInteger' ) ) | ( ( 'nonNegativeInteger' ) ) | ( ( 'token' ) ) | ( ( 'base64Binary' ) ) );
    public final void rule__BuiltinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:295:1: ( ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'int' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'string' ) ) | ( ( 'decimal' ) ) | ( ( 'dateTime' ) ) | ( ( 'positiveInteger' ) ) | ( ( 'nonNegativeInteger' ) ) | ( ( 'token' ) ) | ( ( 'base64Binary' ) ) )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            case 21:
                {
                alt3=11;
                }
                break;
            case 22:
                {
                alt3=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:296:1: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:296:1: ( ( 'boolean' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:297:1: ( 'boolean' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( 'boolean' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:298:3: 'boolean'
                    {
                    match(input,11,FOLLOW_11_in_rule__BuiltinType__Alternatives567); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:303:6: ( ( 'integer' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:303:6: ( ( 'integer' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( 'integer' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( 'integer' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:305:3: 'integer'
                    {
                    match(input,12,FOLLOW_12_in_rule__BuiltinType__Alternatives588); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:310:6: ( ( 'int' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:310:6: ( ( 'int' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:311:1: ( 'int' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getIntEnumLiteralDeclaration_2()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: ( 'int' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:312:3: 'int'
                    {
                    match(input,13,FOLLOW_13_in_rule__BuiltinType__Alternatives609); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getIntEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:317:6: ( ( 'time' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:317:6: ( ( 'time' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:318:1: ( 'time' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getTimeEnumLiteralDeclaration_3()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:319:1: ( 'time' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:319:3: 'time'
                    {
                    match(input,14,FOLLOW_14_in_rule__BuiltinType__Alternatives630); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getTimeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:324:6: ( ( 'date' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:324:6: ( ( 'date' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:325:1: ( 'date' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getDateEnumLiteralDeclaration_4()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( 'date' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:326:3: 'date'
                    {
                    match(input,15,FOLLOW_15_in_rule__BuiltinType__Alternatives651); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getDateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:331:6: ( ( 'string' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:331:6: ( ( 'string' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:332:1: ( 'string' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getStringEnumLiteralDeclaration_5()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( 'string' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:333:3: 'string'
                    {
                    match(input,16,FOLLOW_16_in_rule__BuiltinType__Alternatives672); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getStringEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:338:6: ( ( 'decimal' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:338:6: ( ( 'decimal' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:339:1: ( 'decimal' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getDecimalEnumLiteralDeclaration_6()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: ( 'decimal' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:340:3: 'decimal'
                    {
                    match(input,17,FOLLOW_17_in_rule__BuiltinType__Alternatives693); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getDecimalEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:345:6: ( ( 'dateTime' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:345:6: ( ( 'dateTime' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:346:1: ( 'dateTime' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getDateTimeEnumLiteralDeclaration_7()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:347:1: ( 'dateTime' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:347:3: 'dateTime'
                    {
                    match(input,18,FOLLOW_18_in_rule__BuiltinType__Alternatives714); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getDateTimeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:352:6: ( ( 'positiveInteger' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:352:6: ( ( 'positiveInteger' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:353:1: ( 'positiveInteger' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getPositiveIntegerEnumLiteralDeclaration_8()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( 'positiveInteger' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:354:3: 'positiveInteger'
                    {
                    match(input,19,FOLLOW_19_in_rule__BuiltinType__Alternatives735); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getPositiveIntegerEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:359:6: ( ( 'nonNegativeInteger' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:359:6: ( ( 'nonNegativeInteger' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:360:1: ( 'nonNegativeInteger' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getNonNegativeIntegerEnumLiteralDeclaration_9()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:361:1: ( 'nonNegativeInteger' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:361:3: 'nonNegativeInteger'
                    {
                    match(input,20,FOLLOW_20_in_rule__BuiltinType__Alternatives756); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getNonNegativeIntegerEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:366:6: ( ( 'token' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:366:6: ( ( 'token' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:367:1: ( 'token' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getTokenEnumLiteralDeclaration_10()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: ( 'token' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:368:3: 'token'
                    {
                    match(input,21,FOLLOW_21_in_rule__BuiltinType__Alternatives777); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getTokenEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:373:6: ( ( 'base64Binary' ) )
                    {
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:373:6: ( ( 'base64Binary' ) )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:374:1: ( 'base64Binary' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getBase64BinaryEnumLiteralDeclaration_11()); 
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:375:1: ( 'base64Binary' )
                    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:375:3: 'base64Binary'
                    {
                    match(input,22,FOLLOW_22_in_rule__BuiltinType__Alternatives798); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getBase64BinaryEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltinType__Alternatives"


    // $ANTLR start "rule__Interface__Group__0"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:391:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:392:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__0831);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__0834);
            rule__Interface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: rule__Interface__Group__0__Impl : ( 'Interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( ( 'Interface' ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( 'Interface' )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( 'Interface' )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: 'Interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Interface__Group__0__Impl862); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:422:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:423:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__1893);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__1896);
            rule__Interface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:430:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: ( ( rule__Interface__NameAssignment_1 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:437:1: ( rule__Interface__NameAssignment_1 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl923);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:451:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:452:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__2953);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__2956);
            rule__Interface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:459:1: rule__Interface__Group__2__Impl : ( 'namespace:' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:463:1: ( ( 'namespace:' ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: ( 'namespace:' )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: ( 'namespace:' )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: 'namespace:'
            {
             before(grammarAccess.getInterfaceAccess().getNamespaceKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Interface__Group__2__Impl984); 
             after(grammarAccess.getInterfaceAccess().getNamespaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:483:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31015);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31018);
            rule__Interface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:490:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__NsURIAssignment_3 ) ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( ( rule__Interface__NsURIAssignment_3 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( ( rule__Interface__NsURIAssignment_3 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( ( rule__Interface__NsURIAssignment_3 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( rule__Interface__NsURIAssignment_3 )
            {
             before(grammarAccess.getInterfaceAccess().getNsURIAssignment_3()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( rule__Interface__NsURIAssignment_3 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:497:2: rule__Interface__NsURIAssignment_3
            {
            pushFollow(FOLLOW_rule__Interface__NsURIAssignment_3_in_rule__Interface__Group__3__Impl1045);
            rule__Interface__NsURIAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNsURIAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ( rule__Interface__Group__4__Impl )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:512:2: rule__Interface__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41075);
            rule__Interface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:518:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__ItemsAssignment_4 )* ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( ( rule__Interface__ItemsAssignment_4 )* ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( ( rule__Interface__ItemsAssignment_4 )* )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( ( rule__Interface__ItemsAssignment_4 )* )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__Interface__ItemsAssignment_4 )*
            {
             before(grammarAccess.getInterfaceAccess().getItemsAssignment_4()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( rule__Interface__ItemsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=25 && LA4_0<=26)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:525:2: rule__Interface__ItemsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Interface__ItemsAssignment_4_in_rule__Interface__Group__4__Impl1102);
            	    rule__Interface__ItemsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getItemsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:549:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:550:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01143);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01146);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: rule__Operation__Group__0__Impl : ( 'Operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:561:1: ( ( 'Operation' ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:562:1: ( 'Operation' )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:562:1: ( 'Operation' )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: 'Operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group__0__Impl1174); 
             after(grammarAccess.getOperationAccess().getOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:576:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:581:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__11205);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__11208);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ( rule__Operation__NameAssignment_1 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:595:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl1235);
            rule__Operation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( rule__Operation__Group__2__Impl )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:610:2: rule__Operation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__21265);
            rule__Operation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:616:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__Alternatives_2 )* ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: ( ( ( rule__Operation__Alternatives_2 )* ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( ( rule__Operation__Alternatives_2 )* )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( ( rule__Operation__Alternatives_2 )* )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ( rule__Operation__Alternatives_2 )*
            {
             before(grammarAccess.getOperationAccess().getAlternatives_2()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( rule__Operation__Alternatives_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27||LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:623:2: rule__Operation__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Alternatives_2_in_rule__Operation__Group__2__Impl1292);
            	    rule__Operation__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:643:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:644:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__01329);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__01332);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: rule__Event__Group__0__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: ( ( 'Event' ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: ( 'Event' )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: ( 'Event' )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Event__Group__0__Impl1360); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:674:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:675:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__11391);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__11394);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:682:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( ( rule__Event__NameAssignment_1 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( rule__Event__NameAssignment_1 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:689:2: rule__Event__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl1421);
            rule__Event__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: rule__Event__Group__2 : rule__Event__Group__2__Impl ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: ( rule__Event__Group__2__Impl )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:704:2: rule__Event__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__21451);
            rule__Event__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: rule__Event__Group__2__Impl : ( ( rule__Event__OutsAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ( ( ( rule__Event__OutsAssignment_2 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( ( rule__Event__OutsAssignment_2 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( ( rule__Event__OutsAssignment_2 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: ( rule__Event__OutsAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getOutsAssignment_2()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:717:1: ( rule__Event__OutsAssignment_2 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:717:2: rule__Event__OutsAssignment_2
            {
            pushFollow(FOLLOW_rule__Event__OutsAssignment_2_in_rule__Event__Group__2__Impl1478);
            rule__Event__OutsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getOutsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Inparam__Group__0"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: rule__Inparam__Group__0 : rule__Inparam__Group__0__Impl rule__Inparam__Group__1 ;
    public final void rule__Inparam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( rule__Inparam__Group__0__Impl rule__Inparam__Group__1 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:738:2: rule__Inparam__Group__0__Impl rule__Inparam__Group__1
            {
            pushFollow(FOLLOW_rule__Inparam__Group__0__Impl_in_rule__Inparam__Group__01514);
            rule__Inparam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Inparam__Group__1_in_rule__Inparam__Group__01517);
            rule__Inparam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inparam__Group__0"


    // $ANTLR start "rule__Inparam__Group__0__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: rule__Inparam__Group__0__Impl : ( '[in]' ) ;
    public final void rule__Inparam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( ( '[in]' ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( '[in]' )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( '[in]' )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: '[in]'
            {
             before(grammarAccess.getInparamAccess().getInKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Inparam__Group__0__Impl1545); 
             after(grammarAccess.getInparamAccess().getInKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inparam__Group__0__Impl"


    // $ANTLR start "rule__Inparam__Group__1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: rule__Inparam__Group__1 : rule__Inparam__Group__1__Impl rule__Inparam__Group__2 ;
    public final void rule__Inparam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( rule__Inparam__Group__1__Impl rule__Inparam__Group__2 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:769:2: rule__Inparam__Group__1__Impl rule__Inparam__Group__2
            {
            pushFollow(FOLLOW_rule__Inparam__Group__1__Impl_in_rule__Inparam__Group__11576);
            rule__Inparam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Inparam__Group__2_in_rule__Inparam__Group__11579);
            rule__Inparam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inparam__Group__1"


    // $ANTLR start "rule__Inparam__Group__1__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: rule__Inparam__Group__1__Impl : ( ( rule__Inparam__NameAssignment_1 ) ) ;
    public final void rule__Inparam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: ( ( ( rule__Inparam__NameAssignment_1 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( ( rule__Inparam__NameAssignment_1 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( ( rule__Inparam__NameAssignment_1 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( rule__Inparam__NameAssignment_1 )
            {
             before(grammarAccess.getInparamAccess().getNameAssignment_1()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( rule__Inparam__NameAssignment_1 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:783:2: rule__Inparam__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Inparam__NameAssignment_1_in_rule__Inparam__Group__1__Impl1606);
            rule__Inparam__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInparamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inparam__Group__1__Impl"


    // $ANTLR start "rule__Inparam__Group__2"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: rule__Inparam__Group__2 : rule__Inparam__Group__2__Impl rule__Inparam__Group__3 ;
    public final void rule__Inparam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( rule__Inparam__Group__2__Impl rule__Inparam__Group__3 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:798:2: rule__Inparam__Group__2__Impl rule__Inparam__Group__3
            {
            pushFollow(FOLLOW_rule__Inparam__Group__2__Impl_in_rule__Inparam__Group__21636);
            rule__Inparam__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Inparam__Group__3_in_rule__Inparam__Group__21639);
            rule__Inparam__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inparam__Group__2"


    // $ANTLR start "rule__Inparam__Group__2__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: rule__Inparam__Group__2__Impl : ( ':' ) ;
    public final void rule__Inparam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:809:1: ( ( ':' ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( ':' )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( ':' )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ':'
            {
             before(grammarAccess.getInparamAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Inparam__Group__2__Impl1667); 
             after(grammarAccess.getInparamAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inparam__Group__2__Impl"


    // $ANTLR start "rule__Inparam__Group__3"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: rule__Inparam__Group__3 : rule__Inparam__Group__3__Impl ;
    public final void rule__Inparam__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( rule__Inparam__Group__3__Impl )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:829:2: rule__Inparam__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Inparam__Group__3__Impl_in_rule__Inparam__Group__31698);
            rule__Inparam__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inparam__Group__3"


    // $ANTLR start "rule__Inparam__Group__3__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: rule__Inparam__Group__3__Impl : ( ( rule__Inparam__TypeAssignment_3 ) ) ;
    public final void rule__Inparam__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( ( ( rule__Inparam__TypeAssignment_3 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( ( rule__Inparam__TypeAssignment_3 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( ( rule__Inparam__TypeAssignment_3 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: ( rule__Inparam__TypeAssignment_3 )
            {
             before(grammarAccess.getInparamAccess().getTypeAssignment_3()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: ( rule__Inparam__TypeAssignment_3 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:842:2: rule__Inparam__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Inparam__TypeAssignment_3_in_rule__Inparam__Group__3__Impl1725);
            rule__Inparam__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInparamAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inparam__Group__3__Impl"


    // $ANTLR start "rule__Outparam__Group__0"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: rule__Outparam__Group__0 : rule__Outparam__Group__0__Impl rule__Outparam__Group__1 ;
    public final void rule__Outparam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: ( rule__Outparam__Group__0__Impl rule__Outparam__Group__1 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:865:2: rule__Outparam__Group__0__Impl rule__Outparam__Group__1
            {
            pushFollow(FOLLOW_rule__Outparam__Group__0__Impl_in_rule__Outparam__Group__01763);
            rule__Outparam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Outparam__Group__1_in_rule__Outparam__Group__01766);
            rule__Outparam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outparam__Group__0"


    // $ANTLR start "rule__Outparam__Group__0__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: rule__Outparam__Group__0__Impl : ( '[out]' ) ;
    public final void rule__Outparam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: ( ( '[out]' ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: ( '[out]' )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: ( '[out]' )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:878:1: '[out]'
            {
             before(grammarAccess.getOutparamAccess().getOutKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Outparam__Group__0__Impl1794); 
             after(grammarAccess.getOutparamAccess().getOutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outparam__Group__0__Impl"


    // $ANTLR start "rule__Outparam__Group__1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: rule__Outparam__Group__1 : rule__Outparam__Group__1__Impl rule__Outparam__Group__2 ;
    public final void rule__Outparam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ( rule__Outparam__Group__1__Impl rule__Outparam__Group__2 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:896:2: rule__Outparam__Group__1__Impl rule__Outparam__Group__2
            {
            pushFollow(FOLLOW_rule__Outparam__Group__1__Impl_in_rule__Outparam__Group__11825);
            rule__Outparam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Outparam__Group__2_in_rule__Outparam__Group__11828);
            rule__Outparam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outparam__Group__1"


    // $ANTLR start "rule__Outparam__Group__1__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:903:1: rule__Outparam__Group__1__Impl : ( ( rule__Outparam__NameAssignment_1 ) ) ;
    public final void rule__Outparam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:907:1: ( ( ( rule__Outparam__NameAssignment_1 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( ( rule__Outparam__NameAssignment_1 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( ( rule__Outparam__NameAssignment_1 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( rule__Outparam__NameAssignment_1 )
            {
             before(grammarAccess.getOutparamAccess().getNameAssignment_1()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( rule__Outparam__NameAssignment_1 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:910:2: rule__Outparam__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Outparam__NameAssignment_1_in_rule__Outparam__Group__1__Impl1855);
            rule__Outparam__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutparamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outparam__Group__1__Impl"


    // $ANTLR start "rule__Outparam__Group__2"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: rule__Outparam__Group__2 : rule__Outparam__Group__2__Impl rule__Outparam__Group__3 ;
    public final void rule__Outparam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: ( rule__Outparam__Group__2__Impl rule__Outparam__Group__3 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:925:2: rule__Outparam__Group__2__Impl rule__Outparam__Group__3
            {
            pushFollow(FOLLOW_rule__Outparam__Group__2__Impl_in_rule__Outparam__Group__21885);
            rule__Outparam__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Outparam__Group__3_in_rule__Outparam__Group__21888);
            rule__Outparam__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outparam__Group__2"


    // $ANTLR start "rule__Outparam__Group__2__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: rule__Outparam__Group__2__Impl : ( ':' ) ;
    public final void rule__Outparam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:936:1: ( ( ':' ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ( ':' )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ( ':' )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ':'
            {
             before(grammarAccess.getOutparamAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Outparam__Group__2__Impl1916); 
             after(grammarAccess.getOutparamAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outparam__Group__2__Impl"


    // $ANTLR start "rule__Outparam__Group__3"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: rule__Outparam__Group__3 : rule__Outparam__Group__3__Impl ;
    public final void rule__Outparam__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( rule__Outparam__Group__3__Impl )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:956:2: rule__Outparam__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Outparam__Group__3__Impl_in_rule__Outparam__Group__31947);
            rule__Outparam__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outparam__Group__3"


    // $ANTLR start "rule__Outparam__Group__3__Impl"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: rule__Outparam__Group__3__Impl : ( ( rule__Outparam__TypeAssignment_3 ) ) ;
    public final void rule__Outparam__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( ( ( rule__Outparam__TypeAssignment_3 ) ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( ( rule__Outparam__TypeAssignment_3 ) )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( ( rule__Outparam__TypeAssignment_3 ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( rule__Outparam__TypeAssignment_3 )
            {
             before(grammarAccess.getOutparamAccess().getTypeAssignment_3()); 
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: ( rule__Outparam__TypeAssignment_3 )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:969:2: rule__Outparam__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Outparam__TypeAssignment_3_in_rule__Outparam__Group__3__Impl1974);
            rule__Outparam__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutparamAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outparam__Group__3__Impl"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:992:1: ( ( RULE_ID ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: ( RULE_ID )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: ( RULE_ID )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_12017); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__NsURIAssignment_3"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: rule__Interface__NsURIAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Interface__NsURIAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( ( RULE_STRING ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( RULE_STRING )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( RULE_STRING )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getNsURISTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__NsURIAssignment_32048); 
             after(grammarAccess.getInterfaceAccess().getNsURISTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NsURIAssignment_3"


    // $ANTLR start "rule__Interface__ItemsAssignment_4"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: rule__Interface__ItemsAssignment_4 : ( ruleItem ) ;
    public final void rule__Interface__ItemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: ( ( ruleItem ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( ruleItem )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( ruleItem )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: ruleItem
            {
             before(grammarAccess.getInterfaceAccess().getItemsItemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__Interface__ItemsAssignment_42079);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getItemsItemParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ItemsAssignment_4"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: ( ( RULE_ID ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( RULE_ID )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( RULE_ID )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_12110); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_1"


    // $ANTLR start "rule__Operation__InsAssignment_2_0"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: rule__Operation__InsAssignment_2_0 : ( ruleInparam ) ;
    public final void rule__Operation__InsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: ( ( ruleInparam ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: ( ruleInparam )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: ( ruleInparam )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ruleInparam
            {
             before(grammarAccess.getOperationAccess().getInsInparamParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleInparam_in_rule__Operation__InsAssignment_2_02141);
            ruleInparam();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getInsInparamParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__InsAssignment_2_0"


    // $ANTLR start "rule__Operation__OutsAssignment_2_1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: rule__Operation__OutsAssignment_2_1 : ( ruleOutparam ) ;
    public final void rule__Operation__OutsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( ( ruleOutparam ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ruleOutparam )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ruleOutparam )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ruleOutparam
            {
             before(grammarAccess.getOperationAccess().getOutsOutparamParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleOutparam_in_rule__Operation__OutsAssignment_2_12172);
            ruleOutparam();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getOutsOutparamParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OutsAssignment_2_1"


    // $ANTLR start "rule__Event__NameAssignment_1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:1: rule__Event__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ( RULE_ID ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( RULE_ID )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( RULE_ID )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_12203); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_1"


    // $ANTLR start "rule__Event__OutsAssignment_2"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: rule__Event__OutsAssignment_2 : ( ruleOutparam ) ;
    public final void rule__Event__OutsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( ( ruleOutparam ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( ruleOutparam )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( ruleOutparam )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: ruleOutparam
            {
             before(grammarAccess.getEventAccess().getOutsOutparamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOutparam_in_rule__Event__OutsAssignment_22234);
            ruleOutparam();

            state._fsp--;

             after(grammarAccess.getEventAccess().getOutsOutparamParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__OutsAssignment_2"


    // $ANTLR start "rule__Inparam__NameAssignment_1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: rule__Inparam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Inparam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( ( RULE_ID ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( RULE_ID )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( RULE_ID )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: RULE_ID
            {
             before(grammarAccess.getInparamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Inparam__NameAssignment_12265); 
             after(grammarAccess.getInparamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inparam__NameAssignment_1"


    // $ANTLR start "rule__Inparam__TypeAssignment_3"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: rule__Inparam__TypeAssignment_3 : ( ruleBuiltinType ) ;
    public final void rule__Inparam__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: ( ( ruleBuiltinType ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( ruleBuiltinType )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( ruleBuiltinType )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ruleBuiltinType
            {
             before(grammarAccess.getInparamAccess().getTypeBuiltinTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBuiltinType_in_rule__Inparam__TypeAssignment_32296);
            ruleBuiltinType();

            state._fsp--;

             after(grammarAccess.getInparamAccess().getTypeBuiltinTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inparam__TypeAssignment_3"


    // $ANTLR start "rule__Outparam__NameAssignment_1"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: rule__Outparam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Outparam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( ( RULE_ID ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( RULE_ID )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( RULE_ID )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: RULE_ID
            {
             before(grammarAccess.getOutparamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Outparam__NameAssignment_12327); 
             after(grammarAccess.getOutparamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outparam__NameAssignment_1"


    // $ANTLR start "rule__Outparam__TypeAssignment_3"
    // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:1: rule__Outparam__TypeAssignment_3 : ( ruleBuiltinType ) ;
    public final void rule__Outparam__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:1: ( ( ruleBuiltinType ) )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ( ruleBuiltinType )
            {
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ( ruleBuiltinType )
            // ../org.xtext.mydsl.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ruleBuiltinType
            {
             before(grammarAccess.getOutparamAccess().getTypeBuiltinTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBuiltinType_in_rule__Outparam__TypeAssignment_32358);
            ruleBuiltinType();

            state._fsp--;

             after(grammarAccess.getOutparamAccess().getTypeBuiltinTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outparam__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Alternatives_in_ruleItem154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInparam_in_entryRuleInparam301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInparam308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inparam__Group__0_in_ruleInparam334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutparam_in_entryRuleOutparam361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutparam368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Outparam__Group__0_in_ruleOutparam394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltinType__Alternatives_in_ruleBuiltinType431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Item__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Item__Alternatives483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__InsAssignment_2_0_in_rule__Operation__Alternatives_2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__OutsAssignment_2_1_in_rule__Operation__Alternatives_2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BuiltinType__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BuiltinType__Alternatives588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BuiltinType__Alternatives609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BuiltinType__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BuiltinType__Alternatives651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BuiltinType__Alternatives672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BuiltinType__Alternatives693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BuiltinType__Alternatives714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BuiltinType__Alternatives735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BuiltinType__Alternatives756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BuiltinType__Alternatives777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BuiltinType__Alternatives798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__0831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__0834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface__Group__0__Impl862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__1893 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__2953 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface__Group__2__Impl984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31015 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NsURIAssignment_3_in_rule__Interface__Group__3__Impl1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__ItemsAssignment_4_in_rule__Interface__Group__4__Impl1102 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group__0__Impl1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__11205 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__11208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__21265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_2_in_rule__Operation__Group__2__Impl1292 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__01329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__01332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Event__Group__0__Impl1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__11391 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__21451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__OutsAssignment_2_in_rule__Event__Group__2__Impl1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inparam__Group__0__Impl_in_rule__Inparam__Group__01514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Inparam__Group__1_in_rule__Inparam__Group__01517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Inparam__Group__0__Impl1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inparam__Group__1__Impl_in_rule__Inparam__Group__11576 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Inparam__Group__2_in_rule__Inparam__Group__11579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inparam__NameAssignment_1_in_rule__Inparam__Group__1__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inparam__Group__2__Impl_in_rule__Inparam__Group__21636 = new BitSet(new long[]{0x00000000007FF800L});
    public static final BitSet FOLLOW_rule__Inparam__Group__3_in_rule__Inparam__Group__21639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Inparam__Group__2__Impl1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inparam__Group__3__Impl_in_rule__Inparam__Group__31698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inparam__TypeAssignment_3_in_rule__Inparam__Group__3__Impl1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Outparam__Group__0__Impl_in_rule__Outparam__Group__01763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Outparam__Group__1_in_rule__Outparam__Group__01766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Outparam__Group__0__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Outparam__Group__1__Impl_in_rule__Outparam__Group__11825 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Outparam__Group__2_in_rule__Outparam__Group__11828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Outparam__NameAssignment_1_in_rule__Outparam__Group__1__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Outparam__Group__2__Impl_in_rule__Outparam__Group__21885 = new BitSet(new long[]{0x00000000007FF800L});
    public static final BitSet FOLLOW_rule__Outparam__Group__3_in_rule__Outparam__Group__21888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Outparam__Group__2__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Outparam__Group__3__Impl_in_rule__Outparam__Group__31947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Outparam__TypeAssignment_3_in_rule__Outparam__Group__3__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_12017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__NsURIAssignment_32048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__Interface__ItemsAssignment_42079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_12110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInparam_in_rule__Operation__InsAssignment_2_02141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutparam_in_rule__Operation__OutsAssignment_2_12172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_12203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutparam_in_rule__Event__OutsAssignment_22234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Inparam__NameAssignment_12265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_rule__Inparam__TypeAssignment_32296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Outparam__NameAssignment_12327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_rule__Outparam__TypeAssignment_32358 = new BitSet(new long[]{0x0000000000000002L});

}