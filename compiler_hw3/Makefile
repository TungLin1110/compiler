all:
	java  -cp ./antlr-4.7.1-complete.jar org.antlr.v4.Tool myChecker.g
	javac -cp ./antlr-4.7.1-complete.jar:. myChecker_test.java

run:
	java -cp ./antlr-4.7.1-complete.jar:. myChecker_test 1.c
	java -cp ./antlr-4.7.1-complete.jar:. myChecker_test 2.c
	java -cp ./antlr-4.7.1-complete.jar:. myChecker_test 3.c
	
delete:
	-rm  *.interp *.class *.tokens myChecker[^_]*.java
