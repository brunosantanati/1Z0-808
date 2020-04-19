package me.brunosantana.exam2.package1;

public class Test58 {
    public static void main(String[] args) {
        System.out.println(new Boolean("ture"));
    }
}

/*
 * Boolean class code uses equalsIgnoreCase method to validate the passed String, 
 * so if passed String is "true" ('t', 'r', 'u' and 'e' can be in any case), 
 * then boolean value stored in Boolean object is true otherwise false. 
 * In this question passed String is "ture" and not "true" and 
 * that is why false is printed on to the console. 
*/
