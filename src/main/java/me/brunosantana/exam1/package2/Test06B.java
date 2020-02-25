package me.brunosantana.exam1.package2;

import me.brunosantana.exam1.package1.Test06A;

public class Test06B extends Test06A {
    public void print() {
        Test06A obj = new Test06A();
        System.out.println(obj.i1); //Line 8
        //System.out.println(obj.i2); //Line 9 //Unresolved compilation problem: The field A6.i2 is not visible
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }

    public static void main(String [] args) {
        new Test06B().print();
    }
}
