package me.brunosantana.other.tests.package1;

import java.io.IOException;

class Parent1 {
    Parent1() throws IOException {
        System.out.print("HAKUNA");
    }
}
 
class Child1 extends Parent1 {
    Child1() throws Exception {
	//Child1() { //Unhandled exception type IOException
		//super(); //Unhandled exception type IOException
        System.out.println("MATATA");
    }
}
 
public class Test03 {
    public static void main(String[] args) throws Exception {
        new Child1();
    }
}
