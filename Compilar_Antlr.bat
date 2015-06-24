SET CLASSPATH=.;C:\javalib\antlr.jar;%CLASSPATH%
cd Parser\grammar\
java org.antlr.v4.Tool LHC.g4
javac *.java
java org.antlr.v4.Tool -package aula3 -o ../src/aula3 LHC.g4 -no-listener -visitor
del *.class
cd ..\..