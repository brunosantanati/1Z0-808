package me.brunosantana.exam4.package1;

class A {
    A() {
        this(1);
        System.out.println("M");
    }

    A(int i) {
        System.out.println("N");
    }
}

class B extends A {

}

public class Test13 {
   public static void main(String[] args) {
        new B();
    }
}