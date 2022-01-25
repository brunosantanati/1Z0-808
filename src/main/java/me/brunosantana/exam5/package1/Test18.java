package me.brunosantana.exam5.package1;

public class Test18 {
    //private static void div(int i, int j) {
	private static void div(int i, int j) throws Exception { //FIX
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            Exception ex = new Exception(e);
            throw ex; //Unhandled exception type Exception
        }
    }
    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch(Exception e) {
            System.out.println("END");
        }
    }
}
