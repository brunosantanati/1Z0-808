package me.brunosantana.exam1.package1;

import java.time.LocalTime;

public class Test11 {
	public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 40);
        //String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM"; //Unresolved compilation problem: Syntax error, insert ": Expression" to complete Expression
        String amPm = time.getHour() >= 12 ? "PM" : "AM";
        System.out.println(amPm);
        amPm = time.getHour() > 12 ? "PM1" : (time.getHour() == 12) ? "PM2" : "AM";
        System.out.println(amPm);
        amPm = time.getHour() == 12 ? "PM1" : time.getHour() > 12 ? "PM2" : "AM";
        System.out.println(amPm);
    }
}
