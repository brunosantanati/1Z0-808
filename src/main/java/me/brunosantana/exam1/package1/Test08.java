package me.brunosantana.exam1.package1;

public class Test08 {
	public static void main(String[] args) {
        Double [] arr = new Double[2];
        System.out.println(arr[0]);
        //System.out.println(arr[0] + arr[1]); //Exception in thread "main" java.lang.NullPointerException
        
        Double [] arr2 = new Double[1];
        arr2[0] = Double.valueOf(10);
        System.out.println(arr2[0]); //In a moment which I couldn't determine the method doubleValue() is invoked.
        
    }
}
