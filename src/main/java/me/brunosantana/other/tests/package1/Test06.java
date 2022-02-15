package me.brunosantana.other.tests.package1;

public class Test06 {
	
	public static void main(String[] args) {
		
		boolean b = false;
		
		for (int i = 0; i < 4; i++) {
			if(b = !b) System.out.println(i);
		}
	}

}
