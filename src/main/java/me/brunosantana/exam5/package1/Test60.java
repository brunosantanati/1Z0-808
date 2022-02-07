package me.brunosantana.exam5.package1;

import java.time.LocalDate;

public class Test60 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1983-06-30");
        System.out.println(date.plusMonths(8));
    }
}
