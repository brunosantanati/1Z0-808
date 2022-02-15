package me.brunosantana.other.tests.package1;

interface III{
	String i = "i";
}

public class Test14 {
	public static void main(String[] args) {
		System.out.println(III.i);
		//III.i = "teste"; //The final field III.i cannot be assigned
	}
}
