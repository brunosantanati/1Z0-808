package me.brunosantana.exam1.package1;

public class Test10 {
	
	public static void main(String args[]) {
		int [] arr1 = new int[8];
		
		int [][] arr2 = new int [8][8];
		
		int [][] arr3 = new int [8][];
		//System.out.println(arr3[0][0]); //Exception in thread "main" java.lang.NullPointerException
		System.out.println(arr3[0]);
		arr3[0] = new int[8];
		System.out.println(arr3[0]);
		System.out.println(arr3[0][0]);
		arr3[0][0] = 10;
		System.out.println(arr3[0]);
		System.out.println(arr3[0][0]);
		
		//int [][] arr4 = new int [][8]; //Unresolved compilation problem: Cannot specify an array dimension after an empty dimension
	}

}
