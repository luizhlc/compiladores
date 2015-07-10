.class public HelloWorld
.super java/lang/Object 

.method public static main([Ljava/lang/String;)V
.limit locals 100
.limit stack 100
ldc 0
istore 0
ldc 0
istore 1
LoopBody:
iload 1
ldc 2
if_icmplt Label0
ldc 0
goto Exit0
Label0:
ldc 1
Exit0:

ifeq Exit
iload 0
ldc 2
iadd
istore 0
iload 1
ldc 1
iadd
istore 1
goto LoopBody
Exit:

getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
return
.end method