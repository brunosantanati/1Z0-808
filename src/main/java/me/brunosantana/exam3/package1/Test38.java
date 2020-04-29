package me.brunosantana.exam3.package1;

import java.time.LocalDate;

public class Test38 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2000-06-25");
        while(date.getDayOfMonth() >= 20) {
            System.out.println(date);
            //date.plusDays(-1); //Infinite Loop
            //date = date.plusDays(-1); //FIX
            date = date.minusDays(1); //FIX
        }
    }
}

/*
date.plusDays(-1); creates a new LocalDate object {2000-06-24} but 
date reference variable still refers to {2000-06-25}. date.getDayOfMonth() again returns 25, 
this is an infinite loop.
*/
