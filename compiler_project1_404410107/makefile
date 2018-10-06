mylexer:mylexer.java
	javac -cp antlr-3.5.2-complete.jar testLexer.java mylexer.java
mylexer.java:mylexer.g
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool mylexer.g

run:mylexer
	 java -cp antlr-3.5.2-complete.jar:. testLexer 1.c
	 java -cp antlr-3.5.2-complete.jar:. testLexer 2.c
	 java -cp antlr-3.5.2-complete.jar:. testLexer 3.c
clean:
	rm *.class
