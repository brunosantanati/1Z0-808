package me.brunosantana.exam3.package1;

import java.util.List;

//Which of the following options, if used to replace /*INSERT*/, compiles successfully?
public class Test68 {
	//public static void process(/*INSERT*/ list) {
	public static void process(List<Integer> list) {
	//public static void process(List<int> list) { //Syntax error, insert "Dimensions" to complete ReferenceType
	//public static void process(List<Object> list) { //Type mismatch: cannot convert from Object to int
	//public static void process(List list) { //Type mismatch: cannot convert from Object to int
	     list.add(100); //Line 2
	     int x = list.get(0); //Line 3
	     System.out.println(list.size() + ":" + x);
	}
}
