package me.brunosantana.exam3.package1;

public class Test36 {
    public static void main(String[] args) {
        byte [] arr = new byte[0];
    	//byte [] arr = null; //It causes java.lang.NullPointerException in the line below
        System.out.println(arr[0]); //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    }
}
