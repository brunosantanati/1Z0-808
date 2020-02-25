package me.brunosantana.exam1.package1;

public class Test16 {
	static {
        System.out.println(1/0); //Exception in thread "main" java.lang.ExceptionInInitializerError Caused by: java.lang.ArithmeticException: / by zero
    }

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}
