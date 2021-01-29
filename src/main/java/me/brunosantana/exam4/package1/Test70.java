package me.brunosantana.exam4.package1;

import java.time.LocalTime;

public class Test70 {
     public static void main(String [] args) {
    	 
    	 LocalTime time2 = LocalTime.of(23, 59);
         System.out.println(time2);
         
         LocalTime time3 = LocalTime.of(23, 59, 59);
         System.out.println(time3);
         
         LocalTime time = LocalTime.of(23, 60); //java.time.DateTimeException: Invalid value for MinuteOfHour (valid values 0 - 59): 60
         System.out.println(time);
     }
}
