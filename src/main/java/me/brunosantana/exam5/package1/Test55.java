package me.brunosantana.exam5.package1;

class Parent1 {
    int var = 1000; // Line n1
 
    int getVar() {
        return var;
    }
}
 
class Child1 extends Parent1 {
    //private int var = 2000; // Line n2 //1-comment this line
 
    int getVar() {
        return super.var; //Line n3
    }
}
 
public class Test55 {
    public static void main(String[] args) {
        Child1 obj = new Child1(); // Line n4 //2-change this line for: Parent1 obj = new Child1();
        System.out.println(obj.var); // Line n5 //The field Child1.var is not visible //3-change for obj.getVar()
    }
}
