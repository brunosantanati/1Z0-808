package me.brunosantana.exam3.package1;

//When is the Test48Pen object, created at Line 1 eligible for Garbage Collection?
public class Test48Pen {
    public static void main(String[] args) {
    	Test48Pen p1 = new Test48Pen(); //Line 1
    	Test48Pen p2 = new Test48Pen(); //Line 2
        p1 = p2; //Line 3
        p1 = null; //Line 4
    }
}

/*
At Line 3, p1 starts referring to the object referred by p2(Created at Line 2).

So, after Line 3, object created at Line 1 becomes unreachable and thus eligible for Garbage Collection.
 */
