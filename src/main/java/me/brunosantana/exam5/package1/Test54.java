package me.brunosantana.exam5.package1;

class Super1 {
    void Super1() { //This method has a constructor name
        System.out.print("KEEP_");
    }
}
 
class Base1 extends Super1 {
    Base1() {
        Super1();
    	//super();
        System.out.print("GOING_");
    }
}
 
public class Test54 {
    public static void main(String[] args) {
        new Base1();
    }
}
