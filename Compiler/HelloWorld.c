.class public HelloWorld
.super java/lang/Object 

.method public static fat(I)I
.limit locals 100
.limit stack 100

iload 0
ldc 0
if_icmpeq Label0
ldc 0
goto Exit0
Label0:
ldc 1
Exit0:
ifeq False0
ldc 1
istore 1
goto ExitCase0
False0:

iload 0
iload 0
ldc 1
isub
invokestatic HelloWorld/fat(I)I
imul
istore 1
ExitCase0:

iload 1
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit locals 100
.limit stack 100
ldc 5
invokestatic HelloWorld/fat(I)I
istore 0
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
return
.end method