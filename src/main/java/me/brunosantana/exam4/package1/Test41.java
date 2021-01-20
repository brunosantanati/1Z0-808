package me.brunosantana.exam4.package1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test41 {
	
	public static void main(String[] args) {
		LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherSummerDay));
	}
	
}
