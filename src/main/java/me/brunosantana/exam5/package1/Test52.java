package me.brunosantana.exam5.package1;

/*
Range of short data type is from -32768 to 32767
Which of the following code segments, written inside main method will compile successfully?
Select 3 options.
 */

public class Test52 {
	
	public static void main(String[] args) {
		//final int i4 = 40000;
		//short s4 = i4; //Type mismatch: cannot convert from int to short

		//int i7 = 10;
		//short s7 = i7; //Type mismatch: cannot convert from int to short
		
		//final int m = 25000;
		//final int n = 25000;
		//short s6 = m + n; //Type mismatch: cannot convert from int to short
		
		short s1 = 10; //OK
		
		final int i3 = 10;
		short s3 = i3; //OK
		
		final int i5 = 10;
		short s5 = i5 + 100; //OK
		
		//short s2 = 32768; //Type mismatch: cannot convert from int to short
	}

}
