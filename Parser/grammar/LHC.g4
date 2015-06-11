grammar LHC;

	options {language = Java; }

program: Init Begin (stmt)* End;
//Clean criado apenas para zerar a stack de types na verificacao de tipos.
  	stmt	: exp Semicolon #Clean
      		| print #Clean
      		| attr#Clean
      		| decl#Clean;
//      		| case1 	
//      		| switch1 	
//      		| loop 	
//      		| methodCall 	
//      		| control 
//      		| vector ;

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
	|  value_=value #Value_;
	
    decl	: type_=type varName=ID Semicolon #VarDecl
    			| type_=type (varName=ID Comma)* varName=ID Semicolon #VarMultDecl;
    			
    attr	: (type_=type)? varName=ID Gets rightSide_=rightSide Semicolon #Assignment;
//    			| VectorBeg Integer VectorEnd rightSIDe Semicolon;

  	rightSide	: exp | Quote String Quote;
  	
	value 	: Integer #Integer_  
      		| Double  #Real_
      		| BOOL #Bool;
   //   		| String #String_
   //   		| Char #Char_;
      		
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
  ID : IDChar (Integer | IDChar)*; 
  IDChar : ('a' .. 'z') | ('A' .. 'Z') | '_' ;
  Double : Integer '.' Integer;
  Integer : ('0' .. '9')+;
  
//  VectorBeg : '[' ;
//  VectorEnd : ']' ;
//  Void : 'void';
//  Control : 'break' | 'continue' ;
//  Return : 'return';
//    Case : 'case' ;
//  Default: 'default' ;
//  Loop : 'for' ;
//  Switch : 'switch' ;
//    Increment : '++';
//    Decrement : '--';

//  	inclusion: Include ID  ;
// 	method	: (Void | (TypeC | TypeNC)) ID ParBeg (paramList)? ParEnd (( Begin (stmt)* End)| Semicolon) ;
//  	paramList 	: (TypeC | TypeNC) ID ( Comma paramList )?;   	  		 
//    vector	: (TypeC | TypeNC) ID VectorBeg Integer VectorEnd (rightSIDe)? Semicolon ;
//    );
//    case1 : Case ParBeg bigExp1 ParEnd Begin (stmt)* End (default1)?;
//  	default1 : Default Begin (stmt)* End ;
//  	switch1 : Switch Begin (case1)+ End ;
//  	loop : Loop ParBeg ((TypeC ID Equal Integer Semicolon bigExp1 Semicolon bigExp1 ParEnd Begin (stmt)* End)
//      					|(bigExp1 ParEnd Begin (stmt)* End));
//  	methodCall	: ID(Dot ID)? ParBeg (args)? ParEnd;
//  	args 	: (ID Comma)* ID;	
//  	control : Control Semicolon 
//      		| Return  (type2)? Semicolon ;		
//    bigExp7: (Opl3|Increment|Decrement|Opa1) bigExp7		
//    		| ParBeg bigExp1 ParEnd					
//    		| (ID | Integer | Double | Bool);	
			