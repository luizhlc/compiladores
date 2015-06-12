.class public HelloWorld
.super java/lang/Object 

.method public static teste()I
.limit locals 100
.limit stack 100
ldc 2
istore 0
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit locals 100
.limit stack 100
invokestatic HelloWorld/teste()I
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
return
.end method