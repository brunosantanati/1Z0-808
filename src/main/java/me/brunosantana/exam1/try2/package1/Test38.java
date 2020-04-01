package me.brunosantana.exam1.try2.package1;

import java.time.LocalDate;

public class Test38 {
    public static void main(String [] args) {
         LocalDate date = LocalDate.of(2020, 9, 31); //Exception in thread "main" java.time.DateTimeException: Invalid date 'SEPTEMBER 31'
         System.out.println(date);
    }
}
