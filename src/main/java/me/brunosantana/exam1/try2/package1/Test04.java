package me.brunosantana.exam1.try2.package1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test04 {
	public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));
        
        LocalTime time2 = LocalTime.MIDNIGHT;
        System.out.println(date.atTime(time2));
        
        LocalTime time3 = LocalTime.MIN;
        System.out.println(date.atTime(time3));
        
        LocalTime time4 = LocalTime.NOON;
        System.out.println(date.atTime(time4));
    }
}
