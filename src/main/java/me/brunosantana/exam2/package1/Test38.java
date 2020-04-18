package me.brunosantana.exam2.package1;

import java.time.LocalDate;

public class Test38 {
     public static void main(String [] args) {
         //LocalDate date = LocalDate.parse("2018-1-01"); //Exception in thread "main" java.time.format.DateTimeParseException: Text '2018-1-01' could not be parsed at index 5
    	 LocalDate date = LocalDate.parse("2018-01-01"); //FIX
         System.out.println(date);
     }
}
