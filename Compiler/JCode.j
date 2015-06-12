.class public JCode
.super java/lang/Object 

.method public static main([Ljava/lang/String;)V
	.limit stack 100
	.limit locals 100
	
ldc2_w 4.3
ldc2_w 4.2
dcmpg
iflt Label0
ldc 0
goto Exit0
Label0:
ldc 1
Exit0:
istore 0
ldc2_w 4.3
ldc2_w 4.3
dcmpg
ifeq Label1
ldc 0
goto Exit1
Label1:
ldc 1
Exit1:
istore 1
ldc2_w 4.3
ldc2_w 4.2
dcmpg
ifge Label2
ldc 0
goto Exit2
Label2:
ldc 1
Exit2:
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
	return
	
.end method
