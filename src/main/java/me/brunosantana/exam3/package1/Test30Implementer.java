package me.brunosantana.exam3.package1;

interface I01 {
    void m1();
}

public class Test30Implementer extends Object implements I01{
    //protected void m1() { //Cannot reduce the visibility of the inherited method from I01
	public void m1() { //FIX

    }
}

/*
void m1(); in interface I01 is equivalent to public abstract void m1();
So method m1() is implicitly public and abstract.

As method m1() is implicitly public in I01, hence overriding method in Implementer class 
should also be public. But it is protected and hence compiler complains.
*/
