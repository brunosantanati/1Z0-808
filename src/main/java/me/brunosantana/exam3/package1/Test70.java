package me.brunosantana.exam3.package1;

class TestException extends Exception {
    public TestException() {
        super();
    }

    public TestException(String s) {
        super(s);
    }
}

public class Test70 {
    public void m1() throws Exception { //OK
	//public void m1() throws Object { //No exception of type Object can be thrown; an exception type must be a subclass of Throwable
	//public void m1() throws RuntimeException { //Unhandled exception type TestException
	//public void m1() throws Error { //Unhandled exception type TestException
        throw new TestException();
    }
}

/*
In throws clause we must provide:

1. Checked exception.

2. Exception of TestException type or it's super types 
(Exception, Throwable), Object cannot be used in throws clause.
 */
