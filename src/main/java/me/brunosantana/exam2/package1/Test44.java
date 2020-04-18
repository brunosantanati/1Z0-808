package me.brunosantana.exam2.package1;

public class Test44 {
    private static void m1() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) /* throws Exception //FIX */ {
        try {
            m1();
        } catch(Exception e) { //FIX
        	System.out.println(e);
        } finally {
            System.out.println("A");
        }
    }
}

/*
 * Handle or Declare rule should be followed for checked exception if you are not re-throwing it. 
 */