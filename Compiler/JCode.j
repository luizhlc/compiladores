.class public JCode
.super java/lang/Object 

.method public static main([Ljava/lang/String;)V
	.limit stack 100
	.limit locals 100
	

ldc 2
istore 0
ldc 3
ldc 2
iadd
istore 1
ldc 3
ldc 1
iadd
ldc 2
ldc 1
iadd
if_icmpgt Label0
ldc 0
goto Exit0
Label0:
ldc 1
Exit0:
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
iload 1
iadd
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
	return
	
.end method
