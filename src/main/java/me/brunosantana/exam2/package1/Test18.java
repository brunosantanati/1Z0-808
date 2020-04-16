package me.brunosantana.exam2.package1;

import java.time.Period;

public class Test18 {
    public static void main(String [] args) {
        Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
        System.out.println(period);
    }
}
