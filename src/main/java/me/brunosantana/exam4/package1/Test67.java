package me.brunosantana.exam4.package1;

public class Test67 {
    public static void main(String[] args) {
        String [] arr = {"A", "B", "C", "D"};
        arr[0] = arr[1];
        arr[1] = "E";
        for(String s : arr) {
            System.out.print(s + " ");
        }
    }
}



