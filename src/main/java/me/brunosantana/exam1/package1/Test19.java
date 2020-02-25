package me.brunosantana.exam1.package1;

public class Test19 {
    private static void m(int x) {
        System.out.println("int version");
    }

    private static void m(char x) {
        System.out.println("char version");
    }

    public static void main(String [] args) {
        int i = '5';
        System.out.println(i); //53
        m(i);
        m('5');
        
        //http://www.asciitable.com/
        //https://www.javatpoint.com/java-char-to-int
        
        int x = 'A'; //If we direct assign char variable to int, it will return ASCII value of given character.
        System.out.println(x); //65
        
        char y = '1';
        int y2 = Character.getNumericValue(y);
        System.out.println(y2);
        int y3 = Integer.parseInt(String.valueOf(y));
        System.out.println(y3);
    }
}
