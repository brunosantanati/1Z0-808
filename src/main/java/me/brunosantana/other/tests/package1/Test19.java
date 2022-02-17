package me.brunosantana.other.tests.package1;

class Animal1{
	public void m1() {
		System.out.println("Animal.m1");
	}
}

class Horse extends Animal1{
	public void m1() {
		System.out.println("Horse.m1");
	}
	
	public void m2() {
		System.out.println("Horse.m2");
	}
}

public class Test19 {
	public static void main(String[] args) {
		
		Animal1 a1 = new Horse();
		a1.m1();
		//a1.m2(); //The method m2() is undefined for the type Animal1
		Horse h1 = (Horse) a1;
		h1.m1();
		h1.m2();
		
		Horse h = new Horse();
		h.m1();
		h.m2();
		Animal1 a = (Animal1) h; //funciona sem casting também: Animal1 a = h;
		a.m1();
		//a.m2(); //The method m2() is undefined for the type Animal1
		
		Animal1 aa = new Animal1();
		aa.m1();
		Horse hh = (Horse) aa; //java.lang.ClassCastException
	}
}
