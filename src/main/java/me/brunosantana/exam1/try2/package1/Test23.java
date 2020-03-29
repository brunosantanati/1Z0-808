package me.brunosantana.exam1.try2.package1;

public class Test23 {
    public static void main(String[] args) {
        String [] fruits = {"apple", "banana", "mango", "orange"};
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
            if(fruit.equals("mango")) {
                continue;
            }
            System.out.println("salad!");
            break;
        }        
    }
}
