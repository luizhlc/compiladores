cd /home/decio/workspace/compiladores/Compiler;
java -jar /home/decio/Downloads/jasmin.jar HelloWorld.c;
cp HelloWorld.class bin/;
rm HelloWorld.class;
cd bin;
java HelloWorld;
cd;
cd /home/decio/workspace/compiladores