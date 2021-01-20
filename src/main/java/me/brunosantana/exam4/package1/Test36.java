package me.brunosantana.exam4.package1;

//doc: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html

public class Test36 {
    public static void main(String [] args) {
        int a = 3;
        System.out.println(a++ == 3 || --a == 3 && --a == 3);
        //System.out.println((a++ == 3 || --a == 3) && --a == 3);
        //System.out.println(a++ == 3 | --a == 3 && --a == 3);
        //System.out.println((a++ == 3 | --a == 3) && --a == 3);
    }
}
