package me.brunosantana.exam1.package1;

public class Test04 {
    public static void main(String[] args) {
        //System.out.println("Output is: " + 10 != 5); //Unresolved compilation problem: Incompatible operand types String and int
    	//System.out.println(("Output is: " + 10) != 5); //Unresolved compilation problem: Incompatible operand types String and int
    	System.out.println("Output is: " + (10 != 5)); //Corrected operators precedence
    }
}
