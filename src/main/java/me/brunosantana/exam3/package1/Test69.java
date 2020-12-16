package me.brunosantana.exam3.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test69 {
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
         list.add(110); //for list.add(110); auto-boxing creates an Integer object {110}.
         list.add(new Integer(110));
         list.add(110);
 
         list.removeIf(i -> i == 110); //remove all elements
         //list.removeIf(i -> i == new Integer(110)); //does not remove any element since object references are equated and not contents
         System.out.println(list);
     }
}
