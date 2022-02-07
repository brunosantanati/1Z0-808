package me.brunosantana.exam5.package1;

/*
Which of the following options, if used to replace INSERT, will compile successfully and on execution will print 3 on to the console?
Select 3 options.
 */

public class Test50 {
    public static void main(String[] args) {
    	
        // /*INSERT*/ x = 7, y = 200;
    	//float x = 7, y = 200; //5
    	//double x = 7, y = 200; //5
    	long x = 7, y = 200; //3
    	//int x = 7, y = 200; //3
    	//short x = 7, y = 200; /3
    	
    	//byte x = 7, y = 200; //Type mismatch: cannot convert from int to byte
    	//Stores whole numbers from -128 to 127
    	//byte x = 7, y = 100; //FIX
    	
    	//System.out.println(String.valueOf(x + y));
        System.out.println(String.valueOf(x + y).length());
    }
}
