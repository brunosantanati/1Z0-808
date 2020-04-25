package me.brunosantana.exam3.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test01 {
     public static void main(String[] args) {
         List<String> fruits = new ArrayList<>();
         fruits.add("apple");
         fruits.add("orange");
         fruits.add("grape");
         fruits.add("mango");
         fruits.add("banana");
         fruits.add("grape");
 
         if(fruits.remove("grape"))
             fruits.remove("papaya");
 
         System.out.println(fruits);
     }
}

/*
 * remove(Object) method of List interface removes the first occurrence of the specified element 
 * from the list, if it is present. If this list does not contain the element, 
 * it is unchanged. remove(Object) method returns true, if removal was successful otherwise false. 
 */
