.class public JCode
.super java/lang/Object 

.method public static main([Ljava/lang/String;)V
	.limit stack 100
	.limit locals 100
	
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 2
ldc 3
imul
ldc 5
ldc 2
imul
iadd
invokevirtual java/io/PrintStream/println(I)V
	return
	
.end method
