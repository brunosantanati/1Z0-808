package me.brunosantana.exam2.package1;

public class Test47 {

	public static void main(String[] args) {
		
		try {
			Integer.parseInt("s");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException " + e.getMessage());
		}
		
		try {
			Integer.valueOf("e");
		}catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException " + e.getMessage());
		}
		
		try {
			Runnable r = (Runnable) new Test47();
		}catch(ClassCastException e) {
			System.out.println("ClassCastException " + e.getMessage());
		}

	}

}
