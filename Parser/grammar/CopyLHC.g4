grammar CopyLHC;

	options {language = Java; }

program: Init Begin (stmt)* End;

stmt: exp1 | (print Semicolon)+;

print: Print ParBeg argument=exp1 ParEnd;
exp1 : left=exp1 Or right=exp2 #Or_rule
	 | exit=exp2 #NextExp2;
exp2 : left=exp2 And right=exp3 #And_rule
	 | exit=exp3 #NextExp3;
exp3 : left=exp3 Equal right=exp4 #Equal_rule
     | left=exp3 NEqual right=exp4 #NEqual__rule
     | exit=exp4 #NextExp4;
exp4 : left=exp4 Less right=exp5 #Less_rule
	 | left=exp4 Greater right=exp5 #Greater_rule
	 | left=exp4 LessE right=exp5 #LessE_rule
	 | left=exp4 GreaterE right=exp5 #GreaterE_rule
	 | exit=exp5 #NextExp5;
exp5: left=exp5 Times right=exp6 #Times_rule
	| left=exp5 Divide right=exp6 #Divide_rule
	| exit=exp6 #NextExp6;
exp6: left=exp6 Plus right=exp7 #Plus_rule
	| left=exp6 Minus right=exp7 #Minus_rule
	| exit=exp7 #NextExp7;
exp7: ParBeg exp1 ParEnd #ParExp_rule
	| BOOL #Bool
	| Num #Num_rule;

//    bigExp7: (Opl3|Increment|Decrement|Opa1) bigExp7		
//    		| ParBeg bigExp1 ParEnd					
//    		| (ID | Integer | Double | Bool);

	
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
			