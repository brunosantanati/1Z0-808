package me.brunosantana.exam2.package1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
public class Test11 {
     public static void main(String[] args) {
         List<String> dryFruits = new ArrayList<>();
         dryFruits.add("Walnut");
         dryFruits.add("Apricot");
         dryFruits.add("Almond");
         dryFruits.add("Date");
 
         ListIterator<String> iterator = dryFruits.listIterator();
         while(iterator.hasNext()) {
             if(iterator.next().startsWith("A")) {
                 iterator.remove();
             }
         }
 
         System.out.println(dryFruits);
     }
}
