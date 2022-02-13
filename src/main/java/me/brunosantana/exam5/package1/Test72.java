package me.brunosantana.exam5.package1;

public class Test72 {
    public static void main(String[] args) {
        String word = "REBUS";
        /* INSERT */
        word = word.substring(2); //BUS
        //word = word.substring(2, 4); //BU
        //word = word.substring(2, 5); //BUS
        //word = word.replace("RE", ""); //BUS
        //word = word.substring(2, 6); //java.lang.StringIndexOutOfBoundsException: String index out of range: 6
        //word = word.delete(0, 2); //The method delete(int, int) is undefined for the type String
        System.out.println(word);
    }
}

/*
Following options are available to replace INSERT:

1. word = word.substring(2);
2. word = word.substring(2, 4);
3. word = word.substring(2, 5);
4. word = word.replace("RE", "");
5. word = word.substring(2, 6);
6. word = word.delete(0, 2);

How many of the above options can be used to replace INSERT 
(separately and not together) such that given command prints BUS on to the console?
*/