package me.brunosantana.other.tests.package1;

class Rambo{
	public static final String name = "John Rambo";
	
	public String getName() {
		return name;
	}
	
	public static String getName2() {
		return name;
	}

}

public class Test13 {
	
	public static void main(String[] args) {
		Rambo rambo = null;
		System.out.println(rambo.name);
		System.out.println(rambo.getName2());
		System.out.println(rambo.getName()); // Exception in thread "main" java.lang.NullPointerException
	}

}
