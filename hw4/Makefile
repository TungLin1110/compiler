all:
	java  -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp ./antlr-3.5.2-complete.jar:. myCompiler_test.java
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test example1.c > example1.s
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test example2.c > example2.s
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test example3.c > example3.s
	gcc example1.s -o example1
	gcc example2.s -o example2
	gcc example3.s -o example3


clean:
	-rm *.class *.tokens myCompiler[^_]*.java *.s example1 example2 example3
