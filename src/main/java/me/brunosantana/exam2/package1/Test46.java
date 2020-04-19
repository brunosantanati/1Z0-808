package me.brunosantana.exam2.package1;

public class Test46 {
	public static void main(String[] args) {
		System.gc();
		Runtime.getRuntime().gc();
	}
}

/*
 * Both Runtime.getRuntime().gc(); and System.gc(); do the same thing, 
 * these make a request to JVM to run Garbage Collector.

 * JVM makes the best effort to run Garbage Collector but nothing is guaranteed.

 * Setting the reference variable to null will make the object eligible for Garbage Collection, 
 * if there are no other references to this object. But this doesn't force JVM to run 
 * the Garbage Collector. Garbage Collection cannot be forced.
*/
