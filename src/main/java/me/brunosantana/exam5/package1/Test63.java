package me.brunosantana.exam5.package1;

class A {
    public String toString() {
        return null;
    }
}
 
public class Test63 {
    public static void main(String [] args) {
        String text = null;
        text = text + new A(); //Line n1
        System.out.println(text.length()); //Line n2
        
        //MY TEST
        System.out.println(null + "" + null);
        System.out.println((null + "" + null).length());
    }
}
