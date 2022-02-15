package me.brunosantana.other.tests.package1;

import java.util.ArrayList;
import java.util.List;

abstract class ABC{
	//public Integer m1() {
	public Number m1() {
		return 1;
	}
	
	abstract List<ABC> get();
}

class DEF extends ABC{
	
	//If return type of overridden method is of reference type, then overriding method can use same reference type or its sub-type (also known as covariant return type).
	//public Number m1() { //The return type is incompatible with ABC.m1()
	public Integer m1() { //covariant return type
		return 10;
	}
	
//	List<ABC> get(){
//		return null;
//	}
	
	ArrayList<ABC> get(){
		return null;
	}
	
//	List<DEF> get(){ //The return type is incompatible with ABC.get()
//		return null;
//	}
}

public class Test08 {
	
	public static void main(String[] args) {
		ABC a = new DEF();
		System.out.println(a.m1());
	}

}
