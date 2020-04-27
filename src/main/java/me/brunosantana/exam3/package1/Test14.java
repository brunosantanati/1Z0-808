package me.brunosantana.exam3.package1;

import java.time.LocalDate;

public class Test14 {
     public static void main(String [] args) {
         LocalDate date = LocalDate.parse("2018-06-06");
         date.minusDays(10); //date.minusDays(10); => as LocalDate is immutable, hence a new LocalDate object is created {2018-05-27} but no variable refers to it.
         System.out.println(date);
         System.out.println(date.minusDays(10)); //TEST
     }
}
