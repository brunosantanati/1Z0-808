package me.brunosantana.exam1.try2.package1;

import java.time.Period;

public class Test15 {
	public static void main(String [] args) {
        Period period = Period.of(0, 0, 0);
        System.out.println(period);
        
        Period period2 = Period.ZERO;
        System.out.println(period2);
        
        Period period3 = Period.of(8, 5, 29);
        System.out.println(period3);
    }
}
