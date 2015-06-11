.class public HelloWorld
.super java/lang/Object 

.method public static teste()V
.limit locals 100
.limit stack 100
ldc 2
ldc 5
imul
istore 0
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
return
.end method
.method public static main([Ljava/lang/String;)V
.limit locals 100
.limit stack 100
invokestatic HelloWorld/teste()V
return
.end method