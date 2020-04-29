package me.brunosantana.exam3.package1;

public class Test40 {
    public static void main(String[] args) {
        Boolean b = new Boolean("tRUe");
//        switch(b) { //Unresolved compilation problem: Cannot switch on a value of type Boolean. Only convertible int values, strings or enum variables are permitted
//            case true:
//                System.out.println("ONE");
//            case false:
//                System.out.println("TWO");
//            default: 
//                System.out.println("THREE");
//        }
    }
}

/*
 * switch can accept primitive types: byte, short, int, char; 
 * wrapper types: Byte, Short, Integer, Character; String and enums.
 * switch(b) causes compilation failure as b is of Boolean type.
 */
