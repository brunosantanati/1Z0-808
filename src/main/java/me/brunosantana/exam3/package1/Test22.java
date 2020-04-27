package me.brunosantana.exam3.package1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
 
public class Test22 {
     public static void main(String [] args) {
         LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
         Period period = Period.parse("p-30000y"); //Period.parse(CharSequence) method accepts the String parameter in "PnYnMnD" format, over here P,Y,M and D can be in any case. "p-30000y" means Period of -30000 years. 
         System.out.println(date.plus(period));
         
         System.out.println(date.plus(Period.parse("P1Y2M4W4D"))); //TEST
     }
}

/*
https://docs.oracle.com/javase/8/docs/api/java/time/Period.html#parse-java.lang.CharSequence-

The string starts with an optional sign, denoted by the ASCII negative or positive symbol. 
If negative, the whole period is negated. The ASCII letter "P" is next in upper or lower case. 
There are then four sections, each consisting of a number and a suffix. 
At least one of the four sections must be present. 
The sections have suffixes in ASCII of "Y", "M", "W" and "D" for years, months, weeks and days, 
accepted in upper or lower case.
*/
