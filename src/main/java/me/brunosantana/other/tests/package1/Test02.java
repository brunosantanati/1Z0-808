package me.brunosantana.other.tests.package1;

import java.util.Arrays;

public class Test02 {
	
	public static void main(String... args) {
		System.out.println("OK");
		if(args.length > 0)
			System.out.println(Arrays.deepToString(args));
	}

}
