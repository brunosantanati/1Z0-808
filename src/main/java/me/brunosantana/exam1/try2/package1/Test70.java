package me.brunosantana.exam1.try2.package1;

class A {
    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    public void print() {
        System.out.println("B");
    }
}

public class Test70 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = (B)obj1; //Exception in thread "main" java.lang.ClassCastException: class me.brunosantana.exam1.try2.package1.A cannot be cast to class me.brunosantana.exam1.try2.package1.B (me.brunosantana.exam1.try2.package1.A and me.brunosantana.exam1.try2.package1.B are in unnamed module of loader 'app')
        obj2.print();
    }
}
