package me.brunosantana.exam3.package1;

import java.util.function.Predicate;

public class Test07 {
	public static void main(String[] args) {
		Predicate predicate = s -> true; //OK
		//Predicate predicate = s -> {return true;}; //OK
		//Predicate predicate = s -> {return true}; // It misses ;
		//Predicate predicate = s -> {true}; //It misses return and ;
		//Predicate predicate = s -> {true;}; //It misses return
		System.out.println(predicate.test(new Object()));
	}
}
