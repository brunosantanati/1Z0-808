package me.brunosantana.exam2.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test29 {
     public static void main(String [] args) {
         List<Integer> list = new ArrayList<Integer>();
 
         list.add(27);
         list.add(27);
 
         list.add(new Integer(27));
         list.add(new Integer(27));
 
         System.out.println(list.get(0) == list.get(1));
         System.out.println(list.get(2) == list.get(3));
     }
}

/* Two instances of following wrapper objects, created through auto-boxing 
 * will always be same, if their primitive values are same.
 * new Integer(27) creates a new Object in the memory, so 
 * System.out.println(list.get(2) == list.get(3)); returns false.
 * */
