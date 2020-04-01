package me.brunosantana.exam1.try2.package1;

public class Test67 {
    public static void main(String[] args) {
        double price = 90000;
        //String model;
        String model = ""; //FIX
        if(price > 100000) {
            model = "Tesla Model X";
        } else if(price <= 100000) {
            model = "Tesla Model S";
        }
          System.out.println(model); //Exception in thread "main" java.lang.Error: Unresolved compilation problem: The local variable model may not have been initialized
    }
}
