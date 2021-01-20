package me.brunosantana.exam4.package1;

public class Test42 {
    private static String s;
    public static void main(String[] args) {
        try {
            System.out.println(s.length());
        //} catch(NullPointerException | RuntimeException ex) { //Unresolved compilation problem: The exception NullPointerException is already caught by the alternative RuntimeException
        } catch(Error | RuntimeException ex) { //FIX
            System.out.println("DONE");
        }
    }
}
