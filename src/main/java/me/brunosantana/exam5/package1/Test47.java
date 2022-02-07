package me.brunosantana.exam5.package1;

import me.brunosantana.exam5.package2.M;
import me.brunosantana.exam5.package2.N;

public class Test47 {
    public static void main(String[] args) {
        M obj1 = new M();
        N obj2 = (N)obj1; //Exception in thread "main" java.lang.ClassCastException: me.brunosantana.exam5.package2.M cannot be cast to me.brunosantana.exam5.package2.N
        obj2.printName();
    }
}
