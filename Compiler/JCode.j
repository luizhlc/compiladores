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
ldc 16
if_icmpeq Label0
ldc 0
goto Exit0
Label0:
ldc 1
Exit0:
invokevirtual java/io/PrintStream/println(I)V
	return
	
.end method
