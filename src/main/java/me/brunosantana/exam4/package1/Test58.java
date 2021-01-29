package me.brunosantana.exam4.package1;

public class Test58 {
    private static int [] arr;
    public static void main(String [] args) {
        if(arr.length > 0 && arr != null) { //java.lang.NullPointerException at me.brunosantana.exam4.package1.Test58.main(Test58.java:6)
            System.out.println(arr[0]);
        }
    }
}
