package me.brunosantana.exam2.package1;

public class Test68 {
    public static void main(String[] args) {
        String str1 = " ";
        boolean b1 = str1.isEmpty();
        System.out.println(b1);
        str1.trim(); //str1.trim(); => creates an empty string "" but str1 still refers to single space string " ". 
        b1 = str1.isEmpty();
        System.out.println(b1);
    }
}
