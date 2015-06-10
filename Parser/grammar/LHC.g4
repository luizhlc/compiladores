grammar LHC;

	options {language = Java; }

program: Init Begin (stmt)* End;

  	stmt	: exp 
      		| print 
      		| attr
      		| decl;
//      		| case1 	
//      		| switch1 	
//      		| loop 	
//      		| methodCall 	
//      		| objAcc
//      		| control ;
//      		| vector 
//      		| obj ;

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
	|  BOOL #Bool
	|  Num #Num_rule;
	
    decl	: type_=type varName=ID Semicolon #VarDecl
    			| type_=type (varName=ID Comma)* varName=ID Semicolon #VarMultDecl;
    			
    attr	: (type_=type)? varName=ID Gets rightSide_=rightSide Semicolon #Assignment;
//    			| VectorBeg Integer VectorEnd rightSIDe Semicolon;

  	rightSide	: exp | value | Quote String Quote;
  	
	value 	: Integer  
      		| Double 
      		| String
      		| Char;
      		
  type : StringType | IntegerType | DoubleType | BooleanType;
  StringType : 'string';
  IntegerType : 'int';
  DoubleType : 'double';
  BooleanType : 'bool';
  
  WS : ('\n'| '\t' | '\r' | ' ')+ -> skip ;
  Print: 'print';
  Init : 'LHC+-';
  BOOL: 'true' | 'false';
  Char : SQuote '\u0000'..'\uFFFE' SQuote;
  String : Quote ('\u0000'..'\u0021'|'\u0023'..'\uFFFE')* Quote;
  Begin : '{'; 
  End : '}' ;
  ParBeg : '(' ;
  ParEnd : ')' ;
  Semicolon : ';' ;
  Plus : '+';
  Minus : '-';
  Times : '*';
  Divide : '/';
  Num : ('0' .. '9')+ ;
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
  ID : IDChar (Num | IDChar)*; 
  IDChar : ('a' .. 'z') | ('A' .. 'Z') | '_' ;
  Double : Integer '.' Integer | '.' Integer | Integer '.' ;
  Integer : Num+;
  
//  VectorBeg : '[' ;
//  VectorEnd : ']' ;
//  Class : 'class' ;
//    Include : 'include';
//  Void : 'void';
//  Control : 'break' | 'continue' ;
//  Return : 'return';
//    Case : 'case' ;
//  Default: 'default' ;
//  Loop : 'for' ;
//  Switch : 'switch' ;
//    Increment : '++';
//    Decrement : '--';
//
//    program	: Init ID (inclusion)*  Begin (decl)* (method)* End ;
//  	inclusion: Include ID  ;
// 	method	: (Void | (TypeC | TypeNC)) ID ParBeg (paramList)? ParEnd (( Begin (stmt)* End)| Semicolon) ;
//  	paramList 	: (TypeC | TypeNC) ID ( Comma paramList )?;   	  		 
//    vector	: (TypeC | TypeNC) ID VectorBeg Integer VectorEnd (rightSIDe)? Semicolon ;
//    obj	: ID ID (rightSIDe)? Semicolon ;
//    );
//   //permite fazer int id = "temp";sintaticamente correto?
//    case1 : Case ParBeg bigExp1 ParEnd Begin (stmt)* End (default1)?;
//  	default1 : Default Begin (stmt)* End ;
//  	switch1 : Switch Begin (case1)+ End ;
//  	loop : Loop ParBeg ((TypeC ID Equal Integer Semicolon bigExp1 Semicolon bigExp1 ParEnd Begin (stmt)* End)
//      					|(bigExp1 ParEnd Begin (stmt)* End));
//  	methodCall	: ID(Dot ID)? ParBeg (args)? ParEnd;
//  	args 	: (ID Comma)* ID;
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
			