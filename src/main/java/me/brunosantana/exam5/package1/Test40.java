package me.brunosantana.exam5.package1;

abstract class Animal2 {
    abstract void jump() throws RuntimeException;
}
 
class Deer extends Animal2 {
    void jump() { //Line n1
        System.out.println("DEER JUMPS");
    }
 
    void jump(int i) {
        System.out.println("DEER JUMPS TO " + i + " FEET");
    }
}
 
public class Test40 {
    public static void main(String[] args) {
    	Animal2 animal = new Deer();
        ((Deer)animal).jump(); //Line n2
        ((Deer)animal).jump(5); //Line n3
    }
}
