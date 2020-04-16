package me.brunosantana.exam2.package1;

public class Test14 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = "Java";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
