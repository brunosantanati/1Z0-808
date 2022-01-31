package me.brunosantana.exam5.package1;

public class Test35 {
    static int i1 = 10;
    int i2 = 20;
    
    int add() {
        return this.i1 + this.i2; //Line n1 //warning: The static field Test35.i1 should be accessed in a static way
    }
    
    public static void main(String[] args) {
        System.out.println(new Test35().add()); //Line n2
    }
}