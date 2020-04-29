package me.brunosantana.exam3.package1;

class Super {
    public Super(int i) {
        System.out.println(100);
    }
}

class Sub extends Super {
    public Sub() { //Unresolved compilation problem: Implicit super constructor Super() is undefined. Must explicitly invoke another constructor
    	super(10); //FIX
        System.out.println(200);
    }
}

public class Test33 {
    public static void main(String[] args) {
        new Sub();
    }
}
