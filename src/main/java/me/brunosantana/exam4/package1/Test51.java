package me.brunosantana.exam4.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test51 {
     public static void main(String[] args) {
         List<String> dryFruits = new ArrayList<>();
         dryFruits.add("Walnut");
         dryFruits.add("Apricot");
         dryFruits.add("Almond");
         dryFruits.add("Date");
 
         for(String dryFruit : dryFruits) { //Exception in thread "main" java.util.ConcurrentModificationException
             if(dryFruit.startsWith("A")) {
                 dryFruits.remove(dryFruit);
             }
         }
 
         System.out.println(dryFruits);
     }
}
