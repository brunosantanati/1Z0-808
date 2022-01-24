package me.brunosantana.exam5.package1;

public class Test09 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TOMATO");
        //System.out.println(sb.reverse().replace("O", "A")); //Line n1 //The method replace(int, int, String) in the type StringBuilder is not applicable for the arguments (String, String)
        System.out.println(sb.reverse().replace(0, 1, "A").replace(4, 5, "A")); //FIX
        
        //MY TEST
        System.out.println("TOMATO".replace("O", "A"));
    }
}
