package me.brunosantana.exam3.package1;

class Base1 {
    public void m1() throws NullPointerException {
        System.out.println("Base: m1()");
    }
}

class Derived1 extends Base1 {
    public void m1() throws RuntimeException {
        System.out.println("Derived: m1()");
    }
}

public class Test59 {
    public static void main(String[] args) {
        Base1 obj = new Derived1();
        obj.m1();
    }
}

//NullPointerException extends RuntimeException, 
//but there are no overriding rules related to unchecked exceptions. 