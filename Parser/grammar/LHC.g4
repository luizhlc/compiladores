grammar LHC;


	options {language = Java; }
	
exp1: left=exp1 '|' right=exp2	#Or_rule
    | exit=exp2	#NextAnd
    ;	
exp2: left=exp2 '&' right=BOOL #And_rule
	| bool=BOOL #Bool
	| '(' cont=exp1 ')'  #NextOr
	;
BOOL: 'true' | 'false';

  WS : ('\n'| '\t' | '\r' | ' ')+ -> skip ;
  
  
//  Init : 'LHC+-';
//    Begin : '{'; 
//    End : '}' ;
//  VectorBeg : '[' ;
//  VectorEnd : ']' ;
//  ParBeg : '(' ;
//  ParEnd : ')' ;
//  Comma : ',' ;
//  Dot : '.' ;
//  Class : 'class' ;
//    Include : 'include';
//  Semicolon : ';' ;
//  Quote : '"' ;
//  Equal : '=' ;
//  TypeC : 'uint' | 'int' | 'double' | 'char' ;
//  TypeNC: 'bool' | 'string';
//  Void : 'void';
//  Control : 'break' | 'continue' ;
//  Return : 'return';
//  Opa1 : '+' | '-' ;
//    Opa2 : '*' | '/' ;
//  Or : '|' ;
//  And: '&' ;
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
//    Num : ('0' .. '9') ;
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
			