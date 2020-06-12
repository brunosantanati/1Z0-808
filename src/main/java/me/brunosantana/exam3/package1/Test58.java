package me.brunosantana.exam3.package1;

import java.util.Arrays;

public class Test58 {
    public static void main(String[] args) {
        String msg = "Hello";
        boolean [] flag = new boolean[1]; //There is only one element in boolean array object and it is initialized to default value of boolean, which is false. 
        if(flag[0]) {
            msg = "Welcome";
        }
        System.out.println(msg);
        System.out.println(Arrays.toString(flag));
        
        Boolean [] flag2 = new Boolean[1];
        System.out.println(flag2[0]);
        /*if(flag2[0]) { //java.lang.NullPointerException
        	System.out.println("teste");
        }*/
    }
}
