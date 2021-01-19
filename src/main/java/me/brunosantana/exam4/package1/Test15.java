package me.brunosantana.exam4.package1;

public class Test15 {
    public static void main(String args[]) {
        double area = 5.7;
        String color;
        //String color = "blue"; //FIX
        if (area < 7)
            color = "green";
        else color = "blue"; //OTHER FIX

        System.out.println(color); //Unresolved compilation problem: The local variable color may not have been initialized
    }
}
