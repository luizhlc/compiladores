grammar LHC;

	options {language = Java; }

program: Init Begin (methodDef)* End;

  	stmt	: attr 
      		| print
      		| exp
      		| decl
      		| methodCall;
//      		| case1 	
//      		| switch1 	
//      		| loop 	
//      		| objAcc
//      		| control ;
//      		| vector 
//      		| obj ;

print: Print ParBeg argument=exp ParEnd Semicolon;

methodCall	: funcName1=ID (Dot funcName2=ID)? ParBeg (argList=args)? ParEnd Semicolon;
	
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
	|  value_=value #Value_rule;
	
 	methodDef	: (typeVoid=Void | type_=type) funcName=ID ParBeg (params=paramList)? ParEnd (Begin (stmtList=stmt)* (Return (returnExp=exp | returnID=ID) Semicolon)? End | Semicolon) ;
  	paramList 	: type_=type varName=ID ( Comma params=paramList )?;   	  		 
  	args 	: (ID Comma)* ID;
  	
    decl	: type_=type varName=ID Semicolon #VarDecl
    			| type_=type (varName=ID Comma)* varName=ID Semicolon #VarMultDecl;
    			
    attr	: (type_=type)? varName=ID Gets rightSide_=rightSide #Assignment;
//    			| VectorBeg Integer VectorEnd rightSIDe Semicolon;

  	rightSide	: exp Semicolon | value | methodCall | Quote String Quote;
  	
	value 	: value_=Integer #Int_rule
			| value_=Bool  #Bool_rule
      		| value_=Double #Double_rule
      		| value_=String #String_rule
      		| value_=Char #Char_rule;
      		
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
//  Num : ('0' .. '9')+ ;
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
  Char : SQuote '\u0000'..'\uFFFE' SQuote;
  String : Quote ('\u0000'..'\u0021'|'\u0023'..'\uFFFE')* Quote;
  Double : Integer '.' Integer | '.' Integer | Integer '.' ;
  ID : IDChar (Integer | IDChar)*; 
  IDChar : ('a' .. 'z') | ('A' .. 'Z') | '_' ;
  
//  VectorBeg : '[' ;
//  VectorEnd : ']' ;
//  Class : 'class' ;
//    Include : 'include';
//  Control : 'break' | 'continue' ;
//    Case : 'case' ;
//  Default: 'default' ;
//  Loop : 'for' ;
//  Switch : 'switch' ;
//    Increment : '++';
//    Decrement : '--';
//
//    program	: Init ID (inclusion)*  Begin (decl)* (method)* End ;
//  	inclusion: Include ID  ;
//    vector	: (TypeC | TypeNC) ID VectorBeg Integer VectorEnd (rightSIDe)? Semicolon ;
//    obj	: ID ID (rightSIDe)? Semicolon ;
//    );
//   //permite fazer int id = "temp";sintaticamente correto?
//    case1 : Case ParBeg bigExp1 ParEnd Begin (stmt)* End (default1)?;
//  	default1 : Default Begin (stmt)* End ;
//  	switch1 : Switch Begin (case1)+ End ;
//  	loop : Loop ParBeg ((TypeC ID Equal Integer Semicolon bigExp1 Semicolon bigExp1 ParEnd Begin (stmt)* End)
//      					|(bigExp1 ParEnd Begin (stmt)* End));
//    objAcc	: ID Dot attr Semicolon ;  		
//  	control : Control Semicolon 
//      		| Return  (type2)? Semicolon ;
//      		
// 
//
//    bigExp1: bigExp1 Or bigExp2 	
//    		| bigExp2; 			  		
//    bigExp2: bigExp2 And bigExp3  		
//    		| bigExp3;					
//    bigExp3: bigExp3 OpcEq bigExp4	 	
//    		| bigExp4;					
//    bigExp4: bigExp4 OpcI bigExp5		
//    		| bigExp5;					
//    bigExp5: bigExp5 Opa1 bigExp6		
//    		| bigExp6;					
//    bigExp6: bigExp6 Opa2 bigExp7		
//    		| bigExp7;					
//    bigExp7: (Opl3|Increment|Decrement|Opa1) bigExp7		
//    		| ParBeg bigExp1 ParEnd					
//    		| (ID | Integer | Double | Bool);	
			