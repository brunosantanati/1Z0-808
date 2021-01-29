package me.brunosantana.exam4.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test56 {
     public static void main(String[] args) {
         Integer i = 10;
         List<Integer> list = new ArrayList<>();
         list.add(i);
         list.add(new Integer(i));
         list.add(i);
 
         //list.removeIf(i -> i == 10); //Unresolved compilation problem: Lambda expression's parameter i cannot redeclare another local variable defined in an enclosing scope.
         list.removeIf(k -> k == 10); //FIX
         
         System.out.println(list);
     }
}
