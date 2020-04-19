package me.brunosantana.exam2.package1;

import me.brunosantana.exam2.package2.A;

public class Test70A extends A {
    public static void main(String[] args) {
        A obj = new A(); //Line 7
        System.out.println(obj.i1); //Line 8
        //System.out.println(obj.i2); //Line 9
        //System.out.println(obj.i3); //Line 10
        //System.out.println(obj.i4); //Line 11
        
        Test70A obj2 = new Test70A();
        System.out.println(obj2.i1);
        System.out.println(obj2.i2);
        
    }
}
