all:
	java  -cp ./antlr-4.7.1-complete.jar org.antlr.v4.Tool myparser.g
	javac -cp ./antlr-4.7.1-complete.jar:. testParser.java

run:
	java -cp ./antlr-4.7.1-complete.jar:. testParser 1.c
	java -cp ./antlr-4.7.1-complete.jar:. testParser 2.c
	java -cp ./antlr-4.7.1-complete.jar:. testParser 3.c

delete:
	-rm *.interp *.class *.tokens myparser*.java
