package me.brunosantana.exam1.package1;

public class Test35 {
	public static void main(String[] args) {
        try {
            main(args); //Exception in thread "main" java.lang.StackOverflowError
            
        //} catch(java.io.FileNotFoundException ex) { //Unresolved compilation problem: Unreachable catch block for FileNotFoundException. This exception is never thrown from the try statement body
        	
        }catch (Exception ex) { //It's OK use Exception despite the fact that Excpetion is checked.
            System.out.println("CATCH-");
        }
            System.out.println("OUT");
    }
	
	//None of the System.out.println statements are executed
	//StackOverflowError is a subclass of Error type and not Exception type
}
