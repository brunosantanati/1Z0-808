package me.brunosantana.exam5.package1;

class X4 {
    void greet() {
        System.out.println("Good Morning!");
    }
}
 
class Y extends X4 {
    void greet() {
        System.out.println("Good Afternoon!");
    }
}
 
class Z extends Y {
    void greet() {
        System.out.println("Good Night!");
    }
}
 
public class Test59 {
    public static void main(String[] args) {
        X4 x = new Z();
        x.greet(); //Line n1
        ((Y)x).greet(); //Line n2
        ((Z)x).greet(); //Line n3
    }
}
