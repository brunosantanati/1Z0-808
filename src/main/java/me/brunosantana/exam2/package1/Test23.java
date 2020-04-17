package me.brunosantana.exam2.package1;

import java.util.function.Predicate;

public class Test23 {
	public static void main(String[] args) {
		String[] arr = { "A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab" };

		processStringArray(arr, p -> p.length() < 10);
		processStringArray(arr, p -> true);
		processStringArray(arr, p -> p.length() >= 1);
		processStringArray(arr, p -> !false);
	}

	private static void processStringArray(String[] arr, Predicate<String> predicate) {
		System.out.println("------------------");
		for (String str : arr) {
			if (predicate.test(str)) {
				System.out.println(str);
			}
		}
	}
}
