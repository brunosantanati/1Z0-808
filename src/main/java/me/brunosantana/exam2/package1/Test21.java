package me.brunosantana.exam2.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test21 {
     public static void main(String[] args) {
         List<StringBuilder> days = new ArrayList<>();
         days.add(new StringBuilder("Sunday"));
         days.add(new StringBuilder("Monday"));
         days.add(new StringBuilder("Tuesday"));
 
         if(days.contains(new StringBuilder("Sunday"))) {
             days.add(new StringBuilder("Wednesday"));
         }
 
         System.out.println(days.size());
         
         //my test
         StringBuilder stringBuilder = new StringBuilder("Thrusday");
         days.add(stringBuilder);
         if(days.contains(stringBuilder)) {
        	 System.out.println("inside if statement");
         }
     }
}

/*
 * StringBuilder class doesn't override equals(Object) method and hence 
 * days.contains(new StringBuilder("Sunday")) returns false.
 * Code inside if-block is not executed and days.size() returns 3
*/
