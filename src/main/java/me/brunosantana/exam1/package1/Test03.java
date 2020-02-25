package me.brunosantana.exam1.package1;

public class Test03 {
    public static void main(String[] args) {
        
    	//short [] arr;
    	//arr = new short[2];
    	
    	//short [] arr = new short[] {100,100};
    	
    	short arr [] = new short[2];
    	
    	//short [] arr = new short[2] {100,100}; //Cannot define dimension expressions when an array initializer is provided
    	
    	//short [2] arr; //Syntax error on token "2", delete this token
    	
    	//short [] arr = {}; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    	
        arr[0] = 5;
        arr[1] = 10;
        System.out.println("[" + arr[0] + ", " + arr[1] + "]");
    }
}