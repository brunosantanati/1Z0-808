package me.brunosantana.exam2.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test61 {
     public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add("X");
         list.add("Y");
         list.add("X");
         list.add("Y");
         list.add("Z");
         list.remove(new String("Y"));
         System.out.println(list);
     }
}

/*
 * String class and all the wrapper classes override equals(Object) method, 
 * hence at the time of removal when another instance is passes [new String("Y")], 
 * there is no issue in removing the  matching item.
 */
