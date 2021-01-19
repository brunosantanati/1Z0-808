package me.brunosantana.exam4.package1;

import java.time.LocalDate;

public class Test02 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2068, 4, 15);
        System.out.println(date.getMonth() + ":" + date.getMonthValue());
    }
}
