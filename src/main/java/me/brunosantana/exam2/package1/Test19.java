package me.brunosantana.exam2.package1;

public class Test19 {}

interface I1 {
    void m1() throws java.io.IOException;
}

class C1 implements I1 {
	public void m1() {}
}

class C2 implements I1 {
	public void m1() throws java.io.FileNotFoundException{}
}

class C3 implements I1 {
	public void m1() throws java.io.IOException{}
}

/*class C4 implements I1 {
	public void m1() throws Exception{} //error: m1() in C4 cannot implement m1() in I1 - overridden method does not throw Exception
}*/


/*
According to overriding rules, if super class / interface method declares to throw a checked exception, 
then overriding method of sub class / implementer class has following options:

1. May not declare to throw any checked exception,

2. May declare to throw the same checked exception thrown by super class / interface method,

3. May declare to throw the sub class of the exception thrown by super class / interface method,

4. Cannot declare to throw the super class of the exception thrown by super class / interface method 
*/