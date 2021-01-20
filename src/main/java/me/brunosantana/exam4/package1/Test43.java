package me.brunosantana.exam4.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test43 {
     public static void main(String[] args) {
         List<String> fruits = new ArrayList<>();
         fruits.add("apple");
         fruits.add("orange");
         fruits.add("grape");
         fruits.add("mango");
         fruits.add("banana");
         fruits.add("grape");
 
         if(fruits.remove("grape"))
             fruits.remove("apple");
 
         System.out.println(fruits);
         
         String removed = fruits.remove(0);
         System.out.println(removed);
     }
}