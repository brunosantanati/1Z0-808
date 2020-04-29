package me.brunosantana.exam3.package1;

import java.time.LocalDate;

public class Test37 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2020, 9, 6);
        System.out.println(date); //prints 2020-09-06
    }
}

/*
In LocalDate.of(int, int, int) method, 1st parameter is year, 2nd is month and 3rd is day of the month. 

toString() method of LocalDate class prints the LocalDate object in ISO-8601 format: "uuuu-MM-dd". 
*/