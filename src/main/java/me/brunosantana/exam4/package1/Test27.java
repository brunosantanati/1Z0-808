package me.brunosantana.exam4.package1;

public class Test27 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        char [] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
        //arr1 = arr2; //Unresolved compilation problem: Type mismatch: cannot convert from char[] to int[]
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}



