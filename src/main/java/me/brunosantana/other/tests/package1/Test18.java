package me.brunosantana.other.tests.package1;

//Java Convert char to int with examples
//https://beginnersbook.com/2019/04/java-char-to-int-conversion/

public class Test18 {
	
	public static void printCharValue(int charValue) {
		System.out.println(charValue);
	}
	
	public static void main(String args[]) {
		char ch = 'A';
		char ch2 = 'Z';
		int num = ch;
		int num2 = ch2;
		System.out.println("ASCII value of char " + ch + " is: " + num);
		System.out.println("ASCII value of char " + ch2 + " is: " + num2);
		
		printCharValue('A');
		printCharValue('Z');
	}
}
