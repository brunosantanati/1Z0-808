package me.brunosantana.exam2.package1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
 
public class Test37 {
     public static void main(String [] args) {
         LocalDate date = LocalDate.of(2012, 1, 11);
         Period period = Period.ofMonths(2);
         //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd-yy");//PROBLEM
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");//FIX
         System.out.print(formatter.format(date.minus(period))); //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: MinuteOfHour
         
         DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("DD-MM-yyyy");
         System.out.println("\n" + formatter2.format(LocalDate.of(2020, 02, 10)));
         formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         System.out.println(formatter2.format(LocalDate.of(2020, 2, 10)));
     }
}

/*
 * While working with dates, programmers get confused with M & m and D & d. 
 * Easy way to remember is that Bigger(Upper case) letters represent something bigger. 
 * M represents month & m represents minute, D represents day of the year & 
 * d represents day of the month. 
 * LocalDate's object doesn't have time component, mm represents minute and not months 
 * so at runtime format method throws exception.
*/
