package me.brunosantana.exam5.package1;

public class Test66 /*AvoidThreats*/ {
    public static void evaluate(Threat t) { //Line n5
        t = new Threat(); //Line n6
        t.name = "PHISHING"; //Line n7
    }
    
    public static void main(String[] args) {
        Threat obj = new Threat(); //Line n1
        obj.print(); //Line n2
        evaluate(obj); //Line n3
        obj.print(); //Line n4
    }
}
 
class Threat {
    String name = "VIRUS";
    
    public void print() {
        System.out.println(name);
    }
}
