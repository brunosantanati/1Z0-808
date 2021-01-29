package me.brunosantana.exam4.package1;

public class Test63 {
    public static void print() {
        System.out.println("static method");
    }
    
    public void print2() {
        System.out.println("regular method");
    }

    public static void main(String[] args) {
        Test63 obj = null;
        obj.print(); // OK
        obj.print2(); //java.lang.NullPointerException
    }
}
