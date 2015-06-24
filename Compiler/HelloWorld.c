.class public HelloWorld
.super java/lang/Object 

.method public static func()I
.limit locals 100
.limit stack 100
ldc 3
ldc 3
imul
istore 0
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
iload 0
ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit locals 100
.limit stack 100
ldc 2
ldc 2
ldc 3
imul
iadd
istore 0
invokestatic HelloWorld/func()I
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
iload 1
iadd
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokestatic HelloWorld/func()I
iadd
invokevirtual java/io/PrintStream/println(I)V
return
.end method