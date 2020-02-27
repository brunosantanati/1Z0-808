package me.brunosantana.exam1.package1;

import java.time.LocalDateTime;

public class Test23 {
	public static void main(String [] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond()); //it will print any int value between 0 and 59
    }
}
