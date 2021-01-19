package me.brunosantana.exam4.package1;

import java.time.LocalDate;

public class Test04 {
    public static void main(String [] args) {
        LocalDate obj = LocalDate.now();
        //System.out.println(obj.getHour()); //The method getHour() is undefined for the type LocalDate
        System.out.println(obj.getDayOfMonth());
    }
}
