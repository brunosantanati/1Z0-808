package me.brunosantana.exam2.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test10 {
     public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add("ONE");
         list.add("TWO");
         list.add("THREE");
         list.add("THREE");
         
         //System.out.println(list.remove(2)); //THREE
 
         //if(list.remove(2)) { //Unresolved compilation problem: Type mismatch: cannot convert from String to boolean
         if(list.remove("THREE")) {
             list.remove("THREE");
         }
 
         System.out.println(list);
    }
}

/*
 * list.remove(Object) method returns boolean result but 
 * list.remove(int index) returns the removed item from the list
 */
