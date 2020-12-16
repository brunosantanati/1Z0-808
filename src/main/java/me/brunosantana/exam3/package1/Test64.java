package me.brunosantana.exam3.package1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 
/*
LocalDate object doesn't contain time part but ISO_DATE_TIME looks for time portion and throws exception at runtime.

For the OCA exam, you can check following DateTimeFormatter types: 
BASIC_ISO_DATE, ISO_DATE, ISO_LOCAL_DATE, ISO_TIME, ISO_LOCAL_TIME, ISO_DATE_TIME, ISO_LOCAL_DATE_TIME.
 */
public class Test64 {
     public static void main(String [] args) {
          System.out.println(LocalDate.parse("1987-09-01")
        		  .format(DateTimeFormatter.ISO_DATE_TIME)); //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
     }
}
