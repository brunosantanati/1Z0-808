package me.brunosantana.exam5.package1;

public class Test67 {
    public static void main(String [] args) {
        boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true));
        System.out.println(flag);
    }
}
