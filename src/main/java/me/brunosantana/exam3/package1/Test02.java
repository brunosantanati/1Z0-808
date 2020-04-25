package me.brunosantana.exam3.package1;

public class Test02 {
    public static void main(String[] args) {
        String str = "Good"; //Line 3
        change(str); //Line 4
        System.out.println(str); //Line 5
    }

    private static void change(String s) {
        s.concat("_Morning"); //Line 9
    }
}
