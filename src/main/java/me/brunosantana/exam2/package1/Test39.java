package me.brunosantana.exam2.package1;

import java.util.ArrayList;
import java.util.List;

public class Test39 {
    public static void main(String[] args) {
        System.out.println(args.length);
        
        int[] arr = new int[10];
        System.out.println(arr.length);
        
        int[] arr2 = new int[0];
        System.out.println(arr2.length);
        
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
    }
}
