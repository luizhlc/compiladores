.class public HelloWorld
.super java/lang/Object 

.method public static main([Ljava/lang/String;)V
.limit locals 100
.limit stack 100
ldc 2
ldc 2
iadd
istore 0
ldc 3
istore 1
iload 0
iload 1
imul
ldc 3
iadd
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
ldc 2
iadd
invokevirtual java/io/PrintStream/println(I)V
return
.end method