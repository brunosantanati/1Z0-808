package me.brunosantana.exam4.package1;

public class Test06 {
	 
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
        //add(10.0, new Double(10.0)); //Exception in thread "main" java.lang.Error: Unresolved compilation problem: The method add(double, double) is ambiguous for the type Test06
    	add(10.0, 10.0);
    	add(new Double(20.0), new Double(20.0));
    }

}
