package me.brunosantana.other.tests.package1;

public class Test11 {
	
	private static String m1() throws ArithmeticException {//OK
	//private static String m1() throws Exception {
		return "m1";
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(m1()); //Unhandled exception type Exception
		} finally {
			System.out.println("FINALLY");
		}
	}

}
