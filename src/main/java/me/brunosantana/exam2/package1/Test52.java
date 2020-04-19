package me.brunosantana.exam2.package1;

class Parent2 {
    int i = 10;
    Parent2(int i) {
        super();
        this.i = i;
    }
}

class Child2 extends Parent2 {
    int j = 20;

    Child2(int j) {
        super(0);
        this.j = j;
    }

    Child2(int i, int j) {
        super(i);
        //this(j); //Unresolved compilation problem: Constructor call must be the first statement in a constructor
        this.j = j; //FIX
    }

}

public class Test52 {
    public static void main(String[] args) {
        Child2 child = new Child2(1000, 2000);
        System.out.println(child.i + ":" + child.j);
        
        Child2 child2 = new Child2(2000);
        System.out.println(child2.i + ":" + child2.j);
    }
}

/*
 * Child(int, int) constructor has both super(i) and this(j) statements. 
 * A constructor should have super(...) or this(...) but not both. 
 * Hence Child(int, int) causes compilation failure. 
 */
