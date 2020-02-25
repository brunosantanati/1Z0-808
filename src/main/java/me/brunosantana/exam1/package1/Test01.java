package me.brunosantana.exam1.package1;

public class Test01 {
    public static void main(String[] args) {
        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        String s3 = s1 + "";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        
        final String s4 = "B";
        String s5 = s4 + "";
        System.out.println(s4 == s5);
        
        /*
         * Please note that Strings computed by concatenation at compile time, will be referred by String Pool during execution. Compile time String concatenation happens when both of the operands are compile time constants, such as literal, final variable etc.
         * 
         * So, during compilation, Java compiler translates the statement

			String s2 = "OCAJP" + "";
			
			to
			
			String s2 = "OCAJP";
			
			As "OCAJP" is a String literal, hence at runtime it will be referred by String Pool.
         */
    }
}