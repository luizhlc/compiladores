.class public HelloWorld
.super java/lang/Object 

.method public static main([Ljava/lang/String;)V
.limit locals 100
.limit stack 100
ldc 0
istore 0
ldc 4
ldc 2
if_icmplt Label0
ldc 0
goto Exit0
Label0:
ldc 1
Exit0:
ifeq False0
ldc 10
istore 0
goto ExitCase0
False0:

ExitCase0:

getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
return
.end method