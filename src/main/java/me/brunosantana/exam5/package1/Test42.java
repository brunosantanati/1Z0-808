package me.brunosantana.exam5.package1;

public class Test42 {
    public static void main(String[] args) {
        String s1 = "OCP";
        String s2 = "ocp";
        //System.out.println(/*INSERT*/);
        
        //System.out.println(s1.equals(s2)); //false
        //System.out.println(s1.equals(s2.toUpper())); //The method toUpper() is undefined for the type String
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        //System.out.println(s1.contentEquals(s2)); //false
        //System.out.println(s2.equals(s1.toLower())); //The method toLower() is undefined for the type String
        System.out.println(s1.length() == s2.length()); //true
        
        //MY TESTS
        System.out.println(s1.equals(s2.toUpperCase())); //true
        System.out.println(s2.equals(s1.toLowerCase())); //true
    }
}
