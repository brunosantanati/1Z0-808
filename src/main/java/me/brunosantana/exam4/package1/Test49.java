package me.brunosantana.exam4.package1;

public class Test49 {
    static String msg; //Line 2
    public static void main(String[] args) {
        //String msg; //Line 4
    	String msg = "fix"; //FIX
        if(args.length > 0) {
            msg = args[0]; //Line 6
        }
        System.out.println(msg); //Line 8 //Unresolved compilation problem: The local variable msg may not have been initialized
    }
}