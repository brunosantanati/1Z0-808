package me.brunosantana.exam3.package1;

class Base {
    protected void m1() {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {
    //void m1() { //Unresolved compilation problem: Cannot reduce the visibility of the inherited method from Base
	//private void m1() { //Unresolved compilation problem: Cannot reduce the visibility of the inherited method from Base
	//protected void m1() { //FIX
	public void m1() { //FIX
        System.out.println("Derived: m1()");
    }
}

public class Test52BaseDerived {
	public static void main(String[] args) {
        Base b = new Derived();
        b.m1();
    }
}

/*
Derived class overrides method m1() of Base class. Access modifier of method m1() in Base class 
is protected, so overriding method can use protected or public.
But overriding method in this case used default modifier and hence there is compilation error.
 */
