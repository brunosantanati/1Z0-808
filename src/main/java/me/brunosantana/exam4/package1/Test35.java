package me.brunosantana.exam4.package1;

import me.brunosantana.exam4.package2.A;
import me.brunosantana.exam4.package2.B;
import me.brunosantana.exam4.package2.C;

public class Test35 {
    public static void main(String[] args) {
        A obj1 = new C();
        A obj2 = new B();
        C obj3 = (C)obj1;
        C obj4 = (C)obj2; //java.lang.ClassCastException: me.brunosantana.exam4.package2.B cannot be cast to me.brunosantana.exam4.package2.C
        obj3.print();
    }
}
