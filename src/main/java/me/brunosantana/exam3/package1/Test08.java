package me.brunosantana.exam3.package1;

public class Test08 {
    public static void main(String[] args) {
        //final boolean flag = false; //Unresolved compilation problem: Unreachable code
    	boolean flag = false; //FIX
        while(flag) {
            System.out.println("Good Morning!");
        }
    }
}

/*
 * final boolean flag = false; statement makes flag a compile time constant. 
 * Compiler knows the value of flag, which is false at compile time and hence it gives "Unreachable Code" error.  
 */
