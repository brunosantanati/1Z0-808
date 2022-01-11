package me.brunosantana.exam5.package1;

import java.io.IOException;

class Parent {
    Parent() throws IOException {
        System.out.print("HAKUNA");
    }
}
 
class Child extends Parent {
    Child() throws Exception {
        System.out.println("MATATA");
    }
}
 
public class Test01 {
    public static void main(String[] args) throws Exception {
        new Child();
    }
}