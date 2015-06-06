cd /home/decio/workspace/compiladores/Compiler;
java -jar lib/jasmin-2.4/jasmin-2.4/jasmin.jar JCode.j;
cp JCode.class bin/;
rm JCode.class;
cd bin;
java JCode;
cd;
cd /home/decio/workspace/compiladores
