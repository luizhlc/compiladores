grammar LHC;

	options {language = Java; }

program: Init Begin (methodDef)* End;

  	stmt	: attr 
      		| print
      		| exp Semicolon
      		| decl
      		| switch1 Semicolon 	
      		| loop;

print: Print ParBeg argument=exp ParEnd Semicolon;
	
exp :  ParBeg exp ParEnd #ParExp_rule    
	|  left=exp Or right=exp #Or_rule
	|  left=exp And right=exp #And_rule
	|  left=exp Times right=exp #Times_rule
	|  left=exp Divide right=exp #Divide_rule
	|  left=exp Plus right=exp #Plus_rule
	|  left=exp Minus right=exp #Minus_rule
	|  left=exp Equal right=exp #Equal_rule
    |  left=exp NEqual right=exp #NEqual__rule
    |  left=exp Less right=exp #Less_rule
	|  left=exp Greater right=exp #Greater_rule
	|  left=exp LessE right=exp #LessE_rule
	|  left=exp GreaterE right=exp #GreaterE_rule
	|  varName=ID #Variable
	|  value_=value #Value_rule
	|  method=methodCall #Method_rule;
	
 
  	methodDef	: (typeVoid=Void | type_=type) funcName=ID ParBeg (params=paramList)? ParEnd (Begin (stmtList=stmt)* (Return returnExp=exp Semicolon)? End | Semicolon) ;
  	methodCall	: funcName1=ID (Dot funcName2=ID)? ParBeg (argList=expressionList)? ParEnd ;
  	paramList 	: declarations=paramDecl ( Comma declarations=paramDecl )*;   	  		 
  	paramDecl : type_=type varName=ID;
  	expressionList : par+=exp (Comma par+=exp)*;
    decl	: type_=type varName=ID Semicolon #VarDecl
    			| type_=type (varName=ID Comma)* varName=ID Semicolon #VarMultDecl;
    			
    attr	: (type_=type)? varName=ID Gets rightSide_=rightSide #Assignment;
	rightSide	: exp Semicolon ;
	
	switch1 : Switch Begin (case_=case1)+ (else_=default1) End ;
    case1 : Case ParBeg condition_=exp ParEnd Begin (stmtList=stmt)* End #Case_rule;
	default1 : Default Begin (stmtList=stmt)* End #default_rule;
	loop : For ParBeg ((IntegerType id_=ID Gets int_const=Integer Semicolon condition=exp Semicolon id_increment=ID Plus incre_const=Integer ParEnd Begin (stmts=stmt)* control_=control? End)) #ForRule
      					| (condition=exp ParEnd Begin (stmts=stmt)* control_=control? End) #While;
  	control : (Break | Continue) Semicolon 
      		| Return  (type_=type)? Semicolon ;
	value 	: value_=Integer #Int_rule
			| value_=Bool  #Bool_rule
      		| value_=Double #Double_rule;
      		//| value_=String #String_rule
      		//| value_=Char #Char_rule;
	      		
	  type : StringType | IntegerType | DoubleType | BooleanType;
  	  StringType : 'string';
	  IntegerType : 'int';
	  DoubleType : 'double';
	  BooleanType : 'bool';
	  
	  WS : ('\n'| '\t' | '\r' | ' ')+ -> skip ;
	  Print: 'print';
	  Init : 'LHC+-';
	  Bool: 'true' | 'false';
	  Void : 'void';
	  Return : 'return';
	  Switch : 'switch' ;
	  Case : 'case' ;
	  Default: 'default' ;
	  Begin : '{'; 
	  End : '}' ;
	  ParBeg : '(' ;
	  ParEnd : ')' ;
	  Semicolon : ';' ;
	  Plus : '+';
	  Minus : '-';
	  Times : '*';
	  Divide : '/';
	  Integer : ('0' .. '9')+ ;
	  Or : '|' ;
	  And: '&' ;
	  Equal: '=''=';
	  NEqual: '!''=';
	  Less: '<';
	  LessE: '<''=';
	  Greater: '>';
	  GreaterE: '>''=';
	  Not: '!';
	  Gets : '=' ;
	  Quote : '"' ;
	  SQuote : '\'';
	  Comma : ',' ;
	  Dot : '.' ;
	  Break : 'break';
	  Continue : 'continue';  
	  For : 'for' ; 
	  Increment : '++';
	  Decrement : '--';
	  //Char : SQuote '\u0000'..'\uFFFE' SQuote;
	  //String : Quote ('\u0000'..'\u0021'|'\u0023'..'\uFFFE')* Quote;
	  Double : Integer '.' Integer | '.' Integer | Integer '.' ;
	  ID : IDChar (Integer | IDChar)*; 
	  IDChar : ('a' .. 'z') | ('A' .. 'Z') | '_' ;
  	

			