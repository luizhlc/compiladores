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
ldc 2
ldc 2
ldc 3
imul
iadd
istore 0
ldc 5
ldc2_w 5.3
invokestatic HelloWorld/func(ID)I
return
.end method