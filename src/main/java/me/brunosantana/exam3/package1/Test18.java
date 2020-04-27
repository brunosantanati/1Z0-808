package me.brunosantana.exam3.package1;

public class Test18 {
    static Double d1; //null is assigned to it
    static int x = d1.intValue(); //d1.intValue() throws a NullPointerException and as a result an instance of  java.lang.ExceptionInInitializerError is thrown.

    public static void main(String[] args) {
    	//System.out.println(d1); //it prints null if comment x declaration.
        System.out.println("HELLO");
    }
}
