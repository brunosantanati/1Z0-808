package me.brunosantana.exam4.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test29 {
     public static void main(String[] args) {
         List<String> days = new ArrayList<>();
         days.add("SUNDAY");
         days.add("SUNDAY");
         days.add("MONDAY");
         System.out.println(days.size());
         days.clear();
         System.out.println(days.size());
         //System.out.println(days);
     }
}