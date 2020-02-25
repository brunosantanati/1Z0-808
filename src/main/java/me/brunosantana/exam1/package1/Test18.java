package me.brunosantana.exam1.package1;

/*
 * 
 * An example of swift code: ICICINBBRT4
   ICIC: First 4 letters for bank code
   IN: Next 2 letters for Country code
   BB: Next 2 letters for Location code
   RT4: Next 3 letters for Branch code
   
   How to get the country code
 * 
 */

public class Test18 {
	public static void main(String[] args) {
		String swiftCode = "ICICINBBRT4";
		System.out.println(swiftCode.substring(4, 6));
	}
}
