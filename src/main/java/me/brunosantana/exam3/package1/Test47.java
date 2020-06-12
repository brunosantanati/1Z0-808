package me.brunosantana.exam3.package1;

public class Test47 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("0123456789");
        sb.delete(8, 1000);
        System.out.println(sb);
    }
}

/*
`new StringBuilder(5);` creates a StringBuilder instance, whose internal char array's length is 5 
but the internal char array's length is adjusted when characters are added/removed from the 
StringBuilder instance. `sb.append("0123456789");` successfully appends "0123456789" 
the StringBuilder's instance referred by sb.

 ...
 
 If end is greater than the length of StringBuilder object, then StringIndexOutOfBoundsException 
 is not thrown and end is set to sb.length().
 
 */
