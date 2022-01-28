package me.brunosantana.exam5.package1;

public class Test22 {
    private static void div() {
        System.out.println(1/0);
    }
 
    public static void main(String[] args) {
        try {
            div();
        } finally {
            System.out.println("FINALLY");
        }
    }
}
