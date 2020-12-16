package me.brunosantana.exam3.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test66 {
     public static void main(String[] args) {
         List<Boolean> list = new ArrayList<>();
         list.add(true); //list.add(true); => Auto-boxing converts boolean literal true to Boolean instance containing true. Element at index 0 represents true.
         list.add(new Boolean("tRue")); //Boolean class code uses equalsIgnoreCase method to validate the passed String, so if passed String is "true" ('t', 'r', 'u' and 'e' can be in any case), then boolean value stored in Boolean object is true otherwise false.
         list.add(new Boolean("abc"));
 
         if(list.remove(1)) {
             list.remove(1);
         }
 
         System.out.println(list);
     }
}
