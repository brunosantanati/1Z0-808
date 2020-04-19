package me.brunosantana.exam2.package1;

public class Test49 {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("tRuE");
        Boolean b2 = new Boolean("fAlSe");
        Boolean b3 = new Boolean("abc");
        Boolean b4 = null;
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
    }
}

/*
 * Boolean class code uses equalsIgnoreCase method to validate the passed String, 
 * so if passed String is "true" ('t', 'r', 'u' and 'e' can be in any case), 
 * then boolean value stored in Boolean object is true otherwise false. 
 * */
