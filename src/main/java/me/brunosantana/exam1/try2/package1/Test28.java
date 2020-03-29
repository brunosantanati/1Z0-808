package me.brunosantana.exam1.try2.package1;

public class Test28 {
    public static void main(String[] args) {
        //double [] arr = new int[2]; //Line 3 //Unresolved compilation problem: Type mismatch: cannot convert from int[] to double[]
    	int [] arr = new int[2]; //fix
        System.out.println(arr[0]); //Line 4
        
        Integer [] arr2 = new Integer[2];
        System.out.println(arr2[0]);
        //System.out.println(arr2[2]); //java.lang.ArrayIndexOutOfBoundsException
        
        int[][] arr3 = new int[2][];
        System.out.println(arr3[0][0]); //java.lang.NullPointerException
    }
}
