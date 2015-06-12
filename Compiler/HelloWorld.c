.class public HelloWorld
.super java/lang/Object 

.method public static teste()I
.limit locals 100
.limit stack 100
ldc 1
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit locals 100
.limit stack 100
invokestatic HelloWorld/teste()I
istore 0
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
return
.end method