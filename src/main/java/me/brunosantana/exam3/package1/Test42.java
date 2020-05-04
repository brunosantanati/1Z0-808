package me.brunosantana.exam3.package1;

import java.util.Arrays;

public class Test42 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
        arr1 = arr2;
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        arr1[1] = 'C';
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}

//char type is compatible with int type
