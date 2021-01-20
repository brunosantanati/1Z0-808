package me.brunosantana.exam4.package1;

public class Test28 {
    public static void main(String[] args) {
        String s1 = new String("Java"); //Line 3
        String s2 = "JaVa"; //Line 4
        String s3 = "JaVa"; //Line 5
        String s4 = "Java"; //Line 6
        String s5 = "Java"; //Line 7

        int i = 1; //Line 9
        
        //Java
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s4 == s5);
        System.out.println();
        
        //JaVa
        System.out.println(s2 == s3);
        System.out.println();
        
        //Java e JaVa
        System.out.println(s1 == s2);
        System.out.println(s2 == s4);
        System.out.println();

    }
}