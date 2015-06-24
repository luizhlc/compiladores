.class public HelloWorld
.super java/lang/Object 

.method public static func(ID)I
.limit locals 100
.limit stack 100
ldc 3
ldc 4
iload 0
imul
iadd
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
iload 2
iadd
invokevirtual java/io/PrintStream/println(I)V
iload 0
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit locals 100
.limit stack 100
ldc 5
istore 0
iload 0
ldc 8
if_icmpeq Label0
ldc 0
goto Exit0
Label0:
ldc 1
Exit0:
ifeq False0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
invokevirtual java/io/PrintStream/println(I)V
goto ExitCase0
False0:

iload 0
ldc 9
if_icmpeq Label1
ldc 0
goto Exit1
Label1:
ldc 1
Exit1:
ifeq False1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 2
invokevirtual java/io/PrintStream/println(I)V
goto ExitCase0
False1:

iload 0
ldc 10
ldc 1
iadd
if_icmpeq Label2
ldc 0
goto Exit2
Label2:
ldc 1
Exit2:
ifeq False2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 3
invokevirtual java/io/PrintStream/println(I)V
goto ExitCase0
False2:

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 4
invokevirtual java/io/PrintStream/println(I)V
ExitCase0:

return
.end method