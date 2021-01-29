package me.brunosantana.exam4.package1;

public class Test61 {
    public static void main(String[] args) {
        int i;
        outer: 
        do {
            i = 5;
            inner:
            while (true) {
                System.out.println(i--);
                if (i == 4) {
                    break outer;
                }
            }
        } while (true);
    }
}