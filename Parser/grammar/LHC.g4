grammar LHC;

	options {language = Java; }

program: Init Begin (stmt)* End;

stmt: exp | (print Semicolon)+;

print: Print ParBeg argument=exp ParEnd;
	

exp :  left=exp Or right=exp #Or_rule    
	|  left=exp And right=exp #And_rule
	|  left=exp Equal right=exp #Equal_rule
    |  left=exp NEqual right=exp #NEqual__rule
    |  left=exp Less right=exp #Less_rule
	|  left=exp Greater right=exp #Greater_rule
	|  left=exp LessE right=exp #LessE_rule
	|  left=exp GreaterE right=exp #GreaterE_rule
	|  left=exp Times right=exp #Times_rule
	|  left=exp Divide right=exp #Divide_rule
	|  left=exp Plus right=exp #Plus_rule
	|  left=exp Minus right=exp #Minus_rule
	|  ParBeg exp ParEnd #ParExp_rule
	|  BOOL #Bool
	|  Num #Num_rule;
	
BOOL: 'true' | 'false';

  WS : ('\n'| '\t' | '\r' | ' ')+ -> skip ;
  
  Print: 'print';
  Init : 'LHC+-';
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
//  VectorBeg : '[' ;
//  VectorEnd : ']' ;
//  Comma : ',' ;
//  Dot : '.' ;
//  Class : 'class' ;
//    Include : 'include';
//  Quote : '"' ;
//  Equal : '=' ;
//  TypeC : 'uint' | 'int' | 'double' | 'char' ;
//  TypeNC: 'bool' | 'string';
//  Void : 'void';
//  Control : 'break' | 'continue' ;
//  Return : 'return';
//    Opa2 : '*' | '/' ;
//  Opl3: '!' ;//?????????
//    Case : 'case' ;
//  Default: 'default' ;
//  Loop : 'for' ;
//  Switch : 'switch' ;
//  Bool : 'true' | 'false' ;
//    OpcEq :  '=' '=' | '!' '=' ;
//    OpcI: '<' | '>' | '<' '=' | '>' '=' ;
//    Increment : '++';
//    Decrement : '--';
//    String : '"' ('\u0000'..'\u0021'|'\u0023'..'\uFFFE')* '"';
//  Char : '\'' '\u0000'..'\uFFFE' '\'';
//  ID : IDChar (Num | IDChar)* ; 
//  IDChar : ('a' .. 'z') | ('A' .. 'Z') | '_' ;
//    Double : Integer '.' Integer | '.' Integer | Integer '.' ;
//    Integer : Num+;
//
//    program	: Init ID (inclusion)*  Begin (decl)* (method)* End ;
//  	inclusion: Include ID  ;
// 	method	: (Void | (TypeC | TypeNC)) ID ParBeg (paramList)? ParEnd (( Begin (stmt)* End)| Semicolon) ;
//  	paramList 	: (TypeC | TypeNC) ID ( Comma paramList )?;   	  		 
//  	stmt	: decl 
//      		| attr 
//      		| case1 	
//      		| switch1 	
//      		| loop 	
//      		| methodCall 	
//      		| objAcc
//      		| bigExp7 Semicolon
//      		| control ;
//     decl	: variable 
//      		| vector 
//      		| obj ;
//    variable	: (TypeC | TypeNC) ID (rightSIDe)? Semicolon ;
//    vector	: (TypeC | TypeNC) ID VectorBeg Integer VectorEnd (rightSIDe)? Semicolon ;
//    obj	: ID ID (rightSIDe)? Semicolon ;
//    attr	: ID ( rightSIDe Semicolon 
//    			| VectorBeg Integer VectorEnd rightSIDe Semicolon
//    );
//   //permite fazer int id = "temp";sintaticamente correto?
//  	rightSIDe	: Equal (bigExp1|type2
//  						|Quote String Quote);
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
//  	type2 	: Integer 
//      		| Double 
//      		| String
//      		| Char;
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
			